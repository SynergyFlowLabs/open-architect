package xxCvBnMs;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes14.dex */
public final class gHjKlMnB implements Runnable {

    /* JADX INFO: renamed from: iiOpQaSdF, reason: collision with root package name */
    public final /* synthetic */ String f390640iiOpQaSdF;
    public final /* synthetic */ qWeRtYuIo mmNhBgVfR;
    public final /* synthetic */ String ooIkJuHyG;
    public final /* synthetic */ GradientDrawable ppLkMjNhB;

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public final /* synthetic */ boolean f390641uuJkLzXcV;

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final /* synthetic */ GradientDrawable f390642vvBnMaSd;

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final /* synthetic */ Activity f390643xxCvBnMs;

    public gHjKlMnB(qWeRtYuIo qwertyuio, Activity activity, GradientDrawable gradientDrawable, boolean z10, String str, GradientDrawable gradientDrawable2, String str2) {
        this.mmNhBgVfR = qwertyuio;
        this.f390643xxCvBnMs = activity;
        this.f390642vvBnMaSd = gradientDrawable;
        this.f390641uuJkLzXcV = z10;
        this.f390640iiOpQaSdF = str;
        this.ppLkMjNhB = gradientDrawable2;
        this.ooIkJuHyG = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mmNhBgVfR.qAzWsXmP = new RelativeLayout(this.f390643xxCvBnMs);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.leftMargin = 100;
        layoutParams.rightMargin = 100;
        zXcVbNmP zxcvbnmp = new zXcVbNmP(this.f390643xxCvBnMs.getApplicationContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        zxcvbnmp.setPadding(40, 40, 40, 40);
        zxcvbnmp.setBackground(this.f390642vvBnMaSd);
        zxcvbnmp.setOrientation(1);
        layoutParams2.addRule(13);
        TextView textView = new TextView(this.f390643xxCvBnMs);
        textView.setText(String.format(this.f390641uuJkLzXcV ? qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.bNmQwErTy) : qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.kLpOiUyT), this.f390640iiOpQaSdF));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView.setTextColor(-16777216);
        textView.setLineSpacing(0.0f, 1.4f);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextSize(16.0f);
        textView.setTextAlignment(4);
        TextView textView2 = new TextView(this.f390643xxCvBnMs);
        textView2.setText(this.f390641uuJkLzXcV ? qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.mNbVcXzL) : qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.rTyUiOpA));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = 16;
        layoutParams4.gravity = 1;
        textView2.setTextColor(-16777216);
        textView2.setTypeface(textView.getTypeface(), 1);
        textView2.setTextSize(16.0f);
        textView2.setTextAlignment(4);
        TextView textView3 = new TextView(this.f390643xxCvBnMs);
        textView3.setBackground(this.ppLkMjNhB);
        textView3.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 1;
        layoutParams5.topMargin = 50;
        String strXxCvBnMs = this.f390641uuJkLzXcV ? qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.eRfGhJkL) : qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.wErTyUio);
        textView3.setTypeface(textView3.getTypeface(), 1);
        textView3.setText(strXxCvBnMs);
        textView3.setAllCaps(false);
        textView3.setPadding(110, 22, 110, 22);
        textView3.setTextSize(14.0f);
        textView3.setOnClickListener(new fGhjKlQw(this));
        TextView textView4 = new TextView(this.f390643xxCvBnMs);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 1;
        layoutParams6.topMargin = 50;
        textView4.setText(this.f390641uuJkLzXcV ? qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.pOiUyTrE) : qWeRtYuIo.xxCvBnMs(this.mmNhBgVfR.lKmJnHbG));
        textView4.setAllCaps(false);
        textView4.setPadding(30, 0, 30, 0);
        textView4.setTextSize(14.0f);
        textView4.setOnClickListener(new dSaZxCvB(this));
        zxcvbnmp.addView(textView, layoutParams3);
        zxcvbnmp.addView(textView2, layoutParams4);
        zxcvbnmp.addView(textView3, layoutParams5);
        zxcvbnmp.addView(textView4, layoutParams6);
        this.mmNhBgVfR.qAzWsXmP.addView(zxcvbnmp, layoutParams2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f390643xxCvBnMs.addContentView(this.mmNhBgVfR.qAzWsXmP, layoutParams);
        this.mmNhBgVfR.qAzWsXmP.startAnimation(alphaAnimation);
    }
}
