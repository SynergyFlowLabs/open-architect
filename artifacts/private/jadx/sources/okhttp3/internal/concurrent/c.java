package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import jk.f;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f334048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f334049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f334050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private okhttp3.internal.concurrent.a f334051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<okhttp3.internal.concurrent.a> f334052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f334053f;

    private static final class a extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final CountDownLatch f334054e;

        public a() {
            super(f.f307491i + " awaitIdle", false);
            this.f334054e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f334054e.countDown();
            return -1L;
        }

        @NotNull
        public final CountDownLatch i() {
            return this.f334054e;
        }
    }

    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
    public static final class b extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f334055e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z10, Function0<Unit> function0) {
            super(str, z10);
            this.f334055e = function0;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            this.f334055e.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.c$c, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
    public static final class C2358c extends okhttp3.internal.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Long> f334056e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2358c(String str, Function0<Long> function0) {
            super(str, false, 2, null);
            this.f334056e = function0;
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            return this.f334056e.invoke().longValue();
        }
    }

    public c(@NotNull d taskRunner, @NotNull String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f334048a = taskRunner;
        this.f334049b = name;
        this.f334052e = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String name, long j10, boolean z10, Function0 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        cVar.n(new b(name, z10, block), j10);
    }

    public static /* synthetic */ void o(c cVar, String name, long j10, Function0 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        cVar.n(new C2358c(name, block), j10);
    }

    public static /* synthetic */ void p(c cVar, okhttp3.internal.concurrent.a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        cVar.n(aVar, j10);
    }

    public final void a() {
        if (f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f334048a) {
            try {
                if (b()) {
                    this.f334048a.i(this);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        okhttp3.internal.concurrent.a aVar = this.f334051d;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.a()) {
                this.f334053f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f334052e.size() - 1; -1 < size; size--) {
            if (this.f334052e.get(size).a()) {
                okhttp3.internal.concurrent.a aVar2 = this.f334052e.get(size);
                if (d.f334057h.a().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(aVar2, this, "canceled");
                }
                this.f334052e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(@NotNull String name, long j10, boolean z10, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        n(new b(name, z10, block), j10);
    }

    @Nullable
    public final okhttp3.internal.concurrent.a e() {
        return this.f334051d;
    }

    public final boolean f() {
        return this.f334053f;
    }

    @NotNull
    public final List<okhttp3.internal.concurrent.a> g() {
        return this.f334052e;
    }

    @NotNull
    public final String h() {
        return this.f334049b;
    }

    @NotNull
    public final List<okhttp3.internal.concurrent.a> i() {
        List<okhttp3.internal.concurrent.a> list;
        synchronized (this.f334048a) {
            list = CollectionsKt.toList(this.f334052e);
        }
        return list;
    }

    public final boolean j() {
        return this.f334050c;
    }

    @NotNull
    public final d k() {
        return this.f334048a;
    }

    @NotNull
    public final CountDownLatch l() {
        synchronized (this.f334048a) {
            try {
                if (this.f334051d == null && this.f334052e.isEmpty()) {
                    return new CountDownLatch(0);
                }
                okhttp3.internal.concurrent.a aVar = this.f334051d;
                if (aVar instanceof a) {
                    return ((a) aVar).i();
                }
                for (okhttp3.internal.concurrent.a aVar2 : this.f334052e) {
                    if (aVar2 instanceof a) {
                        return ((a) aVar2).i();
                    }
                }
                a aVar3 = new a();
                if (q(aVar3, 0L, false)) {
                    this.f334048a.i(this);
                }
                return aVar3.i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(@NotNull String name, long j10, @NotNull Function0<Long> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        n(new C2358c(name, block), j10);
    }

    public final void n(@NotNull okhttp3.internal.concurrent.a task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f334048a) {
            try {
                if (!this.f334050c) {
                    if (q(task, j10, false)) {
                        this.f334048a.i(this);
                    }
                    Unit unit = Unit.f312394a;
                } else if (task.a()) {
                    if (d.f334057h.a().isLoggable(Level.FINE)) {
                        okhttp3.internal.concurrent.b.c(task, this, "schedule canceled (queue is shutdown)");
                    }
                } else {
                    if (d.f334057h.a().isLoggable(Level.FINE)) {
                        okhttp3.internal.concurrent.b.c(task, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean q(@NotNull okhttp3.internal.concurrent.a task, long j10, boolean z10) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.e(this);
        long jA = this.f334048a.h().a();
        long j11 = jA + j10;
        int iIndexOf = this.f334052e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j11) {
                if (d.f334057h.a().isLoggable(Level.FINE)) {
                    okhttp3.internal.concurrent.b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f334052e.remove(iIndexOf);
        }
        task.g(j11);
        if (d.f334057h.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + okhttp3.internal.concurrent.b.b(j11 - jA);
            } else {
                str = "scheduled after " + okhttp3.internal.concurrent.b.b(j11 - jA);
            }
            okhttp3.internal.concurrent.b.c(task, this, str);
        }
        Iterator<okhttp3.internal.concurrent.a> it = this.f334052e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().c() - jA > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f334052e.size();
        }
        this.f334052e.add(size, task);
        return size == 0;
    }

    public final void r(@Nullable okhttp3.internal.concurrent.a aVar) {
        this.f334051d = aVar;
    }

    public final void s(boolean z10) {
        this.f334053f = z10;
    }

    public final void t(boolean z10) {
        this.f334050c = z10;
    }

    @NotNull
    public String toString() {
        return this.f334049b;
    }

    public final void u() {
        if (f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f334048a) {
            try {
                this.f334050c = true;
                if (b()) {
                    this.f334048a.i(this);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
