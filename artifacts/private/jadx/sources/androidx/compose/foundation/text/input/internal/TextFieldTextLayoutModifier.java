package androidx.compose.foundation.text.input.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class TextFieldTextLayoutModifier extends androidx.compose.ui.node.e1<n6> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f19441i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q6 f19442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final w6 f19443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.y3 f19444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Function2<androidx.compose.ui.unit.d, Function0<androidx.compose.ui.text.p3>, Unit> f19446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.b4 f19447h;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldTextLayoutModifier(@NotNull q6 q6Var, @NotNull w6 w6Var, @NotNull androidx.compose.ui.text.y3 y3Var, boolean z10, @Nullable Function2<? super androidx.compose.ui.unit.d, ? super Function0<androidx.compose.ui.text.p3>, Unit> function2, @NotNull androidx.compose.foundation.text.b4 b4Var) {
        this.f19442c = q6Var;
        this.f19443d = w6Var;
        this.f19444e = y3Var;
        this.f19445f = z10;
        this.f19446g = function2;
        this.f19447h = b4Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return this.f19445f == textFieldTextLayoutModifier.f19445f && Intrinsics.areEqual(this.f19442c, textFieldTextLayoutModifier.f19442c) && Intrinsics.areEqual(this.f19443d, textFieldTextLayoutModifier.f19443d) && Intrinsics.areEqual(this.f19444e, textFieldTextLayoutModifier.f19444e) && this.f19446g == textFieldTextLayoutModifier.f19446g && Intrinsics.areEqual(this.f19447h, textFieldTextLayoutModifier.f19447h);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.f19445f) * 31) + this.f19442c.hashCode()) * 31) + this.f19443d.hashCode()) * 31) + this.f19444e.hashCode()) * 31;
        Function2<androidx.compose.ui.unit.d, Function0<androidx.compose.ui.text.p3>, Unit> function2 = this.f19446g;
        return ((iHashCode + (function2 != null ? function2.hashCode() : 0)) * 31) + this.f19447h.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n6 a() {
        return new n6(this.f19442c, this.f19443d, this.f19444e, this.f19445f, this.f19446g, this.f19447h);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull n6 n6Var) {
        n6Var.J9(this.f19442c, this.f19443d, this.f19444e, this.f19445f, this.f19446g, this.f19447h);
    }
}
