package com.planner5d.library.services.backgroundexecutor;

import android.os.Parcel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f224017a;

    public e(Parcel parcel) {
        this(parcel == null ? 0L : parcel.readLong());
    }

    public void a(Parcel parcel) {
        parcel.writeLong(this.f224017a);
    }

    public e(long id2) {
        this.f224017a = id2;
    }
}
