package com.google.vr.ndk.base;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: classes5.dex */
class s extends View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f127253j = "FadeOverlayView";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f127254k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f127255l = 77337733;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f127256m = -16777216;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final long f127257n = 350;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final long f127258o = 1000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f127259s = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f127260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f127261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f127262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f127263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f127264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f127265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f127266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f127267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f127268i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.j();
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != s.f127255l) {
                super.handleMessage(message);
            } else {
                int i10 = 3 ^ 1;
                s.this.i(1, s.f127257n, -16777216);
            }
        }
    }

    public s(Context context, boolean z10) {
        super(context);
        this.f127260a = 0;
        this.f127267h = new a();
        this.f127268i = new b(Looper.getMainLooper());
        setBackgroundColor(-16777216);
        this.f127266g = z10;
    }

    private void b() {
        int i10 = this.f127260a;
        if (i10 == 0) {
            return;
        }
        setVisibility(i10 == 2 ? 0 : 8);
        setAlpha(this.f127260a == 2 ? 1.0f : 0.0f);
        removeCallbacks(this.f127267h);
        this.f127260a = 0;
        this.f127264e = false;
    }

    private void h() {
        this.f127268i.removeMessages(f127255l);
        removeCallbacks(this.f127267h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i10;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f127261b;
        float f10 = jCurrentAnimationTimeMillis / this.f127263d;
        if (this.f127260a == 1) {
            f10 = -f10;
        }
        float fMin = Math.min(Math.max(this.f127262c + f10, 0.0f), 1.0f);
        setAlpha(fMin);
        if (jCurrentAnimationTimeMillis < this.f127263d && getVisibility() != 0) {
            setVisibility(0);
        }
        if (jCurrentAnimationTimeMillis >= this.f127263d || (((i10 = this.f127260a) == 1 && fMin <= 0.0f) || (i10 == 2 && fMin >= 1.0f))) {
            b();
        } else {
            postOnAnimation(this.f127267h);
        }
    }

    public void c() {
        if (this.f127266g) {
            if (this.f127268i.hasMessages(f127255l)) {
                this.f127268i.removeMessages(f127255l);
                this.f127268i.sendEmptyMessageDelayed(f127255l, 200L);
            } else if (!this.f127265f) {
                this.f127264e = true;
            }
        }
    }

    int d() {
        return this.f127260a;
    }

    boolean e() {
        return this.f127265f;
    }

    public void f() {
        if (this.f127265f) {
            this.f127265f = false;
            if (isEnabled() && this.f127266g) {
                h();
                this.f127260a = 2;
                b();
            }
        }
    }

    public void g() {
        if (this.f127265f && getAlpha() == 0.0f) {
            return;
        }
        this.f127265f = true;
        if (isEnabled() && this.f127266g) {
            h();
            this.f127268i.sendEmptyMessageDelayed(f127255l, this.f127264e ? 200L : 1000L);
        } else {
            this.f127260a = 1;
            b();
        }
    }

    public void i(int i10, long j10, int i11) {
        if (isEnabled() && this.f127265f) {
            setBackgroundColor(i11);
            h();
            this.f127260a = i10;
            this.f127263d = j10;
            this.f127261b = AnimationUtils.currentAnimationTimeMillis();
            this.f127262c = getAlpha();
            j();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        if (isEnabled() != z10) {
            super.setEnabled(z10);
            if (!z10) {
                h();
                this.f127260a = 1;
                b();
            }
        }
    }
}
