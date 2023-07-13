package dockertests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_DockerGrid {

	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start start_dockgrid.bat");
		Thread.sleep(20000);
		
	}
	
	
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start stop_dockgrid.bat");
		Thread.sleep(20000);
		
		Runtime.getRuntime().exec("taskkill /f im cmd.exe"); // To close all the command prompts..
	}
	
	
}
