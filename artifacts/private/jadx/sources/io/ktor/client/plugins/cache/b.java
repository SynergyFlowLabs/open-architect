package io.ktor.client.plugins.cache;

import fi.f0;
import fi.g0;
import fi.w;
import fi.y;
import io.ktor.client.plugins.cache.storage.l;
import io.ktor.client.plugins.cache.storage.m;
import io.ktor.client.plugins.z;
import io.ktor.http.Url;
import io.ktor.http.d1;
import io.ktor.http.i1;
import io.ktor.http.k1;
import io.ktor.http.l1;
import io.ktor.http.v0;
import io.ktor.http.w0;
import io.ktor.http.w2;
import io.ktor.util.date.GMTDate;
import io.ktor.utils.io.r0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.reflect.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Attributes.kt\nio/ktor/util/AttributesKt\n+ 6 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,408:1\n1#2:409\n1068#3:410\n295#3:411\n296#3:415\n168#4,3:412\n168#4,3:416\n21#5:419\n65#6,18:420\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n*L\n351#1:410\n351#1:411\n351#1:415\n352#1:412,3\n364#1:416,3\n142#1:419\n142#1:420,18\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f294472g = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<b> f294473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final io.ktor.events.a<io.ktor.client.statement.c> f294474i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f294475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f294476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.plugins.cache.storage.b f294477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.ktor.client.plugins.cache.storage.b f294478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f294479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f294480f;

    @SourceDebugExtension({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,408:1\n30#2:409\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion\n*L\n269#1:409\n*E\n"})
    public static final class a implements z<C2060b, b> {

        /* JADX INFO: renamed from: io.ktor.client.plugins.cache.b$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", f = "HttpCache.kt", i = {1}, l = {174, 178, 184, 193, 198}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion$install$1\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,408:1\n37#2,2:409\n37#2,2:411\n37#2,2:413\n37#2,2:415\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion$install$1\n*L\n180#1:409,2\n183#1:411,2\n203#1:413,2\n207#1:415,2\n*E\n"})
        static final class C2058a extends o implements n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294481a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294482b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f294483c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f294484d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ io.ktor.client.c f294485e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2058a(b bVar, io.ktor.client.c cVar, kotlin.coroutines.d<? super C2058a> dVar) {
                super(3, dVar);
                this.f294484d = bVar;
                this.f294485e = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:46:0x00de  */
            /* JADX WARN: Code duplicated, block: B:49:0x0125  */
            /* JADX WARN: Code duplicated, block: B:51:0x012f  */
            /* JADX WARN: Code duplicated, block: B:57:0x015f  */
            /* JADX WARN: Code duplicated, block: B:59:0x0175  */
            /* JADX WARN: Code duplicated, block: B:64:0x01aa  */
            /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
            /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
            /* JADX WARN: Code duplicated, block: B:73:0x01df  */
            /* JADX WARN: Code duplicated, block: B:75:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:79:0x0228  */
            /* JADX WARN: Code duplicated, block: B:81:0x0232  */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
            
                if (io.ktor.client.plugins.cache.h.h(r1, r14.f294484d, (io.ktor.http.content.w) r15, r3, r14) == r0) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0159, code lost:
            
                if (r15.h(r9, r1, r14) == r0) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x01a4, code lost:
            
                if (r1.g(r9, r2, r15, r14) == r0) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x01c5, code lost:
            
                if (r8.i(r9, r10, r11, r12, r14) == r0) goto L68;
             */
            /* JADX WARN: Instruction removed from duplicated block: B:46:0x00de, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:51:0x012f, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:75:0x01e9, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:81:0x0232, please report this as an issue */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 617
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.b.a.C2058a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                C2058a c2058a = new C2058a(this.f294484d, this.f294485e, dVar);
                c2058a.f294482b = eVar;
                c2058a.f294483c = obj;
                return c2058a.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: io.ktor.client.plugins.cache.b$a$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", i = {1, 1, 3, 3}, l = {219, 225, 232, 240, com.planner5d.library.engine.input.f.b.O1}, m = "invokeSuspend", n = {"$this$intercept", io.sentry.protocol.n.f306405g, "$this$intercept", io.sentry.protocol.n.f306405g}, s = {"L$0", "L$1", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nHttpCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion$install$2\n+ 2 Logger.kt\nio/ktor/util/logging/LoggerKt\n*L\n1#1,408:1\n37#2,2:409\n37#2,2:411\n*S KotlinDebug\n*F\n+ 1 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache$Companion$install$2\n*L\n224#1:409,2\n238#1:411,2\n*E\n"})
        static final class C2059b extends o implements n<io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit>, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294486a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294487b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f294488c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f294489d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ io.ktor.client.c f294490e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2059b(b bVar, io.ktor.client.c cVar, kotlin.coroutines.d<? super C2059b> dVar) {
                super(3, dVar);
                this.f294489d = bVar;
                this.f294490e = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:40:0x00f5  */
            /* JADX WARN: Code duplicated, block: B:42:0x0114  */
            /* JADX WARN: Code duplicated, block: B:45:0x011a  */
            /* JADX WARN: Code duplicated, block: B:48:0x012e  */
            /* JADX WARN: Code duplicated, block: B:50:0x0139  */
            /* JADX WARN: Code duplicated, block: B:53:0x017b  */
            /* JADX WARN: Code duplicated, block: B:54:0x017d  */
            /* JADX WARN: Code duplicated, block: B:57:0x0186  */
            /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
            
                if (io.ktor.client.plugins.cache.h.g(r13, r1, r2, r3, r12) == r0) goto L59;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x01a2, code lost:
            
                if (r3.k(r13, r12) == r0) goto L59;
             */
            /* JADX WARN: Instruction removed from duplicated block: B:50:0x0139, please report this as an issue */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 444
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.b.a.C2059b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> eVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                C2059b c2059b = new C2059b(this.f294489d, this.f294490e, dVar);
                c2059b.f294487b = eVar;
                c2059b.f294488c = cVar;
                return c2059b.invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object i(io.ktor.util.pipeline.e<Object, y> eVar, io.ktor.client.plugins.cache.storage.c cVar, io.ktor.client.c cVar2, CoroutineContext coroutineContext, kotlin.coroutines.d<? super Unit> dVar) {
            fi.z zVarB = eVar.f().b();
            l1 l1VarG = cVar.g();
            GMTDate gMTDateE = cVar.e();
            v0.a aVar = v0.f296123a;
            int i10 = 2 >> 0;
            w0 w0Var = new w0(0, 1, null);
            w0Var.j(cVar.d());
            w0Var.l(d1.f295782a.P0(), "110");
            Unit unit = Unit.f312394a;
            io.ktor.client.call.b bVar = new io.ktor.client.call.b(cVar2, zVarB, new f0(l1VarG, gMTDateE, w0Var.build(), cVar.j(), io.ktor.utils.io.c.e(cVar.b(), 0, 0, 6, null), coroutineContext));
            eVar.e();
            cVar2.r().b(d(), bVar.k());
            Object objK = eVar.k(bVar, dVar);
            return objK == kotlin.coroutines.intrinsics.b.l() ? objK : unit;
        }

        @NotNull
        public final io.ktor.events.a<io.ktor.client.statement.c> d() {
            return b.f294474i;
        }

        @Override // io.ktor.client.plugins.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull b plugin, @NotNull io.ktor.client.c scope) throws io.ktor.util.pipeline.b {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            io.ktor.util.pipeline.j jVar = new io.ktor.util.pipeline.j("Cache");
            scope.E().n(g0.f275238h.e(), jVar);
            scope.E().q(jVar, new C2058a(plugin, scope, null));
            io.ktor.util.pipeline.j jVar2 = new io.ktor.util.pipeline.j("Cache");
            scope.t().n(io.ktor.client.statement.b.f295326h.c(), jVar2);
            scope.t().q(jVar2, new C2059b(plugin, scope, null));
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b a(@NotNull Function1<? super C2060b, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            C2060b c2060b = new C2060b();
            block.invoke(c2060b);
            return new b(c2060b.d(), c2060b.a(), c2060b.f(), c2060b.c(), c2060b.g(), c2060b.h(), null);
        }

        @Nullable
        public final Object g(@NotNull io.ktor.util.pipeline.e<Object, y> eVar, @NotNull io.ktor.client.c cVar, @NotNull io.ktor.client.call.b bVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            eVar.e();
            cVar.r().b(d(), bVar.k());
            Object objK = eVar.k(bVar, dVar);
            return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        public io.ktor.util.a<b> getKey() {
            return b.f294473h;
        }

        @Nullable
        public final Object h(@NotNull io.ktor.util.pipeline.e<Object, y> eVar, @NotNull io.ktor.client.c cVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            eVar.e();
            fi.z zVarB = eVar.f().b();
            Object objK = eVar.k(new io.ktor.client.call.b(cVar, zVarB, new f0(l1.f295939c.m(), ni.a.c(null, 1, null), v0.f296123a.b(), k1.f295916d.c(), io.ktor.utils.io.c.e(new byte[0], 0, 0, 6, null), zVarB.d())), dVar);
            return objK == kotlin.coroutines.intrinsics.b.l() ? objK : Unit.f312394a;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.b$b, reason: collision with other inner class name */
    @r0
    public static final class C2060b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private io.ktor.client.plugins.cache.storage.b f294491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private io.ktor.client.plugins.cache.storage.b f294492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f294493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f294494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private l f294495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private l f294496f;

        public C2060b() {
            io.ktor.client.plugins.cache.storage.b.a aVar = io.ktor.client.plugins.cache.storage.b.f294541a;
            this.f294491a = aVar.d().invoke();
            this.f294492b = aVar.d().invoke();
            l.a aVar2 = l.f294638a;
            this.f294495e = aVar2.b().invoke();
            this.f294496f = aVar2.b().invoke();
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void b() {
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "This will become internal. Use setter method instead with new storage interface")
        public static /* synthetic */ void e() {
        }

        @NotNull
        public final l a() {
            return this.f294496f;
        }

        @NotNull
        public final io.ktor.client.plugins.cache.storage.b c() {
            return this.f294492b;
        }

        @NotNull
        public final l d() {
            return this.f294495e;
        }

        @NotNull
        public final io.ktor.client.plugins.cache.storage.b f() {
            return this.f294491a;
        }

        public final boolean g() {
            return this.f294493c;
        }

        public final boolean h() {
            return this.f294494d;
        }

        public final void i(@NotNull io.ktor.client.plugins.cache.storage.b storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f294492b = storage;
        }

        public final void j(@NotNull io.ktor.client.plugins.cache.storage.b storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f294491a = storage;
        }

        public final void k(@NotNull l value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f294493c = true;
            this.f294496f = value;
        }

        public final void l(@NotNull io.ktor.client.plugins.cache.storage.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f294492b = bVar;
        }

        public final void m(@NotNull l value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f294493c = true;
            this.f294495e = value;
        }

        public final void n(@NotNull io.ktor.client.plugins.cache.storage.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            this.f294491a = bVar;
        }

        public final void o(boolean z10) {
            this.f294494d = z10;
        }

        public final void p(boolean z10) {
            this.f294493c = z10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {333, 335}, m = "findAndRefresh", n = {"request", io.sentry.protocol.n.f306405g, "storage", "varyKeysFrom304", "request", io.sentry.protocol.n.f306405g, "cache"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f294499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f294500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f294501e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f294503g;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294501e = obj;
            this.f294503g |= Integer.MIN_VALUE;
            return b.this.i(null, null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpCache.kt\nio/ktor/client/plugins/cache/HttpCache\n*L\n1#1,121:1\n351#2:122\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((io.ktor.client.plugins.cache.storage.c) t11).f(), ((io.ktor.client.plugins.cache.storage.c) t10).f());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {1}, l = {346, 351}, m = "findResponse", n = {"requestHeaders"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f294505b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f294507d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294505b = obj;
            this.f294507d |= Integer.MIN_VALUE;
            return b.this.k(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.cache.HttpCache", f = "HttpCache.kt", i = {0, 0, 1}, l = {361, 361}, m = "findResponse", n = {"url", "lookup", "lookup"}, s = {"L$0", "L$1", "L$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f294509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294510c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f294512e;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f294510c = obj;
            this.f294512e |= Integer.MIN_VALUE;
            return b.this.j(null, null, this);
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.g0 implements Function1<String, String> {
        g(Object obj) {
            super(1, obj, w0.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((w0) this.receiver).get(p10);
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.g0 implements Function1<String, List<? extends String>> {
        h(Object obj) {
            super(1, obj, w0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((w0) this.receiver).b(p10);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.g0 implements Function1<String, String> {
        i(Object obj) {
            super(1, obj, v0.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((v0) this.receiver).get(p10);
        }
    }

    /* synthetic */ class j extends kotlin.jvm.internal.g0 implements Function1<String, List<? extends String>> {
        j(Object obj) {
            super(1, obj, v0.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(String p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return ((v0) this.receiver).b(p10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        s sVarA = null;
        kotlin.reflect.d dVarD = j1.d(b.class);
        try {
            sVarA = j1.A(b.class);
        } catch (Throwable unused) {
        }
        f294473h = new io.ktor.util.a<>("HttpCache", new ri.b(dVarD, sVarA));
        f294474i = new io.ktor.events.a<>();
    }

    public /* synthetic */ b(l lVar, l lVar2, io.ktor.client.plugins.cache.storage.b bVar, io.ktor.client.plugins.cache.storage.b bVar2, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, bVar, bVar2, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> dVar) {
        w wVarJ = cVar.h().j();
        List<io.ktor.http.r0> listA = i1.a(cVar);
        List<io.ktor.http.r0> listA2 = i1.a(wVarJ);
        io.ktor.client.plugins.cache.a aVar = io.ktor.client.plugins.cache.a.f294466a;
        boolean zContains = listA.contains(aVar.e());
        if (zContains && this.f294480f) {
            return null;
        }
        io.ktor.client.plugins.cache.storage.b bVar = zContains ? this.f294478d : this.f294477c;
        if (!listA.contains(aVar.c()) && !listA2.contains(aVar.c())) {
            return m.b(bVar, cVar, io.ktor.client.plugins.cache.e.g(cVar), this.f294480f, dVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final Object i(w wVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
        c cVar2;
        b bVar;
        io.ktor.client.statement.c cVar3;
        io.ktor.client.plugins.cache.storage.b bVar2;
        Map<String, String> mapI;
        w wVar2;
        io.ktor.client.statement.c cVar4;
        io.ktor.client.plugins.cache.storage.c cVar5;
        w wVar3;
        if (dVar instanceof c) {
            cVar2 = (c) dVar;
            int i10 = cVar2.f294503g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f294503g = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar);
            }
        } else {
            cVar2 = new c(dVar);
        }
        c cVar6 = cVar2;
        Object objK = cVar6.f294501e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar6.f294503g;
        int i12 = 3 | 0;
        if (i11 != 0) {
            if (i11 == 1) {
                mapI = (Map) cVar6.f294500d;
                bVar2 = (io.ktor.client.plugins.cache.storage.b) cVar6.f294499c;
                io.ktor.client.statement.c cVar7 = (io.ktor.client.statement.c) cVar6.f294498b;
                wVar2 = (w) cVar6.f294497a;
                ResultKt.m(objK);
                bVar = this;
                cVar3 = cVar7;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar5 = (io.ktor.client.plugins.cache.storage.c) cVar6.f294499c;
                cVar4 = (io.ktor.client.statement.c) cVar6.f294498b;
                wVar3 = (w) cVar6.f294497a;
                ResultKt.m(objK);
            }
            return m.a(cVar5, wVar3.h().i(), wVar3, cVar4.getCoroutineContext());
        }
        ResultKt.m(objK);
        Url url = cVar.h().j().getUrl();
        boolean zContains = i1.a(cVar).contains(io.ktor.client.plugins.cache.a.f294466a.e());
        if (zContains && this.f294480f) {
            return null;
        }
        io.ktor.client.plugins.cache.storage.b bVar3 = zContains ? this.f294478d : this.f294477c;
        Map<String, String> mapG = io.ktor.client.plugins.cache.e.g(cVar);
        cVar6.f294497a = wVar;
        cVar6.f294498b = cVar;
        cVar6.f294499c = bVar3;
        cVar6.f294500d = mapG;
        cVar6.f294503g = 1;
        bVar = this;
        io.ktor.client.plugins.cache.storage.b bVar4 = bVar3;
        objK = bVar.k(bVar4, mapG, url, wVar, cVar6);
        if (objK != objL) {
            cVar3 = cVar;
            bVar2 = bVar4;
            mapI = mapG;
            wVar2 = wVar;
        }
        return objL;
        io.ktor.client.plugins.cache.storage.c cVar8 = (io.ktor.client.plugins.cache.storage.c) objK;
        if (cVar8 == null) {
            return null;
        }
        if (mapI.isEmpty()) {
            mapI = cVar8.i();
        }
        Url url2 = wVar2.getUrl();
        io.ktor.client.plugins.cache.storage.c cVarA = cVar8.a(mapI, io.ktor.client.plugins.cache.e.d(cVar3, bVar.f294480f, null, 2, null));
        cVar6.f294497a = wVar2;
        cVar6.f294498b = cVar3;
        cVar6.f294499c = cVar8;
        cVar6.f294500d = null;
        cVar6.f294503g = 2;
        if (bVar2.a(url2, cVarA, cVar6) != objL) {
            cVar4 = cVar3;
            cVar5 = cVar8;
            wVar3 = wVar2;
            return m.a(cVar5, wVar3.h().i(), wVar3, cVar4.getCoroutineContext());
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j(y yVar, io.ktor.http.content.w wVar, kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> dVar) {
        f fVar;
        Function1<String, String> function1E;
        Url url;
        Set set;
        Map<String, String> mapI;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f294512e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f294512e = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f294510c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f294512e;
        if (i11 == 0) {
            ResultKt.m(obj);
            Url urlE = w2.e(yVar.i());
            function1E = io.ktor.client.plugins.cache.g.e(wVar, new g(yVar.O()), new h(yVar.O()));
            io.ktor.client.plugins.cache.storage.b bVar = this.f294478d;
            fVar.f294508a = urlE;
            fVar.f294509b = function1E;
            fVar.f294512e = 1;
            Object objC = bVar.c(urlE, fVar);
            if (objC != objL) {
                obj = objC;
                url = urlE;
            }
            return objL;
        }
        if (i11 == 1) {
            function1E = (Function1) fVar.f294509b;
            url = (Url) fVar.f294508a;
            ResultKt.m(obj);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) fVar.f294509b;
            function1E = (Function1) fVar.f294508a;
            ResultKt.m(obj);
        }
        for (io.ktor.client.plugins.cache.storage.c cVar : SetsKt.plus(set, (Iterable) obj)) {
            mapI = cVar.i();
            if (!mapI.isEmpty() || mapI.isEmpty()) {
                return cVar;
            }
            for (Map.Entry<String, String> entry : mapI.entrySet()) {
                String key = entry.getKey();
                if (!Intrinsics.areEqual(function1E.invoke(key), entry.getValue())) {
                }
            }
            return cVar;
        }
        return null;
        Set set2 = (Set) obj;
        io.ktor.client.plugins.cache.storage.b bVar2 = this.f294477c;
        fVar.f294508a = function1E;
        fVar.f294509b = set2;
        fVar.f294512e = 2;
        Object objC2 = bVar2.c(url, fVar);
        if (objC2 != objL) {
            obj = objC2;
            set = set2;
            while (r8.hasNext()) {
                mapI = cVar.i();
                if (mapI.isEmpty()) {
                    return cVar;
                }
                return cVar;
            }
            return null;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object k(io.ktor.client.plugins.cache.storage.b bVar, Map<String, String> map, Url url, w wVar, kotlin.coroutines.d<? super io.ktor.client.plugins.cache.storage.c> dVar) {
        e eVar;
        Function1<String, String> function1;
        Object next;
        Map.Entry<String, String> next2;
        String key;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f294507d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f294507d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f294505b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f294507d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (map.isEmpty()) {
                Function1<String, String> function1E = io.ktor.client.plugins.cache.g.e(wVar.getContent(), new i(wVar.O()), new j(wVar.O()));
                eVar.f294504a = function1E;
                eVar.f294507d = 2;
                Object objC = bVar.c(url, eVar);
                if (objC != objL) {
                    function1 = function1E;
                    obj = objC;
                }
            } else {
                eVar.f294507d = 1;
                Object objB = bVar.b(url, map, eVar);
                if (objB != objL) {
                    return objB;
                }
            }
            return objL;
        }
        if (i11 == 1) {
            ResultKt.m(obj);
            return obj;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1 = (Function1) eVar.f294504a;
        ResultKt.m(obj);
        Iterator it = CollectionsKt.sortedWith((Iterable) obj, new d()).iterator();
        while (it.hasNext()) {
            next = it.next();
            Map<String, String> mapI = ((io.ktor.client.plugins.cache.storage.c) next).i();
            if (!mapI.isEmpty()) {
                Iterator<Map.Entry<String, String>> it2 = mapI.entrySet().iterator();
                do {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        key = next2.getKey();
                    }
                } while (Intrinsics.areEqual(function1.invoke(key), next2.getValue()));
            }
            return (io.ktor.client.plugins.cache.storage.c) next;
        }
        next = null;
        return (io.ktor.client.plugins.cache.storage.c) next;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "This will become internal")
    public static /* synthetic */ void m() {
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "This will become internal")
    public static /* synthetic */ void o() {
    }

    @NotNull
    public final l l() {
        return this.f294476b;
    }

    @NotNull
    public final l n() {
        return this.f294475a;
    }

    public final boolean p() {
        return this.f294480f;
    }

    private b(l lVar, l lVar2, io.ktor.client.plugins.cache.storage.b bVar, io.ktor.client.plugins.cache.storage.b bVar2, boolean z10, boolean z11) {
        this.f294475a = lVar;
        this.f294476b = lVar2;
        this.f294477c = bVar;
        this.f294478d = bVar2;
        this.f294479e = z10;
        this.f294480f = z11;
    }
}
