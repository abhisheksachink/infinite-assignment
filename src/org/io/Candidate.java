package org.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class Candidate {
    public static void main(String args[]) throws IOException, ParseException {
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader("src/Candidate.csv"));
        while((line = reader.readLine())!=null){

            String[] student = line.split(",");
            Date currentDate = new Date();
            System.out.println("Current Date: "+currentDate);
            SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
            String dateToStr = DateFormat.getInstance().format(currentDate);
            System.out.println("Date Format using getInstance(): "+dateToStr);

//            df.f



//            String dateOfJoin= String.valueOf(new Date());
//            Date Curr=new Date();
//            String nowDate= df.format(Curr);
////            df.parse(new Date());
//            //Date datet=df.parse(dateOfJoin);
//            Instant instant = Curr.toInstant();
//            DateTimeFormatter formatter =
//                    DateTimeFormatter.ofPattern(
//                            "dd-MM-yyyy").withZone(ZoneId.systemDefault());
//            String formattedInstance = df.format(instant);
//            //System.out.println(datet);
//            System.out.println(formatter);
//            System.out.println(formattedInstance);
//            //Date dateofj=df.parse(new Date());
            CandidateData cd=new CandidateData((student[0]),student[1],student[2],new Date());
            System.out.println(cd.toString());

//            System.out.println("Student[candidateId = "+cd.getCandId()+",name= "
//                    +cd.getName()+ ",courseEnrolledIn="+cd.getCourse());


        }
    }

}
