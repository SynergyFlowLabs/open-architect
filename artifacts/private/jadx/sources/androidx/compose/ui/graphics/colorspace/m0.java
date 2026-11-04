package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.d1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f37657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f37658b;

    public m0(float f10, float f11) {
        this.f37657a = f10;
        this.f37658b = f11;
    }

    public static /* synthetic */ m0 d(m0 m0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m0Var.f37657a;
        }
        if ((i10 & 2) != 0) {
            f11 = m0Var.f37658b;
        }
        return m0Var.c(f10, f11);
    }

    public final float a() {
        return this.f37657a;
    }

    public final float b() {
        return this.f37658b;
    }

    @NotNull
    public final m0 c(float f10, float f11) {
        return new m0(f10, f11);
    }

    public final float e() {
        return this.f37657a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Float.compare(this.f37657a, m0Var.f37657a) == 0 && Float.compare(this.f37658b, m0Var.f37658b) == 0;
    }

    public final float f() {
        return this.f37658b;
    }

    @d1(3)
    @NotNull
    public final float[] g() {
        float f10 = this.f37657a;
        float f11 = this.f37658b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public int hashCode() {
        return (Float.hashCode(this.f37657a) * 31) + Float.hashCode(this.f37658b);
    }

    @NotNull
    public String toString() {
        return "WhitePoint(x=" + this.f37657a + ", y=" + this.f37658b + ')';
    }

    public m0(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private m0(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
