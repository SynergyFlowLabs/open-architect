package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.t;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f51311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f51312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51313c;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.a$a, reason: collision with other inner class name */
    @w0(19)
    private static class C0464a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f51314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f51315b;

        C0464a(@NonNull EditText editText, boolean z10) {
            this.f51314a = editText;
            g gVar = new g(editText, z10);
            this.f51315b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.b.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        KeyListener a(@p0 KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        boolean b() {
            return this.f51315b.d();
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f51314a, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void d(int i10) {
            this.f51315b.f(i10);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void e(boolean z10) {
            this.f51315b.g(z10);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void f(int i10) {
            this.f51315b.h(i10);
        }
    }

    static class b {
        b() {
        }

        @p0
        KeyListener a(@p0 KeyListener keyListener) {
            return keyListener;
        }

        boolean b() {
            return false;
        }

        InputConnection c(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection;
        }

        void d(int i10) {
        }

        void e(boolean z10) {
        }

        void f(int i10) {
        }
    }

    public a(@NonNull EditText editText) {
        this(editText, true);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int a() {
        return this.f51313c;
    }

    @p0
    public KeyListener b(@p0 KeyListener keyListener) {
        return this.f51311a.a(keyListener);
    }

    public int c() {
        return this.f51312b;
    }

    public boolean d() {
        return this.f51311a.b();
    }

    @p0
    public InputConnection e(@p0 InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f51311a.c(inputConnection, editorInfo);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void f(int i10) {
        this.f51313c = i10;
        this.f51311a.d(i10);
    }

    public void g(boolean z10) {
        this.f51311a.e(z10);
    }

    public void h(@g0(from = 0) int i10) {
        t.j(i10, "maxEmojiCount should be greater than 0");
        this.f51312b = i10;
        this.f51311a.f(i10);
    }

    public a(@NonNull EditText editText, boolean z10) {
        this.f51312b = Integer.MAX_VALUE;
        this.f51313c = 0;
        t.m(editText, "editText cannot be null");
        this.f51311a = new C0464a(editText, z10);
    }
}
