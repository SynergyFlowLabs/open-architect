package com.google.android.gms.cloudmessaging;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends ClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z10) throws ClassNotFoundException {
        return Objects.equals(str, "com.google.android.gms.iid.MessengerCompat") ? zzd.class : super.loadClass(str, z10);
    }
}
