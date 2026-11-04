package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j<Z> extends r<ImageView, Z> implements com.bumptech.glide.request.transition.f.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Animatable f97398j;

    public j(ImageView imageView) {
        super(imageView);
    }

    private void v(@p0 Z z10) {
        if (!(z10 instanceof Animatable)) {
            this.f97398j = null;
            return;
        }
        Animatable animatable = (Animatable) z10;
        this.f97398j = animatable;
        animatable.start();
    }

    private void x(@p0 Z z10) {
        w(z10);
        v(z10);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.i
    public void a() {
        Animatable animatable = this.f97398j;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.request.transition.f.a
    @p0
    public Drawable c() {
        return ((ImageView) this.f97413b).getDrawable();
    }

    @Override // com.bumptech.glide.request.transition.f.a
    public void e(Drawable drawable) {
        ((ImageView) this.f97413b).setImageDrawable(drawable);
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void h(@p0 Drawable drawable) {
        super.h(drawable);
        Animatable animatable = this.f97398j;
        if (animatable != null) {
            animatable.stop();
        }
        x(null);
        e(drawable);
    }

    @Override // com.bumptech.glide.request.target.p
    public void i(@NonNull Z z10, @p0 com.bumptech.glide.request.transition.f<? super Z> fVar) {
        if (fVar != null && fVar.a(z10, this)) {
            v(z10);
            return;
        }
        x(z10);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.manager.i
    public void m() {
        Animatable animatable = this.f97398j;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.request.target.r, com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void n(@p0 Drawable drawable) {
        super.n(drawable);
        x(null);
        e(drawable);
    }

    @Override // com.bumptech.glide.request.target.b, com.bumptech.glide.request.target.p
    public void q(@p0 Drawable drawable) {
        super.q(drawable);
        x(null);
        e(drawable);
    }

    protected abstract void w(@p0 Z z10);

    @Deprecated
    public j(ImageView imageView, boolean z10) {
        super(imageView, z10);
    }
}
