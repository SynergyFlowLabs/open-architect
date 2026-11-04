package io.grpc.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class u1 implements t0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f289848n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f289849o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte f289850p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte f289851q = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f289852a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r3 f289854c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s3 f289859h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i3 f289860i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f289861j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f289862k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f289864m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f289853b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private io.grpc.s f289855d = io.grpc.p.b.f290837a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f289856e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f289857f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ByteBuffer f289858g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f289863l = -1;

    public interface d {
        void w(@fj.h r3 r3Var, boolean z10, boolean z11, int i10);
    }

    public u1(d dVar, s3 s3Var, i3 i3Var) {
        this.f289852a = (d) com.google.common.base.j0.F(dVar, "sink");
        this.f289859h = (s3) com.google.common.base.j0.F(s3Var, "bufferAllocator");
        this.f289860i = (i3) com.google.common.base.j0.F(i3Var, "statsTraceCtx");
    }

    private void d(boolean z10, boolean z11) {
        r3 r3Var = this.f289854c;
        this.f289854c = null;
        this.f289852a.w(r3Var, z10, z11, this.f289862k);
        this.f289862k = 0;
    }

    private int f(InputStream inputStream) throws IOException {
        if ((inputStream instanceof io.grpc.n1) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void i() {
        r3 r3Var = this.f289854c;
        if (r3Var != null) {
            r3Var.release();
            this.f289854c = null;
        }
    }

    private void l() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void m(b bVar, boolean z10) {
        int iQ0 = bVar.q0();
        int i10 = this.f289853b;
        if (i10 >= 0 && iQ0 > i10) {
            throw io.grpc.y2.f291459n.u(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iQ0), Integer.valueOf(this.f289853b))).e();
        }
        this.f289858g.clear();
        this.f289858g.put(z10 ? (byte) 1 : (byte) 0).putInt(iQ0);
        r3 r3VarA = this.f289859h.a(5);
        r3VarA.write(this.f289858g.array(), 0, this.f289858g.position());
        if (iQ0 == 0) {
            this.f289854c = r3VarA;
            return;
        }
        this.f289852a.w(r3VarA, false, false, this.f289862k - 1);
        this.f289862k = 1;
        List list = bVar.f289865a;
        for (int i11 = 0; i11 < list.size() - 1; i11++) {
            this.f289852a.w((r3) list.get(i11), false, false, 0);
        }
        this.f289854c = (r3) list.get(list.size() - 1);
        this.f289864m = iQ0;
    }

    private int n(InputStream inputStream, int i10) throws IOException {
        b bVar = new b();
        OutputStream outputStreamB = this.f289855d.b(bVar);
        try {
            int iQ = q(inputStream, outputStreamB);
            outputStreamB.close();
            int i11 = this.f289853b;
            if (i11 >= 0 && iQ > i11) {
                throw io.grpc.y2.f291459n.u(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iQ), Integer.valueOf(this.f289853b))).e();
            }
            m(bVar, true);
            return iQ;
        } catch (Throwable th2) {
            outputStreamB.close();
            throw th2;
        }
    }

    private int o(InputStream inputStream, int i10) throws IOException {
        int i11 = this.f289853b;
        if (i11 >= 0 && i10 > i11) {
            throw io.grpc.y2.f291459n.u(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f289853b))).e();
        }
        this.f289858g.clear();
        this.f289858g.put((byte) 0).putInt(i10);
        if (this.f289854c == null) {
            this.f289854c = this.f289859h.a(this.f289858g.position() + i10);
        }
        p(this.f289858g.array(), 0, this.f289858g.position());
        return q(inputStream, this.f289857f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            r3 r3Var = this.f289854c;
            if (r3Var != null && r3Var.a() == 0) {
                d(false, false);
            }
            if (this.f289854c == null) {
                this.f289854c = this.f289859h.a(i11);
            }
            int iMin = Math.min(i11, this.f289854c.a());
            this.f289854c.write(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int q(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof io.grpc.c0) {
            return ((io.grpc.c0) inputStream).a(outputStream);
        }
        long jB = com.google.common.io.h.b(inputStream, outputStream);
        com.google.common.base.j0.p(jB <= androidx.collection.g3.f12256c, "Message size overflow: %s", jB);
        return (int) jB;
    }

    private int r(InputStream inputStream, int i10) throws IOException {
        if (i10 != -1) {
            this.f289864m = i10;
            return o(inputStream, i10);
        }
        b bVar = new b();
        int iQ = q(inputStream, bVar);
        m(bVar, false);
        return iQ;
    }

    @Override // io.grpc.internal.t0
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f289861j = true;
        r3 r3Var = this.f289854c;
        if (r3Var != null && r3Var.q0() == 0) {
            i();
        }
        d(true, true);
    }

    @Override // io.grpc.internal.t0
    public void dispose() {
        this.f289861j = true;
        i();
    }

    @Override // io.grpc.internal.t0
    public void e(int i10) {
        com.google.common.base.j0.h0(this.f289853b == -1, "max size already set");
        this.f289853b = i10;
    }

    @Override // io.grpc.internal.t0
    public void flush() {
        r3 r3Var = this.f289854c;
        if (r3Var != null && r3Var.q0() > 0) {
            d(false, true);
        }
    }

    @Override // io.grpc.internal.t0
    public void h(InputStream inputStream) {
        l();
        this.f289862k++;
        int i10 = this.f289863l + 1;
        this.f289863l = i10;
        this.f289864m = 0L;
        this.f289860i.k(i10);
        boolean z10 = this.f289856e && this.f289855d != io.grpc.p.b.f290837a;
        try {
            int iF = f(inputStream);
            int iR = (iF == 0 || !z10) ? r(inputStream, iF) : n(inputStream, iF);
            if (iF != -1 && iR != iF) {
                throw io.grpc.y2.f291464s.u(String.format("Message length inaccurate %s != %s", Integer.valueOf(iR), Integer.valueOf(iF))).e();
            }
            long j10 = iR;
            this.f289860i.m(j10);
            this.f289860i.n(this.f289864m);
            this.f289860i.l(this.f289863l, this.f289864m, j10);
        } catch (io.grpc.a3 e10) {
            throw e10;
        } catch (IOException e11) {
            throw io.grpc.y2.f291464s.u("Failed to frame message").t(e11).e();
        } catch (RuntimeException e12) {
            throw io.grpc.y2.f291464s.u("Failed to frame message").t(e12).e();
        }
    }

    @Override // io.grpc.internal.t0
    public boolean isClosed() {
        return this.f289861j;
    }

    @Override // io.grpc.internal.t0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public u1 c(io.grpc.s sVar) {
        this.f289855d = (io.grpc.s) com.google.common.base.j0.F(sVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // io.grpc.internal.t0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public u1 g(boolean z10) {
        this.f289856e = z10;
        return this;
    }

    private class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            u1.this.p(bArr, i10, i11);
        }
    }

    private final class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<r3> f289865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r3 f289866b;

        private b() {
            this.f289865a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int q0() {
            Iterator<r3> it = this.f289865a.iterator();
            int iQ0 = 0;
            while (it.hasNext()) {
                iQ0 += it.next().q0();
            }
            return iQ0;
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            r3 r3Var = this.f289866b;
            if (r3Var == null || r3Var.a() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
            } else {
                this.f289866b.b((byte) i10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.f289866b == null) {
                r3 r3VarA = u1.this.f289859h.a(i11);
                this.f289866b = r3VarA;
                this.f289865a.add(r3VarA);
            }
            while (i11 > 0) {
                int iMin = Math.min(i11, this.f289866b.a());
                if (iMin == 0) {
                    r3 r3VarA2 = u1.this.f289859h.a(Math.max(i11, this.f289866b.q0() * 2));
                    this.f289866b = r3VarA2;
                    this.f289865a.add(r3VarA2);
                } else {
                    this.f289866b.write(bArr, i10, iMin);
                    i10 += iMin;
                    i11 -= iMin;
                }
            }
        }
    }
}
