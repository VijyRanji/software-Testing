package org.pojo;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before(order = 1)
	private void precondition2() {
		launchBrowser();
		System.out.println("launch the browser");

	}

	@Before(order = 2)
	private void precondition1() {

		Windowmaximize();
		System.out.println("Max the window");
	}

	private void Windowmaximize() {

	}

	@Before(order = 4)
	private void precondition3() {
		System.out.println("precondition3");

	}

	@After(order = 10, value = "@Sanity")
	private void postcondition2() {
		System.out.println("Take screenshot of scenarios");

	}

	@After(order = 4)
	private void postcondition1() {
		closeEntireBrowser1();
		System.out.println("close entire Browser");

	}

	private void closeEntireBrowser1() {

	}

}
