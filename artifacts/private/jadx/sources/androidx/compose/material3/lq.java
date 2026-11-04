package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2045:1\n1282#2,6:2046\n1#3:2052\n75#4:2053\n75#4:2054\n113#5:2055\n113#5:2056\n113#5:2057\n113#5:2058\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1171#1:2046,6\n1368#1:2053\n1390#1:2054\n894#1:2055\n900#1:2056\n903#1:2057\n906#1:2058\n*E\n"})
public final class lq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final lq f30410a = new lq();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f30411b = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f30412c = androidx.compose.ui.unit.h.r(280);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f30413d = androidx.compose.ui.unit.h.r(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f30414e = androidx.compose.ui.unit.h.r(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30415f = 0;

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f30418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j40 f30419d;

        b(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var) {
            this.f30416a = z10;
            this.f30417b = z11;
            this.f30418c = hVar;
            this.f30419d = j40Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 7 ^ (-1);
                androidx.compose.runtime.m0.A0(-896270173, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1157)");
            }
            lq lqVar = lq.f30410a;
            int i12 = 3 | 0;
            lqVar.d(this.f30416a, this.f30417b, this.f30418c, androidx.compose.ui.a0.E, this.f30419d, lqVar.s(c0Var, 6), lqVar.p(), lqVar.t(), c0Var, 114822144, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class c implements pj.n<w40, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30420a;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f30420a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(w40 w40Var, androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 17) != 16, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1459717586, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous>.<anonymous> (TextFieldDefaults.kt:1182)");
            }
            this.f30420a.invoke(c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(w40 w40Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(w40Var, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class d implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f30421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f30423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j40 f30424d;

        d(boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var) {
            this.f30421a = z10;
            this.f30422b = z11;
            this.f30423c = hVar;
            this.f30424d = j40Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-163468598, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<anonymous> (TextFieldDefaults.kt:983)");
            }
            lq lqVar = lq.f30410a;
            lqVar.d(this.f30421a, this.f30422b, this.f30423c, null, this.f30424d, lqVar.s(c0Var, 6), lqVar.p(), lqVar.t(), c0Var, 114819072, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults$decorator$2\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2045:1\n170#2,8:2046\n1#3:2054\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults$decorator$2\n*L\n1001#1:2046,8\n*E\n"})
    static final class e implements androidx.compose.foundation.text.input.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.h f30425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.p f30426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.o f30427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v40 f30428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<w40, androidx.compose.runtime.c0, Integer, Unit> f30429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30430f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30432h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30433i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30434j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30435k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f30436l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f30437m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.h f30438n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.g5 f30439o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ j40 f30440p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f30441q;

        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.foundation.text.input.h hVar, androidx.compose.foundation.text.input.p pVar, androidx.compose.foundation.text.input.o oVar, v40 v40Var, pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar2, androidx.compose.foundation.layout.g5 g5Var, j40 j40Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8) {
            this.f30425a = hVar;
            this.f30426b = pVar;
            this.f30427c = oVar;
            this.f30428d = v40Var;
            this.f30429e = nVar;
            this.f30430f = function2;
            this.f30431g = function3;
            this.f30432h = function4;
            this.f30433i = function5;
            this.f30434j = function6;
            this.f30435k = function7;
            this.f30436l = z10;
            this.f30437m = z11;
            this.f30438n = hVar2;
            this.f30439o = g5Var;
            this.f30440p = j40Var;
            this.f30441q = function8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(e eVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
            eVar.a(function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
            return Unit.f312394a;
        }

        @Override // androidx.compose.foundation.text.input.n
        @androidx.compose.runtime.o
        @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void a(final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
            int i11;
            androidx.compose.runtime.c0 c0Var2;
            androidx.compose.foundation.text.input.j jVar;
            CharSequence charSequenceE;
            androidx.compose.runtime.c0 c0VarR = c0Var.R(794272399);
            if ((i10 & 6) == 0) {
                i11 = i10 | (c0VarR.k0(function2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= c0VarR.D(this) ? 32 : 16;
            }
            if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(794272399, i11, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator.<no name provided>.Decoration (TextFieldDefaults.kt:994)");
                }
                if (this.f30425a == null) {
                    charSequenceE = this.f30426b.p();
                } else {
                    androidx.compose.foundation.text.input.p pVar = this.f30426b;
                    androidx.compose.foundation.text.input.j jVarA = pVar.A();
                    try {
                        pVar.d(jVarA);
                        pVar.k();
                        androidx.compose.foundation.text.input.h hVar = this.f30425a;
                        if (jVarA == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("buffer");
                            jVar = null;
                        } else {
                            jVar = jVarA;
                        }
                        hVar.a(jVar);
                        charSequenceE = jVarA.e();
                    } catch (Throwable th2) {
                        pVar.k();
                        throw th2;
                    }
                }
                c0Var2 = c0VarR;
                androidx.compose.material3.internal.b4.l(androidx.compose.material3.internal.f4.Outlined, charSequenceE, function2, this.f30428d, this.f30429e, this.f30430f, this.f30431g, this.f30432h, this.f30433i, this.f30434j, this.f30435k, Intrinsics.areEqual(this.f30427c, androidx.compose.foundation.text.input.o.c.f20303b), this.f30436l, this.f30437m, this.f30438n, this.f30439o, this.f30440p, this.f30441q, c0Var2, ((i11 << 6) & 896) | 6, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
            }
            androidx.compose.runtime.s5 s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return lq.e.c(this.f30658a, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }

    private lq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(lq lqVar, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        lqVar.e(z10, z11, hVar, j40Var, q3Var, f10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(lq lqVar, boolean z10, boolean z11, androidx.compose.foundation.interaction.h hVar, androidx.compose.ui.a0 a0Var, j40 j40Var, androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        lqVar.d(z10, z11, hVar, a0Var, j40Var, q3Var, f10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(lq lqVar, String str, Function2 function2, boolean z10, boolean z11, androidx.compose.ui.text.input.j1 j1Var, androidx.compose.foundation.interaction.h hVar, boolean z12, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, Function2 function9, j40 j40Var, androidx.compose.foundation.layout.g5 g5Var, Function2 function10, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        lqVar.h(str, function2, z10, z11, j1Var, hVar, z12, function3, function4, function5, function6, function7, function8, function9, j40Var, g5Var, function10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    public static /* synthetic */ androidx.compose.foundation.layout.g5 m(lq lqVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 2) != 0) {
            f11 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 4) != 0) {
            f12 = androidx.compose.material3.internal.b4.M();
        }
        if ((i10 & 8) != 0) {
            f13 = androidx.compose.material3.internal.b4.M();
        }
        return lqVar.l(f10, f11, f12, f13);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0110  */
    /* JADX WARN: Code duplicated, block: B:104:0x0119  */
    /* JADX WARN: Code duplicated, block: B:123:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x015a  */
    /* JADX WARN: Code duplicated, block: B:125:0x015d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0163  */
    /* JADX WARN: Code duplicated, block: B:129:0x016e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0174  */
    /* JADX WARN: Code duplicated, block: B:133:0x017d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0182  */
    /* JADX WARN: Code duplicated, block: B:137:0x0187  */
    /* JADX WARN: Code duplicated, block: B:140:0x018c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0198  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:147:0x0219  */
    /* JADX WARN: Code duplicated, block: B:149:0x0224  */
    /* JADX WARN: Code duplicated, block: B:152:0x0233  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0102  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void d(final boolean z10, final boolean z11, @NotNull final androidx.compose.foundation.interaction.h hVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable j40 j40Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        j40 j40Var2;
        androidx.compose.ui.graphics.q3 q3Var2;
        float f12;
        float f13;
        int i13;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final j40 j40Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final float f14;
        final float f15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        j40 j40VarJ;
        androidx.compose.ui.graphics.q3 q3VarS;
        float f16;
        androidx.compose.ui.a0 a0Var5;
        int i14;
        j40 j40Var4;
        androidx.compose.ui.graphics.q3 q3Var4;
        float f17;
        float f18;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1035477640);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.G(z11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.D(hVar) ? 256 : 128;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j40Var2 = j40Var;
                    int i16 = c0VarR.D(j40Var2) ? 16384 : 8192;
                    i12 |= i16;
                } else {
                    j40Var2 = j40Var;
                }
                i12 |= i16;
            } else {
                j40Var2 = j40Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3Var2 = q3Var;
                    int i17 = c0VarR.D(q3Var2) ? 131072 : 65536;
                    i12 |= i17;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i17;
            } else {
                q3Var2 = q3Var;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    f12 = f10;
                    int i18 = c0VarR.I(f12) ? 1048576 : 524288;
                    i12 |= i18;
                } else {
                    f12 = f10;
                }
                i12 |= i18;
            } else {
                f12 = f10;
            }
            if ((12582912 & i10) == 0) {
                if ((i11 & 128) == 0) {
                    f13 = f11;
                    int i19 = c0VarR.I(f13) ? 8388608 : 4194304;
                    i12 |= i19;
                } else {
                    f13 = f11;
                }
                i12 |= i19;
            } else {
                f13 = f11;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.D(this)) {
                    i13 = 67108864;
                } else {
                    i13 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i13;
            }
            if ((38347923 & i12) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i15 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 16) != 0) {
                        j40VarJ = j(c0VarR, (i12 >> 24) & 14);
                        i12 &= -57345;
                    } else {
                        j40VarJ = j40Var2;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarS = f30410a.s(c0VarR, 6);
                        i12 &= -458753;
                    } else {
                        q3VarS = q3Var2;
                    }
                    if ((i11 & 64) != 0) {
                        f16 = f30414e;
                        i12 &= -3670017;
                    } else {
                        f16 = f12;
                    }
                    if ((i11 & 128) != 0) {
                        q3Var4 = q3VarS;
                        f18 = f30413d;
                        a0Var5 = a0Var4;
                        i14 = i12 & (-29360129);
                        j40Var4 = j40VarJ;
                        f17 = f16;
                    } else {
                        a0Var5 = a0Var4;
                        i14 = i12;
                        j40Var4 = j40VarJ;
                        q3Var4 = q3VarS;
                        f17 = f16;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1035477640, i14, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
                    }
                    int i20 = i14 >> 6;
                    boolean zBooleanValue = androidx.compose.foundation.interaction.d.a(hVar, c0VarR, i20 & 14).getValue().booleanValue();
                    androidx.compose.runtime.n7<androidx.compose.foundation.a1> n7VarZ = androidx.compose.material3.internal.b4.z(z10, z11, zBooleanValue, j40Var4, f17, f18, c0VarR, (i20 & 458752) | ((i14 >> 3) & 7168) | (i14 & okhttp3.internal.ws.g.f334652s) | (57344 & i20));
                    androidx.compose.ui.a0 a0Var6 = a0Var5;
                    androidx.compose.ui.graphics.q3 q3Var5 = q3Var4;
                    c0Var2 = c0VarR;
                    androidx.compose.foundation.layout.x.b(androidx.compose.material3.internal.b4.O(androidx.compose.foundation.t0.g(a0Var6, n7VarZ.getValue(), q3Var5), new n40.f(new kotlin.jvm.internal.c1(androidx.compose.animation.e1.c(j40Var4.b(z10, z11, zBooleanValue), hm.b(d0.h1.FastEffects, c0VarR, 6), null, null, c0VarR, 0, 12)) { // from class: androidx.compose.material3.lq.a
                        @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                        public Object get() {
                            return ((androidx.compose.runtime.n7) this.receiver).getValue();
                        }
                    }), q3Var5), c0Var2, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f14 = f17;
                    f15 = f18;
                    q3Var3 = q3Var5;
                    j40Var3 = j40Var4;
                    a0Var3 = a0Var6;
                } else {
                    c0VarR.u();
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                    }
                    i14 = i12;
                    j40Var4 = j40Var2;
                    f17 = f12;
                    q3Var4 = q3Var2;
                    a0Var5 = a0Var2;
                }
                f18 = f13;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1035477640, i14, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
                }
                int i21 = i14 >> 6;
                boolean zBooleanValue2 = androidx.compose.foundation.interaction.d.a(hVar, c0VarR, i21 & 14).getValue().booleanValue();
                androidx.compose.runtime.n7<androidx.compose.foundation.a1> n7VarZ2 = androidx.compose.material3.internal.b4.z(z10, z11, zBooleanValue2, j40Var4, f17, f18, c0VarR, (i21 & 458752) | ((i14 >> 3) & 7168) | (i14 & okhttp3.internal.ws.g.f334652s) | (57344 & i21));
                androidx.compose.ui.a0 a0Var7 = a0Var5;
                androidx.compose.ui.graphics.q3 q3Var6 = q3Var4;
                c0Var2 = c0VarR;
                androidx.compose.foundation.layout.x.b(androidx.compose.material3.internal.b4.O(androidx.compose.foundation.t0.g(a0Var7, n7VarZ2.getValue(), q3Var6), new n40.f(new kotlin.jvm.internal.c1(androidx.compose.animation.e1.c(j40Var4.b(z10, z11, zBooleanValue2), hm.b(d0.h1.FastEffects, c0VarR, 6), null, null, c0VarR, 0, 12)) { // from class: androidx.compose.material3.lq.a
                    @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                    public Object get() {
                        return ((androidx.compose.runtime.n7) this.receiver).getValue();
                    }
                }), q3Var6), c0Var2, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f14 = f17;
                f15 = f18;
                q3Var3 = q3Var6;
                j40Var3 = j40Var4;
                a0Var3 = a0Var7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j40Var3 = j40Var2;
                q3Var3 = q3Var2;
                f14 = f12;
                f15 = f13;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.iq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return lq.g(this.f29300a, z10, z11, hVar, a0Var3, j40Var3, q3Var3, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                j40Var2 = j40Var;
                if (c0VarR.D(j40Var2)) {
                }
                i12 |= i16;
            } else {
                j40Var2 = j40Var;
            }
            i12 |= i16;
        } else {
            j40Var2 = j40Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i17;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i17;
        } else {
            q3Var2 = q3Var;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f12 = f10;
                if (c0VarR.I(f12)) {
                }
                i12 |= i18;
            } else {
                f12 = f10;
            }
            i12 |= i18;
        } else {
            f12 = f10;
        }
        if ((12582912 & i10) == 0) {
            if ((i11 & 128) == 0) {
                f13 = f11;
                if (c0VarR.I(f13)) {
                }
                i12 |= i19;
            } else {
                f13 = f11;
            }
            i12 |= i19;
        } else {
            f13 = f11;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.D(this)) {
                i13 = 67108864;
            } else {
                i13 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i13;
        }
        if ((38347923 & i12) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 16) != 0) {
                    j40VarJ = j(c0VarR, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    j40VarJ = j40Var2;
                }
                if ((i11 & 32) != 0) {
                    q3VarS = f30410a.s(c0VarR, 6);
                    i12 &= -458753;
                } else {
                    q3VarS = q3Var2;
                }
                if ((i11 & 64) != 0) {
                    f16 = f30414e;
                    i12 &= -3670017;
                } else {
                    f16 = f12;
                }
                if ((i11 & 128) != 0) {
                    q3Var4 = q3VarS;
                    f18 = f30413d;
                    a0Var5 = a0Var4;
                    i14 = i12 & (-29360129);
                    j40Var4 = j40VarJ;
                    f17 = f16;
                } else {
                    a0Var5 = a0Var4;
                    i14 = i12;
                    j40Var4 = j40VarJ;
                    q3Var4 = q3VarS;
                    f17 = f16;
                    f18 = f13;
                }
            } else {
                if (i15 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 16) != 0) {
                    j40VarJ = j(c0VarR, (i12 >> 24) & 14);
                    i12 &= -57345;
                } else {
                    j40VarJ = j40Var2;
                }
                if ((i11 & 32) != 0) {
                    q3VarS = f30410a.s(c0VarR, 6);
                    i12 &= -458753;
                } else {
                    q3VarS = q3Var2;
                }
                if ((i11 & 64) != 0) {
                    f16 = f30414e;
                    i12 &= -3670017;
                } else {
                    f16 = f12;
                }
                if ((i11 & 128) != 0) {
                    q3Var4 = q3VarS;
                    f18 = f30413d;
                    a0Var5 = a0Var4;
                    i14 = i12 & (-29360129);
                    j40Var4 = j40VarJ;
                    f17 = f16;
                } else {
                    a0Var5 = a0Var4;
                    i14 = i12;
                    j40Var4 = j40VarJ;
                    q3Var4 = q3VarS;
                    f17 = f16;
                    f18 = f13;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1035477640, i14, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:1054)");
            }
            int i22 = i14 >> 6;
            boolean zBooleanValue3 = androidx.compose.foundation.interaction.d.a(hVar, c0VarR, i22 & 14).getValue().booleanValue();
            androidx.compose.runtime.n7<androidx.compose.foundation.a1> n7VarZ3 = androidx.compose.material3.internal.b4.z(z10, z11, zBooleanValue3, j40Var4, f17, f18, c0VarR, (i22 & 458752) | ((i14 >> 3) & 7168) | (i14 & okhttp3.internal.ws.g.f334652s) | (57344 & i22));
            androidx.compose.ui.a0 a0Var8 = a0Var5;
            androidx.compose.ui.graphics.q3 q3Var7 = q3Var4;
            c0Var2 = c0VarR;
            androidx.compose.foundation.layout.x.b(androidx.compose.material3.internal.b4.O(androidx.compose.foundation.t0.g(a0Var8, n7VarZ3.getValue(), q3Var7), new n40.f(new kotlin.jvm.internal.c1(androidx.compose.animation.e1.c(j40Var4.b(z10, z11, zBooleanValue3), hm.b(d0.h1.FastEffects, c0VarR, 6), null, null, c0VarR, 0, 12)) { // from class: androidx.compose.material3.lq.a
                @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
                public Object get() {
                    return ((androidx.compose.runtime.n7) this.receiver).getValue();
                }
            }), q3Var7), c0Var2, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f14 = f17;
            f15 = f18;
            q3Var3 = q3Var7;
            j40Var3 = j40Var4;
            a0Var3 = a0Var8;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j40Var3 = j40Var2;
            q3Var3 = q3Var2;
            f14 = f12;
            f15 = f13;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.iq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return lq.g(this.f29300a, z10, z11, hVar, a0Var3, j40Var3, q3Var3, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0138  */
    /* JADX WARN: Code duplicated, block: B:114:0x013c  */
    /* JADX WARN: Code duplicated, block: B:117:0x014a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0157  */
    /* JADX WARN: Code duplicated, block: B:123:0x015e  */
    /* JADX WARN: Code duplicated, block: B:126:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:130:0x01af  */
    /* JADX WARN: Code duplicated, block: B:133:0x01be  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0107  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to OutlinedTextFieldDefaults.Container", replaceWith = @kotlin.b1(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n    focusedBorderThickness = focusedBorderThickness,\n    unfocusedBorderThickness = unfocusedBorderThickness,\n)", imports = {}))
    @af
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.o
    public final void e(final boolean z10, final boolean z11, @NotNull final androidx.compose.foundation.interaction.h hVar, @Nullable j40 j40Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        androidx.compose.foundation.interaction.h hVar2;
        int i13;
        j40 j40VarJ;
        androidx.compose.ui.graphics.q3 q3VarS;
        float f12;
        float f13;
        int i14;
        boolean z13;
        final j40 j40Var2;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final float f14;
        final float f15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1461761386);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else if ((i10 & 6) == 0) {
            z12 = z10;
            i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
        } else {
            z12 = z10;
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.G(z11) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    hVar2 = hVar;
                    if (c0VarR.D(hVar2)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        j40VarJ = j40Var;
                        int i15 = c0VarR.D(j40VarJ) ? 2048 : 1024;
                        i12 |= i15;
                    } else {
                        j40VarJ = j40Var;
                    }
                    i12 |= i15;
                } else {
                    j40VarJ = j40Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarS = q3Var;
                        int i16 = c0VarR.D(q3VarS) ? 16384 : 8192;
                        i12 |= i16;
                    } else {
                        q3VarS = q3Var;
                    }
                    i12 |= i16;
                } else {
                    q3VarS = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        f12 = f10;
                        int i17 = c0VarR.I(f12) ? 131072 : 65536;
                        i12 |= i17;
                    } else {
                        f12 = f10;
                    }
                    i12 |= i17;
                } else {
                    f12 = f10;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        f13 = f11;
                        int i18 = c0VarR.I(f13) ? 1048576 : 524288;
                        i12 |= i18;
                    } else {
                        f13 = f11;
                    }
                    i12 |= i18;
                } else {
                    f13 = f11;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(this)) {
                        i14 = 8388608;
                    } else {
                        i14 = 4194304;
                    }
                    i12 |= i14;
                }
                if ((4793491 & i12) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if ((i11 & 8) != 0) {
                            j40VarJ = j(c0VarR, (i12 >> 21) & 14);
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarS = f30410a.s(c0VarR, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            f12 = f30414e;
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            f13 = f30413d;
                            i12 &= -3670017;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1461761386, i12, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1482)");
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    int i19 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896);
                    int i20 = i12 << 3;
                    int i21 = i19 | (57344 & i20) | (458752 & i20) | (3670016 & i20) | (29360128 & i20) | (i20 & 234881024);
                    androidx.compose.foundation.interaction.h hVar3 = hVar2;
                    j40Var2 = j40VarJ;
                    q3Var2 = q3VarS;
                    f14 = f12;
                    f15 = f13;
                    d(z12, z11, hVar3, aVar, j40Var2, q3Var2, f14, f15, c0VarR, i21, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    j40Var2 = j40VarJ;
                    q3Var2 = q3VarS;
                    f14 = f12;
                    f15 = f13;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.kq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return lq.f(this.f30077a, z10, z11, hVar, j40Var2, q3Var2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            hVar2 = hVar;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j40VarJ = j40Var;
                    if (c0VarR.D(j40VarJ)) {
                    }
                    i12 |= i15;
                } else {
                    j40VarJ = j40Var;
                }
                i12 |= i15;
            } else {
                j40VarJ = j40Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarS = q3Var;
                    if (c0VarR.D(q3VarS)) {
                    }
                    i12 |= i16;
                } else {
                    q3VarS = q3Var;
                }
                i12 |= i16;
            } else {
                q3VarS = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f12 = f10;
                    if (c0VarR.I(f12)) {
                    }
                    i12 |= i17;
                } else {
                    f12 = f10;
                }
                i12 |= i17;
            } else {
                f12 = f10;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    f13 = f11;
                    if (c0VarR.I(f13)) {
                    }
                    i12 |= i18;
                } else {
                    f13 = f11;
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(this)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i12 |= i14;
            }
            if ((4793491 & i12) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if ((i11 & 8) != 0) {
                        j40VarJ = j(c0VarR, (i12 >> 21) & 14);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarS = f30410a.s(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        f12 = f30414e;
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        f13 = f30413d;
                        i12 &= -3670017;
                    }
                } else {
                    if ((i11 & 8) != 0) {
                        j40VarJ = j(c0VarR, (i12 >> 21) & 14);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarS = f30410a.s(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        f12 = f30414e;
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        f13 = f30413d;
                        i12 &= -3670017;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1461761386, i12, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1482)");
                }
                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                int i110 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896);
                int i22 = i12 << 3;
                int i23 = i110 | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (i22 & 234881024);
                androidx.compose.foundation.interaction.h hVar4 = hVar2;
                j40Var2 = j40VarJ;
                q3Var2 = q3VarS;
                f14 = f12;
                f15 = f13;
                d(z12, z11, hVar4, aVar2, j40Var2, q3Var2, f14, f15, c0VarR, i23, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                j40Var2 = j40VarJ;
                q3Var2 = q3VarS;
                f14 = f12;
                f15 = f13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.kq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return lq.f(this.f30077a, z10, z11, hVar, j40Var2, q3Var2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        if ((i11 & 4) != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                hVar2 = hVar;
                if (c0VarR.D(hVar2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    j40VarJ = j40Var;
                    if (c0VarR.D(j40VarJ)) {
                    }
                    i12 |= i15;
                } else {
                    j40VarJ = j40Var;
                }
                i12 |= i15;
            } else {
                j40VarJ = j40Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarS = q3Var;
                    if (c0VarR.D(q3VarS)) {
                    }
                    i12 |= i16;
                } else {
                    q3VarS = q3Var;
                }
                i12 |= i16;
            } else {
                q3VarS = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f12 = f10;
                    if (c0VarR.I(f12)) {
                    }
                    i12 |= i17;
                } else {
                    f12 = f10;
                }
                i12 |= i17;
            } else {
                f12 = f10;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    f13 = f11;
                    if (c0VarR.I(f13)) {
                    }
                    i12 |= i18;
                } else {
                    f13 = f11;
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(this)) {
                    i14 = 8388608;
                } else {
                    i14 = 4194304;
                }
                i12 |= i14;
            }
            if ((4793491 & i12) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if ((i11 & 8) != 0) {
                        j40VarJ = j(c0VarR, (i12 >> 21) & 14);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarS = f30410a.s(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        f12 = f30414e;
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        f13 = f30413d;
                        i12 &= -3670017;
                    }
                } else {
                    if ((i11 & 8) != 0) {
                        j40VarJ = j(c0VarR, (i12 >> 21) & 14);
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarS = f30410a.s(c0VarR, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        f12 = f30414e;
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        f13 = f30413d;
                        i12 &= -3670017;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1461761386, i12, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1482)");
                }
                androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                int i111 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896);
                int i24 = i12 << 3;
                int i25 = i111 | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (i24 & 234881024);
                androidx.compose.foundation.interaction.h hVar5 = hVar2;
                j40Var2 = j40VarJ;
                q3Var2 = q3VarS;
                f14 = f12;
                f15 = f13;
                d(z12, z11, hVar5, aVar3, j40Var2, q3Var2, f14, f15, c0VarR, i25, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                j40Var2 = j40VarJ;
                q3Var2 = q3VarS;
                f14 = f12;
                f15 = f13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.kq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return lq.f(this.f30077a, z10, z11, hVar, j40Var2, q3Var2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        hVar2 = hVar;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                j40VarJ = j40Var;
                if (c0VarR.D(j40VarJ)) {
                }
                i12 |= i15;
            } else {
                j40VarJ = j40Var;
            }
            i12 |= i15;
        } else {
            j40VarJ = j40Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3VarS = q3Var;
                if (c0VarR.D(q3VarS)) {
                }
                i12 |= i16;
            } else {
                q3VarS = q3Var;
            }
            i12 |= i16;
        } else {
            q3VarS = q3Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                f12 = f10;
                if (c0VarR.I(f12)) {
                }
                i12 |= i17;
            } else {
                f12 = f10;
            }
            i12 |= i17;
        } else {
            f12 = f10;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f13 = f11;
                if (c0VarR.I(f13)) {
                }
                i12 |= i18;
            } else {
                f13 = f11;
            }
            i12 |= i18;
        } else {
            f13 = f11;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.D(this)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((4793491 & i12) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if ((i11 & 8) != 0) {
                    j40VarJ = j(c0VarR, (i12 >> 21) & 14);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    q3VarS = f30410a.s(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    f12 = f30414e;
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    f13 = f30413d;
                    i12 &= -3670017;
                }
            } else {
                if ((i11 & 8) != 0) {
                    j40VarJ = j(c0VarR, (i12 >> 21) & 14);
                    i12 &= -7169;
                }
                if ((i11 & 16) != 0) {
                    q3VarS = f30410a.s(c0VarR, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    f12 = f30414e;
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    f13 = f30413d;
                    i12 &= -3670017;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1461761386, i12, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1482)");
            }
            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
            int i112 = (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896);
            int i26 = i12 << 3;
            int i27 = i112 | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (29360128 & i26) | (i26 & 234881024);
            androidx.compose.foundation.interaction.h hVar6 = hVar2;
            j40Var2 = j40VarJ;
            q3Var2 = q3VarS;
            f14 = f12;
            f15 = f13;
            d(z12, z11, hVar6, aVar4, j40Var2, q3Var2, f14, f15, c0VarR, i27, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            j40Var2 = j40VarJ;
            q3Var2 = q3VarS;
            f14 = f12;
            f15 = f13;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.kq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return lq.f(this.f30077a, z10, z11, hVar, j40Var2, q3Var2, f14, f15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r2v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v8 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void h(@org.jetbrains.annotations.NotNull java.lang.String r37, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r38, boolean r39, boolean r40, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.j1 r41, @org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.h r42, boolean r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r46, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r48, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r49, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable androidx.compose.material3.j40 r51, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.g5 r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.c0, ? super java.lang.Integer, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable androidx.compose.runtime.c0 r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instruction units count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.lq.h(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, androidx.compose.ui.text.input.j1, androidx.compose.foundation.interaction.h, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.j40, androidx.compose.foundation.layout.g5, kotlin.jvm.functions.Function2, androidx.compose.runtime.c0, int, int, int):void");
    }

    @androidx.compose.runtime.o
    @NotNull
    public final j40 j(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-471651810, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1215)");
        }
        j40 j40VarO = o(pj.f31758a.a(c0Var, 6), c0Var, (i10 << 3) & com.planner5d.library.engine.input.f.b.B);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarO;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final j40 k(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable androidx.compose.foundation.text.selection.w4 w4Var, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jU = (i15 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i15 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i15 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i15 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i15 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i15 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i15 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long j52 = jU;
        long jU8 = (i15 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        long jU9 = (i15 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j18;
        long jU10 = (i15 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j19;
        androidx.compose.foundation.text.selection.w4 w4Var2 = (i15 & 1024) != 0 ? null : w4Var;
        long jU11 = (i15 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j20;
        long jU12 = (i15 & 4096) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j21;
        long jU13 = (i15 & 8192) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j22;
        long jU14 = (i15 & 16384) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j23;
        long jU15 = (32768 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j24;
        long jU16 = (65536 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j25;
        long jU17 = (131072 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j26;
        long jU18 = (262144 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j27;
        long jU19 = (524288 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j28;
        long jU20 = (1048576 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j29;
        long jU21 = (2097152 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j30;
        long jU22 = (4194304 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j31;
        long jU23 = (8388608 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j32;
        long jU24 = (16777216 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j33;
        long jU25 = (33554432 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j34;
        long jU26 = (67108864 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j35;
        long jU27 = (134217728 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j36;
        long jU28 = (268435456 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j37;
        long jU29 = (536870912 & i15) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j38;
        long jU30 = (i15 & 1073741824) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j39;
        long jU31 = (i16 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j40;
        long jU32 = (i16 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j41;
        long jU33 = (i16 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j42;
        long jU34 = (i16 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j43;
        long jU35 = (i16 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j44;
        long jU36 = (i16 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j45;
        long jU37 = (i16 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j46;
        long jU38 = (i16 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j47;
        long jU39 = (i16 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j48;
        long jU40 = (i16 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j49;
        long jU41 = (i16 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j50;
        long jU42 = (i16 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j51;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1767617725, i10, i11, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1317)");
        }
        j40 j40VarC = o(pj.f31758a.a(c0Var, 6), c0Var, (i14 >> 6) & com.planner5d.library.engine.input.f.b.B).c(j52, jU2, jU3, jU4, jU5, jU6, jU7, jU8, jU9, jU10, w4Var2, jU11, jU12, jU13, jU14, jU15, jU16, jU17, jU18, jU19, jU20, jU21, jU22, jU23, jU24, jU25, jU26, jU27, jU28, jU29, jU30, jU31, jU32, jU33, jU34, jU35, jU36, jU37, jU38, jU39, jU40, jU41, jU42);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40VarC;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 l(float f10, float f11, float f12, float f13) {
        return androidx.compose.foundation.layout.d5.i(f10, f11, f12, f13);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[_[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]:[_]]")
    @NotNull
    public final androidx.compose.foundation.text.input.n n(@NotNull androidx.compose.foundation.text.input.p pVar, boolean z10, @NotNull androidx.compose.foundation.text.input.o oVar, @Nullable androidx.compose.foundation.text.input.h hVar, @NotNull androidx.compose.foundation.interaction.h hVar2, @Nullable v40 v40Var, @Nullable pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7, boolean z11, @Nullable j40 j40Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        lq lqVar;
        j40 j40VarJ;
        androidx.compose.foundation.interaction.h hVar3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2E;
        v40 bVar = (i12 & 32) != 0 ? new v40.b(false, null, null, 7, null) : v40Var;
        pj.n<? super w40, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2 = (i12 & 64) != 0 ? null : nVar;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = (i12 & 128) != 0 ? null : function2;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = (i12 & 256) != 0 ? null : function3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = (i12 & 512) != 0 ? null : function4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = (i12 & 1024) != 0 ? null : function5;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = (i12 & 2048) != 0 ? null : function6;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = (i12 & 4096) != 0 ? null : function7;
        boolean z12 = (i12 & 8192) != 0 ? false : z11;
        if ((i12 & 16384) != 0) {
            lqVar = this;
            j40VarJ = lqVar.j(c0Var, (i11 >> 21) & 14);
        } else {
            lqVar = this;
            j40VarJ = j40Var;
        }
        androidx.compose.foundation.layout.g5 g5VarM = (32768 & i12) != 0 ? m(lqVar, 0.0f, 0.0f, 0.0f, 0.0f, 15, null) : g5Var;
        if ((i12 & 65536) != 0) {
            hVar3 = hVar2;
            function2E = androidx.compose.runtime.internal.w.e(-163468598, true, new d(z10, z12, hVar3, j40VarJ), c0Var, 54);
        } else {
            hVar3 = hVar2;
            function2E = function8;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-449059361, i10, i11, "androidx.compose.material3.OutlinedTextFieldDefaults.decorator (TextFieldDefaults.kt:993)");
        }
        e eVar = new e(hVar, pVar, oVar, bVar, nVar2, function9, function10, function11, function12, function13, function14, z10, z12, hVar3, g5VarM, j40VarJ, function2E);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eVar;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getDefaultOutlinedTextFieldColors")
    @NotNull
    public final j40 o(@NotNull l6 l6Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        j40 j40Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-292363577, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1365)");
        }
        j40 j40VarN = l6Var.N();
        if (j40VarN == null) {
            c0Var.E(390452338);
            c0Var.A();
            j40Var = null;
        } else {
            c0Var.E(390452339);
            androidx.compose.foundation.text.selection.w4 w4Var = (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d());
            if (!Intrinsics.areEqual(j40VarN.M(), w4Var)) {
                j40VarN = j40VarN.c(((-1025) & 1) != 0 ? j40VarN.f29655a : 0L, ((-1025) & 2) != 0 ? j40VarN.f29656b : 0L, ((-1025) & 4) != 0 ? j40VarN.f29657c : 0L, ((-1025) & 8) != 0 ? j40VarN.f29658d : 0L, ((-1025) & 16) != 0 ? j40VarN.f29659e : 0L, ((-1025) & 32) != 0 ? j40VarN.f29660f : 0L, ((-1025) & 64) != 0 ? j40VarN.f29661g : 0L, ((-1025) & 128) != 0 ? j40VarN.f29662h : 0L, ((-1025) & 256) != 0 ? j40VarN.f29663i : 0L, ((-1025) & 512) != 0 ? j40VarN.f29664j : 0L, ((-1025) & 1024) != 0 ? j40VarN.f29665k : w4Var, ((-1025) & 2048) != 0 ? j40VarN.f29666l : 0L, ((-1025) & 4096) != 0 ? j40VarN.f29667m : 0L, ((-1025) & 8192) != 0 ? j40VarN.f29668n : 0L, ((-1025) & 16384) != 0 ? j40VarN.f29669o : 0L, ((-1025) & 32768) != 0 ? j40VarN.f29670p : 0L, ((-1025) & 65536) != 0 ? j40VarN.f29671q : 0L, ((-1025) & 131072) != 0 ? j40VarN.f29672r : 0L, ((-1025) & 262144) != 0 ? j40VarN.f29673s : 0L, ((-1025) & 524288) != 0 ? j40VarN.f29674t : 0L, ((-1025) & 1048576) != 0 ? j40VarN.f29675u : 0L, ((-1025) & 2097152) != 0 ? j40VarN.f29676v : 0L, ((-1025) & 4194304) != 0 ? j40VarN.f29677w : 0L, ((-1025) & 8388608) != 0 ? j40VarN.f29678x : 0L, ((-1025) & 16777216) != 0 ? j40VarN.f29679y : 0L, ((-1025) & com.google.api.client.googleapis.media.a.f115410j) != 0 ? j40VarN.f29680z : 0L, ((-1025) & 67108864) != 0 ? j40VarN.A : 0L, ((-1025) & androidx.media3.common.j.W0) != 0 ? j40VarN.B : 0L, ((-1025) & 268435456) != 0 ? j40VarN.C : 0L, ((-1025) & 536870912) != 0 ? j40VarN.D : 0L, ((-1025) & 1073741824) != 0 ? j40VarN.E : 0L, ((-1025) & Integer.MIN_VALUE) != 0 ? j40VarN.F : 0L, (com.rabbitmq.client.r.f265987x3 & 1) != 0 ? j40VarN.G : 0L, (com.rabbitmq.client.r.f265987x3 & 2) != 0 ? j40VarN.H : 0L, (com.rabbitmq.client.r.f265987x3 & 4) != 0 ? j40VarN.I : 0L, (com.rabbitmq.client.r.f265987x3 & 8) != 0 ? j40VarN.J : 0L, (com.rabbitmq.client.r.f265987x3 & 16) != 0 ? j40VarN.K : 0L, (com.rabbitmq.client.r.f265987x3 & 32) != 0 ? j40VarN.L : 0L, (com.rabbitmq.client.r.f265987x3 & 64) != 0 ? j40VarN.M : 0L, (com.rabbitmq.client.r.f265987x3 & 128) != 0 ? j40VarN.N : 0L, (com.rabbitmq.client.r.f265987x3 & 256) != 0 ? j40VarN.O : 0L, (com.rabbitmq.client.r.f265987x3 & 512) != 0 ? j40VarN.P : 0L, (com.rabbitmq.client.r.f265987x3 & 1024) != 0 ? j40VarN.Q : 0L);
                l6Var.F1(j40VarN);
            }
            c0Var.A();
            j40Var = j40VarN;
        }
        if (j40Var == null) {
            c0Var.E(-1788321191);
            d0.y1 y1Var = d0.y1.f269381a;
            long jO = o6.o(l6Var, y1Var.D());
            long jO2 = o6.o(l6Var, y1Var.R());
            long jW = androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jO3 = o6.o(l6Var, y1Var.x());
            androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
            j40 j40Var2 = new j40(jO, jO2, jW, jO3, aVar.s(), aVar.s(), aVar.s(), aVar.s(), o6.o(l6Var, y1Var.a()), o6.o(l6Var, y1Var.k()), (androidx.compose.foundation.text.selection.w4) c0Var.W(androidx.compose.foundation.text.selection.y4.d()), o6.o(l6Var, y1Var.G()), o6.o(l6Var, y1Var.a0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.g()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.A()), o6.o(l6Var, y1Var.F()), o6.o(l6Var, y1Var.Y()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.z()), o6.o(l6Var, y1Var.J()), o6.o(l6Var, y1Var.e0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.C()), o6.o(l6Var, y1Var.E()), o6.o(l6Var, y1Var.W()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.y()), o6.o(l6Var, y1Var.T()), o6.o(l6Var, y1Var.T()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.T()), o6.o(l6Var, y1Var.I()), o6.o(l6Var, y1Var.c0()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.i()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.B()), o6.o(l6Var, y1Var.U()), o6.o(l6Var, y1Var.U()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.U()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.U()), o6.o(l6Var, y1Var.V()), o6.o(l6Var, y1Var.V()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, y1Var.V()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), o6.o(l6Var, y1Var.V()), null);
            l6Var.F1(j40Var2);
            c0Var.A();
            j40Var = j40Var2;
        } else {
            c0Var.E(-1788515437);
            c0Var.A();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j40Var;
    }

    public final float p() {
        return f30414e;
    }

    public final float q() {
        return f30411b;
    }

    public final float r() {
        return f30412c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getShape")
    @NotNull
    public final androidx.compose.ui.graphics.q3 s(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1066756961, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:887)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.y1.f269381a.c(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarI;
    }

    public final float t() {
        return f30413d;
    }
}
