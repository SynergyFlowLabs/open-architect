package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.u;
import com.google.firebase.perf.v1.w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Timer f124078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f124079c;

    class a implements Parcelable.Creator<PerfSession> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PerfSession createFromParcel(@NonNull Parcel parcel) {
            return new PerfSession(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PerfSession[] newArray(int i10) {
            return new PerfSession[i10];
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, a aVar) {
        this(parcel);
    }

    @p0
    public static u[] b(@NonNull List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        u[] uVarArr = new u[list.size()];
        u uVarA = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            u uVarA2 = list.get(i10).a();
            if (z10 || !list.get(i10).h()) {
                uVarArr[i10] = uVarA2;
            } else {
                uVarArr[0] = uVarA2;
                uVarArr[i10] = uVarA;
                z10 = true;
            }
        }
        if (!z10) {
            uVarArr[0] = uVarA;
        }
        return uVarArr;
    }

    public static PerfSession c(@NonNull String str) {
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new com.google.firebase.perf.util.a());
        perfSession.k(l());
        return perfSession;
    }

    @l1
    static boolean i(@NonNull u uVar) {
        Iterator<w> it = uVar.Kh().iterator();
        while (it.hasNext()) {
            if (it.next() == w.GAUGES_AND_SYSTEM_EVENTS) {
                return true;
            }
        }
        return false;
    }

    public static boolean l() {
        com.google.firebase.perf.config.a aVarH = com.google.firebase.perf.config.a.h();
        return aVarH.N() && Math.random() < aVarH.F();
    }

    public u a() {
        u.c cVarSl = u.nm().Sl(this.f124077a);
        if (this.f124079c) {
            cVarSl.Pl(w.GAUGES_AND_SYSTEM_EVENTS);
        }
        return cVarSl.build();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Timer e() {
        return this.f124078b;
    }

    public boolean f() {
        return this.f124079c;
    }

    public boolean g() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f124078b.c()) > com.google.firebase.perf.config.a.h().C();
    }

    public boolean h() {
        return this.f124079c;
    }

    public String j() {
        return this.f124077a;
    }

    public void k(boolean z10) {
        this.f124079c = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f124077a);
        parcel.writeByte(this.f124079c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f124078b, 0);
    }

    @l1(otherwise = 3)
    public PerfSession(String str, com.google.firebase.perf.util.a aVar) {
        this.f124079c = false;
        this.f124077a = str;
        this.f124078b = aVar.a();
    }

    private PerfSession(@NonNull Parcel parcel) {
        this.f124079c = false;
        this.f124077a = parcel.readString();
        this.f124079c = parcel.readByte() != 0;
        this.f124078b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
