package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"InlinedApi"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48236a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48237b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48238c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48239d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48240e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48241f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f48242g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f48243h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f48244i = 256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f48245j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f48246k = 63;

    @w0(24)
    static class a {
        private a() {
        }

        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    private c() {
    }

    @NonNull
    public static Spanned a(@NonNull String str, int i10) {
        return a.a(str, i10);
    }

    @NonNull
    public static Spanned b(@NonNull String str, int i10, @p0 Html.ImageGetter imageGetter, @p0 Html.TagHandler tagHandler) {
        return a.b(str, i10, imageGetter, tagHandler);
    }

    @NonNull
    public static String c(@NonNull Spanned spanned, int i10) {
        return a.c(spanned, i10);
    }
}
