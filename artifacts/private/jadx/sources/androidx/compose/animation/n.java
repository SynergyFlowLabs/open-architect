package androidx.compose.animation;

import androidx.compose.animation.core.j5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,269:1\n30#2:270\n80#3:271\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n137#1:270\n137#1:271\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f13675a;

    static {
        long j10 = Integer.MIN_VALUE;
        f13675a = androidx.compose.ui.unit.u.e((j10 & com.rabbitmq.client.k0.f265952a) | (j10 << 32));
    }

    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e eVar, @Nullable Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, Unit> function2) {
        return androidx.compose.ui.draw.j.b(a0Var).B2(new SizeAnimationModifierElement(y0Var, eVar, function2));
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @Nullable Function2<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, Unit> function2) {
        return androidx.compose.ui.draw.j.b(a0Var).B2(new SizeAnimationModifierElement(y0Var, androidx.compose.ui.e.f37317a.C(), function2));
    }

    public static /* synthetic */ androidx.compose.ui.a0 c(androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e eVar, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            eVar = androidx.compose.ui.e.f37317a.C();
        }
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        return a(a0Var, y0Var, eVar, function2);
    }

    public static /* synthetic */ androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.animation.core.y0 y0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        return b(a0Var, y0Var, function2);
    }

    public static final long e() {
        return f13675a;
    }

    public static final boolean f(long j10) {
        return !androidx.compose.ui.unit.u.h(j10, f13675a);
    }
}
