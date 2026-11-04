package androidx.compose.ui.platform;

import android.view.View;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class d5 implements androidx.compose.runtime.o0, androidx.lifecycle.j0, androidx.compose.runtime.g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AndroidComposeView f40412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.o0 f40413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private androidx.lifecycle.c0 f40415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> f40416e = p1.f40699a.a();

    static final class a extends kotlin.jvm.internal.l0 implements Function1<AndroidComposeView.b, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f40418b;

        /* JADX INFO: renamed from: androidx.compose.ui.platform.d5$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nWrapper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wrapper.android.kt\nandroidx/compose/ui/platform/WrappedComposition$setContent$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,179:1\n1282#2,6:180\n1282#2,6:186\n*S KotlinDebug\n*F\n+ 1 Wrapper.android.kt\nandroidx/compose/ui/platform/WrappedComposition$setContent$1$1\n*L\n136#1:180,6\n137#1:186,6\n*E\n"})
        static final class C0320a extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d5 f40419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f40420b;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.d5$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
            static final class C0321a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f40421a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d5 f40422b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0321a(d5 d5Var, kotlin.coroutines.d<? super C0321a> dVar) {
                    super(2, dVar);
                    this.f40422b = d5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0321a(this.f40422b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f40421a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        AndroidComposeView androidComposeViewO = this.f40422b.o();
                        this.f40421a = 1;
                        if (androidComposeViewO.C0(this) == objL) {
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
                    return ((C0321a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.ui.platform.d5$a$a$b */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", i = {}, l = {androidx.media2.widget.f.i.f59767c0}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f40423a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ d5 f40424b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(d5 d5Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f40424b = d5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f40424b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f40423a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        AndroidComposeView androidComposeViewO = this.f40424b.o();
                        this.f40423a = 1;
                        if (androidComposeViewO.D0(this) == objL) {
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

            /* JADX INFO: renamed from: androidx.compose.ui.platform.d5$a$a$c */
            static final class c extends kotlin.jvm.internal.l0 implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ d5 f40425a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f40426b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(d5 d5Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                    super(2);
                    this.f40425a = d5Var;
                    this.f40426b = function2;
                }

                @androidx.compose.runtime.o
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-280240369, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                    }
                    AndroidCompositionLocals_androidKt.a(this.f40425a.o(), this.f40426b, c0Var, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0320a(d5 d5Var, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                super(2);
                this.f40419a = d5Var;
                this.f40420b = function2;
            }

            @androidx.compose.runtime.o
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1330788943, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                }
                Object tag = this.f40419a.o().getTag(androidx.compose.ui.d0.b.K);
                Set<androidx.compose.runtime.tooling.f> set = kotlin.jvm.internal.r1.J(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f40419a.o().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(androidx.compose.ui.d0.b.K) : null;
                    set = kotlin.jvm.internal.r1.J(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(c0Var.j0());
                    c0Var.e0();
                }
                AndroidComposeView androidComposeViewO = this.f40419a.o();
                boolean zK0 = c0Var.k0(this.f40419a);
                d5 d5Var = this.f40419a;
                Object objI0 = c0Var.i0();
                if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new C0321a(d5Var, null);
                    c0Var.Y(objI0);
                }
                androidx.compose.runtime.b2.i(androidComposeViewO, (Function2) objI0, c0Var, 0);
                AndroidComposeView androidComposeViewO2 = this.f40419a.o();
                boolean zK1 = c0Var.k0(this.f40419a);
                d5 d5Var2 = this.f40419a;
                Object objI1 = c0Var.i0();
                if (zK1 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = new b(d5Var2, null);
                    c0Var.Y(objI1);
                }
                androidx.compose.runtime.b2.i(androidComposeViewO2, (Function2) objI1, c0Var, 0);
                androidx.compose.runtime.a1.e(androidx.compose.runtime.tooling.u.c().f(set), androidx.compose.runtime.internal.w.e(-280240369, true, new c(this.f40419a, this.f40420b), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            super(1);
            this.f40418b = function2;
        }

        public final void c(AndroidComposeView.b bVar) {
            if (d5.this.f40414c) {
                return;
            }
            androidx.lifecycle.c0 lifecycle = bVar.a().getLifecycle();
            d5.this.f40416e = this.f40418b;
            if (d5.this.f40415d == null) {
                d5.this.f40415d = lifecycle;
                lifecycle.c(d5.this);
            } else if (lifecycle.d().n(androidx.lifecycle.c0.b.CREATED)) {
                d5.this.n().l(androidx.compose.runtime.internal.w.c(1330788943, true, new C0320a(d5.this, this.f40418b)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.b bVar) {
            c(bVar);
            return Unit.f312394a;
        }
    }

    public d5(@NotNull AndroidComposeView androidComposeView, @NotNull androidx.compose.runtime.o0 o0Var) {
        this.f40412a = androidComposeView;
        this.f40413b = o0Var;
    }

    @Override // androidx.compose.runtime.o0
    public void dispose() {
        if (!this.f40414c) {
            this.f40414c = true;
            this.f40412a.getView().setTag(androidx.compose.ui.d0.b.L, null);
            androidx.lifecycle.c0 c0Var = this.f40415d;
            if (c0Var != null) {
                c0Var.g(this);
            }
        }
        this.f40413b.dispose();
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull androidx.lifecycle.o0 o0Var, @NotNull androidx.lifecycle.c0.a aVar) {
        if (aVar == androidx.lifecycle.c0.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != androidx.lifecycle.c0.a.ON_CREATE || this.f40414c) {
                return;
            }
            l(this.f40416e);
        }
    }

    @Override // androidx.compose.runtime.g1
    @Nullable
    public <T> T h(@NotNull androidx.compose.runtime.f1<T> f1Var) {
        androidx.compose.runtime.o0 o0Var = this.f40413b;
        androidx.compose.runtime.g1 g1Var = o0Var instanceof androidx.compose.runtime.g1 ? (androidx.compose.runtime.g1) o0Var : null;
        if (g1Var != null) {
            return (T) g1Var.h(f1Var);
        }
        return null;
    }

    @Override // androidx.compose.runtime.o0
    public boolean k() {
        return this.f40413b.k();
    }

    @Override // androidx.compose.runtime.o0
    @androidx.compose.runtime.p(scheme = "[0[0]]")
    public void l(@NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
        this.f40412a.setOnViewTreeOwnersAvailable(new a(function2));
    }

    @Override // androidx.compose.runtime.o0
    public boolean m() {
        return this.f40413b.m();
    }

    @NotNull
    public final androidx.compose.runtime.o0 n() {
        return this.f40413b;
    }

    @NotNull
    public final AndroidComposeView o() {
        return this.f40412a;
    }
}
