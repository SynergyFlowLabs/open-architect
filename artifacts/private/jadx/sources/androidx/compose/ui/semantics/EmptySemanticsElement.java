package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class EmptySemanticsElement extends e1<f> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41058d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f41059c;

    public EmptySemanticsElement(@NotNull f fVar) {
        this.f41059c = fVar;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f a() {
        return this.f41059c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull f fVar) {
    }
}
