import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Runner {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int total = 0;
        while (!set.contains(total)) {
            try (BufferedReader bf = new BufferedReader(new FileReader(new File("C:/Users/addisons/projects/AoC/1/data.txt")))) {
                String line;
                while ((line = bf.readLine()) != null && !set.contains(total)) {
                    set.add(total);
                    int value = Integer.parseInt(line);
                    total += value;
                }
            }
            catch (Exception e) {
                System.out.println("WRONG");
            }
        }

        System.out.println(total);
    }
}