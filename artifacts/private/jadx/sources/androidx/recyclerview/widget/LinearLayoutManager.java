package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.fragment.app.t0;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class LinearLayoutManager extends RecyclerView.p implements o.j, RecyclerView.b0.b {
    private static final String I = "LinearLayoutManager";
    static final boolean J = false;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = Integer.MIN_VALUE;
    private static final float N = 0.33333334f;
    int A;
    int B;
    private boolean C;
    SavedState D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f73840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f73841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    z f73842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f73843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f73844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f73845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f73846y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f73847z;

    @e.a({"BanParcelableUsage"})
    @b1({b1.a.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f73848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f73849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f73850c;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        boolean a() {
            return this.f73848a >= 0;
        }

        void b() {
            this.f73848a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f73848a);
            parcel.writeInt(this.f73849b);
            parcel.writeInt(this.f73850c ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f73848a = parcel.readInt();
            this.f73849b = parcel.readInt();
            this.f73850c = parcel.readInt() == 1;
        }

        @e.a({"UnknownNullness"})
        public SavedState(SavedState savedState) {
            this.f73848a = savedState.f73848a;
            this.f73849b = savedState.f73849b;
            this.f73850c = savedState.f73850c;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        z f73851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f73852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f73853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f73854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f73855e;

        a() {
            e();
        }

        void a() {
            this.f73853c = this.f73854d ? this.f73851a.i() : this.f73851a.n();
        }

        public void b(View view, int i10) {
            if (this.f73854d) {
                this.f73853c = this.f73851a.d(view) + this.f73851a.p();
            } else {
                this.f73853c = this.f73851a.g(view);
            }
            this.f73852b = i10;
        }

        public void c(View view, int i10) {
            int iP = this.f73851a.p();
            if (iP >= 0) {
                b(view, i10);
                return;
            }
            this.f73852b = i10;
            if (this.f73854d) {
                int i11 = (this.f73851a.i() - iP) - this.f73851a.d(view);
                this.f73853c = this.f73851a.i() - i11;
                if (i11 > 0) {
                    int iE = this.f73853c - this.f73851a.e(view);
                    int iN = this.f73851a.n();
                    int iMin = iE - (iN + Math.min(this.f73851a.g(view) - iN, 0));
                    if (iMin < 0) {
                        this.f73853c += Math.min(i11, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f73851a.g(view);
            int iN2 = iG - this.f73851a.n();
            this.f73853c = iG;
            if (iN2 > 0) {
                int i12 = (this.f73851a.i() - Math.min(0, (this.f73851a.i() - iP) - this.f73851a.d(view))) - (iG + this.f73851a.e(view));
                if (i12 < 0) {
                    this.f73853c -= Math.min(iN2, -i12);
                }
            }
        }

        boolean d(View view, RecyclerView.c0 c0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.g() && qVar.d() >= 0 && qVar.d() < c0Var.d();
        }

        void e() {
            this.f73852b = -1;
            this.f73853c = Integer.MIN_VALUE;
            this.f73854d = false;
            this.f73855e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f73852b + ", mCoordinate=" + this.f73853c + ", mLayoutFromEnd=" + this.f73854d + ", mValid=" + this.f73855e + AbstractJsonLexerKt.END_OBJ;
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f73857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f73858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f73859d;

        protected b() {
        }

        void a() {
            this.f73856a = 0;
            this.f73857b = false;
            this.f73858c = false;
            this.f73859d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f73860n = "LLM#LayoutState";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f73861o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        static final int f73862p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final int f73863q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final int f73864r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f73865s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f73866t = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f73868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f73869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f73870d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73871e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f73872f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f73873g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f73877k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f73879m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f73867a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f73874h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f73875i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f73876j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List<RecyclerView.g0> f73878l = null;

        c() {
        }

        private View f() {
            int size = this.f73878l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f73878l.get(i10).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.g() && this.f73870d == qVar.d()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewG = g(view);
            if (viewG == null) {
                this.f73870d = -1;
            } else {
                this.f73870d = ((RecyclerView.q) viewG.getLayoutParams()).d();
            }
        }

        boolean c(RecyclerView.c0 c0Var) {
            int i10 = this.f73870d;
            return i10 >= 0 && i10 < c0Var.d();
        }

        void d() {
        }

        View e(RecyclerView.x xVar) {
            if (this.f73878l != null) {
                return f();
            }
            View viewP = xVar.p(this.f73870d);
            this.f73870d += this.f73871e;
            return viewP;
        }

        public View g(View view) {
            int iD;
            int size = this.f73878l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f73878l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.g() && (iD = (qVar.d() - this.f73870d) * this.f73871e) >= 0 && iD < i10) {
                    if (iD == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i10 = iD;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(@e.a({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private View D2() {
        return F2(V() - 1, -1);
    }

    private View H2() {
        return this.f73845x ? y2() : D2();
    }

    private View I2() {
        return this.f73845x ? D2() : y2();
    }

    private int K2(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int i11;
        int i12 = this.f73842u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -g3(-i12, xVar, c0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f73842u.i() - i14) <= 0) {
            return i13;
        }
        this.f73842u.t(i11);
        return i11 + i13;
    }

    private int L2(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int iN;
        int iN2 = i10 - this.f73842u.n();
        if (iN2 <= 0) {
            return 0;
        }
        int i11 = -g3(iN2, xVar, c0Var);
        int i12 = i10 + i11;
        if (!z10 || (iN = i12 - this.f73842u.n()) <= 0) {
            return i11;
        }
        this.f73842u.t(-iN);
        return i11 - iN;
    }

    private View M2() {
        return U(this.f73845x ? 0 : V() - 1);
    }

    private View N2() {
        return U(this.f73845x ? V() - 1 : 0);
    }

    private void X2(RecyclerView.x xVar, RecyclerView.c0 c0Var, int i10, int i11) {
        if (!c0Var.n() || V() == 0 || c0Var.j() || !n2()) {
            return;
        }
        List<RecyclerView.g0> listL = xVar.l();
        int size = listL.size();
        int iW0 = w0(U(0));
        int iE = 0;
        int iE2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.g0 g0Var = listL.get(i12);
            if (!g0Var.isRemoved()) {
                if ((g0Var.getLayoutPosition() < iW0) != this.f73845x) {
                    iE += this.f73842u.e(g0Var.itemView);
                } else {
                    iE2 += this.f73842u.e(g0Var.itemView);
                }
            }
        }
        this.f73841t.f73878l = listL;
        if (iE > 0) {
            u3(w0(N2()), i10);
            c cVar = this.f73841t;
            cVar.f73874h = iE;
            cVar.f73869c = 0;
            cVar.a();
            w2(xVar, this.f73841t, c0Var, false);
        }
        if (iE2 > 0) {
            s3(w0(M2()), i11);
            c cVar2 = this.f73841t;
            cVar2.f73874h = iE2;
            cVar2.f73869c = 0;
            cVar2.a();
            w2(xVar, this.f73841t, c0Var, false);
        }
        this.f73841t.f73878l = null;
    }

    private void Y2() {
        for (int i10 = 0; i10 < V(); i10++) {
            View viewU = U(i10);
            w0(viewU);
            this.f73842u.g(viewU);
        }
    }

    private void a3(RecyclerView.x xVar, c cVar) {
        if (cVar.f73867a && !cVar.f73879m) {
            int i10 = cVar.f73873g;
            int i11 = cVar.f73875i;
            if (cVar.f73872f == -1) {
                c3(xVar, i10, i11);
                return;
            }
            d3(xVar, i10, i11);
        }
    }

    private void b3(RecyclerView.x xVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                while (true) {
                    i11--;
                    if (i11 < i10) {
                        break;
                    } else {
                        K1(i11, xVar);
                    }
                }
            } else {
                while (i10 > i11) {
                    K1(i10, xVar);
                    i10--;
                }
            }
        }
    }

    private void c3(RecyclerView.x xVar, int i10, int i11) {
        int iV = V();
        if (i10 < 0) {
            return;
        }
        int iH = (this.f73842u.h() - i10) + i11;
        if (this.f73845x) {
            for (int i12 = 0; i12 < iV; i12++) {
                View viewU = U(i12);
                if (this.f73842u.g(viewU) < iH || this.f73842u.r(viewU) < iH) {
                    b3(xVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iV - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewU2 = U(i14);
            if (this.f73842u.g(viewU2) < iH || this.f73842u.r(viewU2) < iH) {
                b3(xVar, i13, i14);
                return;
            }
        }
    }

    private void d3(RecyclerView.x xVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int iV = V();
        if (!this.f73845x) {
            for (int i13 = 0; i13 < iV; i13++) {
                View viewU = U(i13);
                if (this.f73842u.d(viewU) > i12 || this.f73842u.q(viewU) > i12) {
                    b3(xVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = iV - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View viewU2 = U(i15);
            if (this.f73842u.d(viewU2) <= i12 && this.f73842u.q(viewU2) <= i12) {
            }
            b3(xVar, i14, i15);
            return;
        }
    }

    private void f3() {
        if (this.f73840s != 1 && U2()) {
            this.f73845x = !this.f73844w;
            return;
        }
        this.f73845x = this.f73844w;
    }

    private boolean o3(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar) {
        View viewJ2;
        boolean z10 = false;
        if (V() == 0) {
            return false;
        }
        View viewI0 = i0();
        if (viewI0 != null && aVar.d(viewI0, c0Var)) {
            aVar.c(viewI0, w0(viewI0));
            return true;
        }
        boolean z11 = this.f73843v;
        boolean z12 = this.f73846y;
        if (z11 != z12 || (viewJ2 = J2(xVar, c0Var, aVar.f73854d, z12)) == null) {
            return false;
        }
        aVar.b(viewJ2, w0(viewJ2));
        if (!c0Var.j() && n2()) {
            int iG = this.f73842u.g(viewJ2);
            int iD = this.f73842u.d(viewJ2);
            int iN = this.f73842u.n();
            int i10 = this.f73842u.i();
            boolean z13 = iD <= iN && iG < iN;
            if (iG >= i10 && iD > i10) {
                z10 = true;
            }
            if (z13 || z10) {
                if (aVar.f73854d) {
                    iN = i10;
                }
                aVar.f73853c = iN;
            }
        }
        return true;
    }

    private boolean p3(RecyclerView.c0 c0Var, a aVar) {
        int i10;
        if (!c0Var.j() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < c0Var.d()) {
                aVar.f73852b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z10 = this.D.f73850c;
                    aVar.f73854d = z10;
                    if (z10) {
                        aVar.f73853c = this.f73842u.i() - this.D.f73849b;
                    } else {
                        aVar.f73853c = this.f73842u.n() + this.D.f73849b;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z11 = this.f73845x;
                    aVar.f73854d = z11;
                    if (z11) {
                        aVar.f73853c = this.f73842u.i() - this.B;
                    } else {
                        aVar.f73853c = this.f73842u.n() + this.B;
                    }
                    return true;
                }
                View viewO = O(this.A);
                if (viewO == null) {
                    if (V() > 0) {
                        aVar.f73854d = (this.A < w0(U(0))) == this.f73845x;
                    }
                    aVar.a();
                } else {
                    if (this.f73842u.e(viewO) > this.f73842u.o()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f73842u.g(viewO) - this.f73842u.n() < 0) {
                        aVar.f73853c = this.f73842u.n();
                        aVar.f73854d = false;
                        return true;
                    }
                    if (this.f73842u.i() - this.f73842u.d(viewO) < 0) {
                        aVar.f73853c = this.f73842u.i();
                        aVar.f73854d = true;
                        return true;
                    }
                    aVar.f73853c = aVar.f73854d ? this.f73842u.d(viewO) + this.f73842u.p() : this.f73842u.g(viewO);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private int q2(RecyclerView.c0 c0Var) {
        if (V() == 0) {
            return 0;
        }
        v2();
        return c0.a(c0Var, this.f73842u, A2(!this.f73847z, true), z2(!this.f73847z, true), this, this.f73847z);
    }

    private void q3(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar) {
        if (p3(c0Var, aVar) || o3(xVar, c0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f73852b = this.f73846y ? c0Var.d() - 1 : 0;
    }

    private int r2(RecyclerView.c0 c0Var) {
        if (V() == 0) {
            return 0;
        }
        v2();
        return c0.b(c0Var, this.f73842u, A2(!this.f73847z, true), z2(!this.f73847z, true), this, this.f73847z, this.f73845x);
    }

    private void r3(int i10, int i11, boolean z10, RecyclerView.c0 c0Var) {
        int iN;
        this.f73841t.f73879m = e3();
        this.f73841t.f73872f = i10;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        o2(c0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f73841t;
        int i12 = z11 ? iMax2 : iMax;
        cVar.f73874h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        cVar.f73875i = iMax;
        if (z11) {
            cVar.f73874h = i12 + this.f73842u.j();
            View viewM2 = M2();
            c cVar2 = this.f73841t;
            cVar2.f73871e = this.f73845x ? -1 : 1;
            int iW0 = w0(viewM2);
            c cVar3 = this.f73841t;
            cVar2.f73870d = iW0 + cVar3.f73871e;
            cVar3.f73868b = this.f73842u.d(viewM2);
            iN = this.f73842u.d(viewM2) - this.f73842u.i();
        } else {
            View viewN2 = N2();
            this.f73841t.f73874h += this.f73842u.n();
            c cVar4 = this.f73841t;
            cVar4.f73871e = this.f73845x ? 1 : -1;
            int iW1 = w0(viewN2);
            c cVar5 = this.f73841t;
            cVar4.f73870d = iW1 + cVar5.f73871e;
            cVar5.f73868b = this.f73842u.g(viewN2);
            iN = (-this.f73842u.g(viewN2)) + this.f73842u.n();
        }
        c cVar6 = this.f73841t;
        cVar6.f73869c = i11;
        if (z10) {
            cVar6.f73869c = i11 - iN;
        }
        cVar6.f73873g = iN;
    }

    private int s2(RecyclerView.c0 c0Var) {
        if (V() == 0) {
            return 0;
        }
        v2();
        return c0.c(c0Var, this.f73842u, A2(!this.f73847z, true), z2(!this.f73847z, true), this, this.f73847z);
    }

    private void s3(int i10, int i11) {
        int i12;
        this.f73841t.f73869c = this.f73842u.i() - i11;
        c cVar = this.f73841t;
        if (this.f73845x) {
            i12 = -1;
            int i13 = 4 | (-1);
        } else {
            i12 = 1;
        }
        cVar.f73871e = i12;
        cVar.f73870d = i10;
        cVar.f73872f = 1;
        cVar.f73868b = i11;
        cVar.f73873g = Integer.MIN_VALUE;
    }

    private void t3(a aVar) {
        s3(aVar.f73852b, aVar.f73853c);
    }

    private void u3(int i10, int i11) {
        this.f73841t.f73869c = i11 - this.f73842u.n();
        c cVar = this.f73841t;
        cVar.f73870d = i10;
        cVar.f73871e = this.f73845x ? 1 : -1;
        cVar.f73872f = -1;
        cVar.f73868b = i11;
        cVar.f73873g = Integer.MIN_VALUE;
    }

    private void v3(a aVar) {
        u3(aVar.f73852b, aVar.f73853c);
    }

    private View y2() {
        return F2(0, V());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int A(RecyclerView.c0 c0Var) {
        return s2(c0Var);
    }

    View A2(boolean z10, boolean z11) {
        return this.f73845x ? G2(V() - 1, -1, z10, z11) : G2(0, V(), z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int B(RecyclerView.c0 c0Var) {
        return q2(c0Var);
    }

    public int B2() {
        View viewG2 = G2(0, V(), false, true);
        if (viewG2 == null) {
            return -1;
        }
        return w0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int C(RecyclerView.c0 c0Var) {
        return r2(c0Var);
    }

    public int C2() {
        int i10 = 1 | (-1);
        View viewG2 = G2(V() - 1, -1, true, false);
        if (viewG2 == null) {
            return -1;
        }
        return w0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int D(RecyclerView.c0 c0Var) {
        return s2(c0Var);
    }

    public int E2() {
        View viewG2 = G2(V() - 1, -1, false, true);
        if (viewG2 == null) {
            return -1;
        }
        return w0(viewG2);
    }

    View F2(int i10, int i11) {
        int i12;
        int i13;
        v2();
        if (i11 <= i10 && i11 >= i10) {
            return U(i10);
        }
        if (this.f73842u.g(U(i10)) < this.f73842u.n()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = t0.I;
        }
        return this.f73840s == 0 ? this.f74027e.a(i10, i11, i12, i13) : this.f74028f.a(i10, i11, i12, i13);
    }

    View G2(int i10, int i11, boolean z10, boolean z11) {
        v2();
        int i12 = com.rabbitmq.client.a.f264844o;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.f73840s == 0 ? this.f74027e.a(i10, i11, i13, i12) : this.f74028f.a(i10, i11, i13, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    View J2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10, boolean z11) {
        int i10;
        int iV;
        int i11;
        v2();
        int iV2 = V();
        if (z11) {
            iV = V() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iV2;
            iV = 0;
            i11 = 1;
        }
        int iD = c0Var.d();
        int iN = this.f73842u.n();
        int i12 = this.f73842u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i10) {
            View viewU = U(iV);
            int iW0 = w0(viewU);
            int iG = this.f73842u.g(viewU);
            int iD2 = this.f73842u.d(viewU);
            if (iW0 >= 0 && iW0 < iD) {
                if (!((RecyclerView.q) viewU.getLayoutParams()).g()) {
                    boolean z12 = iD2 <= iN && iG < iN;
                    boolean z13 = iG >= i12 && iD2 > i12;
                    if (!z12 && !z13) {
                        return viewU;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (z12) {
                        view2 = viewU;
                    } else if (view == null) {
                        view = viewU;
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public View O(int i10) {
        int iV = V();
        if (iV == 0) {
            return null;
        }
        int iW0 = i10 - w0(U(0));
        if (iW0 >= 0 && iW0 < iV) {
            View viewU = U(iW0);
            if (w0(viewU) == i10) {
                return viewU;
            }
        }
        return super.O(i10);
    }

    @Deprecated
    protected int O2(RecyclerView.c0 c0Var) {
        if (c0Var.h()) {
            return this.f73842u.o();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public RecyclerView.q P() {
        return new RecyclerView.q(-2, -2);
    }

    public int P2() {
        return this.G;
    }

    public int Q2() {
        return this.f73840s;
    }

    public boolean R2() {
        return this.C;
    }

    public boolean S2() {
        return this.f73844w;
    }

    public boolean T2() {
        return this.f73846y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int U1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f73840s == 1) {
            return 0;
        }
        return g3(i10, xVar, c0Var);
    }

    protected boolean U2() {
        return m0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V1(int i10) {
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        R1();
    }

    public boolean V2() {
        return this.f73847z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int W1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (this.f73840s == 0) {
            return 0;
        }
        return g3(i10, xVar, c0Var);
    }

    void W2(RecyclerView.x xVar, RecyclerView.c0 c0Var, c cVar, b bVar) {
        int iF;
        int i10;
        int i11;
        int i12;
        int iS0;
        int iF2;
        int i13;
        int i14;
        View viewE = cVar.e(xVar);
        if (viewE == null) {
            bVar.f73857b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewE.getLayoutParams();
        if (cVar.f73878l == null) {
            if (this.f73845x == (cVar.f73872f == -1)) {
                j(viewE);
            } else {
                k(viewE, 0);
            }
        } else {
            if (this.f73845x == (cVar.f73872f == -1)) {
                g(viewE);
            } else {
                h(viewE, 0);
            }
        }
        V0(viewE, 0, 0);
        bVar.f73856a = this.f73842u.e(viewE);
        if (this.f73840s == 1) {
            if (U2()) {
                iF2 = D0() - t0();
                iS0 = iF2 - this.f73842u.f(viewE);
            } else {
                iS0 = s0();
                iF2 = this.f73842u.f(viewE) + iS0;
            }
            if (cVar.f73872f == -1) {
                i14 = cVar.f73868b;
                i13 = i14 - bVar.f73856a;
            } else {
                i13 = cVar.f73868b;
                i14 = bVar.f73856a + i13;
            }
            int i15 = iS0;
            i12 = i13;
            i11 = i15;
            iF = i14;
            i10 = iF2;
        } else {
            int iV0 = v0();
            iF = this.f73842u.f(viewE) + iV0;
            if (cVar.f73872f == -1) {
                int i16 = cVar.f73868b;
                i11 = i16 - bVar.f73856a;
                i10 = i16;
            } else {
                int i17 = cVar.f73868b;
                i10 = bVar.f73856a + i17;
                i11 = i17;
            }
            i12 = iV0;
        }
        T0(viewE, i11, i12, i10, iF);
        if (qVar.g() || qVar.f()) {
            bVar.f73858c = true;
        }
        bVar.f73859d = viewE.hasFocusable();
    }

    void Z2(RecyclerView.x xVar, RecyclerView.c0 c0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    @e.a({"UnknownNullness"})
    public PointF c(int i10) {
        if (V() == 0) {
            return null;
        }
        int i11 = (i10 < w0(U(0))) != this.f73845x ? -1 : 1;
        return this.f73840s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void d1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.d1(recyclerView, xVar);
        if (this.C) {
            H1(xVar);
            xVar.d();
        }
    }

    @Override // androidx.recyclerview.widget.o.j
    public void e(@NonNull View view, @NonNull View view2, int i10, int i11) {
        n("Cannot drop a view during a scroll or layout calculation");
        v2();
        f3();
        int iW0 = w0(view);
        int iW1 = w0(view2);
        byte b10 = iW0 < iW1 ? (byte) 1 : (byte) -1;
        if (this.f73845x) {
            if (b10 == 1) {
                h3(iW1, this.f73842u.i() - (this.f73842u.g(view2) + this.f73842u.e(view)));
                return;
            } else {
                h3(iW1, this.f73842u.i() - this.f73842u.d(view2));
                return;
            }
        }
        if (b10 == -1) {
            h3(iW1, this.f73842u.g(view2));
        } else {
            h3(iW1, this.f73842u.d(view2) - this.f73842u.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public View e1(View view, int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int iT2;
        f3();
        if (V() == 0 || (iT2 = t2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        v2();
        r3(iT2, (int) (this.f73842u.o() * N), false, c0Var);
        c cVar = this.f73841t;
        cVar.f73873g = Integer.MIN_VALUE;
        cVar.f73867a = false;
        w2(xVar, cVar, c0Var, true);
        View viewI2 = iT2 == -1 ? I2() : H2();
        View viewN2 = iT2 == -1 ? N2() : M2();
        if (!viewN2.hasFocusable()) {
            return viewI2;
        }
        if (viewI2 == null) {
            return null;
        }
        return viewN2;
    }

    boolean e3() {
        return this.f73842u.l() == 0 && this.f73842u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void f1(AccessibilityEvent accessibilityEvent) {
        super.f1(accessibilityEvent);
        if (V() > 0) {
            accessibilityEvent.setFromIndex(B2());
            accessibilityEvent.setToIndex(E2());
        }
    }

    int g3(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (V() == 0 || i10 == 0) {
            return 0;
        }
        v2();
        this.f73841t.f73867a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        r3(i11, iAbs, true, c0Var);
        c cVar = this.f73841t;
        int iW2 = cVar.f73873g + w2(xVar, cVar, c0Var, false);
        if (iW2 < 0) {
            return 0;
        }
        if (iAbs > iW2) {
            i10 = i11 * iW2;
        }
        this.f73842u.t(-i10);
        this.f73841t.f73877k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean h2() {
        return (k0() == 1073741824 || E0() == 1073741824 || !F0()) ? false : true;
    }

    public void h3(int i10, int i11) {
        this.A = i10;
        this.B = i11;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        R1();
    }

    public void i3(int i10) {
        this.G = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void j2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        s sVar = new s(recyclerView.getContext());
        sVar.q(i10);
        k2(sVar);
    }

    public void j3(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        n(null);
        if (i10 != this.f73840s || this.f73842u == null) {
            z zVarB = z.b(this, i10);
            this.f73842u = zVarB;
            this.E.f73851a = zVarB;
            this.f73840s = i10;
            R1();
        }
    }

    public void k3(boolean z10) {
        this.C = z10;
    }

    public void l3(boolean z10) {
        n(null);
        if (z10 == this.f73844w) {
            return;
        }
        this.f73844w = z10;
        R1();
    }

    public void m3(boolean z10) {
        this.f73847z = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void n(String str) {
        if (this.D == null) {
            super.n(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n2() {
        return this.D == null && this.f73843v == this.f73846y;
    }

    public void n3(boolean z10) {
        n(null);
        if (this.f73846y == z10) {
            return;
        }
        this.f73846y = z10;
        R1();
    }

    protected void o2(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
        int i10;
        int iO2 = O2(c0Var);
        if (this.f73841t.f73872f == -1) {
            i10 = 0;
        } else {
            i10 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i10;
    }

    void p2(RecyclerView.c0 c0Var, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f73870d;
        if (i10 < 0 || i10 >= c0Var.d()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f73873g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s() {
        return this.f73840s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void s1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int iK2;
        int i14;
        View viewO;
        int iG;
        int i15;
        int i16 = -1;
        if (!(this.D == null && this.A == -1) && c0Var.d() == 0) {
            H1(xVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.f73848a;
        }
        v2();
        this.f73841t.f73867a = false;
        f3();
        View viewI0 = i0();
        a aVar = this.E;
        if (!aVar.f73855e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f73854d = this.f73845x ^ this.f73846y;
            q3(xVar, c0Var, aVar2);
            this.E.f73855e = true;
        } else if (viewI0 != null && (this.f73842u.g(viewI0) >= this.f73842u.i() || this.f73842u.d(viewI0) <= this.f73842u.n())) {
            this.E.c(viewI0, w0(viewI0));
        }
        c cVar = this.f73841t;
        cVar.f73872f = cVar.f73877k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        o2(c0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.f73842u.n();
        int iMax2 = Math.max(0, this.H[1]) + this.f73842u.j();
        if (c0Var.j() && (i14 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewO = O(i14)) != null) {
            if (this.f73845x) {
                i15 = this.f73842u.i() - this.f73842u.d(viewO);
                iG = this.B;
            } else {
                iG = this.f73842u.g(viewO) - this.f73842u.n();
                i15 = this.B;
            }
            int i17 = i15 - iG;
            if (i17 > 0) {
                iMax += i17;
            } else {
                iMax2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f73854d ? !this.f73845x : this.f73845x) {
            i16 = 1;
        }
        Z2(xVar, c0Var, aVar3, i16);
        E(xVar);
        this.f73841t.f73879m = e3();
        this.f73841t.f73876j = c0Var.j();
        this.f73841t.f73875i = 0;
        a aVar4 = this.E;
        if (aVar4.f73854d) {
            v3(aVar4);
            c cVar2 = this.f73841t;
            cVar2.f73874h = iMax;
            w2(xVar, cVar2, c0Var, false);
            c cVar3 = this.f73841t;
            i11 = cVar3.f73868b;
            int i18 = cVar3.f73870d;
            int i19 = cVar3.f73869c;
            if (i19 > 0) {
                iMax2 += i19;
            }
            t3(this.E);
            c cVar4 = this.f73841t;
            cVar4.f73874h = iMax2;
            cVar4.f73870d += cVar4.f73871e;
            w2(xVar, cVar4, c0Var, false);
            c cVar5 = this.f73841t;
            i10 = cVar5.f73868b;
            int i20 = cVar5.f73869c;
            if (i20 > 0) {
                u3(i18, i11);
                c cVar6 = this.f73841t;
                cVar6.f73874h = i20;
                w2(xVar, cVar6, c0Var, false);
                i11 = this.f73841t.f73868b;
            }
        } else {
            t3(aVar4);
            c cVar7 = this.f73841t;
            cVar7.f73874h = iMax2;
            w2(xVar, cVar7, c0Var, false);
            c cVar8 = this.f73841t;
            i10 = cVar8.f73868b;
            int i21 = cVar8.f73870d;
            int i22 = cVar8.f73869c;
            if (i22 > 0) {
                iMax += i22;
            }
            v3(this.E);
            c cVar9 = this.f73841t;
            cVar9.f73874h = iMax;
            cVar9.f73870d += cVar9.f73871e;
            w2(xVar, cVar9, c0Var, false);
            c cVar10 = this.f73841t;
            i11 = cVar10.f73868b;
            int i23 = cVar10.f73869c;
            if (i23 > 0) {
                s3(i21, i10);
                c cVar11 = this.f73841t;
                cVar11.f73874h = i23;
                w2(xVar, cVar11, c0Var, false);
                i10 = this.f73841t.f73868b;
            }
        }
        if (V() > 0) {
            if (this.f73845x ^ this.f73846y) {
                int iK3 = K2(i10, xVar, c0Var, true);
                i12 = i11 + iK3;
                i13 = i10 + iK3;
                iK2 = L2(i12, xVar, c0Var, false);
            } else {
                int iL2 = L2(i11, xVar, c0Var, true);
                i12 = i11 + iL2;
                i13 = i10 + iL2;
                iK2 = K2(i13, xVar, c0Var, false);
            }
            i11 = i12 + iK2;
            i10 = i13 + iK2;
        }
        X2(xVar, c0Var, i11, i10);
        if (c0Var.j()) {
            this.E.e();
        } else {
            this.f73842u.u();
        }
        this.f73843v = this.f73846y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t() {
        return this.f73840s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void t1(RecyclerView.c0 c0Var) {
        super.t1(c0Var);
        int i10 = 7 >> 0;
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    int t2(int i10) {
        if (i10 == 1) {
            return (this.f73840s != 1 && U2()) ? 1 : -1;
        }
        if (i10 == 2) {
            if (this.f73840s != 1 && U2()) {
                return -1;
            }
            return 1;
        }
        if (i10 == 17) {
            return this.f73840s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f73840s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f73840s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f73840s == 0 ? 1 : Integer.MIN_VALUE;
    }

    c u2() {
        return new c();
    }

    void v2() {
        if (this.f73841t == null) {
            this.f73841t = u2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void w(int i10, int i11, RecyclerView.c0 c0Var, RecyclerView.p.c cVar) {
        if (this.f73840s != 0) {
            i10 = i11;
        }
        if (V() == 0 || i10 == 0) {
            return;
        }
        v2();
        r3(i10 > 0 ? 1 : -1, Math.abs(i10), true, c0Var);
        p2(c0Var, this.f73841t, cVar);
    }

    int w2(RecyclerView.x xVar, c cVar, RecyclerView.c0 c0Var, boolean z10) {
        int i10 = cVar.f73869c;
        int i11 = cVar.f73873g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f73873g = i11 + i10;
            }
            a3(xVar, cVar);
        }
        int i12 = cVar.f73869c + cVar.f73874h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f73879m && i12 <= 0) || !cVar.c(c0Var)) {
                break;
            }
            bVar.a();
            W2(xVar, c0Var, cVar, bVar);
            if (!bVar.f73857b) {
                cVar.f73868b += bVar.f73856a * cVar.f73872f;
                if (!bVar.f73858c || cVar.f73878l != null || !c0Var.j()) {
                    int i13 = cVar.f73869c;
                    int i14 = bVar.f73856a;
                    cVar.f73869c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f73873g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f73856a;
                    cVar.f73873g = i16;
                    int i17 = cVar.f73869c;
                    if (i17 < 0) {
                        cVar.f73873g = i16 + i17;
                    }
                    a3(xVar, cVar);
                }
                if (z10 && bVar.f73859d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f73869c;
    }

    void w3() {
        V();
        boolean z10 = true;
        if (V() < 1) {
            return;
        }
        int iW0 = w0(U(0));
        int iG = this.f73842u.g(U(0));
        if (this.f73845x) {
            for (int i10 = 1; i10 < V(); i10++) {
                View viewU = U(i10);
                int iW1 = w0(viewU);
                int iG2 = this.f73842u.g(viewU);
                if (iW1 < iW0) {
                    Y2();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    sb2.append(iG2 < iG);
                    throw new RuntimeException(sb2.toString());
                }
                if (iG2 > iG) {
                    Y2();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < V(); i11++) {
            View viewU2 = U(i11);
            int iW2 = w0(viewU2);
            int iG3 = this.f73842u.g(viewU2);
            if (iW2 < iW0) {
                Y2();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detected invalid position. loc invalid? ");
                if (iG3 >= iG) {
                    z10 = false;
                }
                sb3.append(z10);
                throw new RuntimeException(sb3.toString());
            }
            if (iG3 < iG) {
                Y2();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void x(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.D;
        if (savedState == null || !savedState.a()) {
            f3();
            z10 = this.f73845x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z10 = savedState2.f73850c;
            i11 = savedState2.f73848a;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public void x1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.D = savedState;
            if (this.A != -1) {
                savedState.b();
            }
            R1();
        }
    }

    public int x2() {
        View viewG2 = G2(0, V(), true, false);
        if (viewG2 == null) {
            return -1;
        }
        return w0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int y(RecyclerView.c0 c0Var) {
        return q2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public Parcelable y1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (V() <= 0) {
            savedState.b();
            return savedState;
        }
        v2();
        boolean z10 = this.f73843v ^ this.f73845x;
        savedState.f73850c = z10;
        if (z10) {
            View viewM2 = M2();
            savedState.f73849b = this.f73842u.i() - this.f73842u.d(viewM2);
            savedState.f73848a = w0(viewM2);
            return savedState;
        }
        View viewN2 = N2();
        savedState.f73848a = w0(viewN2);
        savedState.f73849b = this.f73842u.g(viewN2) - this.f73842u.n();
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @e.a({"UnknownNullness"})
    public int z(RecyclerView.c0 c0Var) {
        return r2(c0Var);
    }

    View z2(boolean z10, boolean z11) {
        return this.f73845x ? G2(0, V(), z10, z11) : G2(V() - 1, -1, z10, z11);
    }

    public LinearLayoutManager(@e.a({"UnknownNullness"}) Context context, int i10, boolean z10) {
        this.f73840s = 1;
        this.f73844w = false;
        this.f73845x = false;
        this.f73846y = false;
        this.f73847z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        j3(i10);
        l3(z10);
    }

    @e.a({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f73840s = 1;
        this.f73844w = false;
        this.f73845x = false;
        this.f73846y = false;
        this.f73847z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d dVarX0 = RecyclerView.p.x0(context, attributeSet, i10, i11);
        j3(dVarX0.f74043a);
        l3(dVarX0.f74045c);
        n3(dVarX0.f74046d);
    }
}
