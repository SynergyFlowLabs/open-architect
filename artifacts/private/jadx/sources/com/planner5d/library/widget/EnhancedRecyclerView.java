package com.planner5d.library.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.services.utility.u2;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes12.dex */
public class EnhancedRecyclerView extends f1 {
    private final int Z4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    private final int f249448a5;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    private e f249449b5;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    private int f249450c5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    private boolean f249451d5;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    final Queue<Runnable> f249452e5;

    class a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f249453e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f249454f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f249455g;

        a(int i10, GridLayoutManager gridLayoutManager, int i11) {
            this.f249453e = i10;
            this.f249454f = gridLayoutManager;
            this.f249455g = i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i10) {
            if (i10 >= this.f249453e) {
                return 1;
            }
            int iH3 = this.f249454f.H3();
            int i11 = this.f249455g;
            if (iH3 <= i11) {
                return i11;
            }
            return 1;
        }
    }

    class b extends GridLayoutManager {
        b(Context context, int i10) {
            super(context, i10);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public boolean n2() {
            return false;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public void t1(RecyclerView.c0 c0Var) {
            super.t1(c0Var);
            EnhancedRecyclerView.this.h2(c0Var);
        }
    }

    class c extends LinearLayoutManager {
        c(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
        public void t1(RecyclerView.c0 c0Var) {
            super.t1(c0Var);
            EnhancedRecyclerView.this.h2(c0Var);
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f249458a;

        static {
            int[] iArr = new int[e.values().length];
            f249458a = iArr;
            try {
                iArr[e.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f249458a[e.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        GRID,
        LIST
    }

    public EnhancedRecyclerView(Context context) {
        this(context, null);
    }

    private void f2() {
        Context context = getContext();
        int i10 = d.f249458a[this.f249449b5.ordinal()];
        if (i10 == 1) {
            setLayoutManager(new b(context, 1));
            x.h(this, context, c1.f.Id);
        } else if (i10 == 2) {
            setLayoutManager(new c(context));
            for (int i11 = 0; i11 < getItemDecorationCount(); i11++) {
                z1(i11);
            }
        }
        RecyclerView.h adapter = getAdapter();
        if (adapter != null) {
            setAdapter(adapter);
        }
    }

    public static int g2(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = i11;
        while (i14 < i12) {
            i14 += i10 + i11;
            if (i14 > i12) {
                break;
            }
            i13++;
        }
        return Math.max(i13, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h2(RecyclerView.c0 c0Var) {
        if (c0Var.d() <= 0 || this.f249452e5.isEmpty()) {
            return;
        }
        while (!this.f249452e5.isEmpty()) {
            this.f249452e5.remove().run();
        }
    }

    public Bundle getContentBundleWithScrollPosition() {
        com.planner5d.library.services.utility.i iVar = new com.planner5d.library.services.utility.i();
        u2 scrollPosition = getScrollPosition();
        if (scrollPosition != null) {
            iVar.h(com.planner5d.library.services.r.scrollPosition, scrollPosition.d());
        }
        return iVar.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int i10, int i11) {
        RecyclerView.p layoutManager = getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            super.onMeasure(i10, i11);
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int iG2 = g2(this.Z4, this.f249448a5, Math.max(View.MeasureSpec.getSize(i10), 1));
        if (iG2 != gridLayoutManager.H3() || this.f249451d5) {
            gridLayoutManager.Q3(iG2);
            this.f249451d5 = false;
            gridLayoutManager.R3(new a(this.f249450c5, gridLayoutManager, iG2));
            requestLayout();
        }
        super.onMeasure(i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.h hVar) {
        super.setAdapter(hVar);
        if (hVar instanceof RecyclerView.y) {
            RecyclerView.w recycledViewPool = getRecycledViewPool();
            recycledViewPool.n(0, 30);
            recycledViewPool.n(1, 30);
            recycledViewPool.n(2, 30);
            setRecyclerListener((RecyclerView.y) hVar);
        }
    }

    public void setAppearanceMode(@NonNull e eVar) {
        if (this.f249449b5 != eVar) {
            this.f249449b5 = eVar;
            f2();
        }
    }

    public void setHasTopRows(int i10) {
        this.f249450c5 = i10;
        if (getLayoutManager() instanceof GridLayoutManager) {
            this.f249451d5 = true;
            requestLayout();
        }
    }

    public EnhancedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EnhancedRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f249449b5 = e.GRID;
        this.f249450c5 = 0;
        this.f249452e5 = new LinkedList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.s.Qg, i10, 0);
        this.Z4 = Math.max(typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.Sg, (int) getResources().getDimension(c1.f.f251225qe)), 1);
        this.f249448a5 = Math.max(typedArrayObtainStyledAttributes.getDimensionPixelSize(c1.s.Rg, (int) getResources().getDimension(c1.f.Id)), 1);
        typedArrayObtainStyledAttributes.recycle();
        f2();
        setItemAnimator(null);
    }
}
