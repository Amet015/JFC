/*
 * Copyright (c) 2019 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.jfc.model.command.LibreOffice;

import com.jalasoft.jfc.model.command.ICommandStrategy;
import com.jalasoft.jfc.model.pptx.LibreOfficeCommand;

/**
 * Builds a command to convert an pptx file.
 *
 * @version 0.1 07 Jan 2020.
 *
 * @author Alan Escalera.
 */
public class CommandPdfConverter implements ICommandStrategy {

    /**
     * Builds a convert command.
     * @return convert command.
     */
    @Override
    public String command() {
        return this.SPACE + LibreOfficeCommand.CONVERT.getCommand() + this.SPACE + LibreOfficeCommand.PDF.getCommand();
    }
}
