package com.planner5d.library.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.w0;
import com.github.danielnilsson9.colorpickerview.view.d;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextViewWithLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextViewWithLine.kt\ncom/planner5d/library/widget/textview/TextViewWithLine\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n228#2:113\n1#3:114\n*S KotlinDebug\n*F\n+ 1 TextViewWithLine.kt\ncom/planner5d/library/widget/textview/TextViewWithLine\n*L\n26#1:113\n26#1:114\n*E\n"})
public final class TextViewWithLine extends AppCompatTextView {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f258814i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Boolean f258815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f258816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f258817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f258818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Rect f258819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f258820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f258821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f258822h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public TextViewWithLine(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static /* synthetic */ void getCapitalizeFirstChar$annotations() {
    }

    private final float getLongestTextLineWidth() {
        if (getLayout() != null && this.f258816b != null) {
            int lineCount = getLayout().getLineCount();
            int iWidth = 0;
            for (int i10 = 0; i10 < lineCount; i10++) {
                getPaint().getTextBounds(this.f258816b, getLayout().getLineStart(i10), getLayout().getLineEnd(i10), this.f258819e);
                if (this.f258819e.width() > iWidth) {
                    iWidth = this.f258819e.width();
                }
            }
            return iWidth;
        }
        return 0.0f;
    }

    private final void i() {
        float width = getWidth() / 2.0f;
        this.f258820f = getHeight() / 2.0f;
        float longestTextLineWidth = getLongestTextLineWidth() / 2.0f;
        float f10 = this.f258818d;
        this.f258821g = (width - longestTextLineWidth) - f10;
        this.f258822h = width + longestTextLineWidth + f10;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f10 = this.f258820f;
        canvas.drawLine(0.0f, f10, this.f258821g, f10, this.f258817c);
        canvas.drawLine(this.f258822h, this.f258820f, getWidth(), this.f258820f, this.f258817c);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        Boolean bool = this.f258815a;
        if (bool == null) {
            super.setText(charSequence, bufferType);
            return;
        }
        if (bool.booleanValue() && charSequence != null && !StringsKt.w3(charSequence) && !Character.isUpperCase(StringsKt.U6(charSequence))) {
            charSequence = StringsKt.J4(charSequence, 0, 1, String.valueOf(Character.toUpperCase(StringsKt.U6(charSequence))));
        }
        super.setText(charSequence, bufferType);
        this.f258816b = charSequence != null ? charSequence.toString() : null;
        i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public TextViewWithLine(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextViewWithLine(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public TextViewWithLine(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.HC);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Boolean boolValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(c1.s.IC, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f258815a = boolValueOf;
        setText(getText());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(context.getColor(c1.e.Af));
        paint.setStrokeWidth(d.a(context, 1.0f));
        this.f258817c = paint;
        this.f258818d = getResources().getDimension(c1.f.Qd);
        this.f258819e = new Rect();
    }
}
