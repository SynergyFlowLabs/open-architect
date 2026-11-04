package io.ktor.client.engine;

import fi.f0;
import fi.g0;
import fi.y;
import fi.z;
import io.ktor.utils.io.o0;
import java.io.Closeable;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends s0, Closeable {

    @SourceDebugExtension({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,239:1\n1#2:240\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: io.ktor.client.engine.b$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", i = {0, 0}, l = {175, 184}, m = "executeWithinCallContext", n = {"$this", "requestData"}, s = {"L$0", "L$1"})
        static final class C2055a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f294318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f294319b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f294320c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f294321d;

            C2055a(kotlin.coroutines.d<? super C2055a> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f294320c = obj;
                this.f294321d |= Integer.MIN_VALUE;
                return a.e(null, null, this);
            }
        }

        /* JADX INFO: renamed from: io.ktor.client.engine.b$a$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
        static final class C2056b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super f0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f294323b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z f294324c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2056b(b bVar, z zVar, kotlin.coroutines.d<? super C2056b> dVar) {
                super(2, dVar);
                this.f294323b = bVar;
                this.f294324c = zVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2056b(this.f294323b, this.f294324c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f294322a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                if (a.f(this.f294323b)) {
                    throw new io.ktor.client.engine.a(null, 1, null);
                }
                b bVar = this.f294323b;
                z zVar = this.f294324c;
                this.f294322a = 1;
                Object objWb = bVar.wb(zVar, this);
                return objWb == objL ? objL : objWb;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super f0> dVar) {
                return ((C2056b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", i = {0, 0}, l = {androidx.media2.widget.f.i.f59793p0, 166}, m = "invokeSuspend", n = {"$this$intercept", "requestData"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$install$1\n+ 2 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,239:1\n16#2,4:240\n21#2,10:262\n65#3,18:244\n*S KotlinDebug\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngine$install$1\n*L\n142#1:240,4\n142#1:262,10\n142#1:244,18\n*E\n"})
        static final class c extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f294325a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f294326b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f294327c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ io.ktor.client.c f294328d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f294329e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(io.ktor.client.c cVar, b bVar, kotlin.coroutines.d<? super c> dVar) {
                super(3, dVar);
                this.f294328d = cVar;
                this.f294329e = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit n(io.ktor.client.c cVar, io.ktor.client.statement.c cVar2, Throwable th2) {
                if (th2 != null) {
                    cVar.r().b(io.ktor.client.utils.e.c(), cVar2);
                }
                return Unit.f312394a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
            
                if (r3.k(r5, r10) == r0) goto L32;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 277
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.b.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                c cVar = new c(this.f294328d, this.f294329e, dVar);
                cVar.f294326b = eVar;
                cVar.f294327c = obj;
                return cVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(b bVar, z zVar) {
            for (h<?> hVar : zVar.g()) {
                if (!bVar.l6().contains(hVar)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + hVar).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        public static Object e(b bVar, z zVar, kotlin.coroutines.d<? super f0> dVar) {
            C2055a c2055a;
            if (dVar instanceof C2055a) {
                c2055a = (C2055a) dVar;
                int i10 = c2055a.f294321d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c2055a.f294321d = i10 - Integer.MIN_VALUE;
                } else {
                    c2055a = new C2055a(dVar);
                }
            } else {
                c2055a = new C2055a(dVar);
            }
            Object objC = c2055a.f294320c;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c2055a.f294321d;
            if (i11 == 0) {
                ResultKt.m(objC);
                p2 p2VarD = zVar.d();
                c2055a.f294318a = bVar;
                c2055a.f294319b = zVar;
                c2055a.f294321d = 1;
                objC = n.c(bVar, p2VarD, c2055a);
                if (objC != objL) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objC);
                return objC;
            }
            zVar = (z) c2055a.f294319b;
            bVar = (b) c2055a.f294318a;
            ResultKt.m(objC);
            b bVar2 = bVar;
            CoroutineContext coroutineContext = (CoroutineContext) objC;
            a1 a1VarB = kotlinx.coroutines.k.b(bVar2, coroutineContext.plus(new o(coroutineContext)), null, new C2056b(bVar2, zVar, null), 2, null);
            c2055a.f294318a = null;
            c2055a.f294319b = null;
            c2055a.f294321d = 2;
            Object objQ = a1VarB.q(c2055a);
            return objQ == objL ? objL : objQ;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean f(b bVar) {
            p2 p2Var = (p2) bVar.getCoroutineContext().get(p2.M2);
            return !(p2Var != null ? p2Var.isActive() : false);
        }

        @NotNull
        public static Set<h<?>> g(@NotNull b bVar) {
            return SetsKt.emptySet();
        }

        @o0
        public static void h(@NotNull b bVar, @NotNull io.ktor.client.c client) {
            Intrinsics.checkNotNullParameter(client, "client");
            client.E().q(g0.f275238h.b(), new c(client, bVar, null));
        }
    }

    @NotNull
    n0 We();

    @NotNull
    j getConfig();

    @NotNull
    Set<h<?>> l6();

    @o0
    void u8(@NotNull io.ktor.client.c cVar);

    @o0
    @Nullable
    Object wb(@NotNull z zVar, @NotNull kotlin.coroutines.d<? super f0> dVar);
}
