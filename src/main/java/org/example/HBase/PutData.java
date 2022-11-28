package org.example.HBase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;

import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class PutData {
    // Instantiating Configuration class
    public static void main(String[] args) throws IOException {
    Configuration conf = HBaseConfiguration.create();


    Connection connection = ConnectionFactory.createConnection(conf);

    // Instantiating HTable class
    Table table = connection.getTable(TableName.valueOf("phone-call1"));
    Admin admin = connection.getAdmin();


    // Instantiating Put class
    // accepts a row name.
    Put p = new Put(Bytes.toBytes("row1"));


        p.addColumn(Bytes.toBytes("phonedata"),
                Bytes.toBytes("name"),Bytes.toBytes("raju"));
        table.put(p);
        System.out.println("data inserted");

        // closing HTable
        table.close();




    //public PutData() throws IOException {

//              Bytes.toBytes("name"),Bytes.toBytes("raju"))
  //  }

    // adding values using add() method
    // accepts column family name, qualifier/row name ,value

//      p.add(Bytes.toBytes("personal"),
//              Bytes.toBytes("name"),Bytes.toBytes("raju"));
//
//      p.add(Bytes.toBytes("personal"),
//              Bytes.toBytes("city"),Bytes.toBytes("hyderabad"));
//
//      p.add(Bytes.toBytes("professional"),Bytes.toBytes("designation"),
//              Bytes.toBytes("manager"));
//
//      p.add(Bytes.toBytes("professional"),Bytes.toBytes("salary"),
//              Bytes.toBytes("50000"));

    // Saving the put Instance to the HTable.

}}

