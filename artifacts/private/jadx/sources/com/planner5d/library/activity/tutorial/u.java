package com.planner5d.library.activity.tutorial;

import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f141881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f141882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1<s[]> f141883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f141884d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.tutorial.TutorialViewModel$finish$1", f = "TutorialViewModel.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f141885a;

        /* JADX INFO: renamed from: com.planner5d.library.activity.tutorial.u$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.tutorial.TutorialViewModel$finish$1$1", f = "TutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C1504a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f141887a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f141888b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1504a(u uVar, kotlin.coroutines.d<? super C1504a> dVar) {
                super(2, dVar);
                this.f141888b = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1504a(this.f141888b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f141887a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.f141888b.f141881a.f(this.f141888b.f141884d);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C1504a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f141885a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                C1504a c1504a = new C1504a(u.this, null);
                this.f141885a = 1;
                if (kotlinx.coroutines.i.h(z1VarD, c1504a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            u.this.X().r(kotlin.coroutines.jvm.internal.b.a(true));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.tutorial.TutorialViewModel$load$1", f = "TutorialViewModel.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f141889a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f141891c;

        @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.tutorial.TutorialViewModel$load$1$1", f = "TutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f141892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f141893b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f141894c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f141893b = uVar;
                this.f141894c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f141893b, this.f141894c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f141892a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                if (this.f141893b.f141881a.c(this.f141894c)) {
                    this.f141893b.W();
                } else {
                    this.f141893b.Y().o(this.f141893b.f141881a.d(this.f141894c));
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f141891c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u.this.new b(this.f141891c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f141889a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z1 z1VarD = com.planner5d.library.services.utility.s.f229729a.d();
                a aVar = new a(u.this, this.f141891c, null);
                this.f141889a = 1;
                if (kotlinx.coroutines.i.h(z1VarD, aVar, this) == objL) {
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

    @ij.a
    public u(@NotNull p manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f141881a = manager;
        this.f141882b = new c1<>(Boolean.FALSE);
        this.f141883c = new c1<>(null);
    }

    public final void W() {
        int i10 = 0 >> 0;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(null), 3, null);
    }

    @NotNull
    public final c1<Boolean> X() {
        return this.f141882b;
    }

    @NotNull
    public final c1<s[]> Y() {
        return this.f141883c;
    }

    public final void Z(@Nullable String str) {
        this.f141884d = str;
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(str, null), 3, null);
    }
}
