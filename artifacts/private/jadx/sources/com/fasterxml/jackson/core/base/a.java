package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.h;
import com.fasterxml.jackson.core.json.e;
import com.fasterxml.jackson.core.json.f;
import com.fasterxml.jackson.core.m;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.s;
import com.fasterxml.jackson.core.u;
import com.fasterxml.jackson.core.v;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f102232g = 55296;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f102233h = 56319;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f102234i = 56320;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f102235j = 57343;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final int f102236k = (h.b.WRITE_NUMBERS_AS_STRINGS.o() | h.b.ESCAPE_NON_ASCII.o()) | h.b.STRICT_DUPLICATE_DETECTION.o();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f102237l = "write a binary value";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final String f102238m = "write a boolean value";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final String f102239n = "write a null";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f102240o = "write a number";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final String f102241s = "write a raw (unencoded) value";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final String f102242t = "write a string";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f102243v = 9999;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected q f102244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f102245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f102246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f102247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f102248f;

    protected a(int i10, q qVar) {
        this.f102245c = i10;
        this.f102244b = qVar;
        this.f102247e = e.w(h.b.STRICT_DUPLICATE_DETECTION.n(i10) ? com.fasterxml.jackson.core.json.b.f(this) : null);
        this.f102246d = h.b.WRITE_NUMBERS_AS_STRINGS.n(i10);
    }

    @Override // com.fasterxml.jackson.core.h
    public void B1(s sVar) throws IOException {
        E1(sVar.getValue());
    }

    @Override // com.fasterxml.jackson.core.h
    public q E() {
        return this.f102244b;
    }

    @Override // com.fasterxml.jackson.core.h
    public Object H() {
        return this.f102247e.c();
    }

    @Override // com.fasterxml.jackson.core.h
    public int I() {
        return this.f102245c;
    }

    @Override // com.fasterxml.jackson.core.h
    public h O0() {
        return d0() != null ? this : B0(v3());
    }

    @Override // com.fasterxml.jackson.core.h
    public void O2(s sVar) throws IOException {
        y3("write raw value");
        E2(sVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public void Q2(String str) throws IOException {
        y3("write raw value");
        G2(str);
    }

    @Override // com.fasterxml.jackson.core.h
    public void R2(String str, int i10, int i11) throws IOException {
        y3("write raw value");
        J2(str, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public void T2(char[] cArr, int i10, int i11) throws IOException {
        y3("write raw value");
        L2(cArr, i10, i11);
    }

    @Override // com.fasterxml.jackson.core.h
    public m X() {
        return this.f102247e;
    }

    @Override // com.fasterxml.jackson.core.h
    public void Y2(Object obj) throws IOException {
        X2();
        e eVar = this.f102247e;
        if (eVar != null && obj != null) {
            eVar.p(obj);
        }
        w0(obj);
    }

    @Override // com.fasterxml.jackson.core.h
    public void Z2(s sVar) throws IOException {
        e3(sVar.getValue());
    }

    @Override // com.fasterxml.jackson.core.h
    public int b1(com.fasterxml.jackson.core.a aVar, InputStream inputStream, int i10) throws IOException {
        b();
        return 0;
    }

    @Override // com.fasterxml.jackson.core.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f102248f = true;
    }

    @Override // com.fasterxml.jackson.core.h, java.io.Flushable
    public abstract void flush() throws IOException;

    @Override // com.fasterxml.jackson.core.h
    public final boolean g0(h.b bVar) {
        return (this.f102245c & bVar.o()) != 0;
    }

    @Override // com.fasterxml.jackson.core.h
    public boolean isClosed() {
        return this.f102248f;
    }

    @Override // com.fasterxml.jackson.core.h
    public h k0(int i10, int i11) {
        int i12 = this.f102245c;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.f102245c = i13;
            t3(i13, i14);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    public void k3(u uVar) throws IOException {
        if (uVar == null) {
            J1();
            return;
        }
        q qVar = this.f102244b;
        if (qVar == null) {
            throw new IllegalStateException("No ObjectCodec defined");
        }
        qVar.o(this, uVar);
    }

    @Override // com.fasterxml.jackson.core.h
    public h r0(q qVar) {
        this.f102244b = qVar;
        return this;
    }

    protected String s3(BigDecimal bigDecimal) throws IOException {
        if (!h.b.WRITE_BIGDECIMAL_AS_PLAIN.n(this.f102245c)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    @Override // com.fasterxml.jackson.core.h
    public h t(h.b bVar) {
        int iO = bVar.o();
        this.f102245c &= ~iO;
        if ((iO & f102236k) != 0) {
            if (bVar == h.b.WRITE_NUMBERS_AS_STRINGS) {
                this.f102246d = false;
                return this;
            }
            if (bVar == h.b.ESCAPE_NON_ASCII) {
                y0(0);
                return this;
            }
            if (bVar == h.b.STRICT_DUPLICATE_DETECTION) {
                this.f102247e = this.f102247e.A(null);
            }
        }
        return this;
    }

    protected void t3(int i10, int i11) {
        if ((f102236k & i11) == 0) {
            return;
        }
        this.f102246d = h.b.WRITE_NUMBERS_AS_STRINGS.n(i10);
        h.b bVar = h.b.ESCAPE_NON_ASCII;
        if (bVar.n(i11)) {
            if (bVar.n(i10)) {
                y0(127);
            } else {
                y0(0);
            }
        }
        h.b bVar2 = h.b.STRICT_DUPLICATE_DETECTION;
        if (bVar2.n(i11)) {
            if (!bVar2.n(i10)) {
                this.f102247e = this.f102247e.A(null);
            } else if (this.f102247e.x() == null) {
                this.f102247e = this.f102247e.A(com.fasterxml.jackson.core.json.b.f(this));
            }
        }
    }

    protected r v3() {
        return new com.fasterxml.jackson.core.util.e();
    }

    @Override // com.fasterxml.jackson.core.h, com.fasterxml.jackson.core.w
    public v version() {
        return f.f102565a;
    }

    @Override // com.fasterxml.jackson.core.h
    public void w0(Object obj) {
        this.f102247e.p(obj);
    }

    protected final int w3(int i10, int i11) throws IOException {
        if (i11 < 56320 || i11 > 57343) {
            a("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11));
        }
        return ((i10 - f102232g) << 10) + 65536 + (i11 - 56320);
    }

    @Override // com.fasterxml.jackson.core.h
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            J1();
            return;
        }
        q qVar = this.f102244b;
        if (qVar != null) {
            qVar.o(this, obj);
        } else {
            e(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public h x(h.b bVar) {
        int iO = bVar.o();
        this.f102245c |= iO;
        if ((iO & f102236k) != 0) {
            if (bVar == h.b.WRITE_NUMBERS_AS_STRINGS) {
                this.f102246d = true;
                return this;
            }
            if (bVar == h.b.ESCAPE_NON_ASCII) {
                y0(127);
                return this;
            }
            if (bVar == h.b.STRICT_DUPLICATE_DETECTION && this.f102247e.x() == null) {
                this.f102247e = this.f102247e.A(com.fasterxml.jackson.core.json.b.f(this));
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.h
    @Deprecated
    public h x0(int i10) {
        int i11 = this.f102245c ^ i10;
        this.f102245c = i10;
        if (i11 != 0) {
            t3(i10, i11);
        }
        return this;
    }

    protected abstract void x3();

    protected abstract void y3(String str) throws IOException;

    protected a(int i10, q qVar, e eVar) {
        this.f102245c = i10;
        this.f102244b = qVar;
        this.f102247e = eVar;
        this.f102246d = h.b.WRITE_NUMBERS_AS_STRINGS.n(i10);
    }
}
