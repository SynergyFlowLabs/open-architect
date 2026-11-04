package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.o2
public final class a2 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f37522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f37523d;

    public /* synthetic */ a2(long j10, long j11, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, colorFilter);
    }

    public final long b() {
        return this.f37523d;
    }

    public final long c() {
        return this.f37522c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return q0.y(this.f37522c, a2Var.f37522c) && q0.y(this.f37523d, a2Var.f37523d);
    }

    public int hashCode() {
        return (q0.K(this.f37522c) * 31) + q0.K(this.f37523d);
    }

    @NotNull
    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) q0.L(this.f37522c)) + ", add=" + ((Object) q0.L(this.f37523d)) + ')';
    }

    public /* synthetic */ a2(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private a2(long j10, long j11, ColorFilter colorFilter) {
        super(colorFilter);
        this.f37522c = j10;
        this.f37523d = j11;
    }

    private a2(long j10, long j11) {
        this(j10, j11, d.c(j10, j11), null);
    }
}
