package androidx.compose.foundation.text.input.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class TextFieldDecoratorModifier extends androidx.compose.ui.node.e1<z5> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f19428o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w6 f19429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q6 f19430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.internal.selection.d0 f19431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.text.input.c f19432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f19434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.b4 f19435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.text.input.f f19436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f19437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.interaction.j f19438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f19439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final kotlinx.coroutines.flow.j0<Unit> f19440n;

    public TextFieldDecoratorModifier(@NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @Nullable androidx.compose.foundation.text.input.c cVar, boolean z10, boolean z11, @NotNull androidx.compose.foundation.text.b4 b4Var, @Nullable androidx.compose.foundation.text.input.f fVar, boolean z12, @NotNull androidx.compose.foundation.interaction.j jVar, boolean z13, @Nullable kotlinx.coroutines.flow.j0<Unit> j0Var) {
        this.f19429c = w6Var;
        this.f19430d = q6Var;
        this.f19431e = d0Var;
        this.f19432f = cVar;
        this.f19433g = z10;
        this.f19434h = z11;
        this.f19435i = b4Var;
        this.f19436j = fVar;
        this.f19437k = z12;
        this.f19438l = jVar;
        this.f19439m = z13;
        this.f19440n = j0Var;
    }

    private final w6 l() {
        return this.f19429c;
    }

    private final androidx.compose.foundation.interaction.j m() {
        return this.f19438l;
    }

    private final boolean n() {
        return this.f19439m;
    }

    private final kotlinx.coroutines.flow.j0<Unit> o() {
        return this.f19440n;
    }

    private final q6 p() {
        return this.f19430d;
    }

    private final androidx.compose.foundation.text.input.internal.selection.d0 q() {
        return this.f19431e;
    }

    private final androidx.compose.foundation.text.input.c r() {
        return this.f19432f;
    }

    private final boolean s() {
        return this.f19433g;
    }

    private final boolean t() {
        return this.f19434h;
    }

    private final androidx.compose.foundation.text.b4 u() {
        return this.f19435i;
    }

    private final androidx.compose.foundation.text.input.f v() {
        return this.f19436j;
    }

    private final boolean w() {
        return this.f19437k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextFieldDecoratorModifier z(TextFieldDecoratorModifier textFieldDecoratorModifier, w6 w6Var, q6 q6Var, androidx.compose.foundation.text.input.internal.selection.d0 d0Var, androidx.compose.foundation.text.input.c cVar, boolean z10, boolean z11, androidx.compose.foundation.text.b4 b4Var, androidx.compose.foundation.text.input.f fVar, boolean z12, androidx.compose.foundation.interaction.j jVar, boolean z13, kotlinx.coroutines.flow.j0 j0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w6Var = textFieldDecoratorModifier.f19429c;
        }
        if ((i10 & 2) != 0) {
            q6Var = textFieldDecoratorModifier.f19430d;
        }
        if ((i10 & 4) != 0) {
            d0Var = textFieldDecoratorModifier.f19431e;
        }
        if ((i10 & 8) != 0) {
            cVar = textFieldDecoratorModifier.f19432f;
        }
        if ((i10 & 16) != 0) {
            z10 = textFieldDecoratorModifier.f19433g;
        }
        if ((i10 & 32) != 0) {
            z11 = textFieldDecoratorModifier.f19434h;
        }
        if ((i10 & 64) != 0) {
            b4Var = textFieldDecoratorModifier.f19435i;
        }
        if ((i10 & 128) != 0) {
            fVar = textFieldDecoratorModifier.f19436j;
        }
        if ((i10 & 256) != 0) {
            z12 = textFieldDecoratorModifier.f19437k;
        }
        if ((i10 & 512) != 0) {
            jVar = textFieldDecoratorModifier.f19438l;
        }
        if ((i10 & 1024) != 0) {
            z13 = textFieldDecoratorModifier.f19439m;
        }
        if ((i10 & 2048) != 0) {
            j0Var = textFieldDecoratorModifier.f19440n;
        }
        boolean z14 = z13;
        kotlinx.coroutines.flow.j0 j0Var2 = j0Var;
        boolean z15 = z12;
        androidx.compose.foundation.interaction.j jVar2 = jVar;
        androidx.compose.foundation.text.b4 b4Var2 = b4Var;
        androidx.compose.foundation.text.input.f fVar2 = fVar;
        boolean z16 = z10;
        boolean z17 = z11;
        return textFieldDecoratorModifier.y(w6Var, q6Var, d0Var, cVar, z16, z17, b4Var2, fVar2, z15, jVar2, z14, j0Var2);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public z5 a() {
        return new z5(this.f19429c, this.f19430d, this.f19431e, this.f19432f, this.f19433g, this.f19434h, this.f19435i, this.f19436j, this.f19437k, this.f19438l, this.f19439m, this.f19440n);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull z5 z5Var) {
        z5Var.yb(this.f19429c, this.f19430d, this.f19431e, this.f19432f, this.f19433g, this.f19434h, this.f19435i, this.f19436j, this.f19437k, this.f19438l, this.f19439m, this.f19440n);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return Intrinsics.areEqual(this.f19429c, textFieldDecoratorModifier.f19429c) && Intrinsics.areEqual(this.f19430d, textFieldDecoratorModifier.f19430d) && Intrinsics.areEqual(this.f19431e, textFieldDecoratorModifier.f19431e) && Intrinsics.areEqual(this.f19432f, textFieldDecoratorModifier.f19432f) && this.f19433g == textFieldDecoratorModifier.f19433g && this.f19434h == textFieldDecoratorModifier.f19434h && Intrinsics.areEqual(this.f19435i, textFieldDecoratorModifier.f19435i) && Intrinsics.areEqual(this.f19436j, textFieldDecoratorModifier.f19436j) && this.f19437k == textFieldDecoratorModifier.f19437k && Intrinsics.areEqual(this.f19438l, textFieldDecoratorModifier.f19438l) && this.f19439m == textFieldDecoratorModifier.f19439m && Intrinsics.areEqual(this.f19440n, textFieldDecoratorModifier.f19440n);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((this.f19429c.hashCode() * 31) + this.f19430d.hashCode()) * 31) + this.f19431e.hashCode()) * 31;
        androidx.compose.foundation.text.input.c cVar = this.f19432f;
        int iHashCode2 = 0;
        int iHashCode3 = (((((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.f19433g)) * 31) + Boolean.hashCode(this.f19434h)) * 31) + this.f19435i.hashCode()) * 31;
        androidx.compose.foundation.text.input.f fVar = this.f19436j;
        int iHashCode4 = (((((((iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31) + Boolean.hashCode(this.f19437k)) * 31) + this.f19438l.hashCode()) * 31) + Boolean.hashCode(this.f19439m)) * 31;
        kotlinx.coroutines.flow.j0<Unit> j0Var = this.f19440n;
        if (j0Var != null) {
            iHashCode2 = j0Var.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @NotNull
    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f19429c + ", textLayoutState=" + this.f19430d + ", textFieldSelectionState=" + this.f19431e + ", filter=" + this.f19432f + ", enabled=" + this.f19433g + ", readOnly=" + this.f19434h + ", keyboardOptions=" + this.f19435i + ", keyboardActionHandler=" + this.f19436j + ", singleLine=" + this.f19437k + ", interactionSource=" + this.f19438l + ", isPassword=" + this.f19439m + ", stylusHandwritingTrigger=" + this.f19440n + ')';
    }

    @NotNull
    public final TextFieldDecoratorModifier y(@NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @Nullable androidx.compose.foundation.text.input.c cVar, boolean z10, boolean z11, @NotNull androidx.compose.foundation.text.b4 b4Var, @Nullable androidx.compose.foundation.text.input.f fVar, boolean z12, @NotNull androidx.compose.foundation.interaction.j jVar, boolean z13, @Nullable kotlinx.coroutines.flow.j0<Unit> j0Var) {
        return new TextFieldDecoratorModifier(w6Var, q6Var, d0Var, cVar, z10, z11, b4Var, fVar, z12, jVar, z13, j0Var);
    }
}
