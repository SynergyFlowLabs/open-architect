package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f336805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f336806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f336807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f336808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f336809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f336810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Method f336811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Method f336812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object f336813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Object f336814j;

    static {
        boolean z10 = false;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> clsLoadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class<?> clsLoadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class<?> clsLoadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class<?> clsLoadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            f336806b = clsLoadClass.getMethod("isSymbolicLink", clsLoadClass2);
            f336807c = clsLoadClass.getMethod("delete", clsLoadClass2);
            f336811g = clsLoadClass.getMethod("readSymbolicLink", clsLoadClass2);
            Object objNewInstance = Array.newInstance(clsLoadClass3, 0);
            f336814j = objNewInstance;
            f336812h = clsLoadClass.getMethod("createSymbolicLink", clsLoadClass2, clsLoadClass2, objNewInstance.getClass());
            Object objNewInstance2 = Array.newInstance(clsLoadClass4, 0);
            f336813i = objNewInstance2;
            f336809e = clsLoadClass.getMethod("exists", clsLoadClass2, objNewInstance2.getClass());
            f336808d = File.class.getMethod("toPath", null);
            f336810f = clsLoadClass2.getMethod("toFile", null);
            z10 = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        f336805a = z10;
    }

    q() {
    }

    public static File a(File file, File file2) throws IOException {
        try {
            if (c(file)) {
                return file;
            }
            return (File) f336810f.invoke(f336812h.invoke(null, f336808d.invoke(file, null), f336808d.invoke(file2, null), f336814j), null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw ((IOException) e11.getTargetException());
        }
    }

    public static void b(File file) throws IOException {
        try {
            f336807c.invoke(null, f336808d.invoke(file, null));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw ((IOException) e11.getTargetException());
        }
    }

    private static boolean c(File file) throws IOException {
        try {
            return ((Boolean) f336809e.invoke(null, f336808d.invoke(file, null), f336813i)).booleanValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw ((RuntimeException) e11.getTargetException());
        }
    }

    public static boolean d() {
        return f336805a;
    }

    public static boolean e(File file) {
        try {
            return ((Boolean) f336806b.invoke(null, f336808d.invoke(file, null))).booleanValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static File f(File file) throws IOException {
        try {
            return (File) f336810f.invoke(f336811g.invoke(null, f336808d.invoke(file, null)), null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
