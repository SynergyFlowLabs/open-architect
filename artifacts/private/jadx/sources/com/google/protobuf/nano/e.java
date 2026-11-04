package com.google.protobuf.nano;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final f f126178e = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f126179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f126180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f[] f126181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f126182d;

    e() {
        this(10);
    }

    private boolean a(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private boolean b(f[] fVarArr, f[] fVarArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!fVarArr[i11].equals(fVarArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private int c(int i10) {
        int i11 = this.f126182d - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f126180b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    private void f() {
        int i10 = this.f126182d;
        int[] iArr = this.f126180b;
        f[] fVarArr = this.f126181c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[i12];
            if (fVar != f126178e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    fVarArr[i11] = fVar;
                    fVarArr[i12] = null;
                }
                i11++;
            }
        }
        this.f126179a = false;
        this.f126182d = i11;
    }

    private int h(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    private int i(int i10) {
        return h(i10 * 4) / 4;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        int size = size();
        e eVar = new e(size);
        System.arraycopy(this.f126180b, 0, eVar.f126180b, 0, size);
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f126181c[i10];
            if (fVar != null) {
                eVar.f126181c[i10] = fVar.clone();
            }
        }
        eVar.f126182d = size;
        return eVar;
    }

    f e(int i10) {
        if (this.f126179a) {
            f();
        }
        return this.f126181c[i10];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return size() == eVar.size() && a(this.f126180b, eVar.f126180b, this.f126182d) && b(this.f126181c, eVar.f126181c, this.f126182d);
    }

    f g(int i10) {
        f fVar;
        int iC = c(i10);
        if (iC < 0 || (fVar = this.f126181c[iC]) == f126178e) {
            return null;
        }
        return fVar;
    }

    public int hashCode() {
        if (this.f126179a) {
            f();
        }
        int iHashCode = 17;
        for (int i10 = 0; i10 < this.f126182d; i10++) {
            iHashCode = (((iHashCode * 31) + this.f126180b[i10]) * 31) + this.f126181c[i10].hashCode();
        }
        return iHashCode;
    }

    public boolean j() {
        return size() == 0;
    }

    void k(int i10, f fVar) {
        int iC = c(i10);
        if (iC >= 0) {
            this.f126181c[iC] = fVar;
            return;
        }
        int i11 = ~iC;
        int i12 = this.f126182d;
        if (i11 < i12) {
            f[] fVarArr = this.f126181c;
            if (fVarArr[i11] == f126178e) {
                this.f126180b[i11] = i10;
                fVarArr[i11] = fVar;
                return;
            }
        }
        if (this.f126179a && i12 >= this.f126180b.length) {
            f();
            i11 = ~c(i10);
        }
        int i13 = this.f126182d;
        if (i13 >= this.f126180b.length) {
            int i14 = i(i13 + 1);
            int[] iArr = new int[i14];
            f[] fVarArr2 = new f[i14];
            int[] iArr2 = this.f126180b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            f[] fVarArr3 = this.f126181c;
            System.arraycopy(fVarArr3, 0, fVarArr2, 0, fVarArr3.length);
            this.f126180b = iArr;
            this.f126181c = fVarArr2;
        }
        int i15 = this.f126182d;
        if (i15 - i11 != 0) {
            int[] iArr3 = this.f126180b;
            int i16 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i16, i15 - i11);
            f[] fVarArr4 = this.f126181c;
            System.arraycopy(fVarArr4, i11, fVarArr4, i16, this.f126182d - i11);
        }
        this.f126180b[i11] = i10;
        this.f126181c[i11] = fVar;
        this.f126182d++;
    }

    void l(int i10) {
        int iC = c(i10);
        if (iC >= 0) {
            f[] fVarArr = this.f126181c;
            f fVar = fVarArr[iC];
            f fVar2 = f126178e;
            if (fVar != fVar2) {
                fVarArr[iC] = fVar2;
                this.f126179a = true;
            }
        }
    }

    int size() {
        if (this.f126179a) {
            f();
        }
        return this.f126182d;
    }

    e(int i10) {
        this.f126179a = false;
        int i11 = i(i10);
        this.f126180b = new int[i11];
        this.f126181c = new f[i11];
        this.f126182d = 0;
    }
}
