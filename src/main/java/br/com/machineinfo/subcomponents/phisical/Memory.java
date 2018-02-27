package br.com.machineinfo.subcomponents.phisical;

import java.io.Serializable;

import br.com.machineinfo.ComponentType;
import br.com.machineinfo.maincomponents.Hardware;

public class Memory extends Hardware implements Serializable
{
	public Memory() 
	{
		super("", ComponentType.MEMORY_TYPE);
	}

	private static final long serialVersionUID = 1L;
}
