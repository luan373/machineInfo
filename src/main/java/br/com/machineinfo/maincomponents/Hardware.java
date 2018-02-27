package br.com.machineinfo.maincomponents;

import java.io.Serializable;

import br.com.machineinfo.ComponentType;

public class Hardware extends Computer implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String hardwareName;
	private ComponentType hardwareType;
	
	public Hardware(String hardwareName, ComponentType hardwareType) 
	{
		this.hardwareName = hardwareName;
		this.hardwareType = hardwareType;
	}
}
