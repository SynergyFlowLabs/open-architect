package androidx.media2.exoplayer.external.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class i0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f57571a;

    public i0(Handler handler) {
        this.f57571a = handler;
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public Message a(int what) {
        return this.f57571a.obtainMessage(what);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public Message b(int what, @androidx.annotation.p0 Object obj) {
        return this.f57571a.obtainMessage(what, obj);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public void c(@androidx.annotation.p0 Object token) {
        this.f57571a.removeCallbacksAndMessages(token);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public Message d(int what, int arg1, int arg2) {
        return this.f57571a.obtainMessage(what, arg1, arg2);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public Message e(int what, int arg1, int arg2, @androidx.annotation.p0 Object obj) {
        return this.f57571a.obtainMessage(what, arg1, arg2, obj);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public Looper f() {
        return this.f57571a.getLooper();
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public boolean g(Runnable runnable) {
        return this.f57571a.post(runnable);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public boolean h(Runnable runnable, long delayMs) {
        return this.f57571a.postDelayed(runnable, delayMs);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public boolean i(int what) {
        return this.f57571a.sendEmptyMessage(what);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public boolean j(int what, long uptimeMs) {
        return this.f57571a.sendEmptyMessageAtTime(what, uptimeMs);
    }

    @Override // androidx.media2.exoplayer.external.util.n
    public void k(int what) {
        this.f57571a.removeMessages(what);
    }
}
