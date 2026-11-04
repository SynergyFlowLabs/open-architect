package com.google.android.gms.dynamite;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.v;
import com.google.firebase.analytics.FirebaseAnalytics;
import dalvik.system.DelegateLastClassLoader;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class DynamiteModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g6.a
    public static final int f107040b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g6.a
    public static final int f107041c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g6.a
    public static final int f107042d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g6.a
    public static final int f107043e = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Boolean f107050l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static String f107051m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f107052n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f107053o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Boolean f107054p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static p f107059u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static q f107060v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f107061a;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final ThreadLocal f107055q = new ThreadLocal();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final ThreadLocal f107056r = new d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final b.a f107057s = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final b f107044f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final b f107045g = new g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final b f107046h = new h();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final b f107047i = new i();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final b f107048j = new j();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final b f107049k = new k();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public static final b f107058t = new l();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    @g6.a
    public static class a extends Exception {
        /* synthetic */ a(String str, o oVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th2, o oVar) {
            super(str, th2);
        }
    }

    public interface b {

        @g6.a
        public interface a {
            int a(@NonNull Context context, @NonNull String str, boolean z10) throws a;

            int b(@NonNull Context context, @NonNull String str);
        }

        /* JADX INFO: renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        @g6.a
        public static class C0973b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @g6.a
            public int f107062a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @g6.a
            public int f107063b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @g6.a
            public int f107064c = 0;
        }

        @NonNull
        @g6.a
        C0973b a(@NonNull Context context, @NonNull String str, @NonNull a aVar) throws a;
    }

    private DynamiteModule(Context context) {
        w.r(context);
        this.f107061a = context;
    }

    @g6.a
    public static int a(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (u.b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e10) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage()));
            return 0;
        }
    }

    @g6.a
    public static int c(@NonNull Context context, @NonNull String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    @NonNull
    @g6.a
    public static DynamiteModule e(@NonNull Context context, @NonNull b bVar, @NonNull String str) throws Throwable {
        long j10;
        DynamiteModule dynamiteModuleH;
        Boolean bool;
        com.google.android.gms.dynamic.d dVarM;
        DynamiteModule dynamiteModule;
        q qVar;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new a("null application Context", null);
        }
        ThreadLocal threadLocal = f107055q;
        m mVar = (m) threadLocal.get();
        m mVar2 = new m(null);
        threadLocal.set(mVar2);
        ThreadLocal threadLocal2 = f107056r;
        Long l10 = (Long) threadLocal2.get();
        long jLongValue = l10.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            b.C0973b c0973bA = bVar.a(context, str, f107057s);
            int i10 = c0973bA.f107062a;
            int i11 = c0973bA.f107064c;
            if (i11 != 0) {
                if (i11 == -1) {
                    if (c0973bA.f107062a != 0) {
                        i11 = -1;
                    }
                }
                j10 = 0;
                if (i11 == 1) {
                    try {
                        if (c0973bA.f107063b != 0) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (jLongValue == j10) {
                            f107056r.remove();
                        } else {
                            f107056r.set(l10);
                        }
                        Cursor cursor = mVar2.f107067a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f107055q.set(mVar);
                        throw th;
                    }
                }
                if (i11 == -1) {
                    dynamiteModuleH = h(applicationContext, str);
                } else {
                    if (i11 != 1) {
                        throw new a("VersionPolicy returned invalid code:" + i11, null);
                    }
                    try {
                        int i12 = c0973bA.f107063b;
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!k(context)) {
                                    throw new a("Remote loading disabled", null);
                                }
                                bool = f107050l;
                            }
                            if (bool == null) {
                                throw new a("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                synchronized (DynamiteModule.class) {
                                    qVar = f107060v;
                                }
                                if (qVar == null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                m mVar3 = (m) threadLocal.get();
                                if (mVar3 == null || mVar3.f107067a == null) {
                                    throw new a("No result cursor", null);
                                }
                                Context applicationContext2 = context.getApplicationContext();
                                Cursor cursor2 = mVar3.f107067a;
                                com.google.android.gms.dynamic.f.p(null);
                                synchronized (DynamiteModule.class) {
                                    z10 = f107053o >= 2;
                                }
                                Context context2 = (Context) com.google.android.gms.dynamic.f.n(z10 ? qVar.u(com.google.android.gms.dynamic.f.p(applicationContext2), str, i12, com.google.android.gms.dynamic.f.p(cursor2)) : qVar.s(com.google.android.gms.dynamic.f.p(applicationContext2), str, i12, com.google.android.gms.dynamic.f.p(cursor2)));
                                if (context2 == null) {
                                    throw new a("Failed to get module context", null);
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                p pVarL = l(context);
                                if (pVarL == null) {
                                    throw new a("Failed to create IDynamiteLoader.", null);
                                }
                                int iS = pVarL.s();
                                if (iS >= 3) {
                                    m mVar4 = (m) threadLocal.get();
                                    if (mVar4 == null) {
                                        throw new a("No cached result cursor holder", null);
                                    }
                                    dVarM = pVarL.L(com.google.android.gms.dynamic.f.p(context), str, i12, com.google.android.gms.dynamic.f.p(mVar4.f107067a));
                                } else {
                                    dVarM = iS == 2 ? pVarL.M(com.google.android.gms.dynamic.f.p(context), str, i12) : pVarL.w(com.google.android.gms.dynamic.f.p(context), str, i12);
                                }
                                Object objN = com.google.android.gms.dynamic.f.n(dVarM);
                                if (objN == null) {
                                    throw new a("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objN);
                            }
                            dynamiteModuleH = dynamiteModule;
                        } catch (RemoteException e10) {
                            throw new a("Failed to load remote module.", e10, null);
                        } catch (a e11) {
                            throw e11;
                        } catch (Throwable th3) {
                            com.google.android.gms.common.util.i.a(context, th3);
                            throw new a("Failed to load remote module.", th3, null);
                        }
                    } catch (a e12) {
                        e12.getMessage();
                        int i13 = c0973bA.f107062a;
                        if (i13 == 0 || bVar.a(context, str, new n(i13, 0)).f107064c != -1) {
                            throw new a("Remote load failed. No local fallback found.", e12, null);
                        }
                        dynamiteModuleH = h(applicationContext, str);
                    }
                }
                if (jLongValue == 0) {
                    f107056r.remove();
                } else {
                    f107056r.set(l10);
                }
                Cursor cursor3 = mVar2.f107067a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                f107055q.set(mVar);
                return dynamiteModuleH;
            }
            throw new a("No acceptable module " + str + " found. Local version is " + c0973bA.f107062a + " and remote version is " + c0973bA.f107063b + ".", null);
        } catch (Throwable th4) {
            th = th4;
            j10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0166 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #8 {all -> 0x00db, blocks: (B:3:0x0003, B:63:0x00cf, B:66:0x00d6, B:74:0x00e7, B:107:0x015a, B:113:0x0166, B:129:0x0198, B:130:0x019b, B:124:0x0190, B:72:0x00e1, B:132:0x019d, B:4:0x0004, B:7:0x000c, B:8:0x002e, B:60:0x00cb, B:22:0x0056, B:45:0x00a4, B:48:0x00a7, B:57:0x00c4, B:62:0x00ce, B:59:0x00c6), top: B:144:0x0003, inners: #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0198 A[Catch: all -> 0x00db, TryCatch #8 {all -> 0x00db, blocks: (B:3:0x0003, B:63:0x00cf, B:66:0x00d6, B:74:0x00e7, B:107:0x015a, B:113:0x0166, B:129:0x0198, B:130:0x019b, B:124:0x0190, B:72:0x00e1, B:132:0x019d, B:4:0x0004, B:7:0x000c, B:8:0x002e, B:60:0x00cb, B:22:0x0056, B:45:0x00a4, B:48:0x00a7, B:57:0x00c4, B:62:0x00ce, B:59:0x00c6), top: B:144:0x0003, inners: #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:154:? A[Catch: all -> 0x00db, SYNTHETIC, TRY_LEAVE, TryCatch #8 {all -> 0x00db, blocks: (B:3:0x0003, B:63:0x00cf, B:66:0x00d6, B:74:0x00e7, B:107:0x015a, B:113:0x0166, B:129:0x0198, B:130:0x019b, B:124:0x0190, B:72:0x00e1, B:132:0x019d, B:4:0x0004, B:7:0x000c, B:8:0x002e, B:60:0x00cb, B:22:0x0056, B:45:0x00a4, B:48:0x00a7, B:57:0x00c4, B:62:0x00ce, B:59:0x00c6), top: B:144:0x0003, inners: #7, #9 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5 A[Catch: all -> 0x0041, TryCatch #2 {all -> 0x0041, blocks: (B:9:0x002f, B:11:0x003c, B:52:0x00bf, B:17:0x0048, B:19:0x004f, B:21:0x0055, B:27:0x005e, B:29:0x0063, B:34:0x0070, B:36:0x007a, B:39:0x0082, B:43:0x009b, B:44:0x00a3, B:42:0x008b, B:47:0x00a6, B:50:0x00a9, B:51:0x00b5, B:18:0x004b), top: B:138:0x002f, inners: #5 }] */
    public static int f(@NonNull Context context, @NonNull String str, boolean z10) {
        Throwable th2;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                try {
                    Boolean bool = f107050l;
                    Cursor cursor2 = null;
                    int iV = 0;
                    if (bool == null) {
                        try {
                            Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                            synchronized (declaredField.getDeclaringClass()) {
                                try {
                                    ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                    if (classLoader == ClassLoader.getSystemClassLoader()) {
                                        bool = Boolean.FALSE;
                                    } else {
                                        if (classLoader == null) {
                                            if (!k(context)) {
                                                return 0;
                                            }
                                            if (f107052n) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            } else {
                                                Boolean bool2 = Boolean.TRUE;
                                                if (bool2.equals(null)) {
                                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                    bool = Boolean.FALSE;
                                                } else {
                                                    try {
                                                        int iG = g(context, str, z10, true);
                                                        String str2 = f107051m;
                                                        if (str2 != null && !str2.isEmpty()) {
                                                            ClassLoader classLoaderA = com.google.android.gms.dynamite.b.a();
                                                            if (classLoaderA == null) {
                                                                String str3 = f107051m;
                                                                w.r(str3);
                                                                classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                            }
                                                            i(classLoaderA);
                                                            declaredField.set(null, classLoaderA);
                                                            f107050l = bool2;
                                                            return iG;
                                                        }
                                                        return iG;
                                                    } catch (a unused) {
                                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                            com.google.android.gms.common.util.i.a(context, th);
                                            throw th;
                                        }
                                        try {
                                            i(classLoader);
                                        } catch (a unused2) {
                                        }
                                        bool = Boolean.TRUE;
                                    }
                                    f107050l = bool;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e10) {
                            e10.toString();
                            bool = Boolean.FALSE;
                        }
                    }
                    if (bool.booleanValue()) {
                        try {
                            return g(context, str, z10, false);
                        } catch (a e11) {
                            e11.getMessage();
                            return 0;
                        }
                    }
                    p pVarL = l(context);
                    if (pVarL != null) {
                        try {
                            int iS = pVarL.s();
                            if (iS >= 3) {
                                m mVar = (m) f107055q.get();
                                if (mVar == null || (cursor = mVar.f107067a) == null) {
                                    Cursor cursor3 = (Cursor) com.google.android.gms.dynamic.f.n(pVarL.O(com.google.android.gms.dynamic.f.p(context), str, z10, ((Long) f107056r.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i10 = cursor3.getInt(0);
                                                cursor2 = (i10 <= 0 || !j(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iV = i10;
                                            } else if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (RemoteException e12) {
                                            remoteException = e12;
                                            cursor2 = cursor3;
                                            try {
                                                remoteException.getMessage();
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                                if (cursor2 != null) {
                                                    throw th2;
                                                }
                                                cursor2.close();
                                                throw th2;
                                            }
                                        } catch (Throwable th5) {
                                            th2 = th5;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                throw th2;
                                            }
                                            cursor2.close();
                                            throw th2;
                                        }
                                    } else if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    iV = cursor.getInt(0);
                                }
                            } else {
                                iV = iS == 2 ? pVarL.v(com.google.android.gms.dynamic.f.p(context), str, z10) : pVarL.u(com.google.android.gms.dynamic.f.p(context), str, z10);
                            }
                        } catch (RemoteException e13) {
                            remoteException = e13;
                        } catch (Throwable th6) {
                            th2 = th6;
                        }
                    }
                    return iV;
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            com.google.android.gms.common.util.i.a(context, th8);
            throw th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0162 A[Catch: all -> 0x0146, TryCatch #3 {all -> 0x0146, blocks: (B:60:0x00f1, B:62:0x00f7, B:65:0x00ff, B:79:0x012d, B:83:0x0136, B:87:0x013c, B:88:0x0145, B:97:0x0155, B:98:0x015c, B:100:0x015e, B:102:0x0162, B:103:0x0163, B:104:0x017d), top: B:114:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0163 A[Catch: all -> 0x0146, TryCatch #3 {all -> 0x0146, blocks: (B:60:0x00f1, B:62:0x00f7, B:65:0x00ff, B:79:0x012d, B:83:0x0136, B:87:0x013c, B:88:0x0145, B:97:0x0155, B:98:0x015c, B:100:0x015e, B:102:0x0162, B:103:0x0163, B:104:0x017d), top: B:114:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0180  */
    /* JADX WARN: Code duplicated, block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x0163, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x014d: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:93:0x014d */
    private static int g(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        Exception exc;
        Cursor cursor;
        MatrixCursor matrixCursor;
        Cursor cursor2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        try {
            try {
                boolean z12 = true;
                Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority("com.google.android.gms.chimera").path(true != z10 ? MetricTracker.Place.API : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) f107056r.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z13 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr4 = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr4[i11] = null;
                                        } else if (type == 1) {
                                            objArr4[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr4[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr4[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr4[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr4);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th3) {
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        f107051m = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f107053o = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (matrixCursor.getInt(columnIndex2) == 0) {
                                                z12 = false;
                                            }
                                            f107052n = z12;
                                            z13 = z12;
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                if (j(matrixCursor)) {
                                    matrixCursor = null;
                                }
                            }
                            if (z11 && z13) {
                                throw new a("forcing fallback to container DynamiteLoader impl", objArr2 == true ? 1 : 0);
                            }
                            if (matrixCursor != null) {
                                matrixCursor.close();
                            }
                            return i12;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        throw new a("V2 version check failed: " + exc.getMessage(), exc, objArr == true ? 1 : 0);
                    }
                }
                throw new a("Failed to connect to dynamite module ContentResolver.", objArr3 == true ? 1 : 0);
            } catch (Throwable th7) {
                th2 = th7;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th2;
                }
                cursor2.close();
                throw th2;
            }
        } catch (Exception e11) {
            exc = e11;
            if (exc instanceof a) {
                throw exc;
            }
            throw new a("V2 version check failed: " + exc.getMessage(), exc, objArr == true ? 1 : 0);
        } catch (Throwable th8) {
            th2 = th8;
            if (cursor2 != null) {
                throw th2;
            }
            cursor2.close();
            throw th2;
        }
    }

    private static DynamiteModule h(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) throws a {
        q qVar;
        o oVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                qVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                qVar = iInterfaceQueryLocalInterface instanceof q ? (q) iInterfaceQueryLocalInterface : new q(iBinder);
            }
            f107060v = qVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10, oVar);
        }
    }

    private static boolean j(Cursor cursor) {
        m mVar = (m) f107055q.get();
        if (mVar == null || mVar.f107067a != null) {
            return false;
        }
        mVar.f107067a = cursor;
        return true;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f107054p)) {
            return true;
        }
        boolean z10 = false;
        if (f107054p == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != v.p() ? 0 : 268435456);
            if (com.google.android.gms.common.g.i().k(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f107054p = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f107052n = true;
            }
        }
        return z10;
    }

    private static p l(Context context) {
        p pVar;
        synchronized (DynamiteModule.class) {
            try {
                p pVar2 = f107059u;
                if (pVar2 != null) {
                    return pVar2;
                }
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        pVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        pVar = iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new p(iBinder);
                    }
                    if (pVar != null) {
                        f107059u = pVar;
                        return pVar;
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @g6.a
    public Context b() {
        return this.f107061a;
    }

    @NonNull
    @g6.a
    public IBinder d(@NonNull String str) throws a {
        try {
            return (IBinder) this.f107061a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e10, null);
        }
    }
}
