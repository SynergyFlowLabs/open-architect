package com.planner5d.library.activity.fragment.list.holders;

import android.content.Context;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.planner5d.library.activity.fragment.list.l1;
import com.planner5d.library.databinding.p5;
import com.planner5d.library.databinding.q5;
import com.planner5d.library.widget.EnhancedRecyclerView;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMainListViewHolderRecognitionInProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainListViewHolderRecognitionInProgress.kt\ncom/planner5d/library/activity/fragment/list/holders/MainListViewHolderRecognitionInProgress\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class r0 extends com.planner5d.library.activity.fragment.list.holders.a<Date> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f134182g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f134183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.utility.p0 f134184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final TextView f134185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ImageView f134186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Animatable2.AnimationCallback f134187f;

    public static final class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            ((AnimatedVectorDrawable) drawable).start();
        }
    }

    public r0(@NotNull Context context, @NotNull final l1 viewModel, @NotNull com.planner5d.library.services.utility.p0 formatter) {
        b4.b bVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.list.holders.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r0.j(viewModel, view);
            }
        };
        EnhancedRecyclerView.e eVarF = viewModel.S0().f();
        EnhancedRecyclerView.e eVar = EnhancedRecyclerView.e.GRID;
        if (eVarF == eVar) {
            p5 p5VarC = p5.c(layoutInflaterFrom);
            p5VarC.f159508c.setOnClickListener(onClickListener);
            Intrinsics.checkNotNull(p5VarC);
            bVar = p5VarC;
        } else {
            q5 q5VarC = q5.c(layoutInflaterFrom);
            q5VarC.getRoot().setOnClickListener(onClickListener);
            Intrinsics.checkNotNull(q5VarC);
            bVar = q5VarC;
        }
        View root = bVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
        this.f134183b = context;
        this.f134184c = formatter;
        if (viewModel.S0().f() == eVar) {
            p5 p5VarA = p5.a(this.itemView);
            this.f134185d = p5VarA.f159511f;
            this.f134186e = p5VarA.f159509d;
        } else {
            q5 q5VarA = q5.a(this.itemView);
            this.f134185d = q5VarA.f159571d;
            this.f134186e = q5VarA.f159570c;
        }
        this.f134187f = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(l1 l1Var, View view) {
        l1Var.C1(l1.g.RecognitionInProgress);
    }

    private final void k(boolean z10) {
        Drawable drawable = this.f134186e.getDrawable();
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable == null) {
            return;
        }
        if (z10) {
            animatedVectorDrawable.registerAnimationCallback(this.f134187f);
            animatedVectorDrawable.start();
        } else {
            animatedVectorDrawable.unregisterAnimationCallback(this.f134187f);
            animatedVectorDrawable.stop();
        }
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    public void a() {
        k(false);
    }

    @Override // com.planner5d.library.activity.fragment.list.holders.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void g(@Nullable Date date) {
        k(true);
        this.f134185d.setText(this.f134184c.m(this.f134183b, date));
    }
}
