package com.xmpo;


import java.io.*;

//파일 쓰고 읽기 테스트
public class FileMake {

    public static void main(String[] args) {

        /***********************FILE WRITE***********************/
        try( //요기서 객체를 생성하면 try종료 후 자동으로 close처리됨
                //true : 기존 파일에 이어서 작성 (default는 false임)
                FileWriter fw = new FileWriter( "coding532.txt" ,true);
                BufferedWriter bw = new BufferedWriter( fw );
                )
        {
            bw.write("손흥민"); //버퍼에 데이터 입력
            bw.newLine(); //버퍼에 개행 삽입
            bw.write("이강인");
            bw.newLine();
            bw.flush(); //버퍼의 내용을 파일에 쓰기
        }catch ( IOException e ) {
            System.out.println(e);
        }

        File f = new File("coding532.txt");
        // 파일 존재 여부 판단
        if (f.isFile()) {
            System.out.println("coding532.txt 파일이 있습니다.");
        }

        /***********************FILE READ***********************/
        try(
                FileReader rw = new FileReader("coding532.txt");
                BufferedReader br = new BufferedReader( rw );
                ){

            //읽을 라인이 없을 경우 br은 null을 리턴한다.
            String readLine = null ;
            while( ( readLine =  br.readLine()) != null ){
                System.out.println(readLine);
            }
        }catch ( IOException e ) {
            System.out.println(e);
        }

    }

}
