package com.planner5d.library.activity.fragment.dialog.authentication;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.utility.k3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class v0 extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f132003f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f132004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f132005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.b f132006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f132007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<a> f132008e;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f132009a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.authentication.v0$a$a, reason: collision with other inner class name */
        @androidx.compose.runtime.internal.w0(parameters = 0)
        public static final class C1452a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132010c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final id.a f132011b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1452a(@NotNull id.a user) {
                super(null);
                Intrinsics.checkNotNullParameter(user, "user");
                this.f132011b = user;
            }

            @NotNull
            public final id.a a() {
                return this.f132011b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationSignInViewModel$signIn$1", f = "AuthenticationSignInViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f132012a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.o f132014c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.planner5d.library.services.o oVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f132014c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v0.this.new b(this.f132014c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132012a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.modules.user.user.t tVar = v0.this.f132004a;
                    String strE = this.f132014c.e(com.planner5d.library.f.j.f168103h3);
                    String strE2 = this.f132014c.e(com.planner5d.library.f.j.f168199l3);
                    this.f132012a = 1;
                    if (tVar.y0(strE, strE2, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                v0.this.f132006c.a();
                v0.this.c0(null);
            } catch (ErrorMessageException e10) {
                v0.this.b0(e10);
                com.planner5d.library.services.o oVar = this.f132014c;
                int i11 = com.planner5d.library.f.j.f168199l3;
                k3 textValue = e10.toTextValue();
                Intrinsics.checkNotNullExpressionValue(textValue, "toTextValue(...)");
                oVar.f(i11, textValue);
            } catch (vc.a e11) {
                v0.this.b0(e11);
                v0.this.a0().r(new a.C1452a(e11.b()));
            } catch (Exception e12) {
                v0.this.b0(e12);
                com.planner5d.library.services.o oVar2 = this.f132014c;
                int i12 = com.planner5d.library.f.j.f168199l3;
                k3 textValue2 = ErrorMessageParser.parse$default(v0.this.f132005b, e12, null, 2, null).toTextValue();
                Intrinsics.checkNotNullExpressionValue(textValue2, "toTextValue(...)");
                oVar2.f(i12, textValue2);
            }
            v0.this.Z().r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public v0(@NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull ErrorMessageParser errorMessageParser, @NotNull com.planner5d.library.modules.user.user.b actionAfterLogInStandard) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(actionAfterLogInStandard, "actionAfterLogInStandard");
        this.f132004a = userAuthorization;
        this.f132005b = errorMessageParser;
        this.f132006c = actionAfterLogInStandard;
        this.f132007d = new androidx.lifecycle.c1<>(Boolean.FALSE);
        this.f132008e = new androidx.lifecycle.c1<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(Exception exc) {
        timber.log.b.f381052a.e(exc);
        c0(p3.a.other);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(p3.a aVar) {
        com.planner5d.library.model.manager.statistics.events.n.f217157b.L1(com.planner5d.library.model.manager.statistics.events.k3.a.sign_in, aVar == null ? p3.b.success : p3.b.error, aVar, com.planner5d.library.model.manager.statistics.events.k3.c.email, false, false);
    }

    @NotNull
    public final androidx.lifecycle.c1<Boolean> Z() {
        return this.f132007d;
    }

    @NotNull
    public final androidx.lifecycle.c1<a> a0() {
        return this.f132008e;
    }

    public final void d0(@NotNull com.planner5d.library.services.o form) {
        Intrinsics.checkNotNullParameter(form, "form");
        if (!form.h()) {
            c0(p3.a.other);
        } else {
            this.f132007d.r(Boolean.TRUE);
            kotlinx.coroutines.k.f(g2.a(this), null, null, new b(form, null), 3, null);
        }
    }
}
