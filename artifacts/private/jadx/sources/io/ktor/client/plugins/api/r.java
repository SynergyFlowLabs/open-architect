package io.ktor.client.plugins.api;

import fi.g0;
import fi.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements io.ktor.client.plugins.api.a<pj.n<? super y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f294420a = new r();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.api.SendingRequest$install$1", f = "CommonHooks.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<y, io.ktor.http.content.w, kotlin.coroutines.d<? super Unit>, Object> f294423c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294423c = nVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.r$a for r6v4 'this'  java.lang.Object
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
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f294421a
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto Lf
                kotlin.ResultKt.m(r7)
                goto L3c
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 7
                r6.<init>(r7)
                throw r6
            L18:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f294422b
                r5 = 0
                io.ktor.util.pipeline.e r7 = (io.ktor.util.pipeline.e) r7
                pj.n<fi.y, io.ktor.http.content.w, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r6.f294423c
                r5 = 4
                java.lang.Object r3 = r7.f()
                java.lang.Object r7 = r7.i()
                java.lang.String r4 = "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r4)
                io.ktor.http.content.w r7 = (io.ktor.http.content.w) r7
                r6.f294421a = r2
                r5 = 7
                java.lang.Object r6 = r1.invoke(r3, r7, r6)
                if (r6 != r0) goto L3c
                return r0
            L3c:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294423c, dVar);
            aVar.f294422b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private r() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.E().q(g0.f275238h.e(), new a(handler, null));
    }
}
