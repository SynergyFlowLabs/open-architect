package kotlinx.coroutines.scheduling;

import com.google.common.util.concurrent.x2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n77#2:252\n77#2:253\n77#2:254\n77#2:257\n77#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315496b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315497c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315498d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315499e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReferenceArray<i> f315500a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final i A(int i10, boolean z10) {
        int i11 = i10 & 127;
        i iVar = this.f315500a.get(i11);
        if (iVar == null || iVar.f315485b != z10 || !x2.a(this.f315500a, i11, iVar, null)) {
            return null;
        }
        if (z10) {
            f315499e.decrementAndGet(this);
        }
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.i] */
    private final long C(int i10, i1.h<i> hVar) {
        ?? r10;
        do {
            r10 = (i) f315496b.get(this);
            if (r10 == 0) {
                return -2L;
            }
            if (((r10.f315485b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = k.f315492f.a() - r10.f315484a;
            long j10 = k.f315488b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f315496b, this, r10, null));
        hVar.f312751a = r10;
        return -1L;
    }

    public static /* synthetic */ i b(m mVar, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return mVar.a(iVar, z10);
    }

    private final i c(i iVar) {
        if (g() == 127) {
            return iVar;
        }
        if (iVar.f315485b) {
            f315499e.incrementAndGet(this);
        }
        int i10 = f315497c.get(this) & 127;
        while (this.f315500a.get(i10) != null) {
            Thread.yield();
        }
        this.f315500a.lazySet(i10, iVar);
        f315497c.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar == null || !iVar.f315485b) {
            return;
        }
        f315499e.decrementAndGet(this);
    }

    private final /* synthetic */ int e() {
        return this.blockingTasksInBuffer$volatile;
    }

    private final int g() {
        return f315497c.get(this) - f315498d.get(this);
    }

    private final /* synthetic */ int h() {
        return this.consumerIndex$volatile;
    }

    private final /* synthetic */ Object j() {
        return this.lastScheduledTask$volatile;
    }

    private final /* synthetic */ int l() {
        return this.producerIndex$volatile;
    }

    private final i r() {
        i andSet;
        while (true) {
            int i10 = f315498d.get(this);
            if (i10 - f315497c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f315498d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f315500a.getAndSet(i11, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean t(e eVar) {
        i iVarR = r();
        if (iVarR == null) {
            return false;
        }
        eVar.a(iVarR);
        return true;
    }

    private final i u(boolean z10) {
        i iVar;
        do {
            iVar = (i) f315496b.get(this);
            if (iVar == null || iVar.f315485b != z10) {
                int i10 = f315498d.get(this);
                int i11 = f315497c.get(this);
                while (i10 != i11) {
                    if (z10 && f315499e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    i iVarA = A(i11, z10);
                    if (iVarA != null) {
                        return iVarA;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f315496b, this, iVar, null));
        return iVar;
    }

    private final /* synthetic */ void v(int i10) {
        this.blockingTasksInBuffer$volatile = i10;
    }

    private final /* synthetic */ void w(int i10) {
        this.consumerIndex$volatile = i10;
    }

    private final /* synthetic */ void x(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    private final /* synthetic */ void y(int i10) {
        this.producerIndex$volatile = i10;
    }

    private final i z(int i10) {
        int i11 = f315498d.get(this);
        int i12 = f315497c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f315499e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            i iVarA = A(i11, z10);
            if (iVarA != null) {
                return iVarA;
            }
            i11 = i13;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long B(int i10, @NotNull i1.h<i> hVar) {
        T tR = i10 == 3 ? r() : z(i10);
        if (tR == 0) {
            return C(i10, hVar);
        }
        hVar.f312751a = tR;
        return -1L;
    }

    @Nullable
    public final i a(@NotNull i iVar, boolean z10) {
        if (z10) {
            return c(iVar);
        }
        i iVar2 = (i) f315496b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final int n() {
        Object obj = f315496b.get(this);
        int iG = g();
        if (obj != null) {
            iG++;
        }
        return iG;
    }

    public final void o(@NotNull e eVar) {
        i iVar = (i) f315496b.getAndSet(this, null);
        if (iVar != null) {
            eVar.a(iVar);
        }
        while (t(eVar)) {
        }
    }

    @Nullable
    public final i p() {
        i iVar = (i) f315496b.getAndSet(this, null);
        return iVar == null ? r() : iVar;
    }

    @Nullable
    public final i q() {
        return u(true);
    }

    @Nullable
    public final i s() {
        return u(false);
    }
}
