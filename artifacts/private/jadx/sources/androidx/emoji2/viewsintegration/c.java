package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
@b1({b1.a.LIBRARY})
final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f51319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f51320b;

    public static class a {
        public boolean a(@NonNull InputConnection inputConnection, @NonNull Editable editable, @g0(from = 0) int i10, @g0(from = 0) int i11, boolean z10) {
            return androidx.emoji2.text.f.j(inputConnection, editable, i10, i11, z10);
        }

        public void b(@NonNull EditorInfo editorInfo) {
            if (androidx.emoji2.text.f.q()) {
                androidx.emoji2.text.f.c().G(editorInfo);
            }
        }
    }

    c(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable b() {
        return this.f51319a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f51320b.a(this, b(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f51320b.a(this, b(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    c(@NonNull TextView textView, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull a aVar) {
        super(inputConnection, false);
        this.f51319a = textView;
        this.f51320b = aVar;
        aVar.b(editorInfo);
    }
}
