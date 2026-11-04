package androidx.compose.foundation.lazy;

import android.os.Trace;
import androidx.compose.foundation.c5;
import androidx.compose.foundation.gestures.c3;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.foundation.lazy.layout.z2;
import androidx.compose.foundation.x3;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.i2;
import androidx.media3.exoplayer.a5;
import java.util.List;
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
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,424:1\n607#2:425\n604#2,6:426\n1282#3,3:432\n1285#3,3:436\n1282#3,6:441\n605#4:435\n75#5:439\n75#5:440\n27#6,5:447\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n90#1:425\n90#1:426,6\n90#1:432,3\n90#1:436,3\n189#1:441,6\n90#1:435\n91#1:439\n92#1:440\n405#1:447,5\n*E\n"})
public final class e0 {

    @SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,424:1\n109#2,5:425\n109#2,5:430\n32#3:435\n32#3:437\n80#4:436\n80#4:438\n604#5,7:439\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt$rememberLazyListMeasurePolicy$1$1\n*L\n253#1:425,5\n258#1:430,5\n276#1:435\n283#1:437\n276#1:436\n283#1:438\n330#1:439,7\n*E\n"})
    static final class a implements androidx.compose.foundation.lazy.layout.v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j1 f16706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g5 f16708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f16709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<w> f16710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.q.m f16711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.q.e f16712g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f16713h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f16714i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.o1 f16715j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ z2 f16716k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e.b f16717l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e.c f16718m;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.e0$a$a, reason: collision with other inner class name */
        public static final class C0104a extends p0 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f16719g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.w0 f16720h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f16721i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f16722j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e.b f16723k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e.c f16724l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ boolean f16725m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ int f16726n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ int f16727o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ long f16728p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ j1 f16729q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0104a(long j10, boolean z10, w wVar, androidx.compose.foundation.lazy.layout.w0 w0Var, int i10, int i11, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, boolean z11, int i12, int i13, long j11, j1 j1Var) {
                super(j10, z10, wVar, w0Var, null);
                this.f16719g = z10;
                this.f16720h = w0Var;
                this.f16721i = i10;
                this.f16722j = i11;
                this.f16723k = bVar;
                this.f16724l = cVar;
                this.f16725m = z11;
                this.f16726n = i12;
                this.f16727o = i13;
                this.f16728p = j11;
                this.f16729q = j1Var;
            }

            @Override // androidx.compose.foundation.lazy.p0
            public n0 c(int i10, Object obj, Object obj2, List<? extends i2> list, long j10) {
                return new n0(i10, list, this.f16719g, this.f16723k, this.f16724l, this.f16720h.getLayoutDirection(), this.f16725m, this.f16726n, this.f16727o, i10 == this.f16721i + (-1) ? 0 : this.f16722j, this.f16728p, obj, obj2, this.f16729q.J(), j10, null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(j1 j1Var, boolean z10, g5 g5Var, boolean z11, Function0<? extends w> function0, androidx.compose.foundation.layout.q.m mVar, androidx.compose.foundation.layout.q.e eVar, int i10, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.o1 o1Var, z2 z2Var, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar) {
            this.f16706a = j1Var;
            this.f16707b = z10;
            this.f16708c = g5Var;
            this.f16709d = z11;
            this.f16710e = function0;
            this.f16711f = mVar;
            this.f16712g = eVar;
            this.f16713h = i10;
            this.f16714i = s0Var;
            this.f16715j = o1Var;
            this.f16716k = z2Var;
            this.f16717l = bVar;
            this.f16718m = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.layout.b1 c(androidx.compose.foundation.lazy.layout.w0 w0Var, long j10, int i10, int i11, int i12, int i13, Function1 function1) {
            return w0Var.S6(androidx.compose.ui.unit.c.i(j10, i12 + i10), androidx.compose.ui.unit.c.h(j10, i13 + i11), MapsKt.emptyMap(), function1);
        }

        @Override // androidx.compose.foundation.lazy.layout.v0
        public final androidx.compose.ui.layout.b1 a(final androidx.compose.foundation.lazy.layout.w0 w0Var, final long j10) {
            int i10;
            float fA;
            long jF;
            n2.a(this.f16706a.L());
            boolean z10 = this.f16706a.G() || w0Var.P5();
            androidx.compose.foundation.g1.a(j10, this.f16707b ? q3.Vertical : q3.Horizontal);
            int iG6 = this.f16707b ? w0Var.g6(this.f16708c.b(w0Var.getLayoutDirection())) : w0Var.g6(d5.o(this.f16708c, w0Var.getLayoutDirection()));
            int iG7 = this.f16707b ? w0Var.g6(this.f16708c.c(w0Var.getLayoutDirection())) : w0Var.g6(d5.n(this.f16708c, w0Var.getLayoutDirection()));
            int iG8 = w0Var.g6(this.f16708c.d());
            int iG9 = w0Var.g6(this.f16708c.a());
            final int i11 = iG8 + iG9;
            final int i12 = iG6 + iG7;
            boolean z11 = this.f16707b;
            int i13 = z11 ? i11 : i12;
            if (z11 && !this.f16709d) {
                i10 = iG8;
            } else if (z11 && this.f16709d) {
                i10 = iG9;
            } else {
                i10 = (z11 || this.f16709d) ? iG7 : iG6;
            }
            int i14 = i13 - i10;
            long jQ = androidx.compose.ui.unit.c.q(j10, -i12, -i11);
            w wVarInvoke = this.f16710e.invoke();
            wVarInvoke.h().j(androidx.compose.ui.unit.b.p(jQ), androidx.compose.ui.unit.b.o(jQ));
            if (this.f16707b) {
                androidx.compose.foundation.layout.q.m mVar = this.f16711f;
                if (mVar == null) {
                    androidx.compose.foundation.internal.e.h("null verticalArrangement when isVertical == true");
                    throw new kotlin.a0();
                }
                fA = mVar.a();
            } else {
                androidx.compose.foundation.layout.q.e eVar = this.f16712g;
                if (eVar == null) {
                    androidx.compose.foundation.internal.e.h("null horizontalAlignment when isVertical == false");
                    throw new kotlin.a0();
                }
                fA = eVar.a();
            }
            int iG10 = w0Var.g6(fA);
            int iA = wVarInvoke.a();
            int iO = this.f16707b ? androidx.compose.ui.unit.b.o(j10) - i11 : androidx.compose.ui.unit.b.p(j10) - i12;
            if (!this.f16709d || iO > 0) {
                jF = androidx.compose.ui.unit.q.f((((long) iG8) & com.rabbitmq.client.k0.f265952a) | (((long) iG6) << 32));
            } else {
                boolean z12 = this.f16707b;
                if (!z12) {
                    iG6 += iO;
                }
                if (z12) {
                    iG8 += iO;
                }
                jF = androidx.compose.ui.unit.q.f((((long) iG8) & com.rabbitmq.client.k0.f265952a) | (((long) iG6) << 32));
            }
            C0104a c0104a = new C0104a(jQ, this.f16707b, wVarInvoke, w0Var, iA, iG10, this.f16717l, this.f16718m, this.f16709d, i10, i14, jF, this.f16706a);
            androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
            j1 j1Var = this.f16706a;
            androidx.compose.runtime.snapshots.m mVarG = aVar.g();
            Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
            androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
            try {
                int iM0 = j1Var.m0(wVarInvoke, j1Var.E());
                int iF = j1Var.F();
                Unit unit = Unit.f312394a;
                aVar.x(mVarG, mVarM, function1L);
                m0 m0VarI = l0.i(iA, c0104a, iO, i10, i14, iG10, iM0, iF, (w0Var.P5() || !z10) ? this.f16706a.Y() : this.f16706a.X(), jQ, this.f16707b, this.f16711f, this.f16712g, this.f16709d, w0Var, this.f16706a.J(), this.f16713h, androidx.compose.foundation.lazy.layout.v.a(wVarInvoke, this.f16706a.P(), this.f16706a.C()), z10, w0Var.P5(), this.f16706a.A(), this.f16714i, this.f16706a.Q(), this.f16715j, this.f16716k, new pj.n() { // from class: androidx.compose.foundation.lazy.d0
                    @Override // pj.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return e0.a.c(w0Var, j10, i12, i11, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (Function1) obj3);
                    }
                });
                j1.z(this.f16706a, m0VarI, w0Var.P5(), false, 4, null);
                Object objT = this.f16706a.T();
                androidx.compose.foundation.lazy.layout.g gVar = objT instanceof androidx.compose.foundation.lazy.layout.g ? (androidx.compose.foundation.lazy.layout.g) objT : null;
                if (gVar != null) {
                    e0.e(gVar, m0VarI.h(), c0104a);
                }
                return m0VarI;
            } catch (Throwable th2) {
                aVar.x(mVarG, mVarM, function1L);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x014a  */
    /* JADX WARN: Code duplicated, block: B:112:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x016c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0175  */
    /* JADX WARN: Code duplicated, block: B:124:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:129:0x0189  */
    /* JADX WARN: Code duplicated, block: B:132:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x0195  */
    /* JADX WARN: Code duplicated, block: B:135:0x019b  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01df  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:168:0x0201 A[PHI: r4 r8 r9 r11 r14
      0x0201: PHI (r4v26 int) = (r4v16 int), (r4v29 int) binds: [B:182:0x022d, B:167:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r8v9 androidx.compose.ui.e$b) = (r8v3 androidx.compose.ui.e$b), (r8v10 androidx.compose.ui.e$b) binds: [B:182:0x022d, B:167:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r9v14 androidx.compose.ui.e$c) = (r9v8 androidx.compose.ui.e$c), (r9v15 androidx.compose.ui.e$c) binds: [B:182:0x022d, B:167:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r11v21 androidx.compose.foundation.layout.q$m) = (r11v16 androidx.compose.foundation.layout.q$m), (r11v23 androidx.compose.foundation.layout.q$m) binds: [B:182:0x022d, B:167:0x01f8] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r14v11 int) = (r14v4 int), (r14v2 int) binds: [B:182:0x022d, B:167:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x0204  */
    /* JADX WARN: Code duplicated, block: B:171:0x0208  */
    /* JADX WARN: Code duplicated, block: B:173:0x0215  */
    /* JADX WARN: Code duplicated, block: B:174:0x0217  */
    /* JADX WARN: Code duplicated, block: B:176:0x021b  */
    /* JADX WARN: Code duplicated, block: B:177:0x021d  */
    /* JADX WARN: Code duplicated, block: B:179:0x0221  */
    /* JADX WARN: Code duplicated, block: B:180:0x0224  */
    /* JADX WARN: Code duplicated, block: B:183:0x022f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0239  */
    /* JADX WARN: Code duplicated, block: B:189:0x026b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0292  */
    /* JADX WARN: Code duplicated, block: B:193:0x0299  */
    /* JADX WARN: Code duplicated, block: B:196:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:198:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:200:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:202:0x030b  */
    /* JADX WARN: Code duplicated, block: B:205:0x038a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0399  */
    /* JADX WARN: Code duplicated, block: B:210:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0110  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@NotNull final androidx.compose.ui.a0 a0Var, @NotNull final j1 j1Var, @NotNull final g5 g5Var, final boolean z10, final boolean z11, @NotNull final c3 c3Var, final boolean z12, @Nullable final x3 x3Var, int i10, @Nullable androidx.compose.ui.e.b bVar, @Nullable androidx.compose.foundation.layout.q.m mVar, @Nullable androidx.compose.ui.e.c cVar, @Nullable androidx.compose.foundation.layout.q.e eVar, @NotNull final Function1<? super w0, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12, final int i13) {
        int i14;
        g5 g5Var2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iA;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z13;
        final androidx.compose.ui.e.b bVar2;
        final androidx.compose.foundation.layout.q.m mVar2;
        final androidx.compose.ui.e.c cVar2;
        final androidx.compose.foundation.layout.q.e eVar2;
        final int i30;
        s5 s5VarT;
        androidx.compose.ui.e.b bVar3;
        androidx.compose.foundation.layout.q.m mVar3;
        androidx.compose.ui.e.c cVar3;
        androidx.compose.ui.e.b bVar4;
        androidx.compose.foundation.layout.q.m mVar4;
        int i31;
        androidx.compose.ui.e.c cVar4;
        androidx.compose.foundation.layout.q.e eVar3;
        int i32;
        Object objI0;
        z2 z2VarA;
        int i33;
        int i34;
        q3 q3Var;
        q3 q3Var2;
        androidx.compose.ui.a0 a0VarB;
        int i35;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(924924659);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (c0VarR.D(a0Var) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= c0VarR.D(j1Var) ? 32 : 16;
        }
        if ((i13 & 4) == 0) {
            if ((i11 & a5.S0) == 0) {
                g5Var2 = g5Var;
                i14 |= c0VarR.D(g5Var2) ? 256 : 128;
            }
            if ((i13 & 8) != 0) {
                i14 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (c0VarR.G(z10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i14 |= i15;
            }
            if ((i13 & 16) != 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (c0VarR.G(z11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i14 |= i16;
            }
            if ((i13 & 32) != 0) {
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(c3Var)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i14 |= i17;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c0VarR.G(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i14 |= i18;
                }
                if ((i13 & 128) != 0) {
                    if ((i11 & 12582912) == 0) {
                        if (c0VarR.D(x3Var)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i14 |= i19;
                    }
                    if ((i11 & 100663296) == 0) {
                        if ((i13 & 256) == 0) {
                            iA = i10;
                            if (c0VarR.K(iA)) {
                                i35 = 67108864;
                            }
                            i14 |= i35;
                        } else {
                            iA = i10;
                        }
                        i35 = com.google.api.client.googleapis.media.a.f115410j;
                        i14 |= i35;
                    } else {
                        iA = i10;
                    }
                    i20 = i13 & 512;
                    if (i20 != 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        if (c0VarR.D(bVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 1024;
                    if (i22 != 0) {
                        i23 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        if (c0VarR.D(mVar)) {
                            i24 = 4;
                        } else {
                            i24 = 2;
                        }
                        i23 = i12 | i24;
                    } else {
                        i23 = i12;
                    }
                    i25 = i13 & 2048;
                    if (i25 != 0) {
                        i23 |= 48;
                    } else if ((i12 & 48) != 0) {
                        i23 |= c0VarR.D(cVar) ? 32 : 16;
                    }
                    i26 = i23;
                    i27 = i13 & 4096;
                    if (i27 != 0) {
                        i29 = i26 | a5.S0;
                    } else {
                        i28 = i26;
                        if ((i12 & a5.S0) != 0) {
                            i28 |= c0VarR.D(eVar) ? 256 : 128;
                        }
                        i29 = i28;
                    }
                    if ((i13 & 8192) != 0) {
                        i29 |= 3072;
                    } else if ((i12 & 3072) == 0) {
                        i29 |= c0VarR.k0(function1) ? 2048 : 1024;
                    }
                    if ((306783379 & i14) == 306783378 || (i29 & 1171) != 1170) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i14 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0 || c0VarR.y()) {
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                                iA = p1.a(c0VarR, 0);
                            }
                            if (i20 != 0) {
                                bVar3 = null;
                            } else {
                                bVar3 = bVar;
                            }
                            if (i22 != 0) {
                                mVar3 = null;
                            } else {
                                mVar3 = mVar;
                            }
                            if (i25 != 0) {
                                cVar3 = null;
                            } else {
                                cVar3 = cVar;
                            }
                            bVar4 = bVar3;
                            mVar4 = mVar3;
                            i31 = i14;
                            cVar4 = cVar3;
                            if (i27 != 0) {
                                eVar3 = null;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                            }
                            i32 = (i31 >> 3) & 14;
                            Function0<w> function0C = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                            int i36 = i31 >> 9;
                            int i37 = i29;
                            androidx.compose.foundation.lazy.layout.q1 q1VarA = a1.a(j1Var, z11, c0VarR, i32 | (i36 & com.planner5d.library.engine.input.f.b.B));
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
                            androidx.compose.ui.graphics.o1 o1Var = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                            if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                                z2VarA = null;
                            } else {
                                z2VarA = z2.f17630a.a();
                            }
                            int i38 = i37 << 18;
                            int i39 = (i31 & 65520) | (i36 & 458752) | (i36 & 3670016) | (i38 & 29360128) | (i38 & 234881024) | ((i37 << 27) & 1879048192);
                            i33 = iA;
                            z2 z2Var = z2VarA;
                            i34 = i31;
                            androidx.compose.foundation.lazy.layout.v0 v0VarF = f(function0C, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var, o1Var, z2Var, c0VarR, i39, 0);
                            androidx.compose.ui.e.b bVar5 = bVar4;
                            androidx.compose.ui.e.c cVar5 = cVar4;
                            androidx.compose.foundation.layout.q.e eVar4 = eVar3;
                            androidx.compose.foundation.layout.q.m mVar5 = mVar4;
                            if (z11) {
                                q3Var = q3.Vertical;
                            } else {
                                q3Var = q3.Horizontal;
                            }
                            q3Var2 = q3Var;
                            if (z12) {
                                c0VarR.E(-2077085864);
                                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-2076657041);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.foundation.lazy.layout.u0.c(function0C, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C, q1VarA, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF, c0VarR, 0, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            i30 = i33;
                            bVar2 = bVar5;
                            cVar2 = cVar5;
                            eVar2 = eVar4;
                            mVar2 = mVar5;
                        } else {
                            c0VarR.u();
                            if ((i13 & 256) != 0) {
                                i14 &= -234881025;
                            }
                            bVar4 = bVar;
                            mVar4 = mVar;
                            cVar4 = cVar;
                            i31 = i14;
                        }
                        eVar3 = eVar;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                        }
                        i32 = (i31 >> 3) & 14;
                        Function0<w> function0C2 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                        int i310 = i31 >> 9;
                        int i311 = i29;
                        androidx.compose.foundation.lazy.layout.q1 q1VarA2 = a1.a(j1Var, z11, c0VarR, i32 | (i310 & com.planner5d.library.engine.input.f.b.B));
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.graphics.o1 o1Var2 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                        if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                            z2VarA = z2.f17630a.a();
                        } else {
                            z2VarA = null;
                        }
                        int i312 = i311 << 18;
                        int i313 = (i31 & 65520) | (i310 & 458752) | (i310 & 3670016) | (i312 & 29360128) | (i312 & 234881024) | ((i311 << 27) & 1879048192);
                        i33 = iA;
                        z2 z2Var2 = z2VarA;
                        i34 = i31;
                        androidx.compose.foundation.lazy.layout.v0 v0VarF2 = f(function0C2, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var2, o1Var2, z2Var2, c0VarR, i313, 0);
                        androidx.compose.ui.e.b bVar6 = bVar4;
                        androidx.compose.ui.e.c cVar6 = cVar4;
                        androidx.compose.foundation.layout.q.e eVar5 = eVar3;
                        androidx.compose.foundation.layout.q.m mVar6 = mVar4;
                        if (z11) {
                            q3Var = q3.Vertical;
                        } else {
                            q3Var = q3.Horizontal;
                        }
                        q3Var2 = q3Var;
                        if (z12) {
                            c0VarR.E(-2077085864);
                            a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-2076657041);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.foundation.lazy.layout.u0.c(function0C2, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C2, q1VarA2, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF2, c0VarR, 0, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        i30 = i33;
                        bVar2 = bVar6;
                        cVar2 = cVar6;
                        eVar2 = eVar5;
                        mVar2 = mVar6;
                    } else {
                        c0VarR.u();
                        bVar2 = bVar;
                        mVar2 = mVar;
                        cVar2 = cVar;
                        eVar2 = eVar;
                        i30 = iA;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 12582912;
                if ((i11 & 100663296) == 0) {
                    if ((i13 & 256) == 0) {
                        iA = i10;
                        if (c0VarR.K(iA)) {
                            i35 = 67108864;
                        }
                        i14 |= i35;
                    } else {
                        iA = i10;
                    }
                    i35 = com.google.api.client.googleapis.media.a.f115410j;
                    i14 |= i35;
                } else {
                    iA = i10;
                }
                i20 = i13 & 512;
                if (i20 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c0VarR.D(bVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 1024;
                if (i22 != 0) {
                    i23 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c0VarR.D(mVar)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i12 | i24;
                } else {
                    i23 = i12;
                }
                i25 = i13 & 2048;
                if (i25 != 0) {
                    i23 |= 48;
                } else if ((i12 & 48) != 0) {
                    i23 |= c0VarR.D(cVar) ? 32 : 16;
                }
                i26 = i23;
                i27 = i13 & 4096;
                if (i27 != 0) {
                    i29 = i26 | a5.S0;
                } else {
                    i28 = i26;
                    if ((i12 & a5.S0) != 0) {
                        i28 |= c0VarR.D(eVar) ? 256 : 128;
                    }
                    i29 = i28;
                }
                if ((i13 & 8192) != 0) {
                    i29 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i29 |= c0VarR.k0(function1) ? 2048 : 1024;
                }
                if ((306783379 & i14) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i14 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            iA = p1.a(c0VarR, 0);
                        }
                        if (i20 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i22 != 0) {
                            mVar3 = null;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i25 != 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = cVar;
                        }
                        bVar4 = bVar3;
                        mVar4 = mVar3;
                        i31 = i14;
                        cVar4 = cVar3;
                        if (i27 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                    } else {
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            iA = p1.a(c0VarR, 0);
                        }
                        if (i20 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i22 != 0) {
                            mVar3 = null;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i25 != 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = cVar;
                        }
                        bVar4 = bVar3;
                        mVar4 = mVar3;
                        i31 = i14;
                        cVar4 = cVar3;
                        if (i27 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                    }
                    i32 = (i31 >> 3) & 14;
                    Function0<w> function0C3 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                    int i314 = i31 >> 9;
                    int i315 = i29;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA3 = a1.a(j1Var, z11, c0VarR, i32 | (i314 & com.planner5d.library.engine.input.f.b.B));
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var3 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var3 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    int i316 = i315 << 18;
                    int i317 = (i31 & 65520) | (i314 & 458752) | (i314 & 3670016) | (i316 & 29360128) | (i316 & 234881024) | ((i315 << 27) & 1879048192);
                    i33 = iA;
                    z2 z2Var3 = z2VarA;
                    i34 = i31;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF3 = f(function0C3, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var3, o1Var3, z2Var3, c0VarR, i317, 0);
                    androidx.compose.ui.e.b bVar7 = bVar4;
                    androidx.compose.ui.e.c cVar7 = cVar4;
                    androidx.compose.foundation.layout.q.e eVar6 = eVar3;
                    androidx.compose.foundation.layout.q.m mVar7 = mVar4;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(-2077085864);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2076657041);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.foundation.lazy.layout.u0.c(function0C3, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C3, q1VarA3, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF3, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    i30 = i33;
                    bVar2 = bVar7;
                    cVar2 = cVar7;
                    eVar2 = eVar6;
                    mVar2 = mVar7;
                } else {
                    c0VarR.u();
                    bVar2 = bVar;
                    mVar2 = mVar;
                    cVar2 = cVar;
                    eVar2 = eVar;
                    i30 = iA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i14 |= i18;
            }
            if ((i13 & 128) != 0) {
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.D(x3Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i14 |= i19;
                }
                if ((i11 & 100663296) == 0) {
                    if ((i13 & 256) == 0) {
                        iA = i10;
                        if (c0VarR.K(iA)) {
                            i35 = 67108864;
                        }
                        i14 |= i35;
                    } else {
                        iA = i10;
                    }
                    i35 = com.google.api.client.googleapis.media.a.f115410j;
                    i14 |= i35;
                } else {
                    iA = i10;
                }
                i20 = i13 & 512;
                if (i20 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c0VarR.D(bVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 1024;
                if (i22 != 0) {
                    i23 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c0VarR.D(mVar)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i12 | i24;
                } else {
                    i23 = i12;
                }
                i25 = i13 & 2048;
                if (i25 != 0) {
                    i23 |= 48;
                } else if ((i12 & 48) != 0) {
                    i23 |= c0VarR.D(cVar) ? 32 : 16;
                }
                i26 = i23;
                i27 = i13 & 4096;
                if (i27 != 0) {
                    i29 = i26 | a5.S0;
                } else {
                    i28 = i26;
                    if ((i12 & a5.S0) != 0) {
                        i28 |= c0VarR.D(eVar) ? 256 : 128;
                    }
                    i29 = i28;
                }
                if ((i13 & 8192) != 0) {
                    i29 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i29 |= c0VarR.k0(function1) ? 2048 : 1024;
                }
                if ((306783379 & i14) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i14 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            iA = p1.a(c0VarR, 0);
                        }
                        if (i20 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i22 != 0) {
                            mVar3 = null;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i25 != 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = cVar;
                        }
                        bVar4 = bVar3;
                        mVar4 = mVar3;
                        i31 = i14;
                        cVar4 = cVar3;
                        if (i27 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                    } else {
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            iA = p1.a(c0VarR, 0);
                        }
                        if (i20 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i22 != 0) {
                            mVar3 = null;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i25 != 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = cVar;
                        }
                        bVar4 = bVar3;
                        mVar4 = mVar3;
                        i31 = i14;
                        cVar4 = cVar3;
                        if (i27 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                    }
                    i32 = (i31 >> 3) & 14;
                    Function0<w> function0C4 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                    int i318 = i31 >> 9;
                    int i319 = i29;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA4 = a1.a(j1Var, z11, c0VarR, i32 | (i318 & com.planner5d.library.engine.input.f.b.B));
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var4 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var4 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    int i3110 = i319 << 18;
                    int i3111 = (i31 & 65520) | (i318 & 458752) | (i318 & 3670016) | (i3110 & 29360128) | (i3110 & 234881024) | ((i319 << 27) & 1879048192);
                    i33 = iA;
                    z2 z2Var4 = z2VarA;
                    i34 = i31;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF4 = f(function0C4, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var4, o1Var4, z2Var4, c0VarR, i3111, 0);
                    androidx.compose.ui.e.b bVar8 = bVar4;
                    androidx.compose.ui.e.c cVar8 = cVar4;
                    androidx.compose.foundation.layout.q.e eVar7 = eVar3;
                    androidx.compose.foundation.layout.q.m mVar8 = mVar4;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(-2077085864);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2076657041);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.foundation.lazy.layout.u0.c(function0C4, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C4, q1VarA4, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF4, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    i30 = i33;
                    bVar2 = bVar8;
                    cVar2 = cVar8;
                    eVar2 = eVar7;
                    mVar2 = mVar8;
                } else {
                    c0VarR.u();
                    bVar2 = bVar;
                    mVar2 = mVar;
                    cVar2 = cVar;
                    eVar2 = eVar;
                    i30 = iA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 12582912;
            if ((i11 & 100663296) == 0) {
                if ((i13 & 256) == 0) {
                    iA = i10;
                    if (c0VarR.K(iA)) {
                        i35 = 67108864;
                    }
                    i14 |= i35;
                } else {
                    iA = i10;
                }
                i35 = com.google.api.client.googleapis.media.a.f115410j;
                i14 |= i35;
            } else {
                iA = i10;
            }
            i20 = i13 & 512;
            if (i20 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c0VarR.D(bVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i14 |= i21;
            }
            i22 = i13 & 1024;
            if (i22 != 0) {
                i23 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c0VarR.D(mVar)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i12 | i24;
            } else {
                i23 = i12;
            }
            i25 = i13 & 2048;
            if (i25 != 0) {
                i23 |= 48;
            } else if ((i12 & 48) != 0) {
                i23 |= c0VarR.D(cVar) ? 32 : 16;
            }
            i26 = i23;
            i27 = i13 & 4096;
            if (i27 != 0) {
                i29 = i26 | a5.S0;
            } else {
                i28 = i26;
                if ((i12 & a5.S0) != 0) {
                    i28 |= c0VarR.D(eVar) ? 256 : 128;
                }
                i29 = i28;
            }
            if ((i13 & 8192) != 0) {
                i29 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i29 |= c0VarR.k0(function1) ? 2048 : 1024;
            }
            if ((306783379 & i14) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i14 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        iA = p1.a(c0VarR, 0);
                    }
                    if (i20 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        mVar3 = null;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    bVar4 = bVar3;
                    mVar4 = mVar3;
                    i31 = i14;
                    cVar4 = cVar3;
                    if (i27 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                } else {
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        iA = p1.a(c0VarR, 0);
                    }
                    if (i20 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        mVar3 = null;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    bVar4 = bVar3;
                    mVar4 = mVar3;
                    i31 = i14;
                    cVar4 = cVar3;
                    if (i27 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                }
                i32 = (i31 >> 3) & 14;
                Function0<w> function0C5 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                int i3112 = i31 >> 9;
                int i3113 = i29;
                androidx.compose.foundation.lazy.layout.q1 q1VarA5 = a1.a(j1Var, z11, c0VarR, i32 | (i3112 & com.planner5d.library.engine.input.f.b.B));
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var5 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.graphics.o1 o1Var5 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                    z2VarA = z2.f17630a.a();
                } else {
                    z2VarA = null;
                }
                int i3114 = i3113 << 18;
                int i3115 = (i31 & 65520) | (i3112 & 458752) | (i3112 & 3670016) | (i3114 & 29360128) | (i3114 & 234881024) | ((i3113 << 27) & 1879048192);
                i33 = iA;
                z2 z2Var5 = z2VarA;
                i34 = i31;
                androidx.compose.foundation.lazy.layout.v0 v0VarF5 = f(function0C5, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var5, o1Var5, z2Var5, c0VarR, i3115, 0);
                androidx.compose.ui.e.b bVar9 = bVar4;
                androidx.compose.ui.e.c cVar9 = cVar4;
                androidx.compose.foundation.layout.q.e eVar8 = eVar3;
                androidx.compose.foundation.layout.q.m mVar9 = mVar4;
                if (z11) {
                    q3Var = q3.Vertical;
                } else {
                    q3Var = q3.Horizontal;
                }
                q3Var2 = q3Var;
                if (z12) {
                    c0VarR.E(-2077085864);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2076657041);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.foundation.lazy.layout.u0.c(function0C5, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C5, q1VarA5, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF5, c0VarR, 0, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                i30 = i33;
                bVar2 = bVar9;
                cVar2 = cVar9;
                eVar2 = eVar8;
                mVar2 = mVar9;
            } else {
                c0VarR.u();
                bVar2 = bVar;
                mVar2 = mVar;
                cVar2 = cVar;
                eVar2 = eVar;
                i30 = iA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= a5.S0;
        g5Var2 = g5Var;
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (c0VarR.G(z10)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i14 |= i15;
        }
        if ((i13 & 16) != 0) {
            i14 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (c0VarR.G(z11)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i14 |= i16;
        }
        if ((i13 & 32) != 0) {
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(c3Var)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i14 |= i17;
            }
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c0VarR.G(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i14 |= i18;
            }
            if ((i13 & 128) != 0) {
                if ((i11 & 12582912) == 0) {
                    if (c0VarR.D(x3Var)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i14 |= i19;
                }
                if ((i11 & 100663296) == 0) {
                    if ((i13 & 256) == 0) {
                        iA = i10;
                        if (c0VarR.K(iA)) {
                            i35 = 67108864;
                        }
                        i14 |= i35;
                    } else {
                        iA = i10;
                    }
                    i35 = com.google.api.client.googleapis.media.a.f115410j;
                    i14 |= i35;
                } else {
                    iA = i10;
                }
                i20 = i13 & 512;
                if (i20 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c0VarR.D(bVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 1024;
                if (i22 != 0) {
                    i23 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c0VarR.D(mVar)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i12 | i24;
                } else {
                    i23 = i12;
                }
                i25 = i13 & 2048;
                if (i25 != 0) {
                    i23 |= 48;
                } else if ((i12 & 48) != 0) {
                    i23 |= c0VarR.D(cVar) ? 32 : 16;
                }
                i26 = i23;
                i27 = i13 & 4096;
                if (i27 != 0) {
                    i29 = i26 | a5.S0;
                } else {
                    i28 = i26;
                    if ((i12 & a5.S0) != 0) {
                        i28 |= c0VarR.D(eVar) ? 256 : 128;
                    }
                    i29 = i28;
                }
                if ((i13 & 8192) != 0) {
                    i29 |= 3072;
                } else if ((i12 & 3072) == 0) {
                    i29 |= c0VarR.k0(function1) ? 2048 : 1024;
                }
                if ((306783379 & i14) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c0VarR.h(z13, i14 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            iA = p1.a(c0VarR, 0);
                        }
                        if (i20 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i22 != 0) {
                            mVar3 = null;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i25 != 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = cVar;
                        }
                        bVar4 = bVar3;
                        mVar4 = mVar3;
                        i31 = i14;
                        cVar4 = cVar3;
                        if (i27 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                    } else {
                        if ((i13 & 256) != 0) {
                            i14 &= -234881025;
                            iA = p1.a(c0VarR, 0);
                        }
                        if (i20 != 0) {
                            bVar3 = null;
                        } else {
                            bVar3 = bVar;
                        }
                        if (i22 != 0) {
                            mVar3 = null;
                        } else {
                            mVar3 = mVar;
                        }
                        if (i25 != 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = cVar;
                        }
                        bVar4 = bVar3;
                        mVar4 = mVar3;
                        i31 = i14;
                        cVar4 = cVar3;
                        if (i27 != 0) {
                            eVar3 = null;
                        } else {
                            eVar3 = eVar;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                    }
                    i32 = (i31 >> 3) & 14;
                    Function0<w> function0C6 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                    int i3116 = i31 >> 9;
                    int i3117 = i29;
                    androidx.compose.foundation.lazy.layout.q1 q1VarA6 = a1.a(j1Var, z11, c0VarR, i32 | (i3116 & com.planner5d.library.engine.input.f.b.B));
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var6 = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.graphics.o1 o1Var6 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                    if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                        z2VarA = z2.f17630a.a();
                    } else {
                        z2VarA = null;
                    }
                    int i3118 = i3117 << 18;
                    int i3119 = (i31 & 65520) | (i3116 & 458752) | (i3116 & 3670016) | (i3118 & 29360128) | (i3118 & 234881024) | ((i3117 << 27) & 1879048192);
                    i33 = iA;
                    z2 z2Var6 = z2VarA;
                    i34 = i31;
                    androidx.compose.foundation.lazy.layout.v0 v0VarF6 = f(function0C6, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var6, o1Var6, z2Var6, c0VarR, i3119, 0);
                    androidx.compose.ui.e.b bVar10 = bVar4;
                    androidx.compose.ui.e.c cVar10 = cVar4;
                    androidx.compose.foundation.layout.q.e eVar9 = eVar3;
                    androidx.compose.foundation.layout.q.m mVar10 = mVar4;
                    if (z11) {
                        q3Var = q3.Vertical;
                    } else {
                        q3Var = q3.Horizontal;
                    }
                    q3Var2 = q3Var;
                    if (z12) {
                        c0VarR.E(-2077085864);
                        a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-2076657041);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.foundation.lazy.layout.u0.c(function0C6, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C6, q1VarA6, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF6, c0VarR, 0, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    i30 = i33;
                    bVar2 = bVar10;
                    cVar2 = cVar10;
                    eVar2 = eVar9;
                    mVar2 = mVar10;
                } else {
                    c0VarR.u();
                    bVar2 = bVar;
                    mVar2 = mVar;
                    cVar2 = cVar;
                    eVar2 = eVar;
                    i30 = iA;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 12582912;
            if ((i11 & 100663296) == 0) {
                if ((i13 & 256) == 0) {
                    iA = i10;
                    if (c0VarR.K(iA)) {
                        i35 = 67108864;
                    }
                    i14 |= i35;
                } else {
                    iA = i10;
                }
                i35 = com.google.api.client.googleapis.media.a.f115410j;
                i14 |= i35;
            } else {
                iA = i10;
            }
            i20 = i13 & 512;
            if (i20 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c0VarR.D(bVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i14 |= i21;
            }
            i22 = i13 & 1024;
            if (i22 != 0) {
                i23 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c0VarR.D(mVar)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i12 | i24;
            } else {
                i23 = i12;
            }
            i25 = i13 & 2048;
            if (i25 != 0) {
                i23 |= 48;
            } else if ((i12 & 48) != 0) {
                i23 |= c0VarR.D(cVar) ? 32 : 16;
            }
            i26 = i23;
            i27 = i13 & 4096;
            if (i27 != 0) {
                i29 = i26 | a5.S0;
            } else {
                i28 = i26;
                if ((i12 & a5.S0) != 0) {
                    i28 |= c0VarR.D(eVar) ? 256 : 128;
                }
                i29 = i28;
            }
            if ((i13 & 8192) != 0) {
                i29 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i29 |= c0VarR.k0(function1) ? 2048 : 1024;
            }
            if ((306783379 & i14) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i14 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        iA = p1.a(c0VarR, 0);
                    }
                    if (i20 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        mVar3 = null;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    bVar4 = bVar3;
                    mVar4 = mVar3;
                    i31 = i14;
                    cVar4 = cVar3;
                    if (i27 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                } else {
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        iA = p1.a(c0VarR, 0);
                    }
                    if (i20 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        mVar3 = null;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    bVar4 = bVar3;
                    mVar4 = mVar3;
                    i31 = i14;
                    cVar4 = cVar3;
                    if (i27 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                }
                i32 = (i31 >> 3) & 14;
                Function0<w> function0C7 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                int i31110 = i31 >> 9;
                int i31111 = i29;
                androidx.compose.foundation.lazy.layout.q1 q1VarA7 = a1.a(j1Var, z11, c0VarR, i32 | (i31110 & com.planner5d.library.engine.input.f.b.B));
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var7 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.graphics.o1 o1Var7 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                    z2VarA = z2.f17630a.a();
                } else {
                    z2VarA = null;
                }
                int i31112 = i31111 << 18;
                int i31113 = (i31 & 65520) | (i31110 & 458752) | (i31110 & 3670016) | (i31112 & 29360128) | (i31112 & 234881024) | ((i31111 << 27) & 1879048192);
                i33 = iA;
                z2 z2Var7 = z2VarA;
                i34 = i31;
                androidx.compose.foundation.lazy.layout.v0 v0VarF7 = f(function0C7, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var7, o1Var7, z2Var7, c0VarR, i31113, 0);
                androidx.compose.ui.e.b bVar11 = bVar4;
                androidx.compose.ui.e.c cVar11 = cVar4;
                androidx.compose.foundation.layout.q.e eVar10 = eVar3;
                androidx.compose.foundation.layout.q.m mVar11 = mVar4;
                if (z11) {
                    q3Var = q3.Vertical;
                } else {
                    q3Var = q3.Horizontal;
                }
                q3Var2 = q3Var;
                if (z12) {
                    c0VarR.E(-2077085864);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2076657041);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.foundation.lazy.layout.u0.c(function0C7, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C7, q1VarA7, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF7, c0VarR, 0, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                i30 = i33;
                bVar2 = bVar11;
                cVar2 = cVar11;
                eVar2 = eVar10;
                mVar2 = mVar11;
            } else {
                c0VarR.u();
                bVar2 = bVar;
                mVar2 = mVar;
                cVar2 = cVar;
                eVar2 = eVar;
                i30 = iA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= androidx.profileinstaller.n.c.f73814m;
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c0VarR.G(z12)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i14 |= i18;
        }
        if ((i13 & 128) != 0) {
            if ((i11 & 12582912) == 0) {
                if (c0VarR.D(x3Var)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i14 |= i19;
            }
            if ((i11 & 100663296) == 0) {
                if ((i13 & 256) == 0) {
                    iA = i10;
                    if (c0VarR.K(iA)) {
                        i35 = 67108864;
                    }
                    i14 |= i35;
                } else {
                    iA = i10;
                }
                i35 = com.google.api.client.googleapis.media.a.f115410j;
                i14 |= i35;
            } else {
                iA = i10;
            }
            i20 = i13 & 512;
            if (i20 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c0VarR.D(bVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i14 |= i21;
            }
            i22 = i13 & 1024;
            if (i22 != 0) {
                i23 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c0VarR.D(mVar)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i12 | i24;
            } else {
                i23 = i12;
            }
            i25 = i13 & 2048;
            if (i25 != 0) {
                i23 |= 48;
            } else if ((i12 & 48) != 0) {
                i23 |= c0VarR.D(cVar) ? 32 : 16;
            }
            i26 = i23;
            i27 = i13 & 4096;
            if (i27 != 0) {
                i29 = i26 | a5.S0;
            } else {
                i28 = i26;
                if ((i12 & a5.S0) != 0) {
                    i28 |= c0VarR.D(eVar) ? 256 : 128;
                }
                i29 = i28;
            }
            if ((i13 & 8192) != 0) {
                i29 |= 3072;
            } else if ((i12 & 3072) == 0) {
                i29 |= c0VarR.k0(function1) ? 2048 : 1024;
            }
            if ((306783379 & i14) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c0VarR.h(z13, i14 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        iA = p1.a(c0VarR, 0);
                    }
                    if (i20 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        mVar3 = null;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    bVar4 = bVar3;
                    mVar4 = mVar3;
                    i31 = i14;
                    cVar4 = cVar3;
                    if (i27 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                } else {
                    if ((i13 & 256) != 0) {
                        i14 &= -234881025;
                        iA = p1.a(c0VarR, 0);
                    }
                    if (i20 != 0) {
                        bVar3 = null;
                    } else {
                        bVar3 = bVar;
                    }
                    if (i22 != 0) {
                        mVar3 = null;
                    } else {
                        mVar3 = mVar;
                    }
                    if (i25 != 0) {
                        cVar3 = null;
                    } else {
                        cVar3 = cVar;
                    }
                    bVar4 = bVar3;
                    mVar4 = mVar3;
                    i31 = i14;
                    cVar4 = cVar3;
                    if (i27 != 0) {
                        eVar3 = null;
                    } else {
                        eVar3 = eVar;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
                }
                i32 = (i31 >> 3) & 14;
                Function0<w> function0C8 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
                int i31114 = i31 >> 9;
                int i31115 = i29;
                androidx.compose.foundation.lazy.layout.q1 q1VarA8 = a1.a(j1Var, z11, c0VarR, i32 | (i31114 & com.planner5d.library.engine.input.f.b.B));
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var8 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.graphics.o1 o1Var8 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
                if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                    z2VarA = z2.f17630a.a();
                } else {
                    z2VarA = null;
                }
                int i31116 = i31115 << 18;
                int i31117 = (i31 & 65520) | (i31114 & 458752) | (i31114 & 3670016) | (i31116 & 29360128) | (i31116 & 234881024) | ((i31115 << 27) & 1879048192);
                i33 = iA;
                z2 z2Var8 = z2VarA;
                i34 = i31;
                androidx.compose.foundation.lazy.layout.v0 v0VarF8 = f(function0C8, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var8, o1Var8, z2Var8, c0VarR, i31117, 0);
                androidx.compose.ui.e.b bVar12 = bVar4;
                androidx.compose.ui.e.c cVar12 = cVar4;
                androidx.compose.foundation.layout.q.e eVar11 = eVar3;
                androidx.compose.foundation.layout.q.m mVar12 = mVar4;
                if (z11) {
                    q3Var = q3.Vertical;
                } else {
                    q3Var = q3.Horizontal;
                }
                q3Var2 = q3Var;
                if (z12) {
                    c0VarR.E(-2077085864);
                    a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                    c0VarR.A();
                } else {
                    c0VarR.E(-2076657041);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.foundation.lazy.layout.u0.c(function0C8, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C8, q1VarA8, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF8, c0VarR, 0, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                i30 = i33;
                bVar2 = bVar12;
                cVar2 = cVar12;
                eVar2 = eVar11;
                mVar2 = mVar12;
            } else {
                c0VarR.u();
                bVar2 = bVar;
                mVar2 = mVar;
                cVar2 = cVar;
                eVar2 = eVar;
                i30 = iA;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 12582912;
        if ((i11 & 100663296) == 0) {
            if ((i13 & 256) == 0) {
                iA = i10;
                if (c0VarR.K(iA)) {
                    i35 = 67108864;
                }
                i14 |= i35;
            } else {
                iA = i10;
            }
            i35 = com.google.api.client.googleapis.media.a.f115410j;
            i14 |= i35;
        } else {
            iA = i10;
        }
        i20 = i13 & 512;
        if (i20 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            if (c0VarR.D(bVar)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i14 |= i21;
        }
        i22 = i13 & 1024;
        if (i22 != 0) {
            i23 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            if (c0VarR.D(mVar)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i23 = i12 | i24;
        } else {
            i23 = i12;
        }
        i25 = i13 & 2048;
        if (i25 != 0) {
            i23 |= 48;
        } else if ((i12 & 48) != 0) {
            i23 |= c0VarR.D(cVar) ? 32 : 16;
        }
        i26 = i23;
        i27 = i13 & 4096;
        if (i27 != 0) {
            i29 = i26 | a5.S0;
        } else {
            i28 = i26;
            if ((i12 & a5.S0) != 0) {
                i28 |= c0VarR.D(eVar) ? 256 : 128;
            }
            i29 = i28;
        }
        if ((i13 & 8192) != 0) {
            i29 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i29 |= c0VarR.k0(function1) ? 2048 : 1024;
        }
        if ((306783379 & i14) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c0VarR.h(z13, i14 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    iA = p1.a(c0VarR, 0);
                }
                if (i20 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i22 != 0) {
                    mVar3 = null;
                } else {
                    mVar3 = mVar;
                }
                if (i25 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                bVar4 = bVar3;
                mVar4 = mVar3;
                i31 = i14;
                cVar4 = cVar3;
                if (i27 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
            } else {
                if ((i13 & 256) != 0) {
                    i14 &= -234881025;
                    iA = p1.a(c0VarR, 0);
                }
                if (i20 != 0) {
                    bVar3 = null;
                } else {
                    bVar3 = bVar;
                }
                if (i22 != 0) {
                    mVar3 = null;
                } else {
                    mVar3 = mVar;
                }
                if (i25 != 0) {
                    cVar3 = null;
                } else {
                    cVar3 = cVar;
                }
                bVar4 = bVar3;
                mVar4 = mVar3;
                i31 = i14;
                cVar4 = cVar3;
                if (i27 != 0) {
                    eVar3 = null;
                } else {
                    eVar3 = eVar;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(924924659, i31, i29, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:85)");
            }
            i32 = (i31 >> 3) & 14;
            Function0<w> function0C9 = b0.c(j1Var, function1, c0VarR, i32 | ((i29 >> 6) & com.planner5d.library.engine.input.f.b.B));
            int i31118 = i31 >> 9;
            int i31119 = i29;
            androidx.compose.foundation.lazy.layout.q1 q1VarA9 = a1.a(j1Var, z11, c0VarR, i32 | (i31118 & com.planner5d.library.engine.input.f.b.B));
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var9 = (kotlinx.coroutines.s0) objI0;
            androidx.compose.ui.graphics.o1 o1Var9 = (androidx.compose.ui.graphics.o1) c0VarR.W(androidx.compose.ui.platform.q1.r());
            if (((Boolean) c0VarR.W(androidx.compose.ui.platform.q1.x())).booleanValue()) {
                z2VarA = z2.f17630a.a();
            } else {
                z2VarA = null;
            }
            int i311110 = i31119 << 18;
            int i311111 = (i31 & 65520) | (i31118 & 458752) | (i31118 & 3670016) | (i311110 & 29360128) | (i311110 & 234881024) | ((i31119 << 27) & 1879048192);
            i33 = iA;
            z2 z2Var9 = z2VarA;
            i34 = i31;
            androidx.compose.foundation.lazy.layout.v0 v0VarF9 = f(function0C9, j1Var, g5Var2, z10, z11, i33, bVar4, cVar4, eVar3, mVar4, s0Var9, o1Var9, z2Var9, c0VarR, i311111, 0);
            androidx.compose.ui.e.b bVar13 = bVar4;
            androidx.compose.ui.e.c cVar13 = cVar4;
            androidx.compose.foundation.layout.q.e eVar12 = eVar3;
            androidx.compose.foundation.layout.q.m mVar13 = mVar4;
            if (z11) {
                q3Var = q3.Vertical;
            } else {
                q3Var = q3.Horizontal;
            }
            q3Var2 = q3Var;
            if (z12) {
                c0VarR.E(-2077085864);
                a0VarB = androidx.compose.foundation.lazy.layout.r.b(androidx.compose.ui.a0.E, l.a(j1Var, i33, c0VarR, i32 | ((i34 >> 21) & com.planner5d.library.engine.input.f.b.B)), j1Var.C(), z10, q3Var2);
                c0VarR.A();
            } else {
                c0VarR.E(-2076657041);
                c0VarR.A();
                a0VarB = androidx.compose.ui.a0.E;
            }
            androidx.compose.foundation.lazy.layout.u0.c(function0C9, c5.a(androidx.compose.foundation.lazy.layout.r1.c(a0Var.B2(j1Var.W()).B2(j1Var.B()), function0C9, q1VarA9, q3Var2, z12, z10, c0VarR, ((i34 >> 6) & 57344) | ((i34 << 6) & 458752)).B2(a0VarB).B2(j1Var.J().j()), j1Var, q3Var2, z12, z10, c3Var, j1Var.I(), false, x3Var, (256 & 256) != 0 ? null : null), j1Var.R(), v0VarF9, c0VarR, 0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            i30 = i33;
            bVar2 = bVar13;
            cVar2 = cVar13;
            eVar2 = eVar12;
            mVar2 = mVar13;
        } else {
            c0VarR.u();
            bVar2 = bVar;
            mVar2 = mVar;
            cVar2 = cVar;
            eVar2 = eVar;
            i30 = iA;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.c(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i30, bVar2, mVar2, cVar2, eVar2, function1, i11, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(androidx.compose.ui.a0 a0Var, j1 j1Var, g5 g5Var, boolean z10, boolean z11, c3 c3Var, boolean z12, x3 x3Var, int i10, androidx.compose.ui.e.b bVar, androidx.compose.foundation.layout.q.m mVar, androidx.compose.ui.e.c cVar, androidx.compose.foundation.layout.q.e eVar, Function1 function1, int i11, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        b(a0Var, j1Var, g5Var, z10, z11, c3Var, z12, x3Var, i10, bVar, mVar, cVar, eVar, function1, c0Var, t4.a(i11 | 1), t4.a(i12), i13);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.foundation.lazy.layout.g gVar, List<n0> list, p0 p0Var) {
        Trace.beginSection("compose:lazy:cache_window:keepAroundItems");
        try {
            if (gVar.r() && !list.isEmpty()) {
                int index = ((n0) CollectionsKt.first((List) list)).getIndex();
                int index2 = ((n0) CollectionsKt.last((List) list)).getIndex();
                for (int iQ = gVar.q(); iQ < index; iQ++) {
                    p0Var.j(iQ);
                }
                int i10 = index2 + 1;
                int iP = gVar.p();
                if (i10 <= iP) {
                    while (true) {
                        p0Var.j(i10);
                        if (i10 == iP) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            Unit unit = Unit.f312394a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0164  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a A[PHI: r4
      0x007a: PHI (r4v17 boolean) = (r4v15 boolean), (r4v18 boolean) binds: [B:36:0x0078, B:32:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2 A[PHI: r9
      0x00b2: PHI (r9v18 androidx.compose.ui.e$b) = (r9v14 androidx.compose.ui.e$b), (r9v20 androidx.compose.ui.e$b) binds: [B:54:0x00b0, B:50:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce A[PHI: r12
      0x00ce: PHI (r12v14 androidx.compose.ui.e$c) = (r12v10 androidx.compose.ui.e$c), (r12v15 androidx.compose.ui.e$c) binds: [B:64:0x00cc, B:60:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec A[PHI: r13
      0x00ec: PHI (r13v13 androidx.compose.foundation.layout.q$e) = (r13v10 androidx.compose.foundation.layout.q$e), (r13v15 androidx.compose.foundation.layout.q$e) binds: [B:74:0x00ea, B:70:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108 A[PHI: r5
      0x0108: PHI (r5v9 androidx.compose.foundation.layout.q$m) = (r5v7 androidx.compose.foundation.layout.q$m), (r5v10 androidx.compose.foundation.layout.q$m) binds: [B:84:0x0106, B:80:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a A[PHI: r6
      0x012a: PHI (r6v7 androidx.compose.foundation.lazy.layout.z2) = (r6v5 androidx.compose.foundation.lazy.layout.z2), (r6v9 androidx.compose.foundation.lazy.layout.z2) binds: [B:94:0x0128, B:90:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    @androidx.compose.runtime.o
    @androidx.compose.foundation.b2
    private static final androidx.compose.foundation.lazy.layout.v0 f(Function0<? extends w> function0, j1 j1Var, g5 g5Var, boolean z10, boolean z11, int i10, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, androidx.compose.foundation.layout.q.e eVar, androidx.compose.foundation.layout.q.m mVar, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.o1 o1Var, z2 z2Var, androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        boolean z12;
        boolean z13;
        androidx.compose.ui.e.b bVar2;
        boolean z14;
        androidx.compose.ui.e.c cVar2;
        boolean z15;
        androidx.compose.foundation.layout.q.e eVar2;
        boolean z16;
        androidx.compose.foundation.layout.q.m mVar2;
        boolean z17;
        z2 z2Var2;
        boolean z18;
        boolean z19;
        Object objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(406165748, i11, i12, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:188)");
        }
        boolean z20 = ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(j1Var)) || (i11 & 48) == 32) | ((((i11 & 896) ^ a5.S0) > 256 && c0Var.D(g5Var)) || (i11 & a5.S0) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && c0Var.G(z10)) || (i11 & 3072) == 2048);
        if (((57344 & i11) ^ 24576) > 16384) {
            z12 = z11;
            if (c0Var.G(z12)) {
                z13 = true;
            }
            boolean z21 = z20 | z13 | ((((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) <= 131072 && c0Var.K(i10)) || (i11 & androidx.profileinstaller.n.c.f73814m) == 131072);
            if (((3670016 & i11) ^ 1572864) > 1048576) {
                bVar2 = bVar;
                if (!c0Var.D(bVar2)) {
                    z14 = true;
                }
                boolean z22 = z21 | z14;
                if (((29360128 & i11) ^ 12582912) > 8388608) {
                    cVar2 = cVar;
                    if (!c0Var.D(cVar2)) {
                        z15 = true;
                    }
                    boolean z23 = z22 | z15;
                    if (((234881024 & i11) ^ 100663296) > 67108864) {
                        eVar2 = eVar;
                        if (!c0Var.D(eVar2)) {
                            z16 = true;
                        }
                        boolean z24 = z23 | z16;
                        if (((1879048192 & i11) ^ 805306368) > 536870912) {
                            mVar2 = mVar;
                            if (!c0Var.D(mVar2)) {
                                z17 = true;
                            }
                            boolean zD = z17 | z24 | c0Var.D(o1Var);
                            if (((i12 & 896) ^ a5.S0) > 256) {
                                z2Var2 = z2Var;
                                if (!c0Var.D(z2Var2)) {
                                    z18 = true;
                                }
                                z19 = zD | z18;
                                objI0 = c0Var.i0();
                                if (z19 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    a aVar = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                    c0Var.Y(aVar);
                                    objI0 = aVar;
                                }
                                androidx.compose.foundation.lazy.layout.v0 v0Var = (androidx.compose.foundation.lazy.layout.v0) objI0;
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                return v0Var;
                            }
                            z2Var2 = z2Var;
                            if ((i12 & a5.S0) == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = zD | z18;
                            objI0 = c0Var.i0();
                            if (z19) {
                                a aVar2 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar2);
                                objI0 = aVar2;
                            } else {
                                a aVar3 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar3);
                                objI0 = aVar3;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var2 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var2;
                        }
                        mVar2 = mVar;
                        if ((i11 & 805306368) == 536870912) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zD2 = z17 | z24 | c0Var.D(o1Var);
                        if (((i12 & 896) ^ a5.S0) > 256) {
                            z2Var2 = z2Var;
                            if (!c0Var.D(z2Var2)) {
                                z18 = true;
                            }
                            z19 = zD2 | z18;
                            objI0 = c0Var.i0();
                            if (z19) {
                                a aVar4 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar4);
                                objI0 = aVar4;
                            } else {
                                a aVar5 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar5);
                                objI0 = aVar5;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var3 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var3;
                        }
                        z2Var2 = z2Var;
                        if ((i12 & a5.S0) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zD2 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar6 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar6);
                            objI0 = aVar6;
                        } else {
                            a aVar7 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar7);
                            objI0 = aVar7;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var4 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var4;
                    }
                    eVar2 = eVar;
                    if ((100663296 & i11) == 67108864) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z25 = z23 | z16;
                    if (((1879048192 & i11) ^ 805306368) > 536870912) {
                        mVar2 = mVar;
                        if (!c0Var.D(mVar2)) {
                            z17 = true;
                        }
                        boolean zD3 = z17 | z25 | c0Var.D(o1Var);
                        if (((i12 & 896) ^ a5.S0) > 256) {
                            z2Var2 = z2Var;
                            if (!c0Var.D(z2Var2)) {
                                z18 = true;
                            }
                            z19 = zD3 | z18;
                            objI0 = c0Var.i0();
                            if (z19) {
                                a aVar8 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar8);
                                objI0 = aVar8;
                            } else {
                                a aVar9 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar9);
                                objI0 = aVar9;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var5 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var5;
                        }
                        z2Var2 = z2Var;
                        if ((i12 & a5.S0) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zD3 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar10 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar10);
                            objI0 = aVar10;
                        } else {
                            a aVar11 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar11);
                            objI0 = aVar11;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var6 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var6;
                    }
                    mVar2 = mVar;
                    if ((i11 & 805306368) == 536870912) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zD4 = z17 | z25 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD4 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar12 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar12);
                            objI0 = aVar12;
                        } else {
                            a aVar13 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar13);
                            objI0 = aVar13;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var7 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var7;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD4 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar14 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar14);
                        objI0 = aVar14;
                    } else {
                        a aVar15 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar15);
                        objI0 = aVar15;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var8 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var8;
                }
                cVar2 = cVar;
                if ((12582912 & i11) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z26 = z22 | z15;
                if (((234881024 & i11) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!c0Var.D(eVar2)) {
                        z16 = true;
                    }
                    boolean z27 = z26 | z16;
                    if (((1879048192 & i11) ^ 805306368) > 536870912) {
                        mVar2 = mVar;
                        if (!c0Var.D(mVar2)) {
                            z17 = true;
                        }
                        boolean zD5 = z17 | z27 | c0Var.D(o1Var);
                        if (((i12 & 896) ^ a5.S0) > 256) {
                            z2Var2 = z2Var;
                            if (!c0Var.D(z2Var2)) {
                                z18 = true;
                            }
                            z19 = zD5 | z18;
                            objI0 = c0Var.i0();
                            if (z19) {
                                a aVar16 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar16);
                                objI0 = aVar16;
                            } else {
                                a aVar17 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar17);
                                objI0 = aVar17;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var9 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var9;
                        }
                        z2Var2 = z2Var;
                        if ((i12 & a5.S0) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zD5 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar18 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar18);
                            objI0 = aVar18;
                        } else {
                            a aVar19 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar19);
                            objI0 = aVar19;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var10 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var10;
                    }
                    mVar2 = mVar;
                    if ((i11 & 805306368) == 536870912) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zD6 = z17 | z27 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD6 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar110);
                            objI0 = aVar110;
                        } else {
                            a aVar111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar111);
                            objI0 = aVar111;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var11 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var11;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD6 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar112);
                        objI0 = aVar112;
                    } else {
                        a aVar113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar113);
                        objI0 = aVar113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var12 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var12;
                }
                eVar2 = eVar;
                if ((100663296 & i11) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z28 = z26 | z16;
                if (((1879048192 & i11) ^ 805306368) > 536870912) {
                    mVar2 = mVar;
                    if (!c0Var.D(mVar2)) {
                        z17 = true;
                    }
                    boolean zD7 = z17 | z28 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD7 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar114);
                            objI0 = aVar114;
                        } else {
                            a aVar115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar115);
                            objI0 = aVar115;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var13 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var13;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD7 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar116);
                        objI0 = aVar116;
                    } else {
                        a aVar117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar117);
                        objI0 = aVar117;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var14 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var14;
                }
                mVar2 = mVar;
                if ((i11 & 805306368) == 536870912) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zD8 = z17 | z28 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD8 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar118);
                        objI0 = aVar118;
                    } else {
                        a aVar119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar119);
                        objI0 = aVar119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var15 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var15;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD8 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar1110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1110);
                    objI0 = aVar1110;
                } else {
                    a aVar1111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111);
                    objI0 = aVar1111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var16 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var16;
            }
            bVar2 = bVar;
            if ((1572864 & i11) == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z29 = z21 | z14;
            if (((29360128 & i11) ^ 12582912) > 8388608) {
                cVar2 = cVar;
                if (!c0Var.D(cVar2)) {
                    z15 = true;
                }
                boolean z210 = z29 | z15;
                if (((234881024 & i11) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!c0Var.D(eVar2)) {
                        z16 = true;
                    }
                    boolean z211 = z210 | z16;
                    if (((1879048192 & i11) ^ 805306368) > 536870912) {
                        mVar2 = mVar;
                        if (!c0Var.D(mVar2)) {
                            z17 = true;
                        }
                        boolean zD9 = z17 | z211 | c0Var.D(o1Var);
                        if (((i12 & 896) ^ a5.S0) > 256) {
                            z2Var2 = z2Var;
                            if (!c0Var.D(z2Var2)) {
                                z18 = true;
                            }
                            z19 = zD9 | z18;
                            objI0 = c0Var.i0();
                            if (z19) {
                                a aVar1112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar1112);
                                objI0 = aVar1112;
                            } else {
                                a aVar1113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar1113);
                                objI0 = aVar1113;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var17 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var17;
                        }
                        z2Var2 = z2Var;
                        if ((i12 & a5.S0) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zD9 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar1114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1114);
                            objI0 = aVar1114;
                        } else {
                            a aVar1115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1115);
                            objI0 = aVar1115;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var18 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var18;
                    }
                    mVar2 = mVar;
                    if ((i11 & 805306368) == 536870912) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zD10 = z17 | z211 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD10 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar1116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1116);
                            objI0 = aVar1116;
                        } else {
                            a aVar1117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1117);
                            objI0 = aVar1117;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var19 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var19;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD10 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar1118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar1118);
                        objI0 = aVar1118;
                    } else {
                        a aVar1119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar1119);
                        objI0 = aVar1119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var110;
                }
                eVar2 = eVar;
                if ((100663296 & i11) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z212 = z210 | z16;
                if (((1879048192 & i11) ^ 805306368) > 536870912) {
                    mVar2 = mVar;
                    if (!c0Var.D(mVar2)) {
                        z17 = true;
                    }
                    boolean zD11 = z17 | z212 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD11 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar11110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar11110);
                            objI0 = aVar11110;
                        } else {
                            a aVar11111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar11111);
                            objI0 = aVar11111;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var111;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD11 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar11112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11112);
                        objI0 = aVar11112;
                    } else {
                        a aVar11113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11113);
                        objI0 = aVar11113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var112;
                }
                mVar2 = mVar;
                if ((i11 & 805306368) == 536870912) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zD12 = z17 | z212 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD12 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar11114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11114);
                        objI0 = aVar11114;
                    } else {
                        a aVar11115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11115);
                        objI0 = aVar11115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var113;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD12 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar11116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11116);
                    objI0 = aVar11116;
                } else {
                    a aVar11117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11117);
                    objI0 = aVar11117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var114;
            }
            cVar2 = cVar;
            if ((12582912 & i11) == 8388608) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z213 = z29 | z15;
            if (((234881024 & i11) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!c0Var.D(eVar2)) {
                    z16 = true;
                }
                boolean z214 = z213 | z16;
                if (((1879048192 & i11) ^ 805306368) > 536870912) {
                    mVar2 = mVar;
                    if (!c0Var.D(mVar2)) {
                        z17 = true;
                    }
                    boolean zD13 = z17 | z214 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD13 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar11118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar11118);
                            objI0 = aVar11118;
                        } else {
                            a aVar11119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar11119);
                            objI0 = aVar11119;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var115;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD13 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111110);
                        objI0 = aVar111110;
                    } else {
                        a aVar111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111);
                        objI0 = aVar111111;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var116;
                }
                mVar2 = mVar;
                if ((i11 & 805306368) == 536870912) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zD14 = z17 | z214 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD14 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111112);
                        objI0 = aVar111112;
                    } else {
                        a aVar111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111113);
                        objI0 = aVar111113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var117;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD14 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111114);
                    objI0 = aVar111114;
                } else {
                    a aVar111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111115);
                    objI0 = aVar111115;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var118;
            }
            eVar2 = eVar;
            if ((100663296 & i11) == 67108864) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z215 = z213 | z16;
            if (((1879048192 & i11) ^ 805306368) > 536870912) {
                mVar2 = mVar;
                if (!c0Var.D(mVar2)) {
                    z17 = true;
                }
                boolean zD15 = z17 | z215 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD15 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111116);
                        objI0 = aVar111116;
                    } else {
                        a aVar111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111117);
                        objI0 = aVar111117;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var119;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD15 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar111118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111118);
                    objI0 = aVar111118;
                } else {
                    a aVar111119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111119);
                    objI0 = aVar111119;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var1110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var1110;
            }
            mVar2 = mVar;
            if ((i11 & 805306368) == 536870912) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zD16 = z17 | z215 | c0Var.D(o1Var);
            if (((i12 & 896) ^ a5.S0) > 256) {
                z2Var2 = z2Var;
                if (!c0Var.D(z2Var2)) {
                    z18 = true;
                }
                z19 = zD16 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar1111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111110);
                    objI0 = aVar1111110;
                } else {
                    a aVar1111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111111);
                    objI0 = aVar1111111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var1111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var1111;
            }
            z2Var2 = z2Var;
            if ((i12 & a5.S0) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zD16 | z18;
            objI0 = c0Var.i0();
            if (z19) {
                a aVar1111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111112);
                objI0 = aVar1111112;
            } else {
                a aVar1111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111113);
                objI0 = aVar1111113;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1112;
        }
        z12 = z11;
        if ((i11 & 24576) == 16384) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z216 = z20 | z13 | ((((458752 & i11) ^ androidx.profileinstaller.n.c.f73814m) <= 131072 && c0Var.K(i10)) || (i11 & androidx.profileinstaller.n.c.f73814m) == 131072);
        if (((3670016 & i11) ^ 1572864) > 1048576) {
            bVar2 = bVar;
            if (!c0Var.D(bVar2)) {
                z14 = true;
            }
            boolean z217 = z216 | z14;
            if (((29360128 & i11) ^ 12582912) > 8388608) {
                cVar2 = cVar;
                if (!c0Var.D(cVar2)) {
                    z15 = true;
                }
                boolean z218 = z217 | z15;
                if (((234881024 & i11) ^ 100663296) > 67108864) {
                    eVar2 = eVar;
                    if (!c0Var.D(eVar2)) {
                        z16 = true;
                    }
                    boolean z219 = z218 | z16;
                    if (((1879048192 & i11) ^ 805306368) > 536870912) {
                        mVar2 = mVar;
                        if (!c0Var.D(mVar2)) {
                            z17 = true;
                        }
                        boolean zD17 = z17 | z219 | c0Var.D(o1Var);
                        if (((i12 & 896) ^ a5.S0) > 256) {
                            z2Var2 = z2Var;
                            if (!c0Var.D(z2Var2)) {
                                z18 = true;
                            }
                            z19 = zD17 | z18;
                            objI0 = c0Var.i0();
                            if (z19) {
                                a aVar1111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar1111114);
                                objI0 = aVar1111114;
                            } else {
                                a aVar1111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                                c0Var.Y(aVar1111115);
                                objI0 = aVar1111115;
                            }
                            androidx.compose.foundation.lazy.layout.v0 v0Var1113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            return v0Var1113;
                        }
                        z2Var2 = z2Var;
                        if ((i12 & a5.S0) == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zD17 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar1111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1111116);
                            objI0 = aVar1111116;
                        } else {
                            a aVar1111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1111117);
                            objI0 = aVar1111117;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var1114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var1114;
                    }
                    mVar2 = mVar;
                    if ((i11 & 805306368) == 536870912) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zD18 = z17 | z219 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD18 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar1111118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1111118);
                            objI0 = aVar1111118;
                        } else {
                            a aVar1111119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1111119);
                            objI0 = aVar1111119;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var1115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var1115;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD18 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar11111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111110);
                        objI0 = aVar11111110;
                    } else {
                        a aVar11111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111111);
                        objI0 = aVar11111111;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var1116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var1116;
                }
                eVar2 = eVar;
                if ((100663296 & i11) == 67108864) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2110 = z218 | z16;
                if (((1879048192 & i11) ^ 805306368) > 536870912) {
                    mVar2 = mVar;
                    if (!c0Var.D(mVar2)) {
                        z17 = true;
                    }
                    boolean zD19 = z17 | z2110 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD19 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar11111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar11111112);
                            objI0 = aVar11111112;
                        } else {
                            a aVar11111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar11111113);
                            objI0 = aVar11111113;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var1117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var1117;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD19 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar11111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111114);
                        objI0 = aVar11111114;
                    } else {
                        a aVar11111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111115);
                        objI0 = aVar11111115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var1118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var1118;
                }
                mVar2 = mVar;
                if ((i11 & 805306368) == 536870912) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zD110 = z17 | z2110 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD110 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar11111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111116);
                        objI0 = aVar11111116;
                    } else {
                        a aVar11111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111117);
                        objI0 = aVar11111117;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var1119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var1119;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD110 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar11111118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111118);
                    objI0 = aVar11111118;
                } else {
                    a aVar11111119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111119);
                    objI0 = aVar11111119;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11110;
            }
            cVar2 = cVar;
            if ((12582912 & i11) == 8388608) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z2111 = z217 | z15;
            if (((234881024 & i11) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!c0Var.D(eVar2)) {
                    z16 = true;
                }
                boolean z2112 = z2111 | z16;
                if (((1879048192 & i11) ^ 805306368) > 536870912) {
                    mVar2 = mVar;
                    if (!c0Var.D(mVar2)) {
                        z17 = true;
                    }
                    boolean zD111 = z17 | z2112 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD111 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar111111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar111111110);
                            objI0 = aVar111111110;
                        } else {
                            a aVar111111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar111111111);
                            objI0 = aVar111111111;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var11111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var11111;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD111 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar111111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111112);
                        objI0 = aVar111111112;
                    } else {
                        a aVar111111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111113);
                        objI0 = aVar111111113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var11112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var11112;
                }
                mVar2 = mVar;
                if ((i11 & 805306368) == 536870912) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zD112 = z17 | z2112 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD112 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar111111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111114);
                        objI0 = aVar111111114;
                    } else {
                        a aVar111111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111115);
                        objI0 = aVar111111115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var11113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var11113;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD112 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar111111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111111116);
                    objI0 = aVar111111116;
                } else {
                    a aVar111111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111111117);
                    objI0 = aVar111111117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11114;
            }
            eVar2 = eVar;
            if ((100663296 & i11) == 67108864) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z2113 = z2111 | z16;
            if (((1879048192 & i11) ^ 805306368) > 536870912) {
                mVar2 = mVar;
                if (!c0Var.D(mVar2)) {
                    z17 = true;
                }
                boolean zD113 = z17 | z2113 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD113 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar111111118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111118);
                        objI0 = aVar111111118;
                    } else {
                        a aVar111111119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111119);
                        objI0 = aVar111111119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var11115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var11115;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD113 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar1111111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111111110);
                    objI0 = aVar1111111110;
                } else {
                    a aVar1111111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111111111);
                    objI0 = aVar1111111111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11116;
            }
            mVar2 = mVar;
            if ((i11 & 805306368) == 536870912) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zD114 = z17 | z2113 | c0Var.D(o1Var);
            if (((i12 & 896) ^ a5.S0) > 256) {
                z2Var2 = z2Var;
                if (!c0Var.D(z2Var2)) {
                    z18 = true;
                }
                z19 = zD114 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar1111111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111111112);
                    objI0 = aVar1111111112;
                } else {
                    a aVar1111111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111111113);
                    objI0 = aVar1111111113;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var11117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var11117;
            }
            z2Var2 = z2Var;
            if ((i12 & a5.S0) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zD114 | z18;
            objI0 = c0Var.i0();
            if (z19) {
                a aVar1111111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111111114);
                objI0 = aVar1111111114;
            } else {
                a aVar1111111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111111115);
                objI0 = aVar1111111115;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var11118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var11118;
        }
        bVar2 = bVar;
        if ((1572864 & i11) == 1048576) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z2114 = z216 | z14;
        if (((29360128 & i11) ^ 12582912) > 8388608) {
            cVar2 = cVar;
            if (!c0Var.D(cVar2)) {
                z15 = true;
            }
            boolean z2115 = z2114 | z15;
            if (((234881024 & i11) ^ 100663296) > 67108864) {
                eVar2 = eVar;
                if (!c0Var.D(eVar2)) {
                    z16 = true;
                }
                boolean z2116 = z2115 | z16;
                if (((1879048192 & i11) ^ 805306368) > 536870912) {
                    mVar2 = mVar;
                    if (!c0Var.D(mVar2)) {
                        z17 = true;
                    }
                    boolean zD115 = z17 | z2116 | c0Var.D(o1Var);
                    if (((i12 & 896) ^ a5.S0) > 256) {
                        z2Var2 = z2Var;
                        if (!c0Var.D(z2Var2)) {
                            z18 = true;
                        }
                        z19 = zD115 | z18;
                        objI0 = c0Var.i0();
                        if (z19) {
                            a aVar1111111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1111111116);
                            objI0 = aVar1111111116;
                        } else {
                            a aVar1111111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                            c0Var.Y(aVar1111111117);
                            objI0 = aVar1111111117;
                        }
                        androidx.compose.foundation.lazy.layout.v0 v0Var11119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        return v0Var11119;
                    }
                    z2Var2 = z2Var;
                    if ((i12 & a5.S0) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zD115 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar1111111118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar1111111118);
                        objI0 = aVar1111111118;
                    } else {
                        a aVar1111111119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar1111111119);
                        objI0 = aVar1111111119;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111110;
                }
                mVar2 = mVar;
                if ((i11 & 805306368) == 536870912) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zD116 = z17 | z2116 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD116 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar11111111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111111110);
                        objI0 = aVar11111111110;
                    } else {
                        a aVar11111111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111111111);
                        objI0 = aVar11111111111;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111111;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD116 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar11111111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111111112);
                    objI0 = aVar11111111112;
                } else {
                    a aVar11111111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111111113);
                    objI0 = aVar11111111113;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111112;
            }
            eVar2 = eVar;
            if ((100663296 & i11) == 67108864) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z2117 = z2115 | z16;
            if (((1879048192 & i11) ^ 805306368) > 536870912) {
                mVar2 = mVar;
                if (!c0Var.D(mVar2)) {
                    z17 = true;
                }
                boolean zD117 = z17 | z2117 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD117 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar11111111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111111114);
                        objI0 = aVar11111111114;
                    } else {
                        a aVar11111111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar11111111115);
                        objI0 = aVar11111111115;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111113;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD117 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar11111111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111111116);
                    objI0 = aVar11111111116;
                } else {
                    a aVar11111111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111111117);
                    objI0 = aVar11111111117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111114 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111114;
            }
            mVar2 = mVar;
            if ((i11 & 805306368) == 536870912) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zD118 = z17 | z2117 | c0Var.D(o1Var);
            if (((i12 & 896) ^ a5.S0) > 256) {
                z2Var2 = z2Var;
                if (!c0Var.D(z2Var2)) {
                    z18 = true;
                }
                z19 = zD118 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar11111111118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111111118);
                    objI0 = aVar11111111118;
                } else {
                    a aVar11111111119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar11111111119);
                    objI0 = aVar11111111119;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111115 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111115;
            }
            z2Var2 = z2Var;
            if ((i12 & a5.S0) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zD118 | z18;
            objI0 = c0Var.i0();
            if (z19) {
                a aVar111111111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar111111111110);
                objI0 = aVar111111111110;
            } else {
                a aVar111111111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar111111111111);
                objI0 = aVar111111111111;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var111116 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var111116;
        }
        cVar2 = cVar;
        if ((12582912 & i11) == 8388608) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean z2118 = z2114 | z15;
        if (((234881024 & i11) ^ 100663296) > 67108864) {
            eVar2 = eVar;
            if (!c0Var.D(eVar2)) {
                z16 = true;
            }
            boolean z2119 = z2118 | z16;
            if (((1879048192 & i11) ^ 805306368) > 536870912) {
                mVar2 = mVar;
                if (!c0Var.D(mVar2)) {
                    z17 = true;
                }
                boolean zD119 = z17 | z2119 | c0Var.D(o1Var);
                if (((i12 & 896) ^ a5.S0) > 256) {
                    z2Var2 = z2Var;
                    if (!c0Var.D(z2Var2)) {
                        z18 = true;
                    }
                    z19 = zD119 | z18;
                    objI0 = c0Var.i0();
                    if (z19) {
                        a aVar111111111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111111112);
                        objI0 = aVar111111111112;
                    } else {
                        a aVar111111111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                        c0Var.Y(aVar111111111113);
                        objI0 = aVar111111111113;
                    }
                    androidx.compose.foundation.lazy.layout.v0 v0Var111117 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    return v0Var111117;
                }
                z2Var2 = z2Var;
                if ((i12 & a5.S0) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zD119 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar111111111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111111111114);
                    objI0 = aVar111111111114;
                } else {
                    a aVar111111111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111111111115);
                    objI0 = aVar111111111115;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111118 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111118;
            }
            mVar2 = mVar;
            if ((i11 & 805306368) == 536870912) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zD1110 = z17 | z2119 | c0Var.D(o1Var);
            if (((i12 & 896) ^ a5.S0) > 256) {
                z2Var2 = z2Var;
                if (!c0Var.D(z2Var2)) {
                    z18 = true;
                }
                z19 = zD1110 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar111111111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111111111116);
                    objI0 = aVar111111111116;
                } else {
                    a aVar111111111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar111111111117);
                    objI0 = aVar111111111117;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var111119 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var111119;
            }
            z2Var2 = z2Var;
            if ((i12 & a5.S0) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zD1110 | z18;
            objI0 = c0Var.i0();
            if (z19) {
                a aVar111111111118 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar111111111118);
                objI0 = aVar111111111118;
            } else {
                a aVar111111111119 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar111111111119);
                objI0 = aVar111111111119;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1111110 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1111110;
        }
        eVar2 = eVar;
        if ((100663296 & i11) == 67108864) {
            z16 = true;
        } else {
            z16 = false;
        }
        boolean z21110 = z2118 | z16;
        if (((1879048192 & i11) ^ 805306368) > 536870912) {
            mVar2 = mVar;
            if (!c0Var.D(mVar2)) {
                z17 = true;
            }
            boolean zD1111 = z17 | z21110 | c0Var.D(o1Var);
            if (((i12 & 896) ^ a5.S0) > 256) {
                z2Var2 = z2Var;
                if (!c0Var.D(z2Var2)) {
                    z18 = true;
                }
                z19 = zD1111 | z18;
                objI0 = c0Var.i0();
                if (z19) {
                    a aVar1111111111110 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111111111110);
                    objI0 = aVar1111111111110;
                } else {
                    a aVar1111111111111 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                    c0Var.Y(aVar1111111111111);
                    objI0 = aVar1111111111111;
                }
                androidx.compose.foundation.lazy.layout.v0 v0Var1111111 = (androidx.compose.foundation.lazy.layout.v0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return v0Var1111111;
            }
            z2Var2 = z2Var;
            if ((i12 & a5.S0) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zD1111 | z18;
            objI0 = c0Var.i0();
            if (z19) {
                a aVar1111111111112 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111111111112);
                objI0 = aVar1111111111112;
            } else {
                a aVar1111111111113 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111111111113);
                objI0 = aVar1111111111113;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1111112 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1111112;
        }
        mVar2 = mVar;
        if ((i11 & 805306368) == 536870912) {
            z17 = true;
        } else {
            z17 = false;
        }
        boolean zD1112 = z17 | z21110 | c0Var.D(o1Var);
        if (((i12 & 896) ^ a5.S0) > 256) {
            z2Var2 = z2Var;
            if (!c0Var.D(z2Var2)) {
                z18 = true;
            }
            z19 = zD1112 | z18;
            objI0 = c0Var.i0();
            if (z19) {
                a aVar1111111111114 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111111111114);
                objI0 = aVar1111111111114;
            } else {
                a aVar1111111111115 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
                c0Var.Y(aVar1111111111115);
                objI0 = aVar1111111111115;
            }
            androidx.compose.foundation.lazy.layout.v0 v0Var1111113 = (androidx.compose.foundation.lazy.layout.v0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return v0Var1111113;
        }
        z2Var2 = z2Var;
        if ((i12 & a5.S0) == 256) {
            z18 = true;
        } else {
            z18 = false;
        }
        z19 = zD1112 | z18;
        objI0 = c0Var.i0();
        if (z19) {
            a aVar1111111111116 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
            c0Var.Y(aVar1111111111116);
            objI0 = aVar1111111111116;
        } else {
            a aVar1111111111117 = new a(j1Var, z12, g5Var, z10, function0, mVar2, eVar2, i10, s0Var, o1Var, z2Var2, bVar2, cVar2);
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
