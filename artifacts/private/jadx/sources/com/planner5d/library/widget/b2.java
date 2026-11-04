package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.planner5d.library.databinding.f8;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b2 extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f249609b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f8 f249610a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 3 ^ 0;
    }

    public final void a(@NotNull BigDecimal top, @NotNull BigDecimal bottom, @NotNull String sizeTitle) {
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(sizeTitle, "sizeTitle");
        this.f249610a.f158985c.setText(getContext().getString(com.planner5d.library.f.s.hH, bottom.toString(), sizeTitle));
        this.f249610a.f158984b.setText(getContext().getString(com.planner5d.library.f.s.eH, top.toString(), sizeTitle));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ b2(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public b2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        f8 f8VarB = f8.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(f8VarB, "inflate(...)");
        this.f249610a = f8VarB;
    }
}
