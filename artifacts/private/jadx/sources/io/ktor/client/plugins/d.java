package io.ktor.client.plugins;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nBodyProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyProgress.kt\nio/ktor/client/plugins/BodyProgressKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,102:1\n21#2:103\n21#2:122\n65#3,18:104\n65#3,18:123\n*S KotlinDebug\n*F\n+ 1 BodyProgress.kt\nio/ktor/client/plugins/BodyProgressKt\n*L\n21#1:103\n24#1:122\n21#1:104,18\n24#1:123,18\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<io.ktor.client.content.d> f294763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<io.ktor.client.content.d> f294764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<Unit> f294765c;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<fi.y, io.ktor.http.content.w, kotlin.coroutines.d<? super io.ktor.http.content.w>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294768c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f294766a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            fi.y yVar = (fi.y) this.f294767b;
            io.ktor.http.content.w wVar = (io.ktor.http.content.w) this.f294768c;
            io.ktor.client.content.d dVar = (io.ktor.client.content.d) yVar.c().e(d.f294763a);
            if (dVar == null) {
                return null;
            }
            return new io.ktor.client.content.c(wVar, yVar.g(), dVar);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fi.y yVar, io.ktor.http.content.w wVar, kotlin.coroutines.d<? super io.ktor.http.content.w> dVar) {
            a aVar = new a(dVar);
            aVar.f294767b = yVar;
            aVar.f294768c = wVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$2", f = "BodyProgress.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super io.ktor.client.statement.c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294770b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f294770b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f294769a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            io.ktor.client.statement.c cVar = (io.ktor.client.statement.c) this.f294770b;
            io.ktor.client.content.d dVar = (io.ktor.client.content.d) cVar.h().j().getAttributes().e(d.f294764b);
            if (dVar == null) {
                return null;
            }
            return d.h(cVar, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
            return ((b) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(io.ktor.client.content.d.class);
        kotlin.reflect.s sVarA2 = null;
        try {
            sVarA = kotlin.jvm.internal.j1.A(io.ktor.client.content.d.class);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f294763a = new io.ktor.util.a<>("UploadProgressListenerAttributeKey", new ri.b(dVarD, sVarA));
        kotlin.reflect.d dVarD2 = kotlin.jvm.internal.j1.d(io.ktor.client.content.d.class);
        try {
            sVarA2 = kotlin.jvm.internal.j1.A(io.ktor.client.content.d.class);
        } catch (Throwable unused2) {
        }
        f294764b = new io.ktor.util.a<>("DownloadProgressListenerAttributeKey", new ri.b(dVarD2, sVarA2));
        f294765c = io.ktor.client.plugins.api.i.c("BodyProgress", new Function1() { // from class: io.ktor.client.plugins.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.b((io.ktor.client.plugins.api.d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(io.ktor.client.plugins.b.f294437a, new a(null));
        createClientPlugin.g(io.ktor.client.plugins.a.f294378a, new b(null));
        return Unit.f312394a;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<Unit> e() {
        return f294765c;
    }

    public static final void f(@NotNull fi.y yVar, @Nullable io.ktor.client.content.d dVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (dVar == null) {
            yVar.c().c(f294764b);
        } else {
            yVar.c().a(f294764b, dVar);
        }
    }

    public static final void g(@NotNull fi.y yVar, @Nullable io.ktor.client.content.d dVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (dVar == null) {
            yVar.c().c(f294763a);
        } else {
            yVar.c().a(f294763a, dVar);
        }
    }

    @NotNull
    public static final io.ktor.client.statement.c h(@NotNull io.ktor.client.statement.c cVar, @NotNull io.ktor.client.content.d listener) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return io.ktor.client.plugins.observer.d.b(cVar.h(), io.ktor.client.utils.a.a(cVar.c(), cVar.getCoroutineContext(), io.ktor.http.i1.d(cVar), listener)).k();
    }
}
