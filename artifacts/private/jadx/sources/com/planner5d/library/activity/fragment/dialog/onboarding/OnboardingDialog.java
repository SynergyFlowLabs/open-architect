package com.planner5d.library.activity.fragment.dialog.onboarding;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.u1;
import androidx.core.view.v3;
import androidx.fragment.app.m;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.j2;
import androidx.lifecycle.l2;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.planner5d.library.widget.z0;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nOnboardingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingDialog.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingDialog\n+ 2 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory\n+ 3 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,162:1\n16#2:163\n28#3:164\n257#4,2:165\n257#4,2:167\n278#4,2:169\n*S KotlinDebug\n*F\n+ 1 OnboardingDialog.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingDialog\n*L\n32#1:163\n142#1:164\n108#1:165,2\n109#1:167,2\n114#1:169,2\n*E\n"})
public final class OnboardingDialog extends m {
    private qc.d H1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final f0 f132175p1;

    public static final class a extends Dialog {
        a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            timber.log.b.f381052a.a("User pressed 'back' on onboarding dialog. Ignored.", new Object[0]);
        }
    }

    public static final class b extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f132176a;

        b(int i10) {
            this.f132176a = i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.c0 state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            int i10 = this.f132176a;
            outRect.top = i10;
            outRect.bottom = i10;
            outRect.left = i10;
            outRect.right = i10;
        }
    }

    static final class c implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f132177a;

        c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f132177a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f132177a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f132177a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nComponentViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentViewModelFactory.kt\ncom/planner5d/library/view/ComponentViewModelFactory$viewModelProvider$1\n+ 2 OnboardingDialog.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingDialog\n*L\n1#1,16:1\n32#2:17\n*E\n"})
    public static final class d implements Function0<l2> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return OnboardingDialog.this.getViewModelStore();
        }
    }

    public static final class e implements Function0<j2.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.planner5d.library.view.b f132179a;

        public e(com.planner5d.library.view.b bVar) {
            this.f132179a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final j2.c invoke() {
            return this.f132179a;
        }
    }

    public OnboardingDialog() {
        Function0 function0 = null;
        this.f132175p1 = new i2(j1.d(j.class), new d(), new e(com.planner5d.library.help.application.h.f179982b.a()), function0, 8, null);
    }

    private final void G(int i10) {
        qc.d dVar = this.H1;
        qc.d dVar2 = null;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        ViewGroup.LayoutParams layoutParams = dVar.f350322g.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int i11 = 7 >> 3;
        bVar.f45673a = getResources().getDimensionPixelSize(i10 == 3 ? pc.b.f.Cd : pc.b.f.Bd);
        qc.d dVar3 = this.H1;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dVar2 = dVar3;
        }
        dVar2.f350322g.setLayoutParams(bVar);
    }

    private final j H() {
        return (j) this.f132175p1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(a aVar, Integer num) {
        aVar.dismiss();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(qc.d dVar, OnboardingDialog onboardingDialog, View view) {
        dVar.f350319d.setEnabled(false);
        dVar.f350321f.setEnabled(false);
        onboardingDialog.H().k0();
    }

    private final void K() {
        Dialog dialog;
        Window window;
        if (getResources().getConfiguration().smallestScreenWidthDp >= 480 || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        v3 v3Var = new v3(window, window.getDecorView());
        v3Var.i(true);
        v3Var.h(true);
        window.setStatusBarColor(androidx.core.content.d.g(window.getContext(), pc.b.e.Sm));
    }

    private final void L() {
        H().g0().k(this, new c(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnboardingDialog.M(this.f132192a, (Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit M(final OnboardingDialog onboardingDialog, final Integer num) {
        RecyclerView.p linearLayoutManager;
        j jVarH = onboardingDialog.H();
        Intrinsics.checkNotNull(num);
        jVarH.o0(num.intValue());
        final qc.d dVar = onboardingDialog.H1;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        final RecyclerView recyclerView = dVar.f350324i;
        boolean z10 = true;
        if (num.intValue() == 2) {
            linearLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        } else if (num.intValue() == 3) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
            staggeredGridLayoutManager.r3(0);
            linearLayoutManager = staggeredGridLayoutManager;
        } else {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new com.planner5d.library.activity.fragment.dialog.onboarding.b(onboardingDialog.H().f0(num.intValue()), num.intValue(), new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnboardingDialog.N(num, onboardingDialog, recyclerView, dVar, ((Integer) obj).intValue());
            }
        }));
        ConstraintLayout buttonContainer = dVar.f350318c;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        buttonContainer.setVisibility(num.intValue() == 3 ? 0 : 8);
        TextView buttonSkip = dVar.f350320e;
        Intrinsics.checkNotNullExpressionValue(buttonSkip, "buttonSkip");
        if (num.intValue() != 0) {
            z10 = false;
        }
        buttonSkip.setVisibility(z10 ? 0 : 8);
        dVar.f350320e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingDialog.O(this.f132197a, view);
            }
        });
        ImageView buttonBack = dVar.f350317b;
        Intrinsics.checkNotNullExpressionValue(buttonBack, "buttonBack");
        buttonBack.setVisibility(onboardingDialog.H().i0() ? 0 : 4);
        dVar.f350317b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingDialog.P(this.f132198a, view);
            }
        });
        dVar.f350325j.setText(onboardingDialog.getText(onboardingDialog.H().h0(num.intValue())));
        onboardingDialog.G(num.intValue());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Integer num, OnboardingDialog onboardingDialog, RecyclerView recyclerView, qc.d dVar, int i10) {
        if (num.intValue() < 3) {
            onboardingDialog.H().j0();
        } else {
            RecyclerView.h adapter = recyclerView.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.planner5d.library.activity.fragment.dialog.onboarding.OnboardingAdapter");
            boolean z10 = !((com.planner5d.library.activity.fragment.dialog.onboarding.b) adapter).j().isEmpty();
            dVar.f350319d.setEnabled(z10);
            dVar.f350321f.setEnabled(z10);
        }
        if (num.intValue() == 0) {
            onboardingDialog.H().n0(i10);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(OnboardingDialog onboardingDialog, View view) {
        onboardingDialog.H().m0();
        onboardingDialog.H().j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(OnboardingDialog onboardingDialog, View view) {
        onboardingDialog.H().l0();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, pc.b.s.V5);
    }

    @Override // androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        final a aVar = new a(requireContext(), getTheme());
        Window window = aVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        aVar.setCanceledOnTouchOutside(false);
        H().d0().k(this, new c(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OnboardingDialog.I(aVar, (Integer) obj);
            }
        }));
        return aVar;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        androidx.activity.result.b parentFragment = getParentFragment();
        z0 z0Var = parentFragment instanceof z0 ? (z0) parentFragment : null;
        if (z0Var != null) {
            z0Var.onChildDialogDismiss(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        K();
        final qc.d dVar = this.H1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar = null;
        }
        qc.d dVar2 = this.H1;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dVar2 = null;
        }
        u1.j2(dVar2.f350317b, new ef.g(0, 1, defaultConstructorMarker));
        RecyclerView recyclerView = dVar.f350324i;
        recyclerView.setItemAnimator(null);
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.z1(0);
        }
        recyclerView.n(new b(recyclerView.getResources().getDimensionPixelSize(pc.b.f.f342647zd)));
        dVar.f350319d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OnboardingDialog.J(dVar, this, view2);
            }
        });
        dVar.f350319d.setEnabled(false);
        dVar.f350321f.setEnabled(false);
        L();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public ConstraintLayout onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        qc.d dVarC = qc.d.c(inflater);
        this.H1 = dVarC;
        ConstraintLayout constraintLayoutB = dVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutB, "let(...)");
        return constraintLayoutB;
    }
}
