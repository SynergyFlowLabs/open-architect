package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager.ImageReceiver;

/* JADX INFO: loaded from: classes4.dex */
final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f106447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ImageManager f106448b;

    public g(ImageManager imageManager, l lVar) {
        this.f106448b = imageManager;
        this.f106447a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.internal.d.a("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f106448b.f106432e.get(this.f106447a);
        if (imageReceiver != null) {
            ImageManager imageManager = this.f106448b;
            imageManager.f106432e.remove(this.f106447a);
            imageReceiver.c(this.f106447a);
        }
        l lVar = this.f106447a;
        i iVar = lVar.f106456a;
        Uri uri = iVar.f106453a;
        if (uri == null) {
            ImageManager imageManager2 = this.f106448b;
            lVar.b(imageManager2.f106428a, imageManager2.f106431d, true);
            return;
        }
        Long l10 = (Long) this.f106448b.f106434g.get(uri);
        if (l10 != null) {
            if (SystemClock.elapsedRealtime() - l10.longValue() < 3600000) {
                l lVar2 = this.f106447a;
                ImageManager imageManager3 = this.f106448b;
                lVar2.b(imageManager3.f106428a, imageManager3.f106431d, true);
                return;
            } else {
                ImageManager imageManager4 = this.f106448b;
                imageManager4.f106434g.remove(iVar.f106453a);
            }
        }
        this.f106447a.a(null, false, true, false);
        ImageManager imageManager5 = this.f106448b;
        ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) imageManager5.f106433f.get(iVar.f106453a);
        if (imageReceiver2 == null) {
            ImageManager.ImageReceiver imageReceiver3 = this.f106448b.new ImageReceiver(iVar.f106453a);
            ImageManager imageManager6 = this.f106448b;
            imageManager6.f106433f.put(iVar.f106453a, imageReceiver3);
            imageReceiver2 = imageReceiver3;
        }
        imageReceiver2.b(this.f106447a);
        l lVar3 = this.f106447a;
        if (!(lVar3 instanceof k)) {
            this.f106448b.f106432e.put(lVar3, imageReceiver2);
        }
        synchronized (ImageManager.f106425h) {
            try {
                if (!ImageManager.f106426i.contains(iVar.f106453a)) {
                    ImageManager.f106426i.add(iVar.f106453a);
                    imageReceiver2.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
