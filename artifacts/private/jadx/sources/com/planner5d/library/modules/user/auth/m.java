package com.planner5d.library.modules.user.auth;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.modules.user.user.g1;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.utility.c2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
public final class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f222909e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f222910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c2 f222911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final g1 f222912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f222913d;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.auth.SocialAuthorization$link$2", f = "SocialAuthorization.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222914a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SocialAuthType f222916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f222917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SocialAuthType socialAuthType, k kVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f222916c = socialAuthType;
            this.f222917d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return m.this.new a(this.f222916c, this.f222917d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222914a;
            if (i10 == 0) {
                ResultKt.m(obj);
                g1 g1Var = m.this.f222912c;
                id.a aVarA = m.this.f222913d.a();
                SocialAuthType socialAuthType = this.f222916c;
                String strJ = this.f222917d.j();
                String strI = this.f222917d.i();
                String strG = this.f222917d.g();
                this.f222914a = 1;
                if (g1Var.h(aVarA, socialAuthType, strJ, strI, strG, this) == objL) {
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
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.auth.SocialAuthorization", f = "SocialAuthorization.kt", i = {0, 0, 0}, l = {33}, m = "login", n = {"this", "type", "signUp"}, s = {"L$0", "L$1", "Z$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f222920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f222921d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f222923f;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222921d = obj;
            this.f222923f |= Integer.MIN_VALUE;
            return m.this.e(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.modules.user.auth.SocialAuthorization$login$2", f = "SocialAuthorization.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super com.planner5d.library.api.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f222924a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SocialAuthType f222926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f222927d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SocialAuthType socialAuthType, k kVar, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f222926c = socialAuthType;
            this.f222927d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return m.this.new c(this.f222926c, this.f222927d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f222924a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            g1 g1Var = m.this.f222912c;
            SocialAuthType socialAuthType = this.f222926c;
            String strJ = this.f222927d.j();
            String strI = this.f222927d.i();
            String strG = this.f222927d.g();
            this.f222924a = 1;
            Object objI = g1Var.i(socialAuthType, strJ, strI, strG, this);
            return objI == objL ? objL : objI;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super com.planner5d.library.api.c> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public m(@NotNull Application application, @NotNull c2 networkStateUtility, @NotNull g1 userSocial, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(userSocial, "userSocial");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f222910a = application;
        this.f222911b = networkStateUtility;
        this.f222912c = userSocial;
        this.f222913d = userAuthorization;
    }

    private final void c(boolean z10, SocialAuthType socialAuthType, p3.a aVar) {
        com.planner5d.library.model.manager.statistics.events.n.f217157b.M1(z10, aVar, socialAuthType.getMethod(), false, false);
    }

    private final void f() throws com.planner5d.library.modules.user.auth.c {
        if (!this.f222911b.d(this.f222910a)) {
            throw new com.planner5d.library.modules.user.auth.c();
        }
    }

    @Nullable
    public final Object d(@NotNull SocialAuthType socialAuthType, @NotNull k kVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws ErrorMessageException, com.planner5d.library.modules.user.auth.c {
        f();
        Object objH = kotlinx.coroutines.i.h(com.planner5d.library.services.utility.s.f229729a.b(), new a(socialAuthType, kVar, null), dVar);
        return objH == kotlin.coroutines.intrinsics.b.l() ? objH : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[Catch: all -> 0x009e, c -> 0x00a2, TryCatch #4 {c -> 0x00a2, all -> 0x009e, blocks: (B:25:0x0080, B:27:0x0091, B:32:0x00a6), top: B:50:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object e(@NotNull SocialAuthType socialAuthType, @NotNull k kVar, @NotNull kotlin.coroutines.d<? super id.d> dVar) throws com.planner5d.library.modules.user.auth.b, d, com.planner5d.library.modules.user.auth.c {
        b bVar;
        boolean z10;
        vc.a aVar;
        com.planner5d.library.modules.user.auth.c cVar;
        id.d dVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f222923f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f222923f = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f222921d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f222923f;
        if (i11 == 0) {
            ResultKt.m(obj);
            boolean zH = kVar.h();
            try {
                f();
                t tVar = this.f222913d;
                c cVar2 = new c(socialAuthType, kVar, null);
                bVar.f222918a = this;
                bVar.f222919b = socialAuthType;
                bVar.f222920c = zH;
                bVar.f222923f = 1;
                Object objZ0 = tVar.z0(cVar2, bVar);
                if (objZ0 == objL) {
                    return objL;
                }
                z10 = zH;
                obj = objZ0;
                dVar2 = (id.d) obj;
                if (Intrinsics.areEqual(dVar2.f287102b, kotlin.coroutines.jvm.internal.b.a(true))) {
                    com.planner5d.library.model.manager.statistics.events.n.f217157b.G1(k3.e.sign_in, socialAuthType.getMethod());
                }
                com.planner5d.library.model.manager.statistics.events.n.f217157b.M1(z10, null, socialAuthType.getMethod(), Intrinsics.areEqual(dVar2.f287102b, kotlin.coroutines.jvm.internal.b.a(true)), false);
                return obj;
            } catch (com.planner5d.library.modules.user.auth.c e10) {
                z10 = zH;
                cVar = e10;
                this.c(z10, socialAuthType, p3.a.network);
                throw cVar;
            } catch (Throwable th2) {
                z10 = zH;
                aVar = th2;
                this.c(z10, socialAuthType, p3.a.other);
                if (!(aVar instanceof vc.a)) {
                    throw new com.planner5d.library.modules.user.auth.b();
                }
                vc.a aVar2 = aVar;
                throw new d(aVar2.b(), aVar2.a());
            }
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean z11 = bVar.f222920c;
        socialAuthType = (SocialAuthType) bVar.f222919b;
        m mVar = (m) bVar.f222918a;
        try {
            ResultKt.m(obj);
            z10 = z11;
            this = mVar;
            try {
                dVar2 = (id.d) obj;
                if (Intrinsics.areEqual(dVar2.f287102b, kotlin.coroutines.jvm.internal.b.a(true))) {
                    com.planner5d.library.model.manager.statistics.events.n.f217157b.G1(k3.e.sign_in, socialAuthType.getMethod());
                }
                com.planner5d.library.model.manager.statistics.events.n.f217157b.M1(z10, null, socialAuthType.getMethod(), Intrinsics.areEqual(dVar2.f287102b, kotlin.coroutines.jvm.internal.b.a(true)), false);
                return obj;
            } catch (com.planner5d.library.modules.user.auth.c e11) {
                cVar = e11;
                this.c(z10, socialAuthType, p3.a.network);
                throw cVar;
            } catch (Throwable th3) {
                aVar = th3;
                this.c(z10, socialAuthType, p3.a.other);
                if (!(aVar instanceof vc.a)) {
                    throw new com.planner5d.library.modules.user.auth.b();
                }
                vc.a aVar3 = aVar;
                throw new d(aVar3.b(), aVar3.a());
            }
        } catch (com.planner5d.library.modules.user.auth.c e12) {
            cVar = e12;
            z10 = z11;
            this = mVar;
            this.c(z10, socialAuthType, p3.a.network);
            throw cVar;
        } catch (Throwable th4) {
            aVar = th4;
            z10 = z11;
            this = mVar;
            this.c(z10, socialAuthType, p3.a.other);
            if (!(aVar instanceof vc.a)) {
                throw new com.planner5d.library.modules.user.auth.b();
            }
            vc.a aVar4 = aVar;
            throw new d(aVar4.b(), aVar4.a());
        }
    }
}
