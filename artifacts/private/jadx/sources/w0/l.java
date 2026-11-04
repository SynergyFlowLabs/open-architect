package w0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class l extends CharacterStyle {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f385862e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f385863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f385864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f385865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f385866d;

    public l(int i10, float f10, float f11, float f12) {
        this.f385863a = i10;
        this.f385864b = f10;
        this.f385865c = f11;
        this.f385866d = f12;
    }

    public final int a() {
        return this.f385863a;
    }

    public final float b() {
        return this.f385864b;
    }

    public final float c() {
        return this.f385865c;
    }

    public final float d() {
        return this.f385866d;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        textPaint.setShadowLayer(this.f385866d, this.f385864b, this.f385865c, this.f385863a);
    }
}
