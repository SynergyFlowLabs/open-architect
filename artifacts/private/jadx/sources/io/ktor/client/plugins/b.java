package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements io.ktor.client.plugins.api.a<pj.n<? super fi.y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f294437a = new b();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.AfterRenderHook$install$1", f = "BodyProgress.kt", i = {0}, l = {65, 66}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<fi.y, io.ktor.http.content.w, kotlin.coroutines.d<? super io.ktor.http.content.w>, Object> f294441d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super fi.y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294441d = nVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.b$a for r7v6 'this'  java.lang.Object
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
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f294438a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L14
                r6 = 7
                kotlin.ResultKt.m(r8)
                r6 = 1
                goto L66
            L14:
                r6 = 6
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1d:
                java.lang.Object r1 = r7.f294439b
                r6 = 7
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                r6 = 2
                kotlin.ResultKt.m(r8)
                goto L4e
            L27:
                r6 = 6
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f294439b
                r1 = r8
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                java.lang.Object r8 = r7.f294440c
                r6 = 4
                boolean r4 = r8 instanceof io.ktor.http.content.w
                if (r4 != 0) goto L3a
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            L3a:
                pj.n<fi.y, io.ktor.http.content.w, kotlin.coroutines.d<? super io.ktor.http.content.w>, java.lang.Object> r4 = r7.f294441d
                java.lang.Object r5 = r1.f()
                r6 = 1
                r7.f294439b = r1
                r6 = 5
                r7.f294438a = r3
                java.lang.Object r8 = r4.invoke(r5, r8, r7)
                r6 = 4
                if (r8 != r0) goto L4e
                goto L64
            L4e:
                io.ktor.http.content.w r8 = (io.ktor.http.content.w) r8
                r6 = 7
                if (r8 != 0) goto L57
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 7
                return r7
            L57:
                r6 = 6
                r3 = 0
                r7.f294439b = r3
                r7.f294438a = r2
                r6 = 4
                java.lang.Object r7 = r1.k(r8, r7)
                if (r7 != r0) goto L66
            L64:
                r6 = 6
                return r0
            L66:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 3
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294441d, dVar);
            aVar.f294439b = eVar;
            aVar.f294440c = obj;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private b() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super fi.y, ? super io.ktor.http.content.w, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> handler) throws io.ktor.util.pipeline.b {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        io.ktor.util.pipeline.j jVar = new io.ktor.util.pipeline.j("ObservableContent");
        client.x().n(fi.e0.f275224h.b(), jVar);
        client.x().q(jVar, new a(handler, null));
    }
}
