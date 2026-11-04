package io.ktor.client.plugins.api;

import fi.e0;
import fi.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements io.ktor.client.plugins.api.a<pj.p<? super t, ? super y, ? super Object, ? super ri.b, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f294428a = new u();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.api.TransformRequestBodyHook$install$1", f = "KtorCallContexts.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160690g0, com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.p<t, y, Object, ri.b, kotlin.coroutines.d<? super io.ktor.http.content.w>, Object> f294431c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.p<? super t, ? super y, Object, ? super ri.b, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294431c = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        
            if (r1.k(r12, r9) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r10 = 1
                int r1 = r11.f294429a
                r2 = 2
                r3 = 1
                int r10 = r10 << r3
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r12)
                goto L6b
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                r10 = 4
                throw r11
            L1d:
                r10 = 4
                java.lang.Object r1 = r11.f294430b
                r10 = 1
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                kotlin.ResultKt.m(r12)
                r9 = r11
                goto L5a
            L28:
                kotlin.ResultKt.m(r12)
                r10 = 6
                java.lang.Object r12 = r11.f294430b
                r1 = r12
                r10 = 0
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                pj.p<io.ktor.client.plugins.api.t, fi.y, java.lang.Object, ri.b, kotlin.coroutines.d<? super io.ktor.http.content.w>, java.lang.Object> r4 = r11.f294431c
                io.ktor.client.plugins.api.t r5 = new io.ktor.client.plugins.api.t
                r5.<init>()
                java.lang.Object r6 = r1.f()
                r10 = 5
                java.lang.Object r7 = r1.i()
                java.lang.Object r12 = r1.f()
                fi.y r12 = (fi.y) r12
                r10 = 0
                ri.b r8 = r12.e()
                r11.f294430b = r1
                r11.f294429a = r3
                r9 = r11
                java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9)
                if (r12 != r0) goto L5a
                r10 = 6
                goto L6a
            L5a:
                io.ktor.http.content.w r12 = (io.ktor.http.content.w) r12
                r10 = 5
                if (r12 == 0) goto L6b
                r11 = 0
                r9.f294430b = r11
                r9.f294429a = r2
                java.lang.Object r11 = r1.k(r12, r9)
                if (r11 != r0) goto L6b
            L6a:
                return r0
            L6b:
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294431c, dVar);
            aVar.f294430b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private u() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.p<? super t, ? super y, Object, ? super ri.b, ? super kotlin.coroutines.d<? super io.ktor.http.content.w>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.x().q(e0.f275224h.e(), new a(handler, null));
    }
}
