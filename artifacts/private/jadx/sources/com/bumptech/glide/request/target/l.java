package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class l extends e<Bitmap> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RemoteViews f97399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f97400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f97401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f97402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Notification f97403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f97404i;

    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11) {
        this(context, i10, remoteViews, notification, i11, null);
    }

    private void e(@p0 Bitmap bitmap) {
        this.f97399d.setImageViewBitmap(this.f97404i, bitmap);
        f();
    }

    private void f() {
        ((NotificationManager) com.bumptech.glide.util.k.d((NotificationManager) this.f97400e.getSystemService("notification"))).notify(this.f97402g, this.f97401f, this.f97403h);
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

    public l(Context context, int i10, RemoteViews remoteViews, Notification notification, int i11, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i10, remoteViews, notification, i11, str);
    }

    public l(Context context, int i10, int i11, int i12, RemoteViews remoteViews, Notification notification, int i13, String str) {
        super(i10, i11);
        this.f97400e = (Context) com.bumptech.glide.util.k.e(context, "Context must not be null!");
        this.f97403h = (Notification) com.bumptech.glide.util.k.e(notification, "Notification object can not be null!");
        this.f97399d = (RemoteViews) com.bumptech.glide.util.k.e(remoteViews, "RemoteViews object can not be null!");
        this.f97404i = i12;
        this.f97401f = i13;
        this.f97402g = str;
    }
}
