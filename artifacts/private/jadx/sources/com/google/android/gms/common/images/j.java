package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.u;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f106454c;

    public j(ImageView imageView, int i10) {
        super(Uri.EMPTY, i10);
        com.google.android.gms.common.internal.d.c(imageView);
        this.f106454c = new WeakReference(imageView);
    }

    @Override // com.google.android.gms.common.images.l
    protected final void a(@p0 Drawable drawable, boolean z10, boolean z11, boolean z12) {
        ImageView imageView = (ImageView) this.f106454c.get();
        if (imageView != null) {
            if (!z11 && !z12 && (imageView instanceof com.google.android.gms.internal.base.j)) {
                throw null;
            }
            boolean z13 = false;
            if (!z11 && !z10) {
                z13 = true;
            }
            if (z13) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof com.google.android.gms.internal.base.i) {
                    drawable2 = ((com.google.android.gms.internal.base.i) drawable2).a();
                }
                drawable = new com.google.android.gms.internal.base.i(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof com.google.android.gms.internal.base.j) {
                throw null;
            }
            if (drawable == null || !z13) {
                return;
            }
            ((com.google.android.gms.internal.base.i) drawable).b(250);
        }
    }

    public final boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        ImageView imageView = (ImageView) this.f106454c.get();
        ImageView imageView2 = (ImageView) ((j) obj).f106454c.get();
        return (imageView2 == null || imageView == null || !u.b(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    public j(ImageView imageView, Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.d.c(imageView);
        this.f106454c = new WeakReference(imageView);
    }
}
