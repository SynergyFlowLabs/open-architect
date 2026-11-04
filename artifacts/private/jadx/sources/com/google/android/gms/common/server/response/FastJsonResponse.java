package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.r;
import com.google.android.gms.common.util.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@a0
@g6.a
public abstract class FastJsonResponse {

    @a0
    public interface a<I, O> {
        @NonNull
        Object H0(@NonNull Object obj);

        int c();

        int l();

        @p0
        Object o1(@NonNull Object obj);
    }

    @NonNull
    protected static final Object s(@NonNull Field field, @p0 Object obj) {
        return field.f106847k != null ? field.t3(obj) : obj;
    }

    private final void t(Field field, @p0 Object obj) {
        int i10 = field.f106840d;
        Object objR3 = field.r3(obj);
        String str = field.f106842f;
        switch (i10) {
            case 0:
                if (objR3 != null) {
                    k(field, str, ((Integer) objR3).intValue());
                    return;
                } else {
                    v(str);
                    return;
                }
            case 1:
                B(field, str, (BigInteger) objR3);
                return;
            case 2:
                if (objR3 != null) {
                    l(field, str, ((Long) objR3).longValue());
                    return;
                } else {
                    v(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
            case 4:
                if (objR3 != null) {
                    J(field, str, ((Double) objR3).doubleValue());
                    return;
                } else {
                    v(str);
                    return;
                }
            case 5:
                x(field, str, (BigDecimal) objR3);
                return;
            case 6:
                if (objR3 != null) {
                    i(field, str, ((Boolean) objR3).booleanValue());
                    return;
                } else {
                    v(str);
                    return;
                }
            case 7:
                m(field, str, (String) objR3);
                return;
            case 8:
            case 9:
                if (objR3 != null) {
                    j(field, str, (byte[]) objR3);
                    return;
                } else {
                    v(str);
                    return;
                }
        }
    }

    private static final void u(StringBuilder sb2, Field field, Object obj) {
        int i10 = field.f106838b;
        if (i10 == 11) {
            Class cls = field.f106844h;
            w.r(cls);
            sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i10 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(r.b((String) obj));
            sb2.append("\"");
        }
    }

    private static final void v(String str) {
    }

    public final void A(@NonNull Field field, @p0 BigInteger bigInteger) {
        if (field.f106847k != null) {
            t(field, bigInteger);
        } else {
            B(field, field.f106842f, bigInteger);
        }
    }

    protected void B(@NonNull Field field, @NonNull String str, @p0 BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void C(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            D(field, field.f106842f, arrayList);
        }
    }

    protected void D(@NonNull Field field, @NonNull String str, @p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void E(@NonNull Field field, boolean z10) {
        if (field.f106847k != null) {
            t(field, Boolean.valueOf(z10));
        } else {
            i(field, field.f106842f, z10);
        }
    }

    public final void F(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            G(field, field.f106842f, arrayList);
        }
    }

    protected void G(@NonNull Field field, @NonNull String str, @p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void H(@NonNull Field field, @p0 byte[] bArr) {
        if (field.f106847k != null) {
            t(field, bArr);
        } else {
            j(field, field.f106842f, bArr);
        }
    }

    public final void I(@NonNull Field field, double d10) {
        if (field.f106847k != null) {
            t(field, Double.valueOf(d10));
        } else {
            J(field, field.f106842f, d10);
        }
    }

    protected void J(@NonNull Field field, @NonNull String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void K(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            L(field, field.f106842f, arrayList);
        }
    }

    protected void L(@NonNull Field field, @NonNull String str, @p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void M(@NonNull Field field, float f10) {
        if (field.f106847k != null) {
            t(field, Float.valueOf(f10));
        } else {
            N(field, field.f106842f, f10);
        }
    }

    protected void N(@NonNull Field field, @NonNull String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void O(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            P(field, field.f106842f, arrayList);
        }
    }

    protected void P(@NonNull Field field, @NonNull String str, @p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void Q(@NonNull Field field, int i10) {
        if (field.f106847k != null) {
            t(field, Integer.valueOf(i10));
        } else {
            k(field, field.f106842f, i10);
        }
    }

    public final void R(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            S(field, field.f106842f, arrayList);
        }
    }

    protected void S(@NonNull Field field, @NonNull String str, @p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void U(@NonNull Field field, long j10) {
        if (field.f106847k != null) {
            t(field, Long.valueOf(j10));
        } else {
            l(field, field.f106842f, j10);
        }
    }

    public final void V(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            W(field, field.f106842f, arrayList);
        }
    }

    protected void W(@NonNull Field field, @NonNull String str, @p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    @g6.a
    public <T extends FastJsonResponse> void a(@NonNull Field field, @NonNull String str, @p0 ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @g6.a
    public <T extends FastJsonResponse> void b(@NonNull Field field, @NonNull String str, @NonNull T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @NonNull
    @g6.a
    public abstract Map<String, Field<?, ?>> c();

    @p0
    @g6.a
    protected Object e(@NonNull Field field) {
        String str = field.f106842f;
        if (field.f106844h == null) {
            return f(str);
        }
        w.z(f(str) == null, "Concrete field shouldn't be value object: %s", field.f106842f);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @p0
    @g6.a
    protected abstract Object f(@NonNull String str);

    @g6.a
    protected boolean g(@NonNull Field field) {
        if (field.f106840d != 11) {
            return h(field.f106842f);
        }
        if (field.f106841e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @g6.a
    protected abstract boolean h(@NonNull String str);

    @g6.a
    protected void i(@NonNull Field<?, ?> field, @NonNull String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @g6.a
    protected void j(@NonNull Field<?, ?> field, @NonNull String str, @p0 byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @g6.a
    protected void k(@NonNull Field<?, ?> field, @NonNull String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @g6.a
    protected void l(@NonNull Field<?, ?> field, @NonNull String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @g6.a
    protected void m(@NonNull Field<?, ?> field, @NonNull String str, @p0 String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @g6.a
    protected void n(@NonNull Field<?, ?> field, @NonNull String str, @p0 Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @g6.a
    protected void o(@NonNull Field<?, ?> field, @NonNull String str, @p0 ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public final void p(@NonNull Field field, @p0 String str) {
        if (field.f106847k != null) {
            t(field, str);
        } else {
            m(field, field.f106842f, str);
        }
    }

    public final void q(@NonNull Field field, @p0 Map map) {
        if (field.f106847k != null) {
            t(field, map);
        } else {
            n(field, field.f106842f, map);
        }
    }

    public final void r(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            o(field, field.f106842f, arrayList);
        }
    }

    @NonNull
    @g6.a
    public String toString() {
        Map<String, Field<?, ?>> mapC = c();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : mapC.keySet()) {
            Field<?, ?> field = mapC.get(str);
            if (g(field)) {
                Object objS = s(field, e(field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (objS != null) {
                    switch (field.f106840d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(com.google.android.gms.common.util.c.d((byte[]) objS));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(com.google.android.gms.common.util.c.e((byte[]) objS));
                            sb2.append("\"");
                            break;
                        case 10:
                            s.a(sb2, (HashMap) objS);
                            break;
                        default:
                            if (field.f106839c) {
                                ArrayList arrayList = (ArrayList) objS;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        u(sb2, field, obj);
                                    }
                                }
                                sb2.append("]");
                            } else {
                                u(sb2, field, objS);
                            }
                            break;
                    }
                } else {
                    sb2.append(AbstractJsonLexerKt.NULL);
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }

    public final void w(@NonNull Field field, @p0 BigDecimal bigDecimal) {
        if (field.f106847k != null) {
            t(field, bigDecimal);
        } else {
            x(field, field.f106842f, bigDecimal);
        }
    }

    protected void x(@NonNull Field field, @NonNull String str, @p0 BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void y(@NonNull Field field, @p0 ArrayList arrayList) {
        if (field.f106847k != null) {
            t(field, arrayList);
        } else {
            z(field, field.f106842f, arrayList);
        }
    }

    protected void z(@NonNull Field field, @NonNull String str, @p0 ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    @g6.a
    @SafeParcelable.a(creator = "FieldCreator")
    @a0
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final k CREATOR = new k();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SafeParcelable.h(getter = "getVersionCode", id = 1)
        private final int f106837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SafeParcelable.c(getter = "getTypeIn", id = 2)
        protected final int f106838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SafeParcelable.c(getter = "isTypeInArray", id = 3)
        protected final boolean f106839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SafeParcelable.c(getter = "getTypeOut", id = 4)
        protected final int f106840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SafeParcelable.c(getter = "isTypeOutArray", id = 5)
        protected final boolean f106841e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        @SafeParcelable.c(getter = "getOutputFieldName", id = 6)
        protected final String f106842f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @SafeParcelable.c(getter = "getSafeParcelableFieldId", id = 7)
        protected final int f106843g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        protected final Class f106844h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @SafeParcelable.c(getter = "getConcreteTypeName", id = 8)
        @p0
        protected final String f106845i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private zan f106846j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @SafeParcelable.c(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        @p0
        private final a f106847k;

        @SafeParcelable.b
        Field(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) boolean z10, @SafeParcelable.e(id = 4) int i12, @SafeParcelable.e(id = 5) boolean z11, @SafeParcelable.e(id = 6) String str, @SafeParcelable.e(id = 7) int i13, @SafeParcelable.e(id = 8) @p0 String str2, @SafeParcelable.e(id = 9) @p0 zaa zaaVar) {
            this.f106837a = i10;
            this.f106838b = i11;
            this.f106839c = z10;
            this.f106840d = i12;
            this.f106841e = z11;
            this.f106842f = str;
            this.f106843g = i13;
            if (str2 == null) {
                this.f106844h = null;
                this.f106845i = null;
            } else {
                this.f106844h = SafeParcelResponse.class;
                this.f106845i = str2;
            }
            if (zaaVar == null) {
                this.f106847k = null;
            } else {
                this.f106847k = zaaVar.T1();
            }
        }

        @NonNull
        @g6.a
        public static Field D2(@NonNull String str, int i10, @NonNull a<?, ?> aVar, boolean z10) {
            aVar.c();
            aVar.l();
            return new Field(7, z10, 0, false, str, i10, null, aVar);
        }

        @NonNull
        @g6.a
        public static Field<byte[], byte[]> O1(@NonNull String str, int i10) {
            return new Field<>(8, false, 8, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static Field<Boolean, Boolean> T1(@NonNull String str, int i10) {
            int i11 = 4 << 0;
            return new Field<>(6, false, 6, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static <T extends FastJsonResponse> Field<T, T> b2(@NonNull String str, int i10, @NonNull Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i10, cls, null);
        }

        @NonNull
        @g6.a
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> e2(@NonNull String str, int i10, @NonNull Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i10, cls, null);
        }

        @NonNull
        @g6.a
        public static Field<Double, Double> f2(@NonNull String str, int i10) {
            return new Field<>(4, false, 4, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static Field<Float, Float> n2(@NonNull String str, int i10) {
            return new Field<>(3, false, 3, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static Field<Integer, Integer> p2(@NonNull String str, int i10) {
            return new Field<>(0, false, 0, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static Field<Long, Long> q2(@NonNull String str, int i10) {
            return new Field<>(2, false, 2, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static Field<String, String> s2(@NonNull String str, int i10) {
            int i11 = 0 & 7;
            return new Field<>(7, false, 7, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static Field<HashMap<String, String>, HashMap<String, String>> u2(@NonNull String str, int i10) {
            return new Field<>(10, false, 10, false, str, i10, null, null);
        }

        @NonNull
        @g6.a
        public static Field<ArrayList<String>, ArrayList<String>> z2(@NonNull String str, int i10) {
            return new Field<>(7, true, 7, true, str, i10, null, null);
        }

        @g6.a
        public int B2() {
            return this.f106843g;
        }

        @NonNull
        public final Map F3() {
            w.r(this.f106845i);
            w.r(this.f106846j);
            return (Map) w.r(this.f106846j.T1(this.f106845i));
        }

        public final void G3(zan zanVar) {
            this.f106846j = zanVar;
        }

        public final boolean I3() {
            return this.f106847k != null;
        }

        @p0
        final zaa U2() {
            a aVar = this.f106847k;
            if (aVar == null) {
                return null;
            }
            return zaa.O1(aVar);
        }

        @NonNull
        public final Field W2() {
            return new Field(this.f106837a, this.f106838b, this.f106839c, this.f106840d, this.f106841e, this.f106842f, this.f106843g, this.f106845i, U2());
        }

        @NonNull
        public final FastJsonResponse k3() throws IllegalAccessException, InstantiationException {
            w.r(this.f106844h);
            Class cls = this.f106844h;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            w.r(this.f106845i);
            w.s(this.f106846j, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.f106846j, this.f106845i);
        }

        @NonNull
        public final Object r3(@p0 Object obj) {
            w.r(this.f106847k);
            return w.r(this.f106847k.o1(obj));
        }

        @NonNull
        public final Object t3(@NonNull Object obj) {
            w.r(this.f106847k);
            return this.f106847k.H0(obj);
        }

        @NonNull
        public final String toString() {
            u.a aVarA = u.d(this).a("versionCode", Integer.valueOf(this.f106837a)).a("typeIn", Integer.valueOf(this.f106838b)).a("typeInArray", Boolean.valueOf(this.f106839c)).a("typeOut", Integer.valueOf(this.f106840d)).a("typeOutArray", Boolean.valueOf(this.f106841e)).a("outputFieldName", this.f106842f).a("safeParcelFieldId", Integer.valueOf(this.f106843g)).a("concreteTypeName", w3());
            Class cls = this.f106844h;
            if (cls != null) {
                aVarA.a("concreteType.class", cls.getCanonicalName());
            }
            a aVar = this.f106847k;
            if (aVar != null) {
                aVarA.a("converterName", aVar.getClass().getCanonicalName());
            }
            return aVarA.toString();
        }

        @p0
        final String w3() {
            String str = this.f106845i;
            if (str == null) {
                return null;
            }
            return str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            int i11 = this.f106837a;
            int iA = i6.b.a(parcel);
            i6.b.F(parcel, 1, i11);
            i6.b.F(parcel, 2, this.f106838b);
            i6.b.g(parcel, 3, this.f106839c);
            i6.b.F(parcel, 4, this.f106840d);
            int i12 = 2 & 5;
            i6.b.g(parcel, 5, this.f106841e);
            i6.b.Y(parcel, 6, this.f106842f, false);
            i6.b.F(parcel, 7, B2());
            i6.b.Y(parcel, 8, w3(), false);
            i6.b.S(parcel, 9, U2(), i10, false);
            i6.b.b(parcel, iA);
        }

        protected Field(int i10, boolean z10, int i11, boolean z11, @NonNull String str, int i12, @p0 Class cls, @p0 a aVar) {
            this.f106837a = 1;
            this.f106838b = i10;
            this.f106839c = z10;
            this.f106840d = i11;
            this.f106841e = z11;
            this.f106842f = str;
            this.f106843g = i12;
            this.f106844h = cls;
            if (cls == null) {
                this.f106845i = null;
            } else {
                this.f106845i = cls.getCanonicalName();
            }
            this.f106847k = aVar;
        }
    }
}
