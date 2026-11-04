package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    static final class a extends kotlin.jvm.internal.l0 implements Function1<f, g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37477a = new a();

        a() {
            super(1);
        }

        public final g0 c(int i10) {
            return g0.f37418b.c();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ g0 invoke(f fVar) {
            return c(fVar.o());
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<f, g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37478a = new b();

        b() {
            super(1);
        }

        public final g0 c(int i10) {
            return g0.f37418b.c();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ g0 invoke(f fVar) {
            return c(fVar.o());
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f37479a = new c();

        c() {
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

    static final class d extends kotlin.jvm.internal.l0 implements Function1<g, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f37480a = new d();

        d() {
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

    @androidx.compose.ui.o
    static /* synthetic */ void H() {
    }

    @androidx.compose.ui.o
    static /* synthetic */ void T() {
    }

    @NotNull
    default Function1<f, g0> A() {
        return b.f37478a;
    }

    default void B(@NotNull g0 g0Var) {
    }

    @NotNull
    default g0 C() {
        return g0.f37418b.c();
    }

    void D(boolean z10);

    default void E(@NotNull g0 g0Var) {
    }

    default void F(@NotNull g0 g0Var) {
    }

    @NotNull
    default g0 G() {
        return g0.f37418b.c();
    }

    default void I(@NotNull g0 g0Var) {
    }

    @kotlin.l(message = "Use onExit instead", replaceWith = @kotlin.b1(expression = "onExit", imports = {}))
    default void J(@NotNull Function1<? super f, g0> function1) {
        S(b0.c(function1));
    }

    @NotNull
    default Function1<f, g0> K() {
        return a.f37477a;
    }

    default void L(@NotNull g0 g0Var) {
    }

    default void M(@NotNull g0 g0Var) {
    }

    default void N(@NotNull Function1<? super g, Unit> function1) {
    }

    default void O(@NotNull g0 g0Var) {
    }

    boolean P();

    @NotNull
    default Function1<g, Unit> Q() {
        return c.f37479a;
    }

    @NotNull
    default Function1<g, Unit> R() {
        return d.f37480a;
    }

    default void S(@NotNull Function1<? super g, Unit> function1) {
    }

    @kotlin.l(message = "Use onEnter instead", replaceWith = @kotlin.b1(expression = "onEnter", imports = {}))
    default void U(@NotNull Function1<? super f, g0> function1) {
        N(b0.c(function1));
    }

    default void V(@NotNull g0 g0Var) {
    }

    @NotNull
    default g0 u() {
        return g0.f37418b.c();
    }

    @NotNull
    default g0 v() {
        return g0.f37418b.c();
    }

    @NotNull
    default g0 w() {
        return g0.f37418b.c();
    }

    @NotNull
    default g0 x() {
        return g0.f37418b.c();
    }

    @NotNull
    default g0 y() {
        return g0.f37418b.c();
    }

    @NotNull
    default g0 z() {
        return g0.f37418b.c();
    }
}
