package com.vendapp.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Se crea clase de utilidades para la aplicacion. Esta clase debe contener
 * metodos que son usados comunmente y de manera reiterada en la app, los
 * metodos deben ser estaticos
 */
public class AppUtils {
	/**
	 * Este metodo toma un objeto de tipo Exception y transforma la traza en
	 * String, ideal para llevar registro de las excepciones en un archivo de
	 * logs
	 * 
	 * @param exception
	 * @return traza del Exception en formato String
	 */
	public static String stackTraceLikeString(Exception exception) {
		Writer writer = new StringWriter();
		PrintWriter printWriter = new PrintWriter(writer);
		exception.printStackTrace(printWriter);
		return writer.toString();
	}
}
