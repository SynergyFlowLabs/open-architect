package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class t8 implements p8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f108867a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private HashMap f108868b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final HashMap f108869c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final HashMap f108870d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final HashMap f108871e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final HashMap f108872f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0("this")
    @androidx.annotation.p0
    private Object f108873g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private boolean f108874h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final String[] f108875i = new String[0];

    @Override // com.google.android.gms.internal.measurement.p8
    @androidx.annotation.p0
    public final String a(@androidx.annotation.p0 ContentResolver contentResolver, String str, @androidx.annotation.p0 String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f108868b == null) {
                    this.f108867a.set(false);
                    this.f108868b = new HashMap(16, 1.0f);
                    this.f108873g = new Object();
                    contentResolver.registerContentObserver(o8.f108712a, true, new r8(this, null));
                } else if (this.f108867a.getAndSet(false)) {
                    this.f108868b.clear();
                    this.f108869c.clear();
                    this.f108870d.clear();
                    this.f108871e.clear();
                    this.f108872f.clear();
                    this.f108873g = new Object();
                    this.f108874h = false;
                }
                Object obj = this.f108873g;
                if (this.f108868b.containsKey(str)) {
                    String str4 = (String) this.f108868b.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri = o8.f108712a;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new s8("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new s8("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj == this.f108873g) {
                                            this.f108868b.put(str, string);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } catch (Throwable th3) {
                                if (cursorQuery == null) {
                                    throw th3;
                                }
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (RemoteException e10) {
                            throw new s8("ContentProvider query failed", e10);
                        }
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                } catch (s8 unused) {
                    return null;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    final /* synthetic */ AtomicBoolean b() {
        return this.f108867a;
    }
}
