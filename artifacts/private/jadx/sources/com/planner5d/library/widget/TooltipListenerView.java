package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTooltipListenerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TooltipListenerView.kt\ncom/planner5d/library/widget/TooltipListenerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,21:1\n257#2,2:22\n257#2,2:24\n*S KotlinDebug\n*F\n+ 1 TooltipListenerView.kt\ncom/planner5d/library/widget/TooltipListenerView\n*L\n12#1:22,2\n18#1:24,2\n*E\n"})
public final class TooltipListenerView extends r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f249535c = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public TooltipListenerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.planner5d.library.widget.r1, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        setVisibility(8);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.planner5d.library.widget.r1
    public void setListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super.setListener(listener);
        setVisibility(0);
    }

    public /* synthetic */ TooltipListenerView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public TooltipListenerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
