package xxCvBnMs;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes14.dex */
public final class ppLkMjNhB implements Runnable {

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final /* synthetic */ qWeRtYuIo f390658vvBnMaSd;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final /* synthetic */ Activity f390659xxCvBnMs;

    public ppLkMjNhB(qWeRtYuIo qwertyuio, Activity activity) {
        this.f390658vvBnMaSd = qwertyuio;
        this.f390659xxCvBnMs = activity;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Context applicationContext = this.f390659xxCvBnMs.getApplicationContext();
        Activity activity = this.f390659xxCvBnMs;
        if (activity == null || activity.isFinishing() || this.f390659xxCvBnMs.isDestroyed()) {
            return;
        }
        qWeRtYuIo qwertyuio = this.f390658vvBnMaSd;
        Activity activity2 = this.f390659xxCvBnMs;
        qwertyuio.getClass();
        try {
            Class<?> cls = Class.forName("io.flutter.embedding.android.FlutterActivity");
            Class<?> cls2 = Class.forName("io.flutter.embedding.android.FlutterFragmentActivity");
            if (cls.isInstance(activity2) || cls2.isInstance(activity2)) {
                try {
                    Object objInvoke = activity2.getClass().getMethod("getRenderMode", null).invoke(activity2, null);
                    if (objInvoke == null || !"surface".equals(objInvoke.toString())) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (NoSuchMethodException e10) {
                    Log.w(qWeRtYuIo.xxCvBnMs(qwertyuio.zXcAqWGh), "getRenderMode() method not found. Assuming default behavior might be surface.", e10);
                } catch (Exception e11) {
                    Log.e(qWeRtYuIo.xxCvBnMs(qwertyuio.zXcAqWGh), "Error invoking getRenderMode() via reflection. Assuming surface mode.", e11);
                }
            } else {
                z10 = false;
            }
        } catch (ClassNotFoundException unused) {
        }
        ImageView imageView = new ImageView(this.f390659xxCvBnMs);
        try {
            InputStream inputStreamXxCvBnMs = this.f390658vvBnMaSd.xxCvBnMs(applicationContext, this.f390659xxCvBnMs);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                options.inPreferredConfig = config;
                if (Build.VERSION.SDK_INT >= 35) {
                    options.inScaled = false;
                    options.inPreferredConfig = config;
                }
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamXxCvBnMs, null, options);
                if (bitmapDecodeStream == null) {
                    Log.e(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "Failed to decode bitmap stream!");
                    if (inputStreamXxCvBnMs != null) {
                        inputStreamXxCvBnMs.close();
                    }
                    return;
                }
                this.f390658vvBnMaSd.getClass();
                Bitmap bitmapXxCvBnMs = qWeRtYuIo.xxCvBnMs(bitmapDecodeStream, 50);
                if (bitmapXxCvBnMs == null) {
                    Log.e(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "Failed to round bitmap!");
                    if (inputStreamXxCvBnMs != null) {
                        inputStreamXxCvBnMs.close();
                        return;
                    }
                    return;
                }
                imageView.setImageDrawable(new BitmapDrawable(this.f390659xxCvBnMs.getResources(), bitmapXxCvBnMs));
                if (inputStreamXxCvBnMs != null) {
                    inputStreamXxCvBnMs.close();
                }
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                qWeRtYuIo qwertyuio2 = this.f390658vvBnMaSd;
                Activity activity3 = this.f390659xxCvBnMs;
                qwertyuio2.getClass();
                qWeRtYuIo.xxCvBnMs(activity3, imageView);
                imageView.setTranslationZ(100.0f);
                int iGenerateViewId = View.generateViewId();
                imageView.setId(iGenerateViewId);
                this.f390658vvBnMaSd.vvBnMaSd(this.f390659xxCvBnMs, imageView, iGenerateViewId);
                ViewGroup viewGroup = (ViewGroup) this.f390659xxCvBnMs.getWindow().getDecorView();
                if (viewGroup == null) {
                    Log.e(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "DecorView is null!");
                    return;
                }
                if (!this.f390658vvBnMaSd.xxCvBnMs(viewGroup)) {
                    Log.w(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "Could not find SurfaceViewRenderer to set Z order. Banner might still be obscured.");
                }
                try {
                    if (z10) {
                        Log.w(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "Flutter Surface mode detected. Applying SOFTWARE layer type workaround.");
                        imageView.setLayerType(1, null);
                    } else {
                        imageView.setLayerType(2, null);
                    }
                    imageView.setAlpha(0.0f);
                    imageView.setVisibility(0);
                    viewGroup.addView(imageView, layoutParams);
                    imageView.bringToFront();
                    qWeRtYuIo qwertyuio3 = this.f390658vvBnMaSd;
                    Activity activity4 = this.f390659xxCvBnMs;
                    qwertyuio3.getClass();
                    qWeRtYuIo.xxCvBnMs(activity4, imageView, iGenerateViewId);
                } catch (Exception e12) {
                    Log.e(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "Error adding ImageView to DecorView or setting properties", e12);
                    View viewFindViewById = viewGroup.findViewById(iGenerateViewId);
                    if (viewFindViewById != null) {
                        viewGroup.removeView(viewFindViewById);
                    }
                }
            } catch (Throwable th2) {
                if (inputStreamXxCvBnMs != null) {
                    try {
                        inputStreamXxCvBnMs.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (IOException e13) {
            Log.e(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "IOException loading assets", e13);
        } catch (Exception e14) {
            Log.e(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "Unexpected error loading or processing bitmap", e14);
        } catch (OutOfMemoryError e15) {
            Log.e(qWeRtYuIo.xxCvBnMs(this.f390658vvBnMaSd.zXcAqWGh), "OutOfMemoryError loading bitmap", e15);
        }
    }
}
