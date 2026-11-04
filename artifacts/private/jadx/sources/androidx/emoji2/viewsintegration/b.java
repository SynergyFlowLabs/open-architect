package androidx.emoji2.viewsintegration;

import android.text.Editable;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.emoji2.text.q;

/* JADX INFO: loaded from: classes2.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f51316a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("INSTANCE_LOCK")
    private static volatile Editable.Factory f51317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private static Class<?> f51318c;

    @e.a({"PrivateApi"})
    private b() {
        try {
            f51318c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f51317b == null) {
            synchronized (f51316a) {
                try {
                    if (f51317b == null) {
                        f51317b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f51317b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f51318c;
        return cls != null ? q.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
