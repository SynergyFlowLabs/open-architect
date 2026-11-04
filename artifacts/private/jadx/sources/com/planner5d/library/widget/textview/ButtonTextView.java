package com.planner5d.library.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nButtonTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonTextView.kt\ncom/planner5d/library/widget/textview/ButtonTextView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n228#2:32\n1#3:33\n*S KotlinDebug\n*F\n+ 1 ButtonTextView.kt\ncom/planner5d/library/widget/textview/ButtonTextView\n*L\n16#1:32\n16#1:33\n*E\n"})
public final class ButtonTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258808b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f258809a;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ButtonTextView.this.f258809a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ButtonTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ButtonTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ButtonTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public ButtonTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.T5);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.U5, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f258809a = dimensionPixelSize;
        int i11 = 4 & 0;
        if (dimensionPixelSize > 0.0f) {
            setClipToOutline(true);
            setOutlineProvider(new a());
        }
    }
}
