package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class d0<T> implements kotlinx.coroutines.flow.j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f314489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f314490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<T, kotlin.coroutines.d<? super Unit>, Object> f314491c;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<T, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.j<T> f314494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314494c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f314494c, dVar);
            aVar.f314493b = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.d0$a for r4v4 'this'  kotlin.coroutines.d
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
                int r1 = r4.f314492a
                r3 = 1
                r2 = 1
                if (r1 == 0) goto L1a
                r3 = 1
                if (r1 != r2) goto L12
                r3 = 2
                kotlin.ResultKt.m(r5)
                goto L2c
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                kotlin.ResultKt.m(r5)
                r3 = 4
                java.lang.Object r5 = r4.f314493b
                kotlinx.coroutines.flow.j<T> r1 = r4.f314494c
                r4.f314492a = r2
                java.lang.Object r4 = r1.emit(r5, r4)
                r3 = 4
                if (r4 != r0) goto L2c
                return r0
            L2c:
                kotlin.Unit r4 = kotlin.Unit.f312394a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.d0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(t10, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public d0(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @NotNull CoroutineContext coroutineContext) {
        this.f314489a = coroutineContext;
        this.f314490b = i1.g(coroutineContext);
        this.f314491c = new a(jVar, null);
    }

    @Override // kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = f.c(this.f314489a, t10, this.f314490b, this.f314491c, dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }
}
