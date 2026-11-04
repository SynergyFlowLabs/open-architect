package xxCvBnMs;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes14.dex */
public final class mmNhBgVfR implements Runnable {

    /* JADX INFO: renamed from: iiOpQaSdF, reason: collision with root package name */
    public final /* synthetic */ String f390648iiOpQaSdF;
    public final /* synthetic */ nnMbVcXsZ ppLkMjNhB;

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public final /* synthetic */ String f390649uuJkLzXcV;

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final /* synthetic */ String f390650vvBnMaSd;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final /* synthetic */ boolean f390651xxCvBnMs;

    public mmNhBgVfR(nnMbVcXsZ nnmbvcxsz, boolean z10, String str, String str2, String str3) {
        this.ppLkMjNhB = nnmbvcxsz;
        this.f390651xxCvBnMs = z10;
        this.f390650vvBnMaSd = str;
        this.f390649uuJkLzXcV = str2;
        this.f390648iiOpQaSdF = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nnMbVcXsZ nnmbvcxsz = this.ppLkMjNhB;
        qWeRtYuIo qwertyuio = nnmbvcxsz.mmNhBgVfR;
        Activity activity = nnmbvcxsz.ooIkJuHyG;
        boolean z10 = this.f390651xxCvBnMs;
        String str = this.f390650vvBnMaSd;
        String str2 = z10 ? this.f390649uuJkLzXcV : this.f390648iiOpQaSdF;
        qwertyuio.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int color = Color.parseColor(qWeRtYuIo.xxCvBnMs(qwertyuio.tGbVfCdE));
        int color2 = Color.parseColor(qWeRtYuIo.xxCvBnMs(qwertyuio.xSwDcVeF));
        gradientDrawable.setStroke(1, color);
        gradientDrawable.setColor(color2);
        gradientDrawable.setCornerRadius(20.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(Color.parseColor(qWeRtYuIo.xxCvBnMs(qwertyuio.nMoLkJhG)));
        gradientDrawable2.setCornerRadius(10.0f);
        new Handler(Looper.getMainLooper()).postDelayed(new gHjKlMnB(qwertyuio, activity, gradientDrawable, z10, str, gradientDrawable2, str2), 5000L);
    }
}
