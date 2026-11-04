package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,382:1\n80#2,6:383\n87#2,3:398\n90#2,2:407\n94#2:412\n391#3,9:389\n400#3,3:409\n4360#4,6:401\n1282#5,6:413\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n89#1:383,6\n89#1:398,3\n89#1:407,2\n89#1:412\n89#1:389,9\n89#1:409,3\n89#1:401,6\n112#1:413,6\n*E\n"})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.layout.a1 f16134a = new l0(q.f16330a.y(), androidx.compose.ui.e.f37317a.u());

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@Nullable androidx.compose.ui.a0 a0Var, @Nullable q.m mVar, @Nullable androidx.compose.ui.e.b bVar, @NotNull pj.n<? super m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        if ((i11 & 2) != 0) {
            mVar = q.f16330a.y();
        }
        if ((i11 & 4) != 0) {
            bVar = androidx.compose.ui.e.f37317a.u();
        }
        androidx.compose.ui.layout.a1 a1VarB = b(mVar, bVar, c0Var, (i10 >> 3) & okhttp3.internal.ws.g.f334652s);
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
        androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
            c0VarD.Y(Integer.valueOf(iHashCode));
            c0VarD.f(Integer.valueOf(iHashCode), function2B);
        }
        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
        nVar.invoke(n0.f16227a, c0Var, Integer.valueOf(((i10 >> 6) & com.planner5d.library.engine.input.f.b.B) | 6));
        c0Var.o();
    }

    @androidx.compose.runtime.o
    @kotlin.a1
    @NotNull
    public static final androidx.compose.ui.layout.a1 b(@NotNull q.m mVar, @NotNull androidx.compose.ui.e.b bVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        androidx.compose.ui.layout.a1 a1Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:108)");
        }
        if (Intrinsics.areEqual(mVar, q.f16330a.y()) && Intrinsics.areEqual(bVar, androidx.compose.ui.e.f37317a.u())) {
            c0Var.E(-1446569784);
            c0Var.A();
            a1Var = f16134a;
        } else {
            c0Var.E(-1446515937);
            int i11 = 1 >> 4;
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && c0Var.D(mVar)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(bVar)) || (i10 & 48) == 32);
            Object objI0 = c0Var.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new l0(mVar, bVar);
                c0Var.Y(objI0);
            }
            a1Var = (l0) objI0;
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }

    public static final long c(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? androidx.compose.ui.unit.c.a(i11, i13, i10, i12) : androidx.compose.ui.unit.b.f42658b.a(i11, i13, i10, i12);
    }

    @NotNull
    public static final androidx.compose.ui.layout.a1 d() {
        return f16134a;
    }

    @kotlin.a1
    public static /* synthetic */ void e() {
    }
}
