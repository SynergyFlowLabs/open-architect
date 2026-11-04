package com.google.firebase.inappmessaging.display.internal;

import android.graphics.drawable.Drawable;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.q;
import com.google.firebase.inappmessaging.r;

/* JADX INFO: loaded from: classes5.dex */
public class j implements com.bumptech.glide.request.g<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.inappmessaging.model.i f122406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f122407b;

    public j(com.google.firebase.inappmessaging.model.i iVar, r rVar) {
        this.f122406a = iVar;
        this.f122407b = rVar;
    }

    @Override // com.bumptech.glide.request.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean e(Drawable drawable, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, com.bumptech.glide.load.a aVar, boolean z10) {
        l.a("Image Downloading  Success : " + drawable);
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public boolean c(@p0 q qVar, Object obj, com.bumptech.glide.request.target.p<Drawable> pVar, boolean z10) {
        l.a("Image Downloading  Error : " + qVar.getMessage() + ":" + qVar.getCause());
        if (this.f122406a == null || this.f122407b == null) {
            return false;
        }
        if (qVar.getLocalizedMessage().contains("Failed to decode")) {
            this.f122407b.b(r.b.IMAGE_UNSUPPORTED_FORMAT);
            return false;
        }
        this.f122407b.b(r.b.UNSPECIFIED_RENDER_ERROR);
        return false;
    }
}
