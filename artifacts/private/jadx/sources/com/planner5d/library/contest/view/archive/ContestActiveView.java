package com.planner5d.library.contest.view.archive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.services.utility.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nContestActiveView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestActiveView.kt\ncom/planner5d/library/contest/view/archive/ContestActiveView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,68:1\n257#2,2:69\n257#2,2:71\n*S KotlinDebug\n*F\n+ 1 ContestActiveView.kt\ncom/planner5d/library/contest/view/archive/ContestActiveView\n*L\n29#1:69,2\n30#1:71,2\n*E\n"})
public final class ContestActiveView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f153379a = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContestActiveView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(com.planner5d.library.contest.view.o oVar, Contest contest, View view) {
        oVar.b(contest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(com.planner5d.library.contest.view.o oVar, Contest contest, View view) {
        oVar.a(contest);
    }

    public final void y(@NotNull final Contest contest, boolean z10, boolean z11, @NotNull p0 formatter, @NotNull o1 languageManager, @NotNull final com.planner5d.library.contest.view.o listener) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        db.m mVarA = db.m.a(this);
        db.o oVarA = db.o.a(mVarA.getRoot());
        TextView contestInfoContestantsNumber = oVarA.f269861b;
        Intrinsics.checkNotNullExpressionValue(contestInfoContestantsNumber, "contestInfoContestantsNumber");
        contestInfoContestantsNumber.setVisibility(contest.D() > 0 ? 0 : 8);
        View contestInfoDivider = oVarA.f269862c;
        Intrinsics.checkNotNullExpressionValue(contestInfoDivider, "contestInfoDivider");
        contestInfoDivider.setVisibility(contest.D() > 0 ? 0 : 8);
        oVarA.f269861b.setText(getContext().getString(com.planner5d.library.contest.e.r.M3, Integer.valueOf(contest.D())));
        String strL = formatter.l(contest.H());
        String strK = formatter.k(contest.z());
        oVarA.f269863d.setText(strL + " - " + strK);
        mVarA.f269847e.setText(languageManager.b(getContext(), contest.C(), ""));
        mVarA.f269848f.setText(languageManager.b(getContext(), contest.G(), ""));
        mVarA.f269844b.setEnabled(false);
        if (z11) {
            mVarA.f269844b.setText(com.planner5d.library.contest.e.r.f151438c4);
            mVarA.f269846d.setText(com.planner5d.library.contest.e.r.f151823s3);
        } else {
            if (z10) {
                mVarA.f269844b.setEnabled(true);
                mVarA.f269844b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.archive.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ContestActiveView.z(listener, contest, view);
                    }
                });
                mVarA.f269844b.setText(com.planner5d.library.contest.e.r.L6);
                mVarA.f269846d.setText(com.planner5d.library.contest.e.r.f151750p3);
                return;
            }
            mVarA.f269844b.setEnabled(true);
            mVarA.f269844b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.archive.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContestActiveView.A(listener, contest, view);
                }
            });
            mVarA.f269844b.setText(com.planner5d.library.contest.e.r.J3);
            mVarA.f269846d.setText(com.planner5d.library.contest.e.r.f151798r3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContestActiveView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestActiveView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
