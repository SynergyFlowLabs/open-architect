package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@kotlin.l(message = "Providing `OverscrollConfiguration` through `LocalOverscrollConfiguration` to disable / configure overscroll has been replaced with `LocalOverscrollFactory` and `rememberPlatformOverscrollFactory`. To disable overscroll, instead of `LocalOverscrollConfiguration provides null`, use `LocalOverscrollFactory provides null`. To change the glow color / padding, instead of `LocalOverscrollConfiguration provides OverscrollConfiguration(myColor, myPadding)`, use `LocalOverscrollFactory provides rememberPlatformOverscrollFactory(myColor, myPadding)`")
@b2
public final class u3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f21835c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f21836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.g5 f21837b;

    public /* synthetic */ u3(long j10, androidx.compose.foundation.layout.g5 g5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, g5Var);
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 a() {
        return this.f21837b;
    }

    public final long b() {
        return this.f21836a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(u3.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        u3 u3Var = (u3) obj;
        return androidx.compose.ui.graphics.q0.y(this.f21836a, u3Var.f21836a) && Intrinsics.areEqual(this.f21837b, u3Var.f21837b);
    }

    public int hashCode() {
        return (androidx.compose.ui.graphics.q0.K(this.f21836a) * 31) + this.f21837b.hashCode();
    }

    @NotNull
    public String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) androidx.compose.ui.graphics.q0.L(this.f21836a)) + ", drawPadding=" + this.f21837b + ')';
    }

    private u3(long j10, androidx.compose.foundation.layout.g5 g5Var) {
        this.f21836a = j10;
        this.f21837b = g5Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u3(long j10, androidx.compose.foundation.layout.g5 g5Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        j10 = (i10 & 1) != 0 ? androidx.compose.ui.graphics.s0.d(4284900966L) : j10;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if ((i10 & 2) != 0) {
            int i11 = 4 >> 0;
            g5Var = androidx.compose.foundation.layout.d5.h(0.0f, 0.0f, 3, null);
        }
        this(j10, g5Var, defaultConstructorMarker2);
    }
}
