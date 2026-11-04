package kotlinx.coroutines.reactive;

import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.n0;
import org.reactivestreams.u;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.ConvertKt$asPublisher$1", f = "Convert.kt", i = {0, 1}, l = {12, 13}, m = "invokeSuspend", n = {"$this$publish", "$this$publish"}, s = {"L$0", "L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<l0<Object>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f315238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f315239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<Object> f315240d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n0<Object> n0Var, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f315240d = n0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f315240d, dVar);
            aVar.f315239c = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0056  */
        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
        /* JADX WARN: Code duplicated, block: B:18:0x0065  */
        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        
            if (r4.G(r8, r7) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0076 -> B:7:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 6
                int r1 = r7.f315238b
                r2 = 2
                r6 = 7
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L21
                r6 = 1
                java.lang.Object r1 = r7.f315237a
                r6 = 7
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r4 = r7.f315239c
                r6 = 4
                kotlinx.coroutines.channels.l0 r4 = (kotlinx.coroutines.channels.l0) r4
                kotlin.ResultKt.m(r8)
            L1e:
                r8 = r4
                r6 = 7
                goto L49
            L21:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 5
                throw r7
            L2a:
                r6 = 6
                java.lang.Object r1 = r7.f315237a
                r6 = 5
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r4 = r7.f315239c
                r6 = 1
                kotlinx.coroutines.channels.l0 r4 = (kotlinx.coroutines.channels.l0) r4
                kotlin.ResultKt.m(r8)
                r6 = 5
                goto L5c
            L3a:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f315239c
                r6 = 7
                kotlinx.coroutines.channels.l0 r8 = (kotlinx.coroutines.channels.l0) r8
                kotlinx.coroutines.channels.n0<java.lang.Object> r1 = r7.f315240d
                r6 = 7
                kotlinx.coroutines.channels.r r1 = r1.iterator()
            L49:
                r7.f315239c = r8
                r7.f315237a = r1
                r7.f315238b = r3
                java.lang.Object r4 = r1.c(r7)
                r6 = 0
                if (r4 != r0) goto L58
                r6 = 4
                goto L78
            L58:
                r5 = r4
                r5 = r4
                r4 = r8
                r8 = r5
            L5c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                r6 = 4
                if (r8 == 0) goto L7a
                java.lang.Object r8 = r1.next()
                r6 = 5
                r7.f315239c = r4
                r7.f315237a = r1
                r7.f315238b = r2
                r6 = 6
                java.lang.Object r8 = r4.G(r8, r7)
                r6 = 6
                if (r8 != r0) goto L1e
            L78:
                r6 = 2
                return r0
            L7a:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<Object> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Deprecated in the favour of consumeAsFlow()", replaceWith = @b1(expression = "this.consumeAsFlow().asPublisher(context)", imports = {"kotlinx.coroutines.flow.consumeAsFlow"}))
    public static final /* synthetic */ u a(n0 n0Var, CoroutineContext coroutineContext) {
        return l.d(coroutineContext, new a(n0Var, null));
    }

    public static /* synthetic */ u b(n0 n0Var, CoroutineContext coroutineContext, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return a(n0Var, coroutineContext);
    }
}
