package com.fasterxml.jackson.core.util;

import com.facebook.internal.z0;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f102785a = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f102786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final ThreadLocal<SoftReference<a>> f102787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final ThreadLocal<SoftReference<com.fasterxml.jackson.core.io.g>> f102788d;

    static {
        f102786b = z0.P.equals(System.getProperty(f102785a)) ? o.a() : null;
        f102787c = new ThreadLocal<>();
        f102788d = new ThreadLocal<>();
    }

    public static byte[] a(String str) {
        return c().f(str);
    }

    public static a b() {
        ThreadLocal<SoftReference<a>> threadLocal = f102787c;
        SoftReference<a> softReference = threadLocal.get();
        a aVar = softReference == null ? null : softReference.get();
        if (aVar == null) {
            aVar = new a();
            o oVar = f102786b;
            threadLocal.set(oVar != null ? oVar.d(aVar) : new SoftReference<>(aVar));
        }
        return aVar;
    }

    public static com.fasterxml.jackson.core.io.g c() {
        ThreadLocal<SoftReference<com.fasterxml.jackson.core.io.g>> threadLocal = f102788d;
        SoftReference<com.fasterxml.jackson.core.io.g> softReference = threadLocal.get();
        com.fasterxml.jackson.core.io.g gVar = softReference == null ? null : softReference.get();
        if (gVar != null) {
            return gVar;
        }
        com.fasterxml.jackson.core.io.g gVar2 = new com.fasterxml.jackson.core.io.g();
        threadLocal.set(new SoftReference<>(gVar2));
        return gVar2;
    }

    public static void d(CharSequence charSequence, StringBuilder sb2) {
        c().h(charSequence, sb2);
    }

    public static char[] e(String str) {
        return c().i(str);
    }

    public static byte[] f(String str) {
        return c().j(str);
    }

    public static int g() {
        o oVar = f102786b;
        if (oVar != null) {
            return oVar.b();
        }
        return -1;
    }
}
