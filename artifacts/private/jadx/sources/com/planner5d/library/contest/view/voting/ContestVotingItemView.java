package com.planner5d.library.contest.view.voting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.ProfileIconView;
import com.planner5d.library.widget.RoundedCornersLayout;
import db.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestVotingItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestVotingItemView.kt\ncom/planner5d/library/contest/view/voting/ContestVotingItemView\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n13409#2:78\n13410#2:81\n257#3,2:79\n257#3,2:82\n257#3,2:84\n257#3,2:86\n257#3,2:88\n*S KotlinDebug\n*F\n+ 1 ContestVotingItemView.kt\ncom/planner5d/library/contest/view/voting/ContestVotingItemView\n*L\n58#1:78\n58#1:81\n59#1:79,2\n64#1:82,2\n68#1:84,2\n69#1:86,2\n71#1:88,2\n*E\n"})
public final class ContestVotingItemView extends RoundedCornersLayout {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f153842n = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final u f153843m;

    @SourceDebugExtension({"SMAP\nContestVotingItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestVotingItemView.kt\ncom/planner5d/library/contest/view/voting/ContestVotingItemView$createBitmapTargetAvatar$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n257#2,2:78\n257#2,2:80\n257#2,2:82\n257#2,2:84\n*S KotlinDebug\n*F\n+ 1 ContestVotingItemView.kt\ncom/planner5d/library/contest/view/voting/ContestVotingItemView$createBitmapTargetAvatar$1\n*L\n38#1:78,2\n39#1:80,2\n44#1:82,2\n45#1:84,2\n*E\n"})
    public static final class a extends com.planner5d.library.services.bitmaploader.target.a {
        a() {
            ContestVotingItemView.this.f153843m.f269899e.setImageBitmap((Bitmap) null);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void b(boolean z10) {
            if (!z10) {
                ContestVotingItemView.this.f153843m.f269899e.setImageBitmap((Bitmap) null);
            }
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void g(Throwable th2) {
            ContestVotingItemView.this.f153843m.f269899e.setImageBitmap(com.planner5d.library.contest.e.g.f150555mc);
            ProfileIconView imageAvatar = ContestVotingItemView.this.f153843m.f269899e;
            Intrinsics.checkNotNullExpressionValue(imageAvatar, "imageAvatar");
            imageAvatar.setVisibility(0);
            CircularProgressIndicator avatarProgress = ContestVotingItemView.this.f153843m.f269896b;
            Intrinsics.checkNotNullExpressionValue(avatarProgress, "avatarProgress");
            avatarProgress.setVisibility(8);
        }

        @Override // com.planner5d.library.services.bitmaploader.target.a
        protected void h(Bitmap bitmap) {
            ContestVotingItemView.this.f153843m.f269899e.setImageBitmap(bitmap);
            ProfileIconView imageAvatar = ContestVotingItemView.this.f153843m.f269899e;
            Intrinsics.checkNotNullExpressionValue(imageAvatar, "imageAvatar");
            imageAvatar.setVisibility(0);
            CircularProgressIndicator avatarProgress = ContestVotingItemView.this.f153843m.f269896b;
            Intrinsics.checkNotNullExpressionValue(avatarProgress, "avatarProgress");
            avatarProgress.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContestVotingItemView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.target.a d() {
        ImageView image = this.f153843m.f269898d;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        return com.planner5d.library.widget.bitmaptarget.a.g(image, null, null, 2, null);
    }

    @NotNull
    public final com.planner5d.library.services.bitmaploader.target.a e() {
        return new a();
    }

    public final void f(@Nullable Boolean bool, @Nullable k3 k3Var, @Nullable k3 k3Var2) {
        CharSequence charSequenceC;
        u uVar = this.f153843m;
        View[] viewArr = {uVar.f269900f, uVar.f269901g, uVar.f269903i, uVar.f269902h, uVar.f269896b};
        for (int i10 = 0; i10 < 5; i10++) {
            View view = viewArr[i10];
            Intrinsics.checkNotNull(view);
            view.setVisibility(8);
        }
        this.f153843m.f269899e.setVisibility(4);
        CharSequence charSequenceC2 = null;
        this.f153843m.f269899e.setImageBitmap((Bitmap) null);
        if (bool == null) {
            this.f153843m.f269897c.setSelected(false);
            return;
        }
        View view2 = bool.booleanValue() ? this.f153843m.f269901g : this.f153843m.f269900f;
        Intrinsics.checkNotNull(view2);
        view2.setVisibility(0);
        this.f153843m.f269897c.setSelected(bool.booleanValue());
        TextView textView = this.f153843m.f269903i;
        if (k3Var2 != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            charSequenceC = k3Var2.c(context);
        } else {
            charSequenceC = null;
        }
        textView.setText(charSequenceC);
        TextView textView2 = this.f153843m.f269902h;
        if (k3Var != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            charSequenceC2 = k3Var.c(context2);
        }
        textView2.setText(charSequenceC2);
        TextView workDescription = this.f153843m.f269903i;
        Intrinsics.checkNotNullExpressionValue(workDescription, "workDescription");
        workDescription.setVisibility(0);
        TextView workAuthor = this.f153843m.f269902h;
        Intrinsics.checkNotNullExpressionValue(workAuthor, "workAuthor");
        workAuthor.setVisibility(0);
        this.f153843m.f269899e.setSelected(bool.booleanValue());
        CircularProgressIndicator avatarProgress = this.f153843m.f269896b;
        Intrinsics.checkNotNullExpressionValue(avatarProgress, "avatarProgress");
        avatarProgress.setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContestVotingItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestVotingItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f153843m = u.b(LayoutInflater.from(context), this);
    }
}
