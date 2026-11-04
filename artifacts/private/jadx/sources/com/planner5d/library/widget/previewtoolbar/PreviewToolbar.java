package com.planner5d.library.widget.previewtoolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.a2;
import com.planner5d.library.widget.c1;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class PreviewToolbar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f258627a = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public PreviewToolbar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setAlpha(z10 ? 1.0f : 0.5f);
        Iterator<View> it = a2.e(this).iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public PreviewToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PreviewToolbar(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public PreviewToolbar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setBackgroundResource(c1.g.f251646s2);
    }
}
