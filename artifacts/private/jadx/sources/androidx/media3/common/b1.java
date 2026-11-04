package androidx.media3.common;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f60451a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f60452b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60453c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + "]");
        }
    }

    public void a(int i10) {
        synchronized (this.f60451a) {
            this.f60452b.add(Integer.valueOf(i10));
            this.f60453c = Math.max(this.f60453c, i10);
        }
    }

    public void b(int i10) throws InterruptedException {
        synchronized (this.f60451a) {
            while (this.f60453c != i10) {
                try {
                    this.f60451a.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean c(int i10) {
        boolean z10;
        synchronized (this.f60451a) {
            z10 = this.f60453c == i10;
        }
        return z10;
    }

    public void d(int i10) throws a {
        synchronized (this.f60451a) {
            try {
                if (this.f60453c != i10) {
                    throw new a(i10, this.f60453c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        synchronized (this.f60451a) {
            try {
                this.f60452b.remove(Integer.valueOf(i10));
                this.f60453c = this.f60452b.isEmpty() ? Integer.MIN_VALUE : ((Integer) androidx.media3.common.util.k1.o(this.f60452b.peek())).intValue();
                this.f60451a.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
