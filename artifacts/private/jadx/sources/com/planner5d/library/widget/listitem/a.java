package com.planner5d.library.widget.listitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f258233a = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public a(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getCategoryView() {
        View viewFindViewById = findViewById(com.planner5d.library.f.j.f168106h6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (TextView) viewFindViewById;
    }

    private final TextView getSortingView() {
        View viewFindViewById = findViewById(com.planner5d.library.f.j.Ss);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return (TextView) viewFindViewById;
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        getCategoryView().setText(str);
        getSortingView().setText(str2);
    }

    public final void setOnCategoryClickListener(@Nullable View.OnClickListener onClickListener) {
        getCategoryView().setOnClickListener(onClickListener);
    }

    public final void setOnSortingClickListener(@Nullable View.OnClickListener onClickListener) {
        getSortingView().setOnClickListener(onClickListener);
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
        View.inflate(context, com.planner5d.library.f.m.f168906z7, this);
    }
}
