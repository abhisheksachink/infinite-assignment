package org.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Candidate {
    public static void main(String args[]) throws IOException {
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader("src/Candidate.csv"));
        while((line = reader.readLine())!=null){

            String[] student = line.split(",");
            CandidateData cd=new CandidateData((student[0]),student[1],student[2]);
            System.out.println(cd.toString());

//            System.out.println("Student[candidateId = "+cd.getCandId()+",name= "
//                    +cd.getName()+ ",courseEnrolledIn="+cd.getCourse());

        }
    }

}
