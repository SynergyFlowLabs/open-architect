package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.i1;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1008:1\n68#1,7:1009\n249#1,14:1016\n249#1,14:1030\n249#1,14:1044\n249#1,14:1058\n249#1,14:1072\n249#1,14:1092\n305#1,26:1106\n57#2:1086\n61#2:1089\n60#3:1087\n70#3:1090\n22#4:1088\n22#4:1091\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n108#1:1009,7\n138#1:1016,14\n153#1:1030,14\n172#1:1044,14\n185#1:1058,14\n209#1:1072,14\n225#1:1092,14\n275#1:1106,26\n205#1:1086\n206#1:1089\n205#1:1087\n206#1:1090\n205#1:1088\n206#1:1091\n*E\n"})
public final class g {
    public static final void a(@NotNull f fVar, @NotNull k2 k2Var, int i10, @NotNull Function1<? super f, Unit> function1) {
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().e(k2Var, i10);
            function1.invoke(fVar);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    public static /* synthetic */ void b(f fVar, k2 k2Var, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = p0.f38096b.b();
        }
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().e(k2Var, i10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
            throw th2;
        }
    }

    public static final void c(@NotNull f fVar, float f10, float f11, float f12, float f13, int i10, @NotNull Function1<? super f, Unit> function1) {
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().b(f10, f11, f12, f13, i10);
            function1.invoke(fVar);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    public static /* synthetic */ void d(f fVar, float f10, float f11, float f12, float f13, int i10, Function1 function1, int i11, Object obj) {
        float f14 = (i11 & 1) != 0 ? 0.0f : f10;
        float f15 = (i11 & 2) != 0 ? 0.0f : f11;
        if ((i11 & 4) != 0) {
            f12 = Float.intBitsToFloat((int) (fVar.d() >> 32));
        }
        float f16 = f12;
        if ((i11 & 8) != 0) {
            f13 = Float.intBitsToFloat((int) (fVar.d() & k0.f265952a));
        }
        float f17 = f13;
        if ((i11 & 16) != 0) {
            i10 = p0.f38096b.b();
        }
        int i12 = i10;
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().b(f14, f15, f16, f17, i12);
            function1.invoke(fVar);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Please use a new overload accepting nullable GraphicsLayer")
    public static final /* synthetic */ void e(f fVar, androidx.compose.ui.unit.d dVar, w wVar, androidx.compose.ui.graphics.k0 k0Var, long j10, Function1<? super f, Unit> function1) {
        androidx.compose.ui.unit.d density = fVar.Z3().getDensity();
        w layoutDirection = fVar.Z3().getLayoutDirection();
        androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
        long jD = fVar.Z3().d();
        androidx.compose.ui.graphics.layer.c cVarH = fVar.Z3().h();
        d dVarZ3 = fVar.Z3();
        dVarZ3.e(dVar);
        dVarZ3.b(wVar);
        dVarZ3.k(k0Var);
        dVarZ3.g(j10);
        dVarZ3.j(null);
        k0Var.save();
        try {
            function1.invoke(fVar);
            h0.d(1);
            k0Var.B();
            d dVarZ4 = fVar.Z3();
            dVarZ4.e(density);
            dVarZ4.b(layoutDirection);
            dVarZ4.k(k0VarF);
            dVarZ4.g(jD);
            dVarZ4.j(cVarH);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            k0Var.B();
            d dVarZ5 = fVar.Z3();
            dVarZ5.e(density);
            dVarZ5.b(layoutDirection);
            dVarZ5.k(k0VarF);
            dVarZ5.g(jD);
            dVarZ5.j(cVarH);
            h0.c(1);
            throw th2;
        }
    }

    public static final void f(@NotNull f fVar, @NotNull androidx.compose.ui.unit.d dVar, @NotNull w wVar, @NotNull androidx.compose.ui.graphics.k0 k0Var, long j10, @Nullable androidx.compose.ui.graphics.layer.c cVar, @NotNull Function1<? super f, Unit> function1) {
        androidx.compose.ui.unit.d density = fVar.Z3().getDensity();
        w layoutDirection = fVar.Z3().getLayoutDirection();
        androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
        long jD = fVar.Z3().d();
        androidx.compose.ui.graphics.layer.c cVarH = fVar.Z3().h();
        d dVarZ3 = fVar.Z3();
        dVarZ3.e(dVar);
        dVarZ3.b(wVar);
        dVarZ3.k(k0Var);
        dVarZ3.g(j10);
        dVarZ3.j(cVar);
        k0Var.save();
        try {
            function1.invoke(fVar);
        } finally {
            h0.d(1);
            k0Var.B();
            d dVarZ4 = fVar.Z3();
            dVarZ4.e(density);
            dVarZ4.b(layoutDirection);
            dVarZ4.k(k0VarF);
            dVarZ4.g(jD);
            dVarZ4.j(cVarH);
            h0.c(1);
        }
    }

    public static /* synthetic */ void g(f fVar, androidx.compose.ui.unit.d dVar, w wVar, androidx.compose.ui.graphics.k0 k0Var, long j10, androidx.compose.ui.graphics.layer.c cVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            cVar = null;
        }
        androidx.compose.ui.unit.d density = fVar.Z3().getDensity();
        w layoutDirection = fVar.Z3().getLayoutDirection();
        androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
        long jD = fVar.Z3().d();
        androidx.compose.ui.graphics.layer.c cVarH = fVar.Z3().h();
        d dVarZ3 = fVar.Z3();
        dVarZ3.e(dVar);
        dVarZ3.b(wVar);
        dVarZ3.k(k0Var);
        dVarZ3.g(j10);
        dVarZ3.j(cVar);
        k0Var.save();
        try {
            function1.invoke(fVar);
        } finally {
            h0.d(1);
            k0Var.B();
            d dVarZ4 = fVar.Z3();
            dVarZ4.e(density);
            dVarZ4.b(layoutDirection);
            dVarZ4.k(k0VarF);
            dVarZ4.g(jD);
            dVarZ4.j(cVarH);
            h0.c(1);
        }
    }

    public static final void h(@NotNull f fVar, @NotNull Function1<? super androidx.compose.ui.graphics.k0, Unit> function1) {
        function1.invoke(fVar.Z3().f());
    }

    public static final void i(@NotNull f fVar, float f10, float f11, float f12, float f13, @NotNull Function1<? super f, Unit> function1) {
        fVar.Z3().i().i(f10, f11, f12, f13);
        try {
            function1.invoke(fVar);
            h0.d(1);
            fVar.Z3().i().i(-f10, -f11, -f12, -f13);
        } finally {
            h0.d(1);
            fVar.Z3().i().i(-f10, -f11, -f12, -f13);
            h0.c(1);
        }
    }

    public static final void j(@NotNull f fVar, float f10, float f11, @NotNull Function1<? super f, Unit> function1) {
        fVar.Z3().i().i(f10, f11, f10, f11);
        try {
            function1.invoke(fVar);
            h0.d(1);
            float f12 = -f10;
            float f13 = -f11;
            fVar.Z3().i().i(f12, f13, f12, f13);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            float f14 = -f10;
            float f15 = -f11;
            fVar.Z3().i().i(f14, f15, f14, f15);
            h0.c(1);
            throw th2;
        }
    }

    public static final void k(@NotNull f fVar, float f10, @NotNull Function1<? super f, Unit> function1) {
        fVar.Z3().i().i(f10, f10, f10, f10);
        try {
            function1.invoke(fVar);
            h0.d(1);
            float f11 = -f10;
            fVar.Z3().i().i(f11, f11, f11, f11);
        } finally {
            h0.d(1);
            float f12 = -f10;
            fVar.Z3().i().i(f12, f12, f12, f12);
            h0.c(1);
        }
    }

    public static /* synthetic */ void l(f fVar, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        fVar.Z3().i().i(f10, f11, f10, f11);
        try {
            function1.invoke(fVar);
            h0.d(1);
            float f12 = -f10;
            float f13 = -f11;
            fVar.Z3().i().i(f12, f13, f12, f13);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            float f14 = -f10;
            float f15 = -f11;
            fVar.Z3().i().i(f14, f15, f14, f15);
            h0.c(1);
            throw th2;
        }
    }

    public static final void m(@NotNull f fVar, float f10, long j10, @NotNull Function1<? super f, Unit> function1) {
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(f10, j10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    public static /* synthetic */ void n(f fVar, float f10, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = fVar.Y();
        }
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(f10, j10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
            throw th2;
        }
    }

    public static final void o(@NotNull f fVar, float f10, long j10, @NotNull Function1<? super f, Unit> function1) {
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(i1.a(f10), j10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    public static /* synthetic */ void p(f fVar, float f10, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = fVar.Y();
        }
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(i1.a(f10), j10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
            throw th2;
        }
    }

    public static final void q(@NotNull f fVar, float f10, float f11, long j10, @NotNull Function1<? super f, Unit> function1) {
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().g(f10, f11, j10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
            throw th2;
        }
    }

    public static /* synthetic */ void r(f fVar, float f10, float f11, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = fVar.Y();
        }
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().g(f10, f11, j10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    public static final void s(@NotNull f fVar, float f10, long j10, @NotNull Function1<? super f, Unit> function1) {
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().g(f10, f10, j10);
            function1.invoke(fVar);
            h0.d(1);
            androidx.compose.ui.graphics.k0 k0VarF = dVarZ3.f();
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    public static /* synthetic */ void t(f fVar, float f10, long j10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = fVar.Y();
        }
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().g(f10, f10, j10);
            function1.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }

    public static final void u(@NotNull f fVar, float f10, float f11, @NotNull Function1<? super f, Unit> function1) {
        fVar.Z3().i().c(f10, f11);
        try {
            function1.invoke(fVar);
            h0.d(1);
            fVar.Z3().i().c(-f10, -f11);
        } finally {
            h0.d(1);
            fVar.Z3().i().c(-f10, -f11);
            h0.c(1);
        }
    }

    public static /* synthetic */ void v(f fVar, float f10, float f11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        fVar.Z3().i().c(f10, f11);
        try {
            function1.invoke(fVar);
            h0.d(1);
            fVar.Z3().i().c(-f10, -f11);
            h0.c(1);
        } catch (Throwable th2) {
            h0.d(1);
            fVar.Z3().i().c(-f10, -f11);
            h0.c(1);
            throw th2;
        }
    }

    public static final void w(@NotNull f fVar, @NotNull Function1<? super j, Unit> function1, @NotNull Function1<? super f, Unit> function2) {
        d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            function1.invoke(dVarZ3.i());
            function2.invoke(fVar);
            h0.d(1);
            dVarZ3.f().B();
        } finally {
            h0.d(1);
            dVarZ3.f().B();
            dVarZ3.g(jD);
            h0.c(1);
        }
    }
}
