package io.noties.markwon.core.spans;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Layout> f297583a;

    l(@NonNull Layout layout) {
        this.f297583a = new WeakReference<>(layout);
    }

    public static void a(@NonNull Spannable spannable, @NonNull Layout layout) {
        l[] lVarArr = (l[]) spannable.getSpans(0, spannable.length(), l.class);
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                spannable.removeSpan(lVar);
            }
        }
        spannable.setSpan(new l(layout), 0, spannable.length(), 18);
    }

    @p0
    public static Layout c(@NonNull Spanned spanned) {
        l[] lVarArr = (l[]) spanned.getSpans(0, spanned.length(), l.class);
        if (lVarArr == null || lVarArr.length <= 0) {
            return null;
        }
        return lVarArr[0].b();
    }

    @p0
    public static Layout d(@NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return c((Spanned) charSequence);
        }
        return null;
    }

    @p0
    public Layout b() {
        return this.f297583a.get();
    }
}
