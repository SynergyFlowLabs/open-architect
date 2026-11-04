package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t1 implements io.ktor.client.plugins.api.a<pj.n<? super fi.y, ? super Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t1 f295127a = new t1();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.SetupRequestContext$install$1", f = "HttpRequestLifecycle.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f295129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<fi.y, Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, kotlin.coroutines.d<? super Unit>, Object> f295130c;

        /* JADX INFO: renamed from: io.ktor.client.plugins.t1$a$a, reason: collision with other inner class name */
        /* synthetic */ class C2072a extends kotlin.jvm.internal.a implements Function1<kotlin.coroutines.d<? super Unit>, Object>, kotlin.coroutines.jvm.internal.n {
            C2072a(Object obj) {
                super(1, obj, io.ktor.util.pipeline.e.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
                return a.n((io.ktor.util.pipeline.e) this.receiver, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super fi.y, ? super Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f295130c = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object n(io.ktor.util.pipeline.e eVar, kotlin.coroutines.d dVar) {
            Object objJ = eVar.j(dVar);
            return objJ == kotlin.coroutines.intrinsics.b.l() ? objJ : Unit.f312394a;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.t1$a for r6v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r5 = 5
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 6
                int r1 = r6.f295128a
                r5 = 7
                r2 = 1
                r5 = 5
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L14
                r5 = 6
                kotlin.ResultKt.m(r7)
                goto L3c
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 7
                r6.<init>(r7)
                throw r6
            L1d:
                kotlin.ResultKt.m(r7)
                r5 = 2
                java.lang.Object r7 = r6.f295129b
                io.ktor.util.pipeline.e r7 = (io.ktor.util.pipeline.e) r7
                pj.n<fi.y, kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f295130c
                r5 = 5
                java.lang.Object r3 = r7.f()
                r5 = 4
                io.ktor.client.plugins.t1$a$a r4 = new io.ktor.client.plugins.t1$a$a
                r4.<init>(r7)
                r6.f295128a = r2
                r5 = 0
                java.lang.Object r6 = r1.invoke(r3, r4, r6)
                if (r6 != r0) goto L3c
                return r0
            L3c:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.t1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f295130c, dVar);
            aVar.f295129b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private t1() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super fi.y, ? super Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.x().q(fi.e0.f275224h.a(), new a(handler, null));
    }
}
