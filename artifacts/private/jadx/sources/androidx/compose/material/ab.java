package androidx.compose.material;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,590:1\n1282#2,6:591\n1282#2,6:598\n1282#2,3:611\n1285#2,3:615\n1282#2,6:692\n1282#2,6:702\n1282#2,6:708\n1282#2,6:719\n1282#2,6:725\n1282#2,6:731\n75#3:597\n607#4:604\n604#4,6:605\n605#5:614\n70#6:618\n67#6,9:619\n70#6:655\n67#6,9:656\n77#6:701\n77#6:717\n79#7,6:628\n86#7,3:643\n89#7,2:652\n79#7,6:665\n86#7,3:680\n89#7,2:689\n93#7:700\n93#7:716\n347#8,9:634\n356#8:654\n347#8,9:671\n356#8:691\n357#8,2:698\n357#8,2:714\n4206#9,6:646\n4206#9,6:683\n635#10:718\n59#11:737\n59#11:739\n59#11:741\n90#12:738\n90#12:740\n90#12:742\n85#13:743\n113#14:744\n113#14:745\n113#14:746\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt\n*L\n276#1:591,6\n297#1:598,6\n354#1:611,3\n354#1:615,3\n361#1:692,6\n376#1:702,6\n395#1:708,6\n497#1:719,6\n498#1:725,6\n509#1:731,6\n279#1:597\n354#1:604\n354#1:605,6\n354#1:614\n356#1:618\n356#1:619,9\n357#1:655\n357#1:656,9\n357#1:701\n356#1:717\n356#1:628,6\n356#1:643,3\n356#1:652,2\n357#1:665,6\n357#1:680,3\n357#1:689,2\n357#1:700\n356#1:716\n356#1:634,9\n356#1:654\n357#1:671,9\n357#1:691\n357#1:698,2\n356#1:714,2\n356#1:646,6\n357#1:683,6\n491#1:718\n454#1:737\n457#1:739\n458#1:741\n454#1:738\n457#1:740\n458#1:742\n493#1:743\n587#1:744\n588#1:745\n589#1:746\n*E\n"})
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f21995a = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f21996b = androidx.compose.ui.unit.h.r(125);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f21997c = androidx.compose.ui.unit.h.r(640);

    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,590:1\n30#2:591\n53#3,3:592\n60#3:596\n70#3:599\n65#4:595\n69#4:598\n22#5:597\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1\n*L\n575#1:591\n575#1:592,3\n584#1:596\n584#1:599\n584#1:595\n584#1:598\n584#1:597\n*E\n"})
    public static final class a implements androidx.compose.ui.input.nestedscroll.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u<?> f21998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.q3 f21999b;

        /* JADX INFO: renamed from: androidx.compose.material.ab$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", i = {0}, l = {570}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
        static final class C0168a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f22000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f22001b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f22003d;

            C0168a(kotlin.coroutines.d<? super C0168a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f22001b = obj;
                this.f22003d |= Integer.MIN_VALUE;
                return a.this.B0(0L, 0L, this);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", f = "ModalBottomSheet.kt", i = {0}, l = {com.google.android.vending.licensing.k.f115073b}, m = "onPreFling-QWom1Mo", n = {"available"}, s = {"J$0"})
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            long f22004a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f22005b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f22007d;

            b(kotlin.coroutines.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f22005b = obj;
                this.f22007d |= Integer.MIN_VALUE;
                return a.this.a4(0L, this);
            }
        }

        a(u<?> uVar, androidx.compose.foundation.gestures.q3 q3Var) {
            this.f21998a = uVar;
            this.f21999b = q3Var;
        }

        @oj.i(name = "offsetToFloat")
        private final float a(long j10) {
            return Float.intBitsToFloat((int) (this.f21999b == androidx.compose.foundation.gestures.q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
        }

        private final long b(float f10) {
            androidx.compose.foundation.gestures.q3 q3Var = this.f21999b;
            float f11 = q3Var == androidx.compose.foundation.gestures.q3.Horizontal ? f10 : 0.0f;
            if (q3Var != androidx.compose.foundation.gestures.q3.Vertical) {
                f10 = 0.0f;
            }
            return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(f11)) << 32));
        }

        @oj.i(name = "velocityToFloat")
        private final float c(long j10) {
            return this.f21999b == androidx.compose.foundation.gestures.q3.Horizontal ? androidx.compose.ui.unit.c0.l(j10) : androidx.compose.ui.unit.c0.n(j10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object B0(long j10, long j11, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            C0168a c0168a;
            if (dVar instanceof C0168a) {
                c0168a = (C0168a) dVar;
                int i10 = c0168a.f22003d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0168a.f22003d = i10 - Integer.MIN_VALUE;
                } else {
                    c0168a = new C0168a(dVar);
                }
            } else {
                c0168a = new C0168a(dVar);
            }
            Object obj = c0168a.f22001b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c0168a.f22003d;
            if (i11 == 0) {
                ResultKt.m(obj);
                u<?> uVar = this.f21998a;
                float fC = c(j11);
                c0168a.f22000a = j11;
                c0168a.f22003d = 1;
                if (uVar.Q(fC, c0168a) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = c0168a.f22000a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j11);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long G7(long j10, int i10) {
            float fA = a(j10);
            return (fA >= 0.0f || !androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) ? n0.g.f332700b.e() : b(this.f21998a.t(fA));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // androidx.compose.ui.input.nestedscroll.a
        public Object a4(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            b bVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i10 = bVar.f22007d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar.f22007d = i10 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f22005b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = bVar.f22007d;
            if (i11 == 0) {
                ResultKt.m(obj);
                float fC = c(j10);
                float fK = this.f21998a.K();
                if (fC >= 0.0f || fK <= this.f21998a.u().e()) {
                    j10 = androidx.compose.ui.unit.c0.f42681b.a();
                } else {
                    u<?> uVar = this.f21998a;
                    bVar.f22004a = j10;
                    bVar.f22007d = 1;
                    if (uVar.Q(fC, bVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = bVar.f22004a;
                ResultKt.m(obj);
            }
            return androidx.compose.ui.unit.c0.b(j10);
        }

        @Override // androidx.compose.ui.input.nestedscroll.a
        public long b2(long j10, long j11, int i10) {
            return androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) ? b(this.f21998a.t(a(j11))) : n0.g.f332700b.e();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ hb f22009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(hb hbVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f22009b = hbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f22009b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22008a;
            if (i10 == 0) {
                ResultKt.m(obj);
                hb hbVar = this.f22009b;
                this.f22008a = 1;
                if (hbVar.r(this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ hb f22011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(hb hbVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f22011b = hbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f22011b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22010a;
            if (i10 == 0) {
                ResultKt.m(obj);
                hb hbVar = this.f22011b;
                this.f22010a = 1;
                if (hbVar.r(this) == objL) {
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
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {414}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ hb f22013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(hb hbVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f22013b = hbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f22013b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22012a;
            if (i10 == 0) {
                ResultKt.m(obj);
                hb hbVar = this.f22013b;
                this.f22012a = 1;
                if (hbVar.i(this) == objL) {
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
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44022w}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ hb f22015b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(hb hbVar, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f22015b = hbVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f22015b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f22014a;
            if (i10 == 0) {
                ResultKt.m(obj);
                hb hbVar = this.f22015b;
                this.f22014a = 1;
                if (hbVar.q(this) == objL) {
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
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,590:1\n87#2:591\n83#2,10:592\n94#2:632\n79#3,6:602\n86#3,3:617\n89#3,2:626\n93#3:631\n347#4,9:608\n356#4,3:628\n4206#5,6:620\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$ModalBottomSheetLayout$1$4\n*L\n439#1:591\n439#1:592,10\n439#1:632\n439#1:602,6\n439#1:617,3\n439#1:626,2\n439#1:631\n439#1:608,9\n439#1:628,3\n439#1:620,6\n*E\n"})
    static final class f implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f22016a;

        /* JADX WARN: Multi-variable type inference failed */
        f(pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f22016a = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1557535116, i10, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
            }
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f22016a;
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

    static final class g implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22017a;

        g(Function0<Unit> function0) {
            this.f22017a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function0 function0, n0.g gVar) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final Function0<Unit> function0 = this.f22017a;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.material.bb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ab.g.b(function0, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22018a;

        static {
            int[] iArr = new int[ib.values().length];
            try {
                iArr[ib.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ib.HalfExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ib.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22018a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(long j10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, 0L, 0L, kotlin.ranges.r.H(x(n7Var), 0.0f, 1.0f), null, null, 0, 118, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(long j10, Function0 function0, boolean z10, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        w(j10, function0, z10, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 E(androidx.compose.ui.a0 a0Var, final hb hbVar) {
        return k.h(a0Var, hbVar.j(), androidx.compose.foundation.gestures.q3.Vertical, new Function2() { // from class: androidx.compose.material.na
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ab.F(hbVar, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair F(final hb hbVar, final androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
        final float fO = androidx.compose.ui.unit.b.o(bVar.x());
        w5 w5VarA = k.a(new Function1() { // from class: androidx.compose.material.ua
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ab.G(fO, hbVar, uVar, (x5) obj);
            }
        });
        boolean z10 = hbVar.j().u().getSize() > 0;
        ib ibVarL = hbVar.l();
        if (z10 || !w5VarA.d(ibVarL)) {
            int i10 = h.f22018a[hbVar.p().ordinal()];
            if (i10 == 1) {
                ibVarL = ib.Hidden;
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new kotlin.k0();
                }
                ib ibVar = ib.HalfExpanded;
                if (!w5VarA.d(ibVar)) {
                    ibVar = ib.Expanded;
                    if (!w5VarA.d(ibVar)) {
                        ibVar = ib.Hidden;
                    }
                }
                ibVarL = ibVar;
            }
        }
        return TuplesKt.to(w5VarA, ibVarL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(float f10, hb hbVar, androidx.compose.ui.unit.u uVar, x5 x5Var) {
        x5Var.a(ib.Hidden, f10);
        float f11 = f10 / 2.0f;
        if (!hbVar.s() && ((int) (uVar.q() & com.rabbitmq.client.k0.f265952a)) > f11) {
            x5Var.a(ib.HalfExpanded, f11);
        }
        if (((int) (uVar.q() & com.rabbitmq.client.k0.f265952a)) != 0) {
            x5Var.a(ib.Expanded, Math.max(0.0f, f10 - ((int) (uVar.q() & com.rabbitmq.client.k0.f265952a))));
        }
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final hb H(@NotNull final ib ibVar, @Nullable androidx.compose.animation.core.o<Float> oVar, @Nullable Function1<? super ib, Boolean> function1, boolean z10, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = la.f23669a.a();
        }
        final androidx.compose.animation.core.o<Float> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.va
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ab.I((ib) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        final Function1<? super ib, Boolean> function2 = function1;
        final boolean z11 = (i11 & 8) != 0 ? false : z10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-126412120, i10, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        final androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) c0Var.W(androidx.compose.ui.platform.q1.m());
        c0Var.m0(-1222943993, ibVar);
        Object[] objArr = {ibVar, oVar2, Boolean.valueOf(z11), function2, dVar};
        androidx.compose.runtime.saveable.c0<hb, ?> c0VarC = hb.f23030d.c(oVar2, function2, z11, dVar);
        boolean z12 = true;
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.K(ibVar.ordinal())) || (i10 & 6) == 4) | c0Var.D(dVar) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(function2)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var.k0(oVar2);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c0Var.G(z11)) && (i10 & 3072) != 2048) {
            z12 = false;
        }
        boolean z13 = zD | z12;
        Object objI1 = c0Var.i0();
        if (z13 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
            Object obj = new Function0() { // from class: androidx.compose.material.wa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ab.J(ibVar, dVar, function2, oVar2, z11);
                }
            };
            c0Var.Y(obj);
            objI1 = obj;
        }
        hb hbVar = (hb) androidx.compose.runtime.saveable.i.j(objArr, c0VarC, (Function0) objI1, c0Var, 0);
        c0Var.v0();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return hbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I(ib ibVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hb J(ib ibVar, androidx.compose.ui.unit.d dVar, Function1 function1, androidx.compose.animation.core.o oVar, boolean z10) {
        return new hb(ibVar, dVar, function1, oVar, z10);
    }

    private static final androidx.compose.ui.input.nestedscroll.a o(u<?> uVar, androidx.compose.foundation.gestures.q3 q3Var) {
        return new a(uVar, q3Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0127  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:114:0x0141  */
    /* JADX WARN: Code duplicated, block: B:140:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x019b  */
    /* JADX WARN: Code duplicated, block: B:142:0x019e  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01be  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:164:0x020a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0210  */
    /* JADX WARN: Code duplicated, block: B:168:0x022c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0243  */
    /* JADX WARN: Code duplicated, block: B:174:0x0255  */
    /* JADX WARN: Code duplicated, block: B:177:0x0288  */
    /* JADX WARN: Code duplicated, block: B:180:0x0294  */
    /* JADX WARN: Code duplicated, block: B:181:0x0298  */
    /* JADX WARN: Code duplicated, block: B:184:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:189:0x0308  */
    /* JADX WARN: Code duplicated, block: B:192:0x0314  */
    /* JADX WARN: Code duplicated, block: B:193:0x0318  */
    /* JADX WARN: Code duplicated, block: B:196:0x0339  */
    /* JADX WARN: Code duplicated, block: B:198:0x0347  */
    /* JADX WARN: Code duplicated, block: B:201:0x0376  */
    /* JADX WARN: Code duplicated, block: B:203:0x037c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0392  */
    /* JADX WARN: Code duplicated, block: B:207:0x0394  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:212:0x03da  */
    /* JADX WARN: Code duplicated, block: B:214:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:216:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:219:0x040f  */
    /* JADX WARN: Code duplicated, block: B:222:0x041b  */
    /* JADX WARN: Code duplicated, block: B:225:0x043d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0452  */
    /* JADX WARN: Code duplicated, block: B:229:0x0458  */
    /* JADX WARN: Code duplicated, block: B:231:0x046d  */
    /* JADX WARN: Code duplicated, block: B:234:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:236:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:239:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
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
    public static final void p(@NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable hb hbVar, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, long j12, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        hb hbVar2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3Var2;
        float f11;
        long j13;
        int i15;
        int i16;
        int i17;
        boolean z12;
        final androidx.compose.ui.a0 a0Var2;
        final hb hbVar3;
        final long j14;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final float f12;
        final long j15;
        final long j16;
        androidx.compose.runtime.s5 s5VarT;
        boolean z14;
        final hb hbVarH;
        androidx.compose.ui.graphics.q3 q3VarC;
        float fB;
        long jN;
        long jD;
        androidx.compose.ui.graphics.q3 q3Var4;
        float f13;
        long j17;
        long j18;
        long jC;
        int i18;
        int i19;
        ?? r10;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final kotlinx.coroutines.s0 s0Var;
        androidx.compose.foundation.gestures.q3 q3Var5;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.ui.a0 a0VarF;
        int iJ2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        boolean zK0;
        Object objI1;
        ib ibVarF;
        ib ibVar;
        boolean z15;
        androidx.compose.ui.a0 a0VarB;
        boolean z16;
        boolean zK1;
        Object objI2;
        boolean zD;
        Object objI3;
        boolean z17;
        int i20;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-336264970);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    hbVar2 = hbVar;
                    int i25 = c0VarR.k0(hbVar2) ? 256 : 128;
                    i12 |= i25;
                } else {
                    hbVar2 = hbVar;
                }
                i12 |= i25;
            } else {
                hbVar2 = hbVar;
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
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f11 = f10;
                    int i26 = c0VarR.I(f11) ? 131072 : 65536;
                    i12 |= i26;
                } else {
                    f11 = f10;
                }
                i12 |= i26;
            } else {
                f11 = f10;
            }
            if ((i10 & 1572864) == 0) {
                j13 = j10;
                if ((i11 & 64) == 0 || !c0VarR.L(j13)) {
                    i22 = 524288;
                } else {
                    i22 = 1048576;
                }
                i12 |= i22;
            } else {
                j13 = j10;
            }
            if ((12582912 & i10) != 0) {
                if ((i11 & 128) == 0 || !c0VarR.L(j11)) {
                    i21 = 4194304;
                } else {
                    i21 = 8388608;
                }
                i12 |= i21;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    i15 = i24;
                    if (c0VarR.L(j12)) {
                        i20 = 67108864;
                    }
                    i12 |= i20;
                } else {
                    i15 = i24;
                }
                i20 = com.google.api.client.googleapis.media.a.f115410j;
                i12 |= i20;
            } else {
                i15 = i24;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function2)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i12 |= i16;
            }
            i17 = i12;
            if ((306783379 & i17) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i17 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i15 != 0) {
                        a0Var = androidx.compose.ui.a0.E;
                    } else {
                        a0Var = a0Var;
                    }
                    if ((i11 & 4) != 0) {
                        z14 = false;
                        hbVarH = H(ib.Hidden, null, null, false, c0VarR, 6, 14);
                        i17 &= -897;
                    } else {
                        z14 = false;
                        hbVarH = hbVar2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 16) != 0) {
                        q3VarC = x9.f25488a.b(c0VarR, 6).c();
                        i17 &= -57345;
                    } else {
                        q3VarC = q3Var2;
                    }
                    if ((i11 & 32) != 0) {
                        fB = la.f23669a.b();
                        i17 &= -458753;
                    } else {
                        fB = f10;
                    }
                    if ((i11 & 64) != 0) {
                        jN = x9.f25488a.a(c0VarR, 6).n();
                        i17 &= -3670017;
                    } else {
                        jN = j13;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jN, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        q3Var4 = q3VarC;
                        f13 = fB;
                        jC = la.f23669a.c(c0VarR, z14 ? 1 : 0);
                        i18 = i17 & (-234881025);
                        j17 = jN;
                        j18 = jD;
                        i19 = -336264970;
                        r10 = z14;
                    } else {
                        q3Var4 = q3VarC;
                        f13 = fB;
                        j17 = jN;
                        j18 = jD;
                        z17 = z14;
                    }
                    androidx.compose.ui.a0 a0Var3 = a0Var;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    q3Var5 = androidx.compose.foundation.gestures.q3.Vertical;
                    androidx.compose.ui.e.a aVar2 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar2.C(), r10);
                    iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    long j19 = jC;
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    function0A = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar3.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar3.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    a0VarF = androidx.compose.ui.a0.E;
                    int i27 = i18;
                    androidx.compose.ui.a0 a0VarF2 = androidx.compose.foundation.layout.i6.f(a0VarF, 0.0f, 1, null);
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar2.C(), false);
                    iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
                    function0A2 = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD2, a1VarK2, aVar3.e());
                    androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar3.g());
                    function2B2 = aVar3.b();
                    if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                        c0VarD2.Y(Integer.valueOf(iJ2));
                        c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                    }
                    androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar3.f());
                    function2.invoke(c0VarR, Integer.valueOf((i27 >> 27) & 14));
                    zK0 = c0VarR.k0(hbVarH) | c0VarR.k0(s0Var);
                    objI1 = c0VarR.i0();
                    if (zK0 || objI1 == aVar.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.material.xa
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ab.u(hbVarH, s0Var);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    Function0 function0 = (Function0) objI1;
                    ibVarF = hbVarH.j().F();
                    ibVar = ib.Hidden;
                    if (ibVarF != ibVar) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    w(j19, function0, z15, c0VarR, (i27 >> 24) & 14);
                    c0VarR.o();
                    androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(d0Var.b(a0VarF, aVar2.y()), 0.0f, f21997c, 1, null), 0.0f, 1, null);
                    if (z11) {
                        c0VarR.E(351375666);
                        zD = c0VarR.D(hbVarH.j());
                        objI3 = c0VarR.i0();
                        if (zD || objI3 == aVar.a()) {
                            objI3 = o(hbVarH.j(), q3Var5);
                            c0VarR.Y(objI3);
                        }
                        a0VarB = androidx.compose.ui.input.nestedscroll.c.b(a0VarF, (androidx.compose.ui.input.nestedscroll.a) objI3, null, 2, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1258275768);
                        c0VarR.A();
                        a0VarB = a0VarF;
                    }
                    androidx.compose.ui.a0 a0VarE = E(a0VarH.B2(a0VarB), hbVarH);
                    u<ib> uVarJ = hbVarH.j();
                    if (z11 || hbVarH.j().y() == ibVar) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    androidx.compose.ui.a0 a0VarE2 = k.e(a0VarE, uVarJ, q3Var5, z16, false, null, false, 56, null);
                    if (z11) {
                        c0VarR.E(352377090);
                        zK1 = c0VarR.k0(hbVarH) | c0VarR.k0(s0Var);
                        objI2 = c0VarR.i0();
                        if (zK1 || objI2 == aVar.a()) {
                            objI2 = new Function1() { // from class: androidx.compose.material.ya
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ab.q(hbVarH, s0Var, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        a0VarF = androidx.compose.ui.semantics.t.f(a0VarF, false, (Function1) objI2, 1, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1258354200);
                        c0VarR.A();
                    }
                    int i28 = i27 >> 12;
                    ah.e(a0VarE2.B2(a0VarF), q3Var4, j17, j18, null, f13, androidx.compose.runtime.internal.w.e(-1557535116, true, new f(nVar), c0VarR, 54), c0VarR, ((i27 >> 9) & com.planner5d.library.engine.input.f.b.B) | 1572864 | (i28 & 896) | (i28 & 7168) | (i27 & 458752), 16);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    hbVar3 = hbVarH;
                    z13 = z11;
                    q3Var3 = q3Var4;
                    j14 = j17;
                    j15 = j18;
                    f12 = f13;
                    j16 = j19;
                    a0Var2 = a0Var3;
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i17 &= -897;
                    }
                    if ((i11 & 16) != 0) {
                        i17 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i17 &= -458753;
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
                    j18 = j11;
                    z17 = false;
                    hbVarH = hbVar2;
                    f13 = f11;
                    j17 = j13;
                    q3Var4 = q3Var2;
                }
                i19 = -336264970;
                jC = j12;
                i18 = i17;
                r10 = z17;
                androidx.compose.ui.a0 a0Var4 = a0Var;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                q3Var5 = androidx.compose.foundation.gestures.q3.Vertical;
                androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(aVar4.C(), r10);
                iJ = androidx.compose.runtime.v.j(c0VarR, r10);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                long j110 = jC;
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var4);
                androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                function0A = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar5.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar5.f());
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                a0VarF = androidx.compose.ui.a0.E;
                int i29 = i18;
                androidx.compose.ui.a0 a0VarF3 = androidx.compose.foundation.layout.i6.f(a0VarF, 0.0f, 1, null);
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(aVar4.C(), false);
                iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
                function0A2 = aVar5.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD2, a1VarK4, aVar5.e());
                androidx.compose.runtime.y7.n(c0VarD2, b1VarK4, aVar5.g());
                function2B2 = aVar5.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iJ2));
                    c0VarD2.f(Integer.valueOf(iJ2), function2B2);
                }
                androidx.compose.runtime.y7.n(c0VarD2, a0VarN4, aVar5.f());
                function2.invoke(c0VarR, Integer.valueOf((i29 >> 27) & 14));
                zK0 = c0VarR.k0(hbVarH) | c0VarR.k0(s0Var);
                objI1 = c0VarR.i0();
                if (zK0) {
                    objI1 = new Function0() { // from class: androidx.compose.material.xa
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ab.u(hbVarH, s0Var);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material.xa
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ab.u(hbVarH, s0Var);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                Function0 function1 = (Function0) objI1;
                ibVarF = hbVarH.j().F();
                ibVar = ib.Hidden;
                if (ibVarF != ibVar) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                w(j110, function1, z15, c0VarR, (i29 >> 24) & 14);
                c0VarR.o();
                androidx.compose.ui.a0 a0VarH2 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(d0Var2.b(a0VarF, aVar4.y()), 0.0f, f21997c, 1, null), 0.0f, 1, null);
                if (z11) {
                    c0VarR.E(351375666);
                    zD = c0VarR.D(hbVarH.j());
                    objI3 = c0VarR.i0();
                    if (zD) {
                        objI3 = o(hbVarH.j(), q3Var5);
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = o(hbVarH.j(), q3Var5);
                        c0VarR.Y(objI3);
                    }
                    a0VarB = androidx.compose.ui.input.nestedscroll.c.b(a0VarF, (androidx.compose.ui.input.nestedscroll.a) objI3, null, 2, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(1258275768);
                    c0VarR.A();
                    a0VarB = a0VarF;
                }
                androidx.compose.ui.a0 a0VarE3 = E(a0VarH2.B2(a0VarB), hbVarH);
                u<ib> uVarJ2 = hbVarH.j();
                if (z11) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                androidx.compose.ui.a0 a0VarE4 = k.e(a0VarE3, uVarJ2, q3Var5, z16, false, null, false, 56, null);
                if (z11) {
                    c0VarR.E(352377090);
                    zK1 = c0VarR.k0(hbVarH) | c0VarR.k0(s0Var);
                    objI2 = c0VarR.i0();
                    if (zK1) {
                        objI2 = new Function1() { // from class: androidx.compose.material.ya
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ab.q(hbVarH, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material.ya
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ab.q(hbVarH, s0Var, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    a0VarF = androidx.compose.ui.semantics.t.f(a0VarF, false, (Function1) objI2, 1, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(1258354200);
                    c0VarR.A();
                }
                int i210 = i29 >> 12;
                ah.e(a0VarE4.B2(a0VarF), q3Var4, j17, j18, null, f13, androidx.compose.runtime.internal.w.e(-1557535116, true, new f(nVar), c0VarR, 54), c0VarR, ((i29 >> 9) & com.planner5d.library.engine.input.f.b.B) | 1572864 | (i210 & 896) | (i210 & 7168) | (i29 & 458752), 16);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                hbVar3 = hbVarH;
                z13 = z11;
                q3Var3 = q3Var4;
                j14 = j17;
                j15 = j18;
                f12 = f13;
                j16 = j110;
                a0Var2 = a0Var4;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                hbVar3 = hbVar2;
                j14 = j13;
                z13 = z11;
                q3Var3 = q3Var2;
                f12 = f10;
                j15 = j11;
                j16 = j12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.za
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ab.v(nVar, a0Var2, hbVar3, z13, q3Var3, f12, j14, j15, j16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                hbVar2 = hbVar;
                if (c0VarR.k0(hbVar2)) {
                }
                i12 |= i25;
            } else {
                hbVar2 = hbVar;
            }
            i12 |= i25;
        } else {
            hbVar2 = hbVar;
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
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                }
                i12 |= i26;
            } else {
                f11 = f10;
            }
            i12 |= i26;
        } else {
            f11 = f10;
        }
        if ((i10 & 1572864) == 0) {
            j13 = j10;
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        } else {
            j13 = j10;
        }
        if ((12582912 & i10) != 0) {
            if ((i11 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        }
        if ((100663296 & i10) == 0) {
            if ((i11 & 256) == 0) {
                i15 = i24;
                if (c0VarR.L(j12)) {
                    i20 = 67108864;
                }
                i12 |= i20;
            } else {
                i15 = i24;
            }
            i20 = com.google.api.client.googleapis.media.a.f115410j;
            i12 |= i20;
        } else {
            i15 = i24;
        }
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c0VarR.k0(function2)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i12 |= i16;
        }
        i17 = i12;
        if ((306783379 & i17) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i17 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    a0Var = androidx.compose.ui.a0.E;
                } else {
                    a0Var = a0Var;
                }
                if ((i11 & 4) != 0) {
                    z14 = false;
                    hbVarH = H(ib.Hidden, null, null, false, c0VarR, 6, 14);
                    i17 &= -897;
                } else {
                    z14 = false;
                    hbVarH = hbVar2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    q3VarC = x9.f25488a.b(c0VarR, 6).c();
                    i17 &= -57345;
                } else {
                    q3VarC = q3Var2;
                }
                if ((i11 & 32) != 0) {
                    fB = la.f23669a.b();
                    i17 &= -458753;
                } else {
                    fB = f10;
                }
                if ((i11 & 64) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i17 &= -3670017;
                } else {
                    jN = j13;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jN, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    q3Var4 = q3VarC;
                    f13 = fB;
                    jC = la.f23669a.c(c0VarR, z14 ? 1 : 0);
                    i18 = i17 & (-234881025);
                    j17 = jN;
                    j18 = jD;
                    i19 = -336264970;
                    r10 = z14;
                } else {
                    q3Var4 = q3VarC;
                    f13 = fB;
                    j17 = jN;
                    j18 = jD;
                    z17 = z14;
                    i19 = -336264970;
                    jC = j12;
                    i18 = i17;
                    r10 = z17;
                }
            } else {
                if (i15 != 0) {
                    a0Var = androidx.compose.ui.a0.E;
                } else {
                    a0Var = a0Var;
                }
                if ((i11 & 4) != 0) {
                    z14 = false;
                    hbVarH = H(ib.Hidden, null, null, false, c0VarR, 6, 14);
                    i17 &= -897;
                } else {
                    z14 = false;
                    hbVarH = hbVar2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 16) != 0) {
                    q3VarC = x9.f25488a.b(c0VarR, 6).c();
                    i17 &= -57345;
                } else {
                    q3VarC = q3Var2;
                }
                if ((i11 & 32) != 0) {
                    fB = la.f23669a.b();
                    i17 &= -458753;
                } else {
                    fB = f10;
                }
                if ((i11 & 64) != 0) {
                    jN = x9.f25488a.a(c0VarR, 6).n();
                    i17 &= -3670017;
                } else {
                    jN = j13;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jN, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    q3Var4 = q3VarC;
                    f13 = fB;
                    jC = la.f23669a.c(c0VarR, z14 ? 1 : 0);
                    i18 = i17 & (-234881025);
                    j17 = jN;
                    j18 = jD;
                    i19 = -336264970;
                    r10 = z14;
                } else {
                    q3Var4 = q3VarC;
                    f13 = fB;
                    j17 = jN;
                    j18 = jD;
                    z17 = z14;
                    i19 = -336264970;
                    jC = j12;
                    i18 = i17;
                    r10 = z17;
                }
            }
            androidx.compose.ui.a0 a0Var5 = a0Var;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            s0Var = (kotlinx.coroutines.s0) objI0;
            q3Var5 = androidx.compose.foundation.gestures.q3.Vertical;
            androidx.compose.ui.e.a aVar6 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(aVar6.C(), r10);
            iJ = androidx.compose.runtime.v.j(c0VarR, r10);
            androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
            long j111 = jC;
            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var5);
            androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
            function0A = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar7.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar7.g());
            function2B = aVar7.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar7.f());
            androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
            a0VarF = androidx.compose.ui.a0.E;
            int i211 = i18;
            androidx.compose.ui.a0 a0VarF4 = androidx.compose.foundation.layout.i6.f(a0VarF, 0.0f, 1, null);
            androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(aVar6.C(), false);
            iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
            function0A2 = aVar7.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK6, aVar7.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK6, aVar7.g());
            function2B2 = aVar7.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN6, aVar7.f());
            function2.invoke(c0VarR, Integer.valueOf((i211 >> 27) & 14));
            zK0 = c0VarR.k0(hbVarH) | c0VarR.k0(s0Var);
            objI1 = c0VarR.i0();
            if (zK0) {
                objI1 = new Function0() { // from class: androidx.compose.material.xa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ab.u(hbVarH, s0Var);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function0() { // from class: androidx.compose.material.xa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ab.u(hbVarH, s0Var);
                    }
                };
                c0VarR.Y(objI1);
            }
            Function0 function3 = (Function0) objI1;
            ibVarF = hbVarH.j().F();
            ibVar = ib.Hidden;
            if (ibVarF != ibVar) {
                z15 = true;
            } else {
                z15 = false;
            }
            w(j111, function3, z15, c0VarR, (i211 >> 24) & 14);
            c0VarR.o();
            androidx.compose.ui.a0 a0VarH3 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(d0Var3.b(a0VarF, aVar6.y()), 0.0f, f21997c, 1, null), 0.0f, 1, null);
            if (z11) {
                c0VarR.E(351375666);
                zD = c0VarR.D(hbVarH.j());
                objI3 = c0VarR.i0();
                if (zD) {
                    objI3 = o(hbVarH.j(), q3Var5);
                    c0VarR.Y(objI3);
                } else {
                    objI3 = o(hbVarH.j(), q3Var5);
                    c0VarR.Y(objI3);
                }
                a0VarB = androidx.compose.ui.input.nestedscroll.c.b(a0VarF, (androidx.compose.ui.input.nestedscroll.a) objI3, null, 2, null);
                c0VarR.A();
            } else {
                c0VarR.E(1258275768);
                c0VarR.A();
                a0VarB = a0VarF;
            }
            androidx.compose.ui.a0 a0VarE5 = E(a0VarH3.B2(a0VarB), hbVarH);
            u<ib> uVarJ3 = hbVarH.j();
            if (z11) {
                z16 = false;
            } else {
                z16 = false;
            }
            androidx.compose.ui.a0 a0VarE6 = k.e(a0VarE5, uVarJ3, q3Var5, z16, false, null, false, 56, null);
            if (z11) {
                c0VarR.E(352377090);
                zK1 = c0VarR.k0(hbVarH) | c0VarR.k0(s0Var);
                objI2 = c0VarR.i0();
                if (zK1) {
                    objI2 = new Function1() { // from class: androidx.compose.material.ya
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ab.q(hbVarH, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material.ya
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ab.q(hbVarH, s0Var, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                a0VarF = androidx.compose.ui.semantics.t.f(a0VarF, false, (Function1) objI2, 1, null);
                c0VarR.A();
            } else {
                c0VarR.E(1258354200);
                c0VarR.A();
            }
            int i212 = i211 >> 12;
            ah.e(a0VarE6.B2(a0VarF), q3Var4, j17, j18, null, f13, androidx.compose.runtime.internal.w.e(-1557535116, true, new f(nVar), c0VarR, 54), c0VarR, ((i211 >> 9) & com.planner5d.library.engine.input.f.b.B) | 1572864 | (i212 & 896) | (i212 & 7168) | (i211 & 458752), 16);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            hbVar3 = hbVarH;
            z13 = z11;
            q3Var3 = q3Var4;
            j14 = j17;
            j15 = j18;
            f12 = f13;
            j16 = j111;
            a0Var2 = a0Var5;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            hbVar3 = hbVar2;
            j14 = j13;
            z13 = z11;
            q3Var3 = q3Var2;
            f12 = f10;
            j15 = j11;
            j16 = j12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.za
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ab.v(nVar, a0Var2, hbVar3, z13, q3Var3, f12, j14, j15, j16, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(final hb hbVar, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
        if (hbVar.t()) {
            androidx.compose.ui.semantics.b0.p(e0Var, null, new Function0() { // from class: androidx.compose.material.oa
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(ab.s(hbVar, s0Var));
                }
            }, 1, null);
            if (hbVar.j().y() == ib.HalfExpanded) {
                androidx.compose.ui.semantics.b0.s(e0Var, null, new Function0() { // from class: androidx.compose.material.pa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(ab.t(hbVar, s0Var));
                    }
                }, 1, null);
            } else if (hbVar.m()) {
                androidx.compose.ui.semantics.b0.h(e0Var, null, new Function0() { // from class: androidx.compose.material.qa
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(ab.r(hbVar, s0Var));
                    }
                }, 1, null);
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(hb hbVar, kotlinx.coroutines.s0 s0Var) {
        if (!hbVar.j().x().invoke(ib.HalfExpanded).booleanValue()) {
            return true;
        }
        kotlinx.coroutines.k.f(s0Var, null, null, new e(hbVar, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(hb hbVar, kotlinx.coroutines.s0 s0Var) {
        if (hbVar.j().x().invoke(ib.Hidden).booleanValue()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new c(hbVar, null), 3, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(hb hbVar, kotlinx.coroutines.s0 s0Var) {
        if (hbVar.j().x().invoke(ib.Expanded).booleanValue()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new d(hbVar, null), 3, null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(hb hbVar, kotlinx.coroutines.s0 s0Var) {
        if (hbVar.j().x().invoke(ib.Hidden).booleanValue()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new b(hbVar, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(pj.n nVar, androidx.compose.ui.a0 a0Var, hb hbVar, boolean z10, androidx.compose.ui.graphics.q3 q3Var, float f10, long j10, long j11, long j12, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        p(nVar, a0Var, hbVar, z10, q3Var, f10, j10, j11, j12, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void w(final long j10, final Function0<Unit> function0, final boolean z10, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-526532668);
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
                androidx.compose.runtime.m0.A0(-526532668, i11, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j10 != 16) {
                c0VarR.E(-714009568);
                int i12 = i11;
                final androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, new androidx.compose.animation.core.y3(0, 0, null, 7, null), 0.0f, null, null, c0VarR, 48, 28);
                final String strA = ug.a(tg.f25008b.b(), c0VarR, 6);
                if (z10) {
                    c0VarR.E(-713791669);
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    int i13 = i12 & com.planner5d.library.engine.input.f.b.B;
                    boolean z11 = i13 == 32;
                    Object objI0 = c0VarR.i0();
                    if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new g(function0);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarE2 = androidx.compose.ui.input.pointer.w0.e(aVar, function0, (PointerInputEventHandler) objI0);
                    boolean zD = (i13 == 32) | c0VarR.D(strA);
                    Object objI1 = c0VarR.i0();
                    if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material.ma
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ab.y(strA, function0, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    a0VarE = androidx.compose.ui.semantics.t.e(a0VarE2, true, (Function1) objI1);
                    c0VarR.A();
                } else {
                    c0VarR.E(-713427946);
                    c0VarR.A();
                    a0VarE = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null).B2(a0VarE);
                boolean zD2 = c0VarR.D(n7VarF) | ((i12 & 14) == 4);
                Object objI2 = c0VarR.i0();
                if (zD2 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new Function1() { // from class: androidx.compose.material.ra
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ab.A(j10, n7VarF, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI2, c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(-713242690);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material.sa
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ab.B(j10, function0, z10, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float x(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(String str, final Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material.ta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ab.z(function0));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(Function0 function0) {
        function0.invoke();
        return true;
    }
}
