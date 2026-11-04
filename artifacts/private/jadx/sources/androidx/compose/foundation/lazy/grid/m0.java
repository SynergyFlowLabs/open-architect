package androidx.compose.foundation.lazy.grid;

import android.os.Trace;
import androidx.compose.foundation.c5;
import androidx.compose.foundation.gestures.c3;
import androidx.compose.foundation.gestures.l4;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.foundation.lazy.layout.z2;
import androidx.compose.foundation.x3;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.i2;
import androidx.media3.exoplayer.a5;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,458:1\n113#2:459\n607#3:460\n604#3,6:461\n1282#4,3:467\n1285#4,3:471\n1282#4,6:476\n605#5:470\n75#6:474\n75#6:475\n27#7,5:482\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n67#1:459\n89#1:460\n89#1:461,6\n89#1:467,3\n89#1:471,3\n181#1:476,6\n89#1:470\n90#1:474\n91#1:475\n441#1:482,5\n*E\n"})
public final class m0 {

    @SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,458:1\n109#2,5:459\n109#2,5:464\n32#3:469\n32#3:471\n80#4:470\n80#4:472\n604#5,7:473\n35#6,5:480\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt$rememberLazyGridMeasurePolicy$1$1\n*L\n241#1:459,5\n246#1:464,5\n263#1:469\n270#1:471\n263#1:470\n270#1:472\n354#1:473,7\n338#1:480,5\n*E\n"})
    static final class a implements androidx.compose.foundation.lazy.layout.v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x1 f16873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g5 f16875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f16876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<z> f16877e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ l1 f16878f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.q.m f16879g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.q.e f16880h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f16881i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.o1 f16882j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ z2 f16883k;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.m0$a$a, reason: collision with other inner class name */
        public static final class C0106a extends x0 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.w0 f16884g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ x1 f16885h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f16886i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f16887j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f16888k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f16889l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ long f16890m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0106a(z zVar, androidx.compose.foundation.lazy.layout.w0 w0Var, int i10, x1 x1Var, boolean z10, boolean z11, int i11, int i12, long j10) {
                super(zVar, w0Var, i10);
                this.f16884g = w0Var;
                this.f16885h = x1Var;
                this.f16886i = z10;
                this.f16887j = z11;
                this.f16888k = i11;
                this.f16889l = i12;
                this.f16890m = j10;
            }

            @Override // androidx.compose.foundation.lazy.grid.x0
            public v0 c(int i10, Object obj, Object obj2, int i11, int i12, List<? extends i2> list, long j10, int i13, int i14) {
                return new v0(i10, obj, this.f16886i, i11, i12, this.f16887j, this.f16884g.getLayoutDirection(), this.f16888k, this.f16889l, list, this.f16890m, obj2, this.f16885h.K(), j10, i13, i14, null);
            }
        }

        public static final class b extends z0 {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f16891h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ k1 f16892i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(boolean z10, k1 k1Var, int i10, int i11, C0106a c0106a, o1 o1Var) {
                super(z10, k1Var, i10, i11, c0106a, o1Var);
                this.f16891h = z10;
                this.f16892i = k1Var;
            }

            @Override // androidx.compose.foundation.lazy.grid.z0
            public y0 b(int i10, v0[] v0VarArr, List<c> list, int i11) {
                return new y0(i10, v0VarArr, this.f16892i, list, this.f16891h, i11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(x1 x1Var, boolean z10, g5 g5Var, boolean z11, Function0<? extends z> function0, l1 l1Var, androidx.compose.foundation.layout.q.m mVar, androidx.compose.foundation.layout.q.e eVar, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.o1 o1Var, z2 z2Var) {
            this.f16873a = x1Var;
            this.f16874b = z10;
            this.f16875c = g5Var;
            this.f16876d = z11;
            this.f16877e = function0;
            this.f16878f = l1Var;
            this.f16879g = mVar;
            this.f16880h = eVar;
            this.f16881i = s0Var;
            this.f16882j = o1Var;
            this.f16883k = z2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ArrayList e(o1 o1Var, b bVar, int i10) {
            o1.c cVarD = o1Var.d(i10);
            int iA = cVarD.a();
            ArrayList arrayList = new ArrayList(cVarD.b().size());
            List<c> listB = cVarD.b();
            int size = listB.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iE = c.e(listB.get(i12).h());
                arrayList.add(TuplesKt.to(Integer.valueOf(iA), androidx.compose.ui.unit.b.a(bVar.a(i11, iE))));
                iA++;
                i11 += iE;
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(o1 o1Var, int i10) {
            return o1Var.e(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 g(androidx.compose.foundation.lazy.layout.w0 w0Var, long j10, int i10, int i11, int i12, int i13, Function1 function1) {
            return w0Var.S6(androidx.compose.ui.unit.c.i(j10, i12 + i10), androidx.compose.ui.unit.c.h(j10, i13 + i11), MapsKt.emptyMap(), function1);
        }

        /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.foundation.lazy.grid.k0] */
        @Override // androidx.compose.foundation.lazy.layout.v0
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.foundation.lazy.layout.w0 w0Var, final long j10) {
            float fA;
            long jF;
            int iE;
            int iG;
            n2.a(this.f16873a.M());
            boolean z10 = this.f16873a.H() || w0Var.P5();
            androidx.compose.foundation.g1.a(j10, this.f16874b ? q3.Vertical : q3.Horizontal);
            int iG6 = this.f16874b ? w0Var.g6(this.f16875c.b(w0Var.getLayoutDirection())) : w0Var.g6(d5.o(this.f16875c, w0Var.getLayoutDirection()));
            int iG7 = this.f16874b ? w0Var.g6(this.f16875c.c(w0Var.getLayoutDirection())) : w0Var.g6(d5.n(this.f16875c, w0Var.getLayoutDirection()));
            int iG8 = w0Var.g6(this.f16875c.d());
            int iG9 = w0Var.g6(this.f16875c.a());
            final int i10 = iG8 + iG9;
            final int i11 = iG6 + iG7;
            boolean z11 = this.f16874b;
            int i12 = z11 ? i10 : i11;
            if (z11 && !this.f16876d) {
                iG7 = iG8;
            } else if (z11 && this.f16876d) {
                iG7 = iG9;
            } else if (!z11 && !this.f16876d) {
                iG7 = iG6;
            }
            int i13 = i12 - iG7;
            long jQ = androidx.compose.ui.unit.c.q(j10, -i11, -i10);
            z zVarInvoke = this.f16877e.invoke();
            final o1 o1VarJ = zVarInvoke.j();
            k1 k1VarA = this.f16878f.a(w0Var, jQ);
            int length = k1VarA.b().length;
            o1VarJ.j(length);
            if (this.f16874b) {
                androidx.compose.foundation.layout.q.m mVar = this.f16879g;
                if (mVar == null) {
                    androidx.compose.foundation.internal.e.h("null verticalArrangement when isVertical == true");
                    throw new kotlin.a0();
                }
                fA = mVar.a();
            } else {
                androidx.compose.foundation.layout.q.e eVar = this.f16880h;
                if (eVar == null) {
                    androidx.compose.foundation.internal.e.h("null horizontalArrangement when isVertical == false");
                    throw new kotlin.a0();
                }
                fA = eVar.a();
            }
            int iG10 = w0Var.g6(fA);
            int iA = zVarInvoke.a();
            int iO = this.f16874b ? androidx.compose.ui.unit.b.o(j10) - i10 : androidx.compose.ui.unit.b.p(j10) - i11;
            if (!this.f16876d || iO > 0) {
                jF = androidx.compose.ui.unit.q.f((((long) iG6) << 32) | (((long) iG8) & com.rabbitmq.client.k0.f265952a));
            } else {
                boolean z12 = this.f16874b;
                if (!z12) {
                    iG6 += iO;
                }
                if (z12) {
                    iG8 += iO;
                }
                jF = androidx.compose.ui.unit.q.f((((long) iG6) << 32) | (((long) iG8) & com.rabbitmq.client.k0.f265952a));
            }
            int i14 = iG7;
            C0106a c0106a = new C0106a(zVarInvoke, w0Var, iG10, this.f16873a, this.f16874b, this.f16876d, i14, i13, jF);
            final b bVar = new b(this.f16874b, k1VarA, iA, iG10, c0106a, o1VarJ);
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.j0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return m0.a.e(o1VarJ, bVar, ((Integer) obj).intValue());
                }
            };
            ?? r10 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.k0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(m0.a.f(o1VarJ, ((Integer) obj).intValue()));
                }
            };
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            x1 x1Var = this.f16873a;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                int iO0 = x1Var.o0(zVarInvoke, x1Var.F());
                if (iO0 < iA || iA <= 0) {
                    iE = o1VarJ.e(iO0);
                    iG = x1Var.G();
                } else {
                    iE = o1VarJ.e(iA - 1);
                    iG = 0;
                }
                int i15 = iE;
                Unit unit = Unit.f312394a;
                aVar.x(mVarG, mVarM, function1L);
                u0 u0VarJ = t0.j(iA, bVar, c0106a, iO, i14, i13, iG10, i15, iG, (w0Var.P5() || !z10) ? this.f16873a.a0() : this.f16873a.Z(), jQ, this.f16874b, this.f16879g, this.f16880h, this.f16876d, w0Var, this.f16873a.K(), length, androidx.compose.foundation.lazy.layout.v.a(zVarInvoke, this.f16873a.R(), this.f16873a.D()), z10, w0Var.P5(), this.f16873a.B(), this.f16881i, this.f16873a.S(), this.f16882j, function1, r10, this.f16883k, new pj.n() { // from class: androidx.compose.foundation.lazy.grid.l0
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return m0.a.g(w0Var, j10, i11, i10, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (Function1) obj3);
                    }
                });
                x1.A(this.f16873a, u0VarJ, w0Var.P5(), false, 4, null);
                Object objV = this.f16873a.V();
                androidx.compose.foundation.lazy.layout.g gVar = objV instanceof androidx.compose.foundation.lazy.layout.g ? (androidx.compose.foundation.lazy.layout.g) objV : null;
                if (gVar != null) {
                    m0.e(gVar, u0VarJ.getOrientation(), u0VarJ.h(), bVar);
                }
                return u0VarJ;
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0129  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0164  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0171  */
    /* JADX WARN: Code duplicated, block: B:127:0x0175  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:134:0x018c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0196  */
    /* JADX WARN: Code duplicated, block: B:141:0x019f  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:150:0x01bb A[PHI: r2 r3 r4 r11
      0x01bb: PHI (r2v17 androidx.compose.ui.a0) = (r2v10 androidx.compose.ui.a0), (r2v20 androidx.compose.ui.a0) binds: [B:161:0x01d8, B:149:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r3v19 androidx.compose.foundation.layout.g5) = (r3v6 androidx.compose.foundation.layout.g5), (r3v20 androidx.compose.foundation.layout.g5) binds: [B:161:0x01d8, B:149:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r4v20 boolean) = (r4v14 boolean), (r4v21 boolean) binds: [B:161:0x01d8, B:149:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01bb: PHI (r11v35 int) = (r11v23 int), (r11v36 int) binds: [B:161:0x01d8, B:149:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:162:0x01da  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:168:0x021a  */
    /* JADX WARN: Code duplicated, block: B:171:0x023f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0246  */
    /* JADX WARN: Code duplicated, block: B:175:0x0279  */
    /* JADX WARN: Code duplicated, block: B:177:0x027d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0282  */
    /* JADX WARN: Code duplicated, block: B:181:0x029b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0313  */
    /* JADX WARN: Code duplicated, block: B:186:0x031c  */
    /* JADX WARN: Code duplicated, block: B:189:0x032a  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x011f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final x1 x1Var, @NotNull final l1 l1Var, @Nullable g5 g5Var, boolean z10, final boolean z11, @Nullable c3 c3Var, final boolean z12, @Nullable final x3 x3Var, @NotNull final androidx.compose.foundation.layout.q.m mVar, @NotNull final androidx.compose.foundation.layout.q.e eVar, @NotNull final Function1<? super f1, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        g5 g5Var2;
        int i14;
        boolean z13;
        int i15;
        int i16;
        c3 c3Var2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z14;
        final g5 g5Var3;
        final boolean z15;
        final androidx.compose.ui.a0 a0Var3;
        final c3 c3Var3;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        g5 g5VarF;
        boolean z16;
        c3 c3VarA;
        int i23;
        int i24;
        Object objI0;
        z2 z2VarA;
        q3 q3Var;
        q3 q3Var2;
        androidx.compose.ui.a0 a0VarB;
        int i25;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(708740370);
        int i26 = i12 & 1;
        if (i26 != 0) {
            i13 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= c0VarR.D(x1Var) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i13 |= (i10 & 512) == 0 ? c0VarR.D(l1Var) : c0VarR.k0(l1Var) ? 256 : 128;
        }
        int i27 = i12 & 8;
        if (i27 == 0) {
            if ((i10 & 3072) == 0) {
                g5Var2 = g5Var;
                i13 |= c0VarR.D(g5Var2) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    z13 = z10;
                    if (c0VarR.G(z13)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i12 & 32) != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i13 |= i16;
                }
                if ((i10 & 1572864) == 0) {
                    c3Var2 = c3Var;
                    if ((i12 & 64) == 0 || !c0VarR.D(c3Var2)) {
                        i25 = 524288;
                    } else {
                        i25 = 1048576;
                    }
                    i13 |= i25;
                } else {
                    c3Var2 = c3Var;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i12 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(x3Var)) {
                            i18 = 67108864;
                        } else {
                            i18 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i18;
                    }
                    if ((i12 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.D(mVar)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                            i13 |= i19;
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c0VarR.D(eVar)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i12 & 2048) != 0) {
                            i20 |= 48;
                        } else if ((i11 & 48) == 0) {
                            i20 |= c0VarR.k0(function1) ? 32 : 16;
                        }
                        i22 = i20;
                        if ((i13 & 306783379) == 306783378 || (i22 & 19) != 18) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i26 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i27 != 0) {
                                    g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                                } else {
                                    g5VarF = g5Var2;
                                }
                                z16 = i14 == 0 ? z13 : false;
                                if ((i12 & 64) != 0) {
                                    c3VarA = l4.f14799a.a(c0VarR, 6);
                                    i23 = i13 & (-3670017);
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                                }
                                i24 = (i23 >> 3) & 14;
                                Function0<z> function0C = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                                int i28 = i23 >> 9;
                                androidx.compose.foundation.lazy.layout.q1 q1VarA = f2.a(x1Var, z16, c0VarR, (i28 & com.planner5d.library.engine.input.f.b.B) | i24);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                    c0VarR.Y(objI0);
                                }
                                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
                                androidx.compose.ui.graphics.o1 o1Var = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                                    z2VarA = null;
                                } else {
                                    z2VarA = z2.f17630a.a();
                                }
                                androidx.compose.ui.a0 a0Var5 = a0Var4;
                                int i29 = i23;
                                androidx.compose.foundation.lazy.layout.v0 v0VarF = f(function0C, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var, o1Var, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                                g5 g5Var4 = g5VarF;
                                if (z11) {
                                    q3Var = q3.Vertical;
                                } else {
                                    q3Var = q3.Horizontal;
                                }
                                q3Var2 = q3Var;
                                if (z12) {
                                    c0VarR.E(27343139);
                                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(27639344);
                                    c0VarR.A();
                                    a0VarB = androidx.compose.ui.a0.E;
                                }
                                boolean z17 = z16;
                                c3 c3Var4 = c3VarA;
                                androidx.compose.foundation.lazy.layout.u0.c(function0C, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var5.B2(x1Var.Y()).B2(x1Var.C()), function0C, q1VarA, q3Var2, z12, z17, c0VarR, (i28 & 57344) | ((i29 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z17, c3Var4, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF, c0VarR, 0, 0);
                                c0VarR = c0VarR;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                c3Var3 = c3Var4;
                                z15 = z17;
                                g5Var3 = g5Var4;
                                a0Var3 = a0Var5;
                            } else {
                                c0VarR.u();
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                g5VarF = g5Var2;
                                z16 = z13;
                                a0Var4 = a0Var2;
                            }
                            i23 = i13;
                            c3VarA = c3Var2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                            }
                            i24 = (i23 >> 3) & 14;
                            Function0<z> function0C2 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                            int i210 = i23 >> 9;
                            androidx.compose.foundation.lazy.layout.q1 q1VarA2 = f2.a(x1Var, z16, c0VarR, (i210 & com.planner5d.library.engine.input.f.b.B) | i24);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) objI0;
                            androidx.compose.ui.graphics.o1 o1Var2 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                            if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                                z2VarA = z2.f17630a.a();
                            } else {
                                z2VarA = null;
                            }
                            androidx.compose.ui.a0 a0Var6 = a0Var4;
                            int i211 = i23;
                            androidx.compose.foundation.lazy.layout.v0 v0VarF2 = f(function0C2, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var2, o1Var2, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                            g5 g5Var5 = g5VarF;
                            if (z11) {
                                q3Var = q3.Vertical;
                            } else {
                                q3Var = q3.Horizontal;
                            }
                            q3Var2 = q3Var;
                            if (z12) {
                                c0VarR.E(27343139);
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                                c0VarR.A();
                            } else {
                                c0VarR.E(27639344);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            boolean z18 = z16;
                            c3 c3Var5 = c3VarA;
                            androidx.compose.foundation.lazy.layout.u0.c(function0C2, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var6.B2(x1Var.Y()).B2(x1Var.C()), function0C2, q1VarA2, q3Var2, z12, z18, c0VarR, (i210 & 57344) | ((i211 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z18, c3Var5, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF2, c0VarR, 0, 0);
                            c0VarR = c0VarR;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            c3Var3 = c3Var5;
                            z15 = z18;
                            g5Var3 = g5Var5;
                            a0Var3 = a0Var6;
                        } else {
                            c0VarR.u();
                            g5Var3 = g5Var2;
                            z15 = z13;
                            a0Var3 = a0Var2;
                            c3Var3 = c3Var2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i13 |= 805306368;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.D(eVar)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i20 |= 48;
                    } else if ((i11 & 48) == 0) {
                        i20 |= c0VarR.k0(function1) ? 32 : 16;
                    }
                    i22 = i20;
                    if ((i13 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                        }
                        i24 = (i23 >> 3) & 14;
                        Function0<z> function0C3 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                        int i212 = i23 >> 9;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA3 = f2.a(x1Var, z16, c0VarR, (i212 & com.planner5d.library.engine.input.f.b.B) | i24);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        kotlinx.coroutines.s0 s0Var3 = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.graphics.o1 o1Var3 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                        if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                            z2VarA = z2.f17630a.a();
                        } else {
                            z2VarA = null;
                        }
                        androidx.compose.ui.a0 a0Var7 = a0Var4;
                        int i213 = i23;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF3 = f(function0C3, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var3, o1Var3, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                        g5 g5Var6 = g5VarF;
                        if (z11) {
                            q3Var = q3.Vertical;
                        } else {
                            q3Var = q3.Horizontal;
                        }
                        q3Var2 = q3Var;
                        if (z12) {
                            c0VarR.E(27343139);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                            c0VarR.A();
                        } else {
                            c0VarR.E(27639344);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z19 = z16;
                        c3 c3Var6 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C3, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var7.B2(x1Var.Y()).B2(x1Var.C()), function0C3, q1VarA3, q3Var2, z12, z19, c0VarR, (i212 & 57344) | ((i213 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z19, c3Var6, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF3, c0VarR, 0, 0);
                        c0VarR = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c3Var3 = c3Var6;
                        z15 = z19;
                        g5Var3 = g5Var6;
                        a0Var3 = a0Var7;
                    } else {
                        c0VarR.u();
                        g5Var3 = g5Var2;
                        z15 = z13;
                        a0Var3 = a0Var2;
                        c3Var3 = c3Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 100663296;
                if ((i12 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(mVar)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.D(eVar)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i20 |= 48;
                    } else if ((i11 & 48) == 0) {
                        i20 |= c0VarR.k0(function1) ? 32 : 16;
                    }
                    i22 = i20;
                    if ((i13 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                        }
                        i24 = (i23 >> 3) & 14;
                        Function0<z> function0C4 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                        int i214 = i23 >> 9;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA4 = f2.a(x1Var, z16, c0VarR, (i214 & com.planner5d.library.engine.input.f.b.B) | i24);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        kotlinx.coroutines.s0 s0Var4 = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.graphics.o1 o1Var4 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                        if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                            z2VarA = z2.f17630a.a();
                        } else {
                            z2VarA = null;
                        }
                        androidx.compose.ui.a0 a0Var8 = a0Var4;
                        int i215 = i23;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF4 = f(function0C4, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var4, o1Var4, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                        g5 g5Var7 = g5VarF;
                        if (z11) {
                            q3Var = q3.Vertical;
                        } else {
                            q3Var = q3.Horizontal;
                        }
                        q3Var2 = q3Var;
                        if (z12) {
                            c0VarR.E(27343139);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                            c0VarR.A();
                        } else {
                            c0VarR.E(27639344);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z110 = z16;
                        c3 c3Var7 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C4, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var8.B2(x1Var.Y()).B2(x1Var.C()), function0C4, q1VarA4, q3Var2, z12, z110, c0VarR, (i214 & 57344) | ((i215 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z110, c3Var7, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF4, c0VarR, 0, 0);
                        c0VarR = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c3Var3 = c3Var7;
                        z15 = z110;
                        g5Var3 = g5Var7;
                        a0Var3 = a0Var8;
                    } else {
                        c0VarR.u();
                        g5Var3 = g5Var2;
                        z15 = z13;
                        a0Var3 = a0Var2;
                        c3Var3 = c3Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.D(eVar)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) == 0) {
                    i20 |= c0VarR.k0(function1) ? 32 : 16;
                }
                i22 = i20;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i24 = (i23 >> 3) & 14;
                    Function0<z> function0C5 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                    int i216 = i23 >> 9;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA5 = f2.a(x1Var, z16, c0VarR, (i216 & com.planner5d.library.engine.input.f.b.B) | i24);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var5 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var5 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    androidx.compose.ui.a0 a0Var9 = a0Var4;
                    int i217 = i23;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF5 = f(function0C5, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var5, o1Var5, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                    g5 g5Var8 = g5VarF;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(27343139);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(27639344);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z111 = z16;
                    c3 c3Var8 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C5, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var9.B2(x1Var.Y()).B2(x1Var.C()), function0C5, q1VarA5, q3Var2, z12, z111, c0VarR, (i216 & 57344) | ((i217 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z111, c3Var8, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF5, c0VarR, 0, 0);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c3Var3 = c3Var8;
                    z15 = z111;
                    g5Var3 = g5Var8;
                    a0Var3 = a0Var9;
                } else {
                    c0VarR.u();
                    g5Var3 = g5Var2;
                    z15 = z13;
                    a0Var3 = a0Var2;
                    c3Var3 = c3Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z13 = z10;
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.G(z11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
            }
            if ((i10 & 1572864) == 0) {
                c3Var2 = c3Var;
                if ((i12 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i13 |= i25;
            } else {
                c3Var2 = c3Var;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i12 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(x3Var)) {
                        i18 = 67108864;
                    } else {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i18;
                }
                if ((i12 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(mVar)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.D(eVar)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i20 |= 48;
                    } else if ((i11 & 48) == 0) {
                        i20 |= c0VarR.k0(function1) ? 32 : 16;
                    }
                    i22 = i20;
                    if ((i13 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                        }
                        i24 = (i23 >> 3) & 14;
                        Function0<z> function0C6 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                        int i218 = i23 >> 9;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA6 = f2.a(x1Var, z16, c0VarR, (i218 & com.planner5d.library.engine.input.f.b.B) | i24);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        kotlinx.coroutines.s0 s0Var6 = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.graphics.o1 o1Var6 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                        if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                            z2VarA = z2.f17630a.a();
                        } else {
                            z2VarA = null;
                        }
                        androidx.compose.ui.a0 a0Var10 = a0Var4;
                        int i219 = i23;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF6 = f(function0C6, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var6, o1Var6, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                        g5 g5Var9 = g5VarF;
                        if (z11) {
                            q3Var = q3.Vertical;
                        } else {
                            q3Var = q3.Horizontal;
                        }
                        q3Var2 = q3Var;
                        if (z12) {
                            c0VarR.E(27343139);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                            c0VarR.A();
                        } else {
                            c0VarR.E(27639344);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z112 = z16;
                        c3 c3Var9 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C6, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var10.B2(x1Var.Y()).B2(x1Var.C()), function0C6, q1VarA6, q3Var2, z12, z112, c0VarR, (i218 & 57344) | ((i219 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z112, c3Var9, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF6, c0VarR, 0, 0);
                        c0VarR = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c3Var3 = c3Var9;
                        z15 = z112;
                        g5Var3 = g5Var9;
                        a0Var3 = a0Var10;
                    } else {
                        c0VarR.u();
                        g5Var3 = g5Var2;
                        z15 = z13;
                        a0Var3 = a0Var2;
                        c3Var3 = c3Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.D(eVar)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) == 0) {
                    i20 |= c0VarR.k0(function1) ? 32 : 16;
                }
                i22 = i20;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i24 = (i23 >> 3) & 14;
                    Function0<z> function0C7 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                    int i2110 = i23 >> 9;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA7 = f2.a(x1Var, z16, c0VarR, (i2110 & com.planner5d.library.engine.input.f.b.B) | i24);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var7 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var7 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    androidx.compose.ui.a0 a0Var11 = a0Var4;
                    int i2111 = i23;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF7 = f(function0C7, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var7, o1Var7, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                    g5 g5Var10 = g5VarF;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(27343139);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(27639344);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z113 = z16;
                    c3 c3Var10 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C7, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var11.B2(x1Var.Y()).B2(x1Var.C()), function0C7, q1VarA7, q3Var2, z12, z113, c0VarR, (i2110 & 57344) | ((i2111 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z113, c3Var10, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF7, c0VarR, 0, 0);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c3Var3 = c3Var10;
                    z15 = z113;
                    g5Var3 = g5Var10;
                    a0Var3 = a0Var11;
                } else {
                    c0VarR.u();
                    g5Var3 = g5Var2;
                    z15 = z13;
                    a0Var3 = a0Var2;
                    c3Var3 = c3Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            if ((i12 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(mVar)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.D(eVar)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) == 0) {
                    i20 |= c0VarR.k0(function1) ? 32 : 16;
                }
                i22 = i20;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i24 = (i23 >> 3) & 14;
                    Function0<z> function0C8 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                    int i2112 = i23 >> 9;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA8 = f2.a(x1Var, z16, c0VarR, (i2112 & com.planner5d.library.engine.input.f.b.B) | i24);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var8 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var8 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    androidx.compose.ui.a0 a0Var12 = a0Var4;
                    int i2113 = i23;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF8 = f(function0C8, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var8, o1Var8, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                    g5 g5Var11 = g5VarF;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(27343139);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(27639344);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z114 = z16;
                    c3 c3Var11 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C8, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var12.B2(x1Var.Y()).B2(x1Var.C()), function0C8, q1VarA8, q3Var2, z12, z114, c0VarR, (i2112 & 57344) | ((i2113 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z114, c3Var11, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF8, c0VarR, 0, 0);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c3Var3 = c3Var11;
                    z15 = z114;
                    g5Var3 = g5Var11;
                    a0Var3 = a0Var12;
                } else {
                    c0VarR.u();
                    g5Var3 = g5Var2;
                    z15 = z13;
                    a0Var3 = a0Var2;
                    c3Var3 = c3Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.D(eVar)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i12 & 2048) != 0) {
                i20 |= 48;
            } else if ((i11 & 48) == 0) {
                i20 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i22 = i20;
            if ((i13 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i24 = (i23 >> 3) & 14;
                Function0<z> function0C9 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                int i2114 = i23 >> 9;
                androidx.compose.foundation.lazy.layout.q1 q1VarA9 = f2.a(x1Var, z16, c0VarR, (i2114 & com.planner5d.library.engine.input.f.b.B) | i24);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var9 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.graphics.o1 o1Var9 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                    z2VarA = z2.f17630a.a();
                } else {
                    z2VarA = null;
                }
                androidx.compose.ui.a0 a0Var13 = a0Var4;
                int i2115 = i23;
                androidx.compose.foundation.lazy.layout.v0 v0VarF9 = f(function0C9, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var9, o1Var9, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                g5 g5Var12 = g5VarF;
                if (z11) {
                    q3Var = q3.Vertical;
                } else {
                    q3Var = q3.Horizontal;
                }
                q3Var2 = q3Var;
                if (z12) {
                    c0VarR.E(27343139);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                    c0VarR.A();
                } else {
                    c0VarR.E(27639344);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z115 = z16;
                c3 c3Var12 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C9, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var13.B2(x1Var.Y()).B2(x1Var.C()), function0C9, q1VarA9, q3Var2, z12, z115, c0VarR, (i2114 & 57344) | ((i2115 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z115, c3Var12, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF9, c0VarR, 0, 0);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c3Var3 = c3Var12;
                z15 = z115;
                g5Var3 = g5Var12;
                a0Var3 = a0Var13;
            } else {
                c0VarR.u();
                g5Var3 = g5Var2;
                z15 = z13;
                a0Var3 = a0Var2;
                c3Var3 = c3Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        g5Var2 = g5Var;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i10 & 24576) == 0) {
                z13 = z10;
                if (c0VarR.G(z13)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.G(z11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i13 |= i16;
            }
            if ((i10 & 1572864) == 0) {
                c3Var2 = c3Var;
                if ((i12 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i13 |= i25;
            } else {
                c3Var2 = c3Var;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i12 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(x3Var)) {
                        i18 = 67108864;
                    } else {
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i18;
                }
                if ((i12 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.D(mVar)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i13 |= i19;
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.D(eVar)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i12 & 2048) != 0) {
                        i20 |= 48;
                    } else if ((i11 & 48) == 0) {
                        i20 |= c0VarR.k0(function1) ? 32 : 16;
                    }
                    i22 = i20;
                    if ((i13 & 306783379) == 306783378) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (c0VarR.h(z14, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i27 != 0) {
                                g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                            } else {
                                g5VarF = g5Var2;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                c3VarA = l4.f14799a.a(c0VarR, 6);
                                i23 = i13 & (-3670017);
                            } else {
                                i23 = i13;
                                c3VarA = c3Var2;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                        }
                        i24 = (i23 >> 3) & 14;
                        Function0<z> function0C10 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                        int i2116 = i23 >> 9;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA10 = f2.a(x1Var, z16, c0VarR, (i2116 & com.planner5d.library.engine.input.f.b.B) | i24);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        kotlinx.coroutines.s0 s0Var10 = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.graphics.o1 o1Var10 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                        if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                            z2VarA = z2.f17630a.a();
                        } else {
                            z2VarA = null;
                        }
                        androidx.compose.ui.a0 a0Var14 = a0Var4;
                        int i2117 = i23;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF10 = f(function0C10, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var10, o1Var10, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                        g5 g5Var13 = g5VarF;
                        if (z11) {
                            q3Var = q3.Vertical;
                        } else {
                            q3Var = q3.Horizontal;
                        }
                        q3Var2 = q3Var;
                        if (z12) {
                            c0VarR.E(27343139);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                            c0VarR.A();
                        } else {
                            c0VarR.E(27639344);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        boolean z116 = z16;
                        c3 c3Var13 = c3VarA;
                        androidx.compose.foundation.lazy.layout.u0.c(function0C10, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var14.B2(x1Var.Y()).B2(x1Var.C()), function0C10, q1VarA10, q3Var2, z12, z116, c0VarR, (i2116 & 57344) | ((i2117 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z116, c3Var13, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF10, c0VarR, 0, 0);
                        c0VarR = c0VarR;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c3Var3 = c3Var13;
                        z15 = z116;
                        g5Var3 = g5Var13;
                        a0Var3 = a0Var14;
                    } else {
                        c0VarR.u();
                        g5Var3 = g5Var2;
                        z15 = z13;
                        a0Var3 = a0Var2;
                        c3Var3 = c3Var2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.D(eVar)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) == 0) {
                    i20 |= c0VarR.k0(function1) ? 32 : 16;
                }
                i22 = i20;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i24 = (i23 >> 3) & 14;
                    Function0<z> function0C11 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                    int i2118 = i23 >> 9;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA11 = f2.a(x1Var, z16, c0VarR, (i2118 & com.planner5d.library.engine.input.f.b.B) | i24);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var11 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var11 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    androidx.compose.ui.a0 a0Var15 = a0Var4;
                    int i2119 = i23;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF11 = f(function0C11, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var11, o1Var11, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                    g5 g5Var14 = g5VarF;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(27343139);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(27639344);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z117 = z16;
                    c3 c3Var14 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C11, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var15.B2(x1Var.Y()).B2(x1Var.C()), function0C11, q1VarA11, q3Var2, z12, z117, c0VarR, (i2118 & 57344) | ((i2119 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z117, c3Var14, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF11, c0VarR, 0, 0);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c3Var3 = c3Var14;
                    z15 = z117;
                    g5Var3 = g5Var14;
                    a0Var3 = a0Var15;
                } else {
                    c0VarR.u();
                    g5Var3 = g5Var2;
                    z15 = z13;
                    a0Var3 = a0Var2;
                    c3Var3 = c3Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 100663296;
            if ((i12 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(mVar)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.D(eVar)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) == 0) {
                    i20 |= c0VarR.k0(function1) ? 32 : 16;
                }
                i22 = i20;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i24 = (i23 >> 3) & 14;
                    Function0<z> function0C12 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                    int i21110 = i23 >> 9;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA12 = f2.a(x1Var, z16, c0VarR, (i21110 & com.planner5d.library.engine.input.f.b.B) | i24);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var12 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var12 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    androidx.compose.ui.a0 a0Var16 = a0Var4;
                    int i21111 = i23;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF12 = f(function0C12, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var12, o1Var12, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                    g5 g5Var15 = g5VarF;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(27343139);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(27639344);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z118 = z16;
                    c3 c3Var15 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C12, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var16.B2(x1Var.Y()).B2(x1Var.C()), function0C12, q1VarA12, q3Var2, z12, z118, c0VarR, (i21110 & 57344) | ((i21111 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z118, c3Var15, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF12, c0VarR, 0, 0);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c3Var3 = c3Var15;
                    z15 = z118;
                    g5Var3 = g5Var15;
                    a0Var3 = a0Var16;
                } else {
                    c0VarR.u();
                    g5Var3 = g5Var2;
                    z15 = z13;
                    a0Var3 = a0Var2;
                    c3Var3 = c3Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.D(eVar)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i12 & 2048) != 0) {
                i20 |= 48;
            } else if ((i11 & 48) == 0) {
                i20 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i22 = i20;
            if ((i13 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i24 = (i23 >> 3) & 14;
                Function0<z> function0C13 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                int i21112 = i23 >> 9;
                androidx.compose.foundation.lazy.layout.q1 q1VarA13 = f2.a(x1Var, z16, c0VarR, (i21112 & com.planner5d.library.engine.input.f.b.B) | i24);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var13 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.graphics.o1 o1Var13 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                    z2VarA = z2.f17630a.a();
                } else {
                    z2VarA = null;
                }
                androidx.compose.ui.a0 a0Var17 = a0Var4;
                int i21113 = i23;
                androidx.compose.foundation.lazy.layout.v0 v0VarF13 = f(function0C13, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var13, o1Var13, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                g5 g5Var16 = g5VarF;
                if (z11) {
                    q3Var = q3.Vertical;
                } else {
                    q3Var = q3.Horizontal;
                }
                q3Var2 = q3Var;
                if (z12) {
                    c0VarR.E(27343139);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                    c0VarR.A();
                } else {
                    c0VarR.E(27639344);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z119 = z16;
                c3 c3Var16 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C13, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var17.B2(x1Var.Y()).B2(x1Var.C()), function0C13, q1VarA13, q3Var2, z12, z119, c0VarR, (i21112 & 57344) | ((i21113 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z119, c3Var16, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF13, c0VarR, 0, 0);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c3Var3 = c3Var16;
                z15 = z119;
                g5Var3 = g5Var16;
                a0Var3 = a0Var17;
            } else {
                c0VarR.u();
                g5Var3 = g5Var2;
                z15 = z13;
                a0Var3 = a0Var2;
                c3Var3 = c3Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z13 = z10;
        if ((i12 & 32) != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.G(z11)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i13 |= i16;
        }
        if ((i10 & 1572864) == 0) {
            c3Var2 = c3Var;
            if ((i12 & 64) == 0) {
                i25 = 524288;
            } else {
                i25 = 524288;
            }
            i13 |= i25;
        } else {
            c3Var2 = c3Var;
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.G(z12)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        if ((i12 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(x3Var)) {
                    i18 = 67108864;
                } else {
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i18;
            }
            if ((i12 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.D(mVar)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.D(eVar)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) == 0) {
                    i20 |= c0VarR.k0(function1) ? 32 : 16;
                }
                i22 = i20;
                if ((i13 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (c0VarR.h(z14, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i27 != 0) {
                            g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                        } else {
                            g5VarF = g5Var2;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            c3VarA = l4.f14799a.a(c0VarR, 6);
                            i23 = i13 & (-3670017);
                        } else {
                            i23 = i13;
                            c3VarA = c3Var2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                    }
                    i24 = (i23 >> 3) & 14;
                    Function0<z> function0C14 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                    int i21114 = i23 >> 9;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA14 = f2.a(x1Var, z16, c0VarR, (i21114 & com.planner5d.library.engine.input.f.b.B) | i24);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var14 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var14 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    androidx.compose.ui.a0 a0Var18 = a0Var4;
                    int i21115 = i23;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF14 = f(function0C14, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var14, o1Var14, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                    g5 g5Var17 = g5VarF;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(27343139);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(27639344);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    boolean z1110 = z16;
                    c3 c3Var17 = c3VarA;
                    androidx.compose.foundation.lazy.layout.u0.c(function0C14, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var18.B2(x1Var.Y()).B2(x1Var.C()), function0C14, q1VarA14, q3Var2, z12, z1110, c0VarR, (i21114 & 57344) | ((i21115 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z1110, c3Var17, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF14, c0VarR, 0, 0);
                    c0VarR = c0VarR;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c3Var3 = c3Var17;
                    z15 = z1110;
                    g5Var3 = g5Var17;
                    a0Var3 = a0Var18;
                } else {
                    c0VarR.u();
                    g5Var3 = g5Var2;
                    z15 = z13;
                    a0Var3 = a0Var2;
                    c3Var3 = c3Var2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.D(eVar)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i12 & 2048) != 0) {
                i20 |= 48;
            } else if ((i11 & 48) == 0) {
                i20 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i22 = i20;
            if ((i13 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i24 = (i23 >> 3) & 14;
                Function0<z> function0C15 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                int i21116 = i23 >> 9;
                androidx.compose.foundation.lazy.layout.q1 q1VarA15 = f2.a(x1Var, z16, c0VarR, (i21116 & com.planner5d.library.engine.input.f.b.B) | i24);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var15 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.graphics.o1 o1Var15 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                    z2VarA = z2.f17630a.a();
                } else {
                    z2VarA = null;
                }
                androidx.compose.ui.a0 a0Var19 = a0Var4;
                int i21117 = i23;
                androidx.compose.foundation.lazy.layout.v0 v0VarF15 = f(function0C15, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var15, o1Var15, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                g5 g5Var18 = g5VarF;
                if (z11) {
                    q3Var = q3.Vertical;
                } else {
                    q3Var = q3.Horizontal;
                }
                q3Var2 = q3Var;
                if (z12) {
                    c0VarR.E(27343139);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                    c0VarR.A();
                } else {
                    c0VarR.E(27639344);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z1111 = z16;
                c3 c3Var18 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C15, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var19.B2(x1Var.Y()).B2(x1Var.C()), function0C15, q1VarA15, q3Var2, z12, z1111, c0VarR, (i21116 & 57344) | ((i21117 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z1111, c3Var18, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF15, c0VarR, 0, 0);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c3Var3 = c3Var18;
                z15 = z1111;
                g5Var3 = g5Var18;
                a0Var3 = a0Var19;
            } else {
                c0VarR.u();
                g5Var3 = g5Var2;
                z15 = z13;
                a0Var3 = a0Var2;
                c3Var3 = c3Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 100663296;
        if ((i12 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.D(mVar)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i13 |= i19;
            }
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.D(eVar)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i12 & 2048) != 0) {
                i20 |= 48;
            } else if ((i11 & 48) == 0) {
                i20 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i22 = i20;
            if ((i13 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c0VarR.h(z14, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i27 != 0) {
                        g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                    } else {
                        g5VarF = g5Var2;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        c3VarA = l4.f14799a.a(c0VarR, 6);
                        i23 = i13 & (-3670017);
                    } else {
                        i23 = i13;
                        c3VarA = c3Var2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
                }
                i24 = (i23 >> 3) & 14;
                Function0<z> function0C16 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
                int i21118 = i23 >> 9;
                androidx.compose.foundation.lazy.layout.q1 q1VarA16 = f2.a(x1Var, z16, c0VarR, (i21118 & com.planner5d.library.engine.input.f.b.B) | i24);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var16 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.graphics.o1 o1Var16 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                    z2VarA = z2.f17630a.a();
                } else {
                    z2VarA = null;
                }
                androidx.compose.ui.a0 a0Var110 = a0Var4;
                int i21119 = i23;
                androidx.compose.foundation.lazy.layout.v0 v0VarF16 = f(function0C16, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var16, o1Var16, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
                g5 g5Var19 = g5VarF;
                if (z11) {
                    q3Var = q3.Vertical;
                } else {
                    q3Var = q3.Horizontal;
                }
                q3Var2 = q3Var;
                if (z12) {
                    c0VarR.E(27343139);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                    c0VarR.A();
                } else {
                    c0VarR.E(27639344);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                boolean z1112 = z16;
                c3 c3Var19 = c3VarA;
                androidx.compose.foundation.lazy.layout.u0.c(function0C16, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var110.B2(x1Var.Y()).B2(x1Var.C()), function0C16, q1VarA16, q3Var2, z12, z1112, c0VarR, (i21118 & 57344) | ((i21119 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z1112, c3Var19, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF16, c0VarR, 0, 0);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c3Var3 = c3Var19;
                z15 = z1112;
                g5Var3 = g5Var19;
                a0Var3 = a0Var110;
            } else {
                c0VarR.u();
                g5Var3 = g5Var2;
                z15 = z13;
                a0Var3 = a0Var2;
                c3Var3 = c3Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        if ((i12 & 1024) != 0) {
            i20 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.D(eVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i20 = i11 | i21;
        } else {
            i20 = i11;
        }
        if ((i12 & 2048) != 0) {
            i20 |= 48;
        } else if ((i11 & 48) == 0) {
            i20 |= c0VarR.k0(function1) ? 32 : 16;
        }
        i22 = i20;
        if ((i13 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c0VarR.h(z14, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i27 != 0) {
                    g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                } else {
                    g5VarF = g5Var2;
                }
                if (i14 == 0) {
                }
                if ((i12 & 64) != 0) {
                    c3VarA = l4.f14799a.a(c0VarR, 6);
                    i23 = i13 & (-3670017);
                } else {
                    i23 = i13;
                    c3VarA = c3Var2;
                }
            } else {
                if (i26 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i27 != 0) {
                    g5VarF = d5.f(androidx.compose.ui.unit.h.r(0));
                } else {
                    g5VarF = g5Var2;
                }
                if (i14 == 0) {
                }
                if ((i12 & 64) != 0) {
                    c3VarA = l4.f14799a.a(c0VarR, 6);
                    i23 = i13 & (-3670017);
                } else {
                    i23 = i13;
                    c3VarA = c3Var2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(708740370, i23, i22, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:83)");
            }
            i24 = (i23 >> 3) & 14;
            Function0<z> function0C17 = e0.c(x1Var, function1, c0VarR, (i22 & com.planner5d.library.engine.input.f.b.B) | i24);
            int i211110 = i23 >> 9;
            androidx.compose.foundation.lazy.layout.q1 q1VarA17 = f2.a(x1Var, z16, c0VarR, (i211110 & com.planner5d.library.engine.input.f.b.B) | i24);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var17 = (kotlinx.coroutines.s0) objI0;
            androidx.compose.ui.graphics.o1 o1Var17 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
            if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                z2VarA = z2.f17630a.a();
            } else {
                z2VarA = null;
            }
            androidx.compose.ui.a0 a0Var111 = a0Var4;
            int i211111 = i23;
            androidx.compose.foundation.lazy.layout.v0 v0VarF17 = f(function0C17, x1Var, l1Var, g5VarF, z16, z11, eVar, mVar, s0Var17, o1Var17, z2VarA, c0VarR, ((i22 << 18) & 3670016) | (524272 & i23) | ((i23 >> 6) & 29360128), 0);
            g5 g5Var110 = g5VarF;
            if (z11) {
                q3Var = q3.Vertical;
            } else {
                q3Var = q3.Horizontal;
            }
            q3Var2 = q3Var;
            if (z12) {
                c0VarR.E(27343139);
                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, e.a(x1Var, c0VarR, i24), x1Var.D(), z16, q3Var2);
                c0VarR.A();
            } else {
                c0VarR.E(27639344);
                c0VarR.A();
                a0VarB = androidx.compose.ui.a0.E;
            }
            boolean z1113 = z16;
            c3 c3Var110 = c3VarA;
            androidx.compose.foundation.lazy.layout.u0.c(function0C17, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var111.B2(x1Var.Y()).B2(x1Var.C()), function0C17, q1VarA17, q3Var2, z12, z1113, c0VarR, (i211110 & 57344) | ((i211111 << 3) & 458752)).B2(a0VarB).B2(x1Var.K().j()), x1Var, q3Var2, z12, z1113, c3Var110, x1Var.J(), false, x3Var, (256 & 256) != 0 ? null : null), x1Var.T(), v0VarF17, c0VarR, 0, 0);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c3Var3 = c3Var110;
            z15 = z1113;
            g5Var3 = g5Var110;
            a0Var3 = a0Var111;
        } else {
            c0VarR.u();
            g5Var3 = g5Var2;
            z15 = z13;
            a0Var3 = a0Var2;
            c3Var3 = c3Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.grid.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m0.c(a0Var3, x1Var, l1Var, g5Var3, z15, z11, c3Var3, z12, x3Var, mVar, eVar, function1, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.a0 a0Var, x1 x1Var, l1 l1Var, g5 g5Var, boolean z10, boolean z11, c3 c3Var, boolean z12, x3 x3Var, androidx.compose.foundation.layout.q.m mVar, androidx.compose.foundation.layout.q.e eVar, Function1 function1, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        b(a0Var, x1Var, l1Var, g5Var, z10, z11, c3Var, z12, x3Var, mVar, eVar, function1, c0Var, t4.a(i10 | 1), t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.foundation.lazy.layout.g gVar, q3 q3Var, List<v0> list, z0 z0Var) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (gVar.r() && !list.isEmpty()) {
                int iA = y.a((x) CollectionsKt.first((List) list), q3Var);
                int iA2 = y.a((x) CollectionsKt.last((List) list), q3Var);
                for (int iQ = gVar.q(); iQ < iA; iQ++) {
                    z0Var.e(iQ);
                }
                int i10 = iA2 + 1;
                int iP = gVar.p();
                if (i10 <= iP) {
                    while (true) {
                        z0Var.e(i10);
                        if (i10 == iP) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            Unit unit = Unit.f312394a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0098 A[PHI: r3
      0x0098: PHI (r3v25 boolean) = (r3v23 boolean), (r3v26 boolean) binds: [B:44:0x0096, B:40:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    @androidx.compose.runtime.o
    private static final androidx.compose.foundation.lazy.layout.v0 f(Function0<? extends z> function0, x1 x1Var, l1 l1Var, g5 g5Var, boolean z10, boolean z11, androidx.compose.foundation.layout.q.e eVar, androidx.compose.foundation.layout.q.m mVar, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.o1 o1Var, z2 z2Var, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        boolean z12;
        boolean z13;
        boolean zD;
        Object objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1030995717, i10, i11, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:180)");
        }
        boolean z14 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(x1Var)) || (i10 & 48) == 32) | ((((i10 & 896) ^ a5.S0) > 256 && c0Var.D(l1Var)) || (i10 & a5.S0) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c0Var.D(g5Var)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && c0Var.G(z10)) || (i10 & 24576) == 16384);
        if (((458752 & i10) ^ androidx.profileinstaller.n.c.f73814m) > 131072) {
            z12 = z11;
            if (c0Var.G(z12)) {
                z13 = true;
            }
            zD = z14 | z13 | ((((3670016 & i10) ^ 1572864) <= 1048576 && c0Var.D(eVar)) || (i10 & 1572864) == 1048576) | ((((29360128 & i10) ^ 12582912) <= 8388608 && c0Var.D(mVar)) || (i10 & 12582912) == 8388608) | c0Var.D(o1Var);
            objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                a aVar = new a(x1Var, z12, g5Var, z10, function0, l1Var, mVar, eVar, s0Var, o1Var, z2Var);
                c0Var.Y(aVar);
                objI0 = aVar;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var;
        }
        z12 = z11;
        if ((196608 & i10) == 131072) {
            z13 = true;
        } else {
            z13 = false;
        }
        zD = z14 | z13 | ((((3670016 & i10) ^ 1572864) <= 1048576 && c0Var.D(eVar)) || (i10 & 1572864) == 1048576) | ((((29360128 & i10) ^ 12582912) <= 8388608 && c0Var.D(mVar)) || (i10 & 12582912) == 8388608) | c0Var.D(o1Var);
        objI0 = c0Var.i0();
        if (zD) {
            a aVar2 = new a(x1Var, z12, g5Var, z10, function0, l1Var, mVar, eVar, s0Var, o1Var, z2Var);
            c0Var.Y(aVar2);
            objI0 = aVar2;
        } else {
            a aVar3 = new a(x1Var, z12, g5Var, z10, function0, l1Var, mVar, eVar, s0Var, o1Var, z2Var);
            c0Var.Y(aVar3);
            objI0 = aVar3;
        }
        androidx.compose.foundation.lazy.layout.v0 v0Var2 = (androidx.compose.foundation.lazy.layout.v0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v0Var2;
    }
}
