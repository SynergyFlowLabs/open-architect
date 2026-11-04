package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes2.dex */
public interface p1 {
    @androidx.annotation.p0
    ColorStateList getSupportBackgroundTintList();

    @androidx.annotation.p0
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@androidx.annotation.p0 ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@androidx.annotation.p0 PorterDuff.Mode mode);
}
