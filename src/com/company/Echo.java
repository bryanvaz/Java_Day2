package com.company;
import java.util.Map;

public class Echo {
    public static void cliArgs (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }

    public static void envVariables (String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }
}
