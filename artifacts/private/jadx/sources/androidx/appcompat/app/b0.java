package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.z0;
import androidx.core.view.f2;
import androidx.core.view.g2;
import androidx.core.view.h2;
import androidx.core.view.i2;
import androidx.core.view.u1;
import androidx.fragment.app.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class b0 extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final String N = "WindowDecorActionBar";
    private static final Interpolator O = new AccelerateInterpolator();
    private static final Interpolator P = new DecelerateInterpolator();
    private static final int Q = -1;
    private static final long R = 100;
    private static final long S = 200;
    private boolean A;
    boolean D;
    boolean E;
    private boolean F;
    androidx.appcompat.view.h H;
    private boolean I;
    boolean J;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Context f10302i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Context f10303j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Activity f10304k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ActionBarOverlayLayout f10305l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ActionBarContainer f10306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    l0 f10307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ActionBarContextView f10308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f10309p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    z0 f10310q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f10312s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10314u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    d f10315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    androidx.appcompat.view.b f10316w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.b.a f10317x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10318y;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList<e> f10311r = new ArrayList<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10313t = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList<androidx.appcompat.app.a.d> f10319z = new ArrayList<>();
    private int B = 0;
    boolean C = true;
    private boolean G = true;
    final g2 K = new a();
    final g2 L = new b();
    final i2 M = new c();

    class a extends h2 {
        a() {
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void b(View view) {
            View view2;
            b0 b0Var = b0.this;
            if (b0Var.C && (view2 = b0Var.f10309p) != null) {
                view2.setTranslationY(0.0f);
                b0.this.f10306m.setTranslationY(0.0f);
            }
            b0.this.f10306m.setVisibility(8);
            b0.this.f10306m.setTransitioning(false);
            b0 b0Var2 = b0.this;
            b0Var2.H = null;
            b0Var2.G0();
            ActionBarOverlayLayout actionBarOverlayLayout = b0.this.f10305l;
            if (actionBarOverlayLayout != null) {
                u1.A1(actionBarOverlayLayout);
            }
        }
    }

    class b extends h2 {
        b() {
        }

        @Override // androidx.core.view.h2, androidx.core.view.g2
        public void b(View view) {
            b0 b0Var = b0.this;
            b0Var.H = null;
            b0Var.f10306m.requestLayout();
        }
    }

    class c implements i2 {
        c() {
        }

        @Override // androidx.core.view.i2
        public void a(View view) {
            ((View) b0.this.f10306m.getParent()).invalidate();
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public class d extends androidx.appcompat.view.b implements androidx.appcompat.view.menu.g.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f10323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f10324d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.appcompat.view.b.a f10325e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private WeakReference<View> f10326f;

        public d(Context context, androidx.appcompat.view.b.a aVar) {
            this.f10323c = context;
            this.f10325e = aVar;
            androidx.appcompat.view.menu.g gVarA0 = new androidx.appcompat.view.menu.g(context).a0(1);
            this.f10324d = gVarA0;
            gVarA0.Y(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull MenuItem menuItem) {
            androidx.appcompat.view.b.a aVar = this.f10325e;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@NonNull androidx.appcompat.view.menu.g gVar) {
            if (this.f10325e == null) {
                return;
            }
            k();
            b0.this.f10308o.o();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            b0 b0Var = b0.this;
            if (b0Var.f10315v != this) {
                return;
            }
            if (b0.E0(b0Var.D, b0Var.E, false)) {
                this.f10325e.d(this);
            } else {
                b0 b0Var2 = b0.this;
                b0Var2.f10316w = this;
                b0Var2.f10317x = this.f10325e;
            }
            this.f10325e = null;
            b0.this.D0(false);
            b0.this.f10308o.p();
            b0 b0Var3 = b0.this;
            b0Var3.f10305l.setHideOnContentScrollEnabled(b0Var3.J);
            b0.this.f10315v = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f10326f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f10324d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f10323c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return b0.this.f10308o.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return b0.this.f10308o.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (b0.this.f10315v != this) {
                return;
            }
            this.f10324d.n0();
            try {
                this.f10325e.c(this, this.f10324d);
                this.f10324d.m0();
            } catch (Throwable th2) {
                this.f10324d.m0();
                throw th2;
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return b0.this.f10308o.s();
        }

        @Override // androidx.appcompat.view.b
        public void n(View view) {
            b0.this.f10308o.setCustomView(view);
            this.f10326f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void o(int i10) {
            p(b0.this.f10302i.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void p(CharSequence charSequence) {
            b0.this.f10308o.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void r(int i10) {
            s(b0.this.f10302i.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void s(CharSequence charSequence) {
            b0.this.f10308o.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void t(boolean z10) {
            super.t(z10);
            b0.this.f10308o.setTitleOptional(z10);
        }

        public boolean u() {
            this.f10324d.n0();
            try {
                boolean zA = this.f10325e.a(this, this.f10324d);
                androidx.appcompat.view.menu.g gVar = this.f10324d;
                return zA;
            } finally {
                this.f10324d.m0();
            }
        }

        public void v(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        public void w(androidx.appcompat.view.menu.s sVar) {
        }

        public boolean x(androidx.appcompat.view.menu.s sVar) {
            if (this.f10325e == null) {
                return false;
            }
            if (!sVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.m(b0.this.z(), sVar).l();
            return true;
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public class e extends androidx.appcompat.app.a.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.appcompat.app.a.g f10328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f10329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Drawable f10330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f10331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CharSequence f10332f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10333g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f10334h;

        public e() {
        }

        @Override // androidx.appcompat.app.a.f
        public CharSequence a() {
            return this.f10332f;
        }

        @Override // androidx.appcompat.app.a.f
        public View b() {
            return this.f10334h;
        }

        @Override // androidx.appcompat.app.a.f
        public Drawable c() {
            return this.f10330d;
        }

        @Override // androidx.appcompat.app.a.f
        public int d() {
            return this.f10333g;
        }

        @Override // androidx.appcompat.app.a.f
        public Object e() {
            return this.f10329c;
        }

        @Override // androidx.appcompat.app.a.f
        public CharSequence f() {
            return this.f10331e;
        }

        @Override // androidx.appcompat.app.a.f
        public void g() {
            b0.this.R(this);
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f h(int i10) {
            return i(b0.this.f10302i.getResources().getText(i10));
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f i(CharSequence charSequence) {
            this.f10332f = charSequence;
            int i10 = this.f10333g;
            if (i10 >= 0) {
                b0.this.f10310q.m(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f j(int i10) {
            int i11 = 4 ^ 0;
            return k(LayoutInflater.from(b0.this.z()).inflate(i10, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f k(View view) {
            this.f10334h = view;
            int i10 = this.f10333g;
            if (i10 >= 0) {
                b0.this.f10310q.m(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f l(int i10) {
            return m(j.a.b(b0.this.f10302i, i10));
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f m(Drawable drawable) {
            this.f10330d = drawable;
            int i10 = this.f10333g;
            if (i10 >= 0) {
                b0.this.f10310q.m(i10);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f n(androidx.appcompat.app.a.g gVar) {
            this.f10328b = gVar;
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f o(Object obj) {
            this.f10329c = obj;
            return this;
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f p(int i10) {
            return q(b0.this.f10302i.getResources().getText(i10));
        }

        @Override // androidx.appcompat.app.a.f
        public androidx.appcompat.app.a.f q(CharSequence charSequence) {
            this.f10331e = charSequence;
            int i10 = this.f10333g;
            if (i10 >= 0) {
                b0.this.f10310q.m(i10);
            }
            return this;
        }

        public androidx.appcompat.app.a.g r() {
            return this.f10328b;
        }

        public void s(int i10) {
            this.f10333g = i10;
        }
    }

    public b0(Activity activity, boolean z10) {
        this.f10304k = activity;
        View decorView = activity.getWindow().getDecorView();
        P0(decorView);
        if (z10) {
            return;
        }
        this.f10309p = decorView.findViewById(R.id.content);
    }

    static boolean E0(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        if (!z10 && !z11) {
            return true;
        }
        return false;
    }

    private void F0() {
        if (this.f10312s != null) {
            R(null);
        }
        this.f10311r.clear();
        z0 z0Var = this.f10310q;
        if (z0Var != null) {
            z0Var.k();
        }
        this.f10313t = -1;
    }

    private void H0(androidx.appcompat.app.a.f fVar, int i10) {
        e eVar = (e) fVar;
        if (eVar.r() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        eVar.s(i10);
        this.f10311r.add(i10, eVar);
        int size = this.f10311r.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            } else {
                this.f10311r.get(i10).s(i10);
            }
        }
    }

    private void K0() {
        if (this.f10310q != null) {
            return;
        }
        z0 z0Var = new z0(this.f10302i);
        boolean z10 = false;
        if (this.A) {
            z0Var.setVisibility(0);
            this.f10307n.M(z0Var);
        } else {
            if (t() == 2) {
                z0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10305l;
                if (actionBarOverlayLayout != null) {
                    u1.A1(actionBarOverlayLayout);
                }
            } else {
                z0Var.setVisibility(8);
            }
            this.f10306m.setTabContainer(z0Var);
        }
        this.f10310q = z0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 L0(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : AbstractJsonLexerKt.NULL);
        throw new IllegalStateException(sb2.toString());
    }

    private void O0() {
        if (this.F) {
            this.F = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10305l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            T0(false);
        }
    }

    private void P0(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(i.a.g.f286226x);
        this.f10305l = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f10307n = L0(view.findViewById(i.a.g.f286180a));
        this.f10308o = (ActionBarContextView) view.findViewById(i.a.g.f286194h);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(i.a.g.f286184c);
        this.f10306m = actionBarContainer;
        l0 l0Var = this.f10307n;
        if (l0Var == null || this.f10308o == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f10302i = l0Var.getContext();
        boolean z10 = (this.f10307n.B() & 4) != 0;
        if (z10) {
            this.f10314u = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f10302i);
        l0(aVarB.a() || z10);
        Q0(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f10302i.obtainStyledAttributes(null, i.a.m.f286477a, i.a.b.f285909f, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286609p, false)) {
            g0(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.a.m.f286593n, 0);
        if (dimensionPixelSize != 0) {
            e0(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void Q0(boolean z10) {
        this.A = z10;
        if (z10) {
            this.f10306m.setTabContainer(null);
            this.f10307n.M(this.f10310q);
        } else {
            this.f10307n.M(null);
            this.f10306m.setTabContainer(this.f10310q);
        }
        boolean z11 = true;
        boolean z12 = t() == 2;
        z0 z0Var = this.f10310q;
        if (z0Var != null) {
            if (z12) {
                z0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10305l;
                if (actionBarOverlayLayout != null) {
                    u1.A1(actionBarOverlayLayout);
                }
            } else {
                z0Var.setVisibility(8);
            }
        }
        this.f10307n.u(!this.A && z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10305l;
        if (this.A || !z12) {
            z11 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z11);
    }

    private boolean R0() {
        return this.f10306m.isLaidOut();
    }

    private void S0() {
        if (!this.F) {
            this.F = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10305l;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            T0(false);
        }
    }

    private void T0(boolean z10) {
        if (E0(this.D, this.E, this.F)) {
            if (this.G) {
                return;
            }
            this.G = true;
            J0(z10);
            return;
        }
        if (this.G) {
            this.G = false;
            I0(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public CharSequence A() {
        return this.f10307n.getTitle();
    }

    @Override // androidx.appcompat.app.a
    public void A0(CharSequence charSequence) {
        this.f10307n.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void B() {
        if (this.D) {
            return;
        }
        this.D = true;
        T0(false);
    }

    @Override // androidx.appcompat.app.a
    public void B0() {
        if (this.D) {
            this.D = false;
            T0(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b C0(androidx.appcompat.view.b.a aVar) {
        d dVar = this.f10315v;
        if (dVar != null) {
            dVar.c();
        }
        this.f10305l.setHideOnContentScrollEnabled(false);
        this.f10308o.t();
        d dVar2 = new d(this.f10308o.getContext(), aVar);
        if (!dVar2.u()) {
            return null;
        }
        this.f10315v = dVar2;
        dVar2.k();
        this.f10308o.q(dVar2);
        D0(true);
        return dVar2;
    }

    @Override // androidx.appcompat.app.a
    public boolean D() {
        return this.f10305l.B();
    }

    public void D0(boolean z10) {
        f2 f2VarN;
        f2 f2VarN2;
        if (z10) {
            S0();
        } else {
            O0();
        }
        if (!R0()) {
            if (z10) {
                this.f10307n.setVisibility(4);
                this.f10308o.setVisibility(0);
                return;
            } else {
                this.f10307n.setVisibility(0);
                this.f10308o.setVisibility(8);
                return;
            }
        }
        if (z10) {
            f2VarN = this.f10307n.I(4, R);
            f2VarN2 = this.f10308o.n(0, S);
        } else {
            f2 f2VarI = this.f10307n.I(0, S);
            f2VarN = this.f10308o.n(8, R);
            f2VarN2 = f2VarI;
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f2VarN, f2VarN2);
        hVar.h();
    }

    @Override // androidx.appcompat.app.a
    public boolean E() {
        int iQ = q();
        return this.G && (iQ == 0 || r() < iQ);
    }

    @Override // androidx.appcompat.app.a
    public boolean F() {
        l0 l0Var = this.f10307n;
        return l0Var != null && l0Var.l();
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.app.a.f G() {
        return new e();
    }

    void G0() {
        androidx.appcompat.view.b.a aVar = this.f10317x;
        if (aVar != null) {
            aVar.d(this.f10316w);
            this.f10316w = null;
            this.f10317x = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void H(Configuration configuration) {
        Q0(androidx.appcompat.view.a.b(this.f10302i).g());
    }

    public void I0(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        if (this.B != 0 || (!this.I && !z10)) {
            this.K.b(null);
            return;
        }
        this.f10306m.setAlpha(1.0f);
        this.f10306m.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f10306m.getHeight();
        if (z10) {
            int[] iArr = {0, 0};
            this.f10306m.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        f2 f2VarA = u1.g(this.f10306m).A(f10);
        f2VarA.w(this.M);
        hVar2.c(f2VarA);
        if (this.C && (view = this.f10309p) != null) {
            hVar2.c(u1.g(view).A(f10));
        }
        hVar2.f(O);
        hVar2.e(250L);
        hVar2.g(this.K);
        this.H = hVar2;
        hVar2.h();
    }

    @Override // androidx.appcompat.app.a
    public boolean J(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f10315v;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    public void J0(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
        }
        this.f10306m.setVisibility(0);
        if (this.B == 0 && (this.I || z10)) {
            this.f10306m.setTranslationY(0.0f);
            float f10 = -this.f10306m.getHeight();
            if (z10) {
                int[] iArr = {0, 0};
                this.f10306m.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f10306m.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            f2 f2VarA = u1.g(this.f10306m).A(0.0f);
            f2VarA.w(this.M);
            hVar2.c(f2VarA);
            if (this.C && (view2 = this.f10309p) != null) {
                view2.setTranslationY(f10);
                hVar2.c(u1.g(this.f10309p).A(0.0f));
            }
            hVar2.f(P);
            hVar2.e(250L);
            hVar2.g(this.L);
            this.H = hVar2;
            hVar2.h();
        } else {
            this.f10306m.setAlpha(1.0f);
            this.f10306m.setTranslationY(0.0f);
            if (this.C && (view = this.f10309p) != null) {
                view.setTranslationY(0.0f);
            }
            this.L.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10305l;
        if (actionBarOverlayLayout != null) {
            u1.A1(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.app.a
    public void M() {
        F0();
    }

    public boolean M0() {
        return this.f10307n.e();
    }

    @Override // androidx.appcompat.app.a
    public void N(androidx.appcompat.app.a.d dVar) {
        this.f10319z.remove(dVar);
    }

    public boolean N0() {
        return this.f10307n.i();
    }

    @Override // androidx.appcompat.app.a
    public void O(androidx.appcompat.app.a.f fVar) {
        P(fVar.d());
    }

    @Override // androidx.appcompat.app.a
    public void P(int i10) {
        if (this.f10310q == null) {
            return;
        }
        e eVar = this.f10312s;
        int iD = eVar != null ? eVar.d() : this.f10313t;
        this.f10310q.l(i10);
        e eVarRemove = this.f10311r.remove(i10);
        if (eVarRemove != null) {
            eVarRemove.s(-1);
        }
        int size = this.f10311r.size();
        for (int i11 = i10; i11 < size; i11++) {
            this.f10311r.get(i11).s(i11);
        }
        if (iD == i10) {
            R(this.f10311r.isEmpty() ? null : this.f10311r.get(Math.max(0, i10 - 1)));
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean Q() {
        ViewGroup viewGroupJ = this.f10307n.J();
        if (viewGroupJ == null || viewGroupJ.hasFocus()) {
            return false;
        }
        viewGroupJ.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void R(androidx.appcompat.app.a.f fVar) {
        if (t() != 2) {
            this.f10313t = fVar != null ? fVar.d() : -1;
            return;
        }
        t0 t0VarS = (!(this.f10304k instanceof androidx.fragment.app.s) || this.f10307n.J().isInEditMode()) ? null : ((androidx.fragment.app.s) this.f10304k).getSupportFragmentManager().w().s();
        e eVar = this.f10312s;
        if (eVar != fVar) {
            this.f10310q.setTabSelected(fVar != null ? fVar.d() : -1);
            e eVar2 = this.f10312s;
            if (eVar2 != null) {
                eVar2.r().c(this.f10312s, t0VarS);
            }
            e eVar3 = (e) fVar;
            this.f10312s = eVar3;
            if (eVar3 != null) {
                eVar3.r().a(this.f10312s, t0VarS);
            }
        } else if (eVar != null) {
            eVar.r().b(this.f10312s, t0VarS);
            this.f10310q.c(fVar.d());
        }
        if (t0VarS != null && !t0VarS.w()) {
            t0VarS.m();
        }
    }

    @Override // androidx.appcompat.app.a
    public void S(Drawable drawable) {
        this.f10306m.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void T(int i10) {
        int i11 = 2 >> 0;
        U(LayoutInflater.from(z()).inflate(i10, this.f10307n.J(), false));
    }

    @Override // androidx.appcompat.app.a
    public void U(View view) {
        this.f10307n.C(view);
    }

    @Override // androidx.appcompat.app.a
    public void V(View view, androidx.appcompat.app.a.b bVar) {
        view.setLayoutParams(bVar);
        this.f10307n.C(view);
    }

    @Override // androidx.appcompat.app.a
    public void W(boolean z10) {
        if (!this.f10314u) {
            X(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void X(boolean z10) {
        Z(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void Y(int i10) {
        if ((i10 & 4) != 0) {
            this.f10314u = true;
        }
        this.f10307n.m(i10);
    }

    @Override // androidx.appcompat.app.a
    public void Z(int i10, int i11) {
        int iB = this.f10307n.B();
        if ((i11 & 4) != 0) {
            this.f10314u = true;
        }
        this.f10307n.m((i10 & i11) | ((~i11) & iB));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.E) {
            this.E = false;
            T0(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public void a0(boolean z10) {
        Z(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.app.a
    public void b0(boolean z10) {
        Z(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        if (this.E) {
            return;
        }
        this.E = true;
        T0(true);
    }

    @Override // androidx.appcompat.app.a
    public void c0(boolean z10) {
        Z(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        androidx.appcompat.view.h hVar = this.H;
        if (hVar != null) {
            hVar.a();
            this.H = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void d0(boolean z10) {
        Z(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z10) {
        this.C = z10;
    }

    @Override // androidx.appcompat.app.a
    public void e0(float f10) {
        u1.U1(this.f10306m, f10);
    }

    @Override // androidx.appcompat.app.a
    public void f(androidx.appcompat.app.a.d dVar) {
        this.f10319z.add(dVar);
    }

    @Override // androidx.appcompat.app.a
    public void f0(int i10) {
        if (i10 != 0 && !this.f10305l.C()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f10305l.setActionBarHideOffset(i10);
    }

    @Override // androidx.appcompat.app.a
    public void g(androidx.appcompat.app.a.f fVar) {
        j(fVar, this.f10311r.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void g0(boolean z10) {
        if (z10 && !this.f10305l.C()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.J = z10;
        this.f10305l.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.app.a
    public void h(androidx.appcompat.app.a.f fVar, int i10) {
        i(fVar, i10, this.f10311r.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void h0(int i10) {
        this.f10307n.r(i10);
    }

    @Override // androidx.appcompat.app.a
    public void i(androidx.appcompat.app.a.f fVar, int i10, boolean z10) {
        K0();
        this.f10310q.a(fVar, i10, z10);
        H0(fVar, i10);
        if (z10) {
            R(fVar);
        }
    }

    @Override // androidx.appcompat.app.a
    public void i0(CharSequence charSequence) {
        this.f10307n.n(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void j(androidx.appcompat.app.a.f fVar, boolean z10) {
        K0();
        this.f10310q.b(fVar, z10);
        H0(fVar, this.f10311r.size());
        if (z10) {
            R(fVar);
        }
    }

    @Override // androidx.appcompat.app.a
    public void j0(int i10) {
        this.f10307n.O(i10);
    }

    @Override // androidx.appcompat.app.a
    public void k0(Drawable drawable) {
        this.f10307n.E(drawable);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        l0 l0Var = this.f10307n;
        if (l0Var == null || !l0Var.k()) {
            return false;
        }
        this.f10307n.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void l0(boolean z10) {
        this.f10307n.K(z10);
    }

    @Override // androidx.appcompat.app.a
    public void m(boolean z10) {
        if (z10 != this.f10318y) {
            this.f10318y = z10;
            int size = this.f10319z.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f10319z.get(i10).onMenuVisibilityChanged(z10);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public void m0(int i10) {
        this.f10307n.setIcon(i10);
    }

    @Override // androidx.appcompat.app.a
    public View n() {
        return this.f10307n.w();
    }

    @Override // androidx.appcompat.app.a
    public void n0(Drawable drawable) {
        this.f10307n.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int o() {
        return this.f10307n.B();
    }

    @Override // androidx.appcompat.app.a
    public void o0(SpinnerAdapter spinnerAdapter, androidx.appcompat.app.a.e eVar) {
        this.f10307n.Q(spinnerAdapter, new w(eVar));
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.B = i10;
    }

    @Override // androidx.appcompat.app.a
    public float p() {
        return u1.T(this.f10306m);
    }

    @Override // androidx.appcompat.app.a
    public void p0(int i10) {
        this.f10307n.setLogo(i10);
    }

    @Override // androidx.appcompat.app.a
    public int q() {
        return this.f10306m.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public void q0(Drawable drawable) {
        this.f10307n.x(drawable);
    }

    @Override // androidx.appcompat.app.a
    public int r() {
        return this.f10305l.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.a
    public void r0(int i10) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int iO = this.f10307n.o();
        if (iO == 2) {
            this.f10313t = u();
            R(null);
            this.f10310q.setVisibility(8);
        }
        if (iO != i10 && !this.A && (actionBarOverlayLayout = this.f10305l) != null) {
            u1.A1(actionBarOverlayLayout);
        }
        this.f10307n.p(i10);
        boolean z10 = false;
        if (i10 == 2) {
            K0();
            this.f10310q.setVisibility(0);
            int i11 = this.f10313t;
            if (i11 != -1) {
                s0(i11);
                this.f10313t = -1;
            }
        }
        this.f10307n.u(i10 == 2 && !this.A);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f10305l;
        if (i10 == 2 && !this.A) {
            z10 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z10);
    }

    @Override // androidx.appcompat.app.a
    public int s() {
        int iO = this.f10307n.o();
        if (iO == 1) {
            return this.f10307n.t();
        }
        if (iO == 2) {
            return this.f10311r.size();
        }
        int i10 = 4 << 0;
        return 0;
    }

    @Override // androidx.appcompat.app.a
    public void s0(int i10) {
        int iO = this.f10307n.o();
        if (iO == 1) {
            this.f10307n.G(i10);
        } else {
            if (iO != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            R(this.f10311r.get(i10));
        }
    }

    @Override // androidx.appcompat.app.a
    public int t() {
        return this.f10307n.o();
    }

    @Override // androidx.appcompat.app.a
    public void t0(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.I = z10;
        if (!z10 && (hVar = this.H) != null) {
            hVar.a();
        }
    }

    @Override // androidx.appcompat.app.a
    public int u() {
        e eVar;
        int iO = this.f10307n.o();
        if (iO == 1) {
            return this.f10307n.q();
        }
        if (iO == 2 && (eVar = this.f10312s) != null) {
            return eVar.d();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public void u0(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.app.a.f v() {
        return this.f10312s;
    }

    @Override // androidx.appcompat.app.a
    public void v0(Drawable drawable) {
        this.f10306m.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public CharSequence w() {
        return this.f10307n.S();
    }

    @Override // androidx.appcompat.app.a
    public void w0(int i10) {
        x0(this.f10302i.getString(i10));
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.app.a.f x(int i10) {
        return this.f10311r.get(i10);
    }

    @Override // androidx.appcompat.app.a
    public void x0(CharSequence charSequence) {
        this.f10307n.F(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public int y() {
        return this.f10311r.size();
    }

    @Override // androidx.appcompat.app.a
    public void y0(int i10) {
        z0(this.f10302i.getString(i10));
    }

    @Override // androidx.appcompat.app.a
    public Context z() {
        if (this.f10303j == null) {
            TypedValue typedValue = new TypedValue();
            this.f10302i.getTheme().resolveAttribute(i.a.b.f285939k, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f10303j = new ContextThemeWrapper(this.f10302i, i10);
            } else {
                this.f10303j = this.f10302i;
            }
        }
        return this.f10303j;
    }

    @Override // androidx.appcompat.app.a
    public void z0(CharSequence charSequence) {
        this.f10307n.setTitle(charSequence);
    }

    public b0(Dialog dialog) {
        P0(dialog.getWindow().getDecorView());
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public b0(View view) {
        P0(view);
    }
}
