package io.ktor.util;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nio/ktor/util/TextKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,130:1\n158#2,6:131\n158#2,6:137\n*S KotlinDebug\n*F\n+ 1 Text.kt\nio/ktor/util/TextKt\n*L\n54#1:131,6\n79#1:137,6\n*E\n"})
public final class y1 {
    @NotNull
    public static final u a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new u(str);
    }

    @NotNull
    public static final Pair<String, String> b(@NotNull String str, @NotNull String separator, @NotNull Function0<Pair<String, String>> onMissingDelimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(onMissingDelimiter, "onMissingDelimiter");
        int i10 = 7 >> 0;
        int iR3 = StringsKt.r3(str, separator, 0, false, 6, null);
        if (iR3 == -1) {
            return onMissingDelimiter.invoke();
        }
        String strSubstring = str.substring(0, iR3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(iR3 + separator.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return TuplesKt.to(strSubstring, strSubstring2);
    }

    @NotNull
    public static final String c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\"') {
                sb2.append("&quot;");
            } else if (cCharAt == '<') {
                sb2.append("&lt;");
            } else if (cCharAt == '>') {
                sb2.append("&gt;");
            } else if (cCharAt == '&') {
                sb2.append("&amp;");
            } else if (cCharAt != '\'') {
                sb2.append(cCharAt);
            } else {
                sb2.append("&#x27;");
            }
        }
        return sb2.toString();
    }

    private static final char d(char c10) {
        if ('A' > c10 || c10 >= '[') {
            return (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10;
        }
        return (char) (c10 + ' ');
    }

    @NotNull
    public static final String e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (d(cCharAt) != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int iI3 = StringsKt.i3(str);
        if (i10 <= iI3) {
            while (true) {
                sb2.append(d(str.charAt(i10)));
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return sb2.toString();
    }

    private static final char f(char c10) {
        if ('a' > c10 || c10 >= '{') {
            return (c10 < 0 || c10 >= 128) ? Character.toLowerCase(c10) : c10;
        }
        return (char) (c10 - ' ');
    }

    @NotNull
    public static final String g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            char cCharAt = str.charAt(i10);
            if (f(cCharAt) != cCharAt) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        int iI3 = StringsKt.i3(str);
        if (i10 <= iI3) {
            while (true) {
                sb2.append(f(str.charAt(i10)));
                if (i10 == iI3) {
                    break;
                }
                i10++;
            }
        }
        return sb2.toString();
    }
}
