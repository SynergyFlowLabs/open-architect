package androidx.compose.material;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,838:1\n1282#2,6:839\n1282#2,6:845\n1282#2,6:851\n1282#2,6:858\n1282#2,3:871\n1285#2,3:875\n1282#2,3:885\n1285#2,3:889\n1282#2,6:903\n1282#2,6:909\n1282#2,6:915\n1282#2,6:921\n1282#2,6:927\n1282#2,6:933\n75#3:857\n607#4:864\n604#4,6:865\n607#4:878\n604#4,6:879\n605#5:874\n605#5:888\n65#6,10:892\n635#7:902\n85#8:939\n113#9:940\n113#9:941\n113#9:942\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt\n*L\n390#1:839,6\n392#1:845,6\n408#1:851,6\n415#1:858,6\n463#1:871,3\n463#1:875,3\n590#1:885,3\n590#1:889,3\n733#1:903,6\n734#1:909,6\n745#1:915,6\n756#1:921,6\n757#1:927,6\n768#1:933,6\n411#1:857\n463#1:864\n463#1:865,6\n590#1:878\n590#1:879,6\n463#1:874\n590#1:888\n723#1:892,10\n727#1:902\n729#1:939\n771#1:940\n772#1:941\n773#1:942\n*E\n"})
public final class v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f25227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f25228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f25229c = androidx.compose.ui.unit.h.r(400);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.y3<Float> f25230d = new androidx.compose.animation.core.y3<>(256, 0, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f25231e = 0.5f;

    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 10 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,838:1\n75#2:839\n75#2:840\n70#3:841\n67#3,9:842\n77#3:905\n79#4,6:851\n86#4,3:866\n89#4,2:875\n93#4:904\n347#5,9:857\n356#5:877\n357#5,2:902\n4206#6,6:869\n1282#7,6:878\n1282#7,6:884\n1282#7,6:890\n1282#7,6:896\n59#8:906\n90#9:907\n80#9:909\n32#10:908\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1\n*L\n595#1:839\n607#1:840\n618#1:841\n618#1:842,9\n618#1:905\n618#1:851,6\n618#1:866,3\n618#1:875,2\n618#1:904\n618#1:857,9\n618#1:877\n618#1:902,2\n618#1:869,6\n622#1:878,6\n632#1:884,6\n669#1:890,6\n670#1:896,6\n633#1:906\n633#1:907\n669#1:909\n669#1:908\n*E\n"})
    static final class a implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f25232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h2 f25233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f25235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f25236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f25237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f25238g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f25239h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f25240i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f25241j;

        /* JADX INFO: renamed from: androidx.compose.material.v6$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1$1", f = "Drawer.kt", i = {}, l = {624}, m = "invokeSuspend", n = {}, s = {})
        static final class C0203a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25242a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h2 f25243b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0203a(h2 h2Var, kotlin.coroutines.d<? super C0203a> dVar) {
                super(2, dVar);
                this.f25243b = h2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0203a(this.f25243b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f25242a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    h2 h2Var = this.f25243b;
                    this.f25242a = 1;
                    if (h2Var.i(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0203a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1$1", f = "Drawer.kt", i = {}, l = {677}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25244a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h2 f25245b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h2 h2Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f25245b = h2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f25245b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f25244a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    h2 h2Var = this.f25245b;
                    this.f25244a = 1;
                    if (h2Var.i(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1$1$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,838:1\n87#2:839\n83#2,10:840\n94#2:880\n79#3,6:850\n86#3,3:865\n89#3,2:874\n93#3:879\n347#4,9:856\n356#4,3:876\n4206#5,6:868\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$BottomDrawer$1$1$5\n*L\n688#1:839\n688#1:840,10\n688#1:880\n688#1:850,6\n688#1:865,3\n688#1:874,2\n688#1:879\n688#1:856,9\n688#1:876,3\n688#1:868,6\n*E\n"})
        static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f25246a;

            /* JADX WARN: Multi-variable type inference failed */
            c(pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f25246a = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1691510868, i10, -1, "androidx.compose.material.BottomDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:687)");
                }
                pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f25246a;
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                nVar.invoke(androidx.compose.foundation.layout.n0.f16227a, c0Var, 6);
                c0Var.o();
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

        public /* synthetic */ class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25247a;

            static {
                int[] iArr = new int[i2.values().length];
                try {
                    iArr[i2.Closed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i2.Open.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i2.Expanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f25247a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, h2 h2Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, long j10, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.graphics.q3 q3Var, long j11, long j12, float f10, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f25232a = z10;
            this.f25233b = h2Var;
            this.f25234c = function2;
            this.f25235d = j10;
            this.f25236e = s0Var;
            this.f25237f = q3Var;
            this.f25238g = j11;
            this.f25239h = j12;
            this.f25240i = f10;
            this.f25241j = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q A(h2 h2Var, androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) kotlin.math.b.L0(h2Var.z())) & com.rabbitmq.client.k0.f265952a) | (((long) 0) << 32)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(String str, final h2 h2Var, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.G1(e0Var, str);
            if (h2Var.v()) {
                androidx.compose.ui.semantics.b0.p(e0Var, null, new Function0() { // from class: androidx.compose.material.p6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(v6.a.v(h2Var, s0Var));
                    }
                }, 1, null);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean v(h2 h2Var, kotlinx.coroutines.s0 s0Var) {
            if (!h2Var.j(i2.Closed)) {
                return true;
            }
            kotlinx.coroutines.k.f(s0Var, null, null, new b(h2Var, null), 3, null);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(boolean z10, h2 h2Var, kotlinx.coroutines.s0 s0Var) {
            if (z10 && h2Var.j(i2.Closed)) {
                kotlinx.coroutines.k.f(s0Var, null, null, new C0203a(h2Var, null), 3, null);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit y(h2 h2Var, final float f10, final boolean z10, androidx.compose.ui.unit.u uVar) {
            i2 i2VarM;
            final float fQ = (int) (uVar.q() & com.rabbitmq.client.k0.f265952a);
            w5<i2> w5VarA = k.a(new Function1() { // from class: androidx.compose.material.q6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v6.a.z(f10, fQ, z10, (x5) obj);
                }
            });
            if (h2Var.l().u().getSize() <= 0 && w5VarA.d(h2Var.m())) {
                i2VarM = h2Var.m();
            } else {
                int i10 = d.f25247a[h2Var.s().ordinal()];
                if (i10 == 1) {
                    i2VarM = i2.Closed;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new kotlin.k0();
                    }
                    i2VarM = i2.Open;
                    if (!w5VarA.d(i2VarM)) {
                        i2VarM = i2.Expanded;
                        if (!w5VarA.d(i2VarM)) {
                            i2VarM = i2.Closed;
                        }
                    }
                }
            }
            h2Var.l().U(w5VarA, i2VarM);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(float f10, float f11, boolean z10, x5 x5Var) {
            x5Var.a(i2.Closed, f10);
            float f12 = 0.5f * f10;
            if (f11 > f12 || z10) {
                x5Var.a(i2.Open, f12);
            }
            if (f11 > 0.0f) {
                x5Var.a(i2.Expanded, Math.max(0.0f, f10 - f11));
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            n(h0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void n(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.layout.h0 h0Var2;
            int i11;
            if ((i10 & 6) == 0) {
                h0Var2 = h0Var;
                i11 = i10 | (c0Var.D(h0Var2) ? 4 : 2);
            } else {
                h0Var2 = h0Var;
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(468886998, i11, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:591)");
            }
            final float fO = androidx.compose.ui.unit.b.o(h0Var2.h());
            final boolean z10 = androidx.compose.ui.unit.b.p(h0Var2.h()) > androidx.compose.ui.unit.b.o(h0Var2.h());
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.A(aVar, 0.0f, 0.0f, dVar.D3(androidx.compose.ui.unit.b.p(h0Var2.h())), dVar.D3(androidx.compose.ui.unit.b.o(h0Var2.h())), 3, null);
            androidx.compose.ui.a0 a0VarE = k.e(aVar.B2(this.f25232a ? androidx.compose.ui.input.nestedscroll.c.b(aVar, this.f25233b.o(), null, 2, null) : aVar), this.f25233b.l(), androidx.compose.foundation.gestures.q3.Vertical, this.f25232a, c0Var.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl, null, false, 48, null);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f25234c;
            long j10 = this.f25235d;
            final boolean z11 = this.f25232a;
            final h2 h2Var = this.f25233b;
            final kotlinx.coroutines.s0 s0Var = this.f25236e;
            androidx.compose.ui.graphics.q3 q3Var = this.f25237f;
            long j11 = this.f25238g;
            long j12 = this.f25239h;
            float f10 = this.f25240i;
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f25241j;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarE);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            boolean zG = c0Var.G(z11) | c0Var.k0(h2Var) | c0Var.k0(s0Var);
            Object objI0 = c0Var.i0();
            if (zG || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material.r6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v6.a.x(z11, h2Var, s0Var);
                    }
                };
                c0Var.Y(objI0);
            }
            v6.p(j10, (Function0) objI0, h2Var.s() != i2.Closed, c0Var, 0);
            final String strA = ug.a(tg.f25008b.e(), c0Var, 6);
            boolean zI = c0Var.I(fO) | c0Var.G(z10) | c0Var.k0(h2Var);
            Object objI1 = c0Var.i0();
            if (zI || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.s6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v6.a.y(h2Var, fO, z10, (androidx.compose.ui.unit.u) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarA2 = androidx.compose.ui.layout.y1.a(a0VarA, (Function1) objI1);
            boolean zK0 = c0Var.k0(h2Var);
            Object objI2 = c0Var.i0();
            if (zK0 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material.t6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v6.a.A(h2Var, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0Var.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarJ = androidx.compose.foundation.layout.s4.j(a0VarA2, (Function1) objI2);
            boolean zD = c0Var.D(strA) | c0Var.k0(h2Var) | c0Var.k0(s0Var);
            Object objI3 = c0Var.i0();
            if (zD || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material.u6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v6.a.s(strA, h2Var, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI3);
            }
            ah.e(androidx.compose.ui.semantics.t.f(a0VarJ, false, (Function1) objI3, 1, null), q3Var, j11, j12, null, f10, androidx.compose.runtime.internal.w.e(1691510868, true, new c(nVar), c0Var, 54), c0Var, 1572864, 16);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f25248a;

        b(Function0<Unit> function0) {
            this.f25248a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function0 function0, n0.g gVar) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final Function0<Unit> function0 = this.f25248a;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.material.w6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v6.b.b(function0, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,838:1\n30#2:839\n53#3,3:840\n60#3:844\n70#3:847\n65#4:843\n69#4:846\n22#5:845\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n*L\n827#1:839\n827#1:840,3\n836#1:844\n836#1:847\n836#1:843\n836#1:846\n836#1:845\n*E\n"})
    public static final class c implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.compose.foundation.gestures.q3 f25249a = androidx.compose.foundation.gestures.q3.Vertical;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<?> f25250b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {822}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f25251a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f25252b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f25254d;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25252b = obj;
                this.f25254d |= Integer.MIN_VALUE;
                return c.this.B0(0L, 0L, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "Drawer.kt", i = {0}, l = {813}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f25255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f25256b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f25258d;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25256b = obj;
                this.f25258d |= Integer.MIN_VALUE;
                return c.this.a4(0L, this);
            }
        }

        c(u<?> uVar) {
            this.f25250b = uVar;
        }

        @oj.i(name = "offsetToFloat")
        private final float b(long j10) {
            return Float.intBitsToFloat((int) (this.f25249a == androidx.compose.foundation.gestures.q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
        }

        private final long c(float f10) {
            androidx.compose.foundation.gestures.q3 q3Var = this.f25249a;
            float f11 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? f10 : 0.0f;
            if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
                f10 = 0.0f;
            }
            return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32));
        }

        @oj.i(name = "velocityToFloat")
        private final float d(long j10) {
            return this.f25249a == androidx.compose.foundation.gestures.q3.Horizontal ? androidx.compose.ui.unit.c0.l(j10) : androidx.compose.ui.unit.c0.n(j10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f25254d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f25254d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f25252b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f25254d;
            if (i11 == 0) {
                ResultKt.m(obj);
                u<?> uVar = this.f25250b;
                float fD = d(j11);
                aVar.f25251a = j11;
                aVar.f25254d = 1;
                if (uVar.Q(fD, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = aVar.f25251a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j11);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            float fB = b(j10);
            return (fB >= 0.0f || !androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) ? n0.g.f332700b.e() : c(this.f25250b.t(fB));
        }

        public final androidx.compose.foundation.gestures.q3 a() {
            return this.f25249a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object a4(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f25258d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f25258d = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f25256b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = bVar.f25258d;
            if (i11 == 0) {
                ResultKt.m(obj);
                float fD = d(j10);
                float fK = this.f25250b.K();
                if (fD >= 0.0f || fK <= this.f25250b.u().e()) {
                    j10 = androidx.compose.ui.unit.c0.f42681b.a();
                } else {
                    u<?> uVar = this.f25250b;
                    bVar.f25255a = j10;
                    bVar.f25258d = 1;
                    if (uVar.Q(fD, bVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = bVar.f25255a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) ? c(this.f25250b.t(b(j11))) : n0.g.f332700b.e();
        }
    }

    @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,838:1\n75#2:839\n75#2:846\n75#2:938\n1282#3,6:840\n1282#3,6:926\n1282#3,6:932\n1282#3,6:939\n1282#3,6:945\n70#4:847\n67#4,9:848\n70#4:884\n66#4,10:885\n77#4:925\n77#4:954\n79#5,6:857\n86#5,3:872\n89#5,2:881\n79#5,6:895\n86#5,3:910\n89#5,2:919\n93#5:924\n93#5:953\n347#6,9:863\n356#6:883\n347#6,9:901\n356#6,3:921\n357#6,2:951\n4206#7,6:875\n4206#7,6:913\n32#8:955\n80#9:956\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1\n*L\n473#1:839\n483#1:846\n511#1:938\n474#1:840,6\n495#1:926,6\n505#1:932,6\n519#1:939,6\n521#1:945,6\n484#1:847\n484#1:848,9\n492#1:884\n492#1:885,10\n492#1:925\n484#1:954\n484#1:857,6\n484#1:872,3\n484#1:881,2\n492#1:895,6\n492#1:910,3\n492#1:919,2\n492#1:924\n484#1:953\n484#1:863,9\n484#1:883\n492#1:901,9\n492#1:921,3\n484#1:951,2\n484#1:875,6\n492#1:913,6\n519#1:955\n519#1:956\n*E\n"})
    static final class d implements pj.n<androidx.compose.foundation.layout.h0, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k7 f25259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f25261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f25262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f25263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f25264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f25265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f25266h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f25267i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f25268j;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$2$1$1", f = "Drawer.kt", i = {}, l = {502}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25269a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k7 f25270b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k7 k7Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f25270b = k7Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f25270b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f25269a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    k7 k7Var = this.f25270b;
                    this.f25269a = 1;
                    if (k7Var.h(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.DrawerKt$ModalDrawer$1$2$6$1$1$1", f = "Drawer.kt", i = {}, l = {com.rabbitmq.client.a.f264852w}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25271a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k7 f25272b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k7 k7Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f25272b = k7Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f25272b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f25271a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    k7 k7Var = this.f25272b;
                    this.f25271a = 1;
                    if (k7Var.h(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @SourceDebugExtension({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1$2$7\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,838:1\n87#2:839\n84#2,9:840\n94#2:879\n79#3,6:849\n86#3,3:864\n89#3,2:873\n93#3:878\n347#4,9:855\n356#4,3:875\n4206#5,6:867\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerKt$ModalDrawer$1$2$7\n*L\n541#1:839\n541#1:840,9\n541#1:879\n541#1:849,6\n541#1:864,3\n541#1:873,2\n541#1:878\n541#1:855,9\n541#1:875,3\n541#1:867,6\n*E\n"})
        static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f25273a;

            /* JADX WARN: Multi-variable type inference failed */
            c(pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f25273a = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1265707871, i10, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:540)");
                }
                androidx.compose.ui.a0 a0VarF = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null);
                pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f25273a;
                androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
                int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                androidx.compose.runtime.b1 b1VarK = c0Var.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
                androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                Function0<androidx.compose.ui.node.g> function0A = aVar.a();
                if (c0Var.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0Var.q();
                if (c0Var.P()) {
                    c0Var.q0(function0A);
                } else {
                    c0Var.l();
                }
                androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
                androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                nVar.invoke(androidx.compose.foundation.layout.n0.f16227a, c0Var, 6);
                c0Var.o();
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

        /* JADX WARN: Multi-variable type inference failed */
        d(k7 k7Var, boolean z10, kotlinx.coroutines.s0 s0Var, long j10, androidx.compose.ui.graphics.q3 q3Var, long j11, long j12, float f10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f25259a = k7Var;
            this.f25260b = z10;
            this.f25261c = s0Var;
            this.f25262d = j10;
            this.f25263e = q3Var;
            this.f25264f = j11;
            this.f25265g = j12;
            this.f25266h = f10;
            this.f25267i = function2;
            this.f25268j = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float A(float f10, float f11, k7 k7Var) {
            return v6.M(f10, f11, k7Var.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit B(k7 k7Var, androidx.compose.ui.unit.d dVar, final float f10, final float f11) {
            k7Var.v(dVar);
            u.V(k7Var.i(), k.a(new Function1() { // from class: androidx.compose.material.d7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v6.d.C(f10, f11, (x5) obj);
                }
            }), null, 2, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit C(float f10, float f11, x5 x5Var) {
            x5Var.a(l7.Closed, f10);
            x5Var.a(l7.Open, f11);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q v(k7 k7Var, androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) kotlin.math.b.L0(k7Var.u())) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit x(String str, final k7 k7Var, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.G1(e0Var, str);
            if (k7Var.r()) {
                androidx.compose.ui.semantics.b0.p(e0Var, null, new Function0() { // from class: androidx.compose.material.x6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(v6.d.y(k7Var, s0Var));
                    }
                }, 1, null);
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean y(k7 k7Var, kotlinx.coroutines.s0 s0Var) {
            if (k7Var.i().x().invoke(l7.Closed).booleanValue()) {
                int i10 = 6 >> 0;
                kotlinx.coroutines.k.f(s0Var, null, null, new b(k7Var, null), 3, null);
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit z(boolean z10, k7 k7Var, kotlinx.coroutines.s0 s0Var) {
            if (z10 && k7Var.i().x().invoke(l7.Closed).booleanValue()) {
                kotlinx.coroutines.k.f(s0Var, null, null, new a(k7Var, null), 3, null);
            }
            return Unit.f312394a;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            s(h0Var, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void s(androidx.compose.foundation.layout.h0 h0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.foundation.layout.h0 h0Var2;
            int i11;
            if ((i10 & 6) == 0) {
                h0Var2 = h0Var;
                i11 = i10 | (c0Var.D(h0Var2) ? 4 : 2);
            } else {
                h0Var2 = h0Var;
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1549911011, i11, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:464)");
            }
            long jH = h0Var2.h();
            if (!androidx.compose.ui.unit.b.j(jH)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            final float f10 = -androidx.compose.ui.unit.b.p(jH);
            final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            boolean zD = c0Var.D(this.f25259a) | c0Var.D(dVar) | c0Var.I(f10);
            final k7 k7Var = this.f25259a;
            Object objI0 = c0Var.i0();
            final float f11 = 0.0f;
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material.y6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v6.d.B(k7Var, dVar, f10, f11);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.runtime.b2.m((Function0) objI0, c0Var, 0);
            boolean z10 = c0Var.W(androidx.compose.ui.platform.q1.u()) == androidx.compose.ui.unit.w.Rtl;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarE = k.e(aVar, this.f25259a.i(), androidx.compose.foundation.gestures.q3.Horizontal, this.f25260b, z10, null, false, 48, null);
            final k7 k7Var2 = this.f25259a;
            final boolean z11 = this.f25260b;
            final kotlinx.coroutines.s0 s0Var = this.f25261c;
            long j10 = this.f25262d;
            androidx.compose.ui.graphics.q3 q3Var = this.f25263e;
            long j11 = this.f25264f;
            long j12 = this.f25265g;
            float f12 = this.f25266h;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f25267i;
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f25268j;
            androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarE);
            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar3.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0Var.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0Var, aVar);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar3.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A2);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK2, aVar3.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar3.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
            function2.invoke(c0Var, 0);
            c0Var.o();
            boolean zR = k7Var2.r();
            boolean zG = c0Var.G(z11) | c0Var.D(k7Var2) | c0Var.k0(s0Var);
            Object objI1 = c0Var.i0();
            if (zG || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function0() { // from class: androidx.compose.material.z6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v6.d.z(z11, k7Var2, s0Var);
                    }
                };
                c0Var.Y(objI1);
            }
            Function0 function0 = (Function0) objI1;
            boolean zI = c0Var.I(f10) | c0Var.D(k7Var2);
            Object objI2 = c0Var.i0();
            if (zI || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                final float f13 = 0.0f;
                objI2 = new Function0() { // from class: androidx.compose.material.a7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(v6.d.A(f10, f13, k7Var2));
                    }
                };
                c0Var.Y(objI2);
            }
            v6.z(zR, function0, (Function0) objI2, j10, c0Var, 0);
            final String strA = ug.a(tg.f25008b.e(), c0Var, 6);
            androidx.compose.ui.unit.d dVar2 = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
            androidx.compose.ui.a0 a0VarZ = androidx.compose.foundation.layout.i6.z(aVar, dVar2.D3(androidx.compose.ui.unit.b.r(jH)), dVar2.D3(androidx.compose.ui.unit.b.q(jH)), dVar2.D3(androidx.compose.ui.unit.b.p(jH)), dVar2.D3(androidx.compose.ui.unit.b.o(jH)));
            boolean zD2 = c0Var.D(k7Var2);
            Object objI3 = c0Var.i0();
            if (zD2 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material.b7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v6.d.v(k7Var2, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0Var.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(androidx.compose.foundation.layout.s4.j(a0VarZ, (Function1) objI3), 0.0f, 0.0f, v6.f25227a, 0.0f, 11, null);
            boolean zD3 = c0Var.D(strA) | c0Var.D(k7Var2) | c0Var.k0(s0Var);
            Object objI4 = c0Var.i0();
            if (zD3 || objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                objI4 = new Function1() { // from class: androidx.compose.material.c7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v6.d.x(strA, k7Var2, s0Var, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI4);
            }
            ah.e(androidx.compose.ui.semantics.t.f(a0VarV, false, (Function1) objI4, 1, null), q3Var, j11, j12, null, f12, androidx.compose.runtime.internal.w.e(1265707871, true, new c(nVar), c0Var, 54), c0Var, 1572864, 16);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f25274a;

        e(Function0<Unit> function0) {
            this.f25274a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function0 function0, n0.g gVar) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final Function0<Unit> function0 = this.f25274a;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.material.e7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return v6.e.b(function0, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    static {
        float f10 = 56;
        f25227a = androidx.compose.ui.unit.h.r(f10);
        f25228b = androidx.compose.ui.unit.h.r(f10);
        int i10 = 3 ^ 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(String str, final Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material.f6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(v6.B(function0));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(long j10, Function0 function0, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, 0L, 0L, ((Number) function0.invoke()).floatValue(), null, null, 0, 118, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(boolean z10, Function0 function0, Function0 function1, long j10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        z(z10, function0, function1, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float M(float f10, float f11, float f12) {
        float f13 = (f12 - f10) / (f11 - f10);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            return 1.0f;
        }
        return f13;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final h2 N(@NotNull final i2 i2Var, @Nullable final Function1<? super i2, Boolean> function1, @Nullable final androidx.compose.animation.core.o<Float> oVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.c6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(v6.O((i2) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        if ((i11 & 4) != 0) {
            oVar = a6.f21970a.a();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1477366969, i10, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:409)");
        }
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        Object[] objArr = {dVar};
        androidx.compose.runtime.saveable.c0<h2, i2> c0VarC = h2.f22986d.c(dVar, function1, oVar);
        boolean z10 = true;
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.K(i2Var.ordinal())) || (i10 & 6) == 4) | c0Var.D(dVar);
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(function1)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean zK0 = zD | z10 | c0Var.k0(oVar);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material.d6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v6.P(i2Var, dVar, function1, oVar);
                }
            };
            c0Var.Y(objI1);
        }
        h2 h2Var = (h2) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return h2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(i2 i2Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h2 P(i2 i2Var, androidx.compose.ui.unit.d dVar, Function1 function1, androidx.compose.animation.core.o oVar) {
        return new h2(i2Var, dVar, function1, oVar);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final k7 Q(@NotNull final l7 l7Var, @Nullable final Function1<? super l7, Boolean> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.g6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(v6.R((l7) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1435874229, i10, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:390)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<k7, l7> c0VarC = k7.f23499c.c(function1);
        boolean z10 = true;
        boolean z11 = (((i10 & 14) ^ 6) > 4 && c0Var.K(l7Var.ordinal())) || (i10 & 6) == 4;
        if ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 || !c0Var.D(function1)) && (i10 & 48) != 32) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI1 = c0Var.i0();
        if (z12 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            objI1 = new Function0() { // from class: androidx.compose.material.h6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return v6.S(l7Var, function1);
                }
            };
            c0Var.Y(objI1);
        }
        k7 k7Var = (k7) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI1, c0Var, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return k7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(l7 l7Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k7 S(l7 l7Var, Function1 function1) {
        return new k7(l7Var, function1);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:115:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:142:0x01af  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x01df  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:160:0x0209  */
    /* JADX WARN: Code duplicated, block: B:163:0x020f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0227  */
    /* JADX WARN: Code duplicated, block: B:167:0x0246  */
    /* JADX WARN: Code duplicated, block: B:170:0x025b  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void o(@NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable h2 h2Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, long j12, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        int i12;
        h2 h2Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z12;
        final androidx.compose.ui.a0 a0Var2;
        final long j13;
        final h2 h2Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final float f12;
        final long j14;
        final long j15;
        androidx.compose.runtime.s5 s5VarT;
        boolean z14;
        h2 h2VarN;
        int i21;
        androidx.compose.ui.graphics.q3 q3VarE;
        float fC;
        long jB;
        long jD;
        long jD2;
        h2 h2Var4;
        androidx.compose.ui.graphics.q3 q3Var4;
        float f13;
        boolean z15;
        long j16;
        long j17;
        ?? r10;
        Object objI0;
        int i22;
        int i23;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1403479060);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(nVar2) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    h2Var2 = h2Var;
                    int i25 = c0VarR.k0(h2Var2) ? 256 : 128;
                    i12 |= i25;
                } else {
                    h2Var2 = h2Var;
                }
                i12 |= i25;
            } else {
                h2Var2 = h2Var;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i12 |= 3072;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i10 & 3072) == 0) {
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
            }
            if ((i10 & 24576) == 0) {
                q3Var2 = q3Var;
                if ((i11 & 16) == 0 || !c0VarR.D(q3Var2)) {
                    i23 = 8192;
                } else {
                    i23 = 16384;
                }
                i12 |= i23;
            } else {
                q3Var2 = q3Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                f11 = f10;
            } else {
                f11 = f10;
                if ((196608 & i10) == 0) {
                    if (c0VarR.I(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
            }
            if ((1572864 & i10) == 0) {
                int i26 = i12;
                if ((i11 & 64) == 0 || !c0VarR.L(j10)) {
                    i22 = 524288;
                } else {
                    i22 = 1048576;
                }
                i17 = i26 | i22;
            } else {
                i17 = i12;
            }
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    i18 = i24;
                    int i27 = c0VarR.L(j11) ? 8388608 : 4194304;
                    i17 |= i27;
                } else {
                    i18 = i24;
                }
                i17 |= i27;
            } else {
                i18 = i24;
            }
            if ((i10 & 100663296) != 0) {
                i17 |= ((i11 & 256) == 0 || !c0VarR.L(j12)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i17 |= i19;
                }
                i20 = i17;
                if ((306783379 & i20) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i18 != 0) {
                            a0Var = androidx.compose.ui.a0.E;
                        } else {
                            a0Var = a0Var;
                        }
                        if ((i11 & 4) != 0) {
                            z14 = true;
                            h2VarN = N(i2.Closed, null, null, c0VarR, 6, 6);
                            i21 = i20 & (-897);
                        } else {
                            z14 = true;
                            h2VarN = h2Var2;
                            i21 = i20;
                        }
                        if (i13 != 0) {
                            z11 = z14 ? 1 : 0;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i21 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i21 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i21 >> 18) & 14);
                            i21 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            i21 &= -234881025;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            h2Var4 = h2VarN;
                            z15 = z11;
                            r10 = z14;
                        } else {
                            jD2 = j12;
                            h2Var4 = h2VarN;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            z15 = z11;
                            j16 = jB;
                            j17 = jD;
                            r10 = z14;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i20 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i20 &= -57345;
                        }
                        if ((i11 & 64) != 0) {
                            i20 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            i20 &= -29360129;
                        }
                        if ((i11 & 256) != 0) {
                            i20 &= -234881025;
                        }
                        j16 = j10;
                        j17 = j11;
                        jD2 = j12;
                        r10 = 1;
                        h2Var4 = h2Var2;
                        z15 = z11 ? 1 : 0;
                        q3Var4 = q3Var2;
                        f13 = f11;
                        i21 = i20;
                    }
                    androidx.compose.ui.a0 a0Var3 = a0Var;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1403479060, i21, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:588)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var3, 0.0f, r10, null), null, false, androidx.compose.runtime.internal.w.e(468886998, r10, new a(z15, h2Var4, function2, jD2, (kotlinx.coroutines.s0) objI0, q3Var4, j16, j17, f13, nVar2), c0VarR, 54), c0VarR, 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var2 = a0Var3;
                    z13 = z15;
                    h2Var3 = h2Var4;
                    j15 = jD2;
                    q3Var3 = q3Var4;
                    j13 = j16;
                    j14 = j17;
                    f12 = f13;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    j13 = j10;
                    h2Var3 = h2Var2;
                    boolean z16 = z11 ? 1 : 0;
                    z13 = z11 ? 1 : 0;
                    q3Var3 = q3Var2;
                    f12 = f11;
                    j14 = j11;
                    j15 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.i6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return v6.v(nVar, a0Var2, h2Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 805306368;
            i20 = i17;
            if ((306783379 & i20) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var = androidx.compose.ui.a0.E;
                    } else {
                        a0Var = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        z14 = true;
                        h2VarN = N(i2.Closed, null, null, c0VarR, 6, 6);
                        i21 = i20 & (-897);
                    } else {
                        z14 = true;
                        h2VarN = h2Var2;
                        i21 = i20;
                    }
                    if (i13 != 0) {
                        z11 = z14 ? 1 : 0;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i21 >> 18) & 14);
                        i21 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i21 &= -234881025;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        h2Var4 = h2VarN;
                        z15 = z11;
                        r10 = z14;
                    } else {
                        jD2 = j12;
                        h2Var4 = h2VarN;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        z15 = z11;
                        j16 = jB;
                        j17 = jD;
                        r10 = z14;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var = androidx.compose.ui.a0.E;
                    } else {
                        a0Var = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        z14 = true;
                        h2VarN = N(i2.Closed, null, null, c0VarR, 6, 6);
                        i21 = i20 & (-897);
                    } else {
                        z14 = true;
                        h2VarN = h2Var2;
                        i21 = i20;
                    }
                    if (i13 != 0) {
                        z11 = z14 ? 1 : 0;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i21 >> 18) & 14);
                        i21 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i21 &= -234881025;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        h2Var4 = h2VarN;
                        z15 = z11;
                        r10 = z14;
                    } else {
                        jD2 = j12;
                        h2Var4 = h2VarN;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        z15 = z11;
                        j16 = jB;
                        j17 = jD;
                        r10 = z14;
                    }
                }
                androidx.compose.ui.a0 a0Var4 = a0Var;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1403479060, i21, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:588)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, r10, null), null, false, androidx.compose.runtime.internal.w.e(468886998, r10, new a(z15, h2Var4, function2, jD2, (kotlinx.coroutines.s0) objI0, q3Var4, j16, j17, f13, nVar2), c0VarR, 54), c0VarR, 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var4;
                z13 = z15;
                h2Var3 = h2Var4;
                j15 = jD2;
                q3Var3 = q3Var4;
                j13 = j16;
                j14 = j17;
                f12 = f13;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                j13 = j10;
                h2Var3 = h2Var2;
                boolean z17 = z11 ? 1 : 0;
                z13 = z11 ? 1 : 0;
                q3Var3 = q3Var2;
                f12 = f11;
                j14 = j11;
                j15 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.i6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v6.v(nVar, a0Var2, h2Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                h2Var2 = h2Var;
                if (c0VarR.k0(h2Var2)) {
                }
                i12 |= i25;
            } else {
                h2Var2 = h2Var;
            }
            i12 |= i25;
        } else {
            h2Var2 = h2Var;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if (c0VarR.G(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
        }
        if ((i10 & 24576) == 0) {
            q3Var2 = q3Var;
            if ((i11 & 16) == 0) {
                i23 = 8192;
            } else {
                i23 = 8192;
            }
            i12 |= i23;
        } else {
            q3Var2 = q3Var;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            f11 = f10;
        } else {
            f11 = f10;
            if ((196608 & i10) == 0) {
                if (c0VarR.I(f11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
        }
        if ((1572864 & i10) == 0) {
            int i28 = i12;
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i17 = i28 | i22;
        } else {
            i17 = i12;
        }
        if ((i10 & 12582912) == 0) {
            if ((i11 & 128) == 0) {
                i18 = i24;
                if (c0VarR.L(j11)) {
                }
                i17 |= i27;
            } else {
                i18 = i24;
            }
            i17 |= i27;
        } else {
            i18 = i24;
        }
        if ((i10 & 100663296) != 0) {
            i17 |= ((i11 & 256) == 0 || !c0VarR.L(j12)) ? com.google.api.client.googleapis.media.a.f115410j : 67108864;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i17 |= i19;
            }
            i20 = i17;
            if ((306783379 & i20) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var = androidx.compose.ui.a0.E;
                    } else {
                        a0Var = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        z14 = true;
                        h2VarN = N(i2.Closed, null, null, c0VarR, 6, 6);
                        i21 = i20 & (-897);
                    } else {
                        z14 = true;
                        h2VarN = h2Var2;
                        i21 = i20;
                    }
                    if (i13 != 0) {
                        z11 = z14 ? 1 : 0;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i21 >> 18) & 14);
                        i21 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i21 &= -234881025;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        h2Var4 = h2VarN;
                        z15 = z11;
                        r10 = z14;
                    } else {
                        jD2 = j12;
                        h2Var4 = h2VarN;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        z15 = z11;
                        j16 = jB;
                        j17 = jD;
                        r10 = z14;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var = androidx.compose.ui.a0.E;
                    } else {
                        a0Var = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        z14 = true;
                        h2VarN = N(i2.Closed, null, null, c0VarR, 6, 6);
                        i21 = i20 & (-897);
                    } else {
                        z14 = true;
                        h2VarN = h2Var2;
                        i21 = i20;
                    }
                    if (i13 != 0) {
                        z11 = z14 ? 1 : 0;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i21 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i21 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i21 >> 18) & 14);
                        i21 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        i21 &= -234881025;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        h2Var4 = h2VarN;
                        z15 = z11;
                        r10 = z14;
                    } else {
                        jD2 = j12;
                        h2Var4 = h2VarN;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        z15 = z11;
                        j16 = jB;
                        j17 = jD;
                        r10 = z14;
                    }
                }
                androidx.compose.ui.a0 a0Var5 = a0Var;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1403479060, i21, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:588)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var5, 0.0f, r10, null), null, false, androidx.compose.runtime.internal.w.e(468886998, r10, new a(z15, h2Var4, function2, jD2, (kotlinx.coroutines.s0) objI0, q3Var4, j16, j17, f13, nVar2), c0VarR, 54), c0VarR, 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var5;
                z13 = z15;
                h2Var3 = h2Var4;
                j15 = jD2;
                q3Var3 = q3Var4;
                j13 = j16;
                j14 = j17;
                f12 = f13;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                j13 = j10;
                h2Var3 = h2Var2;
                boolean z18 = z11 ? 1 : 0;
                z13 = z11 ? 1 : 0;
                q3Var3 = q3Var2;
                f12 = f11;
                j14 = j11;
                j15 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.i6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v6.v(nVar, a0Var2, h2Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 805306368;
        i20 = i17;
        if ((306783379 & i20) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i20 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var = androidx.compose.ui.a0.E;
                } else {
                    a0Var = a0Var;
                }
                if ((i11 & 4) != 0) {
                    z14 = true;
                    h2VarN = N(i2.Closed, null, null, c0VarR, 6, 6);
                    i21 = i20 & (-897);
                } else {
                    z14 = true;
                    h2VarN = h2Var2;
                    i21 = i20;
                }
                if (i13 != 0) {
                    z11 = z14 ? 1 : 0;
                }
                if ((i11 & 16) != 0) {
                    q3VarE = a6.f21970a.e(c0VarR, 6);
                    i21 &= -57345;
                } else {
                    q3VarE = q3Var2;
                }
                if (i15 != 0) {
                    fC = a6.f21970a.c();
                } else {
                    fC = f11;
                }
                if ((i11 & 64) != 0) {
                    jB = a6.f21970a.b(c0VarR, 6);
                    i21 &= -3670017;
                } else {
                    jB = j10;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jB, c0VarR, (i21 >> 18) & 14);
                    i21 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    i21 &= -234881025;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    jD2 = a6.f21970a.d(c0VarR, 6);
                    h2Var4 = h2VarN;
                    z15 = z11;
                    r10 = z14;
                } else {
                    jD2 = j12;
                    h2Var4 = h2VarN;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    z15 = z11;
                    j16 = jB;
                    j17 = jD;
                    r10 = z14;
                }
            } else {
                if (i18 != 0) {
                    a0Var = androidx.compose.ui.a0.E;
                } else {
                    a0Var = a0Var;
                }
                if ((i11 & 4) != 0) {
                    z14 = true;
                    h2VarN = N(i2.Closed, null, null, c0VarR, 6, 6);
                    i21 = i20 & (-897);
                } else {
                    z14 = true;
                    h2VarN = h2Var2;
                    i21 = i20;
                }
                if (i13 != 0) {
                    z11 = z14 ? 1 : 0;
                }
                if ((i11 & 16) != 0) {
                    q3VarE = a6.f21970a.e(c0VarR, 6);
                    i21 &= -57345;
                } else {
                    q3VarE = q3Var2;
                }
                if (i15 != 0) {
                    fC = a6.f21970a.c();
                } else {
                    fC = f11;
                }
                if ((i11 & 64) != 0) {
                    jB = a6.f21970a.b(c0VarR, 6);
                    i21 &= -3670017;
                } else {
                    jB = j10;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jB, c0VarR, (i21 >> 18) & 14);
                    i21 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    i21 &= -234881025;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    jD2 = a6.f21970a.d(c0VarR, 6);
                    h2Var4 = h2VarN;
                    z15 = z11;
                    r10 = z14;
                } else {
                    jD2 = j12;
                    h2Var4 = h2VarN;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    z15 = z11;
                    j16 = jB;
                    j17 = jD;
                    r10 = z14;
                }
            }
            androidx.compose.ui.a0 a0Var6 = a0Var;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1403479060, i21, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:588)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var6, 0.0f, r10, null), null, false, androidx.compose.runtime.internal.w.e(468886998, r10, new a(z15, h2Var4, function2, jD2, (kotlinx.coroutines.s0) objI0, q3Var4, j16, j17, f13, nVar2), c0VarR, 54), c0VarR, 3072, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var6;
            z13 = z15;
            h2Var3 = h2Var4;
            j15 = jD2;
            q3Var3 = q3Var4;
            j13 = j16;
            j14 = j17;
            f12 = f13;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            j13 = j10;
            h2Var3 = h2Var2;
            boolean z19 = z11 ? 1 : 0;
            z13 = z11 ? 1 : 0;
            q3Var3 = q3Var2;
            f12 = f11;
            j14 = j11;
            j15 = j12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.i6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v6.v(nVar, a0Var2, h2Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void p(final long j10, final Function0<Unit> function0, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-513067266);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.L(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-513067266, i11, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:725)");
            }
            if (j10 != 16) {
                c0VarR.E(1001834356);
                int i12 = i11;
                final androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, new androidx.compose.animation.core.y3(0, 0, null, 7, null), 0.0f, null, null, c0VarR, 48, 28);
                final String strA = ug.a(tg.f25008b.a(), c0VarR, 6);
                if (z10) {
                    c0VarR.E(1002054704);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    int i13 = i12 & com.planner5d.library.engine.input.f.b.B;
                    boolean z11 = i13 == 32;
                    Object objI0 = c0VarR.i0();
                    if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new b(function0);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarE2 = androidx.compose.ui.input.pointer.w0.e(aVar, function0, (PointerInputEventHandler) objI0);
                    boolean zD = (i13 == 32) | c0VarR.D(strA);
                    Object objI1 = c0VarR.i0();
                    if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material.m6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return v6.r(strA, function0, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0VarE2, true, (Function1) objI1);
                    c0VarR.A();
                } else {
                    c0VarR.E(1002419388);
                    c0VarR.A();
                    a0VarE = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null).B2(a0VarE);
                boolean zD2 = c0VarR.D(n7VarF) | ((i12 & 14) == 4);
                Object objI2 = c0VarR.i0();
                if (zD2 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new Function1() { // from class: androidx.compose.material.n6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return v6.t(j10, n7VarF, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI2, c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(1002587780);
                c0VarR.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.o6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v6.u(j10, function0, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float q(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(String str, final Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material.e6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(v6.s(function0));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(long j10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, 0L, 0L, q(n7Var), null, null, 0, 118, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(long j10, Function0 function0, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        p(j10, function0, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(pj.n nVar, androidx.compose.ui.a0 a0Var, h2 h2Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, long j12, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(nVar, a0Var, h2Var, z10, q3Var, f10, j10, j11, j12, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.input.nestedscroll.a w(u<?> uVar) {
        return new c(uVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:103:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0121  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x013c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0145  */
    /* JADX WARN: Code duplicated, block: B:118:0x0159  */
    /* JADX WARN: Code duplicated, block: B:137:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0193  */
    /* JADX WARN: Code duplicated, block: B:139:0x0196  */
    /* JADX WARN: Code duplicated, block: B:142:0x019d  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:148:0x01af  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:165:0x0201  */
    /* JADX WARN: Code duplicated, block: B:168:0x020d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0222  */
    /* JADX WARN: Code duplicated, block: B:174:0x026e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0285  */
    /* JADX WARN: Code duplicated, block: B:179:0x029c  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void x(@NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable k7 k7Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, long j12, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        k7 k7Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3Var2;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final k7 k7Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final float f12;
        final long j13;
        final long j14;
        final long j15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        k7 k7VarQ;
        androidx.compose.ui.graphics.q3 q3VarE;
        float fC;
        long jB;
        long jD;
        long jD2;
        k7 k7Var4;
        androidx.compose.ui.graphics.q3 q3Var4;
        float f13;
        long j16;
        long j17;
        boolean z14;
        Object objI0;
        int i19;
        int i20;
        int i21;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1979404999);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    k7Var2 = k7Var;
                    int i23 = c0VarR.D(k7Var2) ? 256 : 128;
                    i12 |= i23;
                } else {
                    k7Var2 = k7Var;
                }
                i12 |= i23;
            } else {
                k7Var2 = k7Var;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3Var2 = q3Var;
                        int i24 = c0VarR.D(q3Var2) ? 16384 : 8192;
                        i12 |= i24;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        f11 = f10;
                        if (c0VarR.I(f11)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            i21 = i12;
                            int i25 = c0VarR.L(j10) ? 1048576 : 524288;
                            i17 = i21 | i25;
                        } else {
                            i21 = i12;
                        }
                        i17 = i21 | i25;
                    } else {
                        i17 = i12;
                    }
                    if ((i10 & 12582912) != 0) {
                        if ((i11 & 128) == 0 || !c0VarR.L(j11)) {
                            i20 = 4194304;
                        } else {
                            i20 = 8388608;
                        }
                        i17 |= i20;
                    }
                    if ((100663296 & i10) != 0) {
                        if ((i11 & 256) == 0 || !c0VarR.L(j12)) {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        } else {
                            i19 = 67108864;
                        }
                        i17 |= i19;
                    }
                    if ((i11 & 512) != 0) {
                        if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(function2)) {
                                i18 = 536870912;
                            } else {
                                i18 = 268435456;
                            }
                            i17 |= i18;
                        }
                        if ((306783379 & i17) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i17 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i22 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if ((i11 & 4) != 0) {
                                    k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                    i17 &= -897;
                                } else {
                                    k7VarQ = k7Var2;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    q3VarE = a6.f21970a.e(c0VarR, 6);
                                    i17 &= -57345;
                                } else {
                                    q3VarE = q3Var2;
                                }
                                if (i15 != 0) {
                                    fC = a6.f21970a.c();
                                } else {
                                    fC = f11;
                                }
                                if ((i11 & 64) != 0) {
                                    jB = a6.f21970a.b(c0VarR, 6);
                                    i17 &= -3670017;
                                } else {
                                    jB = j10;
                                }
                                if ((i11 & 128) != 0) {
                                    jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                    i17 &= -29360129;
                                } else {
                                    jD = j11;
                                }
                                if ((i11 & 256) != 0) {
                                    jD2 = a6.f21970a.d(c0VarR, 6);
                                    i17 &= -234881025;
                                } else {
                                    jD2 = j12;
                                }
                                k7Var4 = k7VarQ;
                                q3Var4 = q3VarE;
                                f13 = fC;
                                j16 = jB;
                                j17 = jD;
                                z14 = z11;
                            } else {
                                c0VarR.u();
                                if ((i11 & 4) != 0) {
                                    i17 &= -897;
                                }
                                if ((i11 & 16) != 0) {
                                    i17 &= -57345;
                                }
                                if ((i11 & 64) != 0) {
                                    i17 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i17 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    i17 &= -234881025;
                                }
                                j16 = j10;
                                j17 = j11;
                                jD2 = j12;
                                a0Var4 = a0Var2;
                                k7Var4 = k7Var2;
                                z14 = z11;
                                q3Var4 = q3Var2;
                                f13 = f11;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            k7Var3 = k7Var4;
                            z13 = z14;
                            j15 = jD2;
                            q3Var3 = q3Var4;
                            j13 = j16;
                            j14 = j17;
                            f12 = f13;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            k7Var3 = k7Var2;
                            z13 = z11;
                            q3Var3 = q3Var2;
                            f12 = f11;
                            j13 = j10;
                            j14 = j11;
                            j15 = j12;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i17 |= 805306368;
                    if ((306783379 & i17) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i17 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        k7Var3 = k7Var4;
                        z13 = z14;
                        j15 = jD2;
                        q3Var3 = q3Var4;
                        j13 = j16;
                        j14 = j17;
                        f12 = f13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        k7Var3 = k7Var2;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        f12 = f11;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                f11 = f10;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i21 = i12;
                        if (c0VarR.L(j10)) {
                        }
                        i17 = i21 | i25;
                    } else {
                        i21 = i12;
                    }
                    i17 = i21 | i25;
                } else {
                    i17 = i12;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i20 = 4194304;
                    } else {
                        i20 = 4194304;
                    }
                    i17 |= i20;
                }
                if ((100663296 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i17 |= i19;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i17 |= i18;
                    }
                    if ((306783379 & i17) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i17 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        k7Var3 = k7Var4;
                        z13 = z14;
                        j15 = jD2;
                        q3Var3 = q3Var4;
                        j13 = j16;
                        j14 = j17;
                        f12 = f13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        k7Var3 = k7Var2;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        f12 = f11;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 805306368;
                if ((306783379 & i17) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    k7Var3 = k7Var4;
                    z13 = z14;
                    j15 = jD2;
                    q3Var3 = q3Var4;
                    j13 = j16;
                    j14 = j17;
                    f12 = f13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    k7Var3 = k7Var2;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    f12 = f11;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i21 = i12;
                        if (c0VarR.L(j10)) {
                        }
                        i17 = i21 | i25;
                    } else {
                        i21 = i12;
                    }
                    i17 = i21 | i25;
                } else {
                    i17 = i12;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i20 = 4194304;
                    } else {
                        i20 = 4194304;
                    }
                    i17 |= i20;
                }
                if ((100663296 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i17 |= i19;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i17 |= i18;
                    }
                    if ((306783379 & i17) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i17 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        k7Var3 = k7Var4;
                        z13 = z14;
                        j15 = jD2;
                        q3Var3 = q3Var4;
                        j13 = j16;
                        j14 = j17;
                        f12 = f13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        k7Var3 = k7Var2;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        f12 = f11;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 805306368;
                if ((306783379 & i17) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    k7Var3 = k7Var4;
                    z13 = z14;
                    j15 = jD2;
                    q3Var3 = q3Var4;
                    j13 = j16;
                    j14 = j17;
                    f12 = f13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    k7Var3 = k7Var2;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    f12 = f11;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            f11 = f10;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i21 = i12;
                    if (c0VarR.L(j10)) {
                    }
                    i17 = i21 | i25;
                } else {
                    i21 = i12;
                }
                i17 = i21 | i25;
            } else {
                i17 = i12;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i17 |= i20;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i17 |= i19;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i17 |= i18;
                }
                if ((306783379 & i17) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    k7Var3 = k7Var4;
                    z13 = z14;
                    j15 = jD2;
                    q3Var3 = q3Var4;
                    j13 = j16;
                    j14 = j17;
                    f12 = f13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    k7Var3 = k7Var2;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    f12 = f11;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 805306368;
            if ((306783379 & i17) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                k7Var3 = k7Var4;
                z13 = z14;
                j15 = jD2;
                q3Var3 = q3Var4;
                j13 = j16;
                j14 = j17;
                f12 = f13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                k7Var3 = k7Var2;
                z13 = z11;
                q3Var3 = q3Var2;
                f12 = f11;
                j13 = j10;
                j14 = j11;
                j15 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                k7Var2 = k7Var;
                if (c0VarR.D(k7Var2)) {
                }
                i12 |= i23;
            } else {
                k7Var2 = k7Var;
            }
            i12 |= i23;
        } else {
            k7Var2 = k7Var;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i24;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        i21 = i12;
                        if (c0VarR.L(j10)) {
                        }
                        i17 = i21 | i25;
                    } else {
                        i21 = i12;
                    }
                    i17 = i21 | i25;
                } else {
                    i17 = i12;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i20 = 4194304;
                    } else {
                        i20 = 4194304;
                    }
                    i17 |= i20;
                }
                if ((100663296 & i10) != 0) {
                    if ((i11 & 256) == 0) {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i17 |= i19;
                }
                if ((i11 & 512) != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i18 = 536870912;
                        } else {
                            i18 = 268435456;
                        }
                        i17 |= i18;
                    }
                    if ((306783379 & i17) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i17 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i11 & 4) != 0) {
                                k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                                i17 &= -897;
                            } else {
                                k7VarQ = k7Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 16) != 0) {
                                q3VarE = a6.f21970a.e(c0VarR, 6);
                                i17 &= -57345;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i15 != 0) {
                                fC = a6.f21970a.c();
                            } else {
                                fC = f11;
                            }
                            if ((i11 & 64) != 0) {
                                jB = a6.f21970a.b(c0VarR, 6);
                                i17 &= -3670017;
                            } else {
                                jB = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                jD2 = a6.f21970a.d(c0VarR, 6);
                                i17 &= -234881025;
                            } else {
                                jD2 = j12;
                            }
                            k7Var4 = k7VarQ;
                            q3Var4 = q3VarE;
                            f13 = fC;
                            j16 = jB;
                            j17 = jD;
                            z14 = z11;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        k7Var3 = k7Var4;
                        z13 = z14;
                        j15 = jD2;
                        q3Var3 = q3Var4;
                        j13 = j16;
                        j14 = j17;
                        f12 = f13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        k7Var3 = k7Var2;
                        z13 = z11;
                        q3Var3 = q3Var2;
                        f12 = f11;
                        j13 = j10;
                        j14 = j11;
                        j15 = j12;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i17 |= 805306368;
                if ((306783379 & i17) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    k7Var3 = k7Var4;
                    z13 = z14;
                    j15 = jD2;
                    q3Var3 = q3Var4;
                    j13 = j16;
                    j14 = j17;
                    f12 = f13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    k7Var3 = k7Var2;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    f12 = f11;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            f11 = f10;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i21 = i12;
                    if (c0VarR.L(j10)) {
                    }
                    i17 = i21 | i25;
                } else {
                    i21 = i12;
                }
                i17 = i21 | i25;
            } else {
                i17 = i12;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i17 |= i20;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i17 |= i19;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i17 |= i18;
                }
                if ((306783379 & i17) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    k7Var3 = k7Var4;
                    z13 = z14;
                    j15 = jD2;
                    q3Var3 = q3Var4;
                    j13 = j16;
                    j14 = j17;
                    f12 = f13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    k7Var3 = k7Var2;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    f12 = f11;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 805306368;
            if ((306783379 & i17) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                k7Var3 = k7Var4;
                z13 = z14;
                j15 = jD2;
                q3Var3 = q3Var4;
                j13 = j16;
                j14 = j17;
                f12 = f13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                k7Var3 = k7Var2;
                z13 = z11;
                q3Var3 = q3Var2;
                f12 = f11;
                j13 = j10;
                j14 = j11;
                j15 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i24;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i24;
        } else {
            q3Var2 = q3Var;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    i21 = i12;
                    if (c0VarR.L(j10)) {
                    }
                    i17 = i21 | i25;
                } else {
                    i21 = i12;
                }
                i17 = i21 | i25;
            } else {
                i17 = i12;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i20 = 4194304;
                } else {
                    i20 = 4194304;
                }
                i17 |= i20;
            }
            if ((100663296 & i10) != 0) {
                if ((i11 & 256) == 0) {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i17 |= i19;
            }
            if ((i11 & 512) != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i17 |= i18;
                }
                if ((306783379 & i17) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i17 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                            i17 &= -897;
                        } else {
                            k7VarQ = k7Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 16) != 0) {
                            q3VarE = a6.f21970a.e(c0VarR, 6);
                            i17 &= -57345;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i15 != 0) {
                            fC = a6.f21970a.c();
                        } else {
                            fC = f11;
                        }
                        if ((i11 & 64) != 0) {
                            jB = a6.f21970a.b(c0VarR, 6);
                            i17 &= -3670017;
                        } else {
                            jB = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            jD2 = a6.f21970a.d(c0VarR, 6);
                            i17 &= -234881025;
                        } else {
                            jD2 = j12;
                        }
                        k7Var4 = k7VarQ;
                        q3Var4 = q3VarE;
                        f13 = fC;
                        j16 = jB;
                        j17 = jD;
                        z14 = z11;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    k7Var3 = k7Var4;
                    z13 = z14;
                    j15 = jD2;
                    q3Var3 = q3Var4;
                    j13 = j16;
                    j14 = j17;
                    f12 = f13;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    k7Var3 = k7Var2;
                    z13 = z11;
                    q3Var3 = q3Var2;
                    f12 = f11;
                    j13 = j10;
                    j14 = j11;
                    j15 = j12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 805306368;
            if ((306783379 & i17) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                k7Var3 = k7Var4;
                z13 = z14;
                j15 = jD2;
                q3Var3 = q3Var4;
                j13 = j16;
                j14 = j17;
                f12 = f13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                k7Var3 = k7Var2;
                z13 = z11;
                q3Var3 = q3Var2;
                f12 = f11;
                j13 = j10;
                j14 = j11;
                j15 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        f11 = f10;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                i21 = i12;
                if (c0VarR.L(j10)) {
                }
                i17 = i21 | i25;
            } else {
                i21 = i12;
            }
            i17 = i21 | i25;
        } else {
            i17 = i12;
        }
        if ((i10 & 12582912) != 0) {
            if ((i11 & 128) == 0) {
                i20 = 4194304;
            } else {
                i20 = 4194304;
            }
            i17 |= i20;
        }
        if ((100663296 & i10) != 0) {
            if ((i11 & 256) == 0) {
                i19 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i19 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i17 |= i19;
        }
        if ((i11 & 512) != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function2)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i17 |= i18;
            }
            if ((306783379 & i17) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                        i17 &= -897;
                    } else {
                        k7VarQ = k7Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarE = a6.f21970a.e(c0VarR, 6);
                        i17 &= -57345;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i15 != 0) {
                        fC = a6.f21970a.c();
                    } else {
                        fC = f11;
                    }
                    if ((i11 & 64) != 0) {
                        jB = a6.f21970a.b(c0VarR, 6);
                        i17 &= -3670017;
                    } else {
                        jB = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        jD2 = a6.f21970a.d(c0VarR, 6);
                        i17 &= -234881025;
                    } else {
                        jD2 = j12;
                    }
                    k7Var4 = k7VarQ;
                    q3Var4 = q3VarE;
                    f13 = fC;
                    j16 = jB;
                    j17 = jD;
                    z14 = z11;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                k7Var3 = k7Var4;
                z13 = z14;
                j15 = jD2;
                q3Var3 = q3Var4;
                j13 = j16;
                j14 = j17;
                f12 = f13;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                k7Var3 = k7Var2;
                z13 = z11;
                q3Var3 = q3Var2;
                f12 = f11;
                j13 = j10;
                j14 = j11;
                j15 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 805306368;
        if ((306783379 & i17) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i17 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                    i17 &= -897;
                } else {
                    k7VarQ = k7Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    q3VarE = a6.f21970a.e(c0VarR, 6);
                    i17 &= -57345;
                } else {
                    q3VarE = q3Var2;
                }
                if (i15 != 0) {
                    fC = a6.f21970a.c();
                } else {
                    fC = f11;
                }
                if ((i11 & 64) != 0) {
                    jB = a6.f21970a.b(c0VarR, 6);
                    i17 &= -3670017;
                } else {
                    jB = j10;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    jD2 = a6.f21970a.d(c0VarR, 6);
                    i17 &= -234881025;
                } else {
                    jD2 = j12;
                }
                k7Var4 = k7VarQ;
                q3Var4 = q3VarE;
                f13 = fC;
                j16 = jB;
                j17 = jD;
                z14 = z11;
            } else {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    k7VarQ = Q(l7.Closed, null, c0VarR, 6, 2);
                    i17 &= -897;
                } else {
                    k7VarQ = k7Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    q3VarE = a6.f21970a.e(c0VarR, 6);
                    i17 &= -57345;
                } else {
                    q3VarE = q3Var2;
                }
                if (i15 != 0) {
                    fC = a6.f21970a.c();
                } else {
                    fC = f11;
                }
                if ((i11 & 64) != 0) {
                    jB = a6.f21970a.b(c0VarR, 6);
                    i17 &= -3670017;
                } else {
                    jB = j10;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jB, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    jD2 = a6.f21970a.d(c0VarR, 6);
                    i17 &= -234881025;
                } else {
                    jD2 = j12;
                }
                k7Var4 = k7VarQ;
                q3Var4 = q3VarE;
                f13 = fC;
                j16 = jB;
                j17 = jD;
                z14 = z11;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1979404999, i17, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:461)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.layout.g0.c(androidx.compose.foundation.layout.i6.f(a0Var4, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.w.e(-1549911011, true, new d(k7Var4, z14, (kotlinx.coroutines.s0) objI0, jD2, q3Var4, j16, j17, f13, function2, nVar), c0VarR, 54), c0VarR, 3072, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            k7Var3 = k7Var4;
            z13 = z14;
            j15 = jD2;
            q3Var3 = q3Var4;
            j13 = j16;
            j14 = j17;
            f12 = f13;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            k7Var3 = k7Var2;
            z13 = z11;
            q3Var3 = q3Var2;
            f12 = f11;
            j13 = j10;
            j14 = j11;
            j15 = j12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.b6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v6.y(nVar, a0Var3, k7Var3, z13, q3Var3, f12, j13, j14, j15, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(pj.n nVar, androidx.compose.ui.a0 a0Var, k7 k7Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, long j12, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        x(nVar, a0Var, k7Var, z10, q3Var, f10, j10, j11, j12, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void z(final boolean z10, final Function0<Unit> function0, final Function0<Float> function1, final long j10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1983403750);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(function1) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.L(j10) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1983403750, i11, -1, "androidx.compose.material.Scrim (Drawer.kt:751)");
            }
            final String strA = ug.a(tg.f25008b.a(), c0VarR, 6);
            if (z10) {
                c0VarR.E(1716233810);
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                int i12 = i11 & com.planner5d.library.engine.input.f.b.B;
                boolean z11 = i12 == 32;
                Object objI0 = c0VarR.i0();
                if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new e(function0);
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarE2 = androidx.compose.ui.input.pointer.w0.e(aVar, function0, (PointerInputEventHandler) objI0);
                boolean zD = (i12 == 32) | c0VarR.D(strA);
                Object objI1 = c0VarR.i0();
                if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material.j6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return v6.A(strA, function0, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                a0VarE = androidx.compose.ui.semantics.t.e(a0VarE2, true, (Function1) objI1);
                c0VarR.A();
            } else {
                c0VarR.E(1716557884);
                c0VarR.A();
                a0VarE = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null).B2(a0VarE);
            boolean z12 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objI2 = c0VarR.i0();
            if (z12 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material.k6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return v6.C(j10, function1, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI2, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.l6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return v6.D(z10, function0, function1, j10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
