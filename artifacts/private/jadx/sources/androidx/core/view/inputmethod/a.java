package androidx.core.view.inputmethod;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.util.t;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"PrivateConstructorForUtilityClass"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48808a = 16777216;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48809b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f48810c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48811d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48812e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48813f = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48814g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48815h = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final String f48816i = "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l1
    static final int f48817j = 2048;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    static final int f48818k = 1024;

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.a$a, reason: collision with other inner class name */
    @w0(30)
    private static class C0415a {
        private C0415a() {
        }

        static CharSequence a(@NonNull EditorInfo editorInfo, int i10) {
            return editorInfo.getInitialSelectedText(i10);
        }

        static CharSequence b(@NonNull EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextAfterCursor(i10, i11);
        }

        static CharSequence c(@NonNull EditorInfo editorInfo, int i10, int i11) {
            return editorInfo.getInitialTextBeforeCursor(i10, i11);
        }

        static void d(@NonNull EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    @w0(35)
    private static class b {
        private b() {
        }

        static boolean a(@NonNull EditorInfo editorInfo) {
            return editorInfo.isStylusHandwritingEnabled();
        }

        static void b(@NonNull EditorInfo editorInfo, boolean z10) {
            editorInfo.setStylusHandwritingEnabled(z10);
        }
    }

    @Deprecated
    public a() {
    }

    @NonNull
    public static String[] a(@NonNull EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : f48810c;
    }

    @p0
    public static CharSequence b(@NonNull EditorInfo editorInfo, int i10) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C0415a.a(editorInfo, i10);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i11 = editorInfo.extras.getInt(f48814g);
        int i12 = editorInfo.extras.getInt(f48815h);
        int i13 = iMax - iMin;
        if (editorInfo.initialSelStart >= 0 && editorInfo.initialSelEnd >= 0 && i12 - i11 == i13 && (charSequence = editorInfo.extras.getCharSequence(f48813f)) != null) {
            return (i10 & 1) != 0 ? charSequence.subSequence(i11, i12) : TextUtils.substring(charSequence, i11, i12);
        }
        return null;
    }

    @p0
    public static CharSequence c(@NonNull EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C0415a.b(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f48813f)) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt(f48815h);
        int iMin = Math.min(i10, charSequence.length() - i12);
        return (i11 & 1) != 0 ? charSequence.subSequence(i12, iMin + i12) : TextUtils.substring(charSequence, i12, iMin + i12);
    }

    @p0
    public static CharSequence d(@NonNull EditorInfo editorInfo, int i10, int i11) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return C0415a.c(editorInfo, i10, i11);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f48813f)) == null) {
            return null;
        }
        int i12 = editorInfo.extras.getInt(f48814g);
        int iMin = Math.min(i10, i12);
        return (i11 & 1) != 0 ? charSequence.subSequence(i12 - iMin, i12) : TextUtils.substring(charSequence, i12 - iMin, i12);
    }

    static int e(EditorInfo editorInfo) {
        return 1;
    }

    private static boolean f(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    private static boolean g(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    public static boolean h(@NonNull EditorInfo editorInfo) {
        Bundle bundle = editorInfo.extras;
        if (bundle != null && bundle.containsKey(f48816i)) {
            return editorInfo.extras.getBoolean(f48816i);
        }
        if (androidx.core.os.b.m()) {
            return b.a(editorInfo);
        }
        return false;
    }

    public static void i(@NonNull EditorInfo editorInfo, @p0 String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    public static void j(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence, int i10) {
        t.l(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C0415a.d(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            m(editorInfo, null, 0, 0);
            return;
        }
        if (g(editorInfo.inputType)) {
            m(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m(editorInfo, charSequence, i13, i14);
        } else {
            n(editorInfo, charSequence, i13, i14);
        }
    }

    public static void k(@NonNull EditorInfo editorInfo, @NonNull CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0415a.d(editorInfo, charSequence, 0);
        } else {
            j(editorInfo, charSequence, 0);
        }
    }

    public static void l(@NonNull EditorInfo editorInfo, boolean z10) {
        if (androidx.core.os.b.m()) {
            b.b(editorInfo, z10);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean(f48816i, z10);
    }

    private static void m(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f48813f, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f48814g, i10);
        editorInfo.extras.putInt(f48815h, i11);
    }

    private static void n(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int iMin = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int iMin2 = Math.min(i10, i14 - iMin);
        int i15 = i10 - iMin2;
        if (f(charSequence, i15, 0)) {
            i15++;
            iMin2--;
        }
        if (f(charSequence, (i11 + iMin) - 1, 1)) {
            iMin--;
        }
        m(editorInfo, i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + iMin2), charSequence.subSequence(i11, iMin + i11)) : charSequence.subSequence(i15, iMin2 + i13 + iMin + i15), iMin2, i13 + iMin2);
    }
}
