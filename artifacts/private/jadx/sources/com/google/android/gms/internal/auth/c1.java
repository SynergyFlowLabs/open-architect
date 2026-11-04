package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements h1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("ConfigurationContentLoader.class")
    private static final Map f107600h = new androidx.collection.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f107601i = {"key", "value"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f107602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f107603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f107604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentObserver f107605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f107606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Map f107607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final List f107608g;

    private c1(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        b1 b1Var = new b1(this, null);
        this.f107605d = b1Var;
        this.f107606e = new Object();
        this.f107608g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f107602a = contentResolver;
        this.f107603b = uri;
        this.f107604c = runnable;
        contentResolver.registerContentObserver(uri, false, b1Var);
    }

    public static c1 b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        c1 c1Var;
        synchronized (c1.class) {
            Map map = f107600h;
            c1Var = (c1) map.get(uri);
            if (c1Var == null) {
                try {
                    c1 c1Var2 = new c1(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c1Var2);
                    } catch (SecurityException unused) {
                    }
                    c1Var = c1Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1Var;
    }

    static synchronized void d() {
        try {
            for (c1 c1Var : f107600h.values()) {
                c1Var.f107602a.unregisterContentObserver(c1Var.f107605d);
            }
            f107600h.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.auth.h1
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2 = this.f107607f;
        if (map2 == null) {
            synchronized (this.f107606e) {
                try {
                    map2 = this.f107607f;
                    if (map2 == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                map = (Map) f1.a(new g1() { // from class: com.google.android.gms.internal.auth.a1
                                    @Override // com.google.android.gms.internal.auth.g1
                                    public final Object a() {
                                        return this.f107550a.c();
                                    }
                                });
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th2;
                            }
                        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f107607f = map;
                        map2 = map;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.EMPTY_MAP;
        }
        return (String) map2.get(str);
    }

    final /* synthetic */ Map c() {
        Cursor cursorQuery = this.f107602a.query(this.f107603b, f107601i, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                Map map = Collections.EMPTY_MAP;
                cursorQuery.close();
                return map;
            }
            Map aVar = count <= 256 ? new androidx.collection.a(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                aVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            cursorQuery.close();
            return aVar;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public final void e() {
        synchronized (this.f107606e) {
            try {
                this.f107607f = null;
                z1.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this) {
            try {
                Iterator it = this.f107608g.iterator();
                while (it.hasNext()) {
                    ((d1) it.next()).a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
