package com.planner5d.library.activity.helper.ui;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.l0;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import com.planner5d.library.services.utility.k3;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    private static final c1<d> f137132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static final w0<d> f137133w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f137134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f137135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public final int f137136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f137137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f137138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    public final int f137139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l
    public final int f137140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f137141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f137142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f137143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l
    public final int f137144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l
    public final int f137145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l
    public final int f137146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f137147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k3 f137148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f137149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.planner5d.library.activity.helper.ui.b f137150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f137151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f137152s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f137153t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final WeakReference<Fragment> f137154u;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f137155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f137156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f137157d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f137158e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f137159f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f137160a;

        static {
            Boolean bool = Boolean.FALSE;
            f137155b = new a("StickToNavigation", 0, bool);
            f137156c = new a("Enabled", 1, bool);
            f137157d = new a("Disabled", 2, bool);
            f137158e = new a("EnabledCross", 3, Boolean.TRUE);
            f137159f = k();
        }

        private a(String str, int i10, Boolean bool) {
            super(str, i10);
            this.f137160a = bool;
        }

        private static /* synthetic */ a[] k() {
            return new a[]{f137155b, f137156c, f137157d, f137158e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f137159f.clone();
        }

        public boolean l() {
            return this == f137156c || this == f137158e;
        }
    }

    static {
        c1<d> c1Var = new c1<>(new b(com.planner5d.library.view.application.c.f244831c.g(), null).x());
        f137132v = c1Var;
        f137133w = c1Var;
    }

    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    private static boolean a(Fragment fragment) {
        d dVarF = f137133w.f();
        return dVarF == null || dVarF.f137154u.get() == fragment;
    }

    @l0
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static void d(Fragment fragment, d dVar) {
        if (a(fragment)) {
            f137132v.r(dVar);
        }
    }

    @l0
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static void e(d dVar) {
        f137132v.r(dVar);
    }

    @l0
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static void f(Fragment fragment, com.planner5d.library.activity.helper.ui.b bVar) {
        g(fragment, bVar, false);
    }

    @l0
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static void g(Fragment fragment, com.planner5d.library.activity.helper.ui.b bVar, boolean z10) {
        if (a(fragment) || z10) {
            f137132v.r(new d(f137133w.f(), fragment, bVar));
        }
    }

    @l0
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static void h(Fragment fragment, k3 k3Var) {
        if (a(fragment)) {
            i(k3Var);
        }
    }

    @l0
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static void i(k3 k3Var) {
        d dVarF = f137133w.f();
        f137132v.r(new d(dVarF, dVarF == null ? null : dVarF.f137154u.get(), k3Var));
    }

    @l0
    @Deprecated(since = "Creates quite some issues with modifying UiState for other fragments, drop when possible")
    public static void j(Fragment fragment, boolean z10) {
        if (a(fragment)) {
            f137132v.r(new d(f137133w.f(), fragment, z10));
        }
    }

    public int b(Context context) {
        int i10 = this.f137146m;
        return i10 == -1 ? androidx.core.content.d.g(context, com.planner5d.library.view.d.e.Pf) : i10;
    }

    @p0
    public Fragment c() {
        return this.f137154u.get();
    }

    private d(b bVar) {
        this.f137134a = bVar.f137162b;
        this.f137135b = bVar.f137163c;
        this.f137136c = bVar.f137164d;
        this.f137137d = bVar.f137165e;
        this.f137138e = bVar.f137166f;
        this.f137139f = bVar.f137167g;
        this.f137140g = bVar.f137168h;
        this.f137141h = bVar.f137169i;
        this.f137142i = bVar.f137170j;
        this.f137143j = bVar.f137171k;
        this.f137144k = bVar.f137172l;
        this.f137145l = bVar.f137173m;
        this.f137146m = bVar.f137174n;
        this.f137147n = bVar.f137175o;
        this.f137148o = bVar.f137176p;
        this.f137149p = bVar.f137177q;
        this.f137150q = new com.planner5d.library.activity.helper.ui.b(false);
        this.f137151r = bVar.f137179s;
        this.f137152s = bVar.f137180t;
        this.f137153t = bVar.f137181u;
        this.f137154u = new WeakReference<>(bVar.f137178r);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f137161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f137162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f137163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @l
        private int f137164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f137165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f137166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @l
        private int f137167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @l
        private int f137168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f137169i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f137170j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f137171k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @l
        private int f137172l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @l
        private int f137173m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @l
        private int f137174n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f137175o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private k3 f137176p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f137177q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Fragment f137178r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f137179s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f137180t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f137181u;

        public b(Context context, Fragment fragment) {
            this.f137161a = context;
            this.f137178r = fragment;
            this.f137162b = 7;
            this.f137163c = a.f137155b;
            this.f137164d = androidx.core.content.d.g(context, com.planner5d.library.view.d.e.Ol);
            this.f137165e = context.getResources().getBoolean(com.planner5d.library.view.d.C1719d.f245541l);
            this.f137166f = true;
            this.f137167g = androidx.core.content.d.g(context, com.planner5d.library.view.d.e.f245616cm);
            this.f137168h = 0;
            this.f137169i = true;
            this.f137170j = true;
            this.f137171k = false;
            this.f137172l = androidx.core.content.d.g(context, com.planner5d.library.view.d.e.Xl);
            this.f137173m = androidx.core.content.d.g(context, com.planner5d.library.view.d.e.Wl);
            this.f137174n = androidx.core.content.d.g(context, com.planner5d.library.view.d.e.Ul);
            this.f137175o = false;
            this.f137176p = null;
            this.f137177q = false;
            this.f137179s = false;
            this.f137180t = false;
            this.f137181u = false;
        }

        public b A(@n int i10) {
            this.f137164d = androidx.core.content.d.g(this.f137161a, i10);
            return this;
        }

        public b B(@n int i10) {
            this.f137172l = androidx.core.content.d.g(this.f137161a, i10);
            return this;
        }

        public b C(@n int i10) {
            this.f137174n = androidx.core.content.d.g(this.f137161a, i10);
            return this;
        }

        public b D(@n int i10) {
            this.f137173m = androidx.core.content.d.g(this.f137161a, i10);
            return this;
        }

        public b E(boolean z10) {
            this.f137171k = z10;
            return this;
        }

        public b F(boolean z10) {
            this.f137166f = z10;
            return this;
        }

        public b G(boolean z10) {
            this.f137169i = z10;
            return this;
        }

        public b H(boolean z10) {
            this.f137165e = z10;
            return this;
        }

        public b I(boolean z10) {
            this.f137179s = z10;
            return this;
        }

        public b J(int i10) {
            this.f137162b = i10;
            return this;
        }

        public b K(k3 k3Var) {
            this.f137176p = k3Var;
            return this;
        }

        public b L(boolean z10) {
            this.f137175o = z10;
            return this;
        }

        public b M(boolean z10) {
            this.f137181u = z10;
            return this;
        }

        public b N(boolean z10) {
            this.f137170j = z10;
            return this;
        }

        public b u(a aVar) {
            this.f137163c = aVar;
            return this;
        }

        public b v(boolean z10) {
            this.f137180t = z10;
            return this;
        }

        public b w(boolean z10) {
            this.f137177q = z10;
            return this;
        }

        public d x() {
            return new d(this);
        }

        public b y(@n int i10) {
            this.f137168h = androidx.core.content.d.g(this.f137161a, i10);
            return this;
        }

        public b z(@n int i10) {
            this.f137167g = androidx.core.content.d.g(this.f137161a, i10);
            return this;
        }

        public b(@NonNull d dVar, Context context, Fragment fragment) {
            this.f137161a = context;
            this.f137178r = fragment;
            this.f137162b = dVar.f137134a;
            this.f137163c = dVar.f137135b;
            this.f137164d = dVar.f137136c;
            this.f137165e = dVar.f137137d;
            this.f137166f = dVar.f137138e;
            this.f137167g = dVar.f137139f;
            this.f137169i = dVar.f137141h;
            this.f137170j = dVar.f137142i;
            this.f137171k = dVar.f137143j;
            this.f137172l = dVar.f137144k;
            this.f137173m = dVar.f137145l;
            this.f137174n = dVar.f137146m;
            this.f137175o = dVar.f137147n;
            this.f137176p = dVar.f137148o;
            this.f137177q = dVar.f137149p;
            this.f137179s = dVar.f137151r;
            this.f137180t = dVar.f137152s;
            this.f137181u = dVar.f137153t;
        }
    }

    private d(d dVar, Fragment fragment, k3 k3Var) {
        this(dVar, fragment, k3Var, dVar.f137142i, dVar.f137150q);
    }

    private d(d dVar, Fragment fragment, com.planner5d.library.activity.helper.ui.b bVar) {
        this(dVar, fragment, dVar.f137148o, dVar.f137142i, bVar);
    }

    private d(d dVar, Fragment fragment, boolean z10) {
        this(dVar, fragment, dVar.f137148o, z10, dVar.f137150q);
    }

    private d(d dVar, @p0 Fragment fragment, k3 k3Var, boolean z10, com.planner5d.library.activity.helper.ui.b bVar) {
        this.f137154u = new WeakReference<>(fragment);
        this.f137148o = k3Var;
        this.f137142i = z10;
        this.f137150q = bVar;
        this.f137134a = dVar.f137134a;
        this.f137135b = dVar.f137135b;
        this.f137136c = dVar.f137136c;
        this.f137137d = dVar.f137137d;
        this.f137138e = dVar.f137138e;
        this.f137139f = dVar.f137139f;
        this.f137140g = dVar.f137140g;
        this.f137141h = dVar.f137141h;
        this.f137143j = dVar.f137143j;
        this.f137144k = dVar.f137144k;
        this.f137145l = dVar.f137145l;
        this.f137146m = dVar.f137146m;
        this.f137147n = dVar.f137147n;
        this.f137149p = dVar.f137149p;
        this.f137151r = dVar.f137151r;
        this.f137152s = dVar.f137152s;
        this.f137153t = dVar.f137153t;
    }
}
