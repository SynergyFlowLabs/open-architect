package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class dt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27134c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.material.ripple.l f27136b;

    public /* synthetic */ dt(long j10, androidx.compose.material.ripple.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, lVar);
    }

    public final long a() {
        return this.f27135a;
    }

    @Nullable
    public final androidx.compose.material.ripple.l b() {
        return this.f27136b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt)) {
            return false;
        }
        dt dtVar = (dt) obj;
        return androidx.compose.ui.graphics.q0.y(this.f27135a, dtVar.f27135a) && Intrinsics.areEqual(this.f27136b, dtVar.f27136b);
    }

    public int hashCode() {
        int iK = androidx.compose.ui.graphics.q0.K(this.f27135a) * 31;
        androidx.compose.material.ripple.l lVar = this.f27136b;
        return iK + (lVar != null ? lVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RippleConfiguration(color=" + ((Object) androidx.compose.ui.graphics.q0.L(this.f27135a)) + ", rippleAlpha=" + this.f27136b + ')';
    }

    private dt(long j10, androidx.compose.material.ripple.l lVar) {
        this.f27135a = j10;
        this.f27136b = lVar;
    }

    public /* synthetic */ dt(long j10, androidx.compose.material.ripple.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10, (i10 & 2) != 0 ? null : lVar, null);
    }
}
