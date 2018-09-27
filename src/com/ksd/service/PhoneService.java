package com.ksd.service;

import java.util.Map;

public interface PhoneService {
	void ShowInfo(Map map);
	void callPhone(Map map,String userName);
	void deleteValueForKey(Map map,String number);
}
