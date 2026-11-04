package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.style.TypefaceSpan;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(28)
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f42110a = new t();

    private t() {
    }

    @NotNull
    public final TypefaceSpan a(@NotNull Typeface typeface) {
        return new TypefaceSpan(typeface);
    }
}
