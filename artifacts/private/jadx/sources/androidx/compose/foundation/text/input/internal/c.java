package androidx.compose.foundation.text.input.internal;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLegacyPlatformTextInputServiceAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidLegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n1#2:435\n*E\n"})
public final class c extends x3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19464f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f19465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private c4 f19466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.flow.j0<Unit> f19467e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.ui.platform.m3, kotlin.coroutines.d<?>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f19468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f19469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<c4, Unit> f19470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f19471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ x3.a f19472e;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.c$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.H1}, m = "invokeSuspend", n = {}, s = {})
        static final class C0132a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<?>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f19473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f19474b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.m3 f19475c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function1<c4, Unit> f19476d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f19477e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ x3.a f19478f;

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.c$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", i = {}, l = {androidx.media2.widget.f.i.f59773f0, androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {}, s = {})
            static final class C0133a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f19479a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ c f19480b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ q3 f19481c;

                /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.c$a$a$a$a, reason: collision with other inner class name */
                static final class C0134a<T> implements kotlinx.coroutines.flow.j {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ q3 f19482a;

                    C0134a(q3 q3Var) {
                        this.f19482a = q3Var;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, kotlin.coroutines.d<? super Unit> dVar) {
                        this.f19482a.g();
                        return Unit.f312394a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0133a(c cVar, q3 q3Var, kotlin.coroutines.d<? super C0133a> dVar) {
                    super(2, dVar);
                    this.f19480b = cVar;
                    this.f19481c = q3Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit m(long j10) {
                    return Unit.f312394a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0133a(this.f19480b, this.f19481c, dVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
                
                    if (r6.collect(r1, r5) == r0) goto L17;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r5.f19479a
                        r2 = 2
                        r4 = 2
                        r3 = 1
                        if (r1 == 0) goto L22
                        if (r1 == r3) goto L1d
                        if (r1 == r2) goto L18
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        r4 = 2
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L18:
                        kotlin.ResultKt.m(r6)
                        r4 = 1
                        goto L52
                    L1d:
                        kotlin.ResultKt.m(r6)
                        r4 = 1
                        goto L35
                    L22:
                        kotlin.ResultKt.m(r6)
                        androidx.compose.foundation.text.input.internal.b r6 = new androidx.compose.foundation.text.input.internal.b
                        r6.<init>()
                        r4 = 4
                        r5.f19479a = r3
                        java.lang.Object r6 = androidx.compose.runtime.d3.d(r6, r5)
                        r4 = 4
                        if (r6 != r0) goto L35
                        goto L50
                    L35:
                        androidx.compose.foundation.text.input.internal.c r6 = r5.f19480b
                        r4 = 5
                        kotlinx.coroutines.flow.j0 r6 = androidx.compose.foundation.text.input.internal.c.n(r6)
                        r4 = 5
                        if (r6 == 0) goto L59
                        r4 = 7
                        androidx.compose.foundation.text.input.internal.c$a$a$a$a r1 = new androidx.compose.foundation.text.input.internal.c$a$a$a$a
                        androidx.compose.foundation.text.input.internal.q3 r3 = r5.f19481c
                        r1.<init>(r3)
                        r5.f19479a = r2
                        java.lang.Object r5 = r6.collect(r1, r5)
                        r4 = 2
                        if (r5 != r0) goto L52
                    L50:
                        r4 = 2
                        return r0
                    L52:
                        kotlin.a0 r5 = new kotlin.a0
                        r5.<init>()
                        r4 = 0
                        throw r5
                    L59:
                        kotlin.Unit r5 = kotlin.Unit.f312394a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.c.a.C0132a.C0133a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0133a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.c$a$a$b */
            /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function1<androidx.compose.ui.graphics.c2, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ x3.a f19483a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(x3.a aVar) {
                    super(1, Intrinsics.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.f19483a = aVar;
                }

                public final void X(float[] fArr) {
                    c.t(this.f19483a, fArr);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.c2 c2Var) {
                    X(c2Var.A());
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0132a(androidx.compose.ui.platform.m3 m3Var, Function1<? super c4, Unit> function1, c cVar, x3.a aVar, kotlin.coroutines.d<? super C0132a> dVar) {
                super(2, dVar);
                this.f19475c = m3Var;
                this.f19476d = function1;
                this.f19477e = cVar;
                this.f19478f = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0132a c0132a = new C0132a(this.f19475c, this.f19476d, this.f19477e, this.f19478f, dVar);
                c0132a.f19474b = obj;
                return c0132a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f19473a;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f19474b;
                        q3 q3VarInvoke = y3.c().invoke(this.f19475c.getView());
                        c4 c4Var = new c4(this.f19475c.getView(), new b(this.f19478f), q3VarInvoke);
                        if (androidx.compose.foundation.text.handwriting.j.a()) {
                            kotlinx.coroutines.k.f(s0Var, null, null, new C0133a(this.f19477e, q3VarInvoke, null), 3, null);
                        }
                        Function1<c4, Unit> function1 = this.f19476d;
                        if (function1 != null) {
                            function1.invoke(c4Var);
                        }
                        this.f19477e.f19466d = c4Var;
                        androidx.compose.ui.platform.m3 m3Var = this.f19475c;
                        this.f19473a = 1;
                        if (m3Var.c(c4Var, this) == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    throw new kotlin.a0();
                } catch (Throwable th2) {
                    this.f19477e.f19466d = null;
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<?> dVar) {
                return ((C0132a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super c4, Unit> function1, c cVar, x3.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f19470c = function1;
            this.f19471d = cVar;
            this.f19472e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f19470c, this.f19471d, this.f19472e, dVar);
            aVar.f19469b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f19468a;
            if (i10 == 0) {
                ResultKt.m(obj);
                C0132a c0132a = new C0132a((androidx.compose.ui.platform.m3) this.f19469b, this.f19470c, this.f19471d, this.f19472e, null);
                this.f19468a = 1;
                if (kotlinx.coroutines.t0.g(c0132a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new kotlin.a0();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.platform.m3 m3Var, kotlin.coroutines.d<?> dVar) {
            return ((a) create(m3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.flow.j0<Unit> q() {
        kotlinx.coroutines.flow.j0<Unit> j0Var = this.f19467e;
        if (j0Var != null) {
            return j0Var;
        }
        if (!androidx.compose.foundation.text.handwriting.j.a()) {
            return null;
        }
        kotlinx.coroutines.flow.j0<Unit> j0VarB = kotlinx.coroutines.flow.q0.b(1, 0, kotlinx.coroutines.channels.j.DROP_LATEST, 2, null);
        this.f19467e = j0VarB;
        return j0VarB;
    }

    private final void r(Function1<? super c4, Unit> function1) {
        x3.a aVarI = i();
        if (aVarI == null) {
            return;
        }
        this.f19465c = aVarI.V6(new a(function1, this, aVarI, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(androidx.compose.ui.text.input.y0 y0Var, c cVar, androidx.compose.ui.text.input.u uVar, Function1 function1, Function1 function2, c4 c4Var) {
        c4Var.u(y0Var, cVar.i(), uVar, function1, function2);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(x3.a aVar, float[] fArr) {
        androidx.compose.ui.layout.g0 g0VarM = aVar.M();
        if (g0VarM != null) {
            if (!g0VarM.I()) {
                g0VarM = null;
            }
            if (g0VarM == null) {
                return;
            }
            g0VarM.K0(fArr);
        }
    }

    @Override // androidx.compose.ui.text.input.q0
    public void a() {
        kotlinx.coroutines.p2 p2Var = this.f19465c;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
        this.f19465c = null;
        kotlinx.coroutines.flow.j0<Unit> j0VarQ = q();
        if (j0VarQ != null) {
            j0VarQ.d();
        }
    }

    @Override // androidx.compose.ui.text.input.q0
    public void b(@Nullable androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.y0 y0Var2) {
        c4 c4Var = this.f19466d;
        if (c4Var != null) {
            c4Var.v(y0Var, y0Var2);
        }
    }

    @Override // androidx.compose.ui.text.input.q0
    public void c(@NotNull androidx.compose.ui.text.input.y0 y0Var, @NotNull androidx.compose.ui.text.input.m0 m0Var, @NotNull androidx.compose.ui.text.p3 p3Var, @NotNull Function1<? super androidx.compose.ui.graphics.c2, Unit> function1, @NotNull n0.j jVar, @NotNull n0.j jVar2) {
        c4 c4Var = this.f19466d;
        if (c4Var != null) {
            c4Var.w(y0Var, m0Var, p3Var, jVar, jVar2);
        }
    }

    @Override // androidx.compose.ui.text.input.q0
    public void d() {
        r(null);
    }

    @Override // androidx.compose.ui.text.input.q0
    public void g(@NotNull n0.j jVar) {
        c4 c4Var = this.f19466d;
        if (c4Var != null) {
            c4Var.p(jVar);
        }
    }

    @Override // androidx.compose.ui.text.input.q0
    public void h(@NotNull final androidx.compose.ui.text.input.y0 y0Var, @NotNull final androidx.compose.ui.text.input.u uVar, @NotNull final Function1<? super List<? extends androidx.compose.ui.text.input.j>, Unit> function1, @NotNull final Function1<? super androidx.compose.ui.text.input.t, Unit> function2) {
        r(new Function1() { // from class: androidx.compose.foundation.text.input.internal.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.s(y0Var, this, uVar, function1, function2, (c4) obj);
            }
        });
    }

    @Override // androidx.compose.foundation.text.input.internal.x3
    public void k() {
        kotlinx.coroutines.flow.j0<Unit> j0VarQ = q();
        if (j0VarQ != null) {
            j0VarQ.f(Unit.f312394a);
        }
    }
}
