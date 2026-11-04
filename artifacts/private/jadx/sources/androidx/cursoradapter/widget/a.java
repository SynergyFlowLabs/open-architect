package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends BaseAdapter implements Filterable, androidx.cursoradapter.widget.b.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f49164j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f49165k = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected boolean f49166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected boolean f49167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected Cursor f49168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected Context f49169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected int f49170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected C0420a f49171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected DataSetObserver f49172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected androidx.cursoradapter.widget.b f49173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected FilterQueryProvider f49174i;

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    private class C0420a extends ContentObserver {
        C0420a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.j();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f49166a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f49166a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        f(context, cursor, 1);
    }

    public void a(Cursor cursor) {
        Cursor cursorL = l(cursor);
        if (cursorL != null) {
            cursorL.close();
        }
    }

    @Override // androidx.cursoradapter.widget.b.a
    public Cursor b() {
        return this.f49168c;
    }

    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f49174i;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f49168c;
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public FilterQueryProvider e() {
        return this.f49174i;
    }

    void f(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f49167b = true;
        } else {
            this.f49167b = false;
        }
        boolean z10 = cursor != null;
        this.f49168c = cursor;
        this.f49166a = z10;
        this.f49169d = context;
        this.f49170e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f49171f = new C0420a();
            this.f49172g = new b();
        } else {
            this.f49171f = null;
            this.f49172g = null;
        }
        if (z10) {
            C0420a c0420a = this.f49171f;
            if (c0420a != null) {
                cursor.registerContentObserver(c0420a);
            }
            DataSetObserver dataSetObserver = this.f49172g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    protected void g(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f49166a || (cursor = this.f49168c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f49166a) {
            return null;
        }
        this.f49168c.moveToPosition(i10);
        if (view == null) {
            view = h(this.f49169d, this.f49168c, viewGroup);
        }
        d(view, this.f49169d, this.f49168c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f49173h == null) {
            this.f49173h = new androidx.cursoradapter.widget.b(this);
        }
        return this.f49173h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f49166a || (cursor = this.f49168c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f49168c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f49166a && (cursor = this.f49168c) != null && cursor.moveToPosition(i10)) {
            return this.f49168c.getLong(this.f49170e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f49166a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f49168c.moveToPosition(i10)) {
            if (view == null) {
                view = i(this.f49169d, this.f49168c, viewGroup);
            }
            d(view, this.f49169d, this.f49168c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return i(context, cursor, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public abstract View i(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void j() {
        Cursor cursor;
        if (!this.f49167b || (cursor = this.f49168c) == null || cursor.isClosed()) {
            return;
        }
        this.f49166a = this.f49168c.requery();
    }

    public void k(FilterQueryProvider filterQueryProvider) {
        this.f49174i = filterQueryProvider;
    }

    public Cursor l(Cursor cursor) {
        Cursor cursor2 = this.f49168c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0420a c0420a = this.f49171f;
            if (c0420a != null) {
                cursor2.unregisterContentObserver(c0420a);
            }
            DataSetObserver dataSetObserver = this.f49172g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f49168c = cursor;
        if (cursor == null) {
            this.f49170e = -1;
            this.f49166a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0420a c0420a2 = this.f49171f;
        if (c0420a2 != null) {
            cursor.registerContentObserver(c0420a2);
        }
        DataSetObserver dataSetObserver2 = this.f49172g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f49170e = cursor.getColumnIndexOrThrow("_id");
        this.f49166a = true;
        notifyDataSetChanged();
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i10) {
        f(context, cursor, i10);
    }
}
