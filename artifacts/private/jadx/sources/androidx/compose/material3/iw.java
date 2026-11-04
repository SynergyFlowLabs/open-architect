package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nSegmentedButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedButton.kt\nandroidx/compose/material3/SegmentedButtonDefaults\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,848:1\n1#2:849\n*E\n"})
public final class iw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final iw f29388a = new iw();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f29389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f29390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.layout.g5 f29391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f29392e = 0;

    static final class a implements pj.n<androidx.compose.animation.l, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29393a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f29393a = function2;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var, int i10) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2059591811, i10, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:649)");
            }
            this.f29393a.invoke(c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.animation.l lVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(lVar, c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements pj.n<Boolean, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f29395b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f29394a = function2;
            this.f29395b = function3;
        }

        @androidx.compose.runtime.o
        public final void c(boolean z10, androidx.compose.runtime.c0 c0Var, int i10) {
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2;
            if ((i10 & 6) == 0) {
                i10 |= c0Var.G(z10) ? 4 : 2;
            }
            if (!c0Var.h((i10 & 19) != 18, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1785818285, i10, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:657)");
            }
            if (z10) {
                c0Var.E(1815547362);
                function2 = this.f29394a;
            } else {
                c0Var.E(1815548036);
                function2 = this.f29395b;
            }
            function2.invoke(c0Var, 0);
            c0Var.A();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, androidx.compose.runtime.c0 c0Var, Integer num) {
            c(bool.booleanValue(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        d0.x1 x1Var = d0.x1.f269270a;
        f29389b = x1Var.k();
        f29390c = x1Var.h();
        f29391d = s3.f32666a.z();
    }

    private iw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(iw iwVar, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        iwVar.c(c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(iw iwVar, boolean z10, Function2 function2, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        iwVar.e(z10, function2, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    public static /* synthetic */ androidx.compose.foundation.a1 h(iw iwVar, long j10, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = f29389b;
        }
        return iwVar.g(j10, f10);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void c(@Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1273041460);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1273041460, i11, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:614)");
            }
            ni.p(androidx.compose.material3.internal.p2.b.f29069a.b(), null, androidx.compose.foundation.layout.i6.w(androidx.compose.ui.a0.E, f29390c), 0L, c0VarR, 48, 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.gw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return iw.d(this.f28032a, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0][0]]")
    public final void e(final boolean z10, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z11;
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i14;
        boolean z12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2A;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function6;
        androidx.compose.runtime.s5 s5VarT;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-657462570);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z11) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                function4 = function2;
                i12 |= c0VarR.k0(function4) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i15 != 0) {
                        function2A = w6.f34161a.a();
                    } else {
                        function2A = function4;
                    }
                    if (i13 != 0) {
                        function7 = null;
                    } else {
                        function7 = function5;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-657462570, i12, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:635)");
                    }
                    if (function7 == null) {
                        c0VarR.E(-1416314439);
                        androidx.compose.animation.k.j(z11, null, androidx.compose.animation.b0.o(hm.b(d0.h1.DefaultEffects, c0VarR, 6), 0.0f, 2, null).c(androidx.compose.animation.b0.t(hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, androidx.compose.ui.graphics.a4.a(0.0f, 1.0f))), androidx.compose.animation.f0.f13493a.b(), null, androidx.compose.runtime.internal.w.e(2059591811, true, new a(function2A), c0VarR, 54), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 18);
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1415695803);
                        androidx.compose.animation.y.b(Boolean.valueOf(z10), null, hm.b(d0.h1.DefaultEffects, c0VarR, 6), null, androidx.compose.runtime.internal.w.e(-1785818285, true, new b(function2A, function7), c0VarR, 54), c0VarR, (i12 & 14) | 24576, 10);
                        c0VarR.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    function6 = function7;
                } else {
                    c0VarR.u();
                    function2A = function4;
                    function6 = function5;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.hw
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return iw.f(this.f28261a, z10, function2A, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            function5 = function3;
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i15 != 0) {
                    function2A = w6.f34161a.a();
                } else {
                    function2A = function4;
                }
                if (i13 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-657462570, i12, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:635)");
                }
                if (function7 == null) {
                    c0VarR.E(-1416314439);
                    androidx.compose.animation.k.j(z11, null, androidx.compose.animation.b0.o(hm.b(d0.h1.DefaultEffects, c0VarR, 6), 0.0f, 2, null).c(androidx.compose.animation.b0.t(hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, androidx.compose.ui.graphics.a4.a(0.0f, 1.0f))), androidx.compose.animation.f0.f13493a.b(), null, androidx.compose.runtime.internal.w.e(2059591811, true, new a(function2A), c0VarR, 54), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 18);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    c0VarR.E(-1415695803);
                    androidx.compose.animation.y.b(Boolean.valueOf(z10), null, hm.b(d0.h1.DefaultEffects, c0VarR, 6), null, androidx.compose.runtime.internal.w.e(-1785818285, true, new b(function2A, function7), c0VarR, 54), c0VarR, (i12 & 14) | 24576, 10);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function6 = function7;
            } else {
                c0VarR.u();
                function2A = function4;
                function6 = function5;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.hw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return iw.f(this.f28261a, z10, function2A, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function4 = function2;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i15 != 0) {
                    function2A = w6.f34161a.a();
                } else {
                    function2A = function4;
                }
                if (i13 != 0) {
                    function7 = null;
                } else {
                    function7 = function5;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-657462570, i12, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:635)");
                }
                if (function7 == null) {
                    c0VarR.E(-1416314439);
                    androidx.compose.animation.k.j(z11, null, androidx.compose.animation.b0.o(hm.b(d0.h1.DefaultEffects, c0VarR, 6), 0.0f, 2, null).c(androidx.compose.animation.b0.t(hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, androidx.compose.ui.graphics.a4.a(0.0f, 1.0f))), androidx.compose.animation.f0.f13493a.b(), null, androidx.compose.runtime.internal.w.e(2059591811, true, new a(function2A), c0VarR, 54), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 18);
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    c0VarR.E(-1415695803);
                    androidx.compose.animation.y.b(Boolean.valueOf(z10), null, hm.b(d0.h1.DefaultEffects, c0VarR, 6), null, androidx.compose.runtime.internal.w.e(-1785818285, true, new b(function2A, function7), c0VarR, 54), c0VarR, (i12 & 14) | 24576, 10);
                    c0VarR.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                function6 = function7;
            } else {
                c0VarR.u();
                function2A = function4;
                function6 = function5;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.hw
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return iw.f(this.f28261a, z10, function2A, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        function5 = function3;
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i15 != 0) {
                function2A = w6.f34161a.a();
            } else {
                function2A = function4;
            }
            if (i13 != 0) {
                function7 = null;
            } else {
                function7 = function5;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-657462570, i12, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon (SegmentedButton.kt:635)");
            }
            if (function7 == null) {
                c0VarR.E(-1416314439);
                androidx.compose.animation.k.j(z11, null, androidx.compose.animation.b0.o(hm.b(d0.h1.DefaultEffects, c0VarR, 6), 0.0f, 2, null).c(androidx.compose.animation.b0.t(hm.b(d0.h1.FastSpatial, c0VarR, 6), 0.0f, androidx.compose.ui.graphics.a4.a(0.0f, 1.0f))), androidx.compose.animation.f0.f13493a.b(), null, androidx.compose.runtime.internal.w.e(2059591811, true, new a(function2A), c0VarR, 54), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m, 18);
                c0VarR = c0VarR;
                c0VarR.A();
            } else {
                c0VarR.E(-1415695803);
                androidx.compose.animation.y.b(Boolean.valueOf(z10), null, hm.b(d0.h1.DefaultEffects, c0VarR, 6), null, androidx.compose.runtime.internal.w.e(-1785818285, true, new b(function2A, function7), c0VarR, 54), c0VarR, (i12 & 14) | 24576, 10);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            function6 = function7;
        } else {
            c0VarR.u();
            function2A = function4;
            function6 = function5;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.hw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return iw.f(this.f28261a, z10, function2A, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public final androidx.compose.foundation.a1 g(long j10, float f10) {
        return androidx.compose.foundation.b1.a(f10, j10);
    }

    @androidx.compose.runtime.o
    @NotNull
    public final dw i(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(679457321, i10, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:494)");
        }
        dw dwVarN = n(pj.f31758a.a(c0Var, 6));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return dwVarN;
    }

    @androidx.compose.runtime.o
    @NotNull
    public final dw j(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11, int i12) {
        long jU = (i12 & 1) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j10;
        long jU2 = (i12 & 2) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j11;
        long jU3 = (i12 & 4) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j12;
        long jU4 = (i12 & 8) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j13;
        long jU5 = (i12 & 16) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j14;
        long jU6 = (i12 & 32) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j15;
        long jU7 = (i12 & 64) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j16;
        long jU8 = (i12 & 128) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j17;
        long j22 = jU;
        long jU9 = (i12 & 256) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j18;
        long jU10 = (i12 & 512) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j19;
        long jU11 = (i12 & 1024) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j20;
        long jU12 = (i12 & 2048) != 0 ? androidx.compose.ui.graphics.q0.f38131b.u() : j21;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(132526205, i10, i11, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:530)");
        }
        dw dwVarD = n(pj.f31758a.a(c0Var, 6)).d(j22, jU2, jU3, jU4, jU5, jU6, jU7, jU8, jU9, jU10, jU11, jU12);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return dwVarD;
    }

    @NotNull
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "getBaseShape")
    public final androidx.compose.foundation.shape.e k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1264240381, i10, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:578)");
        }
        androidx.compose.ui.graphics.q3 q3VarI = cx.i(d0.x1.f269270a.u(), c0Var, 6);
        Intrinsics.checkNotNull(q3VarI, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        androidx.compose.foundation.shape.e eVar = (androidx.compose.foundation.shape.e) q3VarI;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eVar;
    }

    public final float l() {
        return f29389b;
    }

    @NotNull
    public final androidx.compose.foundation.layout.g5 m() {
        return f29391d;
    }

    @NotNull
    public final dw n(@NotNull l6 l6Var) {
        dw dwVarR = l6Var.R();
        if (dwVarR != null) {
            return dwVarR;
        }
        d0.x1 x1Var = d0.x1.f269270a;
        long jO = o6.o(l6Var, x1Var.l());
        long jO2 = o6.o(l6Var, x1Var.r());
        long jO3 = o6.o(l6Var, x1Var.j());
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        dw dwVar = new dw(jO, jO2, jO3, aVar.s(), o6.o(l6Var, x1Var.A()), o6.o(l6Var, x1Var.j()), o6.o(l6Var, x1Var.l()), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x1Var.d()), x1Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x1Var.j()), x1Var.g(), 0.0f, 0.0f, 0.0f, 14, null), aVar.s(), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x1Var.d()), x1Var.e(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.q0.w(o6.o(l6Var, x1Var.j()), x1Var.g(), 0.0f, 0.0f, 0.0f, 14, null), null);
        l6Var.I1(dwVar);
        return dwVar;
    }

    public final float o() {
        return f29390c;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @NotNull
    public final androidx.compose.ui.graphics.q3 p(int i10, int i11, @Nullable androidx.compose.foundation.shape.e eVar, @Nullable androidx.compose.runtime.c0 c0Var, int i12, int i13) {
        androidx.compose.ui.graphics.q3 q3VarF;
        if ((i13 & 4) != 0) {
            eVar = k(c0Var, (i12 >> 9) & 14);
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-942072063, i12, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:594)");
        }
        if (i11 == 1) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return eVar;
        }
        if (i10 == 0) {
            q3VarF = cx.k(eVar, null, 1, null);
        } else {
            q3VarF = i10 == i11 - 1 ? cx.f(eVar, null, 1, null) : androidx.compose.ui.graphics.d3.a();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return q3VarF;
    }
}
