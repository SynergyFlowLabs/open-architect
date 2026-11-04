package com.planner5d.library.activity.fragment.dialog.wishlist;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.planner5d.library.f;
import com.planner5d.library.model.manager.k1;
import com.planner5d.library.model.n;
import com.planner5d.library.services.bitmaploader.target.h;

/* JADX INFO: loaded from: classes6.dex */
public class c extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n[] f133127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f133128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k1 f133129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f133130d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImageView f133131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f133132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.planner5d.library.services.bitmaploader.target.a f133133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Drawable f133134d;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(h hVar, k1 k1Var, n nVar) {
            this.f133132b.setText(nVar.i());
            com.planner5d.library.services.bitmaploader.target.a aVar = this.f133133c;
            if (aVar != null) {
                hVar.d(aVar);
            }
            this.f133132b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, nVar.j() == null ? null : this.f133134d, (Drawable) null);
            String strC = nVar.c();
            com.planner5d.library.services.bitmaploader.target.a aVarC = hVar.c(com.planner5d.library.widget.bitmaptarget.a.a(this.f133131a));
            this.f133133c = aVarC;
            k1Var.b(strC, aVarC);
        }

        private a(ViewGroup viewGroup, Drawable drawable) {
            this.f133133c = null;
            this.f133131a = (ImageView) viewGroup.findViewById(f.j.Jd);
            this.f133132b = (TextView) viewGroup.findViewById(f.j.tv);
            this.f133134d = drawable;
            viewGroup.setTag(this);
        }
    }

    public c(Drawable drawable, h hVar, k1 k1Var, n[] nVarArr) {
        this.f133128b = hVar;
        this.f133129c = k1Var;
        this.f133127a = nVarArr;
        this.f133130d = drawable;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n getItem(int i10) {
        return this.f133127a[i10];
    }

    public n[] b() {
        return this.f133127a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f133127a.length;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(f.m.Q7, viewGroup, false);
            new a((ViewGroup) view, this.f133130d);
        }
        ((a) view.getTag()).b(this.f133128b, this.f133129c, getItem(i10));
        return view;
    }
}
