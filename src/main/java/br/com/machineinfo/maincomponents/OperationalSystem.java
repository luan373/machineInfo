package br.com.machineinfo.maincomponents;

import java.io.Serializable;
import java.util.LinkedList;

public class OperationalSystem extends Computer implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private LinkedList<VirtualComponent> components = new LinkedList<VirtualComponent>();

	public LinkedList<VirtualComponent> getComponents() {
		return components;
	}

	public void setComponents(LinkedList<VirtualComponent> components) {
		this.components = components;
	}
	
	
}
