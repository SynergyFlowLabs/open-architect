package com.devtodev.core.logic.c;

import com.devtodev.core.logic.SDKClient;
import com.devtodev.core.utils.log.CoreLog;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<Runnable> f98290a = new ArrayList<>();

    public void a() {
        CoreLog.d("DevToDev", "Run deferred events");
        Iterator<Runnable> it = this.f98290a.iterator();
        while (it.hasNext()) {
            Runnable next = it.next();
            if (next != null) {
                next.run();
            }
            it.remove();
        }
    }

    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (SDKClient.getInstance().isInitialized()) {
            runnable.run();
        } else {
            this.f98290a.add(runnable);
        }
    }
}
