package com.planner5d.library.activity.helper;

import android.view.View;
import androidx.core.view.g3;
import com.google.android.material.navigation.NavigationBarView;
import com.planner5d.library.widget.BottomNavigationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nHelperUIBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelperUIBottomNavigation.kt\ncom/planner5d/library/activity/helper/HelperUIBottomNavigation\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,76:1\n257#2,2:77\n257#2,2:79\n*S KotlinDebug\n*F\n+ 1 HelperUIBottomNavigation.kt\ncom/planner5d/library/activity/helper/HelperUIBottomNavigation\n*L\n61#1:77,2\n39#1:79,2\n*E\n"})
public final class q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f137089c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BottomNavigationView f137090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final sd.e f137091b;

    static final class a implements androidx.lifecycle.d1, kotlin.jvm.internal.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f137092a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f137092a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final kotlin.x<?> b() {
            return this.f137092a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f137092a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.d1) && (obj instanceof kotlin.jvm.internal.c0)) {
                return Intrinsics.areEqual(b(), ((kotlin.jvm.internal.c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public q1(@NotNull BottomNavigationView bottomNavigationView, @NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull sd.e firebaseInAppMessageTrigger) {
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        this.f137090a = bottomNavigationView;
        this.f137091b = firebaseInAppMessageTrigger;
        com.planner5d.library.activity.helper.ui.d.f137133w.k(lifecycleOwner, new a(new Function1() { // from class: com.planner5d.library.activity.helper.n1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q1.d(this.f137072a, (com.planner5d.library.activity.helper.ui.d) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(q1 q1Var, com.planner5d.library.activity.helper.ui.d dVar) {
        q1Var.h(dVar.f137149p);
        return Unit.f312394a;
    }

    private final void e(com.planner5d.library.activity.helper.event.content.a aVar) {
        Integer numH = new m(this.f137091b).h(aVar.e());
        if (numH != null) {
            int iIntValue = numH.intValue();
            BottomNavigationView bottomNavigationView = this.f137090a;
            NavigationBarView.d onItemSelectedListener = bottomNavigationView.getOnItemSelectedListener();
            bottomNavigationView.setOnItemSelectedListener(null);
            bottomNavigationView.setSelectedItemId(iIntValue);
            bottomNavigationView.setOnItemSelectedListener(onItemSelectedListener);
        }
    }

    private final void f() {
        androidx.core.view.u1.j2(this.f137090a, new androidx.core.view.b1() { // from class: com.planner5d.library.activity.helper.p1
            @Override // androidx.core.view.b1
            public final g3 b(View view, g3 g3Var) {
                return q1.g(this.f137083a, view, g3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 g(q1 q1Var, View view, g3 insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        BottomNavigationView bottomNavigationView = q1Var.f137090a;
        if (bottomNavigationView.getPaddingBottom() != 0) {
            bottomNavigationView.setPadding(bottomNavigationView.getPaddingLeft(), bottomNavigationView.getPaddingTop(), bottomNavigationView.getPaddingRight(), 0);
        }
        return insets;
    }

    private final void h(boolean z10) {
        int i10;
        BottomNavigationView bottomNavigationView = this.f137090a;
        if (z10) {
            i10 = 0;
            int i11 = 5 & 0;
        } else {
            i10 = 8;
        }
        bottomNavigationView.setVisibility(i10);
    }

    public static /* synthetic */ void j(q1 q1Var, androidx.lifecycle.o0 o0Var, com.planner5d.library.activity.helper.event.content.a aVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        q1Var.i(o0Var, aVar, z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(q1 q1Var, com.planner5d.library.activity.helper.ui.d dVar) {
        q1Var.f137090a.setVisibility(dVar.f137149p ? 0 : 8);
        q1Var.f137090a.q(dVar.f137152s);
        return Unit.f312394a;
    }

    public final void i(@NotNull androidx.lifecycle.o0 lifecycleOwner, @NotNull com.planner5d.library.activity.helper.event.content.a event, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(event, "event");
        h(z11);
        this.f137090a.q(z12);
        if (z11) {
            this.f137090a.s(com.planner5d.library.f.j.Zl, z10);
            e(event);
        }
        com.planner5d.library.activity.helper.ui.d.f137133w.k(lifecycleOwner, new a(new Function1() { // from class: com.planner5d.library.activity.helper.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q1.k(this.f137077a, (com.planner5d.library.activity.helper.ui.d) obj);
            }
        }));
        f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q1(@NotNull androidx.appcompat.app.d activity, @NotNull sd.e firebaseInAppMessageTrigger) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(firebaseInAppMessageTrigger, "firebaseInAppMessageTrigger");
        View viewFindViewById = activity.findViewById(com.planner5d.library.f.j.f168344r4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this((BottomNavigationView) viewFindViewById, activity, firebaseInAppMessageTrigger);
    }
}
