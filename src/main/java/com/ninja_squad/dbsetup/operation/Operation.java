/*
 * The MIT License
 *
 * Copyright (c) 2012, Ninja Squad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.ninja_squad.dbsetup.operation;

import java.sql.Connection;
import java.sql.SQLException;

import com.ninja_squad.dbsetup.DbSetupTracker;
import com.ninja_squad.dbsetup.bind.BinderConfiguration;

/**
 * An operation that the database setup executes. It's advised to make implementations of this interface
 * immutable, and to make them implement equals and hashCode in order for {@link DbSetupTracker} to function
 * properly.
 * @author JB Nizet
 */
public interface Operation {

    /**
     * Executes the operation
     * @param connection the connection used to execute the operation
     * @param configuration the binder configuration, used to get appropriate binders based on the metadata of
     * the prepared statements
     * @throws SQLException if the execution throws a SQLException
     */
    void execute(Connection connection, BinderConfiguration configuration) throws SQLException;
}
