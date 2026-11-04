package com.planner5d.library.contest.view.prize;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import com.planner5d.library.contest.e;
import db.t;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestPrizeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestPrizeView.kt\ncom/planner5d/library/contest/view/prize/ContestPrizeView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n228#2:46\n1#3:47\n*S KotlinDebug\n*F\n+ 1 ContestPrizeView.kt\ncom/planner5d/library/contest/view/prize/ContestPrizeView\n*L\n20#1:46\n20#1:47\n*E\n"})
public final class ContestPrizeView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f153734b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f153735a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ContestPrizeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setImage(@v int i10) {
        setImage(i10 != 0 ? d.l(getContext(), i10) : null);
    }

    public final void setQuantity(@Nullable String str) {
        this.f153735a.f269893c.setText(str);
    }

    public final void setTitle(@Nullable String str) {
        this.f153735a.f269894d.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public ContestPrizeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setImage(Drawable drawable) {
        this.f153735a.f269892b.setImageDrawable(drawable);
    }

    public /* synthetic */ ContestPrizeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public ContestPrizeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        t tVarA = t.a(View.inflate(context, e.l.I2, this));
        Intrinsics.checkNotNullExpressionValue(tVarA, "bind(...)");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.t.f152828hi);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(e.t.f152851ii, 0);
        if (resourceId != 0) {
            tVarA.f269892b.setImageDrawable(d.l(context, resourceId));
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(e.t.f152876ji, 0);
        if (resourceId2 != 0) {
            tVarA.f269894d.setText(context.getString(resourceId2));
        }
        Unit unit = Unit.f312394a;
        typedArrayObtainStyledAttributes.recycle();
        this.f153735a = tVarA;
    }
}
