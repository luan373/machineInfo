package br.com.machineinfo.subcomponents.logical;

import java.io.Serializable;

import br.com.machineinfo.ComponentType;
import br.com.machineinfo.maincomponents.VirtualComponent;

public class Software extends VirtualComponent implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public Software() 
	{
		super("", ComponentType.SOFTWARE_TYPE);
	}

}
