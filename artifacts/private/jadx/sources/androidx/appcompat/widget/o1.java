package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.core.view.f2;
import androidx.core.view.h2;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class o1 implements l0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f11465s = "ToolbarWidgetWrapper";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f11466t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f11467u = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f11468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f11470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Spinner f11471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f11472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f11473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f11474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f11475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    CharSequence f11477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f11478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f11479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    Window.Callback f11480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f11481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ActionMenuPresenter f11482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f11483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f11484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f11485r;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f11486a;

        a() {
            this.f11486a = new androidx.appcompat.view.menu.a(o1.this.f11468a.getContext(), 0, R.id.home, 0, 0, o1.this.f11477j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o1 o1Var = o1.this;
            Window.Callback callback = o1Var.f11480m;
            if (callback == null || !o1Var.f11481n) {
                return;
            }
            callback.onMenuItemSelected(0, this.f11486a);
        }
    }

    class b extends h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11488a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11489b;

        b(int i10) {
            this.f11489b = i10;
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void a(View view) {
            this.f11488a = true;
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void b(View view) {
            if (this.f11488a) {
                return;
            }
            o1.this.f11468a.setVisibility(this.f11489b);
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void c(View view) {
            o1.this.f11468a.setVisibility(0);
        }
    }

    public o1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, i.a.k.f286270b, i.a.f.f286170v);
    }

    private int T() {
        if (this.f11468a.getNavigationIcon() == null) {
            return 11;
        }
        this.f11485r = this.f11468a.getNavigationIcon();
        return 15;
    }

    private void U() {
        if (this.f11471d == null) {
            this.f11471d = new AppCompatSpinner(getContext(), null, i.a.b.f285951m);
            this.f11471d.setLayoutParams(new Toolbar.g(-2, -2, 8388627));
        }
    }

    private void V(CharSequence charSequence) {
        this.f11477j = charSequence;
        if ((this.f11469b & 8) != 0) {
            this.f11468a.setTitle(charSequence);
            if (this.f11476i) {
                androidx.core.view.u1.J1(this.f11468a.getRootView(), charSequence);
            }
        }
    }

    private void W() {
        if ((this.f11469b & 4) != 0) {
            if (TextUtils.isEmpty(this.f11479l)) {
                this.f11468a.setNavigationContentDescription(this.f11484q);
                return;
            }
            this.f11468a.setNavigationContentDescription(this.f11479l);
        }
    }

    private void X() {
        if ((this.f11469b & 4) == 0) {
            this.f11468a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f11468a;
        Drawable drawable = this.f11475h;
        if (drawable == null) {
            drawable = this.f11485r;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void Y() {
        Drawable drawable;
        int i10 = this.f11469b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f11474g) == null) {
            drawable = this.f11473f;
        }
        this.f11468a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.l0
    public void A(int i10) {
        f2 f2VarI = I(i10, f11467u);
        if (f2VarI != null) {
            f2VarI.x();
        }
    }

    @Override // androidx.appcompat.widget.l0
    public int B() {
        return this.f11469b;
    }

    @Override // androidx.appcompat.widget.l0
    public void C(View view) {
        View view2 = this.f11472e;
        if (view2 != null && (this.f11469b & 16) != 0) {
            this.f11468a.removeView(view2);
        }
        this.f11472e = view;
        if (view != null && (this.f11469b & 16) != 0) {
            this.f11468a.addView(view);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void D() {
    }

    @Override // androidx.appcompat.widget.l0
    public void E(Drawable drawable) {
        this.f11475h = drawable;
        X();
    }

    @Override // androidx.appcompat.widget.l0
    public void F(CharSequence charSequence) {
        this.f11478k = charSequence;
        if ((this.f11469b & 8) != 0) {
            this.f11468a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void G(int i10) {
        Spinner spinner = this.f11471d;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i10);
    }

    @Override // androidx.appcompat.widget.l0
    public Menu H() {
        return this.f11468a.getMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public f2 I(int i10, long j10) {
        return androidx.core.view.u1.g(this.f11468a).b(i10 == 0 ? 1.0f : 0.0f).r(j10).t(new b(i10));
    }

    @Override // androidx.appcompat.widget.l0
    public ViewGroup J() {
        return this.f11468a;
    }

    @Override // androidx.appcompat.widget.l0
    public void K(boolean z10) {
    }

    @Override // androidx.appcompat.widget.l0
    public void L(int i10) {
        if (i10 == this.f11484q) {
            return;
        }
        this.f11484q = i10;
        if (TextUtils.isEmpty(this.f11468a.getNavigationContentDescription())) {
            r(this.f11484q);
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void M(z0 z0Var) {
        View view = this.f11470c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f11468a;
            if (parent == toolbar) {
                toolbar.removeView(this.f11470c);
            }
        }
        this.f11470c = z0Var;
        if (z0Var == null || this.f11483p != 2) {
            return;
        }
        this.f11468a.addView(z0Var, 0);
        Toolbar.g gVar = (Toolbar.g) this.f11470c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f10275a = 8388691;
        int i10 = 2 << 1;
        z0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean N() {
        return this.f11470c != null;
    }

    @Override // androidx.appcompat.widget.l0
    public void O(int i10) {
        E(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void P(androidx.appcompat.view.menu.n.a aVar, androidx.appcompat.view.menu.g.a aVar2) {
        this.f11468a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.l0
    public void Q(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        U();
        this.f11471d.setAdapter(spinnerAdapter);
        this.f11471d.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.l0
    public void R(SparseArray<Parcelable> sparseArray) {
        this.f11468a.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.l0
    public CharSequence S() {
        return this.f11468a.getSubtitle();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean a() {
        return this.f11468a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public void b(Drawable drawable) {
        this.f11468a.setBackground(drawable);
    }

    @Override // androidx.appcompat.widget.l0
    public boolean c() {
        return this.f11468a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public void collapseActionView() {
        this.f11468a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean d() {
        return this.f11468a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean e() {
        return this.f11473f != null;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean f() {
        return this.f11468a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.l0
    public void g(Menu menu, androidx.appcompat.view.menu.n.a aVar) {
        if (this.f11482o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f11468a.getContext());
            this.f11482o = actionMenuPresenter;
            actionMenuPresenter.s(i.a.g.f286198j);
        }
        this.f11482o.j(aVar);
        this.f11468a.setMenu((androidx.appcompat.view.menu.g) menu, this.f11482o);
    }

    @Override // androidx.appcompat.widget.l0
    public Context getContext() {
        return this.f11468a.getContext();
    }

    @Override // androidx.appcompat.widget.l0
    public int getHeight() {
        return this.f11468a.getHeight();
    }

    @Override // androidx.appcompat.widget.l0
    public CharSequence getTitle() {
        return this.f11468a.getTitle();
    }

    @Override // androidx.appcompat.widget.l0
    public int getVisibility() {
        return this.f11468a.getVisibility();
    }

    @Override // androidx.appcompat.widget.l0
    public void h() {
        this.f11481n = true;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean i() {
        return this.f11474g != null;
    }

    @Override // androidx.appcompat.widget.l0
    public boolean j() {
        return this.f11468a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean k() {
        return this.f11468a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.l0
    public boolean l() {
        return this.f11468a.isTitleTruncated();
    }

    @Override // androidx.appcompat.widget.l0
    public void m(int i10) {
        View view;
        int i11 = this.f11469b ^ i10;
        this.f11469b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    W();
                }
                X();
            }
            if ((i11 & 3) != 0) {
                Y();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f11468a.setTitle(this.f11477j);
                    this.f11468a.setSubtitle(this.f11478k);
                } else {
                    this.f11468a.setTitle((CharSequence) null);
                    this.f11468a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f11472e) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f11468a.addView(view);
            } else {
                this.f11468a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void n(CharSequence charSequence) {
        this.f11479l = charSequence;
        W();
    }

    @Override // androidx.appcompat.widget.l0
    public int o() {
        return this.f11483p;
    }

    @Override // androidx.appcompat.widget.l0
    public void p(int i10) {
        View view;
        int i11 = this.f11483p;
        if (i10 != i11) {
            if (i11 == 1) {
                Spinner spinner = this.f11471d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f11468a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f11471d);
                    }
                }
            } else if (i11 == 2 && (view = this.f11470c) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f11468a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f11470c);
                }
            }
            this.f11483p = i10;
            if (i10 != 0) {
                if (i10 == 1) {
                    U();
                    this.f11468a.addView(this.f11471d, 0);
                    return;
                }
                if (i10 != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i10);
                }
                View view2 = this.f11470c;
                if (view2 != null) {
                    this.f11468a.addView(view2, 0);
                    Toolbar.g gVar = (Toolbar.g) this.f11470c.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) gVar).width = -2;
                    ((ViewGroup.MarginLayoutParams) gVar).height = -2;
                    gVar.f10275a = 8388691;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.l0
    public int q() {
        Spinner spinner = this.f11471d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.l0
    public void r(int i10) {
        n(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.l0
    public void s() {
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void setLogo(int i10) {
        x(i10 != 0 ? j.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.l0
    public void setTitle(CharSequence charSequence) {
        this.f11476i = true;
        V(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public void setVisibility(int i10) {
        this.f11468a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowCallback(Window.Callback callback) {
        this.f11480m = callback;
    }

    @Override // androidx.appcompat.widget.l0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f11476i) {
            return;
        }
        V(charSequence);
    }

    @Override // androidx.appcompat.widget.l0
    public int t() {
        Spinner spinner = this.f11471d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.l0
    public void u(boolean z10) {
        this.f11468a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.l0
    public void v() {
        this.f11468a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.l0
    public View w() {
        return this.f11472e;
    }

    @Override // androidx.appcompat.widget.l0
    public void x(Drawable drawable) {
        this.f11474g = drawable;
        Y();
    }

    @Override // androidx.appcompat.widget.l0
    public void y(Drawable drawable) {
        if (this.f11485r != drawable) {
            this.f11485r = drawable;
            X();
        }
    }

    @Override // androidx.appcompat.widget.l0
    public void z(SparseArray<Parcelable> sparseArray) {
        this.f11468a.saveHierarchyState(sparseArray);
    }

    public o1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f11483p = 0;
        this.f11484q = 0;
        this.f11468a = toolbar;
        this.f11477j = toolbar.getTitle();
        this.f11478k = toolbar.getSubtitle();
        this.f11476i = this.f11477j != null;
        this.f11475h = toolbar.getNavigationIcon();
        j1 j1VarG = j1.G(toolbar.getContext(), null, i.a.m.f286477a, i.a.b.f285909f, 0);
        this.f11485r = j1VarG.h(i.a.m.f286617q);
        if (z10) {
            CharSequence charSequenceX = j1VarG.x(i.a.m.C);
            if (!TextUtils.isEmpty(charSequenceX)) {
                setTitle(charSequenceX);
            }
            CharSequence charSequenceX2 = j1VarG.x(i.a.m.A);
            if (!TextUtils.isEmpty(charSequenceX2)) {
                F(charSequenceX2);
            }
            Drawable drawableH = j1VarG.h(i.a.m.f286657v);
            if (drawableH != null) {
                x(drawableH);
            }
            Drawable drawableH2 = j1VarG.h(i.a.m.f286633s);
            if (drawableH2 != null) {
                setIcon(drawableH2);
            }
            if (this.f11475h == null && (drawable = this.f11485r) != null) {
                E(drawable);
            }
            m(j1VarG.o(i.a.m.f286576l, 0));
            int iU = j1VarG.u(i.a.m.f286567k, 0);
            if (iU != 0) {
                C(LayoutInflater.from(this.f11468a.getContext()).inflate(iU, (ViewGroup) this.f11468a, false));
                m(this.f11469b | 16);
            }
            int iQ = j1VarG.q(i.a.m.f286601o, 0);
            if (iQ > 0) {
                ViewGroup.LayoutParams layoutParams = this.f11468a.getLayoutParams();
                layoutParams.height = iQ;
                this.f11468a.setLayoutParams(layoutParams);
            }
            int iF = j1VarG.f(i.a.m.f286549i, -1);
            int iF2 = j1VarG.f(i.a.m.f286513e, -1);
            if (iF >= 0 || iF2 >= 0) {
                this.f11468a.setContentInsetsRelative(Math.max(iF, 0), Math.max(iF2, 0));
            }
            int iU2 = j1VarG.u(i.a.m.D, 0);
            if (iU2 != 0) {
                Toolbar toolbar2 = this.f11468a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iU2);
            }
            int iU3 = j1VarG.u(i.a.m.B, 0);
            if (iU3 != 0) {
                Toolbar toolbar3 = this.f11468a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iU3);
            }
            int iU4 = j1VarG.u(i.a.m.f286673x, 0);
            if (iU4 != 0) {
                this.f11468a.setPopupTheme(iU4);
            }
        } else {
            this.f11469b = T();
        }
        j1VarG.I();
        L(i10);
        this.f11479l = this.f11468a.getNavigationContentDescription();
        this.f11468a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.l0
    public void setIcon(Drawable drawable) {
        this.f11473f = drawable;
        Y();
    }
}
