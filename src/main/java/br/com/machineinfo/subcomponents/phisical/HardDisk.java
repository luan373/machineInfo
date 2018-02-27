package br.com.machineinfo.subcomponents.phisical;

import java.io.Serializable;

import br.com.machineinfo.ComponentType;
import br.com.machineinfo.maincomponents.Hardware;

public class HardDisk extends Hardware implements Serializable
{
	public HardDisk() 
	{
		super("",ComponentType.HARDDISK_TYPE);
	}

	private static final long serialVersionUID = 1L;
}
