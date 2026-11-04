package io.ktor.client.plugins;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nDoubleReceivePlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleReceivePlugin.kt\nio/ktor/client/plugins/DoubleReceivePluginKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,102:1\n21#2:103\n21#2:122\n65#3,18:104\n65#3,18:123\n*S KotlinDebug\n*F\n+ 1 DoubleReceivePlugin.kt\nio/ktor/client/plugins/DoubleReceivePluginKt\n*L\n15#1:103\n17#1:122\n15#1:104,18\n17#1:123,18\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Unit> f294957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Unit> f294958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<p1> f294959c;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<p1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294960a = new a();

        a() {
            super(0, p1.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final p1 invoke() {
            return new p1();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$2$1", f = "DoubleReceivePlugin.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit>, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f294964d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f294964d = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final io.ktor.utils.io.h n(io.ktor.client.plugins.internal.b bVar) {
            return bVar.b();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f294961a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.util.pipeline.e eVar = (io.ktor.util.pipeline.e) this.f294962b;
                io.ktor.client.statement.c cVar = (io.ktor.client.statement.c) this.f294963c;
                if (!this.f294964d && !cVar.h().getAttributes().d(q.f294957a)) {
                    final io.ktor.client.plugins.internal.b bVar = new io.ktor.client.plugins.internal.b(cVar.c());
                    io.ktor.client.call.b bVarC = io.ktor.client.plugins.observer.d.c(cVar.h(), new Function0() { // from class: io.ktor.client.plugins.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return q.b.n(bVar);
                        }
                    });
                    bVarC.getAttributes().a(q.f294958b, Unit.f312394a);
                    io.ktor.client.statement.c cVarK = bVarC.k();
                    this.f294962b = null;
                    this.f294961a = 1;
                    if (eVar.k(cVarK, this) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> eVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f294964d, dVar);
            bVar.f294962b = eVar;
            bVar.f294963c = cVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(Unit.class);
        kotlin.reflect.s sVarA2 = null;
        try {
            sVarA = kotlin.jvm.internal.j1.A(Unit.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f294957a = new io.ktor.util.a<>("SkipSaveBody", new ri.b(dVarD, sVarA));
        kotlin.reflect.d dVarD2 = kotlin.jvm.internal.j1.d(Unit.class);
        try {
            sVarA2 = kotlin.jvm.internal.j1.A(Unit.class);
        } catch (Throwable unused2) {
        }
        f294958b = new io.ktor.util.a<>("ResponseBodySaved", new ri.b(dVarD2, sVarA2));
        f294959c = io.ktor.client.plugins.api.i.b("DoubleReceivePlugin", a.f294960a, new Function1() { // from class: io.ktor.client.plugins.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.b((io.ktor.client.plugins.api.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.b().t().q(io.ktor.client.statement.b.f295326h.b(), new b(((p1) createClientPlugin.f()).a(), null));
        return Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<p1> e() {
        return f294959c;
    }

    public static /* synthetic */ void f() {
    }

    public static final boolean g(@NotNull io.ktor.client.statement.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.h().getAttributes().d(f294958b);
    }

    public static final void h(@NotNull fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        yVar.c().a(f294957a, Unit.f312394a);
    }
}
