package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class WithAlignmentLineBlockElement extends androidx.compose.ui.node.e1<g6.a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15827d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.layout.e1, Integer> f15828c;

    /* JADX WARN: Multi-variable type inference failed */
    public WithAlignmentLineBlockElement(@NotNull Function1<? super androidx.compose.ui.layout.e1, Integer> function1) {
        this.f15828c = function1;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        return withAlignmentLineBlockElement != null && this.f15828c == withAlignmentLineBlockElement.f15828c;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f15828c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("alignBy");
        t2Var.e(this.f15828c);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public g6.a a() {
        return new g6.a(this.f15828c);
    }

    @NotNull
    public final Function1<androidx.compose.ui.layout.e1, Integer> m() {
        return this.f15828c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull g6.a aVar) {
        aVar.w9(this.f15828c);
    }
}
