package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSwipeToDismissBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,394:1\n75#2:395\n1#3:396\n1282#4,6:397\n113#5:403\n*S KotlinDebug\n*F\n+ 1 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissBoxDefaults\n*L\n363#1:395\n363#1:397,6\n363#1:403\n*E\n"})
public final class w10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w10 f34055a = new w10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34056b = 0;

    private w10() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(androidx.compose.ui.unit.d dVar, float f10) {
        return dVar.S7(androidx.compose.ui.unit.h.r(56));
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getPositionalThreshold")
    @NotNull
    public final Function1<Float, Float> c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1545861529, i10, -1, "androidx.compose.material3.SwipeToDismissBoxDefaults.<get-positionalThreshold> (SwipeToDismissBox.kt:362)");
        }
        c0Var.E(-485754360);
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        boolean zD = c0Var.D(dVar);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function1() { // from class: androidx.compose.material3.v10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Float.valueOf(w10.b(dVar, ((Float) obj).floatValue()));
                }
            };
            c0Var.Y(objI0);
        }
        Function1<Float, Float> function1 = (Function1) objI0;
        c0Var.A();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return function1;
    }
}
