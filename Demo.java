import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * BufferedOutputStream:处理流(高级流)，缓冲输出流gwddwdiu
 * @author Administrator
 *dsad54ujh54
 */
public class Demo {
    public static void main(String[] args){
        try {
            FileOutputStream fos=new FileOutputStream("src/FileSteam/复制黏贴.java");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            String content="我是缓冲输出流测试数据！";
            bos.write(content.getBytes(),0,content.getBytes().length);
            bos.flush();
            bos.close();
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}

