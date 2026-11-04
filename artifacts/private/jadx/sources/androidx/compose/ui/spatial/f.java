package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.collection.g2;
import androidx.collection.j0;
import androidx.collection.t1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.k;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.m1;
import androidx.compose.ui.node.w1;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.r;
import androidx.compose.ui.unit.u;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 6 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 7 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n+ 8 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 15 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 16 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 17 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,546:1\n1516#2:547\n543#3:548\n539#3:636\n543#3:637\n287#4,6:549\n779#5,7:555\n786#5,3:563\n790#5,3:567\n891#6:562\n860#6:566\n191#7:570\n192#7,8:587\n200#7:602\n397#8,3:571\n354#8,6:574\n364#8,3:581\n367#8,2:585\n370#8,6:595\n400#8:601\n1399#9:580\n1270#9:584\n207#10:603\n207#10:618\n424#11,8:604\n424#11,8:619\n54#12:612\n59#12:614\n85#13:613\n90#13:615\n80#13:617\n53#13,3:633\n53#13,3:640\n30#14:616\n118#15:627\n94#15:628\n118#15:629\n94#15:630\n159#16:631\n159#16:638\n30#17:632\n30#17:639\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager\n*L\n50#1:547\n77#1:548\n403#1:636\n404#1:637\n94#1:549,6\n95#1:555,7\n95#1:563,3\n95#1:567,3\n95#1:562\n95#1:566\n98#1:570\n98#1:587,8\n98#1:602\n98#1:571,3\n98#1:574,6\n98#1:581,3\n98#1:585,2\n98#1:595,6\n98#1:601\n98#1:580\n98#1:584\n215#1:603\n315#1:618\n215#1:604,8\n315#1:619,8\n244#1:612\n245#1:614\n244#1:613\n245#1:615\n257#1:617\n393#1:633,3\n407#1:640,3\n257#1:616\n350#1:627\n351#1:628\n375#1:629\n376#1:630\n393#1:631\n407#1:638\n393#1:632\n407#1:639\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f41256l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j0<l0> f41257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.spatial.b f41258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i f41259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g2<Function0<Unit>> f41260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private Object f41264h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f41265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f41266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n0.e f41267k;

    static final class a extends kotlin.jvm.internal.l0 implements Function2<Long, Long, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.a f41269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f41270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i.a aVar, long j10) {
            super(2);
            this.f41269b = aVar;
            this.f41270c = j10;
        }

        public final void c(long j10, long j11) {
            f.this.f41259c.i(this.f41269b, j10, j11, this.f41270c);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Long l10, Long l11) {
            c(l10.longValue(), l11.longValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nRectManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager$dispatchLambda$1\n+ 2 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,546:1\n27#2,5:547\n*S KotlinDebug\n*F\n+ 1 RectManager.kt\nandroidx/compose/ui/spatial/RectManager$dispatchLambda$1\n*L\n58#1:547,5\n*E\n"})
    static final class b extends kotlin.jvm.internal.l0 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            f.this.f41264h = null;
            f fVar = f.this;
            Trace.beginSection("OnPositionedDispatch");
            try {
                fVar.e();
                Unit unit = Unit.f312394a;
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final long c(k1 k1Var, long j10) {
        w1 w1VarH4 = k1Var.H4();
        if (w1VarH4 == null) {
            return j10;
        }
        float[] fArrMo3getUnderlyingMatrixsQKQjiQ = w1VarH4.mo3getUnderlyingMatrixsQKQjiQ();
        int iC = g.c(fArrMo3getUnderlyingMatrixsQKQjiQ);
        if (iC == 3) {
            return j10;
        }
        if ((iC & 2) == 0) {
            return q.f42709b.a();
        }
        float fN = q.n(j10);
        return r.g(c2.j(fArrMo3getUnderlyingMatrixsQKQjiQ, n0.g.g((((long) Float.floatToRawIntBits(q.p(j10))) & k0.f265952a) | (Float.floatToRawIntBits(fN) << 32))));
    }

    private final void d(k1 k1Var, n0.e eVar) {
        while (k1Var != null) {
            w1 w1VarH4 = k1Var.H4();
            if (w1VarH4 != null) {
                float[] fArrMo3getUnderlyingMatrixsQKQjiQ = w1VarH4.mo3getUnderlyingMatrixsQKQjiQ();
                if (!d2.b(fArrMo3getUnderlyingMatrixsQKQjiQ)) {
                    c2.l(fArrMo3getUnderlyingMatrixsQKQjiQ, eVar);
                }
            }
            long jU2 = k1Var.u2();
            eVar.H(n0.g.g((((long) Float.floatToRawIntBits(q.n(jU2))) << 32) | (((long) Float.floatToRawIntBits(q.p(jU2))) & k0.f265952a)));
            k1Var = k1Var.a5();
        }
    }

    private final void g(l0 l0Var, boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int iK = l0Var.K();
        if (!z10) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            if (!this.f41258b.t(iK, i14, i15, i16, i17)) {
            }
            j();
        }
        i14 = i10;
        i15 = i11;
        i16 = i12;
        i17 = i13;
        l0 l0VarJ0 = l0Var.J0();
        this.f41258b.p(iK, i14, i15, i16, i17, l0VarJ0 != null ? l0VarJ0.K() : -1, l0Var.A0().s(m1.b(1024)), l0Var.A0().s(m1.b(16)));
        j();
    }

    private final void h(l0 l0Var, boolean z10) {
        k1 k1VarF0 = l0Var.F0();
        a1 a1VarV0 = l0Var.v0();
        int iB0 = a1VarV0.b0();
        int iQ0 = a1VarV0.q0();
        n0.e eVar = this.f41267k;
        eVar.B(0.0f, 0.0f, iB0, iQ0);
        d(k1VarF0, eVar);
        int iK = (int) eVar.k();
        int iP = (int) eVar.p();
        int iN = (int) eVar.n();
        int iC = (int) eVar.c();
        int iK2 = l0Var.K();
        if (z10 || !this.f41258b.x(iK2, iK, iP, iN, iC)) {
            l0 l0VarJ0 = l0Var.J0();
            this.f41258b.p(iK2, iK, iP, iN, iC, l0VarJ0 != null ? l0VarJ0.K() : -1, l0Var.A0().s(m1.b(1024)), l0Var.A0().s(m1.b(16)));
        }
        j();
    }

    private final void i(l0 l0Var) {
        androidx.compose.runtime.collection.d<l0> dVarQ0 = l0Var.Q0();
        l0[] l0VarArr = dVarQ0.f35552a;
        int iR = dVarQ0.R();
        for (int i10 = 0; i10 < iR; i10++) {
            l0 l0Var2 = l0VarArr[i10];
            h(l0Var2, false);
            i(l0Var2);
        }
    }

    private final long o(l0 l0Var) {
        k1 k1VarF0 = l0Var.F0();
        long jB = q.f42709b.b();
        for (k1 k1VarE0 = l0Var.e0(); k1VarE0 != null && k1VarE0 != k1VarF0; k1VarE0 = k1VarE0.a5()) {
            long jC = c(k1VarE0, jB);
            q.a aVar = q.f42709b;
            if (q.k(jC, aVar.a())) {
                return aVar.a();
            }
            jB = q.s(jC, k1VarE0.u2());
        }
        return jB;
    }

    private final void p(l0 l0Var) {
        long jG0;
        k1 k1VarF0 = l0Var.F0();
        q.a aVar = q.f42709b;
        long jC = c(k1VarF0, aVar.b());
        if (!g.h(jC)) {
            l0Var.i2(aVar.a());
            return;
        }
        long jS = q.s(jC, k1VarF0.u2());
        l0 l0VarJ0 = l0Var.J0();
        if (l0VarJ0 != null) {
            if (!g.h(l0VarJ0.B0())) {
                p(l0VarJ0);
            }
            long jB0 = l0VarJ0.B0();
            if (g.h(jB0)) {
                if (l0VarJ0.H0()) {
                    jG0 = o(l0VarJ0);
                    l0VarJ0.l2(jG0);
                    l0VarJ0.m2(false);
                } else {
                    jG0 = l0VarJ0.G0();
                }
                jS = !g.h(jG0) ? aVar.a() : q.s(q.s(jB0, jG0), jS);
            } else {
                jS = aVar.a();
            }
        }
        l0Var.i2(jS);
    }

    public final void e() {
        long[] jArr;
        long jB = androidx.compose.ui.c.b();
        boolean z10 = this.f41261e;
        int i10 = 0;
        boolean z11 = z10 || this.f41262f;
        if (z10) {
            this.f41261e = false;
            g2<Function0<Unit>> g2Var = this.f41260d;
            Object[] objArr = g2Var.f12449a;
            int i11 = g2Var.f12450b;
            for (int i12 = 0; i12 < i11; i12++) {
                ((Function0) objArr[i12]).invoke();
            }
            androidx.compose.ui.spatial.b bVar = this.f41258b;
            long[] jArr2 = bVar.f41234a;
            int i13 = bVar.f41236c;
            for (int i14 = 0; i14 < jArr2.length - 2 && i14 < i13; i14 += 3) {
                long j10 = jArr2[i14 + 2];
                if ((((int) (j10 >> 61)) & 1) != 0) {
                    this.f41259c.h(67108863 & ((int) j10), jArr2[i14], jArr2[i14 + 1], jB);
                }
            }
            t1<i.a> t1VarM = this.f41259c.m();
            Object[] objArr2 = t1VarM.f12303c;
            long[] jArr3 = t1VarM.f12301a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr3[i15];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8;
                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                        int i18 = i10;
                        while (i18 < i17) {
                            if ((255 & j11) < 128) {
                                i.a aVar = (i.a) objArr2[(i15 << 3) + i18];
                                i.a aVarI = aVar;
                                while (aVarI != null) {
                                    if (aVar.g() == Long.MIN_VALUE) {
                                        this.f41258b.C(aVar.f(), new a(aVar, jB));
                                    }
                                    aVarI = aVarI.i();
                                    i16 = i16;
                                    jArr3 = jArr3;
                                }
                            }
                            int i19 = i16;
                            j11 >>= i19;
                            i18++;
                            i16 = i19;
                            jArr3 = jArr3;
                        }
                        jArr = jArr3;
                        if (i17 != i16) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    jArr3 = jArr;
                    i10 = 0;
                }
            }
            this.f41258b.b();
        }
        if (this.f41262f) {
            this.f41262f = false;
            this.f41259c.g(jB);
        }
        if (z11) {
            this.f41259c.f(jB);
        }
        if (this.f41263g) {
            this.f41263g = false;
            this.f41258b.e();
        }
        this.f41259c.G(jB);
    }

    @NotNull
    public final androidx.compose.ui.spatial.b f() {
        return this.f41258b;
    }

    public final void j() {
        this.f41261e = true;
    }

    public final void k(@NotNull l0 l0Var) {
        this.f41261e = true;
        this.f41258b.r(l0Var.K());
        u(true);
    }

    public final boolean l(int i10, int i11) {
        l0 l0VarN;
        l0 l0VarJ0;
        l0 l0VarN2 = this.f41257a.n(i10);
        if (l0VarN2 != null && (l0VarN = this.f41257a.n(i11)) != null && l0VarN2.a0() != 0 && l0VarN.a0() != 0) {
            while (l0VarN2.a0() > l0VarN.a0()) {
                l0VarN2 = l0VarN2.J0();
                if (l0VarN2 == null) {
                    return false;
                }
            }
            if (l0VarN2 == l0VarN) {
                return false;
            }
            while (l0VarN.a0() > l0VarN2.a0()) {
                l0VarN = l0VarN.J0();
                if (l0VarN == null) {
                    return false;
                }
            }
            if (l0VarN2 == l0VarN) {
                return false;
            }
            l0 l0Var = l0VarN2;
            l0 l0Var2 = l0Var;
            l0 l0Var3 = l0VarN;
            while (l0Var != l0VarN) {
                l0 l0VarJ1 = l0Var.J0();
                if (l0VarJ1 == null || (l0VarJ0 = l0VarN.J0()) == null) {
                    return false;
                }
                l0Var3 = l0VarN;
                l0VarN = l0VarJ0;
                l0Var2 = l0Var;
                l0Var = l0VarJ1;
            }
            if (l0Var2.v0().W2() == l0Var3.v0().W2()) {
                return l0Var2.K0() < l0Var3.K0();
            }
            if (l0Var2.v0().W2() < l0Var3.v0().W2()) {
                return true;
            }
        }
        return false;
    }

    public final void m(@NotNull l0 l0Var) {
        if (k.f39199b) {
            long jO = o(l0Var);
            if (!g.h(jO)) {
                i(l0Var);
                return;
            }
            l0Var.l2(jO);
            l0Var.m2(false);
            androidx.compose.runtime.collection.d<l0> dVarQ0 = l0Var.Q0();
            l0[] l0VarArr = dVarQ0.f35552a;
            int iR = dVarQ0.R();
            for (int i10 = 0; i10 < iR; i10++) {
                n(l0VarArr[i10], false);
            }
            k(l0Var);
        }
    }

    public final void n(@NotNull l0 l0Var, boolean z10) {
        if (k.f39199b) {
            a1 a1VarV0 = l0Var.v0();
            int iB0 = a1VarV0.b0();
            int iQ0 = a1VarV0.q0();
            long jB0 = l0Var.B0();
            long jJ0 = l0Var.j0();
            int i10 = (int) (jJ0 >> 32);
            int i11 = (int) (jJ0 & k0.f265952a);
            p(l0Var);
            long jB1 = l0Var.B0();
            if (!g.h(jB1)) {
                h(l0Var, z10);
                return;
            }
            l0Var.f2(u.e((((long) iB0) << 32) | (k0.f265952a & ((long) iQ0))));
            int iN = q.n(jB1);
            int iP = q.p(jB1);
            int i12 = iN + iB0;
            int i13 = iP + iQ0;
            if (!z10 && q.k(jB1, jB0) && i10 == iB0 && i11 == iQ0) {
                return;
            }
            g(l0Var, z10, iN, iP, i12, i13);
        }
    }

    @Nullable
    public final Object q(@NotNull Function0<Unit> function0) {
        this.f41260d.a0(function0);
        return function0;
    }

    @NotNull
    public final androidx.compose.ui.node.j.a r(int i10, long j10, long j11, @NotNull androidx.compose.ui.node.j jVar, @NotNull Function1<? super h, Unit> function1) {
        return this.f41259c.v(i10, j10, j11, jVar, function1);
    }

    @NotNull
    public final androidx.compose.ui.node.j.a s(int i10, long j10, long j11, @NotNull androidx.compose.ui.node.j jVar, @NotNull Function1<? super h, Unit> function1) {
        androidx.compose.ui.node.j.a aVarW = this.f41259c.w(i10, j10, j11, jVar, function1);
        j();
        u(true);
        return aVarW;
    }

    public final void t(@NotNull l0 l0Var) {
        this.f41258b.v(l0Var.K());
        j();
        this.f41263g = true;
    }

    public final void u(boolean z10) {
        boolean z11 = (z10 && this.f41264h == null) ? false : true;
        long jL = this.f41259c.l();
        if (jL >= 0 || !z11) {
            if (this.f41265i == jL && z11) {
                return;
            }
            Object obj = this.f41264h;
            if (obj != null) {
                androidx.compose.ui.c.e(obj);
            }
            long jB = androidx.compose.ui.c.b();
            long jMax = Math.max(jL, ((long) 16) + jB);
            this.f41265i = jMax;
            this.f41264h = androidx.compose.ui.c.c(jMax - jB, this.f41266j);
        }
    }

    public final void v(@Nullable Object obj) {
        if ((r1.B(obj, 0) ? (Function0) obj : null) == null) {
            return;
        }
        this.f41260d.C0(obj);
    }

    public final void w(@NotNull l0 l0Var, boolean z10, boolean z11) {
        if (l0Var.I()) {
            this.f41258b.y(l0Var.K(), z10, z11);
        }
    }

    public final void x(long j10, long j11, @NotNull float[] fArr, int i10, int i11) {
        int iC = g.c(fArr);
        i iVar = this.f41259c;
        if ((iC & 2) != 0) {
            fArr = null;
        }
        this.f41262f = iVar.H(j10, j11, fArr, i10, i11) || this.f41262f;
    }

    public f(@NotNull j0<l0> j0Var) {
        this.f41257a = j0Var;
        this.f41258b = new androidx.compose.ui.spatial.b();
        this.f41259c = new i();
        this.f41260d = new g2<>(0, 1, null);
        this.f41265i = -1L;
        this.f41266j = new b();
        this.f41267k = new n0.e(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public /* synthetic */ f(j0 j0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.collection.k0.d() : j0Var);
    }
}
