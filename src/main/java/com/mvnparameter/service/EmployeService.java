package com.mvnparameter.service;

import com.wsclientemploye.client.Response;

public interface EmployeService {

	Response saveEmploye(String name, String lastName, String documentType, String birthdate, String companydate,
			String post, Double salary) throws Exception;
}
