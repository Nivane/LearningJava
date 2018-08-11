// $Id$

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CopyFile
{
   public static void main( String args[] ) throws Exception {

    String infile = "C:\\Users\\ZLP\\Desktop\\in.txt";
    String outfile = "C:\\Users\\ZLP\\Desktop\\out.txt";

    @SuppressWarnings("resource")
	FileInputStream fin = new FileInputStream( infile );
    @SuppressWarnings("resource")
	FileOutputStream fout = new FileOutputStream( outfile );

    FileChannel fcout = fout.getChannel();
    FileChannel fcin = fin.getChannel();

    ByteBuffer buffer = ByteBuffer.allocate( 1024 );

    while (true) {
      buffer.clear();

      int r = fcin.read( buffer );//缓冲区读入通道

      if (r==-1) {
        break;
      }

      buffer.flip();

      fcout.write( buffer );//通道写入缓冲区
    }
  }
}
