package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class ButtonWallResizeV2 extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f249432c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f249433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final te.o0 f249434b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ButtonWallResizeV2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void x() {
        te.o0 o0Var = this.f249434b;
        o0Var.f380982d.setSelected(this.f249433a == 0);
        o0Var.f380981c.setSelected(this.f249433a == 1);
        o0Var.f380980b.setSelected(this.f249433a == 2);
    }

    private final void y(ImageView imageView, final int i10) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ButtonWallResizeV2.z(this.f258207a, i10, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(ButtonWallResizeV2 buttonWallResizeV2, int i10, View view) {
        buttonWallResizeV2.f249433a = i10;
        buttonWallResizeV2.x();
    }

    public final int getActive() {
        return this.f249433a;
    }

    public final void setActive(int i10) {
        this.f249433a = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ButtonWallResizeV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 5 << 4;
    }

    public /* synthetic */ ButtonWallResizeV2(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ButtonWallResizeV2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249433a = 1;
        te.o0 o0VarB = te.o0.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(o0VarB, "inflate(...)");
        this.f249434b = o0VarB;
        ImageView start = o0VarB.f380982d;
        Intrinsics.checkNotNullExpressionValue(start, "start");
        y(start, 0);
        ImageView middle = o0VarB.f380981c;
        Intrinsics.checkNotNullExpressionValue(middle, "middle");
        y(middle, 1);
        ImageView end = o0VarB.f380980b;
        Intrinsics.checkNotNullExpressionValue(end, "end");
        y(end, 2);
        x();
    }
}
