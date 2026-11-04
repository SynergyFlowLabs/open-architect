package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f289222c = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f289223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f289224b;

    @gj.d
    public final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ boolean f289225c = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f289226a;

        public void a() {
            long j10 = this.f289226a;
            long jMax = Math.max(2 * j10, j10);
            if (h.this.f289224b.compareAndSet(this.f289226a, jMax)) {
                h.f289222c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{h.this.f289223a, Long.valueOf(jMax)});
            }
        }

        public long b() {
            return this.f289226a;
        }

        private b(long j10) {
            this.f289226a = j10;
        }
    }

    public h(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.f289224b = atomicLong;
        com.google.common.base.j0.e(j10 > 0, "value must be positive");
        this.f289223a = str;
        atomicLong.set(j10);
    }

    public b d() {
        return new b(this.f289224b.get());
    }
}
