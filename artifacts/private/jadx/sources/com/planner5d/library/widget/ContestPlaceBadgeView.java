package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.planner5d.library.services.utility.c3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestPlaceBadgeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestPlaceBadgeView.kt\ncom/planner5d/library/widget/ContestPlaceBadgeView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,51:1\n257#2,2:52\n257#2,2:54\n*S KotlinDebug\n*F\n+ 1 ContestPlaceBadgeView.kt\ncom/planner5d/library/widget/ContestPlaceBadgeView\n*L\n27#1:52,2\n34#1:54,2\n*E\n"})
public final class ContestPlaceBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f249440b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final te.p f249441a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestPlaceBadgeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Drawable a(int i10) {
        int i11;
        if (i10 == 1) {
            i11 = c1.e.f250641ng;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? c1.e.f250778tf : c1.e.f250548jf;
        } else {
            i11 = c1.e.f250893yf;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(androidx.core.content.d.g(getContext(), i11));
        return gradientDrawable;
    }

    public final void setPlace(@Nullable Integer num) {
        if (num == null) {
            this.f249441a.f380985c.setVisibility(4);
            ImageView cupImage = this.f249441a.f380984b;
            Intrinsics.checkNotNullExpressionValue(cupImage, "cupImage");
            cupImage.setVisibility(8);
            return;
        }
        boolean z10 = true;
        if (num.intValue() != 1) {
            z10 = false;
        }
        this.f249441a.f380985c.setVisibility(0);
        this.f249441a.f380985c.setBackground(a(num.intValue()));
        this.f249441a.f380985c.setText(z10 ? null : c3.j(num.intValue()));
        ImageView cupImage2 = this.f249441a.f380984b;
        Intrinsics.checkNotNullExpressionValue(cupImage2, "cupImage");
        cupImage2.setVisibility(z10 ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestPlaceBadgeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ContestPlaceBadgeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestPlaceBadgeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249441a = te.p.a(View.inflate(context, c1.l.f252154f2, this));
    }
}
