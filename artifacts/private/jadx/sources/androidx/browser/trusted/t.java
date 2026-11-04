package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import androidx.annotation.p0;
import androidx.fragment.app.t0;
import com.google.common.util.concurrent.t1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12060c = "TWAConnectionPool";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Uri, b> f12062b = new HashMap();

    static class a extends AsyncTask<Void, Void, Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f12063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Intent f12064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f12065c;

        a(Context context, Intent intent, b bVar) {
            this.f12063a = context.getApplicationContext();
            this.f12064b = intent;
            this.f12065c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @p0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exception doInBackground(Void... voidArr) {
            try {
                if (this.f12063a.bindService(this.f12064b, this.f12065c, t0.I)) {
                    return null;
                }
                this.f12063a.unbindService(this.f12065c);
                return new IllegalStateException("Could not bind to the service");
            } catch (SecurityException e10) {
                return e10;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc != null) {
                this.f12065c.b(exc);
            }
        }
    }

    private t(@NonNull Context context) {
        this.f12061a = context.getApplicationContext();
    }

    @NonNull
    public static t c(@NonNull Context context) {
        return new t(context);
    }

    @p0
    private Intent d(Context context, Uri uri, Set<h> set, boolean z10) {
        Intent intent = null;
        if (set != null && set.size() != 0) {
            Intent intent2 = new Intent();
            intent2.setData(uri);
            intent2.setAction("android.intent.action.VIEW");
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
            String str = null;
            while (it.hasNext()) {
                String str2 = it.next().activityInfo.packageName;
                Iterator<h> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (it2.next().c(str2, context.getPackageManager())) {
                        str = str2;
                        break;
                    }
                }
            }
            if (str == null) {
                if (z10) {
                    Objects.toString(uri);
                }
                return null;
            }
            Intent intent3 = new Intent();
            intent3.setPackage(str);
            intent3.setAction(q.f12003d);
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent3, 131072);
            if (resolveInfoResolveService == null) {
                return null;
            }
            if (z10) {
                String str3 = resolveInfoResolveService.serviceInfo.name;
                Objects.toString(uri);
            }
            intent = new Intent();
            intent.setComponent(new ComponentName(str, resolveInfoResolveService.serviceInfo.name));
        }
        return intent;
    }

    @NonNull
    @l0
    public t1<r> b(@NonNull final Uri uri, @NonNull Set<h> set, @NonNull Executor executor) {
        b bVar = this.f12062b.get(uri);
        if (bVar != null) {
            return bVar.c();
        }
        Intent intentD = d(this.f12061a, uri, set, true);
        if (intentD == null) {
            return c.a(new IllegalArgumentException("No service exists for scope"));
        }
        b bVar2 = new b(new Runnable() { // from class: androidx.browser.trusted.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f12030a.f12062b.remove(uri);
            }
        });
        this.f12062b.put(uri, bVar2);
        new a(this.f12061a, intentD, bVar2).executeOnExecutor(executor, new Void[0]);
        return bVar2.c();
    }

    @l0
    public boolean e(@NonNull Uri uri, @NonNull Set<h> set) {
        return (this.f12062b.get(uri) == null && d(this.f12061a, uri, set, false) == null) ? false : true;
    }

    void f() {
        Iterator<b> it = this.f12062b.values().iterator();
        while (it.hasNext()) {
            this.f12061a.unbindService(it.next());
        }
        this.f12062b.clear();
    }
}
