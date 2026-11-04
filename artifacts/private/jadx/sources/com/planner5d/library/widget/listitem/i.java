package com.planner5d.library.widget.listitem;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.planner5d.library.model.manager.statistics.events.b2;
import com.planner5d.library.model.manager.statistics.events.x3;
import com.planner5d.library.services.m0;

/* JADX INFO: loaded from: classes8.dex */
public class i extends p {
    public i(Context context, com.planner5d.library.services.bitmaploader.target.h hVar, com.planner5d.library.activity.helper.ui.d dVar) {
        super(context, com.planner5d.library.f.m.B7, hVar);
        int i10 = dVar.f137146m;
        ((ImageView) findViewById(com.planner5d.library.f.j.Jd)).setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(context, com.planner5d.library.f.h.D9, Integer.valueOf(i10)));
        TextView textView = (TextView) findViewById(com.planner5d.library.f.j.tv);
        textView.setText(com.planner5d.library.f.s.Yr);
        textView.setTextColor(i10);
        setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.listitem.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.r(view);
            }
        });
    }

    public static /* synthetic */ void r(View view) {
        b2.f216725b.c1(x3.b.projects_new_project);
        m0.f224433f.t();
    }

    @Override // com.planner5d.library.widget.listitem.p
    protected boolean i() {
        return false;
    }

    @Override // com.planner5d.library.widget.listitem.p
    protected com.planner5d.library.services.bitmaploader.d.C1663d q(com.planner5d.library.services.bitmaploader.target.a aVar, int i10) {
        return null;
    }
}
