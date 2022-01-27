package com.ghailene;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CommandExecutor commandExecutor = new CommandExecutorProxy("ghailene", "worng_passww");
        //CommandExecutor commandExecutor = new CommandExecutorProxy("ghailene", "passw");

        try {
            commandExecutor.executeCommand("ls -a ");
            commandExecutor.executeCommand("rm some folder ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
