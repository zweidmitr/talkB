package com.zwei.memory.regex;

public class Regex {
    public static void main(String[] args) {
        String s = "J_!a";
        // \s - пробел    \S  - кроме пробела
        // \d - все цифры \D  - кроме цифр
        // \w - все буквы , цифры \W  - кроме всех букв / цифы [a-zA-Z0-9_]
        // [^_] - кроме нижнего подчеркивания, ^ - кроме

        if (s.matches("J[\\w&&[^_]].a"))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
