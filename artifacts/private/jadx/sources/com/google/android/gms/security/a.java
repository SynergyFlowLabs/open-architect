package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.p0;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.common.i;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.y;
import com.google.android.gms.internal.common.z;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final String f110908a = "GmsCore_OpenSSL";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f110909b = g.i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f110910c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("ProviderInstaller.lock")
    @p0
    private static Method f110911d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @b0("ProviderInstaller.lock")
    private static boolean f110912e = false;

    /* JADX INFO: renamed from: com.google.android.gms.security.a$a, reason: collision with other inner class name */
    public interface InterfaceC0975a {
        void a(int i10, @p0 Intent intent);

        void b();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x0016, B:7:0x001b, B:15:0x0045, B:16:0x004d, B:18:0x004f, B:30:0x00a4, B:31:0x00a9, B:34:0x00ac, B:35:0x00b4, B:21:0x0058, B:23:0x005f, B:26:0x0095, B:12:0x0030), top: B:38:0x0016, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x0016, B:7:0x001b, B:15:0x0045, B:16:0x004d, B:18:0x004f, B:30:0x00a4, B:31:0x00a9, B:34:0x00ac, B:35:0x00b4, B:21:0x0058, B:23:0x005f, B:26:0x0095, B:12:0x0030), top: B:38:0x0016, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x0016, B:7:0x001b, B:15:0x0045, B:16:0x004d, B:18:0x004f, B:30:0x00a4, B:31:0x00a9, B:34:0x00ac, B:35:0x00b4, B:21:0x0058, B:23:0x005f, B:26:0x0095, B:12:0x0030), top: B:38:0x0016, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x0016, B:7:0x001b, B:15:0x0045, B:16:0x004d, B:18:0x004f, B:30:0x00a4, B:31:0x00a9, B:34:0x00ac, B:35:0x00b4, B:21:0x0058, B:23:0x005f, B:26:0x0095, B:12:0x0030), top: B:38:0x0016, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(@NonNull Context context) throws i, h {
        Context contextB;
        boolean z10;
        Context contextI;
        w.s(context, "Context must not be null");
        f110909b.p(context, 11925000);
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f110910c) {
            try {
                Context context2 = null;
                if (f110912e) {
                    z10 = f110912e;
                    contextI = k.i(context);
                    if (contextI == null) {
                        f110912e = true;
                        if (!z10) {
                            com.google.android.gms.internal.common.b0.b("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", contextI.getClassLoader(), z.a(Context.class, context), y.d(jUptimeMillis), y.d(SystemClock.uptimeMillis()));
                        }
                        context2 = contextI;
                    }
                    if (context2 != null) {
                        throw new h(8);
                    }
                    d(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    try {
                        contextB = DynamiteModule.e(context, DynamiteModule.f107048j, "com.google.android.gms.providerinstaller.dynamite").b();
                    } catch (DynamiteModule.a e10) {
                        "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage()));
                        contextB = null;
                    }
                    if (contextB != null) {
                        d(contextB, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    } else {
                        z10 = f110912e;
                        contextI = k.i(context);
                        if (contextI == null) {
                            f110912e = true;
                            if (!z10) {
                                try {
                                    com.google.android.gms.internal.common.b0.b("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", contextI.getClassLoader(), z.a(Context.class, context), y.d(jUptimeMillis), y.d(SystemClock.uptimeMillis()));
                                } catch (Exception e11) {
                                    "Failed to report request stats: ".concat(e11.toString());
                                }
                            }
                            context2 = contextI;
                        }
                        if (context2 != null) {
                            throw new h(8);
                        }
                        d(context2, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(@NonNull Context context, @NonNull InterfaceC0975a interfaceC0975a) {
        w.s(context, "Context must not be null");
        w.s(interfaceC0975a, "Listener must not be null");
        w.k("Must be called on the UI thread");
        new b(context, interfaceC0975a).execute(new Void[0]);
    }

    @b0("ProviderInstaller.lock")
    private static void d(Context context, Context context2, String str) throws h {
        try {
            if (f110911d == null) {
                f110911d = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f110911d.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString()));
            }
            throw new h(8);
        }
    }
}
