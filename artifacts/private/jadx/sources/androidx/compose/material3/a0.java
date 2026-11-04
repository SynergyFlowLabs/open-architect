package androidx.compose.material3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBarDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/AppBarDslKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,403:1\n1282#2,6:404\n*S KotlinDebug\n*F\n+ 1 AppBarDsl.kt\nandroidx/compose/material3/AppBarDslKt\n*L\n266#1:404,6\n*E\n"})
public final class a0 {
    @androidx.compose.runtime.o
    @NotNull
    public static final q1 b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(209837519, i10, -1, "androidx.compose.material3.rememberAppBarOverflowState (AppBarDsl.kt:264)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<t1, ?> c0VarA = t1.f33053c.a();
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.material3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a0.c();
                }
            };
            c0Var.Y(objI0);
        }
        t1 t1Var = (t1) androidx.compose.runtime.saveable.i.j(objArr, c0VarA, (Function0) objI0, c0Var, androidx.media3.exoplayer.a5.S0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return t1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t1 c() {
        return new t1();
    }
}
