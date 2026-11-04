package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 11 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,557:1\n113#2:558\n113#2:609\n113#2:683\n113#2:684\n1282#3,6:559\n1282#3,3:572\n1285#3,3:576\n1282#3,6:579\n1282#3,6:585\n1282#3,6:591\n1282#3,6:597\n1282#3,6:603\n1282#3,6:611\n1282#3,6:617\n1282#3,6:623\n1282#3,6:629\n1282#3,6:635\n1282#3,6:647\n1282#3,6:655\n1282#3,6:661\n1282#3,6:667\n607#4:565\n604#4,6:566\n605#5:575\n186#6:610\n264#6:654\n57#7:641\n61#7:644\n61#7:679\n60#8:642\n70#8:645\n90#8:674\n90#8:676\n90#8:678\n70#8:680\n22#9:643\n22#9:646\n22#9:681\n635#10:653\n59#11:673\n59#11:675\n59#11:677\n85#12:682\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt\n*L\n132#1:558\n231#1:609\n554#1:683\n555#1:684\n145#1:559,6\n150#1:572,3\n150#1:576,3\n151#1:579,6\n162#1:585,6\n168#1:591,6\n173#1:597,6\n213#1:603,6\n285#1:611,6\n295#1:617,6\n332#1:623,6\n334#1:629,6\n339#1:635,6\n501#1:647,6\n526#1:655,6\n527#1:661,6\n538#1:667,6\n150#1:565\n150#1:566,6\n150#1:575\n274#1:610\n523#1:654\n439#1:641\n448#1:644\n341#1:679\n439#1:642\n448#1:645\n302#1:674\n306#1:676\n307#1:678\n341#1:680\n439#1:643\n448#1:646\n341#1:681\n517#1:653\n302#1:673\n306#1:675\n307#1:677\n519#1:682\n*E\n"})
public final class cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f26784a = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f26785b = androidx.compose.ui.unit.h.r(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f26786c = androidx.compose.ui.graphics.a4.a(0.5f, 0.0f);

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, androidx.compose.foundation.layout.v6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26787a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        public final androidx.compose.foundation.layout.v6 c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-511854661);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-511854661, i10, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:134)");
            }
            androidx.compose.foundation.layout.v6 v6VarO = x2.f34346a.o(c0Var, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return v6VarO;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.foundation.layout.v6 invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$1", f = "ModalBottomSheet.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f26789b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f26789b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f26789b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26788a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f26789b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(0.0f);
                this.f26788a = 1;
                if (androidx.compose.animation.core.c.i(cVar, fE, null, null, null, this, 14, null) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$2", f = "ModalBottomSheet.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tx f26791b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(tx txVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f26791b = txVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f26791b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26790a;
            if (i10 == 0) {
                ResultKt.m(obj);
                tx txVar = this.f26791b;
                this.f26790a = 1;
                if (txVar.E(this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3$1$3", f = "ModalBottomSheet.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tx f26793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(tx txVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f26793b = txVar;
            int i10 = 6 ^ 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f26793b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26792a;
            if (i10 == 0) {
                ResultKt.m(obj);
                tx txVar = this.f26793b;
                this.f26792a = 1;
                if (txVar.B(this) == objL) {
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

    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,557:1\n1282#2,6:558\n70#3:564\n67#3,9:565\n77#3:604\n79#4,6:574\n86#4,3:589\n89#4,2:598\n93#4:603\n347#5,9:580\n356#5,3:600\n4206#6,6:592\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$4\n*L\n186#1:558,6\n186#1:564\n186#1:565,9\n186#1:604\n186#1:574,6\n186#1:589,3\n186#1:598,2\n186#1:603\n186#1:580,9\n186#1:600,3\n186#1:592,6\n*E\n"})
    static final class e implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f26794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tx f26796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ll f26797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f26798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f26799f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f26800g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.a0 f26801h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f26802i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f26803j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.q3 f26804k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f26805l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f26806m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f26807n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26808o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, androidx.compose.foundation.layout.v6> f26809s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f26810t;

        /* JADX WARN: Multi-variable type inference failed */
        e(long j10, Function0<Unit> function0, tx txVar, ll llVar, androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, kotlinx.coroutines.s0 s0Var, Function1<? super Float, Unit> function1, androidx.compose.ui.a0 a0Var, float f10, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j11, long j12, float f11, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function3, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f26794a = j10;
            this.f26795b = function0;
            this.f26796c = txVar;
            this.f26797d = llVar;
            this.f26798e = cVar;
            this.f26799f = s0Var;
            this.f26800g = function1;
            this.f26801h = a0Var;
            this.f26802i = f10;
            this.f26803j = z10;
            this.f26804k = q3Var;
            this.f26805l = j11;
            this.f26806m = j12;
            this.f26807n = f11;
            this.f26808o = function2;
            this.f26809s = function3;
            this.f26810t = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.b2(e0Var, true);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1010026864, i10, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:185)");
            }
            androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.layout.u7.c(androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, 1, null));
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.dl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.e.f((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarC, false, (Function1) objI0, 1, null);
            long j10 = this.f26794a;
            Function0<Unit> function0 = this.f26795b;
            tx txVar = this.f26796c;
            ll llVar = this.f26797d;
            androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f26798e;
            kotlinx.coroutines.s0 s0Var = this.f26799f;
            Function1<Float, Unit> function1 = this.f26800g;
            androidx.compose.ui.a0 a0Var = this.f26801h;
            float f10 = this.f26802i;
            boolean z10 = this.f26803j;
            androidx.compose.ui.graphics.q3 q3Var = this.f26804k;
            long j11 = this.f26805l;
            long j12 = this.f26806m;
            float f11 = this.f26807n;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f26808o;
            Function2<androidx.compose.runtime.c0, Integer, androidx.compose.foundation.layout.v6> function3 = this.f26809s;
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f26810t;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            cl.K(j10, function0, txVar.A() != vx.Hidden, llVar.e(), c0Var, 0);
            cl.v(d0Var, cVar, s0Var, function0, function1, a0Var, txVar, f10, z10, q3Var, j11, j12, f11, function2, function3, nVar, c0Var, (androidx.compose.animation.core.c.f12810o << 3) | 6, 0, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5$1", f = "ModalBottomSheet.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tx f26812b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(tx txVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f26812b = txVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f26812b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26811a;
            if (i10 == 0) {
                ResultKt.m(obj);
                tx txVar = this.f26812b;
                this.f26811a = 1;
                if (txVar.L(this) == objL) {
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class g implements Function2<androidx.compose.runtime.c0, Integer, androidx.compose.foundation.layout.v6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f26813a = new g();

        g() {
        }

        @androidx.compose.runtime.o
        public final androidx.compose.foundation.layout.v6 c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(69134487);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(69134487, i10, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:233)");
            }
            androidx.compose.foundation.layout.v6 v6VarO = x2.f34346a.o(c0Var, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return v6VarO;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.foundation.layout.v6 invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {androidx.media2.widget.f.i.f59793p0}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tx f26815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(tx txVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f26815b = txVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new h(this.f26815b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26814a;
            if (i10 == 0) {
                ResultKt.m(obj);
                tx txVar = this.f26815b;
                this.f26814a = 1;
                if (txVar.B(this) == objL) {
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
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tx f26817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f26818c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(tx txVar, float f10, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f26817b = txVar;
            this.f26818c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new i(this.f26817b, this.f26818c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f26816a;
            if (i10 == 0) {
                ResultKt.m(obj);
                tx txVar = this.f26817b;
                float f10 = this.f26818c;
                this.f26816a = 1;
                if (txVar.K(f10, this) == objL) {
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
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class j implements Function2<androidx.compose.runtime.c0, Integer, androidx.compose.foundation.layout.v6> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f26819a = new j();

        j() {
        }

        @androidx.compose.runtime.o
        public final androidx.compose.foundation.layout.v6 c(androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1023699493);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1023699493, i10, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:270)");
            }
            androidx.compose.foundation.layout.v6 v6VarO = x2.f34346a.o(c0Var, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return v6VarO;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.foundation.layout.v6 invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(c0Var, num.intValue());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.s0, Float, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ float f26821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f26822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(Function1<? super Float, Unit> function1, kotlin.coroutines.d<? super k> dVar) {
            super(3, dVar);
            this.f26822c = function1;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.s0 s0Var, Float f10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(s0Var, f10.floatValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26820a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f26822c.invoke(kotlin.coroutines.jvm.internal.b.e(this.f26821b));
            return Unit.f312394a;
        }

        public final Object k(kotlinx.coroutines.s0 s0Var, float f10, kotlin.coroutines.d<? super Unit> dVar) {
            k kVar = new k(this.f26822c, dVar);
            kVar.f26821b = f10;
            return kVar.invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n*L\n1#1,557:1\n1282#2,6:558\n87#3:564\n84#3,9:565\n94#3:607\n79#4,6:574\n86#4,3:589\n89#4,2:598\n93#4:606\n347#5,9:580\n356#5:600\n357#5,2:604\n4206#6,6:592\n192#7:601\n195#7:602\n198#7:603\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7\n*L\n363#1:558,6\n360#1:564\n360#1:565,9\n360#1:607\n360#1:574,6\n360#1:589,3\n360#1:598,2\n360#1:606\n360#1:580,9\n360#1:600\n360#1:604,2\n360#1:592,6\n380#1:601\n381#1:602\n382#1:603\n*E\n"})
    static final class l implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, androidx.compose.foundation.layout.v6> f26823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f26824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tx f26825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26826d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f26827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f26829g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f26830h;

        @SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,557:1\n1282#2,6:558\n1282#2,6:564\n70#3:570\n67#3,9:571\n77#3:610\n79#4,6:580\n86#4,3:595\n89#4,2:604\n93#4:609\n347#5,9:586\n356#5,3:606\n4206#6,6:598\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheetContent$7$2$1\n*L\n386#1:558,6\n393#1:564,6\n384#1:570\n384#1:571,9\n384#1:610\n384#1:580,6\n384#1:595,3\n384#1:604,2\n384#1:609\n384#1:586,9\n384#1:606,3\n384#1:598,6\n*E\n"})
        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ tx f26831a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f26832b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f26833c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f26834d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f26835e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f26836f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f26837g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f26838h;

            /* JADX INFO: renamed from: androidx.compose.material3.cl$l$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1", f = "ModalBottomSheet.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
            static final class C0212a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f26839a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f26840b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0212a(tx txVar, kotlin.coroutines.d<? super C0212a> dVar) {
                    super(2, dVar);
                    this.f26840b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0212a(this.f26840b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f26839a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f26840b;
                        this.f26839a = 1;
                        if (txVar.o(this) == objL) {
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
                    return ((C0212a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2", f = "ModalBottomSheet.kt", i = {}, l = {390}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f26841a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f26842b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(tx txVar, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f26842b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f26842b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f26841a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f26842b;
                        this.f26841a = 1;
                        if (txVar.L(this) == objL) {
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

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$2$1", f = "ModalBottomSheet.kt", i = {}, l = {com.google.api.client.http.a0.f115563p}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f26843a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f26844b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(tx txVar, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f26844b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new c(this.f26844b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f26843a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f26844b;
                        this.f26843a = 1;
                        if (txVar.o(this) == objL) {
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

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$2$1$1$3$1", f = "ModalBottomSheet.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.c.f44017r}, m = "invokeSuspend", n = {}, s = {})
            static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f26845a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ tx f26846b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(tx txVar, kotlin.coroutines.d<? super d> dVar) {
                    super(2, dVar);
                    this.f26846b = txVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new d(this.f26846b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f26845a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        tx txVar = this.f26846b;
                        this.f26845a = 1;
                        if (txVar.E(this) == objL) {
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

            public /* synthetic */ class e {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f26847a;

                static {
                    int[] iArr = new int[vx.values().length];
                    try {
                        iArr[vx.Expanded.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vx.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f26847a = iArr;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(tx txVar, Function0<Unit> function0, kotlinx.coroutines.s0 s0Var, boolean z10, String str, String str2, String str3, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f26831a = txVar;
                this.f26832b = function0;
                this.f26833c = s0Var;
                this.f26834d = z10;
                this.f26835e = str;
                this.f26836f = str2;
                this.f26837g = str3;
                this.f26838h = function2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit n(tx txVar, Function0 function0, kotlinx.coroutines.s0 s0Var) {
                int i10 = e.f26847a[txVar.s().ordinal()];
                if (i10 == 1) {
                    function0.invoke();
                    Unit unit = Unit.f312394a;
                } else if (i10 != 2) {
                    kotlinx.coroutines.k.f(s0Var, null, null, new b(txVar, null), 3, null);
                } else {
                    kotlinx.coroutines.k.f(s0Var, null, null, new C0212a(txVar, null), 3, null);
                }
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit s(boolean z10, final tx txVar, String str, String str2, String str3, final Function0 function0, final kotlinx.coroutines.s0 s0Var, androidx.compose.ui.semantics.e0 e0Var) {
                if (z10) {
                    androidx.compose.ui.semantics.b0.o(e0Var, str, new Function0() { // from class: androidx.compose.material3.hl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(cl.l.a.v(function0));
                        }
                    });
                    if (txVar.s() == vx.PartiallyExpanded) {
                        androidx.compose.ui.semantics.b0.r(e0Var, str2, new Function0() { // from class: androidx.compose.material3.il
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(cl.l.a.x(txVar, s0Var, txVar));
                            }
                        });
                    } else if (txVar.u()) {
                        androidx.compose.ui.semantics.b0.g(e0Var, str3, new Function0() { // from class: androidx.compose.material3.jl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(cl.l.a.y(txVar, s0Var));
                            }
                        });
                    }
                }
                return Unit.f312394a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean v(Function0 function0) {
                function0.invoke();
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean x(tx txVar, kotlinx.coroutines.s0 s0Var, tx txVar2) {
                if (txVar.q().x().invoke(vx.Expanded).booleanValue()) {
                    kotlinx.coroutines.k.f(s0Var, null, null, new c(txVar2, null), 3, null);
                }
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean y(tx txVar, kotlinx.coroutines.s0 s0Var) {
                if (!txVar.q().x().invoke(vx.PartiallyExpanded).booleanValue()) {
                    return true;
                }
                kotlinx.coroutines.k.f(s0Var, null, null, new d(txVar, null), 3, null);
                return true;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                m(c0Var, num.intValue());
                return Unit.f312394a;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void m(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2000500644, i10, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:383)");
                }
                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                boolean zD = c0Var.D(this.f26831a) | c0Var.D(this.f26832b) | c0Var.k0(this.f26833c);
                final tx txVar = this.f26831a;
                final Function0<Unit> function0 = this.f26832b;
                final kotlinx.coroutines.s0 s0Var = this.f26833c;
                Object objI0 = c0Var.i0();
                if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.fl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.l.a.n(txVar, function0, s0Var);
                        }
                    };
                    c0Var.Y(objI0);
                }
                int i11 = 4 << 0;
                androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.i1.h(aVar, false, null, null, (Function0) objI0, 7, null);
                boolean zG = c0Var.G(this.f26834d) | c0Var.D(this.f26831a) | c0Var.D(this.f26835e) | c0Var.D(this.f26832b) | c0Var.D(this.f26836f) | c0Var.k0(this.f26833c) | c0Var.D(this.f26837g);
                final boolean z10 = this.f26834d;
                final tx txVar2 = this.f26831a;
                final String str = this.f26835e;
                final String str2 = this.f26836f;
                final String str3 = this.f26837g;
                final Function0<Unit> function1 = this.f26832b;
                final kotlinx.coroutines.s0 s0Var2 = this.f26833c;
                Object objI1 = c0Var.i0();
                if (zG || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    Function1 function2 = new Function1() { // from class: androidx.compose.material3.gl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.l.a.s(z10, txVar2, str, str2, str3, function1, s0Var2, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var.Y(function2);
                    objI1 = function2;
                }
                androidx.compose.ui.a0 a0VarE = androidx.compose.ui.semantics.t.e(a0VarH, true, (Function1) objI1);
                Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f26838h;
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
                function3.invoke(c0Var, 0);
                c0Var.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        l(Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function2, androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, tx txVar, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, Function0<Unit> function0, kotlinx.coroutines.s0 s0Var, boolean z10) {
            this.f26823a = function2;
            this.f26824b = cVar;
            this.f26825c = txVar;
            this.f26826d = function3;
            this.f26827e = nVar;
            this.f26828f = function0;
            this.f26829g = s0Var;
            this.f26830h = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(androidx.compose.animation.core.c cVar, androidx.compose.ui.graphics.r1 r1Var) {
            float fFloatValue = ((Number) cVar.v()).floatValue();
            float fU = cl.U(r1Var, fFloatValue);
            float fV = cl.V(r1Var, fFloatValue);
            r1Var.C(fV == 0.0f ? 1.0f : fU / fV);
            r1Var.W1(cl.f26786c);
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void d(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(728743275, i10, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:359)");
            }
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.t7.h(androidx.compose.foundation.layout.i6.h(androidx.compose.ui.a0.E, 0.0f, 1, null), this.f26823a.invoke(c0Var, 0));
            boolean zK0 = c0Var.k0(this.f26824b);
            final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f26824b;
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.el
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.l.f(cVar, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarZ = j3.z(androidx.compose.ui.graphics.q1.a(a0VarH, (Function1) objI0), this.f26825c);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f26826d;
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f26827e;
            tx txVar = this.f26825c;
            Function0<Unit> function0 = this.f26828f;
            kotlinx.coroutines.s0 s0Var = this.f26829g;
            boolean z10 = this.f26830h;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarZ);
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
            androidx.compose.foundation.layout.n0 n0Var = androidx.compose.foundation.layout.n0.f16227a;
            if (function2 != null) {
                c0Var.E(1352934765);
                androidx.compose.material3.internal.l3.a aVar2 = androidx.compose.material3.internal.l3.f29010b;
                ix.g(n0Var, androidx.compose.runtime.internal.w.e(2000500644, true, new a(txVar, function0, s0Var, z10, androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31828b), c0Var, 0), androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31832d), c0Var, 0), androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31826a), c0Var, 0), function2), c0Var, 54), c0Var, 54);
                c0Var.A();
            } else {
                c0Var.E(1356009965);
                c0Var.A();
            }
            nVar.invoke(n0Var, c0Var, 6);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            d(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class m implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26848a;

        m(Function0<Unit> function0) {
            this.f26848a = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(Function0 function0, n0.g gVar) {
            function0.invoke();
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            final Function0<Unit> function0 = this.f26848a;
            Object objP = androidx.compose.foundation.gestures.c5.p(l0Var, null, null, null, new Function1() { // from class: androidx.compose.material3.kl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return cl.m.b(function0, (n0.g) obj);
                }
            }, dVar, 7, null);
            return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
        }
    }

    public /* synthetic */ class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26849a;

        static {
            int[] iArr = new int[vx.values().length];
            try {
                iArr[vx.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vx.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vx.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26849a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(androidx.compose.foundation.layout.c0 c0Var, androidx.compose.animation.core.c cVar, kotlinx.coroutines.s0 s0Var, Function0 function0, Function1 function1, androidx.compose.ui.a0 a0Var, tx txVar, float f10, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, Function2 function2, Function2 function3, pj.n nVar, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var2, int i13) {
        v(c0Var, cVar, s0Var, function0, function1, a0Var, txVar, f10, z10, q3Var, j10, j11, f11, function2, function3, nVar, c0Var2, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(tx txVar, androidx.compose.animation.core.y0 y0Var, androidx.compose.animation.core.y0 y0Var2, androidx.compose.animation.core.y0 y0Var3) {
        txVar.J(y0Var);
        txVar.I(y0Var2);
        txVar.G(y0Var3);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(tx txVar, kotlinx.coroutines.s0 s0Var, androidx.compose.animation.core.c cVar, final Function0 function0) {
        if (txVar.s() == vx.Expanded && txVar.u()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new b(cVar, null), 3, null);
            kotlinx.coroutines.k.f(s0Var, null, null, new c(txVar, null), 3, null);
        } else {
            kotlinx.coroutines.k.f(s0Var, null, null, new d(txVar, null), 3, null).E(new Function1() { // from class: androidx.compose.material3.nk
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return cl.D(function0, (Throwable) obj);
                }
            });
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(Function0 function0, Throwable th2) {
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(Function0 function0, androidx.compose.ui.a0 a0Var, tx txVar, float f10, boolean z10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, long j12, Function2 function2, Function2 function3, ll llVar, pj.n nVar, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        t(function0, a0Var, txVar, f10, z10, q3Var, j10, j11, f11, j12, function2, function3, llVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(final tx txVar, kotlinx.coroutines.s0 s0Var, final Function0 function0) {
        if (txVar.q().x().invoke(vx.Hidden).booleanValue()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new h(txVar, null), 3, null).E(new Function1() { // from class: androidx.compose.material3.jk
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return cl.G(txVar, function0, (Throwable) obj);
                }
            });
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(tx txVar, Function0 function0, Throwable th2) {
        if (!txVar.D()) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(kotlinx.coroutines.s0 s0Var, final tx txVar, final Function0 function0, float f10) {
        kotlinx.coroutines.k.f(s0Var, null, null, new i(txVar, f10, null), 3, null).E(new Function1() { // from class: androidx.compose.material3.ok
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cl.I(txVar, function0, (Throwable) obj);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(tx txVar, Function0 function0, Throwable th2) {
        if (!txVar.D()) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(Function0 function0, androidx.compose.ui.a0 a0Var, tx txVar, float f10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, long j12, Function2 function2, Function2 function3, ll llVar, pj.n nVar, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        u(function0, a0Var, txVar, f10, q3Var, j10, j11, f11, j12, function2, function3, llVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), androidx.compose.runtime.t4.a(i11), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void K(final long j10, final Function0<Unit> function0, final boolean z10, final boolean z11, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        int i12;
        androidx.compose.ui.a0 a0VarE;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-391613911);
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
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z11) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-391613911, i11, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:514)");
            }
            if (j10 != 16) {
                c0VarR.E(-1438582326);
                int i13 = i11;
                final androidx.compose.runtime.n7<Float> n7VarF = androidx.compose.animation.core.f.f(z10 ? 1.0f : 0.0f, hm.b(d0.h1.DefaultEffects, c0VarR, 6), 0.0f, null, null, c0VarR, 0, 28);
                androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                final String strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(androidx.compose.ui.d0.c.f37151c), c0VarR, 0);
                if (z11) {
                    c0VarR.E(-1438283579);
                    androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                    int i14 = i13 & com.planner5d.library.engine.input.f.b.B;
                    boolean z12 = i14 == 32;
                    Object objI0 = c0VarR.i0();
                    if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new m(function0);
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarE2 = androidx.compose.ui.input.pointer.w0.e(aVar2, function0, (PointerInputEventHandler) objI0);
                    boolean zD = (i14 == 32) | c0VarR.D(strB);
                    Object objI1 = c0VarR.i0();
                    if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.xk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.M(strB, function0, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    i12 = 1;
                    a0VarE = androidx.compose.ui.semantics.t.e(a0VarE2, true, (Function1) objI1);
                    c0VarR.A();
                } else {
                    i12 = 1;
                    c0VarR.E(-1437857391);
                    c0VarR.A();
                    a0VarE = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB2 = androidx.compose.foundation.layout.i6.f(androidx.compose.ui.a0.E, 0.0f, i12, null).B2(a0VarE);
                int i15 = (c0VarR.D(n7VarF) ? 1 : 0) | ((i13 & 14) == 4 ? i12 : 0);
                Object objI2 = c0VarR.i0();
                if (i15 != 0 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.yk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.O(j10, n7VarF, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.foundation.f1.e(a0VarB2, (Function1) objI2, c0VarR, 0);
                c0VarR.A();
            } else {
                c0VarR.E(-1437676103);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.zk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return cl.P(j10, function0, z10, z11, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float L(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(String str, final Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.c2(e0Var, 1.0f);
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.Q0(e0Var, null, new Function0() { // from class: androidx.compose.material3.wk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(cl.N(function0));
            }
        }, 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N(Function0 function0) {
        function0.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(long j10, androidx.compose.runtime.n7 n7Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, 0L, 0L, kotlin.ranges.r.H(L(n7Var), 0.0f, 1.0f), null, null, 0, 118, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(long j10, Function0 function0, boolean z10, boolean z11, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        K(j10, function0, z10, z11, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float U(androidx.compose.ui.graphics.r1 r1Var, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() >> 32));
        float fR = 1.0f;
        if (!Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            fR = 1.0f - (androidx.compose.ui.util.e.r(0.0f, Math.min(r1Var.S7(f26784a), fIntBitsToFloat), f10) / fIntBitsToFloat);
        }
        return fR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float V(androidx.compose.ui.graphics.r1 r1Var, float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() & com.rabbitmq.client.k0.f265952a));
        float fR = 1.0f;
        if (!Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            fR = 1.0f - (androidx.compose.ui.util.e.r(0.0f, Math.min(r1Var.S7(f26785b), fIntBitsToFloat), f10) / fIntBitsToFloat);
        }
        return fR;
    }

    @androidx.compose.runtime.o
    @af
    @NotNull
    public static final tx W(boolean z10, @Nullable Function1<? super vx, Boolean> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i11 & 2) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.vk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(cl.X((vx) obj));
                    }
                };
                c0Var.Y(objI0);
            }
            function1 = (Function1) objI0;
        }
        Function1<? super vx, Boolean> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-778250030, i10, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:502)");
        }
        int i12 = 3 & 0;
        tx txVarK = ix.k(z11, function2, vx.Hidden, false, 0.0f, 0.0f, c0Var, (i10 & 14) | androidx.media3.exoplayer.a5.S0 | (i10 & com.planner5d.library.engine.input.f.b.B), 56);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return txVarK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(vx vxVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:115:0x0158  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0167  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x0191  */
    /* JADX WARN: Code duplicated, block: B:137:0x019b  */
    /* JADX WARN: Code duplicated, block: B:138:0x019e  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01df  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:185:0x0241 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0243  */
    /* JADX WARN: Code duplicated, block: B:189:0x024a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0254  */
    /* JADX WARN: Code duplicated, block: B:192:0x025b  */
    /* JADX WARN: Code duplicated, block: B:194:0x025e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0263  */
    /* JADX WARN: Code duplicated, block: B:200:0x0272  */
    /* JADX WARN: Code duplicated, block: B:201:0x027e  */
    /* JADX WARN: Code duplicated, block: B:204:0x0284  */
    /* JADX WARN: Code duplicated, block: B:205:0x0291  */
    /* JADX WARN: Code duplicated, block: B:207:0x0295  */
    /* JADX WARN: Code duplicated, block: B:208:0x029b  */
    /* JADX WARN: Code duplicated, block: B:211:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:218:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:223:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:226:0x0315  */
    /* JADX WARN: Code duplicated, block: B:229:0x0336  */
    /* JADX WARN: Code duplicated, block: B:231:0x033c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0358  */
    /* JADX WARN: Code duplicated, block: B:239:0x0360  */
    /* JADX WARN: Code duplicated, block: B:242:0x0379  */
    /* JADX WARN: Code duplicated, block: B:245:0x0388  */
    /* JADX WARN: Code duplicated, block: B:247:0x038e  */
    /* JADX WARN: Code duplicated, block: B:253:0x039f  */
    /* JADX WARN: Code duplicated, block: B:254:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:257:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:259:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:262:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:264:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:270:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:271:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:274:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:276:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:279:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:282:0x040d  */
    /* JADX WARN: Code duplicated, block: B:284:0x0413  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0427  */
    /* JADX WARN: Code duplicated, block: B:291:0x0429  */
    /* JADX WARN: Code duplicated, block: B:294:0x0432  */
    /* JADX WARN: Code duplicated, block: B:296:0x0438  */
    /* JADX WARN: Code duplicated, block: B:299:0x048a  */
    /* JADX WARN: Code duplicated, block: B:301:0x0494  */
    /* JADX WARN: Code duplicated, block: B:303:0x049a  */
    /* JADX WARN: Code duplicated, block: B:308:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:310:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:312:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:315:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:317:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0515  */
    /* JADX WARN: Code duplicated, block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void t(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable tx txVar, float f10, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, long j12, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function3, @Nullable ll llVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        final tx txVarW;
        int i14;
        float f12;
        int i15;
        int i16;
        boolean z11;
        int i17;
        androidx.compose.ui.graphics.q3 q3VarH;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final long j13;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function4;
        final ll llVar2;
        final float f13;
        final boolean z13;
        final androidx.compose.ui.a0 a0Var3;
        final tx txVar2;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j14;
        final float f14;
        final long j15;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        androidx.compose.runtime.s5 s5VarT;
        float fL;
        long jF;
        long jG;
        float fR;
        long jK;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2B;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function6;
        int i29;
        float f15;
        ll llVar3;
        float f16;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function7;
        long j16;
        boolean z14;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.graphics.q3 q3Var3;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8;
        long j17;
        long j18;
        final androidx.compose.animation.core.y0 y0VarB;
        final androidx.compose.animation.core.y0 y0VarB2;
        final androidx.compose.animation.core.y0 y0VarB3;
        int i30;
        boolean zK0;
        Object objI0;
        Object objI1;
        androidx.compose.runtime.c0.a aVar;
        final kotlinx.coroutines.s0 s0Var;
        int i31;
        boolean z15;
        boolean z16;
        Object objI2;
        boolean z17;
        boolean z18;
        Object objI3;
        Object objI4;
        final androidx.compose.animation.core.c cVar;
        boolean z19;
        boolean z20;
        Object objI5;
        boolean z21;
        Object objI6;
        int i32;
        int i33;
        int i34;
        int i35;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1904798512);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i36 = i12 & 2;
        if (i36 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    txVarW = txVar;
                    int i37 = c0VarR.D(txVarW) ? 256 : 128;
                    i13 |= i37;
                } else {
                    txVarW = txVar;
                }
                i13 |= i37;
            } else {
                txVarW = txVar;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    f12 = f10;
                    if (c0VarR.I(f12)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        q3VarH = q3Var;
                        if ((i12 & 32) == 0 || !c0VarR.D(q3VarH)) {
                            i35 = 65536;
                        } else {
                            i35 = 131072;
                        }
                        i13 |= i35;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i12 & 64) == 0 || !c0VarR.L(j10)) {
                            i34 = 524288;
                        } else {
                            i34 = 1048576;
                        }
                        i13 |= i34;
                    }
                    if ((i10 & 12582912) == 0) {
                        int i38 = i13;
                        if ((i12 & 128) == 0 || !c0VarR.L(j11)) {
                            i33 = 4194304;
                        } else {
                            i33 = 8388608;
                        }
                        i18 = i38 | i33;
                    } else {
                        i18 = i13;
                    }
                    i19 = i12 & 256;
                    if (i19 != 0) {
                        i18 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.I(f11)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i18 |= i20;
                    }
                    if ((i10 & 805306368) != 0) {
                        if ((i12 & 512) == 0 || !c0VarR.L(j12)) {
                            i32 = 268435456;
                        } else {
                            i32 = 536870912;
                        }
                        i18 |= i32;
                    }
                    i21 = i12 & 1024;
                    if (i21 != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c0VarR.k0(function2)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
                    }
                    i24 = i22;
                    i25 = i12 & 4096;
                    if (i25 != 0) {
                        i27 = i24 | androidx.media3.exoplayer.a5.S0;
                    } else {
                        i26 = i24;
                        if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                            if (c0VarR.D(llVar)) {
                                i28 = 256;
                            } else {
                                i28 = 128;
                            }
                            i26 |= i28;
                        }
                        i27 = i26;
                    }
                    if ((i12 & 8192) != 0) {
                        if ((i11 & 3072) == 0) {
                            i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
                        }
                        if ((i18 & 306783379) == 306783378 || (i27 & 1171) != 1170) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i36 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i12 & 4) != 0) {
                                    i18 &= -897;
                                    txVarW = W(false, null, c0VarR, 0, 3);
                                }
                                if (i14 != 0) {
                                    fL = x2.f34346a.l();
                                } else {
                                    fL = f12;
                                }
                                if (i16 != 0) {
                                    z11 = true;
                                }
                                if ((i12 & 32) != 0) {
                                    i18 &= -458753;
                                    q3VarH = x2.f34346a.h(c0VarR, 6);
                                }
                                if ((i12 & 64) != 0) {
                                    jF = x2.f34346a.f(c0VarR, 6);
                                    i18 &= -3670017;
                                } else {
                                    jF = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                    i18 &= -29360129;
                                } else {
                                    jG = j11;
                                }
                                if (i19 != 0) {
                                    fR = androidx.compose.ui.unit.h.r(0);
                                } else {
                                    fR = f11;
                                }
                                if ((i12 & 512) != 0) {
                                    jK = x2.f34346a.k(c0VarR, 6);
                                    i18 &= -1879048193;
                                } else {
                                    jK = j12;
                                }
                                if (i21 != 0) {
                                    function2B = s6.f32739a.b();
                                } else {
                                    function2B = function2;
                                }
                                if ((i12 & 2048) != 0) {
                                    function6 = a.f26787a;
                                    i27 &= -113;
                                } else {
                                    function6 = function3;
                                }
                                i29 = i27;
                                if (i25 != 0) {
                                    f15 = fL;
                                    llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                    f16 = fR;
                                    function7 = function6;
                                    j16 = jF;
                                    z14 = z11;
                                    a0Var4 = a0Var2;
                                    q3Var3 = q3VarH;
                                    function8 = function2B;
                                    j17 = jG;
                                    j18 = jK;
                                    i27 = i29;
                                } else {
                                    f15 = fL;
                                    llVar3 = llVar;
                                    f16 = fR;
                                    function7 = function6;
                                    j16 = jF;
                                    z14 = z11;
                                    a0Var4 = a0Var2;
                                    q3Var3 = q3VarH;
                                    function8 = function2B;
                                    j17 = jG;
                                    j18 = jK;
                                }
                            } else {
                                c0VarR.u();
                                if ((i12 & 4) != 0) {
                                    i18 &= -897;
                                }
                                if ((i12 & 32) != 0) {
                                    i18 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    i18 &= -3670017;
                                }
                                if ((i12 & 128) != 0) {
                                    i18 &= -29360129;
                                }
                                if ((i12 & 512) != 0) {
                                    i18 &= -1879048193;
                                }
                                if ((i12 & 2048) != 0) {
                                    i27 &= -113;
                                }
                                j16 = j10;
                                j17 = j11;
                                f16 = f11;
                                j18 = j12;
                                function8 = function2;
                                function7 = function3;
                                llVar3 = llVar;
                                f15 = f12;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                            }
                            d0.h1 h1Var = d0.h1.DefaultSpatial;
                            y0VarB = hm.b(h1Var, c0VarR, 6);
                            y0VarB2 = hm.b(h1Var, c0VarR, 6);
                            y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                            i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                            zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                            objI0 = c0VarR.i0();
                            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: androidx.compose.material3.al
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                            objI1 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI1 == aVar.a()) {
                                objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI1);
                            }
                            s0Var = (kotlinx.coroutines.s0) objI1;
                            boolean zK1 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                            i31 = i18 & 14;
                            if (i31 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zK1 | z15;
                            objI2 = c0VarR.i0();
                            if (z16 || objI2 == aVar.a()) {
                                objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return cl.F(txVarW, s0Var, function0);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            Function0 function1 = (Function0) objI2;
                            boolean zK2 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                            if (i31 == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = zK2 | z17;
                            objI3 = c0VarR.i0();
                            if (z18 || objI3 == aVar.a()) {
                                objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            Function1 function9 = (Function1) objI3;
                            objI4 = c0VarR.i0();
                            if (objI4 == aVar.a()) {
                                objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                                c0VarR.Y(objI4);
                            }
                            cVar = (androidx.compose.animation.core.c) objI4;
                            boolean zK3 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                            if (i31 == 4) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            z20 = z19 | zK3;
                            objI5 = c0VarR.i0();
                            if (z20 || objI5 == aVar.a()) {
                                objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return cl.C(txVarW, s0Var, cVar, function0);
                                    }
                                };
                                c0VarR.Y(objI5);
                            }
                            rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function1, txVarW, llVar3, cVar, s0Var, function9, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                            c0Var2 = c0VarR;
                            if (txVarW.t()) {
                                c0Var2.E(748459762);
                                z21 = (i30 <= 256 && c0Var2.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256;
                                objI6 = c0Var2.i0();
                                if (z21 || objI6 == aVar.a()) {
                                    objI6 = new f(txVarW, null);
                                    c0Var2.Y(objI6);
                                }
                                androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                                c0Var2.A();
                            } else {
                                c0Var2.E(748521266);
                                c0Var2.A();
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            txVar2 = txVarW;
                            j15 = j18;
                            llVar2 = llVar3;
                            a0Var3 = a0Var4;
                            f13 = f15;
                            z13 = z14;
                            q3Var2 = q3Var3;
                            j13 = j16;
                            j14 = j17;
                            f14 = f16;
                            function5 = function8;
                            function4 = function7;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            j13 = j10;
                            function4 = function3;
                            llVar2 = llVar;
                            f13 = f12;
                            z13 = z11;
                            a0Var3 = a0Var2;
                            txVar2 = txVarW;
                            q3Var2 = q3VarH;
                            j14 = j11;
                            f14 = f11;
                            j15 = j12;
                            function5 = function2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i27 |= 3072;
                    if ((i18 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        } else {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        d0.h1 h1Var2 = d0.h1.DefaultSpatial;
                        y0VarB = hm.b(h1Var2, c0VarR, 6);
                        y0VarB2 = hm.b(h1Var2, c0VarR, 6);
                        y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                        i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                        zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                        objI0 = c0VarR.i0();
                        if (zK0) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                        objI1 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI1;
                        boolean zK4 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                        i31 = i18 & 14;
                        if (i31 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK4 | z15;
                        objI2 = c0VarR.i0();
                        if (z16) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        Function0 function10 = (Function0) objI2;
                        boolean zK5 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                        if (i31 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zK5 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function1 function11 = (Function1) objI3;
                        objI4 = c0VarR.i0();
                        if (objI4 == aVar.a()) {
                            objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                            c0VarR.Y(objI4);
                        }
                        cVar = (androidx.compose.animation.core.c) objI4;
                        boolean zK6 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                        if (i31 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = z19 | zK6;
                        objI5 = c0VarR.i0();
                        if (z20) {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        } else {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        }
                        rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function10, txVarW, llVar3, cVar, s0Var, function11, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                        c0Var2 = c0VarR;
                        if (txVarW.t()) {
                            c0Var2.E(748459762);
                            if (i30 <= 256) {
                            }
                            objI6 = c0Var2.i0();
                            if (z21) {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            } else {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            }
                            androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                            c0Var2.A();
                        } else {
                            c0Var2.E(748521266);
                            c0Var2.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVarW;
                        j15 = j18;
                        llVar2 = llVar3;
                        a0Var3 = a0Var4;
                        f13 = f15;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        j14 = j17;
                        f14 = f16;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j13 = j10;
                        function4 = function3;
                        llVar2 = llVar;
                        f13 = f12;
                        z13 = z11;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        q3Var2 = q3VarH;
                        j14 = j11;
                        f14 = f11;
                        j15 = j12;
                        function5 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                z11 = z10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarH = q3Var;
                    if ((i12 & 32) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i13 |= i35;
                } else {
                    q3VarH = q3Var;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i34 = 524288;
                    } else {
                        i34 = 524288;
                    }
                    i13 |= i34;
                }
                if ((i10 & 12582912) == 0) {
                    int i39 = i13;
                    if ((i12 & 128) == 0) {
                        i33 = 4194304;
                    } else {
                        i33 = 4194304;
                    }
                    i18 = i39 | i33;
                } else {
                    i18 = i13;
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                    i18 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i18 |= i20;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i18 |= i32;
                }
                i21 = i12 & 1024;
                if (i21 != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i11 & 48) != 0) {
                    i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
                }
                i24 = i22;
                i25 = i12 & 4096;
                if (i25 != 0) {
                    i27 = i24 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i26 = i24;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.D(llVar)) {
                            i28 = 256;
                        } else {
                            i28 = 128;
                        }
                        i26 |= i28;
                    }
                    i27 = i26;
                }
                if ((i12 & 8192) != 0) {
                    if ((i11 & 3072) == 0) {
                        i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        } else {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        d0.h1 h1Var3 = d0.h1.DefaultSpatial;
                        y0VarB = hm.b(h1Var3, c0VarR, 6);
                        y0VarB2 = hm.b(h1Var3, c0VarR, 6);
                        y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                        i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                        zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                        objI0 = c0VarR.i0();
                        if (zK0) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                        objI1 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI1;
                        boolean zK7 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                        i31 = i18 & 14;
                        if (i31 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK7 | z15;
                        objI2 = c0VarR.i0();
                        if (z16) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        Function0 function12 = (Function0) objI2;
                        boolean zK8 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                        if (i31 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zK8 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function1 function13 = (Function1) objI3;
                        objI4 = c0VarR.i0();
                        if (objI4 == aVar.a()) {
                            objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                            c0VarR.Y(objI4);
                        }
                        cVar = (androidx.compose.animation.core.c) objI4;
                        boolean zK9 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                        if (i31 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = z19 | zK9;
                        objI5 = c0VarR.i0();
                        if (z20) {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        } else {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        }
                        rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function12, txVarW, llVar3, cVar, s0Var, function13, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                        c0Var2 = c0VarR;
                        if (txVarW.t()) {
                            c0Var2.E(748459762);
                            if (i30 <= 256) {
                            }
                            objI6 = c0Var2.i0();
                            if (z21) {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            } else {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            }
                            androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                            c0Var2.A();
                        } else {
                            c0Var2.E(748521266);
                            c0Var2.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVarW;
                        j15 = j18;
                        llVar2 = llVar3;
                        a0Var3 = a0Var4;
                        f13 = f15;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        j14 = j17;
                        f14 = f16;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j13 = j10;
                        function4 = function3;
                        llVar2 = llVar;
                        f13 = f12;
                        z13 = z11;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        q3Var2 = q3VarH;
                        j14 = j11;
                        f14 = f11;
                        j15 = j12;
                        function5 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 3072;
                if ((i18 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    } else {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    d0.h1 h1Var4 = d0.h1.DefaultSpatial;
                    y0VarB = hm.b(h1Var4, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var4, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI1;
                    boolean zK10 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    i31 = i18 & 14;
                    if (i31 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK10 | z15;
                    objI2 = c0VarR.i0();
                    if (z16) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    Function0 function14 = (Function0) objI2;
                    boolean zK11 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                    if (i31 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zK11 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function1 function15 = (Function1) objI3;
                    objI4 = c0VarR.i0();
                    if (objI4 == aVar.a()) {
                        objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                        c0VarR.Y(objI4);
                    }
                    cVar = (androidx.compose.animation.core.c) objI4;
                    boolean zK12 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                    if (i31 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | zK12;
                    objI5 = c0VarR.i0();
                    if (z20) {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function14, txVarW, llVar3, cVar, s0Var, function15, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                    c0Var2 = c0VarR;
                    if (txVarW.t()) {
                        c0Var2.E(748459762);
                        if (i30 <= 256) {
                        }
                        objI6 = c0Var2.i0();
                        if (z21) {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        } else {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        }
                        androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                        c0Var2.A();
                    } else {
                        c0Var2.E(748521266);
                        c0Var2.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVarW;
                    j15 = j18;
                    llVar2 = llVar3;
                    a0Var3 = a0Var4;
                    f13 = f15;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    j14 = j17;
                    f14 = f16;
                    function5 = function8;
                    function4 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j13 = j10;
                    function4 = function3;
                    llVar2 = llVar;
                    f13 = f12;
                    z13 = z11;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    q3Var2 = q3VarH;
                    j14 = j11;
                    f14 = f11;
                    j15 = j12;
                    function5 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            f12 = f10;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarH = q3Var;
                    if ((i12 & 32) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i13 |= i35;
                } else {
                    q3VarH = q3Var;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i34 = 524288;
                    } else {
                        i34 = 524288;
                    }
                    i13 |= i34;
                }
                if ((i10 & 12582912) == 0) {
                    int i310 = i13;
                    if ((i12 & 128) == 0) {
                        i33 = 4194304;
                    } else {
                        i33 = 4194304;
                    }
                    i18 = i310 | i33;
                } else {
                    i18 = i13;
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                    i18 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i18 |= i20;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i18 |= i32;
                }
                i21 = i12 & 1024;
                if (i21 != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i11 & 48) != 0) {
                    i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
                }
                i24 = i22;
                i25 = i12 & 4096;
                if (i25 != 0) {
                    i27 = i24 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i26 = i24;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.D(llVar)) {
                            i28 = 256;
                        } else {
                            i28 = 128;
                        }
                        i26 |= i28;
                    }
                    i27 = i26;
                }
                if ((i12 & 8192) != 0) {
                    if ((i11 & 3072) == 0) {
                        i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        } else {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        d0.h1 h1Var5 = d0.h1.DefaultSpatial;
                        y0VarB = hm.b(h1Var5, c0VarR, 6);
                        y0VarB2 = hm.b(h1Var5, c0VarR, 6);
                        y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                        i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                        zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                        objI0 = c0VarR.i0();
                        if (zK0) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                        objI1 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI1;
                        boolean zK13 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                        i31 = i18 & 14;
                        if (i31 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK13 | z15;
                        objI2 = c0VarR.i0();
                        if (z16) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        Function0 function16 = (Function0) objI2;
                        boolean zK14 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                        if (i31 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zK14 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function1 function17 = (Function1) objI3;
                        objI4 = c0VarR.i0();
                        if (objI4 == aVar.a()) {
                            objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                            c0VarR.Y(objI4);
                        }
                        cVar = (androidx.compose.animation.core.c) objI4;
                        boolean zK15 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                        if (i31 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = z19 | zK15;
                        objI5 = c0VarR.i0();
                        if (z20) {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        } else {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        }
                        rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function16, txVarW, llVar3, cVar, s0Var, function17, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                        c0Var2 = c0VarR;
                        if (txVarW.t()) {
                            c0Var2.E(748459762);
                            if (i30 <= 256) {
                            }
                            objI6 = c0Var2.i0();
                            if (z21) {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            } else {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            }
                            androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                            c0Var2.A();
                        } else {
                            c0Var2.E(748521266);
                            c0Var2.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVarW;
                        j15 = j18;
                        llVar2 = llVar3;
                        a0Var3 = a0Var4;
                        f13 = f15;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        j14 = j17;
                        f14 = f16;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j13 = j10;
                        function4 = function3;
                        llVar2 = llVar;
                        f13 = f12;
                        z13 = z11;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        q3Var2 = q3VarH;
                        j14 = j11;
                        f14 = f11;
                        j15 = j12;
                        function5 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 3072;
                if ((i18 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    } else {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    d0.h1 h1Var6 = d0.h1.DefaultSpatial;
                    y0VarB = hm.b(h1Var6, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var6, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI1;
                    boolean zK16 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    i31 = i18 & 14;
                    if (i31 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK16 | z15;
                    objI2 = c0VarR.i0();
                    if (z16) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    Function0 function18 = (Function0) objI2;
                    boolean zK17 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                    if (i31 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zK17 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function1 function19 = (Function1) objI3;
                    objI4 = c0VarR.i0();
                    if (objI4 == aVar.a()) {
                        objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                        c0VarR.Y(objI4);
                    }
                    cVar = (androidx.compose.animation.core.c) objI4;
                    boolean zK18 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                    if (i31 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | zK18;
                    objI5 = c0VarR.i0();
                    if (z20) {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function18, txVarW, llVar3, cVar, s0Var, function19, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                    c0Var2 = c0VarR;
                    if (txVarW.t()) {
                        c0Var2.E(748459762);
                        if (i30 <= 256) {
                        }
                        objI6 = c0Var2.i0();
                        if (z21) {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        } else {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        }
                        androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                        c0Var2.A();
                    } else {
                        c0Var2.E(748521266);
                        c0Var2.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVarW;
                    j15 = j18;
                    llVar2 = llVar3;
                    a0Var3 = a0Var4;
                    f13 = f15;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    j14 = j17;
                    f14 = f16;
                    function5 = function8;
                    function4 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j13 = j10;
                    function4 = function3;
                    llVar2 = llVar;
                    f13 = f12;
                    z13 = z11;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    q3Var2 = q3VarH;
                    j14 = j11;
                    f14 = f11;
                    j15 = j12;
                    function5 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z11 = z10;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarH = q3Var;
                if ((i12 & 32) == 0) {
                    i35 = 65536;
                } else {
                    i35 = 65536;
                }
                i13 |= i35;
            } else {
                q3VarH = q3Var;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i34 = 524288;
                } else {
                    i34 = 524288;
                }
                i13 |= i34;
            }
            if ((i10 & 12582912) == 0) {
                int i311 = i13;
                if ((i12 & 128) == 0) {
                    i33 = 4194304;
                } else {
                    i33 = 4194304;
                }
                i18 = i311 | i33;
            } else {
                i18 = i13;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                i18 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i18 |= i20;
            }
            if ((i10 & 805306368) != 0) {
                if ((i12 & 512) == 0) {
                    i32 = 268435456;
                } else {
                    i32 = 268435456;
                }
                i18 |= i32;
            }
            i21 = i12 & 1024;
            if (i21 != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i11 & 48) != 0) {
                i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
            }
            i24 = i22;
            i25 = i12 & 4096;
            if (i25 != 0) {
                i27 = i24 | androidx.media3.exoplayer.a5.S0;
            } else {
                i26 = i24;
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if (c0VarR.D(llVar)) {
                        i28 = 256;
                    } else {
                        i28 = 128;
                    }
                    i26 |= i28;
                }
                i27 = i26;
            }
            if ((i12 & 8192) != 0) {
                if ((i11 & 3072) == 0) {
                    i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
                }
                if ((i18 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    } else {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    d0.h1 h1Var7 = d0.h1.DefaultSpatial;
                    y0VarB = hm.b(h1Var7, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var7, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI1;
                    boolean zK19 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    i31 = i18 & 14;
                    if (i31 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK19 | z15;
                    objI2 = c0VarR.i0();
                    if (z16) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    Function0 function110 = (Function0) objI2;
                    boolean zK110 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                    if (i31 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zK110 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function1 function111 = (Function1) objI3;
                    objI4 = c0VarR.i0();
                    if (objI4 == aVar.a()) {
                        objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                        c0VarR.Y(objI4);
                    }
                    cVar = (androidx.compose.animation.core.c) objI4;
                    boolean zK111 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                    if (i31 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | zK111;
                    objI5 = c0VarR.i0();
                    if (z20) {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function110, txVarW, llVar3, cVar, s0Var, function111, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                    c0Var2 = c0VarR;
                    if (txVarW.t()) {
                        c0Var2.E(748459762);
                        if (i30 <= 256) {
                        }
                        objI6 = c0Var2.i0();
                        if (z21) {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        } else {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        }
                        androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                        c0Var2.A();
                    } else {
                        c0Var2.E(748521266);
                        c0Var2.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVarW;
                    j15 = j18;
                    llVar2 = llVar3;
                    a0Var3 = a0Var4;
                    f13 = f15;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    j14 = j17;
                    f14 = f16;
                    function5 = function8;
                    function4 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j13 = j10;
                    function4 = function3;
                    llVar2 = llVar;
                    f13 = f12;
                    z13 = z11;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    q3Var2 = q3VarH;
                    j14 = j11;
                    f14 = f11;
                    j15 = j12;
                    function5 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 3072;
            if ((i18 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                } else {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                d0.h1 h1Var8 = d0.h1.DefaultSpatial;
                y0VarB = hm.b(h1Var8, c0VarR, 6);
                y0VarB2 = hm.b(h1Var8, c0VarR, 6);
                y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                objI1 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                s0Var = (kotlinx.coroutines.s0) objI1;
                boolean zK112 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                i31 = i18 & 14;
                if (i31 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK112 | z15;
                objI2 = c0VarR.i0();
                if (z16) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                Function0 function112 = (Function0) objI2;
                boolean zK113 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                if (i31 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zK113 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function1 function113 = (Function1) objI3;
                objI4 = c0VarR.i0();
                if (objI4 == aVar.a()) {
                    objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                    c0VarR.Y(objI4);
                }
                cVar = (androidx.compose.animation.core.c) objI4;
                boolean zK114 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                if (i31 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | zK114;
                objI5 = c0VarR.i0();
                if (z20) {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                } else {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                }
                rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function112, txVarW, llVar3, cVar, s0Var, function113, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                c0Var2 = c0VarR;
                if (txVarW.t()) {
                    c0Var2.E(748459762);
                    if (i30 <= 256) {
                    }
                    objI6 = c0Var2.i0();
                    if (z21) {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    } else {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    }
                    androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                    c0Var2.A();
                } else {
                    c0Var2.E(748521266);
                    c0Var2.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVarW;
                j15 = j18;
                llVar2 = llVar3;
                a0Var3 = a0Var4;
                f13 = f15;
                z13 = z14;
                q3Var2 = q3Var3;
                j13 = j16;
                j14 = j17;
                f14 = f16;
                function5 = function8;
                function4 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j13 = j10;
                function4 = function3;
                llVar2 = llVar;
                f13 = f12;
                z13 = z11;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                q3Var2 = q3VarH;
                j14 = j11;
                f14 = f11;
                j15 = j12;
                function5 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                txVarW = txVar;
                if (c0VarR.D(txVarW)) {
                }
                i13 |= i37;
            } else {
                txVarW = txVar;
            }
            i13 |= i37;
        } else {
            txVarW = txVar;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                f12 = f10;
                if (c0VarR.I(f12)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    q3VarH = q3Var;
                    if ((i12 & 32) == 0) {
                        i35 = 65536;
                    } else {
                        i35 = 65536;
                    }
                    i13 |= i35;
                } else {
                    q3VarH = q3Var;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0) {
                        i34 = 524288;
                    } else {
                        i34 = 524288;
                    }
                    i13 |= i34;
                }
                if ((i10 & 12582912) == 0) {
                    int i312 = i13;
                    if ((i12 & 128) == 0) {
                        i33 = 4194304;
                    } else {
                        i33 = 4194304;
                    }
                    i18 = i312 | i33;
                } else {
                    i18 = i13;
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                    i18 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.I(f11)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i18 |= i20;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i18 |= i32;
                }
                i21 = i12 & 1024;
                if (i21 != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c0VarR.k0(function2)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i11 & 48) != 0) {
                    i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
                }
                i24 = i22;
                i25 = i12 & 4096;
                if (i25 != 0) {
                    i27 = i24 | androidx.media3.exoplayer.a5.S0;
                } else {
                    i26 = i24;
                    if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                        if (c0VarR.D(llVar)) {
                            i28 = 256;
                        } else {
                            i28 = 128;
                        }
                        i26 |= i28;
                    }
                    i27 = i26;
                }
                if ((i12 & 8192) != 0) {
                    if ((i11 & 3072) == 0) {
                        i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
                    }
                    if ((i18 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        } else {
                            if (i36 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i18 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f12;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 32) != 0) {
                                i18 &= -458753;
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                            }
                            if ((i12 & 64) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i18 &= -3670017;
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                                i18 &= -29360129;
                            } else {
                                jG = j11;
                            }
                            if (i19 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 512) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i18 &= -1879048193;
                            } else {
                                jK = j12;
                            }
                            if (i21 != 0) {
                                function2B = s6.f32739a.b();
                            } else {
                                function2B = function2;
                            }
                            if ((i12 & 2048) != 0) {
                                function6 = a.f26787a;
                                i27 &= -113;
                            } else {
                                function6 = function3;
                            }
                            i29 = i27;
                            if (i25 != 0) {
                                f15 = fL;
                                llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                                i27 = i29;
                            } else {
                                f15 = fL;
                                llVar3 = llVar;
                                f16 = fR;
                                function7 = function6;
                                j16 = jF;
                                z14 = z11;
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarH;
                                function8 = function2B;
                                j17 = jG;
                                j18 = jK;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                        }
                        d0.h1 h1Var9 = d0.h1.DefaultSpatial;
                        y0VarB = hm.b(h1Var9, c0VarR, 6);
                        y0VarB2 = hm.b(h1Var9, c0VarR, 6);
                        y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                        i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                        zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                        objI0 = c0VarR.i0();
                        if (zK0) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.al
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                        objI1 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI1 == aVar.a()) {
                            objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI1);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI1;
                        boolean zK115 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                        i31 = i18 & 14;
                        if (i31 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zK115 | z15;
                        objI2 = c0VarR.i0();
                        if (z16) {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function0() { // from class: androidx.compose.material3.bl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.F(txVarW, s0Var, function0);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        Function0 function114 = (Function0) objI2;
                        boolean zK116 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                        if (i31 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zK116 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.kk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        Function1 function115 = (Function1) objI3;
                        objI4 = c0VarR.i0();
                        if (objI4 == aVar.a()) {
                            objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                            c0VarR.Y(objI4);
                        }
                        cVar = (androidx.compose.animation.core.c) objI4;
                        boolean zK117 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                        if (i31 == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        z20 = z19 | zK117;
                        objI5 = c0VarR.i0();
                        if (z20) {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        } else {
                            objI5 = new Function0() { // from class: androidx.compose.material3.lk
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return cl.C(txVarW, s0Var, cVar, function0);
                                }
                            };
                            c0VarR.Y(objI5);
                        }
                        rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function114, txVarW, llVar3, cVar, s0Var, function115, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                        c0Var2 = c0VarR;
                        if (txVarW.t()) {
                            c0Var2.E(748459762);
                            if (i30 <= 256) {
                            }
                            objI6 = c0Var2.i0();
                            if (z21) {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            } else {
                                objI6 = new f(txVarW, null);
                                c0Var2.Y(objI6);
                            }
                            androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                            c0Var2.A();
                        } else {
                            c0Var2.E(748521266);
                            c0Var2.A();
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVarW;
                        j15 = j18;
                        llVar2 = llVar3;
                        a0Var3 = a0Var4;
                        f13 = f15;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        j13 = j16;
                        j14 = j17;
                        f14 = f16;
                        function5 = function8;
                        function4 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        j13 = j10;
                        function4 = function3;
                        llVar2 = llVar;
                        f13 = f12;
                        z13 = z11;
                        a0Var3 = a0Var2;
                        txVar2 = txVarW;
                        q3Var2 = q3VarH;
                        j14 = j11;
                        f14 = f11;
                        j15 = j12;
                        function5 = function2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i27 |= 3072;
                if ((i18 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    } else {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    d0.h1 h1Var10 = d0.h1.DefaultSpatial;
                    y0VarB = hm.b(h1Var10, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var10, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI1;
                    boolean zK118 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    i31 = i18 & 14;
                    if (i31 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK118 | z15;
                    objI2 = c0VarR.i0();
                    if (z16) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    Function0 function116 = (Function0) objI2;
                    boolean zK119 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                    if (i31 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zK119 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function1 function117 = (Function1) objI3;
                    objI4 = c0VarR.i0();
                    if (objI4 == aVar.a()) {
                        objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                        c0VarR.Y(objI4);
                    }
                    cVar = (androidx.compose.animation.core.c) objI4;
                    boolean zK1110 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                    if (i31 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | zK1110;
                    objI5 = c0VarR.i0();
                    if (z20) {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function116, txVarW, llVar3, cVar, s0Var, function117, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                    c0Var2 = c0VarR;
                    if (txVarW.t()) {
                        c0Var2.E(748459762);
                        if (i30 <= 256) {
                        }
                        objI6 = c0Var2.i0();
                        if (z21) {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        } else {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        }
                        androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                        c0Var2.A();
                    } else {
                        c0Var2.E(748521266);
                        c0Var2.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVarW;
                    j15 = j18;
                    llVar2 = llVar3;
                    a0Var3 = a0Var4;
                    f13 = f15;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    j14 = j17;
                    f14 = f16;
                    function5 = function8;
                    function4 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j13 = j10;
                    function4 = function3;
                    llVar2 = llVar;
                    f13 = f12;
                    z13 = z11;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    q3Var2 = q3VarH;
                    j14 = j11;
                    f14 = f11;
                    j15 = j12;
                    function5 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            z11 = z10;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarH = q3Var;
                if ((i12 & 32) == 0) {
                    i35 = 65536;
                } else {
                    i35 = 65536;
                }
                i13 |= i35;
            } else {
                q3VarH = q3Var;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i34 = 524288;
                } else {
                    i34 = 524288;
                }
                i13 |= i34;
            }
            if ((i10 & 12582912) == 0) {
                int i313 = i13;
                if ((i12 & 128) == 0) {
                    i33 = 4194304;
                } else {
                    i33 = 4194304;
                }
                i18 = i313 | i33;
            } else {
                i18 = i13;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                i18 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i18 |= i20;
            }
            if ((i10 & 805306368) != 0) {
                if ((i12 & 512) == 0) {
                    i32 = 268435456;
                } else {
                    i32 = 268435456;
                }
                i18 |= i32;
            }
            i21 = i12 & 1024;
            if (i21 != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i11 & 48) != 0) {
                i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
            }
            i24 = i22;
            i25 = i12 & 4096;
            if (i25 != 0) {
                i27 = i24 | androidx.media3.exoplayer.a5.S0;
            } else {
                i26 = i24;
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if (c0VarR.D(llVar)) {
                        i28 = 256;
                    } else {
                        i28 = 128;
                    }
                    i26 |= i28;
                }
                i27 = i26;
            }
            if ((i12 & 8192) != 0) {
                if ((i11 & 3072) == 0) {
                    i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
                }
                if ((i18 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    } else {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    d0.h1 h1Var11 = d0.h1.DefaultSpatial;
                    y0VarB = hm.b(h1Var11, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var11, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI1;
                    boolean zK1111 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    i31 = i18 & 14;
                    if (i31 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK1111 | z15;
                    objI2 = c0VarR.i0();
                    if (z16) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    Function0 function118 = (Function0) objI2;
                    boolean zK1112 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                    if (i31 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zK1112 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function1 function119 = (Function1) objI3;
                    objI4 = c0VarR.i0();
                    if (objI4 == aVar.a()) {
                        objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                        c0VarR.Y(objI4);
                    }
                    cVar = (androidx.compose.animation.core.c) objI4;
                    boolean zK1113 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                    if (i31 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | zK1113;
                    objI5 = c0VarR.i0();
                    if (z20) {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function118, txVarW, llVar3, cVar, s0Var, function119, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                    c0Var2 = c0VarR;
                    if (txVarW.t()) {
                        c0Var2.E(748459762);
                        if (i30 <= 256) {
                        }
                        objI6 = c0Var2.i0();
                        if (z21) {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        } else {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        }
                        androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                        c0Var2.A();
                    } else {
                        c0Var2.E(748521266);
                        c0Var2.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVarW;
                    j15 = j18;
                    llVar2 = llVar3;
                    a0Var3 = a0Var4;
                    f13 = f15;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    j14 = j17;
                    f14 = f16;
                    function5 = function8;
                    function4 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j13 = j10;
                    function4 = function3;
                    llVar2 = llVar;
                    f13 = f12;
                    z13 = z11;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    q3Var2 = q3VarH;
                    j14 = j11;
                    f14 = f11;
                    j15 = j12;
                    function5 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 3072;
            if ((i18 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                } else {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                d0.h1 h1Var12 = d0.h1.DefaultSpatial;
                y0VarB = hm.b(h1Var12, c0VarR, 6);
                y0VarB2 = hm.b(h1Var12, c0VarR, 6);
                y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                objI1 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                s0Var = (kotlinx.coroutines.s0) objI1;
                boolean zK1114 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                i31 = i18 & 14;
                if (i31 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK1114 | z15;
                objI2 = c0VarR.i0();
                if (z16) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                Function0 function1110 = (Function0) objI2;
                boolean zK1115 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                if (i31 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zK1115 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function1 function1111 = (Function1) objI3;
                objI4 = c0VarR.i0();
                if (objI4 == aVar.a()) {
                    objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                    c0VarR.Y(objI4);
                }
                cVar = (androidx.compose.animation.core.c) objI4;
                boolean zK1116 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                if (i31 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | zK1116;
                objI5 = c0VarR.i0();
                if (z20) {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                } else {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                }
                rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function1110, txVarW, llVar3, cVar, s0Var, function1111, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                c0Var2 = c0VarR;
                if (txVarW.t()) {
                    c0Var2.E(748459762);
                    if (i30 <= 256) {
                    }
                    objI6 = c0Var2.i0();
                    if (z21) {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    } else {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    }
                    androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                    c0Var2.A();
                } else {
                    c0Var2.E(748521266);
                    c0Var2.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVarW;
                j15 = j18;
                llVar2 = llVar3;
                a0Var3 = a0Var4;
                f13 = f15;
                z13 = z14;
                q3Var2 = q3Var3;
                j13 = j16;
                j14 = j17;
                f14 = f16;
                function5 = function8;
                function4 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j13 = j10;
                function4 = function3;
                llVar2 = llVar;
                f13 = f12;
                z13 = z11;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                q3Var2 = q3VarH;
                j14 = j11;
                f14 = f11;
                j15 = j12;
                function5 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        f12 = f10;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                q3VarH = q3Var;
                if ((i12 & 32) == 0) {
                    i35 = 65536;
                } else {
                    i35 = 65536;
                }
                i13 |= i35;
            } else {
                q3VarH = q3Var;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i34 = 524288;
                } else {
                    i34 = 524288;
                }
                i13 |= i34;
            }
            if ((i10 & 12582912) == 0) {
                int i314 = i13;
                if ((i12 & 128) == 0) {
                    i33 = 4194304;
                } else {
                    i33 = 4194304;
                }
                i18 = i314 | i33;
            } else {
                i18 = i13;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                i18 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.I(f11)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i18 |= i20;
            }
            if ((i10 & 805306368) != 0) {
                if ((i12 & 512) == 0) {
                    i32 = 268435456;
                } else {
                    i32 = 268435456;
                }
                i18 |= i32;
            }
            i21 = i12 & 1024;
            if (i21 != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c0VarR.k0(function2)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i11 & 48) != 0) {
                i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
            }
            i24 = i22;
            i25 = i12 & 4096;
            if (i25 != 0) {
                i27 = i24 | androidx.media3.exoplayer.a5.S0;
            } else {
                i26 = i24;
                if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                    if (c0VarR.D(llVar)) {
                        i28 = 256;
                    } else {
                        i28 = 128;
                    }
                    i26 |= i28;
                }
                i27 = i26;
            }
            if ((i12 & 8192) != 0) {
                if ((i11 & 3072) == 0) {
                    i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
                }
                if ((i18 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    } else {
                        if (i36 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i18 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f12;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 32) != 0) {
                            i18 &= -458753;
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                        }
                        if ((i12 & 64) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i18 &= -3670017;
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                            i18 &= -29360129;
                        } else {
                            jG = j11;
                        }
                        if (i19 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 512) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i18 &= -1879048193;
                        } else {
                            jK = j12;
                        }
                        if (i21 != 0) {
                            function2B = s6.f32739a.b();
                        } else {
                            function2B = function2;
                        }
                        if ((i12 & 2048) != 0) {
                            function6 = a.f26787a;
                            i27 &= -113;
                        } else {
                            function6 = function3;
                        }
                        i29 = i27;
                        if (i25 != 0) {
                            f15 = fL;
                            llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                            i27 = i29;
                        } else {
                            f15 = fL;
                            llVar3 = llVar;
                            f16 = fR;
                            function7 = function6;
                            j16 = jF;
                            z14 = z11;
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarH;
                            function8 = function2B;
                            j17 = jG;
                            j18 = jK;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                    }
                    d0.h1 h1Var13 = d0.h1.DefaultSpatial;
                    y0VarB = hm.b(h1Var13, c0VarR, 6);
                    y0VarB2 = hm.b(h1Var13, c0VarR, 6);
                    y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                    i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                    zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                    objI0 = c0VarR.i0();
                    if (zK0) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.al
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                    objI1 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI1 == aVar.a()) {
                        objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI1);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI1;
                    boolean zK1117 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                    i31 = i18 & 14;
                    if (i31 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zK1117 | z15;
                    objI2 = c0VarR.i0();
                    if (z16) {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function0() { // from class: androidx.compose.material3.bl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.F(txVarW, s0Var, function0);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    Function0 function1112 = (Function0) objI2;
                    boolean zK1118 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                    if (i31 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zK1118 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.kk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    Function1 function1113 = (Function1) objI3;
                    objI4 = c0VarR.i0();
                    if (objI4 == aVar.a()) {
                        objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                        c0VarR.Y(objI4);
                    }
                    cVar = (androidx.compose.animation.core.c) objI4;
                    boolean zK1119 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                    if (i31 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | zK1119;
                    objI5 = c0VarR.i0();
                    if (z20) {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    } else {
                        objI5 = new Function0() { // from class: androidx.compose.material3.lk
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return cl.C(txVarW, s0Var, cVar, function0);
                            }
                        };
                        c0VarR.Y(objI5);
                    }
                    rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function1112, txVarW, llVar3, cVar, s0Var, function1113, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                    c0Var2 = c0VarR;
                    if (txVarW.t()) {
                        c0Var2.E(748459762);
                        if (i30 <= 256) {
                        }
                        objI6 = c0Var2.i0();
                        if (z21) {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        } else {
                            objI6 = new f(txVarW, null);
                            c0Var2.Y(objI6);
                        }
                        androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                        c0Var2.A();
                    } else {
                        c0Var2.E(748521266);
                        c0Var2.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVarW;
                    j15 = j18;
                    llVar2 = llVar3;
                    a0Var3 = a0Var4;
                    f13 = f15;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    j13 = j16;
                    j14 = j17;
                    f14 = f16;
                    function5 = function8;
                    function4 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    j13 = j10;
                    function4 = function3;
                    llVar2 = llVar;
                    f13 = f12;
                    z13 = z11;
                    a0Var3 = a0Var2;
                    txVar2 = txVarW;
                    q3Var2 = q3VarH;
                    j14 = j11;
                    f14 = f11;
                    j15 = j12;
                    function5 = function2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i27 |= 3072;
            if ((i18 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                } else {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                d0.h1 h1Var14 = d0.h1.DefaultSpatial;
                y0VarB = hm.b(h1Var14, c0VarR, 6);
                y0VarB2 = hm.b(h1Var14, c0VarR, 6);
                y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                objI1 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                s0Var = (kotlinx.coroutines.s0) objI1;
                boolean zK11110 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                i31 = i18 & 14;
                if (i31 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK11110 | z15;
                objI2 = c0VarR.i0();
                if (z16) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                Function0 function1114 = (Function0) objI2;
                boolean zK11111 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                if (i31 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zK11111 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function1 function1115 = (Function1) objI3;
                objI4 = c0VarR.i0();
                if (objI4 == aVar.a()) {
                    objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                    c0VarR.Y(objI4);
                }
                cVar = (androidx.compose.animation.core.c) objI4;
                boolean zK11112 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                if (i31 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | zK11112;
                objI5 = c0VarR.i0();
                if (z20) {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                } else {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                }
                rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function1114, txVarW, llVar3, cVar, s0Var, function1115, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                c0Var2 = c0VarR;
                if (txVarW.t()) {
                    c0Var2.E(748459762);
                    if (i30 <= 256) {
                    }
                    objI6 = c0Var2.i0();
                    if (z21) {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    } else {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    }
                    androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                    c0Var2.A();
                } else {
                    c0Var2.E(748521266);
                    c0Var2.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVarW;
                j15 = j18;
                llVar2 = llVar3;
                a0Var3 = a0Var4;
                f13 = f15;
                z13 = z14;
                q3Var2 = q3Var3;
                j13 = j16;
                j14 = j17;
                f14 = f16;
                function5 = function8;
                function4 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j13 = j10;
                function4 = function3;
                llVar2 = llVar;
                f13 = f12;
                z13 = z11;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                q3Var2 = q3VarH;
                j14 = j11;
                f14 = f11;
                j15 = j12;
                function5 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        z11 = z10;
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            q3VarH = q3Var;
            if ((i12 & 32) == 0) {
                i35 = 65536;
            } else {
                i35 = 65536;
            }
            i13 |= i35;
        } else {
            q3VarH = q3Var;
        }
        if ((i10 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i34 = 524288;
            } else {
                i34 = 524288;
            }
            i13 |= i34;
        }
        if ((i10 & 12582912) == 0) {
            int i315 = i13;
            if ((i12 & 128) == 0) {
                i33 = 4194304;
            } else {
                i33 = 4194304;
            }
            i18 = i315 | i33;
        } else {
            i18 = i13;
        }
        i19 = i12 & 256;
        if (i19 != 0) {
            i18 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.I(f11)) {
                i20 = 67108864;
            } else {
                i20 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i18 |= i20;
        }
        if ((i10 & 805306368) != 0) {
            if ((i12 & 512) == 0) {
                i32 = 268435456;
            } else {
                i32 = 268435456;
            }
            i18 |= i32;
        }
        i21 = i12 & 1024;
        if (i21 != 0) {
            i22 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c0VarR.k0(function2)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i11 | i23;
        } else {
            i22 = i11;
        }
        if ((i11 & 48) != 0) {
            i22 |= ((i12 & 2048) == 0 || !c0VarR.k0(function3)) ? 16 : 32;
        }
        i24 = i22;
        i25 = i12 & 4096;
        if (i25 != 0) {
            i27 = i24 | androidx.media3.exoplayer.a5.S0;
        } else {
            i26 = i24;
            if ((i11 & androidx.media3.exoplayer.a5.S0) != 0) {
                if (c0VarR.D(llVar)) {
                    i28 = 256;
                } else {
                    i28 = 128;
                }
                i26 |= i28;
            }
            i27 = i26;
        }
        if ((i12 & 8192) != 0) {
            if ((i11 & 3072) == 0) {
                i27 |= c0VarR.k0(nVar) ? 2048 : 1024;
            }
            if ((i18 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                } else {
                    if (i36 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i18 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f12;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 32) != 0) {
                        i18 &= -458753;
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                    }
                    if ((i12 & 64) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i18 &= -3670017;
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                        i18 &= -29360129;
                    } else {
                        jG = j11;
                    }
                    if (i19 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 512) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i18 &= -1879048193;
                    } else {
                        jK = j12;
                    }
                    if (i21 != 0) {
                        function2B = s6.f32739a.b();
                    } else {
                        function2B = function2;
                    }
                    if ((i12 & 2048) != 0) {
                        function6 = a.f26787a;
                        i27 &= -113;
                    } else {
                        function6 = function3;
                    }
                    i29 = i27;
                    if (i25 != 0) {
                        f15 = fL;
                        llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                        i27 = i29;
                    } else {
                        f15 = fL;
                        llVar3 = llVar;
                        f16 = fR;
                        function7 = function6;
                        j16 = jF;
                        z14 = z11;
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarH;
                        function8 = function2B;
                        j17 = jG;
                        j18 = jK;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
                }
                d0.h1 h1Var15 = d0.h1.DefaultSpatial;
                y0VarB = hm.b(h1Var15, c0VarR, 6);
                y0VarB2 = hm.b(h1Var15, c0VarR, 6);
                y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
                i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
                zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
                objI0 = c0VarR.i0();
                if (zK0) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.al
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
                objI1 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI1 == aVar.a()) {
                    objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI1);
                }
                s0Var = (kotlinx.coroutines.s0) objI1;
                boolean zK11113 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
                i31 = i18 & 14;
                if (i31 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zK11113 | z15;
                objI2 = c0VarR.i0();
                if (z16) {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function0() { // from class: androidx.compose.material3.bl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.F(txVarW, s0Var, function0);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                Function0 function1116 = (Function0) objI2;
                boolean zK11114 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
                if (i31 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zK11114 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.kk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                        }
                    };
                    c0VarR.Y(objI3);
                }
                Function1 function1117 = (Function1) objI3;
                objI4 = c0VarR.i0();
                if (objI4 == aVar.a()) {
                    objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                    c0VarR.Y(objI4);
                }
                cVar = (androidx.compose.animation.core.c) objI4;
                boolean zK11115 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
                if (i31 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | zK11115;
                objI5 = c0VarR.i0();
                if (z20) {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                } else {
                    objI5 = new Function0() { // from class: androidx.compose.material3.lk
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return cl.C(txVarW, s0Var, cVar, function0);
                        }
                    };
                    c0VarR.Y(objI5);
                }
                rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function1116, txVarW, llVar3, cVar, s0Var, function1117, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
                c0Var2 = c0VarR;
                if (txVarW.t()) {
                    c0Var2.E(748459762);
                    if (i30 <= 256) {
                    }
                    objI6 = c0Var2.i0();
                    if (z21) {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    } else {
                        objI6 = new f(txVarW, null);
                        c0Var2.Y(objI6);
                    }
                    androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                    c0Var2.A();
                } else {
                    c0Var2.E(748521266);
                    c0Var2.A();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVarW;
                j15 = j18;
                llVar2 = llVar3;
                a0Var3 = a0Var4;
                f13 = f15;
                z13 = z14;
                q3Var2 = q3Var3;
                j13 = j16;
                j14 = j17;
                f14 = f16;
                function5 = function8;
                function4 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                j13 = j10;
                function4 = function3;
                llVar2 = llVar;
                f13 = f12;
                z13 = z11;
                a0Var3 = a0Var2;
                txVar2 = txVarW;
                q3Var2 = q3VarH;
                j14 = j11;
                f14 = f11;
                j15 = j12;
                function5 = function2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i27 |= 3072;
        if ((i18 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (c0VarR.h(z12, i18 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i36 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    i18 &= -897;
                    txVarW = W(false, null, c0VarR, 0, 3);
                }
                if (i14 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f12;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if ((i12 & 32) != 0) {
                    i18 &= -458753;
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                }
                if ((i12 & 64) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i18 &= -3670017;
                } else {
                    jF = j10;
                }
                if ((i12 & 128) != 0) {
                    jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jG = j11;
                }
                if (i19 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 512) != 0) {
                    jK = x2.f34346a.k(c0VarR, 6);
                    i18 &= -1879048193;
                } else {
                    jK = j12;
                }
                if (i21 != 0) {
                    function2B = s6.f32739a.b();
                } else {
                    function2B = function2;
                }
                if ((i12 & 2048) != 0) {
                    function6 = a.f26787a;
                    i27 &= -113;
                } else {
                    function6 = function3;
                }
                i29 = i27;
                if (i25 != 0) {
                    f15 = fL;
                    llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                    f16 = fR;
                    function7 = function6;
                    j16 = jF;
                    z14 = z11;
                    a0Var4 = a0Var2;
                    q3Var3 = q3VarH;
                    function8 = function2B;
                    j17 = jG;
                    j18 = jK;
                    i27 = i29;
                } else {
                    f15 = fL;
                    llVar3 = llVar;
                    f16 = fR;
                    function7 = function6;
                    j16 = jF;
                    z14 = z11;
                    a0Var4 = a0Var2;
                    q3Var3 = q3VarH;
                    function8 = function2B;
                    j17 = jG;
                    j18 = jK;
                }
            } else {
                if (i36 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    i18 &= -897;
                    txVarW = W(false, null, c0VarR, 0, 3);
                }
                if (i14 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f12;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if ((i12 & 32) != 0) {
                    i18 &= -458753;
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                }
                if ((i12 & 64) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i18 &= -3670017;
                } else {
                    jF = j10;
                }
                if ((i12 & 128) != 0) {
                    jG = o6.g(jF, c0VarR, (i18 >> 18) & 14);
                    i18 &= -29360129;
                } else {
                    jG = j11;
                }
                if (i19 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 512) != 0) {
                    jK = x2.f34346a.k(c0VarR, 6);
                    i18 &= -1879048193;
                } else {
                    jK = j12;
                }
                if (i21 != 0) {
                    function2B = s6.f32739a.b();
                } else {
                    function2B = function2;
                }
                if ((i12 & 2048) != 0) {
                    function6 = a.f26787a;
                    i27 &= -113;
                } else {
                    function6 = function3;
                }
                i29 = i27;
                if (i25 != 0) {
                    f15 = fL;
                    llVar3 = new ll(false, false, 3, (DefaultConstructorMarker) null);
                    f16 = fR;
                    function7 = function6;
                    j16 = jF;
                    z14 = z11;
                    a0Var4 = a0Var2;
                    q3Var3 = q3VarH;
                    function8 = function2B;
                    j17 = jG;
                    j18 = jK;
                    i27 = i29;
                } else {
                    f15 = fL;
                    llVar3 = llVar;
                    f16 = fR;
                    function7 = function6;
                    j16 = jF;
                    z14 = z11;
                    a0Var4 = a0Var2;
                    q3Var3 = q3VarH;
                    function8 = function2B;
                    j17 = jG;
                    j18 = jK;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1904798512, i18, i27, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)");
            }
            d0.h1 h1Var16 = d0.h1.DefaultSpatial;
            y0VarB = hm.b(h1Var16, c0VarR, 6);
            y0VarB2 = hm.b(h1Var16, c0VarR, 6);
            y0VarB3 = hm.b(d0.h1.FastEffects, c0VarR, 6);
            i30 = (i18 & 896) ^ androidx.media3.exoplayer.a5.S0;
            zK0 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(y0VarB2) | c0VarR.k0(y0VarB3) | c0VarR.k0(y0VarB);
            objI0 = c0VarR.i0();
            if (zK0) {
                objI0 = new Function0() { // from class: androidx.compose.material3.al
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: androidx.compose.material3.al
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cl.B(txVarW, y0VarB2, y0VarB3, y0VarB);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.m((Function0) objI0, c0VarR, 0);
            objI1 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI1 == aVar.a()) {
                objI1 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI1);
            }
            s0Var = (kotlinx.coroutines.s0) objI1;
            boolean zK11116 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var);
            i31 = i18 & 14;
            if (i31 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zK11116 | z15;
            objI2 = c0VarR.i0();
            if (z16) {
                objI2 = new Function0() { // from class: androidx.compose.material3.bl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cl.F(txVarW, s0Var, function0);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function0() { // from class: androidx.compose.material3.bl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cl.F(txVarW, s0Var, function0);
                    }
                };
                c0VarR.Y(objI2);
            }
            Function0 function1118 = (Function0) objI2;
            boolean zK11117 = c0VarR.k0(s0Var) | ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256);
            if (i31 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zK11117 | z17;
            objI3 = c0VarR.i0();
            if (z18) {
                objI3 = new Function1() { // from class: androidx.compose.material3.kk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                    }
                };
                c0VarR.Y(objI3);
            } else {
                objI3 = new Function1() { // from class: androidx.compose.material3.kk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.H(s0Var, txVarW, function0, ((Float) obj).floatValue());
                    }
                };
                c0VarR.Y(objI3);
            }
            Function1 function1119 = (Function1) objI3;
            objI4 = c0VarR.i0();
            if (objI4 == aVar.a()) {
                objI4 = androidx.compose.animation.core.d.b(0.0f, 0.0f, 2, null);
                c0VarR.Y(objI4);
            }
            cVar = (androidx.compose.animation.core.c) objI4;
            boolean zK11118 = ((i30 <= 256 && c0VarR.D(txVarW)) || (i18 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.k0(s0Var) | c0VarR.k0(cVar);
            if (i31 == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = z19 | zK11118;
            objI5 = c0VarR.i0();
            if (z20) {
                objI5 = new Function0() { // from class: androidx.compose.material3.lk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cl.C(txVarW, s0Var, cVar, function0);
                    }
                };
                c0VarR.Y(objI5);
            } else {
                objI5 = new Function0() { // from class: androidx.compose.material3.lk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cl.C(txVarW, s0Var, cVar, function0);
                    }
                };
                c0VarR.Y(objI5);
            }
            rl.g((Function0) objI5, j17, llVar3, cVar, androidx.compose.runtime.internal.w.e(1010026864, true, new e(j18, function1118, txVarW, llVar3, cVar, s0Var, function1119, a0Var4, f15, z14, q3Var3, j16, j17, f16, function8, function7, nVar), c0VarR, 54), c0VarR, (i27 & 896) | ((i18 >> 18) & com.planner5d.library.engine.input.f.b.B) | 24576 | (androidx.compose.animation.core.c.f12810o << 9));
            c0Var2 = c0VarR;
            if (txVarW.t()) {
                c0Var2.E(748459762);
                if (i30 <= 256) {
                }
                objI6 = c0Var2.i0();
                if (z21) {
                    objI6 = new f(txVarW, null);
                    c0Var2.Y(objI6);
                } else {
                    objI6 = new f(txVarW, null);
                    c0Var2.Y(objI6);
                }
                androidx.compose.runtime.b2.i(txVarW, (Function2) objI6, c0Var2, (i18 >> 6) & 14);
                c0Var2.A();
            } else {
                c0Var2.E(748521266);
                c0Var2.A();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            txVar2 = txVarW;
            j15 = j18;
            llVar2 = llVar3;
            a0Var3 = a0Var4;
            f13 = f15;
            z13 = z14;
            q3Var2 = q3Var3;
            j13 = j16;
            j14 = j17;
            f14 = f16;
            function5 = function8;
            function4 = function7;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            j13 = j10;
            function4 = function3;
            llVar2 = llVar;
            f13 = f12;
            z13 = z11;
            a0Var3 = a0Var2;
            txVar2 = txVarW;
            q3Var2 = q3VarH;
            j14 = j11;
            f14 = f11;
            j15 = j12;
            function5 = function2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return cl.E(function0, a0Var3, txVar2, f13, z13, q3Var2, j13, j14, f14, j15, function5, function4, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:121:0x015f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0166  */
    /* JADX WARN: Code duplicated, block: B:125:0x016a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0174  */
    /* JADX WARN: Code duplicated, block: B:128:0x0177  */
    /* JADX WARN: Code duplicated, block: B:130:0x017c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0190  */
    /* JADX WARN: Code duplicated, block: B:139:0x0198  */
    /* JADX WARN: Code duplicated, block: B:140:0x019b  */
    /* JADX WARN: Code duplicated, block: B:144:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:175:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0212  */
    /* JADX WARN: Code duplicated, block: B:179:0x021a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0224  */
    /* JADX WARN: Code duplicated, block: B:182:0x022b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0232  */
    /* JADX WARN: Code duplicated, block: B:186:0x023d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0242  */
    /* JADX WARN: Code duplicated, block: B:192:0x0250  */
    /* JADX WARN: Code duplicated, block: B:194:0x025e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0264  */
    /* JADX WARN: Code duplicated, block: B:198:0x026a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0276  */
    /* JADX WARN: Code duplicated, block: B:201:0x027a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0281  */
    /* JADX WARN: Code duplicated, block: B:205:0x0287  */
    /* JADX WARN: Code duplicated, block: B:206:0x028c  */
    /* JADX WARN: Code duplicated, block: B:208:0x0290  */
    /* JADX WARN: Code duplicated, block: B:210:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:214:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:217:0x031b  */
    /* JADX WARN: Code duplicated, block: B:219:0x032b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0348  */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for Binary compatibility. Use overload with sheetGesturesEnabled param.")
    @af
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final /* synthetic */ void u(final Function0 function0, androidx.compose.ui.a0 a0Var, tx txVar, float f10, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, long j12, Function2 function2, Function2 function3, ll llVar, final pj.n nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        tx txVarW;
        int i14;
        int i15;
        androidx.compose.ui.graphics.q3 q3Var2;
        long jF;
        long jG;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final float f12;
        ll llVarA;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j13;
        final tx txVar2;
        final long j14;
        final float f13;
        long j15;
        final Function2 function4;
        final Function2 function5;
        androidx.compose.runtime.s5 s5VarT;
        float fL;
        androidx.compose.ui.graphics.q3 q3VarH;
        float fR;
        long jK;
        Function2 function2A;
        Function2 function6;
        Function2 function7;
        androidx.compose.ui.graphics.q3 q3Var4;
        tx txVar3;
        float f14;
        float f15;
        androidx.compose.ui.a0 a0Var3;
        long j16;
        Function2 function8;
        int i25;
        int i26;
        int i27;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(953901324);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i28 = i12 & 2;
        if (i28 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    txVarW = txVar;
                    int i29 = c0VarR.D(txVarW) ? 256 : 128;
                    i13 |= i29;
                } else {
                    txVarW = txVar;
                }
                i13 |= i29;
            } else {
                txVarW = txVar;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.I(f10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i10 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        q3Var2 = q3Var;
                        int i30 = c0VarR.D(q3Var2) ? 16384 : 8192;
                        i13 |= i30;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i13 |= i30;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    jF = j10;
                    if ((i12 & 32) == 0 || !c0VarR.L(jF)) {
                        i27 = 65536;
                    } else {
                        i27 = 131072;
                    }
                    i13 |= i27;
                } else {
                    jF = j10;
                }
                if ((i10 & 1572864) == 0) {
                    jG = j11;
                    if ((i12 & 64) == 0 || !c0VarR.L(jG)) {
                        i26 = 524288;
                    } else {
                        i26 = 1048576;
                    }
                    i13 |= i26;
                } else {
                    jG = j11;
                }
                i16 = i12 & 128;
                if (i16 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f11)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0 || !c0VarR.L(j12)) {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    } else {
                        i25 = 67108864;
                    }
                    i13 |= i25;
                }
                i18 = i12 & 512;
                if (i18 != 0) {
                    if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                        i13 |= i19;
                    }
                    if ((i11 & 6) == 0) {
                        i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
                    } else {
                        i20 = i11;
                    }
                    i21 = i12 & 2048;
                    if (i21 != 0) {
                        i20 |= 48;
                    } else if ((i11 & 48) != 0) {
                        if (c0VarR.D(llVar)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i20 |= i22;
                    }
                    i23 = i20;
                    if ((i12 & 4096) != 0) {
                        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i24 = 256;
                            } else {
                                i24 = 128;
                            }
                            i23 |= i24;
                        }
                        if ((i13 & 306783379) == 306783378 || (i23 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i13 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i28 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                    txVarW = W(false, null, c0VarR, 0, 3);
                                }
                                if (i14 != 0) {
                                    fL = x2.f34346a.l();
                                } else {
                                    fL = f10;
                                }
                                if ((i12 & 16) != 0) {
                                    q3VarH = x2.f34346a.h(c0VarR, 6);
                                    i13 &= -57345;
                                } else {
                                    q3VarH = q3Var2;
                                }
                                if ((i12 & 32) != 0) {
                                    jF = x2.f34346a.f(c0VarR, 6);
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                    i13 &= -3670017;
                                }
                                if (i16 != 0) {
                                    fR = androidx.compose.ui.unit.h.r(0);
                                } else {
                                    fR = f11;
                                }
                                if ((i12 & 256) != 0) {
                                    jK = x2.f34346a.k(c0VarR, 6);
                                    i13 = (-234881025) & i13;
                                } else {
                                    jK = j12;
                                }
                                if (i18 != 0) {
                                    function2A = s6.f32739a.a();
                                } else {
                                    function2A = function2;
                                }
                                if ((i12 & 1024) != 0) {
                                    function6 = g.f26813a;
                                    i23 &= -15;
                                } else {
                                    function6 = function3;
                                }
                                if (i21 != 0) {
                                    llVarA = ek.f27370a.a();
                                } else {
                                    llVarA = llVar;
                                }
                                function7 = function6;
                                q3Var4 = q3VarH;
                                txVar3 = txVarW;
                                Function2 function9 = function2A;
                                f14 = fL;
                                long j17 = jG;
                                f15 = fR;
                                a0Var3 = a0Var2;
                                j16 = j17;
                                j15 = jK;
                                function8 = function9;
                            } else {
                                c0VarR.u();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                if ((i12 & 16) != 0) {
                                    i13 &= -57345;
                                }
                                if ((i12 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                if ((i12 & 64) != 0) {
                                    i13 &= -3670017;
                                }
                                if ((i12 & 256) != 0) {
                                    i13 &= -234881025;
                                }
                                if ((i12 & 1024) != 0) {
                                    i23 &= -15;
                                }
                                function8 = function2;
                                function7 = function3;
                                llVarA = llVar;
                                q3Var4 = q3Var2;
                                a0Var3 = a0Var2;
                                txVar3 = txVarW;
                                j16 = jG;
                                f14 = f10;
                                f15 = f11;
                                j15 = j12;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                            }
                            int i31 = i13 << 3;
                            int i32 = i23 << 3;
                            c0Var2 = c0VarR;
                            t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i31 & 458752) | (i31 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | (i31 & 1879048192), ((i13 >> 27) & 14) | (i32 & com.planner5d.library.engine.input.f.b.B) | (i32 & 896) | (i32 & 7168), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            long j18 = j16;
                            a0Var2 = a0Var3;
                            q3Var3 = q3Var4;
                            j14 = j18;
                            txVar2 = txVar3;
                            f12 = f14;
                            j13 = jF;
                            f13 = f15;
                            function4 = function8;
                            function5 = function7;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            f12 = f10;
                            llVarA = llVar;
                            q3Var3 = q3Var2;
                            j13 = jF;
                            txVar2 = txVarW;
                            j14 = jG;
                            f13 = f11;
                            j15 = j12;
                            function4 = function2;
                            function5 = function3;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            final ll llVar2 = llVarA;
                            final androidx.compose.ui.a0 a0Var4 = a0Var2;
                            final long j19 = j15;
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.J(function0, a0Var4, txVar2, f12, q3Var3, j13, j14, f13, j19, function4, function5, llVar2, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i23 |= androidx.media3.exoplayer.a5.S0;
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function10 = function2A;
                            f14 = fL;
                            long j110 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j110;
                            j15 = jK;
                            function8 = function10;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function11 = function2A;
                            f14 = fL;
                            long j111 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j111;
                            j15 = jK;
                            function8 = function11;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                        }
                        int i33 = i13 << 3;
                        int i34 = i23 << 3;
                        c0Var2 = c0VarR;
                        t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i33 & 458752) | (i33 & 3670016) | (i33 & 29360128) | (i33 & 234881024) | (i33 & 1879048192), ((i13 >> 27) & 14) | (i34 & com.planner5d.library.engine.input.f.b.B) | (i34 & 896) | (i34 & 7168), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        long j112 = j16;
                        a0Var2 = a0Var3;
                        q3Var3 = q3Var4;
                        j14 = j112;
                        txVar2 = txVar3;
                        f12 = f14;
                        j13 = jF;
                        f13 = f15;
                        function4 = function8;
                        function5 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        llVarA = llVar;
                        q3Var3 = q3Var2;
                        j13 = jF;
                        txVar2 = txVarW;
                        j14 = jG;
                        f13 = f11;
                        j15 = j12;
                        function4 = function2;
                        function5 = function3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final ll llVar3 = llVarA;
                        final androidx.compose.ui.a0 a0Var5 = a0Var2;
                        final long j113 = j15;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.J(function0, a0Var5, txVar2, f12, q3Var3, j13, j14, f13, j113, function4, function5, llVar3, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 805306368;
                if ((i11 & 6) == 0) {
                    i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
                } else {
                    i20 = i11;
                }
                i21 = i12 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.D(llVar)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                if ((i12 & 4096) != 0) {
                    if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i24 = 256;
                        } else {
                            i24 = 128;
                        }
                        i23 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function12 = function2A;
                            f14 = fL;
                            long j114 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j114;
                            j15 = jK;
                            function8 = function12;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function13 = function2A;
                            f14 = fL;
                            long j115 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j115;
                            j15 = jK;
                            function8 = function13;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                        }
                        int i35 = i13 << 3;
                        int i36 = i23 << 3;
                        c0Var2 = c0VarR;
                        t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i35 & 458752) | (i35 & 3670016) | (i35 & 29360128) | (i35 & 234881024) | (i35 & 1879048192), ((i13 >> 27) & 14) | (i36 & com.planner5d.library.engine.input.f.b.B) | (i36 & 896) | (i36 & 7168), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        long j116 = j16;
                        a0Var2 = a0Var3;
                        q3Var3 = q3Var4;
                        j14 = j116;
                        txVar2 = txVar3;
                        f12 = f14;
                        j13 = jF;
                        f13 = f15;
                        function4 = function8;
                        function5 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        llVarA = llVar;
                        q3Var3 = q3Var2;
                        j13 = jF;
                        txVar2 = txVarW;
                        j14 = jG;
                        f13 = f11;
                        j15 = j12;
                        function4 = function2;
                        function5 = function3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final ll llVar4 = llVarA;
                        final androidx.compose.ui.a0 a0Var6 = a0Var2;
                        final long j117 = j15;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.J(function0, a0Var6, txVar2, f12, q3Var3, j13, j14, f13, j117, function4, function5, llVar4, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i23 |= androidx.media3.exoplayer.a5.S0;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function14 = function2A;
                        f14 = fL;
                        long j118 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j118;
                        j15 = jK;
                        function8 = function14;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function15 = function2A;
                        f14 = fL;
                        long j119 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j119;
                        j15 = jK;
                        function8 = function15;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                    }
                    int i37 = i13 << 3;
                    int i38 = i23 << 3;
                    c0Var2 = c0VarR;
                    t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i37 & 458752) | (i37 & 3670016) | (i37 & 29360128) | (i37 & 234881024) | (i37 & 1879048192), ((i13 >> 27) & 14) | (i38 & com.planner5d.library.engine.input.f.b.B) | (i38 & 896) | (i38 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    long j1110 = j16;
                    a0Var2 = a0Var3;
                    q3Var3 = q3Var4;
                    j14 = j1110;
                    txVar2 = txVar3;
                    f12 = f14;
                    j13 = jF;
                    f13 = f15;
                    function4 = function8;
                    function5 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    llVarA = llVar;
                    q3Var3 = q3Var2;
                    j13 = jF;
                    txVar2 = txVarW;
                    j14 = jG;
                    f13 = f11;
                    j15 = j12;
                    function4 = function2;
                    function5 = function3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final ll llVar5 = llVarA;
                    final androidx.compose.ui.a0 a0Var7 = a0Var2;
                    final long j1111 = j15;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.J(function0, a0Var7, txVar2, f12, q3Var3, j13, j14, f13, j1111, function4, function5, llVar5, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i13 |= i30;
                } else {
                    q3Var2 = q3Var;
                }
                i13 |= i30;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                jF = j10;
                if ((i12 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i13 |= i27;
            } else {
                jF = j10;
            }
            if ((i10 & 1572864) == 0) {
                jG = j11;
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            } else {
                jG = j11;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            i18 = i12 & 512;
            if (i18 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                if ((i11 & 6) == 0) {
                    i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
                } else {
                    i20 = i11;
                }
                i21 = i12 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.D(llVar)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                if ((i12 & 4096) != 0) {
                    if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i24 = 256;
                        } else {
                            i24 = 128;
                        }
                        i23 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function16 = function2A;
                            f14 = fL;
                            long j1112 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j1112;
                            j15 = jK;
                            function8 = function16;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function17 = function2A;
                            f14 = fL;
                            long j1113 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j1113;
                            j15 = jK;
                            function8 = function17;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                        }
                        int i39 = i13 << 3;
                        int i310 = i23 << 3;
                        c0Var2 = c0VarR;
                        t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i39 & 458752) | (i39 & 3670016) | (i39 & 29360128) | (i39 & 234881024) | (i39 & 1879048192), ((i13 >> 27) & 14) | (i310 & com.planner5d.library.engine.input.f.b.B) | (i310 & 896) | (i310 & 7168), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        long j1114 = j16;
                        a0Var2 = a0Var3;
                        q3Var3 = q3Var4;
                        j14 = j1114;
                        txVar2 = txVar3;
                        f12 = f14;
                        j13 = jF;
                        f13 = f15;
                        function4 = function8;
                        function5 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        llVarA = llVar;
                        q3Var3 = q3Var2;
                        j13 = jF;
                        txVar2 = txVarW;
                        j14 = jG;
                        f13 = f11;
                        j15 = j12;
                        function4 = function2;
                        function5 = function3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final ll llVar6 = llVarA;
                        final androidx.compose.ui.a0 a0Var8 = a0Var2;
                        final long j1115 = j15;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.J(function0, a0Var8, txVar2, f12, q3Var3, j13, j14, f13, j1115, function4, function5, llVar6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i23 |= androidx.media3.exoplayer.a5.S0;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function18 = function2A;
                        f14 = fL;
                        long j1116 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j1116;
                        j15 = jK;
                        function8 = function18;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function19 = function2A;
                        f14 = fL;
                        long j1117 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j1117;
                        j15 = jK;
                        function8 = function19;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                    }
                    int i311 = i13 << 3;
                    int i312 = i23 << 3;
                    c0Var2 = c0VarR;
                    t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i311 & 458752) | (i311 & 3670016) | (i311 & 29360128) | (i311 & 234881024) | (i311 & 1879048192), ((i13 >> 27) & 14) | (i312 & com.planner5d.library.engine.input.f.b.B) | (i312 & 896) | (i312 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    long j1118 = j16;
                    a0Var2 = a0Var3;
                    q3Var3 = q3Var4;
                    j14 = j1118;
                    txVar2 = txVar3;
                    f12 = f14;
                    j13 = jF;
                    f13 = f15;
                    function4 = function8;
                    function5 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    llVarA = llVar;
                    q3Var3 = q3Var2;
                    j13 = jF;
                    txVar2 = txVarW;
                    j14 = jG;
                    f13 = f11;
                    j15 = j12;
                    function4 = function2;
                    function5 = function3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final ll llVar7 = llVarA;
                    final androidx.compose.ui.a0 a0Var9 = a0Var2;
                    final long j1119 = j15;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.J(function0, a0Var9, txVar2, f12, q3Var3, j13, j14, f13, j1119, function4, function5, llVar7, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i11 & 6) == 0) {
                i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
            } else {
                i20 = i11;
            }
            i21 = i12 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.D(llVar)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            if ((i12 & 4096) != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i23 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function110 = function2A;
                        f14 = fL;
                        long j11110 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j11110;
                        j15 = jK;
                        function8 = function110;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function111 = function2A;
                        f14 = fL;
                        long j11111 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j11111;
                        j15 = jK;
                        function8 = function111;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                    }
                    int i313 = i13 << 3;
                    int i314 = i23 << 3;
                    c0Var2 = c0VarR;
                    t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i313 & 458752) | (i313 & 3670016) | (i313 & 29360128) | (i313 & 234881024) | (i313 & 1879048192), ((i13 >> 27) & 14) | (i314 & com.planner5d.library.engine.input.f.b.B) | (i314 & 896) | (i314 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    long j11112 = j16;
                    a0Var2 = a0Var3;
                    q3Var3 = q3Var4;
                    j14 = j11112;
                    txVar2 = txVar3;
                    f12 = f14;
                    j13 = jF;
                    f13 = f15;
                    function4 = function8;
                    function5 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    llVarA = llVar;
                    q3Var3 = q3Var2;
                    j13 = jF;
                    txVar2 = txVarW;
                    j14 = jG;
                    f13 = f11;
                    j15 = j12;
                    function4 = function2;
                    function5 = function3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final ll llVar8 = llVarA;
                    final androidx.compose.ui.a0 a0Var10 = a0Var2;
                    final long j11113 = j15;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.J(function0, a0Var10, txVar2, f12, q3Var3, j13, j14, f13, j11113, function4, function5, llVar8, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i23 |= androidx.media3.exoplayer.a5.S0;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function112 = function2A;
                    f14 = fL;
                    long j11114 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j11114;
                    j15 = jK;
                    function8 = function112;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function113 = function2A;
                    f14 = fL;
                    long j11115 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j11115;
                    j15 = jK;
                    function8 = function113;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                }
                int i315 = i13 << 3;
                int i316 = i23 << 3;
                c0Var2 = c0VarR;
                t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i315 & 458752) | (i315 & 3670016) | (i315 & 29360128) | (i315 & 234881024) | (i315 & 1879048192), ((i13 >> 27) & 14) | (i316 & com.planner5d.library.engine.input.f.b.B) | (i316 & 896) | (i316 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                long j11116 = j16;
                a0Var2 = a0Var3;
                q3Var3 = q3Var4;
                j14 = j11116;
                txVar2 = txVar3;
                f12 = f14;
                j13 = jF;
                f13 = f15;
                function4 = function8;
                function5 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                llVarA = llVar;
                q3Var3 = q3Var2;
                j13 = jF;
                txVar2 = txVarW;
                j14 = jG;
                f13 = f11;
                j15 = j12;
                function4 = function2;
                function5 = function3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final ll llVar9 = llVarA;
                final androidx.compose.ui.a0 a0Var11 = a0Var2;
                final long j11117 = j15;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.J(function0, a0Var11, txVar2, f12, q3Var3, j13, j14, f13, j11117, function4, function5, llVar9, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                txVarW = txVar;
                if (c0VarR.D(txVarW)) {
                }
                i13 |= i29;
            } else {
                txVarW = txVar;
            }
            i13 |= i29;
        } else {
            txVarW = txVar;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.I(f10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i13 |= i30;
                } else {
                    q3Var2 = q3Var;
                }
                i13 |= i30;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                jF = j10;
                if ((i12 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i13 |= i27;
            } else {
                jF = j10;
            }
            if ((i10 & 1572864) == 0) {
                jG = j11;
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            } else {
                jG = j11;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i25;
            }
            i18 = i12 & 512;
            if (i18 != 0) {
                if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                    i13 |= i19;
                }
                if ((i11 & 6) == 0) {
                    i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
                } else {
                    i20 = i11;
                }
                i21 = i12 & 2048;
                if (i21 != 0) {
                    i20 |= 48;
                } else if ((i11 & 48) != 0) {
                    if (c0VarR.D(llVar)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i20 |= i22;
                }
                i23 = i20;
                if ((i12 & 4096) != 0) {
                    if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i24 = 256;
                        } else {
                            i24 = 128;
                        }
                        i23 |= i24;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function114 = function2A;
                            f14 = fL;
                            long j11118 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j11118;
                            j15 = jK;
                            function8 = function114;
                        } else {
                            if (i28 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                                txVarW = W(false, null, c0VarR, 0, 3);
                            }
                            if (i14 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if ((i12 & 16) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i13 &= -57345;
                            } else {
                                q3VarH = q3Var2;
                            }
                            if ((i12 & 32) != 0) {
                                jF = x2.f34346a.f(c0VarR, 6);
                                i13 &= -458753;
                            }
                            if ((i12 & 64) != 0) {
                                jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                                i13 &= -3670017;
                            }
                            if (i16 != 0) {
                                fR = androidx.compose.ui.unit.h.r(0);
                            } else {
                                fR = f11;
                            }
                            if ((i12 & 256) != 0) {
                                jK = x2.f34346a.k(c0VarR, 6);
                                i13 = (-234881025) & i13;
                            } else {
                                jK = j12;
                            }
                            if (i18 != 0) {
                                function2A = s6.f32739a.a();
                            } else {
                                function2A = function2;
                            }
                            if ((i12 & 1024) != 0) {
                                function6 = g.f26813a;
                                i23 &= -15;
                            } else {
                                function6 = function3;
                            }
                            if (i21 != 0) {
                                llVarA = ek.f27370a.a();
                            } else {
                                llVarA = llVar;
                            }
                            function7 = function6;
                            q3Var4 = q3VarH;
                            txVar3 = txVarW;
                            Function2 function115 = function2A;
                            f14 = fL;
                            long j11119 = jG;
                            f15 = fR;
                            a0Var3 = a0Var2;
                            j16 = j11119;
                            j15 = jK;
                            function8 = function115;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                        }
                        int i317 = i13 << 3;
                        int i318 = i23 << 3;
                        c0Var2 = c0VarR;
                        t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i317 & 458752) | (i317 & 3670016) | (i317 & 29360128) | (i317 & 234881024) | (i317 & 1879048192), ((i13 >> 27) & 14) | (i318 & com.planner5d.library.engine.input.f.b.B) | (i318 & 896) | (i318 & 7168), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        long j111110 = j16;
                        a0Var2 = a0Var3;
                        q3Var3 = q3Var4;
                        j14 = j111110;
                        txVar2 = txVar3;
                        f12 = f14;
                        j13 = jF;
                        f13 = f15;
                        function4 = function8;
                        function5 = function7;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f12 = f10;
                        llVarA = llVar;
                        q3Var3 = q3Var2;
                        j13 = jF;
                        txVar2 = txVarW;
                        j14 = jG;
                        f13 = f11;
                        j15 = j12;
                        function4 = function2;
                        function5 = function3;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        final ll llVar10 = llVarA;
                        final androidx.compose.ui.a0 a0Var12 = a0Var2;
                        final long j111111 = j15;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.J(function0, a0Var12, txVar2, f12, q3Var3, j13, j14, f13, j111111, function4, function5, llVar10, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i23 |= androidx.media3.exoplayer.a5.S0;
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function116 = function2A;
                        f14 = fL;
                        long j111112 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j111112;
                        j15 = jK;
                        function8 = function116;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function117 = function2A;
                        f14 = fL;
                        long j111113 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j111113;
                        j15 = jK;
                        function8 = function117;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                    }
                    int i319 = i13 << 3;
                    int i3110 = i23 << 3;
                    c0Var2 = c0VarR;
                    t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i319 & 458752) | (i319 & 3670016) | (i319 & 29360128) | (i319 & 234881024) | (i319 & 1879048192), ((i13 >> 27) & 14) | (i3110 & com.planner5d.library.engine.input.f.b.B) | (i3110 & 896) | (i3110 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    long j111114 = j16;
                    a0Var2 = a0Var3;
                    q3Var3 = q3Var4;
                    j14 = j111114;
                    txVar2 = txVar3;
                    f12 = f14;
                    j13 = jF;
                    f13 = f15;
                    function4 = function8;
                    function5 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    llVarA = llVar;
                    q3Var3 = q3Var2;
                    j13 = jF;
                    txVar2 = txVarW;
                    j14 = jG;
                    f13 = f11;
                    j15 = j12;
                    function4 = function2;
                    function5 = function3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final ll llVar11 = llVarA;
                    final androidx.compose.ui.a0 a0Var13 = a0Var2;
                    final long j111115 = j15;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.J(function0, a0Var13, txVar2, f12, q3Var3, j13, j14, f13, j111115, function4, function5, llVar11, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 805306368;
            if ((i11 & 6) == 0) {
                i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
            } else {
                i20 = i11;
            }
            i21 = i12 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.D(llVar)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            if ((i12 & 4096) != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i23 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function118 = function2A;
                        f14 = fL;
                        long j111116 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j111116;
                        j15 = jK;
                        function8 = function118;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function119 = function2A;
                        f14 = fL;
                        long j111117 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j111117;
                        j15 = jK;
                        function8 = function119;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                    }
                    int i3111 = i13 << 3;
                    int i3112 = i23 << 3;
                    c0Var2 = c0VarR;
                    t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i3111 & 458752) | (i3111 & 3670016) | (i3111 & 29360128) | (i3111 & 234881024) | (i3111 & 1879048192), ((i13 >> 27) & 14) | (i3112 & com.planner5d.library.engine.input.f.b.B) | (i3112 & 896) | (i3112 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    long j111118 = j16;
                    a0Var2 = a0Var3;
                    q3Var3 = q3Var4;
                    j14 = j111118;
                    txVar2 = txVar3;
                    f12 = f14;
                    j13 = jF;
                    f13 = f15;
                    function4 = function8;
                    function5 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    llVarA = llVar;
                    q3Var3 = q3Var2;
                    j13 = jF;
                    txVar2 = txVarW;
                    j14 = jG;
                    f13 = f11;
                    j15 = j12;
                    function4 = function2;
                    function5 = function3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final ll llVar12 = llVarA;
                    final androidx.compose.ui.a0 a0Var14 = a0Var2;
                    final long j111119 = j15;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.J(function0, a0Var14, txVar2, f12, q3Var3, j13, j14, f13, j111119, function4, function5, llVar12, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i23 |= androidx.media3.exoplayer.a5.S0;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function1110 = function2A;
                    f14 = fL;
                    long j1111110 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j1111110;
                    j15 = jK;
                    function8 = function1110;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function1111 = function2A;
                    f14 = fL;
                    long j1111111 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j1111111;
                    j15 = jK;
                    function8 = function1111;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                }
                int i3113 = i13 << 3;
                int i3114 = i23 << 3;
                c0Var2 = c0VarR;
                t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i3113 & 458752) | (i3113 & 3670016) | (i3113 & 29360128) | (i3113 & 234881024) | (i3113 & 1879048192), ((i13 >> 27) & 14) | (i3114 & com.planner5d.library.engine.input.f.b.B) | (i3114 & 896) | (i3114 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                long j1111112 = j16;
                a0Var2 = a0Var3;
                q3Var3 = q3Var4;
                j14 = j1111112;
                txVar2 = txVar3;
                f12 = f14;
                j13 = jF;
                f13 = f15;
                function4 = function8;
                function5 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                llVarA = llVar;
                q3Var3 = q3Var2;
                j13 = jF;
                txVar2 = txVarW;
                j14 = jG;
                f13 = f11;
                j15 = j12;
                function4 = function2;
                function5 = function3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final ll llVar13 = llVarA;
                final androidx.compose.ui.a0 a0Var15 = a0Var2;
                final long j1111113 = j15;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.J(function0, a0Var15, txVar2, f12, q3Var3, j13, j14, f13, j1111113, function4, function5, llVar13, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        if ((i10 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i13 |= i30;
            } else {
                q3Var2 = q3Var;
            }
            i13 |= i30;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            jF = j10;
            if ((i12 & 32) == 0) {
                i27 = 65536;
            } else {
                i27 = 65536;
            }
            i13 |= i27;
        } else {
            jF = j10;
        }
        if ((i10 & 1572864) == 0) {
            jG = j11;
            if ((i12 & 64) == 0) {
                i26 = 524288;
            } else {
                i26 = 524288;
            }
            i13 |= i26;
        } else {
            jG = j11;
        }
        i16 = i12 & 128;
        if (i16 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f11)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        if ((i10 & 100663296) != 0) {
            if ((i12 & 256) == 0) {
                i25 = com.google.api.client.googleapis.media.a.f115410j;
            } else {
                i25 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i13 |= i25;
        }
        i18 = i12 & 512;
        if (i18 != 0) {
            if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(function2)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
                i13 |= i19;
            }
            if ((i11 & 6) == 0) {
                i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
            } else {
                i20 = i11;
            }
            i21 = i12 & 2048;
            if (i21 != 0) {
                i20 |= 48;
            } else if ((i11 & 48) != 0) {
                if (c0VarR.D(llVar)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i20 |= i22;
            }
            i23 = i20;
            if ((i12 & 4096) != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i24 = 256;
                    } else {
                        i24 = 128;
                    }
                    i23 |= i24;
                }
                if ((i13 & 306783379) == 306783378) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function1112 = function2A;
                        f14 = fL;
                        long j1111114 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j1111114;
                        j15 = jK;
                        function8 = function1112;
                    } else {
                        if (i28 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                            txVarW = W(false, null, c0VarR, 0, 3);
                        }
                        if (i14 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if ((i12 & 16) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            q3VarH = q3Var2;
                        }
                        if ((i12 & 32) != 0) {
                            jF = x2.f34346a.f(c0VarR, 6);
                            i13 &= -458753;
                        }
                        if ((i12 & 64) != 0) {
                            jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                            i13 &= -3670017;
                        }
                        if (i16 != 0) {
                            fR = androidx.compose.ui.unit.h.r(0);
                        } else {
                            fR = f11;
                        }
                        if ((i12 & 256) != 0) {
                            jK = x2.f34346a.k(c0VarR, 6);
                            i13 = (-234881025) & i13;
                        } else {
                            jK = j12;
                        }
                        if (i18 != 0) {
                            function2A = s6.f32739a.a();
                        } else {
                            function2A = function2;
                        }
                        if ((i12 & 1024) != 0) {
                            function6 = g.f26813a;
                            i23 &= -15;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            llVarA = ek.f27370a.a();
                        } else {
                            llVarA = llVar;
                        }
                        function7 = function6;
                        q3Var4 = q3VarH;
                        txVar3 = txVarW;
                        Function2 function1113 = function2A;
                        f14 = fL;
                        long j1111115 = jG;
                        f15 = fR;
                        a0Var3 = a0Var2;
                        j16 = j1111115;
                        j15 = jK;
                        function8 = function1113;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                    }
                    int i3115 = i13 << 3;
                    int i3116 = i23 << 3;
                    c0Var2 = c0VarR;
                    t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i3115 & 458752) | (i3115 & 3670016) | (i3115 & 29360128) | (i3115 & 234881024) | (i3115 & 1879048192), ((i13 >> 27) & 14) | (i3116 & com.planner5d.library.engine.input.f.b.B) | (i3116 & 896) | (i3116 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    long j1111116 = j16;
                    a0Var2 = a0Var3;
                    q3Var3 = q3Var4;
                    j14 = j1111116;
                    txVar2 = txVar3;
                    f12 = f14;
                    j13 = jF;
                    f13 = f15;
                    function4 = function8;
                    function5 = function7;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f12 = f10;
                    llVarA = llVar;
                    q3Var3 = q3Var2;
                    j13 = jF;
                    txVar2 = txVarW;
                    j14 = jG;
                    f13 = f11;
                    j15 = j12;
                    function4 = function2;
                    function5 = function3;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    final ll llVar14 = llVarA;
                    final androidx.compose.ui.a0 a0Var16 = a0Var2;
                    final long j1111117 = j15;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.J(function0, a0Var16, txVar2, f12, q3Var3, j13, j14, f13, j1111117, function4, function5, llVar14, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i23 |= androidx.media3.exoplayer.a5.S0;
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function1114 = function2A;
                    f14 = fL;
                    long j1111118 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j1111118;
                    j15 = jK;
                    function8 = function1114;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function1115 = function2A;
                    f14 = fL;
                    long j1111119 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j1111119;
                    j15 = jK;
                    function8 = function1115;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                }
                int i3117 = i13 << 3;
                int i3118 = i23 << 3;
                c0Var2 = c0VarR;
                t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i3117 & 458752) | (i3117 & 3670016) | (i3117 & 29360128) | (i3117 & 234881024) | (i3117 & 1879048192), ((i13 >> 27) & 14) | (i3118 & com.planner5d.library.engine.input.f.b.B) | (i3118 & 896) | (i3118 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                long j11111110 = j16;
                a0Var2 = a0Var3;
                q3Var3 = q3Var4;
                j14 = j11111110;
                txVar2 = txVar3;
                f12 = f14;
                j13 = jF;
                f13 = f15;
                function4 = function8;
                function5 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                llVarA = llVar;
                q3Var3 = q3Var2;
                j13 = jF;
                txVar2 = txVarW;
                j14 = jG;
                f13 = f11;
                j15 = j12;
                function4 = function2;
                function5 = function3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final ll llVar15 = llVarA;
                final androidx.compose.ui.a0 a0Var17 = a0Var2;
                final long j11111111 = j15;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.J(function0, a0Var17, txVar2, f12, q3Var3, j13, j14, f13, j11111111, function4, function5, llVar15, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 805306368;
        if ((i11 & 6) == 0) {
            i20 = i11 | (((i12 & 1024) == 0 || !c0VarR.k0(function3)) ? 2 : 4);
        } else {
            i20 = i11;
        }
        i21 = i12 & 2048;
        if (i21 != 0) {
            i20 |= 48;
        } else if ((i11 & 48) != 0) {
            if (c0VarR.D(llVar)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i20 |= i22;
        }
        i23 = i20;
        if ((i12 & 4096) != 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(nVar)) {
                    i24 = 256;
                } else {
                    i24 = 128;
                }
                i23 |= i24;
            }
            if ((i13 & 306783379) == 306783378) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function1116 = function2A;
                    f14 = fL;
                    long j11111112 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j11111112;
                    j15 = jK;
                    function8 = function1116;
                } else {
                    if (i28 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        txVarW = W(false, null, c0VarR, 0, 3);
                    }
                    if (i14 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if ((i12 & 16) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        q3VarH = q3Var2;
                    }
                    if ((i12 & 32) != 0) {
                        jF = x2.f34346a.f(c0VarR, 6);
                        i13 &= -458753;
                    }
                    if ((i12 & 64) != 0) {
                        jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                        i13 &= -3670017;
                    }
                    if (i16 != 0) {
                        fR = androidx.compose.ui.unit.h.r(0);
                    } else {
                        fR = f11;
                    }
                    if ((i12 & 256) != 0) {
                        jK = x2.f34346a.k(c0VarR, 6);
                        i13 = (-234881025) & i13;
                    } else {
                        jK = j12;
                    }
                    if (i18 != 0) {
                        function2A = s6.f32739a.a();
                    } else {
                        function2A = function2;
                    }
                    if ((i12 & 1024) != 0) {
                        function6 = g.f26813a;
                        i23 &= -15;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        llVarA = ek.f27370a.a();
                    } else {
                        llVarA = llVar;
                    }
                    function7 = function6;
                    q3Var4 = q3VarH;
                    txVar3 = txVarW;
                    Function2 function1117 = function2A;
                    f14 = fL;
                    long j11111113 = jG;
                    f15 = fR;
                    a0Var3 = a0Var2;
                    j16 = j11111113;
                    j15 = jK;
                    function8 = function1117;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
                }
                int i3119 = i13 << 3;
                int i31110 = i23 << 3;
                c0Var2 = c0VarR;
                t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i3119 & 458752) | (i3119 & 3670016) | (i3119 & 29360128) | (i3119 & 234881024) | (i3119 & 1879048192), ((i13 >> 27) & 14) | (i31110 & com.planner5d.library.engine.input.f.b.B) | (i31110 & 896) | (i31110 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                long j11111114 = j16;
                a0Var2 = a0Var3;
                q3Var3 = q3Var4;
                j14 = j11111114;
                txVar2 = txVar3;
                f12 = f14;
                j13 = jF;
                f13 = f15;
                function4 = function8;
                function5 = function7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f12 = f10;
                llVarA = llVar;
                q3Var3 = q3Var2;
                j13 = jF;
                txVar2 = txVarW;
                j14 = jG;
                f13 = f11;
                j15 = j12;
                function4 = function2;
                function5 = function3;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                final ll llVar16 = llVarA;
                final androidx.compose.ui.a0 a0Var18 = a0Var2;
                final long j11111115 = j15;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.J(function0, a0Var18, txVar2, f12, q3Var3, j13, j14, f13, j11111115, function4, function5, llVar16, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i23 |= androidx.media3.exoplayer.a5.S0;
        if ((i13 & 306783379) == 306783378) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i28 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    txVarW = W(false, null, c0VarR, 0, 3);
                }
                if (i14 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f10;
                }
                if ((i12 & 16) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i13 &= -57345;
                } else {
                    q3VarH = q3Var2;
                }
                if ((i12 & 32) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                    i13 &= -3670017;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 256) != 0) {
                    jK = x2.f34346a.k(c0VarR, 6);
                    i13 = (-234881025) & i13;
                } else {
                    jK = j12;
                }
                if (i18 != 0) {
                    function2A = s6.f32739a.a();
                } else {
                    function2A = function2;
                }
                if ((i12 & 1024) != 0) {
                    function6 = g.f26813a;
                    i23 &= -15;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    llVarA = ek.f27370a.a();
                } else {
                    llVarA = llVar;
                }
                function7 = function6;
                q3Var4 = q3VarH;
                txVar3 = txVarW;
                Function2 function1118 = function2A;
                f14 = fL;
                long j11111116 = jG;
                f15 = fR;
                a0Var3 = a0Var2;
                j16 = j11111116;
                j15 = jK;
                function8 = function1118;
            } else {
                if (i28 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                    txVarW = W(false, null, c0VarR, 0, 3);
                }
                if (i14 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f10;
                }
                if ((i12 & 16) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i13 &= -57345;
                } else {
                    q3VarH = q3Var2;
                }
                if ((i12 & 32) != 0) {
                    jF = x2.f34346a.f(c0VarR, 6);
                    i13 &= -458753;
                }
                if ((i12 & 64) != 0) {
                    jG = o6.g(jF, c0VarR, (i13 >> 15) & 14);
                    i13 &= -3670017;
                }
                if (i16 != 0) {
                    fR = androidx.compose.ui.unit.h.r(0);
                } else {
                    fR = f11;
                }
                if ((i12 & 256) != 0) {
                    jK = x2.f34346a.k(c0VarR, 6);
                    i13 = (-234881025) & i13;
                } else {
                    jK = j12;
                }
                if (i18 != 0) {
                    function2A = s6.f32739a.a();
                } else {
                    function2A = function2;
                }
                if ((i12 & 1024) != 0) {
                    function6 = g.f26813a;
                    i23 &= -15;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    llVarA = ek.f27370a.a();
                } else {
                    llVarA = llVar;
                }
                function7 = function6;
                q3Var4 = q3VarH;
                txVar3 = txVarW;
                Function2 function1119 = function2A;
                f14 = fL;
                long j11111117 = jG;
                f15 = fR;
                a0Var3 = a0Var2;
                j16 = j11111117;
                j15 = jK;
                function8 = function1119;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(953901324, i13, i23, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:237)");
            }
            int i31111 = i13 << 3;
            int i31112 = i23 << 3;
            c0Var2 = c0VarR;
            t(function0, a0Var3, txVar3, f14, true, q3Var4, jF, j16, f15, j15, function8, function7, llVarA, nVar, c0Var2, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i31111 & 458752) | (i31111 & 3670016) | (i31111 & 29360128) | (i31111 & 234881024) | (i31111 & 1879048192), ((i13 >> 27) & 14) | (i31112 & com.planner5d.library.engine.input.f.b.B) | (i31112 & 896) | (i31112 & 7168), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            long j11111118 = j16;
            a0Var2 = a0Var3;
            q3Var3 = q3Var4;
            j14 = j11111118;
            txVar2 = txVar3;
            f12 = f14;
            j13 = jF;
            f13 = f15;
            function4 = function8;
            function5 = function7;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            f12 = f10;
            llVarA = llVar;
            q3Var3 = q3Var2;
            j13 = jF;
            txVar2 = txVarW;
            j14 = jG;
            f13 = f11;
            j15 = j12;
            function4 = function2;
            function5 = function3;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            final ll llVar17 = llVarA;
            final androidx.compose.ui.a0 a0Var19 = a0Var2;
            final long j11111119 = j15;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return cl.J(function0, a0Var19, txVar2, f12, q3Var3, j13, j14, f13, j11111119, function4, function5, llVar17, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x014b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x015f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0168  */
    /* JADX WARN: Code duplicated, block: B:124:0x0172  */
    /* JADX WARN: Code duplicated, block: B:127:0x017b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:133:0x018d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0192  */
    /* JADX WARN: Code duplicated, block: B:137:0x0196  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:171:0x0205  */
    /* JADX WARN: Code duplicated, block: B:172:0x0208  */
    /* JADX WARN: Code duplicated, block: B:176:0x021a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0227  */
    /* JADX WARN: Code duplicated, block: B:183:0x0230  */
    /* JADX WARN: Code duplicated, block: B:185:0x0239  */
    /* JADX WARN: Code duplicated, block: B:205:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x0286  */
    /* JADX WARN: Code duplicated, block: B:209:0x028d  */
    /* JADX WARN: Code duplicated, block: B:210:0x029a  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:215:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:218:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:219:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:223:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:227:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:229:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:230:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:232:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:233:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:236:0x0302  */
    /* JADX WARN: Code duplicated, block: B:238:0x0319  */
    /* JADX WARN: Code duplicated, block: B:241:0x032c  */
    /* JADX WARN: Code duplicated, block: B:242:0x0337  */
    /* JADX WARN: Code duplicated, block: B:245:0x0362  */
    /* JADX WARN: Code duplicated, block: B:247:0x0373  */
    /* JADX WARN: Code duplicated, block: B:249:0x0379  */
    /* JADX WARN: Code duplicated, block: B:255:0x0386  */
    /* JADX WARN: Code duplicated, block: B:257:0x038e  */
    /* JADX WARN: Code duplicated, block: B:259:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:262:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:264:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:268:0x03d7 A[PHI: r59
      0x03d7: PHI (r59v3 long) = (r59v1 long), (r59v4 long) binds: [B:267:0x03d5, B:265:0x03d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:269:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:274:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:277:0x0400  */
    /* JADX WARN: Code duplicated, block: B:280:0x0409  */
    /* JADX WARN: Code duplicated, block: B:283:0x041b  */
    /* JADX WARN: Code duplicated, block: B:284:0x041d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0424  */
    /* JADX WARN: Code duplicated, block: B:289:0x042c  */
    /* JADX WARN: Code duplicated, block: B:292:0x0453  */
    /* JADX WARN: Code duplicated, block: B:294:0x045b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0496  */
    /* JADX WARN: Code duplicated, block: B:299:0x049c  */
    /* JADX WARN: Code duplicated, block: B:305:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:311:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:314:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:316:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:319:0x0538  */
    /* JADX WARN: Code duplicated, block: B:321:0x054c  */
    /* JADX WARN: Code duplicated, block: B:324:0x056f  */
    /* JADX WARN: Code duplicated, block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0121  */
    @androidx.compose.runtime.o
    @af
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void v(@NotNull final androidx.compose.foundation.layout.c0 c0Var, @NotNull final androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, @NotNull final kotlinx.coroutines.s0 s0Var, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Float, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, @Nullable tx txVar, float f10, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, float f11, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function3, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var2, final int i10, final int i11, final int i12) {
        int i13;
        Function0<Unit> function4;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.a0 a0Var2;
        int i18;
        final tx txVarW;
        int i19;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        float f12;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z12;
        final float f13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final float f14;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final tx txVar2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        androidx.compose.runtime.c0 c0Var3;
        final long j12;
        final long j13;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function6;
        androidx.compose.runtime.s5 s5VarT;
        int i32;
        float fL;
        androidx.compose.ui.graphics.q3 q3VarH;
        long jF;
        long jG;
        float fG;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2C;
        long j14;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function7;
        androidx.compose.ui.a0 a0Var4;
        int i33;
        float f15;
        float f16;
        final String strB;
        androidx.compose.ui.a0 a0VarB;
        int i34;
        long j15;
        boolean z14;
        Object objI0;
        boolean z15;
        boolean z16;
        Object objI1;
        boolean zD;
        Object objI2;
        boolean z17;
        boolean z18;
        Object objI3;
        boolean z19;
        Object objI4;
        int i35;
        int i36;
        androidx.compose.runtime.c0 c0VarR = c0Var2.R(-37400432);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c0VarR.D(c0Var) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i10 & 48) == 0) {
            i13 |= (i10 & 64) == 0 ? c0VarR.D(cVar) : c0VarR.k0(cVar) ? 32 : 16;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i13 |= c0VarR.k0(s0Var) ? 256 : 128;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & 3072) == 0) {
                    function4 = function0;
                    if (c0VarR.k0(function4)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                i15 = 8192;
                if ((i12 & 8) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function1)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 16;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    a0Var2 = a0Var;
                } else {
                    a0Var2 = a0Var;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.D(a0Var2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i10 & 1572864) == 0) {
                    txVarW = txVar;
                    if ((i12 & 32) == 0 || !c0VarR.D(txVarW)) {
                        i36 = 524288;
                    } else {
                        i36 = 1048576;
                    }
                    i13 |= i36;
                } else {
                    txVarW = txVar;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.I(f10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 100663296;
                    z11 = z10;
                } else {
                    z11 = z10;
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.G(z11)) {
                            i22 = 67108864;
                        } else {
                            i22 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i13 |= i22;
                    }
                }
                if ((i10 & 805306368) != 0) {
                    i13 |= ((i12 & 256) == 0 || !c0VarR.D(q3Var)) ? 268435456 : 536870912;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 512) == 0) {
                        i23 = i13;
                        int i37 = c0VarR.L(j10) ? 4 : 2;
                        i24 = i11 | i37;
                    } else {
                        i23 = i13;
                    }
                    i24 = i11 | i37;
                } else {
                    i23 = i13;
                    i24 = i11;
                }
                if ((i11 & 48) != 0) {
                    if ((i12 & 1024) == 0 || !c0VarR.L(j11)) {
                        i35 = 16;
                    } else {
                        i35 = 32;
                    }
                    i24 |= i35;
                }
                i25 = i24;
                i26 = i12 & 2048;
                if (i26 != 0) {
                    if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                        f12 = f11;
                        if (c0VarR.I(f12)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i25 |= i27;
                    }
                    i28 = i12 & 4096;
                    if (i28 != 0) {
                        i30 = i25 | 3072;
                    } else {
                        i29 = i25;
                        if ((i11 & 3072) == 0) {
                            i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
                        } else {
                            i30 = i29;
                        }
                    }
                    if ((i11 & 24576) != 0) {
                        if ((i12 & 8192) == 0 && c0VarR.k0(function3)) {
                            i15 = 16384;
                        }
                        i30 |= i15;
                    }
                    if ((i12 & 16384) != 0) {
                        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i31 = 131072;
                            } else {
                                i31 = 65536;
                            }
                            i30 |= i31;
                        }
                        if ((i23 & 306783379) == 306783378 || (i30 & 74899) != 74898) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i23 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i17 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if ((i12 & 32) != 0) {
                                    i32 = i23 & (-3670017);
                                    txVarW = W(false, null, c0VarR, 0, 3);
                                } else {
                                    i32 = i23;
                                }
                                if (i19 != 0) {
                                    fL = x2.f34346a.l();
                                } else {
                                    fL = f10;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                }
                                if ((i12 & 256) != 0) {
                                    q3VarH = x2.f34346a.h(c0VarR, 6);
                                    i32 &= -1879048193;
                                } else {
                                    q3VarH = q3Var;
                                }
                                if ((i12 & 512) != 0) {
                                    i30 &= -15;
                                    jF = x2.f34346a.f(c0VarR, 6);
                                } else {
                                    jF = j10;
                                }
                                if ((i12 & 1024) != 0) {
                                    jG = o6.g(jF, c0VarR, i30 & 14);
                                    i30 &= -113;
                                } else {
                                    jG = j11;
                                }
                                if (i26 != 0) {
                                    fG = x2.f34346a.g();
                                } else {
                                    fG = f11;
                                }
                                if (i28 != 0) {
                                    function2C = s6.f32739a.c();
                                } else {
                                    function2C = function2;
                                }
                                float f17 = fL;
                                if ((i12 & 8192) != 0) {
                                    i30 &= -57345;
                                    j14 = jF;
                                    function7 = j.f26819a;
                                } else {
                                    j14 = jF;
                                    function7 = function3;
                                }
                                a0Var4 = a0Var2;
                                i33 = i30;
                                f15 = fG;
                                f16 = f17;
                            } else {
                                c0VarR.u();
                                int i38 = (i12 & 32) != 0 ? i23 & (-3670017) : i23;
                                if ((i12 & 256) != 0) {
                                    i38 &= -1879048193;
                                }
                                if ((i12 & 512) != 0) {
                                    i30 &= -15;
                                }
                                if ((i12 & 1024) != 0) {
                                    i30 &= -113;
                                }
                                if ((i12 & 8192) != 0) {
                                    i30 &= -57345;
                                }
                                j14 = j10;
                                jG = j11;
                                function2C = function2;
                                function7 = function3;
                                i32 = i38;
                                a0Var4 = a0Var2;
                                i33 = i30;
                                f16 = f10;
                                f15 = f12;
                                q3VarH = q3Var;
                            }
                            c0VarR.Z();
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function8 = function7;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                            }
                            androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                            androidx.compose.ui.a0 a0Var5 = a0Var4;
                            int i39 = i33;
                            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                            if (z11) {
                                c0VarR.E(-1582035383);
                                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                                z19 = (((3670016 & i32) ^ 1572864) <= 1048576 && c0VarR.D(txVarW)) || (i32 & 1572864) == 1048576;
                                objI4 = c0VarR.i0();
                                if (z19 || objI4 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                    c0VarR.Y(objI4);
                                }
                                a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar2, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                                c0VarR.A();
                            } else {
                                c0VarR.E(-1582020872);
                                c0VarR.A();
                                a0VarB = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarB2 = a0VarH.B2(a0VarB);
                            androidx.compose.material3.internal.d0<vx> d0VarQ = txVarW.q();
                            androidx.compose.foundation.gestures.q3 q3Var3 = androidx.compose.foundation.gestures.q3.Vertical;
                            i34 = (3670016 & i32) ^ 1572864;
                            if (i34 > 1048576 || !c0VarR.D(txVarW)) {
                                j15 = j14;
                                if ((i32 & 1572864) != 1048576) {
                                    z14 = false;
                                }
                                objI0 = c0VarR.i0();
                                if (z14 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                androidx.compose.ui.a0 a0VarH2 = androidx.compose.material3.internal.t.h(a0VarB2, d0VarQ, q3Var3, (Function2) objI0);
                                androidx.compose.foundation.gestures.a3 a3VarA = txVarW.q().A();
                                if (z11 || !txVarW.D()) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                boolean zH = txVarW.q().H();
                                if ((57344 & i32) == 16384) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                objI1 = c0VarR.i0();
                                if (z16 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = new k(function1, null);
                                    c0VarR.Y(objI1);
                                }
                                androidx.compose.ui.a0 a0VarI = androidx.compose.foundation.gestures.x2.i(a0VarH2, a3VarA, q3Var3, z15, null, zH, null, (pj.n) objI1, false, 168, null);
                                zD = c0VarR.D(strB);
                                objI2 = c0VarR.i0();
                                if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI2);
                                }
                                androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                                boolean z20 = (i34 <= 1048576 && c0VarR.D(txVarW)) || (i32 & 1572864) == 1048576;
                                if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32 || ((i32 & 64) != 0 && c0VarR.k0(cVar))) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                z18 = z20 | z17;
                                objI3 = c0VarR.i0();
                                if (z18 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                        }
                                    };
                                    c0VarR.Y(objI3);
                                }
                                androidx.compose.ui.a0 a0VarB3 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD, (Function1) objI3), txVarW);
                                tx txVar3 = txVarW;
                                boolean z21 = z11;
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function2C;
                                androidx.compose.runtime.internal.c cVarE = androidx.compose.runtime.internal.w.e(728743275, true, new l(function8, cVar, txVar3, function9, nVar, function4, s0Var, z21), c0VarR, 54);
                                int i40 = i39 << 6;
                                int i41 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i40 & 896) | (i40 & 7168) | (i40 & 57344);
                                androidx.compose.ui.graphics.q3 q3Var4 = q3VarH;
                                long j16 = j15;
                                long j17 = jG;
                                u10.c(a0VarB3, q3Var4, j16, j17, f15, 0.0f, null, cVarE, c0VarR, i41, 96);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                txVar2 = txVar3;
                                function5 = function9;
                                f14 = f15;
                                a0Var3 = a0Var5;
                                j13 = j17;
                                j12 = j16;
                                z13 = z21;
                                q3Var2 = q3Var4;
                                c0Var3 = c0VarR;
                                f13 = f16;
                                function6 = function8;
                            } else {
                                j15 = j14;
                            }
                            z14 = true;
                            objI0 = c0VarR.i0();
                            if (z14) {
                                objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.ui.a0 a0VarH3 = androidx.compose.material3.internal.t.h(a0VarB2, d0VarQ, q3Var3, (Function2) objI0);
                            androidx.compose.foundation.gestures.a3 a3VarA2 = txVarW.q().A();
                            if (z11) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            boolean zH2 = txVarW.q().H();
                            if ((57344 & i32) == 16384) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z16) {
                                objI1 = new k(function1, null);
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new k(function1, null);
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.ui.a0 a0VarI2 = androidx.compose.foundation.gestures.x2.i(a0VarH3, a3VarA2, q3Var3, z15, null, zH2, null, (pj.n) objI1, false, 168, null);
                            zD = c0VarR.D(strB);
                            objI2 = c0VarR.i0();
                            if (zD) {
                                objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI2);
                            } else {
                                objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI2, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                            if (i34 <= 1048576) {
                            }
                            if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                                z17 = true;
                            } else {
                                z17 = true;
                            }
                            z18 = z20 | z17;
                            objI3 = c0VarR.i0();
                            if (z18) {
                                objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                    }
                                };
                                c0VarR.Y(objI3);
                            } else {
                                objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                    }
                                };
                                c0VarR.Y(objI3);
                            }
                            androidx.compose.ui.a0 a0VarB4 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD2, (Function1) objI3), txVarW);
                            tx txVar4 = txVarW;
                            boolean z22 = z11;
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function2C;
                            androidx.compose.runtime.internal.c cVarE2 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function8, cVar, txVar4, function10, nVar, function4, s0Var, z22), c0VarR, 54);
                            int i42 = i39 << 6;
                            int i43 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i42 & 896) | (i42 & 7168) | (i42 & 57344);
                            androidx.compose.ui.graphics.q3 q3Var5 = q3VarH;
                            long j18 = j15;
                            long j19 = jG;
                            u10.c(a0VarB4, q3Var5, j18, j19, f15, 0.0f, null, cVarE2, c0VarR, i43, 96);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            txVar2 = txVar4;
                            function5 = function10;
                            f14 = f15;
                            a0Var3 = a0Var5;
                            j13 = j19;
                            j12 = j18;
                            z13 = z22;
                            q3Var2 = q3Var5;
                            c0Var3 = c0VarR;
                            f13 = f16;
                            function6 = function8;
                        } else {
                            c0VarR.u();
                            f13 = f10;
                            q3Var2 = q3Var;
                            f14 = f11;
                            function5 = function2;
                            txVar2 = txVarW;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            c0Var3 = c0VarR;
                            j12 = j10;
                            j13 = j11;
                            function6 = function3;
                        }
                        s5VarT = c0Var3.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i30 |= androidx.profileinstaller.n.c.f73814m;
                    if ((i23 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i23 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f18 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f18;
                        } else {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f19 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f19;
                        }
                        c0VarR.Z();
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function11 = function7;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                        }
                        androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                        androidx.compose.ui.a0 a0Var6 = a0Var4;
                        int i310 = i33;
                        androidx.compose.ui.a0 a0VarH4 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                        if (z11) {
                            c0VarR.E(-1582035383);
                            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                            if (((3670016 & i32) ^ 1572864) <= 1048576) {
                            }
                            objI4 = c0VarR.i0();
                            if (z19) {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            }
                            a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar4, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1582020872);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB5 = a0VarH4.B2(a0VarB);
                        androidx.compose.material3.internal.d0<vx> d0VarQ2 = txVarW.q();
                        androidx.compose.foundation.gestures.q3 q3Var6 = androidx.compose.foundation.gestures.q3.Vertical;
                        i34 = (3670016 & i32) ^ 1572864;
                        if (i34 > 1048576) {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarH5 = androidx.compose.material3.internal.t.h(a0VarB5, d0VarQ2, q3Var6, (Function2) objI0);
                        androidx.compose.foundation.gestures.a3 a3VarA3 = txVarW.q().A();
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        boolean zH3 = txVarW.q().H();
                        if ((57344 & i32) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z16) {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarI3 = androidx.compose.foundation.gestures.x2.i(a0VarH5, a3VarA3, q3Var6, z15, null, zH3, null, (pj.n) objI1, false, 168, null);
                        zD = c0VarR.D(strB);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.a0 a0VarD3 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI3, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                        if (i34 <= 1048576) {
                        }
                        if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        z18 = z20 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.ui.a0 a0VarB6 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD3, (Function1) objI3), txVarW);
                        tx txVar5 = txVarW;
                        boolean z23 = z11;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function2C;
                        androidx.compose.runtime.internal.c cVarE3 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function11, cVar, txVar5, function12, nVar, function4, s0Var, z23), c0VarR, 54);
                        int i44 = i310 << 6;
                        int i45 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i44 & 896) | (i44 & 7168) | (i44 & 57344);
                        androidx.compose.ui.graphics.q3 q3Var7 = q3VarH;
                        long j110 = j15;
                        long j111 = jG;
                        u10.c(a0VarB6, q3Var7, j110, j111, f15, 0.0f, null, cVarE3, c0VarR, i45, 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVar5;
                        function5 = function12;
                        f14 = f15;
                        a0Var3 = a0Var6;
                        j13 = j111;
                        j12 = j110;
                        z13 = z23;
                        q3Var2 = q3Var7;
                        c0Var3 = c0VarR;
                        f13 = f16;
                        function6 = function11;
                    } else {
                        c0VarR.u();
                        f13 = f10;
                        q3Var2 = q3Var;
                        f14 = f11;
                        function5 = function2;
                        txVar2 = txVarW;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        c0Var3 = c0VarR;
                        j12 = j10;
                        j13 = j11;
                        function6 = function3;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i25 |= androidx.media3.exoplayer.a5.S0;
                f12 = f11;
                i28 = i12 & 4096;
                if (i28 != 0) {
                    i30 = i25 | 3072;
                } else {
                    i29 = i25;
                    if ((i11 & 3072) == 0) {
                        i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 8192) == 0) {
                        i15 = 16384;
                    }
                    i30 |= i15;
                }
                if ((i12 & 16384) != 0) {
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 |= i31;
                    }
                    if ((i23 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i23 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f110 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f110;
                        } else {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f111 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f111;
                        }
                        c0VarR.Z();
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function13 = function7;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                        }
                        androidx.compose.material3.internal.l3.a aVar5 = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                        androidx.compose.ui.a0 a0Var7 = a0Var4;
                        int i311 = i33;
                        androidx.compose.ui.a0 a0VarH6 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                        if (z11) {
                            c0VarR.E(-1582035383);
                            androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                            if (((3670016 & i32) ^ 1572864) <= 1048576) {
                            }
                            objI4 = c0VarR.i0();
                            if (z19) {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            }
                            a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar6, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1582020872);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB7 = a0VarH6.B2(a0VarB);
                        androidx.compose.material3.internal.d0<vx> d0VarQ3 = txVarW.q();
                        androidx.compose.foundation.gestures.q3 q3Var8 = androidx.compose.foundation.gestures.q3.Vertical;
                        i34 = (3670016 & i32) ^ 1572864;
                        if (i34 > 1048576) {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarH7 = androidx.compose.material3.internal.t.h(a0VarB7, d0VarQ3, q3Var8, (Function2) objI0);
                        androidx.compose.foundation.gestures.a3 a3VarA4 = txVarW.q().A();
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        boolean zH4 = txVarW.q().H();
                        if ((57344 & i32) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z16) {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarI4 = androidx.compose.foundation.gestures.x2.i(a0VarH7, a3VarA4, q3Var8, z15, null, zH4, null, (pj.n) objI1, false, 168, null);
                        zD = c0VarR.D(strB);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.a0 a0VarD4 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI4, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                        if (i34 <= 1048576) {
                        }
                        if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        z18 = z20 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.ui.a0 a0VarB8 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD4, (Function1) objI3), txVarW);
                        tx txVar6 = txVarW;
                        boolean z24 = z11;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function2C;
                        androidx.compose.runtime.internal.c cVarE4 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function13, cVar, txVar6, function14, nVar, function4, s0Var, z24), c0VarR, 54);
                        int i46 = i311 << 6;
                        int i47 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i46 & 896) | (i46 & 7168) | (i46 & 57344);
                        androidx.compose.ui.graphics.q3 q3Var9 = q3VarH;
                        long j112 = j15;
                        long j113 = jG;
                        u10.c(a0VarB8, q3Var9, j112, j113, f15, 0.0f, null, cVarE4, c0VarR, i47, 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVar6;
                        function5 = function14;
                        f14 = f15;
                        a0Var3 = a0Var7;
                        j13 = j113;
                        j12 = j112;
                        z13 = z24;
                        q3Var2 = q3Var9;
                        c0Var3 = c0VarR;
                        f13 = f16;
                        function6 = function13;
                    } else {
                        c0VarR.u();
                        f13 = f10;
                        q3Var2 = q3Var;
                        f14 = f11;
                        function5 = function2;
                        txVar2 = txVarW;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        c0Var3 = c0VarR;
                        j12 = j10;
                        j13 = j11;
                        function6 = function3;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i30 |= androidx.profileinstaller.n.c.f73814m;
                if ((i23 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i23 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f112 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f112;
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f113 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f113;
                    }
                    c0VarR.Z();
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function15 = function7;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    androidx.compose.material3.internal.l3.a aVar7 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                    androidx.compose.ui.a0 a0Var8 = a0Var4;
                    int i312 = i33;
                    androidx.compose.ui.a0 a0VarH8 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                    if (z11) {
                        c0VarR.E(-1582035383);
                        androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                        if (((3670016 & i32) ^ 1572864) <= 1048576) {
                        }
                        objI4 = c0VarR.i0();
                        if (z19) {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        }
                        a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar8, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1582020872);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB9 = a0VarH8.B2(a0VarB);
                    androidx.compose.material3.internal.d0<vx> d0VarQ4 = txVarW.q();
                    androidx.compose.foundation.gestures.q3 q3Var10 = androidx.compose.foundation.gestures.q3.Vertical;
                    i34 = (3670016 & i32) ^ 1572864;
                    if (i34 > 1048576) {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarH9 = androidx.compose.material3.internal.t.h(a0VarB9, d0VarQ4, q3Var10, (Function2) objI0);
                    androidx.compose.foundation.gestures.a3 a3VarA5 = txVarW.q().A();
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    boolean zH5 = txVarW.q().H();
                    if ((57344 & i32) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z16) {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarI5 = androidx.compose.foundation.gestures.x2.i(a0VarH9, a3VarA5, q3Var10, z15, null, zH5, null, (pj.n) objI1, false, 168, null);
                    zD = c0VarR.D(strB);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarD5 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI5, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                    if (i34 <= 1048576) {
                    }
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    z18 = z20 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.a0 a0VarB10 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD5, (Function1) objI3), txVarW);
                    tx txVar7 = txVarW;
                    boolean z25 = z11;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function2C;
                    androidx.compose.runtime.internal.c cVarE5 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function15, cVar, txVar7, function16, nVar, function4, s0Var, z25), c0VarR, 54);
                    int i48 = i312 << 6;
                    int i49 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i48 & 896) | (i48 & 7168) | (i48 & 57344);
                    androidx.compose.ui.graphics.q3 q3Var11 = q3VarH;
                    long j114 = j15;
                    long j115 = jG;
                    u10.c(a0VarB10, q3Var11, j114, j115, f15, 0.0f, null, cVarE5, c0VarR, i49, 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVar7;
                    function5 = function16;
                    f14 = f15;
                    a0Var3 = a0Var8;
                    j13 = j115;
                    j12 = j114;
                    z13 = z25;
                    q3Var2 = q3Var11;
                    c0Var3 = c0VarR;
                    f13 = f16;
                    function6 = function15;
                } else {
                    c0VarR.u();
                    f13 = f10;
                    q3Var2 = q3Var;
                    f14 = f11;
                    function5 = function2;
                    txVar2 = txVarW;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    c0Var3 = c0VarR;
                    j12 = j10;
                    j13 = j11;
                    function6 = function3;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            function4 = function0;
            i15 = 8192;
            if ((i12 & 8) != 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function1)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                a0Var2 = a0Var;
            } else {
                a0Var2 = a0Var;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(a0Var2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                txVarW = txVar;
                if ((i12 & 32) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i13 |= i36;
            } else {
                txVarW = txVar;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 100663296;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.G(z11)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i22;
                }
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 256) == 0 || !c0VarR.D(q3Var)) ? 268435456 : 536870912;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 512) == 0) {
                    i23 = i13;
                    if (c0VarR.L(j10)) {
                    }
                    i24 = i11 | i37;
                } else {
                    i23 = i13;
                }
                i24 = i11 | i37;
            } else {
                i23 = i13;
                i24 = i11;
            }
            if ((i11 & 48) != 0) {
                if ((i12 & 1024) == 0) {
                    i35 = 16;
                } else {
                    i35 = 16;
                }
                i24 |= i35;
            }
            i25 = i24;
            i26 = i12 & 2048;
            if (i26 != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    f12 = f11;
                    if (c0VarR.I(f12)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = i12 & 4096;
                if (i28 != 0) {
                    i30 = i25 | 3072;
                } else {
                    i29 = i25;
                    if ((i11 & 3072) == 0) {
                        i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 8192) == 0) {
                        i15 = 16384;
                    }
                    i30 |= i15;
                }
                if ((i12 & 16384) != 0) {
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 |= i31;
                    }
                    if ((i23 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i23 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f114 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f114;
                        } else {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f115 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f115;
                        }
                        c0VarR.Z();
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function17 = function7;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                        }
                        androidx.compose.material3.internal.l3.a aVar9 = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                        androidx.compose.ui.a0 a0Var9 = a0Var4;
                        int i313 = i33;
                        androidx.compose.ui.a0 a0VarH10 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                        if (z11) {
                            c0VarR.E(-1582035383);
                            androidx.compose.ui.a0.a aVar10 = androidx.compose.ui.a0.E;
                            if (((3670016 & i32) ^ 1572864) <= 1048576) {
                            }
                            objI4 = c0VarR.i0();
                            if (z19) {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            }
                            a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar10, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1582020872);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB11 = a0VarH10.B2(a0VarB);
                        androidx.compose.material3.internal.d0<vx> d0VarQ5 = txVarW.q();
                        androidx.compose.foundation.gestures.q3 q3Var12 = androidx.compose.foundation.gestures.q3.Vertical;
                        i34 = (3670016 & i32) ^ 1572864;
                        if (i34 > 1048576) {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarH11 = androidx.compose.material3.internal.t.h(a0VarB11, d0VarQ5, q3Var12, (Function2) objI0);
                        androidx.compose.foundation.gestures.a3 a3VarA6 = txVarW.q().A();
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        boolean zH6 = txVarW.q().H();
                        if ((57344 & i32) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z16) {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarI6 = androidx.compose.foundation.gestures.x2.i(a0VarH11, a3VarA6, q3Var12, z15, null, zH6, null, (pj.n) objI1, false, 168, null);
                        zD = c0VarR.D(strB);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.a0 a0VarD6 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI6, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                        if (i34 <= 1048576) {
                        }
                        if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        z18 = z20 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.ui.a0 a0VarB12 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD6, (Function1) objI3), txVarW);
                        tx txVar8 = txVarW;
                        boolean z26 = z11;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function2C;
                        androidx.compose.runtime.internal.c cVarE6 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function17, cVar, txVar8, function18, nVar, function4, s0Var, z26), c0VarR, 54);
                        int i410 = i313 << 6;
                        int i411 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i410 & 896) | (i410 & 7168) | (i410 & 57344);
                        androidx.compose.ui.graphics.q3 q3Var13 = q3VarH;
                        long j116 = j15;
                        long j117 = jG;
                        u10.c(a0VarB12, q3Var13, j116, j117, f15, 0.0f, null, cVarE6, c0VarR, i411, 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVar8;
                        function5 = function18;
                        f14 = f15;
                        a0Var3 = a0Var9;
                        j13 = j117;
                        j12 = j116;
                        z13 = z26;
                        q3Var2 = q3Var13;
                        c0Var3 = c0VarR;
                        f13 = f16;
                        function6 = function17;
                    } else {
                        c0VarR.u();
                        f13 = f10;
                        q3Var2 = q3Var;
                        f14 = f11;
                        function5 = function2;
                        txVar2 = txVarW;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        c0Var3 = c0VarR;
                        j12 = j10;
                        j13 = j11;
                        function6 = function3;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i30 |= androidx.profileinstaller.n.c.f73814m;
                if ((i23 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i23 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f116 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f116;
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f117 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f117;
                    }
                    c0VarR.Z();
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function19 = function7;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    androidx.compose.material3.internal.l3.a aVar11 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                    androidx.compose.ui.a0 a0Var10 = a0Var4;
                    int i314 = i33;
                    androidx.compose.ui.a0 a0VarH12 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                    if (z11) {
                        c0VarR.E(-1582035383);
                        androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                        if (((3670016 & i32) ^ 1572864) <= 1048576) {
                        }
                        objI4 = c0VarR.i0();
                        if (z19) {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        }
                        a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar12, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1582020872);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB13 = a0VarH12.B2(a0VarB);
                    androidx.compose.material3.internal.d0<vx> d0VarQ6 = txVarW.q();
                    androidx.compose.foundation.gestures.q3 q3Var14 = androidx.compose.foundation.gestures.q3.Vertical;
                    i34 = (3670016 & i32) ^ 1572864;
                    if (i34 > 1048576) {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarH13 = androidx.compose.material3.internal.t.h(a0VarB13, d0VarQ6, q3Var14, (Function2) objI0);
                    androidx.compose.foundation.gestures.a3 a3VarA7 = txVarW.q().A();
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    boolean zH7 = txVarW.q().H();
                    if ((57344 & i32) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z16) {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarI7 = androidx.compose.foundation.gestures.x2.i(a0VarH13, a3VarA7, q3Var14, z15, null, zH7, null, (pj.n) objI1, false, 168, null);
                    zD = c0VarR.D(strB);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarD7 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI7, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                    if (i34 <= 1048576) {
                    }
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    z18 = z20 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.a0 a0VarB14 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD7, (Function1) objI3), txVarW);
                    tx txVar9 = txVarW;
                    boolean z27 = z11;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function2C;
                    androidx.compose.runtime.internal.c cVarE7 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function19, cVar, txVar9, function110, nVar, function4, s0Var, z27), c0VarR, 54);
                    int i412 = i314 << 6;
                    int i413 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i412 & 896) | (i412 & 7168) | (i412 & 57344);
                    androidx.compose.ui.graphics.q3 q3Var15 = q3VarH;
                    long j118 = j15;
                    long j119 = jG;
                    u10.c(a0VarB14, q3Var15, j118, j119, f15, 0.0f, null, cVarE7, c0VarR, i413, 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVar9;
                    function5 = function110;
                    f14 = f15;
                    a0Var3 = a0Var10;
                    j13 = j119;
                    j12 = j118;
                    z13 = z27;
                    q3Var2 = q3Var15;
                    c0Var3 = c0VarR;
                    f13 = f16;
                    function6 = function19;
                } else {
                    c0VarR.u();
                    f13 = f10;
                    q3Var2 = q3Var;
                    f14 = f11;
                    function5 = function2;
                    txVar2 = txVarW;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    c0Var3 = c0VarR;
                    j12 = j10;
                    j13 = j11;
                    function6 = function3;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= androidx.media3.exoplayer.a5.S0;
            f12 = f11;
            i28 = i12 & 4096;
            if (i28 != 0) {
                i30 = i25 | 3072;
            } else {
                i29 = i25;
                if ((i11 & 3072) == 0) {
                    i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 8192) == 0) {
                    i15 = 16384;
                }
                i30 |= i15;
            }
            if ((i12 & 16384) != 0) {
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 |= i31;
                }
                if ((i23 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i23 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f118 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f118;
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f119 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f119;
                    }
                    c0VarR.Z();
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function111 = function7;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    androidx.compose.material3.internal.l3.a aVar13 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                    androidx.compose.ui.a0 a0Var11 = a0Var4;
                    int i315 = i33;
                    androidx.compose.ui.a0 a0VarH14 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                    if (z11) {
                        c0VarR.E(-1582035383);
                        androidx.compose.ui.a0.a aVar14 = androidx.compose.ui.a0.E;
                        if (((3670016 & i32) ^ 1572864) <= 1048576) {
                        }
                        objI4 = c0VarR.i0();
                        if (z19) {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        }
                        a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar14, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1582020872);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB15 = a0VarH14.B2(a0VarB);
                    androidx.compose.material3.internal.d0<vx> d0VarQ7 = txVarW.q();
                    androidx.compose.foundation.gestures.q3 q3Var16 = androidx.compose.foundation.gestures.q3.Vertical;
                    i34 = (3670016 & i32) ^ 1572864;
                    if (i34 > 1048576) {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarH15 = androidx.compose.material3.internal.t.h(a0VarB15, d0VarQ7, q3Var16, (Function2) objI0);
                    androidx.compose.foundation.gestures.a3 a3VarA8 = txVarW.q().A();
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    boolean zH8 = txVarW.q().H();
                    if ((57344 & i32) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z16) {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarI8 = androidx.compose.foundation.gestures.x2.i(a0VarH15, a3VarA8, q3Var16, z15, null, zH8, null, (pj.n) objI1, false, 168, null);
                    zD = c0VarR.D(strB);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarD8 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI8, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                    if (i34 <= 1048576) {
                    }
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    z18 = z20 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.a0 a0VarB16 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD8, (Function1) objI3), txVarW);
                    tx txVar10 = txVarW;
                    boolean z28 = z11;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function2C;
                    androidx.compose.runtime.internal.c cVarE8 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function111, cVar, txVar10, function112, nVar, function4, s0Var, z28), c0VarR, 54);
                    int i414 = i315 << 6;
                    int i415 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i414 & 896) | (i414 & 7168) | (i414 & 57344);
                    androidx.compose.ui.graphics.q3 q3Var17 = q3VarH;
                    long j1110 = j15;
                    long j1111 = jG;
                    u10.c(a0VarB16, q3Var17, j1110, j1111, f15, 0.0f, null, cVarE8, c0VarR, i415, 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVar10;
                    function5 = function112;
                    f14 = f15;
                    a0Var3 = a0Var11;
                    j13 = j1111;
                    j12 = j1110;
                    z13 = z28;
                    q3Var2 = q3Var17;
                    c0Var3 = c0VarR;
                    f13 = f16;
                    function6 = function111;
                } else {
                    c0VarR.u();
                    f13 = f10;
                    q3Var2 = q3Var;
                    f14 = f11;
                    function5 = function2;
                    txVar2 = txVarW;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    c0Var3 = c0VarR;
                    j12 = j10;
                    j13 = j11;
                    function6 = function3;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i30 |= androidx.profileinstaller.n.c.f73814m;
            if ((i23 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i23 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f1110 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f1110;
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f1111 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f1111;
                }
                c0VarR.Z();
                Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function113 = function7;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                }
                androidx.compose.material3.internal.l3.a aVar15 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                androidx.compose.ui.a0 a0Var12 = a0Var4;
                int i316 = i33;
                androidx.compose.ui.a0 a0VarH16 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                if (z11) {
                    c0VarR.E(-1582035383);
                    androidx.compose.ui.a0.a aVar16 = androidx.compose.ui.a0.E;
                    if (((3670016 & i32) ^ 1572864) <= 1048576) {
                    }
                    objI4 = c0VarR.i0();
                    if (z19) {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    }
                    a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar16, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1582020872);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB17 = a0VarH16.B2(a0VarB);
                androidx.compose.material3.internal.d0<vx> d0VarQ8 = txVarW.q();
                androidx.compose.foundation.gestures.q3 q3Var18 = androidx.compose.foundation.gestures.q3.Vertical;
                i34 = (3670016 & i32) ^ 1572864;
                if (i34 > 1048576) {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarH17 = androidx.compose.material3.internal.t.h(a0VarB17, d0VarQ8, q3Var18, (Function2) objI0);
                androidx.compose.foundation.gestures.a3 a3VarA9 = txVarW.q().A();
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                boolean zH9 = txVarW.q().H();
                if ((57344 & i32) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objI1 = c0VarR.i0();
                if (z16) {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarI9 = androidx.compose.foundation.gestures.x2.i(a0VarH17, a3VarA9, q3Var18, z15, null, zH9, null, (pj.n) objI1, false, 168, null);
                zD = c0VarR.D(strB);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarD9 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI9, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                if (i34 <= 1048576) {
                }
                if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                z18 = z20 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarB18 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD9, (Function1) objI3), txVarW);
                tx txVar11 = txVarW;
                boolean z29 = z11;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function114 = function2C;
                androidx.compose.runtime.internal.c cVarE9 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function113, cVar, txVar11, function114, nVar, function4, s0Var, z29), c0VarR, 54);
                int i416 = i316 << 6;
                int i417 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i416 & 896) | (i416 & 7168) | (i416 & 57344);
                androidx.compose.ui.graphics.q3 q3Var19 = q3VarH;
                long j1112 = j15;
                long j1113 = jG;
                u10.c(a0VarB18, q3Var19, j1112, j1113, f15, 0.0f, null, cVarE9, c0VarR, i417, 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVar11;
                function5 = function114;
                f14 = f15;
                a0Var3 = a0Var12;
                j13 = j1113;
                j12 = j1112;
                z13 = z29;
                q3Var2 = q3Var19;
                c0Var3 = c0VarR;
                f13 = f16;
                function6 = function113;
            } else {
                c0VarR.u();
                f13 = f10;
                q3Var2 = q3Var;
                f14 = f11;
                function5 = function2;
                txVar2 = txVarW;
                a0Var3 = a0Var2;
                z13 = z11;
                c0Var3 = c0VarR;
                j12 = j10;
                j13 = j11;
                function6 = function3;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        if ((i12 & 4) != 0) {
            if ((i10 & 3072) == 0) {
                function4 = function0;
                if (c0VarR.k0(function4)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            i15 = 8192;
            if ((i12 & 8) != 0) {
                i13 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function1)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 16;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                a0Var2 = a0Var;
            } else {
                a0Var2 = a0Var;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.D(a0Var2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i10 & 1572864) == 0) {
                txVarW = txVar;
                if ((i12 & 32) == 0) {
                    i36 = 524288;
                } else {
                    i36 = 524288;
                }
                i13 |= i36;
            } else {
                txVarW = txVar;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.I(f10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 100663296;
                z11 = z10;
            } else {
                z11 = z10;
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.G(z11)) {
                        i22 = 67108864;
                    } else {
                        i22 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i13 |= i22;
                }
            }
            if ((i10 & 805306368) != 0) {
                i13 |= ((i12 & 256) == 0 || !c0VarR.D(q3Var)) ? 268435456 : 536870912;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 512) == 0) {
                    i23 = i13;
                    if (c0VarR.L(j10)) {
                    }
                    i24 = i11 | i37;
                } else {
                    i23 = i13;
                }
                i24 = i11 | i37;
            } else {
                i23 = i13;
                i24 = i11;
            }
            if ((i11 & 48) != 0) {
                if ((i12 & 1024) == 0) {
                    i35 = 16;
                } else {
                    i35 = 16;
                }
                i24 |= i35;
            }
            i25 = i24;
            i26 = i12 & 2048;
            if (i26 != 0) {
                if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                    f12 = f11;
                    if (c0VarR.I(f12)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = i12 & 4096;
                if (i28 != 0) {
                    i30 = i25 | 3072;
                } else {
                    i29 = i25;
                    if ((i11 & 3072) == 0) {
                        i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
                    } else {
                        i30 = i29;
                    }
                }
                if ((i11 & 24576) != 0) {
                    if ((i12 & 8192) == 0) {
                        i15 = 16384;
                    }
                    i30 |= i15;
                }
                if ((i12 & 16384) != 0) {
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i31 = 131072;
                        } else {
                            i31 = 65536;
                        }
                        i30 |= i31;
                    }
                    if ((i23 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c0VarR.h(z12, i23 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f1112 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f1112;
                        } else {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 32) != 0) {
                                i32 = i23 & (-3670017);
                                txVarW = W(false, null, c0VarR, 0, 3);
                            } else {
                                i32 = i23;
                            }
                            if (i19 != 0) {
                                fL = x2.f34346a.l();
                            } else {
                                fL = f10;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 256) != 0) {
                                q3VarH = x2.f34346a.h(c0VarR, 6);
                                i32 &= -1879048193;
                            } else {
                                q3VarH = q3Var;
                            }
                            if ((i12 & 512) != 0) {
                                i30 &= -15;
                                jF = x2.f34346a.f(c0VarR, 6);
                            } else {
                                jF = j10;
                            }
                            if ((i12 & 1024) != 0) {
                                jG = o6.g(jF, c0VarR, i30 & 14);
                                i30 &= -113;
                            } else {
                                jG = j11;
                            }
                            if (i26 != 0) {
                                fG = x2.f34346a.g();
                            } else {
                                fG = f11;
                            }
                            if (i28 != 0) {
                                function2C = s6.f32739a.c();
                            } else {
                                function2C = function2;
                            }
                            float f1113 = fL;
                            if ((i12 & 8192) != 0) {
                                i30 &= -57345;
                                j14 = jF;
                                function7 = j.f26819a;
                            } else {
                                j14 = jF;
                                function7 = function3;
                            }
                            a0Var4 = a0Var2;
                            i33 = i30;
                            f15 = fG;
                            f16 = f1113;
                        }
                        c0VarR.Z();
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function115 = function7;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                        }
                        androidx.compose.material3.internal.l3.a aVar17 = androidx.compose.material3.internal.l3.f29010b;
                        strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                        androidx.compose.ui.a0 a0Var13 = a0Var4;
                        int i317 = i33;
                        androidx.compose.ui.a0 a0VarH18 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                        if (z11) {
                            c0VarR.E(-1582035383);
                            androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                            if (((3670016 & i32) ^ 1572864) <= 1048576) {
                            }
                            objI4 = c0VarR.i0();
                            if (z19) {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            } else {
                                objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                                c0VarR.Y(objI4);
                            }
                            a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar18, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                            c0VarR.A();
                        } else {
                            c0VarR.E(-1582020872);
                            c0VarR.A();
                            a0VarB = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB19 = a0VarH18.B2(a0VarB);
                        androidx.compose.material3.internal.d0<vx> d0VarQ9 = txVarW.q();
                        androidx.compose.foundation.gestures.q3 q3Var110 = androidx.compose.foundation.gestures.q3.Vertical;
                        i34 = (3670016 & i32) ^ 1572864;
                        if (i34 > 1048576) {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            j15 = j14;
                            if ((i32 & 1572864) != 1048576) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        }
                        objI0 = c0VarR.i0();
                        if (z14) {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function2() { // from class: androidx.compose.material3.pk
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarH19 = androidx.compose.material3.internal.t.h(a0VarB19, d0VarQ9, q3Var110, (Function2) objI0);
                        androidx.compose.foundation.gestures.a3 a3VarA10 = txVarW.q().A();
                        if (z11) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        boolean zH10 = txVarW.q().H();
                        if ((57344 & i32) == 16384) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z16) {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new k(function1, null);
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarI10 = androidx.compose.foundation.gestures.x2.i(a0VarH19, a3VarA10, q3Var110, z15, null, zH10, null, (pj.n) objI1, false, 168, null);
                        zD = c0VarR.D(strB);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.qk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.a0 a0VarD10 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI10, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                        if (i34 <= 1048576) {
                        }
                        if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        z18 = z20 | z17;
                        objI3 = c0VarR.i0();
                        if (z18) {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        } else {
                            objI3 = new Function1() { // from class: androidx.compose.material3.rk
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                                }
                            };
                            c0VarR.Y(objI3);
                        }
                        androidx.compose.ui.a0 a0VarB110 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD10, (Function1) objI3), txVarW);
                        tx txVar12 = txVarW;
                        boolean z210 = z11;
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function116 = function2C;
                        androidx.compose.runtime.internal.c cVarE10 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function115, cVar, txVar12, function116, nVar, function4, s0Var, z210), c0VarR, 54);
                        int i418 = i317 << 6;
                        int i419 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i418 & 896) | (i418 & 7168) | (i418 & 57344);
                        androidx.compose.ui.graphics.q3 q3Var111 = q3VarH;
                        long j1114 = j15;
                        long j1115 = jG;
                        u10.c(a0VarB110, q3Var111, j1114, j1115, f15, 0.0f, null, cVarE10, c0VarR, i419, 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        txVar2 = txVar12;
                        function5 = function116;
                        f14 = f15;
                        a0Var3 = a0Var13;
                        j13 = j1115;
                        j12 = j1114;
                        z13 = z210;
                        q3Var2 = q3Var111;
                        c0Var3 = c0VarR;
                        f13 = f16;
                        function6 = function115;
                    } else {
                        c0VarR.u();
                        f13 = f10;
                        q3Var2 = q3Var;
                        f14 = f11;
                        function5 = function2;
                        txVar2 = txVarW;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        c0Var3 = c0VarR;
                        j12 = j10;
                        j13 = j11;
                        function6 = function3;
                    }
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i30 |= androidx.profileinstaller.n.c.f73814m;
                if ((i23 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i23 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f1114 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f1114;
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f1115 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f1115;
                    }
                    c0VarR.Z();
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function117 = function7;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    androidx.compose.material3.internal.l3.a aVar19 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                    androidx.compose.ui.a0 a0Var14 = a0Var4;
                    int i318 = i33;
                    androidx.compose.ui.a0 a0VarH110 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                    if (z11) {
                        c0VarR.E(-1582035383);
                        androidx.compose.ui.a0.a aVar110 = androidx.compose.ui.a0.E;
                        if (((3670016 & i32) ^ 1572864) <= 1048576) {
                        }
                        objI4 = c0VarR.i0();
                        if (z19) {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        }
                        a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar110, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1582020872);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB111 = a0VarH110.B2(a0VarB);
                    androidx.compose.material3.internal.d0<vx> d0VarQ10 = txVarW.q();
                    androidx.compose.foundation.gestures.q3 q3Var112 = androidx.compose.foundation.gestures.q3.Vertical;
                    i34 = (3670016 & i32) ^ 1572864;
                    if (i34 > 1048576) {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarH111 = androidx.compose.material3.internal.t.h(a0VarB111, d0VarQ10, q3Var112, (Function2) objI0);
                    androidx.compose.foundation.gestures.a3 a3VarA11 = txVarW.q().A();
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    boolean zH11 = txVarW.q().H();
                    if ((57344 & i32) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z16) {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarI11 = androidx.compose.foundation.gestures.x2.i(a0VarH111, a3VarA11, q3Var112, z15, null, zH11, null, (pj.n) objI1, false, 168, null);
                    zD = c0VarR.D(strB);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarD11 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI11, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                    if (i34 <= 1048576) {
                    }
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    z18 = z20 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.a0 a0VarB112 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD11, (Function1) objI3), txVarW);
                    tx txVar13 = txVarW;
                    boolean z211 = z11;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function118 = function2C;
                    androidx.compose.runtime.internal.c cVarE11 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function117, cVar, txVar13, function118, nVar, function4, s0Var, z211), c0VarR, 54);
                    int i4110 = i318 << 6;
                    int i4111 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i4110 & 896) | (i4110 & 7168) | (i4110 & 57344);
                    androidx.compose.ui.graphics.q3 q3Var113 = q3VarH;
                    long j1116 = j15;
                    long j1117 = jG;
                    u10.c(a0VarB112, q3Var113, j1116, j1117, f15, 0.0f, null, cVarE11, c0VarR, i4111, 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVar13;
                    function5 = function118;
                    f14 = f15;
                    a0Var3 = a0Var14;
                    j13 = j1117;
                    j12 = j1116;
                    z13 = z211;
                    q3Var2 = q3Var113;
                    c0Var3 = c0VarR;
                    f13 = f16;
                    function6 = function117;
                } else {
                    c0VarR.u();
                    f13 = f10;
                    q3Var2 = q3Var;
                    f14 = f11;
                    function5 = function2;
                    txVar2 = txVarW;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    c0Var3 = c0VarR;
                    j12 = j10;
                    j13 = j11;
                    function6 = function3;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i25 |= androidx.media3.exoplayer.a5.S0;
            f12 = f11;
            i28 = i12 & 4096;
            if (i28 != 0) {
                i30 = i25 | 3072;
            } else {
                i29 = i25;
                if ((i11 & 3072) == 0) {
                    i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 8192) == 0) {
                    i15 = 16384;
                }
                i30 |= i15;
            }
            if ((i12 & 16384) != 0) {
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 |= i31;
                }
                if ((i23 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i23 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f1116 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f1116;
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f1117 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f1117;
                    }
                    c0VarR.Z();
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function119 = function7;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    androidx.compose.material3.internal.l3.a aVar111 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                    androidx.compose.ui.a0 a0Var15 = a0Var4;
                    int i319 = i33;
                    androidx.compose.ui.a0 a0VarH112 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                    if (z11) {
                        c0VarR.E(-1582035383);
                        androidx.compose.ui.a0.a aVar112 = androidx.compose.ui.a0.E;
                        if (((3670016 & i32) ^ 1572864) <= 1048576) {
                        }
                        objI4 = c0VarR.i0();
                        if (z19) {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        }
                        a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar112, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1582020872);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB113 = a0VarH112.B2(a0VarB);
                    androidx.compose.material3.internal.d0<vx> d0VarQ11 = txVarW.q();
                    androidx.compose.foundation.gestures.q3 q3Var114 = androidx.compose.foundation.gestures.q3.Vertical;
                    i34 = (3670016 & i32) ^ 1572864;
                    if (i34 > 1048576) {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarH113 = androidx.compose.material3.internal.t.h(a0VarB113, d0VarQ11, q3Var114, (Function2) objI0);
                    androidx.compose.foundation.gestures.a3 a3VarA12 = txVarW.q().A();
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    boolean zH12 = txVarW.q().H();
                    if ((57344 & i32) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z16) {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarI12 = androidx.compose.foundation.gestures.x2.i(a0VarH113, a3VarA12, q3Var114, z15, null, zH12, null, (pj.n) objI1, false, 168, null);
                    zD = c0VarR.D(strB);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarD12 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI12, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                    if (i34 <= 1048576) {
                    }
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    z18 = z20 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.a0 a0VarB114 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD12, (Function1) objI3), txVarW);
                    tx txVar14 = txVarW;
                    boolean z212 = z11;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1110 = function2C;
                    androidx.compose.runtime.internal.c cVarE12 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function119, cVar, txVar14, function1110, nVar, function4, s0Var, z212), c0VarR, 54);
                    int i4112 = i319 << 6;
                    int i4113 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i4112 & 896) | (i4112 & 7168) | (i4112 & 57344);
                    androidx.compose.ui.graphics.q3 q3Var115 = q3VarH;
                    long j1118 = j15;
                    long j1119 = jG;
                    u10.c(a0VarB114, q3Var115, j1118, j1119, f15, 0.0f, null, cVarE12, c0VarR, i4113, 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVar14;
                    function5 = function1110;
                    f14 = f15;
                    a0Var3 = a0Var15;
                    j13 = j1119;
                    j12 = j1118;
                    z13 = z212;
                    q3Var2 = q3Var115;
                    c0Var3 = c0VarR;
                    f13 = f16;
                    function6 = function119;
                } else {
                    c0VarR.u();
                    f13 = f10;
                    q3Var2 = q3Var;
                    f14 = f11;
                    function5 = function2;
                    txVar2 = txVarW;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    c0Var3 = c0VarR;
                    j12 = j10;
                    j13 = j11;
                    function6 = function3;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i30 |= androidx.profileinstaller.n.c.f73814m;
            if ((i23 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i23 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f1118 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f1118;
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f1119 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f1119;
                }
                c0VarR.Z();
                Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function1111 = function7;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                }
                androidx.compose.material3.internal.l3.a aVar113 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                androidx.compose.ui.a0 a0Var16 = a0Var4;
                int i3110 = i33;
                androidx.compose.ui.a0 a0VarH114 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                if (z11) {
                    c0VarR.E(-1582035383);
                    androidx.compose.ui.a0.a aVar114 = androidx.compose.ui.a0.E;
                    if (((3670016 & i32) ^ 1572864) <= 1048576) {
                    }
                    objI4 = c0VarR.i0();
                    if (z19) {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    }
                    a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar114, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1582020872);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB115 = a0VarH114.B2(a0VarB);
                androidx.compose.material3.internal.d0<vx> d0VarQ12 = txVarW.q();
                androidx.compose.foundation.gestures.q3 q3Var116 = androidx.compose.foundation.gestures.q3.Vertical;
                i34 = (3670016 & i32) ^ 1572864;
                if (i34 > 1048576) {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarH115 = androidx.compose.material3.internal.t.h(a0VarB115, d0VarQ12, q3Var116, (Function2) objI0);
                androidx.compose.foundation.gestures.a3 a3VarA13 = txVarW.q().A();
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                boolean zH13 = txVarW.q().H();
                if ((57344 & i32) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objI1 = c0VarR.i0();
                if (z16) {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarI13 = androidx.compose.foundation.gestures.x2.i(a0VarH115, a3VarA13, q3Var116, z15, null, zH13, null, (pj.n) objI1, false, 168, null);
                zD = c0VarR.D(strB);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarD13 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI13, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                if (i34 <= 1048576) {
                }
                if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                z18 = z20 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarB116 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD13, (Function1) objI3), txVarW);
                tx txVar15 = txVarW;
                boolean z213 = z11;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1112 = function2C;
                androidx.compose.runtime.internal.c cVarE13 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function1111, cVar, txVar15, function1112, nVar, function4, s0Var, z213), c0VarR, 54);
                int i4114 = i3110 << 6;
                int i4115 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i4114 & 896) | (i4114 & 7168) | (i4114 & 57344);
                androidx.compose.ui.graphics.q3 q3Var117 = q3VarH;
                long j11110 = j15;
                long j11111 = jG;
                u10.c(a0VarB116, q3Var117, j11110, j11111, f15, 0.0f, null, cVarE13, c0VarR, i4115, 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVar15;
                function5 = function1112;
                f14 = f15;
                a0Var3 = a0Var16;
                j13 = j11111;
                j12 = j11110;
                z13 = z213;
                q3Var2 = q3Var117;
                c0Var3 = c0VarR;
                f13 = f16;
                function6 = function1111;
            } else {
                c0VarR.u();
                f13 = f10;
                q3Var2 = q3Var;
                f14 = f11;
                function5 = function2;
                txVar2 = txVarW;
                a0Var3 = a0Var2;
                z13 = z11;
                c0Var3 = c0VarR;
                j12 = j10;
                j13 = j11;
                function6 = function3;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        function4 = function0;
        i15 = 8192;
        if ((i12 & 8) != 0) {
            i13 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.k0(function1)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i13 |= i16;
        }
        i17 = i12 & 16;
        if (i17 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            a0Var2 = a0Var;
        } else {
            a0Var2 = a0Var;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.D(a0Var2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
        }
        if ((i10 & 1572864) == 0) {
            txVarW = txVar;
            if ((i12 & 32) == 0) {
                i36 = 524288;
            } else {
                i36 = 524288;
            }
            i13 |= i36;
        } else {
            txVarW = txVar;
        }
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.I(f10)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        i21 = i12 & 128;
        if (i21 != 0) {
            i13 |= 100663296;
            z11 = z10;
        } else {
            z11 = z10;
            if ((i10 & 100663296) == 0) {
                if (c0VarR.G(z11)) {
                    i22 = 67108864;
                } else {
                    i22 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i13 |= i22;
            }
        }
        if ((i10 & 805306368) != 0) {
            i13 |= ((i12 & 256) == 0 || !c0VarR.D(q3Var)) ? 268435456 : 536870912;
        }
        if ((i11 & 6) == 0) {
            if ((i12 & 512) == 0) {
                i23 = i13;
                if (c0VarR.L(j10)) {
                }
                i24 = i11 | i37;
            } else {
                i23 = i13;
            }
            i24 = i11 | i37;
        } else {
            i23 = i13;
            i24 = i11;
        }
        if ((i11 & 48) != 0) {
            if ((i12 & 1024) == 0) {
                i35 = 16;
            } else {
                i35 = 16;
            }
            i24 |= i35;
        }
        i25 = i24;
        i26 = i12 & 2048;
        if (i26 != 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                f12 = f11;
                if (c0VarR.I(f12)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i25 |= i27;
            }
            i28 = i12 & 4096;
            if (i28 != 0) {
                i30 = i25 | 3072;
            } else {
                i29 = i25;
                if ((i11 & 3072) == 0) {
                    i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
                } else {
                    i30 = i29;
                }
            }
            if ((i11 & 24576) != 0) {
                if ((i12 & 8192) == 0) {
                    i15 = 16384;
                }
                i30 |= i15;
            }
            if ((i12 & 16384) != 0) {
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i31 = 131072;
                    } else {
                        i31 = 65536;
                    }
                    i30 |= i31;
                }
                if ((i23 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c0VarR.h(z12, i23 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f11110 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f11110;
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 32) != 0) {
                            i32 = i23 & (-3670017);
                            txVarW = W(false, null, c0VarR, 0, 3);
                        } else {
                            i32 = i23;
                        }
                        if (i19 != 0) {
                            fL = x2.f34346a.l();
                        } else {
                            fL = f10;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 256) != 0) {
                            q3VarH = x2.f34346a.h(c0VarR, 6);
                            i32 &= -1879048193;
                        } else {
                            q3VarH = q3Var;
                        }
                        if ((i12 & 512) != 0) {
                            i30 &= -15;
                            jF = x2.f34346a.f(c0VarR, 6);
                        } else {
                            jF = j10;
                        }
                        if ((i12 & 1024) != 0) {
                            jG = o6.g(jF, c0VarR, i30 & 14);
                            i30 &= -113;
                        } else {
                            jG = j11;
                        }
                        if (i26 != 0) {
                            fG = x2.f34346a.g();
                        } else {
                            fG = f11;
                        }
                        if (i28 != 0) {
                            function2C = s6.f32739a.c();
                        } else {
                            function2C = function2;
                        }
                        float f11111 = fL;
                        if ((i12 & 8192) != 0) {
                            i30 &= -57345;
                            j14 = jF;
                            function7 = j.f26819a;
                        } else {
                            j14 = jF;
                            function7 = function3;
                        }
                        a0Var4 = a0Var2;
                        i33 = i30;
                        f15 = fG;
                        f16 = f11111;
                    }
                    c0VarR.Z();
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function1113 = function7;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                    }
                    androidx.compose.material3.internal.l3.a aVar115 = androidx.compose.material3.internal.l3.f29010b;
                    strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                    androidx.compose.ui.a0 a0Var17 = a0Var4;
                    int i3111 = i33;
                    androidx.compose.ui.a0 a0VarH116 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                    if (z11) {
                        c0VarR.E(-1582035383);
                        androidx.compose.ui.a0.a aVar116 = androidx.compose.ui.a0.E;
                        if (((3670016 & i32) ^ 1572864) <= 1048576) {
                        }
                        objI4 = c0VarR.i0();
                        if (z19) {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        } else {
                            objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                            c0VarR.Y(objI4);
                        }
                        a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar116, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                        c0VarR.A();
                    } else {
                        c0VarR.E(-1582020872);
                        c0VarR.A();
                        a0VarB = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB117 = a0VarH116.B2(a0VarB);
                    androidx.compose.material3.internal.d0<vx> d0VarQ13 = txVarW.q();
                    androidx.compose.foundation.gestures.q3 q3Var118 = androidx.compose.foundation.gestures.q3.Vertical;
                    i34 = (3670016 & i32) ^ 1572864;
                    if (i34 > 1048576) {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        j15 = j14;
                        if ((i32 & 1572864) != 1048576) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    objI0 = c0VarR.i0();
                    if (z14) {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function2() { // from class: androidx.compose.material3.pk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarH117 = androidx.compose.material3.internal.t.h(a0VarB117, d0VarQ13, q3Var118, (Function2) objI0);
                    androidx.compose.foundation.gestures.a3 a3VarA14 = txVarW.q().A();
                    if (z11) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    boolean zH14 = txVarW.q().H();
                    if ((57344 & i32) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z16) {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new k(function1, null);
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarI14 = androidx.compose.foundation.gestures.x2.i(a0VarH117, a3VarA14, q3Var118, z15, null, zH14, null, (pj.n) objI1, false, 168, null);
                    zD = c0VarR.D(strB);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.qk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarD14 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI14, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                    if (i34 <= 1048576) {
                    }
                    if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    z18 = z20 | z17;
                    objI3 = c0VarR.i0();
                    if (z18) {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        objI3 = new Function1() { // from class: androidx.compose.material3.rk
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    }
                    androidx.compose.ui.a0 a0VarB118 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD14, (Function1) objI3), txVarW);
                    tx txVar16 = txVarW;
                    boolean z214 = z11;
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1114 = function2C;
                    androidx.compose.runtime.internal.c cVarE14 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function1113, cVar, txVar16, function1114, nVar, function4, s0Var, z214), c0VarR, 54);
                    int i4116 = i3111 << 6;
                    int i4117 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i4116 & 896) | (i4116 & 7168) | (i4116 & 57344);
                    androidx.compose.ui.graphics.q3 q3Var119 = q3VarH;
                    long j11112 = j15;
                    long j11113 = jG;
                    u10.c(a0VarB118, q3Var119, j11112, j11113, f15, 0.0f, null, cVarE14, c0VarR, i4117, 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    txVar2 = txVar16;
                    function5 = function1114;
                    f14 = f15;
                    a0Var3 = a0Var17;
                    j13 = j11113;
                    j12 = j11112;
                    z13 = z214;
                    q3Var2 = q3Var119;
                    c0Var3 = c0VarR;
                    f13 = f16;
                    function6 = function1113;
                } else {
                    c0VarR.u();
                    f13 = f10;
                    q3Var2 = q3Var;
                    f14 = f11;
                    function5 = function2;
                    txVar2 = txVarW;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    c0Var3 = c0VarR;
                    j12 = j10;
                    j13 = j11;
                    function6 = function3;
                }
                s5VarT = c0Var3.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i30 |= androidx.profileinstaller.n.c.f73814m;
            if ((i23 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i23 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f11112 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f11112;
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f11113 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f11113;
                }
                c0VarR.Z();
                Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function1115 = function7;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                }
                androidx.compose.material3.internal.l3.a aVar117 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                androidx.compose.ui.a0 a0Var18 = a0Var4;
                int i3112 = i33;
                androidx.compose.ui.a0 a0VarH118 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                if (z11) {
                    c0VarR.E(-1582035383);
                    androidx.compose.ui.a0.a aVar118 = androidx.compose.ui.a0.E;
                    if (((3670016 & i32) ^ 1572864) <= 1048576) {
                    }
                    objI4 = c0VarR.i0();
                    if (z19) {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    }
                    a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar118, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1582020872);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB119 = a0VarH118.B2(a0VarB);
                androidx.compose.material3.internal.d0<vx> d0VarQ14 = txVarW.q();
                androidx.compose.foundation.gestures.q3 q3Var1110 = androidx.compose.foundation.gestures.q3.Vertical;
                i34 = (3670016 & i32) ^ 1572864;
                if (i34 > 1048576) {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarH119 = androidx.compose.material3.internal.t.h(a0VarB119, d0VarQ14, q3Var1110, (Function2) objI0);
                androidx.compose.foundation.gestures.a3 a3VarA15 = txVarW.q().A();
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                boolean zH15 = txVarW.q().H();
                if ((57344 & i32) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objI1 = c0VarR.i0();
                if (z16) {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarI15 = androidx.compose.foundation.gestures.x2.i(a0VarH119, a3VarA15, q3Var1110, z15, null, zH15, null, (pj.n) objI1, false, 168, null);
                zD = c0VarR.D(strB);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarD15 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI15, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                if (i34 <= 1048576) {
                }
                if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                z18 = z20 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarB1110 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD15, (Function1) objI3), txVarW);
                tx txVar17 = txVarW;
                boolean z215 = z11;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1116 = function2C;
                androidx.compose.runtime.internal.c cVarE15 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function1115, cVar, txVar17, function1116, nVar, function4, s0Var, z215), c0VarR, 54);
                int i4118 = i3112 << 6;
                int i4119 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i4118 & 896) | (i4118 & 7168) | (i4118 & 57344);
                androidx.compose.ui.graphics.q3 q3Var1111 = q3VarH;
                long j11114 = j15;
                long j11115 = jG;
                u10.c(a0VarB1110, q3Var1111, j11114, j11115, f15, 0.0f, null, cVarE15, c0VarR, i4119, 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVar17;
                function5 = function1116;
                f14 = f15;
                a0Var3 = a0Var18;
                j13 = j11115;
                j12 = j11114;
                z13 = z215;
                q3Var2 = q3Var1111;
                c0Var3 = c0VarR;
                f13 = f16;
                function6 = function1115;
            } else {
                c0VarR.u();
                f13 = f10;
                q3Var2 = q3Var;
                f14 = f11;
                function5 = function2;
                txVar2 = txVarW;
                a0Var3 = a0Var2;
                z13 = z11;
                c0Var3 = c0VarR;
                j12 = j10;
                j13 = j11;
                function6 = function3;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i25 |= androidx.media3.exoplayer.a5.S0;
        f12 = f11;
        i28 = i12 & 4096;
        if (i28 != 0) {
            i30 = i25 | 3072;
        } else {
            i29 = i25;
            if ((i11 & 3072) == 0) {
                i30 = i29 | (c0VarR.k0(function2) ? 2048 : 1024);
            } else {
                i30 = i29;
            }
        }
        if ((i11 & 24576) != 0) {
            if ((i12 & 8192) == 0) {
                i15 = 16384;
            }
            i30 |= i15;
        }
        if ((i12 & 16384) != 0) {
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i31 = 131072;
                } else {
                    i31 = 65536;
                }
                i30 |= i31;
            }
            if ((i23 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c0VarR.h(z12, i23 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f11114 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f11114;
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 32) != 0) {
                        i32 = i23 & (-3670017);
                        txVarW = W(false, null, c0VarR, 0, 3);
                    } else {
                        i32 = i23;
                    }
                    if (i19 != 0) {
                        fL = x2.f34346a.l();
                    } else {
                        fL = f10;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 256) != 0) {
                        q3VarH = x2.f34346a.h(c0VarR, 6);
                        i32 &= -1879048193;
                    } else {
                        q3VarH = q3Var;
                    }
                    if ((i12 & 512) != 0) {
                        i30 &= -15;
                        jF = x2.f34346a.f(c0VarR, 6);
                    } else {
                        jF = j10;
                    }
                    if ((i12 & 1024) != 0) {
                        jG = o6.g(jF, c0VarR, i30 & 14);
                        i30 &= -113;
                    } else {
                        jG = j11;
                    }
                    if (i26 != 0) {
                        fG = x2.f34346a.g();
                    } else {
                        fG = f11;
                    }
                    if (i28 != 0) {
                        function2C = s6.f32739a.c();
                    } else {
                        function2C = function2;
                    }
                    float f11115 = fL;
                    if ((i12 & 8192) != 0) {
                        i30 &= -57345;
                        j14 = jF;
                        function7 = j.f26819a;
                    } else {
                        j14 = jF;
                        function7 = function3;
                    }
                    a0Var4 = a0Var2;
                    i33 = i30;
                    f15 = fG;
                    f16 = f11115;
                }
                c0VarR.Z();
                Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function1117 = function7;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
                }
                androidx.compose.material3.internal.l3.a aVar119 = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
                androidx.compose.ui.a0 a0Var19 = a0Var4;
                int i3113 = i33;
                androidx.compose.ui.a0 a0VarH1110 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
                if (z11) {
                    c0VarR.E(-1582035383);
                    androidx.compose.ui.a0.a aVar1110 = androidx.compose.ui.a0.E;
                    if (((3670016 & i32) ^ 1572864) <= 1048576) {
                    }
                    objI4 = c0VarR.i0();
                    if (z19) {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    } else {
                        objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                        c0VarR.Y(objI4);
                    }
                    a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar1110, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                    c0VarR.A();
                } else {
                    c0VarR.E(-1582020872);
                    c0VarR.A();
                    a0VarB = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB1111 = a0VarH1110.B2(a0VarB);
                androidx.compose.material3.internal.d0<vx> d0VarQ15 = txVarW.q();
                androidx.compose.foundation.gestures.q3 q3Var1112 = androidx.compose.foundation.gestures.q3.Vertical;
                i34 = (3670016 & i32) ^ 1572864;
                if (i34 > 1048576) {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    j15 = j14;
                    if ((i32 & 1572864) != 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                objI0 = c0VarR.i0();
                if (z14) {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.material3.pk
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarH1111 = androidx.compose.material3.internal.t.h(a0VarB1111, d0VarQ15, q3Var1112, (Function2) objI0);
                androidx.compose.foundation.gestures.a3 a3VarA16 = txVarW.q().A();
                if (z11) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                boolean zH16 = txVarW.q().H();
                if ((57344 & i32) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objI1 = c0VarR.i0();
                if (z16) {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new k(function1, null);
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarI16 = androidx.compose.foundation.gestures.x2.i(a0VarH1111, a3VarA16, q3Var1112, z15, null, zH16, null, (pj.n) objI1, false, 168, null);
                zD = c0VarR.D(strB);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.qk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarD16 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI16, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
                if (i34 <= 1048576) {
                }
                if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                z18 = z20 | z17;
                objI3 = c0VarR.i0();
                if (z18) {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    objI3 = new Function1() { // from class: androidx.compose.material3.rk
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.ui.a0 a0VarB1112 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD16, (Function1) objI3), txVarW);
                tx txVar18 = txVarW;
                boolean z216 = z11;
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function1118 = function2C;
                androidx.compose.runtime.internal.c cVarE16 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function1117, cVar, txVar18, function1118, nVar, function4, s0Var, z216), c0VarR, 54);
                int i41110 = i3113 << 6;
                int i41111 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i41110 & 896) | (i41110 & 7168) | (i41110 & 57344);
                androidx.compose.ui.graphics.q3 q3Var1113 = q3VarH;
                long j11116 = j15;
                long j11117 = jG;
                u10.c(a0VarB1112, q3Var1113, j11116, j11117, f15, 0.0f, null, cVarE16, c0VarR, i41111, 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                txVar2 = txVar18;
                function5 = function1118;
                f14 = f15;
                a0Var3 = a0Var19;
                j13 = j11117;
                j12 = j11116;
                z13 = z216;
                q3Var2 = q3Var1113;
                c0Var3 = c0VarR;
                f13 = f16;
                function6 = function1117;
            } else {
                c0VarR.u();
                f13 = f10;
                q3Var2 = q3Var;
                f14 = f11;
                function5 = function2;
                txVar2 = txVarW;
                a0Var3 = a0Var2;
                z13 = z11;
                c0Var3 = c0VarR;
                j12 = j10;
                j13 = j11;
                function6 = function3;
            }
            s5VarT = c0Var3.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i30 |= androidx.profileinstaller.n.c.f73814m;
        if ((i23 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (c0VarR.h(z12, i23 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 32) != 0) {
                    i32 = i23 & (-3670017);
                    txVarW = W(false, null, c0VarR, 0, 3);
                } else {
                    i32 = i23;
                }
                if (i19 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f10;
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if ((i12 & 256) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i32 &= -1879048193;
                } else {
                    q3VarH = q3Var;
                }
                if ((i12 & 512) != 0) {
                    i30 &= -15;
                    jF = x2.f34346a.f(c0VarR, 6);
                } else {
                    jF = j10;
                }
                if ((i12 & 1024) != 0) {
                    jG = o6.g(jF, c0VarR, i30 & 14);
                    i30 &= -113;
                } else {
                    jG = j11;
                }
                if (i26 != 0) {
                    fG = x2.f34346a.g();
                } else {
                    fG = f11;
                }
                if (i28 != 0) {
                    function2C = s6.f32739a.c();
                } else {
                    function2C = function2;
                }
                float f11116 = fL;
                if ((i12 & 8192) != 0) {
                    i30 &= -57345;
                    j14 = jF;
                    function7 = j.f26819a;
                } else {
                    j14 = jF;
                    function7 = function3;
                }
                a0Var4 = a0Var2;
                i33 = i30;
                f15 = fG;
                f16 = f11116;
            } else {
                if (i17 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 32) != 0) {
                    i32 = i23 & (-3670017);
                    txVarW = W(false, null, c0VarR, 0, 3);
                } else {
                    i32 = i23;
                }
                if (i19 != 0) {
                    fL = x2.f34346a.l();
                } else {
                    fL = f10;
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if ((i12 & 256) != 0) {
                    q3VarH = x2.f34346a.h(c0VarR, 6);
                    i32 &= -1879048193;
                } else {
                    q3VarH = q3Var;
                }
                if ((i12 & 512) != 0) {
                    i30 &= -15;
                    jF = x2.f34346a.f(c0VarR, 6);
                } else {
                    jF = j10;
                }
                if ((i12 & 1024) != 0) {
                    jG = o6.g(jF, c0VarR, i30 & 14);
                    i30 &= -113;
                } else {
                    jG = j11;
                }
                if (i26 != 0) {
                    fG = x2.f34346a.g();
                } else {
                    fG = f11;
                }
                if (i28 != 0) {
                    function2C = s6.f32739a.c();
                } else {
                    function2C = function2;
                }
                float f11117 = fL;
                if ((i12 & 8192) != 0) {
                    i30 &= -57345;
                    j14 = jF;
                    function7 = j.f26819a;
                } else {
                    j14 = jF;
                    function7 = function3;
                }
                a0Var4 = a0Var2;
                i33 = i30;
                f15 = fG;
                f16 = f11117;
            }
            c0VarR.Z();
            Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends androidx.compose.foundation.layout.v6> function1119 = function7;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-37400432, i32, i33, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)");
            }
            androidx.compose.material3.internal.l3.a aVar1111 = androidx.compose.material3.internal.l3.f29010b;
            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.f31834e), c0VarR, 0);
            androidx.compose.ui.a0 a0Var110 = a0Var4;
            int i3114 = i33;
            androidx.compose.ui.a0 a0VarH1112 = androidx.compose.foundation.layout.i6.h(androidx.compose.foundation.layout.i6.D(c0Var.b(a0Var4, androidx.compose.ui.e.f37317a.y()), 0.0f, f16, 1, null), 0.0f, 1, null);
            if (z11) {
                c0VarR.E(-1582035383);
                androidx.compose.ui.a0.a aVar1112 = androidx.compose.ui.a0.E;
                if (((3670016 & i32) ^ 1572864) <= 1048576) {
                }
                objI4 = c0VarR.i0();
                if (z19) {
                    objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                    c0VarR.Y(objI4);
                } else {
                    objI4 = ix.f(txVarW, androidx.compose.foundation.gestures.q3.Vertical, function1);
                    c0VarR.Y(objI4);
                }
                a0VarB = androidx.compose.ui.input.nestedscroll.c.b(aVar1112, (androidx.compose.ui.input.nestedscroll.a) objI4, null, 2, null);
                c0VarR.A();
            } else {
                c0VarR.E(-1582020872);
                c0VarR.A();
                a0VarB = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB1113 = a0VarH1112.B2(a0VarB);
            androidx.compose.material3.internal.d0<vx> d0VarQ16 = txVarW.q();
            androidx.compose.foundation.gestures.q3 q3Var1114 = androidx.compose.foundation.gestures.q3.Vertical;
            i34 = (3670016 & i32) ^ 1572864;
            if (i34 > 1048576) {
                j15 = j14;
                if ((i32 & 1572864) != 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                j15 = j14;
                if ((i32 & 1572864) != 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            objI0 = c0VarR.i0();
            if (z14) {
                objI0 = new Function2() { // from class: androidx.compose.material3.pk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function2() { // from class: androidx.compose.material3.pk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return cl.w(txVarW, (androidx.compose.ui.unit.u) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarH1113 = androidx.compose.material3.internal.t.h(a0VarB1113, d0VarQ16, q3Var1114, (Function2) objI0);
            androidx.compose.foundation.gestures.a3 a3VarA17 = txVarW.q().A();
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            boolean zH17 = txVarW.q().H();
            if ((57344 & i32) == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            objI1 = c0VarR.i0();
            if (z16) {
                objI1 = new k(function1, null);
                c0VarR.Y(objI1);
            } else {
                objI1 = new k(function1, null);
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarI17 = androidx.compose.foundation.gestures.x2.i(a0VarH1113, a3VarA17, q3Var1114, z15, null, zH17, null, (pj.n) objI1, false, 168, null);
            zD = c0VarR.D(strB);
            objI2 = c0VarR.i0();
            if (zD) {
                objI2 = new Function1() { // from class: androidx.compose.material3.qk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: androidx.compose.material3.qk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.y(strB, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarD17 = androidx.compose.foundation.layout.t7.d(androidx.compose.ui.semantics.t.f(a0VarI17, false, (Function1) objI2, 1, null), androidx.compose.foundation.layout.b7.c(0, kotlin.ranges.r.u((int) txVarW.w(), 0), 0, 0, 13, null));
            if (i34 <= 1048576) {
            }
            if ((i32 & com.planner5d.library.engine.input.f.b.B) != 32) {
                z17 = true;
            } else {
                z17 = true;
            }
            z18 = z20 | z17;
            objI3 = c0VarR.i0();
            if (z18) {
                objI3 = new Function1() { // from class: androidx.compose.material3.rk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI3);
            } else {
                objI3 = new Function1() { // from class: androidx.compose.material3.rk
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return cl.z(txVarW, cVar, (androidx.compose.ui.graphics.r1) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.ui.a0 a0VarB1114 = j3.B(androidx.compose.ui.graphics.q1.a(a0VarD17, (Function1) objI3), txVarW);
            tx txVar19 = txVarW;
            boolean z217 = z11;
            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11110 = function2C;
            androidx.compose.runtime.internal.c cVarE17 = androidx.compose.runtime.internal.w.e(728743275, true, new l(function1119, cVar, txVar19, function11110, nVar, function4, s0Var, z217), c0VarR, 54);
            int i41112 = i3114 << 6;
            int i41113 = ((i32 >> 24) & com.planner5d.library.engine.input.f.b.B) | 12582912 | (i41112 & 896) | (i41112 & 7168) | (i41112 & 57344);
            androidx.compose.ui.graphics.q3 q3Var1115 = q3VarH;
            long j11118 = j15;
            long j11119 = jG;
            u10.c(a0VarB1114, q3Var1115, j11118, j11119, f15, 0.0f, null, cVarE17, c0VarR, i41113, 96);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            txVar2 = txVar19;
            function5 = function11110;
            f14 = f15;
            a0Var3 = a0Var110;
            j13 = j11119;
            j12 = j11118;
            z13 = z217;
            q3Var2 = q3Var1115;
            c0Var3 = c0VarR;
            f13 = f16;
            function6 = function1119;
        } else {
            c0VarR.u();
            f13 = f10;
            q3Var2 = q3Var;
            f14 = f11;
            function5 = function2;
            txVar2 = txVarW;
            a0Var3 = a0Var2;
            z13 = z11;
            c0Var3 = c0VarR;
            j12 = j10;
            j13 = j11;
            function6 = function3;
        }
        s5VarT = c0Var3.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return cl.A(c0Var, cVar, s0Var, function0, function1, a0Var3, txVar2, f13, z13, q3Var2, j12, j13, f14, function5, function6, nVar, i10, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair w(final tx txVar, final androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.b bVar) {
        vx vxVar;
        final float fO = androidx.compose.ui.unit.b.o(bVar.x());
        androidx.compose.material3.internal.b2 b2VarA = androidx.compose.material3.internal.t.a(new Function1() { // from class: androidx.compose.material3.tk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cl.x(fO, uVar, txVar, (androidx.compose.material3.internal.c2) obj);
            }
        });
        int i10 = n.f26849a[txVar.q().F().ordinal()];
        if (i10 != 1) {
            int i11 = 1 >> 2;
            if (i10 != 2) {
                int i12 = i11 | 3;
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                vxVar = vx.Expanded;
                if (!b2VarA.d(vxVar)) {
                    vxVar = vx.Hidden;
                }
            } else {
                vxVar = vx.PartiallyExpanded;
                if (!b2VarA.d(vxVar)) {
                    vxVar = vx.Expanded;
                    if (!b2VarA.d(vxVar)) {
                        vxVar = vx.Hidden;
                    }
                }
            }
        } else {
            vxVar = vx.Hidden;
        }
        return TuplesKt.to(b2VarA, vxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(float f10, androidx.compose.ui.unit.u uVar, tx txVar, androidx.compose.material3.internal.c2 c2Var) {
        c2Var.a(vx.Hidden, f10);
        if (((int) (uVar.q() & com.rabbitmq.client.k0.f265952a)) > f10 / 2 && !txVar.z()) {
            c2Var.a(vx.PartiallyExpanded, f10 / 2.0f);
        }
        if (((int) (uVar.q() & com.rabbitmq.client.k0.f265952a)) != 0) {
            c2Var.a(vx.Expanded, Math.max(0.0f, f10 - ((int) (uVar.q() & com.rabbitmq.client.k0.f265952a))));
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.G1(e0Var, str);
        androidx.compose.ui.semantics.b0.c2(e0Var, 0.0f);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(tx txVar, androidx.compose.animation.core.c cVar, androidx.compose.ui.graphics.r1 r1Var) {
        float fC = txVar.q().C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (r1Var.d() & com.rabbitmq.client.k0.f265952a));
        if (!Float.isNaN(fC) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            float fFloatValue = ((Number) cVar.v()).floatValue();
            r1Var.z(U(r1Var, fFloatValue));
            r1Var.C(V(r1Var, fFloatValue));
            r1Var.W1(androidx.compose.ui.graphics.a4.a(0.5f, (fC + fIntBitsToFloat) / fIntBitsToFloat));
        }
        return Unit.f312394a;
    }
}
