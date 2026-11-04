package androidx.compose.ui.draw;

import androidx.compose.runtime.k7;
import androidx.compose.ui.graphics.d3;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.s1;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,865:1\n113#2:866\n113#2:867\n113#2:868\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n82#1:866\n118#1:867\n114#1:868\n*E\n"})
public final class x {
    @k7
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        return a0Var.B2(new SimpleDropShadowElement(q3Var, jVar));
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull q3 q3Var, @NotNull Function1<? super q, Unit> function1) {
        return a0Var.B2(new BlockDropShadowElement(q3Var, function1));
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull q3 q3Var, @NotNull androidx.compose.ui.graphics.shadow.j jVar) {
        return a0Var.B2(new SimpleInnerShadowElement(q3Var, jVar));
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 d(@NotNull androidx.compose.ui.a0 a0Var, @NotNull q3 q3Var, @NotNull Function1<? super s, Unit> function1) {
        return a0Var.B2(new BlockInnerShadowElement(q3Var, function1));
    }

    @k7
    @NotNull
    public static final androidx.compose.ui.a0 e(@NotNull androidx.compose.ui.a0 a0Var, float f10, @NotNull q3 q3Var, boolean z10, long j10, long j11) {
        return (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r((float) 0)) > 0 || z10) ? a0Var.B2(new ShadowGraphicsLayerElement(f10, q3Var, z10, j10, j11, null)) : a0Var;
    }

    public static /* synthetic */ androidx.compose.ui.a0 f(androidx.compose.ui.a0 a0Var, float f10, q3 q3Var, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        q3 q3VarA = (i10 & 2) != 0 ? d3.a() : q3Var;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return e(a0Var, f10, q3VarA, z11, (i10 & 8) != 0 ? s1.b() : j10, (i10 & 16) != 0 ? s1.b() : j11);
    }

    @k7
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @b1(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    public static final /* synthetic */ androidx.compose.ui.a0 g(androidx.compose.ui.a0 a0Var, float f10, q3 q3Var, boolean z10) {
        return e(a0Var, f10, q3Var, z10, s1.b(), s1.b());
    }

    public static /* synthetic */ androidx.compose.ui.a0 h(androidx.compose.ui.a0 a0Var, float f10, q3 q3Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q3Var = d3.a();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
            if (androidx.compose.ui.unit.h.q(f10, androidx.compose.ui.unit.h.r(0)) > 0) {
                z10 = true;
            }
        }
        return g(a0Var, f10, q3Var, z10);
    }
}
