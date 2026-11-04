package androidx.paging;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nInvalidatingPagingSourceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidatingPagingSourceFactory.kt\nandroidx/paging/InvalidatingPagingSourceFactory\n+ 2 Atomics.kt\nandroidx/paging/internal/AtomicsKt\n*L\n1#1,73:1\n54#2,6:74\n54#2,6:80\n*S KotlinDebug\n*F\n+ 1 InvalidatingPagingSourceFactory.kt\nandroidx/paging/InvalidatingPagingSourceFactory\n*L\n50#1:74,6\n61#1:80,6\n*E\n"})
public final class l0<Key, Value> implements i2<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<h2<Key, Value>> f72348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f72349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<? extends h2<Key, Value>> f72350c;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(@NotNull Function0<? extends h2<Key, Value>> pagingSourceFactory) {
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f72348a = pagingSourceFactory;
        this.f72349b = new ReentrantLock();
        this.f72350c = CollectionsKt.emptyList();
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f72349b;
        try {
            reentrantLock.lock();
            List<? extends h2<Key, Value>> list = this.f72350c;
            this.f72350c = CollectionsKt.emptyList();
            reentrantLock.unlock();
            for (h2<Key, Value> h2Var : list) {
                if (!h2Var.getInvalid()) {
                    h2Var.invalidate();
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @androidx.annotation.l1
    @NotNull
    public final List<h2<Key, Value>> d() {
        return this.f72350c;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public h2<Key, Value> invoke() {
        h2<Key, Value> h2VarInvoke = this.f72348a.invoke();
        ReentrantLock reentrantLock = this.f72349b;
        try {
            reentrantLock.lock();
            this.f72350c = CollectionsKt.plus((Collection<? extends h2<Key, Value>>) this.f72350c, h2VarInvoke);
            Unit unit = Unit.f312394a;
            return h2VarInvoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
