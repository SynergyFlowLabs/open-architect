package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.q3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends androidx.compose.ui.node.e1<t> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u f17230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final q f17231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final q3 f17233f;

    public LazyLayoutBeyondBoundsModifierElement(@NotNull u uVar, @NotNull q qVar, boolean z10, @NotNull q3 q3Var) {
        this.f17230c = uVar;
        this.f17231d = qVar;
        this.f17232e = z10;
        this.f17233f = q3Var;
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return Intrinsics.areEqual(this.f17230c, lazyLayoutBeyondBoundsModifierElement.f17230c) && Intrinsics.areEqual(this.f17231d, lazyLayoutBeyondBoundsModifierElement.f17231d) && this.f17232e == lazyLayoutBeyondBoundsModifierElement.f17232e && this.f17233f == lazyLayoutBeyondBoundsModifierElement.f17233f;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (((((this.f17230c.hashCode() * 31) + this.f17231d.hashCode()) * 31) + Boolean.hashCode(this.f17232e)) * 31) + this.f17233f.hashCode();
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull androidx.compose.ui.platform.t2 t2Var) {
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public t a() {
        return new t(this.f17230c, this.f17231d, this.f17232e, this.f17233f);
    }

    @NotNull
    public final q m() {
        return this.f17231d;
    }

    @NotNull
    public final q3 n() {
        return this.f17233f;
    }

    public final boolean o() {
        return this.f17232e;
    }

    @NotNull
    public final u p() {
        return this.f17230c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull t tVar) {
        tVar.C9(this.f17230c, this.f17231d, this.f17232e, this.f17233f);
    }
}
