package com.fasterxml.jackson.core.io;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f102413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.fasterxml.jackson.core.e f102414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f102415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final com.fasterxml.jackson.core.util.a f102416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected byte[] f102417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected byte[] f102418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected byte[] f102419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected char[] f102420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected char[] f102421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected char[] f102422j;

    public d(com.fasterxml.jackson.core.util.a aVar, Object obj, boolean z10) {
        this.f102416d = aVar;
        this.f102413a = obj;
        this.f102415c = z10;
    }

    private IllegalArgumentException z() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    protected final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw z();
        }
    }

    protected final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw z();
        }
    }

    public byte[] d() {
        a(this.f102419g);
        byte[] bArrA = this.f102416d.a(3);
        this.f102419g = bArrA;
        return bArrA;
    }

    public byte[] e(int i10) {
        a(this.f102419g);
        byte[] bArrB = this.f102416d.b(3, i10);
        this.f102419g = bArrB;
        return bArrB;
    }

    public char[] f() {
        a(this.f102421i);
        char[] cArrC = this.f102416d.c(1);
        this.f102421i = cArrC;
        return cArrC;
    }

    public char[] g(int i10) {
        a(this.f102422j);
        char[] cArrD = this.f102416d.d(3, i10);
        this.f102422j = cArrD;
        return cArrD;
    }

    public byte[] h() {
        a(this.f102417e);
        byte[] bArrA = this.f102416d.a(0);
        this.f102417e = bArrA;
        return bArrA;
    }

    public byte[] i(int i10) {
        a(this.f102417e);
        byte[] bArrB = this.f102416d.b(0, i10);
        this.f102417e = bArrB;
        return bArrB;
    }

    public char[] j() {
        a(this.f102420h);
        char[] cArrC = this.f102416d.c(0);
        this.f102420h = cArrC;
        return cArrC;
    }

    public char[] k(int i10) {
        a(this.f102420h);
        char[] cArrD = this.f102416d.d(0, i10);
        this.f102420h = cArrD;
        return cArrD;
    }

    public byte[] l() {
        a(this.f102418f);
        byte[] bArrA = this.f102416d.a(1);
        this.f102418f = bArrA;
        return bArrA;
    }

    public byte[] m(int i10) {
        a(this.f102418f);
        byte[] bArrB = this.f102416d.b(1, i10);
        this.f102418f = bArrB;
        return bArrB;
    }

    public com.fasterxml.jackson.core.util.n n() {
        return new com.fasterxml.jackson.core.util.n(this.f102416d);
    }

    public com.fasterxml.jackson.core.e o() {
        return this.f102414b;
    }

    public Object p() {
        return this.f102413a;
    }

    public boolean q() {
        return this.f102415c;
    }

    public void r(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f102419g);
            this.f102419g = null;
            this.f102416d.i(3, bArr);
        }
    }

    public void s(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f102421i);
            this.f102421i = null;
            this.f102416d.j(1, cArr);
        }
    }

    public void t(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f102422j);
            this.f102422j = null;
            this.f102416d.j(3, cArr);
        }
    }

    public void u(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f102417e);
            this.f102417e = null;
            this.f102416d.i(0, bArr);
        }
    }

    public void v(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f102420h);
            this.f102420h = null;
            this.f102416d.j(0, cArr);
        }
    }

    public void w(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f102418f);
            this.f102418f = null;
            this.f102416d.i(1, bArr);
        }
    }

    public void x(com.fasterxml.jackson.core.e eVar) {
        this.f102414b = eVar;
    }

    public d y(com.fasterxml.jackson.core.e eVar) {
        this.f102414b = eVar;
        return this;
    }
}
