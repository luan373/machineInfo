package br.com.machineinfo.maincomponents;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Computer implements Serializable 
{
	private static final long serialVersionUID = 1L;

	private String computerName;
	private String computerIp;
	
	private Map<String, Object> properties = new LinkedHashMap<String, Object>();
}
