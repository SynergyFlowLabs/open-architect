package androidx.databinding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.b1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
class t<T> extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<T> f49306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.databinding.y.a f49307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f49308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f49310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f49311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LayoutInflater f49312g;

    class a extends androidx.databinding.y.a {
        a() {
        }

        @Override // androidx.databinding.y.a
        public void a(androidx.databinding.y yVar) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void c(androidx.databinding.y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void f(androidx.databinding.y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void g(androidx.databinding.y yVar, int i10, int i11, int i12) {
            t.this.notifyDataSetChanged();
        }

        @Override // androidx.databinding.y.a
        public void h(androidx.databinding.y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }
    }

    public t(Context context, List<T> list, int i10, int i11, int i12) {
        this.f49308c = context;
        this.f49310e = i10;
        this.f49309d = i11;
        this.f49311f = i12;
        this.f49312g = i10 == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        b(list);
    }

    public View a(int i10, int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i10 == 0 ? new TextView(this.f49308c) : this.f49312g.inflate(i10, viewGroup, false);
        }
        int i12 = this.f49311f;
        TextView textView = (TextView) (i12 == 0 ? view : view.findViewById(i12));
        T t10 = this.f49306a.get(i11);
        textView.setText(t10 instanceof CharSequence ? (CharSequence) t10 : String.valueOf(t10));
        return view;
    }

    public void b(List<T> list) {
        List<T> list2 = this.f49306a;
        if (list2 == list) {
            return;
        }
        if (list2 instanceof androidx.databinding.y) {
            ((androidx.databinding.y) list2).f3(this.f49307b);
        }
        this.f49306a = list;
        if (list instanceof androidx.databinding.y) {
            if (this.f49307b == null) {
                this.f49307b = new a();
            }
            ((androidx.databinding.y) this.f49306a).X2(this.f49307b);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f49306a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f49309d, i10, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f49306a.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        return a(this.f49310e, i10, view, viewGroup);
    }
}
