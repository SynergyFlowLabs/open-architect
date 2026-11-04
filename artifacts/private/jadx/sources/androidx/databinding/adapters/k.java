package androidx.databinding.adapters;

import android.widget.CompoundButton;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @androidx.databinding.g(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@b1({b1.a.LIBRARY})
@androidx.databinding.q({@androidx.databinding.p(attribute = "android:checked", type = CompoundButton.class)})
public class k {

    class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f49292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49293b;

        a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
            this.f49292a = onCheckedChangeListener;
            this.f49293b = oVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f49292a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
            }
            this.f49293b.a();
        }
    }

    @androidx.databinding.d({"android:checked"})
    public static void a(CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isChecked() != z10) {
            compoundButton.setChecked(z10);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
