package com.planner5d.library.activity.fragment.dialog.message;

import android.view.ViewGroup;
import com.planner5d.library.activity.fragment.dialog.u;

/* JADX INFO: loaded from: classes6.dex */
public class ConfirmDeleteMessage extends ConfirmMessage {
    public static void show(com.planner5d.library.activity.fragment.dialog.k kVar, String str, u<Boolean> uVar) {
        kVar.c(ConfirmDeleteMessage.class).m(uVar).k(str).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected CharSequence W(ViewGroup viewGroup) {
        return getString(com.planner5d.library.f.s.V6, (String) A());
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.ConfirmMessage
    protected CharSequence Z() {
        return getString(com.planner5d.library.f.s.hz, (String) A());
    }
}
