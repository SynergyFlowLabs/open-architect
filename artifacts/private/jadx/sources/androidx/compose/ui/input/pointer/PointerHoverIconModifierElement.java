package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.e1;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class PointerHoverIconModifierElement extends e1<w> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38957e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final x f38958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38959d;

    public /* synthetic */ PointerHoverIconModifierElement(x xVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar, (i10 & 2) != 0 ? false : z10);
    }

    public static /* synthetic */ PointerHoverIconModifierElement o(PointerHoverIconModifierElement pointerHoverIconModifierElement, x xVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            xVar = pointerHoverIconModifierElement.f38958c;
        }
        if ((i10 & 2) != 0) {
            z10 = pointerHoverIconModifierElement.f38959d;
        }
        return pointerHoverIconModifierElement.n(xVar, z10);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return Intrinsics.areEqual(this.f38958c, pointerHoverIconModifierElement.f38958c) && this.f38959d == pointerHoverIconModifierElement.f38959d;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        return (this.f38958c.hashCode() * 31) + Boolean.hashCode(this.f38959d);
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("pointerHoverIcon");
        t2Var.b().c("icon", this.f38958c);
        t2Var.b().c("overrideDescendants", Boolean.valueOf(this.f38959d));
    }

    @NotNull
    public final x l() {
        return this.f38958c;
    }

    public final boolean m() {
        return this.f38959d;
    }

    @NotNull
    public final PointerHoverIconModifierElement n(@NotNull x xVar, boolean z10) {
        return new PointerHoverIconModifierElement(xVar, z10);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public w a() {
        return new w(this.f38958c, this.f38959d);
    }

    @NotNull
    public final x q() {
        return this.f38958c;
    }

    public final boolean r() {
        return this.f38959d;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull w wVar) {
        wVar.L9(this.f38958c);
        wVar.M9(this.f38959d);
    }

    @NotNull
    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f38958c + ", overrideDescendants=" + this.f38959d + ')';
    }

    public PointerHoverIconModifierElement(@NotNull x xVar, boolean z10) {
        this.f38958c = xVar;
        this.f38959d = z10;
    }
}
