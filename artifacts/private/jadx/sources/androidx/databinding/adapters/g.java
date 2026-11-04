package androidx.databinding.adapters;

import android.widget.CalendarView;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:date", type = CalendarView.class)})
public class g {

    class a implements CalendarView.OnDateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CalendarView.OnDateChangeListener f49282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49283b;

        a(CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
            this.f49282a = onDateChangeListener;
            this.f49283b = oVar;
        }

        @Override // android.widget.CalendarView.OnDateChangeListener
        public void onSelectedDayChange(CalendarView calendarView, int i10, int i11, int i12) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f49282a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i10, i11, i12);
            }
            this.f49283b.a();
        }
    }

    @androidx.databinding.d({"android:date"})
    public static void a(CalendarView calendarView, long j10) {
        if (calendarView.getDate() != j10) {
            calendarView.setDate(j10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void b(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new a(onDateChangeListener, oVar));
        }
    }
}
