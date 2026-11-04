package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class d implements f<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f97436b;

    public d(int i10, boolean z10) {
        this.f97435a = i10;
        this.f97436b = z10;
    }

    @Override // com.bumptech.glide.request.transition.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable drawableC = aVar.c();
        if (drawableC == null) {
            drawableC = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableC, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f97436b);
        transitionDrawable.startTransition(this.f97435a);
        aVar.e(transitionDrawable);
        return true;
    }
}
