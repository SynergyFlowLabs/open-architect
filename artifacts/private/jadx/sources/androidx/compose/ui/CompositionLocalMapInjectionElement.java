package androidx.compose.ui;

import androidx.compose.runtime.b1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
public final class CompositionLocalMapInjectionElement extends e1<n> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f36922d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b1 f36923c;

    public CompositionLocalMapInjectionElement(@NotNull b1 b1Var) {
        this.f36923c = b1Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && Intrinsics.areEqual(((CompositionLocalMapInjectionElement) obj).f36923c, this.f36923c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f36923c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("<Injected CompositionLocalMap>");
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n a() {
        return new n(this.f36923c);
    }

    @NotNull
    public final b1 m() {
        return this.f36923c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull n nVar) {
        nVar.w9(this.f36923c);
    }
}
