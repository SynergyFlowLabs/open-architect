package androidx.compose.ui.layout;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1351:1\n1282#2,6:1352\n1282#2,6:1375\n316#3,9:1358\n325#3,2:1373\n4360#4,6:1367\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/SubcomposeLayoutKt\n*L\n95#1:1352,6\n143#1:1375,6\n131#1:1358,9\n131#1:1373,2\n139#1:1367,6\n*E\n"})
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f39601a = new a();

    public static final class a {
        a() {
        }

        public String toString() {
            return "ReusedSlotId";
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f39602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<b3, androidx.compose.ui.unit.b, b1> f39603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39605d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.a0 a0Var, Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2, int i10, int i11) {
            super(2);
            this.f39602a = a0Var;
            this.f39603b = function2;
            this.f39604c = i10;
            this.f39605d = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            z2.a(this.f39602a, this.f39603b, c0Var, t4.a(this.f39604c | 1), this.f39605d);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f39606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a3 a3Var) {
            super(0);
            this.f39606a = a3Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f39606a.e();
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3 f39607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f39608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<b3, androidx.compose.ui.unit.b, b1> f39609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f39610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39611e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(a3 a3Var, androidx.compose.ui.a0 a0Var, Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2, int i10, int i11) {
            super(2);
            this.f39607a = a3Var;
            this.f39608b = a0Var;
            this.f39609c = function2;
            this.f39610d = i10;
            this.f39611e = i11;
        }

        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            z2.b(this.f39607a, this.f39608b, this.f39609c, c0Var, t4.a(this.f39610d | 1), this.f39611e);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@Nullable androidx.compose.ui.a0 a0Var, @NotNull Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var2 = a0Var;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:92)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new a3();
                c0VarR.Y(objI0);
            }
            function3 = function2;
            b((a3) objI0, a0Var2, function3, c0VarR, (i12 << 3) & 1008, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var = a0Var2;
        } else {
            function3 = function2;
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new b(a0Var, function3, i10, i11));
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void b(@NotNull a3 a3Var, @Nullable androidx.compose.ui.a0 a0Var, @NotNull Function2<? super b3, ? super androidx.compose.ui.unit.b, ? extends b1> function2, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        int i12;
        boolean z10;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(a3Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function2) ? 256 : 128;
        }
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
            int i14 = 6 ^ 1;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-511989831, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:125)");
            }
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.p0 p0VarY = androidx.compose.runtime.v.y(c0VarR, 0);
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            Function0<androidx.compose.ui.node.l0> function0A = androidx.compose.ui.node.l0.f39845y3.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a3Var, a3Var.h());
            y7.n(c0VarD, p0VarY, a3Var.f());
            y7.n(c0VarD, function2, a3Var.g());
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            y7.n(c0VarD, b1VarK, aVar.g());
            y7.n(c0VarD, a0VarN, aVar.f());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            c0VarR.o();
            if (c0VarR.d()) {
                c0VarR.E(-1259216055);
                c0VarR.A();
            } else {
                c0VarR.E(-1259274676);
                boolean zK0 = c0VarR.k0(a3Var);
                Object objI0 = c0VarR.i0();
                if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new c(a3Var);
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.ui.a0 a0Var2 = a0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new d(a3Var, a0Var2, function2, i10, i11));
        }
    }

    @NotNull
    public static final c3 c(int i10) {
        return new o(i10);
    }
}
