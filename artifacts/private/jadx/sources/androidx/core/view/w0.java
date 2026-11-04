package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f49015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f49016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f49017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f49019e;

    public w0(@NonNull View view) {
        this.f49017c = view;
    }

    private boolean h(int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14, @androidx.annotation.p0 int[] iArr2) {
        ViewParent viewParentI;
        int i15;
        int i16;
        int[] iArr3;
        if (!m() || (viewParentI = i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f49017c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrJ = j();
            iArrJ[0] = 0;
            iArrJ[1] = 0;
            iArr3 = iArrJ;
        } else {
            iArr3 = iArr2;
        }
        d2.i(viewParentI, this.f49017c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f49017c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent i(int i10) {
        if (i10 == 0) {
            return this.f49015a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f49016b;
    }

    private int[] j() {
        if (this.f49019e == null) {
            this.f49019e = new int[2];
        }
        return this.f49019e;
    }

    private void q(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f49015a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f49016b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return d2.c(viewParentI, this.f49017c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return d2.d(viewParentI, this.f49017c, f10, f11);
    }

    public boolean c(int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, @androidx.annotation.p0 int[] iArr, @androidx.annotation.p0 int[] iArr2, int i12) {
        ViewParent viewParentI;
        int i13;
        int i14;
        if (!m() || (viewParentI = i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f49017c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        d2.f(viewParentI, this.f49017c, i10, i11, iArr3, i12);
        if (iArr2 != null) {
            this.f49017c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14, @androidx.annotation.p0 int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean g(int i10, int i11, int i12, int i13, @androidx.annotation.p0 int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i10) {
        return i(i10) != null;
    }

    public boolean m() {
        return this.f49018d;
    }

    public void n() {
        u1.O2(this.f49017c);
    }

    public void o(@NonNull View view) {
        u1.O2(this.f49017c);
    }

    public void p(boolean z10) {
        if (this.f49018d) {
            u1.O2(this.f49017c);
        }
        this.f49018d = z10;
    }

    public boolean r(int i10) {
        return s(i10, 0);
    }

    public boolean s(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (m()) {
            View view = this.f49017c;
            for (ViewParent parent = this.f49017c.getParent(); parent != null; parent = parent.getParent()) {
                if (d2.m(parent, view, this.f49017c, i10, i11)) {
                    q(i11, parent);
                    d2.k(parent, view, this.f49017c, i10, i11);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void t() {
        u(0);
    }

    public void u(int i10) {
        ViewParent viewParentI = i(i10);
        if (viewParentI != null) {
            d2.o(viewParentI, this.f49017c, i10);
            q(i10, null);
        }
    }
}
