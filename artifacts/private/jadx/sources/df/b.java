package df;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.planner5d.library.f;
import com.planner5d.library.model.Folder;
import com.planner5d.library.services.utility.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class b extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Folder> f274553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f274554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f274555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f274556d;

    public interface a {
        void a();
    }

    public b(List<Folder> list, p0 p0Var, a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f274553a = arrayList;
        int i10 = 7 >> 0;
        this.f274556d = null;
        this.f274554b = p0Var;
        arrayList.addAll(list);
        this.f274555c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        View view2 = this.f274556d;
        if (view2 != null) {
            view2.setSelected(false);
        }
        view.setSelected(true);
        this.f274556d = view;
        this.f274555c.a();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Folder getItem(int i10) {
        if (i10 > 0) {
            return this.f274553a.get(i10 - 1);
        }
        return null;
    }

    public Folder c() {
        View view = this.f274556d;
        if (view == null) {
            return null;
        }
        return ((c) view).getFolder();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f274553a.size() > 0) {
            return this.f274553a.size() + 1;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView;
        c cVar;
        boolean z10 = getItemViewType(i10) == 1;
        View view2 = view;
        if (view == null) {
            if (z10) {
                cVar = new c(viewGroup.getContext());
            } else {
                textView = new TextView(viewGroup.getContext());
                textView.setLayoutParams(new AbsListView.LayoutParams(-1, (int) viewGroup.getResources().getDimension(f.g.I3)));
                textView.setTextColor(-14408668);
                textView.setText(viewGroup.getContext().getText(f.s.f169564yc));
                textView.setGravity(8388627);
                textView.setBackgroundColor(-1184275);
                textView.setBackgroundResource(f.h.f167757r5);
                textView.setPadding((int) viewGroup.getResources().getDimension(f.g.J3), 0, 0, 0);
            }
        }
        if (!z10) {
            view2 = textView;
            view2 = cVar;
            view2.setOnClickListener(null);
            return view2;
        }
        view2 = textView;
        view2 = cVar;
        ((c) view2).i(getItem(i10), this.f274554b);
        view2.setOnClickListener(new View.OnClickListener() { // from class: df.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f274552a.d(view3);
            }
        });
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
