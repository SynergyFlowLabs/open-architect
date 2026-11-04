package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class z1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f40117i = androidx.compose.runtime.snapshots.q0.f36556l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.snapshots.q0 f40118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<l0, Unit> f40119b = f.f40131a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<l0, Unit> f40120c = g.f40132a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<l0, Unit> f40121d = h.f40133a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<l0, Unit> f40122e = b.f40127a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<l0, Unit> f40123f = c.f40128a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function1<l0, Unit> f40124g = d.f40129a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function1<l0, Unit> f40125h = e.f40130a;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f40126a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
            return Boolean.valueOf(!((y1) obj).H2());
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f40127a = new b();

        b() {
            super(1);
        }

        public final void c(l0 l0Var) {
            if (l0Var.H2()) {
                l0.S1(l0Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40128a = new c();

        c() {
            super(1);
        }

        public final void c(l0 l0Var) {
            if (l0Var.H2()) {
                l0.S1(l0Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f40129a = new d();

        d() {
            super(1);
        }

        public final void c(l0 l0Var) {
            if (l0Var.H2()) {
                l0.O1(l0Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f40130a = new e();

        e() {
            super(1);
        }

        public final void c(l0 l0Var) {
            if (l0Var.H2()) {
                l0.O1(l0Var, false, 1, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f40131a = new f();

        f() {
            super(1);
        }

        public final void c(l0 l0Var) {
            if (l0Var.H2()) {
                l0.Q1(l0Var, false, false, false, 7, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f40132a = new g();

        g() {
            super(1);
        }

        public final void c(l0 l0Var) {
            if (l0Var.H2()) {
                l0.U1(l0Var, false, false, false, 7, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f40133a = new h();

        h() {
            super(1);
        }

        public final void c(l0 l0Var) {
            if (l0Var.H2()) {
                l0Var.d1();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    public z1(@NotNull Function1<? super Function0<Unit>, Unit> function1) {
        this.f40118a = new androidx.compose.runtime.snapshots.q0(function1);
    }

    public static /* synthetic */ void d(z1 z1Var, l0 l0Var, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        z1Var.c(l0Var, z10, function0);
    }

    public static /* synthetic */ void f(z1 z1Var, l0 l0Var, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        z1Var.e(l0Var, z10, function0);
    }

    public static /* synthetic */ void h(z1 z1Var, l0 l0Var, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        z1Var.g(l0Var, z10, function0);
    }

    public final void a(@NotNull Object obj) {
        this.f40118a.g(obj);
    }

    public final void b() {
        this.f40118a.h(a.f40126a);
    }

    public final void c(@NotNull l0 l0Var, boolean z10, @NotNull Function0<Unit> function0) {
        if (!z10 || l0Var.t0() == null) {
            i(l0Var, this.f40123f, function0);
        } else {
            i(l0Var, this.f40124g, function0);
        }
    }

    public final void e(@NotNull l0 l0Var, boolean z10, @NotNull Function0<Unit> function0) {
        if (!z10 || l0Var.t0() == null) {
            i(l0Var, this.f40122e, function0);
        } else {
            i(l0Var, this.f40125h, function0);
        }
    }

    public final void g(@NotNull l0 l0Var, boolean z10, @NotNull Function0<Unit> function0) {
        if (!z10 || l0Var.t0() == null) {
            i(l0Var, this.f40120c, function0);
        } else {
            i(l0Var, this.f40119b, function0);
        }
    }

    public final <T extends y1> void i(@NotNull T t10, @NotNull Function1<? super T, Unit> function1, @NotNull Function0<Unit> function0) {
        this.f40118a.m(t10, function1, function0);
    }

    public final void j(@NotNull l0 l0Var, @NotNull Function0<Unit> function0) {
        i(l0Var, this.f40121d, function0);
    }

    public final void k() {
        this.f40118a.t();
    }

    public final void l() {
        this.f40118a.u();
        this.f40118a.f();
    }
}
