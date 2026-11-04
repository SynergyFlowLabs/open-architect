package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
@b1({b1.a.LIBRARY})
class h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final TransformationMethod f51339a;

    h(@p0 TransformationMethod transformationMethod) {
        this.f51339a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f51339a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@p0 CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f51339a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.f.c().i() != 1) ? charSequence : androidx.emoji2.text.f.c().x(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
        TransformationMethod transformationMethod = this.f51339a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i10, rect);
        }
    }
}
