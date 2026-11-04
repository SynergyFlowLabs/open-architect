package com.planner5d.library.widget.editor.popup.properties.adapter;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.services.utility.p0;
import java.util.List;
import rx.Observable;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class k<T> extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected static final int f257951j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected static final int f257952k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f257953l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f257954m = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f257956b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.services.bitmaploader.target.h f257960f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<b<T>> f257955a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final PublishSubject<T> f257957c = PublishSubject.create();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PublishSubject<Pair<T, Boolean>> f257958d = PublishSubject.create();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PublishSubject<Void> f257959e = PublishSubject.create();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ItemRoom f257961g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ItemProject f257962h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f257963i = null;

    class a extends RecyclerView.g0 {
        a(View view) {
            super(view);
        }
    }

    public k(p0 p0Var, com.planner5d.library.services.bitmaploader.target.h hVar) {
        this.f257956b = p0Var;
        this.f257960f = hVar;
    }

    private Integer r(T t10) {
        for (int i10 = 0; i10 < getItemCount(); i10++) {
            if (p(o(i10), t10)) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        this.f257959e.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(View view, CompoundButton compoundButton, boolean z10) {
        if (this.f257955a != null) {
            this.f257958d.onNext(new Pair<>(o(((Integer) view.getTag()).intValue()), Boolean.valueOf(z10)));
        }
    }

    public void A(View view) {
        this.f257957c.onNext(o(((Integer) view.getTag()).intValue()));
    }

    public void B(T t10) {
        C(r(t10));
    }

    protected void C(Integer num) {
        if (num != null) {
            notifyItemChanged(num.intValue());
        }
        Integer num2 = this.f257963i;
        if (num2 != null && !num2.equals(num)) {
            notifyItemChanged(this.f257963i.intValue());
        }
        this.f257963i = num;
    }

    protected void D(Integer num) {
        this.f257963i = num;
    }

    public void E(T t10) {
        if (t10 != null) {
            D(r(t10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        List<b<T>> list = this.f257955a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (this.f257955a.get(i10).c() == null && this.f257955a.get(i10).a() == null) {
            return 2;
        }
        return this.f257955a.get(i10).c() == null ? 0 : 1;
    }

    protected Integer j() {
        return null;
    }

    public Observable<Void> k() {
        return this.f257959e;
    }

    protected Integer l() {
        return Integer.valueOf(com.planner5d.library.f.h.C9);
    }

    protected boolean m() {
        return true;
    }

    protected com.planner5d.library.widget.editor.popup.properties.view.j n(Context context, boolean z10) {
        return new com.planner5d.library.widget.editor.popup.properties.view.j(context, z10, q(), this.f257956b, this.f257960f);
    }

    protected T o(int i10) {
        List<b<T>> list = this.f257955a;
        if (list == null) {
            return null;
        }
        return list.get(i10).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        g0Var.itemView.setTag(Integer.valueOf(i10));
        boolean z10 = true;
        if (getItemViewType(i10) > 1 || this.f257955a == null) {
            return;
        }
        com.planner5d.library.widget.editor.popup.properties.view.j jVar = (com.planner5d.library.widget.editor.popup.properties.view.j) g0Var.itemView;
        x(jVar, o(i10), this.f257955a.get(i10).c(), this.f257962h, this.f257961g);
        Integer num = this.f257963i;
        if (num == null || i10 != num.intValue()) {
            z10 = false;
        }
        jVar.setSelected(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 == 4) {
            com.planner5d.library.widget.editor.popup.properties.view.a aVar = new com.planner5d.library.widget.editor.popup.properties.view.a(viewGroup.getContext());
            aVar.setButtonSize(q());
            aVar.setButtonImage(l().intValue());
            if (j() != null) {
                aVar.setButtonBackground(j().intValue());
            }
            aVar.setLabelVisibility(m());
            aVar.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f257947a.s(view2);
                }
            });
            view = aVar;
        } else {
            Context context = viewGroup.getContext();
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            final com.planner5d.library.widget.editor.popup.properties.view.j jVarN = n(context, z10);
            if (i10 == 2) {
                jVarN.s();
            } else {
                jVarN.setOnCheckedChangedListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.i
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        this.f257948a.t(jVarN, compoundButton, z11);
                    }
                });
                jVarN.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f257950a.A(view2);
                    }
                });
            }
            view = jVarN;
        }
        return new a(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NonNull RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        if (view instanceof com.planner5d.library.widget.editor.popup.properties.view.j) {
            ((com.planner5d.library.widget.editor.popup.properties.view.j) view).s();
        }
    }

    protected abstract boolean p(T t10, T t11);

    @androidx.annotation.q
    public int q() {
        return com.planner5d.library.f.g.f167078k3;
    }

    public Observable<T> u() {
        return this.f257957c;
    }

    public Observable<Pair<T, Boolean>> v() {
        return this.f257958d;
    }

    public void w(T t10) {
        Integer numR;
        if (t10 == null || (numR = r(t10)) == null) {
            return;
        }
        notifyItemChanged(numR.intValue());
    }

    protected abstract void x(com.planner5d.library.widget.editor.popup.properties.view.j jVar, T t10, String str, ItemProject itemProject, ItemRoom itemRoom);

    @e.a({"NotifyDataSetChanged"})
    public void y(List<b<T>> list, ItemProject itemProject, ItemRoom itemRoom) {
        this.f257955a = list;
        this.f257961g = itemRoom;
        this.f257962h = itemProject;
        notifyDataSetChanged();
    }

    @e.a({"NotifyDataSetChanged"})
    public void z(@NonNull T[] tArr, String[] strArr, ItemProject itemProject, ItemRoom itemRoom) {
        if (strArr == null) {
            this.f257955a = new com.planner5d.library.widget.editor.popup.properties.adapter.a().c(tArr).e();
        } else {
            this.f257955a = new com.planner5d.library.widget.editor.popup.properties.adapter.a().d(strArr, tArr).e();
        }
        this.f257961g = itemRoom;
        this.f257962h = itemProject;
        notifyDataSetChanged();
    }
}
