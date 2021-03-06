/*
 * Copyright 2020 Arthur Sadykov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.isarthur.nb.sql.formatter.ui;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

/**
 *
 * @author Arthur Sadykov
 */
public class DocumentHandler {

    private DocumentHandler() {
    }

    public static void clear(Document document) throws BadLocationException {
        document.remove(0, document.getLength());
    }

    public static String getContent(Document document) throws BadLocationException {
        return document.getText(0, document.getLength());
    }

    public static void insert(Document document, String text) throws BadLocationException {
        document.insertString(0, text, null);
    }
}
