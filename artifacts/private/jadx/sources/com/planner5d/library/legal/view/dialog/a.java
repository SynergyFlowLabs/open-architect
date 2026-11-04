package com.planner5d.library.legal.view.dialog;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m;
import com.planner5d.library.legal.view.dialog.agreements.AgreementsDialog;
import com.planner5d.library.services.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements t {
    @ij.a
    public a() {
    }

    @Override // com.planner5d.library.services.t
    public void a(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        new AgreementsDialog().show(fragmentManager, "agreements_dialog");
    }

    @Override // com.planner5d.library.services.t
    public boolean b(@Nullable m mVar) {
        return mVar instanceof AgreementsDialog;
    }
}
