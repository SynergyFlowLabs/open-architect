package androidx.compose.runtime.internal;

import androidx.compose.runtime.e4;
import androidx.compose.runtime.z7;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,84:1\n80#2:85\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n83#1:85\n*E\n"})
public final class q0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.e4] */
    @NotNull
    public static final e4 a(@NotNull Pair<? extends androidx.compose.runtime.u0<Object>, ? extends z7<Object>>... pairArr) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.h.a<androidx.compose.runtime.u0<Object>, z7<Object>> aVarC = p0.f36066f.a().c();
        MapsKt.putAll(aVarC, pairArr);
        return aVarC.build2();
    }

    @NotNull
    public static final p0 b() {
        return p0.f36066f.a();
    }
}
