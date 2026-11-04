package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.unit.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.r;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerShadowPainter extends androidx.compose.ui.graphics.painter.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final q3 f38186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final j f38187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final h f38188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f38189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private w f38190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private r0 f38191l;

    public /* synthetic */ InnerShadowPainter(q3 q3Var, j jVar, h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q3Var, jVar, (i10 & 4) != 0 ? h.f38213b.a() : hVar);
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        this.f38189j = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        this.f38191l = r0Var;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean c(@NotNull w wVar) {
        this.f38190k = wVar;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return n.f332724b.a();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        this.f38188i.b(this.f38186g, fVar.d(), fVar.getLayoutDirection(), fVar, this.f38187h).b(fVar, this.f38191l, fVar.d(), this.f38187h.e(), this.f38187h.d(), r.H(this.f38189j * this.f38187h.b(), 0.0f, 1.0f), this.f38187h.c());
    }

    public InnerShadowPainter(@NotNull q3 q3Var, @NotNull j jVar, @NotNull h hVar) {
        this.f38186g = q3Var;
        this.f38187h = jVar;
        this.f38188i = hVar;
        this.f38189j = 1.0f;
        this.f38190k = w.Ltr;
    }

    public InnerShadowPainter(@NotNull q3 q3Var, @NotNull j jVar) {
        this(q3Var, jVar, h.f38213b.a());
    }
}
