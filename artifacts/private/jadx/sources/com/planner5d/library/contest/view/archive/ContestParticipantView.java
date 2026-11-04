package com.planner5d.library.contest.view.archive;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import db.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class ContestParticipantView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f153414b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final s f153415a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestParticipantView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAvatar(@Nullable Bitmap bitmap) {
        this.f153415a.f269887b.setImageBitmap(bitmap);
    }

    public final void setContestPlace(@Nullable Integer num) {
        this.f153415a.f269888c.setPlace(num);
    }

    public final void setUserName(@Nullable String str) {
        this.f153415a.f269889d.setText(str);
    }

    public final void setVotesRateRatio(@Nullable Integer num) {
        this.f153415a.f269890e.setText(getContext().getString(com.planner5d.library.contest.e.r.f151919w3, Integer.valueOf(num != null ? num.intValue() : 0)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestParticipantView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setAvatar(@v int i10) {
        this.f153415a.f269887b.setImageBitmap(i10);
    }

    public /* synthetic */ ContestParticipantView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestParticipantView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        s sVarA = s.a(View.inflate(context, com.planner5d.library.contest.e.l.G2, this));
        Intrinsics.checkNotNullExpressionValue(sVarA, "bind(...)");
        this.f153415a = sVarA;
    }
}
