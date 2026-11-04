package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class e0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f37755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f37756d;

    public /* synthetic */ e0(long j10, int i10, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, colorFilter);
    }

    public final int b() {
        return this.f37756d;
    }

    public final long c() {
        return this.f37755c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return q0.y(this.f37755c, e0Var.f37755c) && d0.G(this.f37756d, e0Var.f37756d);
    }

    public int hashCode() {
        return (q0.K(this.f37755c) * 31) + d0.H(this.f37756d);
    }

    @NotNull
    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) q0.L(this.f37755c)) + ", blendMode=" + ((Object) d0.I(this.f37756d)) + ')';
    }

    public /* synthetic */ e0(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10);
    }

    private e0(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f37755c = j10;
        this.f37756d = i10;
    }

    private e0(long j10, int i10) {
        this(j10, i10, d.d(j10, i10), null);
    }
}
