package iiOpQaSdF;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class ooIkJuHyG {

    /* JADX INFO: renamed from: uuJkLzXcV, reason: collision with root package name */
    public static final ooIkJuHyG f287240uuJkLzXcV = new ooIkJuHyG();

    /* JADX INFO: renamed from: xxCvBnMs, reason: collision with root package name */
    public final CopyOnWriteArrayList f287242xxCvBnMs = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: vvBnMaSd, reason: collision with root package name */
    public final Handler f287241vvBnMaSd = new Handler(Looper.getMainLooper());

    public final void vvBnMaSd(final fGhjKlQw fghjklqw) {
        this.f287241vvBnMaSd.post(new Runnable() { // from class: iiOpQaSdF.ooIkJuHyG$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.xxCvBnMs(fghjklqw);
            }
        });
    }

    public final /* synthetic */ void xxCvBnMs(fGhjKlQw fghjklqw) {
        Iterator it = this.f287242xxCvBnMs.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
