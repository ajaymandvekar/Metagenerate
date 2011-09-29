package com.meta;

import java.rmi.RemoteException;
import com.meta.CreatemetaStub.Createcustomobj;
import com.meta.CreatemetaStub.CreatecustomobjResponse;

public class TestCreateCustomObj {
	public static void main(String[] args) throws RemoteException {
		CreatemetaStub stub = new CreatemetaStub();
		Createcustomobj reg = new Createcustomobj();
		reg.setOrgid(2);
		reg.setObjname("Tax");
		
		CreatecustomobjResponse resp = stub.createcustomobj(reg);
		System.out.println(resp.get_return());
	}
}
