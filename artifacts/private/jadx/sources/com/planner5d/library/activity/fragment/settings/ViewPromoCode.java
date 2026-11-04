package com.planner5d.library.activity.fragment.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.r;
import com.planner5d.library.widget.TextInputEditTextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class ViewPromoCode extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f135203c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Button f135204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final TextInputEditTextCompat f135205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPromoCode(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), com.planner5d.library.f.m.Q8, this);
        TextView textView = (TextView) findViewById(com.planner5d.library.f.j.tv);
        com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
        Context context2 = getContext();
        int i10 = com.planner5d.library.f.h.f167705oa;
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3);
        r.w(textView, cVar.a(context2, i10, Integer.valueOf(androidx.core.content.d.g(context3, com.planner5d.library.f.C1549f.f166476k4))), null, null, null);
        View viewFindViewById = findViewById(com.planner5d.library.f.j.F5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f135204a = (Button) viewFindViewById;
        View viewFindViewById2 = findViewById(com.planner5d.library.f.j.f168379se);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f135205b = (TextInputEditTextCompat) viewFindViewById2;
    }

    @NotNull
    public final Button getButton() {
        return this.f135204a;
    }

    @NotNull
    public final TextInputEditTextCompat getInput() {
        return this.f135205b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPromoCode(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), com.planner5d.library.f.m.Q8, this);
        TextView textView = (TextView) findViewById(com.planner5d.library.f.j.tv);
        com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
        Context context2 = getContext();
        int i10 = com.planner5d.library.f.h.f167705oa;
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3);
        r.w(textView, cVar.a(context2, i10, Integer.valueOf(androidx.core.content.d.g(context3, com.planner5d.library.f.C1549f.f166476k4))), null, null, null);
        View viewFindViewById = findViewById(com.planner5d.library.f.j.F5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f135204a = (Button) viewFindViewById;
        View viewFindViewById2 = findViewById(com.planner5d.library.f.j.f168379se);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f135205b = (TextInputEditTextCompat) viewFindViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPromoCode(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), com.planner5d.library.f.m.Q8, this);
        TextView textView = (TextView) findViewById(com.planner5d.library.f.j.tv);
        com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
        Context context2 = getContext();
        int i11 = com.planner5d.library.f.h.f167705oa;
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3);
        r.w(textView, cVar.a(context2, i11, Integer.valueOf(androidx.core.content.d.g(context3, com.planner5d.library.f.C1549f.f166476k4))), null, null, null);
        View viewFindViewById = findViewById(com.planner5d.library.f.j.F5);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f135204a = (Button) viewFindViewById;
        View viewFindViewById2 = findViewById(com.planner5d.library.f.j.f168379se);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f135205b = (TextInputEditTextCompat) viewFindViewById2;
    }
}
