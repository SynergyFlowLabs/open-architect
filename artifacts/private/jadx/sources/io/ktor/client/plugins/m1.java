package io.ktor.client.plugins;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m1 implements io.ktor.client.plugins.api.a<pj.n<? super fi.w, ? super Throwable, ? super kotlin.coroutines.d<? super Throwable>, ? extends Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m1 f294907a = new m1();

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.RequestError$install$1", f = "HttpCallValidator.kt", i = {0}, l = {150, 152}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<io.ktor.util.pipeline.e<Object, fi.y>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f294909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<fi.w, Throwable, kotlin.coroutines.d<? super Throwable>, Object> f294910c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super fi.w, ? super Throwable, ? super kotlin.coroutines.d<? super Throwable>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
            this.f294910c = nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r6 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r7 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.e] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r6v0, types: [io.ktor.client.plugins.m1$a, kotlin.coroutines.d] */
        /* JADX WARN: Type inference failed for: r6v1, types: [io.ktor.client.plugins.m1$a, java.lang.Object] */
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
                r5 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 1
                int r1 = r6.f294908a
                r5 = 3
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                r5 = 0
                kotlin.ResultKt.m(r7)
                goto L5b
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1e:
                java.lang.Object r1 = r6.f294909b
                r5 = 3
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                r5 = 2
                kotlin.ResultKt.m(r7)     // Catch: java.lang.Throwable -> L28
                goto L60
            L28:
                r7 = move-exception
                r5 = 2
                goto L41
            L2b:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f294909b
                r1 = r7
                io.ktor.util.pipeline.e r1 = (io.ktor.util.pipeline.e) r1
                r5 = 4
                r6.f294909b = r1     // Catch: java.lang.Throwable -> L28
                r5 = 6
                r6.f294908a = r3     // Catch: java.lang.Throwable -> L28
                r5 = 7
                java.lang.Object r6 = r1.j(r6)     // Catch: java.lang.Throwable -> L28
                if (r6 != r0) goto L60
                goto L5a
            L41:
                pj.n<fi.w, java.lang.Throwable, kotlin.coroutines.d<? super java.lang.Throwable>, java.lang.Object> r3 = r6.f294910c
                java.lang.Object r1 = r1.f()
                r5 = 6
                fi.y r1 = (fi.y) r1
                fi.w r1 = io.ktor.client.plugins.w.i(r1)
                r4 = 0
                r6.f294909b = r4
                r6.f294908a = r2
                java.lang.Object r7 = r3.invoke(r1, r7, r6)
                r5 = 7
                if (r7 != r0) goto L5b
            L5a:
                return r0
            L5b:
                r5 = 6
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L64
            L60:
                r5 = 5
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L64:
                r5 = 5
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.m1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.util.pipeline.e<Object, fi.y> eVar, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar = new a(this.f294910c, dVar);
            aVar.f294909b = eVar;
            return aVar.invokeSuspend(Unit.f312394a);
        }
    }

    private m1() {
    }

    @Override // io.ktor.client.plugins.api.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull io.ktor.client.c client, @NotNull pj.n<? super fi.w, ? super Throwable, ? super kotlin.coroutines.d<? super Throwable>, ? extends Object> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.x().q(fi.e0.f275224h.a(), new a(handler, null));
    }
}
