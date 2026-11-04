package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.j0;
import androidx.compose.ui.platform.t2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends e1<PainterNode> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f37225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f37226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.l f37227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f37228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final r0 f37229g;

    @NotNull
    private final androidx.compose.ui.graphics.painter.b painter;

    public PainterElement(@NotNull androidx.compose.ui.graphics.painter.b bVar, boolean z10, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var) {
        this.painter = bVar;
        this.f37225c = z10;
        this.f37226d = eVar;
        this.f37227e = lVar;
        this.f37228f = f10;
        this.f37229g = r0Var;
    }

    public static /* synthetic */ PainterElement s(PainterElement painterElement, androidx.compose.ui.graphics.painter.b bVar, boolean z10, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = painterElement.painter;
        }
        if ((i10 & 2) != 0) {
            z10 = painterElement.f37225c;
        }
        if ((i10 & 4) != 0) {
            eVar = painterElement.f37226d;
        }
        if ((i10 & 8) != 0) {
            lVar = painterElement.f37227e;
        }
        if ((i10 & 16) != 0) {
            f10 = painterElement.f37228f;
        }
        if ((i10 & 32) != 0) {
            r0Var = painterElement.f37229g;
        }
        float f11 = f10;
        r0 r0Var2 = r0Var;
        return painterElement.r(bVar, z10, eVar, lVar, f11, r0Var2);
    }

    public final boolean A() {
        return this.f37225c;
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull PainterNode painterNode) {
        boolean zZ9 = painterNode.z9();
        boolean z10 = this.f37225c;
        boolean z11 = zZ9 != z10 || (z10 && !n0.n.k(painterNode.y9().l(), this.painter.l()));
        painterNode.G9(this.painter);
        painterNode.H9(this.f37225c);
        painterNode.E9(this.f37226d);
        painterNode.F9(this.f37227e);
        painterNode.setAlpha(this.f37228f);
        painterNode.f(this.f37229g);
        if (z11) {
            j0.b(painterNode);
        }
        androidx.compose.ui.node.u.a(painterNode);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.areEqual(this.painter, painterElement.painter) && this.f37225c == painterElement.f37225c && Intrinsics.areEqual(this.f37226d, painterElement.f37226d) && Intrinsics.areEqual(this.f37227e, painterElement.f37227e) && Float.compare(this.f37228f, painterElement.f37228f) == 0 && Intrinsics.areEqual(this.f37229g, painterElement.f37229g);
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.f37225c)) * 31) + this.f37226d.hashCode()) * 31) + this.f37227e.hashCode()) * 31) + Float.hashCode(this.f37228f)) * 31;
        r0 r0Var = this.f37229g;
        return iHashCode + (r0Var == null ? 0 : r0Var.hashCode());
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d("paint");
        t2Var.b().c("painter", this.painter);
        t2Var.b().c("sizeToIntrinsics", Boolean.valueOf(this.f37225c));
        t2Var.b().c("alignment", this.f37226d);
        t2Var.b().c("contentScale", this.f37227e);
        t2Var.b().c("alpha", Float.valueOf(this.f37228f));
        t2Var.b().c("colorFilter", this.f37229g);
    }

    @NotNull
    public final androidx.compose.ui.graphics.painter.b l() {
        return this.painter;
    }

    public final boolean m() {
        return this.f37225c;
    }

    @NotNull
    public final androidx.compose.ui.e n() {
        return this.f37226d;
    }

    @NotNull
    public final androidx.compose.ui.layout.l o() {
        return this.f37227e;
    }

    public final float p() {
        return this.f37228f;
    }

    @Nullable
    public final r0 q() {
        return this.f37229g;
    }

    @NotNull
    public final PainterElement r(@NotNull androidx.compose.ui.graphics.painter.b bVar, boolean z10, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var) {
        return new PainterElement(bVar, z10, eVar, lVar, f10, r0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public PainterNode a() {
        return new PainterNode(this.painter, this.f37225c, this.f37226d, this.f37227e, this.f37228f, this.f37229g);
    }

    @NotNull
    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.f37225c + ", alignment=" + this.f37226d + ", contentScale=" + this.f37227e + ", alpha=" + this.f37228f + ", colorFilter=" + this.f37229g + ')';
    }

    @NotNull
    public final androidx.compose.ui.e u() {
        return this.f37226d;
    }

    public final float v() {
        return this.f37228f;
    }

    @Nullable
    public final r0 w() {
        return this.f37229g;
    }

    @NotNull
    public final androidx.compose.ui.layout.l y() {
        return this.f37227e;
    }

    @NotNull
    public final androidx.compose.ui.graphics.painter.b z() {
        return this.painter;
    }
}
