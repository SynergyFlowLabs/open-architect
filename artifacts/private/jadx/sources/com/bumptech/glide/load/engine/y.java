package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f96770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f96771b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f96772a = 1;

        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).a();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v<?> vVar, boolean z10) {
        try {
            if (this.f96770a || z10) {
                this.f96771b.obtainMessage(1, vVar).sendToTarget();
            } else {
                this.f96770a = true;
                vVar.a();
                this.f96770a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
