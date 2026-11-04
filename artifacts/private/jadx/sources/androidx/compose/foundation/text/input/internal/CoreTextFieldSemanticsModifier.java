package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class CoreTextFieldSemanticsModifier extends androidx.compose.ui.node.e1<r0> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19402m = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.h1 f19403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.y0 f19404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.g4 f19405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f19408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.m0 f19409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.selection.u3 f19410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.u f19411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.focus.g0 f19412l;

    public CoreTextFieldSemanticsModifier(@NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.foundation.text.g4 g4Var, boolean z10, boolean z11, boolean z12, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull androidx.compose.ui.focus.g0 g0Var) {
        this.f19403c = h1Var;
        this.f19404d = y0Var;
        this.f19405e = g4Var;
        this.f19406f = z10;
        this.f19407g = z11;
        this.f19408h = z12;
        this.f19409i = m0Var;
        this.f19410j = u3Var;
        this.f19411k = uVar;
        this.f19412l = g0Var;
    }

    public static /* synthetic */ CoreTextFieldSemanticsModifier w(CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier, androidx.compose.ui.text.input.h1 h1Var, androidx.compose.ui.text.input.y0 y0Var, androidx.compose.foundation.text.g4 g4Var, boolean z10, boolean z11, boolean z12, androidx.compose.ui.text.input.m0 m0Var, androidx.compose.foundation.text.selection.u3 u3Var, androidx.compose.ui.text.input.u uVar, androidx.compose.ui.focus.g0 g0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            h1Var = coreTextFieldSemanticsModifier.f19403c;
        }
        if ((i10 & 2) != 0) {
            y0Var = coreTextFieldSemanticsModifier.f19404d;
        }
        if ((i10 & 4) != 0) {
            g4Var = coreTextFieldSemanticsModifier.f19405e;
        }
        if ((i10 & 8) != 0) {
            z10 = coreTextFieldSemanticsModifier.f19406f;
        }
        if ((i10 & 16) != 0) {
            z11 = coreTextFieldSemanticsModifier.f19407g;
        }
        if ((i10 & 32) != 0) {
            z12 = coreTextFieldSemanticsModifier.f19408h;
        }
        if ((i10 & 64) != 0) {
            m0Var = coreTextFieldSemanticsModifier.f19409i;
        }
        if ((i10 & 128) != 0) {
            u3Var = coreTextFieldSemanticsModifier.f19410j;
        }
        if ((i10 & 256) != 0) {
            uVar = coreTextFieldSemanticsModifier.f19411k;
        }
        if ((i10 & 512) != 0) {
            g0Var = coreTextFieldSemanticsModifier.f19412l;
        }
        androidx.compose.ui.text.input.u uVar2 = uVar;
        androidx.compose.ui.focus.g0 g0Var2 = g0Var;
        androidx.compose.ui.text.input.m0 m0Var2 = m0Var;
        androidx.compose.foundation.text.selection.u3 u3Var2 = u3Var;
        boolean z13 = z11;
        boolean z14 = z12;
        return coreTextFieldSemanticsModifier.v(h1Var, y0Var, g4Var, z10, z13, z14, m0Var2, u3Var2, uVar2, g0Var2);
    }

    @NotNull
    public final androidx.compose.ui.text.input.u A() {
        return this.f19411k;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.u3 B() {
        return this.f19410j;
    }

    @NotNull
    public final androidx.compose.ui.text.input.m0 C() {
        return this.f19409i;
    }

    public final boolean D() {
        return this.f19406f;
    }

    @NotNull
    public final androidx.compose.foundation.text.g4 E() {
        return this.f19405e;
    }

    @NotNull
    public final androidx.compose.ui.text.input.h1 F() {
        return this.f19403c;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 G() {
        return this.f19404d;
    }

    public final boolean H() {
        return this.f19408h;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull r0 r0Var) {
        r0Var.za(this.f19403c, this.f19404d, this.f19405e, this.f19406f, this.f19407g, this.f19408h, this.f19409i, this.f19410j, this.f19411k, this.f19412l);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return Intrinsics.areEqual(this.f19403c, coreTextFieldSemanticsModifier.f19403c) && Intrinsics.areEqual(this.f19404d, coreTextFieldSemanticsModifier.f19404d) && Intrinsics.areEqual(this.f19405e, coreTextFieldSemanticsModifier.f19405e) && this.f19406f == coreTextFieldSemanticsModifier.f19406f && this.f19407g == coreTextFieldSemanticsModifier.f19407g && this.f19408h == coreTextFieldSemanticsModifier.f19408h && Intrinsics.areEqual(this.f19409i, coreTextFieldSemanticsModifier.f19409i) && Intrinsics.areEqual(this.f19410j, coreTextFieldSemanticsModifier.f19410j) && Intrinsics.areEqual(this.f19411k, coreTextFieldSemanticsModifier.f19411k) && Intrinsics.areEqual(this.f19412l, coreTextFieldSemanticsModifier.f19412l);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((((((((((((((this.f19403c.hashCode() * 31) + this.f19404d.hashCode()) * 31) + this.f19405e.hashCode()) * 31) + Boolean.hashCode(this.f19406f)) * 31) + Boolean.hashCode(this.f19407g)) * 31) + Boolean.hashCode(this.f19408h)) * 31) + this.f19409i.hashCode()) * 31) + this.f19410j.hashCode()) * 31) + this.f19411k.hashCode()) * 31) + this.f19412l.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @NotNull
    public final androidx.compose.ui.text.input.h1 l() {
        return this.f19403c;
    }

    @NotNull
    public final androidx.compose.ui.focus.g0 m() {
        return this.f19412l;
    }

    @NotNull
    public final androidx.compose.ui.text.input.y0 n() {
        return this.f19404d;
    }

    @NotNull
    public final androidx.compose.ui.focus.g0 n1() {
        return this.f19412l;
    }

    @NotNull
    public final androidx.compose.foundation.text.g4 o() {
        return this.f19405e;
    }

    public final boolean p() {
        return this.f19406f;
    }

    public final boolean q() {
        return this.f19407g;
    }

    public final boolean r() {
        return this.f19408h;
    }

    @NotNull
    public final androidx.compose.ui.text.input.m0 s() {
        return this.f19409i;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.u3 t() {
        return this.f19410j;
    }

    @NotNull
    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f19403c + ", value=" + this.f19404d + ", state=" + this.f19405e + ", readOnly=" + this.f19406f + ", enabled=" + this.f19407g + ", isPassword=" + this.f19408h + ", offsetMapping=" + this.f19409i + ", manager=" + this.f19410j + ", imeOptions=" + this.f19411k + ", focusRequester=" + this.f19412l + ')';
    }

    @NotNull
    public final androidx.compose.ui.text.input.u u() {
        return this.f19411k;
    }

    @NotNull
    public final CoreTextFieldSemanticsModifier v(@NotNull androidx.compose.ui.text.input.h1 h1Var, @NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.foundation.text.g4 g4Var, boolean z10, boolean z11, boolean z12, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var, @NotNull androidx.compose.ui.text.input.u uVar, @NotNull androidx.compose.ui.focus.g0 g0Var) {
        return new CoreTextFieldSemanticsModifier(h1Var, y0Var, g4Var, z10, z11, z12, m0Var, u3Var, uVar, g0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public r0 a() {
        return new r0(this.f19403c, this.f19404d, this.f19405e, this.f19406f, this.f19407g, this.f19408h, this.f19409i, this.f19410j, this.f19411k, this.f19412l);
    }

    public final boolean z() {
        return this.f19407g;
    }
}
