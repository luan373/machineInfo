#REM Função que retorna as informações da máquina passada por parametro
	$str = "";
	$br = "`n";
	$computerName = $env:computername;
	$driverNames = Get-WmiObject win32_logicaldisk -ComputerName $computerName | Where-Object {($_.drivetype -ge 2 -and $_.drivetype -lt 5)}
	$computerSystem = get-wmiobject Win32_ComputerSystem -Computer $computerName
    $computerBIOS = get-wmiobject Win32_BIOS -Computer $computerName
    $computerOS = get-wmiobject Win32_OperatingSystem -Computer $computerName
    $computerCPUInfo = get-wmiobject Win32_Processor -Computer $computerName
#	$computerCPU = (Get-WmiObject Win32_PerfFormattedData_PerfOS_Processor -filter "Name='_Total'")
    
#	$str = $str + "Domain: " + [System.DirectoryServices.ActiveDirectory.Domain]::GetType();
#	$str = $str + "Domain: " + (Get-ADDomain -Current $computerName)
    $str = "-------------------------------------------------------------------------" +$br
    $str = $str + "System Information" +$br
    $str = $str + "-------------------------------------------------------------------------" +$br
    
    $str = $str + "DNS Server Name  = " + [System.Net.Dns]::gethostentry($computername).hostname + $br
	$str = $str + "Computer Name    = " + $computername + $br
    $str = $str + "Manufacturer     = " + $computerSystem.Manufacturer + $br 
    $str = $str + "Model            = " + $computerSystem.Model + $br
    $str = $str + "Serial Number    = " + $computerBIOS.SerialNumber + $br
    $str = $str + "Operating System = " + $computerOS.caption + ", Service Pack: " + $computerOS.ServicePackMajorVersion + $br
    $str = $str + "Arquitecture     = " + $computerOS.OSArchitecture + $br
    $str = $str + "Laguage          = " + $computerOS.MUILanguages + $br
    $str = $str + "Last Reboot      = " + $computerOS.ConvertToDateTime($computerOS.LastBootUpTime) + $br
	$str = $str + "Local DateTime   = " + $computerOS.ConvertToDateTime($computerOS.localdatetime) + $br
    $str = $str + "WindowsDirectory = " + $computerOS.WindowsDirectory + $br
    $str = $str + "System Directory = " + $computerOS.SystemDirectory + $br
    $str = $str + "System Driver '' = " + $computerOS.SystemDrive + $br
    $str = $str + "System Device    = " + $computerOS.SystemDevice + $br
    

    $str = $str + "-------------------------------------------------------------------------" +$br
    $str = $str + "System Hardware Information" +$br
    $str = $str + "-------------------------------------------------------------------------" +$br
    
    $count = 1;
	foreach ($item in $driverNames)
	{
        $totSpace 		= [math]::Round(($item.Size/1073741824),2)
        $frSpace 		= [Math]::Round(($item.FreeSpace/1073741824),2) 
        $usedSpace 		= $totSpace - $frspace 
        $usedSpace 		= [Math]::Round($usedSpace,2)
        $freePercent 	= ($frspace/$totSpace)*100 
        $freePercent 	= [Math]::Round($freePercent,0)
        $str = $str + "Disk Info ["+$count+"]    = HD("+ $item.DeviceID +") | Type("+$item.DriveType+") | Filesystem("+$item.FileSystem+") | Label(" + $item.VolumeName + ") | Size("+ $totSpace + ") | Free("+ $frSpace +") | Used("+ $usedSpace +") | %Free("+ $freePercent +") | Size Bytes("+$item.Size+") | Free Bytes("+ $item.FreeSpace +")" + $br
        $count++; 
	}
    $str = $str + "TOTAL RAM        = " + "{0:N2}" -f ($computerSystem.TotalPhysicalMemory/1GB) + "GB" + $br
	$str = $str + "USED RAM         = " + (([math]::round(($computerSystem.TotalPhysicalMemory/1GB), 2)) - ([math]::round(($computerOS.FreePhysicalMemory / 1024 / 1024), 2)))  + "GB" + $br
    $str = $str + "FREE RAM         = " + "{0:N2}" -f ([math]::round(($computerOS.FreePhysicalMemory / 1024 / 1024), 2)) + "GB" + $br
	$str = $str + "CPU              = " + $computerCPUInfo.Name + $br
	#$str = $str + "CPU USAGE        = " + $computerCPU.PercentProcessorTime + "%" + $br
	Write-Host $str
