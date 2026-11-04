package io.ktor.client.plugins.api;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class w implements io.ktor.client.plugins.api.a<pj.p<? super v, ? super io.ktor.client.statement.c, ? super io.ktor.utils.io.h, ? super ri.b, ? super kotlin.coroutines.d<? super Object>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f294432a = new w();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", i = {0, 0}, l = {113, 120}, m = "invokeSuspend", n = {"$this$intercept", "typeInfo"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b>, io.ktor.client.statement.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f294433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f294434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f294435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.p<v, io.ktor.client.statement.c, io.ktor.utils.io.h, ri.b, kotlin.coroutines.d<Object>, Object> f294436d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.p<? super v, ? super io.ktor.client.statement.c, ? super io.ktor.utils.io.h, ? super ri.b, ? super kotlin.coroutines.d<Object>, ? extends Object> pVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294436d = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
        
            if (r3.k(r11, r9) == r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r10 = 2
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f294434b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r12)
                goto Lc3
            L14:
                r10 = 3
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r10 = 1
                r11.<init>(r12)
                throw r11
            L1e:
                java.lang.Object r1 = r11.f294433a
                r10 = 0
                ri.b r1 = (ri.b) r1
                java.lang.Object r3 = r11.f294435c
                io.ktor.util.pipeline.e r3 = (io.ktor.util.pipeline.e) r3
                kotlin.ResultKt.m(r12)
                r9 = r11
                goto L72
            L2c:
                kotlin.ResultKt.m(r12)
                java.lang.Object r12 = r11.f294435c
                io.ktor.util.pipeline.e r12 = (io.ktor.util.pipeline.e) r12
                r10 = 3
                java.lang.Object r1 = r12.i()
                io.ktor.client.statement.d r1 = (io.ktor.client.statement.d) r1
                ri.b r8 = r1.a()
                r10 = 2
                java.lang.Object r7 = r1.b()
                boolean r1 = r7 instanceof io.ktor.utils.io.h
                r10 = 0
                if (r1 != 0) goto L4b
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            L4b:
                pj.p<io.ktor.client.plugins.api.v, io.ktor.client.statement.c, io.ktor.utils.io.h, ri.b, kotlin.coroutines.d<java.lang.Object>, java.lang.Object> r4 = r11.f294436d
                io.ktor.client.plugins.api.v r5 = new io.ktor.client.plugins.api.v
                r5.<init>()
                r10 = 5
                java.lang.Object r1 = r12.f()
                r10 = 0
                io.ktor.client.call.b r1 = (io.ktor.client.call.b) r1
                io.ktor.client.statement.c r6 = r1.k()
                r11.f294435c = r12
                r10 = 1
                r11.f294433a = r8
                r10 = 6
                r11.f294434b = r3
                r9 = r11
                java.lang.Object r11 = r4.invoke(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L6f
                r10 = 5
                goto Lc2
            L6f:
                r3 = r12
                r1 = r8
                r12 = r11
            L72:
                r10 = 6
                if (r12 != 0) goto L78
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            L78:
                r10 = 5
                boolean r11 = r12 instanceof io.ktor.http.content.v
                if (r11 != 0) goto Lac
                r10 = 1
                kotlin.reflect.d r11 = r1.b()
                r10 = 3
                boolean r11 = r11.K(r12)
                if (r11 == 0) goto L8a
                goto Lac
            L8a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r10 = 4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "transformResponseBody returned "
                r10 = 0
                r0.append(r2)
                r10 = 5
                r0.append(r12)
                java.lang.String r12 = " but expected value of type "
                r0.append(r12)
                r0.append(r1)
                java.lang.String r12 = r0.toString()
                r11.<init>(r12)
                throw r11
            Lac:
                r10 = 2
                io.ktor.client.statement.d r11 = new io.ktor.client.statement.d
                r11.<init>(r1, r12)
                r12 = 0
                r10 = 5
                r9.f294435c = r12
                r9.f294433a = r12
                r10 = 4
                r9.f294434b = r2
                java.lang.Object r11 = r3.k(r11, r9)
                r10 = 4
                if (r11 != r0) goto Lc3
            Lc2:
                return r0
            Lc3:
                kotlin.Unit r11 = kotlin.Unit.f312394a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.w.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b> eVar, io.ktor.client.statement.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            a aVar = new a(this.f294436d, dVar2);
            aVar.f294435c = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private w() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.p<? super v, ? super io.ktor.client.statement.c, ? super io.ktor.utils.io.h, ? super ri.b, ? super kotlin.coroutines.d<Object>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.y().q(io.ktor.client.statement.f.f295340h.e(), new a(handler, null));
    }
}
