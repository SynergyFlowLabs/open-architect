package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.e3;
import kotlinx.coroutines.internal.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
public abstract class w0<S extends w0<S>> extends f<S> implements e3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315132d = AtomicIntegerFieldUpdater.newUpdater(w0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public final long f315133c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public w0(long j10, @Nullable S s10, int i10) {
        super(s10);
        this.f315133c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    private final /* synthetic */ void B(int i10) {
        this.cleanedAndPointers$volatile = i10;
    }

    private final /* synthetic */ int w() {
        return this.cleanedAndPointers$volatile;
    }

    public final void A() {
        if (f315132d.incrementAndGet(this) == y()) {
            q();
        }
    }

    public final boolean C() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315132d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == y() && !n()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }

    @Override // kotlinx.coroutines.internal.f
    public boolean m() {
        return f315132d.get(this) == y() && !n();
    }

    public final boolean v() {
        return f315132d.addAndGet(this, l1.a.f316127c) == y() && !n();
    }

    public abstract int y();

    public abstract void z(int i10, @Nullable Throwable th2, @NotNull CoroutineContext coroutineContext);
}
