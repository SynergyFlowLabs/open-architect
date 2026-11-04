package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.measurement.internal.h7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class a extends ContentProvider {
    @Override // android.content.ContentProvider
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @p0 String str, @NonNull String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @p0
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @p0
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        w.r(context);
        h7.O(context, null, null);
        return false;
    }

    @Override // android.content.ContentProvider
    @p0
    public Cursor query(@NonNull Uri uri, @NonNull String[] strArr, @p0 String str, @NonNull String[] strArr2, @p0 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @p0 ContentValues contentValues, @p0 String str, @NonNull String[] strArr) {
        return 0;
    }
}
