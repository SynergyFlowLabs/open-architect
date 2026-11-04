package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    @NotNull
    public static final Spanned a(@NotNull String str, int i10, @Nullable Html.ImageGetter imageGetter, @Nullable Html.TagHandler tagHandler) {
        return c.b(str, i10, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            imageGetter = null;
        }
        if ((i11 & 4) != 0) {
            tagHandler = null;
        }
        return c.b(str, i10, imageGetter, tagHandler);
    }

    @NotNull
    public static final String c(@NotNull Spanned spanned, int i10) {
        return c.c(spanned, i10);
    }

    public static /* synthetic */ String d(Spanned spanned, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c.c(spanned, i10);
    }
}
