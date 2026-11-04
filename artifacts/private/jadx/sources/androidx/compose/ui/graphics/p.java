package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,65:1\n36#2,5:66\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n51#1:66,5\n*E\n"})
public final class p {
    @NotNull
    public static final l2 a(@NotNull l2 l2Var, @NotNull l2 l2Var2) {
        Intrinsics.checkNotNull(l2Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        PathEffect pathEffectA = ((o) l2Var).a();
        Intrinsics.checkNotNull(l2Var2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new o(new ComposePathEffect(pathEffectA, ((o) l2Var2).a()));
    }

    @NotNull
    public static final l2 b(float f10) {
        return new o(new CornerPathEffect(f10));
    }

    @NotNull
    public static final l2 c(@NotNull float[] fArr, float f10) {
        return new o(new DashPathEffect(fArr, f10));
    }

    @NotNull
    public static final l2 d(@NotNull k2 k2Var, float f10, float f11, int i10) {
        if (k2Var instanceof n) {
            return new o(new PathDashPathEffect(((n) k2Var).Z(), f10, f11, f(i10)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @NotNull
    public static final PathEffect e(@NotNull l2 l2Var) {
        Intrinsics.checkNotNull(l2Var, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((o) l2Var).a();
    }

    @NotNull
    public static final PathDashPathEffect.Style f(int i10) {
        t3.a aVar = t3.f38242b;
        if (t3.g(i10, aVar.a())) {
            return PathDashPathEffect.Style.MORPH;
        }
        if (t3.g(i10, aVar.b())) {
            return PathDashPathEffect.Style.ROTATE;
        }
        return t3.g(i10, aVar.c()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    @NotNull
    public static final l2 g(@NotNull PathEffect pathEffect) {
        return new o(pathEffect);
    }
}
