import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args) {
        String[] words = {"ax", "ax", "cx", "cy", "by", "ay", "cx", "aaa", "azz"};
        String data = map2WordAppend(words);
        System.out.println(data);
    }






    public static Map<String, Integer> map2Word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i], 0);
        }
        return result;
    }

    public static Map<String, Integer> map2WordLength(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            result.put(strings[i], strings[i].length());
        }
        return result;
    }

    public static Map<String, String> map2Pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            result.put(Character.toString(strings[i].charAt(0)),
                    Character.toString(strings[i].charAt(strings[i].length() - 1)));
        }

        return result;
    }


    public static Map<String, Integer> map2WordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        String key = "";
        Integer count = 0;
        for (int i = 0; i < strings.length; i++) {
            key = strings[i];
            if (result.containsKey(key)) {
                count = result.get(key);
                result.put(key, ++count);
            } else {
                result.put(key, 1);
            }
        }
        return result;
    }

    public static Map<String, String> map2FirstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        String key = "";
        String value = "";
        for (int i = 0; i < strings.length; i++) {
            Character ch = strings[i].charAt(0);
            key = ch.toString();
            value = strings[i];
            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value);
            } else {
                result.put(key, value);
            }
        }
        return result;
    }

    public static String map2WordAppend(String[] strings) {
        Map<String, Integer> tmp_map = new HashMap<>();
        String key = "";
        String result = "";
        Integer count = 0;
        for (int i = 0; i < strings.length; i++) {
            key = strings[i];
            if (tmp_map.containsKey(key)) {
                result = result + key;
                tmp_map.remove(key);
            } else {
                tmp_map.put(key, 1);
            }
        }
        return result;
    }

    public static Map<String, Boolean> map2WordMultiply(String[] strings) {
        Map<String, Integer> tmp_map = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();
        String key = "";
        Integer count = 0;
        for (int i = 0; i < strings.length; i++) {
            key = strings[i];
            if (tmp_map.containsKey(key)) {
                count = tmp_map.get(key);
                tmp_map.put(key, ++count);
            } else {
                tmp_map.put(key, 1);
            }
        }

        for (Map.Entry<String, Integer> pair : tmp_map.entrySet()) {
            if (pair.getValue() >= 2) {
                result.put(pair.getKey(), true);
            } else {
                result.put(pair.getKey(), false);
            }
        }
        return result;
    }

    public static String[] map2AllSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<String, Integer> arr = new HashMap<String, Integer>();
        String key = "";
        for (int i = 0; i < strings.length; i++) {
            key = Character.toString(strings[i].charAt(0));
            if (arr.containsKey(key)) {
                int prev_index = arr.get(key);
                if (prev_index != -1) {
                    String tmp = strings[i];
                    strings[i] = strings[prev_index];
                    strings[prev_index] = tmp;
                    arr.remove(key);
                }
            } else {
                arr.put(key, i);
            }
        }
        return strings;
    }


    public static String[] map2FirstSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<String, Integer> arr = new HashMap<String, Integer>();
        String key = "";
        for (int i = 0; i < strings.length; i++) {
            key = Character.toString(strings[i].charAt(0));
            if (arr.containsKey(key)) {
                int prev_index = arr.get(key);
                if (prev_index != -1) {
                    String tmp = strings[i];
                    strings[i] = strings[prev_index];
                    strings[prev_index] = tmp;
                    arr.put(key, -1);
                }
            } else {
                arr.put(key, i);
            }
        }
        return strings;
    }





}
