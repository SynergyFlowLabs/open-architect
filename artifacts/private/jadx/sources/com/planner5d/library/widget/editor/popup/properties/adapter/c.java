package com.planner5d.library.widget.editor.popup.properties.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.item.ItemMaterialSet;
import com.planner5d.library.model.item.ItemMaterialSets;

/* JADX INFO: loaded from: classes8.dex */
public class c extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ItemMaterialSet[] f257936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ItemMaterialSet f257937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f257938c;

    public interface a {
        void a(ItemMaterialSet itemMaterialSet);
    }

    static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f257939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ItemMaterialSet f257940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f257941c;

        /* JADX INFO: Access modifiers changed from: private */
        public void i(ItemMaterialSet itemMaterialSet) {
            boolean z10 = itemMaterialSet == this.f257941c.f257937b;
            TextView textView = this.f257939a;
            this.f257940b = itemMaterialSet;
            textView.setText(itemMaterialSet.getTitle(this.f257941c.f257937b));
            TextView textView2 = this.f257939a;
            textView2.setTextColor(androidx.core.content.d.g(textView2.getContext(), z10 ? com.planner5d.library.f.C1549f.f166437ic : com.planner5d.library.f.C1549f.f166521m1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(c cVar, View view) {
            cVar.l(this.f257940b);
        }

        private b(ViewGroup viewGroup, final c cVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(com.planner5d.library.f.m.A7, viewGroup, false));
            this.f257940b = null;
            this.f257941c = cVar;
            this.f257939a = (TextView) this.itemView.findViewById(com.planner5d.library.f.j.tv);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.popup.properties.adapter.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f257942a.j(cVar, view);
                }
            });
        }
    }

    public c(ItemMaterialSets itemMaterialSets, ItemMaterialSet itemMaterialSet, a aVar) {
        this.f257936a = itemMaterialSets.get();
        this.f257937b = itemMaterialSet;
        this.f257938c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(ItemMaterialSet itemMaterialSet) {
        ItemMaterialSet itemMaterialSet2 = this.f257937b;
        this.f257937b = itemMaterialSet;
        a aVar = this.f257938c;
        if (aVar != null) {
            aVar.a(itemMaterialSet);
        }
        int i10 = 0;
        while (true) {
            ItemMaterialSet[] itemMaterialSetArr = this.f257936a;
            if (i10 >= itemMaterialSetArr.length) {
                return;
            }
            ItemMaterialSet itemMaterialSet3 = itemMaterialSetArr[i10];
            if (itemMaterialSet3 == itemMaterialSet2 || itemMaterialSet3 == this.f257937b) {
                notifyItemChanged(i10);
            }
            i10++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        ItemMaterialSet[] itemMaterialSetArr = this.f257936a;
        if (itemMaterialSetArr == null) {
            return 0;
        }
        return itemMaterialSetArr.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        bVar.i(this.f257936a[i10]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(viewGroup, this);
    }
}
