package io.ktor.client.plugins.api;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements io.ktor.client.plugins.api.a<pj.n<? super n, ? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f294408a = new p();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.api.ResponseHook$install$1", f = "KtorCallContexts.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit>, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<n, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> f294411c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super n, ? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294411c = nVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.p$a for r5v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 7
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 3
                int r1 = r5.f294409a
                r4 = 1
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L13
                r4 = 0
                kotlin.ResultKt.m(r6)
                goto L3c
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 3
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1c:
                kotlin.ResultKt.m(r6)
                r4 = 6
                java.lang.Object r6 = r5.f294410b
                io.ktor.util.pipeline.e r6 = (io.ktor.util.pipeline.e) r6
                pj.n<io.ktor.client.plugins.api.n, io.ktor.client.statement.c, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r5.f294411c
                r4 = 6
                io.ktor.client.plugins.api.n r3 = new io.ktor.client.plugins.api.n
                r4 = 2
                r3.<init>()
                java.lang.Object r6 = r6.i()
                r4 = 7
                r5.f294409a = r2
                java.lang.Object r5 = r1.invoke(r3, r6, r5)
                if (r5 != r0) goto L3c
                r4 = 6
                return r0
            L3c:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                r4 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> eVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294411c, dVar);
            aVar.f294410b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private p() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super n, ? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.t().q(io.ktor.client.statement.b.f295326h.c(), new a(handler, null));
    }
}
