package androidx.media2.session;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f59433b = "MediaSessionManager";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f59434c = Log.isLoggable(f59433b, 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f59435d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("sLock")
    private static v f59436e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f59437a;

    private v(Context context) {
        this.f59437a = context;
    }

    @NonNull
    public static v a(@NonNull Context context) {
        v vVar;
        if (context == null) {
            throw new NullPointerException("context shouldn't be null");
        }
        synchronized (f59435d) {
            try {
                if (f59436e == null) {
                    f59436e = new v(context.getApplicationContext());
                }
                vVar = f59436e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    @NonNull
    public Set<SessionToken> b() {
        ServiceInfo serviceInfo;
        androidx.collection.c cVar = new androidx.collection.c();
        PackageManager packageManager = this.f59437a.getPackageManager();
        ArrayList<ResolveInfo> arrayList = new ArrayList();
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(new Intent(MediaLibraryService.f58610c), 128);
        if (listQueryIntentServices != null) {
            arrayList.addAll(listQueryIntentServices);
        }
        List<ResolveInfo> listQueryIntentServices2 = packageManager.queryIntentServices(new Intent(w.f59438b), 128);
        if (listQueryIntentServices2 != null) {
            arrayList.addAll(listQueryIntentServices2);
        }
        List<ResolveInfo> listQueryIntentServices3 = packageManager.queryIntentServices(new Intent(androidx.media.e.f52772k), 128);
        if (listQueryIntentServices3 != null) {
            arrayList.addAll(listQueryIntentServices3);
        }
        for (ResolveInfo resolveInfo : arrayList) {
            if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                cVar.add(new SessionToken(this.f59437a, new ComponentName(serviceInfo.packageName, serviceInfo.name)));
            }
        }
        if (f59434c) {
            cVar.size();
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                Objects.toString((SessionToken) it.next());
            }
        }
        return cVar;
    }
}
