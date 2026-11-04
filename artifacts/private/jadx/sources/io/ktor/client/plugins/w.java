package io.ktor.client.plugins;

import io.ktor.http.Url;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpCallValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCallValidator.kt\nio/ktor/client/plugins/HttpCallValidatorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,211:1\n1869#2,2:212\n1869#2,2:214\n21#3:216\n65#4,18:217\n*S KotlinDebug\n*F\n+ 1 HttpCallValidator.kt\nio/ktor/client/plugins/HttpCallValidatorKt\n*L\n110#1:212,2\n115#1:214,2\n204#1:216\n204#1:217,18\n*E\n"})
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final org.slf4j.c f295136a = pi.a.a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final io.ktor.client.plugins.api.b<u> f295137b = io.ktor.client.plugins.api.i.b("HttpResponseValidator", a.f295139a, new Function1() { // from class: io.ktor.client.plugins.v
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return w.b((io.ktor.client.plugins.api.d) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<Boolean> f295138c;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function0<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f295139a = new a();

        a() {
            super(0, u.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final u invoke() {
            return new u();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<fi.y, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f295142c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f295142c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(boolean z10) {
            return z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f295142c, dVar);
            bVar.f295141b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f295140a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            io.ktor.util.b bVarC = ((fi.y) this.f295141b).c();
            io.ktor.util.a<Boolean> aVarK = w.k();
            final boolean z10 = this.f295142c;
            bVarC.i(aVarK, new Function0() { // from class: io.ktor.client.plugins.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(w.b.n(z10));
                }
            });
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fi.y yVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", i = {1}, l = {128, 129}, m = "invokeSuspend", n = {androidx.core.app.w.E0}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.client.plugins.api.q.a, fi.y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object>> f295146d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> list, kotlin.coroutines.d<? super c> dVar) {
            super(3, dVar);
            this.f295146d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295143a;
            if (i10 == 0) {
                ResultKt.m(obj);
                io.ktor.client.plugins.api.q.a aVar = (io.ktor.client.plugins.api.q.a) this.f295144b;
                fi.y yVar = (fi.y) this.f295145c;
                this.f295144b = null;
                this.f295143a = 1;
                obj = aVar.c(yVar, this);
                if (obj != objL) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                io.ktor.client.call.b bVar = (io.ktor.client.call.b) this.f295144b;
                ResultKt.m(obj);
                return bVar;
            }
            ResultKt.m(obj);
            io.ktor.client.call.b bVar2 = (io.ktor.client.call.b) obj;
            List<Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object>> list = this.f295146d;
            io.ktor.client.statement.c cVarK = bVar2.k();
            this.f295144b = bVar2;
            this.f295143a = 2;
            return w.d(list, cVarK, this) == objL ? objL : bVar2;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.plugins.api.q.a aVar, fi.y yVar, kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            c cVar = new c(this.f295146d, dVar);
            cVar.f295144b = aVar;
            cVar.f295145c = yVar;
            return cVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3", f = "HttpCallValidator.kt", i = {0}, l = {135}, m = "invokeSuspend", n = {"unwrappedCause"}, s = {"L$0"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements pj.n<fi.w, Throwable, kotlin.coroutines.d<? super Throwable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<t> f295150d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends t> list, kotlin.coroutines.d<? super d> dVar) {
            super(3, dVar);
            this.f295150d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295147a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f295148b;
                ResultKt.m(obj);
                return th2;
            }
            ResultKt.m(obj);
            fi.w wVar = (fi.w) this.f295148b;
            Throwable thA = io.ktor.client.utils.i.a((Throwable) this.f295149c);
            List<t> list = this.f295150d;
            this.f295148b = thA;
            this.f295147a = 1;
            return w.c(list, thA, wVar, this) == objL ? objL : thA;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fi.w wVar, Throwable th2, kotlin.coroutines.d<? super Throwable> dVar) {
            d dVar2 = new d(this.f295150d, dVar);
            dVar2.f295148b = wVar;
            dVar2.f295149c = th2;
            return dVar2.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", f = "HttpCallValidator.kt", i = {0}, l = {androidx.media2.widget.f.i.f59775g0}, m = "invokeSuspend", n = {"unwrappedCause"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements pj.n<fi.w, Throwable, kotlin.coroutines.d<? super Throwable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f295152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<t> f295154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(List<? extends t> list, kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
            this.f295154d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295151a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) this.f295152b;
                ResultKt.m(obj);
                return th2;
            }
            ResultKt.m(obj);
            fi.w wVar = (fi.w) this.f295152b;
            Throwable thA = io.ktor.client.utils.i.a((Throwable) this.f295153c);
            List<t> list = this.f295154d;
            this.f295152b = thA;
            this.f295151a = 1;
            return w.c(list, thA, wVar, this) == objL ? objL : thA;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fi.w wVar, Throwable th2, kotlin.coroutines.d<? super Throwable> dVar) {
            e eVar = new e(this.f295154d, dVar);
            eVar.f295152b = wVar;
            eVar.f295153c = th2;
            return eVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0, 0, 1, 1}, l = {me.relex.circleindicator.a.f332619e, 118}, m = "HttpCallValidator$lambda$2$processException", n = {"cause", "request", "cause", "request"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f295157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f295158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f295159e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295158d = obj;
            this.f295159e |= Integer.MIN_VALUE;
            return w.c(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", i = {0}, l = {110}, m = "HttpCallValidator$lambda$2$validateResponse", n = {io.sentry.protocol.n.f306405g}, s = {"L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f295160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f295161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f295162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f295163d;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f295162c = obj;
            this.f295163d |= Integer.MIN_VALUE;
            return w.d(null, null, this);
        }
    }

    public static final class h implements fi.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.ktor.http.j1 f295164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Url f295165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.ktor.util.b f295166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.ktor.http.v0 f295167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ fi.y f295168e;

        h(fi.y yVar) {
            this.f295168e = yVar;
            this.f295164a = yVar.h();
            this.f295165b = yVar.i().b();
            this.f295166c = yVar.c();
            this.f295167d = yVar.O().build();
        }

        @Override // io.ktor.http.f1
        public io.ktor.http.v0 O() {
            return this.f295167d;
        }

        @Override // fi.w
        public io.ktor.util.b getAttributes() {
            return this.f295166c;
        }

        @Override // fi.w
        public io.ktor.http.content.w getContent() {
            Object objD = this.f295168e.d();
            io.ktor.http.content.w wVar = objD instanceof io.ktor.http.content.w ? (io.ktor.http.content.w) objD : null;
            if (wVar != null) {
                return wVar;
            }
            throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.f295168e.d()).toString());
        }

        @Override // fi.w, kotlinx.coroutines.s0
        public CoroutineContext getCoroutineContext() {
            return fi.w.a.a(this);
        }

        @Override // fi.w
        public io.ktor.http.j1 getMethod() {
            return this.f295164a;
        }

        @Override // fi.w
        public Url getUrl() {
            return this.f295165b;
        }

        @Override // fi.w
        public io.ktor.client.call.b h() {
            throw new IllegalStateException("Call is not initialized");
        }
    }

    static {
        kotlin.reflect.s sVarA;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(Boolean.class);
        try {
            sVarA = kotlin.jvm.internal.j1.A(Boolean.TYPE);
        } catch (Throwable unused) {
            sVarA = null;
        }
        f295138c = new io.ktor.util.a<>("ExpectSuccessAttributeKey", new ri.b(dVarD, sVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(io.ktor.client.plugins.api.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        List listReversed = CollectionsKt.reversed(((u) createClientPlugin.f()).c());
        List listReversed2 = CollectionsKt.reversed(((u) createClientPlugin.f()).b());
        createClientPlugin.g(io.ktor.client.plugins.api.s.f294424a, new b(((u) createClientPlugin.f()).a(), null));
        createClientPlugin.g(io.ktor.client.plugins.api.q.f294412a, new c(listReversed, null));
        createClientPlugin.g(m1.f294907a, new d(listReversed2, null));
        createClientPlugin.g(j1.f294860a, new e(listReversed2, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(java.util.List<? extends io.ktor.client.plugins.t> r8, java.lang.Throwable r9, fi.w r10, kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.w.c(java.util.List, java.lang.Throwable, fi.w, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object d(List<? extends Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> list, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        Iterator it;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f295163d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f295163d = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f295162c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f295163d;
        if (i11 == 0) {
            ResultKt.m(obj);
            f295136a.J("Validating response for request " + cVar.h().j().getUrl());
            it = list.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) gVar.f295161b;
            cVar = (io.ktor.client.statement.c) gVar.f295160a;
            ResultKt.m(obj);
        }
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            gVar.f295160a = cVar;
            gVar.f295161b = it;
            gVar.f295163d = 1;
            if (function2.invoke(cVar, gVar) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fi.w e(fi.y yVar) {
        return new h(yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(@NotNull io.ktor.client.j<?> jVar, @NotNull Function1<? super u, Unit> block) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        jVar.r(f295137b, block);
    }

    public static final boolean j(@NotNull fi.y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Boolean bool = (Boolean) yVar.c().e(f295138c);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @NotNull
    public static final io.ktor.util.a<Boolean> k() {
        return f295138c;
    }

    @NotNull
    public static final io.ktor.client.plugins.api.b<u> l() {
        return f295137b;
    }

    public static final void m(@NotNull fi.y yVar, boolean z10) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        yVar.c().a(f295138c, Boolean.valueOf(z10));
    }
}
