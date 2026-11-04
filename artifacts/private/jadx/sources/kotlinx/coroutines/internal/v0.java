package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class v0<T> extends kotlinx.coroutines.a<T> implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlin.coroutines.d<T> f315130d;

    /* JADX WARN: Multi-variable type inference failed */
    public v0(@NotNull CoroutineContext coroutineContext, @NotNull kotlin.coroutines.d<? super T> dVar) {
        super(coroutineContext, true, true);
        this.f315130d = dVar;
    }

    @Override // kotlinx.coroutines.w2
    protected void a0(@Nullable Object obj) {
        n.d(kotlin.coroutines.intrinsics.b.e(this.f315130d), kotlinx.coroutines.f0.a(obj, this.f315130d));
    }

    @Override // kotlinx.coroutines.a
    protected void d2(@Nullable Object obj) {
        kotlin.coroutines.d<T> dVar = this.f315130d;
        dVar.resumeWith(kotlinx.coroutines.f0.a(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f315130d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public void i2() {
    }

    @Override // kotlinx.coroutines.w2
    protected final boolean u1() {
        return true;
    }
}
