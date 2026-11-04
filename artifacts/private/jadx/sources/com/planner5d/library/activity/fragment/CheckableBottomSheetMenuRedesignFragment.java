package com.planner5d.library.activity.fragment;

import android.os.Bundle;
import android.util.Pair;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCheckableBottomSheetMenuRedesignFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckableBottomSheetMenuRedesignFragment.kt\ncom/planner5d/library/activity/fragment/CheckableBottomSheetMenuRedesignFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,59:1\n1#2:60\n257#3,2:61\n*S KotlinDebug\n*F\n+ 1 CheckableBottomSheetMenuRedesignFragment.kt\ncom/planner5d/library/activity/fragment/CheckableBottomSheetMenuRedesignFragment\n*L\n42#1:61,2\n*E\n"})
public final class CheckableBottomSheetMenuRedesignFragment extends BottomSheetMenuRedesignFragment {

    @Deprecated
    public static final int FIRST_SELECTED_INDEX = 1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.widget.menu.u f131536h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private static final a f131535i3 = new a(null);
    public static final int $stable = 8;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public CheckableBottomSheetMenuRedesignFragment() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(CheckableBottomSheetMenuRedesignFragment checkableBottomSheetMenuRedesignFragment, ue.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        checkableBottomSheetMenuRedesignFragment.getParentFragmentManager().a(com.planner5d.library.services.r.bottomSheetRequest.f224891a, androidx.core.os.e.b(TuplesKt.to(com.planner5d.library.services.r.bottomSheetResultBundle.f224891a, ((Pair) it).first)));
        checkableBottomSheetMenuRedesignFragment.dismiss();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(ue.b[] bVarArr, Function1 function1, String str, Bundle bundle) {
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
        RecyclerView recyclerView = E().f380913c;
        com.planner5d.library.widget.menu.u uVar = this.f131536h3;
        if (uVar == null) {
            dismiss();
            return;
        }
        recyclerView.setAdapter(uVar);
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

    public final void setSelected(int i10) {
        com.planner5d.library.widget.menu.u uVar = this.f131536h3;
        if (uVar != null) {
            uVar.i(i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckableBottomSheetMenuRedesignFragment(@NotNull FragmentManager fragmentManager, @Nullable String str, @NotNull final ue.b[] options, @Nullable Integer num, @NotNull final Function1<? super ue.b, Unit> onItemClick) {
        this();
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        setArguments(BottomSheetMenuRedesignFragment.Arguments.a(str, null));
        this.f131536h3 = new com.planner5d.library.widget.menu.u(options, new Function1() { // from class: com.planner5d.library.activity.fragment.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckableBottomSheetMenuRedesignFragment.I(this.f133945a, (ue.b) obj);
            }
        }).i(num != null ? num.intValue() : 1).h(true);
        fragmentManager.c(com.planner5d.library.services.r.bottomSheetRequest.f224891a, this, new o0() { // from class: com.planner5d.library.activity.fragment.i
            @Override // androidx.fragment.app.o0
            public final void a(String str2, Bundle bundle) {
                CheckableBottomSheetMenuRedesignFragment.J(options, onItemClick, str2, bundle);
            }
        });
    }
}
