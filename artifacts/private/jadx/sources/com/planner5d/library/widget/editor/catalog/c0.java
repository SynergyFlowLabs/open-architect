package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.f1;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v.e f254431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f254432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f254433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f254434d;

    private class a extends RecyclerView.h<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f254435a;

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f254435a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull b bVar, int i10) {
            bVar.j(this.f254435a.get(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            return c0.this.new b(LayoutInflater.from(viewGroup.getContext()).inflate(com.planner5d.library.f.m.f168721i6, viewGroup, false));
        }

        @e.a({"NotifyDataSetChanged"})
        public void j(List<String> list) {
            this.f254435a.clear();
            this.f254435a.addAll(list);
            notifyDataSetChanged();
        }

        private a() {
            this.f254435a = new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b extends RecyclerView.g0 {
        public b(View view) {
            super(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(String str, View view) {
            if (c0.this.f254431a != null) {
                c0.this.f254431a.a(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(final String str) {
            ((TextView) this.itemView.findViewById(com.planner5d.library.f.j.yu)).setText(str);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.catalog.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f254443a.i(str, view);
                }
            });
        }
    }

    public c0(Context context) {
        super(context);
        this.f254431a = null;
        this.f254434d = new a();
        b(context);
    }

    private void b(Context context) {
        LayoutInflater.from(context).inflate(com.planner5d.library.f.m.f168732j6, (ViewGroup) this, true);
        setOrientation(1);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.planner5d.library.f.g.f167420zh);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f254432b = (TextView) findViewById(com.planner5d.library.f.j.tv);
        d();
        this.f254433c = (RecyclerView) findViewById(com.planner5d.library.f.j.f168332qg);
        c();
    }

    private void c() {
        this.f254433c.setLayoutManager(new StaggeredGridLayoutManager(3, 0));
        this.f254433c.setAdapter(this.f254434d);
    }

    private void d() {
        this.f254432b.setText(getTitle());
        TextView textView = this.f254432b;
        androidx.core.widget.r.w(textView, com.planner5d.library.widget.drawable.c.f254258a.k(textView.getContext(), getIcon(), getIconRTL(), Integer.valueOf(androidx.core.content.d.g(this.f254432b.getContext(), com.planner5d.library.f.C1549f.f166403h2))), null, null, null);
    }

    @androidx.annotation.v
    abstract int getIcon();

    @androidx.annotation.v
    abstract int getIconRTL();

    @f1
    abstract int getTitle();

    public void setList(List<String> list) {
        this.f254434d.j(list);
        if (this.f254433c.getLayoutManager() != null) {
            ((StaggeredGridLayoutManager) this.f254433c.getLayoutManager()).v3((list.size() / 3) + 1);
        }
    }

    void setOnSearchListener(v.e eVar) {
        this.f254431a = eVar;
    }

    public c0(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f254431a = null;
        this.f254434d = new a();
        b(context);
    }

    public c0(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f254431a = null;
        this.f254434d = new a();
        b(context);
    }
}
