package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f113932e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f113933f = 1500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f113934g = 2750;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static c f113935h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Object f113936a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Handler f113937b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private C0995c f113938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private C0995c f113939d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0995c) message.obj);
            return true;
        }
    }

    interface b {
        void a();

        void b(int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.c$c, reason: collision with other inner class name */
    private static class C0995c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final WeakReference<b> f113941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f113942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f113943c;

        C0995c(int i10, b bVar) {
            this.f113941a = new WeakReference<>(bVar);
            this.f113942b = i10;
        }

        boolean a(@p0 b bVar) {
            return bVar != null && this.f113941a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(@NonNull C0995c c0995c, int i10) {
        b bVar = c0995c.f113941a.get();
        if (bVar == null) {
            return false;
        }
        this.f113937b.removeCallbacksAndMessages(c0995c);
        bVar.b(i10);
        return true;
    }

    static c c() {
        if (f113935h == null) {
            f113935h = new c();
        }
        return f113935h;
    }

    private boolean g(b bVar) {
        C0995c c0995c = this.f113938c;
        return c0995c != null && c0995c.a(bVar);
    }

    private boolean h(b bVar) {
        C0995c c0995c = this.f113939d;
        return c0995c != null && c0995c.a(bVar);
    }

    private void m(@NonNull C0995c c0995c) {
        int i10 = c0995c.f113942b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : f113934g;
        }
        this.f113937b.removeCallbacksAndMessages(c0995c);
        Handler handler = this.f113937b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0995c), i10);
    }

    private void o() {
        C0995c c0995c = this.f113939d;
        if (c0995c != null) {
            this.f113938c = c0995c;
            this.f113939d = null;
            b bVar = c0995c.f113941a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.f113938c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f113936a) {
            try {
                if (g(bVar)) {
                    a(this.f113938c, i10);
                } else if (h(bVar)) {
                    a(this.f113939d, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void d(@NonNull C0995c c0995c) {
        synchronized (this.f113936a) {
            try {
                if (this.f113938c == c0995c || this.f113939d == c0995c) {
                    a(c0995c, 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(b bVar) {
        boolean zG;
        synchronized (this.f113936a) {
            try {
                zG = g(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zG;
    }

    public boolean f(b bVar) {
        boolean z10;
        synchronized (this.f113936a) {
            try {
                z10 = g(bVar) || h(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void i(b bVar) {
        synchronized (this.f113936a) {
            try {
                if (g(bVar)) {
                    this.f113938c = null;
                    if (this.f113939d != null) {
                        o();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f113936a) {
            try {
                if (g(bVar)) {
                    m(this.f113938c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f113936a) {
            try {
                if (g(bVar)) {
                    C0995c c0995c = this.f113938c;
                    if (!c0995c.f113943c) {
                        c0995c.f113943c = true;
                        this.f113937b.removeCallbacksAndMessages(c0995c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f113936a) {
            try {
                if (g(bVar)) {
                    C0995c c0995c = this.f113938c;
                    if (c0995c.f113943c) {
                        c0995c.f113943c = false;
                        m(c0995c);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n(int i10, b bVar) {
        synchronized (this.f113936a) {
            try {
                if (g(bVar)) {
                    C0995c c0995c = this.f113938c;
                    c0995c.f113942b = i10;
                    this.f113937b.removeCallbacksAndMessages(c0995c);
                    m(this.f113938c);
                    return;
                }
                if (h(bVar)) {
                    this.f113939d.f113942b = i10;
                } else {
                    this.f113939d = new C0995c(i10, bVar);
                }
                C0995c c0995c2 = this.f113938c;
                if (c0995c2 == null || !a(c0995c2, 4)) {
                    this.f113938c = null;
                    o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
