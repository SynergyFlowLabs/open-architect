package com.bumptech.glide.load;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.v;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class h<T> implements n<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<? extends n<T>> f96794c;

    @SafeVarargs
    public h(@NonNull n<T>... nVarArr) {
        if (nVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f96794c = Arrays.asList(nVarArr);
    }

    @Override // com.bumptech.glide.load.n
    @NonNull
    public v<T> a(@NonNull Context context, @NonNull v<T> vVar, int i10, int i11) {
        Iterator<? extends n<T>> it = this.f96794c.iterator();
        v<T> vVar2 = vVar;
        while (it.hasNext()) {
            v<T> vVarA = it.next().a(context, vVar2, i10, i11);
            if (vVar2 != null && !vVar2.equals(vVar) && !vVar2.equals(vVarA)) {
                vVar2.a();
            }
            vVar2 = vVarA;
        }
        return vVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void b(@NonNull MessageDigest messageDigest) {
        Iterator<? extends n<T>> it = this.f96794c.iterator();
        while (it.hasNext()) {
            it.next().b(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f96794c.equals(((h) obj).f96794c);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f96794c.hashCode();
    }

    public h(@NonNull Collection<? extends n<T>> collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f96794c = collection;
    }
}
