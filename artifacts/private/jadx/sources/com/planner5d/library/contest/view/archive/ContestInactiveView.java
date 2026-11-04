package com.planner5d.library.contest.view.archive;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.database.model.contest.Contest;
import com.planner5d.library.database.model.contest.ContestWinner;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.widget.d1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestInactiveView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestInactiveView.kt\ncom/planner5d/library/contest/view/archive/ContestInactiveView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,89:1\n257#2,2:90\n*S KotlinDebug\n*F\n+ 1 ContestInactiveView.kt\ncom/planner5d/library/contest/view/archive/ContestInactiveView\n*L\n41#1:90,2\n*E\n"})
public final class ContestInactiveView extends FrameLayout implements d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f153410c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f153411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f153412b;

    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ db.n f153413h;

        a(db.n nVar) {
            this.f153413h = nVar;
            nVar.f269852d.setAvatar(com.planner5d.library.contest.e.g.f150555mc);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void b(boolean z10) {
            if (z10) {
                return;
            }
            this.f153413h.f269852d.setAvatar((Bitmap) null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            this.f153413h.f269852d.setAvatar(bitmap);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContestInactiveView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(com.planner5d.library.contest.view.o oVar, Contest contest, View view) {
        oVar.c(contest);
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        com.planner5d.library.services.bitmaploader.target.a aVar = this.f153411a;
        if (aVar != null) {
            aVar.dispose();
        }
        com.planner5d.library.services.bitmaploader.target.a aVar2 = this.f153412b;
        if (aVar2 != null) {
            aVar2.dispose();
        }
    }

    public final void c(@NotNull final Contest contest, @NotNull eb.a topUser, @NotNull ContestWinner winner, boolean z10, @NotNull p0 formatter, @NotNull o1 languageManager, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull final com.planner5d.library.contest.view.o listener, @NotNull com.planner5d.library.services.q imageManager) {
        Intrinsics.checkNotNullParameter(contest, "contest");
        Intrinsics.checkNotNullParameter(topUser, "topUser");
        Intrinsics.checkNotNullParameter(winner, "winner");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        db.n nVarA = db.n.a(this);
        nVarA.f269859k.setClipToOutline(true);
        ImageView contestArchiveBadge = nVarA.f269851c;
        Intrinsics.checkNotNullExpressionValue(contestArchiveBadge, "contestArchiveBadge");
        contestArchiveBadge.setVisibility(z10 ? 0 : 8);
        nVarA.f269855g.setText(languageManager.b(getContext(), contest.C(), ""));
        nVarA.f269856h.setText(languageManager.b(getContext(), contest.G(), ""));
        String strL = formatter.l(contest.H());
        String strK = formatter.k(contest.z());
        nVarA.f269857i.setText(strL + " — " + strK);
        bitmapTargetManager.d(this.f153412b);
        this.f153412b = bitmapTargetManager.c(new a(nVarA));
        nVarA.f269852d.setContestPlace(topUser.n());
        String strA = z10 ? contest.A() : winner.v();
        com.planner5d.library.contest.data.h hVar = new com.planner5d.library.contest.data.h(imageManager);
        com.planner5d.library.services.bitmaploader.target.a aVar = this.f153411a;
        ImageView contestArchiveWinnerRender = nVarA.f269853e;
        Intrinsics.checkNotNullExpressionValue(contestArchiveWinnerRender, "contestArchiveWinnerRender");
        this.f153411a = hVar.b(bitmapTargetManager, aVar, contestArchiveWinnerRender, strA);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.f150326y1);
        imageManager.b(topUser.q(), dimensionPixelSize, dimensionPixelSize, this.f153412b, -4L);
        nVarA.f269852d.setVotesRateRatio(topUser.p());
        nVarA.f269852d.setUserName(topUser.m());
        nVarA.f269858j.setText(String.valueOf(contest.D()));
        nVarA.f269850b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.archive.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestInactiveView.d(listener, contest, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContestInactiveView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestInactiveView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
