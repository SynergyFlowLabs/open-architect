package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@e1(version = "1.3")
public abstract class a implements kotlin.coroutines.d<Object>, e, Serializable {

    @Nullable
    private final kotlin.coroutines.d<Object> completion;

    public a(@Nullable kotlin.coroutines.d<Object> dVar) {
        this.completion = dVar;
    }

    @NotNull
    public kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public e getCallerFrame() {
        kotlin.coroutines.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Nullable
    public final kotlin.coroutines.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return g.e(this);
    }

    @Nullable
    protected abstract Object invokeSuspend(@NotNull Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        ?? r10 = this;
        while (true) {
            h.b(r10);
            a aVar = (a) r10;
            kotlin.coroutines.d<Object> dVar = aVar.completion;
            Intrinsics.checkNotNull(dVar);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == kotlin.coroutines.intrinsics.b.l()) {
                    return;
                }
                Result.a aVar2 = Result.Companion;
                obj = Result.m785constructorimpl(objInvokeSuspend);
            } catch (Throwable th2) {
                Result.a aVar3 = Result.Companion;
                obj = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            aVar.releaseIntercepted();
            if (!(dVar instanceof a)) {
                dVar.resumeWith(obj);
                return;
            }
            r10 = dVar;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
