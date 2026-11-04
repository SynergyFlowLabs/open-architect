package io.noties.markwon.utils;

import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class g extends Spannable.Factory {

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f298614a = new g();

        a() {
        }
    }

    @NonNull
    public static g a() {
        return a.f298614a;
    }

    @Override // android.text.Spannable.Factory
    public Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }
}
