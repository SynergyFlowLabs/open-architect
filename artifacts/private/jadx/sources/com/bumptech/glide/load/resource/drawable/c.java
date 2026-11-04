package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.m;
import com.bumptech.glide.request.transition.g;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends m<c, Drawable> {
    @NonNull
    public static c l(@NonNull g<Drawable> gVar) {
        return new c().f(gVar);
    }

    @NonNull
    public static c n() {
        return new c().h();
    }

    @NonNull
    public static c o(int i10) {
        return new c().i(i10);
    }

    @NonNull
    public static c p(@NonNull com.bumptech.glide.request.transition.c.a aVar) {
        return new c().j(aVar);
    }

    @NonNull
    public static c q(@NonNull com.bumptech.glide.request.transition.c cVar) {
        return new c().k(cVar);
    }

    @NonNull
    public c h() {
        return j(new com.bumptech.glide.request.transition.c.a());
    }

    @NonNull
    public c i(int i10) {
        return j(new com.bumptech.glide.request.transition.c.a(i10));
    }

    @NonNull
    public c j(@NonNull com.bumptech.glide.request.transition.c.a aVar) {
        return k(aVar.a());
    }

    @NonNull
    public c k(@NonNull com.bumptech.glide.request.transition.c cVar) {
        return f(cVar);
    }
}
