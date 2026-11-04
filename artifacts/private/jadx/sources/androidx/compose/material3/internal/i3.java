package androidx.compose.material3.internal;

import androidx.compose.runtime.d7;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBasicEdgeToEdgeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicEdgeToEdgeDialog.kt\nandroidx/compose/material3/internal/PredictiveBackStateImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,122:1\n85#2:123\n117#2,2:124\n*S KotlinDebug\n*F\n+ 1 BasicEdgeToEdgeDialog.kt\nandroidx/compose/material3/internal/PredictiveBackStateImpl\n*L\n83#1:123\n83#1:124,2\n*E\n"})
final class i3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f28959a = d7.g(j0.c.f28967a, null, 2, null);

    public void a(@NotNull j0 j0Var) {
        this.f28959a.setValue(j0Var);
    }

    @Override // androidx.compose.material3.internal.h3
    @NotNull
    public j0 getValue() {
        return (j0) this.f28959a.getValue();
    }
}
