package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class m<Z> extends e<Z> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f97405e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Handler f97406f = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.l f97407d;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((m) message.obj).c();
            return true;
        }
    }

    private m(com.bumptech.glide.l lVar, int i10, int i11) {
        super(i10, i11);
        this.f97407d = lVar;
    }

    public static <Z> m<Z> e(com.bumptech.glide.l lVar, int i10, int i11) {
        return new m<>(lVar, i10, i11);
    }

    void c() {
        this.f97407d.B(this);
    }

    @Override // com.bumptech.glide.request.target.p
    public void h(@p0 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.p
    public void i(@NonNull Z z10, @p0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        f97406f.obtainMessage(1, this).sendToTarget();
    }
}
