package br.com.machineinfo.maincomponents;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import br.com.machineinfo.ComponentType;

public class VirtualComponent extends Computer implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String componentName;
	private ComponentType componentType;
	private Map<String, Object> rawProperties = new LinkedHashMap<String, Object>();
	
	public VirtualComponent(String componentName, ComponentType componentType) 
	{
		this.componentName = componentName;
		this.componentType = componentType;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public ComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(ComponentType componentType) {
		this.componentType = componentType;
	}
	
	
}
