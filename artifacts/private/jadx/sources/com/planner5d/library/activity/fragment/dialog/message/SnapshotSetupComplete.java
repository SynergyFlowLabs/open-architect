package com.planner5d.library.activity.fragment.dialog.message;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.f1;
import com.planner5d.library.activity.fragment.projects.ProjectsPagesFragment;
import com.planner5d.library.activity.fragment.projects.c0;
import com.planner5d.library.activity.fragment.x;
import com.planner5d.library.model.manager.statistics.events.b4;
import com.planner5d.library.services.f0;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class SnapshotSetupComplete extends Message {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @ij.a
    protected x f132145o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @ij.a
    protected c0 f132146p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f132147q3 = false;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f132148r3 = false;

    public SnapshotSetupComplete() {
        com.planner5d.library.application.b.r().q1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(View view) {
        this.f132148r3 = true;
        dismiss();
    }

    @NotNull
    private gd.b Z() {
        return (gd.b) ((Object[]) A())[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(String str) {
        if ("p5d://snapshots".equals(str)) {
            this.f132147q3 = true;
            dismiss();
        }
    }

    public static void show(com.planner5d.library.activity.fragment.dialog.k kVar, @f1 int i10, gd.b bVar) {
        kVar.c(SnapshotSetupComplete.class).k(new Object[]{Integer.valueOf(i10), bVar}).g();
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.Message, com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NotNull ViewGroup viewGroup, Bundle bundle) {
        View viewE = super.E(viewGroup, bundle);
        TextView textView = (TextView) viewE.findViewById(com.planner5d.library.f.j.yu);
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setAutoLinkMask(0);
        textView.setText(com.planner5d.library.services.textspan.b.h(viewGroup.getContext().getString(((Integer) ((Object[]) A())[0]).intValue()), new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.dialog.message.l
            @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
            public final void a(String str) {
                this.f132167a.a0(str);
            }
        }, null, true));
        return viewE;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.Message
    protected CharSequence U(ViewGroup viewGroup) {
        return "";
    }

    @Override // com.planner5d.library.activity.fragment.dialog.message.Message
    protected void W(ViewGroup viewGroup) {
        super.W(viewGroup);
        TextView textView = (TextView) viewGroup.findViewById(com.planner5d.library.f.j.C5);
        ((TextView) viewGroup.findViewById(com.planner5d.library.f.j.f168177k5)).setText(com.planner5d.library.f.s.Z2);
        textView.setVisibility(0);
        textView.setText(com.planner5d.library.f.s.AB);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.message.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132166a.V(view);
            }
        });
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Context context;
        super.onDismiss(dialogInterface);
        if (this.f132147q3) {
            this.f132146p3.c(b4.c.text_rendered);
            this.f132145o3.e(new ProjectsPagesFragment.a().a(Z()));
        } else {
            if (this.f132148r3 && (context = getContext()) != null) {
                new f0(context, Z()).a(getActivity());
            }
        }
    }
}
