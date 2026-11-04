package com.activeandroid.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.p;

/* JADX INFO: loaded from: classes3.dex */
public class SqlParser {
    public static final int STATE_COMMENT = 2;
    public static final int STATE_COMMENT_BLOCK = 3;
    public static final int STATE_NONE = 0;
    public static final int STATE_STRING = 1;

    private static boolean isNewLine(char c10) {
        return c10 == '\r' || c10 == '\n';
    }

    private static boolean isWhitespace(char c10) {
        return c10 == '\r' || c10 == '\n' || c10 == '\t' || c10 == ' ';
    }

    public static List<String> parse(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Tokenizer tokenizer = new Tokenizer(bufferedInputStream);
            loop0: while (true) {
                char c10 = 0;
                while (true) {
                    if (!tokenizer.hasNext()) {
                        break loop0;
                    }
                    char next = (char) tokenizer.next();
                    if (c10 == 3) {
                        if (tokenizer.skip("*/")) {
                            break;
                        }
                    } else if (c10 == 2) {
                        if (isNewLine(next)) {
                            break;
                        }
                    } else if (c10 == 0 && tokenizer.skip("/*")) {
                        c10 = 3;
                    } else if (c10 == 0 && tokenizer.skip("--")) {
                        c10 = 2;
                    } else if (c10 == 0 && next == ';') {
                        arrayList.add(stringBuffer.toString().trim());
                        stringBuffer.setLength(0);
                    } else {
                        if (c10 == 0 && next == '\'') {
                            c10 = 1;
                        } else if (c10 == 1 && next == '\'') {
                            c10 = 0;
                        }
                        if (c10 == 0 || c10 == 1) {
                            if (c10 != 0 || !isWhitespace(next)) {
                                stringBuffer.append(next);
                            } else if (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) != ' ') {
                                stringBuffer.append(' ');
                            }
                        }
                    }
                }
            }
            p.k(bufferedInputStream);
            if (stringBuffer.length() > 0) {
                arrayList.add(stringBuffer.toString().trim());
            }
            return arrayList;
        } catch (Throwable th2) {
            p.k(bufferedInputStream);
            throw th2;
        }
    }
}
