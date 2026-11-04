package androidx.compose.ui.layout;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLookaheadScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,289:1\n1282#2,6:290\n1282#2,6:296\n391#3,12:302\n150#4:314\n*S KotlinDebug\n*F\n+ 1 LookaheadScope.kt\nandroidx/compose/ui/layout/LookaheadScopeKt\n*L\n50#1:290,6\n52#1:296,6\n51#1:302,12\n261#1:314\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function2<i2.a, g0, Boolean> f39586a = e.f39593a;

    static final class a extends kotlin.jvm.internal.l0 implements Function0<androidx.compose.ui.node.l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39587a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.node.l0 invoke() {
            return new androidx.compose.ui.node.l0(true, 0, 2, null);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.node.l0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f39588a = new b();

        b() {
            super(1);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var) {
            l0Var.q2(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var) {
            c(l0Var);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.ui.node.l0, x0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f39589a = new c();

        static final class a extends kotlin.jvm.internal.l0 implements Function0<g0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.node.l0 f39590a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.node.l0 l0Var) {
                super(0);
                this.f39590a = l0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final g0 invoke() {
                androidx.compose.ui.node.l0 l0VarJ0 = this.f39590a.J0();
                Intrinsics.checkNotNull(l0VarJ0);
                return l0VarJ0.e0().n();
            }
        }

        c() {
            super(2);
        }

        public final void c(androidx.compose.ui.node.l0 l0Var, x0 x0Var) {
            x0Var.b(new a(l0Var));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.node.l0 l0Var, x0 x0Var) {
            c(l0Var, x0Var);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<w0, androidx.compose.runtime.c0, Integer, Unit> f39591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f39592b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(pj.n<? super w0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, int i10) {
            super(2);
            this.f39591a = nVar;
            this.f39592b = i10;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            y0.a(this.f39591a, c0Var, t4.a(this.f39592b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function2<i2.a, g0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f39593a = new e();

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i2.a aVar, g0 g0Var) {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void a(@NotNull pj.n<? super w0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(441837433);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(nVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = 1;
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(441837433, i11, -1, "androidx.compose.ui.layout.LookaheadScope (LookaheadScope.kt:48)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new x0(null, i12, 0 == true ? 1 : 0);
                c0VarR.Y(objI0);
            }
            x0 x0Var = (x0) objI0;
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = a.f39587a;
                c0VarR.Y(objI1);
            }
            Function0 function0 = (Function0) objI1;
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.i(c0VarD, b.f39588a);
            y7.n(c0VarD, x0Var, c.f39589a);
            nVar.invoke(x0Var, c0VarR, Integer.valueOf((i11 << 3) & com.planner5d.library.engine.input.f.b.B));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new d(nVar, i10));
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.unit.u, Boolean> function1, @NotNull Function2<? super i2.a, ? super g0, Boolean> function2, @NotNull pj.n<? super g, ? super z0, ? super androidx.compose.ui.unit.b, ? extends b1> nVar) {
        return a0Var.B2(new ApproachLayoutElement(nVar, function1, function2));
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, Function1 function1, Function2 function2, pj.n nVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = f39586a;
        }
        return c(a0Var, function1, function2, nVar);
    }

    public static final long e(@NotNull w0 w0Var, @NotNull g0 g0Var, @NotNull g0 g0Var2, long j10, boolean z10) {
        g0 g0VarK = w0Var.K(g0Var);
        g0 g0VarK2 = w0Var.K(g0Var2);
        if (g0VarK instanceof u0) {
            return ((u0) g0VarK).V(g0VarK2, j10, z10);
        }
        return g0VarK2 instanceof u0 ? n0.g.g(((u0) g0VarK2).V(g0VarK, j10, z10) ^ (-9223372034707292160L)) : g0VarK.V(g0VarK, j10, z10);
    }
}
