package androidx.databinding.adapters;

import android.widget.RadioGroup;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
public class v {

    class a implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RadioGroup.OnCheckedChangeListener f49314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49315b;

        a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f49314a = onCheckedChangeListener;
            this.f49315b = oVar;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f49314a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i10);
            }
            this.f49315b.a();
        }
    }

    @androidx.databinding.d({"android:checkedButton"})
    public static void a(RadioGroup radioGroup, int i10) {
        if (i10 != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void b(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
