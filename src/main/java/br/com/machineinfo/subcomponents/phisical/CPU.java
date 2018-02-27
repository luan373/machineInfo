package br.com.machineinfo.subcomponents.phisical;

import java.io.Serializable;

import br.com.machineinfo.ComponentType;
import br.com.machineinfo.maincomponents.Hardware;

public class CPU extends Hardware implements Serializable
{
	public CPU() 
	{
		super("", ComponentType.CPU_TYPE);
	}

	private static final long serialVersionUID = 1L;
}
