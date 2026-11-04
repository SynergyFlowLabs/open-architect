package androidx.databinding.adapters;

import android.widget.DatePicker;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:year", type = DatePicker.class), @androidx.databinding.p(attribute = "android:month", type = DatePicker.class), @androidx.databinding.p(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
public class m {

    private static class b implements DatePicker.OnDateChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        DatePicker.OnDateChangedListener f49299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.databinding.o f49300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.databinding.o f49301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        androidx.databinding.o f49302d;

        private b() {
        }

        public void a(DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
            this.f49299a = onDateChangedListener;
            this.f49300b = oVar;
            this.f49301c = oVar2;
            this.f49302d = oVar3;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i10, int i11, int i12) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.f49299a;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i10, i11, i12);
            }
            androidx.databinding.o oVar = this.f49300b;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f49301c;
            if (oVar2 != null) {
                oVar2.a();
            }
            androidx.databinding.o oVar3 = this.f49302d;
            if (oVar3 != null) {
                oVar3.a();
            }
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void a(DatePicker datePicker, int i10, int i11, int i12, DatePicker.OnDateChangedListener onDateChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2, androidx.databinding.o oVar3) {
        if (i10 == 0) {
            i10 = datePicker.getYear();
        }
        if (i12 == 0) {
            i12 = datePicker.getDayOfMonth();
        }
        if (oVar == null && oVar2 == null && oVar3 == null) {
            datePicker.init(i10, i11, i12, onDateChangedListener);
            return;
        }
        b bVar = (b) r.a(datePicker, androidx.databinding.library.baseAdapters.b.a.f49425b);
        if (bVar == null) {
            bVar = new b();
            r.b(datePicker, bVar, androidx.databinding.library.baseAdapters.b.a.f49425b);
        }
        bVar.a(onDateChangedListener, oVar, oVar2, oVar3);
        datePicker.init(i10, i11, i12, bVar);
    }
}
