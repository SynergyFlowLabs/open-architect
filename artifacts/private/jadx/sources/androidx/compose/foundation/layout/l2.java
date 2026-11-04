package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16203b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f16204a;

    public l2(float f10) {
        this.f16204a = f10;
    }

    public static /* synthetic */ l2 c(l2 l2Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = l2Var.f16204a;
        }
        return l2Var.b(f10);
    }

    public final float a() {
        return this.f16204a;
    }

    @NotNull
    public final l2 b(float f10) {
        return new l2(f10);
    }

    public final float d() {
        return this.f16204a;
    }

    public final void e(float f10) {
        this.f16204a = f10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && Float.compare(this.f16204a, ((l2) obj).f16204a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f16204a);
    }

    @NotNull
    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.f16204a + ')';
    }
}
