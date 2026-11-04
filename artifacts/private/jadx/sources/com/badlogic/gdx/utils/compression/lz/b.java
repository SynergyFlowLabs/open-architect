package com.badlogic.gdx.utils.compression.lz;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f95290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InputStream f95291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f95293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f95294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f95295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f95296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f95297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f95298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f95299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f95300k;

    public void a(int i10, int i11, int i12) {
        this.f95298i = i10;
        this.f95299j = i11;
        int i13 = i10 + i11 + i12;
        if (this.f95290a == null || this.f95296g != i13) {
            b();
            this.f95296g = i13;
            this.f95290a = new byte[i13];
        }
        this.f95294e = this.f95296g - i11;
    }

    void b() {
        this.f95290a = null;
    }

    public byte c(int i10) {
        return this.f95290a[this.f95295f + this.f95297h + i10];
    }

    public int d(int i10, int i11, int i12) {
        if (this.f95293d) {
            int i13 = this.f95297h;
            int i14 = i13 + i10 + i12;
            int i15 = this.f95300k;
            if (i14 > i15) {
                i12 = i15 - (i13 + i10);
            }
        }
        int i16 = i11 + 1;
        int i17 = this.f95295f + this.f95297h + i10;
        int i18 = 0;
        while (i18 < i12) {
            byte[] bArr = this.f95290a;
            int i19 = i17 + i18;
            if (bArr[i19] != bArr[i19 - i16]) {
                break;
            }
            i18++;
        }
        return i18;
    }

    public int e() {
        return this.f95300k - this.f95297h;
    }

    public void f() throws IOException {
        this.f95295f = 0;
        this.f95297h = 0;
        this.f95300k = 0;
        this.f95293d = false;
        i();
    }

    public void g() {
        int i10 = this.f95295f;
        int i11 = (this.f95297h + i10) - this.f95298i;
        if (i11 > 0) {
            i11--;
        }
        int i12 = (i10 + this.f95300k) - i11;
        for (int i13 = 0; i13 < i12; i13++) {
            byte[] bArr = this.f95290a;
            bArr[i13] = bArr[i11 + i13];
        }
        this.f95295f -= i11;
    }

    public void h() throws IOException {
        int i10 = this.f95297h + 1;
        this.f95297h = i10;
        if (i10 > this.f95292c) {
            if (this.f95295f + i10 > this.f95294e) {
                g();
            }
            i();
        }
    }

    public void i() throws IOException {
        if (this.f95293d) {
            return;
        }
        while (true) {
            int i10 = this.f95295f;
            int i11 = (0 - i10) + this.f95296g;
            int i12 = this.f95300k;
            int i13 = i11 - i12;
            if (i13 == 0) {
                return;
            }
            int i14 = this.f95291b.read(this.f95290a, i10 + i12, i13);
            if (i14 == -1) {
                int i15 = this.f95300k;
                this.f95292c = i15;
                int i16 = this.f95295f;
                int i17 = i15 + i16;
                int i18 = this.f95294e;
                if (i17 > i18) {
                    this.f95292c = i18 - i16;
                }
                this.f95293d = true;
                return;
            }
            int i19 = this.f95300k + i14;
            this.f95300k = i19;
            int i20 = this.f95297h;
            int i21 = this.f95299j;
            if (i19 >= i20 + i21) {
                this.f95292c = i19 - i21;
            }
        }
    }

    public void j(int i10) {
        this.f95295f += i10;
        this.f95292c -= i10;
        this.f95297h -= i10;
        this.f95300k -= i10;
    }

    public void k() {
        this.f95291b = null;
    }

    public void l(InputStream inputStream) {
        this.f95291b = inputStream;
    }
}
