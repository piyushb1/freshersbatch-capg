package com.vunnam.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vunnam.boot.model.Orders;
import com.vunnam.boot.repo.DaoRepo;

@Service
public class ServiceClass {
	/*
	1. A user can place an order
	2. A user can update an order
	3. A user can view specific order
	4. A user can view all the orders
	5. A user can delete a specific order.*/
	@Autowired
	DaoRepo mDao;
	
	public void placeOrder(Orders orders) {
		mDao.save(orders);
	}
	public void updateOrder(String id,Orders order) {
		mDao.save(order);
	}
	public Optional<Orders> viewOrder(String id) {
		return mDao.findById(id);
	}
	
	public List<Orders> viewOrders() {
		return mDao.findAll();
	}
	public void deleteOrder(String id) {
		mDao.deleteById(id);
	}
}
