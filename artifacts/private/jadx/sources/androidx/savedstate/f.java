package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.a0;
import kotlin.a1;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@oj.g
@SourceDebugExtension({"SMAP\nSavedStateReader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,915:1\n653#1:916\n689#1:917\n510#1:918\n545#1:919\n1#2:920\n*S KotlinDebug\n*F\n+ 1 SavedStateReader.android.kt\nandroidx/savedstate/SavedStateReader\n*L\n421#1:916\n426#1:917\n456#1:918\n461#1:919\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f75144a;

    @a1
    private /* synthetic */ f(Bundle bundle) {
        this.f75144a = bundle;
    }

    @Nullable
    public static final double[] A(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getDoubleArray(key);
    }

    public static int A0(Bundle bundle) {
        return bundle.hashCode();
    }

    @Nullable
    public static final Double B(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 == Double.MIN_VALUE && bundle.getDouble(key, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d10);
    }

    public static final boolean B0(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final float C(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            g.a(key);
            throw new a0();
        }
        return f10;
    }

    public static final boolean C0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return c(bundle, key) && bundle.get(key) == null;
    }

    @NotNull
    public static final float[] D(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float[] floatArray = bundle.getFloatArray(key);
        if (floatArray != null) {
            return floatArray;
        }
        g.a(key);
        throw new a0();
    }

    public static final int D0(Bundle bundle) {
        return bundle.size();
    }

    @Nullable
    public static final float[] E(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getFloatArray(key);
    }

    @NotNull
    public static final Map<String, Object> E0(Bundle bundle) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.checkNotNull(str);
            mapCreateMapBuilder.put(str, bundle.get(str));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Nullable
    public static final Float F(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        float f10 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f10 == Float.MIN_VALUE && bundle.getFloat(key, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f10);
    }

    public static String F0(Bundle bundle) {
        return "SavedStateReader(source=" + bundle + ')';
    }

    public static final int G(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 != Integer.MIN_VALUE || bundle.getInt(key, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10;
        }
        g.a(key);
        throw new a0();
    }

    @NotNull
    public static final int[] H(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int[] intArray = bundle.getIntArray(key);
        if (intArray != null) {
            return intArray;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final int[] I(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getIntArray(key);
    }

    @NotNull
    public static final List<Integer> J(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(key);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final List<Integer> K(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getIntegerArrayList(key);
    }

    @Nullable
    public static final Integer L(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i10 = bundle.getInt(key, Integer.MIN_VALUE);
        if (i10 == Integer.MIN_VALUE && bundle.getInt(key, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    public static final /* synthetic */ <T extends Serializable> T M(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T) N(bundle, key, j1.d(Serializable.class));
    }

    @NotNull
    public static final <T extends Serializable> T N(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> serializableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        T t10 = (T) androidx.core.os.d.e(bundle, key, oj.b.e(serializableClass));
        if (t10 != null) {
            return t10;
        }
        g.a(key);
        throw new a0();
    }

    public static final /* synthetic */ <T extends Serializable> T O(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T) P(bundle, key, j1.d(Serializable.class));
    }

    @Nullable
    public static final <T extends Serializable> T P(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> serializableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(serializableClass, "serializableClass");
        return (T) androidx.core.os.d.e(bundle, key, oj.b.e(serializableClass));
    }

    public static final long Q(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j10;
        }
        g.a(key);
        throw new a0();
    }

    @NotNull
    public static final long[] R(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long[] longArray = bundle.getLongArray(key);
        if (longArray != null) {
            return longArray;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final long[] S(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getLongArray(key);
    }

    @Nullable
    public static final Long T(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        long j10 = bundle.getLong(key, Long.MIN_VALUE);
        if (j10 == Long.MIN_VALUE && bundle.getLong(key, Long.MAX_VALUE) == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j10);
    }

    public static final /* synthetic */ <T extends Parcelable> T U(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T) V(bundle, key, j1.d(Parcelable.class));
    }

    @NotNull
    public static final <T extends Parcelable> T V(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        T t10 = (T) androidx.core.os.d.b(bundle, key, oj.b.e(parcelableClass));
        if (t10 != null) {
            return t10;
        }
        g.a(key);
        throw new a0();
    }

    public static final /* synthetic */ <T extends Parcelable> T[] W(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T[]) X(bundle, key, j1.d(Parcelable.class));
    }

    @NotNull
    public static final <T extends Parcelable> T[] X(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) Z(bundle, key, parcelableClass);
        if (tArr != null) {
            return tArr;
        }
        g.a(key);
        throw new a0();
    }

    public static final /* synthetic */ <T extends Parcelable> T[] Y(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T[]) Z(bundle, key, j1.d(Parcelable.class));
    }

    @Nullable
    public static final <T extends Parcelable> T[] Z(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        T[] tArr = (T[]) androidx.core.os.d.c(bundle, key, oj.b.e(parcelableClass));
        if (tArr != null) {
            return tArr;
        }
        return null;
    }

    public static final /* synthetic */ f a(Bundle bundle) {
        return new f(bundle);
    }

    public static final /* synthetic */ <T extends Parcelable> List<T> a0(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return b0(bundle, key, j1.d(Parcelable.class));
    }

    @a1
    @NotNull
    public static Bundle b(@NotNull Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    @NotNull
    public static final <T extends Parcelable> List<T> b0(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        ArrayList arrayListD = androidx.core.os.d.d(bundle, key, oj.b.e(parcelableClass));
        if (arrayListD != null) {
            return arrayListD;
        }
        g.a(key);
        throw new a0();
    }

    public static final boolean c(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    public static final /* synthetic */ <T extends Parcelable> List<T> c0(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i10 = 6 & 4;
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return d0(bundle, key, j1.d(Parcelable.class));
    }

    public static final boolean d(Bundle bundle, @NotNull Bundle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return i.d(bundle, other);
    }

    @Nullable
    public static final <T extends Parcelable> List<T> d0(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        return androidx.core.os.d.d(bundle, key, oj.b.e(parcelableClass));
    }

    public static final int e(Bundle bundle) {
        return i.e(bundle);
    }

    public static final /* synthetic */ <T extends Parcelable> T e0(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return (T) f0(bundle, key, j1.d(Parcelable.class));
    }

    @NotNull
    public static final String f(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder((kotlin.ranges.r.B(bundle.size(), 429496729) * 5) + 2);
        i.f(bundle, sb2, new ArrayList());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public static final <T extends Parcelable> T f0(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        return (T) androidx.core.os.d.b(bundle, key, oj.b.e(parcelableClass));
    }

    public static boolean g(Bundle bundle, Object obj) {
        return (obj instanceof f) && Intrinsics.areEqual(bundle, ((f) obj).G0());
    }

    @NotNull
    public static final Bundle g0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        g.a(key);
        throw new a0();
    }

    public static final boolean h(Bundle bundle, Bundle bundle2) {
        return Intrinsics.areEqual(bundle, bundle2);
    }

    @NotNull
    public static final Bundle[] h0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Bundle[]) X(bundle, key, j1.d(Bundle.class));
    }

    @NotNull
    public static final IBinder i(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        IBinder binder = bundle.getBinder(key);
        if (binder != null) {
            return binder;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final Bundle[] i0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Bundle[]) Z(bundle, key, j1.d(Bundle.class));
    }

    @Nullable
    public static final IBinder j(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBinder(key);
    }

    @NotNull
    public static final List<Bundle> j0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b0(bundle, key, j1.d(Bundle.class));
    }

    public static final boolean k(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return z10;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final List<Bundle> k0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return d0(bundle, key, j1.d(Bundle.class));
    }

    @NotNull
    public static final boolean[] l(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean[] booleanArray = bundle.getBooleanArray(key);
        if (booleanArray != null) {
            return booleanArray;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final Bundle l0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }

    @Nullable
    public static final boolean[] m(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBooleanArray(key);
    }

    @NotNull
    public static final Size m0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Size size = bundle.getSize(key);
        if (size != null) {
            return size;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final Boolean n(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return Boolean.valueOf(z10);
        }
        return null;
    }

    @NotNull
    public static final SizeF n0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        g.a(key);
        throw new a0();
    }

    public static final char o(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 != 0 || bundle.getChar(key, kotlin.jvm.internal.r.f312787c) != 65535) {
            return c10;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final SizeF o0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getSizeF(key);
    }

    @NotNull
    public static final char[] p(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char[] charArray = bundle.getCharArray(key);
        if (charArray != null) {
            return charArray;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final Size p0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getSize(key);
    }

    @Nullable
    public static final char[] q(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getCharArray(key);
    }

    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> q0(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return r0(bundle, key, j1.d(Parcelable.class));
    }

    @Nullable
    public static final Character r(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 == 0 && bundle.getChar(key, kotlin.jvm.internal.r.f312787c) == 65535) {
            return null;
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final <T extends Parcelable> SparseArray<T> r0(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        SparseArray<T> sparseArrayT0 = t0(bundle, key, parcelableClass);
        if (sparseArrayT0 != null) {
            return sparseArrayT0;
        }
        g.a(key);
        throw new a0();
    }

    @NotNull
    public static final CharSequence s(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence charSequence = bundle.getCharSequence(key);
        if (charSequence != null) {
            return charSequence;
        }
        g.a(key);
        throw new a0();
    }

    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> s0(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return t0(bundle, key, j1.d(Parcelable.class));
    }

    @NotNull
    public static final CharSequence[] t(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(key);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final <T extends Parcelable> SparseArray<T> t0(Bundle bundle, @NotNull String key, @NotNull kotlin.reflect.d<T> parcelableClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parcelableClass, "parcelableClass");
        return androidx.core.os.d.f(bundle, key, oj.b.e(parcelableClass));
    }

    @Nullable
    public static final CharSequence[] u(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getCharSequenceArray(key);
    }

    @NotNull
    public static final String u0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            return string;
        }
        g.a(key);
        throw new a0();
    }

    @NotNull
    public static final List<CharSequence> v(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(key);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        g.a(key);
        throw new a0();
    }

    @NotNull
    public static final String[] v0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String[] stringArray = bundle.getStringArray(key);
        if (stringArray != null) {
            return stringArray;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final List<CharSequence> w(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getCharSequenceArrayList(key);
    }

    @Nullable
    public static final String[] w0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArray(key);
    }

    @Nullable
    public static final CharSequence x(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getCharSequence(key);
    }

    @NotNull
    public static final List<String> x0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        g.a(key);
        throw new a0();
    }

    public static final double y(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d10;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final List<String> y0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }

    @NotNull
    public static final double[] z(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        double[] doubleArray = bundle.getDoubleArray(key);
        if (doubleArray != null) {
            return doubleArray;
        }
        g.a(key);
        throw new a0();
    }

    @Nullable
    public static final String z0(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getString(key);
    }

    public final /* synthetic */ Bundle G0() {
        return this.f75144a;
    }

    public boolean equals(Object obj) {
        return g(this.f75144a, obj);
    }

    public int hashCode() {
        return A0(this.f75144a);
    }

    public String toString() {
        return F0(this.f75144a);
    }
}
