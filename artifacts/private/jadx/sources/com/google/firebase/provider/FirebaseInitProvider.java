package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;
import com.google.firebase.h;
import com.google.firebase.v;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f124415a = "FirebaseInitProvider";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static v f124416b = v.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private static AtomicBoolean f124417c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l1
    static final String f124418d = "com.google.firebase.firebaseinitprovider";

    private static void a(@NonNull ProviderInfo providerInfo) {
        w.s(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (f124418d.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @p0
    public static v b() {
        return f124416b;
    }

    public static boolean c() {
        return f124417c.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @p0 String str, @p0 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @p0
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @p0
    public Uri insert(@NonNull Uri uri, @p0 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            f124417c.set(true);
            h.x(getContext());
            return false;
        } finally {
            f124417c.set(false);
        }
    }

    @Override // android.content.ContentProvider
    @p0
    public Cursor query(@NonNull Uri uri, @p0 String[] strArr, @p0 String str, @p0 String[] strArr2, @p0 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @p0 ContentValues contentValues, @p0 String str, @p0 String[] strArr) {
        return 0;
    }
}
