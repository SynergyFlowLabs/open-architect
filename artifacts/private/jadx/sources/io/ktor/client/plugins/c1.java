package io.ktor.client.plugins;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nHttpSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,154:1\n21#2:155\n65#3,18:156\n*S KotlinDebug\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend\n*L\n73#1:155\n73#1:156,18\n*E\n"})
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final d f294447c = new d(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final io.ktor.util.a<c1> f294448d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f294449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<pj.n<r1, fi.y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object>> f294450b;

    @io.ktor.utils.io.r0
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f294451a = 20;

        public final int a() {
            return this.f294451a;
        }

        public final void b(int i10) {
            this.f294451a = i10;
        }
    }

    private static final class b implements r1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f294452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final io.ktor.client.c f294453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f294454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private io.ktor.client.call.b f294455d;

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", i = {}, l = {132}, m = "execute", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f294456a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f294458c;

            a(kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f294456a = obj;
                this.f294458c |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(int i10, @NotNull io.ktor.client.c client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.f294452a = i10;
            this.f294453b = client;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // io.ktor.client.plugins.r1
        @Nullable
        public Object a(@NotNull fi.y yVar, @NotNull kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f294458c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f294458c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objE = aVar.f294456a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f294458c;
            if (i11 == 0) {
                ResultKt.m(objE);
                io.ktor.client.call.b bVar = this.f294455d;
                if (bVar != null) {
                    kotlinx.coroutines.t0.f(bVar, null, 1, null);
                }
                int i12 = this.f294454c;
                if (i12 >= this.f294452a) {
                    throw new q1("Max send count " + this.f294452a + " exceeded. Consider increasing the property maxSendCount if more is required.");
                }
                this.f294454c = i12 + 1;
                fi.g0 g0VarE = this.f294453b.E();
                Object objD = yVar.d();
                aVar.f294458c = 1;
                objE = g0VarE.e(yVar, objD, aVar);
                if (objE == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objE);
            }
            io.ktor.client.call.b bVar2 = objE instanceof io.ktor.client.call.b ? (io.ktor.client.call.b) objE : null;
            if (bVar2 != null) {
                this.f294455d = bVar2;
                return bVar2;
            }
            throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + objE).toString());
        }
    }

    private static final class c implements r1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final pj.n<r1, fi.y, kotlin.coroutines.d<? super io.ktor.client.call.b>, Object> f294459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final r1 f294460b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull pj.n<? super r1, ? super fi.y, ? super kotlin.coroutines.d<? super io.ktor.client.call.b>, ? extends Object> interceptor, @NotNull r1 nextSender) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Intrinsics.checkNotNullParameter(nextSender, "nextSender");
            this.f294459a = interceptor;
            this.f294460b = nextSender;
        }

        @Override // io.ktor.client.plugins.r1
        @Nullable
        public Object a(@NotNull fi.y yVar, @NotNull kotlin.coroutines.d<? super io.ktor.client.call.b> dVar) {
            return this.f294459a.invoke(this.f294460b, yVar, dVar);
        }
    }

    public static final class d implements z<a, c1> {

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1, 99}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nHttpSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend$Plugin$install$1\n+ 2 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,154:1\n16#2,4:155\n21#2,10:177\n65#3,18:159\n*S KotlinDebug\n*F\n+ 1 HttpSend.kt\nio/ktor/client/plugins/HttpSend$Plugin$install$1\n*L\n91#1:155,4\n91#1:177,10\n91#1:159,18\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294462b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f294463c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c1 f294464d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ io.ktor.client.c f294465e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c1 c1Var, io.ktor.client.c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f294464d = c1Var;
                this.f294465e = cVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
            
                if (r1.k((io.ktor.client.call.b) r10, r9) == r0) goto L36;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 287
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.c1.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(this.f294464d, this.f294465e, dVar);
                aVar.f294462b = eVar;
                aVar.f294463c = obj;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.ktor.client.plugins.z
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull c1 plugin, @NotNull io.ktor.client.c scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.x().q(fi.e0.f275224h.c(), new a(plugin, scope, null));
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c1 a(@NotNull Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new c1(aVar.a(), null);
        }

        @Override // io.ktor.client.plugins.z
        @NotNull
        public io.ktor.util.a<c1> getKey() {
            return c1.f294448d;
        }

        private d() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.s sVarA = null;
        kotlin.reflect.d dVarD = kotlin.jvm.internal.j1.d(c1.class);
        try {
            sVarA = kotlin.jvm.internal.j1.A(c1.class);
        } catch (Throwable unused) {
        }
        f294448d = new io.ktor.util.a<>("HttpSend", new ri.b(dVarD, sVarA));
    }

    public /* synthetic */ c1(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final void d(@NotNull pj.n<? super r1, ? super fi.y, ? super kotlin.coroutines.d<? super io.ktor.client.call.b>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f294450b.add(block);
    }

    private c1(int i10) {
        this.f294449a = i10;
        this.f294450b = new ArrayList();
    }

    /* synthetic */ c1(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 20 : i10);
    }
}
