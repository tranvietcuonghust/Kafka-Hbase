package org.example.HBase;

import java.io.IOException;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.TableName;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.util.Bytes;

public class CreateTable {

    public static void main(String[] args) throws IOException {

        // Instantiating configuration clas


        //HBaseAdmin admin = new HBaseAdmin(con);

        // Instantiating table descriptor class
        Configuration conf = HBaseConfiguration.create();
        TableDescriptorBuilder tBuilder = TableDescriptorBuilder.newBuilder(TableName.valueOf("phone-calls1"));
        ColumnFamilyDescriptor CFD = ColumnFamilyDescriptorBuilder.newBuilder(Bytes.toBytes("phonedata")).build();
        TableDescriptor tDesc = tBuilder.setColumnFamily(CFD).build();


        Connection connection = ConnectionFactory.createConnection(conf);
        Admin admin = connection.getAdmin();
        admin.createTable(tDesc);

        // Execute the table through admin
      //  admin.createTable(tableDescriptor);
        System.out.println(" Table created ");
    }
}