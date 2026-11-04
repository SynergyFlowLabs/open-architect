package com.planner5d.library.activity.fragment.dialog.authentication;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.k3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class k1 extends f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f131801e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.q0 f131802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f131803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f131804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f131805d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.NewsletterAgreementViewModel$finish$1", f = "NewsletterAgreementViewModel.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131806a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f131808c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f131808c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return k1.this.new a(this.f131808c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131806a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    k1 k1Var = k1.this;
                    boolean z10 = this.f131808c;
                    this.f131806a = 1;
                    if (k1Var.X(z10, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                k1.this.W().r(kotlin.coroutines.jvm.internal.b.a(true));
                k1.this.V().r(kotlin.coroutines.jvm.internal.b.a(false));
                return Unit.f312394a;
            } catch (Throwable th2) {
                k1.this.V().r(kotlin.coroutines.jvm.internal.b.a(false));
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.NewsletterAgreementViewModel", f = "NewsletterAgreementViewModel.kt", i = {0}, l = {37}, m = "sendNewsletterAgreeToServer", n = {"agree"}, s = {"Z$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f131809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f131810b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f131812d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f131810b = obj;
            this.f131812d |= Integer.MIN_VALUE;
            return k1.this.X(false, this);
        }
    }

    @ij.a
    public k1(@NotNull com.planner5d.library.modules.user.user.q0 userProperties, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f131802a = userProperties;
        this.f131803b = userAuthorization;
        Boolean bool = Boolean.FALSE;
        this.f131804c = new androidx.lifecycle.c1<>(bool);
        this.f131805d = new androidx.lifecycle.c1<>(bool);
    }

    public final void U(boolean z10) {
        this.f131804c.r(Boolean.TRUE);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new a(z10, null), 3, null);
    }

    @NotNull
    public final androidx.lifecycle.c1<Boolean> V() {
        return this.f131804c;
    }

    @NotNull
    public final androidx.lifecycle.c1<Boolean> W() {
        return this.f131805d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object X(boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f131812d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f131812d = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f131810b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f131812d;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                id.a aVarA = this.f131803b.a();
                if (aVarA != null) {
                    com.planner5d.library.modules.user.user.q0 q0Var = this.f131802a;
                    com.planner5d.library.services.r rVar = com.planner5d.library.services.r.newslettersAgreed;
                    bVar.f131809a = z10;
                    bVar.f131812d = 1;
                    if (q0Var.f(aVarA, rVar, z10, bVar) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = bVar.f131809a;
                ResultKt.m(obj);
            }
            if (z10) {
                com.planner5d.library.model.manager.statistics.events.n.f217157b.P1(k3.d.stay_in_touch_screen);
            }
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to mark user agreed with newsletter as " + z10, new Object[0]);
        }
        return Unit.f312394a;
    }
}
