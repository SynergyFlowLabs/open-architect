package androidx.compose.runtime.saveable;

import androidx.compose.runtime.m0;
import androidx.media3.exoplayer.a5;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,129:1\n1282#2,6:130\n1#3:136\n75#4:137\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderKt\n*L\n58#1:130,6\n59#1:137\n*E\n"})
public final class u {
    @androidx.compose.runtime.o
    @NotNull
    public static final m b(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        c0Var.E(1967008021);
        Object[] objArr = new Object[0];
        c0<s, ?> c0VarA = s.f36418e.a();
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.runtime.saveable.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u.c();
                }
            };
            c0Var.Y(objI0);
        }
        s sVar = (s) i.j(objArr, c0VarA, (Function0) objI0, c0Var, a5.S0);
        sVar.t((v) c0Var.W(y.g()));
        c0Var.A();
        if (m0.l0()) {
            m0.z0();
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s c() {
        return new s(null, 1, null);
    }
}
