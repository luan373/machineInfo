package br.com.machineinfo;

public enum ComponentType 
{
	CPU_TYPE("CPU", 0),
	MEMORY_TYPE("MEMORY",1),
	HARDDISK_TYPE("HARDDISK",2),
	SERVICE_TYPE("SERVICE",3),
	SOFTWARE_TYPE("SOFTWARE",4),
	PROCESS_TYPE("PROCESS",5);

	private String typeName;
	private int typeID;
	
	private ComponentType(String typeName, int typeID) 
	{
		this.typeName = typeName;
		this.typeID = typeID;
	}
	
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
}
