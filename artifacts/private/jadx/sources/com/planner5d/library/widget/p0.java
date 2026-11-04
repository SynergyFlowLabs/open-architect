package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMaterialStyleLabelWithHelperText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialStyleLabelWithHelperText.kt\ncom/planner5d/library/widget/MaterialStyleLabelWithHelperText\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n58#2,2:53\n1#3:55\n*S KotlinDebug\n*F\n+ 1 MaterialStyleLabelWithHelperText.kt\ncom/planner5d/library/widget/MaterialStyleLabelWithHelperText\n*L\n24#1:53,2\n*E\n"})
public final class p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258429c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.t0
    private int f258430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.g1
    private int f258431b;

    public p0(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        int[] LabelWithHelperText = c1.s.Pk;
        Intrinsics.checkNotNullExpressionValue(LabelWithHelperText, "LabelWithHelperText");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LabelWithHelperText, i10, 0);
        this.f258430a = typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.Rk, 0);
        this.f258431b = typedArrayObtainStyledAttributes.getResourceId(c1.s.Sk, c1.r.V5);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(@NotNull TextView view, @androidx.annotation.f1 int i10, @androidx.annotation.f1 @Nullable Integer num) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = view.getContext().getString(i10);
        if (num != null) {
            string = view.getContext().getString(num.intValue());
        } else {
            string = null;
        }
        b(view, string2, string);
    }

    public final void b(@NotNull TextView view, @Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (charSequence2 != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n \n");
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f258430a), spannableStringBuilder.length() - 3, spannableStringBuilder.length(), 33);
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence2);
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, this.f258431b), length, spannableStringBuilder.length(), 33);
        }
        view.setText(spannableStringBuilder);
    }
}
