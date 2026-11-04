package io.ktor.client.plugins;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f295266a = pi.a.a("io.ktor.client.plugins.UserAgent");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<u1> f295267b = io.ktor.client.plugins.api.i.b("UserAgent", a.f295268a, new Function1() { // from class: io.ktor.client.plugins.w1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return y1.h((io.ktor.client.plugins.api.d) obj);
        }
    });

    /* synthetic */ class a extends kotlin.jvm.internal.a implements Function0<u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f295268a = new a();

        a() {
            super(0, u1.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final u1 invoke() {
            return new u1(null, 1, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$3$1", f = "UserAgent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.o<io.ktor.client.plugins.api.m, fi.y, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f295271c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(4, dVar);
            this.f295271c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f295269a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            fi.y yVar = (fi.y) this.f295270b;
            y1.f295266a.J("Adding User-Agent header: agent for " + yVar.i());
            fi.k0.h(yVar, io.ktor.http.d1.f295782a.L0(), this.f295271c);
            return Unit.f312394a;
        }

        @Override // pj.o
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.plugins.api.m mVar, fi.y yVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f295271c, dVar);
            bVar.f295270b = yVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    public static final void d(@NotNull io.ktor.client.j<?> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        jVar.r(f295267b, new Function1() { // from class: io.ktor.client.plugins.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.e((u1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(u1 install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        install.b("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36");
        return Unit.f312394a;
    }

    public static final void f(@NotNull io.ktor.client.j<?> jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        jVar.r(f295267b, new Function1() { // from class: io.ktor.client.plugins.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return y1.g((u1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(u1 install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        install.b("curl/7.61.0");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.j(new b(((u1) createClientPlugin.f()).a(), null));
        return Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<u1> j() {
        return f295267b;
    }
}
