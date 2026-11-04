package com.planner5d.library.activity.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
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
@SourceDebugExtension({"SMAP\nBottomSheetMenuRedesignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetMenuRedesignFragment.kt\ncom/planner5d/library/activity/fragment/BottomSheetMenuRedesignFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n257#2,2:73\n257#2,2:75\n*S KotlinDebug\n*F\n+ 1 BottomSheetMenuRedesignFragment.kt\ncom/planner5d/library/activity/fragment/BottomSheetMenuRedesignFragment\n*L\n30#1:73,2\n31#1:75,2\n*E\n"})
public class BottomSheetMenuRedesignFragment extends com.google.android.material.bottomsheet.f implements com.planner5d.library.widget.menu.o {

    @NotNull
    public static final String SUBTITLE = "SUBTITLE";

    @NotNull
    public static final String TITLE = "TITLE";
    protected te.g H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private String f131532g3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private String f131533p2;

    @NotNull
    public static final a Arguments = new a(null);
    public static final int $stable = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle a(@Nullable String str, @Nullable String str2) {
            Bundle bundle = new Bundle();
            bundle.putString("TITLE", str);
            bundle.putString("SUBTITLE", str2);
            return bundle;
        }

        private a() {
        }
    }

    @NotNull
    protected final te.g E() {
        te.g gVar = this.H1;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    protected final void F(@NotNull te.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<set-?>");
        this.H1 = gVar;
    }

    @Override // com.google.android.material.bottomsheet.f, androidx.appcompat.app.r, androidx.fragment.app.m
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new com.google.android.material.bottomsheet.e(requireContext(), c1.r.f253010e5);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        te.g gVarD = te.g.d(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(gVarD, "inflate(...)");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f131533p2 = arguments.getString("TITLE");
            this.f131532g3 = arguments.getString("SUBTITLE");
        }
        TextView bottomSheetTitle = gVarD.f380915e;
        Intrinsics.checkNotNullExpressionValue(bottomSheetTitle, "bottomSheetTitle");
        String str = this.f131533p2;
        bottomSheetTitle.setVisibility(str != null && str != null && str.length() > 0 ? 0 : 8);
        TextView bottomSheetSubtitle = gVarD.f380914d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetSubtitle, "bottomSheetSubtitle");
        String str2 = this.f131532g3;
        bottomSheetSubtitle.setVisibility((str2 == null || str2 == null || str2.length() <= 0) ? false : true ? 0 : 8);
        gVarD.f380915e.setText(this.f131533p2);
        gVarD.f380914d.setText(this.f131532g3);
        F(gVarD);
        ConstraintLayout root = E().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        int dimensionPixelSize = requireContext().getResources().getDimensionPixelSize(c1.f.W0);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        if (dimensionPixelSize <= 0) {
            dimensionPixelSize = -1;
        }
        window.setLayout(dimensionPixelSize, -1);
    }

    public final void setAdapter(@NotNull RecyclerView.h<RecyclerView.g0> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        E().f380913c.setAdapter(adapter);
    }

    @Override // com.planner5d.library.widget.menu.o
    public void showMenu(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (isAdded()) {
            return;
        }
        showNow(fragmentManager, str);
    }
}
