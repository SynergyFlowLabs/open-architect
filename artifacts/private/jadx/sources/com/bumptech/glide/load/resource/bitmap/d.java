package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class d implements com.bumptech.glide.load.n<BitmapDrawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.n<Drawable> f96964c;

    public d(com.bumptech.glide.load.n<Bitmap> nVar) {
        this.f96964c = (com.bumptech.glide.load.n) com.bumptech.glide.util.k.d(new s(nVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.bumptech.glide.load.engine.v<BitmapDrawable> c(com.bumptech.glide.load.engine.v<Drawable> vVar) {
        if (vVar.get() instanceof BitmapDrawable) {
            return vVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + vVar.get());
    }

    private static com.bumptech.glide.load.engine.v<Drawable> d(com.bumptech.glide.load.engine.v<BitmapDrawable> vVar) {
        return vVar;
    }

    @Override // com.bumptech.glide.load.n
    @NonNull
    public com.bumptech.glide.load.engine.v<BitmapDrawable> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.v<BitmapDrawable> vVar, int i10, int i11) {
        return c(this.f96964c.a(context, d(vVar), i10, i11));
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        this.f96964c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f96964c.equals(((d) obj).f96964c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f96964c.hashCode();
    }
}
