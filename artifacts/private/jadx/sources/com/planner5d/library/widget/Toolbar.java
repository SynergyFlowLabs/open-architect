package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class Toolbar extends androidx.appcompat.widget.Toolbar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f249533b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f249534a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249534a = -1;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(com.planner5d.library.widget.drawable.c.f254258a.i(drawable, Integer.valueOf(this.f249534a)));
    }

    public final void w(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        this.f249534a = i10;
        setTitleTextColor(i10);
        setSubtitleTextColor(i10);
        setBackgroundColor(i11);
        setNavigationIcon(getNavigationIcon());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249534a = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Toolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249534a = -1;
    }
}
