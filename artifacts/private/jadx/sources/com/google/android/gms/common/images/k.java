package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.u;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f106455c;

    public k(ImageManager.a aVar, Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.d.c(aVar);
        this.f106455c = new WeakReference(aVar);
    }

    @Override // com.google.android.gms.common.images.l
    protected final void a(@p0 Drawable drawable, boolean z10, boolean z11, boolean z12) {
        ImageManager.a aVar;
        if (z11 || (aVar = (ImageManager.a) this.f106455c.get()) == null) {
            return;
        }
        aVar.a(this.f106456a.f106453a, drawable, z12);
    }

    public final boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        ImageManager.a aVar = (ImageManager.a) this.f106455c.get();
        ImageManager.a aVar2 = (ImageManager.a) kVar.f106455c.get();
        return aVar2 != null && aVar != null && u.b(aVar2, aVar) && u.b(kVar.f106456a, this.f106456a);
    }

    public final int hashCode() {
        return u.c(this.f106456a);
    }
}
