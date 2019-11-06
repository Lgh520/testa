package com.tydk;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.internal.util.xml.impl.Input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class test {
    public static void main(String[] args) throws Exception {
        ThreadTest tt=new ThreadTest();
        tt.start();
        for (int i=0;i<=49;i++){
            System.out.println("i="+i);
            if(i==10) tt.join();
        }
    }

}
