package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.b
@k
public final class r0 {
    private r0() {
    }

    public static String a(CharSequence a10, CharSequence b10) {
        j0.E(a10);
        j0.E(b10);
        int iMin = Math.min(a10.length(), b10.length());
        int i10 = 0;
        while (i10 < iMin && a10.charAt(i10) == b10.charAt(i10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (k(a10, i11) || k(b10, i11)) {
            i10--;
        }
        return a10.subSequence(0, i10).toString();
    }

    public static String b(CharSequence a10, CharSequence b10) {
        j0.E(a10);
        j0.E(b10);
        int iMin = Math.min(a10.length(), b10.length());
        int i10 = 0;
        while (i10 < iMin && a10.charAt((a10.length() - i10) - 1) == b10.charAt((b10.length() - i10) - 1)) {
            i10++;
        }
        if (k(a10, (a10.length() - i10) - 1) || k(b10, (b10.length() - i10) - 1)) {
            i10--;
        }
        return a10.subSequence(a10.length() - i10, a10.length()).toString();
    }

    @fj.a
    public static String c(@fj.a String string) {
        return i0.b(string);
    }

    public static boolean d(@fj.a String string) {
        return i0.i(string);
    }

    public static String e(@fj.a String template, @fj.a Object... args) {
        int iIndexOf;
        String strValueOf = String.valueOf(template);
        int i10 = 0;
        if (args == null) {
            args = new Object[]{"(Object[])null"};
        } else {
            for (int i11 = 0; i11 < args.length; i11++) {
                args[i11] = f(args[i11]);
            }
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i12 = 0;
        while (i10 < args.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) strValueOf, i12, iIndexOf);
            sb2.append(args[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i10 < args.length) {
            sb2.append(" [");
            sb2.append(args[i10]);
            for (int i13 = i10 + 1; i13 < args.length; i13++) {
                sb2.append(", ");
                sb2.append(args[i13]);
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2.toString();
    }

    private static String f(@fj.a Object o10) {
        if (o10 == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            return o10.toString();
        } catch (Exception e10) {
            String str = o10.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o10));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e10);
            return "<" + str + " threw " + e10.getClass().getName() + ">";
        }
    }

    public static String g(@fj.a String string) {
        return i0.f(string);
    }

    public static String h(String string, int minLength, char padChar) {
        j0.E(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(minLength);
        sb2.append(string);
        for (int length = string.length(); length < minLength; length++) {
            sb2.append(padChar);
        }
        return sb2.toString();
    }

    public static String i(String string, int minLength, char padChar) {
        j0.E(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb2 = new StringBuilder(minLength);
        for (int length = string.length(); length < minLength; length++) {
            sb2.append(padChar);
        }
        sb2.append(string);
        return sb2.toString();
    }

    public static String j(String string, int count) {
        j0.E(string);
        if (count <= 1) {
            j0.k(count >= 0, "invalid count: %s", count);
            if (count == 0) {
                string = "";
            }
            return string;
        }
        int length = string.length();
        long j10 = ((long) length) * ((long) count);
        int i10 = (int) j10;
        if (i10 != j10) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j10);
        }
        char[] cArr = new char[i10];
        string.getChars(0, length, cArr, 0);
        while (true) {
            int i11 = i10 - length;
            if (length >= i11) {
                System.arraycopy(cArr, 0, cArr, length, i11);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @com.google.common.annotations.e
    static boolean k(CharSequence string, int index) {
        return index >= 0 && index <= string.length() + (-2) && Character.isHighSurrogate(string.charAt(index)) && Character.isLowSurrogate(string.charAt(index + 1));
    }
}
