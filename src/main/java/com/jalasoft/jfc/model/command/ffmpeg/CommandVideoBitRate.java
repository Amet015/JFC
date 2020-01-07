package com.jalasoft.jfc.model.command.ffmpeg;

import com.jalasoft.jfc.model.command.ICommandStrategy;
import com.jalasoft.jfc.model.exception.CommandValueException;
import com.jalasoft.jfc.model.exception.ErrorMessageJfc;
import com.jalasoft.jfc.model.video.VideoCommand;

/**
 * Changes Aspect Ratio.
 *
 * @version 0.1 02 Ene 2020.
 *
 * @author Oscar Lopez.
 */
public class CommandVideoBitRate implements ICommandStrategy {

    // Contents command value.
    private String commandValue;

    /**
     * Creates a new CommandVideoBitRate object.
     * @param commandValue receive a value.
     */
    public CommandVideoBitRate(String commandValue) {
        this.commandValue = commandValue;
    }

    /**
     * This builds a command.
     * @return command concatenated.
     * @throws CommandValueException when is a invalid command.
     */
    @Override
    public String command() throws CommandValueException {
        try {
            if (!commandValue.isEmpty() && Integer.parseInt(commandValue) > 200 ) {
                System.out.println(this.SPACE + VideoCommand.VIDEO_BITRATE.getCommand() + this.SPACE + commandValue);
                return this.SPACE + VideoCommand.VIDEO_BITRATE.getCommand() + this.SPACE + commandValue;
            }
            throw new CommandValueException(ErrorMessageJfc.VIDEOBITRATE_NOT_CHANGE.getErrorMessageJfc(), this.
                    getClass().getName());
        } catch (CommandValueException cve) {
            throw new CommandValueException(cve.getMessage(), this.getClass().getName());
        }
    }
}
