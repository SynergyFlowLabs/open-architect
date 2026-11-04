package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.l;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements l<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f97111b = "android";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f97112c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f97113d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f97114e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f97115f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f97116g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f97117h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97118a;

    public e(Context context) {
        this.f97118a = context.getApplicationContext();
    }

    @NonNull
    private Context d(Uri uri, String str) {
        if (str.equals(this.f97118a.getPackageName())) {
            return this.f97118a;
        }
        try {
            return this.f97118a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f97118a.getPackageName())) {
                return this.f97118a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    @v
    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    @v
    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @v
    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.l
    @p0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.v<Drawable> b(@NonNull Uri uri, int i10, int i11, @NonNull j jVar) {
        Context contextD = d(uri, uri.getAuthority());
        return d.d(a.b(this.f97118a, contextD, g(contextD, uri)));
    }

    @Override // com.bumptech.glide.load.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Uri uri, @NonNull j jVar) {
        return uri.getScheme().equals("android.resource");
    }
}
