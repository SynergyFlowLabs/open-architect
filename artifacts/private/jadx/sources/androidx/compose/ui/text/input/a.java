package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f41797a = 0;

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        if (nVar.m()) {
            nVar.c(nVar.g(), nVar.f());
            return;
        }
        if (nVar.h() != -1) {
            if (nVar.h() == 0) {
                return;
            }
            nVar.c(androidx.compose.ui.text.a0.b(nVar.toString(), nVar.h()), nVar.h());
        } else {
            int iL = nVar.l();
            int iK = nVar.k();
            nVar.q(nVar.l());
            nVar.c(iL, iK);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof a;
    }

    public int hashCode() {
        return kotlin.jvm.internal.j1.d(a.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "BackspaceCommand()";
    }
}
