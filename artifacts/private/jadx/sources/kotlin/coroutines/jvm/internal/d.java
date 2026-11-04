package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@e1(version = "1.3")
@SourceDebugExtension({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class d extends a {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient kotlin.coroutines.d<Object> intercepted;

    public d(@Nullable kotlin.coroutines.d<Object> dVar, @Nullable CoroutineContext coroutineContext) {
        super(dVar);
        this._context = coroutineContext;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d<Object> dVarK0 = this.intercepted;
        if (dVarK0 == null) {
            kotlin.coroutines.e eVar = (kotlin.coroutines.e) getContext().get(kotlin.coroutines.e.K2);
            if (eVar == null || (dVarK0 = eVar.k0(this)) == null) {
                dVarK0 = this;
            }
            this.intercepted = dVarK0;
        }
        return dVarK0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        kotlin.coroutines.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.e.K2);
            Intrinsics.checkNotNull(element);
            ((kotlin.coroutines.e) element).l(dVar);
        }
        this.intercepted = c.f312475a;
    }

    public d(@Nullable kotlin.coroutines.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
