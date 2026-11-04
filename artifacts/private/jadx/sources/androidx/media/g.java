package androidx.media;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(21)
class g extends i {
    g(Context context) {
        super(context);
        this.f52917a = context;
    }

    private boolean d(@NonNull f.c userInfo) {
        return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", userInfo.b(), userInfo.a()) == 0;
    }

    @Override // androidx.media.i, androidx.media.f.a
    public boolean a(@NonNull f.c userInfo) {
        return d(userInfo) || super.a(userInfo);
    }
}
