package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.m0;
import androidx.work.v;
import androidx.work.y;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f76817a = v.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @p0 Intent intent) {
        if (intent == null) {
            return;
        }
        v.e().a(f76817a, "Requesting diagnostics");
        try {
            m0.q(context).j(y.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            v.e().d(f76817a, "WorkManager is not initialized", e10);
        }
    }
}
