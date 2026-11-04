package com.google.zxing.datamatrix.encoder;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes5.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f130415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f130416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.zxing.f f130417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.zxing.f f130418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StringBuilder f130419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f130420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f130421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private k f130422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f130423i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f130415a = sb2.toString();
        this.f130416b = l.FORCE_NONE;
        this.f130419e = new StringBuilder(str.length());
        this.f130421g = -1;
    }

    private int i() {
        return this.f130415a.length() - this.f130423i;
    }

    public int a() {
        return this.f130419e.length();
    }

    public StringBuilder b() {
        return this.f130419e;
    }

    public char c() {
        return this.f130415a.charAt(this.f130420f);
    }

    public char d() {
        return this.f130415a.charAt(this.f130420f);
    }

    public String e() {
        return this.f130415a;
    }

    public int f() {
        return this.f130421g;
    }

    public int g() {
        return i() - this.f130420f;
    }

    public k h() {
        return this.f130422h;
    }

    public boolean j() {
        return this.f130420f < i();
    }

    public void k() {
        this.f130421g = -1;
    }

    public void l() {
        this.f130422h = null;
    }

    public void m(com.google.zxing.f fVar, com.google.zxing.f fVar2) {
        this.f130417c = fVar;
        this.f130418d = fVar2;
    }

    public void n(int i10) {
        this.f130423i = i10;
    }

    public void o(l lVar) {
        this.f130416b = lVar;
    }

    public void p(int i10) {
        this.f130421g = i10;
    }

    public void q() {
        r(a());
    }

    public void r(int i10) {
        k kVar = this.f130422h;
        if (kVar == null || i10 > kVar.b()) {
            this.f130422h = k.o(i10, this.f130416b, this.f130417c, this.f130418d, true);
        }
    }

    public void s(char c10) {
        this.f130419e.append(c10);
    }

    public void t(String str) {
        this.f130419e.append(str);
    }
}
