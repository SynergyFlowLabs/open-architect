package com.google.api.client.util.store;

import com.google.api.client.util.b0;
import com.google.api.client.util.p0;
import com.google.api.client.util.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class g extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f116174e = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f116175d;

    static class a<V extends Serializable> extends c<V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final File f116176e;

        a(g gVar, File file, String str) throws IOException {
            super(gVar, str);
            File file2 = new File(file, str);
            this.f116176e = file2;
            if (t.f(file2)) {
                throw new IOException("unable to use a symbolic link: " + file2);
            }
            if (!file2.createNewFile()) {
                this.f116173d = (HashMap) t.d(new FileInputStream(file2));
            } else {
                this.f116173d = b0.a();
                f();
            }
        }

        @Override // com.google.api.client.util.store.c
        public void f() throws IOException {
            t.g(this.f116173d, new FileOutputStream(this.f116176e));
        }

        @Override // com.google.api.client.util.store.a, com.google.api.client.util.store.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public g d() {
            return (g) super.d();
        }
    }

    public g(File file) throws Throwable {
        File canonicalFile = file.getCanonicalFile();
        this.f116175d = canonicalFile;
        if (t.f(canonicalFile)) {
            throw new IOException("unable to use a symbolic link: " + canonicalFile);
        }
        if (!canonicalFile.exists() && !canonicalFile.mkdirs()) {
            throw new IOException("unable to create directory: " + canonicalFile);
        }
        d(canonicalFile);
    }

    static void d(File file) throws Throwable {
        try {
            Class cls = Boolean.TYPE;
            Method method = File.class.getMethod("setReadable", cls, cls);
            Method method2 = File.class.getMethod("setWritable", cls, cls);
            Method method3 = File.class.getMethod("setExecutable", cls, cls);
            Boolean bool = Boolean.FALSE;
            if (!((Boolean) method.invoke(file, bool, bool)).booleanValue() || !((Boolean) method2.invoke(file, bool, bool)).booleanValue() || !((Boolean) method3.invoke(file, bool, bool)).booleanValue()) {
                f116174e.warning("unable to change permissions for everybody: " + file);
            }
            Boolean bool2 = Boolean.TRUE;
            if (((Boolean) method.invoke(file, bool2, bool2)).booleanValue() && ((Boolean) method2.invoke(file, bool2, bool2)).booleanValue() && ((Boolean) method3.invoke(file, bool2, bool2)).booleanValue()) {
                return;
            }
            f116174e.warning("unable to change permissions for owner: " + file);
        } catch (IllegalAccessException | IllegalArgumentException | SecurityException unused) {
        } catch (NoSuchMethodException unused2) {
            f116174e.warning("Unable to set permissions for " + file + ", likely because you are running a version of Java prior to 1.6");
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            p0.c(cause, IOException.class);
            throw new RuntimeException(cause);
        }
    }

    @Override // com.google.api.client.util.store.b
    protected <V extends Serializable> d<V> b(String str) throws IOException {
        return new a(this, this.f116175d, str);
    }

    public final File c() {
        return this.f116175d;
    }
}
