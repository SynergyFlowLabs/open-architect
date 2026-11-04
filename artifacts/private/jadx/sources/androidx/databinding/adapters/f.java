package androidx.databinding.adapters;

import android.widget.AutoCompleteTextView;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @androidx.databinding.g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
@b1({b1.a.LIBRARY})
public class f {

    class a implements AutoCompleteTextView.Validator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f49272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f49273b;

        a(c cVar, b bVar) {
            this.f49272a = cVar;
            this.f49273b = bVar;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public CharSequence fixText(CharSequence charSequence) {
            b bVar = this.f49273b;
            return bVar != null ? bVar.fixText(charSequence) : charSequence;
        }

        @Override // android.widget.AutoCompleteTextView.Validator
        public boolean isValid(CharSequence charSequence) {
            c cVar = this.f49272a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    public interface b {
        CharSequence fixText(CharSequence charSequence);
    }

    public interface c {
        boolean isValid(CharSequence charSequence);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void a(AutoCompleteTextView autoCompleteTextView, e.a aVar, e.c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener(null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new e.b(aVar, cVar, null));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void b(AutoCompleteTextView autoCompleteTextView, b bVar, c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator(null);
        } else {
            autoCompleteTextView.setValidator(new a(cVar, bVar));
        }
    }
}
