package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j1 implements io.ktor.client.plugins.api.a<pj.n<? super fi.w, ? super Throwable, ? super kotlin.coroutines.d<? super Throwable>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j1 f294860a = new j1();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.ReceiveError$install$1", f = "HttpCallValidator.kt", i = {0}, l = {165, 167}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b>, io.ktor.client.statement.d, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<fi.w, Throwable, kotlin.coroutines.d<? super Throwable>, Object> f294863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super fi.w, ? super Throwable, ? super kotlin.coroutines.d<? super Throwable>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294863c = nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            if (r7 == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.e] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.client.plugins.j1$a, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r6v1, types: [io.ktor.client.plugins.j1$a, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f294861a
                r2 = 2
                r3 = 1
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r7)
                goto L59
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 4
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1c:
                java.lang.Object r1 = r6.f294862b
                r5 = 5
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L25
                goto L5d
            L25:
                r7 = move-exception
                goto L3f
            L27:
                kotlin.ResultKt.m(r7)
                r5 = 6
                java.lang.Object r7 = r6.f294862b
                r1 = r7
                r5 = 2
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                r5 = 3
                r6.f294862b = r1     // Catch: java.lang.Throwable -> L25
                r6.f294861a = r3     // Catch: java.lang.Throwable -> L25
                java.lang.Object r6 = r1.j(r6)     // Catch: java.lang.Throwable -> L25
                r5 = 0
                if (r6 != r0) goto L5d
                r5 = 4
                goto L57
            L3f:
                pj.n<fi.w, java.lang.Throwable, kotlin.coroutines.d<? super java.lang.Throwable>, java.lang.Object> r3 = r6.f294863c
                java.lang.Object r1 = r1.f()
                io.ktor.client.call.b r1 = (io.ktor.client.call.b) r1
                fi.w r1 = r1.j()
                r4 = 0
                r5 = r4
                r6.f294862b = r4
                r6.f294861a = r2
                java.lang.Object r7 = r3.invoke(r1, r7, r6)
                if (r7 != r0) goto L59
            L57:
                r5 = 2
                return r0
            L59:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L60
            L5d:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L60:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.j1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<io.ktor.client.statement.d, io.ktor.client.call.b> eVar, io.ktor.client.statement.d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
            a aVar = new a(this.f294863c, dVar2);
            aVar.f294862b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private j1() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super fi.w, ? super Throwable, ? super kotlin.coroutines.d<? super Throwable>, ? extends Object> handler) throws io.ktor.util.pipeline.b {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        io.ktor.util.pipeline.j jVar = new io.ktor.util.pipeline.j("BeforeReceive");
        client.y().o(io.ktor.client.statement.f.f295340h.c(), jVar);
        client.y().q(jVar, new a(handler, null));
    }
}
