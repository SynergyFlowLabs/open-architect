package com.planner5d.library.activity.fragment.dialog.authentication.onelink;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.utility.c2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class l extends f2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f131873k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.b f131874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f131875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f131876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c2 f131877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c1<Boolean> f131878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final c1<a> f131879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final c1<String> f131880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<Boolean> f131881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<a> f131882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<String> f131883j;

    @w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f131884a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.authentication.onelink.l$a$a, reason: collision with other inner class name */
        @w0(parameters = 1)
        public static final class C1449a extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f131885d = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f131886b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            private final String f131887c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1449a(int i10, @NotNull String email) {
                super(null);
                Intrinsics.checkNotNullParameter(email, "email");
                this.f131886b = i10;
                this.f131887c = email;
            }

            @NotNull
            public final String a() {
                return this.f131887c;
            }

            public final int b() {
                return this.f131886b;
            }
        }

        @w0(parameters = 0)
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131888c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final id.a f131889b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull id.a user) {
                super(null);
                Intrinsics.checkNotNullParameter(user, "user");
                this.f131889b = user;
            }

            @NotNull
            public final id.a a() {
                return this.f131889b;
            }
        }

        @w0(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final c f131890b = new c();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f131891c = 0;

            private c() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -733571358;
            }

            @NotNull
            public String toString() {
                return "Start";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.onelink.AuthenticationSignInConfirmationViewModel$signIn$1", f = "AuthenticationSignInConfirmationViewModel.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131892a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f131894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f131895d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f131894c = str;
            this.f131895d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return l.this.new b(this.f131894c, this.f131895d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131892a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    com.planner5d.library.modules.user.user.t tVar = l.this.f131875b;
                    String str = this.f131894c;
                    this.f131892a = 1;
                    obj = tVar.o0(str, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                int iIntValue = ((Number) obj).intValue();
                l.this.f0(this.f131895d, null);
                l.this.f131879f.r(new a.C1449a(iIntValue, this.f131894c));
            } catch (vc.a e10) {
                l.this.c0(this.f131895d, e10);
                l.this.f131879f.r(new a.b(e10.b()));
            } catch (Exception e11) {
                l.this.c0(this.f131895d, e11);
            }
            l.this.f131878e.r(kotlin.coroutines.jvm.internal.b.a(false));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public l(@NotNull com.planner5d.library.application.b application, @NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull ErrorMessageParser errorMessageParser, @NotNull c2 networkStateUtility) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        this.f131874a = application;
        this.f131875b = userAuthorization;
        this.f131876c = errorMessageParser;
        this.f131877d = networkStateUtility;
        c1<Boolean> c1Var = new c1<>(Boolean.FALSE);
        this.f131878e = c1Var;
        c1<a> c1Var2 = new c1<>(a.c.f131890b);
        this.f131879f = c1Var2;
        c1<String> c1Var3 = new c1<>();
        this.f131880g = c1Var3;
        this.f131881h = c1Var;
        this.f131882i = c1Var2;
        this.f131883j = c1Var3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(boolean z10, Exception exc) {
        timber.log.b.f381052a.e(exc);
        this.f131880g.r(ErrorMessageParser.parse$default(this.f131876c, exc, null, 2, null).toMessage().c().i(this.f131874a).toString());
        f0(z10, p3.a.other);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(boolean z10, p3.a aVar) {
        com.planner5d.library.model.manager.statistics.events.n.f217157b.L1(z10 ? k3.a.sign_up : k3.a.sign_in, aVar == null ? p3.b.success : p3.b.error, aVar, k3.c.one_link_email, false, false);
    }

    @NotNull
    public final androidx.lifecycle.w0<String> Z() {
        return this.f131883j;
    }

    @NotNull
    public final androidx.lifecycle.w0<Boolean> a0() {
        return this.f131881h;
    }

    @NotNull
    public final androidx.lifecycle.w0<a> b0() {
        return this.f131882i;
    }

    public final void d0() {
        this.f131879f.r(a.c.f131890b);
    }

    public final void g0(@NotNull String email, boolean z10) {
        Intrinsics.checkNotNullParameter(email, "email");
        if (!this.f131877d.d(this.f131874a)) {
            ErrorMessageException errorMessageExceptionCreateNoInternetException = ErrorMessageException.createNoInternetException();
            Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNoInternetException, "createNoInternetException(...)");
            c0(z10, errorMessageExceptionCreateNoInternetException);
        } else if (!h0(email)) {
            f0(z10, p3.a.other);
        } else {
            this.f131878e.r(Boolean.TRUE);
            kotlinx.coroutines.k.f(g2.a(this), null, null, new b(email, z10, null), 3, null);
        }
    }

    public final boolean h0(@Nullable String str) {
        String strA = new q0.a(this.f131874a).a(str);
        this.f131880g.r(strA);
        return strA == null;
    }
}
