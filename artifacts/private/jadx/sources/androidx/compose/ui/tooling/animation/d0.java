package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 2)
@SourceDebugExtension({"SMAP\nToolingState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n85#2:41\n117#2,2:42\n*S KotlinDebug\n*F\n+ 1 ToolingState.android.kt\nandroidx/compose/ui/tooling/animation/ToolingState\n*L\n38#1:41\n38#1:42,2\n*E\n"})
public final class d0<T> implements n7<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42411b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3 f42412a;

    public d0(T t10) {
        this.f42412a = d7.g(t10, null, 2, null);
    }

    @Override // androidx.compose.runtime.n7
    public T getValue() {
        return this.f42412a.getValue();
    }

    public void setValue(T t10) {
        this.f42412a.setValue(t10);
    }
}
