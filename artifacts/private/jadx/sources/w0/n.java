package w0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class n extends CharacterStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f385869c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f385870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f385871b;

    public n(boolean z10, boolean z11) {
        this.f385870a = z10;
        this.f385871b = z11;
    }

    public final boolean a() {
        return this.f385871b;
    }

    public final boolean b() {
        return this.f385870a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f385870a);
        textPaint.setStrikeThruText(this.f385871b);
    }
}
