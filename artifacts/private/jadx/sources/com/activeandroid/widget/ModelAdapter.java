package com.activeandroid.widget;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.activeandroid.Model;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ModelAdapter<T extends Model> extends ArrayAdapter<T> {
    public ModelAdapter(Context context, int i10) {
        super(context, i10);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i10) {
        Model model = (Model) getItem(i10);
        if (model != null) {
            return model.getId().longValue();
        }
        return -1L;
    }

    public void setData(Collection<? extends T> collection) {
        clear();
        if (collection != null) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    public ModelAdapter(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    public ModelAdapter(Context context, int i10, List<T> list) {
        super(context, i10, list);
    }

    public ModelAdapter(Context context, int i10, int i11, List<T> list) {
        super(context, i10, i11, list);
    }
}
