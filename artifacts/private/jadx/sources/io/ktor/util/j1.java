package io.ktor.util;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j1 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f296683a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f296685c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f296684b = new byte[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final int[] f296686d = new int[80];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f296687e = 1732584193;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f296688f = -271733879;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f296689g = -1732584194;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f296690h = 271733878;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f296691i = -1009589776;

    private final void b(byte[] bArr, int i10) {
        int i11;
        int iD;
        int i12;
        int[] iArr = this.f296686d;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= 16) {
                break;
            }
            int i15 = i10 + 3;
            int i16 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
            i10 += 4;
            iArr[i14] = i16 | (bArr[i15] & 255);
            i14++;
        }
        for (i11 = 16; i11 < 80; i11++) {
            iArr[i11] = u0.d(((iArr[i11 - 3] ^ iArr[i11 - 8]) ^ iArr[i11 - 14]) ^ iArr[i11 - 16], 1);
        }
        int i17 = this.f296687e;
        int i18 = this.f296688f;
        int iD2 = this.f296689g;
        int i19 = this.f296690h;
        int i20 = this.f296691i;
        while (i13 < 80) {
            if (i13 < 20) {
                iD = u0.d(i17, 5) + (((iD2 ^ i19) & i18) ^ i19) + i20 + 1518500249;
                i12 = iArr[i13];
            } else if (i13 < 40) {
                iD = u0.d(i17, 5) + ((i18 ^ iD2) ^ i19) + i20 + 1859775393;
                i12 = iArr[i13];
            } else if (i13 < 60) {
                iD = ((u0.d(i17, 5) + (((iD2 | i19) & i18) | (iD2 & i19))) + i20) - 1894007588;
                i12 = iArr[i13];
            } else {
                iD = ((u0.d(i17, 5) + ((i18 ^ iD2) ^ i19)) + i20) - 899497514;
                i12 = iArr[i13];
            }
            int i21 = iD + i12;
            i13++;
            i20 = i19;
            i19 = iD2;
            iD2 = u0.d(i18, 30);
            i18 = i17;
            i17 = i21;
        }
        this.f296687e += i17;
        this.f296688f += i18;
        this.f296689g += iD2;
        this.f296690h += i19;
        this.f296691i += i20;
    }

    private final void c() {
        this.f296683a = 0L;
        ArraysKt.fill$default(this.f296684b, (byte) 0, 0, 0, 6, (Object) null);
        this.f296685c = 0;
        ArraysKt.fill$default(this.f296686d, 0, 0, 0, 6, (Object) null);
        this.f296687e = 1732584193;
        this.f296688f = -271733879;
        this.f296689g = -1732584194;
        this.f296690h = 271733878;
        this.f296691i = -1009589776;
    }

    @Override // io.ktor.util.t0
    @NotNull
    public byte[] a() {
        byte[] bArr = this.f296684b;
        int i10 = this.f296685c;
        long j10 = this.f296683a * ((long) 8);
        int i11 = i10 + 1;
        bArr[i10] = -128;
        if (i11 > 56) {
            ArraysKt.fill(bArr, (byte) 0, i11, 64);
            b(bArr, 0);
            ArraysKt.fill(bArr, (byte) 0, 0, i11);
        } else {
            ArraysKt.fill(bArr, (byte) 0, i11, 56);
        }
        bArr[56] = (byte) (j10 >>> 56);
        bArr[57] = (byte) (j10 >>> 48);
        bArr[58] = (byte) (j10 >>> 40);
        bArr[59] = (byte) (j10 >>> 32);
        bArr[60] = (byte) (j10 >>> 24);
        bArr[61] = (byte) (j10 >>> 16);
        bArr[62] = (byte) (j10 >>> 8);
        bArr[63] = (byte) j10;
        b(bArr, 0);
        int i12 = this.f296687e;
        int i13 = this.f296688f;
        int i14 = this.f296689g;
        int i15 = this.f296690h;
        int i16 = this.f296691i;
        c();
        return new byte[]{(byte) (i12 >> 24), (byte) (i12 >> 16), (byte) (i12 >> 8), (byte) i12, (byte) (i13 >> 24), (byte) (i13 >> 16), (byte) (i13 >> 8), (byte) i13, (byte) (i14 >> 24), (byte) (i14 >> 16), (byte) (i14 >> 8), (byte) i14, (byte) (i15 >> 24), (byte) (i15 >> 16), (byte) (i15 >> 8), (byte) i15, (byte) (i16 >> 24), (byte) (i16 >> 16), (byte) (i16 >> 8), (byte) i16};
    }

    @Override // io.ktor.util.t0
    public void update(@NotNull byte[] input, int i10, int i11) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f296683a += (long) i11;
        int i12 = i10 + i11;
        byte[] bArr = this.f296684b;
        int i13 = this.f296685c;
        if (i13 > 0) {
            int i14 = i11 + i13;
            if (i14 < 64) {
                ArraysKt.copyInto(input, bArr, i13, i10, i12);
                this.f296685c = i14;
                return;
            } else {
                int i15 = (64 - i13) + i10;
                ArraysKt.copyInto(input, bArr, i13, i10, i15);
                b(bArr, 0);
                this.f296685c = 0;
                i10 = i15;
            }
        }
        while (i10 < i12) {
            int i16 = i10 + 64;
            if (i16 > i12) {
                ArraysKt.copyInto(input, bArr, 0, i10, i12);
                this.f296685c = i12 - i10;
                return;
            } else {
                b(input, i10);
                i10 = i16;
            }
        }
    }
}
