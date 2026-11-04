package com.planner5d.library.services.bitmaploader.target;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public class e extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f224184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap f224185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c[] f224186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f224187k = false;

    public e(a target, Bitmap fallbackDrawable, c... loggers) {
        this.f224184h = target;
        this.f224185i = fallbackDrawable;
        this.f224186j = loggers;
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void b(boolean withoutBitmap) {
        if (!withoutBitmap) {
            this.f224185i = null;
            if (this.f224187k) {
                this.f224184h.dispose();
            }
        }
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void g(final Throwable error) {
        this.f224184h.j(this.f224185i, null);
        Arrays.stream(this.f224186j).forEach(new Consumer() { // from class: com.planner5d.library.services.bitmaploader.target.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((c) obj).a(error);
            }
        });
    }

    @Override // com.planner5d.library.services.bitmaploader.target.a
    protected void h(Bitmap bitmap) {
        this.f224187k = true;
        this.f224184h.j(bitmap, null);
    }
}
