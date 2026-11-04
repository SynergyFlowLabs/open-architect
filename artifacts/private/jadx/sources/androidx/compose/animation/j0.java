package androidx.compose.animation;

import androidx.compose.runtime.o2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public final class j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13541c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<Float> f13543b;

    public j0(float f10, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        this.f13542a = f10;
        this.f13543b = y0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j0 d(j0 j0Var, float f10, androidx.compose.animation.core.y0 y0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j0Var.f13542a;
        }
        if ((i10 & 2) != 0) {
            y0Var = j0Var.f13543b;
        }
        return j0Var.c(f10, y0Var);
    }

    public final float a() {
        return this.f13542a;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> b() {
        return this.f13543b;
    }

    @NotNull
    public final j0 c(float f10, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        return new j0(f10, y0Var);
    }

    public final float e() {
        return this.f13542a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Float.compare(this.f13542a, j0Var.f13542a) == 0 && Intrinsics.areEqual(this.f13543b, j0Var.f13543b);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> f() {
        return this.f13543b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f13542a) * 31) + this.f13543b.hashCode();
    }

    @NotNull
    public String toString() {
        return "Fade(alpha=" + this.f13542a + ", animationSpec=" + this.f13543b + ')';
    }
}
