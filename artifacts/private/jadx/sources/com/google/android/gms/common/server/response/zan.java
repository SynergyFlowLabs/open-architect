package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "FieldMappingDictionaryCreator")
@a0
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f106881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f106882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRootClassName", id = 3)
    private final String f106883c;

    @SafeParcelable.b
    zan(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ArrayList arrayList, @SafeParcelable.e(id = 3) String str) {
        this.f106881a = i10;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zal zalVar = (zal) arrayList.get(i11);
            String str2 = zalVar.f106876b;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) w.r(zalVar.f106877c)).size();
            for (int i12 = 0; i12 < size2; i12++) {
                zam zamVar = (zam) zalVar.f106877c.get(i12);
                map2.put(zamVar.f106879b, zamVar.f106880c);
            }
            map.put(str2, map2);
        }
        this.f106882b = map;
        this.f106883c = (String) w.r(str);
        e2();
    }

    public final String O1() {
        return this.f106883c;
    }

    @p0
    public final Map T1(String str) {
        return (Map) this.f106882b.get(str);
    }

    public final void b2() {
        for (String str : this.f106882b.keySet()) {
            Map map = (Map) this.f106882b.get(str);
            HashMap map2 = new HashMap();
            for (String str2 : map.keySet()) {
                map2.put(str2, ((FastJsonResponse.Field) map.get(str2)).W2());
            }
            this.f106882b.put(str, map2);
        }
    }

    public final void e2() {
        Iterator it = this.f106882b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f106882b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map.get((String) it2.next())).G3(this);
            }
        }
    }

    public final void f2(Class cls, Map map) {
        this.f106882b.put((String) w.r(cls.getCanonicalName()), map);
    }

    public final boolean n2(Class cls) {
        return this.f106882b.containsKey(w.r(cls.getCanonicalName()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : this.f106882b.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) this.f106882b.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, this.f106881a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f106882b.keySet()) {
            arrayList.add(new zal(str, (Map) this.f106882b.get(str)));
        }
        i6.b.d0(parcel, 2, arrayList, false);
        int i11 = 0 << 3;
        i6.b.Y(parcel, 3, this.f106883c, false);
        i6.b.b(parcel, iA);
    }

    public zan(Class cls) {
        this.f106881a = 1;
        this.f106882b = new HashMap();
        this.f106883c = (String) w.r(cls.getCanonicalName());
    }
}
