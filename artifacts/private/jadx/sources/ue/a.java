package ue;

import android.R;
import android.content.res.ColorStateList;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.planner5d.library.widget.c1;

/* JADX INFO: loaded from: classes12.dex */
public class a extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f381242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f381243b = null;

    public a(b[] bVarArr) {
        this.f381242a = bVarArr;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b getItem(int i10) {
        return this.f381242a[i10];
    }

    public a b(String str) {
        this.f381243b = str;
        notifyDataSetChanged();
        return this;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f381242a.length;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        if (b.f381244b != getItem(i10)) {
            return 0;
        }
        int i11 = 4 >> 1;
        return 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i10);
        boolean z10 = false;
        if (view == null) {
            if (itemViewType == 0) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(c1.l.f252162h2, viewGroup, false);
                ((TextView) view.findViewById(c1.i.f251801d3)).setText((CharSequence) ((Pair) getItem(i10)).second);
                androidx.core.widget.d.d((RadioButton) view.findViewById(c1.i.f251789c3), new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{androidx.core.content.d.g(viewGroup.getContext(), c1.e.f250847wf), androidx.core.content.d.g(viewGroup.getContext(), c1.e.Rf)}));
            } else {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(c1.l.f252170j2, viewGroup, false);
            }
        }
        if (itemViewType == 0) {
            RadioButton radioButton = (RadioButton) view.findViewById(c1.i.f251789c3);
            String str = this.f381243b;
            if (str != null && str.equals(String.valueOf(((Pair) getItem(i10)).first))) {
                z10 = true;
            }
            radioButton.setChecked(z10);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
