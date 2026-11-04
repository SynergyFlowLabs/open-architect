package androidx.databinding.adapters;

import android.widget.TimePicker;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class g0 {

    class a implements TimePicker.OnTimeChangedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TimePicker.OnTimeChangedListener f49284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49286c;

        a(TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
            this.f49284a = onTimeChangedListener;
            this.f49285b = oVar;
            this.f49286c = oVar2;
        }

        @Override // android.widget.TimePicker.OnTimeChangedListener
        public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f49284a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i10, i11);
            }
            androidx.databinding.o oVar = this.f49285b;
            if (oVar != null) {
                oVar.a();
            }
            androidx.databinding.o oVar2 = this.f49286c;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
    }

    @androidx.databinding.n(attribute = "android:hour")
    public static int a(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @androidx.databinding.n(attribute = "android:minute")
    public static int b(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @androidx.databinding.d({"android:hour"})
    public static void c(TimePicker timePicker, int i10) {
        if (timePicker.getHour() != i10) {
            timePicker.setHour(i10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void d(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, androidx.databinding.o oVar, androidx.databinding.o oVar2) {
        if (oVar == null && oVar2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new a(onTimeChangedListener, oVar, oVar2));
        }
    }

    @androidx.databinding.d({"android:minute"})
    public static void e(TimePicker timePicker, int i10) {
        if (timePicker.getMinute() != i10) {
            timePicker.setMinute(i10);
        }
    }
}
