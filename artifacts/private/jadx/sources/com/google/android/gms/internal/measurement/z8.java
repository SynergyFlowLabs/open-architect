package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class z8 implements d9 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap f109009i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f109010j = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f109011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f109012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f109013c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile Map f109017g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private ContentObserver f109014d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f109015e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Object f109016f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final List f109018h = new ArrayList();

    private z8(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        com.google.common.base.j0.E(contentResolver);
        com.google.common.base.j0.E(uri);
        this.f109011a = contentResolver;
        this.f109012b = uri;
        this.f109013c = runnable;
    }

    public static z8 c(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        z8 z8Var = (z8) f109009i.computeIfAbsent(uri, new Function() { // from class: com.google.android.gms.internal.measurement.y8
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return z8.g(contentResolver, uri, runnable, (Uri) obj);
            }
        });
        try {
            if (!z8Var.f109015e) {
                return z8Var;
            }
            synchronized (z8Var) {
                try {
                    if (z8Var.f109015e) {
                        w8 w8Var = new w8(z8Var, null);
                        z8Var.f109011a.registerContentObserver(z8Var.f109012b, false, w8Var);
                        z8Var.f109014d = w8Var;
                        z8Var.f109015e = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z8Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    static void f() {
        Iterator it = f109009i.values().iterator();
        while (it.hasNext()) {
            z8 z8Var = (z8) it.next();
            synchronized (z8Var) {
                try {
                    if (z8Var.f109015e) {
                        z8Var.f109015e = false;
                    } else {
                        ContentObserver contentObserver = z8Var.f109014d;
                        if (contentObserver != null) {
                            z8Var.f109011a.unregisterContentObserver(contentObserver);
                            boolean z10 = false;
                            z8Var.f109014d = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            it.remove();
        }
    }

    static /* synthetic */ z8 g(ContentResolver contentResolver, Uri uri, Runnable runnable, Uri uri2) {
        return new z8(contentResolver, uri, runnable);
    }

    @Override // com.google.android.gms.internal.measurement.d9
    public final /* bridge */ /* synthetic */ Object a(String str) {
        return (String) d().get(str);
    }

    public final Map d() {
        Map map;
        Map map2 = this.f109017g;
        if (map2 == null) {
            synchronized (this.f109016f) {
                try {
                    map2 = this.f109017g;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                map = (Map) d9.b(new c9() { // from class: com.google.android.gms.internal.measurement.x8
                                    @Override // com.google.android.gms.internal.measurement.c9
                                    public final /* synthetic */ Object a() {
                                        return this.f108966a.h();
                                    }
                                });
                            } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                                map = Collections.EMPTY_MAP;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            this.f109017g = map;
                            map2 = map;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void e() {
        synchronized (this.f109016f) {
            try {
                this.f109017g = null;
                this.f109013c.run();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this) {
            try {
                Iterator it = this.f109018h.iterator();
                while (it.hasNext()) {
                    ((a9) it.next()).a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    final /* synthetic */ Map h() {
        ContentResolver contentResolver = this.f109011a;
        Uri uri = this.f109012b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, f109010j, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map aVar = count <= 256 ? new androidx.collection.a(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return aVar;
                    }
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (RemoteException unused) {
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th4) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th4;
        }
    }
}
