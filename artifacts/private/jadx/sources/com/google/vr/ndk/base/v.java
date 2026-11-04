package com.google.vr.ndk.base;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f127281a = "GvrLayoutFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f127282b = 17;

    public static com.google.vr.vrcore.library.api.a a(Context context) {
        com.google.vr.vrcore.library.api.a aVarD = d(context);
        if (aVarD != null) {
            return aVarD;
        }
        if (GvrApi.l0()) {
            throw new IllegalStateException("Client shim failed to load GvrLayout from VrCore.");
        }
        return b(context);
    }

    private static com.google.vr.vrcore.library.api.a b(Context context) {
        return new y(new x(context));
    }

    public static com.google.vr.vrcore.library.api.a c(Context context, q qVar) {
        return new y(new x(context, qVar));
    }

    private static com.google.vr.vrcore.library.api.a d(Context context) {
        if (com.google.vr.vrcore.base.api.d.f(context.getPackageName())) {
            return b(context);
        }
        if (context instanceof com.google.vr.cardboard.z) {
            throw new IllegalArgumentException("VrContextWrapper only supported within VrCore.");
        }
        if (!GvrApi.k0(context)) {
            return null;
        }
        Boolean bool = g0.a(context).f119294m;
        if ((bool == null || !bool.booleanValue()) && !GvrApi.l0()) {
            return null;
        }
        try {
            if (com.google.vr.vrcore.base.api.d.d(context) < 17) {
                return null;
            }
            try {
                return com.google.vr.vrcore.library.api.g.c(context).Vb(com.google.vr.vrcore.library.api.f.u(com.google.vr.vrcore.library.api.g.a(context)), com.google.vr.vrcore.library.api.f.u(context));
            } catch (Exception e10) {
                new StringBuilder(String.valueOf(e10).length() + 40);
                return null;
            }
        } catch (com.google.vr.vrcore.base.api.c unused) {
        }
    }
}
