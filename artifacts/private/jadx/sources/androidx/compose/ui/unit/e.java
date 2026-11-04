package androidx.compose.ui.unit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f42684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f42685b;

    public e(float f10, float f11) {
        this.f42684a = f10;
        this.f42685b = f11;
    }

    public static /* synthetic */ e I(e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = eVar.f42684a;
        }
        if ((i10 & 2) != 0) {
            f11 = eVar.f42685b;
        }
        return eVar.x(f10, f11);
    }

    public final float c() {
        return this.f42684a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f42684a, eVar.f42684a) == 0 && Float.compare(this.f42685b, eVar.f42685b) == 0;
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f42684a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f42684a) * 31) + Float.hashCode(this.f42685b);
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f42685b;
    }

    @NotNull
    public String toString() {
        return "DensityImpl(density=" + this.f42684a + ", fontScale=" + this.f42685b + ')';
    }

    public final float w() {
        return this.f42685b;
    }

    @NotNull
    public final e x(float f10, float f11) {
        return new e(f10, f11);
    }
}
