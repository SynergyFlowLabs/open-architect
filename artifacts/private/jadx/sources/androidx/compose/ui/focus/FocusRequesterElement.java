package androidx.compose.ui.focus;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,79:1\n648#2,2:80\n643#2,2:82\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n56#1:80,2\n58#1:82,2\n*E\n"})
final class FocusRequesterElement extends e1<m0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g0 f37358c;

    public FocusRequesterElement(@NotNull g0 g0Var) {
        this.f37358c = g0Var;
    }

    public static /* synthetic */ FocusRequesterElement n(FocusRequesterElement focusRequesterElement, g0 g0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g0Var = focusRequesterElement.f37358c;
        }
        return focusRequesterElement.m(g0Var);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && Intrinsics.areEqual(this.f37358c, ((FocusRequesterElement) obj).f37358c);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return this.f37358c.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("focusRequester");
        t2Var.b().c("focusRequester", this.f37358c);
    }

    @NotNull
    public final g0 l() {
        return this.f37358c;
    }

    @NotNull
    public final FocusRequesterElement m(@NotNull g0 g0Var) {
        return new FocusRequesterElement(g0Var);
    }

    @NotNull
    public final g0 n1() {
        return this.f37358c;
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m0 a() {
        return new m0(this.f37358c);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull m0 m0Var) {
        m0Var.n1().h().n0(m0Var);
        m0Var.v9(this.f37358c);
        m0Var.n1().h().d(m0Var);
    }

    @NotNull
    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f37358c + ')';
    }
}
