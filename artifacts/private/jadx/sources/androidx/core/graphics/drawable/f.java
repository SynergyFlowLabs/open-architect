package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(21)
class f extends g {
    protected f(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.g
    void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        t();
        outline.setRoundRect(this.f47777h, c());
    }

    @Override // androidx.core.graphics.drawable.g
    public boolean h() {
        Bitmap bitmap = this.f47770a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // androidx.core.graphics.drawable.g
    public void o(boolean z10) {
        Bitmap bitmap = this.f47770a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z10);
            invalidateSelf();
        }
    }
}
