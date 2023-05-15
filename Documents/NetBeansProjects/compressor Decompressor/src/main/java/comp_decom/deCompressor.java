/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decom;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author KHANGAR SIR
 */
public class deCompressor 
{
    public static void method(File file) throws FileNotFoundException, IOException
    {
        String fileDirectory=file.getParent();
        
        //first we'll read the file using fileIputStream...
        FileInputStream fis=new FileInputStream(file);
        
        //readed the file.. using fis...
      //as it is compressed so we'll extract that data by readign fis.. 
      //using GZIPInputStream..
      GZIPInputStream gzip=new GZIPInputStream(fis);
      
      //as we have converted into the noncompressed one... 
      //so we'll have write it in perticular loaction or we can we have to save it there..
      
      FileOutputStream fos=new FileOutputStream(fileDirectory+"/decompressedFile");
      
      //I'll transfer all the data from gzip to fos...
      
      byte[]buffer=new byte[1024];
      int len;
      while((len=gzip.read(buffer))!=-1)
      {
          fos.write(buffer,0,len);
      }
      
      fis.close();
      fos.close();
      gzip.close();
    }
    
        public static void main(String[]args)throws IOException{
            //we'll have to give the location that file as we have to decompressed it...
            //here we go 
            File path=new File("/users/aniket/downloads/compressed/compressedDecompressed/compressedFile.gz");
            method(path);
        }
}
