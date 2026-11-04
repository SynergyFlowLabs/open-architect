package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u0 implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f61662b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("messagePool")
    private static final List<b> f61663c = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f61664a;

    private static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private Message f61665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private u0 f61666b;

        private b() {
        }

        private void b() {
            this.f61665a = null;
            this.f61666b = null;
            u0.r(this);
        }

        @Override // androidx.media3.common.util.u.a
        public void a() {
            ((Message) androidx.media3.common.util.a.g(this.f61665a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) androidx.media3.common.util.a.g(this.f61665a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        @z7.a
        public b d(Message message, u0 u0Var) {
            this.f61665a = message;
            this.f61666b = u0Var;
            return this;
        }

        @Override // androidx.media3.common.util.u.a
        public u y1() {
            return (u) androidx.media3.common.util.a.g(this.f61666b);
        }
    }

    public u0(Handler handler) {
        this.f61664a = handler;
    }

    private static b q() {
        b bVar;
        List<b> list = f61663c;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(b bVar) {
        List<b> list = f61663c;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.common.util.u
    public u.a a(int i10) {
        return q().d(this.f61664a.obtainMessage(i10), this);
    }

    @Override // androidx.media3.common.util.u
    public u.a b(int i10, @androidx.annotation.p0 Object obj) {
        return q().d(this.f61664a.obtainMessage(i10, obj), this);
    }

    @Override // androidx.media3.common.util.u
    public void c(@androidx.annotation.p0 Object obj) {
        this.f61664a.removeCallbacksAndMessages(obj);
    }

    @Override // androidx.media3.common.util.u
    public u.a d(int i10, int i11, int i12) {
        return q().d(this.f61664a.obtainMessage(i10, i11, i12), this);
    }

    @Override // androidx.media3.common.util.u
    public u.a e(int i10, int i11, int i12, @androidx.annotation.p0 Object obj) {
        return q().d(this.f61664a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // androidx.media3.common.util.u
    public Looper f() {
        return this.f61664a.getLooper();
    }

    @Override // androidx.media3.common.util.u
    public boolean g(Runnable runnable) {
        return this.f61664a.post(runnable);
    }

    @Override // androidx.media3.common.util.u
    public boolean h(Runnable runnable, long j10) {
        return this.f61664a.postDelayed(runnable, j10);
    }

    @Override // androidx.media3.common.util.u
    public boolean i(int i10) {
        return this.f61664a.sendEmptyMessage(i10);
    }

    @Override // androidx.media3.common.util.u
    public boolean j(int i10, long j10) {
        return this.f61664a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // androidx.media3.common.util.u
    public void k(int i10) {
        androidx.media3.common.util.a.a(i10 != 0);
        this.f61664a.removeMessages(i10);
    }

    @Override // androidx.media3.common.util.u
    public boolean l(int i10, int i11) {
        return this.f61664a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // androidx.media3.common.util.u
    public boolean m(Runnable runnable) {
        return this.f61664a.postAtFrontOfQueue(runnable);
    }

    @Override // androidx.media3.common.util.u
    public boolean n(int i10) {
        androidx.media3.common.util.a.a(i10 != 0);
        return this.f61664a.hasMessages(i10);
    }

    @Override // androidx.media3.common.util.u
    public boolean o(u.a aVar) {
        return ((b) aVar).c(this.f61664a);
    }
}
