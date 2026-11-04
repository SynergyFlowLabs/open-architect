package androidx.media3.decoder;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.decoder.f;
import androidx.media3.decoder.g;
import androidx.media3.decoder.h;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class j<I extends g, O extends h, E extends f> implements e<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f62711a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f62715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f62716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f62717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f62718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private I f62719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private E f62720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f62721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f62722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f62723m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f62712b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f62724n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f62713c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f62714d = new ArrayDeque<>();

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.v();
        }
    }

    protected j(I[] iArr, O[] oArr) {
        this.f62715e = iArr;
        this.f62717g = iArr.length;
        for (int i10 = 0; i10 < this.f62717g; i10++) {
            ((I[]) this.f62715e)[i10] = i();
        }
        this.f62716f = oArr;
        this.f62718h = oArr.length;
        for (int i11 = 0; i11 < this.f62718h; i11++) {
            ((O[]) this.f62716f)[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f62711a = aVar;
        aVar.start();
    }

    private boolean h() {
        return !this.f62713c.isEmpty() && this.f62718h > 0;
    }

    private boolean m() throws InterruptedException {
        E e10;
        synchronized (this.f62712b) {
            while (!this.f62722l && !h()) {
                try {
                    this.f62712b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f62722l) {
                return false;
            }
            I iRemoveFirst = this.f62713c.removeFirst();
            O[] oArr = this.f62716f;
            int i10 = this.f62718h - 1;
            this.f62718h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f62721k;
            this.f62721k = false;
            if (iRemoveFirst.s()) {
                o10.c(4);
            } else {
                o10.f62708b = iRemoveFirst.f62702f;
                if (iRemoveFirst.t()) {
                    o10.c(androidx.media3.common.j.W0);
                }
                if (!p(iRemoveFirst.f62702f)) {
                    o10.f62710d = true;
                }
                try {
                    e10 = (E) l(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) k(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) k(e12);
                }
                if (e10 != null) {
                    synchronized (this.f62712b) {
                        try {
                            this.f62720j = e10;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return false;
                }
            }
            synchronized (this.f62712b) {
                try {
                    if (this.f62721k) {
                        o10.D();
                    } else if (o10.f62710d) {
                        this.f62723m++;
                        o10.D();
                    } else {
                        o10.f62709c = this.f62723m;
                        this.f62723m = 0;
                        this.f62714d.addLast(o10);
                    }
                    s(iRemoveFirst);
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return true;
        }
    }

    private void q() {
        if (h()) {
            this.f62712b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.f */
    private void r() throws f, E {
        E e10 = this.f62720j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void s(I i10) {
        i10.o();
        I[] iArr = this.f62715e;
        int i11 = this.f62717g;
        this.f62717g = i11 + 1;
        iArr[i11] = i10;
    }

    private void u(O o10) {
        o10.o();
        O[] oArr = this.f62716f;
        int i10 = this.f62718h;
        this.f62718h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    @Override // androidx.media3.decoder.e
    public final void e(long j10) {
        synchronized (this.f62712b) {
            try {
                androidx.media3.common.util.a.i(this.f62717g == this.f62715e.length || this.f62721k);
                this.f62724n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.decoder.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void b(I i10) throws f {
        synchronized (this.f62712b) {
            try {
                r();
                androidx.media3.common.util.a.a(i10 == this.f62719i);
                this.f62713c.addLast(i10);
                q();
                this.f62719i = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.decoder.e
    public final void flush() {
        synchronized (this.f62712b) {
            try {
                this.f62721k = true;
                this.f62723m = 0;
                I i10 = this.f62719i;
                if (i10 != null) {
                    s(i10);
                    this.f62719i = null;
                }
                while (!this.f62713c.isEmpty()) {
                    s(this.f62713c.removeFirst());
                }
                while (!this.f62714d.isEmpty()) {
                    this.f62714d.removeFirst().D();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract I i();

    protected abstract O j();

    protected abstract E k(Throwable th2);

    @p0
    protected abstract E l(I i10, O o10, boolean z10);

    @Override // androidx.media3.decoder.e
    @p0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final I c() throws f {
        I i10;
        synchronized (this.f62712b) {
            r();
            androidx.media3.common.util.a.i(this.f62719i == null);
            int i11 = this.f62717g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f62715e;
                int i12 = i11 - 1;
                this.f62717g = i12;
                i10 = iArr[i12];
            }
            this.f62719i = i10;
        }
        return i10;
    }

    @Override // androidx.media3.decoder.e
    @p0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final O a() throws f {
        synchronized (this.f62712b) {
            try {
                r();
                if (this.f62714d.isEmpty()) {
                    return null;
                }
                return this.f62714d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final boolean p(long j10) {
        boolean z10;
        synchronized (this.f62712b) {
            try {
                long j11 = this.f62724n;
                z10 = j11 == -9223372036854775807L || j10 >= j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // androidx.media3.decoder.e
    @androidx.annotation.i
    public void release() {
        synchronized (this.f62712b) {
            this.f62722l = true;
            this.f62712b.notify();
        }
        try {
            this.f62711a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.i
    public void t(O o10) {
        synchronized (this.f62712b) {
            try {
                u(o10);
                q();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void w(int i10) {
        androidx.media3.common.util.a.i(this.f62717g == this.f62715e.length);
        for (I i11 : this.f62715e) {
            i11.E(i10);
        }
    }
}
