package io.ktor.client.plugins.sse;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
final class a implements io.ktor.client.plugins.api.a<pj.n<? super fi.y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f294975a = new a();

    /* JADX INFO: renamed from: io.ktor.client.plugins.sse.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.sse.AfterRender$install$1", f = "SSE.kt", i = {}, l = {177, 177}, m = "invokeSuspend", n = {}, s = {})
    static final class C2068a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<fi.y, io.ktor.http.content.w, kotlin.coroutines.d<? super io.ktor.http.content.w>, Object> f294979d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2068a(pj.n<? super fi.y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> nVar, kotlin.coroutines.d<? super C2068a> dVar) {
            super(3, dVar);
            this.f294979d = nVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.sse.a$a for r7v5 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 3
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 3
                int r1 = r7.f294976a
                r2 = 2
                r3 = 1
                r6 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L17
                r6 = 3
                kotlin.ResultKt.m(r8)
                r6 = 2
                goto L63
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 0
                java.lang.String r8 = "/tslh//w// neft/ r/voeeomonsoiraue ruke cielo  /cib"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L22:
                java.lang.Object r1 = r7.f294977b
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                kotlin.ResultKt.m(r8)
                goto L54
            L2a:
                kotlin.ResultKt.m(r8)
                r6 = 1
                java.lang.Object r8 = r7.f294977b
                r1 = r8
                r1 = r8
                r6 = 5
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                r6 = 6
                java.lang.Object r8 = r7.f294978c
                r6 = 6
                boolean r4 = r8 instanceof io.ktor.http.content.w
                if (r4 != 0) goto L40
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L40:
                pj.n<fi.y, io.ktor.http.content.w, kotlin.coroutines.d<? super io.ktor.http.content.w>, java.lang.Object> r4 = r7.f294979d
                r6 = 4
                java.lang.Object r5 = r1.f()
                r7.f294977b = r1
                r7.f294976a = r3
                r6 = 5
                java.lang.Object r8 = r4.invoke(r5, r8, r7)
                r6 = 0
                if (r8 != r0) goto L54
                goto L61
            L54:
                r3 = 0
                r6 = 6
                r7.f294977b = r3
                r7.f294976a = r2
                java.lang.Object r7 = r1.k(r8, r7)
                r6 = 1
                if (r7 != r0) goto L63
            L61:
                r6 = 2
                return r0
            L63:
                r6 = 6
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.a.C2068a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            C2068a c2068a = new C2068a(this.f294979d, dVar);
            c2068a.f294977b = eVar;
            c2068a.f294978c = obj;
            return c2068a.invokeSuspend(Unit.f312394a);
        }
    }

    private a() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super fi.y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> handler) throws io.ktor.util.pipeline.b {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        io.ktor.util.pipeline.j jVar = new io.ktor.util.pipeline.j("AfterRender");
        client.x().n(fi.e0.f275224h.b(), jVar);
        client.x().q(jVar, new C2068a(handler, null));
    }
}
