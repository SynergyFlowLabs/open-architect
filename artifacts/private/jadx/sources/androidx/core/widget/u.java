package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public interface u {
    @p0
    ColorStateList getSupportCheckMarkTintList();

    @p0
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@p0 ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(@p0 PorterDuff.Mode mode);
}
