package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.n;
import com.bumptech.glide.util.k;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class f implements n<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n<Bitmap> f97146c;

    public f(n<Bitmap> nVar) {
        this.f97146c = (n) k.d(nVar);
    }

    @Override // com.bumptech.glide.load.n
    @NonNull
    public v<c> a(@NonNull Context context, @NonNull v<c> vVar, int i10, int i11) {
        c cVar = vVar.get();
        v<Bitmap> gVar = new com.bumptech.glide.load.resource.bitmap.g(cVar.g(), com.bumptech.glide.b.d(context).g());
        v<Bitmap> vVarA = this.f97146c.a(context, gVar, i10, i11);
        if (!gVar.equals(vVarA)) {
            gVar.a();
        }
        cVar.q(this.f97146c, vVarA.get());
        return vVar;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        this.f97146c.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f97146c.equals(((f) obj).f97146c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f97146c.hashCode();
    }
}
