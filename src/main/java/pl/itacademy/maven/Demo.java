package pl.itacademy.maven;

import org.apache.commons.lang3.StringUtils;

public class Demo {
    public static void main(String[] args) {
        System.out.println(StringUtils.isBlank("     "));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank("     a       "));
    }

    /*
    1. write code
    1a. clean generated/compiled files
    2. compile code
    3. execute unit tests
    4. package application
    5. execute integration tests
    6. deliver application
     */
}
