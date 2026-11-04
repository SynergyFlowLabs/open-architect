package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class s implements com.bumptech.glide.load.n<Drawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.n<Bitmap> f97077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f97078d;

    public s(com.bumptech.glide.load.n<Bitmap> nVar, boolean z10) {
        this.f97077c = nVar;
        this.f97078d = z10;
    }

    private com.bumptech.glide.load.engine.v<Drawable> d(Context context, com.bumptech.glide.load.engine.v<Bitmap> vVar) {
        return z.d(context.getResources(), vVar);
    }

    @Override // com.bumptech.glide.load.n
    @NonNull
    public com.bumptech.glide.load.engine.v<Drawable> a(@NonNull Context context, @NonNull com.bumptech.glide.load.engine.v<Drawable> vVar, int i10, int i11) {
        com.bumptech.glide.load.engine.bitmap_recycle.e eVarG = com.bumptech.glide.b.d(context).g();
        Drawable drawable = vVar.get();
        com.bumptech.glide.load.engine.v<Bitmap> vVarA = r.a(eVarG, drawable, i10, i11);
        if (vVarA != null) {
            com.bumptech.glide.load.engine.v<Bitmap> vVarA2 = this.f97077c.a(context, vVarA, i10, i11);
            if (!vVarA2.equals(vVarA)) {
                return d(context, vVarA2);
            }
            vVarA2.a();
            return vVar;
        }
        if (!this.f97078d) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        this.f97077c.b(messageDigest);
    }

    public com.bumptech.glide.load.n<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f97077c.equals(((s) obj).f97077c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f97077c.hashCode();
    }
}
