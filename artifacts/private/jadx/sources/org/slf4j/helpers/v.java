package org.slf4j.helpers;

import com.facebook.internal.z0;

/* JADX INFO: loaded from: classes14.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f339681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f339682b;

    private static final class b extends SecurityManager {
        private b() {
        }

        @Override // java.lang.SecurityManager
        protected Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private v() {
    }

    public static Class<?> a() {
        int i10;
        b bVarB = b();
        if (bVarB == null) {
            return null;
        }
        Class<?>[] classContext = bVarB.getClassContext();
        String name = v.class.getName();
        int i11 = 0;
        while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
            i11++;
        }
        if (i11 >= classContext.length || (i10 = i11 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i10];
    }

    private static b b() {
        b bVar = f339681a;
        if (bVar != null) {
            return bVar;
        }
        if (f339682b) {
            return null;
        }
        b bVarE = e();
        f339681a = bVarE;
        f339682b = true;
        return bVarE;
    }

    public static final void c(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void d(String str, Throwable th2) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th2.printStackTrace();
    }

    private static b e() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean f(String str) {
        String strG = g(str);
        if (strG == null) {
            return false;
        }
        return strG.equalsIgnoreCase(z0.P);
    }

    public static String g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
