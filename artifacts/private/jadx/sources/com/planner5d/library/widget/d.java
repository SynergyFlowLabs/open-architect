package com.planner5d.library.widget;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nBackButtonConfigurator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackButtonConfigurator.kt\ncom/planner5d/library/widget/BackButtonConfigurator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,29:1\n1#2:30\n67#3,4:31\n37#3,2:35\n55#3:37\n72#3:38\n*S KotlinDebug\n*F\n+ 1 BackButtonConfigurator.kt\ncom/planner5d/library/widget/BackButtonConfigurator\n*L\n25#1:31,4\n25#1:35,2\n25#1:37\n25#1:38\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f254242a = 0;

    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,52:1\n70#2:53\n*E\n"})
    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f254243a;

        public a(Function1 function1) {
            this.f254243a = function1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f254243a.invoke(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(d dVar, View view, androidx.activity.j0 j0Var, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = c1.i.f251823f1;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = c1.f.Nd;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            function1 = null;
        }
        dVar.e(view, j0Var, i13, i14, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(androidx.activity.j0 j0Var, View view) {
        j0Var.p();
    }

    @oj.j
    public final void b(@NotNull View rootView, @NotNull androidx.activity.j0 onBackPressedDispatcher) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "onBackPressedDispatcher");
        boolean z10 = false | false;
        f(this, rootView, onBackPressedDispatcher, 0, 0, null, 28, null);
    }

    @oj.j
    public final void c(@NotNull View rootView, @NotNull androidx.activity.j0 onBackPressedDispatcher, @androidx.annotation.d0 int i10) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "onBackPressedDispatcher");
        f(this, rootView, onBackPressedDispatcher, i10, 0, null, 24, null);
    }

    @oj.j
    public final void d(@NotNull View rootView, @NotNull androidx.activity.j0 onBackPressedDispatcher, @androidx.annotation.d0 int i10, @androidx.annotation.q int i11) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "onBackPressedDispatcher");
        f(this, rootView, onBackPressedDispatcher, i10, i11, null, 16, null);
    }

    @oj.j
    public final void e(@NotNull View rootView, @NotNull final androidx.activity.j0 onBackPressedDispatcher, @androidx.annotation.d0 int i10, @androidx.annotation.q int i11, @Nullable Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "onBackPressedDispatcher");
        View viewFindViewById = rootView.findViewById(i10);
        int dimensionPixelSize = rootView.getResources().getDimensionPixelSize(i11);
        androidx.core.view.u1.j2(viewFindViewById, new ef.g(dimensionPixelSize, Integer.valueOf(dimensionPixelSize)));
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.g(onBackPressedDispatcher, view);
            }
        });
        if (function1 != null) {
            Intrinsics.checkNotNull(viewFindViewById);
            if (!viewFindViewById.isLaidOut() || viewFindViewById.isLayoutRequested()) {
                viewFindViewById.addOnLayoutChangeListener(new a(function1));
            } else {
                function1.invoke(viewFindViewById);
            }
        }
    }
}
