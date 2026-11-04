package com.planner5d.library.activity.fragment.dialog.message;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class OkMessage extends androidx.fragment.app.m {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(OkMessage okMessage, View view) {
        okMessage.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(com.planner5d.library.f.m.D0, viewGroup);
        com.planner5d.library.databinding.g gVarA = com.planner5d.library.databinding.g.a(viewInflate);
        gVarA.f158988c.setText(new com.planner5d.library.services.utility.j(getArguments()).t(r.message, ""));
        gVarA.f158987b.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OkMessage.B(this.f132159a, view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        Dialog dialog;
        Window window;
        super.onStart();
        int i10 = 4 ^ 0;
        if (!new com.planner5d.library.services.utility.j(getArguments()).f(r.full_width, false) || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }
}
