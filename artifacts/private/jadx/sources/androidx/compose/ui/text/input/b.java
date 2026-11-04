package androidx.compose.ui.text.input;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class b implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41808c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f41809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41810b;

    public b(@NotNull androidx.compose.ui.text.f fVar, int i10) {
        this.f41809a = fVar;
        this.f41810b = i10;
    }

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        if (nVar.m()) {
            nVar.o(nVar.g(), nVar.f(), d());
        } else {
            nVar.o(nVar.l(), nVar.k(), d());
        }
        int iH = nVar.h();
        int i10 = this.f41810b;
        nVar.q(kotlin.ranges.r.I(i10 > 0 ? (iH + i10) - 1 : (iH + i10) - d().length(), 0, nVar.i()));
    }

    @NotNull
    public final androidx.compose.ui.text.f b() {
        return this.f41809a;
    }

    public final int c() {
        return this.f41810b;
    }

    @NotNull
    public final String d() {
        return this.f41809a.m();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(d(), bVar.d()) && this.f41810b == bVar.f41810b;
    }

    public int hashCode() {
        return (d().hashCode() * 31) + this.f41810b;
    }

    @NotNull
    public String toString() {
        return "CommitTextCommand(text='" + d() + "', newCursorPosition=" + this.f41810b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull String str, int i10) {
        this(new androidx.compose.ui.text.f(str, null, 2, 0 == true ? 1 : 0), i10);
    }
}
