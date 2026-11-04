package io.grpc.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class m implements o2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Logger f289343f = Logger.getLogger(m.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f289344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.c3 f289345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k.a f289346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k f289347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.grpc.c3.d f289348e;

    m(k.a aVar, ScheduledExecutorService scheduledExecutorService, io.grpc.c3 c3Var) {
        this.f289346c = aVar;
        this.f289344a = scheduledExecutorService;
        this.f289345b = c3Var;
    }

    public static /* synthetic */ void b(m mVar) {
        io.grpc.c3.d dVar = mVar.f289348e;
        if (dVar != null && dVar.b()) {
            mVar.f289348e.a();
        }
        mVar.f289347d = null;
    }

    @Override // io.grpc.internal.o2
    public void a(Runnable runnable) {
        this.f289345b.e();
        if (this.f289347d == null) {
            this.f289347d = this.f289346c.get();
        }
        io.grpc.c3.d dVar = this.f289348e;
        if (dVar == null || !dVar.b()) {
            long jA = this.f289347d.a();
            this.f289348e = this.f289345b.c(runnable, jA, TimeUnit.NANOSECONDS, this.f289344a);
            f289343f.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        }
    }

    @Override // io.grpc.internal.o2
    public void reset() {
        this.f289345b.e();
        this.f289345b.execute(new Runnable() { // from class: io.grpc.internal.l
            @Override // java.lang.Runnable
            public final void run() {
                m.b(this.f289319a);
            }
        });
    }
}
