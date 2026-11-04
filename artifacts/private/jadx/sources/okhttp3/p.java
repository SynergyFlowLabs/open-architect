package okhttp3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,241:1\n1#2:242\n615#3,4:243\n1549#4:247\n1620#4,3:248\n1549#4:251\n1620#4,3:252\n*S KotlinDebug\n*F\n+ 1 Dispatcher.kt\nokhttp3/Dispatcher\n*L\n162#1:243,4\n222#1:247\n222#1:248,3\n227#1:251\n227#1:252,3\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f334742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f334743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Runnable f334744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private ExecutorService f334745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<okhttp3.internal.connection.e.a> f334746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<okhttp3.internal.connection.e.a> f334747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<okhttp3.internal.connection.e> f334748g;

    public p() {
        this.f334742a = 64;
        this.f334743b = 5;
        this.f334746e = new ArrayDeque<>();
        this.f334747f = new ArrayDeque<>();
        this.f334748g = new ArrayDeque<>();
    }

    private final okhttp3.internal.connection.e.a f(String str) {
        for (okhttp3.internal.connection.e.a aVar : this.f334747f) {
            if (Intrinsics.areEqual(aVar.d(), str)) {
                return aVar;
            }
        }
        for (okhttp3.internal.connection.e.a aVar2 : this.f334746e) {
            if (Intrinsics.areEqual(aVar2.d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final <T> void g(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f334744c;
            Unit unit = Unit.f312394a;
        }
        if (m() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean m() {
        int i10;
        boolean z10;
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<okhttp3.internal.connection.e.a> it = this.f334746e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    okhttp3.internal.connection.e.a asyncCall = it.next();
                    if (this.f334747f.size() >= this.f334742a) {
                        break;
                    }
                    if (asyncCall.c().get() < this.f334743b) {
                        it.remove();
                        asyncCall.c().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f334747f.add(asyncCall);
                    }
                }
                z10 = q() > 0;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((okhttp3.internal.connection.e.a) arrayList.get(i10)).a(e());
        }
        return z10;
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @b1(expression = "executorService", imports = {}))
    @oj.i(name = "-deprecated_executorService")
    @NotNull
    public final ExecutorService a() {
        return e();
    }

    public final synchronized void b() {
        try {
            Iterator<okhttp3.internal.connection.e.a> it = this.f334746e.iterator();
            while (it.hasNext()) {
                it.next().b().cancel();
            }
            Iterator<okhttp3.internal.connection.e.a> it2 = this.f334747f.iterator();
            while (it2.hasNext()) {
                it2.next().b().cancel();
            }
            Iterator<okhttp3.internal.connection.e> it3 = this.f334748g.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(@NotNull okhttp3.internal.connection.e.a call) {
        okhttp3.internal.connection.e.a aVarF;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f334746e.add(call);
                if (!call.b().o() && (aVarF = f(call.d())) != null) {
                    call.f(aVarF);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m();
    }

    public final synchronized void d(@NotNull okhttp3.internal.connection.e call) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            this.f334748g.add(call);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @oj.i(name = "executorService")
    @NotNull
    public final synchronized ExecutorService e() {
        ExecutorService executorService;
        try {
            if (this.f334745d == null) {
                this.f334745d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), jk.f.Y(jk.f.f307491i + " Dispatcher", false));
            }
            executorService = this.f334745d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void h(@NotNull okhttp3.internal.connection.e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.c().decrementAndGet();
        g(this.f334747f, call);
    }

    public final void i(@NotNull okhttp3.internal.connection.e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        g(this.f334748g, call);
    }

    @Nullable
    public final synchronized Runnable j() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334744c;
    }

    public final synchronized int k() {
        return this.f334742a;
    }

    public final synchronized int l() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334743b;
    }

    @NotNull
    public final synchronized List<e> n() {
        List<e> listUnmodifiableList;
        try {
            ArrayDeque<okhttp3.internal.connection.e.a> arrayDeque = this.f334746e;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((okhttp3.internal.connection.e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized int o() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f334746e.size();
    }

    @NotNull
    public final synchronized List<e> p() {
        List<e> listUnmodifiableList;
        try {
            ArrayDeque<okhttp3.internal.connection.e> arrayDeque = this.f334748g;
            ArrayDeque<okhttp3.internal.connection.e.a> arrayDeque2 = this.f334747f;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((okhttp3.internal.connection.e.a) it.next()).b());
            }
            listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.plus((Collection) arrayDeque, (Iterable) arrayList));
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized int q() {
        return this.f334747f.size() + this.f334748g.size();
    }

    public final synchronized void r(@Nullable Runnable runnable) {
        try {
            this.f334744c = runnable;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void s(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            try {
                this.f334742a = i10;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m();
    }

    public final void t(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            try {
                this.f334743b = i10;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(@NotNull ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.f334745d = executorService;
    }
}
