package com.planner5d.library.activity.fragment.dialog.authentication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class AuthenticationRemindPasswordSuccess extends Fragment {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(AuthenticationRemindPasswordSuccess authenticationRemindPasswordSuccess, View view) {
        androidx.navigation.fragment.f.a(authenticationRemindPasswordSuccess).A0();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.f.m.f168793p1, viewGroup, false);
        com.planner5d.library.databinding.e0.a(viewInflate).f158874b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticationRemindPasswordSuccess.u(this.f131790a, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
