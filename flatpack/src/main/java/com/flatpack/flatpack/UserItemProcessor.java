package com.talk2amareswaran.projects.springbatchservice;

import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User item) throws Exception {
		User modified_user = new User();
		modified_user.setMobile(item.getMobile().toUpperCase());
		modified_user.setName(item.getName().toUpperCase());
		return modified_user;
	}
}