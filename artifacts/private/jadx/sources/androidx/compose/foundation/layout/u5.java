package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,405:1\n80#2,6:406\n87#2,3:421\n90#2,2:430\n94#2:435\n391#3,9:412\n400#3,3:432\n4360#4,6:424\n1282#5,6:436\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n101#1:406,6\n101#1:421,3\n101#1:430,2\n101#1:435\n101#1:412,9\n101#1:432,3\n101#1:424,6\n122#1:436,6\n*E\n"})
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.a1 f16476a = new w5(q.f16330a.w(), androidx.compose.ui.e.f37317a.w());

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@Nullable androidx.compose.ui.a0 a0Var, @Nullable q.e eVar, @Nullable androidx.compose.ui.e.c cVar, @NotNull pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        if ((i11 & 2) != 0) {
            eVar = q.f16330a.w();
        }
        if ((i11 & 4) != 0) {
            cVar = androidx.compose.ui.e.f37317a.w();
        }
        androidx.compose.ui.layout.a1 a1VarE = e(eVar, cVar, c0Var, (i10 >> 3) & okhttp3.internal.ws.g.f334652s);
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
        androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar.e());
        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
        nVar.invoke(y5.f16577a, c0Var, Integer.valueOf(((i10 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
        c0Var.o();
    }

    public static final long b(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? androidx.compose.ui.unit.c.a(i10, i12, i11, i13) : androidx.compose.ui.unit.b.f42658b.b(i10, i12, i11, i13);
    }

    @NotNull
    public static final androidx.compose.ui.layout.a1 c() {
        return f16476a;
    }

    @kotlin.a1
    public static /* synthetic */ void d() {
    }

    @androidx.compose.runtime.o
    @kotlin.a1
    @NotNull
    public static final androidx.compose.ui.layout.a1 e(@NotNull q.e eVar, @NotNull androidx.compose.ui.e.c cVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.ui.layout.a1 a1Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:118)");
        }
        if (Intrinsics.areEqual(eVar, q.f16330a.w()) && Intrinsics.areEqual(cVar, androidx.compose.ui.e.f37317a.w())) {
            c0Var.E(-1073795767);
            c0Var.A();
            a1Var = f16476a;
        } else {
            c0Var.E(-1073744896);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(eVar)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(cVar)) || (i10 & 48) == 32);
            Object objI0 = c0Var.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new w5(eVar, cVar);
                c0Var.Y(objI0);
            }
            a1Var = (w5) objI0;
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }
}
