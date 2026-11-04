package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class i {
    public static final int A = 14;
    public static final int B = 15;
    public static final int C = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f73753a = "dexopt/baseline.prof";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f73754b = "ProfileInstaller";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f73755c = "/data/misc/profiles/cur/0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f73756d = "primary.prof";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f73757e = "dexopt/baseline.profm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f73758f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f73759g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    static final d f73760h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f73761i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f73762j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f73763k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f73764l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f73765m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f73766n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f73767o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f73768p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f73769q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f73770r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f73771s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f73772t = 7;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f73773u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f73774v = 9;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f73775w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f73776x = 11;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f73777y = 12;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f73778z = 13;

    class a implements d {
        a() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @p0 Object obj) {
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @p0 Object obj) {
        }
    }

    class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final String f73779a = "ProfileInstaller";

        b() {
        }

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @p0 Object obj) {
            if (i10 == 6 || i10 == 7 || i10 == 8) {
            }
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @p0 Object obj) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface c {
    }

    public interface d {
        void a(int i10, @p0 Object obj);

        void b(int i10, @p0 Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface e {
    }

    private i() {
    }

    @b1({b1.a.LIBRARY})
    static boolean c(@NonNull File file) {
        return new File(file, f73758f).delete();
    }

    @m1
    static void d(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        c(context.getFilesDir());
        h(executor, dVar, 11, null);
    }

    static void e(@NonNull Executor executor, @NonNull final d dVar, final int i10, @p0 final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                dVar.b(i10, obj);
            }
        });
    }

    @b1({b1.a.LIBRARY})
    @m1
    static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, f73758f);
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j10 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = j10 == packageInfo.lastUpdateTime;
                if (z10) {
                    dVar.a(2, null);
                }
                return z10;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @b1({b1.a.LIBRARY})
    static void g(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f73758f)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    static void h(@NonNull Executor executor, @NonNull final d dVar, final int i10, @p0 final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.g
            @Override // java.lang.Runnable
            public final void run() {
                dVar.a(i10, obj);
            }
        });
    }

    private static boolean i(@NonNull AssetManager assetManager, @NonNull String str, @NonNull PackageInfo packageInfo, @NonNull File file, @NonNull String str2, @NonNull Executor executor, @NonNull d dVar) {
        androidx.profileinstaller.c cVar = new androidx.profileinstaller.c(assetManager, executor, dVar, str2, f73753a, f73757e, new File(new File(f73755c, str), f73756d));
        if (!cVar.e()) {
            return false;
        }
        boolean zM = cVar.h().l().m();
        if (zM) {
            g(packageInfo, file);
        }
        return zM;
    }

    @m1
    public static void j(@NonNull Context context) {
        k(context, new androidx.media3.exoplayer.offline.b(), f73759g);
    }

    @m1
    public static void k(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        l(context, executor, dVar, false);
    }

    @m1
    static void l(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && f(packageInfo, filesDir, dVar)) {
                context.getPackageName();
                n.e(context, false);
                return;
            }
            context.getPackageName();
            if (i(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z10) {
                z11 = true;
            }
            n.e(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            dVar.a(7, e10);
            n.e(context, false);
        }
    }

    @m1
    static void m(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        try {
            g(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            h(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            h(executor, dVar, 7, e10);
        }
    }
}
