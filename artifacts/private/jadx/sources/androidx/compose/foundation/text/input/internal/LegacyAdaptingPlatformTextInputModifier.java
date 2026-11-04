package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends androidx.compose.ui.node.e1<t3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x3 f19413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.g4 f19414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.selection.u3 f19415e;

    public LegacyAdaptingPlatformTextInputModifier(@NotNull x3 x3Var, @NotNull androidx.compose.foundation.text.g4 g4Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var) {
        this.f19413c = x3Var;
        this.f19414d = g4Var;
        this.f19415e = u3Var;
    }

    public static /* synthetic */ LegacyAdaptingPlatformTextInputModifier p(LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier, x3 x3Var, androidx.compose.foundation.text.g4 g4Var, androidx.compose.foundation.text.selection.u3 u3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x3Var = legacyAdaptingPlatformTextInputModifier.f19413c;
        }
        if ((i10 & 2) != 0) {
            g4Var = legacyAdaptingPlatformTextInputModifier.f19414d;
        }
        if ((i10 & 4) != 0) {
            u3Var = legacyAdaptingPlatformTextInputModifier.f19415e;
        }
        return legacyAdaptingPlatformTextInputModifier.o(x3Var, g4Var, u3Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.areEqual(this.f19413c, legacyAdaptingPlatformTextInputModifier.f19413c) && Intrinsics.areEqual(this.f19414d, legacyAdaptingPlatformTextInputModifier.f19414d) && Intrinsics.areEqual(this.f19415e, legacyAdaptingPlatformTextInputModifier.f19415e);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((this.f19413c.hashCode() * 31) + this.f19414d.hashCode()) * 31) + this.f19415e.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @NotNull
    public final x3 l() {
        return this.f19413c;
    }

    @NotNull
    public final androidx.compose.foundation.text.g4 m() {
        return this.f19414d;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.u3 n() {
        return this.f19415e;
    }

    @NotNull
    public final LegacyAdaptingPlatformTextInputModifier o(@NotNull x3 x3Var, @NotNull androidx.compose.foundation.text.g4 g4Var, @NotNull androidx.compose.foundation.text.selection.u3 u3Var) {
        return new LegacyAdaptingPlatformTextInputModifier(x3Var, g4Var, u3Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public t3 a() {
        return new t3(this.f19413c, this.f19414d, this.f19415e);
    }

    @NotNull
    public final androidx.compose.foundation.text.g4 r() {
        return this.f19414d;
    }

    @NotNull
    public final x3 s() {
        return this.f19413c;
    }

    @NotNull
    public final androidx.compose.foundation.text.selection.u3 t() {
        return this.f19415e;
    }

    @NotNull
    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f19413c + ", legacyTextFieldState=" + this.f19414d + ", textFieldSelectionManager=" + this.f19415e + ')';
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull t3 t3Var) {
        t3Var.x9(this.f19413c);
        t3Var.w9(this.f19414d);
        t3Var.y9(this.f19415e);
    }
}
