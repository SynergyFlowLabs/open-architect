package com.planner5d.library.activity.fragment.dialog.authentication;

import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.services.exceptions.ErrorMessageParser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class c1 extends f2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f131746h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f131747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.q0 f131748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.legal.model.manager.a f131749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final ErrorMessageParser f131750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.b f131751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f131752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.c1<Boolean> f131753g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.dialog.authentication.AuthenticationSignUpViewModel$signUp$1", f = "AuthenticationSignUpViewModel.kt", i = {1, 2}, l = {41, 44, 45, 50}, m = "invokeSuspend", n = {"user", "user"}, s = {"L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f131754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f131755b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.services.o f131757d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.planner5d.library.services.o oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f131757d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c1.this.new a(this.f131757d, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00af  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b0 A[Catch: Exception -> 0x001f, PHI: r1
          0x00b0: PHI (r1v16 id.a) = (r1v15 id.a), (r1v20 id.a) binds: [B:32:0x00ad, B:17:0x0030] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001f, blocks: (B:10:0x001a, B:41:0x00f0, B:17:0x0030, B:34:0x00b0, B:36:0x00cb, B:37:0x00d1, B:20:0x0038, B:31:0x0092, B:21:0x003c, B:27:0x0077, B:24:0x0053), top: B:50:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00cb A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:10:0x001a, B:41:0x00f0, B:17:0x0030, B:34:0x00b0, B:36:0x00cb, B:37:0x00d1, B:20:0x0038, B:31:0x0092, B:21:0x003c, B:27:0x0077, B:24:0x0053), top: B:50:0x000e }] */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
        
            if (r11.H(r1, r3, r10) == r0) goto L39;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.dialog.authentication.c1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public c1(@NotNull com.planner5d.library.modules.user.user.t userAuthorization, @NotNull com.planner5d.library.modules.user.user.q0 userProperties, @NotNull com.planner5d.library.legal.model.manager.a privacyManager, @NotNull ErrorMessageParser errorMessageParser, @NotNull com.planner5d.library.modules.user.user.b actionAfterLogInStandard) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        Intrinsics.checkNotNullParameter(privacyManager, "privacyManager");
        Intrinsics.checkNotNullParameter(errorMessageParser, "errorMessageParser");
        Intrinsics.checkNotNullParameter(actionAfterLogInStandard, "actionAfterLogInStandard");
        this.f131747a = userAuthorization;
        this.f131748b = userProperties;
        this.f131749c = privacyManager;
        this.f131750d = errorMessageParser;
        this.f131751e = actionAfterLogInStandard;
        this.f131753g = new androidx.lifecycle.c1<>(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(p3.a aVar) {
        com.planner5d.library.model.manager.statistics.events.n.f217157b.L1(k3.a.sign_up, aVar == null ? p3.b.success : p3.b.error, aVar, k3.c.email, false, false);
    }

    @NotNull
    public final androidx.lifecycle.c1<Boolean> b0() {
        return this.f131753g;
    }

    public final void c0(boolean z10) {
        this.f131752f = z10;
    }

    public final void f0(@NotNull com.planner5d.library.services.o form) {
        Intrinsics.checkNotNullParameter(form, "form");
        if (!form.h()) {
            d0(p3.a.other);
        } else {
            int i10 = 7 | 0;
            kotlinx.coroutines.k.f(g2.a(this), null, null, new a(form, null), 3, null);
        }
    }
}
