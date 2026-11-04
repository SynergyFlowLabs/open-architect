package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextView f11493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final androidx.emoji2.viewsintegration.f f11494b;

    q(@NonNull TextView textView) {
        this.f11493a = textView;
        this.f11494b = new androidx.emoji2.viewsintegration.f(textView, false);
    }

    @NonNull
    InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f11494b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f11494b.b();
    }

    void c(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f11493a.getContext().obtainStyledAttributes(attributeSet, i.a.m.f286658v0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i.a.m.K0) ? typedArrayObtainStyledAttributes.getBoolean(i.a.m.K0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void d(boolean z10) {
        this.f11494b.c(z10);
    }

    void e(boolean z10) {
        this.f11494b.d(z10);
    }

    @androidx.annotation.p0
    public TransformationMethod f(@androidx.annotation.p0 TransformationMethod transformationMethod) {
        return this.f11494b.f(transformationMethod);
    }
}
