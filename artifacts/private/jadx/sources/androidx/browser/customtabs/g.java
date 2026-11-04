package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private Context f11928a;

    class a extends c {
        a(android.support.customtabs.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    @b1({b1.a.LIBRARY})
    @p0
    Context a() {
        return this.f11928a;
    }

    public abstract void b(@NonNull ComponentName componentName, @NonNull c cVar);

    @b1({b1.a.LIBRARY})
    void c(@NonNull Context context) {
        this.f11928a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.f11928a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        b(componentName, new a(android.support.customtabs.b.AbstractBinderC0006b.i(iBinder), componentName, this.f11928a));
    }
}
