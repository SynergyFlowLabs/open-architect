package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.f1;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x;
import androidx.compose.material3.hm;
import androidx.compose.material3.internal.o2;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.m2;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.semantics.b0;
import androidx.compose.ui.semantics.e0;
import androidx.media3.exoplayer.a5;
import com.canhub.cropper.core.CropImageOptions;
import com.google.android.material.internal.p0;
import com.rabbitmq.client.k0;
import d0.h1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 12 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 13 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 15 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,755:1\n70#2:756\n68#2,8:757\n77#2:795\n79#3,6:765\n86#3,3:780\n89#3,2:789\n93#3:794\n347#4,9:771\n356#4,3:791\n4206#5,6:783\n1282#6,6:796\n1282#6,3:802\n1285#6,3:806\n1282#6,6:809\n1282#6,6:815\n1282#6,6:821\n1#7:805\n56#8,6:827\n65#9:833\n69#9:836\n60#10:834\n70#10:837\n53#10,3:839\n22#11:835\n30#12:838\n137#13,2:842\n249#13,14:844\n137#13,2:859\n249#13,14:861\n85#14:858\n118#15:875\n118#15:876\n113#15:877\n113#15:878\n113#15:879\n113#15:880\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshKt\n*L\n135#1:756\n135#1:757,8\n135#1:795\n135#1:765,6\n135#1:780,3\n135#1:789,2\n135#1:794\n135#1:771,9\n135#1:791,3\n135#1:783,6\n587#1:796,6\n633#1:802,3\n633#1:806,3\n635#1:809,6\n645#1:815,6\n651#1:821,6\n724#1:827,6\n727#1:833\n727#1:836\n727#1:834\n727#1:837\n727#1:839,3\n727#1:835\n727#1:838\n729#1:842,2\n729#1:844,14\n654#1:859,2\n654#1:861,14\n635#1:858\n737#1:875\n738#1:876\n739#1:877\n740#1:878\n741#1:879\n742#1:880\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f31962a = 0.8f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f31963b = androidx.compose.ui.unit.h.r((float) 2.5d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f31964c = androidx.compose.ui.unit.h.r((float) 5.5d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f31965d = androidx.compose.ui.unit.h.r(16);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f31966e = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f31967f = androidx.compose.ui.unit.h.r(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f31968g = androidx.compose.ui.unit.h.r(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f31969h = 0.3f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f31970i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f31971j = 0.5f;

    static final class a implements pj.n<c0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f31972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f31973b;

        a(r rVar, boolean z10) {
            this.f31972a = rVar;
            this.f31973b = z10;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(c0 c0Var, androidx.compose.runtime.c0 c0Var2, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = (c0Var2.D(c0Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if (!c0Var2.h((i11 & 19) != 18, i11 & 1)) {
                c0Var2.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1028036671, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:126)");
            }
            i.f31931a.g(this.f31972a, this.f31973b, c0Var.b(a0.E, androidx.compose.ui.e.f37317a.y()), 0L, 0L, 0.0f, c0Var2, 1572864, 56);
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(c0 c0Var, androidx.compose.runtime.c0 c0Var2, Integer num) {
            c(c0Var, c0Var2, num.intValue());
            return Unit.f312394a;
        }
    }

    private static final androidx.compose.material3.pulltorefresh.a g(float f10) {
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fH = kotlin.ranges.r.H(Math.abs(f10) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fH - (((float) Math.pow(fH, 2)) / 4))) * 0.5f;
        float f11 = CropImageOptions.S3;
        return new androidx.compose.material3.pulltorefresh.a(fPow, fPow * f11, ((0.8f * fMax) + fPow) * f11, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void h(final o2 o2Var, final long j10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1353562852);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0VarR.D(o2Var) : c0VarR.k0(o2Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j10) ? 32 : 16;
        }
        if (c0VarR.h((i11 & 19) != 18, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(-1353562852, i11, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:631)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            Object obj = objI0;
            if (objI0 == aVar.a()) {
                k2 k2VarA = androidx.compose.ui.graphics.u.a();
                k2VarA.M(m2.f38048b.a());
                c0VarR.Y(k2VarA);
                obj = k2VarA;
            }
            final k2 k2Var = (k2) obj;
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = w6.e(new Function0() { // from class: androidx.compose.material3.pulltorefresh.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(p.l(o2Var));
                    }
                });
                c0VarR.Y(objI1);
            }
            final n7<Float> n7VarF = androidx.compose.animation.core.f.f(m((n7) objI1), hm.b(h1.DefaultEffects, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
            a0.a aVar2 = a0.E;
            int i12 = i11 & 14;
            boolean z10 = i12 == 4 || ((i11 & 8) != 0 && c0VarR.k0(o2Var));
            Object objI2 = c0VarR.i0();
            if (z10 || objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return p.i(o2Var, (e0) obj2);
                    }
                };
                c0VarR.Y(objI2);
            }
            a0 a0VarW = i6.w(androidx.compose.ui.semantics.t.c(aVar2, (Function1) objI2), f31965d);
            boolean zD = c0VarR.D(n7VarF) | (i12 == 4 || ((i11 & 8) != 0 && c0VarR.k0(o2Var))) | ((i11 & com.planner5d.library.engine.input.f.b.B) == 32) | c0VarR.k0(k2Var);
            Object objI3 = c0VarR.i0();
            if (zD || objI3 == aVar.a()) {
                Function1 function1 = new Function1() { // from class: androidx.compose.material3.pulltorefresh.l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return p.j(o2Var, n7VarF, j10, k2Var, (androidx.compose.ui.graphics.drawscope.f) obj2);
                    }
                };
                c0VarR.Y(function1);
                objI3 = function1;
            }
            f1.e(a0VarW, (Function1) objI3, c0VarR, 0);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return p.k(o2Var, j10, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(o2 o2Var, e0 e0Var) {
        if (o2Var.invoke() > 0.0f) {
            b0.J1(e0Var, new androidx.compose.ui.semantics.i(o2Var.invoke(), kotlin.ranges.r.e(0.0f, 1.0f), 0));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(o2 o2Var, n7 n7Var, long j10, k2 k2Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.material3.pulltorefresh.a aVarG = g(o2Var.invoke());
        float fFloatValue = ((Number) n7Var.getValue()).floatValue();
        float fB = aVarG.b();
        long jY = fVar.Y();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(fB, jY);
            float fS7 = fVar.S7(f31964c);
            float f10 = f31963b;
            n0.j jVarB = n0.k.b(n0.o.b(fVar.d()), fS7 + (fVar.S7(f10) / 2.0f));
            t(fVar, j10, fFloatValue, aVarG, jVarB, f10);
            s(fVar, k2Var, jVarB, j10, fFloatValue, aVarG, f10);
            return Unit.f312394a;
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(o2 o2Var, long j10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        h(o2Var, j10, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(o2 o2Var) {
        if (o2Var.invoke() >= 1.0f) {
            return 1.0f;
        }
        return f31969h;
    }

    private static final float m(n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0170  */
    /* JADX WARN: Code duplicated, block: B:111:0x017c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0180  */
    /* JADX WARN: Code duplicated, block: B:115:0x019f  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x010f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void n(final boolean z10, @NotNull final Function0<Unit> function0, @Nullable a0 a0Var, @Nullable r rVar, @Nullable androidx.compose.ui.e eVar, @Nullable pj.n<? super c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @NotNull final pj.n<? super c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        a0 a0Var2;
        r rVarY;
        int i13;
        androidx.compose.ui.e eVar2;
        int i14;
        int i15;
        pj.n<? super c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVarE;
        int i16;
        int i17;
        boolean z11;
        final a0 a0Var3;
        final r rVar2;
        final androidx.compose.ui.e eVar3;
        final pj.n<? super c0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        s5 s5VarT;
        androidx.compose.ui.e eVarC;
        int i18;
        a0 a0Var4;
        r rVar3;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-532332839);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
        }
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    rVarY = rVar;
                    int i20 = c0VarR.D(rVarY) ? 2048 : 1024;
                    i12 |= i20;
                } else {
                    rVarY = rVar;
                }
                i12 |= i20;
            } else {
                rVarY = rVar;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    eVar2 = eVar;
                    if (c0VarR.D(eVar2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        nVarE = nVar;
                        if (c0VarR.k0(nVarE)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(nVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i19 != 0) {
                                a0Var2 = a0.E;
                            }
                            if ((i11 & 8) != 0) {
                                rVarY = y(c0VarR, 0);
                                i12 &= -7169;
                            }
                            if (i13 != 0) {
                                eVarC = androidx.compose.ui.e.f37317a.C();
                            } else {
                                eVarC = eVar2;
                            }
                            if (i15 != 0) {
                                nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                            }
                            i18 = i12;
                            a0Var4 = a0Var2;
                            rVar3 = rVarY;
                            eVar2 = eVarC;
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            i18 = i12;
                            a0Var4 = a0Var2;
                            rVar3 = rVarY;
                        }
                        c0VarR.Z();
                        if (m0.l0()) {
                            m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                        }
                        a0 a0VarX = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
                        a1 a1VarK = x.k(eVar2, false);
                        iJ = v.j(c0VarR, 0);
                        b1 b1VarK = c0VarR.k();
                        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarX);
                        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                        function0A = aVar.a();
                        if (c0VarR.S() == null) {
                            v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK, aVar.e());
                        y7.n(c0VarD, b1VarK, aVar.g());
                        function2B = aVar.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar.f());
                        d0 d0Var = d0.f15956a;
                        nVar2.invoke(d0Var, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
                        nVarE.invoke(d0Var, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        a0Var3 = a0Var4;
                        rVar2 = rVar3;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        rVar2 = rVarY;
                    }
                    eVar3 = eVar2;
                    nVar3 = nVarE;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                nVarE = nVar;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            rVarY = y(c0VarR, 0);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i15 != 0) {
                            nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                        }
                        i18 = i12;
                        a0Var4 = a0Var2;
                        rVar3 = rVarY;
                        eVar2 = eVarC;
                    } else {
                        if (i19 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            rVarY = y(c0VarR, 0);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i15 != 0) {
                            nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                        }
                        i18 = i12;
                        a0Var4 = a0Var2;
                        rVar3 = rVarY;
                        eVar2 = eVarC;
                    }
                    c0VarR.Z();
                    if (m0.l0()) {
                        m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                    }
                    a0 a0VarX2 = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
                    a1 a1VarK2 = x.k(eVar2, false);
                    iJ = v.j(c0VarR, 0);
                    b1 b1VarK2 = c0VarR.k();
                    a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarX2);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    function0A = aVar2.a();
                    if (c0VarR.S() == null) {
                        v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK2, aVar2.e());
                    y7.n(c0VarD, b1VarK2, aVar2.g());
                    function2B = aVar2.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN2, aVar2.f());
                    d0 d0Var2 = d0.f15956a;
                    nVar2.invoke(d0Var2, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
                    nVarE.invoke(d0Var2, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    a0Var3 = a0Var4;
                    rVar2 = rVar3;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    rVar2 = rVarY;
                }
                eVar3 = eVar2;
                nVar3 = nVarE;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            eVar2 = eVar;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    nVarE = nVar;
                    if (c0VarR.k0(nVarE)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            rVarY = y(c0VarR, 0);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i15 != 0) {
                            nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                        }
                        i18 = i12;
                        a0Var4 = a0Var2;
                        rVar3 = rVarY;
                        eVar2 = eVarC;
                    } else {
                        if (i19 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            rVarY = y(c0VarR, 0);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i15 != 0) {
                            nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                        }
                        i18 = i12;
                        a0Var4 = a0Var2;
                        rVar3 = rVarY;
                        eVar2 = eVarC;
                    }
                    c0VarR.Z();
                    if (m0.l0()) {
                        m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                    }
                    a0 a0VarX3 = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
                    a1 a1VarK3 = x.k(eVar2, false);
                    iJ = v.j(c0VarR, 0);
                    b1 b1VarK3 = c0VarR.k();
                    a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarX3);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    function0A = aVar3.a();
                    if (c0VarR.S() == null) {
                        v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK3, aVar3.e());
                    y7.n(c0VarD, b1VarK3, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN3, aVar3.f());
                    d0 d0Var3 = d0.f15956a;
                    nVar2.invoke(d0Var3, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
                    nVarE.invoke(d0Var3, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    a0Var3 = a0Var4;
                    rVar2 = rVar3;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    rVar2 = rVarY;
                }
                eVar3 = eVar2;
                nVar3 = nVarE;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVarE = nVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        rVarY = y(c0VarR, 0);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i15 != 0) {
                        nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                    }
                    i18 = i12;
                    a0Var4 = a0Var2;
                    rVar3 = rVarY;
                    eVar2 = eVarC;
                } else {
                    if (i19 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        rVarY = y(c0VarR, 0);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i15 != 0) {
                        nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                    }
                    i18 = i12;
                    a0Var4 = a0Var2;
                    rVar3 = rVarY;
                    eVar2 = eVarC;
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                }
                a0 a0VarX4 = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
                a1 a1VarK4 = x.k(eVar2, false);
                iJ = v.j(c0VarR, 0);
                b1 b1VarK4 = c0VarR.k();
                a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarX4);
                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                function0A = aVar4.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK4, aVar4.e());
                y7.n(c0VarD, b1VarK4, aVar4.g());
                function2B = aVar4.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar4.f());
                d0 d0Var4 = d0.f15956a;
                nVar2.invoke(d0Var4, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
                nVarE.invoke(d0Var4, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                a0Var3 = a0Var4;
                rVar2 = rVar3;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                rVar2 = rVarY;
            }
            eVar3 = eVar2;
            nVar3 = nVarE;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                rVarY = rVar;
                if (c0VarR.D(rVarY)) {
                }
                i12 |= i20;
            } else {
                rVarY = rVar;
            }
            i12 |= i20;
        } else {
            rVarY = rVar;
        }
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                eVar2 = eVar;
                if (c0VarR.D(eVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    nVarE = nVar;
                    if (c0VarR.k0(nVarE)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(nVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            rVarY = y(c0VarR, 0);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i15 != 0) {
                            nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                        }
                        i18 = i12;
                        a0Var4 = a0Var2;
                        rVar3 = rVarY;
                        eVar2 = eVarC;
                    } else {
                        if (i19 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            rVarY = y(c0VarR, 0);
                            i12 &= -7169;
                        }
                        if (i13 != 0) {
                            eVarC = androidx.compose.ui.e.f37317a.C();
                        } else {
                            eVarC = eVar2;
                        }
                        if (i15 != 0) {
                            nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                        }
                        i18 = i12;
                        a0Var4 = a0Var2;
                        rVar3 = rVarY;
                        eVar2 = eVarC;
                    }
                    c0VarR.Z();
                    if (m0.l0()) {
                        m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                    }
                    a0 a0VarX5 = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
                    a1 a1VarK5 = x.k(eVar2, false);
                    iJ = v.j(c0VarR, 0);
                    b1 b1VarK5 = c0VarR.k();
                    a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarX5);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    function0A = aVar5.a();
                    if (c0VarR.S() == null) {
                        v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK5, aVar5.e());
                    y7.n(c0VarD, b1VarK5, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN5, aVar5.f());
                    d0 d0Var5 = d0.f15956a;
                    nVar2.invoke(d0Var5, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
                    nVarE.invoke(d0Var5, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    a0Var3 = a0Var4;
                    rVar2 = rVar3;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    rVar2 = rVarY;
                }
                eVar3 = eVar2;
                nVar3 = nVarE;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVarE = nVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        rVarY = y(c0VarR, 0);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i15 != 0) {
                        nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                    }
                    i18 = i12;
                    a0Var4 = a0Var2;
                    rVar3 = rVarY;
                    eVar2 = eVarC;
                } else {
                    if (i19 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        rVarY = y(c0VarR, 0);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i15 != 0) {
                        nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                    }
                    i18 = i12;
                    a0Var4 = a0Var2;
                    rVar3 = rVarY;
                    eVar2 = eVarC;
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                }
                a0 a0VarX6 = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
                a1 a1VarK6 = x.k(eVar2, false);
                iJ = v.j(c0VarR, 0);
                b1 b1VarK6 = c0VarR.k();
                a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarX6);
                androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                function0A = aVar6.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK6, aVar6.e());
                y7.n(c0VarD, b1VarK6, aVar6.g());
                function2B = aVar6.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN6, aVar6.f());
                d0 d0Var6 = d0.f15956a;
                nVar2.invoke(d0Var6, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
                nVarE.invoke(d0Var6, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                a0Var3 = a0Var4;
                rVar2 = rVar3;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                rVar2 = rVarY;
            }
            eVar3 = eVar2;
            nVar3 = nVarE;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        eVar2 = eVar;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                nVarE = nVar;
                if (c0VarR.k0(nVarE)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(nVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        rVarY = y(c0VarR, 0);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i15 != 0) {
                        nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                    }
                    i18 = i12;
                    a0Var4 = a0Var2;
                    rVar3 = rVarY;
                    eVar2 = eVarC;
                } else {
                    if (i19 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        rVarY = y(c0VarR, 0);
                        i12 &= -7169;
                    }
                    if (i13 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i15 != 0) {
                        nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                    }
                    i18 = i12;
                    a0Var4 = a0Var2;
                    rVar3 = rVarY;
                    eVar2 = eVarC;
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                }
                a0 a0VarX7 = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
                a1 a1VarK7 = x.k(eVar2, false);
                iJ = v.j(c0VarR, 0);
                b1 b1VarK7 = c0VarR.k();
                a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarX7);
                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                function0A = aVar7.a();
                if (c0VarR.S() == null) {
                    v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK7, aVar7.e());
                y7.n(c0VarD, b1VarK7, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN7, aVar7.f());
                d0 d0Var7 = d0.f15956a;
                nVar2.invoke(d0Var7, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
                nVarE.invoke(d0Var7, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                a0Var3 = a0Var4;
                rVar2 = rVar3;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                rVar2 = rVarY;
            }
            eVar3 = eVar2;
            nVar3 = nVarE;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVarE = nVar;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(nVar2)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((599187 & i12) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var2 = a0.E;
                }
                if ((i11 & 8) != 0) {
                    rVarY = y(c0VarR, 0);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i15 != 0) {
                    nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                }
                i18 = i12;
                a0Var4 = a0Var2;
                rVar3 = rVarY;
                eVar2 = eVarC;
            } else {
                if (i19 != 0) {
                    a0Var2 = a0.E;
                }
                if ((i11 & 8) != 0) {
                    rVarY = y(c0VarR, 0);
                    i12 &= -7169;
                }
                if (i13 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i15 != 0) {
                    nVarE = w.e(1028036671, true, new a(rVarY, z10), c0VarR, 54);
                }
                i18 = i12;
                a0Var4 = a0Var2;
                rVar3 = rVarY;
                eVar2 = eVarC;
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(-532332839, i18, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
            }
            a0 a0VarX8 = x(a0Var4, z10, rVar3, false, 0.0f, function1, 12, null);
            a1 a1VarK8 = x.k(eVar2, false);
            iJ = v.j(c0VarR, 0);
            b1 b1VarK8 = c0VarR.k();
            a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarX8);
            androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
            function0A = aVar8.a();
            if (c0VarR.S() == null) {
                v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK8, aVar8.e());
            y7.n(c0VarD, b1VarK8, aVar8.g());
            function2B = aVar8.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN8, aVar8.f());
            d0 d0Var8 = d0.f15956a;
            nVar2.invoke(d0Var8, c0VarR, Integer.valueOf(((i18 >> 15) & com.planner5d.library.engine.input.f.b.B) | 6));
            nVarE.invoke(d0Var8, c0VarR, Integer.valueOf(((i18 >> 12) & com.planner5d.library.engine.input.f.b.B) | 6));
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            a0Var3 = a0Var4;
            rVar2 = rVar3;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            rVar2 = rVarY;
        }
        eVar3 = eVar2;
        nVar3 = nVarE;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pulltorefresh.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.o(z10, function0, a0Var3, rVar2, eVar3, nVar3, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10, Function0 function0, a0 a0Var, r rVar, androidx.compose.ui.e eVar, pj.n nVar, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        n(z10, function0, a0Var, rVar, eVar, nVar, nVar2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @NotNull
    public static final r p() {
        return new u();
    }

    private static final void s(androidx.compose.ui.graphics.drawscope.f fVar, k2 k2Var, n0.j jVar, long j10, float f10, androidx.compose.material3.pulltorefresh.a aVar, float f11) {
        k2Var.reset();
        k2Var.A(0.0f, 0.0f);
        float f12 = f31967f;
        k2Var.F((fVar.S7(f12) * aVar.c()) / 2, fVar.S7(f31968g) * aVar.c());
        k2Var.F(fVar.S7(f12) * aVar.c(), 0.0f);
        float fMin = ((Math.min(jVar.x() - jVar.t(), jVar.j() - jVar.B()) / 2.0f) + Float.intBitsToFloat((int) (jVar.o() >> 32))) - ((fVar.S7(f12) * aVar.c()) / 2.0f);
        k2Var.m(n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jVar.o() & k0.f265952a)) - fVar.S7(f11))) & k0.f265952a) | (Float.floatToRawIntBits(fMin) << 32)));
        float fA = aVar.a() - fVar.S7(f11);
        long jY = fVar.Y();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(fA, jY);
            androidx.compose.ui.graphics.drawscope.f.K1(fVar, k2Var, j10, f10, new androidx.compose.ui.graphics.drawscope.n(fVar.S7(f11), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    private static final void t(androidx.compose.ui.graphics.drawscope.f fVar, long j10, float f10, androidx.compose.material3.pulltorefresh.a aVar, n0.j jVar, float f11) {
        androidx.compose.ui.graphics.drawscope.f.a2(fVar, j10, aVar.d(), aVar.a() - aVar.d(), false, jVar.E(), jVar.z(), f10, new androidx.compose.ui.graphics.drawscope.n(fVar.S7(f11), 0.0f, u3.f38256b.a(), 0, null, 26, null), null, 0, p0.f112892a, null);
    }

    public static final float u() {
        return f31966e;
    }

    public static final float v() {
        return f31965d;
    }

    @NotNull
    public static final a0 w(@NotNull a0 a0Var, boolean z10, @NotNull r rVar, boolean z11, float f10, @NotNull Function0<Unit> function0) {
        return a0Var.B2(new PullToRefreshElement(z10, function0, z11, rVar, f10, null));
    }

    public static /* synthetic */ a0 x(a0 a0Var, boolean z10, r rVar, boolean z11, float f10, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 8) != 0) {
            f10 = i.f31931a.w();
        }
        return w(a0Var, z10, rVar, z12, f10, function0);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final r y(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (m0.l0()) {
            m0.A0(318623070, i10, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:585)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<u, Float> c0VarA = u.f31999b.a();
        Object objI0 = c0Var.i0();
        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.material3.pulltorefresh.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return p.z();
                }
            };
            c0Var.Y(objI0);
        }
        u uVar = (u) androidx.compose.runtime.saveable.i.j(objArr, c0VarA, (Function0) objI0, c0Var, a5.S0);
        if (m0.l0()) {
            m0.z0();
        }
        return uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z() {
        return new u();
    }
}
