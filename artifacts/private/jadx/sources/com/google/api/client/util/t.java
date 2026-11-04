package com.google.api.client.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes4.dex */
public class t {
    public static long a(m0 m0Var) throws IOException {
        h hVar = new h();
        try {
            m0Var.writeTo(hVar);
            hVar.close();
            return hVar.f116082a;
        } catch (Throwable th2) {
            hVar.close();
            throw th2;
        }
    }

    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        c(inputStream, outputStream, true);
    }

    public static void c(InputStream inputStream, OutputStream outputStream, boolean z10) throws IOException {
        try {
            i.a(inputStream, outputStream);
            if (z10) {
            }
        } finally {
            if (z10) {
                inputStream.close();
            }
        }
    }

    public static <S extends Serializable> S d(InputStream inputStream) throws IOException {
        try {
            try {
                S s10 = (S) new ObjectInputStream(inputStream).readObject();
                inputStream.close();
                return s10;
            } catch (ClassNotFoundException e10) {
                IOException iOException = new IOException("Failed to deserialize object");
                iOException.initCause(e10);
                throw iOException;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public static <S extends Serializable> S e(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return (S) d(new ByteArrayInputStream(bArr));
    }

    public static boolean f(File file) throws Throwable {
        try {
            return ((Boolean) Class.forName("java.nio.file.Files").getMethod("isSymbolicLink", Path.class).invoke(null, File.class.getMethod("toPath", null).invoke(file, null))).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException unused) {
            if (File.separatorChar == '\\') {
                return false;
            }
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            return !file.getCanonicalFile().equals(file.getAbsoluteFile());
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            p0.c(cause, IOException.class);
            throw new RuntimeException(cause);
        }
    }

    public static void g(Object obj, OutputStream outputStream) throws IOException {
        try {
            new ObjectOutputStream(outputStream).writeObject(obj);
            outputStream.close();
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    public static byte[] h(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g(obj, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
