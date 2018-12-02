import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import sun.jvm.hotspot.ci.ciArrayKlass;

public class Runner2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        try (BufferedReader bf = new BufferedReader(new FileReader(new File("C:/Users/addisons/projects/AoC/2/data.txt")))) {
            String line;
            while ((line = bf.readLine()) != null) {
                list.add(line);
            }
        }
        catch (Exception e) {
            System.out.println("WRONG");
        }

        String first = null, second = null;
        int i = 0, j = 1, listSize = list.size(), strLen = list.get(0).length();
        while (i < listSize - 1 && first == null) {
            String curr = list.get(i);
            String next = "";
            j = i + 1;
            while (j < listSize) {
                next = list.get(j);
                int diffCount = 0, index = 0;
                while (index < strLen && diffCount < 2) {
                    if (curr.charAt(index) != next.charAt(index))
                        diffCount++;
                    index++;
                }

                if (diffCount == 1) {
                    first = curr;
                    second = next;
                    break;
                }

                j++;
            }

            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (i = 0; i < strLen; i++) {
            char c = first.charAt(i);
            if (c == second.charAt(i)) {
                sb.append(c);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(sb.toString() + " " + (end - start));
    }
}