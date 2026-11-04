package com.planner5d.library.api.support;

import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import okhttp3.b0;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
@SourceDebugExtension({"SMAP\nBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builder.kt\ncom/planner5d/library/api/support/Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f142347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ij.c<p> f142348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ad.b f142349c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.support.Builder$buildClient$2$1", f = "Builder.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142350a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142350a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            com.planner5d.library.model.manager.config.p pVar = b.this.f142347a;
            com.planner5d.library.services.r rVar = com.planner5d.library.services.r.useStagingDomain;
            this.f142350a = 1;
            Object objG = pVar.G(rVar, false, this);
            return objG == objL ? objL : objG;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.api.support.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.api.support.Builder$buildClient$2$2", f = "Builder.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builder.kt\ncom/planner5d/library/api/support/Builder$buildClient$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
    static final class C1512b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f142352a;

        C1512b(kotlin.coroutines.d<? super C1512b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C1512b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f142352a;
            if (i10 == 0) {
                ResultKt.m(obj);
                com.planner5d.library.model.manager.config.p pVar = b.this.f142347a;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.stagingDomain;
                this.f142352a = 1;
                obj = pVar.u(rVar, null, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            String str = (String) obj;
            if (str != null) {
                com.planner5d.library.api.f.f142260a.b(str);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1512b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public b(@NotNull com.planner5d.library.model.manager.config.p preferences, @NotNull ij.c<p> sessionInterceptor, @NotNull ad.b loggingMiddleware) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(sessionInterceptor, "sessionInterceptor");
        Intrinsics.checkNotNullParameter(loggingMiddleware, "loggingMiddleware");
        this.f142347a = preferences;
        this.f142348b = sessionInterceptor;
        this.f142349c = loggingMiddleware;
    }

    private final b0 c() {
        b0.a aVar = new b0.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b0.a aVarJ0 = aVar.k(8000L, timeUnit).j0(20000L, timeUnit);
        p pVar = this.f142348b.get();
        Intrinsics.checkNotNullExpressionValue(pVar, "get(...)");
        b0.a aVarC = aVarJ0.c(pVar);
        this.f142349c.apply(aVarC);
        return aVarC.f();
    }

    private final Retrofit d(Function0<String> function0) {
        Retrofit retrofitBuild = new Retrofit.Builder().client(c()).baseUrl(function0.invoke()).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(new f.a()).addConverterFactory(new k.a()).addCallAdapterFactory(new d.a()).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        return retrofitBuild;
    }

    @NotNull
    public final com.planner5d.library.api.b b(@NotNull Function0<String> baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Object objCreate = d(baseUrl).create(com.planner5d.library.api.b.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (com.planner5d.library.api.b) objCreate;
    }
}
