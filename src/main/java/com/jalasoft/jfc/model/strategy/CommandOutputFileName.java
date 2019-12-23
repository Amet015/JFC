/*
 * Copyright (c) 2019 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.jfc.model.strategy;

/**
 * This class verify if outputFileName value.
 *
 * @version 0.1 19 Dic 2019
 *
 * @author Juan Martinez
 */
public class CommandOutputFileName implements ICommandStrategy {

    // Content command value.
    private String commandValue;

    /**
     * It Creates a new CommandOutputFileName object.
     * @param commandValue contains a value.
     */
    public CommandOutputFileName(String commandValue) {
        this.commandValue = commandValue;
    }

    /**
     * Builds command.
     * @return String of a command.
     */
    public String command(){
        String regexRule = "[^a-zA-Z0-9.]";
        String replaceValue = "";
        if (commandValue != null){
            commandValue = commandValue.replaceAll(regexRule, replaceValue);
            return commandValue;
        }
        return null;
    }
}
