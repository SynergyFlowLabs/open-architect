package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(26)
@kotlin.l(message = "Only used by deprecated APIs in this file, remove with them.")
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f42090a = new k();

    private k() {
    }

    @w0(26)
    @NotNull
    public final Typeface a(@NotNull Context context, int i10) {
        return context.getResources().getFont(i10);
    }
}
