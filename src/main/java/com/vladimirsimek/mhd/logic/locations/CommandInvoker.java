package com.vladimirsimek.mhd.logic.locations;

import java.util.ArrayList;
import java.util.List;

/**
 * The Invoker class executes commands.
 */
public class CommandInvoker {
    private final List<Command> commandHistory = new ArrayList<>();

    /**
     * Executes a command and stores it in the history.
     *
     * @param command The command to execute.
     */
    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    /**
     * Prints all executed commands (for logging or undo support).
     */
    public void showCommandHistory() {
        System.out.println("Executed Commands:");
        for (Command command : commandHistory) {
            System.out.println(command.getClass().getSimpleName());
        }
    }
}