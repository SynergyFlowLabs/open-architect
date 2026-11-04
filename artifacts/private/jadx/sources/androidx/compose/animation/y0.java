package androidx.compose.animation;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.g4;
import androidx.compose.runtime.k3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.n3;
import androidx.compose.ui.graphics.k2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,418:1\n81#2:419\n114#2,2:420\n85#3:422\n117#3,2:423\n85#3:425\n117#3,2:426\n85#3:428\n117#3,2:429\n85#3:431\n117#3,2:432\n85#3:434\n117#3,2:435\n85#3:437\n117#3,2:438\n85#3:440\n117#3,2:441\n85#3:483\n117#3,2:484\n71#4:443\n65#4:444\n73#4:447\n69#4:448\n60#5:445\n70#5:449\n22#6:446\n1#7:450\n221#8,5:451\n249#8,9:456\n120#8,7:465\n259#8,4:472\n120#8,7:476\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElementInternalState\n*L\n292#1:419\n292#1:420,2\n294#1:422\n294#1:423,2\n295#1:425\n295#1:426,2\n296#1:428\n296#1:429,2\n297#1:431\n297#1:432,2\n298#1:434\n298#1:435,2\n299#1:437\n299#1:438,2\n300#1:440\n300#1:441,2\n328#1:483\n328#1:484,2\n312#1:443\n312#1:444\n312#1:447\n312#1:448\n312#1:445\n312#1:449\n312#1:446\n313#1:451,5\n313#1:456,9\n313#1:465,7\n313#1:472,4\n314#1:476,7\n*E\n"})
public final class y0 implements n0, m5 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f13822m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k3 f13823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n3 f13824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n3 f13825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final n3 f13826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n3 f13827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final n3 f13828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n3 f13829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n3 f13830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private k2 f13831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private y0 f13832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private r f13833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final n3 f13834l = d7.g(null, null, 2, null);

    public y0(@NotNull x0 x0Var, @NotNull o oVar, @NotNull a1.b bVar, boolean z10, @NotNull a1.a aVar, boolean z11, @NotNull a1.d dVar, float f10) {
        this.f13823a = g4.b(f10);
        this.f13824b = d7.g(Boolean.valueOf(z11), null, 2, null);
        this.f13825c = d7.g(x0Var, null, 2, null);
        this.f13826d = d7.g(oVar, null, 2, null);
        this.f13827e = d7.g(bVar, null, 2, null);
        this.f13828f = d7.g(Boolean.valueOf(z10), null, 2, null);
        this.f13829g = d7.g(aVar, null, 2, null);
        this.f13830h = d7.g(dVar, null, 2, null);
    }

    private final boolean p() {
        if (!Intrinsics.areEqual(o().i(), this.f13833k) && n()) {
            return false;
        }
        return true;
    }

    public final void A(@NotNull a1.b bVar) {
        this.f13827e.setValue(bVar);
    }

    public final void B(boolean z10) {
        this.f13824b.setValue(Boolean.valueOf(z10));
    }

    public final void C(boolean z10) {
        this.f13828f.setValue(Boolean.valueOf(z10));
    }

    public final void D(@NotNull x0 x0Var) {
        this.f13825c.setValue(x0Var);
    }

    public final void E(@NotNull a1.d dVar) {
        this.f13830h.setValue(dVar);
    }

    public void F(float f10) {
        this.f13823a.q(f10);
    }

    @Override // androidx.compose.animation.n0
    @Nullable
    public y0 a() {
        return this.f13832j;
    }

    @Override // androidx.compose.animation.n0
    public float b() {
        return this.f13823a.V0();
    }

    @Override // androidx.compose.animation.n0
    public void c(@NotNull androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.layer.c cVarG = g();
        if (cVarG == null || !q() || o().c() == null) {
            return;
        }
        n0.j jVarC = o().c();
        n0.g gVarD = jVarC != null ? n0.g.d(jVarC.E()) : null;
        Intrinsics.checkNotNull(gVarD);
        long jB = gVarD.B();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & com.rabbitmq.client.k0.f265952a));
        k2 k2Var = this.f13831i;
        if (k2Var == null) {
            fVar.Z3().i().c(fIntBitsToFloat, fIntBitsToFloat2);
            try {
                androidx.compose.ui.graphics.layer.e.a(fVar, cVarG);
                fVar.Z3().i().c(-fIntBitsToFloat, -fIntBitsToFloat2);
                return;
            } catch (Throwable th2) {
                fVar.Z3().i().c(-fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        int iB = androidx.compose.ui.graphics.p0.f38096b.b();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().e(k2Var, iB);
            fVar.Z3().i().c(fIntBitsToFloat, fIntBitsToFloat2);
            try {
                androidx.compose.ui.graphics.layer.e.a(fVar, cVarG);
                fVar.Z3().i().c(-fIntBitsToFloat, -fIntBitsToFloat2);
                dVarZ3.f().B();
                dVarZ3.g(jD);
            } catch (Throwable th3) {
                fVar.Z3().i().c(-fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        } catch (Throwable th4) {
            dVarZ3.f().B();
            dVarZ3.g(jD);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o d() {
        return (o) this.f13826d.getValue();
    }

    @Nullable
    public final r e() {
        return this.f13833k;
    }

    @Nullable
    public final k2 f() {
        return this.f13831i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final androidx.compose.ui.graphics.layer.c g() {
        return (androidx.compose.ui.graphics.layer.c) this.f13834l.getValue();
    }

    @NotNull
    public final a1.a h() {
        return (a1.a) this.f13829g.getValue();
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        o().g().t(this);
        o().n();
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
        o().g().u(this);
        o().n();
    }

    @NotNull
    public final a1.b l() {
        return (a1.b) this.f13827e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m() {
        return ((Boolean) this.f13824b.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n() {
        return ((Boolean) this.f13828f.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final x0 o() {
        return (x0) this.f13825c.getValue();
    }

    public final boolean q() {
        return p() && o().d() && m() && o().g().I();
    }

    public final boolean r() {
        if (o().d() && (q() || !p())) {
            return false;
        }
        return true;
    }

    public final boolean s() {
        return d().f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final a1.d t() {
        return (a1.d) this.f13830h.getValue();
    }

    public final void u(@NotNull o oVar) {
        this.f13826d.setValue(oVar);
    }

    public final void v(@Nullable r rVar) {
        this.f13833k = rVar;
    }

    public final void w(@Nullable k2 k2Var) {
        this.f13831i = k2Var;
    }

    public final void x(@Nullable androidx.compose.ui.graphics.layer.c cVar) {
        this.f13834l.setValue(cVar);
    }

    public final void y(@NotNull a1.a aVar) {
        this.f13829g.setValue(aVar);
    }

    public void z(@Nullable y0 y0Var) {
        this.f13832j = y0Var;
    }
}
