package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class td {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24997c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f24998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final androidx.compose.material.ripple.l f24999b;

    public /* synthetic */ td(long j10, androidx.compose.material.ripple.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, lVar);
    }

    public final long a() {
        return this.f24998a;
    }

    @Nullable
    public final androidx.compose.material.ripple.l b() {
        return this.f24999b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return androidx.compose.ui.graphics.q0.y(this.f24998a, tdVar.f24998a) && Intrinsics.areEqual(this.f24999b, tdVar.f24999b);
    }

    public int hashCode() {
        int iK = androidx.compose.ui.graphics.q0.K(this.f24998a) * 31;
        androidx.compose.material.ripple.l lVar = this.f24999b;
        return iK + (lVar != null ? lVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RippleConfiguration(color=" + ((Object) androidx.compose.ui.graphics.q0.L(this.f24998a)) + ", rippleAlpha=" + this.f24999b + ')';
    }

    private td(long j10, androidx.compose.material.ripple.l lVar) {
        this.f24998a = j10;
        this.f24999b = lVar;
    }

    public /* synthetic */ td(long j10, androidx.compose.material.ripple.l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10, (i10 & 2) != 0 ? null : lVar, null);
    }
}
