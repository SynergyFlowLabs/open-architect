package com.bumptech.glide.request.transition;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class j<R> implements f<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f97445a;

    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f97445a = aVar;
    }

    @Override // com.bumptech.glide.request.transition.f
    public boolean a(R r10, f.a aVar) {
        if (aVar.getView() != null) {
            this.f97445a.a(aVar.getView());
        }
        return false;
    }
}
