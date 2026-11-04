package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class ControllerEventPacket implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f129976a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f129978c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f129980e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f129982g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f129984i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static ArrayDeque<ControllerEventPacket> f129974k = new ArrayDeque<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f129975l = new Object();
    public static final Parcelable.Creator<ControllerEventPacket> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ControllerAccelEvent[] f129977b = new ControllerAccelEvent[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ControllerButtonEvent[] f129979d = new ControllerButtonEvent[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ControllerGyroEvent[] f129981f = new ControllerGyroEvent[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ControllerOrientationEvent[] f129983h = new ControllerOrientationEvent[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ControllerTouchEvent[] f129985j = new ControllerTouchEvent[16];

    class a implements Parcelable.Creator<ControllerEventPacket> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ControllerEventPacket createFromParcel(Parcel parcel) {
            ControllerEventPacket controllerEventPacketO = ControllerEventPacket.o();
            controllerEventPacketO.p(parcel);
            return controllerEventPacketO;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ControllerEventPacket[] newArray(int i10) {
            return new ControllerEventPacket[i10];
        }
    }

    public ControllerEventPacket() {
        for (int i10 = 0; i10 < 16; i10++) {
            this.f129977b[i10] = new ControllerAccelEvent();
            this.f129979d[i10] = new ControllerButtonEvent();
            this.f129981f[i10] = new ControllerGyroEvent();
            this.f129983h[i10] = new ControllerOrientationEvent();
            this.f129985j[i10] = new ControllerTouchEvent();
        }
        c();
    }

    public static ControllerEventPacket o() {
        ControllerEventPacket controllerEventPacket;
        synchronized (f129975l) {
            try {
                controllerEventPacket = f129974k.isEmpty() ? new ControllerEventPacket() : f129974k.remove();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return controllerEventPacket;
    }

    static void r(int i10, int i11, ControllerEvent[] controllerEventArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            controllerEventArr[i12].f129973b = i10;
        }
    }

    protected int a() {
        int iA = 24;
        for (int i10 = 0; i10 < this.f129976a; i10++) {
            iA += this.f129977b[i10].a();
        }
        for (int i11 = 0; i11 < this.f129978c; i11++) {
            iA += this.f129979d[i11].a();
        }
        for (int i12 = 0; i12 < this.f129980e; i12++) {
            iA += this.f129981f[i12].a();
        }
        for (int i13 = 0; i13 < this.f129982g; i13++) {
            iA += this.f129983h[i13].a();
        }
        for (int i14 = 0; i14 < this.f129984i; i14++) {
            iA += this.f129985j[i14].a();
        }
        return iA;
    }

    protected void b(int i10) {
        if (i10 < 0 || i10 >= 16) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid event count: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public void c() {
        this.f129976a = 0;
        this.f129978c = 0;
        this.f129980e = 0;
        this.f129982g = 0;
        this.f129984i = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ControllerAccelEvent e(int i10) {
        if (i10 < 0 || i10 >= this.f129976a) {
            throw new IndexOutOfBoundsException();
        }
        return this.f129977b[i10];
    }

    public int f() {
        return this.f129976a;
    }

    public ControllerButtonEvent g(int i10) {
        if (i10 < 0 || i10 >= this.f129978c) {
            throw new IndexOutOfBoundsException();
        }
        return this.f129979d[i10];
    }

    public int h() {
        return this.f129978c;
    }

    public ControllerGyroEvent i(int i10) {
        if (i10 < 0 || i10 >= this.f129980e) {
            throw new IndexOutOfBoundsException();
        }
        return this.f129981f[i10];
    }

    public int j() {
        return this.f129980e;
    }

    public ControllerOrientationEvent k(int i10) {
        if (i10 < 0 || i10 >= this.f129982g) {
            throw new IndexOutOfBoundsException();
        }
        return this.f129983h[i10];
    }

    public int l() {
        return this.f129982g;
    }

    public ControllerTouchEvent m(int i10) {
        if (i10 < 0 || i10 >= this.f129984i) {
            throw new IndexOutOfBoundsException();
        }
        return this.f129985j[i10];
    }

    public int n() {
        return this.f129984i;
    }

    public void p(Parcel parcel) {
        parcel.readInt();
        int i10 = parcel.readInt();
        this.f129976a = i10;
        b(i10);
        for (int i11 = 0; i11 < this.f129976a; i11++) {
            this.f129977b[i11].b(parcel);
        }
        int i12 = parcel.readInt();
        this.f129978c = i12;
        b(i12);
        for (int i13 = 0; i13 < this.f129978c; i13++) {
            this.f129979d[i13].b(parcel);
        }
        int i14 = parcel.readInt();
        this.f129980e = i14;
        b(i14);
        for (int i15 = 0; i15 < this.f129980e; i15++) {
            this.f129981f[i15].b(parcel);
        }
        int i16 = parcel.readInt();
        this.f129982g = i16;
        b(i16);
        for (int i17 = 0; i17 < this.f129982g; i17++) {
            this.f129983h[i17].b(parcel);
        }
        int i18 = parcel.readInt();
        this.f129984i = i18;
        b(i18);
        for (int i19 = 0; i19 < this.f129984i; i19++) {
            this.f129985j[i19].b(parcel);
        }
    }

    public void q() {
        c();
        synchronized (f129975l) {
            try {
                if (!f129974k.contains(this)) {
                    f129974k.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(int i10) {
        r(i10, this.f129976a, this.f129977b);
        r(i10, this.f129978c, this.f129979d);
        r(i10, this.f129980e, this.f129981f);
        r(i10, this.f129982g, this.f129983h);
        r(i10, this.f129984i, this.f129985j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(1);
        parcel.writeInt(this.f129976a);
        for (int i11 = 0; i11 < this.f129976a; i11++) {
            this.f129977b[i11].writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f129978c);
        for (int i12 = 0; i12 < this.f129978c; i12++) {
            this.f129979d[i12].writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f129980e);
        for (int i13 = 0; i13 < this.f129980e; i13++) {
            this.f129981f[i13].writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f129982g);
        for (int i14 = 0; i14 < this.f129982g; i14++) {
            this.f129983h[i14].writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f129984i);
        for (int i15 = 0; i15 < this.f129984i; i15++) {
            this.f129985j[i15].writeToParcel(parcel, i10);
        }
    }
}
