package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class StylusHoverIconModifierElement extends e1<v0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38960f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x f38961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.node.s f38963e;

    public /* synthetic */ StylusHoverIconModifierElement(x xVar, boolean z10, androidx.compose.ui.node.s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : sVar);
    }

    public static /* synthetic */ StylusHoverIconModifierElement p(StylusHoverIconModifierElement stylusHoverIconModifierElement, x xVar, boolean z10, androidx.compose.ui.node.s sVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            xVar = stylusHoverIconModifierElement.f38961c;
        }
        if ((i10 & 2) != 0) {
            z10 = stylusHoverIconModifierElement.f38962d;
        }
        if ((i10 & 4) != 0) {
            sVar = stylusHoverIconModifierElement.f38963e;
        }
        return stylusHoverIconModifierElement.o(xVar, z10, sVar);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return Intrinsics.areEqual(this.f38961c, stylusHoverIconModifierElement.f38961c) && this.f38962d == stylusHoverIconModifierElement.f38962d && Intrinsics.areEqual(this.f38963e, stylusHoverIconModifierElement.f38963e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((this.f38961c.hashCode() * 31) + Boolean.hashCode(this.f38962d)) * 31;
        androidx.compose.ui.node.s sVar = this.f38963e;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("stylusHoverIcon");
        t2Var.b().c("icon", this.f38961c);
        t2Var.b().c("overrideDescendants", Boolean.valueOf(this.f38962d));
        t2Var.b().c("touchBoundsExpansion", this.f38963e);
    }

    @NotNull
    public final x l() {
        return this.f38961c;
    }

    public final boolean m() {
        return this.f38962d;
    }

    @Nullable
    public final androidx.compose.ui.node.s n() {
        return this.f38963e;
    }

    @NotNull
    public final StylusHoverIconModifierElement o(@NotNull x xVar, boolean z10, @Nullable androidx.compose.ui.node.s sVar) {
        return new StylusHoverIconModifierElement(xVar, z10, sVar);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public v0 a() {
        return new v0(this.f38961c, this.f38962d, this.f38963e);
    }

    @NotNull
    public final x r() {
        return this.f38961c;
    }

    public final boolean s() {
        return this.f38962d;
    }

    @Nullable
    public final androidx.compose.ui.node.s t() {
        return this.f38963e;
    }

    @NotNull
    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.f38961c + ", overrideDescendants=" + this.f38962d + ", touchBoundsExpansion=" + this.f38963e + ')';
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull v0 v0Var) {
        v0Var.L9(this.f38961c);
        v0Var.M9(this.f38962d);
        v0Var.K9(this.f38963e);
    }

    public StylusHoverIconModifierElement(@NotNull x xVar, boolean z10, @Nullable androidx.compose.ui.node.s sVar) {
        this.f38961c = xVar;
        this.f38962d = z10;
        this.f38963e = sVar;
    }
}
