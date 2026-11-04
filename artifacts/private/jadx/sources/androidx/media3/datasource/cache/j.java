package androidx.media3.datasource.cache;

import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.datasource.w;
import androidx.media3.datasource.x;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f62376k = 131072;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f62377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media3.datasource.cache.a f62378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f62379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f62380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f62381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private final a f62382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f62383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f62384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f62385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f62386j;

    public interface a {
        void a(long j10, long j11, long j12);
    }

    public j(c cVar, x xVar, @p0 byte[] bArr, @p0 a aVar) {
        this.f62377a = cVar;
        this.f62378b = cVar.v();
        this.f62379c = xVar;
        this.f62381e = bArr == null ? new byte[131072] : bArr;
        this.f62382f = aVar;
        this.f62380d = cVar.w().b(xVar);
        this.f62383g = xVar.f62600g;
    }

    private long c() {
        long j10 = this.f62384h;
        if (j10 == -1) {
            return -1L;
        }
        return j10 - this.f62379c.f62600g;
    }

    private void d(long j10) {
        this.f62385i += j10;
        a aVar = this.f62382f;
        if (aVar != null) {
            aVar.a(c(), this.f62385i, j10);
        }
    }

    private void e(long j10) {
        if (this.f62384h == j10) {
            return;
        }
        this.f62384h = j10;
        a aVar = this.f62382f;
        if (aVar != null) {
            aVar.a(c(), this.f62385i, 0L);
        }
    }

    private long f(long j10, long j11) throws Exception {
        long jC;
        boolean z10 = true;
        boolean z11 = j10 + j11 == this.f62384h || j11 == -1;
        if (j11 != -1) {
            try {
                jC = this.f62377a.c(this.f62379c.a().i(j10).h(j11).a());
            } catch (Exception unused) {
                w.a(this.f62377a);
                z10 = false;
                jC = -1;
            }
        } else {
            z10 = false;
            jC = -1;
        }
        if (!z10) {
            g();
            try {
                jC = this.f62377a.c(this.f62379c.a().i(j10).h(-1L).a());
            } catch (Exception e10) {
                w.a(this.f62377a);
                throw e10;
            }
        }
        if (z11 && jC != -1) {
            try {
                e(jC + j10);
            } catch (Exception e11) {
                w.a(this.f62377a);
                throw e11;
            }
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            g();
            c cVar = this.f62377a;
            byte[] bArr = this.f62381e;
            i10 = cVar.read(bArr, 0, bArr.length);
            if (i10 != -1) {
                d(i10);
                i11 += i10;
            }
        }
        if (z11) {
            e(j10 + ((long) i11));
        }
        this.f62377a.close();
        return i11;
    }

    private void g() throws InterruptedIOException {
        if (this.f62386j) {
            throw new InterruptedIOException();
        }
    }

    @m1
    public void a() throws IOException {
        g();
        androidx.media3.datasource.cache.a aVar = this.f62378b;
        String str = this.f62380d;
        x xVar = this.f62379c;
        this.f62385i = aVar.i(str, xVar.f62600g, xVar.f62601h);
        x xVar2 = this.f62379c;
        long j10 = xVar2.f62601h;
        if (j10 != -1) {
            this.f62384h = xVar2.f62600g + j10;
        } else {
            long jF = m.f(this.f62378b.b(this.f62380d));
            if (jF == -1) {
                jF = -1;
            }
            this.f62384h = jF;
        }
        a aVar2 = this.f62382f;
        if (aVar2 != null) {
            aVar2.a(c(), this.f62385i, 0L);
        }
        while (true) {
            long j11 = this.f62384h;
            if (j11 != -1 && this.f62383g >= j11) {
                return;
            }
            g();
            long j12 = this.f62384h;
            long jL = this.f62378b.l(this.f62380d, this.f62383g, j12 == -1 ? Long.MAX_VALUE : j12 - this.f62383g);
            if (jL > 0) {
                this.f62383g += jL;
            } else {
                long j13 = -jL;
                if (j13 == Long.MAX_VALUE) {
                    j13 = -1;
                }
                long j14 = this.f62383g;
                this.f62383g = j14 + f(j14, j13);
            }
        }
    }

    public void b() {
        this.f62386j = true;
    }
}
