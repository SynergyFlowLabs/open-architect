package com.planner5d.library.activity.fragment.settings;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.c1;
import androidx.lifecycle.f2;
import androidx.lifecycle.g2;
import com.planner5d.library.model.manager.b2;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import com.planner5d.library.modules.user.user.g1;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.s;
import com.planner5d.library.services.utility.v1;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class h extends f2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f135242h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final g1 f135243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b2 f135244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.auth.m f135245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c1<id.e[]> f135246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final id.a f135247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final v1.a<SocialAuthType> f135248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.lifecycle.w0<SocialAuthType> f135249g;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.UserSocialViewModel$completeLink$1", f = "UserSocialViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Pair<SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> f135251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f135252c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Pair<? extends SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> pair, h hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f135251b = pair;
            this.f135252c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f135251b, this.f135252c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135250a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Pair<SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> pair = this.f135251b;
                    SocialAuthType socialAuthTypeComponent1 = pair.component1();
                    Object objJ = pair.component2().j();
                    com.planner5d.library.modules.user.auth.m mVar = this.f135252c.f135245c;
                    ResultKt.m(objJ);
                    this.f135250a = 1;
                    if (mVar.d(socialAuthTypeComponent1, (com.planner5d.library.modules.user.auth.k) objJ, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (com.planner5d.library.modules.user.auth.c unused) {
                b2 b2Var = this.f135252c.f135244b;
                ErrorMessageException errorMessageExceptionCreateNetworkException = ErrorMessageException.createNetworkException();
                Intrinsics.checkNotNullExpressionValue(errorMessageExceptionCreateNetworkException, "createNetworkException(...)");
                b2Var.r(errorMessageExceptionCreateNetworkException);
            } catch (Throwable th2) {
                this.f135252c.f135244b.c(th2);
            }
            this.f135252c.f0();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.UserSocialViewModel$execute$1", f = "UserSocialViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160716p}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super Unit>, Object> f135254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f135255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f135256d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1, h hVar, boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f135254b = function1;
            this.f135255c = hVar;
            this.f135256d = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f135254b, this.f135255c, this.f135256d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135253a;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Function1<kotlin.coroutines.d<? super Unit>, Object> function1 = this.f135254b;
                    this.f135253a = 1;
                    if (function1.invoke(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
            } catch (CancellationException e10) {
                timber.log.b.f381052a.e(e10);
            } catch (Throwable th2) {
                this.f135255c.f135244b.c(th2);
            }
            if (this.f135256d) {
                this.f135255c.f0();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.UserSocialViewModel$load$1", f = "UserSocialViewModel.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f135258b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return h.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c1 c1Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135258b;
            if (i10 == 0) {
                ResultKt.m(obj);
                c1<id.e[]> c1VarB0 = h.this.b0();
                g1 g1Var = h.this.f135243a;
                id.a aVar = h.this.f135247e;
                this.f135257a = c1VarB0;
                this.f135258b = 1;
                Object objG = g1Var.g(aVar, this);
                if (objG == objL) {
                    return objL;
                }
                obj = objG;
                c1Var = c1VarB0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1Var = (c1) this.f135257a;
                ResultKt.m(obj);
            }
            c1Var.r(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.UserSocialViewModel$unlink$1", f = "UserSocialViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f135260a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ id.e f135262c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(id.e eVar, kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
            this.f135262c = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return h.this.new d(this.f135262c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f135260a;
            if (i10 == 0) {
                ResultKt.m(obj);
                g1 g1Var = h.this.f135243a;
                id.a aVar = h.this.f135247e;
                id.e eVar = this.f135262c;
                this.f135260a = 1;
                if (g1Var.j(aVar, eVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public h(@NotNull t userAuthorization, @NotNull g1 userManagerSocial, @NotNull b2 messageManager, @NotNull com.planner5d.library.modules.user.auth.m socialAuthorization) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(userManagerSocial, "userManagerSocial");
        Intrinsics.checkNotNullParameter(messageManager, "messageManager");
        Intrinsics.checkNotNullParameter(socialAuthorization, "socialAuthorization");
        this.f135243a = userManagerSocial;
        this.f135244b = messageManager;
        this.f135245c = socialAuthorization;
        int i10 = 5 ^ 0;
        this.f135246d = new c1<>(null);
        this.f135247e = userAuthorization.a();
        v1.a<SocialAuthType> aVarJ = v1.f229769a.j(null);
        this.f135248f = aVarJ;
        this.f135249g = aVarJ;
        f0();
    }

    private final void a0(boolean z10, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> function1) {
        this.f135246d.r(null);
        kotlinx.coroutines.k.f(g2.a(this), null, null, new b(function1, this, z10, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        a0(false, new c(null));
    }

    public final void Z(@NotNull Pair<? extends SocialAuthType, Result<com.planner5d.library.modules.user.auth.k>> authResult) {
        Intrinsics.checkNotNullParameter(authResult, "authResult");
        this.f135246d.r(null);
        kotlinx.coroutines.k.f(g2.a(this), s.f229729a.a(), null, new a(authResult, this, null), 2, null);
    }

    @NotNull
    public final c1<id.e[]> b0() {
        return this.f135246d;
    }

    @NotNull
    public final androidx.lifecycle.w0<SocialAuthType> c0() {
        return this.f135249g;
    }

    public final void d0(@NotNull id.e connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f135246d.r(null);
        this.f135248f.r(connection.f());
    }

    public final void g0(@NotNull id.e connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        a0(true, new d(connection, null));
    }
}
