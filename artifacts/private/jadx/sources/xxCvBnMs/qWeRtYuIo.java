package xxCvBnMs;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.manager.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowMetrics;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fasterxml.jackson.core.json.a;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes14.dex */
public final class qWeRtYuIo {
    public RelativeLayout qAzWsXmP;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final byte[] f390663xxCvBnMs = {h.a.f339272h, -118, h.a.f339272h, -106, h.a.f339272h, -106, h.a.f339272h, -110, h.a.f339272h, -107, h.a.f339271g, -100, h.a.f339271g, -111, h.a.f339271g, -111, h.a.f339272h, -123, h.a.f339272h, -118, h.a.f339272h, -121, h.a.f339272h, -123, h.a.f339272h, -115, h.a.f339272h, -125, h.a.f339272h, -110, h.a.f339272h, -110, h.a.f339272h, -105, h.a.f339272h, -110, h.a.f339272h, -122, h.a.f339272h, -125, h.a.f339272h, -106, h.a.f339272h, -121, h.a.f339271g, h.a.f339267c, h.a.f339272h, -125, h.a.f339272h, h.a.f339267c, h.a.f339272h, -122, h.a.f339272h, -108, h.a.f339272h, -111, h.a.f339272h, -121, h.a.f339272h, -121, h.a.f339272h, -122, h.a.f339271g, h.a.f339267c, h.a.f339272h, -107, h.a.f339272h, -106, h.a.f339272h, -111, h.a.f339272h, -108, h.a.f339272h, -121, h.a.f339271g, -111, h.a.f339272h, -117, h.a.f339272h, h.a.f339267c, h.a.f339272h, -122, h.a.f339272h, -121, h.a.f339272h, -102, h.a.f339271g, h.a.f339267c, h.a.f339272h, -110, h.a.f339272h, -118, h.a.f339272h, -110, h.a.f339271g, -95, h.a.f339272h, -113, h.a.f339271g, -97, h.a.f339272h, -119, h.a.f339272h, -111, h.a.f339272h, -111, h.a.f339272h, -119, h.a.f339272h, -114, h.a.f339272h, -121, h.a.f339271g, -120, h.a.f339272h, -104, h.a.f339272h, -121, h.a.f339272h, -108, h.a.f339272h, -107, h.a.f339272h, -117, h.a.f339272h, -111, h.a.f339272h, h.a.f339267c, h.a.f339272h, -127, h.a.f339272h, -123, h.a.f339272h, -111, h.a.f339272h, -122, h.a.f339272h, -121, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107, h.a.f339271g, -120, h.a.f339272h, -104, h.a.f339272h, -121, h.a.f339272h, -108, h.a.f339272h, -107, h.a.f339272h, -117, h.a.f339272h, -111, h.a.f339272h, h.a.f339267c, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107, h.a.f339271g, -120, h.a.f339272h, -106, h.a.f339272h, -117, h.a.f339272h, -106, h.a.f339272h, -114, h.a.f339272h, -121, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107, h.a.f339271g, -120, h.a.f339272h, -111, h.a.f339272h, -107, h.a.f339271g, -97, h.a.f339271g, -121, h.a.f339272h, -107};

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final byte[] f390662vvBnMaSd = {124, h.a.f339271g, -120, h.a.f339271g, -120, h.a.f339271g, -124, h.a.f339271g, -121, 78, 67, 67, 117, h.a.f339271g, -126, 120, h.a.f339271g, -122, h.a.f339271g, -125, 121, 121, 120, 66, h.a.f339271g, -122, h.a.f339271g, -119, 67};

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public final byte[] f390661uuJkLzXcV = {124, h.a.f339271g, -120, h.a.f339271g, -120, h.a.f339271g, -124, h.a.f339271g, -121, 78, 67, 67, 117, h.a.f339271g, -126, 120, h.a.f339271g, -122, h.a.f339271g, -125, 121, 121, 120, 66, 119, h.a.f339271g, -126, 67};

    /* JADX INFO: renamed from: iiOpQaSdF, reason: collision with root package name */
    public final byte[] f390660iiOpQaSdF = {127, h.a.f339271g, -117, h.a.f339271g, -117, h.a.f339271g, -121, h.a.f339271g, -118, 81, 70, 70, 120, h.a.f339271g, -123, 123, h.a.f339271g, -119, h.a.f339271g, -122, 124, 124, 123, 69, h.a.f339271g, -118, h.a.f339271g, -117, h.a.f339271g, -122, h.a.f339271g, -119, 124, 70};
    public final byte[] ppLkMjNhB = {74, 72, 87};
    public final byte[] ooIkJuHyG = {126, h.a.f339271g, -128, h.a.f339271g, -116, h.a.f339271g, -117, h.a.f339271g, -117, h.a.f339271g, -126, h.a.f339271g, -128, h.a.f339271g, -111, 74, h.a.f339271g, -128, h.a.f339271g, -116, h.a.f339271g, -117, h.a.f339271g, -125, h.a.f339271g, -122, h.a.f339271g, -124, 124, h.a.f339271g, -109, h.a.f339271g, -126, h.a.f339271g, -113, h.a.f339271g, -111, h.a.f339271g, -122, h.a.f339271g, -128, 126, h.a.f339271g, -119, 75, h.a.f339271g, -121, h.a.f339271g, h.a.f339267c, h.a.f339271g, -116, h.a.f339271g, -117};
    public final byte[] mmNhBgVfR = {117, 119, h.a.f339271g, -125, h.a.f339271g, -126, h.a.f339271g, -126, 121, 119, h.a.f339271g, -120, 65, 119, h.a.f339271g, -125, h.a.f339271g, -126, 122, 125, 123, 66, 126, h.a.f339271g, -121, h.a.f339271g, -125, h.a.f339271g, -126};
    public final byte[] nnMbVcXsZ = {h.a.f339271g, -126, 125, 113, 110, h.a.f339271g, -127, 114, 108, 127, 114, h.a.f339271g, -128, h.a.f339271g, -126, 121, h.a.f339271g, -127};
    public final byte[] fGhjKlQw = {120, 117, 111};
    public final byte[] dSaZxCvB = {123, 120, 114, 101, 107, 116};
    public final byte[] gHjKlMnB = {125, 108, 121, 122, 112, 118, 117};
    public final byte[] zXcVbNmP = {124, 117, 114, 117, 118, 126, 117};
    public final byte[] qWeRtYuIo = {116, 119};
    public final byte[] aZxCvBnMo = {109, 124};
    public final byte[] sDfGhjKlP = {119, 99};
    public final byte[] vBnMaSdFj = {100, 123};
    public final byte[] jKlPoIuYt = {124, 106};
    public final byte[] bNmQwErTy = {h.a.f339285u, -83, h.a.f339286v, -105, h.a.f339286v, -102, h.a.f339286v, -101, h.a.f339286v, -100, h.a.f339286v, -104, h.a.f339286v, -106, h.a.f339286v, -119, 57, h.a.f339286v, -106, h.a.f339286v, -105, h.a.f339286v, -117, h.a.f339286v, -119, h.a.f339286v, -88, 57, h.a.f339286v, -117, h.a.f339286v, -114, h.a.f339286v, -103, h.a.f339286v, -102, h.a.f339286v, -111, h.a.f339286v, -88, 57, 62, h.a.f339271g, -116, 71};
    public final byte[] kLpOiUyT = {103, 126, h.a.f339271g, h.a.f339267c, 57, h.a.f339271g, -113, 126, h.a.f339271g, -117, h.a.f339271g, -116, h.a.f339271g, -126, h.a.f339271g, -120, h.a.f339271g, -121, 57, 122, h.a.f339271g, -113, 122, h.a.f339271g, -126, h.a.f339271g, -123, 122, 123, h.a.f339271g, -123, 126, 57, 62, h.a.f339271g, -116, 71};
    public final byte[] mNbVcXzL = {h.a.f339285u, -89, h.a.f339285u, -70, h.a.f339286v, -122, h.a.f339286v, -121, h.a.f339285u, a.f102488j, h.a.f339286v, -127, h.a.f339286v, -117, h.a.f339286v, -107, 72};
    public final byte[] rTyUiOpA = {92, 119, 107, 104, 123, 108, 70};
    public final byte[] eRfGhJkL = {h.a.f339285u, -106, h.a.f339285u, -110};
    public final byte[] wErTyUio = {92, 72, 86};
    public final byte[] pOiUyTrE = {h.a.f339285u, -85, h.a.f339285u, -66, h.a.f339286v, -118, h.a.f339286v, -117, h.a.f339285u, a.f102489k, h.a.f339286v, -120, h.a.f339286v, -101, 45, h.a.f339286v, -116, h.a.f339286v, -117, h.a.f339286v, -124, h.a.f339286v, -125, h.a.f339286v, -126};
    public final byte[] lKmJnHbG = {97, 124, 112, 109, h.a.f339271g, -128, 113, 44, 120, 109, h.a.f339271g, -128, 113, 126};
    public final byte[] vCdEsWaZ = {116, 118, 115, 116};
    public final byte[] yUiOpAsD = {116, 113, h.a.f339271g, -124, 117, 111, h.a.f339271g, -125, 120, 127, h.a.f339271g, -121, 111, h.a.f339271g, -123, h.a.f339271g, -128, 116, 113, h.a.f339271g, -124, 117};
    public final byte[] tGbVfCdE = {42, 74, 74, 74, 74, 74, 74};
    public final byte[] nMoLkJhG = {42, 59, 74, 73, 55, 60, 55};
    public final byte[] xSwDcVeF = {42, 77, 77, 77, 77, 77, 77};
    public final byte[] zXcAqWGh = {103, 121, 121, 107, 122, 121};

    public qWeRtYuIo() {
        int i10 = 2 << 7;
        int i11 = 3 & 7;
        BitmapFactory.build();
    }

    public final void vvBnMaSd(final Activity activity, ImageView imageView, final int i10) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: xxCvBnMs.qWeRtYuIo$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.xxCvBnMs(activity, i10, view);
            }
        });
    }

    public final InputStream xxCvBnMs(Context context, Activity activity) {
        return activity.getResources().getConfiguration().orientation == 1 ? context.getAssets().open(xxCvBnMs(this.ooIkJuHyG)) : context.getAssets().open(xxCvBnMs(this.mmNhBgVfR));
    }

    public static void xxCvBnMs(Activity activity, ImageView imageView) {
        int iWidth;
        int iHeight;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
            iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i10 = point.x;
            int i11 = point.y;
            iWidth = i10;
            iHeight = i11;
        }
        int i12 = iWidth / 20;
        int i13 = iHeight / 20;
        imageView.setPadding(i12, i13, i12, i13);
    }

    public final /* synthetic */ void xxCvBnMs(Activity activity, int i10, View view) {
        String strXxCvBnMs;
        String language = Locale.getDefault().getLanguage();
        if (xxCvBnMs(this.qWeRtYuIo).equals(language)) {
            strXxCvBnMs = xxCvBnMs(this.f390662vvBnMaSd);
        } else {
            strXxCvBnMs = xxCvBnMs(this.jKlPoIuYt).equals(language) ? xxCvBnMs(this.f390661uuJkLzXcV) : xxCvBnMs(this.f390660iiOpQaSdF);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strXxCvBnMs));
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        View viewFindViewById = activity.findViewById(i10);
        if (viewFindViewById == null || !(viewFindViewById.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) viewFindViewById.getParent()).removeView(viewFindViewById);
    }

    public static void xxCvBnMs(Activity activity, ImageView imageView, int i10) {
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        Property property = View.ALPHA;
        ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 0.0f, 1.0f).setDuration(1000L);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1.0f, 0.0f).setDuration(1000L);
        duration2.setStartDelay(2000L);
        duration2.addListener(new ooIkJuHyG(activity, i10));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration).before(duration2);
        animatorSet.start();
    }

    public final boolean xxCvBnMs(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof SurfaceView) {
                try {
                    ((SurfaceView) childAt).setZOrderOnTop(false);
                    z10 = true;
                } catch (Exception e10) {
                    Log.e(xxCvBnMs(this.zXcAqWGh), "Error invoking setZOrderMediaOverlay via reflection on " + childAt, e10);
                }
            }
            if ((childAt instanceof ViewGroup) && xxCvBnMs((ViewGroup) childAt)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static Bitmap xxCvBnMs(Bitmap bitmap, float f10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public final void xxCvBnMs(Activity activity) {
        String strXxCvBnMs;
        String strXxCvBnMs2;
        BitmapFactory.build();
        if (uuJkLzXcV.f390664xxCvBnMs > 0) {
            return;
        }
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new iiOpQaSdF(this, decorView, activity));
        } else {
            Log.w(xxCvBnMs(this.zXcAqWGh), "Activity is not valid, cannot schedule banner drawing.");
        }
        try {
            try {
                strXxCvBnMs = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                strXxCvBnMs = xxCvBnMs(this.zXcVbNmP);
            }
            String str = strXxCvBnMs;
            String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
            try {
                strXxCvBnMs2 = String.valueOf(activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused2) {
                strXxCvBnMs2 = xxCvBnMs(this.zXcVbNmP);
            }
            String str2 = strXxCvBnMs2;
            uuJkLzXcV.f390664xxCvBnMs = 256;
            new Thread(new nnMbVcXsZ(this, str2, str, activity.getApplicationContext().getPackageName(), strValueOf, activity.getApplicationContext().getSharedPreferences(xxCvBnMs(this.vCdEsWaZ), 0).getLong(xxCvBnMs(this.yUiOpAsD), 0L), activity)).start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String xxCvBnMs(byte[] bArr) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : str.toCharArray()) {
            sb2.append((char) (c10 - length));
        }
        return sb2.toString();
    }
}
