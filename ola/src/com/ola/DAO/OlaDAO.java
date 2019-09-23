package com.ola.DAO;

import com.ola.entity.OlaEmployee;

public class OlaDAO implements OlaDAOInterface {
	private OlaDAO(){
	}

	public static OlaDAOInterface createOlaDAOObject() {
		// TODO Auto-generated method stub
		return new OlaDAO();
	}

	@Override
	public int createObject(OlaEmployee oe) {
		// TODO Auto-generated method stub
		return 0;
	}

}
