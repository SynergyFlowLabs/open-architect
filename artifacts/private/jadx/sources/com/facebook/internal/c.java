package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f99760f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f99761g = c.class.getCanonicalName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f99762h = "com.facebook.katana.provider.AttributionIdProvider";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f99763i = "com.facebook.wakizashi.provider.AttributionIdProvider";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f99764j = "aid";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f99765k = "androidid";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f99766l = "limit_tracking";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f99767m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f99768n = 3600000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @oj.f
    @Nullable
    public static c f99769o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f99770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f99771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f99772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f99773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f99774e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final c a(c cVar) {
            cVar.f99771b = System.currentTimeMillis();
            c.f99769o = cVar;
            return cVar;
        }

        @androidx.annotation.l1(otherwise = 2)
        public static /* synthetic */ void b() {
        }

        private final c c(Context context) {
            c cVarD = d(context);
            if (cVarD != null) {
                return cVarD;
            }
            c cVarE = e(context);
            if (cVarE == null) {
                cVarE = new c();
            }
            return cVarE;
        }

        private final c d(Context context) {
            Object objP;
            try {
                if (!i(context)) {
                    return null;
                }
                e1 e1Var = e1.f99794a;
                Method methodH = e1.H("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (methodH == null || (objP = e1.P(null, methodH, context)) == null) {
                    return null;
                }
                boolean zBooleanValue = false;
                Method methodG = e1.G(objP.getClass(), "getId", new Class[0]);
                Method methodG2 = e1.G(objP.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodG != null && methodG2 != null) {
                    c cVar = new c();
                    cVar.f99770a = (String) e1.P(objP, methodG, new Object[0]);
                    Boolean bool = (Boolean) e1.P(objP, methodG2, new Object[0]);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    cVar.f99774e = zBooleanValue;
                    return cVar;
                }
                return null;
            } catch (Exception e10) {
                e1 e1Var2 = e1.f99794a;
                e1.f0("android_id", e10);
                return null;
            }
        }

        private final c e(Context context) {
            ServiceConnectionC0909c serviceConnectionC0909c = new ServiceConnectionC0909c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (context.bindService(intent, serviceConnectionC0909c, 1)) {
                    try {
                        try {
                            b bVar = new b(serviceConnectionC0909c.a());
                            c cVar = new c();
                            cVar.f99770a = bVar.i();
                            cVar.f99774e = bVar.k();
                            context.unbindService(serviceConnectionC0909c);
                            return cVar;
                        } catch (Exception e10) {
                            e1 e1Var = e1.f99794a;
                            e1.f0("android_id", e10);
                            context.unbindService(serviceConnectionC0909c);
                            return null;
                        }
                    } catch (Throwable th2) {
                        context.unbindService(serviceConnectionC0909c);
                        throw th2;
                    }
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        @androidx.annotation.l1(otherwise = 2)
        public static /* synthetic */ void g() {
        }

        private final String h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        private final boolean i(Context context) {
            e1 e1Var = e1.f99794a;
            Method methodH = e1.H("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodH == null) {
                return false;
            }
            Object objP = e1.P(null, methodH, context);
            return (objP instanceof Integer) && Intrinsics.areEqual(objP, (Object) 0);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0080 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x0082 A[Catch: all -> 0x003c, Exception -> 0x0041, TryCatch #4 {Exception -> 0x0041, all -> 0x003c, blocks: (B:3:0x0014, B:5:0x0023, B:7:0x0028, B:14:0x0047, B:16:0x0065, B:18:0x0075, B:25:0x009d, B:27:0x00a4, B:29:0x00aa, B:31:0x00b1, B:21:0x0082, B:23:0x0093, B:56:0x011c, B:57:0x0128), top: B:69:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0093 A[Catch: all -> 0x003c, Exception -> 0x0041, TryCatch #4 {Exception -> 0x0041, all -> 0x003c, blocks: (B:3:0x0014, B:5:0x0023, B:7:0x0028, B:14:0x0047, B:16:0x0065, B:18:0x0075, B:25:0x009d, B:27:0x00a4, B:29:0x00aa, B:31:0x00b1, B:21:0x0082, B:23:0x0093, B:56:0x011c, B:57:0x0128), top: B:69:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0148  */
        /* JADX WARN: Code duplicated, block: B:67:0x014a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r4v2 */
        @oj.n
        @Nullable
        public final c f(@NotNull Context context) {
            Throwable th2;
            Exception exc;
            Cursor cursorQuery;
            Uri uri;
            String str;
            Uri uri2;
            Intrinsics.checkNotNullParameter(context, "context");
            c cVarC = c(context);
            ?? r10 = 0;
            try {
                try {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        throw new com.facebook.u("getAttributionIdentifiers cannot be called on the main thread.");
                    }
                    c cVar = c.f99769o;
                    if (cVar != null && System.currentTimeMillis() - cVar.f99771b < 3600000) {
                        return cVar;
                    }
                    String[] strArr = {c.f99764j, c.f99765k, c.f99766l};
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(c.f99762h, 0);
                    ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider(c.f99763i, 0);
                    if (providerInfoResolveContentProvider != null) {
                        q qVar = q.f100051a;
                        String str2 = providerInfoResolveContentProvider.packageName;
                        Intrinsics.checkNotNullExpressionValue(str2, "contentProviderInfo.packageName");
                        if (q.a(context, str2)) {
                            uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        } else {
                            if (providerInfoResolveContentProvider2 != null) {
                                q qVar2 = q.f100051a;
                                str = providerInfoResolveContentProvider2.packageName;
                                Intrinsics.checkNotNullExpressionValue(str, "wakizashiProviderInfo.packageName");
                                if (q.a(context, str)) {
                                    uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                }
                            }
                            uri = null;
                        }
                        uri = uri2;
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            q qVar3 = q.f100051a;
                            str = providerInfoResolveContentProvider2.packageName;
                            Intrinsics.checkNotNullExpressionValue(str, "wakizashiProviderInfo.packageName");
                            if (q.a(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                uri = uri2;
                            }
                        }
                        uri = null;
                    }
                    String strH = h(context);
                    if (strH != null) {
                        cVarC.f99773d = strH;
                    }
                    if (uri == null) {
                        return a(cVarC);
                    }
                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex(c.f99764j);
                                int columnIndex2 = cursorQuery.getColumnIndex(c.f99765k);
                                int columnIndex3 = cursorQuery.getColumnIndex(c.f99766l);
                                cVarC.f99772c = cursorQuery.getString(columnIndex);
                                if (columnIndex2 > 0 && columnIndex3 > 0 && cVarC.h() == null) {
                                    cVarC.f99770a = cursorQuery.getString(columnIndex2);
                                    cVarC.f99774e = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                                }
                                cursorQuery.close();
                                return a(cVarC);
                            }
                        } catch (Exception e10) {
                            exc = e10;
                            e1 e1Var = e1.f99794a;
                            e1.g0(c.f99761g, Intrinsics.stringPlus("Caught unexpected exception in getAttributionId(): ", exc));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                    }
                    c cVarA = a(cVarC);
                    if (cursorQuery == null) {
                        return cVarA;
                    }
                    cursorQuery.close();
                    return cVarA;
                } catch (Throwable th3) {
                    th2 = th3;
                    r10 = context;
                    if (r10 == 0) {
                        throw th2;
                    }
                    r10.close();
                    throw th2;
                }
            } catch (Exception e11) {
                exc = e11;
                cursorQuery = null;
            } catch (Throwable th4) {
                th2 = th4;
                if (r10 == 0) {
                    throw th2;
                }
                r10.close();
                throw th2;
            }
        }

        @oj.n
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public final boolean j(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            c cVarF = f(context);
            return cVarF != null && cVarF.l();
        }

        private a() {
        }
    }

    private static final class b implements IInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f99775b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f99776c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f99777d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final IBinder f99778a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(@NotNull IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.f99778a = binder;
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.f99778a;
        }

        @Nullable
        public final String i() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f99778a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean k() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f99778a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z10;
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.c$c, reason: collision with other inner class name */
    private static final class ServiceConnectionC0909c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f99779a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final BlockingQueue<IBinder> f99780b = new LinkedBlockingDeque();

        @NotNull
        public final IBinder a() throws InterruptedException {
            if (this.f99779a.compareAndSet(true, true)) {
                throw new IllegalStateException("Binder already consumed");
            }
            IBinder iBinderTake = this.f99780b.take();
            Intrinsics.checkNotNullExpressionValue(iBinderTake, "queue.take()");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f99780b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName componentName) {
        }
    }

    @oj.n
    @Nullable
    public static final c k(@NotNull Context context) {
        return f99760f.f(context);
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static final boolean m(@NotNull Context context) {
        return f99760f.j(context);
    }

    @Nullable
    public final String h() {
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        if (com.facebook.g0.N() && com.facebook.g0.m()) {
            return this.f99770a;
        }
        return null;
    }

    @Nullable
    public final String i() {
        return this.f99773d;
    }

    @Nullable
    public final String j() {
        return this.f99772c;
    }

    public final boolean l() {
        return this.f99774e;
    }
}
