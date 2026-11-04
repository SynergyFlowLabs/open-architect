package com.davidehrmann.vcdiff.engine;

import com.rabbitmq.client.k0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class j implements com.davidehrmann.vcdiff.a<OutputStream> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final org.slf4j.c f97869o = org.slf4j.e.k(j.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final byte[] f97870p = {org.msgpack.core.h.a.A, org.msgpack.core.h.a.f339272h, org.msgpack.core.h.a.f339273i, 0, 0};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final byte[] f97871q = {org.msgpack.core.h.a.A, org.msgpack.core.h.a.f339272h, org.msgpack.core.h.a.f339273i, 83, 0};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final int f97872r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f97873s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int f97874t = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.davidehrmann.vcdiff.mina_buffer.d f97876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.davidehrmann.vcdiff.mina_buffer.d f97877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.davidehrmann.vcdiff.mina_buffer.d f97878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.davidehrmann.vcdiff.mina_buffer.d f97879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.davidehrmann.vcdiff.mina_buffer.d f97880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f97881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f97882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f97883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f97884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private n f97885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f97886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f97887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f97888n;

    public j(boolean z10) {
        this.f97876b = com.davidehrmann.vcdiff.mina_buffer.d.b(1024);
        com.davidehrmann.vcdiff.mina_buffer.d dVarB = com.davidehrmann.vcdiff.mina_buffer.d.b(1024);
        this.f97878d = dVarB;
        com.davidehrmann.vcdiff.mina_buffer.d dVarB2 = com.davidehrmann.vcdiff.mina_buffer.d.b(1024);
        this.f97880f = dVarB2;
        this.f97875a = f.f();
        this.f97882h = 0;
        this.f97883i = 0;
        this.f97884j = h.Y;
        this.f97885k = null;
        int i10 = 4 ^ (-1);
        this.f97886l = -1;
        this.f97887m = false;
        this.f97888n = 0L;
        this.f97881g = new g();
        this.f97876b.J2(true);
        dVarB.J2(true);
        dVarB2.J2(true);
        f(z10);
    }

    private int a() {
        int iA = com.davidehrmann.vcdiff.util.b.a(this.f97883i) + 1 + com.davidehrmann.vcdiff.util.b.a(this.f97878d.n1()) + com.davidehrmann.vcdiff.util.b.a(this.f97876b.n1()) + com.davidehrmann.vcdiff.util.b.a(this.f97880f.n1()) + this.f97878d.n1() + this.f97876b.n1() + this.f97880f.n1();
        return this.f97887m ? iA + com.davidehrmann.vcdiff.util.b.b(this.f97888n) : iA;
    }

    private void b(byte b10, int i10) {
        c(b10, i10, (byte) 0);
    }

    private void c(byte b10, int i10, byte b11) {
        short sB;
        short sC;
        if (this.f97885k == null) {
            throw new IllegalStateException("encodeInstruction() called without calling init()");
        }
        int i11 = this.f97886l;
        if (i11 >= 0) {
            byte bW = this.f97876b.W(i11);
            if (b10 == 1 && this.f97884j.f97856a[bW & 255] == 1) {
                f97869o.m0("encodeInstruction() called for two ADD instructions in a row");
            }
            if (i10 <= 255 && (sC = this.f97885k.c(bW, b10, (byte) i10, b11)) != 256) {
                this.f97876b.s1(this.f97886l, (byte) sC);
                this.f97886l = -1;
                return;
            }
            short sC2 = this.f97885k.c(bW, b10, (byte) 0, b11);
            if (sC2 != 256) {
                this.f97876b.s1(this.f97886l, (byte) sC2);
                this.f97886l = -1;
                this.f97876b.L(com.davidehrmann.vcdiff.util.b.a(i10));
                com.davidehrmann.vcdiff.util.b.e(this.f97876b.x(), i10);
                return;
            }
        }
        if (i10 <= 255 && (sB = this.f97885k.b(b10, (byte) i10, b11)) != 256) {
            this.f97876b.r1((byte) sB);
            this.f97886l = this.f97876b.n1() - 1;
            return;
        }
        short sB2 = this.f97885k.b(b10, (byte) 0, b11);
        if (sB2 == 256) {
            throw new IllegalStateException(String.format("No matching opcode found for inst %d, mode %d, size 0", Byte.valueOf(b10), Byte.valueOf(b11)));
        }
        this.f97876b.r1((byte) sB2);
        this.f97886l = this.f97876b.n1() - 1;
        this.f97876b.L(com.davidehrmann.vcdiff.util.b.a(i10));
        com.davidehrmann.vcdiff.util.b.e(this.f97876b.x(), i10);
    }

    @Override // com.davidehrmann.vcdiff.a
    public void P0(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length || i11 < 0) {
            throw new IllegalArgumentException();
        }
        b((byte) 1, i11);
        this.f97877c.w1(bArr, i10, i11);
        this.f97883i += i11;
    }

    @Override // com.davidehrmann.vcdiff.a
    public void R0(int i10, int i11) {
        if (this.f97885k == null) {
            throw new IllegalStateException("copy called without calling init().");
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        byte bG = (byte) this.f97881g.g(i10, this.f97882h + this.f97883i, atomicInteger);
        c((byte) 3, i11, bG);
        if (this.f97881g.p(bG)) {
            this.f97879e.L(com.davidehrmann.vcdiff.util.b.a(atomicInteger.get()));
            com.davidehrmann.vcdiff.util.b.e(this.f97879e.x(), atomicInteger.get());
        } else {
            this.f97879e.r1((byte) atomicInteger.get());
        }
        this.f97883i += i11;
    }

    @Override // com.davidehrmann.vcdiff.a
    public void S0(int i10) {
        this.f97887m = true;
        this.f97888n = ((long) i10) & k0.f265952a;
    }

    @Override // com.davidehrmann.vcdiff.a
    public void T0(int i10, byte b10) {
        b((byte) 2, i10);
        this.f97877c.r1(b10);
        this.f97883i += i10;
    }

    @Override // com.davidehrmann.vcdiff.a
    public void W0(int i10) {
        this.f97882h = i10;
        if (this.f97885k == null) {
            if (this.f97884j == h.Y) {
                this.f97885k = n.f97927c;
            } else {
                this.f97885k = new n(this.f97884j, (byte) this.f97875a);
            }
        }
        this.f97881g.i();
        this.f97883i = 0;
        this.f97886l = -1;
    }

    @Override // com.davidehrmann.vcdiff.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void Q0(OutputStream outputStream) throws IOException {
    }

    public int e() {
        int iA = a();
        return iA + 1 + com.davidehrmann.vcdiff.util.b.a(this.f97882h) + com.davidehrmann.vcdiff.util.b.a(0) + com.davidehrmann.vcdiff.util.b.a(iA);
    }

    void f(boolean z10) {
        if (!z10) {
            this.f97877c = this.f97878d;
            this.f97879e = this.f97880f;
        } else {
            com.davidehrmann.vcdiff.mina_buffer.d dVar = this.f97876b;
            this.f97877c = dVar;
            this.f97879e = dVar;
        }
    }

    @Override // com.davidehrmann.vcdiff.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void V0(OutputStream outputStream) throws IOException {
        if (this.f97876b.n1() == 0) {
            f97869o.m0("Empty input; no delta window produced");
        } else {
            b5.a aVar = new b5.a(outputStream);
            if (this.f97887m) {
                aVar.write(5);
            } else {
                aVar.write(1);
            }
            com.davidehrmann.vcdiff.util.b.g(aVar, this.f97882h);
            com.davidehrmann.vcdiff.util.b.g(aVar, 0);
            int iA = a();
            com.davidehrmann.vcdiff.util.b.g(aVar, iA);
            int iA2 = (int) aVar.a();
            com.davidehrmann.vcdiff.util.b.g(aVar, this.f97883i);
            aVar.write(0);
            com.davidehrmann.vcdiff.util.b.g(aVar, this.f97878d.n1());
            com.davidehrmann.vcdiff.util.b.g(aVar, this.f97876b.n1());
            com.davidehrmann.vcdiff.util.b.g(aVar, this.f97880f.n1());
            if (this.f97887m) {
                com.davidehrmann.vcdiff.util.b.h(aVar, this.f97888n);
            }
            aVar.write(this.f97878d.k(), this.f97878d.l(), this.f97878d.n1());
            aVar.write(this.f97876b.k(), this.f97876b.l(), this.f97876b.n1());
            aVar.write(this.f97880f.k(), this.f97880f.l(), this.f97880f.n1());
            int iA3 = ((int) aVar.a()) - iA2;
            if (iA != iA3) {
                throw new IllegalStateException(String.format("Internal error: calculated length of the delta encoding (%d) does not match actual length (%d)", Integer.valueOf(iA), Integer.valueOf(iA3)));
            }
            this.f97878d.E();
            this.f97876b.E();
            this.f97880f.E();
            if (this.f97883i == 0) {
                f97869o.m0("Empty target window");
            }
        }
        W0(this.f97882h);
    }

    public int h() {
        return this.f97883i;
    }

    @Override // com.davidehrmann.vcdiff.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void U0(OutputStream outputStream, EnumSet<com.davidehrmann.vcdiff.f> enumSet) throws IOException {
        if (enumSet.isEmpty()) {
            outputStream.write(f97870p);
        } else {
            outputStream.write(f97871q);
        }
    }

    j(boolean z10, short s10, short s11, h hVar, short s12) {
        this.f97876b = com.davidehrmann.vcdiff.mina_buffer.d.b(1024);
        this.f97878d = com.davidehrmann.vcdiff.mina_buffer.d.b(1024);
        this.f97880f = com.davidehrmann.vcdiff.mina_buffer.d.b(1024);
        this.f97881g = new g(s10, s11);
        this.f97882h = 0;
        this.f97883i = 0;
        this.f97884j = hVar;
        this.f97885k = null;
        this.f97886l = -1;
        this.f97887m = false;
        this.f97888n = 0L;
        this.f97875a = s12;
        f(z10);
    }
}
