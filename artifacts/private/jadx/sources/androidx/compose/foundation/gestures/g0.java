package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f14588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f14590c;

    public /* synthetic */ g0(float f10, long j10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, f11);
    }

    public static /* synthetic */ g0 e(g0 g0Var, float f10, long j10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = g0Var.f14588a;
        }
        if ((i10 & 2) != 0) {
            j10 = g0Var.f14589b;
        }
        if ((i10 & 4) != 0) {
            f11 = g0Var.f14590c;
        }
        return g0Var.d(f10, j10, f11);
    }

    public final float a() {
        return this.f14588a;
    }

    public final long b() {
        return this.f14589b;
    }

    public final float c() {
        return this.f14590c;
    }

    @NotNull
    public final g0 d(float f10, long j10, float f11) {
        return new g0(f10, j10, f11, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Float.compare(this.f14588a, g0Var.f14588a) == 0 && n0.g.l(this.f14589b, g0Var.f14589b) && Float.compare(this.f14590c, g0Var.f14590c) == 0;
    }

    public final float f() {
        return this.f14590c;
    }

    public final long g() {
        return this.f14589b;
    }

    public final float h() {
        return this.f14588a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f14588a) * 31) + n0.g.t(this.f14589b)) * 31) + Float.hashCode(this.f14590c);
    }

    @NotNull
    public String toString() {
        return "AnimationData(zoom=" + this.f14588a + ", offset=" + ((Object) n0.g.z(this.f14589b)) + ", degrees=" + this.f14590c + ')';
    }

    private g0(float f10, long j10, float f11) {
        this.f14588a = f10;
        this.f14589b = j10;
        this.f14590c = f11;
    }
}
