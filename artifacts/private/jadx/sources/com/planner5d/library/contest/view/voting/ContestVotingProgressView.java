package com.planner5d.library.contest.view.voting;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import db.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class ContestVotingProgressView extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f153845d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f153846e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f153847f = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f153848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private ObjectAnimator f153849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f153850c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f153851a;

        b(Function0<Unit> function0) {
            this.f153851a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f153851a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestVotingProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 2 ^ 0;
    }

    public final void a(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f153848a.f269905b.setProgress(10000);
        this.f153849b.removeAllListeners();
        this.f153849b.addListener(new b(listener));
        this.f153849b.start();
    }

    public final void b() {
        this.f153849b.pause();
    }

    public final void c() {
        this.f153849b.removeAllListeners();
        this.f153849b.cancel();
        this.f153848a.f269905b.setProgress(0);
    }

    public final void d() {
        this.f153849b.resume();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestVotingProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ContestVotingProgressView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public ContestVotingProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        long integer = context.getResources().getInteger(com.planner5d.library.contest.e.j.f151176o);
        this.f153850c = integer;
        v vVarA = v.a(View.inflate(context, com.planner5d.library.contest.e.l.K2, this));
        Intrinsics.checkNotNullExpressionValue(vVarA, "bind(...)");
        vVarA.f269905b.setMax(10000);
        this.f153848a = vVarA;
        LinearProgressIndicator linearProgressIndicator = vVarA.f269905b;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(linearProgressIndicator, "progress", 0, linearProgressIndicator.getMax());
        objectAnimatorOfInt.setDuration(integer);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.f153849b = objectAnimatorOfInt;
    }
}
