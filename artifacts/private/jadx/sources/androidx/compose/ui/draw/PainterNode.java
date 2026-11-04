package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i2;
import androidx.compose.ui.layout.x2;
import androidx.compose.ui.layout.z0;
import androidx.compose.ui.node.g0;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,364:1\n136#2:365\n33#2:378\n33#2:401\n33#2:431\n57#3:366\n57#3:369\n61#3:372\n61#3:375\n57#3:382\n61#3:385\n57#3:387\n61#3:394\n57#3:405\n61#3:412\n57#3:419\n57#3:422\n61#3:425\n61#3:428\n57#3:435\n61#3:438\n57#3:440\n61#3:447\n57#3:451\n61#3:458\n57#3:469\n61#3:473\n60#4:367\n60#4:370\n70#4:373\n70#4:376\n53#4,3:379\n60#4:383\n70#4:386\n60#4:388\n70#4:395\n53#4,3:402\n60#4:406\n70#4:413\n60#4:420\n60#4:423\n70#4:426\n70#4:429\n53#4,3:432\n60#4:436\n70#4:439\n60#4:441\n70#4:448\n80#4:450\n60#4:452\n70#4:459\n80#4:461\n60#4:470\n70#4:474\n22#5:368\n22#5:371\n22#5:374\n22#5:377\n22#5:384\n22#5,5:389\n22#5,5:396\n22#5,5:407\n22#5,5:414\n22#5:421\n22#5:424\n22#5:427\n22#5:430\n22#5:437\n22#5,5:442\n22#5,5:453\n22#5:471\n22#5:475\n30#6:449\n30#6:460\n120#7,3:462\n124#7,3:466\n1#8:465\n139#9:472\n139#9:476\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n162#1:365\n245#1:378\n289#1:401\n318#1:431\n233#1:366\n235#1:369\n240#1:372\n242#1:375\n246#1:382\n246#1:385\n272#1:387\n279#1:394\n297#1:405\n298#1:412\n306#1:419\n308#1:422\n313#1:425\n315#1:428\n323#1:435\n323#1:438\n331#1:440\n331#1:447\n332#1:451\n332#1:458\n351#1:469\n354#1:473\n233#1:367\n235#1:370\n240#1:373\n242#1:376\n245#1:379,3\n246#1:383\n246#1:386\n272#1:388\n279#1:395\n289#1:402,3\n297#1:406\n298#1:413\n306#1:420\n308#1:423\n313#1:426\n315#1:429\n318#1:432,3\n323#1:436\n323#1:439\n331#1:441\n331#1:448\n331#1:450\n332#1:452\n332#1:459\n332#1:461\n351#1:470\n354#1:474\n233#1:368\n235#1:371\n240#1:374\n242#1:377\n246#1:384\n272#1:389,5\n279#1:396,5\n297#1:407,5\n298#1:414,5\n306#1:421\n308#1:424\n313#1:427\n315#1:430\n323#1:437\n331#1:442,5\n332#1:453,5\n351#1:471\n354#1:475\n331#1:449\n332#1:460\n343#1:462,3\n343#1:466,3\n351#1:472\n354#1:476\n*E\n"})
final class PainterNode extends androidx.compose.ui.a0.d implements g0, androidx.compose.ui.node.t {

    @Nullable
    private r0 X;

    @NotNull
    private androidx.compose.ui.graphics.painter.b painter;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f37230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e f37231t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.layout.l f37232v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f37233w;

    static final class a extends l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f37234a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i2 i2Var) {
            super(1);
            this.f37234a = i2Var;
        }

        public final void c(i2.a aVar) {
            i2.a.e0(aVar, this.f37234a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ PainterNode(androidx.compose.ui.graphics.painter.b bVar, boolean z10, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, r0 r0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, z10, (i10 & 4) != 0 ? androidx.compose.ui.e.f37317a.i() : eVar, (i10 & 8) != 0 ? androidx.compose.ui.layout.l.f39405a.k() : lVar, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? null : r0Var);
    }

    private final boolean A9() {
        return this.f37230s && this.painter.l() != n0.d.f332689d;
    }

    private final boolean B9(long j10) {
        if (n0.n.k(j10, n0.n.f332724b.a()) || (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & k0.f265952a))) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        int i10 = 3 & 1;
        return true;
    }

    private final boolean C9(long j10) {
        return !n0.n.k(j10, n0.n.f332724b.a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    private final long D9(long j10) {
        boolean z10 = false;
        boolean z11 = androidx.compose.ui.unit.b.j(j10) && androidx.compose.ui.unit.b.i(j10);
        if (androidx.compose.ui.unit.b.n(j10) && androidx.compose.ui.unit.b.l(j10)) {
            z10 = true;
        }
        if ((!A9() && z11) || z10) {
            int i10 = 3 >> 0;
            return androidx.compose.ui.unit.b.d(j10, androidx.compose.ui.unit.b.p(j10), 0, androidx.compose.ui.unit.b.o(j10), 0, 10, null);
        }
        long jL = this.painter.l();
        int iRound = C9(jL) ? Math.round(Float.intBitsToFloat((int) (jL >> 32))) : androidx.compose.ui.unit.b.r(j10);
        int iRound2 = B9(jL) ? Math.round(Float.intBitsToFloat((int) (jL & k0.f265952a))) : androidx.compose.ui.unit.b.q(j10);
        long jV9 = v9(n0.n.f((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.c.h(j10, iRound2))) & k0.f265952a) | (((long) Float.floatToRawIntBits(androidx.compose.ui.unit.c.i(j10, iRound))) << 32)));
        return androidx.compose.ui.unit.b.d(j10, androidx.compose.ui.unit.c.i(j10, Math.round(Float.intBitsToFloat((int) (jV9 >> 32)))), 0, androidx.compose.ui.unit.c.h(j10, Math.round(Float.intBitsToFloat((int) (jV9 & k0.f265952a)))), 0, 10, null);
    }

    private final long v9(long j10) {
        if (!A9()) {
            return j10;
        }
        long jF = n0.n.f((((long) Float.floatToRawIntBits(!C9(this.painter.l()) ? Float.intBitsToFloat((int) (j10 >> 32)) : Float.intBitsToFloat((int) (this.painter.l() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!B9(this.painter.l()) ? Float.intBitsToFloat((int) (j10 & k0.f265952a)) : Float.intBitsToFloat((int) (this.painter.l() & k0.f265952a)))) & k0.f265952a));
        return (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j10 & k0.f265952a)) == 0.0f) ? n0.n.f332724b.c() : x2.i(jF, this.f37232v.a(jF, j10));
    }

    public final void E9(@NotNull androidx.compose.ui.e eVar) {
        this.f37231t = eVar;
    }

    public final void F9(@NotNull androidx.compose.ui.layout.l lVar) {
        this.f37232v = lVar;
    }

    public final void G9(@NotNull androidx.compose.ui.graphics.painter.b bVar) {
        this.painter = bVar;
    }

    public final void H9(boolean z10) {
        this.f37230s = z10;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        long jL = this.painter.l();
        long jF = n0.n.f((((long) Float.floatToRawIntBits(C9(jL) ? Float.intBitsToFloat((int) (jL >> 32)) : Float.intBitsToFloat((int) (cVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(B9(jL) ? Float.intBitsToFloat((int) (jL & k0.f265952a)) : Float.intBitsToFloat((int) (cVar.d() & k0.f265952a)))) & k0.f265952a));
        long jC = (Float.intBitsToFloat((int) (cVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (cVar.d() & k0.f265952a)) == 0.0f) ? n0.n.f332724b.c() : x2.i(jF, this.f37232v.a(jF, cVar.d()));
        long jA = this.f37231t.a(androidx.compose.ui.unit.u.e((((long) Math.round(Float.intBitsToFloat((int) (jC & k0.f265952a)))) & k0.f265952a) | (((long) Math.round(Float.intBitsToFloat((int) (jC >> 32)))) << 32)), androidx.compose.ui.unit.u.e((((long) Math.round(Float.intBitsToFloat((int) (cVar.d() & k0.f265952a)))) & k0.f265952a) | (((long) Math.round(Float.intBitsToFloat((int) (cVar.d() >> 32)))) << 32)), cVar.getLayoutDirection());
        float fN = androidx.compose.ui.unit.q.n(jA);
        float fP = androidx.compose.ui.unit.q.p(jA);
        cVar.Z3().i().c(fN, fP);
        try {
            this.painter.g(cVar, jC, this.f37233w, this.X);
            cVar.Z3().i().c(-fN, -fP);
            cVar.E4();
        } catch (Throwable th2) {
            cVar.Z3().i().c(-fN, -fP);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.node.g0
    public int U(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (!A9()) {
            return yVar.L0(i10);
        }
        long jD9 = D9(androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null));
        return Math.max(androidx.compose.ui.unit.b.r(jD9), yVar.L0(i10));
    }

    @Override // androidx.compose.ui.node.g0
    public int W(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (!A9()) {
            return yVar.M0(i10);
        }
        long jD9 = D9(androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null));
        return Math.max(androidx.compose.ui.unit.b.r(jD9), yVar.M0(i10));
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public b1 c(@NotNull c1 c1Var, @NotNull z0 z0Var, long j10) {
        i2 i2VarP0 = z0Var.P0(D9(j10));
        return c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1(), null, new a(i2VarP0), 4, null);
    }

    @Nullable
    public final r0 e() {
        return this.X;
    }

    @Override // androidx.compose.ui.node.g0
    public int e0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (!A9()) {
            return yVar.p0(i10);
        }
        long jD9 = D9(androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null));
        return Math.max(androidx.compose.ui.unit.b.q(jD9), yVar.p0(i10));
    }

    public final void f(@Nullable r0 r0Var) {
        this.X = r0Var;
    }

    @Override // androidx.compose.ui.node.g0
    public int k0(@NotNull androidx.compose.ui.layout.z zVar, @NotNull androidx.compose.ui.layout.y yVar, int i10) {
        if (!A9()) {
            return yVar.D0(i10);
        }
        long jD9 = D9(androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null));
        return Math.max(androidx.compose.ui.unit.b.q(jD9), yVar.D0(i10));
    }

    public final float r() {
        return this.f37233w;
    }

    public final void setAlpha(float f10) {
        this.f37233w = f10;
    }

    @NotNull
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.f37230s + ", alignment=" + this.f37231t + ", alpha=" + this.f37233w + ", colorFilter=" + this.X + ')';
    }

    @NotNull
    public final androidx.compose.ui.e w9() {
        return this.f37231t;
    }

    @NotNull
    public final androidx.compose.ui.layout.l x9() {
        return this.f37232v;
    }

    @NotNull
    public final androidx.compose.ui.graphics.painter.b y9() {
        return this.painter;
    }

    public final boolean z9() {
        return this.f37230s;
    }

    public PainterNode(@NotNull androidx.compose.ui.graphics.painter.b bVar, boolean z10, @NotNull androidx.compose.ui.e eVar, @NotNull androidx.compose.ui.layout.l lVar, float f10, @Nullable r0 r0Var) {
        this.painter = bVar;
        this.f37230s = z10;
        this.f37231t = eVar;
        this.f37232v = lVar;
        this.f37233w = f10;
        this.X = r0Var;
    }
}
