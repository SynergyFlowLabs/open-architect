package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class i1 extends x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f11362b;

    public i1(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f11362b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.x0, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawableA = a(i10);
        Context context = this.f11362b.get();
        if (drawableA != null && context != null) {
            w0.h().x(context, i10, drawableA);
        }
        return drawableA;
    }
}
