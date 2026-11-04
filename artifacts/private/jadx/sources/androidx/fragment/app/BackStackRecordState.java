package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f51599o = "FragmentManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f51600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<String> f51601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f51602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f51603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f51604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f51605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f51606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f51607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final CharSequence f51608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f51609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CharSequence f51610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final ArrayList<String> f51611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ArrayList<String> f51612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f51613n;

    class a implements Parcelable.Creator<BackStackRecordState> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.f51989c.size();
        this.f51600a = new int[size * 6];
        if (!aVar.f51995i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f51601b = new ArrayList<>(size);
        this.f51602c = new int[size];
        this.f51603d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            t0.a aVar2 = aVar.f51989c.get(i11);
            int i12 = i10 + 1;
            this.f51600a[i10] = aVar2.f52006a;
            ArrayList<String> arrayList = this.f51601b;
            Fragment fragment = aVar2.f52007b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f51600a;
            iArr[i12] = aVar2.f52008c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f52009d;
            iArr[i10 + 3] = aVar2.f52010e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f52011f;
            i10 += 6;
            iArr[i13] = aVar2.f52012g;
            this.f51602c[i11] = aVar2.f52013h.ordinal();
            this.f51603d[i11] = aVar2.f52014i.ordinal();
        }
        this.f51604e = aVar.f51994h;
        this.f51605f = aVar.f51997k;
        this.f51606g = aVar.P;
        this.f51607h = aVar.f51998l;
        this.f51608i = aVar.f51999m;
        this.f51609j = aVar.f52000n;
        this.f51610k = aVar.f52001o;
        this.f51611l = aVar.f52002p;
        this.f51612m = aVar.f52003q;
        this.f51613n = aVar.f52004r;
    }

    private void a(@NonNull androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f51600a.length) {
                aVar.f51994h = this.f51604e;
                aVar.f51997k = this.f51605f;
                aVar.f51995i = true;
                aVar.f51998l = this.f51607h;
                aVar.f51999m = this.f51608i;
                aVar.f52000n = this.f51609j;
                aVar.f52001o = this.f51610k;
                aVar.f52002p = this.f51611l;
                aVar.f52003q = this.f51612m;
                aVar.f52004r = this.f51613n;
                return;
            }
            t0.a aVar2 = new t0.a();
            int i12 = i10 + 1;
            aVar2.f52006a = this.f51600a[i10];
            int i13 = 7 ^ 2;
            if (FragmentManager.b1(2)) {
                Objects.toString(aVar);
                int i14 = this.f51600a[i12];
            }
            aVar2.f52013h = androidx.lifecycle.c0.b.values()[this.f51602c[i11]];
            aVar2.f52014i = androidx.lifecycle.c0.b.values()[this.f51603d[i11]];
            int[] iArr = this.f51600a;
            int i15 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f52008c = z10;
            int i16 = iArr[i15];
            aVar2.f52009d = i16;
            int i17 = iArr[i10 + 3];
            aVar2.f52010e = i17;
            int i18 = i10 + 5;
            int i19 = iArr[i10 + 4];
            aVar2.f52011f = i19;
            i10 += 6;
            int i20 = iArr[i18];
            aVar2.f52012g = i20;
            aVar.f51990d = i16;
            aVar.f51991e = i17;
            aVar.f51992f = i19;
            aVar.f51993g = i20;
            aVar.i(aVar2);
            i11++;
        }
    }

    @NonNull
    public androidx.fragment.app.a b(@NonNull FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.P = this.f51606g;
        for (int i10 = 0; i10 < this.f51601b.size(); i10++) {
            String str = this.f51601b.get(i10);
            if (str != null) {
                aVar.f51989c.get(i10).f52007b = fragmentManager.s0(str);
            }
        }
        aVar.R(1);
        return aVar;
    }

    @NonNull
    public androidx.fragment.app.a c(@NonNull FragmentManager fragmentManager, @NonNull Map<String, Fragment> map) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        for (int i10 = 0; i10 < this.f51601b.size(); i10++) {
            String str = this.f51601b.get(i10);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f51605f + " failed due to missing saved state for Fragment (" + str + ")");
                }
                aVar.f51989c.get(i10).f52007b = fragment;
            }
        }
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f51600a);
        parcel.writeStringList(this.f51601b);
        parcel.writeIntArray(this.f51602c);
        parcel.writeIntArray(this.f51603d);
        parcel.writeInt(this.f51604e);
        parcel.writeString(this.f51605f);
        parcel.writeInt(this.f51606g);
        parcel.writeInt(this.f51607h);
        TextUtils.writeToParcel(this.f51608i, parcel, 0);
        parcel.writeInt(this.f51609j);
        TextUtils.writeToParcel(this.f51610k, parcel, 0);
        parcel.writeStringList(this.f51611l);
        parcel.writeStringList(this.f51612m);
        parcel.writeInt(this.f51613n ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f51600a = parcel.createIntArray();
        this.f51601b = parcel.createStringArrayList();
        this.f51602c = parcel.createIntArray();
        this.f51603d = parcel.createIntArray();
        this.f51604e = parcel.readInt();
        this.f51605f = parcel.readString();
        this.f51606g = parcel.readInt();
        this.f51607h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f51608i = (CharSequence) creator.createFromParcel(parcel);
        this.f51609j = parcel.readInt();
        this.f51610k = (CharSequence) creator.createFromParcel(parcel);
        this.f51611l = parcel.createStringArrayList();
        this.f51612m = parcel.createStringArrayList();
        this.f51613n = parcel.readInt() != 0;
    }
}
