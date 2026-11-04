package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRemoteMediatorAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/AccessorStateHolder\n+ 2 Atomics.kt\nandroidx/paging/internal/AtomicsKt\n*L\n1#1,460:1\n54#2,6:461\n*S KotlinDebug\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/AccessorStateHolder\n*L\n79#1:461,6\n*E\n"})
final class b<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f71526a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<z0> f71527b = kotlinx.coroutines.flow.b1.a(z0.f72792f.a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a<Key, Value> f71528c = new a<>();

    @NotNull
    public final kotlinx.coroutines.flow.z0<z0> a() {
        return this.f71527b;
    }

    public final <R> R b(@NotNull Function1<? super a<Key, Value>, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ReentrantLock reentrantLock = this.f71526a;
        try {
            reentrantLock.lock();
            R rInvoke = block.invoke(this.f71528c);
            this.f71527b.setValue(this.f71528c.e());
            reentrantLock.unlock();
            return rInvoke;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
