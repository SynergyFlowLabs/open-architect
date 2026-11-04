package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class l1 implements io.ktor.client.plugins.api.a<pj.n<? super fi.y, ? super Object, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l1 f294882a = new l1();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.RenderRequestHook$install$1", f = "HttpPlainText.kt", i = {0}, l = {155, androidx.media2.widget.f.i.f59797r0}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<fi.y, Object, kotlin.coroutines.d<? super io.ktor.http.content.w>, Object> f294886d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super fi.y, Object, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294886d = nVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.l1$a for r7v4 'this'  java.lang.Object
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
                int r1 = r7.f294883a
                r2 = 2
                r3 = 5
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r8)
                goto L55
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r6 = 2
                r7.<init>(r8)
                throw r7
            L1c:
                java.lang.Object r1 = r7.f294884b
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                kotlin.ResultKt.m(r8)
                goto L43
            L24:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f294884b
                r1 = r8
                r6 = 0
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                r6 = 2
                java.lang.Object r8 = r7.f294885c
                pj.n<fi.y, java.lang.Object, kotlin.coroutines.d<? super io.ktor.http.content.w>, java.lang.Object> r4 = r7.f294886d
                java.lang.Object r5 = r1.f()
                r7.f294884b = r1
                r7.f294883a = r3
                r6 = 2
                java.lang.Object r8 = r4.invoke(r5, r8, r7)
                r6 = 3
                if (r8 != r0) goto L43
                goto L53
            L43:
                io.ktor.http.content.w r8 = (io.ktor.http.content.w) r8
                if (r8 == 0) goto L55
                r3 = 0
                r7.f294884b = r3
                r7.f294883a = r2
                java.lang.Object r7 = r1.k(r8, r7)
                r6 = 2
                if (r7 != r0) goto L55
            L53:
                r6 = 7
                return r0
            L55:
                r6 = 4
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.l1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294886d, dVar);
            aVar.f294884b = eVar;
            aVar.f294885c = obj;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private l1() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super fi.y, Object, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.x().q(fi.e0.f275224h.b(), new a(handler, null));
    }
}
