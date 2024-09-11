package com.hill.scripts;

import com.hill.collections.myimplementation.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class RunScriptExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        String path = Paths.get("src/main/java/com/hill/scripts/hello.sh")
                .toAbsolutePath().toString().replace("\\","/");
        System.out.println(path);

        Process p = Runtime.getRuntime().exec(String.format("sh -c %s", path));

        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }
        int exitCode = p.waitFor();

        Logger.log("ExitCode:" + exitCode, exitCode != 0);
        Logger.log("Output: " + output);
    }
}
