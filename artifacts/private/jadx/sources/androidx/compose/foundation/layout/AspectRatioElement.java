package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,240:1\n93#2,4:241\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n*L\n79#1:241,4\n*E\n"})
final class AspectRatioElement extends androidx.compose.ui.node.e1<t> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f15778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f15779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<androidx.compose.ui.platform.t2, Unit> f15780e;

    /* JADX WARN: Multi-variable type inference failed */
    public AspectRatioElement(float f10, boolean z10, @NotNull Function1<? super androidx.compose.ui.platform.t2, Unit> function1) {
        this.f15778c = f10;
        this.f15779d = z10;
        this.f15780e = function1;
        if (f10 > 0.0f) {
            return;
        }
        x.a.f("aspectRatio " + f10 + " must be > 0");
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        return aspectRatioElement != null && this.f15778c == aspectRatioElement.f15778c && this.f15779d == ((AspectRatioElement) obj).f15779d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (Float.hashCode(this.f15778c) * 31) + Boolean.hashCode(this.f15779d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
        this.f15780e.invoke(t2Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t a() {
        return new t(this.f15778c, this.f15779d);
    }

    public final float m() {
        return this.f15778c;
    }

    @NotNull
    public final Function1<androidx.compose.ui.platform.t2, Unit> n() {
        return this.f15780e;
    }

    public final boolean o() {
        return this.f15779d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull t tVar) {
        tVar.A9(this.f15778c);
        tVar.B9(this.f15779d);
    }
}
