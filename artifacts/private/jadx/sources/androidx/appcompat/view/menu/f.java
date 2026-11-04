package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.b1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public class f extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    g f10689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10690b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f10693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f10694f;

    public f(g gVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f10692d = z10;
        this.f10693e = layoutInflater;
        this.f10689a = gVar;
        this.f10694f = i10;
        a();
    }

    void a() {
        j jVarY = this.f10689a.y();
        if (jVarY != null) {
            ArrayList<j> arrayListC = this.f10689a.C();
            int size = arrayListC.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (arrayListC.get(i10) == jVarY) {
                    this.f10690b = i10;
                    return;
                }
            }
        }
        this.f10690b = -1;
    }

    public g b() {
        return this.f10689a;
    }

    public boolean c() {
        return this.f10691c;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public j getItem(int i10) {
        ArrayList<j> arrayListC = this.f10692d ? this.f10689a.C() : this.f10689a.H();
        int i11 = this.f10690b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return arrayListC.get(i10);
    }

    public void e(boolean z10) {
        this.f10691c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<j> arrayListC = this.f10692d ? this.f10689a.C() : this.f10689a.H();
        return this.f10690b < 0 ? arrayListC.size() : arrayListC.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f10693e.inflate(this.f10694f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f10689a.J() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        o.a aVar = (o.a) view;
        if (this.f10691c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.g(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
