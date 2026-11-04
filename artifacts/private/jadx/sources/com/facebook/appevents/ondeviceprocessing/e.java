package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.b1;
import com.facebook.appevents.internal.g;
import com.facebook.g0;
import com.facebook.internal.e1;
import com.facebook.internal.q;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f99166a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f99167b = e.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f99168c = "ReceiverService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f99169d = "com.facebook.katana";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f99170e = "com.facebook.wakizashi";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static Boolean f99171f;

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f99175a;

        a(String str) {
            this.f99175a = str;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            return (a[]) Arrays.copyOf(aVarArrValuesCustom, aVarArrValuesCustom.length);
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.f99175a;
        }
    }

    private static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final CountDownLatch f99176a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private IBinder f99177b;

        @Nullable
        public final IBinder a() throws InterruptedException {
            this.f99176a.await(5L, TimeUnit.SECONDS);
            return this.f99177b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f99176a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.f99177b = serviceBinder;
            this.f99176a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        static {
            int i10 = 5 ^ 1;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }
    }

    private e() {
    }

    private final Intent a(Context context) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent(f99168c);
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null) {
                    q qVar = q.f100051a;
                    if (q.a(context, "com.facebook.katana")) {
                        return intent;
                    }
                }
                Intent intent2 = new Intent(f99168c);
                intent2.setPackage(f99170e);
                if (packageManager.resolveService(intent2, 0) != null) {
                    q qVar2 = q.f100051a;
                    if (q.a(context, f99170e)) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @n
    public static final boolean b() {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return false;
        }
        try {
            if (f99171f == null) {
                g0 g0Var = g0.f99617a;
                f99171f = Boolean.valueOf(f99166a.a(g0.n()) != null);
            }
            Boolean bool = f99171f;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return false;
        }
    }

    @n
    @NotNull
    public static final c c(@NotNull String applicationId, @NotNull List<com.facebook.appevents.e> appEvents) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return f99166a.d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return null;
        }
    }

    private final c d(a aVar, String str, List<com.facebook.appevents.e> list) {
        c cVar;
        String str2;
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            g gVar = g.f99011a;
            g.b();
            g0 g0Var = g0.f99617a;
            Context contextN = g0.n();
            Intent intentA = a(contextN);
            if (intentA == null) {
                return cVar2;
            }
            b bVar = new b();
            if (!contextN.bindService(intentA, bVar, 1)) {
                return c.SERVICE_ERROR;
            }
            try {
                try {
                    try {
                        IBinder iBinderA = bVar.a();
                        if (iBinderA != null) {
                            com.facebook.ppml.receiver.a aVarI = com.facebook.ppml.receiver.a.b.i(iBinderA);
                            d dVar = d.f99164a;
                            Bundle bundleA = d.a(aVar, str, list);
                            if (bundleA != null) {
                                aVarI.e9(bundleA);
                                e1 e1Var = e1.f99794a;
                                e1.g0(f99167b, Intrinsics.stringPlus("Successfully sent events to the remote service: ", bundleA));
                            }
                            cVar2 = c.OPERATION_SUCCESS;
                        }
                        contextN.unbindService(bVar);
                        e1 e1Var2 = e1.f99794a;
                        return cVar2;
                    } catch (InterruptedException e10) {
                        cVar = c.SERVICE_ERROR;
                        e1 e1Var3 = e1.f99794a;
                        str2 = f99167b;
                        e1.f0(str2, e10);
                        contextN.unbindService(bVar);
                        e1.g0(str2, "Unbound from the remote service");
                        return cVar;
                    }
                } catch (RemoteException e11) {
                    cVar = c.SERVICE_ERROR;
                    e1 e1Var4 = e1.f99794a;
                    str2 = f99167b;
                    e1.f0(str2, e11);
                    contextN.unbindService(bVar);
                    e1.g0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } finally {
                contextN.unbindService(bVar);
                e1 e1Var5 = e1.f99794a;
                e1.g0(f99167b, "Unbound from the remote service");
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
            return null;
        }
    }

    @n
    @NotNull
    public static final c e(@NotNull String applicationId) {
        if (com.facebook.internal.instrument.crashshield.b.e(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return f99166a.d(a.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, e.class);
            return null;
        }
    }
}
