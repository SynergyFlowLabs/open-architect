package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.k5;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.s5;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.a5;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,189:1\n1282#2,6:190\n1282#2,6:196\n1282#2,6:202\n1282#2,6:208\n1282#2,3:222\n1285#2,3:226\n1282#2,6:230\n1282#2,6:237\n75#3:214\n75#3:229\n75#3:236\n607#4:215\n604#4,6:216\n605#5:225\n85#6:243\n117#6,2:244\n66#7,5:246\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n56#1:190,6\n60#1:196,6\n94#1:202,6\n96#1:208,6\n99#1:222,3\n99#1:226,3\n102#1:230,6\n182#1:237,6\n98#1:214\n100#1:229\n109#1:236\n99#1:215\n99#1:216,6\n99#1:225\n56#1:243\n56#1:244,2\n183#1:246,5\n*E\n"})
public final class y0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", f = "SelectionContainer.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.m1 f21548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.f f21549c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.platform.m1 m1Var, androidx.compose.ui.text.f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21548b = m1Var;
            this.f21549c = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f21548b, this.f21549c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21547a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.ui.platform.m1 m1Var = this.f21548b;
                androidx.compose.ui.platform.k1 k1VarF = androidx.compose.foundation.internal.b.f(this.f21549c);
                this.f21547a = 1;
                if (m1Var.c(k1VarF, this) == objL) {
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2 f21550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i3 f21551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21552c;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i3 f21553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21554b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m2 f21555c;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.y0$b$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,189:1\n35#2,3:190\n39#2:211\n1282#3,6:193\n1282#3,6:199\n1282#3,6:205\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4$1$1\n*L\n136#1:190,3\n136#1:211\n138#1:193,6\n143#1:199,6\n171#1:205,6\n*E\n"})
            static final class C0161a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21556a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ m2 f21557b;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.y0$b$a$a$a, reason: collision with other inner class name */
                static final class C0162a implements PointerInputEventHandler {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ k5 f21558a;

                    C0162a(k5 k5Var) {
                        this.f21558a = k5Var;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
                        Object objK = androidx.compose.foundation.text.s4.k(l0Var, this.f21558a, dVar);
                        return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C0161a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, m2 m2Var) {
                    this.f21556a = function2;
                    this.f21557b = m2Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final n0.g i(m2 m2Var) {
                    n0.g gVarS0 = m2Var.s0();
                    return n0.g.d(gVarS0 != null ? gVarS0.B() : n0.g.f332700b.c());
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final n0.g k(m2 m2Var) {
                    n0.g gVarB0 = m2Var.b0();
                    return n0.g.d(gVarB0 != null ? gVarB0.B() : n0.g.f332700b.c());
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void f(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(610483127, i10, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:128)");
                    }
                    this.f21556a.invoke(c0Var, 0);
                    if (this.f21557b.z0() && this.f21557b.e0() && !this.f21557b.B0()) {
                        c0Var.E(-1736225307);
                        h0 h0VarN0 = this.f21557b.n0();
                        if (h0VarN0 == null) {
                            c0Var.E(2011629175);
                        } else {
                            c0Var.E(2011629176);
                            final m2 m2Var = this.f21557b;
                            c0Var.E(-1736222526);
                            List listListOf = CollectionsKt.listOf((Object[]) new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                            int size = listListOf.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                boolean zBooleanValue = ((Boolean) listListOf.get(i11)).booleanValue();
                                boolean zG = c0Var.G(zBooleanValue);
                                Object objI0 = c0Var.i0();
                                if (zG || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = m2Var.w0(zBooleanValue);
                                    c0Var.Y(objI0);
                                }
                                k5 k5Var = (k5) objI0;
                                boolean zG2 = c0Var.G(zBooleanValue);
                                Object objI1 = c0Var.i0();
                                if (zG2 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = zBooleanValue ? new Function0() { // from class: androidx.compose.foundation.text.selection.z0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return y0.b.a.C0161a.i(m2Var);
                                        }
                                    } : new Function0() { // from class: androidx.compose.foundation.text.selection.a1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return y0.b.a.C0161a.k(m2Var);
                                        }
                                    };
                                    c0Var.Y(objI1);
                                }
                                Function0 function0 = (Function0) objI1;
                                androidx.compose.ui.text.style.i iVarF = zBooleanValue ? h0VarN0.h().f() : h0VarN0.f().f();
                                float fR0 = zBooleanValue ? m2Var.r0() : m2Var.a0();
                                androidx.compose.ui.text.style.i iVar = iVarF;
                                d dVar = new d(function0);
                                boolean zG3 = h0VarN0.g();
                                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                boolean zK0 = c0Var.k0(k5Var);
                                Object objI2 = c0Var.i0();
                                if (zK0 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI2 = new C0162a(k5Var);
                                    c0Var.Y(objI2);
                                }
                                g.g(dVar, zBooleanValue, iVar, zG3, 0L, fR0, androidx.compose.ui.input.pointer.w0.e(aVar, k5Var, (PointerInputEventHandler) objI2), c0Var, 0, 16);
                            }
                            c0Var.A();
                        }
                        c0Var.A();
                        c0Var.A();
                    } else {
                        c0Var.E(2013602667);
                        c0Var.A();
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
                    f(c0Var, num.intValue());
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(i3 i3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, m2 m2Var) {
                this.f21553a = i3Var;
                this.f21554b = function2;
                this.f21555c = m2Var;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-284825865, i10, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:127)");
                }
                androidx.compose.runtime.a1.e(k3.c().f(this.f21553a), androidx.compose.runtime.internal.w.e(610483127, true, new C0161a(this.f21554b, this.f21555c), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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
        b(m2 m2Var, i3 i3Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f21550a = m2Var;
            this.f21551b = i3Var;
            this.f21552c = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                int i11 = 1 & (-1);
                androidx.compose.runtime.m0.A0(-1799563674, i10, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:126)");
            }
            m2 m2Var = this.f21550a;
            androidx.compose.foundation.text.l2.k(m2Var, androidx.compose.runtime.internal.w.e(-284825865, true, new a(this.f21551b, this.f21552c, m2Var), c0Var, 54), c0Var, 48);
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

    @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n1#1,69:1\n184#2,3:70\n*E\n"})
    public static final class c implements androidx.compose.runtime.u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2 f21559a;

        public c(m2 m2Var) {
            this.f21559a = m2Var;
        }

        @Override // androidx.compose.runtime.u1
        public void dispose() {
            this.f21559a.E0();
            this.f21559a.U0(false);
        }
    }

    static final class d implements w, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function0 f21560a;

        d(Function0 function0) {
            this.f21560a = function0;
        }

        @Override // androidx.compose.foundation.text.selection.w
        public final /* synthetic */ long a() {
            return ((n0.g) this.f21560a.invoke()).B();
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f21560a;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof w) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public static final void h(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1162635549);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0VarR.h((i11 & 3) != 2, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1162635549, i11, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:71)");
            }
            androidx.compose.runtime.a1.e(k3.c().f(null), function2, c0VarR, ((i11 << 3) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.selection.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y0.i(function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        h(function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void j(@Nullable androidx.compose.ui.a0 a0Var, @Nullable final h0 h0Var, @NotNull final Function1<? super h0, Unit> function1, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-917932944);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(h0Var) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.k0(function1) ? 256 : 128;
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
                androidx.compose.runtime.m0.A0(-917932944, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:91)");
            }
            Object[] objArr = new Object[0];
            androidx.compose.runtime.saveable.c0<i3, Long> c0VarA = i3.f21160o.a();
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function0() { // from class: androidx.compose.foundation.text.selection.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return y0.s();
                    }
                };
                c0VarR.Y(objI0);
            }
            i3 i3Var = (i3) androidx.compose.runtime.saveable.i.j(objArr, c0VarA, (Function0) objI0, c0VarR, a5.S0);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new m2(i3Var);
                c0VarR.Y(objI1);
            }
            final m2 m2Var = (m2) objI1;
            final androidx.compose.ui.platform.m1 m1Var = (androidx.compose.ui.platform.m1) c0VarR.W(androidx.compose.ui.platform.q1.i());
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = androidx.compose.runtime.b2.o(kotlin.coroutines.h.f312451a, c0VarR);
                c0VarR.Y(objI2);
            }
            final kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) objI2;
            m2Var.T0((p0.a) c0VarR.W(androidx.compose.ui.platform.q1.s()));
            boolean zD = c0VarR.D(s0Var) | c0VarR.D(m1Var);
            Object objI3 = c0VarR.i0();
            if (zD || objI3 == aVar.a()) {
                objI3 = new Function1() { // from class: androidx.compose.foundation.text.selection.t0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y0.m(s0Var, m1Var, (androidx.compose.ui.text.f) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            m2Var.W0((Function1) objI3);
            m2Var.e1((androidx.compose.ui.platform.e4) c0VarR.W(androidx.compose.ui.platform.q1.B()));
            m2Var.X0(function1);
            m2Var.b1(h0Var);
            if (androidx.compose.foundation.s1.f18600e) {
                c0VarR.E(-82306500);
                m2Var.Y0(d0.k(g0.StaticText, null, c0VarR, 54));
                m2Var.M0(s0Var);
                c0VarR.A();
            } else {
                c0VarR.E(-82131598);
                c0VarR.A();
            }
            n3.b(a0Var.B2(m2Var.f0()), androidx.compose.runtime.internal.w.e(-1799563674, true, new b(m2Var, i3Var, function2), c0VarR, 54), c0VarR, 48, 0);
            boolean zK0 = c0VarR.k0(m2Var);
            Object objI4 = c0VarR.i0();
            if (zK0 || objI4 == aVar.a()) {
                objI4 = new Function1() { // from class: androidx.compose.foundation.text.selection.u0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y0.n(m2Var, (androidx.compose.runtime.v1) obj);
                    }
                };
                c0VarR.Y(objI4);
            }
            androidx.compose.runtime.b2.d(m2Var, (Function1) objI4, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        final androidx.compose.ui.a0 a0Var2 = a0Var;
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.selection.v0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y0.o(a0Var2, h0Var, function1, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(@Nullable final androidx.compose.ui.a0 a0Var, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1949207773);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function2) ? 32 : 16;
        }
        if (c0VarR.h((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1949207773, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:54)");
            }
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = d7.g(null, null, 2, null);
                c0VarR.Y(objI0);
            }
            final androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI0;
            int i14 = i12;
            h0 h0VarL = l(n3Var);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.foundation.text.selection.w0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return y0.q(n3Var, (h0) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            int i15 = (i14 & 14) | a5.S0 | ((i14 << 6) & 7168);
            androidx.compose.ui.a0 a0Var2 = a0Var;
            function3 = function2;
            j(a0Var2, h0VarL, (Function1) objI1, function3, c0VarR, i15, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var = a0Var2;
        } else {
            function3 = function2;
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.text.selection.x0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return y0.r(a0Var, function3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h0 l(androidx.compose.runtime.n3<h0> n3Var) {
        return n3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(kotlinx.coroutines.s0 s0Var, androidx.compose.ui.platform.m1 m1Var, androidx.compose.ui.text.f fVar) {
        kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new a(m1Var, fVar, null), 1, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.u1 n(m2 m2Var, androidx.compose.runtime.v1 v1Var) {
        return new c(m2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.ui.a0 a0Var, h0 h0Var, Function1 function1, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(a0Var, h0Var, function1, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void p(androidx.compose.runtime.n3<h0> n3Var, h0 h0Var) {
        n3Var.setValue(h0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.runtime.n3 n3Var, h0 h0Var) {
        p(n3Var, h0Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(androidx.compose.ui.a0 a0Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(a0Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i3 s() {
        return new i3();
    }
}
