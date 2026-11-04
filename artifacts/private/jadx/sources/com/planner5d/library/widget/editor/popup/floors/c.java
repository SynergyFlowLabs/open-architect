package com.planner5d.library.widget.editor.popup.floors;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.core.widget.r;
import com.planner5d.library.activity.fragment.dialog.k;
import com.planner5d.library.activity.fragment.dialog.titleedit.FloorEdit;
import com.planner5d.library.activity.fragment.dialog.u;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemProject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class c extends BaseAdapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f257207f = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Pair<Integer, ItemFloor>> f257208a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ItemProject f257209b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.planner5d.library.widget.editor.popup.floors.view.g.a f257210c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f257211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f257212e;

    public c(k kVar, boolean z10) {
        this.f257211d = kVar;
        this.f257212e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Pair pair) {
        com.planner5d.library.widget.editor.popup.floors.view.g.a aVar = this.f257210c;
        if (aVar != null) {
            aVar.b((ItemFloor) pair.first);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.f257211d.c(FloorEdit.class).k(this.f257209b).o(new u() { // from class: com.planner5d.library.widget.editor.popup.floors.a
            @Override // com.planner5d.library.activity.fragment.dialog.u
            public final void a(Object obj) {
                this.f257205a.d((Pair) obj);
            }
        }).g();
    }

    private int h(int i10) {
        return (getCount() - 1) - i10;
    }

    public boolean c(Object obj) {
        return (obj == null || this.f257212e || this.f257208a.size() <= 1) ? false : true;
    }

    public void f(Object obj, int i10, int i11) {
        this.f257210c.d((ItemFloor) obj, h(i10), h(i11));
    }

    public void g() {
        i(this.f257209b, this.f257210c);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f257208a.size() + ((this.f257208a.size() >= 3 || this.f257212e) ? 0 : 1);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        int iH = h(i10);
        if (iH >= this.f257208a.size()) {
            return null;
        }
        return this.f257208a.get(iH).second;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        int iH = h(i10);
        if (iH >= 0 && iH < this.f257208a.size()) {
            return ((Integer) this.f257208a.get(iH).first).intValue();
        }
        return -1L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return h(i10) == this.f257208a.size() ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            if (getItemViewType(i10) == 0) {
                com.planner5d.library.widget.editor.popup.floors.view.g gVar = new com.planner5d.library.widget.editor.popup.floors.view.g(viewGroup.getContext(), this.f257212e);
                gVar.setGrabButtonVisibility(this.f257208a.size() > 1 ? 0 : 4);
                view2 = gVar;
            } else {
                com.planner5d.library.widget.editor.popup.floors.view.a aVar = new com.planner5d.library.widget.editor.popup.floors.view.a(viewGroup.getContext());
                aVar.setText(com.planner5d.library.f.s.Z);
                aVar.setIconAndTextColor(com.planner5d.library.f.C1549f.Mh);
                aVar.setTextSize(0, aVar.getResources().getDimensionPixelSize(com.planner5d.library.f.g.K3));
                r.w(aVar, com.planner5d.library.widget.drawable.c.f254258a.a(aVar.getContext(), com.planner5d.library.f.h.f167494da, Integer.valueOf(androidx.core.content.d.g(aVar.getContext(), com.planner5d.library.f.C1549f.Mh))), null, null, null);
                aVar.setHeight((int) viewGroup.getResources().getDimension(com.planner5d.library.f.g.Bh));
                aVar.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.floors.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.f257206a.e(view3);
                    }
                });
                view2 = aVar;
            }
        }
        if (getItemViewType(i10) == 0 && (view2 instanceof com.planner5d.library.widget.editor.popup.floors.view.g)) {
            ItemFloor itemFloor = (ItemFloor) this.f257208a.get(h(i10)).second;
            view2.setVisibility(0);
            com.planner5d.library.widget.editor.popup.floors.view.g gVar2 = (com.planner5d.library.widget.editor.popup.floors.view.g) view2;
            gVar2.setGrabButtonVisibility(this.f257208a.size() > 1 ? 0 : 4);
            gVar2.n(this.f257210c).l(this.f257208a.size() < 3, this.f257208a.size() > 1).m(itemFloor, itemFloor == this.f257209b.getActiveFloor());
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public void i(ItemProject itemProject, com.planner5d.library.widget.editor.popup.floors.view.g.a aVar) {
        this.f257209b = itemProject;
        this.f257210c = aVar;
        this.f257208a.clear();
        this.f257208a.addAll(itemProject.getFloors(false));
        notifyDataSetChanged();
    }

    public void j(int i10, int i11) {
        int iH = h(i10);
        int iH2 = h(i11);
        Pair<Integer, ItemFloor> pair = this.f257208a.get(iH);
        List<Pair<Integer, ItemFloor>> list = this.f257208a;
        list.set(iH, list.get(iH2));
        this.f257208a.set(iH2, pair);
    }
}
