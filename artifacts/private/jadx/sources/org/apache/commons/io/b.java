package org.apache.commons.io;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final Charset f336430a = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final Charset f336431b = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final Charset f336432c = Charset.forName("UTF-16");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final Charset f336433d = Charset.forName("UTF-16BE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final Charset f336434e = Charset.forName("UTF-16LE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final Charset f336435f = Charset.forName("UTF-8");

    public static SortedMap<String, Charset> a() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Charset charset = f336430a;
        treeMap.put(charset.name(), charset);
        Charset charset2 = f336431b;
        treeMap.put(charset2.name(), charset2);
        Charset charset3 = f336432c;
        treeMap.put(charset3.name(), charset3);
        Charset charset4 = f336433d;
        treeMap.put(charset4.name(), charset4);
        Charset charset5 = f336434e;
        treeMap.put(charset5.name(), charset5);
        Charset charset6 = f336435f;
        treeMap.put(charset6.name(), charset6);
        return Collections.unmodifiableSortedMap(treeMap);
    }

    public static Charset b(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset c(Charset charset) {
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        return charset;
    }
}
