/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decom;

import java.io.File;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author KHANGAR SIR
 */
public class compressor
{
    public static void method(File file) throws IOException
    {
        String fileDirectory=file.getParent();
        
        //as I've to compress the file.. 
        //firt use InputStream..
        FileInputStream fis=new FileInputStream(file);
        
        //then we'll use FileOutPutStream..
        //I'll write this perticular file on the path...
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/compressed.gz");
        
        //I'll conversion into GZIPoutputStram..
       //we'll write that compressed data in gzip file..
        
        GZIPOutputStream gzip=new GZIPOutputStream(fos);
        
        byte[]buffer=new byte[1024];
        int len;
        
        while((len=fis.read(buffer))!=-1)
        {
            gzip.write(buffer,0,len);
        }
        
        //close all;
        gzip.close();
        fis.close();
        fos.close();        
        
    }
    
    public static void main(String[]args) throws IOException
    {
        File path=new File("/users/aniket/downloads/compressed/compressedDecompressed/textfile");
        method(path);
    }
}
