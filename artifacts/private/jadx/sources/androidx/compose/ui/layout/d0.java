package androidx.compose.ui.layout;

import androidx.compose.runtime.d7;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nLayoutBoundsHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutBoundsHolder.kt\nandroidx/compose/ui/layout/LayoutBoundsHolder\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,99:1\n85#2:100\n117#2,2:101\n*S KotlinDebug\n*F\n+ 1 LayoutBoundsHolder.kt\nandroidx/compose/ui/layout/LayoutBoundsHolder\n*L\n46#1:100\n46#1:101,2\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39298b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f39299a = d7.g(null, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    @e0.a
    @Nullable
    public final androidx.compose.ui.spatial.h a() {
        return (androidx.compose.ui.spatial.h) this.f39299a.getValue();
    }

    public final void b(@Nullable androidx.compose.ui.spatial.h hVar) {
        this.f39299a.setValue(hVar);
    }
}
