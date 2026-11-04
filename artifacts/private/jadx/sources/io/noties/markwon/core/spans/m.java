package io.noties.markwon.core.spans;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<TextView> f297584a;

    public m(@NonNull TextView textView) {
        this.f297584a = new WeakReference<>(textView);
    }

    public static void a(@NonNull Spannable spannable, @NonNull TextView textView) {
        m[] mVarArr = (m[]) spannable.getSpans(0, spannable.length(), m.class);
        if (mVarArr != null) {
            for (m mVar : mVarArr) {
                spannable.removeSpan(mVar);
            }
        }
        spannable.setSpan(new m(textView), 0, spannable.length(), 18);
    }

    @p0
    public static TextView c(@NonNull Spanned spanned) {
        m[] mVarArr = (m[]) spanned.getSpans(0, spanned.length(), m.class);
        if (mVarArr == null || mVarArr.length <= 0) {
            return null;
        }
        return mVarArr[0].b();
    }

    @p0
    public static TextView d(@NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return c((Spanned) charSequence);
        }
        return null;
    }

    @p0
    public TextView b() {
        return this.f297584a.get();
    }
}
