package com.planner5d.library.services.backgroundexecutor;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class BackgroundExecutorMessageContainer implements Parcelable {
    public static final Parcelable.Creator<BackgroundExecutorMessageContainer> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f223965c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f223966d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f223967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BackgroundExecutorMessageContainer f223968b = null;

    class a implements Parcelable.Creator<BackgroundExecutorMessageContainer> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackgroundExecutorMessageContainer createFromParcel(Parcel parcel) {
            e dVar;
            int i10 = parcel.readInt();
            if (i10 == 0) {
                dVar = new com.planner5d.library.services.bitmaploader.background.d(parcel);
            } else {
                if (i10 != 1) {
                    throw new RuntimeException("Invalid message");
                }
                dVar = new com.planner5d.library.services.filedownloader.e(parcel);
            }
            return new BackgroundExecutorMessageContainer(dVar);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackgroundExecutorMessageContainer[] newArray(int size) {
            return new BackgroundExecutorMessageContainer[size];
        }
    }

    public BackgroundExecutorMessageContainer(e message) {
        this.f223967a = message;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i10;
        e eVar = this.f223967a;
        if (eVar instanceof com.planner5d.library.services.bitmaploader.background.d) {
            i10 = 0;
        } else {
            if (!(eVar instanceof com.planner5d.library.services.filedownloader.e)) {
                throw new RuntimeException("Invalid message");
            }
            i10 = 1;
        }
        parcel.writeInt(i10);
        this.f223967a.a(parcel);
    }
}
