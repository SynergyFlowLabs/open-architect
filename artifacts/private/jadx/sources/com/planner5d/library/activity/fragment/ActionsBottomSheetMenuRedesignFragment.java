package com.planner5d.library.activity.fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.c1;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nActionsBottomSheetMenuRedesignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionsBottomSheetMenuRedesignFragment.kt\ncom/planner5d/library/activity/fragment/ActionsBottomSheetMenuRedesignFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,77:1\n1#2:78\n257#3,2:79\n*S KotlinDebug\n*F\n+ 1 ActionsBottomSheetMenuRedesignFragment.kt\ncom/planner5d/library/activity/fragment/ActionsBottomSheetMenuRedesignFragment\n*L\n58#1:79,2\n*E\n"})
public final class ActionsBottomSheetMenuRedesignFragment extends BottomSheetMenuRedesignFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private final Menu f131528h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final boolean f131529i3;

    public ActionsBottomSheetMenuRedesignFragment() {
        this.f131528h3 = null;
        this.f131529i3 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Menu menu, Function1 function1, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        MenuItem menuItemFindItem = menu.findItem(bundle.getInt(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a));
        if (menuItemFindItem != null) {
            function1.invoke(menuItemFindItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(ActionsBottomSheetMenuRedesignFragment actionsBottomSheetMenuRedesignFragment, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        actionsBottomSheetMenuRedesignFragment.getParentFragmentManager().a(com.planner5d.library.services.r.bottomSheetRequest.f224891a, androidx.core.os.e.b(TuplesKt.to(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a, Integer.valueOf(it.getItemId()))));
        actionsBottomSheetMenuRedesignFragment.dismiss();
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f131528h3 == null) {
            dismiss();
            return;
        }
        Function1 function1 = new Function1() { // from class: com.planner5d.library.activity.fragment.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActionsBottomSheetMenuRedesignFragment.J(this.f131549a, (MenuItem) obj);
            }
        };
        if (!this.f131529i3) {
            RecyclerView recyclerView = E().f380913c;
            ConstraintLayout.b bVar = new ConstraintLayout.b(recyclerView.getLayoutParams());
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = 0;
            recyclerView.setLayoutParams(bVar);
            TextView bottomSheetSubtitle = E().f380914d;
            Intrinsics.checkNotNullExpressionValue(bottomSheetSubtitle, "bottomSheetSubtitle");
            bottomSheetSubtitle.setVisibility(8);
            TextView textView = E().f380915e;
            textView.setTextAppearance(c1.r.Y7);
            textView.setTextColor(textView.getContext().getColor(c1.e.Bl));
        }
        setAdapter(this.f131529i3 ? new com.planner5d.library.widget.menu.b(this.f131528h3, androidx.core.content.d.g(requireContext(), c1.e.Dg), function1) : new com.planner5d.library.widget.menu.j(this.f131528h3, androidx.core.content.d.g(requireContext(), c1.e.f250606m4), function1));
    }

    public ActionsBottomSheetMenuRedesignFragment(@NotNull FragmentManager fragmentManager, @Nullable String str, @Nullable String str2, @NotNull final Menu menu, boolean z10, @NotNull final Function1<? super MenuItem, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f131528h3 = menu;
        this.f131529i3 = z10;
        setArguments(BottomSheetMenuRedesignFragment.Arguments.a(str, str2));
        fragmentManager.c(com.planner5d.library.services.r.bottomSheetRequest.f224891a, this, new o0() { // from class: com.planner5d.library.activity.fragment.d
            @Override // androidx.fragment.app.o0
            public final void a(String str3, Bundle bundle) {
                ActionsBottomSheetMenuRedesignFragment.I(menu, onItemClick, str3, bundle);
            }
        });
    }
}
