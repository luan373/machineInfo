package br.com.machineinfo;

import br.com.machineinfo.maincomponents.OperationalSystem;
import br.com.machineinfo.subcomponents.logical.Services;

public class Principal {

	public static void main(String[] args) 
	{
		try 
		{
			OperationalSystem os = new OperationalSystem();
			
			Services s = new Services();
//			s.getServices().put("servico1", new Object[]{"Valor 01"});
			
			os.getComponents().add(s);
			
			System.out.println(os.getComponents().getFirst().toString());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
