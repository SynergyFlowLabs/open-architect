package com.planner5d.library.activity.fragment.dialog.message;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.statistics.events.l2;
import com.planner5d.library.model.manager.statistics.events.y3;
import com.planner5d.library.model.manager.y1;
import com.planner5d.library.services.b0;
import com.planner5d.library.services.r;

/* JADX INFO: loaded from: classes6.dex */
public class PurchaseRequiredMessage extends Message {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @ij.a
    protected y1 f132143o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @ij.a
    protected x f132144p3;

    public PurchaseRequiredMessage() {
        com.planner5d.library.application.b.r().j0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(com.planner5d.library.services.utility.j jVar, View view) {
        sendResultOnce(null);
        l2 l2Var = l2.f217094b;
        y3.c cVar = y3.c.locked_save;
        l2Var.u(cVar, null);
        int i10 = 6 << 0;
        b0.f223959b.o(new b0.a(fd.k.CATALOG, (String) null, jVar.f(r.saveToFile, false), com.planner5d.library.model.manager.config.purchaseplacement.b.a.locked_save, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(com.planner5d.library.services.utility.j jVar, View view) {
        try {
            sendResultOnce(null);
            if (jVar.f(r.goBackOnClose, false)) {
                this.f132144p3.e(this.f132143o3.d());
            }
        } catch (IllegalStateException unused) {
        }
    }

    public static void show(com.planner5d.library.activity.fragment.dialog.k kVar, Bundle bundle, boolean z10, boolean z11) {
        kVar.c(PurchaseRequiredMessage.class).i(new com.planner5d.library.services.utility.i().h(r.editor, bundle).m(r.saveToFile, z10).m(r.goBackOnClose, z11)).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.Message
    protected CharSequence U(ViewGroup viewGroup) {
        return com.planner5d.library.services.textspan.b.d(getString(com.planner5d.library.f.s.f169406rx));
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.Message
    protected void W(ViewGroup viewGroup) {
        final com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(getArguments());
        Button button = (Button) viewGroup.findViewById(com.planner5d.library.f.j.C5);
        button.setText(com.planner5d.library.f.s.pw);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132160a.Z(jVar, view);
            }
        });
        viewGroup.findViewById(com.planner5d.library.f.j.f168177k5).setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132162a.a0(jVar, view);
            }
        });
    }
}
