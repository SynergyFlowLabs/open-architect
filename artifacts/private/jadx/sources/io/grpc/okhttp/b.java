package io.grpc.okhttp;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class b implements io.grpc.okhttp.internal.framed.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f290239d = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f290240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.okhttp.internal.framed.c f290241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f290242c = new m(Level.FINE, (Class<?>) l.class);

    interface a {
        void g(Throwable th2);
    }

    b(a aVar, io.grpc.okhttp.internal.framed.c cVar) {
        this.f290240a = (a) com.google.common.base.j0.F(aVar, "transportExceptionHandler");
        this.f290241b = (io.grpc.okhttp.internal.framed.c) com.google.common.base.j0.F(cVar, "frameWriter");
    }

    @com.google.common.annotations.e
    static Level a(Throwable th2) {
        return th2.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void A2() {
        try {
            this.f290241b.A2();
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void C8(boolean z10, int i10, List<io.grpc.okhttp.internal.framed.d> list) {
        try {
            this.f290241b.C8(z10, i10, list);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void Da(io.grpc.okhttp.internal.framed.i iVar) {
        this.f290242c.k(m.a.OUTBOUND);
        try {
            this.f290241b.Da(iVar);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void F9(boolean z10, int i10, okio.l lVar, int i11) {
        this.f290242c.b(m.a.OUTBOUND, i10, lVar.c1(), i11, z10);
        try {
            this.f290241b.F9(z10, i10, lVar, i11);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void M1(int i10, io.grpc.okhttp.internal.framed.a aVar) {
        this.f290242c.i(m.a.OUTBOUND, i10, aVar);
        try {
            this.f290241b.M1(i10, aVar);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void Q(int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) {
        this.f290242c.h(m.a.OUTBOUND, i10, i11, list);
        try {
            this.f290241b.Q(i10, i11, list);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void Q3(io.grpc.okhttp.internal.framed.i iVar) {
        this.f290242c.j(m.a.OUTBOUND, iVar);
        try {
            this.f290241b.Q3(iVar);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public int Tb() {
        return this.f290241b.Tb();
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void U1(int i10, List<io.grpc.okhttp.internal.framed.d> list) {
        this.f290242c.d(m.a.OUTBOUND, i10, list, false);
        try {
            this.f290241b.U1(i10, list);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void W(boolean z10, int i10, int i11) {
        if (z10) {
            this.f290242c.f(m.a.OUTBOUND, (com.rabbitmq.client.k0.f265952a & ((long) i11)) | (((long) i10) << 32));
        } else {
            this.f290242c.e(m.a.OUTBOUND, (com.rabbitmq.client.k0.f265952a & ((long) i11)) | (((long) i10) << 32));
        }
        try {
            this.f290241b.W(z10, i10, i11);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void c0(int i10, long j10) {
        this.f290242c.l(m.a.OUTBOUND, i10, j10);
        try {
            this.f290241b.c0(i10, j10);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f290241b.close();
        } catch (IOException e10) {
            f290239d.log(a(e10), "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void df(boolean z10, boolean z11, int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) {
        try {
            this.f290241b.df(z10, z11, i10, i11, list);
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void flush() {
        try {
            this.f290241b.flush();
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void tf(int i10, io.grpc.okhttp.internal.framed.a aVar, byte[] bArr) {
        this.f290242c.c(m.a.OUTBOUND, i10, aVar, okio.o.l0(bArr));
        try {
            this.f290241b.tf(i10, aVar, bArr);
            this.f290241b.flush();
        } catch (IOException e10) {
            this.f290240a.g(e10);
        }
    }
}
