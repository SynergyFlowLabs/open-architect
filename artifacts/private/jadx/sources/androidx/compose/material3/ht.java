package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class ht implements androidx.compose.foundation.z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f28242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f28243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.x0 f28244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28245d;

    static final class a implements androidx.compose.ui.graphics.x0 {
        a() {
        }

        @Override // androidx.compose.ui.graphics.x0
        public final long a() {
            return ht.this.f28245d;
        }
    }

    public /* synthetic */ ht(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    @Override // androidx.compose.foundation.z2
    @NotNull
    public androidx.compose.ui.node.j a(@NotNull androidx.compose.foundation.interaction.h hVar) {
        androidx.compose.ui.graphics.x0 aVar = this.f28244c;
        if (aVar == null) {
            aVar = new a();
        }
        return new DelegatingThemeAwareRippleNode(hVar, this.f28242a, this.f28243b, aVar, null);
    }

    @Override // androidx.compose.foundation.z2
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        if (this.f28242a == htVar.f28242a && androidx.compose.ui.unit.h.x(this.f28243b, htVar.f28243b) && Intrinsics.areEqual(this.f28244c, htVar.f28244c)) {
            return androidx.compose.ui.graphics.q0.y(this.f28245d, htVar.f28245d);
        }
        return false;
    }

    @Override // androidx.compose.foundation.z2
    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.f28242a) * 31) + androidx.compose.ui.unit.h.D(this.f28243b)) * 31;
        androidx.compose.ui.graphics.x0 x0Var = this.f28244c;
        return ((iHashCode + (x0Var != null ? x0Var.hashCode() : 0)) * 31) + androidx.compose.ui.graphics.q0.K(this.f28245d);
    }

    public /* synthetic */ ht(boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, x0Var);
    }

    private ht(boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var, long j10) {
        this.f28242a = z10;
        this.f28243b = f10;
        this.f28244c = x0Var;
        this.f28245d = j10;
    }

    private ht(boolean z10, float f10, androidx.compose.ui.graphics.x0 x0Var) {
        this(z10, f10, x0Var, androidx.compose.ui.graphics.q0.f38131b.u());
    }

    private ht(boolean z10, float f10, long j10) {
        this(z10, f10, (androidx.compose.ui.graphics.x0) null, j10);
    }
}
