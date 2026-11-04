package com.google.vr.cardboard;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import com.google.vr.ndk.base.g0;
import com.google.vr.sdk.deps.b7;
import com.google.vr.sdk.deps.c7;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class VrParamsProviderJni {
    private static void a(long j10, DisplayMetrics displayMetrics, float f10, int i10) {
        nativeUpdateNativeDisplayParamsPointer(j10, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, f10, i10);
    }

    private static native void nativeUpdateNativeDisplayParamsPointer(long j10, int i10, int i11, float f10, float f11, float f12, int i12);

    @UsedByNative
    private static byte[] readDeviceParams(Context context) {
        a0 a0VarA = b0.a(context);
        com.google.vr.sdk.proto.nano.a.c cVarD = a0VarA.d();
        a0VarA.close();
        if (cVarD == null) {
            return null;
        }
        return c7.j(cVarD);
    }

    @UsedByNative
    private static void readDisplayParams(Context context, long j10) {
        if (context == null) {
            a(j10, Resources.getSystem().getDisplayMetrics(), g.a(null), 0);
            return;
        }
        a0 a0VarA = b0.a(context);
        com.google.vr.sdk.proto.nano.b.a aVarC = a0VarA.c();
        a0VarA.close();
        Display displayC = g.c(context);
        a(j10, g.e(displayC, aVarC), g.a(aVarC), g.b(context, displayC, new b()));
    }

    @UsedByNative
    private static byte[] readSdkConfigurationParams(Context context) {
        return c7.j(g0.a(context));
    }

    @UsedByNative
    private static byte[] readUserPrefs(Context context) {
        a0 a0VarA = b0.a(context);
        com.google.vr.sdk.proto.nano.c.d dVarF = a0VarA.f();
        a0VarA.close();
        if (dVarF == null) {
            return null;
        }
        return c7.j(dVarF);
    }

    @UsedByNative
    private static boolean writeDeviceParams(Context context, byte[] bArr) {
        com.google.vr.sdk.proto.nano.a.c cVar;
        a0 a0VarA = b0.a(context);
        try {
            if (bArr != null) {
                try {
                    cVar = (com.google.vr.sdk.proto.nano.a.c) c7.f(new com.google.vr.sdk.proto.nano.a.c(), bArr);
                } catch (b7 e10) {
                    new StringBuilder(String.valueOf(e10).length() + 31);
                    a0VarA.close();
                    return false;
                }
            } else {
                cVar = null;
            }
            boolean zG = a0VarA.g(cVar);
            a0VarA.close();
            return zG;
        } catch (Throwable th2) {
            a0VarA.close();
            throw th2;
        }
    }
}
