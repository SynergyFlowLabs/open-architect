package com.planner5d.library.widget.menu;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.activity.fragment.BottomSheetMenuFragment;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class SimpleBottomSheetMenuFragment extends BottomSheetMenuFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @NotNull
    private final List<y> f258325h3;

    @oj.j
    public SimpleBottomSheetMenuFragment(@Nullable String str, @androidx.annotation.v @Nullable Integer num, @NotNull List<y> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f258325h3 = actions;
        setArguments(BottomSheetMenuFragment.Arguments.a(str, num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(SimpleBottomSheetMenuFragment simpleBottomSheetMenuFragment, y it) {
        Intrinsics.checkNotNullParameter(it, "it");
        simpleBottomSheetMenuFragment.getParentFragmentManager().a(com.planner5d.library.services.r.bottomSheetRequest.f224891a, androidx.core.os.e.b(TuplesKt.to(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a, Integer.valueOf(it.b()))));
        simpleBottomSheetMenuFragment.dismiss();
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setAdapter(new x(this.f258325h3, new Function1() { // from class: com.planner5d.library.widget.menu.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SimpleBottomSheetMenuFragment.J(this.f258404a, (y) obj);
            }
        }));
    }
}
