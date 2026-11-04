package androidx.databinding.adapters;

import android.widget.NumberPicker;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @androidx.databinding.g(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:value", type = NumberPicker.class)})
public class s {

    class a implements NumberPicker.OnValueChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NumberPicker.OnValueChangeListener f49304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49305b;

        a(NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
            this.f49304a = onValueChangeListener;
            this.f49305b = oVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i10, int i11) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f49304a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i10, i11);
            }
            this.f49305b.a();
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void a(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new a(onValueChangeListener, oVar));
        }
    }

    @androidx.databinding.d({"android:value"})
    public static void b(NumberPicker numberPicker, int i10) {
        if (numberPicker.getValue() != i10) {
            numberPicker.setValue(i10);
        }
    }
}
