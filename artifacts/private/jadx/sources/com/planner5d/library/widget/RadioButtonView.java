package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class RadioButtonView extends com.google.android.material.radiobutton.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f249501j = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final p0 f249502i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f249502i = new p0(context, attributeSet, i10);
    }

    public final void b(@androidx.annotation.f1 int i10, @androidx.annotation.f1 int i11) {
        this.f249502i.a(this, i10, Integer.valueOf(i11));
    }

    public final void c(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this.f249502i.b(this, charSequence, charSequence2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioButtonView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioButtonView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c1.c.f250296zg);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
