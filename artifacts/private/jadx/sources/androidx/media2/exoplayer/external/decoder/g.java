package androidx.media2.exoplayer.external.decoder;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.decoder.e;
import androidx.media2.exoplayer.external.decoder.f;
import java.lang.Exception;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f53795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f53796b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f53797c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f53798d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f53799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f53800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f53803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E f53804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f53805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53807m;

    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g.this.t();
        }
    }

    protected g(I[] iArr, O[] oArr) {
        this.f53799e = iArr;
        this.f53801g = iArr.length;
        for (int i10 = 0; i10 < this.f53801g; i10++) {
            ((I[]) this.f53799e)[i10] = g();
        }
        this.f53800f = oArr;
        this.f53802h = oArr.length;
        for (int i11 = 0; i11 < this.f53802h; i11++) {
            ((O[]) this.f53800f)[i11] = h();
        }
        a aVar = new a();
        this.f53795a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f53797c.isEmpty() && this.f53802h > 0;
    }

    private boolean k() throws InterruptedException {
        synchronized (this.f53796b) {
            while (!this.f53806l && !f()) {
                try {
                    this.f53796b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f53806l) {
                return false;
            }
            I iRemoveFirst = this.f53797c.removeFirst();
            O[] oArr = this.f53800f;
            int i10 = this.f53802h - 1;
            this.f53802h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f53805k;
            this.f53805k = false;
            if (iRemoveFirst.t()) {
                o10.c(4);
            } else {
                if (iRemoveFirst.s()) {
                    o10.c(Integer.MIN_VALUE);
                }
                try {
                    this.f53804j = (E) j(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e10) {
                    this.f53804j = (E) i(e10);
                } catch (RuntimeException e11) {
                    this.f53804j = (E) i(e11);
                }
                if (this.f53804j != null) {
                    synchronized (this.f53796b) {
                    }
                    return false;
                }
            }
            synchronized (this.f53796b) {
                try {
                    if (this.f53805k) {
                        o10.x();
                    } else if (o10.s()) {
                        this.f53807m++;
                        o10.x();
                    } else {
                        o10.f53794c = this.f53807m;
                        this.f53807m = 0;
                        this.f53798d.addLast(o10);
                    }
                    q(iRemoveFirst);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    private void n() {
        if (f()) {
            this.f53796b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    private void o() throws Exception {
        E e10 = this.f53804j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void q(I inputBuffer) {
        inputBuffer.o();
        I[] iArr = this.f53799e;
        int i10 = this.f53801g;
        this.f53801g = i10 + 1;
        iArr[i10] = inputBuffer;
    }

    private void s(O outputBuffer) {
        outputBuffer.o();
        O[] oArr = this.f53800f;
        int i10 = this.f53802h;
        this.f53802h = i10 + 1;
        oArr[i10] = outputBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (k());
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    public final void flush() {
        synchronized (this.f53796b) {
            try {
                this.f53805k = true;
                this.f53807m = 0;
                I i10 = this.f53803i;
                if (i10 != null) {
                    q(i10);
                    int i11 = 5 << 0;
                    this.f53803i = null;
                }
                while (!this.f53797c.isEmpty()) {
                    q(this.f53797c.removeFirst());
                }
                while (!this.f53798d.isEmpty()) {
                    this.f53798d.removeFirst().x();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract I g();

    protected abstract O h();

    protected abstract E i(Throwable error);

    @p0
    protected abstract E j(I inputBuffer, O outputBuffer, boolean reset);

    @Override // androidx.media2.exoplayer.external.decoder.c
    @p0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I c() throws Exception {
        I i10;
        synchronized (this.f53796b) {
            try {
                o();
                androidx.media2.exoplayer.external.util.a.i(this.f53803i == null);
                int i11 = this.f53801g;
                if (i11 == 0) {
                    i10 = null;
                } else {
                    I[] iArr = this.f53799e;
                    int i12 = i11 - 1;
                    this.f53801g = i12;
                    i10 = iArr[i12];
                }
                this.f53803i = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    @p0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O a() throws Exception {
        synchronized (this.f53796b) {
            try {
                o();
                if (this.f53798d.isEmpty()) {
                    return null;
                }
                return this.f53798d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void b(I inputBuffer) throws Exception {
        synchronized (this.f53796b) {
            o();
            androidx.media2.exoplayer.external.util.a.a(inputBuffer == this.f53803i);
            this.f53797c.addLast(inputBuffer);
            n();
            this.f53803i = null;
        }
    }

    @androidx.annotation.i
    protected void r(O outputBuffer) {
        synchronized (this.f53796b) {
            try {
                s(outputBuffer);
                n();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.decoder.c
    @androidx.annotation.i
    public void release() {
        synchronized (this.f53796b) {
            try {
                this.f53806l = true;
                this.f53796b.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.f53795a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected final void u(int size) {
        androidx.media2.exoplayer.external.util.a.i(this.f53801g == this.f53799e.length);
        for (I i10 : this.f53799e) {
            i10.z(size);
        }
    }
}
