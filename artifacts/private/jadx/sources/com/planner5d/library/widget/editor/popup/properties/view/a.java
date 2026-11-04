package com.planner5d.library.widget.editor.popup.properties.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.q;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.databinding.z2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAddButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddButtonView.kt\ncom/planner5d/library/widget/editor/popup/properties/view/AddButtonView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,41:1\n257#2,2:42\n*S KotlinDebug\n*F\n+ 1 AddButtonView.kt\ncom/planner5d/library/widget/editor/popup/properties/view/AddButtonView\n*L\n37#1:42,2\n*E\n"})
public final class a extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f257979b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z2 f257980a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setButtonBackground(int i10) {
        this.f257980a.f160011b.setBackgroundResource(i10);
        requestLayout();
    }

    public final void setButtonImage(int i10) {
        this.f257980a.f160012c.setImageResource(i10);
        requestLayout();
    }

    public final void setButtonSize(@q int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(getResources().getDimensionPixelSize(i10), getResources().getDimensionPixelSize(i10));
        marginLayoutParams.topMargin = getResources().getDimensionPixelSize(com.planner5d.library.f.g.Lh);
        setLayoutParams(marginLayoutParams);
    }

    public final void setLabelVisibility(boolean z10) {
        TextView addButtonLabel = this.f257980a.f160013d;
        Intrinsics.checkNotNullExpressionValue(addButtonLabel, "addButtonLabel");
        addButtonLabel.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        z2 z2VarB = z2.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(z2VarB, "inflate(...)");
        this.f257980a = z2VarB;
    }
}
