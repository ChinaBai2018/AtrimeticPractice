package com.ksd.service.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.ksd.entity.Phone;
import com.ksd.entity.User;
import com.ksd.service.PhoneService;

public class phoneServiceImpl implements PhoneService {

	public void ShowInfo(Map map){
		Set<User> set = map.keySet();
		Iterator<User> it = set.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			Phone phone = (Phone) map.get(user);
			String info = phone.toString();
			System.out.println(info);
		}
	}
	public void callPhone(Map map,String number){
		Set<User> set = map.keySet();
		Iterator<User> it = set.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			Phone phone = (Phone) map.get(user);
			System.out.println(user.getUserName()+"正在用"+phone.getPhoneModel()+"给"+number+"打电话");
		}
	}
	public void deleteValueForKey(Map map,String userName){
		boolean isHas = true;
		Set<User> set = map.keySet();
		Iterator<User> it = set.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			Phone phone = (Phone) map.get(user);
			if(user.getUserName().equals(userName)){
				it.remove();
				isHas = false;
				System.out.println("删除完成");
			}
		}
		if(isHas){
			System.out.println("不存在该值");
		}
	}

}
