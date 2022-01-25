package basic.exception;

import java.io.File;

public class ExceptionEx03 {
    public static void main(String[] args) {
        try{
            File f = createFile("");
            System.out.println(f.getName() + " 파일 생성");
        }catch (Exception e){
            System.out.println(e.getMessage() + " 다시 입력해주세요.");

        }
    }

    static File createFile(String fileName) throws Exception{
        if(fileName == null || fileName.equals("")){
            throw new Exception("파일 이름이 유효하지 않음"); // 예외 떠넘기기
        }

        File f = new File(fileName);
        return f;
    }
}
