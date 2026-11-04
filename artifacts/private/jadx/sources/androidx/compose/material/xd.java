package androidx.compose.material;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class xd implements androidx.compose.foundation.z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f25518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.x0 f25519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f25520d;

    static final class a implements androidx.compose.ui.graphics.x0 {
        a() {
        }

        @Override // androidx.compose.ui.graphics.x0
        public final long a() {
            return xd.this.f25520d;
        }
    }

    public /* synthetic */ xd(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    @Override // androidx.compose.foundation.z2
    @NotNull
    public androidx.compose.ui.node.j a(@NotNull androidx.compose.foundation.interaction.h hVar) {
        androidx.compose.ui.graphics.x0 aVar = this.f25519c;
        if (aVar == null) {
            aVar = new a();
        }
        int i10 = 2 << 0;
        return new DelegatingThemeAwareRippleNode(hVar, this.f25517a, this.f25518b, aVar, null);
    }

    @Override // androidx.compose.foundation.z2
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        if (this.f25517a == xdVar.f25517a && androidx.compose.ui.unit.h.x(this.f25518b, xdVar.f25518b) && Intrinsics.areEqual(this.f25519c, xdVar.f25519c)) {
            return androidx.compose.ui.graphics.q0.y(this.f25520d, xdVar.f25520d);
        }
        return false;
    }

    @Override // androidx.compose.foundation.z2
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f25517a) * 31) + androidx.compose.ui.unit.h.D(this.f25518b)) * 31;
        androidx.compose.ui.graphics.x0 x0Var = this.f25519c;
        return ((iHashCode + (x0Var != null ? x0Var.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.q0.K(this.f25520d);
    }

    public /* synthetic */ xd(boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, x0Var);
    }

    private xd(boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var, long j10) {
        this.f25517a = z10;
        this.f25518b = f10;
        this.f25519c = x0Var;
        this.f25520d = j10;
    }

    private xd(boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var) {
        this(z10, f10, x0Var, androidx.compose.ui.graphics.q0.f38131b.u());
    }

    private xd(boolean z10, float f10, long j10) {
        this(z10, f10, (androidx.compose.ui.graphics.x0) null, j10);
    }
}
