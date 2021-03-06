/*
 * Copyright (c) 2019 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.jfc.model.exception;

/**
 * Class of manage exception of zip.
 *
 * @version 0.1 03 Jan 2020.
 *
 * @author Alan Escalera.
 */
public class ZipJfcException extends Exception {

    // Returns a message error.
    String message;

    /**
     * Manages Exceptions of zip.
     * @param param parameter of file.
     * @param message of error.
     */
    public ZipJfcException(String message, String param) {
        this.message = message + " " + param;
    }

    /**
     * Gets error message.
     * @return message.
     */
    @Override
    public String getMessage() {
        return message;
    }
}
