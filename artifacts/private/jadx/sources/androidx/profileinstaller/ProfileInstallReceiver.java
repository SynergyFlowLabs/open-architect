package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f73702a = "androidx.profileinstaller.action.INSTALL_PROFILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final String f73703b = "androidx.profileinstaller.action.SAVE_PROFILE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final String f73704c = "androidx.profileinstaller.action.SKIP_FILE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public static final String f73705d = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private static final String f73706e = "EXTRA_SKIP_FILE_OPERATION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private static final String f73707f = "WRITE_SKIP_FILE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private static final String f73708g = "DELETE_SKIP_FILE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private static final String f73709h = "EXTRA_BENCHMARK_OPERATION";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private static final String f73710i = "DROP_SHADER_CACHE";

    class a implements i.d {
        a() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @p0 Object obj) {
            i.f73760h.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @p0 Object obj) {
            i.f73760h.b(i10, obj);
        }
    }

    static void a(@NonNull i.d dVar) {
        Process.sendSignal(Process.myPid(), 10);
        dVar.a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @p0 Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f73702a.equals(action)) {
            i.l(context, new androidx.media3.exoplayer.offline.b(), new a(), true);
            return;
        }
        if (f73704c.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f73706e);
                if (f73707f.equals(string)) {
                    i.m(context, new androidx.media3.exoplayer.offline.b(), new a());
                    return;
                } else {
                    if (f73708g.equals(string)) {
                        i.d(context, new androidx.media3.exoplayer.offline.b(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (f73703b.equals(action)) {
            a(new a());
            return;
        }
        if (!f73705d.equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString(f73709h);
        a aVar = new a();
        if (f73710i.equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.a(16, null);
        }
    }
}
