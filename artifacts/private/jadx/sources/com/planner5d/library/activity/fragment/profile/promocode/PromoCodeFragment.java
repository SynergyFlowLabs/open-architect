package com.planner5d.library.activity.fragment.profile.promocode;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import com.planner5d.library.databinding.c2;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import com.planner5d.library.services.o;
import com.planner5d.library.services.q0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.services.utility.t3;
import com.planner5d.library.widget.TextInputEditTextCompat;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPromoCodeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PromoCodeFragment.kt\ncom/planner5d/library/activity/fragment/profile/promocode/PromoCodeFragment\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,46:1\n12#2,6:47\n28#2:53\n257#3,2:54\n*S KotlinDebug\n*F\n+ 1 PromoCodeFragment.kt\ncom/planner5d/library/activity/fragment/profile/promocode/PromoCodeFragment\n*L\n20#1:47,6\n20#1:53\n31#1:54,2\n*E\n"})
public final class PromoCodeFragment extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f0 f134818a;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f134819a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f134819a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f134819a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f134819a.invoke(obj);
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

    public PromoCodeFragment() {
        t3 t3Var = t3.f229751a;
        this.f134818a = new i2(j1.d(e.class), new t3.c(this), t3.d.f229756a, null, 8, null);
    }

    private final e v() {
        return (e) this.f134818a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(PromoCodeFragment promoCodeFragment, o oVar, View view) {
        promoCodeFragment.v().Y(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(c2 c2Var, o oVar, View view, PromoCodeFragment promoCodeFragment, e.a aVar) {
        FrameLayout promocodePreloader = c2Var.f158800d;
        Intrinsics.checkNotNullExpressionValue(promocodePreloader, "promocodePreloader");
        promocodePreloader.setVisibility(aVar instanceof e.a.b ? 0 : 8);
        if (aVar instanceof e.a.C1480a) {
            int i10 = com.planner5d.library.f.j.qo;
            String error = ErrorMessageException.getError(view.getContext(), ((e.a.C1480a) aVar).a());
            Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
            oVar.f(i10, new k3(error));
        } else if (aVar instanceof e.a.d) {
            androidx.navigation.w0 w0VarA = androidx.navigation.fragment.f.a(promoCodeFragment);
            androidx.navigation.c2 c2VarA = c.a();
            Intrinsics.checkNotNullExpressionValue(c2VarA, "toPromoCodeSuccess(...)");
            w0VarA.m0(c2VarA);
        }
        return Unit.f312394a;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final View viewInflate = inflater.inflate(com.planner5d.library.f.m.f168860v2, viewGroup, false);
        final c2 c2VarA = c2.a(viewInflate);
        TextInputEditTextCompat textInputEditTextCompat = c2VarA.f158798b;
        Context context = viewInflate.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textInputEditTextCompat.i(new q0.f(context));
        final o oVar = new o(c2VarA.f158798b);
        c2VarA.f158801e.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.promocode.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoCodeFragment.w(this.f134820a, oVar, view);
            }
        });
        v().X().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.profile.promocode.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PromoCodeFragment.x(c2VarA, oVar, viewInflate, this, (e.a) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
