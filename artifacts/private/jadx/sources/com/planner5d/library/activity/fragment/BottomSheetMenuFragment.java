package com.planner5d.library.activity.fragment;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.g3;
import androidx.core.view.k2;
import androidx.core.view.u1;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBottomSheetMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetMenuFragment.kt\ncom/planner5d/library/activity/fragment/BottomSheetMenuFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,111:1\n257#2,2:112\n255#2,4:114\n161#2,8:118\n*S KotlinDebug\n*F\n+ 1 BottomSheetMenuFragment.kt\ncom/planner5d/library/activity/fragment/BottomSheetMenuFragment\n*L\n47#1:112,2\n55#1:114,4\n65#1:118,8\n*E\n"})
public class BottomSheetMenuFragment extends com.google.android.material.bottomsheet.f implements com.planner5d.library.widget.menu.o {

    @NotNull
    public static final String ICON = "ICON";

    @NotNull
    public static final String TITLE = "TITLE";
    protected te.f H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.v
    @Nullable
    private Integer f131530g3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private String f131531p2;

    @NotNull
    public static final a Arguments = new a(null);
    public static final int $stable = 8;

    @SourceDebugExtension({"SMAP\nBottomSheetMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetMenuFragment.kt\ncom/planner5d/library/activity/fragment/BottomSheetMenuFragment$Arguments\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle a(@Nullable String str, @Nullable Integer num) {
            Bundle bundle = new Bundle();
            bundle.putString("TITLE", str);
            if (num != null) {
                bundle.putInt(BottomSheetMenuFragment.ICON, num.intValue());
            }
            return bundle;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(View view) {
        androidx.core.graphics.j jVarF;
        g3 g3VarR0 = u1.r0(view);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (g3VarR0 == null || (jVarF = g3VarR0.f(g3.m.g())) == null) ? 0 : jVarF.f47826d);
    }

    @NotNull
    protected final te.f G() {
        te.f fVar = this.H1;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    protected final void H(@NotNull te.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.H1 = fVar;
    }

    public final void addNavigationHeightAsBottomPadding(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.post(new Runnable() { // from class: com.planner5d.library.activity.fragment.e
            @Override // java.lang.Runnable
            public final void run() {
                BottomSheetMenuFragment.F(view);
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.f, androidx.appcompat.app.r, androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Window window;
        com.google.android.material.bottomsheet.e eVar = new com.google.android.material.bottomsheet.e(requireContext(), c1.r.f253034f5);
        if (Build.VERSION.SDK_INT >= 35 && (window = eVar.getWindow()) != null) {
            window.addFlags(512);
            k2.c(window, false);
        }
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        te.f fVarD = te.f.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(fVarD, "inflate(...)");
        if (Build.VERSION.SDK_INT >= 35) {
            RecyclerView bottomSheetList = fVarD.f380905d;
            Intrinsics.checkNotNullExpressionValue(bottomSheetList, "bottomSheetList");
            addNavigationHeightAsBottomPadding(bottomSheetList);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f131531p2 = arguments.getString("TITLE");
            if (arguments.containsKey(ICON)) {
                this.f131530g3 = Integer.valueOf(arguments.getInt(ICON));
            }
        }
        TextView bottomSheetTitle = fVarD.f380906e;
        Intrinsics.checkNotNullExpressionValue(bottomSheetTitle, "bottomSheetTitle");
        String str = this.f131531p2;
        bottomSheetTitle.setVisibility(str != null && str != null && str.length() > 0 ? 0 : 8);
        Integer num = this.f131530g3;
        if (num != null) {
            androidx.core.widget.r.w(fVarD.f380906e, com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), num.intValue(), Integer.valueOf(androidx.core.content.d.g(requireContext(), c1.e.f250847wf))), null, null, null);
        }
        View bottomSheetDivider = fVarD.f380904c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetDivider, "bottomSheetDivider");
        TextView bottomSheetTitle2 = fVarD.f380906e;
        Intrinsics.checkNotNullExpressionValue(bottomSheetTitle2, "bottomSheetTitle");
        bottomSheetDivider.setVisibility(bottomSheetTitle2.getVisibility() == 0 ? 0 : 8);
        fVarD.f380906e.setText(this.f131531p2);
        H(fVarD);
        ConstraintLayout root = G().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(c1.f.W0);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            if (dimensionPixelSize <= 0) {
                dimensionPixelSize = -1;
            }
            window.setLayout(dimensionPixelSize, -1);
        }
    }

    public final void setAdapter(@NotNull RecyclerView.h<RecyclerView.g0> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        G().f380905d.setAdapter(adapter);
    }

    @Override // com.planner5d.library.widget.menu.o
    public void showMenu(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (!isAdded()) {
            showNow(fragmentManager, str);
        }
    }
}
