package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.h;
import com.google.zxing.qrcode.decoder.j;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f130978f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f130979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.zxing.qrcode.decoder.f f130980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f130981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f130982d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f130983e;

    public static boolean f(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public com.google.zxing.qrcode.decoder.f a() {
        return this.f130980b;
    }

    public int b() {
        return this.f130982d;
    }

    public b c() {
        return this.f130983e;
    }

    public h d() {
        return this.f130979a;
    }

    public j e() {
        return this.f130981c;
    }

    public void g(com.google.zxing.qrcode.decoder.f fVar) {
        this.f130980b = fVar;
    }

    public void h(int i10) {
        this.f130982d = i10;
    }

    public void i(b bVar) {
        this.f130983e = bVar;
    }

    public void j(h hVar) {
        this.f130979a = hVar;
    }

    public void k(j jVar) {
        this.f130981c = jVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f130979a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f130980b);
        sb2.append("\n version: ");
        sb2.append(this.f130981c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f130982d);
        if (this.f130983e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f130983e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
