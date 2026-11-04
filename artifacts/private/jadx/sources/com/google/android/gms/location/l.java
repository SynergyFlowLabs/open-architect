package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.location.zzek;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @h.b
    private final int f109674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final List f109675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final Location f109676d;

    private l(int i10, @h.b int i11, @androidx.annotation.p0 List list, @androidx.annotation.p0 Location location) {
        this.f109673a = i10;
        this.f109674b = i11;
        this.f109675c = list;
        this.f109676d = location;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @androidx.annotation.p0
    public static l a(@NonNull Intent intent) {
        ArrayList arrayList;
        if (intent != null) {
            int intExtra = intent.getIntExtra(com.google.android.gms.common.internal.i.f106575a, -1);
            int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
            if (intExtra2 == -1) {
                intExtra2 = -1;
            } else if (intExtra2 != 1 && intExtra2 != 2) {
                if (intExtra2 == 4) {
                    intExtra2 = 4;
                } else {
                    intExtra2 = -1;
                }
            }
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    byte[] bArr = (byte[]) arrayList2.get(i10);
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArr, 0, bArr.length);
                    parcelObtain.setDataPosition(0);
                    zzek zzekVarCreateFromParcel = zzek.CREATOR.createFromParcel(parcelObtain);
                    parcelObtain.recycle();
                    arrayList.add(zzekVarCreateFromParcel);
                }
            }
            Location location = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if (arrayList != null || intExtra != -1) {
                return new l(intExtra, intExtra2, arrayList, location);
            }
        }
        return null;
    }

    public int b() {
        return this.f109673a;
    }

    @h.b
    public int c() {
        return this.f109674b;
    }

    @androidx.annotation.p0
    public List<h> d() {
        return this.f109675c;
    }

    @androidx.annotation.p0
    public Location e() {
        return this.f109676d;
    }

    public boolean f() {
        return this.f109673a != -1;
    }
}
