package androidx.compose.material3.carousel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f26718c;

    public x0(int i10, int i11, float f10) {
        this.f26716a = i10;
        this.f26717b = i11;
        this.f26718c = f10;
    }

    public static /* synthetic */ x0 e(x0 x0Var, int i10, int i11, float f10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = x0Var.f26716a;
        }
        if ((i12 & 2) != 0) {
            i11 = x0Var.f26717b;
        }
        if ((i12 & 4) != 0) {
            f10 = x0Var.f26718c;
        }
        return x0Var.d(i10, i11, f10);
    }

    public final int a() {
        return this.f26716a;
    }

    public final int b() {
        return this.f26717b;
    }

    public final float c() {
        return this.f26718c;
    }

    @NotNull
    public final x0 d(int i10, int i11, float f10) {
        return new x0(i10, i11, f10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f26716a == x0Var.f26716a && this.f26717b == x0Var.f26717b && Float.compare(this.f26718c, x0Var.f26718c) == 0;
    }

    public final int f() {
        return this.f26716a;
    }

    public final float g() {
        return this.f26718c;
    }

    public final int h() {
        return this.f26717b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f26716a) * 31) + Integer.hashCode(this.f26717b)) * 31) + Float.hashCode(this.f26718c);
    }

    @NotNull
    public String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.f26716a + ", toStepIndex=" + this.f26717b + ", steppedInterpolation=" + this.f26718c + ')';
    }
}
