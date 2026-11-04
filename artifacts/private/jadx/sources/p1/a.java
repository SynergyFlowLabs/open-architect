package p1;

import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f340739a;

    @w0(26)
    private a(@NonNull AutofillId autofillId) {
        this.f340739a = autofillId;
    }

    @NonNull
    @w0(26)
    public static a b(@NonNull AutofillId autofillId) {
        return new a(autofillId);
    }

    @NonNull
    @w0(26)
    public AutofillId a() {
        return (AutofillId) this.f340739a;
    }
}
