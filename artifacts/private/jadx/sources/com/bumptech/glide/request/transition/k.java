package com.bumptech.glide.request.transition;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes3.dex */
public class k<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f97446a;

    interface a {
        Animation a(Context context);
    }

    k(a aVar) {
        this.f97446a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r10, f.a aVar) {
        View view = aVar.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(this.f97446a.a(view.getContext()));
        }
        return false;
    }
}
