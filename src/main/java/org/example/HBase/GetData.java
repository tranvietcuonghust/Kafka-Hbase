package org.example.HBase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

public class GetData {
    public static void main(String[] args) throws IOException {
        Configuration conf = HBaseConfiguration.create();


        Connection connection = ConnectionFactory.createConnection(conf);

        // Instantiating HTable class
        Table table = connection.getTable(TableName.valueOf("tranvietcuong"));
        Admin admin = connection.getAdmin();



        Put p = new Put(Bytes.toBytes("row1"));
        Get g= new Get(Bytes.toBytes("row1"));

        Result result = table.get(g);
        byte [] value = result.getValue(Bytes.toBytes("info"),Bytes.toBytes("name"));



        // Printing the values
        String name = Bytes.toString(value);


        System.out.println("name: " + name );


        System.out.println("data inserted");

        // closing HTable
        table.close();
    }
}
