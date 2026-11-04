package com.planner5d.library.activity.fragment.profile.edit.password;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.fragment.app.Fragment;
import androidx.navigation.f4;
import com.planner5d.library.databinding.o1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class ProfileEditPasswordSuccessFragment extends Fragment {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(View view, View view2) {
        Intrinsics.checkNotNull(view);
        f4.a(view).A0();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final View viewInflate = inflater.inflate(com.planner5d.library.f.m.f168706h2, viewGroup, false);
        o1.a(viewInflate).f159426b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.profile.edit.password.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileEditPasswordSuccessFragment.u(viewInflate, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
