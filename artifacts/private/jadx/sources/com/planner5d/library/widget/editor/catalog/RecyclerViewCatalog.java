package com.planner5d.library.widget.editor.catalog;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.widget.f1;

/* JADX INFO: loaded from: classes12.dex */
public class RecyclerViewCatalog extends f1 {
    private final GridLayoutManager Z4;

    class a extends GridLayoutManager.c {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            RecyclerView.h adapter = RecyclerViewCatalog.this.getAdapter();
            if (adapter instanceof com.planner5d.library.widget.editor.catalog.adapter.a) {
                return Math.min(((com.planner5d.library.widget.editor.catalog.adapter.a) adapter).i(i10), RecyclerViewCatalog.this.Z4.H3());
            }
            return 0;
        }
    }

    public RecyclerViewCatalog(Context context) {
        this(context, null);
    }

    public void setSpanCount(int i10) {
        GridLayoutManager gridLayoutManager = this.Z4;
        if (gridLayoutManager != null) {
            gridLayoutManager.Q3(i10);
        }
    }

    public RecyclerViewCatalog(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewCatalog(Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2, 1, false);
        this.Z4 = gridLayoutManager;
        gridLayoutManager.R3(new a());
        setLayoutManager(gridLayoutManager);
    }
}
