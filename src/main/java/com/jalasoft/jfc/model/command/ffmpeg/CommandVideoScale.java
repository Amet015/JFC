/*
 * Copyright (c) 2019 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.jfc.model.command.ffmpeg;


import com.jalasoft.jfc.model.exception.CommandValueException;
import com.jalasoft.jfc.model.command.ICommandStrategy;
import com.jalasoft.jfc.model.exception.ErrorMessageJfc;
import com.jalasoft.jfc.model.video.VideoCommand;

/**
 * Changes Command Video Scale of a video.
 *
 * @version 0.1 23 Dic 2019.
 *
 * @author Oscar Lopez.
 */
public class CommandVideoScale implements ICommandStrategy {

    // Contents width value.
    private int width;

    // Contents height value.
    private int height;

    //Contents number 0.
    private final short numberZero = 0;

    /**
     * Creates a new CommandVideoScale object.
     * @param width, receive a value.
     * @param height, receive a value.
     */
    public CommandVideoScale(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Builds a command.
     * @return command concatenated.
     * @throws CommandValueException when is a invalid command.
     */
    @Override
    public String command() throws CommandValueException {
        try {
            if (width == numberZero || height == numberZero) {
                return VideoCommand.EMPTY.getCommand();
            }
            else {
                if (width > numberZero && height > numberZero) {
                    return this.SPACE + VideoCommand.VF.getCommand() + this.SPACE + VideoCommand.SCALE.getCommand() +
                            width + VideoCommand.COLON.getCommand() + height;
                }
                throw new CommandValueException(ErrorMessageJfc.SCALE_NOT_CHANGE.getErrorMessageJfc(), this.getClass()
                        .getName());
            }
        } catch (CommandValueException cve) {
            throw new CommandValueException(cve.getMessage(), this.getClass().getName());
        }
    }
}
