package com.planner5d.library.services.share;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.snapshot.SnapshotLocal;
import fg.e;
import io.sentry.protocol.a0;
import java.io.File;
import java.io.FileNotFoundException;
import org.apache.commons.io.l;

/* JADX INFO: loaded from: classes10.dex */
public class PublicFileProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ij.a
    protected e<b4> f224980a = null;

    @m1
    private File a(Context context, Uri uri) {
        String str;
        String encodedPath = uri.getEncodedPath();
        if (encodedPath != null) {
            if (encodedPath.startsWith("/")) {
                encodedPath = encodedPath.substring(1);
            }
            String[] strArrSplit = encodedPath.split("/");
            if (strArrSplit.length == 1 && (str = strArrSplit[0]) != null && !str.isEmpty()) {
                String[] strArrSplit2 = strArrSplit[0].split("\\.");
                if (strArrSplit2.length == 3 && a0.b.f306128c.equals(strArrSplit2[0])) {
                    if (this.f224980a == null) {
                        com.planner5d.library.application.b.r().B(this);
                    }
                    return this.f224980a.get().i0(context, Integer.valueOf(strArrSplit2[1]).intValue());
                }
            }
        }
        return null;
    }

    private static String b(Context context, Class<? extends ContentProvider> cls) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 8);
            String name = cls.getName();
            for (ProviderInfo providerInfo : packageInfo.providers) {
                if (providerInfo.name.equals(name)) {
                    return providerInfo.authority;
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Uri c(Context context, SnapshotLocal snapshotLocal) {
        return new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority(b(context, PublicFileProvider.class)).encodedPath("/snapshot." + snapshotLocal.getId() + "." + l.m(snapshotLocal.filename)).build();
    }

    protected ParcelFileDescriptor d(File file) throws FileNotFoundException {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        e();
        return 0;
    }

    protected void e() {
        throw new IllegalArgumentException("This method is not available");
    }

    @Override // android.content.ContentProvider
    @m1
    @p0
    public String getType(@NonNull Uri uri) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        try {
            File fileA = a(context, uri);
            if (fileA != null) {
                return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(fileA.getAbsolutePath()));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    @p0
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        e();
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @m1
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws IllegalArgumentException {
        Context context = getContext();
        if (context == null) {
            throw new IllegalArgumentException("Cannot get provider context");
        }
        if (!"r".equals(str)) {
            throw new IllegalArgumentException("Only read mode is allowed, but got mode: " + str);
        }
        try {
            File fileA = a(context, uri);
            if (fileA != null) {
                return d(fileA);
            }
            throw new FileNotFoundException("Could not find file for snapshot");
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    @Override // android.content.ContentProvider
    @p0
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        e();
        return 0;
    }
}
