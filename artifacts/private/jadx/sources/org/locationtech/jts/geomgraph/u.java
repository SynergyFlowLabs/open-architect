package org.locationtech.jts.geomgraph;

import org.locationtech.jts.geom.y;

/* JADX INFO: loaded from: classes14.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f338379a;

    public u(int[] iArr) {
        e(iArr.length);
    }

    private void e(int i10) {
        this.f338379a = new int[i10];
        l(-1);
    }

    public boolean a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f338379a;
            if (i11 >= iArr.length) {
                return true;
            }
            if (iArr[i11] != i10) {
                return false;
            }
            i11++;
        }
    }

    public void b() {
        int[] iArr = this.f338379a;
        if (iArr.length <= 1) {
            return;
        }
        int i10 = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = i10;
    }

    public int c(int i10) {
        int[] iArr = this.f338379a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public int[] d() {
        return this.f338379a;
    }

    public boolean f() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f338379a;
            if (i10 >= iArr.length) {
                return false;
            }
            if (iArr[i10] == -1) {
                return true;
            }
            i10++;
        }
    }

    public boolean g() {
        return this.f338379a.length > 1;
    }

    public boolean h(u uVar, int i10) {
        return this.f338379a[i10] == uVar.f338379a[i10];
    }

    public boolean i() {
        return this.f338379a.length == 1;
    }

    public boolean j() {
        int i10 = 0;
        while (true) {
            int[] iArr = this.f338379a;
            if (i10 >= iArr.length) {
                return true;
            }
            if (iArr[i10] != -1) {
                return false;
            }
            i10++;
        }
    }

    public void k(u uVar) {
        int length = uVar.f338379a.length;
        int[] iArr = this.f338379a;
        int i10 = 0;
        if (length > iArr.length) {
            this.f338379a = new int[]{iArr[0], -1, -1};
        }
        while (true) {
            int[] iArr2 = this.f338379a;
            if (i10 >= iArr2.length) {
                return;
            }
            if (iArr2[i10] == -1) {
                int[] iArr3 = uVar.f338379a;
                if (i10 < iArr3.length) {
                    iArr2[i10] = iArr3[i10];
                }
            }
            i10++;
        }
    }

    public void l(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f338379a;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = i10;
            i11++;
        }
    }

    public void m(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f338379a;
            if (i11 >= iArr.length) {
                return;
            }
            if (iArr[i11] == -1) {
                iArr[i11] = i10;
            }
            i11++;
        }
    }

    public void n(int i10) {
        o(0, i10);
    }

    public void o(int i10, int i11) {
        this.f338379a[i10] = i11;
    }

    public void p(int i10, int i11, int i12) {
        int[] iArr = this.f338379a;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int[] iArr = this.f338379a;
        if (iArr.length > 1) {
            stringBuffer.append(y.a(iArr[1]));
        }
        stringBuffer.append(y.a(this.f338379a[0]));
        int[] iArr2 = this.f338379a;
        if (iArr2.length > 1) {
            stringBuffer.append(y.a(iArr2[2]));
        }
        return stringBuffer.toString();
    }

    public u(int i10, int i11, int i12) {
        e(3);
        int[] iArr = this.f338379a;
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
    }

    public u(int i10) {
        e(1);
        this.f338379a[0] = i10;
    }

    public u(u uVar) {
        e(uVar.f338379a.length);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f338379a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = uVar.f338379a[i10];
            i10++;
        }
    }
}
