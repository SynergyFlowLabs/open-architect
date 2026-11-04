package androidx.compose.ui.text.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class v0 implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41971c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41973b;

    public v0(int i10, int i11) {
        this.f41972a = i10;
        this.f41973b = i11;
    }

    @Override // androidx.compose.ui.text.input.j
    public void a(@NotNull n nVar) {
        int I = kotlin.ranges.r.I(this.f41972a, 0, nVar.i());
        int I2 = kotlin.ranges.r.I(this.f41973b, 0, nVar.i());
        if (I < I2) {
            nVar.r(I, I2);
        } else {
            nVar.r(I2, I);
        }
    }

    public final int b() {
        return this.f41973b;
    }

    public final int c() {
        return this.f41972a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f41972a == v0Var.f41972a && this.f41973b == v0Var.f41973b;
    }

    public int hashCode() {
        return (this.f41972a * 31) + this.f41973b;
    }

    @NotNull
    public String toString() {
        return "SetSelectionCommand(start=" + this.f41972a + ", end=" + this.f41973b + ')';
    }
}
