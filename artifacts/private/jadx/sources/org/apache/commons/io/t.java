package org.apache.commons.io;

/* JADX INFO: loaded from: classes14.dex */
class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f336825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f336826b;

    private t(Thread thread, long j10) {
        this.f336825a = thread;
        this.f336826b = j10;
    }

    private static void a(long j10) throws InterruptedException {
        long jCurrentTimeMillis = System.currentTimeMillis() + j10;
        do {
            Thread.sleep(j10);
            j10 = jCurrentTimeMillis - System.currentTimeMillis();
        } while (j10 > 0);
    }

    public static Thread b(long j10) {
        return c(Thread.currentThread(), j10);
    }

    public static Thread c(Thread thread, long j10) {
        if (j10 <= 0) {
            return null;
        }
        Thread thread2 = new Thread(new t(thread, j10), t.class.getSimpleName());
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    public static void d(Thread thread) {
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a(this.f336826b);
            this.f336825a.interrupt();
        } catch (InterruptedException unused) {
        }
    }
}
