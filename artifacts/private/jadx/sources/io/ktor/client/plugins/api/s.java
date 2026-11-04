package io.ktor.client.plugins.api;

import fi.e0;
import fi.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements io.ktor.client.plugins.api.a<Function2<? super y, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f294424a = new s();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.api.SetupRequest$install$1", f = "CommonHooks.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<y, kotlin.coroutines.d<? super Unit>, Object> f294427c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super y, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294427c = function2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to io.ktor.client.plugins.api.s$a for r4v4 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f294425a
                r2 = 1
                if (r1 == 0) goto L1a
                r3 = 6
                if (r1 != r2) goto L10
                kotlin.ResultKt.m(r5)
                goto L32
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r3 = 5
                r4.<init>(r5)
                r3 = 2
                throw r4
            L1a:
                kotlin.ResultKt.m(r5)
                r3 = 4
                java.lang.Object r5 = r4.f294426b
                io.ktor.util.pipeline.e r5 = (io.ktor.util.pipeline.e) r5
                kotlin.jvm.functions.Function2<fi.y, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r1 = r4.f294427c
                java.lang.Object r5 = r5.f()
                r4.f294425a = r2
                java.lang.Object r4 = r1.invoke(r5, r4)
                r3 = 1
                if (r4 != r0) goto L32
                return r0
            L32:
                kotlin.Unit r4 = kotlin.Unit.f312394a
                r3 = 6
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294427c, dVar);
            aVar.f294426b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private s() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull Function2<? super y, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.x().q(e0.f275224h.a(), new a(handler, null));
    }
}
