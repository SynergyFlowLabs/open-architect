package com.planner5d.library.activity.fragment.dialog.authentication;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.k3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class f0 extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f131771d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f131772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f131773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<a> f131774c;

    public enum a {
        Initial,
        RemindInProgress,
        Success;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f131779e = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f131779e;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationForgotPasswordViewModel$send$1", f = "AuthenticationForgotPasswordViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131780a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.o f131782c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.services.o oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f131782c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f0.this.new b(this.f131782c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131780a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    f0.this.W().r(a.RemindInProgress);
                    com.planner5d.library.modules.user.user.t tVar = f0.this.f131772a;
                    String strE = this.f131782c.e(com.planner5d.library.f.j.D2);
                    this.f131780a = 1;
                    if (tVar.q0(strE, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                com.planner5d.library.model.manager.statistics.events.n.f217157b.F1(p3.b.success, null);
                f0.this.W().r(a.Success);
            } catch (Exception e10) {
                timber.log.b.f381052a.e(e10);
                com.planner5d.library.services.o oVar = this.f131782c;
                int i11 = com.planner5d.library.f.j.D2;
                int i12 = 3 ^ 2;
                k3 textValue = ErrorMessageParser.parse$default(f0.this.f131773b, e10, null, 2, null).toTextValue();
                Intrinsics.checkNotNullExpressionValue(textValue, "toTextValue(...)");
                oVar.f(i11, textValue);
                com.planner5d.library.model.manager.statistics.events.n.f217157b.F1(p3.b.error, ((e10 instanceof com.planner5d.library.api.e) && ((com.planner5d.library.api.e) e10).a() == com.planner5d.library.api.e.b.NETWORK) ? p3.a.network : p3.a.other);
            }
            f0.this.W().r(a.Initial);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public f0(@NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull ErrorMessageParser errorMessageParser) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        this.f131772a = userAuthorization;
        this.f131773b = errorMessageParser;
        this.f131774c = new androidx.lifecycle.c1<>(a.Initial);
    }

    @NotNull
    public final androidx.lifecycle.c1<a> W() {
        return this.f131774c;
    }

    public final void X(@NotNull com.planner5d.library.services.o form) {
        Intrinsics.checkNotNullParameter(form, "form");
        com.planner5d.library.model.manager.statistics.events.n.f217157b.F1(p3.b.submit, null);
        if (form.h()) {
            int i10 = 6 & 0;
            kotlinx.coroutines.k.f(g2.a(this), null, null, new b(form, null), 3, null);
        }
    }
}
