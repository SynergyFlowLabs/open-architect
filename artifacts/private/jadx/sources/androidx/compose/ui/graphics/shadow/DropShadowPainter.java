package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.unit.w;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDropShadowPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropShadowPainter.kt\nandroidx/compose/ui/graphics/shadow/DropShadowPainter\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,304:1\n120#2,7:305\n*S KotlinDebug\n*F\n+ 1 DropShadowPainter.kt\nandroidx/compose/ui/graphics/shadow/DropShadowPainter\n*L\n79#1:305,7\n*E\n"})
public final class DropShadowPainter extends androidx.compose.ui.graphics.painter.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final q3 f38180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final j f38181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final f f38182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f38183j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private w f38184k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private r0 f38185l;

    public DropShadowPainter(@NotNull q3 q3Var, @NotNull j jVar, @NotNull f fVar) {
        this.f38180g = q3Var;
        this.f38181h = jVar;
        this.f38182i = fVar;
        this.f38183j = 1.0f;
        this.f38184k = w.Ltr;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean a(float f10) {
        this.f38183j = f10;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean b(@Nullable r0 r0Var) {
        this.f38185l = r0Var;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected boolean c(@NotNull w wVar) {
        this.f38184k = wVar;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public long l() {
        return n.f332724b.a();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    protected void n(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        e eVarD = this.f38182i.d(this.f38180g, fVar.d(), fVar.getLayoutDirection(), fVar, this.f38181h);
        float fS7 = fVar.S7(androidx.compose.ui.unit.j.j(this.f38181h.f()));
        float fS8 = fVar.S7(androidx.compose.ui.unit.j.l(this.f38181h.f()));
        fVar.Z3().i().c(fS7, fS8);
        try {
            eVarD.b(fVar, this.f38185l, fVar.d(), eVarD.j().e(), eVarD.j().d(), r.H(this.f38183j * eVarD.j().b(), 0.0f, 1.0f), eVarD.j().c());
            fVar.Z3().i().c(-fS7, -fS8);
        } catch (Throwable th2) {
            fVar.Z3().i().c(-fS7, -fS8);
            throw th2;
        }
    }

    public DropShadowPainter(@NotNull q3 q3Var, @NotNull j jVar) {
        this(q3Var, jVar, f.f38204a.a());
    }
}
