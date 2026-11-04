package com.google.firebase.inappmessaging.display.internal;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CountDownTimer f122468a;

    class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f122469a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, long j11, b bVar) {
            super(j10, j11);
            this.f122469a = bVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.f122469a.a();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    public interface b {
        void a();
    }

    @ij.a
    n() {
    }

    public void a() {
        CountDownTimer countDownTimer = this.f122468a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f122468a = null;
        }
    }

    public void b(b bVar, long j10, long j11) {
        this.f122468a = new a(j10, j11, bVar).start();
    }
}
