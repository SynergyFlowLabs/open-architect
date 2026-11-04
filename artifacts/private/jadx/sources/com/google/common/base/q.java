package com.google.common.base;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@k
public class q implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f116653e = "com.google.common.base.internal.Finalizer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ReferenceQueue<Object> f116655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final PhantomReference<Object> f116656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f116657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f116652d = Logger.getLogger(q.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f116654f = c(d(new d(), new a(), new b()));

    static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f116658a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        a() {
        }

        @Override // com.google.common.base.q.c
        @fj.a
        public Class<?> a() {
            try {
                return c(b()).loadClass(q.f116653e);
            } catch (Exception e10) {
                q.f116652d.log(Level.WARNING, f116658a, (Throwable) e10);
                return null;
            }
        }

        URL b() throws IOException {
            String str = q.f116653e.replace('.', '/') + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: " + string);
        }

        URLClassLoader c(URL base) {
            return new URLClassLoader(new URL[]{base}, null);
        }
    }

    static class b implements c {
        b() {
        }

        @Override // com.google.common.base.q.c
        public Class<?> a() {
            try {
                return Class.forName("y7.a");
            } catch (ClassNotFoundException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    interface c {
        @fj.a
        Class<?> a();
    }

    static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @com.google.common.annotations.e
        static boolean f116659a;

        d() {
        }

        @Override // com.google.common.base.q.c
        @fj.a
        public Class<?> a() {
            if (f116659a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(q.f116653e);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                q.f116652d.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public q() {
        boolean z10;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f116655a = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.f116656b = phantomReference;
        try {
            f116654f.invoke(null, p.class, referenceQueue, phantomReference);
            z10 = true;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (Throwable th2) {
            f116652d.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th2);
            z10 = false;
        }
        this.f116657c = z10;
    }

    static Method c(Class<?> finalizer) {
        try {
            return finalizer.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e10) {
            throw new AssertionError(e10);
        }
    }

    private static Class<?> d(c... loaders) {
        for (c cVar : loaders) {
            Class<?> clsA = cVar.a();
            if (clsA != null) {
                return clsA;
            }
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void b() {
        if (this.f116657c) {
            return;
        }
        while (true) {
            Reference<? extends Object> referencePoll = this.f116655a.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((p) referencePoll).a();
            } catch (Throwable th2) {
                f116652d.log(Level.SEVERE, "Error cleaning up after reference.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f116656b.enqueue();
        b();
    }
}
