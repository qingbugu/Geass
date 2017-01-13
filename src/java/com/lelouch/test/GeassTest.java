/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lelouch.model.fruit.Fruit;
import com.lelouch.service.lucene.IndexRepositoryServiceImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.amfproject.other.core.utils.OTHERObjectMapperUtils;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Administrator
 */
public class GeassTest {
    public static void main(String[] args) throws IOException{
//        List<String>  list = new ArrayList<>();
//        String a = OTHERObjectMapperUtils.objectToJSON(list);
        
//        Map m = new HashMap();
//        m.put("5","44");
//        m.put(1,55);
//        
//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println(OTHERObjectMapperUtils.objectToJSON(m));
//        System.out.println(mapper.writeValueAsString(m));
//        System.out.println(mapper.writeValueAsBytes(m));
        
//        System.out.println(new JSONArray(a));
//          String a = " MMM86132.66GHHHd335  ";
//          a = a.trim().toLowerCase()+"\t"+"1";
//          System.out.println(a);
//          String[] split = a.split("\t");
//          System.out.println(split.length);

/********  *******/
//            char data[] = {'a', 'b', 'c'};
//            String str = new String(data);
//            byte[] bytes = str.getBytes( "unicode" );
//            for(byte b:bytes){
//                System.out.println(b);
//            }
//            System.out.println(str);
//            IndexRepositoryServiceImpl i = new IndexRepositoryServiceImpl();
//            i.printFile();
            
            System.out.println("结果："+StringUtils.isBlank("  "));
    }
}
