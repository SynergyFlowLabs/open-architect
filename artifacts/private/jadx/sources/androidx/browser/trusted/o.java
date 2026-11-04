package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Intent f11987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final List<Uri> f11988b;

    o(@NonNull Intent intent, @NonNull List<Uri> list) {
        this.f11987a = intent;
        this.f11988b = list;
    }

    private void b(Context context) {
        Iterator<Uri> it = this.f11988b.iterator();
        while (it.hasNext()) {
            context.grantUriPermission(this.f11987a.getPackage(), it.next(), 1);
        }
    }

    @NonNull
    public Intent a() {
        return this.f11987a;
    }

    public void c(@NonNull Context context) {
        b(context);
        androidx.core.content.d.A(context, this.f11987a, null);
    }
}
