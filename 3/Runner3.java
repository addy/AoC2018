import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import sun.jvm.hotspot.ci.ciArrayKlass;

public class Runner3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        try (BufferedReader bf = new BufferedReader(new FileReader(new File("C:/Users/addisons/projects/AoC/3/data.txt")))) {
            String line;
            while ((line = bf.readLine()) != null) {
                list.add(line);
            }
        }
        catch (Exception e) {
            System.out.println("WRONG");
        }
    }
}