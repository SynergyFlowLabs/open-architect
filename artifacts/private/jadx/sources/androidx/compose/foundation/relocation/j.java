package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.node.f0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class j extends a0.d implements androidx.compose.ui.relocation.a, f0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f18576w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private h f18577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f18578t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18579v;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super p2>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f18581b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ g0 f18583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<n0.j> f18584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<n0.j> f18585f;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.j$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
        static final class C0120a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f18586a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f18587b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ g0 f18588c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<n0.j> f18589d;

            /* JADX INFO: renamed from: androidx.compose.foundation.relocation.j$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0121a extends kotlin.jvm.internal.g0 implements Function0<n0.j> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ j f18590a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g0 f18591b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Function0<n0.j> f18592c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0121a(j jVar, g0 g0Var, Function0<n0.j> function0) {
                    super(0, Intrinsics.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f18590a = jVar;
                    this.f18591b = g0Var;
                    this.f18592c = function0;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
                public final n0.j invoke() {
                    return j.y9(this.f18590a, this.f18591b, this.f18592c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0120a(j jVar, g0 g0Var, Function0<n0.j> function0, kotlin.coroutines.d<? super C0120a> dVar) {
                super(2, dVar);
                this.f18587b = jVar;
                this.f18588c = g0Var;
                this.f18589d = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0120a(this.f18587b, this.f18588c, this.f18589d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f18586a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    h hVarZ9 = this.f18587b.z9();
                    C0121a c0121a = new C0121a(this.f18587b, this.f18588c, this.f18589d);
                    this.f18586a = 1;
                    if (hVarZ9.T7(c0121a, this) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0120a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f18593a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f18594b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<n0.j> f18595c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(j jVar, Function0<n0.j> function0, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f18594b = jVar;
                this.f18595c = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f18594b, this.f18595c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f18593a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    j jVar = this.f18594b;
                    Function0<n0.j> function0 = this.f18595c;
                    this.f18593a = 1;
                    if (androidx.compose.ui.relocation.b.a(jVar, function0, this) == objL) {
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
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g0 g0Var, Function0<n0.j> function0, Function0<n0.j> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f18583d = g0Var;
            this.f18584e = function0;
            this.f18585f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = j.this.new a(this.f18583d, this.f18584e, this.f18585f, dVar);
            aVar.f18581b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f18580a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s0 s0Var = (s0) this.f18581b;
            k.f(s0Var, null, null, new C0120a(j.this, this.f18583d, this.f18584e, null), 3, null);
            return k.f(s0Var, null, null, new b(j.this, this.f18585f, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super p2> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public j(@NotNull h hVar) {
        this.f18577s = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j x9(j jVar, g0 g0Var, Function0 function0) {
        n0.j jVarY9 = y9(jVar, g0Var, function0);
        if (jVarY9 != null) {
            return jVar.f18577s.O2(jVarY9);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.j y9(j jVar, g0 g0Var, Function0<n0.j> function0) {
        n0.j jVarInvoke;
        if (!jVar.a9() || !jVar.f18579v) {
            return null;
        }
        g0 g0VarS = androidx.compose.ui.node.k.s(jVar);
        if (!g0Var.I()) {
            g0Var = null;
        }
        if (g0Var != null && (jVarInvoke = function0.invoke()) != null) {
            return f.c(g0VarS, g0Var, jVarInvoke);
        }
        return null;
    }

    public final void A9(@NotNull h hVar) {
        this.f18577s = hVar;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return this.f18578t;
    }

    @Override // androidx.compose.ui.relocation.a
    @Nullable
    public Object m6(@NotNull final g0 g0Var, @NotNull final Function0<n0.j> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = t0.g(new a(g0Var, function0, new Function0() { // from class: androidx.compose.foundation.relocation.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.x9(this.f18573a, g0Var, function0);
            }
        }, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // androidx.compose.ui.node.f0
    public void x(@NotNull g0 g0Var) {
        this.f18579v = true;
    }

    @NotNull
    public final h z9() {
        return this.f18577s;
    }
}
