package androidx.databinding.adapters;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @androidx.databinding.g(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:selectedItemPosition", type = AdapterView.class), @androidx.databinding.p(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
public class e {

    public interface a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10);
    }

    public static class b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f49267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f49268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.databinding.o f49269c;

        public b(a aVar, c cVar, androidx.databinding.o oVar) {
            this.f49267a = aVar;
            this.f49268b = cVar;
            this.f49269c = oVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            a aVar = this.f49267a;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i10, j10);
            }
            androidx.databinding.o oVar = this.f49269c;
            if (oVar != null) {
                oVar.a();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            c cVar = this.f49268b;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            androidx.databinding.o oVar = this.f49269c;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    public interface c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void a(AdapterView adapterView, a aVar, c cVar, androidx.databinding.o oVar) {
        if (aVar == null && cVar == null && oVar == null) {
            adapterView.setOnItemSelectedListener(null);
        } else {
            adapterView.setOnItemSelectedListener(new b(aVar, cVar, oVar));
        }
    }

    @androidx.databinding.d({"android:selectedItemPosition"})
    public static void b(AdapterView adapterView, int i10) {
        if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @androidx.databinding.d({"android:selectedItemPosition", "android:adapter"})
    public static void c(AdapterView adapterView, int i10, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
            adapterView.setSelection(i10);
        } else if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @androidx.databinding.d({"android:selection"})
    public static void d(AdapterView adapterView, int i10) {
        b(adapterView, i10);
    }

    @androidx.databinding.d({"android:selection", "android:adapter"})
    public static void e(AdapterView adapterView, int i10, Adapter adapter) {
        c(adapterView, i10, adapter);
    }
}
