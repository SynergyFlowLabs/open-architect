package com.planner5d.library.activity.fragment.dialog.authentication;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.v1;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class y extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132022d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.auth.m f132023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v1.a<a> f132024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private SocialAuthType f132025c;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f132026a = 0;

        /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.authentication.y$a$a, reason: collision with other inner class name */
        @androidx.compose.runtime.internal.w0(parameters = 0)
        public static final class C1453a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132027c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final ErrorMessageException f132028b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1453a(@NotNull ErrorMessageException error) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.f132028b = error;
            }

            @NotNull
            public final ErrorMessageException a() {
                return this.f132028b;
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 1)
        public static final class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final b f132029b = new b();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132030c = 0;

            private b() {
                super(null);
            }

            public boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1577336060;
            }

            @NotNull
            public String toString() {
                return "Finish";
            }
        }

        @androidx.compose.runtime.internal.w0(parameters = 0)
        public static final class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f132031c = 8;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            private final id.a f132032b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull id.a user) {
                super(null);
                Intrinsics.checkNotNullParameter(user, "user");
                this.f132032b = user;
            }

            @NotNull
            public final id.a a() {
                return this.f132032b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationExternalServiceViewModel$completeSignInByService$1", f = "AuthenticationExternalServiceViewModel.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {androidx.core.app.w.Q0}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f132033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f132034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> f132035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y f132036d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Pair<? extends SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> pair, y yVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f132035c = pair;
            this.f132036d = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f132035c, this.f132036d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SocialAuthType socialAuthType;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f132034b;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Pair<SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> pair = this.f132035c;
                    SocialAuthType socialAuthTypeComponent1 = pair.component1();
                    Object objJ = pair.component2().j();
                    try {
                        com.planner5d.library.modules.user.auth.m mVar = this.f132036d.f132023a;
                        ResultKt.m(objJ);
                        this.f132033a = socialAuthTypeComponent1;
                        this.f132034b = 1;
                        if (mVar.e(socialAuthTypeComponent1, (com.planner5d.library.modules.user.auth.k) objJ, this) == objL) {
                            return objL;
                        }
                        socialAuthType = socialAuthTypeComponent1;
                    } catch (com.planner5d.library.modules.user.auth.b e10) {
                        e = e10;
                        socialAuthType = socialAuthTypeComponent1;
                        timber.log.b.f381052a.e(e);
                        this.f132036d.f132025c = socialAuthType;
                        this.f132036d.X().r(new a.C1453a(new ErrorMessageException(com.planner5d.library.f.s.E9, new String[0])));
                    } catch (com.planner5d.library.modules.user.auth.c e11) {
                        e = e11;
                        socialAuthType = socialAuthTypeComponent1;
                        timber.log.b.f381052a.e(e);
                        this.f132036d.f132025c = socialAuthType;
                        v1.a<a> aVarX = this.f132036d.X();
                        ErrorMessageException errorMessageExceptionCreateNetworkException = ErrorMessageException.createNetworkException();
                        Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNetworkException, "createNetworkException(...)");
                        aVarX.r(new a.C1453a(errorMessageExceptionCreateNetworkException));
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    socialAuthType = (SocialAuthType) this.f132033a;
                    try {
                        ResultKt.m(obj);
                    } catch (com.planner5d.library.modules.user.auth.b e12) {
                        e = e12;
                        timber.log.b.f381052a.e(e);
                        this.f132036d.f132025c = socialAuthType;
                        this.f132036d.X().r(new a.C1453a(new ErrorMessageException(com.planner5d.library.f.s.E9, new String[0])));
                    } catch (com.planner5d.library.modules.user.auth.c e13) {
                        e = e13;
                        timber.log.b.f381052a.e(e);
                        this.f132036d.f132025c = socialAuthType;
                        v1.a<a> aVarX2 = this.f132036d.X();
                        ErrorMessageException errorMessageExceptionCreateNetworkException2 = ErrorMessageException.createNetworkException();
                        Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNetworkException2, "createNetworkException(...)");
                        aVarX2.r(new a.C1453a(errorMessageExceptionCreateNetworkException2));
                    }
                }
                this.f132036d.X().r(a.b.f132029b);
            } catch (com.planner5d.library.modules.user.auth.d e14) {
                timber.log.b.f381052a.e(e14);
                this.f132036d.X().r(new a.c(e14.b()));
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public y(@NotNull com.planner5d.library.modules.user.auth.m socialAuthorization) {
        Intrinsics.checkNotNullParameter(socialAuthorization, "socialAuthorization");
        this.f132023a = socialAuthorization;
        this.f132024b = v1.l(v1.f229769a, null, 1, null);
    }

    public final void W(@NotNull Pair<? extends SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> authResult) {
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(authResult, this, null), 3, null);
    }

    @NotNull
    public final v1.a<a> X() {
        return this.f132024b;
    }
}
