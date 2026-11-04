package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class s3 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f38179c;

    public /* synthetic */ s3(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    @Override // androidx.compose.ui.graphics.i0
    public void a(long j10, @NotNull h2 h2Var, float f10) {
        long jW;
        h2Var.setAlpha(1.0f);
        if (f10 == 1.0f) {
            jW = this.f38179c;
        } else {
            long j11 = this.f38179c;
            jW = q0.w(j11, q0.A(j11) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        h2Var.S(jW);
        if (h2Var.v() != null) {
            h2Var.M(null);
        }
    }

    public final long c() {
        return this.f38179c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3) && q0.y(this.f38179c, ((s3) obj).f38179c);
    }

    public int hashCode() {
        return q0.K(this.f38179c);
    }

    @NotNull
    public String toString() {
        return "SolidColor(value=" + ((Object) q0.L(this.f38179c)) + ')';
    }

    private s3(long j10) {
        super(null);
        this.f38179c = j10;
    }
}
