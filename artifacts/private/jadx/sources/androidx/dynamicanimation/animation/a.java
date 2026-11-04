package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.w0;
import androidx.collection.h3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f50970g = 10;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<a> f50971h = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f50975d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h3<b, Long> f50972a = new h3<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f50973b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0457a f50974c = new C0457a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f50976e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f50977f = false;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    class C0457a {
        C0457a() {
        }

        void a() {
            a.this.f50976e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f50976e);
            if (a.this.f50973b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    interface b {
        boolean a(long j10);
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C0457a f50979a;

        c(C0457a c0457a) {
            this.f50979a = c0457a;
        }

        abstract void a();
    }

    private static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f50980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f50981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f50982d;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$d$a, reason: collision with other inner class name */
        class RunnableC0458a implements Runnable {
            RunnableC0458a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f50982d = SystemClock.uptimeMillis();
                d.this.f50979a.a();
            }
        }

        d(C0457a c0457a) {
            super(c0457a);
            this.f50982d = -1L;
            this.f50980b = new RunnableC0458a();
            this.f50981c = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f50981c.postDelayed(this.f50980b, Math.max(10 - (SystemClock.uptimeMillis() - this.f50982d), 0L));
        }
    }

    @w0(16)
    private static class e extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Choreographer f50984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f50985c;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.a$e$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0459a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0459a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                e.this.f50979a.a();
            }
        }

        e(C0457a c0457a) {
            super(c0457a);
            this.f50984b = Choreographer.getInstance();
            this.f50985c = new ChoreographerFrameCallbackC0459a();
        }

        @Override // androidx.dynamicanimation.animation.a.c
        void a() {
            this.f50984b.postFrameCallback(this.f50985c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f50977f) {
            for (int size = this.f50973b.size() - 1; size >= 0; size--) {
                if (this.f50973b.get(size) == null) {
                    this.f50973b.remove(size);
                }
            }
            this.f50977f = false;
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f50971h;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f50976e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f50971h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean g(b bVar, long j10) {
        Long l10 = this.f50972a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f50972a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j10) {
        if (this.f50973b.size() == 0) {
            f().a();
        }
        if (!this.f50973b.contains(bVar)) {
            this.f50973b.add(bVar);
        }
        if (j10 > 0) {
            this.f50972a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f50973b.size(); i10++) {
            b bVar = this.f50973b.get(i10);
            if (bVar != null && g(bVar, jUptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    c f() {
        if (this.f50975d == null) {
            this.f50975d = new e(this.f50974c);
        }
        return this.f50975d;
    }

    public void h(b bVar) {
        this.f50972a.remove(bVar);
        int iIndexOf = this.f50973b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f50973b.set(iIndexOf, null);
            this.f50977f = true;
        }
    }

    public void i(c cVar) {
        this.f50975d = cVar;
    }
}
