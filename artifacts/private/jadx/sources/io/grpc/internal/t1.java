package io.grpc.internal;

import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;

/* JADX INFO: loaded from: classes13.dex */
@gj.c
public class t1 implements Closeable, b0 {
    private static final int X = 5;
    private static final int Y = 1;
    private static final int Z = 254;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f289808p0 = 2097152;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f289809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f289810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i3 f289811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q3 f289812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.grpc.z f289813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w0 f289814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f289815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f289816h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f289819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w f289820l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f289822n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f289825t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f289817i = e.HEADER;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f289818j = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private w f289821m = new w();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f289823o = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f289824s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f289826v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile boolean f289827w = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f289828a;

        static {
            int[] iArr = new int[e.values().length];
            f289828a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f289828a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void a(k3.a aVar);

        void b(int i10);

        void d(boolean z10);

        void i(Throwable th2);
    }

    private static class c implements k3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InputStream f289829a;

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.k3.a
        @fj.h
        public InputStream next() {
            InputStream inputStream = this.f289829a;
            this.f289829a = null;
            return inputStream;
        }

        private c(InputStream inputStream) {
            this.f289829a = inputStream;
        }
    }

    private enum e {
        HEADER,
        BODY;

        static {
            int i10 = 6 << 0;
        }
    }

    public t1(b bVar, io.grpc.z zVar, int i10, i3 i3Var, q3 q3Var) {
        this.f289809a = (b) com.google.common.base.j0.F(bVar, "sink");
        this.f289813e = (io.grpc.z) com.google.common.base.j0.F(zVar, "decompressor");
        this.f289810b = i10;
        this.f289811c = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
        this.f289812d = (q3) com.google.common.base.j0.F(q3Var, "transportTracer");
    }

    private void a() {
        if (this.f289823o) {
            return;
        }
        this.f289823o = true;
        while (!this.f289827w && this.f289822n > 0 && t()) {
            try {
                int i10 = a.f289828a[this.f289817i.ordinal()];
                if (i10 == 1) {
                    r();
                } else {
                    if (i10 != 2) {
                        throw new AssertionError("Invalid state: " + this.f289817i);
                    }
                    q();
                    this.f289822n--;
                }
            } catch (Throwable th2) {
                this.f289823o = false;
                throw th2;
            }
        }
        if (this.f289827w) {
            close();
            this.f289823o = false;
        } else {
            if (this.f289826v && o()) {
                close();
            }
            this.f289823o = false;
        }
    }

    private InputStream c() {
        io.grpc.z zVar = this.f289813e;
        if (zVar == io.grpc.p.b.f290837a) {
            throw io.grpc.y2.f291464s.u("Can't decode compressed gRPC message as compression not configured").e();
        }
        try {
            return new d(zVar.a(j2.c(this.f289820l, true)), this.f289810b, this.f289811c);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private InputStream e() {
        this.f289811c.g(this.f289820l.q0());
        return j2.c(this.f289820l, true);
    }

    private boolean m() {
        return isClosed() || this.f289826v;
    }

    private boolean o() {
        w0 w0Var = this.f289814f;
        if (w0Var != null) {
            return w0Var.x();
        }
        return this.f289821m.q0() == 0;
    }

    private void q() {
        this.f289811c.f(this.f289824s, this.f289825t, -1L);
        this.f289825t = 0;
        InputStream inputStreamC = this.f289819k ? c() : e();
        this.f289820l.x4();
        this.f289820l = null;
        this.f289809a.a(new c(inputStreamC, null));
        this.f289817i = e.HEADER;
        this.f289818j = 5;
    }

    private void r() {
        int unsignedByte = this.f289820l.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw io.grpc.y2.f291464s.u("gRPC frame header malformed: reserved bits not zero").e();
        }
        this.f289819k = (unsignedByte & 1) != 0;
        int i10 = this.f289820l.readInt();
        this.f289818j = i10;
        if (i10 < 0 || i10 > this.f289810b) {
            throw io.grpc.y2.f291459n.u(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f289810b), Integer.valueOf(this.f289818j))).e();
        }
        int i11 = this.f289824s + 1;
        this.f289824s = i11;
        this.f289811c.e(i11);
        this.f289812d.e();
        this.f289817i = e.BODY;
    }

    private boolean t() throws Throwable {
        int iM;
        int i10 = 0;
        try {
            if (this.f289820l == null) {
                this.f289820l = new w();
            }
            int iL = 0;
            iM = 0;
            while (true) {
                try {
                    int iQ0 = this.f289818j - this.f289820l.q0();
                    if (iQ0 <= 0) {
                        if (iL > 0) {
                            this.f289809a.b(iL);
                            if (this.f289817i == e.BODY) {
                                if (this.f289814f != null) {
                                    this.f289811c.h(iM);
                                    this.f289825t += iM;
                                    return true;
                                }
                                this.f289811c.h(iL);
                                this.f289825t += iL;
                            }
                        }
                        return true;
                    }
                    if (this.f289814f != null) {
                        try {
                            try {
                                byte[] bArr = this.f289815g;
                                if (bArr == null || this.f289816h == bArr.length) {
                                    this.f289815g = new byte[Math.min(iQ0, 2097152)];
                                    this.f289816h = 0;
                                }
                                int iR = this.f289814f.r(this.f289815g, this.f289816h, Math.min(iQ0, this.f289815g.length - this.f289816h));
                                iL += this.f289814f.l();
                                iM += this.f289814f.m();
                                if (iR == 0) {
                                    if (iL > 0) {
                                        this.f289809a.b(iL);
                                        if (this.f289817i == e.BODY) {
                                            if (this.f289814f != null) {
                                                this.f289811c.h(iM);
                                                this.f289825t += iM;
                                                return false;
                                            }
                                            this.f289811c.h(iL);
                                            this.f289825t += iL;
                                        }
                                    }
                                    return false;
                                }
                                this.f289820l.b(j2.i(this.f289815g, this.f289816h, iR));
                                this.f289816h += iR;
                            } catch (DataFormatException e10) {
                                throw new RuntimeException(e10);
                            }
                        } catch (IOException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        if (this.f289821m.q0() == 0) {
                            if (iL > 0) {
                                this.f289809a.b(iL);
                                if (this.f289817i == e.BODY) {
                                    if (this.f289814f != null) {
                                        this.f289811c.h(iM);
                                        this.f289825t += iM;
                                        return false;
                                    }
                                    this.f289811c.h(iL);
                                    this.f289825t += iL;
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(iQ0, this.f289821m.q0());
                        iL += iMin;
                        this.f289820l.b(this.f289821m.l2(iMin));
                    }
                } catch (Throwable th2) {
                    int i11 = iL;
                    th = th2;
                    i10 = i11;
                    if (i10 > 0) {
                        this.f289809a.b(i10);
                        if (this.f289817i == e.BODY) {
                            if (this.f289814f != null) {
                                this.f289811c.h(iM);
                                this.f289825t += iM;
                            } else {
                                this.f289811c.h(i10);
                                this.f289825t += i10;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            iM = 0;
        }
    }

    @Override // io.grpc.internal.b0
    public void b(int i10) {
        com.google.common.base.j0.e(i10 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f289822n += (long) i10;
        a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.b0
    public void close() {
        if (isClosed()) {
            return;
        }
        w wVar = this.f289820l;
        boolean z10 = wVar != null && wVar.q0() > 0;
        try {
            w0 w0Var = this.f289814f;
            if (w0Var != null) {
                boolean z11 = z10 || w0Var.o();
                this.f289814f.close();
                z10 = z11;
            }
            w wVar2 = this.f289821m;
            if (wVar2 != null) {
                wVar2.close();
            }
            w wVar3 = this.f289820l;
            if (wVar3 != null) {
                wVar3.close();
            }
            this.f289814f = null;
            this.f289821m = null;
            this.f289820l = null;
            this.f289809a.d(z10);
        } catch (Throwable th2) {
            this.f289814f = null;
            this.f289821m = null;
            this.f289820l = null;
            throw th2;
        }
    }

    @Override // io.grpc.internal.b0
    public void d(int i10) {
        this.f289810b = i10;
    }

    @Override // io.grpc.internal.b0
    public void f(io.grpc.z zVar) {
        com.google.common.base.j0.h0(this.f289814f == null, "Already set full stream decompressor");
        this.f289813e = (io.grpc.z) com.google.common.base.j0.F(zVar, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.b0
    public void g(i2 i2Var) throws Throwable {
        com.google.common.base.j0.F(i2Var, "data");
        boolean z10 = true;
        try {
            if (m()) {
                i2Var.close();
                return;
            }
            w0 w0Var = this.f289814f;
            if (w0Var != null) {
                w0Var.h(i2Var);
            } else {
                this.f289821m.b(i2Var);
            }
            try {
                a();
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                if (z10) {
                    i2Var.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.grpc.internal.b0
    public void h(w0 w0Var) {
        com.google.common.base.j0.h0(this.f289813e == io.grpc.p.b.f290837a, "per-message decompressor already set");
        com.google.common.base.j0.h0(this.f289814f == null, "full stream decompressor already set");
        this.f289814f = (w0) com.google.common.base.j0.F(w0Var, "Can't pass a null full stream decompressor");
        this.f289821m = null;
    }

    public boolean isClosed() {
        return this.f289821m == null && this.f289814f == null;
    }

    @Override // io.grpc.internal.b0
    public void j() {
        if (isClosed()) {
            return;
        }
        if (o()) {
            close();
        } else {
            this.f289826v = true;
        }
    }

    boolean l() {
        return this.f289822n != 0;
    }

    void x(b bVar) {
        this.f289809a = bVar;
    }

    void y() {
        this.f289827w = true;
    }

    @com.google.common.annotations.e
    static final class d extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f289830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i3 f289831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f289832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f289833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f289834e;

        d(InputStream inputStream, int i10, i3 i3Var) {
            super(inputStream);
            this.f289834e = -1L;
            this.f289830a = i10;
            this.f289831b = i3Var;
        }

        private void a() {
            long j10 = this.f289833d;
            long j11 = this.f289832c;
            if (j10 > j11) {
                this.f289831b.g(j10 - j11);
                this.f289832c = this.f289833d;
            }
        }

        private void b() {
            if (this.f289833d <= this.f289830a) {
                return;
            }
            throw io.grpc.y2.f291459n.u("Decompressed gRPC message exceeds maximum size " + this.f289830a).e();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            try {
                ((FilterInputStream) this).in.mark(i10);
                this.f289834e = this.f289833d;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f289833d++;
            }
            b();
            a();
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            try {
                if (!((FilterInputStream) this).in.markSupported()) {
                    throw new IOException("Mark not supported");
                }
                if (this.f289834e == -1) {
                    throw new IOException("Mark not set");
                }
                ((FilterInputStream) this).in.reset();
                this.f289833d = this.f289834e;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j10);
            this.f289833d += jSkip;
            b();
            a();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f289833d += (long) i12;
            }
            b();
            a();
            return i12;
        }
    }
}
