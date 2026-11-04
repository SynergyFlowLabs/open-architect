package com.planner5d.library.widget.editor.projectsettings;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.y;
import com.planner5d.library.services.bitmaploader.target.h;
import com.planner5d.library.widget.editor.popup.properties.view.j;
import rx.Observable;
import rx.subjects.PublishSubject;

/* JADX INFO: loaded from: classes8.dex */
public class d extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f258102d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ItemMaterial[] f258099a = {new ItemMaterial((String) null, -1), new ItemMaterial((String) null, -3549976), new ItemMaterial((String) null, -1320766), new ItemMaterial((String) null, -1, "bg_1_fill.png"), new ItemMaterial((String) null, -9924519, "ground_1.jpg"), new ItemMaterial((String) null, -11570118, "ground_12.jpg"), new ItemMaterial((String) null, -7637418, "ground_1001.jpg"), new ItemMaterial((String) null, -7569801, "path_4.jpg"), new ItemMaterial((String) null, -9011636, "ground_1008.jpg")};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f258100b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f258101c = com.planner5d.library.f.g.f167122m3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PublishSubject<ItemMaterial> f258103e = PublishSubject.create();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PublishSubject<Void> f258104f = PublishSubject.create();

    class a extends RecyclerView.g0 {
        a(View view) {
            super(view);
        }
    }

    public d(h hVar) {
        int i10 = 4 << 0;
        this.f258102d = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        o(((Integer) view.getTag()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        this.f258104f.onNext(null);
    }

    private void o(int i10) {
        notifyItemChanged(this.f258100b);
        this.f258100b = i10;
        notifyItemChanged(i10);
        this.f258103e.onNext(l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f258099a.length;
    }

    public Observable<ItemMaterial> j() {
        return this.f258103e;
    }

    public Observable<Void> k() {
        return this.f258104f;
    }

    public ItemMaterial l() {
        return this.f258099a[this.f258100b];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        g0Var.itemView.setTag(Integer.valueOf(i10));
        ((j) g0Var.itemView).u(this.f258099a[i10], null, null).setSelected(i10 == this.f258100b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        j jVar = new j(viewGroup.getContext(), false, this.f258101c, null, this.f258102d);
        jVar.r(true);
        jVar.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.projectsettings.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258097a.m(view);
            }
        });
        jVar.setErrorInfoButtonListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.projectsettings.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f258098a.n(view);
            }
        });
        return new a(jVar);
    }

    public void p(ItemMaterial itemMaterial) {
        int i10 = 0;
        while (true) {
            ItemMaterial[] itemMaterialArr = this.f258099a;
            if (i10 >= itemMaterialArr.length) {
                i10 = 3;
                break;
            }
            ItemMaterial itemMaterial2 = itemMaterialArr[i10];
            if (itemMaterial.texture != null) {
                y yVar = itemMaterial2.texture;
                if (yVar != null && yVar.f222851c != null && y.b(yVar).equals(y.b(itemMaterial.texture))) {
                    break;
                } else {
                    i10++;
                }
            } else if (itemMaterial2.texture == null && itemMaterial.color.equals(itemMaterial2.color)) {
                break;
            } else {
                i10++;
            }
        }
        o(i10);
    }

    public void q(int i10) {
        this.f258101c = i10;
    }
}
