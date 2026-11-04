package com.planner5d.library.contest.view.dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.model.manager.p5;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.UrlSwitchCompat;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nContestRulesAgreement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestRulesAgreement.kt\ncom/planner5d/library/contest/view/dialog/ContestRulesAgreement\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n*L\n1#1,134:1\n16#2:135\n*S KotlinDebug\n*F\n+ 1 ContestRulesAgreement.kt\ncom/planner5d/library/contest/view/dialog/ContestRulesAgreement\n*L\n33#1:135\n*E\n"})
public final class ContestRulesAgreement extends ContentDialog<Boolean> implements n0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final f0 f153539o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private Animation f153540p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private Animation f153541q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private long f153542r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private long f153543s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private boolean f153544t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @Nullable
    private ViewPropertyAnimator f153545u3;

    @ij.a
    public p5 uriViewer;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private db.a f153546v3;

    @SourceDebugExtension({"SMAP\nContestRulesAgreement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContestRulesAgreement.kt\ncom/planner5d/library/contest/view/dialog/ContestRulesAgreement$animateDismiss$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,134:1\n257#2,2:135\n*S KotlinDebug\n*F\n+ 1 ContestRulesAgreement.kt\ncom/planner5d/library/contest/view/dialog/ContestRulesAgreement$animateDismiss$1\n*L\n126#1:135,2\n*E\n"})
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            db.a aVar = ContestRulesAgreement.this.f153546v3;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aVar = null;
            }
            ConstraintLayout contestRulesAgreementDialog = aVar.f269745f;
            Intrinsics.checkNotNullExpressionValue(contestRulesAgreementDialog, "contestRulesAgreementDialog");
            contestRulesAgreementDialog.setVisibility(8);
            ContestRulesAgreement.this.b0().V();
            ContestRulesAgreement.this.sendResultOnce(Boolean.FALSE);
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 ContestRulesAgreement.kt\ncom/planner5d/library/contest/view/dialog/ContestRulesAgreement\n*L\n1#1,16:1\n33#2:17\n*E\n"})
    public static final class b implements Function0<l2> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return ContestRulesAgreement.this.getViewModelStore();
        }
    }

    public static final class c implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f153549a;

        public c(com.planner5d.library.view.b bVar) {
            this.f153549a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f153549a;
        }
    }

    public ContestRulesAgreement() {
        com.planner5d.library.contest.application.a.C1517a c1517a = com.planner5d.library.contest.application.a.f148393b;
        Function0 function0 = null;
        this.f153539o3 = new i2(j1.d(e.class), new b(), new c(c1517a.a()), function0, 8, null);
        c1517a.a().q(this);
    }

    private final void W() {
        db.a aVar = this.f153546v3;
        Animation animation = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f269744e.setClickable(false);
        db.a aVar2 = this.f153546v3;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar2 = null;
        }
        aVar2.f269742c.setClickable(false);
        db.a aVar3 = this.f153546v3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar3 = null;
        }
        aVar3.f269742c.setAlpha(1.0f);
        db.a aVar4 = this.f153546v3;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar4 = null;
        }
        this.f153545u3 = aVar4.f269742c.animate().alpha(0.0f).setDuration(this.f153543s3).setListener(new a());
        db.a aVar5 = this.f153546v3;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar5 = null;
        }
        ConstraintLayout constraintLayout = aVar5.f269745f;
        Animation animation2 = this.f153541q3;
        if (animation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("outAnimation");
        } else {
            animation = animation2;
        }
        constraintLayout.startAnimation(animation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(ContestRulesAgreement contestRulesAgreement, View view) {
        contestRulesAgreement.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(ContestRulesAgreement contestRulesAgreement, String str) {
        contestRulesAgreement.getUriViewer$P5D_Library_Contest_release().a(contestRulesAgreement.getActivity(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(ContestRulesAgreement contestRulesAgreement, db.a aVar, CompoundButton compoundButton, boolean z10) {
        if (z10) {
            contestRulesAgreement.b0().U();
        }
        aVar.f269744e.setEnabled(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(ContestRulesAgreement contestRulesAgreement, View view) {
        contestRulesAgreement.sendResultOnce(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e b0() {
        return (e) this.f153539o3.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    @NotNull
    protected View E(@NotNull ViewGroup root, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(root, "root");
        final db.a aVarA = db.a.a(LayoutInflater.from(getContext()).inflate(com.planner5d.library.contest.e.l.W, root, false));
        Intrinsics.checkNotNullExpressionValue(aVarA, "bind(...)");
        u1.j2(aVarA.f269742c, new ef.g(getResources().getDimensionPixelSize(com.planner5d.library.contest.e.f.Df)));
        aVarA.f269742c.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestRulesAgreement.X(this.f153561a, view);
            }
        });
        UrlSwitchCompat urlSwitchCompat = aVarA.f269743d;
        k3 k3Var = new k3(com.planner5d.library.contest.e.r.W3, com.planner5d.library.api.f.a().f142278p);
        Context context = urlSwitchCompat.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        urlSwitchCompat.setTitleWithLinks(k3Var.e(context, false, false, new UrlSpanWithListener.a() { // from class: com.planner5d.library.contest.view.dialog.b
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str) {
                ContestRulesAgreement.Y(this.f153562a, str);
            }
        }));
        urlSwitchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.contest.view.dialog.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                ContestRulesAgreement.Z(this.f153563a, aVarA, compoundButton, z10);
            }
        });
        u1.j2(aVarA.f269745f, new ef.f(0, null, 3, 0 == true ? 1 : 0));
        aVarA.f269744e.setEnabled(false);
        aVarA.f269744e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.contest.view.dialog.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContestRulesAgreement.a0(this.f153565a, view);
            }
        });
        this.f153546v3 = aVarA;
        ConstraintLayout root2 = aVarA.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return com.planner5d.library.contest.e.l.f151249g0;
    }

    @NotNull
    public final p5 getUriViewer$P5D_Library_Contest_release() {
        p5 p5Var = this.uriViewer;
        if (p5Var != null) {
            return p5Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uriViewer");
        return null;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog
    protected boolean onBackPressed() {
        ViewPropertyAnimator viewPropertyAnimator = this.f153545u3;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        b0().V();
        sendResultOnce(Boolean.FALSE);
        return true;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, com.planner5d.library.contest.e.s.P5);
        this.f153540p3 = AnimationUtils.loadAnimation(getContext(), com.planner5d.library.contest.e.a.W);
        this.f153541q3 = AnimationUtils.loadAnimation(getContext(), com.planner5d.library.contest.e.a.X);
        this.f153542r3 = getResources().getInteger(com.planner5d.library.contest.e.j.f151162h);
        this.f153543s3 = getResources().getInteger(com.planner5d.library.contest.e.j.f151158f);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog, com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f153544t3) {
            return;
        }
        db.a aVar = this.f153546v3;
        Animation animation = null;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        aVar.f269742c.setAlpha(0.0f);
        db.a aVar2 = this.f153546v3;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar2 = null;
        }
        aVar2.f269742c.animate().alpha(1.0f).setDuration(this.f153542r3);
        db.a aVar3 = this.f153546v3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar3 = null;
        }
        ConstraintLayout constraintLayout = aVar3.f269745f;
        Animation animation2 = this.f153540p3;
        if (animation2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inAnimation");
        } else {
            animation = animation2;
        }
        constraintLayout.startAnimation(animation);
        this.f153544t3 = true;
    }

    public final void setUriViewer$P5D_Library_Contest_release(@NotNull p5 p5Var) {
        Intrinsics.checkNotNullParameter(p5Var, "<set-?>");
        this.uriViewer = p5Var;
    }
}
