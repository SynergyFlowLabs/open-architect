package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class a0 implements z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f37372l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37373a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private g0 f37374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private g0 f37375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private g0 f37376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private g0 f37377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private g0 f37378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private g0 f37379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private g0 f37380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private g0 f37381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private Function1<? super g, Unit> f37382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private Function1<? super g, Unit> f37383k;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37384a = new a();

        a() {
            super(1);
        }

        public final void c(g gVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            c(gVar);
            return Unit.f312394a;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37385a = new b();

        b() {
            super(1);
        }

        public final void c(g gVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(g gVar) {
            c(gVar);
            return Unit.f312394a;
        }
    }

    public a0() {
        g0.a aVar = g0.f37418b;
        this.f37374b = aVar.c();
        this.f37375c = aVar.c();
        this.f37376d = aVar.c();
        this.f37377e = aVar.c();
        this.f37378f = aVar.c();
        this.f37379g = aVar.c();
        this.f37380h = aVar.c();
        this.f37381i = aVar.c();
        this.f37382j = a.f37384a;
        this.f37383k = b.f37385a;
    }

    @Override // androidx.compose.ui.focus.z
    public void B(@NotNull g0 g0Var) {
        this.f37376d = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 C() {
        return this.f37377e;
    }

    @Override // androidx.compose.ui.focus.z
    public void D(boolean z10) {
        this.f37373a = z10;
    }

    @Override // androidx.compose.ui.focus.z
    public void E(@NotNull g0 g0Var) {
        this.f37377e = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    public void F(@NotNull g0 g0Var) {
        this.f37380h = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 G() {
        return this.f37375c;
    }

    @Override // androidx.compose.ui.focus.z
    public void I(@NotNull g0 g0Var) {
        this.f37375c = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    public void L(@NotNull g0 g0Var) {
        this.f37381i = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    public void M(@NotNull g0 g0Var) {
        this.f37378f = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    public void N(@NotNull Function1<? super g, Unit> function1) {
        this.f37382j = function1;
    }

    @Override // androidx.compose.ui.focus.z
    public void O(@NotNull g0 g0Var) {
        this.f37379g = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    public boolean P() {
        return this.f37373a;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public Function1<g, Unit> Q() {
        return this.f37382j;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public Function1<g, Unit> R() {
        return this.f37383k;
    }

    @Override // androidx.compose.ui.focus.z
    public void S(@NotNull Function1<? super g, Unit> function1) {
        this.f37383k = function1;
    }

    @Override // androidx.compose.ui.focus.z
    public void V(@NotNull g0 g0Var) {
        this.f37374b = g0Var;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 u() {
        return this.f37380h;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 v() {
        return this.f37381i;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 w() {
        return this.f37374b;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 x() {
        return this.f37379g;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 y() {
        return this.f37378f;
    }

    @Override // androidx.compose.ui.focus.z
    @NotNull
    public g0 z() {
        return this.f37376d;
    }
}
