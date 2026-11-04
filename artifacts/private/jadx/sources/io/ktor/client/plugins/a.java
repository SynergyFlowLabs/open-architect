package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements io.ktor.client.plugins.api.a<Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super io.ktor.client.statement.c>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f294378a = new a();

    /* JADX INFO: renamed from: io.ktor.client.plugins.a$a, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.AfterReceiveHook$install$1", f = "BodyProgress.kt", i = {0}, l = {50, 51}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class C2057a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit>, io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f294381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super io.ktor.client.statement.c>, Object> f294382d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2057a(Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super io.ktor.client.statement.c>, ? extends Object> function2, kotlin.coroutines.d<? super C2057a> dVar) {
            super(3, dVar);
            this.f294382d = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            if (r1.k(r7, r6) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 5
                int r1 = r6.f294379a
                r2 = 2
                r5 = 7
                r3 = 1
                if (r1 == 0) goto L27
                r5 = 1
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r7)
                goto L59
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "uts/ueocernekietrm/  owoiit/hnl ls/////fv b eroeoc "
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1f:
                java.lang.Object r1 = r6.f294380b
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                kotlin.ResultKt.m(r7)
                goto L46
            L27:
                kotlin.ResultKt.m(r7)
                r5 = 5
                java.lang.Object r7 = r6.f294380b
                r1 = r7
                r1 = r7
                r5 = 5
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                r5 = 3
                java.lang.Object r7 = r6.f294381c
                io.ktor.client.statement.c r7 = (io.ktor.client.statement.c) r7
                kotlin.jvm.functions.Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super io.ktor.client.statement.c>, java.lang.Object> r4 = r6.f294382d
                r6.f294380b = r1
                r5 = 1
                r6.f294379a = r3
                java.lang.Object r7 = r4.invoke(r7, r6)
                r5 = 5
                if (r7 != r0) goto L46
                goto L57
            L46:
                io.ktor.client.statement.c r7 = (io.ktor.client.statement.c) r7
                if (r7 == 0) goto L59
                r3 = 0
                r5 = r3
                r6.f294380b = r3
                r6.f294379a = r2
                java.lang.Object r6 = r1.k(r7, r6)
                r5 = 4
                if (r6 != r0) goto L59
            L57:
                r5 = 7
                return r0
            L59:
                r5 = 1
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.a.C2057a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.c, Unit> eVar, io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            C2057a c2057a = new C2057a(this.f294382d, dVar);
            c2057a.f294380b = eVar;
            c2057a.f294381c = cVar;
            return c2057a.invokeSuspend(Unit.f312394a);
        }
    }

    private a() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super io.ktor.client.statement.c>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.t().q(io.ktor.client.statement.b.f295326h.a(), new C2057a(handler, null));
    }
}
