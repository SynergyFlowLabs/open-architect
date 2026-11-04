package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class f1 extends com.google.android.gms.dynamic.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f1 f106543c = new f1();

    private f1() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) throws com.google.android.gms.dynamic.h.a {
        f1 f1Var = f106543c;
        try {
            return (View) com.google.android.gms.dynamic.f.n(((v0) f1Var.b(context)).s(com.google.android.gms.dynamic.f.p(context), new zax(1, i10, i11, null)));
        } catch (Exception e10) {
            throw new com.google.android.gms.dynamic.h.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    @Override // com.google.android.gms.dynamic.h
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return iInterfaceQueryLocalInterface instanceof v0 ? (v0) iInterfaceQueryLocalInterface : new v0(iBinder);
    }
}
