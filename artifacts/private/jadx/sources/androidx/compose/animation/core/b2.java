package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nPathEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,116:1\n64#2,4:117\n53#2,4:121\n34#2,4:125\n34#2,4:132\n51#3:129\n55#3:131\n22#4:130\n*S KotlinDebug\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n*L\n69#1:117,4\n74#1:121,4\n96#1:125,4\n109#1:132,4\n104#1:129\n104#1:131\n104#1:130\n*E\n"})
public final class b2 implements l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f12801c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.k2 f12802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.compose.ui.graphics.y1<androidx.compose.ui.graphics.v2> f12803b;

    public b2(@NotNull androidx.compose.ui.graphics.k2 k2Var) {
        this.f12802a = k2Var;
    }

    private final void b() {
        float[] fArr = new float[5];
        androidx.compose.ui.graphics.y1<androidx.compose.ui.graphics.v2> y1Var = new androidx.compose.ui.graphics.y1<>();
        androidx.compose.ui.graphics.q2 q2VarK = this.f12802a.K(androidx.compose.ui.graphics.q2.a.AsQuadratics, 2.0E-4f);
        while (true) {
            boolean z10 = true;
            if (!q2VarK.hasNext()) {
                break;
            }
            androidx.compose.ui.graphics.v2 next = q2VarK.next();
            if (next.b() == androidx.compose.ui.graphics.v2.a.Close) {
                z10 = false;
            }
            if (!z10) {
                c2.d("The path cannot contain a close() command.");
            }
            if (next.b() != androidx.compose.ui.graphics.v2.a.Move && next.b() != androidx.compose.ui.graphics.v2.a.Done) {
                long jH = androidx.compose.ui.graphics.c0.h(next, fArr, 0, 4, null);
                y1Var.a(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH & com.rabbitmq.client.k0.f265952a)), next);
            }
        }
        if (!(y1Var.c(0.0f) && y1Var.c(1.0f))) {
            c2.d("The easing path must start at 0.0f and end at 1.0f.");
        }
        this.f12803b = y1Var;
    }

    @Override // androidx.compose.animation.core.l0
    public float a(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (this.f12803b == null) {
            b();
        }
        androidx.compose.ui.graphics.y1<androidx.compose.ui.graphics.v2> y1Var = this.f12803b;
        if (y1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intervals");
            y1Var = null;
        }
        Object objB = androidx.compose.ui.graphics.y1.g(y1Var, f10, 0.0f, 2, null).b();
        if (objB == null) {
            c2.f("The easing path is invalid. Make sure it is continuous on the x axis.");
            throw new kotlin.a0();
        }
        androidx.compose.ui.graphics.v2 v2Var = (androidx.compose.ui.graphics.v2) objB;
        float fY = androidx.compose.ui.graphics.c0.y(v2Var, f10);
        if (Float.isNaN(fY)) {
            c2.e("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
        }
        return androidx.compose.ui.graphics.c0.s(v2Var, fY);
    }
}
