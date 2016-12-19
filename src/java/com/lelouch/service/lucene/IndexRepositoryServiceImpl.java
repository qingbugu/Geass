/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lelouch.service.lucene;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.amfproject.other.core.data.search.lucene.LuceneRepository;
import org.amfproject.other.core.system.OTHERWebSystemExitEvent;
import org.springframework.context.ApplicationListener;

/**
 *
 * @author Administrator
 */
public class IndexRepositoryServiceImpl implements IndexRepositoryService, ApplicationListener<OTHERWebSystemExitEvent> {

    private final Map<String, LuceneRepository> repositoryPool = new HashMap<String, LuceneRepository>();

//    static {
//        Properties pro = new Properties();
////        InputStream is = IndexRepositoryServiceImpl.class.getResourceAsStream("/WEB-INF/property_zh_CN.properties");
//        InputStream is = IndexRepositoryServiceImpl.class.getResourceAsStream("/property_zh_CN.properties"); //表示默认和此类的路径是一致的
//        try {
//            pro.load(is);
//            System.out.println(pro.getProperty("name").trim());
//            System.out.println(pro.getProperty("value").trim());
////        InputStreamReader isr = new InputStreamReader(is);
////        BufferedReader br = new BufferedReader(isr);
////        String tmp = null;
////        try {
////            while ((tmp = br.readLine()) != null) {
////                tmp = tmp.trim().toLowerCase();
////                System.out.println("tmp:" + tmp);
////            }
////            isr.close();
////            br.close();
////        } catch (IOException ex) {
////            Logger.getLogger(IndexRepositoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
////        }
//        } catch (IOException ex) {
//            Logger.getLogger(IndexRepositoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    
    public void printFile(){
        Properties pro = new Properties();
//        InputStream is = Object.class.getResourceAsStream("/property_zh_CN.properties"); //表示默认和此类的路径是一致的
        
//        File fileB = new File(this.getClass().getResource("").getPath());   获取当前类所在的包

//        System. out .println("user.dir path: " + System.getProperty("user.dir"));  获取当前类所在的工程名

        try {
//            pro.load(is);
            //            File f = new File(this.getClass().getResource("").getPath()+"/property_zh_CN.properties");
//            File f = new File(this.getClass().getResource("/property_zh_CN.properties").getPath());
//            FileInputStream fis = new FileInputStream(f); //构造方法1：传入一个文件对象

            FileInputStream fis = new FileInputStream(this.getClass().getResource("").getPath()+"/property_zh_CN.properties"); //构造方法2：传入一个文件名对象
            
//                    FileInputStream fis = new FileInputStream(this.getClass().getResource("/property_zh_CN.properties").getPath())
            //            pro.load(is);
//            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);
//            InputStreamReader isr = new InputStreamReader(bufferedInputStream);
//            BufferedReader br = new BufferedReader(isr);
            
//                pro.load(fis);  //将属性文件的键值对列表放到Properties对象里。
//                System.out.println(pro.getProperty("name").trim());
//                System.out.println(pro.getProperty("value").trim());
                
  /********* 读取文件内容  **********/              
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String tmp = null;
            while ((tmp = br.readLine()) != null) {
//                tmp = tmp.trim().toLowerCase();
                System.out.println(tmp);
            }
            isr.close();
            br.close();




//            is.close();
              fis.close();
            
        } catch (IOException ex) {
            Logger.getLogger(IndexRepositoryServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void onApplicationEvent(OTHERWebSystemExitEvent e) {
        Set<Map.Entry<String, LuceneRepository>> entrySet = repositoryPool.entrySet();

        Iterator<Map.Entry<String, LuceneRepository>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, LuceneRepository> next = iterator.next();
            next.getValue().close();
        }

        Set<String> keySet = repositoryPool.keySet();
        Collection<LuceneRepository> values = repositoryPool.values();

        for (Map.Entry<String, LuceneRepository> entry : repositoryPool.entrySet()) {
            entry.getValue().close();
        }
    }

}
