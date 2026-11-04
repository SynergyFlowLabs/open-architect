package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.g1;
import androidx.compose.ui.graphics.h2;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.m3;
import androidx.compose.ui.graphics.n3;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.u1;
import androidx.compose.ui.graphics.v1;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDropShadowPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropShadowPainter.kt\nandroidx/compose/ui/graphics/shadow/DropShadowRenderer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n1#1,304:1\n33#2:305\n33#2:313\n53#3,3:306\n53#3,3:314\n53#3,3:321\n60#3:325\n70#3:328\n60#3:331\n70#3:334\n60#3:337\n70#3:340\n1#4:309\n120#5,3:310\n124#5,3:317\n30#6:320\n57#7:324\n61#7:327\n57#7:330\n61#7:333\n22#8:326\n22#8:329\n22#8:332\n22#8:335\n22#8:338\n22#8:341\n48#9:336\n53#9:339\n*S KotlinDebug\n*F\n+ 1 DropShadowPainter.kt\nandroidx/compose/ui/graphics/shadow/DropShadowRenderer\n*L\n165#1:305\n200#1:313\n165#1:306,3\n200#1:314,3\n208#1:321,3\n224#1:325\n225#1:328\n274#1:331\n275#1:334\n289#1:337\n290#1:340\n197#1:310,3\n197#1:317,3\n208#1:320\n224#1:324\n225#1:327\n274#1:330\n275#1:333\n224#1:326\n225#1:329\n274#1:332\n275#1:335\n289#1:338\n290#1:341\n289#1:336\n290#1:339\n*E\n"})
public final class e extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final j f38200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final h2 f38201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private t1 f38202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private g1 f38203l;

    public e(@NotNull j jVar, @NotNull f2 f2Var) {
        super(f2Var);
        this.f38200i = jVar;
        this.f38201j = m.a();
    }

    private final t1 h(long j10, k2 k2Var, float f10, float f11) {
        float f12 = 2;
        float f13 = (f10 * f12) + (f12 * f11);
        t1 t1VarB = v1.b((int) Math.ceil(Float.intBitsToFloat((int) (j10 >> 32)) + f13), (int) Math.ceil(Float.intBitsToFloat((int) (j10 & k0.f265952a)) + f13), u1.f38249b.a(), false, null, 24, null);
        androidx.compose.ui.graphics.k0 k0VarA = m0.a(t1VarB);
        if (f11 <= 0.0f) {
            c.b(this.f38201j, 0L, 0, f10 > 0.0f ? d.a(f10) : null, 0, 11, null);
            k0VarA.c(f10, f10);
            k0VarA.M(k2Var, this.f38201j);
            return t1VarB;
        }
        float f14 = f10 + f11;
        k0VarA.c(f14, f14);
        k0VarA.M(k2Var, this.f38201j);
        h2 h2VarB = c.b(this.f38201j, 0L, 0, f10 > 0.0f ? d.a(f10) : null, j2.f37801b.b(), 3, null);
        h2VarB.H(2.0f * f11);
        Unit unit = Unit.f312394a;
        k0VarA.M(k2Var, h2VarB);
        return t1VarB;
    }

    private final t1 i(long j10, float f10, float f11, long j11) {
        float f12 = 2;
        float f13 = (f10 * f12) + (f12 * f11);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + f13;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & k0.f265952a)) + f13;
        t1 t1VarB = v1.b((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), u1.f38249b.a(), false, null, 24, null);
        m0.a(t1VarB).P(f10, f10, fIntBitsToFloat - f10, fIntBitsToFloat2 - f10, Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & k0.f265952a)), c.b(this.f38201j, 0L, 0, f10 > 0.0f ? d.a(f10) : null, 0, 11, null));
        return t1VarB;
    }

    private final i0 k(t1 t1Var, i0 i0Var) {
        g1 g1Var = this.f38203l;
        if (g1Var != null && Intrinsics.areEqual(g1Var.i(), i0Var)) {
            return g1Var;
        }
        i0.a aVar = i0.f37796b;
        m3 m3VarA = j0.a(n3.c(t1Var, 0, 0, 6, null));
        if (i0Var instanceof m3) {
            i0Var = j0.a(((m3) i0Var).c(n.f((((long) Float.floatToRawIntBits(t1Var.getWidth())) << 32) | (((long) Float.floatToRawIntBits(t1Var.getHeight())) & k0.f265952a))));
        }
        i0 i0VarA = aVar.a(m3VarA, i0Var, d0.f37693b.z());
        Intrinsics.checkNotNull(i0VarA, "null cannot be cast to non-null type androidx.compose.ui.graphics.CompositeShaderBrush");
        g1 g1Var2 = (g1) i0VarA;
        this.f38203l = g1Var2;
        return g1Var2;
    }

    @Override // androidx.compose.ui.graphics.shadow.l
    protected void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, @Nullable k2 k2Var) {
        e eVar;
        t1 t1VarI;
        float fS7 = fVar.S7(this.f38200i.g());
        float fS8 = fVar.S7(this.f38200i.h());
        if (k2Var != null) {
            eVar = this;
            t1VarI = eVar.h(j10, k2Var, fS7, fS8);
        } else {
            eVar = this;
            t1VarI = i(j10, fS7, fS8, j11);
        }
        eVar.f38202k = t1VarI;
    }

    @Override // androidx.compose.ui.graphics.shadow.l
    protected void f(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, @Nullable k2 k2Var, float f10, @Nullable r0 r0Var, @Nullable i0 i0Var, int i10) {
        t1 t1Var = this.f38202k;
        if (t1Var != null) {
            float f11 = -(fVar.S7(this.f38200i.g()) + fVar.S7(this.f38200i.h()));
            if (i0Var == null || r0Var != null) {
                androidx.compose.ui.graphics.drawscope.f.G2(fVar, t1Var, n0.g.g((((long) Float.floatToRawIntBits(f11)) << 32) | (k0.f265952a & ((long) Float.floatToRawIntBits(f11)))), f10, null, r0Var, i10, 8, null);
                return;
            }
            i0 i0VarK = k(t1Var, i0Var);
            fVar.Z3().i().c(f11, f11);
            try {
                float width = t1Var.getWidth();
                androidx.compose.ui.graphics.drawscope.f.b3(fVar, i0VarK, 0L, n.f((((long) Float.floatToRawIntBits(t1Var.getHeight())) & k0.f265952a) | (Float.floatToRawIntBits(width) << 32)), f10, null, null, i10, 50, null);
            } finally {
                float f12 = -f11;
                fVar.Z3().i().c(f12, f12);
            }
        }
    }

    @NotNull
    public final j j() {
        return this.f38200i;
    }
}
