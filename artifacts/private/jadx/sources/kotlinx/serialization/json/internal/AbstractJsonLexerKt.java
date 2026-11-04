package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AbstractJsonLexerKt {
    public static final char BEGIN_LIST = '[';
    public static final char BEGIN_OBJ = '{';
    public static final char COLON = ':';
    public static final char COMMA = ',';
    private static final int CTC_MAX = 126;
    public static final char END_LIST = ']';
    public static final char END_OBJ = '}';
    private static final int ESC2C_MAX = 117;
    public static final char INVALID = 0;

    @NotNull
    public static final String NULL = "null";
    public static final char STRING = '\"';
    public static final char STRING_ESC = '\\';
    public static final byte TC_BEGIN_LIST = 8;
    public static final byte TC_BEGIN_OBJ = 6;
    public static final byte TC_COLON = 5;
    public static final byte TC_COMMA = 4;
    public static final byte TC_END_LIST = 9;
    public static final byte TC_END_OBJ = 7;
    public static final byte TC_EOF = 10;
    public static final byte TC_INVALID = 127;
    public static final byte TC_OTHER = 0;
    public static final byte TC_STRING = 1;
    public static final byte TC_STRING_ESC = 2;
    public static final byte TC_WHITESPACE = 3;
    public static final char UNICODE_ESC = 'u';

    @NotNull
    public static final String allowStructuredMapKeysHint = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
    public static final int asciiCaseMask = 32;

    @NotNull
    public static final String coerceInputValuesHint = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.";

    @NotNull
    public static final String ignoreUnknownKeysHint = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.";

    @NotNull
    public static final String lenientHint = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";

    @NotNull
    public static final String specialFlowingValuesHint = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";

    public static final byte charToTokenClass(char c10) {
        if (c10 < '~') {
            return CharMappings.CHAR_TO_TOKEN[c10];
        }
        return (byte) 0;
    }

    public static final char escapeToChar(int i10) {
        if (i10 < 117) {
            return CharMappings.ESCAPE_2_CHAR[i10];
        }
        return (char) 0;
    }

    @NotNull
    public static final String tokenDescription(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        return b10 == 127 ? "invalid token" : "valid token";
    }
}
