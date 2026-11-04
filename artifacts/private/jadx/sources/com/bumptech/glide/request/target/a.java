package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class a extends e<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f97365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ComponentName f97366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RemoteViews f97367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f97368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f97369h;

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, int... iArr) {
        super(i10, i11);
        if (iArr.length == 0) {
            throw new IllegalArgumentException("WidgetIds must have length > 0");
        }
        this.f97368g = (Context) com.bumptech.glide.util.k.e(context, "Context can not be null!");
        this.f97367f = (RemoteViews) com.bumptech.glide.util.k.e(remoteViews, "RemoteViews object can not be null!");
        this.f97365d = (int[]) com.bumptech.glide.util.k.e(iArr, "WidgetIds can not be null!");
        this.f97369h = i12;
        int i13 = 3 ^ 0;
        this.f97366e = null;
    }

    private void e(@p0 Bitmap bitmap) {
        this.f97367f.setImageViewBitmap(this.f97369h, bitmap);
        f();
    }

    private void f() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.f97368g);
        ComponentName componentName = this.f97366e;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.f97367f);
        } else {
            appWidgetManager.updateAppWidget(this.f97365d, this.f97367f);
        }
    }

    @Override // com.bumptech.glide.request.target.p
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void i(@NonNull Bitmap bitmap, @p0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
        e(bitmap);
    }

    @Override // com.bumptech.glide.request.target.p
    public void h(@p0 Drawable drawable) {
        e(null);
    }

    public a(Context context, int i10, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, iArr);
    }

    public a(Context context, int i10, int i11, int i12, RemoteViews remoteViews, ComponentName componentName) {
        super(i10, i11);
        this.f97368g = (Context) com.bumptech.glide.util.k.e(context, "Context can not be null!");
        this.f97367f = (RemoteViews) com.bumptech.glide.util.k.e(remoteViews, "RemoteViews object can not be null!");
        this.f97366e = (ComponentName) com.bumptech.glide.util.k.e(componentName, "ComponentName can not be null!");
        this.f97369h = i12;
        this.f97365d = null;
    }

    public a(Context context, int i10, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, componentName);
    }
}
