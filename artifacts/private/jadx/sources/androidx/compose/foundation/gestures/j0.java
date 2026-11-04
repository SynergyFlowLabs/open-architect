package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransformableState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/AnimationDataConverter\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,456:1\n65#2:457\n69#2:460\n60#3:458\n70#3:461\n53#3,3:463\n22#4:459\n30#5:462\n*S KotlinDebug\n*F\n+ 1 TransformableState.kt\nandroidx/compose/foundation/gestures/AnimationDataConverter\n*L\n377#1:457\n377#1:460\n377#1:458\n377#1:461\n380#1:463,3\n377#1:459\n380#1:462\n*E\n"})
final class j0 implements androidx.compose.animation.core.z3<g0, androidx.compose.animation.core.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j0 f14622a = new j0();

    private j0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 e(androidx.compose.animation.core.v vVar) {
        float f10 = vVar.f();
        float fG = vVar.g();
        return new g0(f10, n0.g.g((((long) Float.floatToRawIntBits(vVar.h())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG) << 32)), vVar.i(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.core.v f(g0 g0Var) {
        return new androidx.compose.animation.core.v(g0Var.h(), Float.intBitsToFloat((int) (g0Var.g() >> 32)), Float.intBitsToFloat((int) (g0Var.g() & com.rabbitmq.client.k0.f265952a)), g0Var.f());
    }

    @Override // androidx.compose.animation.core.z3
    @NotNull
    public Function1<g0, androidx.compose.animation.core.v> a() {
        return new Function1() { // from class: androidx.compose.foundation.gestures.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j0.f((g0) obj);
            }
        };
    }

    @Override // androidx.compose.animation.core.z3
    @NotNull
    public Function1<androidx.compose.animation.core.v, g0> b() {
        return new Function1() { // from class: androidx.compose.foundation.gestures.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j0.e((androidx.compose.animation.core.v) obj);
            }
        };
    }
}
