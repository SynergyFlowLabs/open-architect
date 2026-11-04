package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.bumptech.glide.load.engine.v;

/* JADX INFO: loaded from: classes3.dex */
final class d extends b<Drawable> {
    private d(Drawable drawable) {
        super(drawable);
    }

    @p0
    static v<Drawable> d(@p0 Drawable drawable) {
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.v
    public void a() {
    }

    @Override // com.bumptech.glide.load.engine.v
    @NonNull
    public Class<Drawable> b() {
        return this.f97110a.getClass();
    }

    @Override // com.bumptech.glide.load.engine.v
    public int getSize() {
        return Math.max(1, this.f97110a.getIntrinsicWidth() * this.f97110a.getIntrinsicHeight() * 4);
    }
}
