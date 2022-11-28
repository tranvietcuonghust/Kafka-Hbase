package org.example.HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class ListTable {

    public static void main(String args[])throws MasterNotRunningException, IOException{


        Configuration conf = HBaseConfiguration.create();


        Connection connection = ConnectionFactory.createConnection(conf);
        // Getting all the list of tables using HBaseAdmin object
        HTableDescriptor[] tableDescriptor = connection.getAdmin().listTables();

        // printing all the table names.
        for (int i=0; i<tableDescriptor.length;i++ ){
            System.out.println(tableDescriptor[i].getNameAsString());
        }

    }
}