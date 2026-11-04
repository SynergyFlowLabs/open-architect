package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.b0.b {
    private static final String Q = "StaggeredGridLManager";
    static final boolean R = false;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 0;

    @Deprecated
    public static final int V = 1;
    public static final int W = 2;
    static final int X = Integer.MIN_VALUE;
    private static final float Y = 0.33333334f;
    private BitSet B;
    private boolean G;
    private boolean H;
    private SavedState I;
    private int J;
    private int[] O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    d[] f74071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    z f74072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    z f74073v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f74074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f74075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    private final r f74076y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f74070s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f74077z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    LazySpanLookup E = new LazySpanLookup();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    @e.a({"BanParcelableUsage"})
    @b1({b1.a.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f74087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f74088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f74089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f74090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        List<LazySpanLookup.FullSpanItem> f74091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f74092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f74093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f74094j;

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

        void a() {
            this.f74088d = null;
            this.f74087c = 0;
            this.f74085a = -1;
            this.f74086b = -1;
        }

        void b() {
            this.f74088d = null;
            this.f74087c = 0;
            this.f74089e = 0;
            this.f74090f = null;
            this.f74091g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f74085a);
            parcel.writeInt(this.f74086b);
            parcel.writeInt(this.f74087c);
            if (this.f74087c > 0) {
                parcel.writeIntArray(this.f74088d);
            }
            parcel.writeInt(this.f74089e);
            if (this.f74089e > 0) {
                parcel.writeIntArray(this.f74090f);
            }
            parcel.writeInt(this.f74092h ? 1 : 0);
            parcel.writeInt(this.f74093i ? 1 : 0);
            parcel.writeInt(this.f74094j ? 1 : 0);
            parcel.writeList(this.f74091g);
        }

        SavedState(Parcel parcel) {
            this.f74085a = parcel.readInt();
            this.f74086b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f74087c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f74088d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f74089e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f74090f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f74092h = parcel.readInt() == 1;
            this.f74093i = parcel.readInt() == 1;
            this.f74094j = parcel.readInt() == 1;
            this.f74091g = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f74087c = savedState.f74087c;
            this.f74085a = savedState.f74085a;
            this.f74086b = savedState.f74086b;
            this.f74088d = savedState.f74088d;
            this.f74089e = savedState.f74089e;
            this.f74090f = savedState.f74090f;
            this.f74092h = savedState.f74092h;
            this.f74093i = savedState.f74093i;
            this.f74094j = savedState.f74094j;
            this.f74091g = savedState.f74091g;
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.u2();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f74096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f74098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f74099d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f74100e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f74101f;

        b() {
            c();
        }

        void a() {
            this.f74097b = this.f74098c ? StaggeredGridLayoutManager.this.f74072u.i() : StaggeredGridLayoutManager.this.f74072u.n();
        }

        void b(int i10) {
            if (this.f74098c) {
                this.f74097b = StaggeredGridLayoutManager.this.f74072u.i() - i10;
            } else {
                this.f74097b = StaggeredGridLayoutManager.this.f74072u.n() + i10;
            }
        }

        void c() {
            this.f74096a = -1;
            this.f74097b = Integer.MIN_VALUE;
            this.f74098c = false;
            this.f74099d = false;
            this.f74100e = false;
            int[] iArr = this.f74101f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f74101f;
            if (iArr == null || iArr.length < length) {
                this.f74101f = new int[StaggeredGridLayoutManager.this.f74071t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f74101f[i10] = dVarArr[i10].u(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f74103g = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d f74104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f74105f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int j() {
            d dVar = this.f74104e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f74111e;
        }

        public boolean k() {
            return this.f74105f;
        }

        public void l(boolean z10) {
            this.f74105f = z10;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(RecyclerView.q qVar) {
            super(qVar);
        }
    }

    class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f74106g = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList<View> f74107a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74108b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f74109c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f74110d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f74111e;

        d(int i10) {
            this.f74111e = i10;
        }

        void A(int i10) {
            this.f74108b = i10;
            this.f74109c = i10;
        }

        void a(View view) {
            c cVarS = s(view);
            cVarS.f74104e = this;
            this.f74107a.add(view);
            this.f74109c = Integer.MIN_VALUE;
            if (this.f74107a.size() == 1) {
                this.f74108b = Integer.MIN_VALUE;
            }
            if (cVarS.g() || cVarS.f()) {
                this.f74110d += StaggeredGridLayoutManager.this.f74072u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int iQ = z10 ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (iQ == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iQ >= StaggeredGridLayoutManager.this.f74072u.i()) {
                if (z10 || iQ <= StaggeredGridLayoutManager.this.f74072u.n()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iQ += i10;
                    }
                    this.f74109c = iQ;
                    this.f74108b = iQ;
                }
            }
        }

        void c() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            ArrayList<View> arrayList = this.f74107a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarS = s(view);
            this.f74109c = StaggeredGridLayoutManager.this.f74072u.d(view);
            if (cVarS.f74105f && (fullSpanItemF = StaggeredGridLayoutManager.this.E.f(cVarS.d())) != null && fullSpanItemF.f74082b == 1) {
                this.f74109c += fullSpanItemF.a(this.f74111e);
            }
        }

        void d() {
            LazySpanLookup.FullSpanItem fullSpanItemF;
            View view = this.f74107a.get(0);
            c cVarS = s(view);
            this.f74108b = StaggeredGridLayoutManager.this.f74072u.g(view);
            if (cVarS.f74105f && (fullSpanItemF = StaggeredGridLayoutManager.this.E.f(cVarS.d())) != null && fullSpanItemF.f74082b == -1) {
                this.f74108b -= fullSpanItemF.a(this.f74111e);
            }
        }

        void e() {
            this.f74107a.clear();
            v();
            this.f74110d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f74077z ? n(this.f74107a.size() - 1, -1, true) : n(0, this.f74107a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f74077z ? m(this.f74107a.size() - 1, -1, true) : m(0, this.f74107a.size(), true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.f74077z ? n(this.f74107a.size() - 1, -1, false) : n(0, this.f74107a.size(), false);
        }

        public int i() {
            return StaggeredGridLayoutManager.this.f74077z ? n(0, this.f74107a.size(), true) : n(this.f74107a.size() - 1, -1, true);
        }

        public int j() {
            return StaggeredGridLayoutManager.this.f74077z ? m(0, this.f74107a.size(), true) : m(this.f74107a.size() - 1, -1, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.f74077z ? n(0, this.f74107a.size(), false) : n(this.f74107a.size() - 1, -1, false);
        }

        int l(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iN = StaggeredGridLayoutManager.this.f74072u.n();
            int i12 = StaggeredGridLayoutManager.this.f74072u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f74107a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f74072u.g(view);
                int iD = StaggeredGridLayoutManager.this.f74072u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iN : iD >= iN) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iN && iD <= i12) {
                            return StaggeredGridLayoutManager.this.w0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.w0(view);
                        }
                        if (iG < iN || iD > i12) {
                            return StaggeredGridLayoutManager.this.w0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int m(int i10, int i11, boolean z10) {
            return l(i10, i11, false, false, z10);
        }

        int n(int i10, int i11, boolean z10) {
            return l(i10, i11, z10, true, false);
        }

        public int o() {
            return this.f74110d;
        }

        int p() {
            int i10 = this.f74109c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f74109c;
        }

        int q(int i10) {
            int i11 = this.f74109c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f74107a.size() == 0) {
                return i10;
            }
            c();
            return this.f74109c;
        }

        public View r(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f74107a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f74107a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f74077z && staggeredGridLayoutManager.w0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f74077z && staggeredGridLayoutManager2.w0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f74107a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = this.f74107a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f74077z && staggeredGridLayoutManager3.w0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f74077z && staggeredGridLayoutManager4.w0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        c s(View view) {
            return (c) view.getLayoutParams();
        }

        int t() {
            int i10 = this.f74108b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f74108b;
        }

        int u(int i10) {
            int i11 = this.f74108b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f74107a.size() == 0) {
                return i10;
            }
            d();
            return this.f74108b;
        }

        void v() {
            this.f74108b = Integer.MIN_VALUE;
            this.f74109c = Integer.MIN_VALUE;
        }

        void w(int i10) {
            int i11 = this.f74108b;
            if (i11 != Integer.MIN_VALUE) {
                this.f74108b = i11 + i10;
            }
            int i12 = this.f74109c;
            if (i12 != Integer.MIN_VALUE) {
                this.f74109c = i12 + i10;
            }
        }

        void x() {
            int size = this.f74107a.size();
            View viewRemove = this.f74107a.remove(size - 1);
            c cVarS = s(viewRemove);
            cVarS.f74104e = null;
            if (cVarS.g() || cVarS.f()) {
                this.f74110d -= StaggeredGridLayoutManager.this.f74072u.e(viewRemove);
            }
            if (size == 1) {
                this.f74108b = Integer.MIN_VALUE;
            }
            this.f74109c = Integer.MIN_VALUE;
        }

        void y() {
            View viewRemove = this.f74107a.remove(0);
            c cVarS = s(viewRemove);
            cVarS.f74104e = null;
            if (this.f74107a.size() == 0) {
                this.f74109c = Integer.MIN_VALUE;
            }
            if (cVarS.g() || cVarS.f()) {
                this.f74110d -= StaggeredGridLayoutManager.this.f74072u.e(viewRemove);
            }
            this.f74108b = Integer.MIN_VALUE;
        }

        void z(View view) {
            c cVarS = s(view);
            cVarS.f74104e = this;
            this.f74107a.add(0, view);
            this.f74108b = Integer.MIN_VALUE;
            if (this.f74107a.size() == 1) {
                this.f74109c = Integer.MIN_VALUE;
            }
            if (cVarS.g() || cVarS.f()) {
                this.f74110d += StaggeredGridLayoutManager.this.f74072u.e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        int i12 = 1 | 2;
        RecyclerView.p.d dVarX0 = RecyclerView.p.x0(context, attributeSet, i10, i11);
        t3(dVarX0.f74043a);
        v3(dVarX0.f74044b);
        u3(dVarX0.f74045c);
        this.f74076y = new r();
        C2();
    }

    private LazySpanLookup.FullSpanItem A2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f74083c = new int[this.f74070s];
        for (int i11 = 0; i11 < this.f74070s; i11++) {
            fullSpanItem.f74083c[i11] = i10 - this.f74071t[i11].q(i10);
        }
        return fullSpanItem;
    }

    private void A3(int i10, RecyclerView.c0 c0Var) {
        int iO;
        int iO2;
        int iG;
        r rVar = this.f74076y;
        boolean z10 = false;
        rVar.f74537b = 0;
        rVar.f74538c = i10;
        if (!Q0() || (iG = c0Var.g()) == -1) {
            iO = 0;
            iO2 = 0;
        } else {
            if (this.A == (iG < i10)) {
                iO = this.f74072u.o();
                iO2 = 0;
            } else {
                iO2 = this.f74072u.o();
                iO = 0;
            }
        }
        if (Z()) {
            this.f74076y.f74541f = this.f74072u.n() - iO2;
            this.f74076y.f74542g = this.f74072u.i() + iO;
        } else {
            this.f74076y.f74542g = this.f74072u.h() + iO;
            this.f74076y.f74541f = -iO2;
        }
        r rVar2 = this.f74076y;
        rVar2.f74543h = false;
        rVar2.f74536a = true;
        if (this.f74072u.l() == 0 && this.f74072u.h() == 0) {
            z10 = true;
        }
        rVar2.f74544i = z10;
    }

    private LazySpanLookup.FullSpanItem B2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.f74083c = new int[this.f74070s];
        int i11 = 4 << 0;
        for (int i12 = 0; i12 < this.f74070s; i12++) {
            fullSpanItem.f74083c[i12] = this.f74071t[i12].u(i10) - i10;
        }
        return fullSpanItem;
    }

    private void C2() {
        this.f74072u = z.b(this, this.f74074w);
        this.f74073v = z.b(this, 1 - this.f74074w);
    }

    private void C3(d dVar, int i10, int i11) {
        int iO = dVar.o();
        if (i10 == -1) {
            if (dVar.t() + iO <= i11) {
                this.B.set(dVar.f74111e, false);
            }
        } else if (dVar.p() - iO >= i11) {
            this.B.set(dVar.f74111e, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int D2(RecyclerView.x xVar, r rVar, RecyclerView.c0 c0Var) {
        int i10;
        int iS2;
        d dVarW2;
        int iV2;
        int iE;
        int iN;
        int iE2;
        ?? r10;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        ?? r11 = 0;
        staggeredGridLayoutManager.B.set(0, staggeredGridLayoutManager.f74070s, true);
        if (staggeredGridLayoutManager.f74076y.f74544i) {
            i10 = rVar.f74540e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = rVar.f74540e == 1 ? rVar.f74542g + rVar.f74537b : rVar.f74541f - rVar.f74537b;
        }
        int i11 = i10;
        staggeredGridLayoutManager.w3(rVar.f74540e, i11);
        int i12 = staggeredGridLayoutManager.A ? staggeredGridLayoutManager.f74072u.i() : staggeredGridLayoutManager.f74072u.n();
        boolean z10 = false;
        ?? r12 = staggeredGridLayoutManager;
        while (rVar.a(c0Var) && (r12.f74076y.f74544i || !r12.B.isEmpty())) {
            View viewB = rVar.b(xVar);
            c cVar = (c) viewB.getLayoutParams();
            int iD = cVar.d();
            int iG = r12.E.g(iD);
            ?? r13 = iG == -1 ? 1 : r11;
            if (r13 != 0) {
                dVarW2 = cVar.f74105f ? r12.f74071t[r11] : r12.W2(rVar);
                r12.E.n(iD, dVarW2);
            } else {
                dVarW2 = r12.f74071t[iG];
            }
            d dVar = dVarW2;
            cVar.f74104e = dVar;
            if (rVar.f74540e == 1) {
                r12.j(viewB);
            } else {
                r12.k(viewB, r11);
            }
            r12.f3(viewB, cVar, r11);
            if (rVar.f74540e == 1) {
                iE = cVar.f74105f ? r12.S2(i12) : dVar.q(i12);
                iV2 = r12.f74072u.e(viewB) + iE;
                if (r13 != 0 && cVar.f74105f) {
                    LazySpanLookup.FullSpanItem fullSpanItemA2 = r12.A2(iE);
                    fullSpanItemA2.f74082b = -1;
                    fullSpanItemA2.f74081a = iD;
                    r12.E.a(fullSpanItemA2);
                }
            } else {
                iV2 = cVar.f74105f ? r12.V2(i12) : dVar.u(i12);
                iE = iV2 - r12.f74072u.e(viewB);
                if (r13 != 0 && cVar.f74105f) {
                    LazySpanLookup.FullSpanItem fullSpanItemB2 = r12.B2(iV2);
                    fullSpanItemB2.f74082b = 1;
                    fullSpanItemB2.f74081a = iD;
                    r12.E.a(fullSpanItemB2);
                }
            }
            if (cVar.f74105f && rVar.f74539d == -1) {
                if (r13 != 0) {
                    r12.M = true;
                } else {
                    if (!(rVar.f74540e == 1 ? r12.q2() : r12.r2())) {
                        LazySpanLookup.FullSpanItem fullSpanItemF = r12.E.f(iD);
                        if (fullSpanItemF != null) {
                            fullSpanItemF.f74084d = true;
                        }
                        r12.M = true;
                    }
                }
            }
            r12.s2(viewB, cVar, rVar);
            if (r12.d3() && r12.f74074w == 1) {
                iE2 = cVar.f74105f ? r12.f74073v.i() : r12.f74073v.i() - (((r12.f74070s - 1) - dVar.f74111e) * r12.f74075x);
                iN = iE2 - r12.f74073v.e(viewB);
            } else {
                iN = cVar.f74105f ? r12.f74073v.n() : (dVar.f74111e * r12.f74075x) + r12.f74073v.n();
                iE2 = r12.f74073v.e(viewB) + iN;
            }
            int i13 = iE2;
            int i14 = iN;
            if (r12.f74074w == 1) {
                r12.T0(viewB, i14, iE, i13, iV2);
                r10 = this;
            } else {
                r12.T0(viewB, iE, i14, iV2, i13);
                r10 = r12;
            }
            if (cVar.f74105f) {
                r10.w3(r10.f74076y.f74540e, i11);
            } else {
                r10.C3(dVar, r10.f74076y.f74540e, i11);
            }
            r10.k3(xVar, r10.f74076y);
            if (r10.f74076y.f74543h && viewB.hasFocusable()) {
                if (cVar.f74105f) {
                    r10.B.clear();
                } else {
                    r10.B.set(dVar.f74111e, false);
                }
            }
            z10 = true;
            r11 = 0;
            r12 = r10;
        }
        if (!z10) {
            r12.k3(xVar, r12.f74076y);
        }
        if (r12.f74076y.f74540e == -1) {
            iS2 = r12.f74072u.n() - r12.V2(r12.f74072u.n());
        } else {
            iS2 = r12.S2(r12.f74072u.i()) - r12.f74072u.i();
        }
        if (iS2 > 0) {
            return Math.min(rVar.f74537b, iS2);
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:7:0x0008  */
    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    private int D3(int i10, int i11, int i12) {
        int mode;
        if (i11 != 0) {
            mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                }
            }
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
        }
        if (i12 != 0) {
            mode = View.MeasureSpec.getMode(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                }
            }
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
        }
        return i10;
    }

    private int F2(int i10) {
        int iV = V();
        for (int i11 = 0; i11 < iV; i11++) {
            int iW0 = w0(U(i11));
            if (iW0 >= 0 && iW0 < i10) {
                return iW0;
            }
        }
        return 0;
    }

    private int L2(int i10) {
        for (int iV = V() - 1; iV >= 0; iV--) {
            int iW0 = w0(U(iV));
            if (iW0 >= 0 && iW0 < i10) {
                return iW0;
            }
        }
        return 0;
    }

    private void N2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int i10;
        int iS2 = S2(Integer.MIN_VALUE);
        if (iS2 != Integer.MIN_VALUE && (i10 = this.f74072u.i() - iS2) > 0) {
            int i11 = i10 - (-p3(-i10, xVar, c0Var));
            if (z10 && i11 > 0) {
                this.f74072u.t(i11);
            }
        }
    }

    private void O2(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        int iN;
        int iV2 = V2(Integer.MAX_VALUE);
        if (iV2 != Integer.MAX_VALUE && (iN = iV2 - this.f74072u.n()) > 0) {
            int iP3 = iN - p3(iN, xVar, c0Var);
            if (!z10 || iP3 <= 0) {
                return;
            }
            this.f74072u.t(-iP3);
        }
    }

    private int S2(int i10) {
        int iQ = this.f74071t[0].q(i10);
        for (int i11 = 1; i11 < this.f74070s; i11++) {
            int iQ2 = this.f74071t[i11].q(i10);
            if (iQ2 > iQ) {
                iQ = iQ2;
            }
        }
        return iQ;
    }

    private int T2(int i10) {
        int iU = this.f74071t[0].u(i10);
        for (int i11 = 1; i11 < this.f74070s; i11++) {
            int iU2 = this.f74071t[i11].u(i10);
            if (iU2 > iU) {
                iU = iU2;
            }
        }
        return iU;
    }

    private int U2(int i10) {
        int iQ = this.f74071t[0].q(i10);
        for (int i11 = 1; i11 < this.f74070s; i11++) {
            int iQ2 = this.f74071t[i11].q(i10);
            if (iQ2 < iQ) {
                iQ = iQ2;
            }
        }
        return iQ;
    }

    private int V2(int i10) {
        int iU = this.f74071t[0].u(i10);
        for (int i11 = 1; i11 < this.f74070s; i11++) {
            int iU2 = this.f74071t[i11].u(i10);
            if (iU2 < iU) {
                iU = iU2;
            }
        }
        return iU;
    }

    private d W2(r rVar) {
        int i10;
        int i11;
        int i12;
        if (h3(rVar.f74540e)) {
            i11 = this.f74070s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f74070s;
            i11 = 0;
            i12 = 1;
        }
        d dVar = null;
        if (rVar.f74540e == 1) {
            int iN = this.f74072u.n();
            int i13 = Integer.MAX_VALUE;
            while (i11 != i10) {
                d dVar2 = this.f74071t[i11];
                int iQ = dVar2.q(iN);
                if (iQ < i13) {
                    dVar = dVar2;
                    i13 = iQ;
                }
                i11 += i12;
            }
            return dVar;
        }
        int i14 = this.f74072u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            d dVar3 = this.f74071t[i11];
            int iU = dVar3.u(i14);
            if (iU > i15) {
                dVar = dVar3;
                i15 = iU;
            }
            i11 += i12;
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    private void a3(int i10, int i11, int i12) {
        int i13;
        int i14;
        int iR2;
        int iR3 = this.A ? R2() : P2();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            this.E.h(i14);
            if (i12 != 1) {
                this.E.j(i10, i11);
            } else if (i12 != 2) {
                this.E.k(i10, i11);
            } else if (i12 != 8) {
                this.E.k(i10, 1);
                this.E.j(i11, 1);
            }
            if (i13 <= iR3) {
                return;
            }
            if (this.A) {
                iR2 = P2();
            } else {
                iR2 = R2();
            }
            if (i14 <= iR2) {
                R1();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        this.E.h(i14);
        if (i12 != 1) {
            this.E.j(i10, i11);
        } else if (i12 != 2) {
            this.E.k(i10, i11);
        } else if (i12 != 8) {
            this.E.k(i10, 1);
            this.E.j(i11, 1);
        }
        if (i13 <= iR3) {
            return;
        }
        if (this.A) {
            iR2 = P2();
        } else {
            iR2 = R2();
        }
        if (i14 <= iR2) {
            R1();
        }
    }

    private void e3(View view, int i10, int i11, boolean z10) {
        r(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int iD3 = D3(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int iD4 = D3(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? i2(view, iD3, iD4, cVar) : g2(view, iD3, iD4, cVar)) {
            view.measure(iD3, iD4);
        }
    }

    private void f3(View view, c cVar, boolean z10) {
        if (cVar.f74105f) {
            if (this.f74074w == 1) {
                e3(view, this.J, RecyclerView.p.W(j0(), k0(), v0() + q0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                e3(view, RecyclerView.p.W(D0(), E0(), s0() + t0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
        }
        if (this.f74074w == 1) {
            e3(view, RecyclerView.p.W(this.f74075x, E0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.W(j0(), k0(), v0() + q0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            e3(view, RecyclerView.p.W(D0(), E0(), s0() + t0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.W(this.f74075x, k0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0186  */
    private void g3(RecyclerView.x xVar, RecyclerView.c0 c0Var, boolean z10) {
        boolean z11;
        SavedState savedState;
        b bVar = this.L;
        if (!(this.I == null && this.C == -1) && c0Var.d() == 0) {
            H1(xVar);
            bVar.c();
            return;
        }
        boolean z12 = (bVar.f74100e && this.C == -1 && this.I == null) ? false : true;
        if (z12) {
            bVar.c();
            if (this.I != null) {
                p2(bVar);
            } else {
                o3();
                bVar.f74098c = this.A;
            }
            z3(c0Var, bVar);
            bVar.f74100e = true;
        }
        if (this.I == null && this.C == -1 && (bVar.f74098c != this.G || d3() != this.H)) {
            this.E.b();
            bVar.f74099d = true;
        }
        if (V() > 0 && ((savedState = this.I) == null || savedState.f74087c < 1)) {
            if (bVar.f74099d) {
                for (int i10 = 0; i10 < this.f74070s; i10++) {
                    this.f74071t[i10].e();
                    int i11 = bVar.f74097b;
                    if (i11 != Integer.MIN_VALUE) {
                        this.f74071t[i10].A(i11);
                    }
                }
            } else if (z12 || this.L.f74101f == null) {
                for (int i12 = 0; i12 < this.f74070s; i12++) {
                    this.f74071t[i12].b(this.A, bVar.f74097b);
                }
                this.L.d(this.f74071t);
            } else {
                for (int i13 = 0; i13 < this.f74070s; i13++) {
                    d dVar = this.f74071t[i13];
                    dVar.e();
                    dVar.A(this.L.f74101f[i13]);
                }
            }
        }
        E(xVar);
        this.f74076y.f74536a = false;
        this.M = false;
        B3(this.f74073v.o());
        A3(bVar.f74096a, c0Var);
        if (bVar.f74098c) {
            s3(-1);
            D2(xVar, this.f74076y, c0Var);
            s3(1);
            r rVar = this.f74076y;
            rVar.f74538c = bVar.f74096a + rVar.f74539d;
            D2(xVar, rVar, c0Var);
        } else {
            s3(1);
            D2(xVar, this.f74076y, c0Var);
            s3(-1);
            r rVar2 = this.f74076y;
            rVar2.f74538c = bVar.f74096a + rVar2.f74539d;
            D2(xVar, rVar2, c0Var);
        }
        n3();
        if (V() > 0) {
            if (this.A) {
                N2(xVar, c0Var, true);
                O2(xVar, c0Var, false);
            } else {
                O2(xVar, c0Var, true);
                N2(xVar, c0Var, false);
            }
        }
        if (z10 && !c0Var.j() && this.F != 0 && V() > 0 && (this.M || b3() != null)) {
            L1(this.P);
            z11 = u2();
        }
        if (c0Var.j()) {
            this.L.c();
        }
        this.G = bVar.f74098c;
        this.H = d3();
        if (z11) {
            this.L.c();
            g3(xVar, c0Var, false);
        }
    }

    private boolean h3(int i10) {
        if (this.f74074w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == d3();
    }

    private void j3(View view) {
        for (int i10 = this.f74070s - 1; i10 >= 0; i10--) {
            this.f74071t[i10].z(view);
        }
    }

    private void k3(RecyclerView.x xVar, r rVar) {
        int iMin;
        if (rVar.f74536a && !rVar.f74544i) {
            if (rVar.f74537b == 0) {
                if (rVar.f74540e == -1) {
                    l3(xVar, rVar.f74542g);
                    return;
                } else {
                    m3(xVar, rVar.f74541f);
                    return;
                }
            }
            if (rVar.f74540e == -1) {
                int i10 = rVar.f74541f;
                int iT2 = i10 - T2(i10);
                l3(xVar, iT2 < 0 ? rVar.f74542g : rVar.f74542g - Math.min(iT2, rVar.f74537b));
            } else {
                int iU2 = U2(rVar.f74542g) - rVar.f74542g;
                if (iU2 < 0) {
                    iMin = rVar.f74541f;
                } else {
                    iMin = Math.min(iU2, rVar.f74537b) + rVar.f74541f;
                }
                m3(xVar, iMin);
            }
        }
    }

    private void l3(RecyclerView.x xVar, int i10) {
        for (int iV = V() - 1; iV >= 0; iV--) {
            View viewU = U(iV);
            if (this.f74072u.g(viewU) < i10 || this.f74072u.r(viewU) < i10) {
                return;
            }
            c cVar = (c) viewU.getLayoutParams();
            if (cVar.f74105f) {
                int i11 = 6 << 0;
                for (int i12 = 0; i12 < this.f74070s; i12++) {
                    if (this.f74071t[i12].f74107a.size() == 1) {
                        return;
                    }
                }
                for (int i13 = 0; i13 < this.f74070s; i13++) {
                    this.f74071t[i13].x();
                }
            } else if (cVar.f74104e.f74107a.size() == 1) {
                return;
            } else {
                cVar.f74104e.x();
            }
            J1(viewU, xVar);
        }
    }

    private void m3(RecyclerView.x xVar, int i10) {
        loop0: while (V() > 0) {
            View viewU = U(0);
            if (this.f74072u.d(viewU) > i10 || this.f74072u.q(viewU) > i10) {
                break;
            }
            c cVar = (c) viewU.getLayoutParams();
            if (cVar.f74105f) {
                for (int i11 = 0; i11 < this.f74070s; i11++) {
                    if (this.f74071t[i11].f74107a.size() == 1) {
                        break loop0;
                    }
                }
                for (int i12 = 0; i12 < this.f74070s; i12++) {
                    this.f74071t[i12].y();
                }
                J1(viewU, xVar);
            } else {
                if (cVar.f74104e.f74107a.size() == 1) {
                    break;
                }
                cVar.f74104e.y();
                J1(viewU, xVar);
            }
        }
    }

    private void n3() {
        if (this.f74073v.l() != 1073741824) {
            int iV = V();
            float fMax = 0.0f;
            for (int i10 = 0; i10 < iV; i10++) {
                View viewU = U(i10);
                float fE = this.f74073v.e(viewU);
                if (fE >= fMax) {
                    if (((c) viewU.getLayoutParams()).k()) {
                        fE = (fE * 1.0f) / this.f74070s;
                    }
                    fMax = Math.max(fMax, fE);
                }
            }
            int i11 = this.f74075x;
            int iRound = Math.round(fMax * this.f74070s);
            if (this.f74073v.l() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f74073v.o());
            }
            B3(iRound);
            if (this.f74075x != i11) {
                for (int i12 = 0; i12 < iV; i12++) {
                    View viewU2 = U(i12);
                    c cVar = (c) viewU2.getLayoutParams();
                    if (!cVar.f74105f) {
                        if (d3() && this.f74074w == 1) {
                            int i13 = this.f74070s;
                            int i14 = cVar.f74104e.f74111e;
                            viewU2.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f74075x) - ((-((i13 - 1) - i14)) * i11));
                        } else {
                            int i15 = cVar.f74104e.f74111e;
                            int i16 = this.f74075x * i15;
                            int i17 = i15 * i11;
                            if (this.f74074w == 1) {
                                viewU2.offsetLeftAndRight(i16 - i17);
                            } else {
                                viewU2.offsetTopAndBottom(i16 - i17);
                            }
                        }
                    }
                }
            }
        }
    }

    private void o2(View view) {
        for (int i10 = this.f74070s - 1; i10 >= 0; i10--) {
            this.f74071t[i10].a(view);
        }
    }

    private void o3() {
        if (this.f74074w == 1 || !d3()) {
            this.A = this.f74077z;
        } else {
            this.A = !this.f74077z;
        }
    }

    private void p2(b bVar) {
        SavedState savedState = this.I;
        int i10 = savedState.f74087c;
        if (i10 > 0) {
            if (i10 == this.f74070s) {
                for (int i11 = 0; i11 < this.f74070s; i11++) {
                    this.f74071t[i11].e();
                    SavedState savedState2 = this.I;
                    int i12 = savedState2.f74088d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.f74093i ? this.f74072u.i() : this.f74072u.n();
                    }
                    this.f74071t[i11].A(i12);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.f74085a = savedState3.f74086b;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.f74094j;
        u3(savedState4.f74092h);
        o3();
        SavedState savedState5 = this.I;
        int i13 = savedState5.f74085a;
        if (i13 != -1) {
            this.C = i13;
            bVar.f74098c = savedState5.f74093i;
        } else {
            bVar.f74098c = this.A;
        }
        if (savedState5.f74089e > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f74079a = savedState5.f74090f;
            lazySpanLookup.f74080b = savedState5.f74091g;
        }
    }

    private void s2(View view, c cVar, r rVar) {
        if (rVar.f74540e == 1) {
            if (cVar.f74105f) {
                o2(view);
                return;
            } else {
                cVar.f74104e.a(view);
                return;
            }
        }
        if (cVar.f74105f) {
            j3(view);
        } else {
            cVar.f74104e.z(view);
        }
    }

    private void s3(int i10) {
        r rVar = this.f74076y;
        rVar.f74540e = i10;
        int i11 = 1;
        if (this.A != (i10 == -1)) {
            i11 = -1;
        }
        rVar.f74539d = i11;
    }

    private int t2(int i10) {
        if (V() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < P2()) != this.A ? -1 : 1;
    }

    private boolean v2(d dVar) {
        boolean z10;
        if (!this.A) {
            if (dVar.t() > this.f74072u.n()) {
                z10 = dVar.s(dVar.f74107a.get(0)).f74105f;
                return !z10;
            }
            return false;
        }
        if (dVar.p() < this.f74072u.i()) {
            ArrayList<View> arrayList = dVar.f74107a;
            z10 = dVar.s(arrayList.get(arrayList.size() - 1)).f74105f;
            return !z10;
        }
        return false;
    }

    private int w2(RecyclerView.c0 c0Var) {
        if (V() == 0) {
            return 0;
        }
        return c0.a(c0Var, this.f74072u, H2(!this.N), G2(!this.N), this, this.N);
    }

    private void w3(int i10, int i11) {
        for (int i12 = 0; i12 < this.f74070s; i12++) {
            if (!this.f74071t[i12].f74107a.isEmpty()) {
                C3(this.f74071t[i12], i10, i11);
            }
        }
    }

    private int x2(RecyclerView.c0 c0Var) {
        if (V() == 0) {
            return 0;
        }
        return c0.b(c0Var, this.f74072u, H2(!this.N), G2(!this.N), this, this.N, this.A);
    }

    private boolean x3(RecyclerView.c0 c0Var, b bVar) {
        bVar.f74096a = this.G ? L2(c0Var.d()) : F2(c0Var.d());
        bVar.f74097b = Integer.MIN_VALUE;
        return true;
    }

    private int y2(RecyclerView.c0 c0Var) {
        if (V() == 0) {
            return 0;
        }
        return c0.c(c0Var, this.f74072u, H2(!this.N), G2(!this.N), this, this.N);
    }

    private int z2(int i10) {
        if (i10 == 1) {
            return (this.f74074w != 1 && d3()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f74074w != 1 && d3()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f74074w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f74074w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f74074w == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f74074w == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.c0 c0Var) {
        return y2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.c0 c0Var) {
        return w2(c0Var);
    }

    void B3(int i10) {
        this.f74075x = i10 / this.f74070s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f74073v.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int C(RecyclerView.c0 c0Var) {
        return x2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D(RecyclerView.c0 c0Var) {
        return y2(c0Var);
    }

    public int[] E2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f74070s];
        } else if (iArr.length < this.f74070s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f74070s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f74070s; i10++) {
            iArr[i10] = this.f74071t[i10].f();
        }
        return iArr;
    }

    View G2(boolean z10) {
        int iN = this.f74072u.n();
        int i10 = this.f74072u.i();
        View view = null;
        for (int iV = V() - 1; iV >= 0; iV--) {
            View viewU = U(iV);
            int iG = this.f74072u.g(viewU);
            int iD = this.f74072u.d(viewU);
            if (iD > iN && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    View H2(boolean z10) {
        int iN = this.f74072u.n();
        int i10 = this.f74072u.i();
        int iV = V();
        View view = null;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = U(i11);
            int iG = this.f74072u.g(viewU);
            if (this.f74072u.d(viewU) > iN && iG < i10) {
                if (iG >= iN || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    int I2() {
        View viewG2 = this.A ? G2(true) : H2(true);
        if (viewG2 == null) {
            return -1;
        }
        return w0(viewG2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean J0() {
        return this.F != 0;
    }

    public int[] J2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f74070s];
        } else if (iArr.length < this.f74070s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f74070s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f74070s; i10++) {
            iArr[i10] = this.f74071t[i10].h();
        }
        return iArr;
    }

    public int[] K2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f74070s];
        } else if (iArr.length < this.f74070s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f74070s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f74070s; i10++) {
            iArr[i10] = this.f74071t[i10].i();
        }
        return iArr;
    }

    public int[] M2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f74070s];
        } else if (iArr.length < this.f74070s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f74070s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f74070s; i10++) {
            iArr[i10] = this.f74071t[i10].k();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q P() {
        return this.f74074w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    int P2() {
        if (V() == 0) {
            return 0;
        }
        return w0(U(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q Q(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int Q2() {
        return this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q R(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int R2() {
        int iV = V();
        if (iV == 0) {
            return 0;
        }
        return w0(U(iV - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int U1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return p3(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void V1(int i10) {
        SavedState savedState = this.I;
        if (savedState != null && savedState.f74085a != i10) {
            savedState.a();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int W1(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        return p3(i10, xVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(int i10) {
        super.X0(i10);
        for (int i11 = 0; i11 < this.f74070s; i11++) {
            this.f74071t[i11].w(i10);
        }
    }

    public int X2() {
        return this.f74074w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(int i10) {
        super.Y0(i10);
        for (int i11 = 0; i11 < this.f74070s; i11++) {
            this.f74071t[i11].w(i10);
        }
    }

    public boolean Y2() {
        return this.f74077z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(@p0 RecyclerView.h hVar, @p0 RecyclerView.h hVar2) {
        this.E.b();
        for (int i10 = 0; i10 < this.f74070s; i10++) {
            this.f74071t[i10].e();
        }
    }

    public int Z2() {
        return this.f74070s;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b8 A[SYNTHETIC] */
    View b3() {
        int i10;
        View viewU;
        int iG;
        int iG2;
        boolean z10;
        boolean z11;
        int iD;
        int iD2;
        int iV = V();
        int i11 = iV - 1;
        BitSet bitSet = new BitSet(this.f74070s);
        bitSet.set(0, this.f74070s, true);
        byte b10 = (this.f74074w == 1 && d3()) ? (byte) 1 : (byte) -1;
        if (this.A) {
            iV = -1;
        } else {
            i11 = 0;
        }
        int i12 = i11 < iV ? 1 : -1;
        while (i11 != iV) {
            View viewU2 = U(i11);
            c cVar = (c) viewU2.getLayoutParams();
            if (!bitSet.get(cVar.f74104e.f74111e)) {
                if (!cVar.f74105f && (i10 = i11 + i12) != iV) {
                    viewU = U(i10);
                    if (this.A) {
                        iD = this.f74072u.d(viewU2);
                        iD2 = this.f74072u.d(viewU);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f74104e.f74111e - ((c) viewU.getLayoutParams()).f74104e.f74111e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f74072u.g(viewU2);
                        iG2 = this.f74072u.g(viewU);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f74104e.f74111e - ((c) viewU.getLayoutParams()).f74104e.f74111e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            } else if (!v2(cVar.f74104e)) {
                bitSet.clear(cVar.f74104e.f74111e);
                if (!cVar.f74105f) {
                    viewU = U(i10);
                    if (this.A) {
                        iD = this.f74072u.d(viewU2);
                        iD2 = this.f74072u.d(viewU);
                        if (iD >= iD2) {
                            if (iD == iD2) {
                                if (cVar.f74104e.f74111e - ((c) viewU.getLayoutParams()).f74104e.f74111e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        iG = this.f74072u.g(viewU2);
                        iG2 = this.f74072u.g(viewU);
                        if (iG <= iG2) {
                            if (iG == iG2) {
                                if (cVar.f74104e.f74111e - ((c) viewU.getLayoutParams()).f74104e.f74111e < 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10 < 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z10 != z11) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                i11 += i12;
            }
            return viewU2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF c(int i10) {
        int iT2 = t2(i10);
        PointF pointF = new PointF();
        if (iT2 == 0) {
            return null;
        }
        if (this.f74074w == 0) {
            pointF.x = iT2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iT2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c2(Rect rect, int i10, int i11) {
        int iV;
        int iV2;
        int iS0 = s0() + t0();
        int iV0 = v0() + q0();
        if (this.f74074w == 1) {
            iV2 = RecyclerView.p.v(i11, rect.height() + iV0, o0());
            iV = RecyclerView.p.v(i10, (this.f74075x * this.f74070s) + iS0, p0());
        } else {
            iV = RecyclerView.p.v(i10, rect.width() + iS0, p0());
            iV2 = RecyclerView.p.v(i11, (this.f74075x * this.f74070s) + iV0, o0());
        }
        b2(iV, iV2);
    }

    public void c3() {
        this.E.b();
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView recyclerView, RecyclerView.x xVar) {
        super.d1(recyclerView, xVar);
        L1(this.P);
        for (int i10 = 0; i10 < this.f74070s; i10++) {
            this.f74071t[i10].e();
        }
        recyclerView.requestLayout();
    }

    boolean d3() {
        return m0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @p0
    public View e1(View view, int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        View viewN;
        View viewR;
        if (V() == 0 || (viewN = N(view)) == null) {
            return null;
        }
        o3();
        int iZ2 = z2(i10);
        if (iZ2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewN.getLayoutParams();
        boolean z10 = cVar.f74105f;
        d dVar = cVar.f74104e;
        int iR2 = iZ2 == 1 ? R2() : P2();
        A3(iR2, c0Var);
        s3(iZ2);
        r rVar = this.f74076y;
        rVar.f74538c = rVar.f74539d + iR2;
        rVar.f74537b = (int) (this.f74072u.o() * Y);
        r rVar2 = this.f74076y;
        rVar2.f74543h = true;
        rVar2.f74536a = false;
        D2(xVar, rVar2, c0Var);
        this.G = this.A;
        if (!z10 && (viewR = dVar.r(iR2, iZ2)) != null && viewR != viewN) {
            return viewR;
        }
        if (h3(iZ2)) {
            for (int i11 = this.f74070s - 1; i11 >= 0; i11--) {
                View viewR2 = this.f74071t[i11].r(iR2, iZ2);
                if (viewR2 != null && viewR2 != viewN) {
                    return viewR2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f74070s; i12++) {
                View viewR3 = this.f74071t[i12].r(iR2, iZ2);
                if (viewR3 != null && viewR3 != viewN) {
                    return viewR3;
                }
            }
        }
        boolean z11 = (this.f74077z ^ true) == (iZ2 == -1);
        if (!z10) {
            View viewO = O(z11 ? dVar.g() : dVar.j());
            if (viewO != null && viewO != viewN) {
                return viewO;
            }
        }
        if (h3(iZ2)) {
            for (int i13 = this.f74070s - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f74111e) {
                    View viewO2 = O(z11 ? this.f74071t[i13].g() : this.f74071t[i13].j());
                    if (viewO2 != null && viewO2 != viewN) {
                        return viewO2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f74070s; i14++) {
                View viewO3 = O(z11 ? this.f74071t[i14].g() : this.f74071t[i14].j());
                if (viewO3 != null && viewO3 != viewN) {
                    return viewO3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(AccessibilityEvent accessibilityEvent) {
        super.f1(accessibilityEvent);
        if (V() > 0) {
            View viewH2 = H2(false);
            View viewG2 = G2(false);
            if (viewH2 != null && viewG2 != null) {
                int iW0 = w0(viewH2);
                int iW1 = w0(viewG2);
                if (iW0 < iW1) {
                    accessibilityEvent.setFromIndex(iW0);
                    accessibilityEvent.setToIndex(iW1);
                } else {
                    accessibilityEvent.setFromIndex(iW1);
                    accessibilityEvent.setToIndex(iW0);
                }
            }
        }
    }

    void i3(int i10, RecyclerView.c0 c0Var) {
        int iP2;
        int i11;
        if (i10 > 0) {
            iP2 = R2();
            i11 = 1;
        } else {
            iP2 = P2();
            i11 = -1;
        }
        this.f74076y.f74536a = true;
        A3(iP2, c0Var);
        s3(i11);
        r rVar = this.f74076y;
        rVar.f74538c = iP2 + rVar.f74539d;
        rVar.f74537b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
        s sVar = new s(recyclerView.getContext());
        sVar.q(i10);
        k2(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(RecyclerView recyclerView, int i10, int i11) {
        a3(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n(String str) {
        if (this.I == null) {
            super.n(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView recyclerView) {
        this.E.b();
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean n2() {
        return this.I == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView recyclerView, int i10, int i11, int i12) {
        a3(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p1(RecyclerView recyclerView, int i10, int i11) {
        a3(i10, i11, 2);
    }

    int p3(int i10, RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        if (V() != 0 && i10 != 0) {
            i3(i10, c0Var);
            int iD2 = D2(xVar, this.f74076y, c0Var);
            if (this.f74076y.f74537b >= iD2) {
                i10 = i10 < 0 ? -iD2 : iD2;
            }
            this.f74072u.t(-i10);
            this.G = this.A;
            r rVar = this.f74076y;
            rVar.f74537b = 0;
            k3(xVar, rVar);
            return i10;
        }
        return 0;
    }

    boolean q2() {
        int iQ = this.f74071t[0].q(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f74070s; i10++) {
            if (this.f74071t[i10].q(Integer.MIN_VALUE) != iQ) {
                return false;
            }
        }
        return true;
    }

    public void q3(int i10, int i11) {
        SavedState savedState = this.I;
        if (savedState != null) {
            savedState.a();
        }
        this.C = i10;
        this.D = i11;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void r1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        a3(i10, i11, 4);
    }

    boolean r2() {
        int iU = this.f74071t[0].u(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f74070s; i10++) {
            if (this.f74071t[i10].u(Integer.MIN_VALUE) != iU) {
                return false;
            }
        }
        return true;
    }

    public void r3(int i10) {
        n(null);
        if (i10 == this.F) {
            return;
        }
        if (i10 != 0 && i10 != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.F = i10;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s() {
        return this.f74074w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s1(RecyclerView.x xVar, RecyclerView.c0 c0Var) {
        g3(xVar, c0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean t() {
        return this.f74074w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void t1(RecyclerView.c0 c0Var) {
        super.t1(c0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public void t3(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        n(null);
        if (i10 == this.f74074w) {
            return;
        }
        this.f74074w = i10;
        z zVar = this.f74072u;
        this.f74072u = this.f74073v;
        this.f74073v = zVar;
        R1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean u(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    boolean u2() {
        int iP2;
        int iR2;
        if (V() == 0 || this.F == 0 || !I0()) {
            return false;
        }
        if (this.A) {
            iP2 = R2();
            iR2 = P2();
        } else {
            iP2 = P2();
            iR2 = R2();
        }
        if (iP2 == 0 && b3() != null) {
            this.E.b();
            S1();
            R1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i10 = this.A ? -1 : 1;
        int i11 = iR2 + 1;
        LazySpanLookup.FullSpanItem fullSpanItemE = this.E.e(iP2, i11, i10, true);
        if (fullSpanItemE == null) {
            this.M = false;
            this.E.d(i11);
            return false;
        }
        LazySpanLookup.FullSpanItem fullSpanItemE2 = this.E.e(iP2, fullSpanItemE.f74081a, i10 * (-1), true);
        if (fullSpanItemE2 == null) {
            this.E.d(fullSpanItemE.f74081a);
        } else {
            this.E.d(fullSpanItemE2.f74081a + 1);
        }
        S1();
        R1();
        return true;
    }

    public void u3(boolean z10) {
        n(null);
        SavedState savedState = this.I;
        if (savedState != null && savedState.f74092h != z10) {
            savedState.f74092h = z10;
        }
        this.f74077z = z10;
        R1();
    }

    public void v3(int i10) {
        n(null);
        if (i10 != this.f74070s) {
            c3();
            this.f74070s = i10;
            this.B = new BitSet(this.f74070s);
            this.f74071t = new d[this.f74070s];
            for (int i11 = 0; i11 < this.f74070s; i11++) {
                this.f74071t[i11] = new d(i11);
            }
            R1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @b1({b1.a.LIBRARY})
    public void w(int i10, int i11, RecyclerView.c0 c0Var, RecyclerView.p.c cVar) {
        int iQ;
        int iU;
        if (this.f74074w != 0) {
            i10 = i11;
        }
        if (V() != 0 && i10 != 0) {
            i3(i10, c0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.f74070s) {
                this.O = new int[this.f74070s];
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f74070s; i13++) {
                r rVar = this.f74076y;
                if (rVar.f74539d == -1) {
                    iQ = rVar.f74541f;
                    iU = this.f74071t[i13].u(iQ);
                } else {
                    iQ = this.f74071t[i13].q(rVar.f74542g);
                    iU = this.f74076y.f74542g;
                }
                int i14 = iQ - iU;
                if (i14 >= 0) {
                    this.O[i12] = i14;
                    i12++;
                }
            }
            Arrays.sort(this.O, 0, i12);
            for (int i15 = 0; i15 < i12 && this.f74076y.a(c0Var); i15++) {
                cVar.a(this.f74076y.f74538c, this.O[i15]);
                r rVar2 = this.f74076y;
                rVar2.f74538c += rVar2.f74539d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.I = savedState;
            if (this.C != -1) {
                savedState.a();
                this.I.b();
            }
            R1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.c0 c0Var) {
        return w2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable y1() {
        int iU;
        int iN;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.f74092h = this.f74077z;
        savedState.f74093i = this.G;
        savedState.f74094j = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f74079a) == null) {
            savedState.f74089e = 0;
        } else {
            savedState.f74090f = iArr;
            savedState.f74089e = iArr.length;
            savedState.f74091g = lazySpanLookup.f74080b;
        }
        if (V() <= 0) {
            savedState.f74085a = -1;
            savedState.f74086b = -1;
            savedState.f74087c = 0;
            return savedState;
        }
        savedState.f74085a = this.G ? R2() : P2();
        savedState.f74086b = I2();
        int i10 = this.f74070s;
        savedState.f74087c = i10;
        savedState.f74088d = new int[i10];
        for (int i11 = 0; i11 < this.f74070s; i11++) {
            if (this.G) {
                iU = this.f74071t[i11].q(Integer.MIN_VALUE);
                if (iU != Integer.MIN_VALUE) {
                    iN = this.f74072u.i();
                    iU -= iN;
                }
            } else {
                iU = this.f74071t[i11].u(Integer.MIN_VALUE);
                if (iU != Integer.MIN_VALUE) {
                    iN = this.f74072u.n();
                    iU -= iN;
                }
            }
            savedState.f74088d[i11] = iU;
        }
        return savedState;
    }

    boolean y3(RecyclerView.c0 c0Var, b bVar) {
        int i10;
        if (!c0Var.j() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < c0Var.d()) {
                SavedState savedState = this.I;
                if (savedState == null || savedState.f74085a == -1 || savedState.f74087c < 1) {
                    View viewO = O(this.C);
                    if (viewO != null) {
                        bVar.f74096a = this.A ? R2() : P2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f74098c) {
                                bVar.f74097b = (this.f74072u.i() - this.D) - this.f74072u.d(viewO);
                            } else {
                                bVar.f74097b = (this.f74072u.n() + this.D) - this.f74072u.g(viewO);
                            }
                            return true;
                        }
                        if (this.f74072u.e(viewO) > this.f74072u.o()) {
                            bVar.f74097b = bVar.f74098c ? this.f74072u.i() : this.f74072u.n();
                            return true;
                        }
                        int iG = this.f74072u.g(viewO) - this.f74072u.n();
                        if (iG < 0) {
                            bVar.f74097b = -iG;
                            return true;
                        }
                        int i11 = this.f74072u.i() - this.f74072u.d(viewO);
                        if (i11 < 0) {
                            bVar.f74097b = i11;
                            return true;
                        }
                        bVar.f74097b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.C;
                        bVar.f74096a = i12;
                        int i13 = this.D;
                        if (i13 == Integer.MIN_VALUE) {
                            bVar.f74098c = t2(i12) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f74099d = true;
                    }
                } else {
                    bVar.f74097b = Integer.MIN_VALUE;
                    bVar.f74096a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.c0 c0Var) {
        return x2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void z1(int i10) {
        if (i10 == 0) {
            u2();
        }
    }

    void z3(RecyclerView.c0 c0Var, b bVar) {
        if (y3(c0Var, bVar) || x3(c0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.f74096a = 0;
    }

    static class LazySpanLookup {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f74078c = 10;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f74079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List<FullSpanItem> f74080b;

        LazySpanLookup() {
        }

        private int i(int i10) {
            if (this.f74080b == null) {
                return -1;
            }
            FullSpanItem fullSpanItemF = f(i10);
            if (fullSpanItemF != null) {
                this.f74080b.remove(fullSpanItemF);
            }
            int size = this.f74080b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f74080b.get(i11).f74081a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = this.f74080b.get(i11);
            this.f74080b.remove(i11);
            return fullSpanItem.f74081a;
        }

        private void l(int i10, int i11) {
            List<FullSpanItem> list = this.f74080b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f74080b.get(size);
                    int i12 = fullSpanItem.f74081a;
                    if (i12 >= i10) {
                        fullSpanItem.f74081a = i12 + i11;
                    }
                }
            }
        }

        private void m(int i10, int i11) {
            List<FullSpanItem> list = this.f74080b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f74080b.get(size);
                int i13 = fullSpanItem.f74081a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f74080b.remove(size);
                    } else {
                        fullSpanItem.f74081a = i13 - i11;
                    }
                }
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f74080b == null) {
                this.f74080b = new ArrayList();
            }
            int size = this.f74080b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f74080b.get(i10);
                if (fullSpanItem2.f74081a == fullSpanItem.f74081a) {
                    this.f74080b.remove(i10);
                }
                if (fullSpanItem2.f74081a >= fullSpanItem.f74081a) {
                    this.f74080b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f74080b.add(fullSpanItem);
        }

        void b() {
            int[] iArr = this.f74079a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f74080b = null;
        }

        void c(int i10) {
            int[] iArr = this.f74079a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f74079a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f74079a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f74079a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<FullSpanItem> list = this.f74080b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    if (this.f74080b.get(size).f74081a >= i10) {
                        this.f74080b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f74080b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f74080b.get(i13);
                int i14 = fullSpanItem.f74081a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.f74082b == i12 || (z10 && fullSpanItem.f74084d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.f74080b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f74080b.get(size);
                if (fullSpanItem.f74081a == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f74079a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f74079a;
            if (iArr != null && i10 < iArr.length) {
                int i11 = i(i10);
                if (i11 == -1) {
                    int[] iArr2 = this.f74079a;
                    Arrays.fill(iArr2, i10, iArr2.length, -1);
                    return this.f74079a.length;
                }
                int iMin = Math.min(i11 + 1, this.f74079a.length);
                Arrays.fill(this.f74079a, i10, iMin, -1);
                return iMin;
            }
            return -1;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f74079a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f74079a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f74079a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f74079a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f74079a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f74079a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m(i10, i11);
            }
        }

        void n(int i10, d dVar) {
            c(i10);
            this.f74079a[i10] = dVar.f74111e;
        }

        int o(int i10) {
            int length = this.f74079a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        @e.a({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f74081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f74082b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int[] f74083c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            boolean f74084d;

            class a implements Parcelable.Creator<FullSpanItem> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f74081a = parcel.readInt();
                this.f74082b = parcel.readInt();
                this.f74084d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f74083c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f74083c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f74081a + ", mGapDir=" + this.f74082b + ", mHasUnwantedGapAfter=" + this.f74084d + ", mGapPerSpan=" + Arrays.toString(this.f74083c) + AbstractJsonLexerKt.END_OBJ;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f74081a);
                parcel.writeInt(this.f74082b);
                parcel.writeInt(this.f74084d ? 1 : 0);
                int[] iArr = this.f74083c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f74083c);
                }
            }

            FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f74074w = i11;
        v3(i10);
        this.f74076y = new r();
        C2();
    }
}
