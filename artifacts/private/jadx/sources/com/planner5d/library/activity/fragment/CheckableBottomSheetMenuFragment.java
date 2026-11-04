package com.planner5d.library.activity.fragment;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCheckableBottomSheetMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckableBottomSheetMenuFragment.kt\ncom/planner5d/library/activity/fragment/CheckableBottomSheetMenuFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public final class CheckableBottomSheetMenuFragment extends BottomSheetMenuFragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.menu.u f131534h3;

    public CheckableBottomSheetMenuFragment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(CheckableBottomSheetMenuFragment checkableBottomSheetMenuFragment, ue.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        checkableBottomSheetMenuFragment.getParentFragmentManager().a(com.planner5d.library.services.r.bottomSheetRequest.f224891a, androidx.core.os.e.b(TuplesKt.to(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a, ((Pair) it).first)));
        checkableBottomSheetMenuFragment.dismiss();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(ue.b[] bVarArr, Function1 function1, String str, Bundle bundle) {
        ue.b bVar;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        int length = bVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArr[i10];
            int i11 = bundle.getInt(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a);
            Integer num = (Integer) ((Pair) bVar).first;
            if (num != null && i11 == num.intValue()) {
                break;
            } else {
                i10++;
            }
        }
        if (bVar != null) {
            function1.invoke(bVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = G().f380905d;
        com.planner5d.library.widget.menu.u uVar = this.f131534h3;
        if (uVar != null) {
            recyclerView.setAdapter(uVar);
        } else {
            dismiss();
        }
    }

    public final void setSelected(int i10) {
        com.planner5d.library.widget.menu.u uVar = this.f131534h3;
        if (uVar != null) {
            uVar.i(i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckableBottomSheetMenuFragment(@NotNull FragmentManager fragmentManager, @Nullable String str, @NotNull final ue.b[] options, int i10, @NotNull final Function1<? super ue.b, Unit> onItemClick) {
        this();
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        setArguments(BottomSheetMenuFragment.Arguments.a(str, null));
        this.f131534h3 = new com.planner5d.library.widget.menu.u(options, new Function1() { // from class: com.planner5d.library.activity.fragment.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckableBottomSheetMenuFragment.K(this.f133147a, (ue.b) obj);
            }
        }).i(i10);
        fragmentManager.c(com.planner5d.library.services.r.bottomSheetRequest.f224891a, this, new o0() { // from class: com.planner5d.library.activity.fragment.g
            @Override // androidx.fragment.app.o0
            public final void a(String str2, Bundle bundle) {
                CheckableBottomSheetMenuFragment.L(options, onItemClick, str2, bundle);
            }
        });
    }
}
