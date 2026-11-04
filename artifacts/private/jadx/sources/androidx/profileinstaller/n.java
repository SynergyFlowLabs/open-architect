package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.common.util.concurrent.t1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f73793a = "/data/misc/profiles/ref/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f73794b = "/data/misc/profiles/cur/0/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f73795c = "primary.prof";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f73796d = "profileInstalled";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f73799g = "ProfileVerifier";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.concurrent.futures.e<c> f73797e = androidx.concurrent.futures.e.N();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f73798f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private static c f73800h = null;

    @w0(33)
    private static class a {
        private a() {
        }

        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @b1({b1.a.LIBRARY})
    static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f73801e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f73802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f73803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f73804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f73805d;

        b(int i10, int i11, long j10, long j11) {
            this.f73802a = i10;
            this.f73803b = i11;
            this.f73804c = j10;
            this.f73805d = j11;
        }

        static b a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        void b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f73802a);
                dataOutputStream.writeInt(this.f73803b);
                dataOutputStream.writeLong(this.f73804c);
                dataOutputStream.writeLong(this.f73805d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f73803b == bVar.f73803b && this.f73804c == bVar.f73804c && this.f73802a == bVar.f73802a && this.f73805d == bVar.f73805d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f73803b), Long.valueOf(this.f73804c), Integer.valueOf(this.f73802a), Long.valueOf(this.f73805d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f73806e = 16;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f73807f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Deprecated
        public static final int f73808g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f73809h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f73810i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f73811j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f73812k = 65536;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f73813l = 131072;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f73814m = 196608;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f73815n = 262144;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f73816o = 327680;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f73817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f73818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f73819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f73820d;

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY})
        public @interface a {
        }

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f73817a = i10;
            this.f73819c = z11;
            this.f73818b = z10;
            this.f73820d = z12;
        }

        public boolean a() {
            return this.f73820d;
        }

        public int b() {
            return this.f73817a;
        }

        public boolean c() {
            return this.f73819c;
        }

        public boolean d() {
            return this.f73818b;
        }
    }

    private n() {
    }

    @NonNull
    public static t1<c> a() {
        return f73797e;
    }

    private static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c c(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f73800h = cVar;
        f73797e.E(cVar);
        return f73800h;
    }

    @NonNull
    @m1
    public static c d(@NonNull Context context) {
        return e(context, false);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0048 A[Catch: all -> 0x0012, TryCatch #0 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002f, B:33:0x0042, B:35:0x0048, B:36:0x004e, B:38:0x0050, B:44:0x0075, B:50:0x009a, B:51:0x009e, B:53:0x00af, B:62:0x00c0, B:64:0x00c6, B:79:0x00e4, B:82:0x00ea, B:85:0x00f1, B:87:0x00fb, B:92:0x0107, B:93:0x010b, B:89:0x0101, B:56:0x00b6, B:57:0x00ba, B:95:0x010d, B:96:0x0113, B:31:0x003f, B:30:0x003c), top: B:100:0x000c, inners: #3, #6 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0050 A[Catch: all -> 0x0012, TryCatch #0 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002f, B:33:0x0042, B:35:0x0048, B:36:0x004e, B:38:0x0050, B:44:0x0075, B:50:0x009a, B:51:0x009e, B:53:0x00af, B:62:0x00c0, B:64:0x00c6, B:79:0x00e4, B:82:0x00ea, B:85:0x00f1, B:87:0x00fb, B:92:0x0107, B:93:0x010b, B:89:0x0101, B:56:0x00b6, B:57:0x00ba, B:95:0x010d, B:96:0x0113, B:31:0x003f, B:30:0x003c), top: B:100:0x000c, inners: #3, #6 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    @NonNull
    @b1({b1.a.LIBRARY})
    @m1
    static c e(@NonNull Context context, boolean z10) {
        int i10;
        boolean z11;
        File file;
        boolean z12;
        File file2;
        long length;
        boolean z13;
        File file3;
        b bVarA;
        b bVar;
        int i11;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z10 && (cVar = f73800h) != null) {
            return cVar;
        }
        synchronized (f73798f) {
            if (z10) {
                i10 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                assetFileDescriptorOpenFd.close();
                if (Build.VERSION.SDK_INT == 30) {
                    return c(262144, false, false, z11);
                }
                file = new File(new File(f73793a, context.getPackageName()), f73795c);
                long length2 = file.length();
                if (file.exists()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                file2 = new File(new File(f73794b, context.getPackageName()), f73795c);
                length = file2.length();
                if (file2.exists()) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                long jB = b(context);
                file3 = new File(context.getFilesDir(), f73796d);
                if (file3.exists()) {
                    bVarA = b.a(file3);
                } else {
                    bVarA = null;
                }
                if (bVarA == null) {
                    if (!z11) {
                        i10 = c.f73816o;
                    } else if (z12) {
                        i10 = 1;
                    } else if (z13) {
                        i10 = 2;
                    }
                } else if (!z11) {
                    i10 = c.f73816o;
                } else if (z12) {
                    i10 = 1;
                } else if (z13) {
                    i10 = 2;
                }
                if (z10) {
                    i10 = 2;
                }
                if (bVarA != null) {
                    i10 = 3;
                }
                int i12 = i10;
                bVar = new b(1, i12, jB, length);
                if (bVarA != null) {
                    bVar.b(file3);
                } else {
                    bVar.b(file3);
                }
                return c(i12, z12, z13, z11);
            }
            c cVar2 = f73800h;
            if (cVar2 != null) {
                return cVar2;
            }
            i10 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th2;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (IOException unused) {
                z11 = false;
            }
            if (Build.VERSION.SDK_INT == 30) {
                return c(262144, false, false, z11);
            }
            file = new File(new File(f73793a, context.getPackageName()), f73795c);
            long length3 = file.length();
            if (file.exists() || length3 <= 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            file2 = new File(new File(f73794b, context.getPackageName()), f73795c);
            length = file2.length();
            if (file2.exists() || length <= 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            try {
                long jB2 = b(context);
                file3 = new File(context.getFilesDir(), f73796d);
                if (file3.exists()) {
                    try {
                        bVarA = b.a(file3);
                    } catch (IOException unused2) {
                        return c(131072, z12, z13, z11);
                    }
                } else {
                    bVarA = null;
                }
                if (bVarA == null && bVarA.f73804c == jB2 && (i11 = bVarA.f73803b) != 2) {
                    i10 = i11;
                } else if (!z11) {
                    i10 = c.f73816o;
                } else if (z12) {
                    i10 = 1;
                } else if (z13) {
                    i10 = 2;
                }
                if (z10 && z13 && i10 != 1) {
                    i10 = 2;
                }
                if (bVarA != null && bVarA.f73803b == 2 && i10 == 1 && length3 < bVarA.f73805d) {
                    i10 = 3;
                }
                int i13 = i10;
                bVar = new b(1, i13, jB2, length);
                if (bVarA != null || !bVarA.equals(bVar)) {
                    try {
                        bVar.b(file3);
                    } catch (IOException unused3) {
                        i13 = c.f73814m;
                    }
                }
                return c(i13, z12, z13, z11);
            } catch (PackageManager.NameNotFoundException unused4) {
                return c(65536, z12, z13, z11);
            }
            throw th;
        }
    }
}
