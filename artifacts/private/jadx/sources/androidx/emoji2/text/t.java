package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes2.dex */
class t implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f51309a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private Spannable f51310b;

    @w0(24)
    private static class a {
        private a() {
        }

        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof androidx.core.text.g;
        }
    }

    @w0(28)
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.t.b
        boolean a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof androidx.core.text.g);
        }
    }

    t(@NonNull Spannable spannable) {
        this.f51310b = spannable;
    }

    private void a() {
        Spannable spannable = this.f51310b;
        if (!this.f51309a && c().a(spannable)) {
            this.f51310b = new SpannableString(spannable);
        }
        this.f51309a = true;
    }

    static b c() {
        return new c();
    }

    Spannable b() {
        return this.f51310b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f51310b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @w0(api = 24)
    public IntStream chars() {
        return a.a(this.f51310b);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @w0(api = 24)
    public IntStream codePoints() {
        return a.b(this.f51310b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f51310b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f51310b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f51310b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f51310b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f51310b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f51310b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f51310b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f51310b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i10, int i11) {
        return this.f51310b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.f51310b.toString();
    }

    t(@NonNull Spanned spanned) {
        this.f51310b = new SpannableString(spanned);
    }

    t(@NonNull CharSequence charSequence) {
        this.f51310b = new SpannableString(charSequence);
    }
}
