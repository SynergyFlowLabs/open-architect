package com.badlogic.gdx.utils.compression;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int[] f95256b = new int[256];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f95257a = -1;

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (i11 & 1) != 0 ? (i11 >>> 1) ^ (-306674912) : i11 >>> 1;
            }
            f95256b[i10] = i11;
        }
    }

    public int a() {
        return ~this.f95257a;
    }

    public void b() {
        this.f95257a = -1;
    }

    public void c(byte[] bArr) {
        for (byte b10 : bArr) {
            int[] iArr = f95256b;
            int i10 = this.f95257a;
            this.f95257a = iArr[(b10 ^ i10) & 255] ^ (i10 >>> 8);
        }
    }

    public void d(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int[] iArr = f95256b;
            int i13 = this.f95257a;
            this.f95257a = iArr[(bArr[i10 + i12] ^ i13) & 255] ^ (i13 >>> 8);
        }
    }

    public void e(int i10) {
        int[] iArr = f95256b;
        int i11 = this.f95257a;
        this.f95257a = iArr[(i10 ^ i11) & 255] ^ (i11 >>> 8);
    }
}
