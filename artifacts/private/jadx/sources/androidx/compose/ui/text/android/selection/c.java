package androidx.compose.ui.text.android.selection;

import android.text.TextPaint;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@androidx.annotation.w0(29)
public final class c extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f41420f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final CharSequence f41421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final TextPaint f41422e;

    public c(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint) {
        this.f41421d = charSequence;
        this.f41422e = textPaint;
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int e(int i10) {
        TextPaint textPaint = this.f41422e;
        CharSequence charSequence = this.f41421d;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override // androidx.compose.ui.text.android.selection.b
    public int f(int i10) {
        TextPaint textPaint = this.f41422e;
        CharSequence charSequence = this.f41421d;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }
}
