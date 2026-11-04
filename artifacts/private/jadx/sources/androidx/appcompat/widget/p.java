package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final EditText f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final androidx.emoji2.viewsintegration.a f11492b;

    p(@NonNull EditText editText) {
        this.f11491a = editText;
        this.f11492b = new androidx.emoji2.viewsintegration.a(editText, false);
    }

    @androidx.annotation.p0
    KeyListener a(@androidx.annotation.p0 KeyListener keyListener) {
        return b(keyListener) ? this.f11492b.b(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    boolean c() {
        return this.f11492b.d();
    }

    void d(@androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f11491a.getContext().obtainStyledAttributes(attributeSet, i.a.m.f286658v0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i.a.m.K0) ? typedArrayObtainStyledAttributes.getBoolean(i.a.m.K0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @androidx.annotation.p0
    InputConnection e(@androidx.annotation.p0 InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.f11492b.e(inputConnection, editorInfo);
    }

    void f(boolean z10) {
        this.f11492b.g(z10);
    }
}
