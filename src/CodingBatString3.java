public class CodingBatString3 {
    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length() - 1; i++)
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    && !Character.isLetter(str.charAt(i + 1)))
                count++;
        return count;
    }

    public String withoutString(String base, String remove) {
        String result = "";
        int index = base.toLowerCase().indexOf(remove.toLowerCase());
        while (index != -1) {
            result += base.substring(0, index);
            base = base.substring(index + remove.length());
            index = base.toLowerCase().indexOf(remove.toLowerCase());
        }
        result += base;
        return result;
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        str = str + "X";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) countIs++;
            if (str.substring(i, i + 3).equals("not")) countNot++;
        }
        return (countIs == countNot);
    }

    public boolean gHappy(String str) {
        str = "X" + str + "X"; // for corner cases
        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == 'g' && str.charAt(i - 1) != 'g'
                    && str.charAt(i + 1) != 'g')
                return false;
        return true;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++)
            if (str.charAt(i) == str.charAt(i + 1)
                    && str.charAt(i + 1) == str.charAt(i + 2))
                count++;
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(str.substring(i, i + 1));
        return sum;
    }

    public String sameEnds(String string) {
        String result = "";
        int len = string.length();
        for (int i = 0; i <= len / 2; i++)
            for (int j = len / 2; j < len; j++)
                if (string.substring(0, i).equals(string.substring(j)))
                    result = string.substring(0, i);
        return result;
    }

    public String mirrorEnds(String string) {
        String result = "";
        int len = string.length();
        for (int i = 0, j = len - 1; i < len; i++, j--)
            if (string.charAt(i) == string.charAt(j))
                result += string.charAt(i);
            else break;
        return result;
    }

    public int maxBlock(String str) {
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
                else break;
            }
            if (count > max) max = count;
        }
        return max;
    }

    public int sumNumbers(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int count = 0;
                for (int j = i; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) count++;
                    else break;
                }
                sum += Integer.parseInt(str.substring(i, i + count));
                i += count;
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        String result = "";
        str = " " + str + "  "; // avoid issues with corner cases
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'i') {
                if (str.charAt(i + 1) == 's'
                        && !Character.isLetter(str.charAt(i + 2))
                        && !Character.isLetter(str.charAt(i - 1))) {
                    result += "is not";
                    i += 1;
                } else result += "i";
            } else result += str.charAt(i);
        }
        return result.substring(1);
    }
}
