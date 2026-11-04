package androidx.compose.foundation.contextmenu;

import androidx.annotation.l1;
import androidx.compose.runtime.k7;
import androidx.compose.ui.graphics.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@l1
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14042f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f14045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14047e;

    public /* synthetic */ h(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a() {
        return this.f14043a;
    }

    public final long b() {
        return this.f14047e;
    }

    public final long c() {
        return this.f14046d;
    }

    public final long d() {
        return this.f14045c;
    }

    public final long e() {
        return this.f14044b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return q0.y(this.f14043a, hVar.f14043a) && q0.y(this.f14044b, hVar.f14044b) && q0.y(this.f14045c, hVar.f14045c) && q0.y(this.f14046d, hVar.f14046d) && q0.y(this.f14047e, hVar.f14047e);
    }

    public int hashCode() {
        return (((((((q0.K(this.f14043a) * 31) + q0.K(this.f14044b)) * 31) + q0.K(this.f14045c)) * 31) + q0.K(this.f14046d)) * 31) + q0.K(this.f14047e);
    }

    @NotNull
    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) q0.L(this.f14043a)) + ", textColor=" + ((Object) q0.L(this.f14044b)) + ", iconColor=" + ((Object) q0.L(this.f14045c)) + ", disabledTextColor=" + ((Object) q0.L(this.f14046d)) + ", disabledIconColor=" + ((Object) q0.L(this.f14047e)) + ')';
    }

    private h(long j10, long j11, long j12, long j13, long j14) {
        this.f14043a = j10;
        this.f14044b = j11;
        this.f14045c = j12;
        this.f14046d = j13;
        this.f14047e = j14;
    }
}
