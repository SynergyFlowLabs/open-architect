package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class TextFieldCoreModifier extends androidx.compose.ui.node.e1<v4> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19416n = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final q6 f19419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w6 f19420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.internal.selection.d0 f19421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.i0 f19422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f19423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.b5 f19424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.q3 f19425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.contextmenu.modifier.o f19426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.text.selection.x f19427m;

    public TextFieldCoreModifier(boolean z10, boolean z11, @NotNull q6 q6Var, @NotNull w6 w6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, boolean z12, @NotNull androidx.compose.foundation.b5 b5Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull androidx.compose.foundation.text.contextmenu.modifier.o oVar, @Nullable androidx.compose.foundation.text.selection.x xVar) {
        this.f19417c = z10;
        this.f19418d = z11;
        this.f19419e = q6Var;
        this.f19420f = w6Var;
        this.f19421g = d0Var;
        this.f19422h = i0Var;
        this.f19423i = z12;
        this.f19424j = b5Var;
        this.f19425k = q3Var;
        this.f19426l = oVar;
        this.f19427m = xVar;
    }

    private final boolean l() {
        return this.f19417c;
    }

    private final androidx.compose.foundation.text.contextmenu.modifier.o m() {
        return this.f19426l;
    }

    private final androidx.compose.foundation.text.selection.x n() {
        return this.f19427m;
    }

    private final boolean o() {
        return this.f19418d;
    }

    private final q6 p() {
        return this.f19419e;
    }

    private final w6 q() {
        return this.f19420f;
    }

    private final androidx.compose.foundation.text.input.internal.selection.d0 r() {
        return this.f19421g;
    }

    private final androidx.compose.ui.graphics.i0 s() {
        return this.f19422h;
    }

    private final boolean t() {
        return this.f19423i;
    }

    private final androidx.compose.foundation.b5 u() {
        return this.f19424j;
    }

    private final androidx.compose.foundation.gestures.q3 v() {
        return this.f19425k;
    }

    public static /* synthetic */ TextFieldCoreModifier y(TextFieldCoreModifier textFieldCoreModifier, boolean z10, boolean z11, q6 q6Var, w6 w6Var, androidx.compose.foundation.text.input.internal.selection.d0 d0Var, androidx.compose.ui.graphics.i0 i0Var, boolean z12, androidx.compose.foundation.b5 b5Var, androidx.compose.foundation.gestures.q3 q3Var, androidx.compose.foundation.text.contextmenu.modifier.o oVar, androidx.compose.foundation.text.selection.x xVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = textFieldCoreModifier.f19417c;
        }
        if ((i10 & 2) != 0) {
            z11 = textFieldCoreModifier.f19418d;
        }
        if ((i10 & 4) != 0) {
            q6Var = textFieldCoreModifier.f19419e;
        }
        if ((i10 & 8) != 0) {
            w6Var = textFieldCoreModifier.f19420f;
        }
        if ((i10 & 16) != 0) {
            d0Var = textFieldCoreModifier.f19421g;
        }
        if ((i10 & 32) != 0) {
            i0Var = textFieldCoreModifier.f19422h;
        }
        if ((i10 & 64) != 0) {
            z12 = textFieldCoreModifier.f19423i;
        }
        if ((i10 & 128) != 0) {
            b5Var = textFieldCoreModifier.f19424j;
        }
        if ((i10 & 256) != 0) {
            q3Var = textFieldCoreModifier.f19425k;
        }
        if ((i10 & 512) != 0) {
            oVar = textFieldCoreModifier.f19426l;
        }
        if ((i10 & 1024) != 0) {
            xVar = textFieldCoreModifier.f19427m;
        }
        androidx.compose.foundation.text.contextmenu.modifier.o oVar2 = oVar;
        androidx.compose.foundation.text.selection.x xVar2 = xVar;
        androidx.compose.foundation.b5 b5Var2 = b5Var;
        androidx.compose.foundation.gestures.q3 q3Var2 = q3Var;
        androidx.compose.ui.graphics.i0 i0Var2 = i0Var;
        boolean z13 = z12;
        androidx.compose.foundation.text.input.internal.selection.d0 d0Var2 = d0Var;
        q6 q6Var2 = q6Var;
        return textFieldCoreModifier.w(z10, z11, q6Var2, w6Var, d0Var2, i0Var2, z13, b5Var2, q3Var2, oVar2, xVar2);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull v4 v4Var) {
        v4Var.ba(this.f19417c, this.f19418d, this.f19419e, this.f19420f, this.f19421g, this.f19422h, this.f19423i, this.f19424j, this.f19425k, this.f19426l, this.f19427m);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.f19417c == textFieldCoreModifier.f19417c && this.f19418d == textFieldCoreModifier.f19418d && Intrinsics.areEqual(this.f19419e, textFieldCoreModifier.f19419e) && Intrinsics.areEqual(this.f19420f, textFieldCoreModifier.f19420f) && Intrinsics.areEqual(this.f19421g, textFieldCoreModifier.f19421g) && Intrinsics.areEqual(this.f19422h, textFieldCoreModifier.f19422h) && this.f19423i == textFieldCoreModifier.f19423i && Intrinsics.areEqual(this.f19424j, textFieldCoreModifier.f19424j) && this.f19425k == textFieldCoreModifier.f19425k && Intrinsics.areEqual(this.f19426l, textFieldCoreModifier.f19426l) && Intrinsics.areEqual(this.f19427m, textFieldCoreModifier.f19427m);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((((((((((((((((Boolean.hashCode(this.f19417c) * 31) + Boolean.hashCode(this.f19418d)) * 31) + this.f19419e.hashCode()) * 31) + this.f19420f.hashCode()) * 31) + this.f19421g.hashCode()) * 31) + this.f19422h.hashCode()) * 31) + Boolean.hashCode(this.f19423i)) * 31) + this.f19424j.hashCode()) * 31) + this.f19425k.hashCode()) * 31) + this.f19426l.hashCode()) * 31;
        androidx.compose.foundation.text.selection.x xVar = this.f19427m;
        return iHashCode + (xVar == null ? 0 : xVar.hashCode());
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @NotNull
    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f19417c + ", isDragHovered=" + this.f19418d + ", textLayoutState=" + this.f19419e + ", textFieldState=" + this.f19420f + ", textFieldSelectionState=" + this.f19421g + ", cursorBrush=" + this.f19422h + ", writeable=" + this.f19423i + ", scrollState=" + this.f19424j + ", orientation=" + this.f19425k + ", toolbarRequester=" + this.f19426l + ", platformSelectionBehaviors=" + this.f19427m + ')';
    }

    @NotNull
    public final TextFieldCoreModifier w(boolean z10, boolean z11, @NotNull q6 q6Var, @NotNull w6 w6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull androidx.compose.ui.graphics.i0 i0Var, boolean z12, @NotNull androidx.compose.foundation.b5 b5Var, @NotNull androidx.compose.foundation.gestures.q3 q3Var, @NotNull androidx.compose.foundation.text.contextmenu.modifier.o oVar, @Nullable androidx.compose.foundation.text.selection.x xVar) {
        return new TextFieldCoreModifier(z10, z11, q6Var, w6Var, d0Var, i0Var, z12, b5Var, q3Var, oVar, xVar);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public v4 a() {
        return new v4(this.f19417c, this.f19418d, this.f19419e, this.f19420f, this.f19421g, this.f19422h, this.f19423i, this.f19424j, this.f19425k, this.f19426l, this.f19427m);
    }
}
