import org.omg.CORBA.INTERNAL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HackerDataStructures {
    public  int a = 10;
    public void foo(Consumer<Integer> cons){
        cons.accept(10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate){
        list.forEach((n)->{
            if( predicate.test(n)){
                System.out.print(n + " ");
            }
        });
    }

    public static void oneDimArray() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            a[i] = val;
        }
        scan.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static class TwoDimArray {
        public static void Solver() {
            Scanner scan = new Scanner(System.in);
            int arr[][] = new int[6][6];
            for (int row = 0; row < 6; row++) {
                for (int col = 0; col < 6; col++) {
                    arr[row][col] = scan.nextInt();
                }
            }
            scan.close();

            System.out.println(maxHourglass(arr));
        }

        public static int maxHourglass(int[][] arr) {
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    int sum = findSum(arr, row, col);
                    max = Math.max(max, sum);
                }
            }
            return max;
        }

        private static int findSum(int[][] arr, int r, int c) {
            int sum = arr[r + 0][c + 0] + arr[r + 0][c + 1] + arr[r + 0][c + 2]
                    + arr[r + 1][c + 1] +
                    arr[r + 2][c + 0] + arr[r + 2][c + 1] + arr[r + 2][c + 2];
            return sum;
        }
    }

    public static class SubArray {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scan.nextInt();
            }
            scan.close();

            System.out.println(negativeSubarrays(array));
        }

        private static int negativeSubarrays(int[] array) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                for (int j = i; j < array.length; j++) {
                    sum += array[j];
                    if (sum < 0) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void javaArrayList() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List[] arr = new List[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new ArrayList<Integer>();
            int m = scan.nextInt();
            for (int j = 0; j < m; j++) {
                arr[i].add(scan.nextInt());
            }
        }
        //=======================================
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int row = scan.nextInt();
            int col = scan.nextInt();
            if (col > arr[row - 1].size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arr[row - 1].get(col - 1));
            }
        }
    }


    public static class OneDimArray2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            while (T-- > 0) {
                int n = scan.nextInt();
                int m = scan.nextInt();
                int[] array = new int[n];
                for (int i = 0; i < n; i++) {
                    array[i] = scan.nextInt();
                }
                System.out.println(isSolvable(array, m, 0) ? "YES" : "NO");
            }
            scan.close();
        }

        private static boolean isSolvable(int[] array, int m, int i) {
            if (i < 0 || array[i] == 1) {
                return false;
            } else if (i + 1 >= array.length || i + m >= array.length) {
                return true;
            }
            array[i] = 1;
            return isSolvable(array, m, i + m) ||
                    isSolvable(array, m, i + 1) ||
                    isSolvable(array, m, i - 1);
        }
    }

    public static void javaMap() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String name = br.readLine();
            int phone = Integer.parseInt(br.readLine());
            map.put(name, phone);
        }

        String s;
        while ((s = br.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        br.close();

    }

    static class JavaStack {
        public static void main(String[] args) {
            HashMap<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('[', ']');
            map.put('{', '}');
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {
                String expression = scan.next();
                System.out.println(isBalanced(expression, map) ? "true" : "false");
            }
            scan.close();
        }

        private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
            if ((expression.length() % 2) != 0) {
                return false;
            }
            ArrayDeque<Character> deque = new ArrayDeque<>();
            for (int i = 0; i < expression.length(); i++) {
                Character ch = expression.charAt(i);
                if (map.containsKey(ch)) {
                    deque.push(ch);
                } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                    return false;
                }
            }
            return deque.isEmpty();
        }
    }


    public static void javaHashSet() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        s.close();

        HashSet<String> set = new HashSet<>(t);
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }


    public <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }


    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    static class Checker implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            if (p1.score == p2.score) {
                return p1.name.compareTo(p2.name);
            } else {
                return p2.score - p1.score; // descending order
            }
        }
    }


    static class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    public static class javaSort {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int testCases = Integer.parseInt(scan.nextLine());

            List<Student> studentList = new ArrayList<Student>();
            while (testCases-- > 0) {
                int id = scan.nextInt();
                String fname = scan.next();
                double cgpa = scan.nextDouble();
                Student st = new Student(id, fname, cgpa);
                studentList.add(st);
            }
            scan.close();

            Collections.sort(studentList, new StudentComparator());
            for (Student st : studentList) {
                System.out.println(st.getFname());
            }
        }
    }


    static class StudentComparator implements Comparator<Student> {
        double epsilon = 0.001; // since we shouldn't use "==" with doubles

        @Override
        public int compare(Student s1, Student s2) {
            if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
                return s1.getCgpa() < s2.getCgpa() ? 1 : -1; // descending order
            } else if (!s1.getFname().equals(s2.getFname())) {
                return s1.getFname().compareTo(s2.getFname());
            } else {
                return s1.getId() - s2.getId();
            }
        }


    }



    static public class javaDequeue {
        public static void test(String[] args) {
            HashMap<Integer, Integer> map = new HashMap<>();
            ArrayDeque<Integer> deque     = new ArrayDeque<>();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int m = scan.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (i >= m) {
                    int old = deque.removeFirst();
                    if (map.get(old) == 1) {
                        map.remove(old);
                    } else {
                        map.merge(old, -1, Integer::sum);
                    }
                }
                int num = scan.nextInt();
                deque.addLast(num);
                map.merge(num, 1, Integer::sum);
                max = Math.max(max, map.size());
            }

            scan.close();
            System.out.println(max);
        }
    }


    public static void javaBitSet(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        while (M-- > 0) {
            String str = scan.next();
            int a      = scan.nextInt();
            int b      = scan.nextInt();
            switch (str) {
                case "AND":
                    if (a == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (a == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "XOR":
                    if (a == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (a == 1) {
                        B1.flip(b);
                    } else {
                        B2.flip(b);
                    }
                    break;
                case "SET":
                    if (a == 1) {
                        B1.set(b);
                    } else {
                        B2.set(b);
                    }
                    break;
                default:
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scan.close();
    }





}