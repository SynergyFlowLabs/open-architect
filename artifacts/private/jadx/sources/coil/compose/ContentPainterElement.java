package coil.compose;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.node.e1;
import androidx.compose.ui.node.j0;
import androidx.compose.ui.platform.t2;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@w0(parameters = 1)
public final class ContentPainterElement extends e1<ContentPainterNode> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86981g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f86982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.l f86983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f86984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final r0 f86985f;

    @NotNull
    private final androidx.compose.ui.graphics.painter.b painter;

    public ContentPainterElement(@NotNull androidx.compose.ui.graphics.painter.b bVar, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var) {
        this.painter = bVar;
        this.f86982c = eVar;
        this.f86983d = lVar;
        this.f86984e = f10;
        this.f86985f = r0Var;
    }

    private final androidx.compose.ui.graphics.painter.b l() {
        return this.painter;
    }

    private final androidx.compose.ui.e m() {
        return this.f86982c;
    }

    private final androidx.compose.ui.layout.l n() {
        return this.f86983d;
    }

    private final float o() {
        return this.f86984e;
    }

    private final r0 p() {
        return this.f86985f;
    }

    public static /* synthetic */ ContentPainterElement r(ContentPainterElement contentPainterElement, androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = contentPainterElement.painter;
        }
        if ((i10 & 2) != 0) {
            eVar = contentPainterElement.f86982c;
        }
        if ((i10 & 4) != 0) {
            lVar = contentPainterElement.f86983d;
        }
        if ((i10 & 8) != 0) {
            f10 = contentPainterElement.f86984e;
        }
        if ((i10 & 16) != 0) {
            r0Var = contentPainterElement.f86985f;
        }
        r0 r0Var2 = r0Var;
        androidx.compose.ui.layout.l lVar2 = lVar;
        return contentPainterElement.q(bVar, eVar, lVar2, f10, r0Var2);
    }

    @Override // androidx.compose.ui.node.e1
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        if (Intrinsics.areEqual(this.painter, contentPainterElement.painter) && Intrinsics.areEqual(this.f86982c, contentPainterElement.f86982c) && Intrinsics.areEqual(this.f86983d, contentPainterElement.f86983d) && Float.compare(this.f86984e, contentPainterElement.f86984e) == 0 && Intrinsics.areEqual(this.f86985f, contentPainterElement.f86985f)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.e1
    public int hashCode() {
        int iHashCode = ((((((this.painter.hashCode() * 31) + this.f86982c.hashCode()) * 31) + this.f86983d.hashCode()) * 31) + Float.hashCode(this.f86984e)) * 31;
        r0 r0Var = this.f86985f;
        return iHashCode + (r0Var == null ? 0 : r0Var.hashCode());
    }

    @Override // androidx.compose.ui.node.e1
    public void j(@NotNull t2 t2Var) {
        t2Var.d(FirebaseAnalytics.d.P);
        t2Var.b().c("painter", this.painter);
        t2Var.b().c("alignment", this.f86982c);
        t2Var.b().c("contentScale", this.f86983d);
        t2Var.b().c("alpha", Float.valueOf(this.f86984e));
        t2Var.b().c("colorFilter", this.f86985f);
    }

    @NotNull
    public final ContentPainterElement q(@NotNull androidx.compose.ui.graphics.painter.b bVar, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var) {
        return new ContentPainterElement(bVar, eVar, lVar, f10, r0Var);
    }

    @Override // androidx.compose.ui.node.e1
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public ContentPainterNode a() {
        return new ContentPainterNode(this.painter, this.f86982c, this.f86983d, this.f86984e, this.f86985f);
    }

    @Override // androidx.compose.ui.node.e1
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void k(@NotNull ContentPainterNode contentPainterNode) {
        boolean zK = n0.n.k(contentPainterNode.z9().l(), this.painter.l());
        contentPainterNode.E9(this.painter);
        contentPainterNode.C9(this.f86982c);
        contentPainterNode.D9(this.f86983d);
        contentPainterNode.setAlpha(this.f86984e);
        contentPainterNode.f(this.f86985f);
        if (!zK) {
            j0.b(contentPainterNode);
        }
        androidx.compose.ui.node.u.a(contentPainterNode);
    }

    @NotNull
    public String toString() {
        return "ContentPainterElement(painter=" + this.painter + ", alignment=" + this.f86982c + ", contentScale=" + this.f86983d + ", alpha=" + this.f86984e + ", colorFilter=" + this.f86985f + ')';
    }
}
