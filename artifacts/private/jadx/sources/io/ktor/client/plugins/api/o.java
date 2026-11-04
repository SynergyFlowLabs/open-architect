package io.ktor.client.plugins.api;

import fi.e0;
import fi.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements io.ktor.client.plugins.api.a<pj.o<? super m, ? super y, ? super Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f294404a = new o();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.api.RequestHook$install$1", f = "KtorCallContexts.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.o<m, y, Object, kotlin.coroutines.d<? super Unit>, Object> f294407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.o<? super m, ? super y, Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294407c = oVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.o$a for r6v4 'this'  java.lang.Object
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
                r5 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 6
                int r1 = r6.f294405a
                r2 = 1
                if (r1 == 0) goto L1d
                r5 = 3
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r7)
                r5 = 2
                goto L3f
            L13:
                r5 = 4
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 1
                r6.<init>(r7)
                throw r6
            L1d:
                kotlin.ResultKt.m(r7)
                r5 = 6
                java.lang.Object r7 = r6.f294406b
                io.ktor.util.pipeline.e r7 = (io.ktor.util.pipeline.e) r7
                pj.o<io.ktor.client.plugins.api.m, fi.y, java.lang.Object, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f294407c
                io.ktor.client.plugins.api.m r3 = new io.ktor.client.plugins.api.m
                r3.<init>()
                java.lang.Object r4 = r7.f()
                r5 = 5
                java.lang.Object r7 = r7.i()
                r5 = 2
                r6.f294405a = r2
                java.lang.Object r6 = r1.invoke(r3, r4, r7, r6)
                if (r6 != r0) goto L3f
                return r0
            L3f:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294407c, dVar);
            aVar.f294406b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private o() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.o<? super m, ? super y, Object, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.x().q(e0.f275224h.d(), new a(handler, null));
    }
}
