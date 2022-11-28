package org.example.HBase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;

public class DisableTable{

    public static void main(String args[]) throws MasterNotRunningException, IOException{

        // Instantiating configuration class
        Configuration conf = HBaseConfiguration.create();


        Connection connection = ConnectionFactory.createConnection(conf);


        Table table = connection.getTable(TableName.valueOf("emp"));
        Admin admin = connection.getAdmin();

        System.out.println(admin.isTableDisabled(TableName.valueOf("emp")));
        admin.disableTable(TableName.valueOf("emp"));
        System.out.println(admin.isTableDisabled(TableName.valueOf("emp")));

    }
}
