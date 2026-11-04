package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean X = false;
    private static final String Y = "GridLayoutManager";
    public static final int Z = -1;
    boolean O;
    int P;
    int[] Q;
    View[] R;
    final SparseIntArray S;
    final SparseIntArray T;
    c U;
    final Rect V;
    private boolean W;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f73836a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f73837b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f73838c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f73839d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        int b(int i10, int i11) {
            if (!this.f73839d) {
                return d(i10, i11);
            }
            int i12 = this.f73837b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iD = d(i10, i11);
            this.f73837b.put(i10, iD);
            return iD;
        }

        int c(int i10, int i11) {
            if (!this.f73838c) {
                return e(i10, i11);
            }
            int i12 = this.f73836a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int iE = e(i10, i11);
            this.f73836a.put(i10, iE);
            return iE;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int iC;
            int iA;
            if (!this.f73839d || (iA = a(this.f73837b, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                iC = 0;
            } else {
                i12 = this.f73837b.get(iA);
                i13 = iA + 1;
                iC = c(iA, i11) + f(iA);
                if (iC == i11) {
                    i12++;
                    iC = 0;
                }
            }
            int iF = f(i10);
            while (i13 < i10) {
                int iF2 = f(i13);
                iC += iF2;
                if (iC == i11) {
                    i12++;
                    iC = 0;
                } else if (iC > i11) {
                    i12++;
                    iC = iF2;
                }
                i13++;
            }
            return iC + iF > i11 ? i12 + 1 : i12;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x002b  */
        /* JADX WARN: Code duplicated, block: B:14:0x0033  */
        /* JADX WARN: Code duplicated, block: B:15:0x0038 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:17:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0038 -> B:17:0x003b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003a -> B:17:0x003b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public int e(int r7, int r8) {
            /*
                r6 = this;
                r5 = 3
                int r0 = r6.f(r7)
                r1 = 0
                if (r0 != r8) goto L9
                return r1
            L9:
                boolean r2 = r6.f73838c
                r5 = 2
                if (r2 == 0) goto L26
                android.util.SparseIntArray r2 = r6.f73836a
                int r2 = a(r2, r7)
                r5 = 2
                if (r2 < 0) goto L26
                r5 = 3
                android.util.SparseIntArray r3 = r6.f73836a
                int r3 = r3.get(r2)
                r5 = 2
                int r4 = r6.f(r2)
                r5 = 3
                int r3 = r3 + r4
                goto L3b
            L26:
                r2 = r1
                r3 = r2
                r3 = r2
            L29:
                if (r2 >= r7) goto L3e
                int r4 = r6.f(r2)
                int r3 = r3 + r4
                r5 = 6
                if (r3 != r8) goto L38
                r5 = 6
                r3 = r1
                r3 = r1
                r5 = 2
                goto L3b
            L38:
                if (r3 <= r8) goto L3b
                r3 = r4
            L3b:
                int r2 = r2 + 1
                goto L29
            L3e:
                int r0 = r0 + r3
                if (r0 > r8) goto L42
                return r3
            L42:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i10);

        public void g() {
            this.f73837b.clear();
        }

        public void h() {
            this.f73836a.clear();
        }

        public boolean i() {
            return this.f73839d;
        }

        public boolean j() {
            return this.f73838c;
        }

        public void k(boolean z10) {
            if (!z10) {
                this.f73837b.clear();
            }
            this.f73839d = z10;
        }

        public void l(boolean z10) {
            if (!z10) {
                this.f73837b.clear();
            }
            this.f73838c = z10;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(RecyclerView.p.x0(context, attributeSet, i10, i11).f74044b);
    }

    static int[] A3(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void B3() {
        this.S.clear();
        this.T.clear();
    }

    private int C3(RecyclerView.c0 c0Var) {
        if (V() != 0 && c0Var.d() != 0) {
            v2();
            boolean zV2 = V2();
            View viewA2 = A2(!zV2, true);
            View viewZ2 = z2(!zV2, true);
            if (viewA2 != null && viewZ2 != null) {
                int iB = this.U.b(w0(viewA2), this.P);
                int iB2 = this.U.b(w0(viewZ2), this.P);
                int iMax = this.f73845x ? Math.max(0, ((this.U.b(c0Var.d() - 1, this.P) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zV2) {
                    return Math.round((iMax * (Math.abs(this.f73842u.d(viewZ2) - this.f73842u.g(viewA2)) / ((this.U.b(w0(viewZ2), this.P) - this.U.b(w0(viewA2), this.P)) + 1))) + (this.f73842u.n() - this.f73842u.g(viewA2)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int D3(RecyclerView.c0 c0Var) {
        if (V() != 0 && c0Var.d() != 0) {
            v2();
            View viewA2 = A2(!V2(), true);
            View viewZ2 = z2(!V2(), true);
            if (viewA2 != null && viewZ2 != null) {
                if (!V2()) {
                    return this.U.b(c0Var.d() - 1, this.P) + 1;
                }
                return (int) (((this.f73842u.d(viewZ2) - this.f73842u.g(viewA2)) / ((this.U.b(w0(viewZ2), this.P) - this.U.b(w0(viewA2), this.P)) + 1)) * (this.U.b(c0Var.d() - 1, this.P) + 1));
            }
        }
        return 0;
    }

    private void E3(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i10) {
        int i11;
        boolean z10 = i10 == 1;
        int iJ3 = J3(xVar, c0Var, aVar.f73852b);
        if (z10) {
            while (iJ3 > 0 && (i11 = aVar.f73852b) > 0) {
                int i12 = i11 - 1;
                aVar.f73852b = i12;
                iJ3 = J3(xVar, c0Var, i12);
            }
            return;
        }
        int iD = c0Var.d() - 1;
        int i13 = aVar.f73852b;
        while (i13 < iD) {
            int i14 = i13 + 1;
            int iJ4 = J3(xVar, c0Var, i14);
            if (iJ4 <= iJ3) {
                break;
            }
            i13 = i14;
            iJ3 = iJ4;
        }
        aVar.f73852b = i13;
    }

    private void F3() {
        View[] viewArr = this.R;
        if (viewArr != null && viewArr.length == this.P) {
            return;
        }
        this.R = new View[this.P];
    }

    private int I3(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        if (!c0Var.j()) {
            return this.U.b(i10, this.P);
        }
        int iG = xVar.g(i10);
        if (iG == -1) {
            return 0;
        }
        return this.U.b(iG, this.P);
    }

    private int J3(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        if (!c0Var.j()) {
            return this.U.c(i10, this.P);
        }
        int i11 = this.T.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iG = xVar.g(i10);
        if (iG == -1) {
            return 0;
        }
        return this.U.c(iG, this.P);
    }

    private int K3(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10) {
        if (!c0Var.j()) {
            return this.U.f(i10);
        }
        int i11 = this.S.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iG = xVar.g(i10);
        if (iG == -1) {
            return 1;
        }
        return this.U.f(iG);
    }

    private void M3(float f10, int i10) {
        z3(Math.max(Math.round(f10 * this.P), i10));
    }

    private void O3(View view, int i10, boolean z10) {
        int iW;
        int iW2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f74048b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iG3 = G3(bVar.f73834e, bVar.f73835f);
        if (this.f73840s == 1) {
            iW2 = RecyclerView.p.W(iG3, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iW = RecyclerView.p.W(this.f73842u.o(), k0(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iW3 = RecyclerView.p.W(iG3, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iW4 = RecyclerView.p.W(this.f73842u.o(), E0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iW = iW3;
            iW2 = iW4;
        }
        P3(view, iW2, iW, z10);
    }

    private void P3(View view, int i10, int i11, boolean z10) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? i2(view, i10, i11, qVar) : g2(view, i10, i11, qVar)) {
            view.measure(i10, i11);
        }
    }

    private void T3() {
        int iJ0;
        int iV0;
        if (Q2() == 1) {
            iJ0 = D0() - t0();
            iV0 = s0();
        } else {
            iJ0 = j0() - q0();
            iV0 = v0();
        }
        z3(iJ0 - iV0);
    }

    private void x3(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.R[i11];
            b bVar = (b) view.getLayoutParams();
            int iK3 = K3(xVar, c0Var, w0(view));
            bVar.f73835f = iK3;
            bVar.f73834e = i14;
            i14 += iK3;
            i11 += i13;
        }
    }

    private void y3() {
        int iV = V();
        for (int i10 = 0; i10 < iV; i10++) {
            b bVar = (b) U(i10).getLayoutParams();
            int iD = bVar.d();
            this.S.put(iD, bVar.k());
            this.T.put(iD, bVar.j());
        }
    }

    private void z3(int i10) {
        this.Q = A3(this.Q, this.P, i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.c0 c0Var) {
        return this.W ? D3(c0Var) : super.A(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.c0 c0Var) {
        return this.W ? C3(c0Var) : super.C(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.c0 c0Var) {
        return this.W ? D3(c0Var) : super.D(c0Var);
    }

    int G3(int i10, int i11) {
        if (this.f73840s != 1 || !U2()) {
            int[] iArr = this.Q;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.Q;
        int i12 = this.P;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public int H3() {
        return this.P;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View J2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10, boolean z11) {
        int i10;
        int iV;
        int iV2 = V();
        int i11 = 1;
        if (z11) {
            iV = V() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
        }
        int iD = c0Var.d();
        v2();
        int iN = this.f73842u.n();
        int i12 = this.f73842u.i();
        View view = null;
        View view2 = null;
        while (iV != i10) {
            View viewU = U(iV);
            int iW0 = w0(viewU);
            if (iW0 >= 0 && iW0 < iD && J3(xVar, c0Var, iW0) == 0) {
                if (((RecyclerView.q) viewU.getLayoutParams()).g()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f73842u.g(viewU) < i12 && this.f73842u.d(viewU) >= iN) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i11;
        }
        return view != null ? view : view2;
    }

    public c L3() {
        return this.U;
    }

    public boolean N3() {
        return this.W;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        return this.f73840s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public void Q3(int i10) {
        if (i10 == this.P) {
            return;
        }
        this.O = true;
        if (i10 >= 1) {
            this.P = i10;
            this.U.h();
            R1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public void R3(c cVar) {
        this.U = cVar;
    }

    public void S3(boolean z10) {
        this.W = z10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int U1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        T3();
        F3();
        return super.U1(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int W1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        T3();
        F3();
        return super.W1(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void W2(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int iS0;
        int iV0;
        int iF;
        int iF2;
        int i12;
        int iW;
        int iW2;
        View viewE;
        int iM = this.f73842u.m();
        boolean z10 = iM != 1073741824;
        int i13 = V() > 0 ? this.Q[this.P] : 0;
        if (z10) {
            T3();
        }
        boolean z11 = cVar.f73871e == 1;
        int iJ3 = this.P;
        if (!z11) {
            iJ3 = J3(xVar, c0Var, cVar.f73870d) + K3(xVar, c0Var, cVar.f73870d);
        }
        int i14 = 0;
        while (i14 < this.P && cVar.c(c0Var) && iJ3 > 0) {
            int i15 = cVar.f73870d;
            int iK3 = K3(xVar, c0Var, i15);
            if (iK3 > this.P) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iK3 + " spans but GridLayoutManager has only " + this.P + " spans.");
            }
            iJ3 -= iK3;
            if (iJ3 < 0 || (viewE = cVar.e(xVar)) == null) {
                break;
            }
            this.R[i14] = viewE;
            i14++;
        }
        if (i14 == 0) {
            bVar.f73857b = true;
            return;
        }
        x3(xVar, c0Var, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.R[i17];
            if (cVar.f73878l == null) {
                if (z11) {
                    j(view);
                } else {
                    k(view, 0);
                }
            } else if (z11) {
                g(view);
            } else {
                h(view, 0);
            }
            r(view, this.V);
            O3(view, iM, false);
            int iE = this.f73842u.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.f73842u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f73835f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            M3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.R[i18];
                O3(view2, 1073741824, true);
                int iE2 = this.f73842u.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.R[i19];
            if (this.f73842u.e(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f74048b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iG3 = G3(bVar2.f73834e, bVar2.f73835f);
                if (this.f73840s == 1) {
                    iW2 = RecyclerView.p.W(iG3, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iW = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iW = RecyclerView.p.W(iG3, 1073741824, i20, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iW2 = iMakeMeasureSpec;
                }
                P3(view3, iW2, iW, true);
            }
        }
        bVar.f73856a = i16;
        if (this.f73840s == 1) {
            if (cVar.f73872f == -1) {
                iF2 = cVar.f73868b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f73868b;
                iF2 = i12 + i16;
            }
            iV0 = i12;
            iF = 0;
            iS0 = 0;
        } else {
            if (cVar.f73872f == -1) {
                i11 = cVar.f73868b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f73868b;
                i11 = i10 + i16;
            }
            iS0 = i10;
            iV0 = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.R[i22];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f73840s != 1) {
                iV0 = this.Q[bVar3.f73834e] + v0();
                iF2 = this.f73842u.f(view4) + iV0;
            } else if (U2()) {
                iF = s0() + this.Q[this.P - bVar3.f73834e];
                iS0 = iF - this.f73842u.f(view4);
            } else {
                iS0 = this.Q[bVar3.f73834e] + s0();
                iF = this.f73842u.f(view4) + iS0;
            }
            int i23 = iF2;
            int i24 = iV0;
            int i25 = iF;
            int i26 = iS0;
            T0(view4, i26, i24, i25, i23);
            iF2 = i23;
            iS0 = i26;
            iF = i25;
            iV0 = i24;
            if (bVar3.g() || bVar3.f()) {
                bVar.f73858c = true;
            }
            bVar.f73859d = view4.hasFocusable() | bVar.f73859d;
        }
        Arrays.fill(this.R, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void Z2(RecyclerView.x xVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i10) {
        super.Z2(xVar, c0Var, aVar, i10);
        T3();
        if (c0Var.d() > 0 && !c0Var.j()) {
            E3(xVar, c0Var, aVar, i10);
        }
        F3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int a0(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f73840s == 1) {
            return this.P;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return I3(xVar, c0Var, c0Var.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c2(Rect rect, int i10, int i11) {
        int iV;
        int iV2;
        if (this.Q == null) {
            super.c2(rect, i10, i11);
        }
        int iS0 = s0() + t0();
        int iV0 = v0() + q0();
        if (this.f73840s == 1) {
            iV2 = RecyclerView.p.v(i11, rect.height() + iV0, o0());
            int[] iArr = this.Q;
            iV = RecyclerView.p.v(i10, iArr[iArr.length - 1] + iS0, p0());
        } else {
            iV = RecyclerView.p.v(i10, rect.width() + iS0, p0());
            int[] iArr2 = this.Q;
            iV2 = RecyclerView.p.v(i11, iArr2[iArr2.length - 1] + iV0, o0());
        }
        b2(iV, iV2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0112  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View e1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.x r26, androidx.recyclerview.widget.RecyclerView.c0 r27) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.e1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$c0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull androidx.core.view.accessibility.j jVar) {
        super.i1(xVar, c0Var, jVar);
        jVar.j1(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView.x xVar, RecyclerView.c0 c0Var, View view, androidx.core.view.accessibility.j jVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.j1(view, jVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iI3 = I3(xVar, c0Var, bVar.d());
        if (this.f73840s == 0) {
            jVar.m1(androidx.core.view.accessibility.j.g.j(bVar.j(), bVar.k(), iI3, 1, false, false));
        } else {
            int i10 = 6 | 0;
            jVar.m1(androidx.core.view.accessibility.j.g.j(iI3, 1, bVar.j(), bVar.k(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(RecyclerView recyclerView, int i10, int i11) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView recyclerView) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean n2() {
        return this.D == null && !this.O;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void n3(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.n3(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p1(RecyclerView recyclerView, int i10, int i11) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void p2(RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.P;
        for (int i10 = 0; i10 < this.P && cVar.c(c0Var) && iF > 0; i10++) {
            int i11 = cVar.f73870d;
            cVar2.a(i11, Math.max(0, cVar.f73873g));
            iF -= this.U.f(i11);
            cVar.f73870d += cVar.f73871e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.U.h();
        this.U.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void s1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (c0Var.j()) {
            y3();
        }
        super.s1(xVar, c0Var);
        B3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void t1(RecyclerView.c0 c0Var) {
        super.t1(c0Var);
        this.O = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.c0 c0Var) {
        return this.W ? C3(c0Var) : super.z(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z0(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f73840s == 0) {
            return this.P;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return I3(xVar, c0Var, c0Var.d() - 1) + 1;
    }

    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f73833g = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f73835f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f73834e = -1;
            this.f73835f = 0;
        }

        public int j() {
            return this.f73834e;
        }

        public int k() {
            return this.f73835f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f73834e = -1;
            this.f73835f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f73834e = -1;
            this.f73835f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f73834e = -1;
            this.f73835f = 0;
        }

        public b(RecyclerView.q qVar) {
            super(qVar);
            this.f73834e = -1;
            this.f73835f = 0;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = new a();
        this.V = new Rect();
        Q3(i10);
    }
}
