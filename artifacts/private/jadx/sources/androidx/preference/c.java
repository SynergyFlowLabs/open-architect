package androidx.preference;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class c extends k {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final String f72986w3 = "EditTextPreferenceDialogFragment.text";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final int f72987x3 = 1000;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private EditText f72988s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private CharSequence f72989t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private final Runnable f72990u3 = new a();

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private long f72991v3 = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.L();
        }
    }

    private EditTextPreference I() {
        return (EditTextPreference) A();
    }

    private boolean J() {
        long j10 = this.f72991v3;
        return j10 != -1 && j10 + 1000 > SystemClock.currentThreadTimeMillis();
    }

    @NonNull
    public static c K(String str) {
        c cVar = new c();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    private void M(boolean z10) {
        this.f72991v3 = z10 ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // androidx.preference.k
    @b1({b1.a.LIBRARY})
    protected boolean B() {
        return true;
    }

    @Override // androidx.preference.k
    protected void C(@NonNull View view) {
        super.C(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f72988s3 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f72988s3.setText(this.f72989t3);
        EditText editText2 = this.f72988s3;
        editText2.setSelection(editText2.getText().length());
        if (I().V1() != null) {
            I().V1().a(this.f72988s3);
        }
    }

    @Override // androidx.preference.k
    public void E(boolean z10) {
        if (z10) {
            String string = this.f72988s3.getText().toString();
            EditTextPreference editTextPreferenceI = I();
            if (editTextPreferenceI.c(string)) {
                editTextPreferenceI.Y1(string);
            }
        }
    }

    @Override // androidx.preference.k
    @b1({b1.a.LIBRARY})
    protected void H() {
        M(true);
        L();
    }

    @b1({b1.a.LIBRARY})
    void L() {
        if (J()) {
            EditText editText = this.f72988s3;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.f72988s3.getContext().getSystemService("input_method")).showSoftInput(this.f72988s3, 0)) {
                    M(false);
                    return;
                } else {
                    this.f72988s3.removeCallbacks(this.f72990u3);
                    this.f72988s3.postDelayed(this.f72990u3, 50L);
                    return;
                }
            }
            M(false);
        }
    }

    @Override // androidx.preference.k, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f72989t3 = I().W1();
        } else {
            this.f72989t3 = bundle.getCharSequence(f72986w3);
        }
    }

    @Override // androidx.preference.k, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f72986w3, this.f72989t3);
    }
}
