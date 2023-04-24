package com.mvnparameter.Impl;

import java.net.MalformedURLException;
import java.net.URL;

import com.mvnparameter.service.EmployeService;
import com.mvnparameter.util.Utilities;
import com.wsclienteemploye.servicio.impl.EmployeServiceImplService;
import com.wsclientemploye.client.Employe;
import com.wsclientemploye.client.Operaciones;
import com.wsclientemploye.client.Response;

import org.springframework.stereotype.Service;

@Service
public class EmployeImpl implements EmployeService {
	private static final String ENDPOINT = "http://localhost:2021/ws/service?wsdl";
	private static final String STRAT_PROCESS = "SAVE PROCESS STARTS";
	private static final String BEFORE_SAVE = "BEFORE CUNSIMOR SERVICE";
	private static final String AFTER_SAVE = "AFTER CUNSIMOR SERVICE";

	private Utilities utilities;

	public EmployeImpl() {
		utilities = new Utilities();
	}

	public Response saveEmploye(String name, String lastName, String documentType, String birthdate, String companydate,
			String post, Double salary) throws Exception {
		Response response = new Response();
		// TODO Auto-generated method stub
		utilities.logger(STRAT_PROCESS);

		utilities.validateDates(birthdate, companydate);
		utilities.validateAge(birthdate);

		utilities.logger(BEFORE_SAVE);
		response = saveEndpoint(name, lastName, documentType, birthdate, companydate, post, salary);
		utilities.logger(AFTER_SAVE);

		return response;
	}

	public Response saveEndpoint(String name, String lastName, String documentType, String birthdate,
			String companydate, String post, Double salary) {

		URL url;
		Response employeSave = new Response();
		try {
			url = new URL(ENDPOINT);
			final EmployeServiceImplService employeServiceImplService = new EmployeServiceImplService(url);
			final Operaciones port = employeServiceImplService.getPort(Operaciones.class);

			Employe employee = new Employe();

			employee.setBirthdate(birthdate);
			employee.setCompanydate(companydate);
			employee.setDocumenttype(documentType);
			employee.setLastname(lastName);
			employee.setName(name);
			employee.setPost(post);
			employee.setSalary(salary);

			employeSave = port.save(employee);

			System.out.print(employeSave);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return employeSave;

	}

}
