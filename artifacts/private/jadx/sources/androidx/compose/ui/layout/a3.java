package androidx.compose.ui.layout;

import androidx.compose.runtime.t5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1351:1\n1#2:1352\n*E\n"})
public final class a3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f39244f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c3 f39245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private s0 f39246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.node.l0, a3, Unit> f39247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.node.l0, androidx.compose.runtime.p0, Unit> f39248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.ui.node.l0, Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1>, Unit> f39249e;

    public interface a {
        boolean a(@NotNull t5 t5Var);

        @NotNull
        b apply();

        void cancel();

        boolean isComplete();
    }

    public interface b {
        default long a(int i10) {
            return androidx.compose.ui.unit.u.f42720b.a();
        }

        default int b() {
            return 0;
        }

        default void c(@Nullable Object obj, @NotNull Function1<? super androidx.compose.ui.node.p2, ? extends androidx.compose.ui.node.p2.a.EnumC0311a> function1) {
        }

        default void d(int i10, long j10) {
        }

        void dispose();
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.node.l0, androidx.compose.runtime.p0, Unit> {
        c() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, androidx.compose.runtime.p0 p0Var) {
            a3.this.i().V(p0Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, androidx.compose.runtime.p0 p0Var) {
            c(l0Var, p0Var);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.node.l0, Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1>, Unit> {
        d() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2) {
            l0Var.i(a3.this.i().x(function2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2) {
            c(l0Var, function2);
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.node.l0, a3, Unit> {
        e() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, a3 a3Var) {
            a3 a3Var2 = a3.this;
            s0 s0VarL0 = l0Var.L0();
            if (s0VarL0 == null) {
                s0VarL0 = new s0(l0Var, a3.this.f39245a);
                l0Var.p2(s0VarL0);
            }
            a3Var2.f39246b = s0VarL0;
            a3.this.i().M();
            a3.this.i().W(a3.this.f39245a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, a3 a3Var) {
            c(l0Var, a3Var);
            return Unit.f312394a;
        }
    }

    public a3(@NotNull c3 c3Var) {
        this.f39245a = c3Var;
        this.f39247c = new e();
        this.f39248d = new c();
        this.f39249e = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s0 i() {
        s0 s0Var = this.f39246b;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    @NotNull
    public final a d(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        return i().S(obj, function2);
    }

    public final void e() {
        i().G();
    }

    @NotNull
    public final Function2<androidx.compose.ui.node.l0, androidx.compose.runtime.p0, Unit> f() {
        return this.f39248d;
    }

    @NotNull
    public final Function2<androidx.compose.ui.node.l0, Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1>, Unit> g() {
        return this.f39249e;
    }

    @NotNull
    public final Function2<androidx.compose.ui.node.l0, a3, Unit> h() {
        return this.f39247c;
    }

    @NotNull
    public final b j(@Nullable Object obj, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        return i().Q(obj, function2);
    }

    public a3() {
        this(k1.f39389a);
    }

    @kotlin.l(message = "This constructor is deprecated", replaceWith = @kotlin.b1(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public a3(int i10) {
        this(z2.c(i10));
    }
}
