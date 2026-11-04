package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.o1;
import androidx.core.view.u1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class y extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final l0 f10396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Window.Callback f10397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final AppCompatDelegateImpl.i f10398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f10399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<androidx.appcompat.app.a.d> f10402o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f10403p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Toolbar.h f10404q;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.E0();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return y.this.f10397j.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements androidx.appcompat.view.menu.n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10407a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (this.f10407a) {
                return;
            }
            this.f10407a = true;
            y.this.f10396i.v();
            y.this.f10397j.onPanelClosed(108, gVar);
            this.f10407a = false;
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@NonNull androidx.appcompat.view.menu.g gVar) {
            y.this.f10397j.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements androidx.appcompat.view.menu.g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar) {
            if (y.this.f10396i.d()) {
                y.this.f10397j.onPanelClosed(108, gVar);
            } else {
                if (y.this.f10397j.onPreparePanel(0, null, gVar)) {
                    y.this.f10397j.onMenuOpened(108, gVar);
                }
            }
        }
    }

    private class e implements AppCompatDelegateImpl.i {
        e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.i
        public boolean a(int i10) {
            if (i10 == 0) {
                y yVar = y.this;
                if (!yVar.f10399l) {
                    yVar.f10396i.h();
                    y.this.f10399l = true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.i
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(y.this.f10396i.getContext());
            }
            return null;
        }
    }

    y(@NonNull Toolbar toolbar, @p0 CharSequence charSequence, @NonNull Window.Callback callback) {
        b bVar = new b();
        this.f10404q = bVar;
        androidx.core.util.t.l(toolbar);
        o1 o1Var = new o1(toolbar, false);
        this.f10396i = o1Var;
        this.f10397j = (Window.Callback) androidx.core.util.t.l(callback);
        o1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        o1Var.setWindowTitle(charSequence);
        this.f10398k = new e();
    }

    private Menu D0() {
        if (!this.f10400m) {
            this.f10396i.P(new c(), new d());
            boolean z10 = false & true;
            this.f10400m = true;
        }
        return this.f10396i.H();
    }

    @Override // androidx.appcompat.app.a
    public CharSequence A() {
        return this.f10396i.getTitle();
    }

    @Override // androidx.appcompat.app.a
    public void A0(CharSequence charSequence) {
        this.f10396i.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void B() {
        this.f10396i.setVisibility(8);
    }

    @Override // androidx.appcompat.app.a
    public void B0() {
        this.f10396i.setVisibility(0);
    }

    @Override // androidx.appcompat.app.a
    public boolean C() {
        this.f10396i.J().removeCallbacks(this.f10403p);
        u1.u1(this.f10396i.J(), this.f10403p);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean E() {
        return this.f10396i.getVisibility() == 0;
    }

    void E0() {
        Menu menuD0 = D0();
        androidx.appcompat.view.menu.g gVar = menuD0 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menuD0 : null;
        if (gVar != null) {
            gVar.n0();
        }
        try {
            menuD0.clear();
            if (!this.f10397j.onCreatePanelMenu(0, menuD0) || !this.f10397j.onPreparePanel(0, null, menuD0)) {
                menuD0.clear();
            }
            if (gVar != null) {
            }
        } finally {
            if (gVar != null) {
                gVar.m0();
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean F() {
        return super.F();
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.app.a.f G() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void H(Configuration configuration) {
        super.H(configuration);
    }

    @Override // androidx.appcompat.app.a
    void I() {
        this.f10396i.J().removeCallbacks(this.f10403p);
    }

    @Override // androidx.appcompat.app.a
    public boolean J(int i10, KeyEvent keyEvent) {
        Menu menuD0 = D0();
        if (menuD0 == null) {
            return false;
        }
        menuD0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuD0.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean K(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            L();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean L() {
        return this.f10396i.c();
    }

    @Override // androidx.appcompat.app.a
    public void M() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void N(androidx.appcompat.app.a.d dVar) {
        this.f10402o.remove(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void O(androidx.appcompat.app.a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void P(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public boolean Q() {
        ViewGroup viewGroupJ = this.f10396i.J();
        if (viewGroupJ == null || viewGroupJ.hasFocus()) {
            return false;
        }
        viewGroupJ.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void R(androidx.appcompat.app.a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void S(@p0 Drawable drawable) {
        this.f10396i.b(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void T(int i10) {
        U(LayoutInflater.from(this.f10396i.getContext()).inflate(i10, this.f10396i.J(), false));
    }

    @Override // androidx.appcompat.app.a
    public void U(View view) {
        V(view, new androidx.appcompat.app.a.b(-2, -2));
    }

    @Override // androidx.appcompat.app.a
    public void V(View view, androidx.appcompat.app.a.b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.f10396i.C(view);
    }

    @Override // androidx.appcompat.app.a
    public void W(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void X(boolean z10) {
        Z(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    @e.a({"WrongConstant"})
    public void Y(int i10) {
        Z(i10, -1);
    }

    @Override // androidx.appcompat.app.a
    public void Z(int i10, int i11) {
        this.f10396i.m((i10 & i11) | ((~i11) & this.f10396i.B()));
    }

    @Override // androidx.appcompat.app.a
    public void a0(boolean z10) {
        Z(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void b0(boolean z10) {
        Z(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void c0(boolean z10) {
        Z(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void d0(boolean z10) {
        Z(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void e0(float f10) {
        u1.U1(this.f10396i.J(), f10);
    }

    @Override // androidx.appcompat.app.a
    public void f(androidx.appcompat.app.a.d dVar) {
        this.f10402o.add(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void g(androidx.appcompat.app.a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void h(androidx.appcompat.app.a.f fVar, int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void h0(int i10) {
        this.f10396i.r(i10);
    }

    @Override // androidx.appcompat.app.a
    public void i(androidx.appcompat.app.a.f fVar, int i10, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void i0(CharSequence charSequence) {
        this.f10396i.n(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void j(androidx.appcompat.app.a.f fVar, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void j0(int i10) {
        this.f10396i.O(i10);
    }

    @Override // androidx.appcompat.app.a
    public boolean k() {
        return this.f10396i.f();
    }

    @Override // androidx.appcompat.app.a
    public void k0(Drawable drawable) {
        this.f10396i.E(drawable);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        if (!this.f10396i.k()) {
            return false;
        }
        this.f10396i.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l0(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void m(boolean z10) {
        if (z10 == this.f10401n) {
            return;
        }
        this.f10401n = z10;
        int size = this.f10402o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f10402o.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void m0(int i10) {
        this.f10396i.setIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public View n() {
        return this.f10396i.w();
    }

    @Override // androidx.appcompat.app.a
    public void n0(Drawable drawable) {
        this.f10396i.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int o() {
        return this.f10396i.B();
    }

    @Override // androidx.appcompat.app.a
    public void o0(SpinnerAdapter spinnerAdapter, androidx.appcompat.app.a.e eVar) {
        this.f10396i.Q(spinnerAdapter, new w(eVar));
    }

    @Override // androidx.appcompat.app.a
    public float p() {
        return u1.T(this.f10396i.J());
    }

    @Override // androidx.appcompat.app.a
    public void p0(int i10) {
        this.f10396i.setLogo(i10);
    }

    @Override // androidx.appcompat.app.a
    public int q() {
        return this.f10396i.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public void q0(Drawable drawable) {
        this.f10396i.x(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void r0(int i10) {
        if (i10 == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f10396i.p(i10);
    }

    @Override // androidx.appcompat.app.a
    public int s() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void s0(int i10) {
        if (this.f10396i.o() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f10396i.G(i10);
    }

    @Override // androidx.appcompat.app.a
    public int t() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void t0(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public int u() {
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.app.a.f v() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void v0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public CharSequence w() {
        return this.f10396i.S();
    }

    @Override // androidx.appcompat.app.a
    public void w0(int i10) {
        l0 l0Var = this.f10396i;
        l0Var.F(i10 != 0 ? l0Var.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.app.a.f x(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.a
    public void x0(CharSequence charSequence) {
        this.f10396i.F(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public int y() {
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void y0(int i10) {
        l0 l0Var = this.f10396i;
        l0Var.setTitle(i10 != 0 ? l0Var.getContext().getText(i10) : null);
    }

    @Override // androidx.appcompat.app.a
    public Context z() {
        return this.f10396i.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void z0(CharSequence charSequence) {
        this.f10396i.setTitle(charSequence);
    }
}
