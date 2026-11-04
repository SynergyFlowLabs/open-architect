package io.intercom.android.sdk;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes13.dex */
public class IntercomInitializeContentProvider extends ContentProvider {
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
        Context context = getContext();
        if (context instanceof Application) {
            LateInitializationPreparer.getInstance().register((Application) context);
        }
        return false;
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
