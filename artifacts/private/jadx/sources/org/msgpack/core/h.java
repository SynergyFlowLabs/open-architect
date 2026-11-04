package org.msgpack.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f339262a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f339263b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f339264c = new c();

    public static final class a {
        public static final byte A = -42;
        public static final byte B = -41;
        public static final byte C = -40;
        public static final byte D = -39;
        public static final byte E = -38;
        public static final byte F = -37;
        public static final byte G = -36;
        public static final byte H = -35;
        public static final byte I = -34;
        public static final byte J = -33;
        public static final byte K = -32;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte f339265a = -128;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final byte f339266b = -128;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final byte f339267c = -112;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final byte f339268d = -96;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte f339269e = -64;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte f339270f = -63;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final byte f339271g = -62;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final byte f339272h = -61;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final byte f339273i = -60;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte f339274j = -59;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final byte f339275k = -58;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final byte f339276l = -57;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final byte f339277m = -56;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final byte f339278n = -55;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final byte f339279o = -54;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final byte f339280p = -53;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final byte f339281q = -52;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final byte f339282r = -51;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final byte f339283s = -50;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final byte f339284t = -49;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final byte f339285u = -48;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final byte f339286v = -47;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final byte f339287w = -46;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final byte f339288x = -45;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final byte f339289y = -44;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final byte f339290z = -43;

        public static final boolean a(byte b10) {
            int i10 = b10 & 255;
            if (i10 > 127 && i10 < 224) {
                return false;
            }
            return true;
        }

        public static final boolean b(byte b10) {
            return (b10 & K) == -96;
        }

        public static final boolean c(byte b10) {
            return (b10 & (-16)) == -112;
        }

        public static final boolean d(byte b10) {
            return (b10 & (-16)) == -128;
        }

        public static final boolean e(byte b10) {
            return (b10 & K) == -96;
        }

        public static final boolean f(byte b10) {
            return (b10 & K) == -32;
        }

        public static final boolean g(byte b10) {
            return (b10 & (-128)) == 0;
        }
    }

    private h() {
    }

    public static org.msgpack.core.b a() {
        return f339263b.f();
    }

    public static j b(OutputStream outputStream) {
        return f339263b.g(outputStream);
    }

    public static j c(WritableByteChannel writableByteChannel) {
        return f339263b.h(writableByteChannel);
    }

    public static j d(org.msgpack.core.buffer.k kVar) {
        return f339263b.i(kVar);
    }

    public static o e(InputStream inputStream) {
        return f339264c.i(inputStream);
    }

    public static o f(ByteBuffer byteBuffer) {
        return f339264c.j(byteBuffer);
    }

    public static o g(ReadableByteChannel readableByteChannel) {
        return f339264c.k(readableByteChannel);
    }

    public static o h(org.msgpack.core.buffer.j jVar) {
        return f339264c.l(jVar);
    }

    public static o i(byte[] bArr) {
        return f339264c.n(bArr);
    }

    public static o j(byte[] bArr, int i10, int i11) {
        return f339264c.o(bArr, i10, i11);
    }

    public static class b implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f339291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f339292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f339293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f339294d;

        public b() {
            this.f339291a = 512;
            this.f339292b = 8192;
            this.f339293c = 8192;
            this.f339294d = true;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return new b(this);
        }

        public int b() {
            return this.f339292b;
        }

        public int c() {
            return this.f339293c;
        }

        public int d() {
            return this.f339291a;
        }

        public boolean e() {
            return this.f339294d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f339291a == bVar.f339291a && this.f339292b == bVar.f339292b && this.f339293c == bVar.f339293c && this.f339294d == bVar.f339294d;
        }

        public org.msgpack.core.b f() {
            return new org.msgpack.core.b(this);
        }

        public j g(OutputStream outputStream) {
            return i(new org.msgpack.core.buffer.m(outputStream, this.f339293c));
        }

        public j h(WritableByteChannel writableByteChannel) {
            return i(new org.msgpack.core.buffer.e(writableByteChannel, this.f339293c));
        }

        public int hashCode() {
            return (((((this.f339291a * 31) + this.f339292b) * 31) + this.f339293c) * 31) + (this.f339294d ? 1 : 0);
        }

        public j i(org.msgpack.core.buffer.k kVar) {
            return new j(kVar, this);
        }

        public b j(int i10) {
            b bVarClone = clone();
            bVarClone.f339292b = i10;
            return bVarClone;
        }

        public b k(int i10) {
            b bVarClone = clone();
            bVarClone.f339293c = i10;
            return bVarClone;
        }

        public b l(int i10) {
            b bVarClone = clone();
            bVarClone.f339291a = i10;
            return bVarClone;
        }

        public b n(boolean z10) {
            b bVarClone = clone();
            bVarClone.f339294d = z10;
            return bVarClone;
        }

        private b(b bVar) {
            this.f339291a = 512;
            this.f339292b = 8192;
            this.f339293c = 8192;
            this.f339294d = true;
            this.f339291a = bVar.f339291a;
            this.f339292b = bVar.f339292b;
            this.f339293c = bVar.f339293c;
            this.f339294d = bVar.f339294d;
        }
    }

    public static class c implements Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f339295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f339296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CodingErrorAction f339297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CodingErrorAction f339298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f339299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f339300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f339301g;

        public c() {
            this.f339295a = true;
            this.f339296b = true;
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f339297c = codingErrorAction;
            this.f339298d = codingErrorAction;
            this.f339299e = Integer.MAX_VALUE;
            this.f339300f = 8192;
            this.f339301g = 8192;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return new c(this);
        }

        public CodingErrorAction b() {
            return this.f339297c;
        }

        public CodingErrorAction c() {
            return this.f339298d;
        }

        public boolean d() {
            return this.f339296b;
        }

        public boolean e() {
            return this.f339295a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f339295a == cVar.f339295a && this.f339296b == cVar.f339296b && this.f339297c == cVar.f339297c && this.f339298d == cVar.f339298d && this.f339299e == cVar.f339299e && this.f339301g == cVar.f339301g && this.f339300f == cVar.f339300f;
        }

        public int f() {
            return this.f339300f;
        }

        public int g() {
            return this.f339301g;
        }

        public int h() {
            return this.f339299e;
        }

        public int hashCode() {
            int i10 = (((this.f339295a ? 1 : 0) * 31) + (this.f339296b ? 1 : 0)) * 31;
            CodingErrorAction codingErrorAction = this.f339297c;
            int iHashCode = (i10 + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
            CodingErrorAction codingErrorAction2 = this.f339298d;
            return ((((((iHashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.f339299e) * 31) + this.f339300f) * 31) + this.f339301g;
        }

        public o i(InputStream inputStream) {
            return l(new org.msgpack.core.buffer.g(inputStream, this.f339300f));
        }

        public o j(ByteBuffer byteBuffer) {
            return l(new org.msgpack.core.buffer.c(byteBuffer));
        }

        public o k(ReadableByteChannel readableByteChannel) {
            return l(new org.msgpack.core.buffer.d(readableByteChannel, this.f339300f));
        }

        public o l(org.msgpack.core.buffer.j jVar) {
            return new o(jVar, this);
        }

        public o n(byte[] bArr) {
            return l(new org.msgpack.core.buffer.a(bArr));
        }

        public o o(byte[] bArr, int i10, int i11) {
            return l(new org.msgpack.core.buffer.a(bArr, i10, i11));
        }

        public c p(CodingErrorAction codingErrorAction) {
            c cVarClone = clone();
            cVarClone.f339297c = codingErrorAction;
            return cVarClone;
        }

        public c q(CodingErrorAction codingErrorAction) {
            c cVarClone = clone();
            cVarClone.f339298d = codingErrorAction;
            return cVarClone;
        }

        public c r(boolean z10) {
            c cVarClone = clone();
            cVarClone.f339296b = z10;
            return cVarClone;
        }

        public c s(boolean z10) {
            c cVarClone = clone();
            cVarClone.f339295a = z10;
            return cVarClone;
        }

        public c t(int i10) {
            c cVarClone = clone();
            cVarClone.f339300f = i10;
            return cVarClone;
        }

        public c u(int i10) {
            c cVarClone = clone();
            cVarClone.f339301g = i10;
            return cVarClone;
        }

        public c v(int i10) {
            c cVarClone = clone();
            cVarClone.f339299e = i10;
            return cVarClone;
        }

        private c(c cVar) {
            this.f339295a = true;
            this.f339296b = true;
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.f339297c = codingErrorAction;
            this.f339298d = codingErrorAction;
            this.f339299e = Integer.MAX_VALUE;
            this.f339300f = 8192;
            this.f339301g = 8192;
            this.f339295a = cVar.f339295a;
            this.f339296b = cVar.f339296b;
            this.f339297c = cVar.f339297c;
            this.f339298d = cVar.f339298d;
            this.f339299e = cVar.f339299e;
            this.f339300f = cVar.f339300f;
        }
    }
}
