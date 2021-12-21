package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src\\test\\resources" }, glue = {
				"com.stepdefinition" }, monochrome = true, plugin = { "pretty",
						"json:src\\test\\resources\\Reports\\output.json" }, dryRun = true, tags= {"@Reg"}, strict=true)
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {

		Reporting.generateJvmReport(
				"C:\\Users\\barat\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Reports\\output.json");

	}

}
