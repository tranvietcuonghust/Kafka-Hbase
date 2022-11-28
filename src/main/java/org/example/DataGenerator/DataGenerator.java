package org.example.DataGenerator;


import org.apache.hadoop.classification.InterfaceAudience;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;

public class DataGenerator {
    NameGenerator nameGenerator= new NameGenerator();
    PhoneGenerator phoneGenerator =new PhoneGenerator();
    public PhoneData DataGen(Long callId){
        Random random= new Random();

        String callerName=nameGenerator.NameGen();
        String calleeName=nameGenerator.NameGen();
        String callerPhone=phoneGenerator.PhoneGen();
        String calleePhone=phoneGenerator.PhoneGen();
        int duration= random.nextInt(3600);

       // Timestamp original = new Timestamp();
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(System.currentTimeMillis());
        cal.add(Calendar.SECOND, duration);
        Timestamp timestamp = new Timestamp(cal.getTime().getTime());


        PhoneData phoneData= new PhoneData();
        phoneData.setCallId(callId);
        phoneData.setCallerPhone(callerPhone);
        phoneData.setCallerName(callerName);
        phoneData.setCalleePhone(calleePhone);
        phoneData.setCalleeName(calleeName);
        phoneData.setDuration(duration);
        phoneData.setTimeStamp(timestamp);
        return  phoneData;
    }
    public static void main(String args[]){
        DataGenerator dataGenerator = new DataGenerator();
        PhoneData phoneData = dataGenerator.DataGen(1L);
        System.out.println("Timestamp: "+phoneData.getTimeStamp());
        System.out.println("Caller Name:"+phoneData.getCallerName());
        System.out.println("Caller Phone:"+phoneData.getCallerPhone());
        System.out.println("Callee Name:"+phoneData.getCalleeName());
        System.out.println("Callee Phone:"+phoneData.getCalleePhone());
        System.out.println("Duration:"+phoneData.getDuration());
    }
}
