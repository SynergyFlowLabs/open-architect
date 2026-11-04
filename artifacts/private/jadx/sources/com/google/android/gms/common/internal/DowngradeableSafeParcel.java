package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f106467b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f106468a = false;

    @g6.a
    protected static boolean O1(@NonNull String str) {
        synchronized (f106467b) {
        }
        return true;
    }

    @androidx.annotation.p0
    @g6.a
    protected static Integer T1() {
        synchronized (f106467b) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    @g6.a
    protected abstract boolean b2(int i10);

    @g6.a
    public void e2(boolean z10) {
        this.f106468a = z10;
    }

    @g6.a
    protected boolean f2() {
        return this.f106468a;
    }
}
