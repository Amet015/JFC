/*
 * Copyright (c) 2019 Jalasoft.
 *
 * This software is the confidential and proprietary information of Jalasoft.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Jalasoft.
 */

package com.jalasoft.jfc.model.result;

/**
 * This class is used in order to return the file converted.
 *
 * @version 0.1 17 Dic 2019
 *
 * @author Juan Martinez
 */
public class FileResult {

    // Content path of result file.
    private String path;

    /**
     * Gets path value.
     * @return path.
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets path String value.
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }
}