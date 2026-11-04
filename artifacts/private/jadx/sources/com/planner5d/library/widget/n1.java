package com.planner5d.library.widget;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.planner5d.library.services.utility.h3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class n1<T> extends ArrayAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.l
    private final int f258413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, Integer> f258414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f258415c;

    public enum a {
        DEFAULT(c1.l.C2),
        DARK(c1.l.D2),
        SETTINGS(c1.l.E2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f258420a;

        a(int i10) {
            this.f258420a = i10;
        }
    }

    public n1(Context context, List<T> list) {
        super(context, a.DEFAULT.f258420a, list);
        this.f258414b = new HashMap();
        this.f258415c = true;
        this.f258413a = a(context, false);
    }

    @androidx.annotation.l
    private int a(Context context, boolean z10) {
        if (z10) {
            return -10658467;
        }
        return androidx.core.content.d.g(context, c1.e.G4);
    }

    public n1<T> b(boolean z10) {
        this.f258415c = z10;
        notifyDataSetInvalidated();
        return this;
    }

    public void c(int i10, @androidx.annotation.l Integer num) {
        this.f258414b.put(Integer.valueOf(i10), num);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        view2.setPadding((int) getContext().getResources().getDimension(c1.f.Id), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
        if (view == null) {
            if (this.f258415c) {
                androidx.core.widget.r.w((TextView) view2.findViewById(R.id.text1), null, null, com.planner5d.library.widget.drawable.c.f254258a.a(getContext(), c1.g.J6, Integer.valueOf(this.f258413a)), null);
            }
            TextView textView = (TextView) view2.findViewById(R.id.text1);
            Integer num = this.f258414b.containsKey(Integer.valueOf(i10)) ? this.f258414b.get(Integer.valueOf(i10)) : null;
            textView.setTextColor(num == null ? androidx.core.content.d.g(getContext(), c1.e.F4) : num.intValue());
            if (h3.U(viewGroup.getContext())) {
                textView.setLayoutDirection(1);
            }
        }
        return view2;
    }

    public n1(Context context, T[] tArr, a aVar) {
        super(context, aVar.f258420a, tArr);
        this.f258414b = new HashMap();
        this.f258415c = true;
        this.f258413a = a(context, aVar == a.DARK);
    }
}
