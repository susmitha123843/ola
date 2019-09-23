package com.ola.service;

import com.ola.DAO.OlaDAO;
import com.ola.DAO.OlaDAOInterface;
import com.ola.entity.OlaEmployee;

public class OlaService implements OlaServiceInterface {

	public static OlaServiceInterface createServiceObject() {
		
		return new  OlaService();
	}

	@Override
	public int createProfile(OlaEmployee oe) {
		
		@SuppressWarnings("unused")
		OlaDAOInterface od=OlaDAO.createOlaDAOObject();
		return 0;
	}

}
