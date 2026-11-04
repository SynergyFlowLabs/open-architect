package com.planner5d.library.activity.fragment.dialog.message;

import android.view.ViewGroup;
import com.planner5d.library.activity.fragment.dialog.u;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmDeleteMultipleMessage extends ConfirmMessage {
    public static void show(com.planner5d.library.activity.fragment.dialog.k kVar, u<Boolean> uVar) {
        kVar.c(ConfirmDeleteMultipleMessage.class).m(uVar).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected int V() {
        return com.planner5d.library.f.h.f167877xb;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected CharSequence W(ViewGroup viewGroup) {
        return getString(com.planner5d.library.f.s.W6);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected CharSequence Z() {
        return getString(com.planner5d.library.f.s.iz);
    }
}
