package com.planner5d.library.activity.fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import com.planner5d.library.widget.c1;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
public final class ActionsBottomSheetMenuFragment extends BottomSheetMenuFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private final Menu f131527h3;

    public ActionsBottomSheetMenuFragment() {
        this.f131527h3 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(Menu menu, Function1 function1, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        MenuItem menuItemFindItem = menu.findItem(bundle.getInt(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a));
        if (menuItemFindItem != null) {
            function1.invoke(menuItemFindItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(ActionsBottomSheetMenuFragment actionsBottomSheetMenuFragment, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        actionsBottomSheetMenuFragment.getParentFragmentManager().a(com.planner5d.library.services.r.bottomSheetRequest.f224891a, androidx.core.os.e.b(TuplesKt.to(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a, Integer.valueOf(it.getItemId()))));
        actionsBottomSheetMenuFragment.dismiss();
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f131527h3 == null) {
            dismiss();
        } else {
            setAdapter(new com.planner5d.library.widget.menu.j(this.f131527h3, androidx.core.content.d.g(requireContext(), c1.e.f250687pg), new Function1() { // from class: com.planner5d.library.activity.fragment.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ActionsBottomSheetMenuFragment.L(this.f131542a, (MenuItem) obj);
                }
            }));
        }
    }

    public ActionsBottomSheetMenuFragment(@NotNull FragmentManager fragmentManager, @Nullable String str, @androidx.annotation.v @Nullable Integer num, @NotNull final Menu menu, @NotNull final Function1<? super MenuItem, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.f131527h3 = menu;
        setArguments(BottomSheetMenuFragment.Arguments.a(str, num));
        fragmentManager.c(com.planner5d.library.services.r.bottomSheetRequest.f224891a, this, new o0() { // from class: com.planner5d.library.activity.fragment.b
            @Override // androidx.fragment.app.o0
            public final void a(String str2, Bundle bundle) {
                ActionsBottomSheetMenuFragment.K(menu, onItemClick, str2, bundle);
            }
        });
    }
}
