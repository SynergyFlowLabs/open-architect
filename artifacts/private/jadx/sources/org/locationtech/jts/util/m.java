package org.locationtech.jts.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f339157a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static NumberFormat f339158b = new DecimalFormat("0.#");

    public static String a(char c10, int i10) {
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = c10;
        }
        return new String(cArr);
    }

    public static String b(Throwable th2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        th2.printStackTrace(new PrintStream(byteArrayOutputStream));
        return byteArrayOutputStream.toString();
    }

    public static String c(Throwable th2, int i10) {
        LineNumberReader lineNumberReader = new LineNumberReader(new StringReader(b(th2)));
        String str = "";
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                str = str + lineNumberReader.readLine() + f339157a;
            } catch (IOException unused) {
                a.e();
            }
        }
        return str;
    }

    public static String d(int i10) {
        return a(' ', i10);
    }

    public static String[] e(String str, String str2) {
        int i10;
        int length = str2.length();
        ArrayList arrayList = new ArrayList();
        String strSubstring = "" + str;
        int iIndexOf = strSubstring.indexOf(str2);
        while (true) {
            if (iIndexOf < 0) {
                break;
            }
            arrayList.add(strSubstring.substring(0, iIndexOf));
            strSubstring = strSubstring.substring(iIndexOf + length);
            iIndexOf = strSubstring.indexOf(str2);
        }
        if (strSubstring.length() > 0) {
            arrayList.add(strSubstring);
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) arrayList.get(i10);
        }
        return strArr;
    }

    public static String f(double d10) {
        return f339158b.format(d10);
    }
}
