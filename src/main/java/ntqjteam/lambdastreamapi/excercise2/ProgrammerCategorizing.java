package ntqjteam.lambdastreamapi.excercise2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ntqjteam.lambdastreamapi.excercise2.Programmer.Gender;

/**
 * Created by toan on 3/1/17.
 */
public class ProgrammerCategorizing {

	public static void main(String[] args) {
		Programmer programmer1 = new Programmer("id1", "name1", "division1", "team1", Gender.FEMALE);
		Programmer programmer2 = new Programmer("id2", "name2", "division1", "team1", Gender.MALE);
		Programmer programmer3 = new Programmer("id3", "name3", "division1", "team2", Gender.FEMALE);
		Programmer programmer4 = new Programmer("id4", "name4", "division1", "team2", Gender.FEMALE);
		Programmer programmer5 = new Programmer("id5", "name5", "division2", "team1", Gender.MALE);
		Programmer programmer6 = new Programmer("id6", "name6", "division2", "team1", Gender.FEMALE);
		Programmer programmer7 = new Programmer("id7", "name7", "division2", "team2", Gender.MALE);
		Programmer programmer8 = new Programmer("id8", "name8", "division2", "team2", Gender.MALE);
		Programmer programmer9 = new Programmer("id9", "name9", "division3", "team1", Gender.FEMALE);
		Programmer programmer10 = new Programmer("id10", "name10", "division3", "team2", Gender.FEMALE);
		Programmer programmer11 = new Programmer("id11", "name11", "division3", "team2", Gender.MALE);

		List<Programmer> programmers = Arrays.asList(programmer1, programmer2, programmer3, programmer4, programmer5,
				programmer6, programmer7, programmer8, programmer9, programmer10, programmer11); // init

		// Categorize programmers into divisions
		Map<String, List<Programmer>> listProgrammerGroupbyDivisions= programmers.stream().collect(Collectors.groupingBy(Programmer::getDivision));
		System.out.println(listProgrammerGroupbyDivisions);
		// Categorize programmers into divisions, then teams, then genders
		Map<String, Map<String, Map<Programmer.Gender, List<Programmer>>>> listProgrammerGruopbyDivisionTeamGender=programmers.stream().collect(Collectors.groupingBy(Programmer::getDivision,Collectors.groupingBy(Programmer::getTeam,Collectors.groupingBy(Programmer::getGender))));
		System.out.println(listProgrammerGruopbyDivisionTeamGender);

	}

}
