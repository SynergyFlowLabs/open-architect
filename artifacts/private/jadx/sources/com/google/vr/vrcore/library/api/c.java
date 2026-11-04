package com.google.vr.vrcore.library.api;

import android.os.IBinder;
import android.os.IInterface;
import com.google.vr.sdk.deps.b0;

/* JADX INFO: loaded from: classes5.dex */
public interface c extends IInterface {

    public static abstract class a extends b0 implements c {

        /* JADX INFO: renamed from: com.google.vr.vrcore.library.api.c$a$a, reason: collision with other inner class name */
        public static class C1422a extends com.google.vr.sdk.deps.a implements c {
            C1422a(IBinder iBinder) {
                super(iBinder, "com.google.vr.vrcore.library.api.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.vr.vrcore.library.api.IObjectWrapper");
        }

        public static c p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new C1422a(iBinder);
        }
    }
}
