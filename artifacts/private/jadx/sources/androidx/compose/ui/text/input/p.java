package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class p implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41925a = 0;

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        nVar.b();
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof p;
    }

    public int hashCode() {
        return kotlin.jvm.internal.j1.d(p.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
