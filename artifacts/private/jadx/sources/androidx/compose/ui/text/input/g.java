package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41882a = 0;

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        nVar.o(0, nVar.i(), "");
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof g;
    }

    public int hashCode() {
        return kotlin.jvm.internal.j1.d(g.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "DeleteAllCommand()";
    }
}
