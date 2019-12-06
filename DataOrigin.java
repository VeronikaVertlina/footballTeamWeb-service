package com.hit.data;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


public class DataOrigin {
	
	/*
	 * • to use an object that is allocated only once in the memory 
	 * – Because it takes large amount of memory 
	 * – Because it manages some queue 
	 * and to use Singleton pattern
	 */
	
	private static DataOrigin instance;
    private static List<Match> matches;
    
    public List<Match> getMatches() {
        return new ArrayList<Match>(matches);
    }

    private DataOrigin() throws IOException{
        matches = new ArrayList<Match>();
        try {
			getUpcomning();
		} catch (ParseException e) {
			e.printStackTrace();
		}
        try {
			getFinished();
		} catch (ParseException e) {
			e.printStackTrace();
		}              
    }


    public static DataOrigin getInstance() {
        if (instance == null) {
            try {
				instance = new DataOrigin();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        return instance;
    }
	
		/*
		 * Read CSV file line by line: 
		 */
    private void getUpcomning() throws IOException, ParseException {
		String csvFileName = "resources/result_upcoming.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFileName));
		String[] row = null;
		try {
			while((row = csvReader.readNext()) != null) {
				System.out.println(row[0] 	//firstTeam
						+ " , " + row [1]	//secondTeam
						+ " , " + row [2]	//startDate
						+ " , " + row [3]	//startTime
						+ " , " + row [4]);	//tournament
			}
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		csvReader.close();
    }
	
    private void getFinished() throws IOException, ParseException {
	String csvFileName1 = "resources/resultplayed.csv";
	CSVReader csvReader1 = new CSVReader(new FileReader(csvFileName1));
	String[] row = null;
	try {
		while((row = csvReader1.readNext()) != null) {
			System.out.println(row[0] 	//firstTeam
					+ " , " + row [1]	//secondTeam
					+ " , " + row [2]	//startDate
					+ " , " + row [3]	//score
					+ " , " + row [4]);	//tournament
		}
	} catch (CsvValidationException e) {
		e.printStackTrace();
	}
	csvReader1.close();
	}

	@Override
	public String toString() {
		return "DataOrigin [getMatches()=" + getMatches() + "]";
	}
    
}

	


