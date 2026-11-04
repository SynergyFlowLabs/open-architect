package com.planner5d.library.activity.fragment.dialog.about;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.planner5d.library.activity.fragment.dialog.ContentDialog;
import com.planner5d.library.help.application.h;
import com.planner5d.library.model.manager.e1;
import com.planner5d.library.model.manager.o4;
import com.planner5d.library.model.manager.q4;
import com.planner5d.library.model.manager.statistics.events.r3;
import com.planner5d.library.model.manager.t2;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.model.manager.z4;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.u;
import com.planner5d.library.widget.y1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class About extends ContentDialog<Void> {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @ij.a
    protected q4 f131655o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    @ij.a
    protected e1 f131656p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    @ij.a
    protected o4 f131657q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @ij.a
    protected u1 f131658r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @ij.a
    protected t2 f131659s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @ij.a
    protected w f131660t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @ij.a
    protected r3 f131661u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    @ij.a
    protected z4 f131662v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @ij.a
    protected u f131663w3;

    public About() {
        h.f179983c.u(this);
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected View E(@NonNull ViewGroup viewGroup, Bundle bundle) {
        ViewPager viewPager = (ViewPager) LayoutInflater.from(viewGroup.getContext()).inflate(pc.b.l.W, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewGroup.findViewById(pc.b.i.Qb);
        ArrayList arrayList = new ArrayList();
        Context context = viewGroup.getContext();
        arrayList.add(new y1.a(context, pc.b.r.oC, new e(this, this.f131655o3, this.f131657q3, this.f131658r3, this.f131656p3, this.f131659s3, this.f131662v3, this.f131660t3, this.f131661u3, this.f131663w3, getChildFragmentManager())));
        viewPager.setAdapter(new y1(arrayList));
        com.planner5d.library.activity.helper.ui.d dVarF = com.planner5d.library.activity.helper.ui.d.f137133w.f();
        tabLayout.setupWithViewPager(viewPager);
        ((ImageView) viewGroup.findViewById(pc.b.i.f343102a2)).setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), pc.b.g.f342744f6, dVarF != null ? Integer.valueOf(dVarF.f137144k) : null));
        if (dVarF != null) {
            int i10 = dVarF.f137144k;
            tabLayout.X(i10, i10);
            viewGroup.findViewById(pc.b.i.Y4).setBackgroundColor(dVarF.b(context));
        }
        return viewPager;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    protected int G() {
        return pc.b.l.f343565b0;
    }

    @Override // com.planner5d.library.activity.fragment.dialog.ContentDialog
    public void setProgress(String str) {
        super.setProgress(str);
    }
}
