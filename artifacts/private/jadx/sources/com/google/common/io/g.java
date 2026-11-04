package com.google.common.io;

import androidx.collection.g3;
import com.google.common.collect.l6;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@r
public abstract class g {

    class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Charset f118987a;

        a(Charset charset) {
            this.f118987a = (Charset) com.google.common.base.j0.E(charset);
        }

        @Override // com.google.common.io.k
        public g a(Charset charset) {
            return charset.equals(this.f118987a) ? g.this : super.a(charset);
        }

        @Override // com.google.common.io.k
        public Reader m() throws IOException {
            return new InputStreamReader(g.this.m(), this.f118987a);
        }

        @Override // com.google.common.io.k
        public String n() throws IOException {
            return new String(g.this.o(), this.f118987a);
        }

        public String toString() {
            return g.this.toString() + ".asCharSource(" + this.f118987a + ")";
        }
    }

    private static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f118989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f118991c;

        b(byte[] bytes) {
            this(bytes, 0, bytes.length);
        }

        @Override // com.google.common.io.g
        public long g(OutputStream output) throws IOException {
            output.write(this.f118989a, this.f118990b, this.f118991c);
            return this.f118991c;
        }

        @Override // com.google.common.io.g
        public com.google.common.hash.p j(com.google.common.hash.q hashFunction) throws IOException {
            return hashFunction.k(this.f118989a, this.f118990b, this.f118991c);
        }

        @Override // com.google.common.io.g
        public boolean k() {
            return this.f118991c == 0;
        }

        @Override // com.google.common.io.g
        public InputStream l() {
            return m();
        }

        @Override // com.google.common.io.g
        public InputStream m() {
            return new ByteArrayInputStream(this.f118989a, this.f118990b, this.f118991c);
        }

        @Override // com.google.common.io.g
        @f0
        public <T> T n(com.google.common.io.e<T> processor) throws IOException {
            processor.a(this.f118989a, this.f118990b, this.f118991c);
            return processor.getResult();
        }

        @Override // com.google.common.io.g
        public byte[] o() {
            byte[] bArr = this.f118989a;
            int i10 = this.f118990b;
            return Arrays.copyOfRange(bArr, i10, this.f118991c + i10);
        }

        @Override // com.google.common.io.g
        public long p() {
            return this.f118991c;
        }

        @Override // com.google.common.io.g
        public com.google.common.base.e0<Long> q() {
            return com.google.common.base.e0.f(Long.valueOf(this.f118991c));
        }

        @Override // com.google.common.io.g
        public g r(long offset, long length) {
            com.google.common.base.j0.p(offset >= 0, "offset (%s) may not be negative", offset);
            com.google.common.base.j0.p(length >= 0, "length (%s) may not be negative", length);
            long jMin = Math.min(offset, this.f118991c);
            return new b(this.f118989a, this.f118990b + ((int) jMin), (int) Math.min(length, ((long) this.f118991c) - jMin));
        }

        public String toString() {
            return "ByteSource.wrap(" + com.google.common.base.c.k(com.google.common.io.b.a().m(this.f118989a, this.f118990b, this.f118991c), 30, "...") + ")";
        }

        b(byte[] bytes, int offset, int length) {
            this.f118989a = bytes;
            this.f118990b = offset;
            this.f118991c = length;
        }
    }

    private static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Iterable<? extends g> f118992a;

        c(Iterable<? extends g> sources) {
            this.f118992a = (Iterable) com.google.common.base.j0.E(sources);
        }

        @Override // com.google.common.io.g
        public boolean k() throws IOException {
            Iterator<? extends g> it = this.f118992a.iterator();
            while (it.hasNext()) {
                if (!it.next().k()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.g
        public InputStream m() throws IOException {
            return new d0(this.f118992a.iterator());
        }

        @Override // com.google.common.io.g
        public long p() throws IOException {
            Iterator<? extends g> it = this.f118992a.iterator();
            long jP = 0;
            while (it.hasNext()) {
                jP += it.next().p();
                if (jP < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return jP;
        }

        @Override // com.google.common.io.g
        public com.google.common.base.e0<Long> q() {
            Iterable<? extends g> iterable = this.f118992a;
            if (!(iterable instanceof Collection)) {
                return com.google.common.base.e0.a();
            }
            Iterator<? extends g> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                com.google.common.base.e0<Long> e0VarQ = it.next().q();
                if (!e0VarQ.e()) {
                    return com.google.common.base.e0.a();
                }
                jLongValue += e0VarQ.d().longValue();
                if (jLongValue < 0) {
                    return com.google.common.base.e0.f(Long.MAX_VALUE);
                }
            }
            return com.google.common.base.e0.f(Long.valueOf(jLongValue));
        }

        public String toString() {
            return "ByteSource.concat(" + this.f118992a + ")";
        }
    }

    private static final class d extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final d f118993d = new d();

        d() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.g
        public k a(Charset charset) {
            com.google.common.base.j0.E(charset);
            return k.h();
        }

        @Override // com.google.common.io.g.b, com.google.common.io.g
        public byte[] o() {
            return this.f118989a;
        }

        @Override // com.google.common.io.g.b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    private final class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f118994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f118995b;

        e(long offset, long length) {
            com.google.common.base.j0.p(offset >= 0, "offset (%s) may not be negative", offset);
            com.google.common.base.j0.p(length >= 0, "length (%s) may not be negative", length);
            this.f118994a = offset;
            this.f118995b = length;
        }

        private InputStream t(InputStream in) throws IOException {
            long j10 = this.f118994a;
            if (j10 > 0) {
                try {
                    if (h.t(in, j10) < this.f118994a) {
                        in.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } catch (Throwable th2) {
                    o oVarB = o.b();
                    oVarB.c(in);
                    try {
                        throw oVarB.d(th2);
                    } catch (Throwable th3) {
                        oVarB.close();
                        throw th3;
                    }
                }
            }
            return h.f(in, this.f118995b);
        }

        @Override // com.google.common.io.g
        public boolean k() throws IOException {
            return this.f118995b == 0 || super.k();
        }

        @Override // com.google.common.io.g
        public InputStream l() throws IOException {
            return t(g.this.l());
        }

        @Override // com.google.common.io.g
        public InputStream m() throws IOException {
            return t(g.this.m());
        }

        @Override // com.google.common.io.g
        public com.google.common.base.e0<Long> q() {
            com.google.common.base.e0<Long> e0VarQ = g.this.q();
            if (!e0VarQ.e()) {
                return com.google.common.base.e0.a();
            }
            long jLongValue = e0VarQ.d().longValue();
            return com.google.common.base.e0.f(Long.valueOf(Math.min(this.f118995b, jLongValue - Math.min(this.f118994a, jLongValue))));
        }

        @Override // com.google.common.io.g
        public g r(long offset, long length) {
            boolean z10 = false;
            com.google.common.base.j0.p(offset >= 0, "offset (%s) may not be negative", offset);
            com.google.common.base.j0.p(length >= 0, "length (%s) may not be negative", length);
            long j10 = this.f118995b - offset;
            return j10 <= 0 ? g.i() : g.this.r(this.f118994a + offset, Math.min(length, j10));
        }

        public String toString() {
            return g.this.toString() + ".slice(" + this.f118994a + ", " + this.f118995b + ")";
        }
    }

    protected g() {
    }

    public static g b(Iterable<? extends g> sources) {
        return new c(sources);
    }

    public static g c(Iterator<? extends g> sources) {
        return b(l6.A(sources));
    }

    public static g d(g... sources) {
        return b(l6.B(sources));
    }

    private long h(InputStream in) throws IOException {
        long j10 = 0;
        while (true) {
            long jT = h.t(in, g3.f12256c);
            if (jT <= 0) {
                return j10;
            }
            j10 += jT;
        }
    }

    public static g i() {
        return d.f118993d;
    }

    public static g s(byte[] b10) {
        return new b(b10);
    }

    public k a(Charset charset) {
        return new a(charset);
    }

    public boolean e(g other) throws IOException {
        int iN;
        com.google.common.base.j0.E(other);
        byte[] bArrD = h.d();
        byte[] bArrD2 = h.d();
        o oVarB = o.b();
        try {
            InputStream inputStream = (InputStream) oVarB.c(m());
            InputStream inputStream2 = (InputStream) oVarB.c(other.m());
            do {
                iN = h.n(inputStream, bArrD, 0, bArrD.length);
                if (iN == h.n(inputStream2, bArrD2, 0, bArrD2.length) && Arrays.equals(bArrD, bArrD2)) {
                }
                oVarB.close();
                return false;
            } while (iN == bArrD.length);
            oVarB.close();
            return true;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    @z7.a
    public long f(f sink) throws IOException {
        com.google.common.base.j0.E(sink);
        o oVarB = o.b();
        try {
            long jB = h.b((InputStream) oVarB.c(m()), (OutputStream) oVarB.c(sink.c()));
            oVarB.close();
            return jB;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    @z7.a
    public long g(OutputStream output) throws IOException {
        com.google.common.base.j0.E(output);
        o oVarB = o.b();
        try {
            long jB = h.b((InputStream) oVarB.c(m()), output);
            oVarB.close();
            return jB;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public com.google.common.hash.p j(com.google.common.hash.q hashFunction) throws IOException {
        com.google.common.hash.r rVarI = hashFunction.i();
        g(com.google.common.hash.o.a(rVarI));
        return rVarI.n();
    }

    public boolean k() throws IOException {
        com.google.common.base.e0<Long> e0VarQ = q();
        if (e0VarQ.e()) {
            return e0VarQ.d().longValue() == 0;
        }
        o oVarB = o.b();
        try {
            boolean z10 = ((InputStream) oVarB.c(m())).read() == -1;
            oVarB.close();
            return z10;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public InputStream l() throws IOException {
        InputStream inputStreamM = m();
        return inputStreamM instanceof BufferedInputStream ? (BufferedInputStream) inputStreamM : new BufferedInputStream(inputStreamM);
    }

    public abstract InputStream m() throws IOException;

    @z7.a
    @f0
    public <T> T n(com.google.common.io.e<T> eVar) throws IOException {
        com.google.common.base.j0.E(eVar);
        o oVarB = o.b();
        try {
            T t10 = (T) h.o((InputStream) oVarB.c(m()), eVar);
            oVarB.close();
            return t10;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public byte[] o() throws IOException {
        o oVarB = o.b();
        try {
            InputStream inputStream = (InputStream) oVarB.c(m());
            com.google.common.base.e0<Long> e0VarQ = q();
            byte[] bArrV = e0VarQ.e() ? h.v(inputStream, e0VarQ.d().longValue()) : h.u(inputStream);
            oVarB.close();
            return bArrV;
        } catch (Throwable th2) {
            try {
                throw oVarB.d(th2);
            } catch (Throwable th3) {
                oVarB.close();
                throw th3;
            }
        }
    }

    public long p() throws IOException {
        com.google.common.base.e0<Long> e0VarQ = q();
        if (e0VarQ.e()) {
            return e0VarQ.d().longValue();
        }
        o oVarB = o.b();
        try {
            long jH = h((InputStream) oVarB.c(m()));
            oVarB.close();
            return jH;
        } catch (IOException unused) {
            oVarB.close();
            o oVarB2 = o.b();
            try {
                long jE = h.e((InputStream) oVarB2.c(m()));
                oVarB2.close();
                return jE;
            } catch (Throwable th2) {
                try {
                    throw oVarB2.d(th2);
                } catch (Throwable th3) {
                    oVarB2.close();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            oVarB.close();
            throw th4;
        }
    }

    public com.google.common.base.e0<Long> q() {
        return com.google.common.base.e0.a();
    }

    public g r(long offset, long length) {
        return new e(offset, length);
    }
}
