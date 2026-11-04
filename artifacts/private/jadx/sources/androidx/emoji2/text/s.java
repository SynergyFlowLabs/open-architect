package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
@b1({b1.a.LIBRARY_GROUP})
public final class s extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private static Paint f51307g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private TextPaint f51308f;

    public s(@NonNull r rVar) {
        super(rVar);
    }

    @p0
    private TextPaint f(@p0 CharSequence charSequence, int i10, int i11, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f51308f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f51308f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @NonNull
    private static Paint h() {
        if (f51307g == null) {
            TextPaint textPaint = new TextPaint();
            f51307g = textPaint;
            textPaint.setColor(f.c().g());
            f51307g.setStyle(Paint.Style.FILL);
        }
        return f51307g;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, @e.a({"UnknownNullness"}) CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
        TextPaint textPaintF = f(charSequence, i10, i11, paint);
        if (textPaintF != null && textPaintF.bgColor != 0) {
            g(canvas, textPaintF, f10, f10 + e(), i12, i14);
        }
        Paint paint2 = textPaintF;
        if (f.c().r()) {
            canvas.drawRect(f10, i12, f10 + e(), i14, h());
        }
        r rVarD = d();
        float f11 = i13;
        if (paint2 == null) {
            paint2 = paint;
        }
        rVarD.a(canvas, f10, f11, paint2);
    }

    void g(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
