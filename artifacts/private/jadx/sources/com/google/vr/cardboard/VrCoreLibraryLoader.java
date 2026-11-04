package com.google.vr.cardboard;

import android.content.Context;
import android.os.RemoteException;
import com.google.vr.ndk.base.o0;

/* JADX INFO: loaded from: classes5.dex */
@UsedByNative
public class VrCoreLibraryLoader {
    private static void a(Context context, o0 o0Var) throws com.google.vr.vrcore.base.api.c {
        String strE = com.google.vr.vrcore.base.api.d.e(context);
        o0 o0VarB = o0.b(strE);
        if (o0VarB == null) {
            throw new com.google.vr.vrcore.base.api.c(4);
        }
        if (o0VarB.a(o0Var)) {
            return;
        }
        String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", strE, o0Var.toString());
        throw new com.google.vr.vrcore.base.api.c(4);
    }

    @UsedByNative
    public static long loadNativeDlsymMethod(Context context) {
        return 0L;
    }

    @UsedByNative
    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, o0.f127195f, o0.f127194e);
    }

    @UsedByNative
    public static long loadNativeGvrLibrary(Context context, o0 o0Var, o0 o0Var2) {
        try {
            a(context, o0Var);
            Context contextA = com.google.vr.vrcore.library.api.g.a(context);
            int iB = com.google.vr.vrcore.library.api.g.b(context);
            com.google.vr.vrcore.library.api.e eVarCd = com.google.vr.vrcore.library.api.g.c(context).cd(com.google.vr.vrcore.library.api.f.u(contextA), com.google.vr.vrcore.library.api.f.u(context));
            if (eVarCd == null) {
                return 0L;
            }
            return iB < 19 ? eVarCd.Se(o0Var2.f127196a, o0Var2.f127197b, o0Var2.f127198c) : eVarCd.zd(o0Var.toString(), o0Var2.toString());
        } catch (RemoteException | com.google.vr.vrcore.base.api.c | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e10) {
            new StringBuilder(String.valueOf(e10).length() + 49);
            return 0L;
        }
    }
}
