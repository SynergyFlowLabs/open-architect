package kotlinx.coroutines.flow.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class w<T> extends kotlin.coroutines.jvm.internal.d implements kotlinx.coroutines.flow.j<T>, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlinx.coroutines.flow.j<T> f314622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final CoroutineContext f314623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public final int f314624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private CoroutineContext f314625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private kotlin.coroutines.d<? super Unit> f314626e;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @NotNull CoroutineContext coroutineContext) {
        super(s.f314616a, kotlin.coroutines.h.f312451a);
        this.f314622a = jVar;
        this.f314623b = coroutineContext;
        this.f314624c = ((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(w.n(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    private final void m(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t10) {
        if (coroutineContext2 instanceof n) {
            v((n) coroutineContext2, t10);
        }
        z.b(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    private final Object s(kotlin.coroutines.d<? super Unit> dVar, T t10) {
        CoroutineContext context = dVar.getContext();
        s2.y(context);
        CoroutineContext coroutineContext = this.f314625d;
        if (coroutineContext != context) {
            m(context, coroutineContext, t10);
            this.f314625d = context;
        }
        this.f314626e = dVar;
        pj.n nVar = x.f314627a;
        kotlinx.coroutines.flow.j<T> jVar = this.f314622a;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = nVar.invoke(jVar, t10, this);
        if (!Intrinsics.areEqual(objInvoke, kotlin.coroutines.intrinsics.b.l())) {
            this.f314626e = null;
        }
        return objInvoke;
    }

    private final void v(n nVar, Object obj) {
        throw new IllegalStateException(StringsKt.p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + nVar.f314610b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        try {
            Object objS = s(dVar, t10);
            if (objS == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objS == kotlin.coroutines.intrinsics.b.l() ? objS : Unit.f312394a;
        } catch (Throwable th2) {
            this.f314625d = new n(th2, dVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    @Nullable
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<? super Unit> dVar = this.f314626e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f314625d;
        if (coroutineContext == null) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    protected Object invokeSuspend(@NotNull Object obj) {
        Throwable thD = Result.d(obj);
        if (thD != null) {
            this.f314625d = new n(thD, getContext());
        }
        kotlin.coroutines.d<? super Unit> dVar = this.f314626e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return kotlin.coroutines.intrinsics.b.l();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
