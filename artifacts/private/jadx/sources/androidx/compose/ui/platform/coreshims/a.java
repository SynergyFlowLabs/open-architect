package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f40372a;

    @w0(26)
    private a(AutofillId autofillId) {
        this.f40372a = autofillId;
    }

    @w0(26)
    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    @w0(26)
    public AutofillId a() {
        return (AutofillId) this.f40372a;
    }
}
