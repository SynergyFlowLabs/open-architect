package g2;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f275400a = "androidx.contentpager.content.wakelockid";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray<PowerManager.WakeLock> f275401b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f275402c = 1;

    public static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra(f275400a, 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f275401b;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock == null) {
                    return true;
                }
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f275401b;
        synchronized (sparseArray) {
            try {
                int i10 = f275402c;
                int i11 = i10 + 1;
                f275402c = i11;
                if (i11 <= 0) {
                    f275402c = 1;
                }
                intent.putExtra(f275400a, i10);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i10, wakeLockNewWakeLock);
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
