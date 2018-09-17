import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Ex1 {
	
	

	public static void main(String[] args) {	
		ArrayList<String> teams = new ArrayList<String>();
		
		ArrayList<String> fixtures = new ArrayList<String>();
		
		try {
			FileReader reader = new FileReader("TeamsIn.txt");
			Scanner scanner = new Scanner(reader);
			
			while (scanner.hasNextLine()) {
				String teamName = scanner.nextLine();
				teams.add(teamName);
				System.out.println(teamName);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error - file name entered does not correspond to an existing file. Please check to ensure the file name is well referenced.");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			
			if (!teams.isEmpty()) {
				int original_team_size = teams.size();
				for (int i = 0; i < original_team_size; i++) {
					int d = original_team_size - i;
					if (d == 1)
						break;
					
					String fixture = teams.get(0) + " ";
					
				}
			} 
			
			
		}

	}

}
