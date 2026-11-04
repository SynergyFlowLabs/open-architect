package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 {

    @NotNull
    private static final String A = "long";

    @NotNull
    private static final String B = "long[]";

    @NotNull
    private static final String C = "float";

    @NotNull
    private static final String D = "float[]";

    @NotNull
    private static final String E = "double";

    @NotNull
    private static final String F = "double[]";

    @NotNull
    private static final String G = "char";

    @NotNull
    private static final String H = "char[]";

    @NotNull
    private static final String I = "string";

    @NotNull
    private static final String J = "stringList";

    @NotNull
    private static final String K = "enum";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f101773d = "com.facebook.TokenCachingStrategy.Token";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f101774e = "com.facebook.TokenCachingStrategy.ExpirationDate";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f101775f = "com.facebook.TokenCachingStrategy.LastRefreshDate";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f101776g = "com.facebook.TokenCachingStrategy.AccessTokenSource";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f101777h = "com.facebook.TokenCachingStrategy.Permissions";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f101778i = "com.facebook.TokenCachingStrategy.DeclinedPermissions";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f101779j = "com.facebook.TokenCachingStrategy.ExpiredPermissions";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f101780k = "com.facebook.TokenCachingStrategy.ApplicationId";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f101781l = Long.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f101782m = "com.facebook.TokenCachingStrategy.IsSSO";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f101783n = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final String f101785p = "valueType";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final String f101786q = "value";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final String f101787r = "enumType";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final String f101788s = "bool";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private static final String f101789t = "bool[]";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final String f101790u = "byte";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final String f101791v = "byte[]";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private static final String f101792w = "short";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private static final String f101793x = "short[]";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final String f101794y = "int";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    private static final String f101795z = "int[]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f101796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f101797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f101772c = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f101784o = s0.class.getSimpleName();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j10 = bundle.getLong(str, Long.MIN_VALUE);
            if (j10 == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j10);
        }

        private final void l(Bundle bundle, String str, Date date) {
            bundle.putLong(str, date.getTime());
        }

        @oj.n
        @Nullable
        public final String a(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(s0.f101780k);
        }

        @oj.n
        @Nullable
        public final Date c(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return b(bundle, s0.f101774e);
        }

        @oj.n
        public final long d(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(s0.f101774e);
        }

        @oj.n
        @Nullable
        public final Date e(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return b(bundle, s0.f101775f);
        }

        @oj.n
        public final long f(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(s0.f101775f);
        }

        @oj.n
        @Nullable
        public final Set<String> g(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(s0.f101777h);
            if (stringArrayList == null) {
                return null;
            }
            return new HashSet(stringArrayList);
        }

        @oj.n
        @Nullable
        public final g h(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (bundle.containsKey(s0.f101776g)) {
                return (g) bundle.getSerializable(s0.f101776g);
            }
            return bundle.getBoolean(s0.f101782m) ? g.FACEBOOK_APPLICATION_WEB : g.WEB_VIEW;
        }

        @oj.n
        @Nullable
        public final String i(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(s0.f101773d);
        }

        @oj.n
        public final boolean j(@Nullable Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString(s0.f101773d)) == null || string.length() == 0 || bundle.getLong(s0.f101774e, 0L) == 0) ? false : true;
        }

        @oj.n
        public final void k(@NotNull Bundle bundle, @Nullable String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putString(s0.f101780k, str);
        }

        @oj.n
        public final void m(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(s0.f101778i, new ArrayList<>(value));
        }

        @oj.n
        public final void n(@NotNull Bundle bundle, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            l(bundle, s0.f101774e, value);
        }

        @oj.n
        public final void o(@NotNull Bundle bundle, long j10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(s0.f101774e, j10);
        }

        @oj.n
        public final void p(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(s0.f101779j, new ArrayList<>(value));
        }

        @oj.n
        public final void q(@NotNull Bundle bundle, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            l(bundle, s0.f101775f, value);
        }

        @oj.n
        public final void r(@NotNull Bundle bundle, long j10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(s0.f101775f, j10);
        }

        @oj.n
        public final void s(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(s0.f101777h, new ArrayList<>(value));
        }

        @oj.n
        public final void t(@NotNull Bundle bundle, @NotNull g value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putSerializable(s0.f101776g, value);
        }

        @oj.n
        public final void u(@NotNull Bundle bundle, @NotNull String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(s0.f101773d, value);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public s0(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void b(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.f101797b.getString(str, "{}");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString(f101785p);
        if (string3 != null) {
            int i10 = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals(J)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        if (length > 0) {
                            while (true) {
                                int i11 = i10 + 1;
                                Object obj = jSONArray.get(i10);
                                if (obj == JSONObject.NULL) {
                                    str2 = null;
                                } else {
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    str2 = (String) obj;
                                }
                                arrayList.add(i10, str2);
                                if (i11 < length) {
                                    i10 = i11;
                                }
                            }
                        }
                        bundle.putStringArrayList(str, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals(f101789t)) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        int i12 = length2 - 1;
                        if (i12 >= 0) {
                            while (true) {
                                int i13 = i10 + 1;
                                zArr[i10] = jSONArray2.getBoolean(i10);
                                if (i13 <= i12) {
                                    i10 = i13;
                                }
                            }
                        }
                        bundle.putBooleanArray(str, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals(f101791v)) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        int i14 = length3 - 1;
                        if (i14 >= 0) {
                            while (true) {
                                int i15 = i10 + 1;
                                bArr[i10] = (byte) jSONArray3.getInt(i10);
                                if (i15 <= i14) {
                                    i10 = i15;
                                }
                            }
                        }
                        bundle.putByteArray(str, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals(H)) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        int i16 = length4 - 1;
                        if (i16 >= 0) {
                            int i17 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                String string4 = jSONArray4.getString(i17);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i17] = string4.charAt(0);
                                }
                                if (i18 <= i16) {
                                    i17 = i18;
                                }
                            }
                        }
                        bundle.putCharArray(str, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals(E)) {
                        bundle.putDouble(str, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals(B)) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        int i19 = length5 - 1;
                        if (i19 >= 0) {
                            while (true) {
                                int i20 = i10 + 1;
                                jArr[i10] = jSONArray5.getLong(i10);
                                if (i20 <= i19) {
                                    i10 = i20;
                                }
                            }
                        }
                        bundle.putLongArray(str, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(str, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals(D)) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        int i21 = length6 - 1;
                        if (i21 >= 0) {
                            while (true) {
                                int i22 = i10 + 1;
                                fArr[i10] = (float) jSONArray6.getDouble(i10);
                                if (i22 <= i21) {
                                    i10 = i22;
                                }
                            }
                        }
                        bundle.putFloatArray(str, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals(f101794y)) {
                        bundle.putInt(str, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals(f101788s)) {
                        bundle.putBoolean(str, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals("byte")) {
                        bundle.putByte(str, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals(G) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(str, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals(K)) {
                        try {
                            bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString(f101787r)), jSONObject.getString("value")));
                            return;
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals(A)) {
                        bundle.putLong(str, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals("float")) {
                        bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals(f101795z)) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        int i23 = length7 - 1;
                        if (i23 >= 0) {
                            while (true) {
                                int i24 = i10 + 1;
                                iArr[i10] = jSONArray7.getInt(i10);
                                if (i24 <= i23) {
                                    i10 = i24;
                                }
                            }
                        }
                        bundle.putIntArray(str, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals(f101792w)) {
                        bundle.putShort(str, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals(F)) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        int i25 = length8 - 1;
                        if (i25 >= 0) {
                            while (true) {
                                int i26 = i10 + 1;
                                dArr[i10] = jSONArray8.getDouble(i10);
                                if (i26 <= i25) {
                                    i10 = i26;
                                }
                            }
                        }
                        bundle.putDoubleArray(str, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals(f101793x)) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        int i27 = length9 - 1;
                        if (i27 >= 0) {
                            while (true) {
                                int i28 = i10 + 1;
                                sArr[i10] = (short) jSONArray9.getInt(i10);
                                if (i28 <= i27) {
                                    i10 = i28;
                                }
                            }
                        }
                        bundle.putShortArray(str, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @oj.n
    @Nullable
    public static final String c(@NotNull Bundle bundle) {
        return f101772c.a(bundle);
    }

    @oj.n
    @Nullable
    public static final Date d(@NotNull Bundle bundle) {
        return f101772c.c(bundle);
    }

    @oj.n
    public static final long e(@NotNull Bundle bundle) {
        return f101772c.d(bundle);
    }

    @oj.n
    @Nullable
    public static final Date f(@NotNull Bundle bundle) {
        return f101772c.e(bundle);
    }

    @oj.n
    public static final long g(@NotNull Bundle bundle) {
        return f101772c.f(bundle);
    }

    @oj.n
    @Nullable
    public static final Set<String> h(@NotNull Bundle bundle) {
        return f101772c.g(bundle);
    }

    @oj.n
    @Nullable
    public static final g i(@NotNull Bundle bundle) {
        return f101772c.h(bundle);
    }

    @oj.n
    @Nullable
    public static final String j(@NotNull Bundle bundle) {
        return f101772c.i(bundle);
    }

    @oj.n
    public static final boolean k(@Nullable Bundle bundle) {
        return f101772c.j(bundle);
    }

    @oj.n
    public static final void m(@NotNull Bundle bundle, @Nullable String str) {
        f101772c.k(bundle, str);
    }

    @oj.n
    public static final void n(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        f101772c.m(bundle, collection);
    }

    @oj.n
    public static final void o(@NotNull Bundle bundle, @NotNull Date date) {
        f101772c.n(bundle, date);
    }

    @oj.n
    public static final void p(@NotNull Bundle bundle, long j10) {
        f101772c.o(bundle, j10);
    }

    @oj.n
    public static final void q(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        f101772c.p(bundle, collection);
    }

    @oj.n
    public static final void r(@NotNull Bundle bundle, @NotNull Date date) {
        f101772c.q(bundle, date);
    }

    @oj.n
    public static final void s(@NotNull Bundle bundle, long j10) {
        f101772c.r(bundle, j10);
    }

    @oj.n
    public static final void t(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        f101772c.s(bundle, collection);
    }

    @oj.n
    public static final void u(@NotNull Bundle bundle, @NotNull g gVar) {
        f101772c.t(bundle, gVar);
    }

    @oj.n
    public static final void v(@NotNull Bundle bundle, @NotNull String str) {
        f101772c.u(bundle, str);
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01be  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c7  */
    private final void x(String str, Bundle bundle, SharedPreferences.Editor editor) throws JSONException {
        JSONArray jSONArray;
        String str2;
        Object obj = bundle.get(str);
        if (obj == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str3 = null;
        if (obj instanceof Byte) {
            jSONObject.put("value", (int) ((Number) obj).byteValue());
            str2 = "byte";
        } else if (obj instanceof Short) {
            jSONObject.put("value", (int) ((Number) obj).shortValue());
            str2 = f101792w;
        } else if (obj instanceof Integer) {
            jSONObject.put("value", ((Number) obj).intValue());
            str2 = f101794y;
        } else if (obj instanceof Long) {
            jSONObject.put("value", ((Number) obj).longValue());
            str2 = A;
        } else if (obj instanceof Float) {
            jSONObject.put("value", ((Number) obj).floatValue());
            str2 = "float";
        } else if (obj instanceof Double) {
            jSONObject.put("value", ((Number) obj).doubleValue());
            str2 = E;
        } else if (obj instanceof Boolean) {
            jSONObject.put("value", ((Boolean) obj).booleanValue());
            str2 = f101788s;
        } else if (obj instanceof Character) {
            jSONObject.put("value", obj.toString());
            str2 = G;
        } else {
            if (!(obj instanceof String)) {
                if (obj instanceof Enum) {
                    jSONObject.put("value", obj.toString());
                    jSONObject.put(f101787r, obj.getClass().getName());
                    str2 = K;
                } else {
                    jSONArray = new JSONArray();
                    int i10 = 0;
                    if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        int length = bArr.length;
                        while (i10 < length) {
                            byte b10 = bArr[i10];
                            i10++;
                            jSONArray.put((int) b10);
                        }
                        str3 = f101791v;
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        int length2 = sArr.length;
                        while (i10 < length2) {
                            short s10 = sArr[i10];
                            i10++;
                            jSONArray.put((int) s10);
                        }
                        str3 = f101793x;
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int length3 = iArr.length;
                        while (i10 < length3) {
                            int i11 = iArr[i10];
                            i10++;
                            jSONArray.put(i11);
                        }
                        str3 = f101795z;
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        int length4 = jArr.length;
                        while (i10 < length4) {
                            long j10 = jArr[i10];
                            i10++;
                            jSONArray.put(j10);
                        }
                        str3 = B;
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        int length5 = fArr.length;
                        while (i10 < length5) {
                            float f10 = fArr[i10];
                            i10++;
                            jSONArray.put(f10);
                        }
                        str3 = D;
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        int length6 = dArr.length;
                        while (i10 < length6) {
                            double d10 = dArr[i10];
                            i10++;
                            jSONArray.put(d10);
                        }
                        str3 = F;
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        int length7 = zArr.length;
                        while (i10 < length7) {
                            boolean z10 = zArr[i10];
                            i10++;
                            jSONArray.put(z10);
                        }
                        str3 = f101789t;
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        int length8 = cArr.length;
                        while (i10 < length8) {
                            char c10 = cArr[i10];
                            i10++;
                            jSONArray.put(String.valueOf(c10));
                        }
                        str3 = H;
                    } else if (obj instanceof List) {
                        for (Object obj2 : (List) obj) {
                            if (obj2 == null) {
                                obj2 = JSONObject.NULL;
                            }
                            jSONArray.put(obj2);
                        }
                        str3 = J;
                    } else {
                        jSONArray = null;
                    }
                }
                if (str3 != null) {
                    jSONObject.put(f101785p, str3);
                    if (jSONArray != null) {
                        jSONObject.putOpt("value", jSONArray);
                    }
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
                    editor.putString(str, string);
                }
            }
            jSONObject.put("value", obj);
            str2 = "string";
        }
        jSONArray = null;
        str3 = str2;
        if (str3 != null) {
            jSONObject.put(f101785p, str3);
            if (jSONArray != null) {
                jSONObject.putOpt("value", jSONArray);
            }
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "json.toString()");
            editor.putString(str, string2);
        }
    }

    public final void a() {
        this.f101797b.edit().clear().apply();
    }

    @Nullable
    public final Bundle l() {
        Bundle bundle = new Bundle();
        for (String key : this.f101797b.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                b(key, bundle);
            } catch (JSONException e10) {
                com.facebook.internal.t0.a aVar = com.facebook.internal.t0.f100109e;
                t0 t0Var = t0.CACHE;
                String TAG = f101784o;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.b(t0Var, 5, TAG, "Error reading cached value for key: '" + ((Object) key) + "' -- " + e10);
                return null;
            }
        }
        return bundle;
    }

    public final void w(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        SharedPreferences.Editor editor = this.f101797b.edit();
        for (String key : bundle.keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                x(key, bundle, editor);
            } catch (JSONException e10) {
                com.facebook.internal.t0.a aVar = com.facebook.internal.t0.f100109e;
                t0 t0Var = t0.CACHE;
                String TAG = f101784o;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.b(t0Var, 5, TAG, "Error processing value for key: '" + ((Object) key) + "' -- " + e10);
                return;
            }
        }
        editor.apply();
    }

    @oj.j
    public s0(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        str = (str == null || str.length() == 0) ? f101783n : str;
        this.f101796a = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.f101797b = sharedPreferences;
    }

    public /* synthetic */ s0(Context context, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : str);
    }
}
