package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nUrlSwitchCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlSwitchCompat.kt\ncom/planner5d/library/widget/UrlSwitchCompat\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n228#2:45\n1#3:46\n*S KotlinDebug\n*F\n+ 1 UrlSwitchCompat.kt\ncom/planner5d/library/widget/UrlSwitchCompat\n*L\n21#1:45\n21#1:46\n*E\n"})
public final class UrlSwitchCompat extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f249536b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final te.m0 f249537a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public UrlSwitchCompat(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final te.m0 getBinding() {
        return this.f249537a;
    }

    public final void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f249537a.f380962b.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setTitleWithLinks(@Nullable CharSequence charSequence) {
        com.planner5d.library.services.textspan.b.n(this.f249537a.f380963c, charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public UrlSwitchCompat(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UrlSwitchCompat(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public UrlSwitchCompat(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        te.m0 m0VarB = te.m0.b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(m0VarB, "inflate(...)");
        this.f249537a = m0VarB;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.dE, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        TextView textView = m0VarB.f380963c;
        textView.setTextColor(typedArrayObtainStyledAttributes.getColor(c1.s.fE, androidx.core.content.d.g(context, c1.e.f250479gg)));
        textView.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.eE, textView.getResources().getDimensionPixelSize(c1.f.f251196p3)));
        textView.setLineSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.gE, 0), 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
