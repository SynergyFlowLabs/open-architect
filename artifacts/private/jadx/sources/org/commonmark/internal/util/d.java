package org.commonmark.internal.util;

import com.planner5d.library.engine.input.f;
import okhttp3.internal.ws.g;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f337708a = "[A-Za-z][A-Za-z0-9-]*";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f337709b = "[a-zA-Z_:][a-zA-Z0-9:._-]*";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f337710c = "[^\"'=<>`\\x00-\\x20]+";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f337711d = "'[^']*'";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f337712e = "\"[^\"]*\"";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f337713f = "(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\")";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f337714g = "(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f337715h = "(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f337716i = "<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f337717j = "</[A-Za-z][A-Za-z0-9-]*\\s*[>]";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f337718k = 4;

    public static int a(int i10) {
        return 4 - (i10 % 4);
    }

    public static int b(char c10, CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private static int d(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != ' ') {
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i10;
                }
            }
            i10++;
        }
        return -1;
    }

    public static boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        return k(' ', charSequence, 0, length) != length;
    }

    public static boolean f(CharSequence charSequence) {
        return d(charSequence, 0) == -1;
    }

    public static boolean g(CharSequence charSequence, int i10) {
        if (i10 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i10);
        switch (cCharAt) {
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
                break;
            default:
                switch (cCharAt) {
                    case f.b.f160710n /* 58 */:
                    case f.b.D0 /* 59 */:
                    case '<':
                    case '=':
                    case f.b.I0 /* 62 */:
                    case '?':
                    case '@':
                        break;
                    default:
                        switch (cCharAt) {
                            case f.b.f160711n0 /* 91 */:
                            case f.b.f160697i1 /* 92 */:
                            case f.b.f160700j1 /* 93 */:
                            case f.b.f160703k1 /* 94 */:
                            case f.b.f160706l1 /* 95 */:
                            case '`':
                                break;
                            default:
                                switch (cCharAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case g.f334652s /* 126 */:
                                        break;
                                    default:
                                        return false;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        return true;
    }

    public static boolean h(CharSequence charSequence, int i10) {
        return Character.isLetter(Character.codePointAt(charSequence, i10));
    }

    public static boolean i(CharSequence charSequence, int i10) {
        if (i10 >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i10);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    public static CharSequence j(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb2 = null;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(cCharAt);
            }
        }
        if (sb2 != null) {
            charSequence = sb2.toString();
        }
        return charSequence;
    }

    public static int k(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int l(char c10, CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            if (charSequence.charAt(i10) != c10) {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }

    public static int m(CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int n(CharSequence charSequence, int i10, int i11) {
        while (i10 >= i11) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i10;
            }
            i10--;
        }
        return i11 - 1;
    }
}
