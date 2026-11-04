package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.b1;
import androidx.appcompat.widget.j1;

/* JADX INFO: loaded from: classes.dex */
@b1({b1.a.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements g.b, o, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f10590c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f10591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10592b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.o
    public void a(g gVar) {
        this.f10591a = gVar;
    }

    @Override // androidx.appcompat.view.menu.g.b
    public boolean b(j jVar) {
        return this.f10591a.P(jVar, 0);
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return this.f10592b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b((j) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        j1 j1VarG = j1.G(context, attributeSet, f10590c, i10, 0);
        if (j1VarG.C(0)) {
            setBackgroundDrawable(j1VarG.h(0));
        }
        if (j1VarG.C(1)) {
            setDivider(j1VarG.h(1));
        }
        j1VarG.I();
    }
}
