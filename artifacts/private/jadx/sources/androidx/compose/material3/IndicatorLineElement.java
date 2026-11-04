package androidx.compose.material3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class IndicatorLineElement extends androidx.compose.ui.node.e1<ri> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f25905j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f25906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.h f25908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final j40 f25909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.graphics.q3 f25910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f25911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f25912i;

    public /* synthetic */ IndicatorLineElement(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, hVar, j40Var, q3Var, f10, f11);
    }

    public static /* synthetic */ IndicatorLineElement t(IndicatorLineElement indicatorLineElement, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = indicatorLineElement.f25906c;
        }
        if ((i10 & 2) != 0) {
            z11 = indicatorLineElement.f25907d;
        }
        if ((i10 & 4) != 0) {
            hVar = indicatorLineElement.f25908e;
        }
        if ((i10 & 8) != 0) {
            j40Var = indicatorLineElement.f25909f;
        }
        if ((i10 & 16) != 0) {
            q3Var = indicatorLineElement.f25910g;
        }
        if ((i10 & 32) != 0) {
            f10 = indicatorLineElement.f25911h;
        }
        if ((i10 & 64) != 0) {
            f11 = indicatorLineElement.f25912i;
        }
        float f12 = f10;
        float f13 = f11;
        androidx.compose.ui.graphics.q3 q3Var2 = q3Var;
        androidx.compose.foundation.interaction.h hVar2 = hVar;
        return indicatorLineElement.s(z10, z11, hVar2, j40Var, q3Var2, f12, f13);
    }

    @Nullable
    public final androidx.compose.ui.graphics.q3 A() {
        return this.f25910g;
    }

    public final float B() {
        return this.f25912i;
    }

    public final boolean C() {
        return this.f25907d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull ri riVar) {
        riVar.Z9(this.f25906c, this.f25907d, this.f25908e, this.f25909f, this.f25910g, this.f25911h, this.f25912i);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) obj;
        return this.f25906c == indicatorLineElement.f25906c && this.f25907d == indicatorLineElement.f25907d && Intrinsics.areEqual(this.f25908e, indicatorLineElement.f25908e) && Intrinsics.areEqual(this.f25909f, indicatorLineElement.f25909f) && Intrinsics.areEqual(this.f25910g, indicatorLineElement.f25910g) && androidx.compose.ui.unit.h.x(this.f25911h, indicatorLineElement.f25911h) && androidx.compose.ui.unit.h.x(this.f25912i, indicatorLineElement.f25912i);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f25906c) * 31) + Boolean.hashCode(this.f25907d)) * 31) + this.f25908e.hashCode()) * 31;
        j40 j40Var = this.f25909f;
        int iHashCode2 = (iHashCode + (j40Var == null ? 0 : j40Var.hashCode())) * 31;
        androidx.compose.ui.graphics.q3 q3Var = this.f25910g;
        return ((((iHashCode2 + (q3Var != null ? q3Var.hashCode() : 0)) * 31) + androidx.compose.ui.unit.h.D(this.f25911h)) * 31) + androidx.compose.ui.unit.h.D(this.f25912i);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        t2Var.d("indicatorLine");
        t2Var.b().c("enabled", Boolean.valueOf(this.f25906c));
        t2Var.b().c("isError", Boolean.valueOf(this.f25907d));
        t2Var.b().c("interactionSource", this.f25908e);
        t2Var.b().c("colors", this.f25909f);
        t2Var.b().c("textFieldShape", this.f25910g);
        t2Var.b().c("focusedIndicatorLineThickness", androidx.compose.ui.unit.h.o(this.f25911h));
        t2Var.b().c("unfocusedIndicatorLineThickness", androidx.compose.ui.unit.h.o(this.f25912i));
    }

    public final boolean l() {
        return this.f25906c;
    }

    public final boolean m() {
        return this.f25907d;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h n() {
        return this.f25908e;
    }

    @Nullable
    public final j40 o() {
        return this.f25909f;
    }

    @Nullable
    public final androidx.compose.ui.graphics.q3 p() {
        return this.f25910g;
    }

    public final float q() {
        return this.f25911h;
    }

    public final float r() {
        return this.f25912i;
    }

    @NotNull
    public final IndicatorLineElement s(boolean z10, boolean z11, @NotNull androidx.compose.foundation.interaction.h hVar, @Nullable j40 j40Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, float f11) {
        return new IndicatorLineElement(z10, z11, hVar, j40Var, q3Var, f10, f11, null);
    }

    @NotNull
    public String toString() {
        return "IndicatorLineElement(enabled=" + this.f25906c + ", isError=" + this.f25907d + ", interactionSource=" + this.f25908e + ", colors=" + this.f25909f + ", textFieldShape=" + this.f25910g + ", focusedIndicatorLineThickness=" + ((Object) androidx.compose.ui.unit.h.M(this.f25911h)) + ", unfocusedIndicatorLineThickness=" + ((Object) androidx.compose.ui.unit.h.M(this.f25912i)) + ')';
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public ri a() {
        return new ri(this.f25906c, this.f25907d, this.f25908e, this.f25909f, this.f25910g, this.f25911h, this.f25912i, null);
    }

    @Nullable
    public final j40 v() {
        return this.f25909f;
    }

    public final boolean w() {
        return this.f25906c;
    }

    public final float y() {
        return this.f25911h;
    }

    @NotNull
    public final androidx.compose.foundation.interaction.h z() {
        return this.f25908e;
    }

    private IndicatorLineElement(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11) {
        this.f25906c = z10;
        this.f25907d = z11;
        this.f25908e = hVar;
        this.f25909f = j40Var;
        this.f25910g = q3Var;
        this.f25911h = f10;
        this.f25912i = f11;
    }
}
