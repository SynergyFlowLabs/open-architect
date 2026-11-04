package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f74606d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f74607e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f74608f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f74609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f74610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f74611c;

    class a extends z {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f74609a.g0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f74609a.f0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f74609a.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f74609a.d0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f74609a.D0();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f74609a.D0() - this.f74609a.t0();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f74609a.t0();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f74609a.E0();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f74609a.k0();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f74609a.s0();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f74609a.D0() - this.f74609a.s0()) - this.f74609a.t0();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f74609a.C0(view, true, this.f74611c);
            return this.f74611c.right;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f74609a.C0(view, true, this.f74611c);
            return this.f74611c.left;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i10) {
            view.offsetLeftAndRight(i10);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i10) {
            this.f74609a.X0(i10);
        }
    }

    class b extends z {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.z
        public int d(View view) {
            return this.f74609a.b0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f74609a.e0(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f74609a.f0(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int g(View view) {
            return this.f74609a.h0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.z
        public int h() {
            return this.f74609a.j0();
        }

        @Override // androidx.recyclerview.widget.z
        public int i() {
            return this.f74609a.j0() - this.f74609a.q0();
        }

        @Override // androidx.recyclerview.widget.z
        public int j() {
            return this.f74609a.q0();
        }

        @Override // androidx.recyclerview.widget.z
        public int l() {
            return this.f74609a.k0();
        }

        @Override // androidx.recyclerview.widget.z
        public int m() {
            return this.f74609a.E0();
        }

        @Override // androidx.recyclerview.widget.z
        public int n() {
            return this.f74609a.v0();
        }

        @Override // androidx.recyclerview.widget.z
        public int o() {
            return (this.f74609a.j0() - this.f74609a.v0()) - this.f74609a.q0();
        }

        @Override // androidx.recyclerview.widget.z
        public int q(View view) {
            this.f74609a.C0(view, true, this.f74611c);
            return this.f74611c.bottom;
        }

        @Override // androidx.recyclerview.widget.z
        public int r(View view) {
            this.f74609a.C0(view, true, this.f74611c);
            return this.f74611c.top;
        }

        @Override // androidx.recyclerview.widget.z
        public void s(View view, int i10) {
            view.offsetTopAndBottom(i10);
        }

        @Override // androidx.recyclerview.widget.z
        public void t(int i10) {
            this.f74609a.Y0(i10);
        }
    }

    /* synthetic */ z(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static z a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static z b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static z c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.p k() {
        return this.f74609a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f74610b) {
            return 0;
        }
        return o() - this.f74610b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i10);

    public abstract void t(int i10);

    public void u() {
        this.f74610b = o();
    }

    private z(RecyclerView.p pVar) {
        this.f74610b = Integer.MIN_VALUE;
        this.f74611c = new Rect();
        this.f74609a = pVar;
    }
}
