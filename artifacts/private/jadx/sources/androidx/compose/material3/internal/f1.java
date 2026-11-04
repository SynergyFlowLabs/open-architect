package androidx.compose.material3.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.c5;
import androidx.compose.material3.n90;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.a5;
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
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,462:1\n607#2:463\n604#2,6:464\n607#2:531\n604#2,6:532\n1282#3,3:470\n1285#3,3:474\n1282#3,6:477\n1282#3,6:525\n1282#3,3:538\n1285#3,3:542\n1282#3,6:586\n1282#3,6:592\n605#4:473\n605#4:541\n70#5:483\n66#5,10:484\n77#5:524\n70#5:545\n67#5,9:546\n77#5:585\n79#6,6:494\n86#6,3:509\n89#6,2:518\n93#6:523\n79#6,6:555\n86#6,3:570\n89#6,2:579\n93#6:584\n347#7,9:500\n356#7,3:520\n347#7,9:561\n356#7,3:581\n4206#8,6:512\n4206#8,6:573\n66#9,5:598\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipKt\n*L\n105#1:463\n105#1:464,6\n148#1:531\n148#1:532,6\n105#1:470,3\n105#1:474,3\n106#1:477,6\n136#1:525,6\n148#1:538,3\n148#1:542,3\n174#1:586,6\n347#1:592,6\n105#1:473\n148#1:541\n113#1:483\n113#1:484,10\n113#1:524\n150#1:545\n150#1:546,9\n150#1:585\n113#1:494,6\n113#1:509,3\n113#1:518,2\n113#1:523\n150#1:555,6\n150#1:570,3\n150#1:579,2\n150#1:584\n113#1:500,9\n113#1:520,3\n150#1:561,9\n150#1:581,3\n113#1:512,6\n150#1:573,6\n136#1:598,5\n*E\n"})
public final class f1 {

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipKt\n*L\n1#1,69:1\n136#2:70\n*E\n"})
    public static final class a implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n90 f28822a;

        public a(n90 n90Var) {
            this.f28822a = n90Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f28822a.a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$TooltipPopup$1$1$1", f = "BasicTooltip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n90 f28824b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n90 n90Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f28824b = n90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f28824b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f28823a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f28824b.dismiss();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipKt$TooltipPopup$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,462:1\n1282#2,6:463\n70#3:469\n67#3,9:470\n77#3:509\n79#4,6:479\n86#4,3:494\n89#4,2:503\n93#4:508\n347#5,9:485\n356#5,3:505\n4206#6,6:497\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipKt$TooltipPopup$2\n*L\n189#1:463,6\n187#1:469\n187#1:470,9\n187#1:509\n187#1:479,6\n187#1:494,3\n187#1:503,2\n187#1:508\n187#1:485,9\n187#1:505,3\n187#1:497,6\n*E\n"})
    static final class c implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f28826b;

        /* JADX WARN: Multi-variable type inference failed */
        c(String str, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f28825a = str;
            this.f28826b = function2;
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
                androidx.compose.runtime.m0.A0(-1287705660, i10, -1, "androidx.compose.material3.internal.TooltipPopup.<anonymous> (BasicTooltip.kt:186)");
            }
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            boolean zD = c0Var.D(this.f28825a);
            final String str = this.f28825a;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.internal.g1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f1.c.f(str, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI0, 1, null);
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f28826b;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
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
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$anchorSemantics$1$1$1", f = "BasicTooltip.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n90 f28828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n90 n90Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f28828b = n90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new d(this.f28828b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28827a;
            if (i10 == 0) {
                ResultKt.m(obj);
                n90 n90Var = this.f28828b;
                this.f28827a = 1;
                if (n90.e(n90Var, null, this, 1, null) == objL) {
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
        final /* synthetic */ n90 f28829a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28830a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f28831b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f28832c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n90 f28833d;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.f1$e$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", i = {0, 0, 0, 0, 1, 1, 1, 2}, l = {210, 216, 238}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "isLongPressedFlow", "pass", "longPressTimeout", "$this$awaitEachGesture", "isLongPressedFlow", "pass", "isLongPressedFlow"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0"})
            static final class C0223a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f28834a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f28835b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                long f28836c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                int f28837d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private /* synthetic */ Object f28838e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f28839f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ n90 f28840g;

                /* JADX INFO: renamed from: androidx.compose.material3.internal.f1$e$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", i = {}, l = {217}, m = "invokeSuspend", n = {}, s = {})
                static final class C0224a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f28841a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private /* synthetic */ Object f28842b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.input.pointer.s f28843c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0224a(androidx.compose.ui.input.pointer.s sVar, kotlin.coroutines.d<? super C0224a> dVar) {
                        super(2, dVar);
                        this.f28843c = sVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        C0224a c0224a = new C0224a(this.f28843c, dVar);
                        c0224a.f28842b = obj;
                        return c0224a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f28841a;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                            return obj;
                        }
                        ResultKt.m(obj);
                        androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f28842b;
                        androidx.compose.ui.input.pointer.s sVar = this.f28843c;
                        this.f28841a = 1;
                        Object objB = c5.B(cVar, sVar, this);
                        return objB == objL ? objL : objB;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
                        return ((C0224a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.material3.internal.f1$e$a$a$b */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", i = {}, l = {224, 227, 227}, m = "invokeSuspend", n = {}, s = {})
                static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f28844a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f28845b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.flow.k0<Boolean> f28846c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ n90 f28847d;

                    /* JADX INFO: renamed from: androidx.compose.material3.internal.f1$e$a$a$b$a, reason: collision with other inner class name */
                    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    static final class C0225a extends kotlin.coroutines.jvm.internal.o implements Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        int f28848a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        /* synthetic */ boolean f28849b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ n90 f28850c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0225a(n90 n90Var, kotlin.coroutines.d<? super C0225a> dVar) {
                            super(2, dVar);
                            this.f28850c = n90Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                            C0225a c0225a = new C0225a(this.f28850c, dVar);
                            c0225a.f28849b = ((Boolean) obj).booleanValue();
                            return c0225a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.d<? super Unit> dVar) {
                            return invoke(bool.booleanValue(), dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            kotlin.coroutines.intrinsics.b.l();
                            if (this.f28848a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                            if (!this.f28849b) {
                                this.f28850c.dismiss();
                            }
                            return Unit.f312394a;
                        }

                        public final Object invoke(boolean z10, kotlin.coroutines.d<? super Unit> dVar) {
                            return ((C0225a) create(Boolean.valueOf(z10), dVar)).invokeSuspend(Unit.f312394a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(kotlinx.coroutines.flow.k0<Boolean> k0Var, n90 n90Var, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.f28846c = k0Var;
                        this.f28847d = n90Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new b(this.f28846c, this.f28847d, dVar);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
                    
                        if (kotlinx.coroutines.flow.k.C(r8, r1, r7) == r0) goto L30;
                     */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                        /*
                            r7 = this;
                            r6 = 7
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            int r1 = r7.f28845b
                            r2 = 0
                            r6 = r6 & r2
                            r3 = 3
                            r4 = 2
                            r6 = r6 | r4
                            r5 = 1
                            if (r1 == 0) goto L34
                            if (r1 == r5) goto L2d
                            if (r1 == r4) goto L29
                            if (r1 == r3) goto L20
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            r6 = 0
                            java.lang.String r8 = "c sroi  ru/rtn/soolieimetaft// en//vok cw/heeu o/eb"
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L20:
                            java.lang.Object r7 = r7.f28844a
                            java.lang.Throwable r7 = (java.lang.Throwable) r7
                            kotlin.ResultKt.m(r8)
                            r6 = 3
                            goto L93
                        L29:
                            kotlin.ResultKt.m(r8)
                            goto L6f
                        L2d:
                            kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L31
                            goto L51
                        L31:
                            r8 = move-exception
                            r6 = 7
                            goto L72
                        L34:
                            r6 = 0
                            kotlin.ResultKt.m(r8)
                            kotlinx.coroutines.flow.k0<java.lang.Boolean> r8 = r7.f28846c     // Catch: java.lang.Throwable -> L31
                            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch: java.lang.Throwable -> L31
                            r6 = 1
                            r8.f(r1)     // Catch: java.lang.Throwable -> L31
                            androidx.compose.material3.n90 r8 = r7.f28847d     // Catch: java.lang.Throwable -> L31
                            androidx.compose.foundation.q3 r1 = androidx.compose.foundation.q3.PreventUserInput     // Catch: java.lang.Throwable -> L31
                            r6 = 2
                            r7.f28845b = r5     // Catch: java.lang.Throwable -> L31
                            r6 = 4
                            java.lang.Object r8 = r8.c(r1, r7)     // Catch: java.lang.Throwable -> L31
                            if (r8 != r0) goto L51
                            goto L91
                        L51:
                            r6 = 5
                            androidx.compose.material3.n90 r8 = r7.f28847d
                            boolean r8 = r8.isVisible()
                            if (r8 == 0) goto L6f
                            kotlinx.coroutines.flow.k0<java.lang.Boolean> r8 = r7.f28846c
                            r6 = 4
                            androidx.compose.material3.internal.f1$e$a$a$b$a r1 = new androidx.compose.material3.internal.f1$e$a$a$b$a
                            androidx.compose.material3.n90 r3 = r7.f28847d
                            r6 = 2
                            r1.<init>(r3, r2)
                            r7.f28845b = r4
                            java.lang.Object r7 = kotlinx.coroutines.flow.k.C(r8, r1, r7)
                            r6 = 3
                            if (r7 != r0) goto L6f
                            goto L91
                        L6f:
                            kotlin.Unit r7 = kotlin.Unit.f312394a
                            return r7
                        L72:
                            r6 = 4
                            androidx.compose.material3.n90 r1 = r7.f28847d
                            boolean r1 = r1.isVisible()
                            r6 = 0
                            if (r1 == 0) goto L94
                            kotlinx.coroutines.flow.k0<java.lang.Boolean> r1 = r7.f28846c
                            androidx.compose.material3.internal.f1$e$a$a$b$a r4 = new androidx.compose.material3.internal.f1$e$a$a$b$a
                            r6 = 7
                            androidx.compose.material3.n90 r5 = r7.f28847d
                            r4.<init>(r5, r2)
                            r7.f28844a = r8
                            r6 = 6
                            r7.f28845b = r3
                            java.lang.Object r7 = kotlinx.coroutines.flow.k.C(r1, r4, r7)
                            if (r7 != r0) goto L92
                        L91:
                            return r0
                        L92:
                            r7 = r8
                        L93:
                            r8 = r7
                        L94:
                            throw r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.f1.e.a.C0223a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0223a(kotlinx.coroutines.s0 s0Var, n90 n90Var, kotlin.coroutines.d<? super C0223a> dVar) {
                    super(2, dVar);
                    this.f28839f = s0Var;
                    this.f28840g = n90Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0223a c0223a = new C0223a(this.f28839f, this.f28840g, dVar);
                    c0223a.f28838e = obj;
                    return c0223a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
                
                    if (r0 == r6) goto L36;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j0] */
                /* JADX WARN: Type inference failed for: r1v7 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 250
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.f1.e.a.C0223a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0223a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.l0 l0Var, n90 n90Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f28832c = l0Var;
                this.f28833d = n90Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f28832c, this.f28833d, dVar);
                aVar.f28831b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28830a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f28831b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f28832c;
                    C0223a c0223a = new C0223a(s0Var, this.f28833d, null);
                    this.f28830a = 1;
                    if (androidx.compose.foundation.gestures.e3.e(l0Var, c0223a, this) == objL) {
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

        e(n90 n90Var) {
            this.f28829a = n90Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = kotlinx.coroutines.t0.g(new a(l0Var, this.f28829a, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    static final class f implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n90 f28851a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.S1}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28852a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f28853b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f28854c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n90 f28855d;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.f1$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", i = {0, 0}, l = {com.planner5d.library.engine.input.f.b.W1}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
            static final class C0226a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f28856a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f28857b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private /* synthetic */ Object f28858c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f28859d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ n90 f28860e;

                /* JADX INFO: renamed from: androidx.compose.material3.internal.f1$f$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", i = {}, l = {258}, m = "invokeSuspend", n = {}, s = {})
                static final class C0227a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f28861a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ n90 f28862b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0227a(n90 n90Var, kotlin.coroutines.d<? super C0227a> dVar) {
                        super(2, dVar);
                        this.f28862b = n90Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        return new C0227a(this.f28862b, dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i10 = this.f28861a;
                        if (i10 == 0) {
                            ResultKt.m(obj);
                            n90 n90Var = this.f28862b;
                            androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.UserInput;
                            this.f28861a = 1;
                            if (n90Var.c(q3Var, this) == objL) {
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
                        return ((C0227a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0226a(kotlinx.coroutines.s0 s0Var, n90 n90Var, kotlin.coroutines.d<? super C0226a> dVar) {
                    super(2, dVar);
                    this.f28859d = s0Var;
                    this.f28860e = n90Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0226a c0226a = new C0226a(this.f28859d, this.f28860e, dVar);
                    c0226a.f28858c = obj;
                    return c0226a;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x003c  */
                /* JADX WARN: Code duplicated, block: B:15:0x005e  */
                /* JADX WARN: Code duplicated, block: B:17:0x0071  */
                /* JADX WARN: Code duplicated, block: B:18:0x0086  */
                /* JADX WARN: Code duplicated, block: B:20:0x0091  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:13:0x003e). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x005e
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.a
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        r12 = 7
                        int r1 = r13.f28857b
                        r12 = 0
                        r2 = 1
                        if (r1 == 0) goto L24
                        if (r1 != r2) goto L1a
                        java.lang.Object r1 = r13.f28856a
                        androidx.compose.ui.input.pointer.s r1 = (androidx.compose.ui.input.pointer.s) r1
                        java.lang.Object r3 = r13.f28858c
                        r12 = 4
                        androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                        kotlin.ResultKt.m(r14)
                        goto L3e
                    L1a:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = " rst cmabe/ivwkie/eu/n /elsolee/f oroh/ttrio cun//o"
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L24:
                        r12 = 1
                        kotlin.ResultKt.m(r14)
                        java.lang.Object r14 = r13.f28858c
                        androidx.compose.ui.input.pointer.c r14 = (androidx.compose.ui.input.pointer.c) r14
                        androidx.compose.ui.input.pointer.s r1 = androidx.compose.ui.input.pointer.s.Main
                        r3 = r14
                    L2f:
                        r13.f28858c = r3
                        r13.f28856a = r1
                        r12 = 2
                        r13.f28857b = r2
                        java.lang.Object r14 = r3.I6(r1, r13)
                        if (r14 != r0) goto L3e
                        r12 = 0
                        return r0
                    L3e:
                        androidx.compose.ui.input.pointer.q r14 = (androidx.compose.ui.input.pointer.q) r14
                        java.util.List r4 = r14.e()
                        r5 = 5
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        r12 = 0
                        androidx.compose.ui.input.pointer.c0 r4 = (androidx.compose.ui.input.pointer.c0) r4
                        int r4 = r4.C()
                        androidx.compose.ui.input.pointer.r0$a r5 = androidx.compose.ui.input.pointer.r0.f39113b
                        int r5 = r5.b()
                        boolean r4 = androidx.compose.ui.input.pointer.r0.i(r4, r5)
                        r12 = 7
                        if (r4 == 0) goto L2f
                        int r14 = r14.j()
                        r12 = 7
                        androidx.compose.ui.input.pointer.u$a r4 = androidx.compose.ui.input.pointer.u.f39127b
                        r12 = 1
                        int r5 = r4.a()
                        r12 = 7
                        boolean r5 = androidx.compose.ui.input.pointer.u.k(r14, r5)
                        if (r5 == 0) goto L86
                        kotlinx.coroutines.s0 r6 = r13.f28859d
                        r12 = 6
                        androidx.compose.material3.internal.f1$f$a$a$a r9 = new androidx.compose.material3.internal.f1$f$a$a$a
                        androidx.compose.material3.n90 r14 = r13.f28860e
                        r4 = 0
                        r9.<init>(r14, r4)
                        r10 = 3
                        r12 = r10
                        r11 = 0
                        r12 = 5
                        r7 = 0
                        r8 = 0
                        kotlinx.coroutines.i.e(r6, r7, r8, r9, r10, r11)
                        goto L2f
                    L86:
                        int r4 = r4.b()
                        boolean r14 = androidx.compose.ui.input.pointer.u.k(r14, r4)
                        r12 = 7
                        if (r14 == 0) goto L2f
                        androidx.compose.material3.n90 r14 = r13.f28860e
                        r14.dismiss()
                        goto L2f
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.f1.f.a.C0226a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0226a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.l0 l0Var, n90 n90Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f28854c = l0Var;
                this.f28855d = n90Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f28854c, this.f28855d, dVar);
                aVar.f28853b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28852a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f28853b;
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f28854c;
                    C0226a c0226a = new C0226a(s0Var, this.f28855d, null);
                    this.f28852a = 1;
                    if (l0Var.g5(c0226a, this) == objL) {
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

        f(n90 n90Var) {
            this.f28851a = n90Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG = kotlinx.coroutines.t0.g(new a(l0Var, this.f28851a, null), dVar);
            return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.p0 f28864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n90 f28865c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.ui.focus.p0 p0Var, n90 n90Var, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f28864b = p0Var;
            this.f28865c = n90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new g(this.f28864b, this.f28865c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28863a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (this.f28864b.k()) {
                    n90 n90Var = this.f28865c;
                    androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.PreventUserInput;
                    this.f28863a = 1;
                    if (n90Var.c(q3Var, this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (this.f28865c.isVisible() && !this.f28864b.k()) {
                this.f28865c.dismiss();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class h implements Function1<androidx.compose.ui.input.key.c, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n90 f28866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n3<Boolean> f28867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28868c;

        h(n90 n90Var, androidx.compose.runtime.n3<Boolean> n3Var, boolean z10) {
            this.f28866a = n90Var;
            this.f28867b = n3Var;
            this.f28868c = z10;
        }

        public final Boolean c(KeyEvent keyEvent) {
            if (!this.f28866a.isVisible()) {
                this.f28867b.setValue(Boolean.FALSE);
            }
            if (!this.f28868c || !androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a()) || !androidx.compose.ui.input.key.b.E4(androidx.compose.ui.input.key.e.a(keyEvent), androidx.compose.ui.input.key.b.f38761b.y3()) || !this.f28866a.isVisible()) {
                return Boolean.FALSE;
            }
            androidx.compose.runtime.n3<Boolean> n3Var = this.f28867b;
            Boolean bool = Boolean.TRUE;
            n3Var.setValue(bool);
            return bool;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return c(cVar.h());
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x0159  */
    /* JADX WARN: Code duplicated, block: B:123:0x0161  */
    /* JADX WARN: Code duplicated, block: B:126:0x0178  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:132:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:147:0x0215  */
    /* JADX WARN: Code duplicated, block: B:149:0x0223  */
    /* JADX WARN: Code duplicated, block: B:152:0x0240  */
    /* JADX WARN: Code duplicated, block: B:154:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x024e  */
    /* JADX WARN: Code duplicated, block: B:159:0x027e  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:172:0x02da  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:178:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:181:0x0312  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final androidx.compose.ui.window.s sVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull n90 n90Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function0<Unit> function0, boolean z10, boolean z11, boolean z12, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        boolean zK0;
        int i13;
        int i14;
        androidx.compose.ui.a0 a0Var2;
        int i15;
        int i16;
        Function0<Unit> function1;
        int i17;
        int i18;
        int i19;
        boolean z13;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z14;
        boolean z15;
        final n90 n90Var2;
        final boolean z16;
        final androidx.compose.ui.a0 a0Var3;
        final Function0<Unit> function5;
        final boolean z17;
        final boolean z18;
        s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        Function0<Unit> function6;
        boolean z19;
        boolean z20;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        kotlinx.coroutines.s0 s0Var;
        Object objI1;
        androidx.compose.runtime.n3 n3Var;
        boolean z21;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.n3 n3Var2;
        Object objI2;
        boolean z22;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1221877520);
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
                i12 |= a5.S0;
            } else if ((i10 & a5.S0) == 0) {
                if ((i10 & 512) == 0) {
                    zK0 = c0VarR.D(n90Var);
                } else {
                    zK0 = c0VarR.k0(n90Var);
                }
                if (zK0) {
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
                        function1 = function0;
                        if (c0VarR.k0(function1)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        i19 = 196608;
                        z13 = z10;
                    } else {
                        i19 = 196608;
                        z13 = z10;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.G(z13)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.G(z11)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i23 = i11 & 128;
                    if (i23 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.G(z12)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i12 |= i24;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function3)) {
                                i25 = 67108864;
                            } else {
                                i25 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i25;
                        }
                        z14 = true;
                        if ((i12 & 38347923) != 38347922) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c0VarR.h(z15, i12 & 1)) {
                            if (i14 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i16 != 0) {
                                function6 = null;
                            } else {
                                function6 = function1;
                            }
                            if (i18 != 0) {
                                z13 = false;
                            }
                            if (i21 != 0) {
                                z19 = true;
                            } else {
                                z19 = z11;
                            }
                            if (i23 != 0) {
                                z20 = false;
                            } else {
                                z20 = z12;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                            }
                            objI0 = c0VarR.i0();
                            aVar = androidx.compose.runtime.c0.f35327a;
                            if (objI0 == aVar.a()) {
                                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                                c0VarR.Y(objI0);
                            }
                            s0Var = (kotlinx.coroutines.s0) objI0;
                            objI1 = c0VarR.i0();
                            if (objI1 == aVar.a()) {
                                objI1 = d7.g(Boolean.FALSE, null, 2, null);
                                c0VarR.Y(objI1);
                            }
                            n3Var = (androidx.compose.runtime.n3) objI1;
                            if (z20 || !(z(c0VarR, 0).getValue().booleanValue() || ((Boolean) n3Var.getValue()).booleanValue())) {
                                z21 = false;
                            } else {
                                z21 = true;
                            }
                            androidx.compose.ui.a0.a aVar2 = androidx.compose.ui.a0.E;
                            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, aVar2);
                            androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                            boolean z23 = z21;
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
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                                c0VarD.Y(Integer.valueOf(iJ));
                                c0VarD.f(Integer.valueOf(iJ), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar3.f());
                            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                            if (n90Var.isVisible()) {
                                c0VarR.E(-1891243071);
                                if (!z13 || z23) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function7 = function4;
                                n3Var2 = n3Var;
                                n(sVar, n90Var, function6, s0Var, z22, n3Var2, function7, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                                c0VarR = c0VarR;
                                c0VarR.A();
                            } else {
                                n3Var2 = n3Var;
                                c0VarR.E(-1890863476);
                                c0VarR.A();
                            }
                            int i26 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                            n90Var2 = n90Var;
                            boolean z24 = z19;
                            boolean z25 = z20;
                            a0Var3 = a0Var4;
                            q(z24, n90Var2, n3Var2, z25, a0Var3, function3, c0VarR, i26, 0);
                            c0VarR.o();
                            if ((i12 & 896) != 256 && ((i12 & 512) == 0 || !c0VarR.k0(n90Var2))) {
                                z14 = false;
                            }
                            objI2 = c0VarR.i0();
                            if (z14 || objI2 == aVar.a()) {
                                objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                    }
                                };
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            z16 = z24;
                            z17 = z25;
                            function5 = function6;
                        } else {
                            n90Var2 = n90Var;
                            c0VarR.u();
                            z16 = z11;
                            a0Var3 = a0Var2;
                            function5 = function1;
                            z17 = z12;
                        }
                        androidx.compose.runtime.c0 c0Var2 = c0VarR;
                        z18 = z13;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            final n90 n90Var3 = n90Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return f1.k(sVar, function2, n90Var3, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    z14 = true;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if (i21 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i23 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        if (z20) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0.a aVar4 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar4);
                        androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                        boolean z26 = z21;
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
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        y7.n(c0VarD, a0VarN2, aVar5.f());
                        androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                        if (n90Var.isVisible()) {
                            c0VarR.E(-1891243071);
                            if (z13) {
                                z22 = true;
                            } else {
                                z22 = true;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function8 = function4;
                            n3Var2 = n3Var;
                            n(sVar, n90Var, function6, s0Var, z22, n3Var2, function8, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            n3Var2 = n3Var;
                            c0VarR.E(-1890863476);
                            c0VarR.A();
                        }
                        int i27 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                        n90Var2 = n90Var;
                        boolean z27 = z19;
                        boolean z28 = z20;
                        a0Var3 = a0Var4;
                        q(z27, n90Var2, n3Var2, z28, a0Var3, function3, c0VarR, i27, 0);
                        c0VarR.o();
                        if ((i12 & 896) != 256) {
                            z14 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z14) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z16 = z27;
                        z17 = z28;
                        function5 = function6;
                    } else {
                        n90Var2 = n90Var;
                        c0VarR.u();
                        z16 = z11;
                        a0Var3 = a0Var2;
                        function5 = function1;
                        z17 = z12;
                    }
                    androidx.compose.runtime.c0 c0Var3 = c0VarR;
                    z18 = z13;
                    s5VarT = c0Var3.T();
                    if (s5VarT != null) {
                        final n90 n90Var4 = n90Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f1.k(sVar, function2, n90Var4, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                function1 = function0;
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i19 = 196608;
                    z13 = z10;
                } else {
                    i19 = 196608;
                    z13 = z10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.G(z11)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 67108864;
                        } else {
                            i25 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i25;
                    }
                    z14 = true;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if (i21 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i23 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        if (z20) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, aVar6);
                        androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                        boolean z29 = z21;
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
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        y7.n(c0VarD, a0VarN3, aVar7.f());
                        androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                        if (n90Var.isVisible()) {
                            c0VarR.E(-1891243071);
                            if (z13) {
                                z22 = true;
                            } else {
                                z22 = true;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function9 = function4;
                            n3Var2 = n3Var;
                            n(sVar, n90Var, function6, s0Var, z22, n3Var2, function9, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            n3Var2 = n3Var;
                            c0VarR.E(-1890863476);
                            c0VarR.A();
                        }
                        int i28 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                        n90Var2 = n90Var;
                        boolean z210 = z19;
                        boolean z211 = z20;
                        a0Var3 = a0Var4;
                        q(z210, n90Var2, n3Var2, z211, a0Var3, function3, c0VarR, i28, 0);
                        c0VarR.o();
                        if ((i12 & 896) != 256) {
                            z14 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z14) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z16 = z210;
                        z17 = z211;
                        function5 = function6;
                    } else {
                        n90Var2 = n90Var;
                        c0VarR.u();
                        z16 = z11;
                        a0Var3 = a0Var2;
                        function5 = function1;
                        z17 = z12;
                    }
                    androidx.compose.runtime.c0 c0Var4 = c0VarR;
                    z18 = z13;
                    s5VarT = c0Var4.T();
                    if (s5VarT != null) {
                        final n90 n90Var5 = n90Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f1.k(sVar, function2, n90Var5, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                z14 = true;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if (i21 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i23 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0.a aVar8 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar8);
                    androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                    boolean z212 = z21;
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
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN4, aVar9.f());
                    androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                    if (n90Var.isVisible()) {
                        c0VarR.E(-1891243071);
                        if (z13) {
                            z22 = true;
                        } else {
                            z22 = true;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function10 = function4;
                        n3Var2 = n3Var;
                        n(sVar, n90Var, function6, s0Var, z22, n3Var2, function10, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        n3Var2 = n3Var;
                        c0VarR.E(-1890863476);
                        c0VarR.A();
                    }
                    int i29 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                    n90Var2 = n90Var;
                    boolean z213 = z19;
                    boolean z214 = z20;
                    a0Var3 = a0Var4;
                    q(z213, n90Var2, n3Var2, z214, a0Var3, function3, c0VarR, i29, 0);
                    c0VarR.o();
                    if ((i12 & 896) != 256) {
                        z14 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z14) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z16 = z213;
                    z17 = z214;
                    function5 = function6;
                } else {
                    n90Var2 = n90Var;
                    c0VarR.u();
                    z16 = z11;
                    a0Var3 = a0Var2;
                    function5 = function1;
                    z17 = z12;
                }
                androidx.compose.runtime.c0 c0Var5 = c0VarR;
                z18 = z13;
                s5VarT = c0Var5.T();
                if (s5VarT != null) {
                    final n90 n90Var6 = n90Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f1.k(sVar, function2, n90Var6, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            a0Var2 = a0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i19 = 196608;
                    z13 = z10;
                } else {
                    i19 = 196608;
                    z13 = z10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.G(z11)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 67108864;
                        } else {
                            i25 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i25;
                    }
                    z14 = true;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if (i21 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i23 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        if (z20) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0.a aVar10 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, aVar10);
                        androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                        boolean z215 = z21;
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
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar11.f());
                        androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                        if (n90Var.isVisible()) {
                            c0VarR.E(-1891243071);
                            if (z13) {
                                z22 = true;
                            } else {
                                z22 = true;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function11 = function4;
                            n3Var2 = n3Var;
                            n(sVar, n90Var, function6, s0Var, z22, n3Var2, function11, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            n3Var2 = n3Var;
                            c0VarR.E(-1890863476);
                            c0VarR.A();
                        }
                        int i210 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                        n90Var2 = n90Var;
                        boolean z216 = z19;
                        boolean z217 = z20;
                        a0Var3 = a0Var4;
                        q(z216, n90Var2, n3Var2, z217, a0Var3, function3, c0VarR, i210, 0);
                        c0VarR.o();
                        if ((i12 & 896) != 256) {
                            z14 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z14) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z16 = z216;
                        z17 = z217;
                        function5 = function6;
                    } else {
                        n90Var2 = n90Var;
                        c0VarR.u();
                        z16 = z11;
                        a0Var3 = a0Var2;
                        function5 = function1;
                        z17 = z12;
                    }
                    androidx.compose.runtime.c0 c0Var6 = c0VarR;
                    z18 = z13;
                    s5VarT = c0Var6.T();
                    if (s5VarT != null) {
                        final n90 n90Var7 = n90Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f1.k(sVar, function2, n90Var7, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                z14 = true;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if (i21 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i23 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar12);
                    androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                    boolean z218 = z21;
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
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN6, aVar13.f());
                    androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                    if (n90Var.isVisible()) {
                        c0VarR.E(-1891243071);
                        if (z13) {
                            z22 = true;
                        } else {
                            z22 = true;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function12 = function4;
                        n3Var2 = n3Var;
                        n(sVar, n90Var, function6, s0Var, z22, n3Var2, function12, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        n3Var2 = n3Var;
                        c0VarR.E(-1890863476);
                        c0VarR.A();
                    }
                    int i211 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                    n90Var2 = n90Var;
                    boolean z219 = z19;
                    boolean z2110 = z20;
                    a0Var3 = a0Var4;
                    q(z219, n90Var2, n3Var2, z2110, a0Var3, function3, c0VarR, i211, 0);
                    c0VarR.o();
                    if ((i12 & 896) != 256) {
                        z14 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z14) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z16 = z219;
                    z17 = z2110;
                    function5 = function6;
                } else {
                    n90Var2 = n90Var;
                    c0VarR.u();
                    z16 = z11;
                    a0Var3 = a0Var2;
                    function5 = function1;
                    z17 = z12;
                }
                androidx.compose.runtime.c0 c0Var7 = c0VarR;
                z18 = z13;
                s5VarT = c0Var7.T();
                if (s5VarT != null) {
                    final n90 n90Var8 = n90Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f1.k(sVar, function2, n90Var8, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function1 = function0;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i19 = 196608;
                z13 = z10;
            } else {
                i19 = 196608;
                z13 = z10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.G(z11)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function3)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i25;
                }
                z14 = true;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if (i21 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i23 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0.a aVar14 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, aVar14);
                    androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                    boolean z2111 = z21;
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
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN7, aVar15.f());
                    androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                    if (n90Var.isVisible()) {
                        c0VarR.E(-1891243071);
                        if (z13) {
                            z22 = true;
                        } else {
                            z22 = true;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function13 = function4;
                        n3Var2 = n3Var;
                        n(sVar, n90Var, function6, s0Var, z22, n3Var2, function13, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        n3Var2 = n3Var;
                        c0VarR.E(-1890863476);
                        c0VarR.A();
                    }
                    int i212 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                    n90Var2 = n90Var;
                    boolean z2112 = z19;
                    boolean z2113 = z20;
                    a0Var3 = a0Var4;
                    q(z2112, n90Var2, n3Var2, z2113, a0Var3, function3, c0VarR, i212, 0);
                    c0VarR.o();
                    if ((i12 & 896) != 256) {
                        z14 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z14) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z16 = z2112;
                    z17 = z2113;
                    function5 = function6;
                } else {
                    n90Var2 = n90Var;
                    c0VarR.u();
                    z16 = z11;
                    a0Var3 = a0Var2;
                    function5 = function1;
                    z17 = z12;
                }
                androidx.compose.runtime.c0 c0Var8 = c0VarR;
                z18 = z13;
                s5VarT = c0Var8.T();
                if (s5VarT != null) {
                    final n90 n90Var9 = n90Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f1.k(sVar, function2, n90Var9, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            z14 = true;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                if (i21 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i23 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                if (z20) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0.a aVar16 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar16);
                androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                boolean z2114 = z21;
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
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN8, aVar17.f());
                androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
                if (n90Var.isVisible()) {
                    c0VarR.E(-1891243071);
                    if (z13) {
                        z22 = true;
                    } else {
                        z22 = true;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function14 = function4;
                    n3Var2 = n3Var;
                    n(sVar, n90Var, function6, s0Var, z22, n3Var2, function14, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    n3Var2 = n3Var;
                    c0VarR.E(-1890863476);
                    c0VarR.A();
                }
                int i213 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                n90Var2 = n90Var;
                boolean z2115 = z19;
                boolean z2116 = z20;
                a0Var3 = a0Var4;
                q(z2115, n90Var2, n3Var2, z2116, a0Var3, function3, c0VarR, i213, 0);
                c0VarR.o();
                if ((i12 & 896) != 256) {
                    z14 = false;
                }
                objI2 = c0VarR.i0();
                if (z14) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z16 = z2115;
                z17 = z2116;
                function5 = function6;
            } else {
                n90Var2 = n90Var;
                c0VarR.u();
                z16 = z11;
                a0Var3 = a0Var2;
                function5 = function1;
                z17 = z12;
            }
            androidx.compose.runtime.c0 c0Var9 = c0VarR;
            z18 = z13;
            s5VarT = c0Var9.T();
            if (s5VarT != null) {
                final n90 n90Var10 = n90Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f1.k(sVar, function2, n90Var10, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function4 = function2;
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            if ((i10 & 512) == 0) {
                zK0 = c0VarR.D(n90Var);
            } else {
                zK0 = c0VarR.k0(n90Var);
            }
            if (zK0) {
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
                    function1 = function0;
                    if (c0VarR.k0(function1)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    i19 = 196608;
                    z13 = z10;
                } else {
                    i19 = 196608;
                    z13 = z10;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.G(z13)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.G(z11)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i23 = i11 & 128;
                if (i23 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.G(z12)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i12 |= i24;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function3)) {
                            i25 = 67108864;
                        } else {
                            i25 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i25;
                    }
                    z14 = true;
                    if ((i12 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c0VarR.h(z15, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i16 != 0) {
                            function6 = null;
                        } else {
                            function6 = function1;
                        }
                        if (i18 != 0) {
                            z13 = false;
                        }
                        if (i21 != 0) {
                            z19 = true;
                        } else {
                            z19 = z11;
                        }
                        if (i23 != 0) {
                            z20 = false;
                        } else {
                            z20 = z12;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                        }
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                            c0VarR.Y(objI0);
                        }
                        s0Var = (kotlinx.coroutines.s0) objI0;
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = d7.g(Boolean.FALSE, null, 2, null);
                            c0VarR.Y(objI1);
                        }
                        n3Var = (androidx.compose.runtime.n3) objI1;
                        if (z20) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                        androidx.compose.ui.layout.a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, aVar18);
                        androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                        boolean z2117 = z21;
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
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        y7.n(c0VarD, a0VarN9, aVar19.f());
                        androidx.compose.foundation.layout.d0 d0Var9 = androidx.compose.foundation.layout.d0.f15956a;
                        if (n90Var.isVisible()) {
                            c0VarR.E(-1891243071);
                            if (z13) {
                                z22 = true;
                            } else {
                                z22 = true;
                            }
                            Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function15 = function4;
                            n3Var2 = n3Var;
                            n(sVar, n90Var, function6, s0Var, z22, n3Var2, function15, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                            c0VarR = c0VarR;
                            c0VarR.A();
                        } else {
                            n3Var2 = n3Var;
                            c0VarR.E(-1890863476);
                            c0VarR.A();
                        }
                        int i214 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                        n90Var2 = n90Var;
                        boolean z2118 = z19;
                        boolean z2119 = z20;
                        a0Var3 = a0Var4;
                        q(z2118, n90Var2, n3Var2, z2119, a0Var3, function3, c0VarR, i214, 0);
                        c0VarR.o();
                        if ((i12 & 896) != 256) {
                            z14 = false;
                        }
                        objI2 = c0VarR.i0();
                        if (z14) {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z16 = z2118;
                        z17 = z2119;
                        function5 = function6;
                    } else {
                        n90Var2 = n90Var;
                        c0VarR.u();
                        z16 = z11;
                        a0Var3 = a0Var2;
                        function5 = function1;
                        z17 = z12;
                    }
                    androidx.compose.runtime.c0 c0Var10 = c0VarR;
                    z18 = z13;
                    s5VarT = c0Var10.T();
                    if (s5VarT != null) {
                        final n90 n90Var11 = n90Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f1.k(sVar, function2, n90Var11, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                z14 = true;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if (i21 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i23 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0.a aVar110 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, aVar110);
                    androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                    boolean z21110 = z21;
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
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN10, aVar111.f());
                    androidx.compose.foundation.layout.d0 d0Var10 = androidx.compose.foundation.layout.d0.f15956a;
                    if (n90Var.isVisible()) {
                        c0VarR.E(-1891243071);
                        if (z13) {
                            z22 = true;
                        } else {
                            z22 = true;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function16 = function4;
                        n3Var2 = n3Var;
                        n(sVar, n90Var, function6, s0Var, z22, n3Var2, function16, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        n3Var2 = n3Var;
                        c0VarR.E(-1890863476);
                        c0VarR.A();
                    }
                    int i215 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                    n90Var2 = n90Var;
                    boolean z21111 = z19;
                    boolean z21112 = z20;
                    a0Var3 = a0Var4;
                    q(z21111, n90Var2, n3Var2, z21112, a0Var3, function3, c0VarR, i215, 0);
                    c0VarR.o();
                    if ((i12 & 896) != 256) {
                        z14 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z14) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z16 = z21111;
                    z17 = z21112;
                    function5 = function6;
                } else {
                    n90Var2 = n90Var;
                    c0VarR.u();
                    z16 = z11;
                    a0Var3 = a0Var2;
                    function5 = function1;
                    z17 = z12;
                }
                androidx.compose.runtime.c0 c0Var11 = c0VarR;
                z18 = z13;
                s5VarT = c0Var11.T();
                if (s5VarT != null) {
                    final n90 n90Var12 = n90Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f1.k(sVar, function2, n90Var12, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            function1 = function0;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i19 = 196608;
                z13 = z10;
            } else {
                i19 = 196608;
                z13 = z10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.G(z11)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function3)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i25;
                }
                z14 = true;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if (i21 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i23 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0.a aVar112 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, aVar112);
                    androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                    boolean z21113 = z21;
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
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN11, aVar113.f());
                    androidx.compose.foundation.layout.d0 d0Var11 = androidx.compose.foundation.layout.d0.f15956a;
                    if (n90Var.isVisible()) {
                        c0VarR.E(-1891243071);
                        if (z13) {
                            z22 = true;
                        } else {
                            z22 = true;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function17 = function4;
                        n3Var2 = n3Var;
                        n(sVar, n90Var, function6, s0Var, z22, n3Var2, function17, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        n3Var2 = n3Var;
                        c0VarR.E(-1890863476);
                        c0VarR.A();
                    }
                    int i216 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                    n90Var2 = n90Var;
                    boolean z21114 = z19;
                    boolean z21115 = z20;
                    a0Var3 = a0Var4;
                    q(z21114, n90Var2, n3Var2, z21115, a0Var3, function3, c0VarR, i216, 0);
                    c0VarR.o();
                    if ((i12 & 896) != 256) {
                        z14 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z14) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z16 = z21114;
                    z17 = z21115;
                    function5 = function6;
                } else {
                    n90Var2 = n90Var;
                    c0VarR.u();
                    z16 = z11;
                    a0Var3 = a0Var2;
                    function5 = function1;
                    z17 = z12;
                }
                androidx.compose.runtime.c0 c0Var12 = c0VarR;
                z18 = z13;
                s5VarT = c0Var12.T();
                if (s5VarT != null) {
                    final n90 n90Var13 = n90Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f1.k(sVar, function2, n90Var13, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            z14 = true;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                if (i21 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i23 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                if (z20) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0.a aVar114 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, aVar114);
                androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                boolean z21116 = z21;
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
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN12, aVar115.f());
                androidx.compose.foundation.layout.d0 d0Var12 = androidx.compose.foundation.layout.d0.f15956a;
                if (n90Var.isVisible()) {
                    c0VarR.E(-1891243071);
                    if (z13) {
                        z22 = true;
                    } else {
                        z22 = true;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function18 = function4;
                    n3Var2 = n3Var;
                    n(sVar, n90Var, function6, s0Var, z22, n3Var2, function18, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    n3Var2 = n3Var;
                    c0VarR.E(-1890863476);
                    c0VarR.A();
                }
                int i217 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                n90Var2 = n90Var;
                boolean z21117 = z19;
                boolean z21118 = z20;
                a0Var3 = a0Var4;
                q(z21117, n90Var2, n3Var2, z21118, a0Var3, function3, c0VarR, i217, 0);
                c0VarR.o();
                if ((i12 & 896) != 256) {
                    z14 = false;
                }
                objI2 = c0VarR.i0();
                if (z14) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z16 = z21117;
                z17 = z21118;
                function5 = function6;
            } else {
                n90Var2 = n90Var;
                c0VarR.u();
                z16 = z11;
                a0Var3 = a0Var2;
                function5 = function1;
                z17 = z12;
            }
            androidx.compose.runtime.c0 c0Var13 = c0VarR;
            z18 = z13;
            s5VarT = c0Var13.T();
            if (s5VarT != null) {
                final n90 n90Var14 = n90Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f1.k(sVar, function2, n90Var14, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                function1 = function0;
                if (c0VarR.k0(function1)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                i19 = 196608;
                z13 = z10;
            } else {
                i19 = 196608;
                z13 = z10;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.G(z13)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.G(z11)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i23 = i11 & 128;
            if (i23 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.G(z12)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i12 |= i24;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function3)) {
                        i25 = 67108864;
                    } else {
                        i25 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i25;
                }
                z14 = true;
                if ((i12 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c0VarR.h(z15, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i16 != 0) {
                        function6 = null;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    if (i21 != 0) {
                        z19 = true;
                    } else {
                        z19 = z11;
                    }
                    if (i23 != 0) {
                        z20 = false;
                    } else {
                        z20 = z12;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                    }
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    s0Var = (kotlinx.coroutines.s0) objI0;
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = d7.g(Boolean.FALSE, null, 2, null);
                        c0VarR.Y(objI1);
                    }
                    n3Var = (androidx.compose.runtime.n3) objI1;
                    if (z20) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    androidx.compose.ui.a0.a aVar116 = androidx.compose.ui.a0.E;
                    androidx.compose.ui.layout.a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, aVar116);
                    androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                    boolean z21119 = z21;
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
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN13, aVar117.f());
                    androidx.compose.foundation.layout.d0 d0Var13 = androidx.compose.foundation.layout.d0.f15956a;
                    if (n90Var.isVisible()) {
                        c0VarR.E(-1891243071);
                        if (z13) {
                            z22 = true;
                        } else {
                            z22 = true;
                        }
                        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function19 = function4;
                        n3Var2 = n3Var;
                        n(sVar, n90Var, function6, s0Var, z22, n3Var2, function19, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                        c0VarR = c0VarR;
                        c0VarR.A();
                    } else {
                        n3Var2 = n3Var;
                        c0VarR.E(-1890863476);
                        c0VarR.A();
                    }
                    int i218 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                    n90Var2 = n90Var;
                    boolean z211110 = z19;
                    boolean z211111 = z20;
                    a0Var3 = a0Var4;
                    q(z211110, n90Var2, n3Var2, z211111, a0Var3, function3, c0VarR, i218, 0);
                    c0VarR.o();
                    if ((i12 & 896) != 256) {
                        z14 = false;
                    }
                    objI2 = c0VarR.i0();
                    if (z14) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z16 = z211110;
                    z17 = z211111;
                    function5 = function6;
                } else {
                    n90Var2 = n90Var;
                    c0VarR.u();
                    z16 = z11;
                    a0Var3 = a0Var2;
                    function5 = function1;
                    z17 = z12;
                }
                androidx.compose.runtime.c0 c0Var14 = c0VarR;
                z18 = z13;
                s5VarT = c0Var14.T();
                if (s5VarT != null) {
                    final n90 n90Var15 = n90Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f1.k(sVar, function2, n90Var15, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            z14 = true;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                if (i21 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i23 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                if (z20) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0.a aVar118 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar118);
                androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                boolean z211112 = z21;
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
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN14, aVar119.f());
                androidx.compose.foundation.layout.d0 d0Var14 = androidx.compose.foundation.layout.d0.f15956a;
                if (n90Var.isVisible()) {
                    c0VarR.E(-1891243071);
                    if (z13) {
                        z22 = true;
                    } else {
                        z22 = true;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function110 = function4;
                    n3Var2 = n3Var;
                    n(sVar, n90Var, function6, s0Var, z22, n3Var2, function110, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    n3Var2 = n3Var;
                    c0VarR.E(-1890863476);
                    c0VarR.A();
                }
                int i219 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                n90Var2 = n90Var;
                boolean z211113 = z19;
                boolean z211114 = z20;
                a0Var3 = a0Var4;
                q(z211113, n90Var2, n3Var2, z211114, a0Var3, function3, c0VarR, i219, 0);
                c0VarR.o();
                if ((i12 & 896) != 256) {
                    z14 = false;
                }
                objI2 = c0VarR.i0();
                if (z14) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z16 = z211113;
                z17 = z211114;
                function5 = function6;
            } else {
                n90Var2 = n90Var;
                c0VarR.u();
                z16 = z11;
                a0Var3 = a0Var2;
                function5 = function1;
                z17 = z12;
            }
            androidx.compose.runtime.c0 c0Var15 = c0VarR;
            z18 = z13;
            s5VarT = c0Var15.T();
            if (s5VarT != null) {
                final n90 n90Var16 = n90Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f1.k(sVar, function2, n90Var16, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        function1 = function0;
        i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            i19 = 196608;
            z13 = z10;
        } else {
            i19 = 196608;
            z13 = z10;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.G(z13)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
        }
        i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.G(z11)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        i23 = i11 & 128;
        if (i23 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.G(z12)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i12 |= i24;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function3)) {
                    i25 = 67108864;
                } else {
                    i25 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i25;
            }
            z14 = true;
            if ((i12 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c0VarR.h(z15, i12 & 1)) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i16 != 0) {
                    function6 = null;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                if (i21 != 0) {
                    z19 = true;
                } else {
                    z19 = z11;
                }
                if (i23 != 0) {
                    z20 = false;
                } else {
                    z20 = z12;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                }
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                s0Var = (kotlinx.coroutines.s0) objI0;
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = d7.g(Boolean.FALSE, null, 2, null);
                    c0VarR.Y(objI1);
                }
                n3Var = (androidx.compose.runtime.n3) objI1;
                if (z20) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                androidx.compose.ui.a0.a aVar1110 = androidx.compose.ui.a0.E;
                androidx.compose.ui.layout.a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, aVar1110);
                androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                boolean z211115 = z21;
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
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN15, aVar1111.f());
                androidx.compose.foundation.layout.d0 d0Var15 = androidx.compose.foundation.layout.d0.f15956a;
                if (n90Var.isVisible()) {
                    c0VarR.E(-1891243071);
                    if (z13) {
                        z22 = true;
                    } else {
                        z22 = true;
                    }
                    Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function111 = function4;
                    n3Var2 = n3Var;
                    n(sVar, n90Var, function6, s0Var, z22, n3Var2, function111, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                    c0VarR = c0VarR;
                    c0VarR.A();
                } else {
                    n3Var2 = n3Var;
                    c0VarR.E(-1890863476);
                    c0VarR.A();
                }
                int i2110 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
                n90Var2 = n90Var;
                boolean z211116 = z19;
                boolean z211117 = z20;
                a0Var3 = a0Var4;
                q(z211116, n90Var2, n3Var2, z211117, a0Var3, function3, c0VarR, i2110, 0);
                c0VarR.o();
                if ((i12 & 896) != 256) {
                    z14 = false;
                }
                objI2 = c0VarR.i0();
                if (z14) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z16 = z211116;
                z17 = z211117;
                function5 = function6;
            } else {
                n90Var2 = n90Var;
                c0VarR.u();
                z16 = z11;
                a0Var3 = a0Var2;
                function5 = function1;
                z17 = z12;
            }
            androidx.compose.runtime.c0 c0Var16 = c0VarR;
            z18 = z13;
            s5VarT = c0Var16.T();
            if (s5VarT != null) {
                final n90 n90Var17 = n90Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f1.k(sVar, function2, n90Var17, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        z14 = true;
        if ((i12 & 38347923) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c0VarR.h(z15, i12 & 1)) {
            if (i14 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i16 != 0) {
                function6 = null;
            } else {
                function6 = function1;
            }
            if (i18 != 0) {
                z13 = false;
            }
            if (i21 != 0) {
                z19 = true;
            } else {
                z19 = z11;
            }
            if (i23 != 0) {
                z20 = false;
            } else {
                z20 = z12;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1221877520, i12, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
            }
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            s0Var = (kotlinx.coroutines.s0) objI0;
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = d7.g(Boolean.FALSE, null, 2, null);
                c0VarR.Y(objI1);
            }
            n3Var = (androidx.compose.runtime.n3) objI1;
            if (z20) {
                z21 = false;
            } else {
                z21 = false;
            }
            androidx.compose.ui.a0.a aVar1112 = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, aVar1112);
            androidx.compose.ui.node.g.a aVar1113 = androidx.compose.ui.node.g.I;
            boolean z211118 = z21;
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
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN16, aVar1113.f());
            androidx.compose.foundation.layout.d0 d0Var16 = androidx.compose.foundation.layout.d0.f15956a;
            if (n90Var.isVisible()) {
                c0VarR.E(-1891243071);
                if (z13) {
                    z22 = true;
                } else {
                    z22 = true;
                }
                Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function112 = function4;
                n3Var2 = n3Var;
                n(sVar, n90Var, function6, s0Var, z22, n3Var2, function112, c0VarR, (i12 & 14) | i19 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 6) & 896) | ((i12 << 15) & 3670016));
                c0VarR = c0VarR;
                c0VarR.A();
            } else {
                n3Var2 = n3Var;
                c0VarR.E(-1890863476);
                c0VarR.A();
            }
            int i2111 = ((i12 >> 18) & 14) | a5.S0 | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 12) & 7168) | (57344 & (i12 << 3)) | ((i12 >> 9) & 458752);
            n90Var2 = n90Var;
            boolean z211119 = z19;
            boolean z2111110 = z20;
            a0Var3 = a0Var4;
            q(z211119, n90Var2, n3Var2, z2111110, a0Var3, function3, c0VarR, i2111, 0);
            c0VarR.o();
            if ((i12 & 896) != 256) {
                z14 = false;
            }
            objI2 = c0VarR.i0();
            if (z14) {
                objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: androidx.compose.material3.internal.z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f1.j(n90Var2, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.runtime.b2.d(n90Var2, (Function1) objI2, c0VarR, (i12 >> 6) & 14);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z16 = z211119;
            z17 = z2111110;
            function5 = function6;
        } else {
            n90Var2 = n90Var;
            c0VarR.u();
            z16 = z11;
            a0Var3 = a0Var2;
            function5 = function1;
            z17 = z12;
        }
        androidx.compose.runtime.c0 c0Var17 = c0VarR;
        z18 = z13;
        s5VarT = c0Var17.T();
        if (s5VarT != null) {
            final n90 n90Var18 = n90Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.a1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f1.k(sVar, function2, n90Var18, a0Var3, function5, z18, z16, z17, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 j(n90 n90Var, androidx.compose.runtime.v1 v1Var) {
        return new a(n90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.window.s sVar, Function2 function2, n90 n90Var, androidx.compose.ui.a0 a0Var, Function0 function0, boolean z10, boolean z11, boolean z12, Function2 function3, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(sVar, function2, n90Var, a0Var, function0, z10, z11, z12, function3, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @k7
    @NotNull
    public static final n90 l(boolean z10, boolean z11, @NotNull androidx.compose.foundation.s3 s3Var) {
        return new h1(z10, z11, s3Var);
    }

    public static /* synthetic */ n90 m(boolean z10, boolean z11, androidx.compose.foundation.s3 s3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            s3Var = w0.f29214a.a();
        }
        return l(z10, z11, s3Var);
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void n(final androidx.compose.ui.window.s sVar, final n90 n90Var, final Function0<Unit> function0, final kotlinx.coroutines.s0 s0Var, final boolean z10, final androidx.compose.runtime.n3<Boolean> n3Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1413720282);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(sVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c0VarR.D(n90Var) : c0VarR.k0(n90Var) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.k0(function0) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.k0(s0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.G(z10) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(n3Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.k0(function2) ? 1048576 : 524288;
        }
        if (c0VarR.h((599187 & i11) != 599186, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1413720282, i11, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:169)");
            }
            String strA = i1.f28954a.a(c0VarR, 6);
            boolean zK0 = ((i11 & 896) == 256) | ((i11 & com.planner5d.library.engine.input.f.b.B) == 32 || ((i11 & 64) != 0 && c0VarR.k0(n90Var))) | c0VarR.k0(s0Var) | ((458752 & i11) == 131072);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.internal.x0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f1.p(function0, n90Var, s0Var, n3Var);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.window.c.a(sVar, (Function0) objI0, new androidx.compose.ui.window.t(z10, false, false, false, 14, (DefaultConstructorMarker) null), androidx.compose.runtime.internal.w.e(-1287705660, true, new c(strA, function2), c0VarR, 54), c0VarR, (i11 & 14) | 3072, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f1.o(sVar, n90Var, function0, s0Var, z10, n3Var, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.ui.window.s sVar, n90 n90Var, Function0 function0, kotlinx.coroutines.s0 s0Var, boolean z10, androidx.compose.runtime.n3 n3Var, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        n(sVar, n90Var, function0, s0Var, z10, n3Var, function2, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Function0 function0, n90 n90Var, kotlinx.coroutines.s0 s0Var, androidx.compose.runtime.n3 n3Var) {
        if (function0 != null) {
            function0.invoke();
        } else if (n90Var.isVisible()) {
            kotlinx.coroutines.k.f(s0Var, null, null, new b(n90Var, null), 3, null);
            n3Var.setValue(Boolean.FALSE);
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x013b  */
    /* JADX WARN: Code duplicated, block: B:92:0x015a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0168  */
    /* JADX WARN: Code duplicated, block: B:97:0x0193  */
    /* JADX WARN: Code duplicated, block: B:99:0x0198  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void q(final boolean z10, final n90 n90Var, final androidx.compose.runtime.n3<Boolean> n3Var, final boolean z11, androidx.compose.ui.a0 a0Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.n3<Boolean> n3Var2;
        boolean z12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        int i16;
        boolean z13;
        final androidx.compose.ui.a0 a0Var3;
        s5 s5VarT;
        Object objI0;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1873232064);
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
            i12 |= (i10 & 64) == 0 ? c0VarR.D(n90Var) : c0VarR.k0(n90Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
            n3Var2 = n3Var;
        } else {
            n3Var2 = n3Var;
            if ((i10 & a5.S0) == 0) {
                i12 |= c0VarR.D(n3Var2) ? 256 : 128;
            }
        }
        if ((i11 & 8) == 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                i12 |= c0VarR.G(z12) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((74899 & i16) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i16 & 1)) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1873232064, i16, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                        c0VarR.Y(objI0);
                    }
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI0;
                    androidx.compose.ui.a0 a0VarW = w(s(v(a0Var2, z10, n90Var), i1.f28954a.b(c0VarR, 6), z10, n90Var, s0Var), z10, n90Var, s0Var, z12, n3Var2);
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarW);
                    androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                    function0A = aVar.a();
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
                    y7.n(c0VarD, a1VarK, aVar.e());
                    y7.n(c0VarD, b1VarK, aVar.g());
                    function2B = aVar.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar.f());
                    androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                    function2.invoke(c0VarR, Integer.valueOf((i16 >> 15) & 14));
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                a0Var3 = a0Var2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.e1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f1.r(z10, n90Var, n3Var, z11, a0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            a0Var2 = a0Var;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((74899 & i16) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i16 & 1)) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1873232064, i16, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.a0 a0VarW2 = w(s(v(a0Var2, z10, n90Var), i1.f28954a.b(c0VarR, 6), z10, n90Var, s0Var2), z10, n90Var, s0Var2, z12, n3Var2);
                androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarW2);
                androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                function0A = aVar2.a();
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
                androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                function2.invoke(c0VarR, Integer.valueOf((i16 >> 15) & 14));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
            }
            a0Var3 = a0Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.e1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f1.r(z10, n90Var, n3Var, z11, a0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((74899 & i16) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i16 & 1)) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1873232064, i16, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                    c0VarR.Y(objI0);
                }
                kotlinx.coroutines.s0 s0Var3 = (kotlinx.coroutines.s0) objI0;
                androidx.compose.ui.a0 a0VarW3 = w(s(v(a0Var2, z10, n90Var), i1.f28954a.b(c0VarR, 6), z10, n90Var, s0Var3), z10, n90Var, s0Var3, z12, n3Var2);
                androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarW3);
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
                androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                function2.invoke(c0VarR, Integer.valueOf((i16 >> 15) & 14));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
            }
            a0Var3 = a0Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.e1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f1.r(z10, n90Var, n3Var, z11, a0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        a0Var2 = a0Var;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(function2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((74899 & i16) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i16 & 1)) {
            if (i13 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1873232064, i16, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI0);
            }
            kotlinx.coroutines.s0 s0Var4 = (kotlinx.coroutines.s0) objI0;
            androidx.compose.ui.a0 a0VarW4 = w(s(v(a0Var2, z10, n90Var), i1.f28954a.b(c0VarR, 6), z10, n90Var, s0Var4), z10, n90Var, s0Var4, z12, n3Var2);
            androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarW4);
            androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
            function0A = aVar4.a();
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
            androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0VarR, Integer.valueOf((i16 >> 15) & 14));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        a0Var3 = a0Var2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.internal.e1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f1.r(z10, n90Var, n3Var, z11, a0Var3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(boolean z10, n90 n90Var, androidx.compose.runtime.n3 n3Var, boolean z11, androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        q(z10, n90Var, n3Var, z11, a0Var, function2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final androidx.compose.ui.a0 s(androidx.compose.ui.a0 a0Var, final String str, boolean z10, final n90 n90Var, final kotlinx.coroutines.s0 s0Var) {
        if (z10) {
            a0Var = q1.e(a0Var, new Function1() { // from class: androidx.compose.material3.internal.c1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.t(str, s0Var, n90Var, (androidx.compose.ui.semantics.e0) obj);
                }
            });
        }
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, final kotlinx.coroutines.s0 s0Var, final n90 n90Var, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.T0(e0Var, str, new Function0() { // from class: androidx.compose.material3.internal.d1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(f1.u(s0Var, n90Var));
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(kotlinx.coroutines.s0 s0Var, n90 n90Var) {
        int i10 = (1 | 3) ^ 0;
        kotlinx.coroutines.k.f(s0Var, null, null, new d(n90Var, null), 3, null);
        return true;
    }

    private static final androidx.compose.ui.a0 v(androidx.compose.ui.a0 a0Var, boolean z10, n90 n90Var) {
        return z10 ? androidx.compose.ui.input.pointer.w0.e(androidx.compose.ui.input.pointer.w0.e(a0Var, n90Var, new e(n90Var)), n90Var, new f(n90Var)) : a0Var;
    }

    private static final androidx.compose.ui.a0 w(androidx.compose.ui.a0 a0Var, boolean z10, final n90 n90Var, final kotlinx.coroutines.s0 s0Var, boolean z11, androidx.compose.runtime.n3<Boolean> n3Var) {
        if (z10) {
            return androidx.compose.ui.input.key.f.b(androidx.compose.ui.focus.d.a(a0Var, new Function1() { // from class: androidx.compose.material3.internal.b1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f1.x(s0Var, n90Var, (androidx.compose.ui.focus.p0) obj);
                }
            }), new h(n90Var, n3Var, z11));
        }
        n3Var.setValue(Boolean.FALSE);
        return a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(kotlinx.coroutines.s0 s0Var, n90 n90Var, androidx.compose.ui.focus.p0 p0Var) {
        kotlinx.coroutines.k.f(s0Var, null, null, new g(p0Var, n90Var, null), 3, null);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n90 y(boolean z10, boolean z11, @Nullable androidx.compose.foundation.s3 s3Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            s3Var = w0.f29214a.a();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1483057531, i10, -1, "androidx.compose.material3.internal.rememberBasicTooltipState (BasicTooltip.kt:346)");
        }
        boolean z12 = ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z11)) || (i10 & 48) == 32) | ((((i10 & 896) ^ a5.S0) > 256 && c0Var.D(s3Var)) || (i10 & a5.S0) == 256);
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new h1(z10, z11, s3Var);
            c0Var.Y(objI0);
        }
        h1 h1Var = (h1) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return h1Var;
    }

    @androidx.compose.runtime.o
    private static final n7<Boolean> z(androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1960751094, i10, -1, "androidx.compose.material3.internal.rememberTouchExplorationOrSwitchAccessServiceState (BasicTooltip.kt:456)");
        }
        n7<Boolean> n7VarN = androidx.compose.material3.internal.h.n(true, true, false, c0Var, 438, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarN;
    }
}
