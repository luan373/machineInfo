package br.com.machineinfo.subcomponents.logical;

import java.io.Serializable;
import java.util.LinkedList;

import br.com.machineinfo.ComponentType;
import br.com.machineinfo.maincomponents.VirtualComponent;
import br.com.machineinfo.subcomponents.logical.model.Service;

public class Services extends VirtualComponent implements Serializable
{
	private static final long serialVersionUID = 1L;
	private LinkedList<Service> services = new LinkedList<Service>(); 
	
	public Services() 
	{
		super("", ComponentType.SERVICE_TYPE);
	}

	public LinkedList<Service> getServices() {
		return services;
	}

	public void setServices(LinkedList<Service> services) {
		this.services = services;
	}
}
