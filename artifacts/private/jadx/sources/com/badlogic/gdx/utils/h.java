package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long[] f95532a = {0};

    public h() {
    }

    private void c(int i10) {
        long[] jArr = this.f95532a;
        if (i10 >= jArr.length) {
            long[] jArr2 = new long[i10 + 1];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            this.f95532a = jArr2;
        }
    }

    public void a(h hVar) {
        int iMin = Math.min(this.f95532a.length, hVar.f95532a.length);
        for (int i10 = 0; iMin > i10; i10++) {
            long[] jArr = this.f95532a;
            jArr[i10] = jArr[i10] & hVar.f95532a[i10];
        }
        long[] jArr2 = this.f95532a;
        if (jArr2.length > iMin) {
            int length = jArr2.length;
            while (length > iMin) {
                this.f95532a[iMin] = 0;
                iMin++;
            }
        }
    }

    public void b(h hVar) {
        int length = this.f95532a.length;
        int length2 = hVar.f95532a.length;
        for (int i10 = 0; i10 < length && i10 < length2; i10++) {
            long[] jArr = this.f95532a;
            jArr[i10] = jArr[i10] & (~hVar.f95532a[i10]);
        }
    }

    public void d() {
        long[] jArr = this.f95532a;
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = 0;
        }
    }

    public void e(int i10) {
        int i11 = i10 >>> 6;
        long[] jArr = this.f95532a;
        if (i11 >= jArr.length) {
            return;
        }
        jArr[i11] = jArr[i11] & (~(1 << (i10 & 63)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        long[] jArr = hVar.f95532a;
        int iMin = Math.min(this.f95532a.length, jArr.length);
        for (int i10 = 0; iMin > i10; i10++) {
            if (this.f95532a[i10] != jArr[i10]) {
                return false;
            }
        }
        return this.f95532a.length == jArr.length || m() == hVar.m();
    }

    public boolean f(h hVar) {
        long[] jArr = this.f95532a;
        long[] jArr2 = hVar.f95532a;
        int length = jArr2.length;
        int length2 = jArr.length;
        for (int i10 = length2; i10 < length; i10++) {
            if (jArr2[i10] != 0) {
                return false;
            }
        }
        for (int iMin = Math.min(length2, length) - 1; iMin >= 0; iMin--) {
            long j10 = jArr[iMin];
            long j11 = jArr2[iMin];
            if ((j10 & j11) != j11) {
                return false;
            }
        }
        return true;
    }

    public void g(int i10) {
        int i11 = i10 >>> 6;
        c(i11);
        long[] jArr = this.f95532a;
        jArr[i11] = jArr[i11] ^ (1 << (i10 & 63));
    }

    public boolean h(int i10) {
        int i11 = i10 >>> 6;
        long[] jArr = this.f95532a;
        if (i11 >= jArr.length) {
            return false;
        }
        return ((1 << (i10 & 63)) & jArr[i11]) != 0;
    }

    public int hashCode() {
        int iM = m() >>> 6;
        int i10 = 0;
        for (int i11 = 0; iM >= i11; i11++) {
            long j10 = this.f95532a[i11];
            i10 = (i10 * 127) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    public boolean i(int i10) {
        int i11 = i10 >>> 6;
        long[] jArr = this.f95532a;
        if (i11 >= jArr.length) {
            return false;
        }
        long j10 = jArr[i11];
        long j11 = (~(1 << (i10 & 63))) & j10;
        jArr[i11] = j11;
        return j11 != j10;
    }

    public boolean j(int i10) {
        int i11 = i10 >>> 6;
        c(i11);
        long[] jArr = this.f95532a;
        long j10 = jArr[i11];
        long j11 = (1 << (i10 & 63)) | j10;
        jArr[i11] = j11;
        return j11 == j10;
    }

    public boolean k(h hVar) {
        long[] jArr = this.f95532a;
        long[] jArr2 = hVar.f95532a;
        for (int iMin = Math.min(jArr.length, jArr2.length) - 1; iMin >= 0; iMin--) {
            if ((jArr[iMin] & jArr2[iMin]) != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        for (long j10 : this.f95532a) {
            if (j10 != 0) {
                return false;
            }
        }
        return true;
    }

    public int m() {
        long[] jArr = this.f95532a;
        for (int length = jArr.length - 1; length >= 0; length--) {
            long j10 = jArr[length];
            if (j10 != 0) {
                for (int i10 = 63; i10 >= 0; i10--) {
                    if (((1 << (i10 & 63)) & j10) != 0) {
                        return (length << 6) + i10;
                    }
                }
            }
        }
        return 0;
    }

    public int n(int i10) {
        long[] jArr = this.f95532a;
        int i11 = i10 >>> 6;
        int length = jArr.length;
        if (i11 >= length) {
            return -1;
        }
        long j10 = jArr[i11];
        int i12 = i10 & 63;
        while (i12 < 64) {
            if (((1 << (i12 & 63)) & j10) == 0) {
                return (i11 << 6) + i12;
            }
            i12++;
        }
        loop1: while (true) {
            i11++;
            if (i11 >= length) {
                return -1;
            }
            if (i11 == 0) {
                return i11 << 6;
            }
            long j11 = jArr[i11];
            i12 = 0;
            while (i12 < 64) {
                if (((1 << (i12 & 63)) & j11) == 0) {
                    break loop1;
                }
                i12++;
            }
        }
        return (i11 << 6) + i12;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[LOOP:2: B:20:0x003f->B:24:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0031 A[SYNTHETIC] */
    public int o(int i10) {
        long j10;
        int i11;
        long[] jArr = this.f95532a;
        int i12 = i10 >>> 6;
        int length = jArr.length;
        if (i12 >= length) {
            return -1;
        }
        long j11 = jArr[i12];
        if (j11 != 0) {
            i11 = i10 & 63;
            while (i11 < 64) {
                if (((1 << (i11 & 63)) & j11) == 0) {
                    i11++;
                }
            }
            while (true) {
                i12++;
                if (i12 < length) {
                    return -1;
                }
                if (i12 != 0) {
                    j10 = jArr[i12];
                    if (j10 != 0) {
                        i11 = 0;
                        while (i11 < 64) {
                            if (((1 << (i11 & 63)) & j10) != 0) {
                                i11++;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            while (true) {
                i12++;
                if (i12 < length) {
                    return -1;
                }
                if (i12 != 0) {
                    j10 = jArr[i12];
                    if (j10 != 0) {
                        i11 = 0;
                        while (i11 < 64) {
                            if (((1 << (i11 & 63)) & j10) != 0) {
                                i11++;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return (i12 << 6) + i11;
    }

    public int p() {
        return this.f95532a.length << 6;
    }

    public void q(h hVar) {
        int iMin = Math.min(this.f95532a.length, hVar.f95532a.length);
        for (int i10 = 0; iMin > i10; i10++) {
            long[] jArr = this.f95532a;
            jArr[i10] = jArr[i10] | hVar.f95532a[i10];
        }
        long[] jArr2 = hVar.f95532a;
        if (iMin < jArr2.length) {
            c(jArr2.length);
            int length = hVar.f95532a.length;
            while (length > iMin) {
                this.f95532a[iMin] = hVar.f95532a[iMin];
                iMin++;
            }
        }
    }

    public void r(int i10) {
        int i11 = i10 >>> 6;
        c(i11);
        long[] jArr = this.f95532a;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    public void s(h hVar) {
        int iMin = Math.min(this.f95532a.length, hVar.f95532a.length);
        for (int i10 = 0; iMin > i10; i10++) {
            long[] jArr = this.f95532a;
            jArr[i10] = jArr[i10] ^ hVar.f95532a[i10];
        }
        long[] jArr2 = this.f95532a;
        if (jArr2.length > iMin) {
            int length = jArr2.length;
            for (int length2 = hVar.f95532a.length; length > length2; length2++) {
                this.f95532a[length2] = 0;
            }
            return;
        }
        long[] jArr3 = hVar.f95532a;
        if (iMin < jArr3.length) {
            c(jArr3.length);
            int length3 = hVar.f95532a.length;
            while (length3 > iMin) {
                this.f95532a[iMin] = hVar.f95532a[iMin];
                iMin++;
            }
        }
    }

    public h(int i10) {
        c(i10 >>> 6);
    }
}
