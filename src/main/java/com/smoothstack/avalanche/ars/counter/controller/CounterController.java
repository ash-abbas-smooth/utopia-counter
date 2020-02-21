package com.smoothstack.avalanche.ars.counter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.avalanche.ars.counter.service.CounterService;

@RestController
public class CounterController {

	@Autowired
	CounterService counterService;
}
