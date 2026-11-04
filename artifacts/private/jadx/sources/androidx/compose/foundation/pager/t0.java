package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,227:1\n1282#2,6:228\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n59#1:228,6\n*E\n"})
public final class t0 {

    @SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,227:1\n32#2:228\n32#2:230\n80#3:229\n80#3:231\n604#4,7:232\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt$rememberPagerMeasurePolicy$1$1\n*L\n127#1:228\n134#1:230\n127#1:229\n134#1:231\n167#1:232,7\n*E\n"})
    static final class a implements androidx.compose.foundation.lazy.layout.v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f18441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f18442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g5 f18443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f18444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f18445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f18446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<l0> f18447g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Integer> f18448h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e.c f18449i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e.b f18450j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f18451k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.snapping.o f18452l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f18453m;

        a(i1 i1Var, q3 q3Var, g5 g5Var, boolean z10, float f10, p pVar, Function0<l0> function0, Function0<Integer> function1, androidx.compose.ui.e.c cVar, androidx.compose.ui.e.b bVar, int i10, androidx.compose.foundation.gestures.snapping.o oVar, kotlinx.coroutines.s0 s0Var) {
            this.f18441a = i1Var;
            this.f18442b = q3Var;
            this.f18443c = g5Var;
            this.f18444d = z10;
            this.f18445e = f10;
            this.f18446f = pVar;
            this.f18447g = function0;
            this.f18448h = function1;
            this.f18449i = cVar;
            this.f18450j = bVar;
            this.f18451k = i10;
            this.f18452l = oVar;
            this.f18453m = s0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 c(androidx.compose.foundation.lazy.layout.w0 w0Var, long j10, int i10, int i11, int i12, int i13, Function1 function1) {
            return w0Var.S6(androidx.compose.ui.unit.c.i(j10, i12 + i10), androidx.compose.ui.unit.c.h(j10, i13 + i11), MapsKt.emptyMap(), function1);
        }

        @Override // androidx.compose.foundation.lazy.layout.v0
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.foundation.lazy.layout.w0 w0Var, final long j10) {
            int i10;
            long jF;
            n2.a(this.f18441a.P());
            q3 q3Var = this.f18442b;
            q3 q3Var2 = q3.Vertical;
            boolean z10 = q3Var == q3Var2;
            androidx.compose.foundation.g1.a(j10, z10 ? q3Var2 : q3.Horizontal);
            int iG6 = z10 ? w0Var.g6(this.f18443c.b(w0Var.getLayoutDirection())) : w0Var.g6(d5.o(this.f18443c, w0Var.getLayoutDirection()));
            int iG7 = z10 ? w0Var.g6(this.f18443c.c(w0Var.getLayoutDirection())) : w0Var.g6(d5.n(this.f18443c, w0Var.getLayoutDirection()));
            int iG8 = w0Var.g6(this.f18443c.d());
            int iG9 = w0Var.g6(this.f18443c.a());
            final int i11 = iG8 + iG9;
            final int i12 = iG6 + iG7;
            int i13 = z10 ? i11 : i12;
            if (z10 && !this.f18444d) {
                i10 = iG8;
            } else if (z10 && this.f18444d) {
                i10 = iG9;
            } else {
                i10 = (z10 || this.f18444d) ? iG7 : iG6;
            }
            int i14 = i13 - i10;
            long jQ = androidx.compose.ui.unit.c.q(j10, -i12, -i11);
            this.f18441a.B0(w0Var);
            int iG10 = w0Var.g6(this.f18445e);
            int iO = z10 ? androidx.compose.ui.unit.b.o(j10) - i11 : androidx.compose.ui.unit.b.p(j10) - i12;
            if (!this.f18444d || iO > 0) {
                jF = androidx.compose.ui.unit.q.f((((long) iG6) << 32) | (((long) iG8) & com.rabbitmq.client.k0.f265952a));
            } else {
                if (!z10) {
                    iG6 += iO;
                }
                if (z10) {
                    iG8 += iO;
                }
                jF = androidx.compose.ui.unit.q.f((((long) iG8) & com.rabbitmq.client.k0.f265952a) | (((long) iG6) << 32));
            }
            long j11 = jF;
            int iU = kotlin.ranges.r.u(this.f18446f.a(w0Var, iO, iG10), 0);
            this.f18441a.F0(androidx.compose.ui.unit.c.b(0, this.f18442b == q3Var2 ? androidx.compose.ui.unit.b.p(jQ) : iU, 0, this.f18442b != q3Var2 ? androidx.compose.ui.unit.b.o(jQ) : iU, 5, null));
            l0 l0VarInvoke = this.f18447g.invoke();
            int i15 = iO + i10 + i14;
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            i1 i1Var = this.f18441a;
            androidx.compose.foundation.gestures.snapping.o oVar = this.f18452l;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                int iO0 = i1Var.o0(l0VarInvoke, i1Var.E());
                int iR = g0.r(oVar, i15, iU, iG10, i10, i14, i1Var.E(), i1Var.F(), i1Var.V());
                Unit unit = Unit.f312394a;
                aVar.x(mVarG, mVarM, function1L);
                u0 u0VarM = r0.m(w0Var, this.f18448h.invoke().intValue(), l0VarInvoke, iO, i10, i14, iG10, iO0, iR, jQ, this.f18442b, this.f18449i, this.f18450j, this.f18444d, j11, iU, this.f18451k, androidx.compose.foundation.lazy.layout.v.a(l0VarInvoke, this.f18441a.Z(), this.f18441a.D()), this.f18452l, this.f18441a.a0(), this.f18453m, new pj.n() { // from class: androidx.compose.foundation.pager.s0
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return t0.a.c(w0Var, j10, i12, i11, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (Function1) obj3);
                    }
                }, androidx.collection.k0.j());
                i1.w(this.f18441a, u0VarM, w0Var.P5(), false, 4, null);
                return u0VarM;
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d A[PHI: r3
      0x013d: PHI (r3v20 int) = (r3v18 int), (r3v21 int) binds: [B:102:0x013b, B:98:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0151  */
    /* JADX WARN: Code duplicated, block: B:109:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x017e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093 A[PHI: r4
      0x0093: PHI (r4v23 androidx.compose.ui.e$b) = (r4v21 androidx.compose.ui.e$b), (r4v24 androidx.compose.ui.e$b) binds: [B:44:0x0091, B:40:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1 A[PHI: r9
      0x00b1: PHI (r9v15 androidx.compose.ui.e$c) = (r9v11 androidx.compose.ui.e$c), (r9v16 androidx.compose.ui.e$c) binds: [B:54:0x00af, B:50:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1 A[PHI: r12
      0x00d1: PHI (r12v12 float) = (r12v10 float), (r12v14 float) binds: [B:64:0x00cf, B:60:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed A[PHI: r13
      0x00ed: PHI (r13v11 androidx.compose.foundation.pager.p) = (r13v9 androidx.compose.foundation.pager.p), (r13v12 androidx.compose.foundation.pager.p) binds: [B:74:0x00eb, B:70:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109 A[PHI: r14
      0x0109: PHI (r14v11 androidx.compose.foundation.gestures.snapping.o) = (r14v8 androidx.compose.foundation.gestures.snapping.o), (r14v13 androidx.compose.foundation.gestures.snapping.o) binds: [B:84:0x0107, B:80:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.lazy.layout.v0 a(@NotNull Function0<l0> function0, @NotNull i1 i1Var, @NotNull g5 g5Var, boolean z10, @NotNull q3 q3Var, int i10, float f10, @NotNull p pVar, @Nullable androidx.compose.ui.e.b bVar, @Nullable androidx.compose.ui.e.c cVar, @NotNull androidx.compose.foundation.gestures.snapping.o oVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull Function0<Integer> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        androidx.compose.ui.e.b bVar2;
        boolean z11;
        androidx.compose.ui.e.c cVar2;
        boolean z12;
        float f11;
        boolean z13;
        p pVar2;
        boolean z14;
        androidx.compose.foundation.gestures.snapping.o oVar2;
        boolean z15;
        int i13;
        boolean z16;
        boolean zD;
        Object objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1294131537, i11, i12, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:58)");
        }
        boolean z17 = ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(i1Var)) || (i11 & 48) == 32) | ((((i11 & 896) ^ a5.S0) > 256 && c0Var.D(g5Var)) || (i11 & a5.S0) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && c0Var.G(z10)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && c0Var.K(q3Var.ordinal())) || (i11 & 24576) == 16384);
        if (((234881024 & i11) ^ 100663296) > 67108864) {
            bVar2 = bVar;
            if (c0Var.D(bVar2)) {
                z11 = true;
            }
            boolean z18 = z17 | z11;
            if (((1879048192 & i11) ^ 805306368) > 536870912) {
                cVar2 = cVar;
                if (!c0Var.D(cVar2)) {
                    z12 = true;
                }
                boolean z19 = z18 | z12;
                if (((3670016 & i11) ^ 1572864) > 1048576) {
                    f11 = f10;
                    if (!c0Var.I(f11)) {
                        z13 = true;
                    }
                    boolean z20 = z19 | z13;
                    if (((29360128 & i11) ^ 12582912) > 8388608) {
                        pVar2 = pVar;
                        if (!c0Var.D(pVar2)) {
                            z14 = true;
                        }
                        boolean z21 = z20 | z14;
                        if (((i12 & 14) ^ 6) > 4) {
                            oVar2 = oVar;
                            if (!c0Var.D(oVar2)) {
                                z15 = true;
                            }
                            boolean z22 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21 | z15;
                            if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                                i13 = i10;
                                if (!c0Var.K(i13)) {
                                    z16 = true;
                                }
                                zD = z22 | z16 | c0Var.D(s0Var);
                                objI0 = c0Var.i0();
                                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    a aVar = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                    c0Var.Y(aVar);
                                    objI0 = aVar;
                                }
                                androidx.compose.foundation.lazy.layout.v0 v0Var = (androidx.compose.foundation.lazy.layout.v0) objI0;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                return v0Var;
                            }
                            i13 = i10;
                            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zD = z22 | z16 | c0Var.D(s0Var);
                            objI0 = c0Var.i0();
                            if (zD) {
                                a aVar2 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar2);
                                objI0 = aVar2;
                            } else {
                                a aVar3 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar3);
                                objI0 = aVar3;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var2 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var2;
                        }
                        oVar2 = oVar;
                        if ((i12 & 6) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z23 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21 | z15;
                        if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                            i13 = i10;
                            if (!c0Var.K(i13)) {
                                z16 = true;
                            }
                            zD = z23 | z16 | c0Var.D(s0Var);
                            objI0 = c0Var.i0();
                            if (zD) {
                                a aVar4 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar4);
                                objI0 = aVar4;
                            } else {
                                a aVar5 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar5);
                                objI0 = aVar5;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var3 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var3;
                        }
                        i13 = i10;
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zD = z23 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar6 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar6);
                            objI0 = aVar6;
                        } else {
                            a aVar7 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar7);
                            objI0 = aVar7;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var4 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var4;
                    }
                    pVar2 = pVar;
                    if ((12582912 & i11) == 8388608) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z24 = z20 | z14;
                    if (((i12 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!c0Var.D(oVar2)) {
                            z15 = true;
                        }
                        boolean z25 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z24 | z15;
                        if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                            i13 = i10;
                            if (!c0Var.K(i13)) {
                                z16 = true;
                            }
                            zD = z25 | z16 | c0Var.D(s0Var);
                            objI0 = c0Var.i0();
                            if (zD) {
                                a aVar8 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar8);
                                objI0 = aVar8;
                            } else {
                                a aVar9 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar9);
                                objI0 = aVar9;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var5 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var5;
                        }
                        i13 = i10;
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zD = z25 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar10 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar10);
                            objI0 = aVar10;
                        } else {
                            a aVar11 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar11);
                            objI0 = aVar11;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var6 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var6;
                    }
                    oVar2 = oVar;
                    if ((i12 & 6) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z26 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z24 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z26 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar12 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar12);
                            objI0 = aVar12;
                        } else {
                            a aVar13 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar13);
                            objI0 = aVar13;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var7 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var7;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z26 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar14 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar14);
                        objI0 = aVar14;
                    } else {
                        a aVar15 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar15);
                        objI0 = aVar15;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var8 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var8;
                }
                f11 = f10;
                if ((1572864 & i11) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z27 = z19 | z13;
                if (((29360128 & i11) ^ 12582912) > 8388608) {
                    pVar2 = pVar;
                    if (!c0Var.D(pVar2)) {
                        z14 = true;
                    }
                    boolean z28 = z27 | z14;
                    if (((i12 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!c0Var.D(oVar2)) {
                            z15 = true;
                        }
                        boolean z29 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z28 | z15;
                        if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                            i13 = i10;
                            if (!c0Var.K(i13)) {
                                z16 = true;
                            }
                            zD = z29 | z16 | c0Var.D(s0Var);
                            objI0 = c0Var.i0();
                            if (zD) {
                                a aVar16 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar16);
                                objI0 = aVar16;
                            } else {
                                a aVar17 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar17);
                                objI0 = aVar17;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var9 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var9;
                        }
                        i13 = i10;
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zD = z29 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar18 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar18);
                            objI0 = aVar18;
                        } else {
                            a aVar19 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar19);
                            objI0 = aVar19;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var10 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var10;
                    }
                    oVar2 = oVar;
                    if ((i12 & 6) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z210 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z28 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z210 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar110);
                            objI0 = aVar110;
                        } else {
                            a aVar111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar111);
                            objI0 = aVar111;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var11 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var11;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z210 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar112);
                        objI0 = aVar112;
                    } else {
                        a aVar113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar113);
                        objI0 = aVar113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var12 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var12;
                }
                pVar2 = pVar;
                if ((12582912 & i11) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z211 = z27 | z14;
                if (((i12 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!c0Var.D(oVar2)) {
                        z15 = true;
                    }
                    boolean z212 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z211 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z212 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar114);
                            objI0 = aVar114;
                        } else {
                            a aVar115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar115);
                            objI0 = aVar115;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var13 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var13;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z212 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar116);
                        objI0 = aVar116;
                    } else {
                        a aVar117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar117);
                        objI0 = aVar117;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var14 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var14;
                }
                oVar2 = oVar;
                if ((i12 & 6) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z213 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z211 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z213 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar118);
                        objI0 = aVar118;
                    } else {
                        a aVar119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar119);
                        objI0 = aVar119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var15 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var15;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z213 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar1110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1110);
                    objI0 = aVar1110;
                } else {
                    a aVar1111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111);
                    objI0 = aVar1111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var16 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var16;
            }
            cVar2 = cVar;
            if ((805306368 & i11) == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z110 = z18 | z12;
            if (((3670016 & i11) ^ 1572864) > 1048576) {
                f11 = f10;
                if (!c0Var.I(f11)) {
                    z13 = true;
                }
                boolean z214 = z110 | z13;
                if (((29360128 & i11) ^ 12582912) > 8388608) {
                    pVar2 = pVar;
                    if (!c0Var.D(pVar2)) {
                        z14 = true;
                    }
                    boolean z215 = z214 | z14;
                    if (((i12 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!c0Var.D(oVar2)) {
                            z15 = true;
                        }
                        boolean z216 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z215 | z15;
                        if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                            i13 = i10;
                            if (!c0Var.K(i13)) {
                                z16 = true;
                            }
                            zD = z216 | z16 | c0Var.D(s0Var);
                            objI0 = c0Var.i0();
                            if (zD) {
                                a aVar1112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar1112);
                                objI0 = aVar1112;
                            } else {
                                a aVar1113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar1113);
                                objI0 = aVar1113;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var17 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var17;
                        }
                        i13 = i10;
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zD = z216 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar1114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1114);
                            objI0 = aVar1114;
                        } else {
                            a aVar1115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1115);
                            objI0 = aVar1115;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var18 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var18;
                    }
                    oVar2 = oVar;
                    if ((i12 & 6) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z217 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z215 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z217 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar1116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1116);
                            objI0 = aVar1116;
                        } else {
                            a aVar1117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1117);
                            objI0 = aVar1117;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var19 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var19;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z217 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar1118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar1118);
                        objI0 = aVar1118;
                    } else {
                        a aVar1119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar1119);
                        objI0 = aVar1119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var110;
                }
                pVar2 = pVar;
                if ((12582912 & i11) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z218 = z214 | z14;
                if (((i12 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!c0Var.D(oVar2)) {
                        z15 = true;
                    }
                    boolean z219 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z218 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z219 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar11110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar11110);
                            objI0 = aVar11110;
                        } else {
                            a aVar11111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar11111);
                            objI0 = aVar11111;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var111;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z219 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar11112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11112);
                        objI0 = aVar11112;
                    } else {
                        a aVar11113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11113);
                        objI0 = aVar11113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var112;
                }
                oVar2 = oVar;
                if ((i12 & 6) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z2110 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z218 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z2110 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar11114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11114);
                        objI0 = aVar11114;
                    } else {
                        a aVar11115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11115);
                        objI0 = aVar11115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var113;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z2110 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar11116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11116);
                    objI0 = aVar11116;
                } else {
                    a aVar11117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11117);
                    objI0 = aVar11117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var114;
            }
            f11 = f10;
            if ((1572864 & i11) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z2111 = z110 | z13;
            if (((29360128 & i11) ^ 12582912) > 8388608) {
                pVar2 = pVar;
                if (!c0Var.D(pVar2)) {
                    z14 = true;
                }
                boolean z2112 = z2111 | z14;
                if (((i12 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!c0Var.D(oVar2)) {
                        z15 = true;
                    }
                    boolean z2113 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2112 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z2113 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar11118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar11118);
                            objI0 = aVar11118;
                        } else {
                            a aVar11119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar11119);
                            objI0 = aVar11119;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var115;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z2113 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111110);
                        objI0 = aVar111110;
                    } else {
                        a aVar111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111);
                        objI0 = aVar111111;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var116;
                }
                oVar2 = oVar;
                if ((i12 & 6) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z2114 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2112 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z2114 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111112);
                        objI0 = aVar111112;
                    } else {
                        a aVar111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111113);
                        objI0 = aVar111113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var117;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z2114 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111114);
                    objI0 = aVar111114;
                } else {
                    a aVar111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111115);
                    objI0 = aVar111115;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var118;
            }
            pVar2 = pVar;
            if ((12582912 & i11) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z2115 = z2111 | z14;
            if (((i12 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!c0Var.D(oVar2)) {
                    z15 = true;
                }
                boolean z2116 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2115 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z2116 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111116);
                        objI0 = aVar111116;
                    } else {
                        a aVar111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111117);
                        objI0 = aVar111117;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var119;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z2116 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar111118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111118);
                    objI0 = aVar111118;
                } else {
                    a aVar111119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111119);
                    objI0 = aVar111119;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var1110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var1110;
            }
            oVar2 = oVar;
            if ((i12 & 6) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z2117 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2115 | z15;
            if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                i13 = i10;
                if (!c0Var.K(i13)) {
                    z16 = true;
                }
                zD = z2117 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar1111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111110);
                    objI0 = aVar1111110;
                } else {
                    a aVar1111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111111);
                    objI0 = aVar1111111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var1111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var1111;
            }
            i13 = i10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            zD = z2117 | z16 | c0Var.D(s0Var);
            objI0 = c0Var.i0();
            if (zD) {
                a aVar1111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111112);
                objI0 = aVar1111112;
            } else {
                a aVar1111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111113);
                objI0 = aVar1111113;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1112;
        }
        bVar2 = bVar;
        if ((100663296 & i11) == 67108864) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z111 = z17 | z11;
        if (((1879048192 & i11) ^ 805306368) > 536870912) {
            cVar2 = cVar;
            if (!c0Var.D(cVar2)) {
                z12 = true;
            }
            boolean z112 = z111 | z12;
            if (((3670016 & i11) ^ 1572864) > 1048576) {
                f11 = f10;
                if (!c0Var.I(f11)) {
                    z13 = true;
                }
                boolean z2118 = z112 | z13;
                if (((29360128 & i11) ^ 12582912) > 8388608) {
                    pVar2 = pVar;
                    if (!c0Var.D(pVar2)) {
                        z14 = true;
                    }
                    boolean z2119 = z2118 | z14;
                    if (((i12 & 14) ^ 6) > 4) {
                        oVar2 = oVar;
                        if (!c0Var.D(oVar2)) {
                            z15 = true;
                        }
                        boolean z21110 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2119 | z15;
                        if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                            i13 = i10;
                            if (!c0Var.K(i13)) {
                                z16 = true;
                            }
                            zD = z21110 | z16 | c0Var.D(s0Var);
                            objI0 = c0Var.i0();
                            if (zD) {
                                a aVar1111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar1111114);
                                objI0 = aVar1111114;
                            } else {
                                a aVar1111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                                c0Var.Y(aVar1111115);
                                objI0 = aVar1111115;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var1113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var1113;
                        }
                        i13 = i10;
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zD = z21110 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar1111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1111116);
                            objI0 = aVar1111116;
                        } else {
                            a aVar1111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1111117);
                            objI0 = aVar1111117;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var1114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var1114;
                    }
                    oVar2 = oVar;
                    if ((i12 & 6) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z21111 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2119 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z21111 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar1111118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1111118);
                            objI0 = aVar1111118;
                        } else {
                            a aVar1111119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1111119);
                            objI0 = aVar1111119;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var1115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var1115;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z21111 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar11111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111110);
                        objI0 = aVar11111110;
                    } else {
                        a aVar11111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111111);
                        objI0 = aVar11111111;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var1116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var1116;
                }
                pVar2 = pVar;
                if ((12582912 & i11) == 8388608) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z21112 = z2118 | z14;
                if (((i12 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!c0Var.D(oVar2)) {
                        z15 = true;
                    }
                    boolean z21113 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21112 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z21113 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar11111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar11111112);
                            objI0 = aVar11111112;
                        } else {
                            a aVar11111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar11111113);
                            objI0 = aVar11111113;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var1117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var1117;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z21113 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar11111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111114);
                        objI0 = aVar11111114;
                    } else {
                        a aVar11111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111115);
                        objI0 = aVar11111115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var1118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var1118;
                }
                oVar2 = oVar;
                if ((i12 & 6) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z21114 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21112 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z21114 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar11111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111116);
                        objI0 = aVar11111116;
                    } else {
                        a aVar11111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111117);
                        objI0 = aVar11111117;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var1119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var1119;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z21114 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar11111118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111118);
                    objI0 = aVar11111118;
                } else {
                    a aVar11111119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111119);
                    objI0 = aVar11111119;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11110;
            }
            f11 = f10;
            if ((1572864 & i11) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z21115 = z112 | z13;
            if (((29360128 & i11) ^ 12582912) > 8388608) {
                pVar2 = pVar;
                if (!c0Var.D(pVar2)) {
                    z14 = true;
                }
                boolean z21116 = z21115 | z14;
                if (((i12 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!c0Var.D(oVar2)) {
                        z15 = true;
                    }
                    boolean z21117 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21116 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z21117 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar111111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar111111110);
                            objI0 = aVar111111110;
                        } else {
                            a aVar111111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar111111111);
                            objI0 = aVar111111111;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var11111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var11111;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z21117 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar111111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111112);
                        objI0 = aVar111111112;
                    } else {
                        a aVar111111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111113);
                        objI0 = aVar111111113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var11112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var11112;
                }
                oVar2 = oVar;
                if ((i12 & 6) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z21118 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21116 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z21118 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar111111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111114);
                        objI0 = aVar111111114;
                    } else {
                        a aVar111111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111115);
                        objI0 = aVar111111115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var11113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var11113;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z21118 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar111111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111111116);
                    objI0 = aVar111111116;
                } else {
                    a aVar111111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111111117);
                    objI0 = aVar111111117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11114;
            }
            pVar2 = pVar;
            if ((12582912 & i11) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z21119 = z21115 | z14;
            if (((i12 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!c0Var.D(oVar2)) {
                    z15 = true;
                }
                boolean z211110 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21119 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z211110 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar111111118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111118);
                        objI0 = aVar111111118;
                    } else {
                        a aVar111111119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111119);
                        objI0 = aVar111111119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var11115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var11115;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z211110 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar1111111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111111110);
                    objI0 = aVar1111111110;
                } else {
                    a aVar1111111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111111111);
                    objI0 = aVar1111111111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11116;
            }
            oVar2 = oVar;
            if ((i12 & 6) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z211111 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z21119 | z15;
            if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                i13 = i10;
                if (!c0Var.K(i13)) {
                    z16 = true;
                }
                zD = z211111 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar1111111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111111112);
                    objI0 = aVar1111111112;
                } else {
                    a aVar1111111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111111113);
                    objI0 = aVar1111111113;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11117;
            }
            i13 = i10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            zD = z211111 | z16 | c0Var.D(s0Var);
            objI0 = c0Var.i0();
            if (zD) {
                a aVar1111111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111111114);
                objI0 = aVar1111111114;
            } else {
                a aVar1111111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111111115);
                objI0 = aVar1111111115;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var11118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var11118;
        }
        cVar2 = cVar;
        if ((805306368 & i11) == 536870912) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z113 = z111 | z12;
        if (((3670016 & i11) ^ 1572864) > 1048576) {
            f11 = f10;
            if (!c0Var.I(f11)) {
                z13 = true;
            }
            boolean z211112 = z113 | z13;
            if (((29360128 & i11) ^ 12582912) > 8388608) {
                pVar2 = pVar;
                if (!c0Var.D(pVar2)) {
                    z14 = true;
                }
                boolean z211113 = z211112 | z14;
                if (((i12 & 14) ^ 6) > 4) {
                    oVar2 = oVar;
                    if (!c0Var.D(oVar2)) {
                        z15 = true;
                    }
                    boolean z211114 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z211113 | z15;
                    if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                        i13 = i10;
                        if (!c0Var.K(i13)) {
                            z16 = true;
                        }
                        zD = z211114 | z16 | c0Var.D(s0Var);
                        objI0 = c0Var.i0();
                        if (zD) {
                            a aVar1111111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1111111116);
                            objI0 = aVar1111111116;
                        } else {
                            a aVar1111111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                            c0Var.Y(aVar1111111117);
                            objI0 = aVar1111111117;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var11119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var11119;
                    }
                    i13 = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z211114 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar1111111118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar1111111118);
                        objI0 = aVar1111111118;
                    } else {
                        a aVar1111111119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar1111111119);
                        objI0 = aVar1111111119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111110;
                }
                oVar2 = oVar;
                if ((i12 & 6) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z211115 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z211113 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z211115 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar11111111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111111110);
                        objI0 = aVar11111111110;
                    } else {
                        a aVar11111111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111111111);
                        objI0 = aVar11111111111;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111111;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z211115 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar11111111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111111112);
                    objI0 = aVar11111111112;
                } else {
                    a aVar11111111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111111113);
                    objI0 = aVar11111111113;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111112;
            }
            pVar2 = pVar;
            if ((12582912 & i11) == 8388608) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z211116 = z211112 | z14;
            if (((i12 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!c0Var.D(oVar2)) {
                    z15 = true;
                }
                boolean z211117 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z211116 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z211117 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar11111111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111111114);
                        objI0 = aVar11111111114;
                    } else {
                        a aVar11111111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar11111111115);
                        objI0 = aVar11111111115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111113;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z211117 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar11111111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111111116);
                    objI0 = aVar11111111116;
                } else {
                    a aVar11111111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111111117);
                    objI0 = aVar11111111117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111114;
            }
            oVar2 = oVar;
            if ((i12 & 6) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z211118 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z211116 | z15;
            if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                i13 = i10;
                if (!c0Var.K(i13)) {
                    z16 = true;
                }
                zD = z211118 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar11111111118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111111118);
                    objI0 = aVar11111111118;
                } else {
                    a aVar11111111119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar11111111119);
                    objI0 = aVar11111111119;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111115;
            }
            i13 = i10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            zD = z211118 | z16 | c0Var.D(s0Var);
            objI0 = c0Var.i0();
            if (zD) {
                a aVar111111111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar111111111110);
                objI0 = aVar111111111110;
            } else {
                a aVar111111111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar111111111111);
                objI0 = aVar111111111111;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var111116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var111116;
        }
        f11 = f10;
        if ((1572864 & i11) == 1048576) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z211119 = z113 | z13;
        if (((29360128 & i11) ^ 12582912) > 8388608) {
            pVar2 = pVar;
            if (!c0Var.D(pVar2)) {
                z14 = true;
            }
            boolean z2111110 = z211119 | z14;
            if (((i12 & 14) ^ 6) > 4) {
                oVar2 = oVar;
                if (!c0Var.D(oVar2)) {
                    z15 = true;
                }
                boolean z2111111 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2111110 | z15;
                if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                    i13 = i10;
                    if (!c0Var.K(i13)) {
                        z16 = true;
                    }
                    zD = z2111111 | z16 | c0Var.D(s0Var);
                    objI0 = c0Var.i0();
                    if (zD) {
                        a aVar111111111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111111112);
                        objI0 = aVar111111111112;
                    } else {
                        a aVar111111111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                        c0Var.Y(aVar111111111113);
                        objI0 = aVar111111111113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111117;
                }
                i13 = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z2111111 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar111111111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111111111114);
                    objI0 = aVar111111111114;
                } else {
                    a aVar111111111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111111111115);
                    objI0 = aVar111111111115;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111118;
            }
            oVar2 = oVar;
            if ((i12 & 6) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z2111112 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2111110 | z15;
            if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                i13 = i10;
                if (!c0Var.K(i13)) {
                    z16 = true;
                }
                zD = z2111112 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar111111111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111111111116);
                    objI0 = aVar111111111116;
                } else {
                    a aVar111111111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar111111111117);
                    objI0 = aVar111111111117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111119;
            }
            i13 = i10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            zD = z2111112 | z16 | c0Var.D(s0Var);
            objI0 = c0Var.i0();
            if (zD) {
                a aVar111111111118 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar111111111118);
                objI0 = aVar111111111118;
            } else {
                a aVar111111111119 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar111111111119);
                objI0 = aVar111111111119;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1111110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1111110;
        }
        pVar2 = pVar;
        if ((12582912 & i11) == 8388608) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z2111113 = z211119 | z14;
        if (((i12 & 14) ^ 6) > 4) {
            oVar2 = oVar;
            if (!c0Var.D(oVar2)) {
                z15 = true;
            }
            boolean z2111114 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2111113 | z15;
            if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
                i13 = i10;
                if (!c0Var.K(i13)) {
                    z16 = true;
                }
                zD = z2111114 | z16 | c0Var.D(s0Var);
                objI0 = c0Var.i0();
                if (zD) {
                    a aVar1111111111110 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111111111110);
                    objI0 = aVar1111111111110;
                } else {
                    a aVar1111111111111 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                    c0Var.Y(aVar1111111111111);
                    objI0 = aVar1111111111111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var1111111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var1111111;
            }
            i13 = i10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            zD = z2111114 | z16 | c0Var.D(s0Var);
            objI0 = c0Var.i0();
            if (zD) {
                a aVar1111111111112 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111111111112);
                objI0 = aVar1111111111112;
            } else {
                a aVar1111111111113 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111111111113);
                objI0 = aVar1111111111113;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1111112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1111112;
        }
        oVar2 = oVar;
        if ((i12 & 6) == 4) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z2111115 = ((((i12 & 896) ^ a5.S0) <= 256 && c0Var.D(function1)) || (i12 & a5.S0) == 256) | z2111113 | z15;
        if (((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
            i13 = i10;
            if (!c0Var.K(i13)) {
                z16 = true;
            }
            zD = z2111115 | z16 | c0Var.D(s0Var);
            objI0 = c0Var.i0();
            if (zD) {
                a aVar1111111111114 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111111111114);
                objI0 = aVar1111111111114;
            } else {
                a aVar1111111111115 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
                c0Var.Y(aVar1111111111115);
                objI0 = aVar1111111111115;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1111113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1111113;
        }
        i13 = i10;
        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 131072) {
            z16 = true;
        } else {
            z16 = false;
        }
        zD = z2111115 | z16 | c0Var.D(s0Var);
        objI0 = c0Var.i0();
        if (zD) {
            a aVar1111111111116 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
            c0Var.Y(aVar1111111111116);
            objI0 = aVar1111111111116;
        } else {
            a aVar1111111111117 = new a(i1Var, q3Var, g5Var, z10, f11, pVar2, function0, function1, cVar2, bVar2, i13, oVar2, s0Var);
            c0Var.Y(aVar1111111111117);
            objI0 = aVar1111111111117;
        }
        androidx.compose.foundation.lazy.layout.v0 v0Var1111114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v0Var1111114;
    }
}
