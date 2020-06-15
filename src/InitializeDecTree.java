
	import java.util.*;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	import dataview.models.InputPort;
	import dataview.models.OutputPort;
	import dataview.models.Port;
	import dataview.models.Task;


	public class InitializeDecTree extends Task{

		public static void main(String[] args) {
			try {
				Scanner scanner = new Scanner(new File("datasetDT.txt"));
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public void run()
		{
				
		}
	}
