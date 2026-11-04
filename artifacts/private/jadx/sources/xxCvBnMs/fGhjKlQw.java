package xxCvBnMs;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes14.dex */
public final class fGhjKlQw implements View.OnClickListener {

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final /* synthetic */ gHjKlMnB f390639xxCvBnMs;

    public fGhjKlQw(gHjKlMnB ghjklmnb) {
        this.f390639xxCvBnMs = ghjklmnb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qWeRtYuIo qwertyuio = this.f390639xxCvBnMs.mmNhBgVfR;
        RelativeLayout relativeLayout = qwertyuio.qAzWsXmP;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            int i10 = 4 | 0;
            qwertyuio.qAzWsXmP = null;
        }
        this.f390639xxCvBnMs.f390643xxCvBnMs.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f390639xxCvBnMs.ooIkJuHyG)));
    }
}
