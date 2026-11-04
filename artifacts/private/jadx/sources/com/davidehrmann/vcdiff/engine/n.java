package com.davidehrmann.vcdiff.engine;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f97927c = new n(h.Y, f.f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f97928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f97929b;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f97930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f97931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final short[][] f97932c;

        public a(int i10, int i11) {
            this.f97930a = i10;
            this.f97931b = i11;
            int[] iArr = {i10, i11 + 1};
            short[][] sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, iArr);
            this.f97932c = sArr;
            for (short[] sArr2 : sArr) {
                Arrays.fill(sArr2, f.f97837g);
            }
        }

        public void a(byte b10, byte b11, byte b12, byte b13) {
            short[] sArr = this.f97932c[(b10 & 255) + (b12 & 255)];
            int i10 = b11 & 255;
            if (sArr[i10] == 256) {
                sArr[i10] = (short) (b13 & 255);
            }
        }

        public short b(byte b10, byte b11, byte b12) {
            int i10 = b11 & 255;
            return i10 > this.f97931b ? f.f97837g : this.f97932c[b10 == 3 ? (b10 & 255) + (b12 & 255) : b10 & 255][i10];
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f97933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f97934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final short[][][] f97935c = new short[256][][];

        public b(int i10, int i11) {
            this.f97933a = i10;
            this.f97934b = i11;
        }

        public void a(byte b10, byte b11, byte b12, byte b13, byte b14) {
            short[][][] sArr = this.f97935c;
            int i10 = b10 & 255;
            if (sArr[i10] == null) {
                sArr[i10] = new short[this.f97933a][];
            }
            short[][] sArr2 = sArr[i10];
            int i11 = (b11 & 255) + (b13 & 255);
            if (sArr2[i11] == null) {
                sArr2[i11] = new short[this.f97934b + 1];
                Arrays.fill(sArr[i10][i11], f.f97837g);
            }
            short[] sArr3 = this.f97935c[i10][i11];
            int i12 = b12 & 255;
            if (sArr3[i12] == 256) {
                sArr3[i12] = (short) (b14 & 255);
            }
        }

        public short b(byte b10, byte b11, byte b12, byte b13) {
            short[][] sArr;
            int i10 = b12 & 255;
            if (i10 > this.f97934b || (sArr = this.f97935c[b10 & 255]) == null) {
                return f.f97837g;
            }
            short[] sArr2 = sArr[b11 == 3 ? (b11 & 255) + (b13 & 255) : b11 & 255];
            return sArr2 == null ? f.f97837g : sArr2[i10];
        }
    }

    public n(h hVar, byte b10) {
        short sB;
        int i10 = b10 + 4;
        this.f97928a = new a(i10, a(hVar.f97858c));
        this.f97929b = new b(i10, a(hVar.f97859d));
        for (int i11 = 0; i11 < 256; i11++) {
            byte b11 = hVar.f97857b[i11];
            if (b11 == 0) {
                this.f97928a.a(hVar.f97856a[i11], hVar.f97858c[i11], hVar.f97860e[i11], (byte) i11);
            } else if (hVar.f97856a[i11] == 0) {
                this.f97928a.a(b11, hVar.f97859d[i11], hVar.f97861f[i11], (byte) i11);
            }
        }
        for (int i12 = 0; i12 < 256; i12++) {
            byte b12 = hVar.f97856a[i12];
            if (b12 != 0 && hVar.f97857b[i12] != 0 && (sB = b(b12, hVar.f97858c[i12], hVar.f97860e[i12])) != 256) {
                this.f97929b.a((byte) sB, hVar.f97857b[i12], hVar.f97859d[i12], hVar.f97861f[i12], (byte) i12);
            }
        }
    }

    private static int a(byte[] bArr) {
        int i10 = bArr[0] & 255;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            byte b10 = bArr[i11];
            if ((b10 & 255) > i10) {
                i10 = b10 & 255;
            }
        }
        return i10;
    }

    public short b(byte b10, byte b11, byte b12) {
        return this.f97928a.b(b10, b11, b12);
    }

    public short c(byte b10, byte b11, byte b12, byte b13) {
        return this.f97929b.b(b10, b11, b12, b13);
    }
}
