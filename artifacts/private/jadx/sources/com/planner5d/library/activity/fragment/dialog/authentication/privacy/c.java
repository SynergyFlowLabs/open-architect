package com.planner5d.library.activity.fragment.dialog.authentication.privacy;

import android.app.Activity;
import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.modules.user.user.m0;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.utility.c0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class c extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f131980d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.b f131981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m0 f131982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f131983c;

    @f(c = "com.planner5d.library.activity.fragment.dialog.authentication.privacy.AuthenticationPrivacyAgreementViewModel$clearPrivateData$1", f = "AuthenticationPrivacyAgreementViewModel.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131984a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f131986c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f131986c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(this.f131986c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f131984a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    c0 c0Var = c0.f225068a;
                    Observable<Void> observableJ = c.this.f131982b.j(this.f131986c, c.this.f131983c.a(), null);
                    this.f131984a = 1;
                    if (c0Var.l(observableJ, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (Throwable th2) {
                timber.log.b.f381052a.f(th2, "Failed to delete personal data", new Object[0]);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @f(c = "com.planner5d.library.activity.fragment.dialog.authentication.privacy.AuthenticationPrivacyAgreementViewModel$launchActionAfterAgreement$1", f = "AuthenticationPrivacyAgreementViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f131987a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.a f131989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(id.a aVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f131989c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new b(this.f131989c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f131987a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            c.this.f131983c.w0(this.f131989c, false, false);
            c.this.f131981a.a();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c(@NotNull com.planner5d.library.modules.user.user.b actionAfterLogInStandard, @NotNull m0 userPrivateData, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(actionAfterLogInStandard, "actionAfterLogInStandard");
        Intrinsics.checkNotNullParameter(userPrivateData, "userPrivateData");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f131981a = actionAfterLogInStandard;
        this.f131982b = userPrivateData;
        this.f131983c = userAuthorization;
    }

    public final void X(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        k.f(g2.a(this), null, null, new a(activity, null), 3, null);
    }

    public final void Y(@NotNull id.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        k.f(g2.a(this), null, null, new b(user, null), 3, null);
    }
}
