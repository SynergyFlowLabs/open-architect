package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.c2;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nInnerShadowPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerShadowPainter.kt\nandroidx/compose/ui/graphics/shadow/InnerShadowRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n1#1,387:1\n1#2:388\n57#3:389\n61#3:392\n57#3:401\n61#3:404\n57#3:407\n61#3:410\n60#4:390\n70#4:393\n53#4,3:398\n60#4:402\n70#4:405\n60#4:408\n70#4:411\n60#4:414\n70#4:417\n22#5:391\n22#5:394\n22#5:403\n22#5:406\n22#5:409\n22#5:412\n22#5:415\n22#5:418\n57#6:395\n62#6:396\n30#7:397\n48#8:413\n53#8:416\n*S KotlinDebug\n*F\n+ 1 InnerShadowPainter.kt\nandroidx/compose/ui/graphics/shadow/InnerShadowRenderer\n*L\n235#1:389\n236#1:392\n348#1:401\n349#1:404\n356#1:407\n357#1:410\n235#1:390\n236#1:393\n295#1:398,3\n348#1:402\n349#1:405\n356#1:408\n357#1:411\n364#1:414\n365#1:417\n235#1:391\n236#1:394\n348#1:403\n349#1:406\n356#1:409\n357#1:412\n364#1:415\n365#1:418\n244#1:395\n245#1:396\n295#1:397\n364#1:413\n365#1:416\n*E\n"})
public final class g extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final j f38208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final h2 f38209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private m3 f38210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private g1 f38211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private float[] f38212m;

    public g(@NotNull j jVar, @NotNull f2 f2Var) {
        super(f2Var);
        this.f38208i = jVar;
        this.f38209j = m.a();
    }

    private final m3 h(long j10, k2 k2Var, float f10, float f11, float f12, float f13) {
        t1 t1VarB;
        int iCeil = (int) Math.ceil(Float.intBitsToFloat((int) (j10 >> 32)));
        int iCeil2 = (int) Math.ceil(Float.intBitsToFloat((int) (j10 & k0.f265952a)));
        if (f11 > 0.0f) {
            n0.j bounds = k2Var.getBounds();
            float fX = bounds.x() - bounds.t();
            float fJ = bounds.j() - bounds.B();
            t1VarB = v1.b((int) Math.ceil(fX), (int) Math.ceil(fJ), u1.f38249b.a(), false, null, 24, null);
            androidx.compose.ui.graphics.k0 k0VarA = m0.a(t1VarB);
            k0VarA.M(k2Var, this.f38209j);
            androidx.compose.ui.graphics.k0.E(k0VarA, 0.0f, 0.0f, fX, fJ, 0, 16, null);
            h2 h2VarB = c.b(this.f38209j, 0L, d0.f37693b.a(), null, j2.f37801b.b(), 5, null);
            h2VarB.H(2.0f * f11);
            Unit unit = Unit.f312394a;
            k0VarA.M(k2Var, h2VarB);
        } else {
            t1VarB = null;
        }
        int iCeil3 = ((int) Math.ceil(f10)) * 2;
        t1 t1VarB2 = v1.b(iCeil + iCeil3, iCeil2 + iCeil3, u1.f38249b.a(), false, null, 24, null);
        androidx.compose.ui.graphics.k0 k0VarA2 = m0.a(t1VarB2);
        if (t1VarB != null) {
            k0VarA2.x(0.0f, 0.0f, t1VarB2.getWidth(), t1VarB2.getHeight(), c.b(this.f38209j, 0L, 0, null, 0, 15, null));
            k0VarA2.z(t1VarB, n0.g.g((k0.f265952a & ((long) Float.floatToRawIntBits(f13))) | (((long) Float.floatToRawIntBits(f12)) << 32)), c.b(this.f38209j, 0L, d0.f37693b.C(), f10 > 0.0f ? d.a(f10) : null, 0, 9, null));
            return j0.a(n3.c(t1VarB2, 0, 0, 6, null));
        }
        k0VarA2.save();
        k0VarA2.c(f12, f13);
        k0VarA2.M(k2Var, c.b(this.f38209j, 0L, 0, f10 > 0.0f ? d.a(f10) : null, 0, 11, null));
        k0VarA2.B();
        k0VarA2.x(0.0f, 0.0f, t1VarB2.getWidth(), t1VarB2.getHeight(), c.b(this.f38209j, 0L, d0.f37693b.C(), null, 0, 13, null));
        return j0.a(n3.c(t1VarB2, 0, 0, 6, null));
    }

    private final m3 i(long j10, float f10, float f11, float f12, float f13, long j11) {
        int i10 = (int) (j10 >> 32);
        int iCeil = (int) Math.ceil(Float.intBitsToFloat(i10));
        int i11 = (int) (j10 & k0.f265952a);
        t1 t1VarB = v1.b(iCeil, (int) Math.ceil(Float.intBitsToFloat(i11)), u1.f38249b.a(), false, null, 24, null);
        androidx.compose.ui.graphics.k0 k0VarA = m0.a(t1VarB);
        float f14 = f12 + f11;
        float f15 = f13 + f11;
        k0VarA.P(f14, f15, Math.max(f14, (f12 + Float.intBitsToFloat(i10)) - f11), Math.max(f15, (f13 + Float.intBitsToFloat(i11)) - f11), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & k0.f265952a)), c.b(this.f38209j, 0L, 0, f10 > 0.0f ? d.a(f10) : null, 0, 11, null));
        k0VarA.x(0.0f, 0.0f, t1VarB.getWidth(), t1VarB.getHeight(), c.b(this.f38209j, 0L, d0.f37693b.C(), null, 0, 13, null));
        return j0.a(n3.c(t1VarB, 0, 0, 6, null));
    }

    private final g1 j(m3 m3Var, i0 i0Var) {
        g1 g1Var = this.f38211l;
        if (g1Var != null && Intrinsics.areEqual(g1Var.i(), i0Var)) {
            return g1Var;
        }
        g1 g1Var2 = new g1(j0.b(m3Var), j0.b(i0Var), d0.f37693b.z(), null);
        this.f38211l = g1Var2;
        return g1Var2;
    }

    private final float[] k() {
        float[] fArr = this.f38212m;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrC = c2.c(null, 1, null);
        this.f38212m = fArrC;
        return fArrC;
    }

    @Override // androidx.compose.ui.graphics.shadow.l
    protected void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, @Nullable k2 k2Var) {
        float fS7 = fVar.S7(this.f38208i.g());
        float fS8 = fVar.S7(this.f38208i.h());
        float fS9 = fVar.S7(androidx.compose.ui.unit.j.j(this.f38208i.f()));
        float fS10 = fVar.S7(androidx.compose.ui.unit.j.l(this.f38208i.f()));
        this.f38210k = k2Var != null ? h(j10, k2Var, fS7, fS8, fS9, fS10) : i(j10, fS7, fS8, fS9, fS10, j11);
    }

    @Override // androidx.compose.ui.graphics.shadow.l
    protected void f(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, @Nullable k2 k2Var, float f10, @Nullable r0 r0Var, @Nullable i0 i0Var, int i10) {
        m3 m3VarJ = this.f38210k;
        if (m3VarJ != null) {
            if (this.f38208i.d() instanceof m3) {
                m3VarJ = j(m3VarJ, this.f38208i.d());
            }
            m3 m3Var = m3VarJ;
            if (k2Var != null) {
                androidx.compose.ui.graphics.drawscope.f.L3(fVar, k2Var, m3Var, f10, null, r0Var, i10, 8, null);
            } else if (n0.a.j(j11, n0.a.f332683b.a())) {
                androidx.compose.ui.graphics.drawscope.f.b3(fVar, m3Var, 0L, 0L, f10, null, r0Var, i10, 22, null);
            } else {
                androidx.compose.ui.graphics.drawscope.f.C8(fVar, m3Var, 0L, 0L, j11, f10, null, r0Var, this.f38208i.c(), 38, null);
            }
        }
    }
}
