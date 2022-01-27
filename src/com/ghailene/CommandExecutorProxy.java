package com.ghailene;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin = false;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String login, String password) {
        isAdmin = "ghailene".equals(login) && "passw".equals(password);
        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void executeCommand(String cmd) throws Exception {
        if (isAdmin) {
            System.out.println("executing  command "+ cmd +"as admin");
            commandExecutor.executeCommand(cmd);
        }else {
            if(cmd.contains("rm")){
                throw new Exception("you don't have admin access to exceut this command");
            }else
                commandExecutor.executeCommand(cmd);
        }
    }
}
