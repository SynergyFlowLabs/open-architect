package com.google.android.gms.common.images;

import android.net.Uri;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.u;

/* JADX INFO: loaded from: classes4.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f106453a;

    public i(Uri uri) {
        this.f106453a = uri;
    }

    public final boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return u.b(((i) obj).f106453a, this.f106453a);
        }
        return false;
    }

    public final int hashCode() {
        return u.c(this.f106453a);
    }
}
