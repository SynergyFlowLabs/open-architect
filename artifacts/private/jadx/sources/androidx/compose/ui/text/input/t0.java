package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class t0 implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41955c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41957b;

    public t0(int i10, int i11) {
        this.f41956a = i10;
        this.f41957b = i11;
    }

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        if (nVar.m()) {
            nVar.b();
        }
        int I = kotlin.ranges.r.I(this.f41956a, 0, nVar.i());
        int I2 = kotlin.ranges.r.I(this.f41957b, 0, nVar.i());
        if (I != I2) {
            if (I < I2) {
                nVar.p(I, I2);
            } else {
                nVar.p(I2, I);
            }
        }
    }

    public final int b() {
        return this.f41957b;
    }

    public final int c() {
        return this.f41956a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f41956a == t0Var.f41956a && this.f41957b == t0Var.f41957b;
    }

    public int hashCode() {
        return (this.f41956a * 31) + this.f41957b;
    }

    @NotNull
    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f41956a + ", end=" + this.f41957b + ')';
    }
}
