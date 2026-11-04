package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class ControllerEventPacket2 extends ControllerEventPacket {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f129986m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f129988o;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f129990t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f129991v;
    private static ArrayDeque<ControllerEventPacket2> X = new ArrayDeque<>();
    private static Object Y = new Object();
    public static final Parcelable.Creator<ControllerEventPacket2> CREATOR = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ControllerPositionEvent[] f129987n = new ControllerPositionEvent[16];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ControllerBatteryEvent f129989s = new ControllerBatteryEvent();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ControllerTrackingStatusEvent[] f129992w = new ControllerTrackingStatusEvent[16];

    class a implements Parcelable.Creator<ControllerEventPacket2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerEventPacket2 createFromParcel(Parcel parcel) {
            ControllerEventPacket2 controllerEventPacket2B = ControllerEventPacket2.B();
            controllerEventPacket2B.p(parcel);
            return controllerEventPacket2B;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerEventPacket2[] newArray(int i10) {
            return new ControllerEventPacket2[i10];
        }
    }

    public ControllerEventPacket2() {
        for (int i10 = 0; i10 < 16; i10++) {
            this.f129987n[i10] = new ControllerPositionEvent();
            this.f129992w[i10] = new ControllerTrackingStatusEvent();
        }
        c();
    }

    public static ControllerEventPacket2 B() {
        ControllerEventPacket2 controllerEventPacket2;
        synchronized (Y) {
            try {
                controllerEventPacket2 = X.isEmpty() ? new ControllerEventPacket2() : X.remove();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return controllerEventPacket2;
    }

    public static long w() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public final boolean A() {
        return this.f129988o;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    protected final int a() {
        int iA = super.a() + 8;
        for (int i10 = 0; i10 < this.f129986m; i10++) {
            iA += this.f129987n[i10].a();
        }
        int iA2 = iA + 4;
        if (this.f129988o) {
            iA2 += this.f129989s.a();
        }
        int iA3 = iA2 + 12;
        for (int i11 = 0; i11 < this.f129991v; i11++) {
            iA3 += this.f129992w[i11].a();
        }
        return iA3;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void c() {
        super.c();
        this.f129986m = 0;
        this.f129991v = 0;
        this.f129988o = false;
        this.f129990t = 0L;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void p(Parcel parcel) {
        int iDataPosition = parcel.dataPosition() + parcel.readInt();
        super.p(parcel);
        if (parcel.dataPosition() < iDataPosition) {
            int i10 = parcel.readInt();
            this.f129986m = i10;
            b(i10);
            for (int i11 = 0; i11 < this.f129986m; i11++) {
                this.f129987n[i11].b(parcel);
            }
        }
        if (parcel.dataPosition() < iDataPosition) {
            boolean z10 = parcel.readInt() != 0;
            this.f129988o = z10;
            if (z10) {
                this.f129989s.b(parcel);
            }
        }
        if (parcel.dataPosition() < iDataPosition) {
            this.f129990t = parcel.readLong();
        }
        if (parcel.dataPosition() < iDataPosition) {
            int i12 = parcel.readInt();
            this.f129991v = i12;
            b(i12);
            for (int i13 = 0; i13 < this.f129991v; i13++) {
                this.f129992w[i13].b(parcel);
            }
        }
        parcel.setDataPosition(iDataPosition);
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void q() {
        c();
        synchronized (Y) {
            try {
                if (!X.contains(this)) {
                    X.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket
    public final void s(int i10) {
        super.s(i10);
        ControllerEventPacket.r(i10, this.f129986m, this.f129987n);
        this.f129989s.f129973b = i10;
        ControllerEventPacket.r(i10, this.f129991v, this.f129992w);
    }

    public final ControllerBatteryEvent t() {
        if (this.f129988o) {
            return this.f129989s;
        }
        throw new IllegalStateException("ControllerEventPacket doesn't have a battery event.");
    }

    public final ControllerPositionEvent u(int i10) {
        if (i10 < 0 || i10 >= this.f129986m) {
            throw new IndexOutOfBoundsException();
        }
        return this.f129987n[i10];
    }

    public final int v() {
        return this.f129986m;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEventPacket, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        int iA = a();
        parcel.writeInt(iA);
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f129986m);
        for (int i11 = 0; i11 < this.f129986m; i11++) {
            this.f129987n[i11].writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f129988o ? 1 : 0);
        if (this.f129988o) {
            this.f129989s.writeToParcel(parcel, i10);
        }
        parcel.writeLong(this.f129990t);
        parcel.writeInt(this.f129991v);
        for (int i12 = 0; i12 < this.f129991v; i12++) {
            this.f129992w[i12].writeToParcel(parcel, i10);
        }
        if (parcel.dataPosition() - iDataPosition != iA) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    public final long x() {
        return this.f129990t;
    }

    public final ControllerTrackingStatusEvent y(int i10) {
        if (i10 < 0 || i10 >= this.f129991v) {
            throw new IndexOutOfBoundsException();
        }
        return this.f129992w[i10];
    }

    public final int z() {
        return this.f129991v;
    }
}
