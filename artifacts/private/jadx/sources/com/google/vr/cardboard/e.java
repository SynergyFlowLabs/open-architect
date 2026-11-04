package com.google.vr.cardboard;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import com.google.vr.ndk.base.g0;
import com.google.vr.sdk.deps.b7;
import com.google.vr.sdk.deps.c7;

/* JADX INFO: loaded from: classes5.dex */
public class e implements a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f126821g = "e";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentProviderClient f126822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f126823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f126824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f126825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri f126826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f126827f;

    public e(ContentProviderClient contentProviderClient, String str) {
        if (contentProviderClient == null) {
            throw new IllegalArgumentException("ContentProviderClient must not be null");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Authority key must be non-null and non-empty");
        }
        this.f126822a = contentProviderClient;
        this.f126823b = c0.a(str, "device_params");
        this.f126824c = c0.a(str, "user_prefs");
        this.f126825d = c0.a(str, "phone_params");
        this.f126826e = c0.a(str, "sdk_configuration_params");
        this.f126827f = c0.a(str, "recent_headsets");
    }

    private <T extends c7> T h(T t10, Uri uri, String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = this.f126822a.query(uri, null, str, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            if (blob == null) {
                                cursorQuery.close();
                                return null;
                            }
                            T t11 = (T) c7.f(t10, blob);
                            cursorQuery.close();
                            return t11;
                        }
                    } catch (CursorIndexOutOfBoundsException | RemoteException | b7 | IllegalArgumentException unused) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
            new StringBuilder(String.valueOf(uri).length() + 50);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (CursorIndexOutOfBoundsException | RemoteException | b7 | IllegalArgumentException unused2) {
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private boolean i(c7 c7Var, Uri uri) {
        int iUpdate;
        try {
            if (c7Var == null) {
                iUpdate = this.f126822a.delete(uri, null, null);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", c7.j(c7Var));
                iUpdate = this.f126822a.update(uri, contentValues, null, null);
            }
            return iUpdate > 0;
        } catch (RemoteException | SecurityException unused) {
        }
    }

    @Override // com.google.vr.cardboard.a0
    public boolean a(com.google.vr.sdk.proto.nano.c.d dVar) {
        return i(dVar, this.f126824c);
    }

    @Override // com.google.vr.cardboard.a0
    public com.google.vr.sdk.proto.nano.a.d b() {
        int i10 = 2 ^ 0;
        return (com.google.vr.sdk.proto.nano.a.d) h(new com.google.vr.sdk.proto.nano.a.d(), this.f126827f, null);
    }

    @Override // com.google.vr.cardboard.a0
    public com.google.vr.sdk.proto.nano.b.a c() {
        return (com.google.vr.sdk.proto.nano.b.a) h(new com.google.vr.sdk.proto.nano.b.a(), this.f126825d, null);
    }

    @Override // com.google.vr.cardboard.a0
    public void close() {
        this.f126822a.close();
    }

    @Override // com.google.vr.cardboard.a0
    public com.google.vr.sdk.proto.nano.a.c d() {
        return (com.google.vr.sdk.proto.nano.a.c) h(new com.google.vr.sdk.proto.nano.a.c(), this.f126823b, null);
    }

    @Override // com.google.vr.cardboard.a0
    public com.google.common.logging.nano.a.C1088a.m e(com.google.vr.sdk.proto.nano.d.a aVar) {
        return (com.google.common.logging.nano.a.C1088a.m) h(g0.f127082d, this.f126826e, Base64.encodeToString(c7.j(aVar), 0));
    }

    @Override // com.google.vr.cardboard.a0
    public com.google.vr.sdk.proto.nano.c.d f() {
        return (com.google.vr.sdk.proto.nano.c.d) h(new com.google.vr.sdk.proto.nano.c.d(), this.f126824c, null);
    }

    @Override // com.google.vr.cardboard.a0
    public boolean g(com.google.vr.sdk.proto.nano.a.c cVar) {
        return i(cVar, this.f126823b);
    }
}
