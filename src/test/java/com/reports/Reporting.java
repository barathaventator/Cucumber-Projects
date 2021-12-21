package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJvmReport(String jsonFile) {

		File reportDirectory = new File(
				"C:\\Users\\barat\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Reports");

		Configuration configuration = new Configuration(reportDirectory, "Acactin Hotel Automation");

		configuration.addClassifications("Operating System", "Windows 11");
		configuration.addClassifications("Browser Name", "Google Chrome");
		configuration.addClassifications("Version", "96");
		configuration.addClassifications("Sprint", "34");

		List<String> jsonFiles = new ArrayList<String>();
		
		jsonFiles.add(jsonFile);
		

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

		builder.generateReports();

	}

}
