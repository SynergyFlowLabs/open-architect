package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.util.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.a(creator = "SafeParcelResponseCreator")
@g6.a
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @NonNull
    @g6.a
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SafeParcelable.h(getter = "getVersionCode", id = 1)
    private final int f106848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getParcel", id = 2)
    private final Parcel f106849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFieldMappingDictionary", id = 3)
    private final zan f106851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final String f106852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f106853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f106854g;

    @SafeParcelable.b
    SafeParcelResponse(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) Parcel parcel, @SafeParcelable.e(id = 3) zan zanVar) {
        this.f106848a = i10;
        this.f106849b = (Parcel) w.r(parcel);
        this.f106850c = 2;
        this.f106851d = zanVar;
        this.f106852e = zanVar == null ? null : zanVar.O1();
        this.f106853f = 2;
    }

    @NonNull
    @g6.a
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse Z(@NonNull T t10) {
        String str = (String) w.r(t10.getClass().getCanonicalName());
        zan zanVar = new zan(t10.getClass());
        b0(zanVar, t10);
        zanVar.b2();
        zanVar.e2();
        return new SafeParcelResponse(t10, zanVar, str);
    }

    private static void b0(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.n2(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> mapC = fastJsonResponse.c();
        zanVar.f2(cls, mapC);
        Iterator<String> it = mapC.keySet().iterator();
        while (it.hasNext()) {
            FastJsonResponse.Field<?, ?> field = mapC.get(it.next());
            Class cls2 = field.f106844h;
            if (cls2 != null) {
                try {
                    b0(zanVar, (FastJsonResponse) cls2.newInstance());
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException("Could not access object of type ".concat(String.valueOf(((Class) w.r(field.f106844h)).getCanonicalName())), e10);
                } catch (InstantiationException e11) {
                    throw new IllegalStateException("Could not instantiate an object of type ".concat(String.valueOf(((Class) w.r(field.f106844h)).getCanonicalName())), e11);
                }
            }
        }
    }

    private final void c0(FastJsonResponse.Field field) {
        if (field.f106843g == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f106849b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f106853f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f106854g = i6.b.a(parcel);
            this.f106853f = 1;
        }
    }

    private final void d0(StringBuilder sb2, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).B2(), entry);
        }
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int iI0 = i6.a.i0(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(i6.a.O(iX));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (field.I3()) {
                    int i10 = field.f106840d;
                    switch (i10) {
                        case 0:
                            f0(sb2, field, FastJsonResponse.s(field, Integer.valueOf(i6.a.Z(parcel, iX))));
                            break;
                        case 1:
                            f0(sb2, field, FastJsonResponse.s(field, i6.a.c(parcel, iX)));
                            break;
                        case 2:
                            f0(sb2, field, FastJsonResponse.s(field, Long.valueOf(i6.a.c0(parcel, iX))));
                            break;
                        case 3:
                            f0(sb2, field, FastJsonResponse.s(field, Float.valueOf(i6.a.V(parcel, iX))));
                            break;
                        case 4:
                            f0(sb2, field, FastJsonResponse.s(field, Double.valueOf(i6.a.T(parcel, iX))));
                            break;
                        case 5:
                            f0(sb2, field, FastJsonResponse.s(field, i6.a.a(parcel, iX)));
                            break;
                        case 6:
                            f0(sb2, field, FastJsonResponse.s(field, Boolean.valueOf(i6.a.P(parcel, iX))));
                            break;
                        case 7:
                            f0(sb2, field, FastJsonResponse.s(field, i6.a.G(parcel, iX)));
                            break;
                        case 8:
                        case 9:
                            f0(sb2, field, FastJsonResponse.s(field, i6.a.h(parcel, iX)));
                            break;
                        case 10:
                            Bundle bundleG = i6.a.g(parcel, iX);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleG.keySet()) {
                                map2.put(str2, (String) w.r(bundleG.getString(str2)));
                            }
                            f0(sb2, field, FastJsonResponse.s(field, map2));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else if (field.f106841e) {
                    sb2.append("[");
                    switch (field.f106840d) {
                        case 0:
                            com.google.android.gms.common.util.b.l(sb2, i6.a.u(parcel, iX));
                            break;
                        case 1:
                            com.google.android.gms.common.util.b.n(sb2, i6.a.d(parcel, iX));
                            break;
                        case 2:
                            com.google.android.gms.common.util.b.m(sb2, i6.a.w(parcel, iX));
                            break;
                        case 3:
                            com.google.android.gms.common.util.b.k(sb2, i6.a.o(parcel, iX));
                            break;
                        case 4:
                            com.google.android.gms.common.util.b.j(sb2, i6.a.l(parcel, iX));
                            break;
                        case 5:
                            com.google.android.gms.common.util.b.n(sb2, i6.a.b(parcel, iX));
                            break;
                        case 6:
                            com.google.android.gms.common.util.b.o(sb2, i6.a.e(parcel, iX));
                            break;
                        case 7:
                            com.google.android.gms.common.util.b.p(sb2, i6.a.H(parcel, iX));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] parcelArrZ = i6.a.z(parcel, iX);
                            int length = parcelArrZ.length;
                            for (int i11 = 0; i11 < length; i11++) {
                                if (i11 > 0) {
                                    sb2.append(",");
                                }
                                parcelArrZ[i11].setDataPosition(0);
                                d0(sb2, field.F3(), parcelArrZ[i11]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (field.f106840d) {
                        case 0:
                            sb2.append(i6.a.Z(parcel, iX));
                            break;
                        case 1:
                            sb2.append(i6.a.c(parcel, iX));
                            break;
                        case 2:
                            sb2.append(i6.a.c0(parcel, iX));
                            break;
                        case 3:
                            sb2.append(i6.a.V(parcel, iX));
                            break;
                        case 4:
                            sb2.append(i6.a.T(parcel, iX));
                            break;
                        case 5:
                            sb2.append(i6.a.a(parcel, iX));
                            break;
                        case 6:
                            sb2.append(i6.a.P(parcel, iX));
                            break;
                        case 7:
                            String strG = i6.a.G(parcel, iX);
                            sb2.append("\"");
                            sb2.append(r.b(strG));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] bArrH = i6.a.h(parcel, iX);
                            sb2.append("\"");
                            sb2.append(com.google.android.gms.common.util.c.d(bArrH));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] bArrH2 = i6.a.h(parcel, iX);
                            sb2.append("\"");
                            sb2.append(com.google.android.gms.common.util.c.e(bArrH2));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle bundleG2 = i6.a.g(parcel, iX);
                            Set<String> setKeySet = bundleG2.keySet();
                            sb2.append("{");
                            boolean z11 = true;
                            for (String str3 : setKeySet) {
                                if (!z11) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(str3);
                                sb2.append("\":\"");
                                sb2.append(r.b(bundleG2.getString(str3)));
                                sb2.append("\"");
                                z11 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            Parcel parcelY = i6.a.y(parcel, iX);
                            parcelY.setDataPosition(0);
                            d0(sb2, field.F3(), parcelY);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == iI0) {
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return;
        }
        throw new i6.a.C1923a("Overread allowed size end=" + iI0, parcel);
    }

    private static final void e0(StringBuilder sb2, int i10, @p0 Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(r.b(w.r(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(com.google.android.gms.common.util.c.d((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(com.google.android.gms.common.util.c.e((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                s.a(sb2, (HashMap) w.r(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    private static final void f0(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        if (!field.f106839c) {
            e0(sb2, field.f106838b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            e0(sb2, field.f106838b, arrayList.get(i10));
        }
        sb2.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void B(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 BigInteger bigInteger) {
        c0(field);
        i6.b.e(this.f106849b, field.B2(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void D(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        i6.b.f(this.f106849b, field.B2(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void G(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        i6.b.h(this.f106849b, field.B2(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void J(@NonNull FastJsonResponse.Field field, @NonNull String str, double d10) {
        c0(field);
        i6.b.r(this.f106849b, field.B2(), d10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void L(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        i6.b.s(this.f106849b, field.B2(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void N(@NonNull FastJsonResponse.Field field, @NonNull String str, float f10) {
        c0(field);
        i6.b.w(this.f106849b, field.B2(), f10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void P(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        i6.b.x(this.f106849b, field.B2(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void S(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        i6.b.G(this.f106849b, field.B2(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void W(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        i6.b.L(this.f106849b, field.B2(), jArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void a(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList<T> arrayList) {
        c0(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) w.r(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i10)).a0());
        }
        i6.b.Q(this.f106849b, field.B2(), arrayList2, true);
    }

    @NonNull
    public final Parcel a0() {
        int i10 = this.f106853f;
        if (i10 == 0) {
            int iA = i6.b.a(this.f106849b);
            this.f106854g = iA;
            i6.b.b(this.f106849b, iA);
            this.f106853f = 2;
        } else if (i10 == 1) {
            i6.b.b(this.f106849b, this.f106854g);
            this.f106853f = 2;
        }
        return this.f106849b;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void b(@NonNull FastJsonResponse.Field field, @NonNull String str, @NonNull T t10) {
        c0(field);
        i6.b.O(this.f106849b, field.B2(), ((SafeParcelResponse) t10).a0(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @p0
    public final Map<String, FastJsonResponse.Field<?, ?>> c() {
        zan zanVar = this.f106851d;
        if (zanVar == null) {
            return null;
        }
        return zanVar.T1((String) w.r(this.f106852e));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final Object f(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean h(@NonNull String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void i(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, boolean z10) {
        c0(field);
        i6.b.g(this.f106849b, field.B2(), z10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void j(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @p0 byte[] bArr) {
        c0(field);
        i6.b.m(this.f106849b, field.B2(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void k(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, int i10) {
        c0(field);
        i6.b.F(this.f106849b, field.B2(), i10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void l(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, long j10) {
        c0(field);
        i6.b.K(this.f106849b, field.B2(), j10);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void m(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @p0 String str2) {
        c0(field);
        i6.b.Y(this.f106849b, field.B2(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void n(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @p0 Map<String, String> map) {
        c0(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) w.r(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        i6.b.k(this.f106849b, field.B2(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void o(@NonNull FastJsonResponse.Field<?, ?> field, @NonNull String str, @p0 ArrayList<String> arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        i6.b.Z(this.f106849b, field.B2(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @NonNull
    public final String toString() {
        w.s(this.f106851d, "Cannot convert to JSON on client side.");
        Parcel parcelA0 = a0();
        parcelA0.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        d0(sb2, (Map) w.r(this.f106851d.T1((String) w.r(this.f106852e))), parcelA0);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        zan zanVar;
        int i11 = this.f106848a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.O(parcel, 2, a0(), false);
        int i12 = this.f106850c;
        if (i12 != 0) {
            zanVar = i12 != 1 ? this.f106851d : this.f106851d;
        } else {
            zanVar = null;
        }
        i6.b.S(parcel, 3, zanVar, i10, false);
        i6.b.b(parcel, iA);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void x(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 BigDecimal bigDecimal) {
        c0(field);
        boolean z10 = !false;
        i6.b.c(this.f106849b, field.B2(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void z(@NonNull FastJsonResponse.Field field, @NonNull String str, @p0 ArrayList arrayList) {
        c0(field);
        int size = ((ArrayList) w.r(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        i6.b.d(this.f106849b, field.B2(), bigDecimalArr, true);
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.f106848a = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.f106849b = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.f106850c = 1;
        this.f106851d = (zan) w.r(zanVar);
        this.f106852e = (String) w.r(str);
        this.f106853f = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.f106848a = 1;
        this.f106849b = Parcel.obtain();
        this.f106850c = 0;
        this.f106851d = (zan) w.r(zanVar);
        this.f106852e = (String) w.r(str);
        this.f106853f = 0;
    }
}
