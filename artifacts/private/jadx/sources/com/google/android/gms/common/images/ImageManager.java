package com.google.android.gms.common.images;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.base.p;
import com.google.android.gms.internal.base.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class ImageManager {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f106425h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HashSet f106426i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ImageManager f106427j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f106428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f106429b = new q(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f106430c = p.a().b(4, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.base.k f106431d = new com.google.android.gms.internal.base.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f106432e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f106433f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f106434g = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    @KeepName
    final class ImageReceiver extends ResultReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f106435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f106436b;

        ImageReceiver(Uri uri) {
            super(new q(Looper.getMainLooper()));
            this.f106435a = uri;
            this.f106436b = new ArrayList();
        }

        public final void b(l lVar) {
            com.google.android.gms.common.internal.d.a("ImageReceiver.addImageRequest() must be called in the main thread");
            this.f106436b.add(lVar);
        }

        public final void c(l lVar) {
            com.google.android.gms.common.internal.d.a("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.f106436b.remove(lVar);
        }

        public final void e() {
            Intent intent = new Intent(com.google.android.gms.common.internal.i.f106577c);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(com.google.android.gms.common.internal.i.f106578d, this.f106435a);
            intent.putExtra(com.google.android.gms.common.internal.i.f106579e, this);
            intent.putExtra(com.google.android.gms.common.internal.i.f106580f, 3);
            Context context = ImageManager.this.f106428a;
            if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i10, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            AssetFileDescriptor assetFileDescriptor = parcelFileDescriptor != null ? new AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L)) : null;
            ImageManager imageManager = ImageManager.this;
            imageManager.f106430c.execute(new f(imageManager, this.f106435a, assetFileDescriptor));
        }
    }

    public interface a {
        void a(@NonNull Uri uri, @p0 Drawable drawable, boolean z10);
    }

    private ImageManager(Context context, boolean z10) {
        this.f106428a = context.getApplicationContext();
        int i10 = 6 << 2;
    }

    @NonNull
    public static ImageManager a(@NonNull Context context) {
        if (f106427j == null) {
            int i10 = 4 & 0;
            f106427j = new ImageManager(context, false);
        }
        return f106427j;
    }

    public void b(@NonNull ImageView imageView, int i10) {
        p(new j(imageView, i10));
    }

    public void c(@NonNull ImageView imageView, @NonNull Uri uri) {
        p(new j(imageView, uri));
    }

    public void d(@NonNull ImageView imageView, @NonNull Uri uri, int i10) {
        j jVar = new j(imageView, uri);
        jVar.f106457b = i10;
        p(jVar);
    }

    public void e(@NonNull a aVar, @NonNull Uri uri) {
        p(new k(aVar, uri));
    }

    public void f(@NonNull a aVar, @NonNull Uri uri, int i10) {
        k kVar = new k(aVar, uri);
        kVar.f106457b = i10;
        p(kVar);
    }

    public final void p(l lVar) {
        com.google.android.gms.common.internal.d.a("ImageManager.loadImage() must be called in the main thread");
        new g(this, lVar).run();
    }
}
