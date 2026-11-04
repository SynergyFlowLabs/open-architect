package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
final class p1 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ReferenceQueue<p1> f289676c = new ReferenceQueue<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<a, a> f289677d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Logger f289678e = Logger.getLogger(p1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f289679b;

    @com.google.common.annotations.e
    static final class a extends WeakReference<p1> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f289680f = "io.grpc.ManagedChannel.enableAllocationTracking";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final boolean f289681g = Boolean.parseBoolean(System.getProperty(f289680f, com.facebook.internal.z0.P));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RuntimeException f289682h = e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReferenceQueue<p1> f289683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentMap<a, a> f289684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f289685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Reference<RuntimeException> f289686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f289687e;

        a(p1 p1Var, io.grpc.r1 r1Var, ReferenceQueue<p1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(p1Var, referenceQueue);
            this.f289687e = new AtomicBoolean();
            this.f289686d = new SoftReference(f289681g ? new RuntimeException("ManagedChannel allocation site") : f289682h);
            this.f289685c = r1Var.toString();
            this.f289683a = referenceQueue;
            this.f289684b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        @com.google.common.annotations.e
        static int b(ReferenceQueue<p1> referenceQueue) {
            int i10 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i10;
                }
                RuntimeException runtimeException = aVar.f289686d.get();
                aVar.c();
                if (!aVar.f289687e.get()) {
                    i10++;
                    Level level = Level.SEVERE;
                    if (p1.f289678e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                        logRecord.setLoggerName(p1.f289678e.getName());
                        logRecord.setParameters(new Object[]{aVar.f289685c});
                        logRecord.setThrown(runtimeException);
                        p1.f289678e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f289684b.remove(this);
            this.f289686d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (!this.f289687e.getAndSet(true)) {
                clear();
            }
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.f289683a);
        }
    }

    p1(io.grpc.r1 r1Var) {
        this(r1Var, f289676c, f289677d);
    }

    @Override // io.grpc.internal.q0, io.grpc.r1
    public io.grpc.r1 q() {
        this.f289679b.d();
        return super.q();
    }

    @Override // io.grpc.internal.q0, io.grpc.r1
    public io.grpc.r1 r() {
        this.f289679b.d();
        return super.r();
    }

    @com.google.common.annotations.e
    p1(io.grpc.r1 r1Var, ReferenceQueue<p1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(r1Var);
        this.f289679b = new a(this, r1Var, referenceQueue, concurrentMap);
    }
}
