package androidx.compose.animation;

import androidx.compose.runtime.o2;
import androidx.compose.ui.graphics.z3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@o2
public final class t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13735d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.y0<Float> f13738c;

    public /* synthetic */ t0(float f10, long j10, androidx.compose.animation.core.y0 y0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, y0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t0 e(t0 t0Var, float f10, long j10, androidx.compose.animation.core.y0 y0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = t0Var.f13736a;
        }
        if ((i10 & 2) != 0) {
            j10 = t0Var.f13737b;
        }
        if ((i10 & 4) != 0) {
            y0Var = t0Var.f13738c;
        }
        return t0Var.d(f10, j10, y0Var);
    }

    public final float a() {
        return this.f13736a;
    }

    public final long b() {
        return this.f13737b;
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> c() {
        return this.f13738c;
    }

    @NotNull
    public final t0 d(float f10, long j10, @NotNull androidx.compose.animation.core.y0<Float> y0Var) {
        return new t0(f10, j10, y0Var, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Float.compare(this.f13736a, t0Var.f13736a) == 0 && z3.i(this.f13737b, t0Var.f13737b) && Intrinsics.areEqual(this.f13738c, t0Var.f13738c);
    }

    @NotNull
    public final androidx.compose.animation.core.y0<Float> f() {
        return this.f13738c;
    }

    public final float g() {
        return this.f13736a;
    }

    public final long h() {
        return this.f13737b;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f13736a) * 31) + z3.m(this.f13737b)) * 31) + this.f13738c.hashCode();
    }

    @NotNull
    public String toString() {
        return "Scale(scale=" + this.f13736a + ", transformOrigin=" + ((Object) z3.n(this.f13737b)) + ", animationSpec=" + this.f13738c + ')';
    }

    private t0(float f10, long j10, androidx.compose.animation.core.y0<Float> y0Var) {
        this.f13736a = f10;
        this.f13737b = j10;
        this.f13738c = y0Var;
    }
}
