package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;
import androidx.annotation.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(26)
public interface w {
    void a(@NotNull View view, int i10, @NotNull AutofillValue autofillValue);

    void b(@NotNull View view, int i10, @NotNull Rect rect);

    void c(@NotNull View view, int i10);

    void cancel();

    void commit();

    void d(@NotNull View view, int i10, @NotNull Rect rect);

    void e(@NotNull View view, int i10, boolean z10);
}
