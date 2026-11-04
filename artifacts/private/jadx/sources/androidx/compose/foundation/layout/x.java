package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,332:1\n80#2,6:333\n87#2,3:348\n90#2,2:357\n94#2:362\n122#2,6:373\n129#2,4:388\n133#2:398\n135#2:401\n391#3,9:339\n400#3,3:359\n316#3,9:379\n325#3,2:399\n4360#4,6:351\n4360#4,6:392\n1282#5,6:363\n30#6:369\n30#6:371\n80#7:370\n80#7:372\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n72#1:333,6\n72#1:348,3\n72#1:357,2\n72#1:362\n234#1:373,6\n234#1:388,4\n234#1:398\n234#1:401\n72#1:339,9\n72#1:359,3\n234#1:379,9\n234#1:399,2\n72#1:351,6\n234#1:392,6\n113#1:363,6\n216#1:369\n217#1:371\n216#1:370\n217#1:372\n*E\n"})
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.k2<androidx.compose.ui.e, androidx.compose.ui.layout.a1> f16524a = g(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final androidx.collection.k2<androidx.compose.ui.e, androidx.compose.ui.layout.a1> f16525b = g(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.a1 f16526c = new b0(androidx.compose.ui.e.f37317a.C(), false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.a1 f16527d = a.f16528a;

    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16528a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2.a aVar) {
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), null, new Function1() { // from class: androidx.compose.foundation.layout.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x.a.g((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@NotNull final androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            androidx.compose.ui.layout.a1 a1Var = f16527d;
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x.d(a0Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.e eVar, boolean z10, @NotNull pj.n<? super c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        if ((i11 & 2) != 0) {
            eVar = androidx.compose.ui.e.f37317a.C();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        androidx.compose.ui.layout.a1 a1VarK = k(eVar, z10);
        int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
        androidx.compose.runtime.b1 b1VarK = c0Var.k();
        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0Var);
        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
        Function0<androidx.compose.ui.node.g> function0A = aVar.a();
        if (c0Var.S() == null) {
            androidx.compose.runtime.v.r();
        }
        c0Var.q();
        if (c0Var.P()) {
            c0Var.q0(function0A);
        } else {
            c0Var.l();
        }
        androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
        androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
        nVar.invoke(d0.f15956a, c0Var, Integer.valueOf(((i10 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
        c0Var.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(androidx.compose.ui.a0 a0Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        b(a0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final androidx.collection.k2<androidx.compose.ui.e, androidx.compose.ui.layout.a1> g(boolean z10) {
        androidx.collection.k2<androidx.compose.ui.e, androidx.compose.ui.layout.a1> k2Var = new androidx.collection.k2<>(9);
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        k2Var.q0(aVar.C(), new b0(aVar.C(), z10));
        k2Var.q0(aVar.y(), new b0(aVar.y(), z10));
        k2Var.q0(aVar.A(), new b0(aVar.A(), z10));
        k2Var.q0(aVar.o(), new b0(aVar.o(), z10));
        k2Var.q0(aVar.i(), new b0(aVar.i(), z10));
        k2Var.q0(aVar.k(), new b0(aVar.k(), z10));
        k2Var.q0(aVar.g(), new b0(aVar.g(), z10));
        k2Var.q0(aVar.c(), new b0(aVar.c(), z10));
        k2Var.q0(aVar.e(), new b0(aVar.e(), z10));
        return k2Var;
    }

    private static final u h(androidx.compose.ui.layout.z0 z0Var) {
        Object objC = z0Var.c();
        if (objC instanceof u) {
            return (u) objC;
        }
        return null;
    }

    @NotNull
    public static final androidx.compose.ui.layout.a1 i() {
        return f16527d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(androidx.compose.ui.layout.z0 z0Var) {
        u uVarH = h(z0Var);
        if (uVarH != null) {
            return uVarH.w9();
        }
        return false;
    }

    @kotlin.a1
    @NotNull
    public static final androidx.compose.ui.layout.a1 k(@NotNull androidx.compose.ui.e eVar, boolean z10) {
        androidx.compose.ui.layout.a1 a1VarP = (z10 ? f16524a : f16525b).p(eVar);
        if (a1VarP == null) {
            a1VarP = new b0(eVar, z10);
        }
        return a1VarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(androidx.compose.ui.layout.i2.a aVar, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.w wVar, int i10, int i11, androidx.compose.ui.e eVar) {
        androidx.compose.ui.e eVarV9;
        u uVarH = h(z0Var);
        int i12 = 6 | 0;
        androidx.compose.ui.layout.i2.a.V(aVar, i2Var, ((uVarH == null || (eVarV9 = uVarH.v9()) == null) ? eVar : eVarV9).a(androidx.compose.ui.unit.u.e((((long) i2Var.h1()) << 32) | (((long) i2Var.c1()) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.unit.u.e((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32)), wVar), 0.0f, 2, null);
    }

    @androidx.compose.runtime.o
    @kotlin.a1
    @NotNull
    public static final androidx.compose.ui.layout.a1 m(@NotNull androidx.compose.ui.e eVar, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.ui.layout.a1 a1Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (!Intrinsics.areEqual(eVar, androidx.compose.ui.e.f37317a.C()) || z10) {
            c0Var.E(244414741);
            boolean z11 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(eVar)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z10)) || (i10 & 48) == 32);
            Object objI0 = c0Var.i0();
            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new b0(eVar, z10);
                c0Var.Y(objI0);
            }
            a1Var = (b0) objI0;
            c0Var.A();
        } else {
            c0Var.E(244367063);
            c0Var.A();
            a1Var = f16526c;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }
}
