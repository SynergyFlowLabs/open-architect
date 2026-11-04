package androidx.compose.ui.text.input;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class u0 implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41968c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f41969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41970b;

    public u0(@NotNull androidx.compose.ui.text.f fVar, int i10) {
        this.f41969a = fVar;
        this.f41970b = i10;
    }

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        if (nVar.m()) {
            int iG = nVar.g();
            nVar.o(nVar.g(), nVar.f(), d());
            if (d().length() > 0) {
                nVar.p(iG, d().length() + iG);
            }
        } else {
            int iL = nVar.l();
            nVar.o(nVar.l(), nVar.k(), d());
            if (d().length() > 0) {
                nVar.p(iL, d().length() + iL);
            }
        }
        int iH = nVar.h();
        int i10 = this.f41970b;
        nVar.q(kotlin.ranges.r.I(i10 > 0 ? (iH + i10) - 1 : (iH + i10) - d().length(), 0, nVar.i()));
    }

    @NotNull
    public final androidx.compose.ui.text.f b() {
        return this.f41969a;
    }

    public final int c() {
        return this.f41970b;
    }

    @NotNull
    public final String d() {
        return this.f41969a.m();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.areEqual(d(), u0Var.d()) && this.f41970b == u0Var.f41970b;
    }

    public int hashCode() {
        return (d().hashCode() * 31) + this.f41970b;
    }

    @NotNull
    public String toString() {
        return "SetComposingTextCommand(text='" + d() + "', newCursorPosition=" + this.f41970b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0(@NotNull String str, int i10) {
        this(new androidx.compose.ui.text.f(str, null, 2, 0 == true ? 1 : 0), i10);
    }
}
