package com.ksd.test;

import java.util.HashMap;
import java.util.Map;

import com.ksd.entity.Phone;
import com.ksd.entity.User;
import com.ksd.service.impl.phoneServiceImpl;

public class Test {
	public static void main(String[] args) {
		
		Map<User,Phone> map = new HashMap<User,Phone>();
		phoneServiceImpl service = new phoneServiceImpl();
		
		User user1 = new User("小明",123,18);
		User user2 = new User("小刚",124,18);
		
		Phone phone1 = new Phone("苹果","iphoneX","8999.0");
		Phone phone2 = new Phone("小米","小米8","2999.0");
		
		map.put(user1,phone1);
		map.put(user2,phone2);
		
		System.out.println("=====调用信息展示方法=====");
		service.ShowInfo(map);
		System.out.println("=====调用打电话方法=====");
		service.callPhone(map,"1234868874");
		System.out.println("=====调用删除方法=====");
		service.deleteValueForKey(map,"小方");
	}
}
