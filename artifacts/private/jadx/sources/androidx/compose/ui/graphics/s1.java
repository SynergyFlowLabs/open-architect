package androidx.compose.ui.graphics;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nGraphicsLayerScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,492:1\n75#2:493\n1282#3,6:494\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerScope.kt\nandroidx/compose/ui/graphics/GraphicsLayerScopeKt\n*L\n251#1:493\n252#1:494,6\n*E\n"})
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f38177a = 8.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f38178b = q0.f38131b.a();

    @NotNull
    public static final r1 a() {
        return new l3();
    }

    public static final long b() {
        return f38178b;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.q(index = -1)
    @NotNull
    public static final androidx.compose.ui.graphics.layer.c c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(158092365, i10, -1, "androidx.compose.ui.graphics.rememberGraphicsLayer (GraphicsLayerScope.kt:249)");
        }
        o1 o1Var = (o1) c0Var.W(androidx.compose.ui.platform.q1.r());
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new p1(o1Var);
            c0Var.Y(objI0);
        }
        androidx.compose.ui.graphics.layer.c cVarA = ((p1) objI0).a();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return cVarA;
    }
}
