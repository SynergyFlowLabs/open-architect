package io.ktor.client.plugins.observer;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes5.dex */
final class a implements io.ktor.client.plugins.api.a<n<? super C2067a, ? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f294921a = new a();

    /* JADX INFO: renamed from: io.ktor.client.plugins.observer.a$a, reason: collision with other inner class name */
    public static final class C2067a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> f294922a;

        public C2067a(@NotNull io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f294922a = context;
        }

        @Nullable
        public final Object a(@NotNull io.ktor.client.statement.c cVar, @NotNull kotlin.coroutines.d<? super io.ktor.client.statement.c> dVar) {
            return this.f294922a.k(cVar, dVar);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.observer.AfterReceiveHook$install$1", f = "ResponseObserver.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160697i1}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends o implements n<io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit>, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n<C2067a, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> f294925c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(n<? super C2067a, ? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f294925c = nVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.observer.a$b for r5v4 'this'  java.lang.Object
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
                r4 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f294923a
                r2 = 4
                r2 = 1
                r4 = 3
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L12
                kotlin.ResultKt.m(r6)
                goto L3b
            L12:
                r4 = 5
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r4 = 5
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                r4 = 2
                throw r5
            L1d:
                kotlin.ResultKt.m(r6)
                java.lang.Object r6 = r5.f294924b
                r4 = 6
                io.ktor.util.pipeline.e r6 = (io.ktor.util.pipeline.e) r6
                r4 = 2
                pj.n<io.ktor.client.plugins.observer.a$a, io.ktor.client.statement.c, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r5.f294925c
                io.ktor.client.plugins.observer.a$a r3 = new io.ktor.client.plugins.observer.a$a
                r3.<init>(r6)
                java.lang.Object r6 = r6.i()
                r5.f294923a = r2
                java.lang.Object r5 = r1.invoke(r3, r6, r5)
                r4 = 5
                if (r5 != r0) goto L3b
                return r0
            L3b:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.observer.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> eVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(this.f294925c, dVar);
            bVar.f294924b = eVar;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    private a() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull n<? super C2067a, ? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.t().q(io.ktor.client.statement.b.f295326h.a(), new b(handler, null));
    }
}
