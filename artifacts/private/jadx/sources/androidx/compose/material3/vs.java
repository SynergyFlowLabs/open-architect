package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nWideNavigationRailState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WideNavigationRailState.kt\nandroidx/compose/material3/RailPredictiveBackState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,261:1\n85#2:262\n117#2,2:263\n*S KotlinDebug\n*F\n+ 1 WideNavigationRailState.kt\nandroidx/compose/material3/RailPredictiveBackState\n*L\n255#1:262\n255#1:263,2\n*E\n"})
public final class vs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f34005b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f34006a = androidx.compose.runtime.d7.g(Boolean.TRUE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        return ((Boolean) this.f34006a.getValue()).booleanValue();
    }

    public final void b(boolean z10) {
        this.f34006a.setValue(Boolean.valueOf(z10));
    }

    public final void c(boolean z10, boolean z11) {
        b((z10 && !z11) || (!z10 && z11));
    }
}
