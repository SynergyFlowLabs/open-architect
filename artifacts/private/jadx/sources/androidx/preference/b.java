package androidx.preference;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class b extends j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f72983v = "EditTextPreferenceDialogFragment.text";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private EditText f72984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f72985t;

    @Deprecated
    public b() {
    }

    private EditTextPreference h() {
        return (EditTextPreference) a();
    }

    @NonNull
    @Deprecated
    public static b i(String str) {
        b bVar = new b();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.preference.j
    @b1({b1.a.LIBRARY})
    protected boolean b() {
        return true;
    }

    @Override // androidx.preference.j
    protected void c(@NonNull View view) {
        super.c(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f72984s = editText;
        editText.requestFocus();
        EditText editText2 = this.f72984s;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f72985t);
        EditText editText3 = this.f72984s;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // androidx.preference.j
    @Deprecated
    public void e(boolean z10) {
        if (z10) {
            String string = this.f72984s.getText().toString();
            if (h().c(string)) {
                h().Y1(string);
            }
        }
    }

    @Override // androidx.preference.j, android.app.DialogFragment, android.app.Fragment
    public void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f72985t = h().W1();
        } else {
            this.f72985t = bundle.getCharSequence(f72983v);
        }
    }

    @Override // androidx.preference.j, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(f72983v, this.f72985t);
    }
}
