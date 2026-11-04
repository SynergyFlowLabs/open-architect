package com.planner5d.library.activity.fragment.profile.promocode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import com.planner5d.library.databinding.d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class PromoCodeSuccessFragment extends Fragment {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(PromoCodeSuccessFragment promoCodeSuccessFragment, View view) {
        androidx.navigation.fragment.f.a(promoCodeSuccessFragment).A0();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.f.m.f168871w2, viewGroup, false);
        d2.a(viewInflate).f158839b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.promocode.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoCodeSuccessFragment.u(this.f134826a, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
