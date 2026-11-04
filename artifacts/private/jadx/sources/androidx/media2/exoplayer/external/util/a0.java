package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f57500a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f57501b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f57502c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int priority, int highestPriority) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Priority too low [priority=");
            sb2.append(priority);
            sb2.append(", highest=");
            sb2.append(highestPriority);
            sb2.append("]");
            super(sb2.toString());
        }
    }

    public void a(int priority) {
        synchronized (this.f57500a) {
            try {
                this.f57501b.add(Integer.valueOf(priority));
                this.f57502c = Math.max(this.f57502c, priority);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(int priority) throws InterruptedException {
        synchronized (this.f57500a) {
            while (this.f57502c != priority) {
                try {
                    this.f57500a.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean c(int priority) {
        boolean z10;
        synchronized (this.f57500a) {
            try {
                z10 = this.f57502c == priority;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void d(int priority) throws a {
        synchronized (this.f57500a) {
            try {
                if (this.f57502c != priority) {
                    throw new a(priority, this.f57502c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int priority) {
        synchronized (this.f57500a) {
            try {
                this.f57501b.remove(Integer.valueOf(priority));
                this.f57502c = this.f57501b.isEmpty() ? Integer.MIN_VALUE : ((Integer) q0.i(this.f57501b.peek())).intValue();
                this.f57500a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
