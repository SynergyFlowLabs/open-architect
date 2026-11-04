package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.h0;
import okhttp3.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f334152f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f334153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f334154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.concurrent.c f334155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f334156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ConcurrentLinkedQueue<f> f334157e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a(@NotNull k connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            return connectionPool.c();
        }

        private a() {
        }
    }

    public static final class b extends okhttp3.internal.concurrent.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(@NotNull okhttp3.internal.concurrent.d taskRunner, int i10, long j10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f334153a = i10;
        this.f334154b = timeUnit.toNanos(j10);
        this.f334155c = taskRunner.j();
        this.f334156d = new b(jk.f.f307491i + " ConnectionPool");
        this.f334157e = new ConcurrentLinkedQueue<>();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int g(f fVar, long j10) {
        if (jk.f.f307490h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> listS = fVar.s();
        int i10 = 0;
        while (i10 < listS.size()) {
            Reference<e> reference = listS.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                Intrinsics.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                okhttp3.internal.platform.h.f334560a.g().o("A connection to " + fVar.b().d().w() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                listS.remove(i10);
                fVar.H(true);
                if (listS.isEmpty()) {
                    fVar.G(j10 - this.f334154b);
                    return 0;
                }
            }
        }
        return listS.size();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x003e A[SYNTHETIC] */
    public final boolean a(@NotNull okhttp3.a address, @NotNull e call, @Nullable List<h0> list, boolean z10) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        for (f connection : this.f334157e) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    try {
                        if (connection.A()) {
                            if (connection.y(address, list)) {
                                call.c(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (connection.y(address, list)) {
                    call.c(connection);
                    return true;
                }
                Unit unit = Unit.f312394a;
            }
        }
        return false;
    }

    public final long b(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : this.f334157e) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                try {
                    if (g(connection, j10) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long jU = j10 - connection.u();
                        if (jU > j11) {
                            fVar = connection;
                            j11 = jU;
                        }
                        Unit unit = Unit.f312394a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        long j12 = this.f334154b;
        if (j11 < j12 && i10 <= this.f334153a) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(fVar);
        synchronized (fVar) {
            try {
                if (!fVar.s().isEmpty()) {
                    return 0L;
                }
                if (fVar.u() + j11 != j10) {
                    return 0L;
                }
                fVar.H(true);
                this.f334157e.remove(fVar);
                jk.f.q(fVar.d());
                if (this.f334157e.isEmpty()) {
                    this.f334155c.a();
                }
                return 0L;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean c(@NotNull f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (jk.f.f307490h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.v() && this.f334153a != 0) {
            okhttp3.internal.concurrent.c.p(this.f334155c, this.f334156d, 0L, 2, null);
            return false;
        }
        connection.H(true);
        this.f334157e.remove(connection);
        if (this.f334157e.isEmpty()) {
            this.f334155c.a();
        }
        return true;
    }

    public final int d() {
        return this.f334157e.size();
    }

    public final void e() {
        Socket socketD;
        Iterator<f> it = this.f334157e.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "connections.iterator()");
        while (it.hasNext()) {
            f connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                try {
                    if (connection.s().isEmpty()) {
                        it.remove();
                        connection.H(true);
                        socketD = connection.d();
                    } else {
                        socketD = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (socketD != null) {
                jk.f.q(socketD);
            }
        }
        if (this.f334157e.isEmpty()) {
            this.f334155c.a();
        }
    }

    public final int f() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<f> concurrentLinkedQueue = this.f334157e;
        int i10 = 0;
        int i11 = 0 << 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (f it : concurrentLinkedQueue) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            synchronized (it) {
                try {
                    zIsEmpty = it.s().isEmpty();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zIsEmpty && (i10 = i10 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    public final void h(@NotNull f connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (jk.f.f307490h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        this.f334157e.add(connection);
        okhttp3.internal.concurrent.c.p(this.f334155c, this.f334156d, 0L, 2, null);
    }
}
