package androidx.fragment.app;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 {
    public static final /* synthetic */ <F extends Fragment> t0 a(t0 t0Var, @androidx.annotation.d0 int i10, String str, Bundle bundle) {
        Intrinsics.reifiedOperationMarker(4, "F");
        return t0Var.e(i10, Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends Fragment> t0 b(t0 t0Var, String str, Bundle bundle) {
        Intrinsics.reifiedOperationMarker(4, "F");
        return t0Var.h(Fragment.class, bundle, str);
    }

    public static /* synthetic */ t0 c(t0 t0Var, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.reifiedOperationMarker(4, "F");
        return t0Var.e(i10, Fragment.class, bundle, str);
    }

    public static /* synthetic */ t0 d(t0 t0Var, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        Intrinsics.reifiedOperationMarker(4, "F");
        return t0Var.h(Fragment.class, bundle, str);
    }

    public static final /* synthetic */ <F extends Fragment> t0 e(t0 t0Var, @androidx.annotation.d0 int i10, String str, Bundle bundle) {
        Intrinsics.reifiedOperationMarker(4, "F");
        return t0Var.B(i10, Fragment.class, bundle, str);
    }

    public static /* synthetic */ t0 f(t0 t0Var, int i10, String str, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        Intrinsics.reifiedOperationMarker(4, "F");
        return t0Var.B(i10, Fragment.class, bundle, str);
    }
}
