package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
@b1({b1.a.LIBRARY})
final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EditText f51332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f51333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.f.g f51334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51335d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51336e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f51337f = true;

    @w0(19)
    @b1({b1.a.LIBRARY})
    static class a extends androidx.emoji2.text.f.g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference<EditText> f51338a;

        a(EditText editText) {
            this.f51338a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.g
        public void b() {
            Handler handler;
            super.b();
            EditText editText = this.f51338a.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            g.e(this.f51338a.get(), 1);
        }
    }

    g(EditText editText, boolean z10) {
        this.f51332a = editText;
        this.f51333b = z10;
    }

    static void e(@p0 EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().x(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    private boolean i() {
        return (this.f51337f && (this.f51333b || androidx.emoji2.text.f.q())) ? false : true;
    }

    int a() {
        return this.f51336e;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @b1({b1.a.LIBRARY})
    androidx.emoji2.text.f.g b() {
        if (this.f51334c == null) {
            this.f51334c = new a(this.f51332a);
        }
        return this.f51334c;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return this.f51335d;
    }

    public boolean d() {
        return this.f51337f;
    }

    void f(int i10) {
        this.f51336e = i10;
    }

    public void g(boolean z10) {
        if (this.f51337f != z10) {
            if (this.f51334c != null) {
                androidx.emoji2.text.f.c().F(this.f51334c);
            }
            this.f51337f = z10;
            if (z10) {
                e(this.f51332a, androidx.emoji2.text.f.c().i());
            }
        }
    }

    void h(int i10) {
        this.f51335d = i10;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f51332a.isInEditMode() || i() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int i13 = androidx.emoji2.text.f.c().i();
        if (i13 != 0) {
            if (i13 == 1) {
                androidx.emoji2.text.f.c().A((Spannable) charSequence, i10, i10 + i12, this.f51335d, this.f51336e);
                return;
            } else if (i13 != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().B(b());
    }
}
