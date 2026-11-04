package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f49178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f49179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private LayoutInflater f49180n;

    @Deprecated
    public c(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f49179m = i10;
        this.f49178l = i10;
        this.f49180n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f49180n.inflate(this.f49179m, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f49180n.inflate(this.f49178l, viewGroup, false);
    }

    public void m(int i10) {
        this.f49179m = i10;
    }

    public void n(int i10) {
        this.f49178l = i10;
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f49179m = i10;
        this.f49178l = i10;
        this.f49180n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f49179m = i10;
        this.f49178l = i10;
        this.f49180n = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
