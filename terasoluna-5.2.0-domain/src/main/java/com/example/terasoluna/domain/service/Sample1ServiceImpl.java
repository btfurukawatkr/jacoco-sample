package com.example.terasoluna.domain.service;

import org.springframework.stereotype.Service;

@Service
public class Sample1ServiceImpl implements Sample1Service {

	@Override
	public boolean exec(boolean flag1, boolean flag2) {

		if (flag1) {
			return true;
		}
		if (flag2) {
			return true;
		}
		return false;
	}

}
