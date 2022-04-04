package com.jumbodinosaurs.shexecutor;

import com.jumbodinosaurs.devlib.util.GeneralUtil;
import com.jumbodinosaurs.devlib.util.objects.ProcessOutput;

import java.io.IOException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        if (args.length <= 0)
        {
            System.out.println("Usage: java -jar SH-Executor-0.0.1.jar \"/Path/To/SH/Script.sh\"");
            System.exit(0);
        }

        String commandToExecute = "sh";
        String pathToSHScript = args[0];
        ArrayList<String> arguments = new ArrayList<>();
        arguments.add(pathToSHScript);
        try
        {
            ProcessOutput executionOutput = GeneralUtil.execute(commandToExecute, arguments, null);
            System.out.println("Success: " + executionOutput.getSuccessOutput());
            System.out.println("Failure: " + executionOutput.getFailureOutput());
        }
        catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
            System.exit(0);
        }


        System.exit(1);
    }
}
