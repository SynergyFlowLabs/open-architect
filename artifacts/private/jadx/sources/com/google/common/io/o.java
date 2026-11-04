package com.google.common.io;

import com.google.common.base.v0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public final class o implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f119039d = new a() { // from class: com.google.common.io.n
        @Override // com.google.common.io.o.a
        public final void a(Closeable closeable, Throwable th2, Throwable th3) {
            o.a(closeable, th2, th3);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final a f119040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Deque<Closeable> f119041b = new ArrayDeque(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private Throwable f119042c;

    @com.google.common.annotations.e
    interface a {
        void a(Closeable closeable, Throwable thrown, Throwable suppressed);
    }

    @com.google.common.annotations.e
    o(a suppressor) {
        this.f119040a = (a) com.google.common.base.j0.E(suppressor);
    }

    public static /* synthetic */ void a(Closeable closeable, Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return;
        }
        try {
            th2.addSuppressed(th3);
        } catch (Throwable unused) {
            m.f119037a.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th3);
        }
    }

    public static o b() {
        return new o(f119039d);
    }

    @z7.a
    @f0
    public <C extends Closeable> C c(@f0 C closeable) {
        if (closeable != null) {
            this.f119041b.addFirst(closeable);
        }
        return closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Throwable th2 = this.f119042c;
        while (!this.f119041b.isEmpty()) {
            Closeable closeableRemoveFirst = this.f119041b.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    this.f119040a.a(closeableRemoveFirst, th2, th3);
                }
            }
        }
        if (this.f119042c != null || th2 == null) {
            return;
        }
        v0.v(th2, IOException.class);
        v0.w(th2);
        throw new AssertionError(th2);
    }

    public RuntimeException d(Throwable e10) throws Throwable {
        com.google.common.base.j0.E(e10);
        this.f119042c = e10;
        v0.v(e10, IOException.class);
        v0.w(e10);
        throw new RuntimeException(e10);
    }

    public <X extends Exception> RuntimeException e(Throwable e10, Class<X> declaredType) throws Exception {
        com.google.common.base.j0.E(e10);
        this.f119042c = e10;
        v0.v(e10, IOException.class);
        v0.v(e10, declaredType);
        v0.w(e10);
        throw new RuntimeException(e10);
    }

    public <X1 extends Exception, X2 extends Exception> RuntimeException f(Throwable e10, Class<X1> declaredType1, Class<X2> declaredType2) throws Exception {
        com.google.common.base.j0.E(e10);
        this.f119042c = e10;
        v0.v(e10, IOException.class);
        v0.v(e10, declaredType1);
        v0.v(e10, declaredType2);
        v0.w(e10);
        throw new RuntimeException(e10);
    }
}
