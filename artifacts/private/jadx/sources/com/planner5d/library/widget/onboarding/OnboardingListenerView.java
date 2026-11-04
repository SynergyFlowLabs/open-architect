package com.planner5d.library.widget.onboarding;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import ff.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@l(message = "Remove after fixing navigation issues")
public final class OnboardingListenerView extends FrameLayout implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258426b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private a f258427a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public OnboardingListenerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.planner5d.library.widget.c0
    public boolean onBackPressed() {
        a aVar = this.f258427a;
        return aVar != null && aVar.onBackPressed();
    }

    @Override // ff.a
    public void onOnboardingStepComplete() {
        a aVar = this.f258427a;
        if (aVar != null) {
            aVar.onOnboardingStepComplete();
        }
    }

    public final void setOnboardingListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f258427a = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public OnboardingListenerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OnboardingListenerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public OnboardingListenerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
