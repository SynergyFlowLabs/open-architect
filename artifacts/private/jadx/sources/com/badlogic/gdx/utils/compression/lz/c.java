package com.badlogic.gdx.utils.compression.lz;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    byte[] f95301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f95302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f95303c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f95304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OutputStream f95305e;

    public void a(int i10, int i11) throws IOException {
        int i12 = (this.f95302b - i10) - 1;
        if (i12 < 0) {
            i12 += this.f95303c;
        }
        while (i11 != 0) {
            int i13 = this.f95303c;
            if (i12 >= i13) {
                i12 = 0;
            }
            byte[] bArr = this.f95301a;
            int i14 = this.f95302b;
            int i15 = i14 + 1;
            this.f95302b = i15;
            int i16 = i12 + 1;
            bArr[i14] = bArr[i12];
            if (i15 >= i13) {
                c();
            }
            i11--;
            i12 = i16;
        }
    }

    public void b(int i10) {
        if (this.f95301a == null || this.f95303c != i10) {
            this.f95301a = new byte[i10];
        }
        this.f95303c = i10;
        this.f95302b = 0;
        this.f95304d = 0;
    }

    public void c() throws IOException {
        int i10 = this.f95302b;
        int i11 = this.f95304d;
        int i12 = i10 - i11;
        if (i12 == 0) {
            return;
        }
        this.f95305e.write(this.f95301a, i11, i12);
        if (this.f95302b >= this.f95303c) {
            this.f95302b = 0;
        }
        this.f95304d = this.f95302b;
    }

    public byte d(int i10) {
        int i11 = (this.f95302b - i10) - 1;
        if (i11 < 0) {
            i11 += this.f95303c;
        }
        return this.f95301a[i11];
    }

    public void e(boolean z10) {
        if (z10) {
            return;
        }
        this.f95304d = 0;
        this.f95302b = 0;
    }

    public void f(byte b10) throws IOException {
        byte[] bArr = this.f95301a;
        int i10 = this.f95302b;
        int i11 = i10 + 1;
        this.f95302b = i11;
        bArr[i10] = b10;
        if (i11 >= this.f95303c) {
            c();
        }
    }

    public void g() throws IOException {
        c();
        this.f95305e = null;
    }

    public void h(OutputStream outputStream) throws IOException {
        g();
        this.f95305e = outputStream;
    }
}
