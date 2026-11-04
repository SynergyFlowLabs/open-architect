package com.planner5d.library.activity.fragment.dialog.message;

import android.view.ViewGroup;
import com.planner5d.library.activity.fragment.dialog.u;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmCloneMessage extends ConfirmMessage {
    public static void show(com.planner5d.library.activity.fragment.dialog.k kVar, u<Boolean> uVar) {
        kVar.c(ConfirmCloneMessage.class).m(uVar).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected CharSequence W(ViewGroup viewGroup) {
        return getString(com.planner5d.library.f.s.Y2);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected CharSequence Z() {
        return getString(com.planner5d.library.f.s.X2);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected int a0() {
        return com.planner5d.library.f.g.Dh;
    }
}
