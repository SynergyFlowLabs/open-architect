package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.appupdate.internal.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f114816a;

    static synchronized e a(Context context) {
        try {
            if (f114816a == null) {
                g gVar = new g(null);
                gVar.b(new n(f0.a(context)));
                f114816a = gVar.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f114816a;
    }
}
