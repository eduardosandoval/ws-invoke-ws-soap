package com.mvnparameter.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.logging.Logger;

public class Utilities {
	
	private static final String DATE_REGEX = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
	private static final Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX);
	private static final String START_VALID ="VALIDATIONS BEGIN";
	private static final String BIRTHDATE_VALID ="BIRTHDATE INVALID:";
	private static final String COMPANYDATE_VALID ="COMPANYDATE INVALID:";
	private static final String FORMATTE_DATE ="yyyy-MM-dd";
	private static final String EMPLOYE_MINOR ="EMPLOYE MINOR";


    private static Logger logger = Logger.getLogger(Utilities.class.getName());

	public void validateDates(String birthDate, String companyDate) throws Exception {
	    logger(START_VALID);
		if (!dateValidator(birthDate)) {
			throw new Exception(BIRTHDATE_VALID + birthDate);
		}
		if (!dateValidator(companyDate)) {
			throw new Exception(COMPANYDATE_VALID + companyDate);
		}
	}

	public int validateAge(String birthDate) throws Exception {

		Date fechaNac = new SimpleDateFormat(FORMATTE_DATE).parse(birthDate);
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.setTime(fechaNac);

		Calendar fechaActual = Calendar.getInstance();
		int ano = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		int mes = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
		int dia = fechaActual.get(Calendar.DATE) - fechaNacimiento.get(Calendar.DATE);
		if (mes < 0 || (mes == 0 && dia < 0)) {
			ano--;
		}
		if (ano < 18) {
			throw new Exception(EMPLOYE_MINOR);
		}
		return ano;
	}

	public static boolean dateValidator(String date) {
		Matcher matcher = DATE_PATTERN.matcher(date);
		return matcher.matches();
	}
	
	public void  logger(String message) {
		logger.info(message);
	}
}
