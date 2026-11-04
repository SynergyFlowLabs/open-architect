package androidx.compose.foundation;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.y7;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.ResultKt;
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
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,390:1\n607#2:391\n604#2,6:392\n607#2:453\n604#2,6:454\n1282#3,3:398\n1285#3,3:402\n1282#3,6:447\n1282#3,3:460\n1285#3,3:464\n1282#3,6:508\n1282#3,6:514\n605#4:401\n605#4:463\n70#5:405\n66#5,10:406\n77#5:446\n70#5:467\n67#5,9:468\n77#5:507\n80#6,6:416\n87#6,3:431\n90#6,2:440\n94#6:445\n80#6,6:477\n87#6,3:492\n90#6,2:501\n94#6:506\n391#7,9:422\n400#7,3:442\n391#7,9:483\n400#7,3:503\n4360#8,6:434\n4360#8,6:495\n66#9,5:520\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n83#1:391\n83#1:392,6\n114#1:453\n114#1:454,6\n83#1:398,3\n83#1:402,3\n103#1:447,6\n114#1:460,3\n114#1:464,3\n138#1:508,6\n246#1:514,6\n83#1:401\n114#1:463\n84#1:405\n84#1:406,10\n84#1:446\n116#1:467\n116#1:468,9\n116#1:507\n84#1:416,6\n84#1:431,3\n84#1:440,2\n84#1:445\n116#1:477,6\n116#1:492,3\n116#1:501,2\n116#1:506\n84#1:422,9\n84#1:442,3\n116#1:483,9\n116#1:503,3\n84#1:434,6\n116#1:495,6\n103#1:520,5\n*E\n"})
public final class j0 {

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt\n*L\n1#1,69:1\n103#2:70\n*E\n"})
    public static final class a implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f15706a;

        public a(l0 l0Var) {
            this.f15706a = l0Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f15706a.a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f15708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0 l0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f15708b = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f15708b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15707a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f15708b.dismiss();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt$TooltipPopup$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n1282#2,6:391\n70#3:397\n67#3,9:398\n77#3:437\n80#4,6:407\n87#4,3:422\n90#4,2:431\n94#4:436\n391#5,9:413\n400#5,3:433\n4360#6,6:425\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/foundation/BasicTooltipKt$TooltipPopup$2\n*L\n147#1:391,6\n145#1:397\n145#1:398,9\n145#1:437\n145#1:407,6\n145#1:422,3\n145#1:431,2\n145#1:436\n145#1:413,9\n145#1:433,3\n145#1:425,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f15710b;

        /* JADX WARN: Multi-variable type inference failed */
        c(String str, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f15709a = str;
            this.f15710b = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(String str, androidx.compose.ui.semantics.e0 e0Var) {
            androidx.compose.ui.semantics.b0.E1(e0Var, androidx.compose.ui.semantics.g.f41102b.a());
            androidx.compose.ui.semantics.b0.G1(e0Var, str);
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
                androidx.compose.runtime.m0.A0(916917707, i10, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.kt:144)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(this.f15709a);
            final String str = this.f15709a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.foundation.k0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j0.c.f(str, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f15710b;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0Var, 0));
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
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
            androidx.compose.runtime.c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f15712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(l0 l0Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f15712b = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f15712b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15711a;
            if (i10 == 0) {
                ResultKt.m(obj);
                l0 l0Var = this.f15712b;
                this.f15711a = 1;
                if (l0.e(l0Var, null, this, 1, null) == objL) {
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

    static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f15713a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f15714a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f15715b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f15716c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l0 f15717d;

            /* JADX INFO: renamed from: androidx.compose.foundation.j0$e$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", i = {0, 0, 1, 1}, l = {166, 169, 175}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
            static final class C0092a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f15718a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f15719b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f15720c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f15721d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ l0 f15722e;

                /* JADX INFO: renamed from: androidx.compose.foundation.j0$e$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", i = {}, l = {172}, m = "invokeSuspend", n = {}, s = {})
                static final class C0093a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f15723a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ l0 f15724b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0093a(l0 l0Var, kotlin.coroutines.d<? super C0093a> dVar) {
                        super(2, dVar);
                        this.f15724b = l0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0093a(this.f15724b, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f15723a;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            l0 l0Var = this.f15724b;
                            q3 q3Var = q3.UserInput;
                            this.f15723a = 1;
                            if (l0Var.c(q3Var, this) == objL) {
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
                        return ((C0093a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0092a(kotlinx.coroutines.s0 s0Var, l0 l0Var, kotlin.coroutines.d<? super C0092a> dVar) {
                    super(2, dVar);
                    this.f15721d = s0Var;
                    this.f15722e = l0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0092a c0092a = new C0092a(this.f15721d, this.f15722e, dVar);
                    c0092a.f15720c = obj;
                    return c0092a;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x008d  */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
                
                    if (r15 == r0) goto L28;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r16) {
                    /*
                        r15 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r15.f15719b
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L40
                        if (r1 == r4) goto L31
                        if (r1 == r3) goto L20
                        if (r1 != r2) goto L18
                        kotlin.ResultKt.m(r16)
                        r15 = r16
                        goto Lab
                    L18:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    L20:
                        java.lang.Object r1 = r15.f15718a
                        androidx.compose.ui.input.pointer.s r1 = (androidx.compose.ui.input.pointer.s) r1
                        java.lang.Object r3 = r15.f15720c
                        androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                        kotlin.ResultKt.m(r16)
                        r7 = r1
                        r1 = r16
                        r1 = r16
                        goto L87
                    L31:
                        java.lang.Object r1 = r15.f15718a
                        androidx.compose.ui.input.pointer.s r1 = (androidx.compose.ui.input.pointer.s) r1
                        java.lang.Object r4 = r15.f15720c
                        androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.c) r4
                        kotlin.ResultKt.m(r16)
                        r7 = r1
                        r1 = r16
                        goto L5d
                    L40:
                        kotlin.ResultKt.m(r16)
                        java.lang.Object r1 = r15.f15720c
                        r5 = r1
                        androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.c) r5
                        androidx.compose.ui.input.pointer.s r7 = androidx.compose.ui.input.pointer.s.Initial
                        r15.f15720c = r5
                        r15.f15718a = r7
                        r15.f15719b = r4
                        r6 = 0
                        r9 = 1
                        r10 = 0
                        r8 = r15
                        java.lang.Object r1 = androidx.compose.foundation.gestures.c5.g(r5, r6, r7, r8, r9, r10)
                        if (r1 != r0) goto L5b
                        goto Laa
                    L5b:
                        r4 = r5
                        r4 = r5
                    L5d:
                        androidx.compose.ui.input.pointer.c0 r1 = (androidx.compose.ui.input.pointer.c0) r1
                        int r1 = r1.C()
                        androidx.compose.ui.input.pointer.r0$a r5 = androidx.compose.ui.input.pointer.r0.f39113b
                        int r6 = r5.d()
                        boolean r6 = androidx.compose.ui.input.pointer.r0.i(r1, r6)
                        if (r6 != 0) goto L79
                        int r5 = r5.c()
                        boolean r1 = androidx.compose.ui.input.pointer.r0.i(r1, r5)
                        if (r1 == 0) goto Lc4
                    L79:
                        r15.f15720c = r4
                        r15.f15718a = r7
                        r15.f15719b = r3
                        java.lang.Object r1 = androidx.compose.foundation.gestures.c5.z(r4, r7, r15)
                        if (r1 != r0) goto L86
                        goto Laa
                    L86:
                        r3 = r4
                    L87:
                        androidx.compose.foundation.gestures.g3 r1 = (androidx.compose.foundation.gestures.g3) r1
                        boolean r1 = r1 instanceof androidx.compose.foundation.gestures.g3.c
                        if (r1 == 0) goto Lc4
                        kotlinx.coroutines.s0 r9 = r15.f15721d
                        androidx.compose.foundation.j0$e$a$a$a r12 = new androidx.compose.foundation.j0$e$a$a$a
                        androidx.compose.foundation.l0 r1 = r15.f15722e
                        r4 = 0
                        r12.<init>(r1, r4)
                        r13 = 3
                        r14 = 0
                        r10 = 0
                        r11 = 0
                        kotlinx.coroutines.i.e(r9, r10, r11, r12, r13, r14)
                        r15.f15720c = r4
                        r15.f15718a = r4
                        r15.f15719b = r2
                        java.lang.Object r15 = r3.I6(r7, r15)
                        if (r15 != r0) goto Lab
                    Laa:
                        return r0
                    Lab:
                        androidx.compose.ui.input.pointer.q r15 = (androidx.compose.ui.input.pointer.q) r15
                        java.util.List r15 = r15.e()
                        int r0 = r15.size()
                        r1 = 0
                    Lb6:
                        if (r1 >= r0) goto Lc4
                        java.lang.Object r2 = r15.get(r1)
                        androidx.compose.ui.input.pointer.c0 r2 = (androidx.compose.ui.input.pointer.c0) r2
                        r2.a()
                        int r1 = r1 + 1
                        goto Lb6
                    Lc4:
                        kotlin.Unit r15 = kotlin.Unit.f312394a
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.j0.e.a.C0092a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0092a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.l0 l0Var, l0 l0Var2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f15716c = l0Var;
                this.f15717d = l0Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f15716c, this.f15717d, dVar);
                aVar.f15715b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f15714a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f15715b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f15716c;
                    C0092a c0092a = new C0092a(s0Var, this.f15717d, null);
                    this.f15714a = 1;
                    if (androidx.compose.foundation.gestures.e3.e(l0Var, c0092a, this) == objL) {
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

        e(l0 l0Var) {
            this.f15713a = l0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = kotlinx.coroutines.t0.g(new a(l0Var, this.f15713a, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    static final class f implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f15725a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f15726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f15727b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f15728c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l0 f15729d;

            /* JADX INFO: renamed from: androidx.compose.foundation.j0$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", i = {0, 0}, l = {com.facebook.internal.p.f100029m}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
            static final class C0094a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f15730a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f15731b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f15732c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f15733d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ l0 f15734e;

                /* JADX INFO: renamed from: androidx.compose.foundation.j0$f$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
                static final class C0095a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f15735a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ l0 f15736b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0095a(l0 l0Var, kotlin.coroutines.d<? super C0095a> dVar) {
                        super(2, dVar);
                        this.f15736b = l0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0095a(this.f15736b, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f15735a;
                        int i11 = 4 << 1;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            l0 l0Var = this.f15736b;
                            q3 q3Var = q3.UserInput;
                            this.f15735a = 1;
                            if (l0Var.c(q3Var, this) == objL) {
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
                        return ((C0095a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0094a(kotlinx.coroutines.s0 s0Var, l0 l0Var, kotlin.coroutines.d<? super C0094a> dVar) {
                    super(2, dVar);
                    this.f15733d = s0Var;
                    this.f15734e = l0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0094a c0094a = new C0094a(this.f15733d, this.f15734e, dVar);
                    c0094a.f15732c = obj;
                    return c0094a;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x003e  */
                /* JADX WARN: Code duplicated, block: B:15:0x0060  */
                /* JADX WARN: Code duplicated, block: B:17:0x0072  */
                /* JADX WARN: Code duplicated, block: B:18:0x0088  */
                /* JADX WARN: Code duplicated, block: B:20:0x0094  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:13:0x0040). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0060
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.a
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        r12 = 4
                        int r1 = r13.f15731b
                        r2 = 1
                        if (r1 == 0) goto L26
                        if (r1 != r2) goto L1b
                        java.lang.Object r1 = r13.f15730a
                        r12 = 2
                        androidx.compose.ui.input.pointer.s r1 = (androidx.compose.ui.input.pointer.s) r1
                        r12 = 5
                        java.lang.Object r3 = r13.f15732c
                        r12 = 7
                        androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                        kotlin.ResultKt.m(r14)
                        goto L40
                    L1b:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "iosr ei / o/tc/eeu /totoeus//mnevl/eawo bkfnrlrihc/"
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        r12 = 2
                        throw r13
                    L26:
                        kotlin.ResultKt.m(r14)
                        java.lang.Object r14 = r13.f15732c
                        androidx.compose.ui.input.pointer.c r14 = (androidx.compose.ui.input.pointer.c) r14
                        androidx.compose.ui.input.pointer.s r1 = androidx.compose.ui.input.pointer.s.Main
                        r3 = r14
                        r3 = r14
                    L31:
                        r13.f15732c = r3
                        r13.f15730a = r1
                        r12 = 0
                        r13.f15731b = r2
                        java.lang.Object r14 = r3.I6(r1, r13)
                        if (r14 != r0) goto L40
                        r12 = 5
                        return r0
                    L40:
                        androidx.compose.ui.input.pointer.q r14 = (androidx.compose.ui.input.pointer.q) r14
                        java.util.List r4 = r14.e()
                        r12 = 5
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        androidx.compose.ui.input.pointer.c0 r4 = (androidx.compose.ui.input.pointer.c0) r4
                        int r4 = r4.C()
                        r12 = 2
                        androidx.compose.ui.input.pointer.r0$a r5 = androidx.compose.ui.input.pointer.r0.f39113b
                        int r5 = r5.b()
                        boolean r4 = androidx.compose.ui.input.pointer.r0.i(r4, r5)
                        r12 = 3
                        if (r4 == 0) goto L31
                        int r14 = r14.j()
                        r12 = 1
                        androidx.compose.ui.input.pointer.u$a r4 = androidx.compose.ui.input.pointer.u.f39127b
                        r12 = 2
                        int r5 = r4.a()
                        boolean r5 = androidx.compose.ui.input.pointer.u.k(r14, r5)
                        if (r5 == 0) goto L88
                        kotlinx.coroutines.s0 r6 = r13.f15733d
                        androidx.compose.foundation.j0$f$a$a$a r9 = new androidx.compose.foundation.j0$f$a$a$a
                        androidx.compose.foundation.l0 r14 = r13.f15734e
                        r4 = 0
                        r12 = r4
                        r9.<init>(r14, r4)
                        r10 = 3
                        r11 = 0
                        r12 = r12 ^ r11
                        r7 = 2
                        r7 = 0
                        r8 = 3
                        r8 = 0
                        kotlinx.coroutines.i.e(r6, r7, r8, r9, r10, r11)
                        goto L31
                    L88:
                        r12 = 1
                        int r4 = r4.b()
                        r12 = 2
                        boolean r14 = androidx.compose.ui.input.pointer.u.k(r14, r4)
                        if (r14 == 0) goto L31
                        androidx.compose.foundation.l0 r14 = r13.f15734e
                        r14.dismiss()
                        goto L31
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.j0.f.a.C0094a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0094a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.l0 l0Var, l0 l0Var2, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f15728c = l0Var;
                this.f15729d = l0Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f15728c, this.f15729d, dVar);
                aVar.f15727b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f15726a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f15727b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f15728c;
                    int i11 = 3 >> 0;
                    C0094a c0094a = new C0094a(s0Var, this.f15729d, null);
                    this.f15726a = 1;
                    if (l0Var.g5(c0094a, this) == objL) {
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

        f(l0 l0Var) {
            this.f15725a = l0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = kotlinx.coroutines.t0.g(new a(l0Var, this.f15725a, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0148  */
    /* JADX WARN: Code duplicated, block: B:103:0x0154  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:107:0x0177  */
    /* JADX WARN: Code duplicated, block: B:109:0x0185  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x0202  */
    /* JADX WARN: Code duplicated, block: B:119:0x020a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0210  */
    /* JADX WARN: Code duplicated, block: B:124:0x0227  */
    /* JADX WARN: Code duplicated, block: B:127:0x022f  */
    /* JADX WARN: Code duplicated, block: B:130:0x023a  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0100  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    @androidx.compose.runtime.o
    @b2
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void h(@NotNull final androidx.compose.ui.window.s sVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull l0 l0Var, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i13;
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        int i16;
        boolean z12;
        int i17;
        int i18;
        boolean z13;
        int i19;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        int i20;
        int i21;
        boolean z14;
        final boolean z15;
        final boolean z16;
        s5 s5VarT;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        kotlinx.coroutines.s0 s0Var;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z17;
        Object objI1;
        final l0 l0Var2 = l0Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(196062260);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(sVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                function4 = function2;
                i12 |= c0VarR.k0(function4) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= androidx.media3.exoplayer.a5.S0;
            } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(l0Var2)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z12 = z10;
                        if (c0VarR.G(z12)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((196608 & i10) == 0) {
                            z13 = z11;
                            if (c0VarR.G(z13)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            if ((i10 & 1572864) == 0) {
                                function5 = function3;
                                if (c0VarR.k0(function5)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                                i12 |= i20;
                            }
                            i21 = i12;
                            if ((599187 & i21) != 599186) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (c0VarR.h(z14, i21 & 1)) {
                                if (i14 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i16 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z12;
                                }
                                if (i18 != 0) {
                                    z13 = true;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                                }
                                objI0 = c0VarR.i0();
                                aVar = androidx.compose.runtime.c0.f35327a;
                                if (objI0 == aVar.a()) {
                                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                    c0VarR.Y(objI0);
                                }
                                s0Var = (kotlinx.coroutines.s0) objI0;
                                androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar2);
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
                                c0VarD = y7.d(c0VarR);
                                y7.n(c0VarD, a1VarK, aVar3.e());
                                y7.n(c0VarD, b1VarK, aVar3.g());
                                function2B = aVar3.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar3.f());
                                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                                if (l0Var.isVisible()) {
                                    c0VarR.E(1833353604);
                                    int i22 = i21 >> 3;
                                    z17 = false;
                                    m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i22 & com.planner5d.library.engine.input.f.b.B) | (i22 & 7168) | ((i21 << 9) & 57344));
                                    c0VarR = c0VarR;
                                    c0VarR.A();
                                } else {
                                    z17 = false;
                                    c0VarR.E(1833584244);
                                    c0VarR.A();
                                }
                                int i23 = i21 >> 3;
                                int i24 = ((i21 >> 15) & 14) | (i23 & com.planner5d.library.engine.input.f.b.B) | (i23 & 896) | ((i21 >> 9) & 7168);
                                l0Var2 = l0Var;
                                androidx.compose.ui.a0 a0Var3 = a0Var2;
                                boolean z18 = z13;
                                p(z18, l0Var2, a0Var3, function5, c0VarR, i24, 0);
                                c0VarR.o();
                                if ((i21 & 896) == 256) {
                                    z17 = true;
                                }
                                objI1 = c0VarR.i0();
                                if (z17 || objI1 == aVar.a()) {
                                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                z15 = z18;
                                a0Var2 = a0Var3;
                            } else {
                                c0VarR.u();
                                z15 = z13;
                            }
                            z16 = z12;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                final l0 l0Var3 = l0Var2;
                                final androidx.compose.ui.a0 a0Var4 = a0Var2;
                                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return j0.j(sVar, function2, l0Var3, a0Var4, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 1572864;
                        function5 = function3;
                        i21 = i12;
                        if ((599187 & i21) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i21 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            s0Var = (kotlinx.coroutines.s0) objI0;
                            androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar4);
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
                            c0VarD = y7.d(c0VarR);
                            y7.n(c0VarD, a1VarK2, aVar5.e());
                            y7.n(c0VarD, b1VarK2, aVar5.g());
                            function2B = aVar5.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN2, aVar5.f());
                            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                            if (l0Var.isVisible()) {
                                c0VarR.E(1833353604);
                                int i25 = i21 >> 3;
                                z17 = false;
                                m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i25 & com.planner5d.library.engine.input.f.b.B) | (i25 & 7168) | ((i21 << 9) & 57344));
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                z17 = false;
                                c0VarR.E(1833584244);
                                c0VarR.A();
                            }
                            int i26 = i21 >> 3;
                            int i27 = ((i21 >> 15) & 14) | (i26 & com.planner5d.library.engine.input.f.b.B) | (i26 & 896) | ((i21 >> 9) & 7168);
                            l0Var2 = l0Var;
                            androidx.compose.ui.a0 a0Var5 = a0Var2;
                            boolean z19 = z13;
                            p(z19, l0Var2, a0Var5, function5, c0VarR, i27, 0);
                            c0VarR.o();
                            if ((i21 & 896) == 256) {
                                z17 = true;
                            }
                            objI1 = c0VarR.i0();
                            if (z17) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z15 = z19;
                            a0Var2 = a0Var5;
                        } else {
                            c0VarR.u();
                            z15 = z13;
                        }
                        z16 = z12;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final l0 l0Var4 = l0Var2;
                            final androidx.compose.ui.a0 a0Var6 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return j0.j(sVar, function2, l0Var4, a0Var6, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    z13 = z11;
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            function5 = function3;
                            if (c0VarR.k0(function5)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        i21 = i12;
                        if ((599187 & i21) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i21 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            s0Var = (kotlinx.coroutines.s0) objI0;
                            androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar6);
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
                            c0VarD = y7.d(c0VarR);
                            y7.n(c0VarD, a1VarK3, aVar7.e());
                            y7.n(c0VarD, b1VarK3, aVar7.g());
                            function2B = aVar7.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN3, aVar7.f());
                            androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                            if (l0Var.isVisible()) {
                                c0VarR.E(1833353604);
                                int i28 = i21 >> 3;
                                z17 = false;
                                m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i28 & com.planner5d.library.engine.input.f.b.B) | (i28 & 7168) | ((i21 << 9) & 57344));
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                z17 = false;
                                c0VarR.E(1833584244);
                                c0VarR.A();
                            }
                            int i29 = i21 >> 3;
                            int i210 = ((i21 >> 15) & 14) | (i29 & com.planner5d.library.engine.input.f.b.B) | (i29 & 896) | ((i21 >> 9) & 7168);
                            l0Var2 = l0Var;
                            androidx.compose.ui.a0 a0Var7 = a0Var2;
                            boolean z110 = z13;
                            p(z110, l0Var2, a0Var7, function5, c0VarR, i210, 0);
                            c0VarR.o();
                            if ((i21 & 896) == 256) {
                                z17 = true;
                            }
                            objI1 = c0VarR.i0();
                            if (z17) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z15 = z110;
                            a0Var2 = a0Var7;
                        } else {
                            c0VarR.u();
                            z15 = z13;
                        }
                        z16 = z12;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final l0 l0Var5 = l0Var2;
                            final androidx.compose.ui.a0 a0Var8 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return j0.j(sVar, function2, l0Var5, a0Var8, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    function5 = function3;
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar8);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        function0A = aVar9.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK4, aVar9.e());
                        y7.n(c0VarD, b1VarK4, aVar9.g());
                        function2B = aVar9.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN4, aVar9.f());
                        androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i211 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i211 & com.planner5d.library.engine.input.f.b.B) | (i211 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i212 = i21 >> 3;
                        int i213 = ((i21 >> 15) & 14) | (i212 & com.planner5d.library.engine.input.f.b.B) | (i212 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        boolean z111 = z13;
                        p(z111, l0Var2, a0Var9, function5, c0VarR, i213, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z111;
                        a0Var2 = a0Var9;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var6 = l0Var2;
                        final androidx.compose.ui.a0 a0Var10 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var6, a0Var10, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z12 = z10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            function5 = function3;
                            if (c0VarR.k0(function5)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        i21 = i12;
                        if ((599187 & i21) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i21 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            s0Var = (kotlinx.coroutines.s0) objI0;
                            androidx.compose.ui.a0.a aVar10 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar10);
                            androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                            function0A = aVar11.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = y7.d(c0VarR);
                            y7.n(c0VarD, a1VarK5, aVar11.e());
                            y7.n(c0VarD, b1VarK5, aVar11.g());
                            function2B = aVar11.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN5, aVar11.f());
                            androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                            if (l0Var.isVisible()) {
                                c0VarR.E(1833353604);
                                int i214 = i21 >> 3;
                                z17 = false;
                                m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i214 & com.planner5d.library.engine.input.f.b.B) | (i214 & 7168) | ((i21 << 9) & 57344));
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                z17 = false;
                                c0VarR.E(1833584244);
                                c0VarR.A();
                            }
                            int i215 = i21 >> 3;
                            int i216 = ((i21 >> 15) & 14) | (i215 & com.planner5d.library.engine.input.f.b.B) | (i215 & 896) | ((i21 >> 9) & 7168);
                            l0Var2 = l0Var;
                            androidx.compose.ui.a0 a0Var11 = a0Var2;
                            boolean z112 = z13;
                            p(z112, l0Var2, a0Var11, function5, c0VarR, i216, 0);
                            c0VarR.o();
                            if ((i21 & 896) == 256) {
                                z17 = true;
                            }
                            objI1 = c0VarR.i0();
                            if (z17) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z15 = z112;
                            a0Var2 = a0Var11;
                        } else {
                            c0VarR.u();
                            z15 = z13;
                        }
                        z16 = z12;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final l0 l0Var7 = l0Var2;
                            final androidx.compose.ui.a0 a0Var12 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return j0.j(sVar, function2, l0Var7, a0Var12, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    function5 = function3;
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar12);
                        androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                        function0A = aVar13.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK6, aVar13.e());
                        y7.n(c0VarD, b1VarK6, aVar13.g());
                        function2B = aVar13.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN6, aVar13.f());
                        androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i217 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i217 & com.planner5d.library.engine.input.f.b.B) | (i217 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i218 = i21 >> 3;
                        int i219 = ((i21 >> 15) & 14) | (i218 & com.planner5d.library.engine.input.f.b.B) | (i218 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var13 = a0Var2;
                        boolean z113 = z13;
                        p(z113, l0Var2, a0Var13, function5, c0VarR, i219, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z113;
                        a0Var2 = a0Var13;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var8 = l0Var2;
                        final androidx.compose.ui.a0 a0Var14 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var8, a0Var14, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar14 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, aVar14);
                        androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                        function0A = aVar15.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK7, aVar15.e());
                        y7.n(c0VarD, b1VarK7, aVar15.g());
                        function2B = aVar15.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN7, aVar15.f());
                        androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i2110 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2110 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i2111 = i21 >> 3;
                        int i2112 = ((i21 >> 15) & 14) | (i2111 & com.planner5d.library.engine.input.f.b.B) | (i2111 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var15 = a0Var2;
                        boolean z114 = z13;
                        p(z114, l0Var2, a0Var15, function5, c0VarR, i2112, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z114;
                        a0Var2 = a0Var15;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var9 = l0Var2;
                        final androidx.compose.ui.a0 a0Var16 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var9, a0Var16, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function5 = function3;
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar16 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar16);
                    androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                    function0A = aVar17.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK8, aVar17.e());
                    y7.n(c0VarD, b1VarK8, aVar17.g());
                    function2B = aVar17.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar17.f());
                    androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i2113 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2113 & com.planner5d.library.engine.input.f.b.B) | (i2113 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i2114 = i21 >> 3;
                    int i2115 = ((i21 >> 15) & 14) | (i2114 & com.planner5d.library.engine.input.f.b.B) | (i2114 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var17 = a0Var2;
                    boolean z115 = z13;
                    p(z115, l0Var2, a0Var17, function5, c0VarR, i2115, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z115;
                    a0Var2 = a0Var17;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var10 = l0Var2;
                    final androidx.compose.ui.a0 a0Var18 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var10, a0Var18, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            a0Var2 = a0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c0VarR.G(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            function5 = function3;
                            if (c0VarR.k0(function5)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        i21 = i12;
                        if ((599187 & i21) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i21 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            s0Var = (kotlinx.coroutines.s0) objI0;
                            androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, aVar18);
                            androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                            function0A = aVar19.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = y7.d(c0VarR);
                            y7.n(c0VarD, a1VarK9, aVar19.e());
                            y7.n(c0VarD, b1VarK9, aVar19.g());
                            function2B = aVar19.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN9, aVar19.f());
                            androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                            if (l0Var.isVisible()) {
                                c0VarR.E(1833353604);
                                int i2116 = i21 >> 3;
                                z17 = false;
                                m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2116 & com.planner5d.library.engine.input.f.b.B) | (i2116 & 7168) | ((i21 << 9) & 57344));
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                z17 = false;
                                c0VarR.E(1833584244);
                                c0VarR.A();
                            }
                            int i2117 = i21 >> 3;
                            int i2118 = ((i21 >> 15) & 14) | (i2117 & com.planner5d.library.engine.input.f.b.B) | (i2117 & 896) | ((i21 >> 9) & 7168);
                            l0Var2 = l0Var;
                            androidx.compose.ui.a0 a0Var19 = a0Var2;
                            boolean z116 = z13;
                            p(z116, l0Var2, a0Var19, function5, c0VarR, i2118, 0);
                            c0VarR.o();
                            if ((i21 & 896) == 256) {
                                z17 = true;
                            }
                            objI1 = c0VarR.i0();
                            if (z17) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z15 = z116;
                            a0Var2 = a0Var19;
                        } else {
                            c0VarR.u();
                            z15 = z13;
                        }
                        z16 = z12;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final l0 l0Var11 = l0Var2;
                            final androidx.compose.ui.a0 a0Var110 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return j0.j(sVar, function2, l0Var11, a0Var110, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    function5 = function3;
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar110 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, aVar110);
                        androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                        function0A = aVar111.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK10, aVar111.e());
                        y7.n(c0VarD, b1VarK10, aVar111.g());
                        function2B = aVar111.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN10, aVar111.f());
                        androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i2119 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2119 & com.planner5d.library.engine.input.f.b.B) | (i2119 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i21110 = i21 >> 3;
                        int i21111 = ((i21 >> 15) & 14) | (i21110 & com.planner5d.library.engine.input.f.b.B) | (i21110 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var111 = a0Var2;
                        boolean z117 = z13;
                        p(z117, l0Var2, a0Var111, function5, c0VarR, i21111, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z117;
                        a0Var2 = a0Var111;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var12 = l0Var2;
                        final androidx.compose.ui.a0 a0Var112 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var12, a0Var112, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar112 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, aVar112);
                        androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                        function0A = aVar113.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK11, aVar113.e());
                        y7.n(c0VarD, b1VarK11, aVar113.g());
                        function2B = aVar113.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN11, aVar113.f());
                        androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i21112 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21112 & com.planner5d.library.engine.input.f.b.B) | (i21112 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i21113 = i21 >> 3;
                        int i21114 = ((i21 >> 15) & 14) | (i21113 & com.planner5d.library.engine.input.f.b.B) | (i21113 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var113 = a0Var2;
                        boolean z118 = z13;
                        p(z118, l0Var2, a0Var113, function5, c0VarR, i21114, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z118;
                        a0Var2 = a0Var113;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var13 = l0Var2;
                        final androidx.compose.ui.a0 a0Var114 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var13, a0Var114, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function5 = function3;
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar114 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, aVar114);
                    androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                    function0A = aVar115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK12, aVar115.e());
                    y7.n(c0VarD, b1VarK12, aVar115.g());
                    function2B = aVar115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN12, aVar115.f());
                    androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i21115 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21115 & com.planner5d.library.engine.input.f.b.B) | (i21115 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i21116 = i21 >> 3;
                    int i21117 = ((i21 >> 15) & 14) | (i21116 & com.planner5d.library.engine.input.f.b.B) | (i21116 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var115 = a0Var2;
                    boolean z119 = z13;
                    p(z119, l0Var2, a0Var115, function5, c0VarR, i21117, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z119;
                    a0Var2 = a0Var115;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var14 = l0Var2;
                    final androidx.compose.ui.a0 a0Var116 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var14, a0Var116, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z12 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar116 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, aVar116);
                        androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                        function0A = aVar117.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK13, aVar117.e());
                        y7.n(c0VarD, b1VarK13, aVar117.g());
                        function2B = aVar117.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN13, aVar117.f());
                        androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i21118 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21118 & com.planner5d.library.engine.input.f.b.B) | (i21118 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i21119 = i21 >> 3;
                        int i211110 = ((i21 >> 15) & 14) | (i21119 & com.planner5d.library.engine.input.f.b.B) | (i21119 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var117 = a0Var2;
                        boolean z1110 = z13;
                        p(z1110, l0Var2, a0Var117, function5, c0VarR, i211110, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z1110;
                        a0Var2 = a0Var117;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var15 = l0Var2;
                        final androidx.compose.ui.a0 a0Var118 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var15, a0Var118, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function5 = function3;
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar118 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar118);
                    androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                    function0A = aVar119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK14, aVar119.e());
                    y7.n(c0VarD, b1VarK14, aVar119.g());
                    function2B = aVar119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN14, aVar119.f());
                    androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i211111 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i211111 & com.planner5d.library.engine.input.f.b.B) | (i211111 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i211112 = i21 >> 3;
                    int i211113 = ((i21 >> 15) & 14) | (i211112 & com.planner5d.library.engine.input.f.b.B) | (i211112 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var119 = a0Var2;
                    boolean z1111 = z13;
                    p(z1111, l0Var2, a0Var119, function5, c0VarR, i211113, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z1111;
                    a0Var2 = a0Var119;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var16 = l0Var2;
                    final androidx.compose.ui.a0 a0Var1110 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var16, a0Var1110, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar1110 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, aVar1110);
                    androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                    function0A = aVar1111.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK15, aVar1111.e());
                    y7.n(c0VarD, b1VarK15, aVar1111.g());
                    function2B = aVar1111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN15, aVar1111.f());
                    androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i211114 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i211114 & com.planner5d.library.engine.input.f.b.B) | (i211114 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i211115 = i21 >> 3;
                    int i211116 = ((i21 >> 15) & 14) | (i211115 & com.planner5d.library.engine.input.f.b.B) | (i211115 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var1111 = a0Var2;
                    boolean z1112 = z13;
                    p(z1112, l0Var2, a0Var1111, function5, c0VarR, i211116, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z1112;
                    a0Var2 = a0Var1111;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var17 = l0Var2;
                    final androidx.compose.ui.a0 a0Var1112 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var17, a0Var1112, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function5 = function3;
            i21 = i12;
            if ((599187 & i21) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z12;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.a0.a aVar1112 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, aVar1112);
                androidx.compose.ui.node.g.a aVar1113 = androidx.compose.ui.node.g.I;
                function0A = aVar1113.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK16, aVar1113.e());
                y7.n(c0VarD, b1VarK16, aVar1113.g());
                function2B = aVar1113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN16, aVar1113.f());
                androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
                if (l0Var.isVisible()) {
                    c0VarR.E(1833353604);
                    int i211117 = i21 >> 3;
                    z17 = false;
                    m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i211117 & com.planner5d.library.engine.input.f.b.B) | (i211117 & 7168) | ((i21 << 9) & 57344));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    z17 = false;
                    c0VarR.E(1833584244);
                    c0VarR.A();
                }
                int i211118 = i21 >> 3;
                int i211119 = ((i21 >> 15) & 14) | (i211118 & com.planner5d.library.engine.input.f.b.B) | (i211118 & 896) | ((i21 >> 9) & 7168);
                l0Var2 = l0Var;
                androidx.compose.ui.a0 a0Var1113 = a0Var2;
                boolean z1113 = z13;
                p(z1113, l0Var2, a0Var1113, function5, c0VarR, i211119, 0);
                c0VarR.o();
                if ((i21 & 896) == 256) {
                    z17 = true;
                }
                objI1 = c0VarR.i0();
                if (z17) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z15 = z1113;
                a0Var2 = a0Var1113;
            } else {
                c0VarR.u();
                z15 = z13;
            }
            z16 = z12;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final l0 l0Var18 = l0Var2;
                final androidx.compose.ui.a0 a0Var1114 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j0.j(sVar, function2, l0Var18, a0Var1114, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function4 = function2;
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if (c0VarR.D(l0Var2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z12 = z10;
                    if (c0VarR.G(z12)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            function5 = function3;
                            if (c0VarR.k0(function5)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        i21 = i12;
                        if ((599187 & i21) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i21 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i16 != 0) {
                                z12 = true;
                            } else {
                                z12 = z12;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            s0Var = (kotlinx.coroutines.s0) objI0;
                            androidx.compose.ui.a0.a aVar1114 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.layout.a1 a1VarK17 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK17 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, aVar1114);
                            androidx.compose.ui.node.g.a aVar1115 = androidx.compose.ui.node.g.I;
                            function0A = aVar1115.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = y7.d(c0VarR);
                            y7.n(c0VarD, a1VarK17, aVar1115.e());
                            y7.n(c0VarD, b1VarK17, aVar1115.g());
                            function2B = aVar1115.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN17, aVar1115.f());
                            androidx.compose.foundation.layout.d0 d0Var17 = androidx.compose.foundation.layout.d0.f15956a;
                            if (l0Var.isVisible()) {
                                c0VarR.E(1833353604);
                                int i2111110 = i21 >> 3;
                                z17 = false;
                                m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111110 & com.planner5d.library.engine.input.f.b.B) | (i2111110 & 7168) | ((i21 << 9) & 57344));
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                z17 = false;
                                c0VarR.E(1833584244);
                                c0VarR.A();
                            }
                            int i2111111 = i21 >> 3;
                            int i2111112 = ((i21 >> 15) & 14) | (i2111111 & com.planner5d.library.engine.input.f.b.B) | (i2111111 & 896) | ((i21 >> 9) & 7168);
                            l0Var2 = l0Var;
                            androidx.compose.ui.a0 a0Var1115 = a0Var2;
                            boolean z1114 = z13;
                            p(z1114, l0Var2, a0Var1115, function5, c0VarR, i2111112, 0);
                            c0VarR.o();
                            if ((i21 & 896) == 256) {
                                z17 = true;
                            }
                            objI1 = c0VarR.i0();
                            if (z17) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z15 = z1114;
                            a0Var2 = a0Var1115;
                        } else {
                            c0VarR.u();
                            z15 = z13;
                        }
                        z16 = z12;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final l0 l0Var19 = l0Var2;
                            final androidx.compose.ui.a0 a0Var1116 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return j0.j(sVar, function2, l0Var19, a0Var1116, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    function5 = function3;
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar1116 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK18 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, aVar1116);
                        androidx.compose.ui.node.g.a aVar1117 = androidx.compose.ui.node.g.I;
                        function0A = aVar1117.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK18, aVar1117.e());
                        y7.n(c0VarD, b1VarK18, aVar1117.g());
                        function2B = aVar1117.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN18, aVar1117.f());
                        androidx.compose.foundation.layout.d0 d0Var18 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i2111113 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111113 & com.planner5d.library.engine.input.f.b.B) | (i2111113 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i2111114 = i21 >> 3;
                        int i2111115 = ((i21 >> 15) & 14) | (i2111114 & com.planner5d.library.engine.input.f.b.B) | (i2111114 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var1117 = a0Var2;
                        boolean z1115 = z13;
                        p(z1115, l0Var2, a0Var1117, function5, c0VarR, i2111115, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z1115;
                        a0Var2 = a0Var1117;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var110 = l0Var2;
                        final androidx.compose.ui.a0 a0Var1118 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var110, a0Var1118, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                z13 = z11;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar1118 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK19 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK19 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, aVar1118);
                        androidx.compose.ui.node.g.a aVar1119 = androidx.compose.ui.node.g.I;
                        function0A = aVar1119.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK19, aVar1119.e());
                        y7.n(c0VarD, b1VarK19, aVar1119.g());
                        function2B = aVar1119.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN19, aVar1119.f());
                        androidx.compose.foundation.layout.d0 d0Var19 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i2111116 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111116 & com.planner5d.library.engine.input.f.b.B) | (i2111116 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i2111117 = i21 >> 3;
                        int i2111118 = ((i21 >> 15) & 14) | (i2111117 & com.planner5d.library.engine.input.f.b.B) | (i2111117 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var1119 = a0Var2;
                        boolean z1116 = z13;
                        p(z1116, l0Var2, a0Var1119, function5, c0VarR, i2111118, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z1116;
                        a0Var2 = a0Var1119;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var111 = l0Var2;
                        final androidx.compose.ui.a0 a0Var11110 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var111, a0Var11110, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function5 = function3;
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar11110 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, aVar11110);
                    androidx.compose.ui.node.g.a aVar11111 = androidx.compose.ui.node.g.I;
                    function0A = aVar11111.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK110, aVar11111.e());
                    y7.n(c0VarD, b1VarK110, aVar11111.g());
                    function2B = aVar11111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN110, aVar11111.f());
                    androidx.compose.foundation.layout.d0 d0Var110 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i2111119 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111119 & com.planner5d.library.engine.input.f.b.B) | (i2111119 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i21111110 = i21 >> 3;
                    int i21111111 = ((i21 >> 15) & 14) | (i21111110 & com.planner5d.library.engine.input.f.b.B) | (i21111110 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var11111 = a0Var2;
                    boolean z1117 = z13;
                    p(z1117, l0Var2, a0Var11111, function5, c0VarR, i21111111, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z1117;
                    a0Var2 = a0Var11111;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var112 = l0Var2;
                    final androidx.compose.ui.a0 a0Var11112 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var112, a0Var11112, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z12 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar11112 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK111 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, aVar11112);
                        androidx.compose.ui.node.g.a aVar11113 = androidx.compose.ui.node.g.I;
                        function0A = aVar11113.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK111, aVar11113.e());
                        y7.n(c0VarD, b1VarK111, aVar11113.g());
                        function2B = aVar11113.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN111, aVar11113.f());
                        androidx.compose.foundation.layout.d0 d0Var111 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i21111112 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21111112 & com.planner5d.library.engine.input.f.b.B) | (i21111112 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i21111113 = i21 >> 3;
                        int i21111114 = ((i21 >> 15) & 14) | (i21111113 & com.planner5d.library.engine.input.f.b.B) | (i21111113 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var11113 = a0Var2;
                        boolean z1118 = z13;
                        p(z1118, l0Var2, a0Var11113, function5, c0VarR, i21111114, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z1118;
                        a0Var2 = a0Var11113;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var113 = l0Var2;
                        final androidx.compose.ui.a0 a0Var11114 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var113, a0Var11114, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function5 = function3;
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar11114 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, aVar11114);
                    androidx.compose.ui.node.g.a aVar11115 = androidx.compose.ui.node.g.I;
                    function0A = aVar11115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK112, aVar11115.e());
                    y7.n(c0VarD, b1VarK112, aVar11115.g());
                    function2B = aVar11115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN112, aVar11115.f());
                    androidx.compose.foundation.layout.d0 d0Var112 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i21111115 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21111115 & com.planner5d.library.engine.input.f.b.B) | (i21111115 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i21111116 = i21 >> 3;
                    int i21111117 = ((i21 >> 15) & 14) | (i21111116 & com.planner5d.library.engine.input.f.b.B) | (i21111116 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var11115 = a0Var2;
                    boolean z1119 = z13;
                    p(z1119, l0Var2, a0Var11115, function5, c0VarR, i21111117, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z1119;
                    a0Var2 = a0Var11115;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var114 = l0Var2;
                    final androidx.compose.ui.a0 a0Var11116 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var114, a0Var11116, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar11116 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, aVar11116);
                    androidx.compose.ui.node.g.a aVar11117 = androidx.compose.ui.node.g.I;
                    function0A = aVar11117.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK113, aVar11117.e());
                    y7.n(c0VarD, b1VarK113, aVar11117.g());
                    function2B = aVar11117.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN113, aVar11117.f());
                    androidx.compose.foundation.layout.d0 d0Var113 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i21111118 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21111118 & com.planner5d.library.engine.input.f.b.B) | (i21111118 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i21111119 = i21 >> 3;
                    int i211111110 = ((i21 >> 15) & 14) | (i21111119 & com.planner5d.library.engine.input.f.b.B) | (i21111119 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var11117 = a0Var2;
                    boolean z11110 = z13;
                    p(z11110, l0Var2, a0Var11117, function5, c0VarR, i211111110, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z11110;
                    a0Var2 = a0Var11117;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var115 = l0Var2;
                    final androidx.compose.ui.a0 a0Var11118 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var115, a0Var11118, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function5 = function3;
            i21 = i12;
            if ((599187 & i21) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z12;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.a0.a aVar11118 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, aVar11118);
                androidx.compose.ui.node.g.a aVar11119 = androidx.compose.ui.node.g.I;
                function0A = aVar11119.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK114, aVar11119.e());
                y7.n(c0VarD, b1VarK114, aVar11119.g());
                function2B = aVar11119.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN114, aVar11119.f());
                androidx.compose.foundation.layout.d0 d0Var114 = androidx.compose.foundation.layout.d0.f15956a;
                if (l0Var.isVisible()) {
                    c0VarR.E(1833353604);
                    int i211111111 = i21 >> 3;
                    z17 = false;
                    m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i211111111 & com.planner5d.library.engine.input.f.b.B) | (i211111111 & 7168) | ((i21 << 9) & 57344));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    z17 = false;
                    c0VarR.E(1833584244);
                    c0VarR.A();
                }
                int i211111112 = i21 >> 3;
                int i211111113 = ((i21 >> 15) & 14) | (i211111112 & com.planner5d.library.engine.input.f.b.B) | (i211111112 & 896) | ((i21 >> 9) & 7168);
                l0Var2 = l0Var;
                androidx.compose.ui.a0 a0Var11119 = a0Var2;
                boolean z11111 = z13;
                p(z11111, l0Var2, a0Var11119, function5, c0VarR, i211111113, 0);
                c0VarR.o();
                if ((i21 & 896) == 256) {
                    z17 = true;
                }
                objI1 = c0VarR.i0();
                if (z17) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z15 = z11111;
                a0Var2 = a0Var11119;
            } else {
                c0VarR.u();
                z15 = z13;
            }
            z16 = z12;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final l0 l0Var116 = l0Var2;
                final androidx.compose.ui.a0 a0Var111110 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j0.j(sVar, function2, l0Var116, a0Var111110, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                z12 = z10;
                if (c0VarR.G(z12)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        function5 = function3;
                        if (c0VarR.k0(function5)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((599187 & i21) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i21 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i16 != 0) {
                            z12 = true;
                        } else {
                            z12 = z12;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        androidx.compose.ui.a0.a aVar111110 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK115 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, aVar111110);
                        androidx.compose.ui.node.g.a aVar111111 = androidx.compose.ui.node.g.I;
                        function0A = aVar111111.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarK115, aVar111111.e());
                        y7.n(c0VarD, b1VarK115, aVar111111.g());
                        function2B = aVar111111.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN115, aVar111111.f());
                        androidx.compose.foundation.layout.d0 d0Var115 = androidx.compose.foundation.layout.d0.f15956a;
                        if (l0Var.isVisible()) {
                            c0VarR.E(1833353604);
                            int i211111114 = i21 >> 3;
                            z17 = false;
                            m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i211111114 & com.planner5d.library.engine.input.f.b.B) | (i211111114 & 7168) | ((i21 << 9) & 57344));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            z17 = false;
                            c0VarR.E(1833584244);
                            c0VarR.A();
                        }
                        int i211111115 = i21 >> 3;
                        int i211111116 = ((i21 >> 15) & 14) | (i211111115 & com.planner5d.library.engine.input.f.b.B) | (i211111115 & 896) | ((i21 >> 9) & 7168);
                        l0Var2 = l0Var;
                        androidx.compose.ui.a0 a0Var111111 = a0Var2;
                        boolean z11112 = z13;
                        p(z11112, l0Var2, a0Var111111, function5, c0VarR, i211111116, 0);
                        c0VarR.o();
                        if ((i21 & 896) == 256) {
                            z17 = true;
                        }
                        objI1 = c0VarR.i0();
                        if (z17) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z15 = z11112;
                        a0Var2 = a0Var111111;
                    } else {
                        c0VarR.u();
                        z15 = z13;
                    }
                    z16 = z12;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final l0 l0Var117 = l0Var2;
                        final androidx.compose.ui.a0 a0Var111112 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return j0.j(sVar, function2, l0Var117, a0Var111112, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function5 = function3;
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar111112 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, aVar111112);
                    androidx.compose.ui.node.g.a aVar111113 = androidx.compose.ui.node.g.I;
                    function0A = aVar111113.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK116, aVar111113.e());
                    y7.n(c0VarD, b1VarK116, aVar111113.g());
                    function2B = aVar111113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN116, aVar111113.f());
                    androidx.compose.foundation.layout.d0 d0Var116 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i211111117 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i211111117 & com.planner5d.library.engine.input.f.b.B) | (i211111117 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i211111118 = i21 >> 3;
                    int i211111119 = ((i21 >> 15) & 14) | (i211111118 & com.planner5d.library.engine.input.f.b.B) | (i211111118 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var111113 = a0Var2;
                    boolean z11113 = z13;
                    p(z11113, l0Var2, a0Var111113, function5, c0VarR, i211111119, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z11113;
                    a0Var2 = a0Var111113;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var118 = l0Var2;
                    final androidx.compose.ui.a0 a0Var111114 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var118, a0Var111114, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z13 = z11;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar111114 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, aVar111114);
                    androidx.compose.ui.node.g.a aVar111115 = androidx.compose.ui.node.g.I;
                    function0A = aVar111115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK117, aVar111115.e());
                    y7.n(c0VarD, b1VarK117, aVar111115.g());
                    function2B = aVar111115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN117, aVar111115.f());
                    androidx.compose.foundation.layout.d0 d0Var117 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i2111111110 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111111110 & com.planner5d.library.engine.input.f.b.B) | (i2111111110 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i2111111111 = i21 >> 3;
                    int i2111111112 = ((i21 >> 15) & 14) | (i2111111111 & com.planner5d.library.engine.input.f.b.B) | (i2111111111 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var111115 = a0Var2;
                    boolean z11114 = z13;
                    p(z11114, l0Var2, a0Var111115, function5, c0VarR, i2111111112, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z11114;
                    a0Var2 = a0Var111115;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var119 = l0Var2;
                    final androidx.compose.ui.a0 a0Var111116 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var119, a0Var111116, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function5 = function3;
            i21 = i12;
            if ((599187 & i21) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z12;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.a0.a aVar111116 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, aVar111116);
                androidx.compose.ui.node.g.a aVar111117 = androidx.compose.ui.node.g.I;
                function0A = aVar111117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK118, aVar111117.e());
                y7.n(c0VarD, b1VarK118, aVar111117.g());
                function2B = aVar111117.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN118, aVar111117.f());
                androidx.compose.foundation.layout.d0 d0Var118 = androidx.compose.foundation.layout.d0.f15956a;
                if (l0Var.isVisible()) {
                    c0VarR.E(1833353604);
                    int i2111111113 = i21 >> 3;
                    z17 = false;
                    m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111111113 & com.planner5d.library.engine.input.f.b.B) | (i2111111113 & 7168) | ((i21 << 9) & 57344));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    z17 = false;
                    c0VarR.E(1833584244);
                    c0VarR.A();
                }
                int i2111111114 = i21 >> 3;
                int i2111111115 = ((i21 >> 15) & 14) | (i2111111114 & com.planner5d.library.engine.input.f.b.B) | (i2111111114 & 896) | ((i21 >> 9) & 7168);
                l0Var2 = l0Var;
                androidx.compose.ui.a0 a0Var111117 = a0Var2;
                boolean z11115 = z13;
                p(z11115, l0Var2, a0Var111117, function5, c0VarR, i2111111115, 0);
                c0VarR.o();
                if ((i21 & 896) == 256) {
                    z17 = true;
                }
                objI1 = c0VarR.i0();
                if (z17) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z15 = z11115;
                a0Var2 = a0Var111117;
            } else {
                c0VarR.u();
                z15 = z13;
            }
            z16 = z12;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final l0 l0Var1110 = l0Var2;
                final androidx.compose.ui.a0 a0Var111118 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j0.j(sVar, function2, l0Var1110, a0Var111118, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z12 = z10;
        i18 = i11 & 32;
        if (i18 != 0) {
            if ((196608 & i10) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    function5 = function3;
                    if (c0VarR.k0(function5)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((599187 & i21) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i21 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i16 != 0) {
                        z12 = true;
                    } else {
                        z12 = z12;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0.a aVar111118 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, aVar111118);
                    androidx.compose.ui.node.g.a aVar111119 = androidx.compose.ui.node.g.I;
                    function0A = aVar111119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarK119, aVar111119.e());
                    y7.n(c0VarD, b1VarK119, aVar111119.g());
                    function2B = aVar111119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN119, aVar111119.f());
                    androidx.compose.foundation.layout.d0 d0Var119 = androidx.compose.foundation.layout.d0.f15956a;
                    if (l0Var.isVisible()) {
                        c0VarR.E(1833353604);
                        int i2111111116 = i21 >> 3;
                        z17 = false;
                        m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111111116 & com.planner5d.library.engine.input.f.b.B) | (i2111111116 & 7168) | ((i21 << 9) & 57344));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        z17 = false;
                        c0VarR.E(1833584244);
                        c0VarR.A();
                    }
                    int i2111111117 = i21 >> 3;
                    int i2111111118 = ((i21 >> 15) & 14) | (i2111111117 & com.planner5d.library.engine.input.f.b.B) | (i2111111117 & 896) | ((i21 >> 9) & 7168);
                    l0Var2 = l0Var;
                    androidx.compose.ui.a0 a0Var111119 = a0Var2;
                    boolean z11116 = z13;
                    p(z11116, l0Var2, a0Var111119, function5, c0VarR, i2111111118, 0);
                    c0VarR.o();
                    if ((i21 & 896) == 256) {
                        z17 = true;
                    }
                    objI1 = c0VarR.i0();
                    if (z17) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z15 = z11116;
                    a0Var2 = a0Var111119;
                } else {
                    c0VarR.u();
                    z15 = z13;
                }
                z16 = z12;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final l0 l0Var1111 = l0Var2;
                    final androidx.compose.ui.a0 a0Var1111110 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return j0.j(sVar, function2, l0Var1111, a0Var1111110, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function5 = function3;
            i21 = i12;
            if ((599187 & i21) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z12;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.a0.a aVar1111110 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK1110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, aVar1111110);
                androidx.compose.ui.node.g.a aVar1111111 = androidx.compose.ui.node.g.I;
                function0A = aVar1111111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK1110, aVar1111111.e());
                y7.n(c0VarD, b1VarK1110, aVar1111111.g());
                function2B = aVar1111111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1110, aVar1111111.f());
                androidx.compose.foundation.layout.d0 d0Var1110 = androidx.compose.foundation.layout.d0.f15956a;
                if (l0Var.isVisible()) {
                    c0VarR.E(1833353604);
                    int i2111111119 = i21 >> 3;
                    z17 = false;
                    m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i2111111119 & com.planner5d.library.engine.input.f.b.B) | (i2111111119 & 7168) | ((i21 << 9) & 57344));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    z17 = false;
                    c0VarR.E(1833584244);
                    c0VarR.A();
                }
                int i21111111110 = i21 >> 3;
                int i21111111111 = ((i21 >> 15) & 14) | (i21111111110 & com.planner5d.library.engine.input.f.b.B) | (i21111111110 & 896) | ((i21 >> 9) & 7168);
                l0Var2 = l0Var;
                androidx.compose.ui.a0 a0Var1111111 = a0Var2;
                boolean z11117 = z13;
                p(z11117, l0Var2, a0Var1111111, function5, c0VarR, i21111111111, 0);
                c0VarR.o();
                if ((i21 & 896) == 256) {
                    z17 = true;
                }
                objI1 = c0VarR.i0();
                if (z17) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z15 = z11117;
                a0Var2 = a0Var1111111;
            } else {
                c0VarR.u();
                z15 = z13;
            }
            z16 = z12;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final l0 l0Var1112 = l0Var2;
                final androidx.compose.ui.a0 a0Var1111112 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j0.j(sVar, function2, l0Var1112, a0Var1111112, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        z13 = z11;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                function5 = function3;
                if (c0VarR.k0(function5)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((599187 & i21) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i21 & 1)) {
                if (i14 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i16 != 0) {
                    z12 = true;
                } else {
                    z12 = z12;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.a0.a aVar1111112 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK1111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK1111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, aVar1111112);
                androidx.compose.ui.node.g.a aVar1111113 = androidx.compose.ui.node.g.I;
                function0A = aVar1111113.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarK1111, aVar1111113.e());
                y7.n(c0VarD, b1VarK1111, aVar1111113.g());
                function2B = aVar1111113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1111, aVar1111113.f());
                androidx.compose.foundation.layout.d0 d0Var1111 = androidx.compose.foundation.layout.d0.f15956a;
                if (l0Var.isVisible()) {
                    c0VarR.E(1833353604);
                    int i21111111112 = i21 >> 3;
                    z17 = false;
                    m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21111111112 & com.planner5d.library.engine.input.f.b.B) | (i21111111112 & 7168) | ((i21 << 9) & 57344));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    z17 = false;
                    c0VarR.E(1833584244);
                    c0VarR.A();
                }
                int i21111111113 = i21 >> 3;
                int i21111111114 = ((i21 >> 15) & 14) | (i21111111113 & com.planner5d.library.engine.input.f.b.B) | (i21111111113 & 896) | ((i21 >> 9) & 7168);
                l0Var2 = l0Var;
                androidx.compose.ui.a0 a0Var1111113 = a0Var2;
                boolean z11118 = z13;
                p(z11118, l0Var2, a0Var1111113, function5, c0VarR, i21111111114, 0);
                c0VarR.o();
                if ((i21 & 896) == 256) {
                    z17 = true;
                }
                objI1 = c0VarR.i0();
                if (z17) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z15 = z11118;
                a0Var2 = a0Var1111113;
            } else {
                c0VarR.u();
                z15 = z13;
            }
            z16 = z12;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final l0 l0Var1113 = l0Var2;
                final androidx.compose.ui.a0 a0Var1111114 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return j0.j(sVar, function2, l0Var1113, a0Var1111114, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        function5 = function3;
        i21 = i12;
        if ((599187 & i21) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i21 & 1)) {
            if (i14 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i16 != 0) {
                z12 = true;
            } else {
                z12 = z12;
            }
            if (i18 != 0) {
                z13 = true;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(196062260, i21, -1, "androidx.compose.foundation.BasicTooltipBox (BasicTooltip.kt:81)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            s0Var = (kotlinx.coroutines.s0) objI0;
            androidx.compose.ui.a0.a aVar1111114 = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK1112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK1112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, aVar1111114);
            androidx.compose.ui.node.g.a aVar1111115 = androidx.compose.ui.node.g.I;
            function0A = aVar1111115.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK1112, aVar1111115.e());
            y7.n(c0VarD, b1VarK1112, aVar1111115.g());
            function2B = aVar1111115.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1112, aVar1111115.f());
            androidx.compose.foundation.layout.d0 d0Var1112 = androidx.compose.foundation.layout.d0.f15956a;
            if (l0Var.isVisible()) {
                c0VarR.E(1833353604);
                int i21111111115 = i21 >> 3;
                z17 = false;
                m(sVar, l0Var, s0Var, z12, function4, c0VarR, (i21 & 14) | (i21111111115 & com.planner5d.library.engine.input.f.b.B) | (i21111111115 & 7168) | ((i21 << 9) & 57344));
                c0VarR = c0VarR;
                c0VarR.A();
            } else {
                z17 = false;
                c0VarR.E(1833584244);
                c0VarR.A();
            }
            int i21111111116 = i21 >> 3;
            int i21111111117 = ((i21 >> 15) & 14) | (i21111111116 & com.planner5d.library.engine.input.f.b.B) | (i21111111116 & 896) | ((i21 >> 9) & 7168);
            l0Var2 = l0Var;
            androidx.compose.ui.a0 a0Var1111115 = a0Var2;
            boolean z11119 = z13;
            p(z11119, l0Var2, a0Var1111115, function5, c0VarR, i21111111117, 0);
            c0VarR.o();
            if ((i21 & 896) == 256) {
                z17 = true;
            }
            objI1 = c0VarR.i0();
            if (z17) {
                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: androidx.compose.foundation.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j0.i(l0Var2, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.runtime.b2.d(l0Var2, (Function1) objI1, c0VarR, (i21 >> 6) & 14);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z15 = z11119;
            a0Var2 = a0Var1111115;
        } else {
            c0VarR.u();
            z15 = z13;
        }
        z16 = z12;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final l0 l0Var1114 = l0Var2;
            final androidx.compose.ui.a0 a0Var1111116 = a0Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j0.j(sVar, function2, l0Var1114, a0Var1111116, z16, z15, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 i(l0 l0Var, androidx.compose.runtime.v1 v1Var) {
        return new a(l0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.window.s sVar, Function2 function2, l0 l0Var, androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(sVar, function2, l0Var, a0Var, z10, z11, function3, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @k7
    @b2
    @NotNull
    public static final l0 k(boolean z10, boolean z11, @NotNull s3 s3Var) {
        return new m0(z10, z11, s3Var);
    }

    public static /* synthetic */ l0 l(boolean z10, boolean z11, s3 s3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            s3Var = b0.f13912a.a();
        }
        return k(z10, z11, s3Var);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void m(final androidx.compose.ui.window.s sVar, final l0 l0Var, final kotlinx.coroutines.s0 s0Var, final boolean z10, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.ui.window.s sVar2;
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1882542163);
        if ((i10 & 6) == 0) {
            sVar2 = sVar;
            i11 = (c0VarR.D(sVar2) ? 4 : 2) | i10;
        } else {
            sVar2 = sVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(l0Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.k0(s0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if (c0VarR.h((i11 & 9363) != 9362, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1882542163, i11, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.kt:133)");
            }
            String strA = n0.f18119a.a(c0VarR, 6);
            boolean zK0 = c0VarR.k0(s0Var) | ((i11 & com.planner5d.library.engine.input.f.b.B) == 32);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.foundation.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j0.n(l0Var, s0Var);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.window.c.a(sVar2, (Function0) objI0, new androidx.compose.ui.window.t(z10, false, false, false, 14, (DefaultConstructorMarker) null), androidx.compose.runtime.internal.w.e(916917707, true, new c(strA, function2), c0VarR, 54), c0VarR, (i11 & 14) | 3072, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j0.o(sVar, l0Var, s0Var, z10, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(l0 l0Var, kotlinx.coroutines.s0 s0Var) {
        if (l0Var.isVisible()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new b(l0Var, null), 3, null);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.ui.window.s sVar, l0 l0Var, kotlinx.coroutines.s0 s0Var, boolean z10, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        m(sVar, l0Var, s0Var, z10, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void p(final boolean z10, final l0 l0Var, androidx.compose.ui.a0 a0Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1381511093);
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
            i12 |= c0VarR.D(l0Var) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function2) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1381511093, i12, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.kt:112)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarR = r(u(a0Var, z10, l0Var), n0.f18119a.b(c0VarR, 6), z10, l0Var, (kotlinx.coroutines.s0) objI0);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarK, aVar.e());
            y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf((i12 >> 9) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return j0.q(z10, l0Var, a0Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(boolean z10, l0 l0Var, androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        p(z10, l0Var, a0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 r(androidx.compose.ui.a0 a0Var, final String str, boolean z10, final l0 l0Var, final kotlinx.coroutines.s0 s0Var) {
        return z10 ? androidx.compose.ui.semantics.t.e(a0Var, true, new Function1() { // from class: androidx.compose.foundation.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j0.s(str, s0Var, l0Var, (androidx.compose.ui.semantics.e0) obj);
            }
        }) : a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(String str, final kotlinx.coroutines.s0 s0Var, final l0 l0Var, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.T0(e0Var, str, new Function0() { // from class: androidx.compose.foundation.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(j0.t(s0Var, l0Var));
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(kotlinx.coroutines.s0 s0Var, l0 l0Var) {
        kotlinx.coroutines.k.f(s0Var, null, null, new d(l0Var, null), 3, null);
        return true;
    }

    private static final androidx.compose.ui.a0 u(androidx.compose.ui.a0 a0Var, boolean z10, l0 l0Var) {
        return z10 ? androidx.compose.ui.input.pointer.w0.e(androidx.compose.ui.input.pointer.w0.e(a0Var, l0Var, new e(l0Var)), l0Var, new f(l0Var)) : a0Var;
    }

    @androidx.compose.runtime.o
    @b2
    @NotNull
    public static final l0 v(boolean z10, boolean z11, @Nullable s3 s3Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            s3Var = b0.f13912a.a();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1123859613, i10, -1, "androidx.compose.foundation.rememberBasicTooltipState (BasicTooltip.kt:245)");
        }
        boolean z12 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(s3Var)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256);
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new m0(z10, z11, s3Var);
            c0Var.Y(objI0);
        }
        m0 m0Var = (m0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return m0Var;
    }
}
