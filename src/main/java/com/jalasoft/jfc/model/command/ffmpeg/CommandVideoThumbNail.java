/*
 * Copyright (c) 2019 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.jfc.model.command.ffmpeg;

import com.jalasoft.jfc.model.command.ICommandStrategy;
import com.jalasoft.jfc.model.video.VideoCommand;

/**
 * This Class contains Command Video ThumbNail.
 *
 * @version 0.1 23 Dic 2019.
 *
 * @author Oscar Lopez.
 */
public class CommandVideoThumbNail implements ICommandStrategy {

    // Content value to rotate.
    private int commandValue;

    // Content value of one second to extract a thumbnail.
    private final short second = 1;

    //Content number 0
    private final short numberZero = 0;

    /**
     * Creates a new CommandVideoRotate object.
     *
     * @param commandValue, receive a value.
     */
    public CommandVideoThumbNail(int commandValue) {
        this.commandValue = commandValue;
    }

    /**
     * This method builds a command.
     *
     * @return command concatenated.
     */
    @Override
    public String command() {
        if (commandValue > numberZero) {
            return SPACE + VideoCommand.THUMBNAIL.getCommand() + SPACE + commandValue +
                  VideoCommand.V_FRAMES + second;
        }
        return null;
    }
}