package com.google.vr.cardboard;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes5.dex */
public class l implements Handler.Callback, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f126837f = "l";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Choreographer.FrameCallback f126838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f126839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f126840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Choreographer f126841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f126842e;

    public l(Choreographer.FrameCallback frameCallback) {
        this(null, frameCallback);
    }

    public void a() {
        this.f126839b.start();
        Handler handler = new Handler(this.f126839b.getLooper(), this);
        this.f126840c = handler;
        handler.sendEmptyMessage(0);
    }

    public void b() {
        if (this.f126842e) {
            this.f126842e = false;
            this.f126840c.sendEmptyMessage(2);
        }
    }

    public void c() {
        if (this.f126842e) {
            return;
        }
        this.f126842e = true;
        this.f126840c.sendEmptyMessage(1);
    }

    public void d() {
        b();
        this.f126839b.quitSafely();
        try {
            this.f126839b.join();
        } catch (InterruptedException e10) {
            new StringBuilder(String.valueOf(e10).length() + 45);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        this.f126838a.doFrame(j10);
        this.f126841d.postFrameCallback(this);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            if (this.f126841d == null) {
                this.f126841d = Choreographer.getInstance();
            }
            return true;
        }
        if (i10 == 1) {
            this.f126841d.postFrameCallback(this);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        this.f126841d.removeFrameCallback(this);
        return true;
    }

    public l(Choreographer choreographer, Choreographer.FrameCallback frameCallback) {
        this.f126838a = frameCallback;
        this.f126841d = choreographer;
        this.f126839b = new HandlerThread("FrameMonitor");
    }
}
