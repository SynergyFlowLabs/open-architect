package xxCvBnMs;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes14.dex */
public final class dSaZxCvB implements View.OnClickListener {

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final /* synthetic */ gHjKlMnB f390638xxCvBnMs;

    public dSaZxCvB(gHjKlMnB ghjklmnb) {
        this.f390638xxCvBnMs = ghjklmnb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f390638xxCvBnMs.f390643xxCvBnMs.getApplicationContext().getSharedPreferences(qWeRtYuIo.xxCvBnMs(this.f390638xxCvBnMs.mmNhBgVfR.vCdEsWaZ), 0).edit().putLong(qWeRtYuIo.xxCvBnMs(this.f390638xxCvBnMs.mmNhBgVfR.yUiOpAsD), System.currentTimeMillis()).apply();
        qWeRtYuIo qwertyuio = this.f390638xxCvBnMs.mmNhBgVfR;
        RelativeLayout relativeLayout = qwertyuio.qAzWsXmP;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            qwertyuio.qAzWsXmP = null;
        }
    }
}
