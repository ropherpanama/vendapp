package com.vendapp.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class AppUtils {
	public static String stackTraceLikeString(Exception exception) {
		Writer writer = new StringWriter();
		PrintWriter printWriter = new PrintWriter(writer);
		exception.printStackTrace(printWriter);
		return writer.toString();
	}
}
