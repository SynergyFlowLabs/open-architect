package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.databinding.c8;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.q3;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class UnlockCountdownBannerView extends ConstraintLayout implements com.planner5d.library.widget.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f254351e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.a0 f254352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final s0 f254353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private p2 f254354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c8 f254355d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public UnlockCountdownBannerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.planner5d.library.widget.q
    public void cancelCountdown() {
        p2 p2Var = this.f254354c;
        if (p2Var != null) {
            p2.a.b(p2Var, null, 1, null);
        }
        this.f254354c = null;
    }

    @Override // com.planner5d.library.widget.q
    @NotNull
    public p2 createCountDownJob(int i10, @NotNull Function0<Unit> function0) {
        return com.planner5d.library.widget.q.a.a(this, i10, function0);
    }

    @Override // com.planner5d.library.widget.q
    public void destroy() {
        com.planner5d.library.widget.q.a.b(this);
    }

    @Override // com.planner5d.library.widget.q
    public int doEverySecond(int i10) {
        TextView textView = this.f254355d.f158828d;
        String string = getResources().getString(com.planner5d.library.f.s.tG);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i10 / 3600), Integer.valueOf((i10 / 60) % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
        return i10;
    }

    @Override // com.planner5d.library.widget.q
    @NotNull
    public s0 getScope() {
        return this.f254353b;
    }

    @Override // com.planner5d.library.widget.q
    @NotNull
    public kotlinx.coroutines.a0 getScopeJob() {
        return this.f254352a;
    }

    public final void setOnButtonClickListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f254355d.f158826b.setOnClickListener(listener);
    }

    @Override // com.planner5d.library.widget.q
    public void startCountdown(int i10, @NotNull Function0<Unit> onTimeRanOut) {
        Intrinsics.checkNotNullParameter(onTimeRanOut, "onTimeRanOut");
        this.f254354c = createCountDownJob(i10, onTimeRanOut);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public UnlockCountdownBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UnlockCountdownBannerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public UnlockCountdownBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        kotlinx.coroutines.a0 a0VarC = q3.c(null, 1, null);
        this.f254352a = a0VarC;
        this.f254353b = t0.a(l1.e().plus(a0VarC));
        c8 c8VarB = c8.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c8VarB, "inflate(...)");
        this.f254355d = c8VarB;
        setBackground(androidx.core.content.d.l(context, com.planner5d.library.f.h.f167890y5));
    }
}
