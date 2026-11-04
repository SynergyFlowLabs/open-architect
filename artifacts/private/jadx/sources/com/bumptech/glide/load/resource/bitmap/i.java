package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends com.bumptech.glide.m<i, Bitmap> {
    @NonNull
    public static i n(@NonNull com.bumptech.glide.request.transition.g<Bitmap> gVar) {
        return new i().f(gVar);
    }

    @NonNull
    public static i o() {
        return new i().h();
    }

    @NonNull
    public static i p(int i10) {
        return new i().i(i10);
    }

    @NonNull
    public static i q(@NonNull com.bumptech.glide.request.transition.c.a aVar) {
        return new i().j(aVar);
    }

    @NonNull
    public static i r(@NonNull com.bumptech.glide.request.transition.c cVar) {
        return new i().k(cVar);
    }

    @NonNull
    public static i s(@NonNull com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return new i().l(gVar);
    }

    @NonNull
    public i h() {
        return j(new com.bumptech.glide.request.transition.c.a());
    }

    @NonNull
    public i i(int i10) {
        return j(new com.bumptech.glide.request.transition.c.a(i10));
    }

    @NonNull
    public i j(@NonNull com.bumptech.glide.request.transition.c.a aVar) {
        return l(aVar.a());
    }

    @NonNull
    public i k(@NonNull com.bumptech.glide.request.transition.c cVar) {
        return l(cVar);
    }

    @NonNull
    public i l(@NonNull com.bumptech.glide.request.transition.g<Drawable> gVar) {
        return f(new com.bumptech.glide.request.transition.b(gVar));
    }
}
