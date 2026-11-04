package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.room.s2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f76561b = v.i("Data");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f76562c = new a().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.a({"MinMaxConstant"})
    public static final int f76563d = 10240;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Map<String, Object> f76564a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Object> f76565a = new HashMap();

        @NonNull
        public h a() throws Throwable {
            h hVar = new h((Map<String, ?>) this.f76565a);
            h.F(hVar);
            return hVar;
        }

        @NonNull
        @b1({b1.a.LIBRARY_GROUP})
        public a b(@NonNull String key, @androidx.annotation.p0 Object value) {
            if (value == null) {
                this.f76565a.put(key, null);
                return this;
            }
            Class<?> cls = value.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f76565a.put(key, value);
                return this;
            }
            if (cls == boolean[].class) {
                this.f76565a.put(key, h.a((boolean[]) value));
                return this;
            }
            if (cls == byte[].class) {
                this.f76565a.put(key, h.b((byte[]) value));
                return this;
            }
            if (cls == int[].class) {
                this.f76565a.put(key, h.e((int[]) value));
                return this;
            }
            if (cls == long[].class) {
                this.f76565a.put(key, h.f((long[]) value));
                return this;
            }
            if (cls == float[].class) {
                this.f76565a.put(key, h.d((float[]) value));
                return this;
            }
            if (cls == double[].class) {
                this.f76565a.put(key, h.c((double[]) value));
                return this;
            }
            throw new IllegalArgumentException("Key " + key + " has invalid type " + cls);
        }

        @NonNull
        public a c(@NonNull h data) {
            d(data.f76564a);
            return this;
        }

        @NonNull
        public a d(@NonNull Map<String, Object> values) {
            for (Map.Entry<String, Object> entry : values.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NonNull
        public a e(@NonNull String key, boolean value) {
            this.f76565a.put(key, Boolean.valueOf(value));
            return this;
        }

        @NonNull
        public a f(@NonNull String key, @NonNull boolean[] value) {
            this.f76565a.put(key, h.a(value));
            return this;
        }

        @NonNull
        public a g(@NonNull String key, byte value) {
            this.f76565a.put(key, Byte.valueOf(value));
            return this;
        }

        @NonNull
        public a h(@NonNull String key, @NonNull byte[] value) {
            this.f76565a.put(key, h.b(value));
            return this;
        }

        @NonNull
        public a i(@NonNull String key, double value) {
            this.f76565a.put(key, Double.valueOf(value));
            return this;
        }

        @NonNull
        public a j(@NonNull String key, @NonNull double[] value) {
            this.f76565a.put(key, h.c(value));
            return this;
        }

        @NonNull
        public a k(@NonNull String key, float value) {
            this.f76565a.put(key, Float.valueOf(value));
            return this;
        }

        @NonNull
        public a l(@NonNull String key, @NonNull float[] value) {
            this.f76565a.put(key, h.d(value));
            return this;
        }

        @NonNull
        public a m(@NonNull String key, int value) {
            this.f76565a.put(key, Integer.valueOf(value));
            return this;
        }

        @NonNull
        public a n(@NonNull String key, @NonNull int[] value) {
            this.f76565a.put(key, h.e(value));
            return this;
        }

        @NonNull
        public a o(@NonNull String key, long value) {
            this.f76565a.put(key, Long.valueOf(value));
            return this;
        }

        @NonNull
        public a p(@NonNull String key, @NonNull long[] value) {
            this.f76565a.put(key, h.f(value));
            return this;
        }

        @NonNull
        public a q(@NonNull String key, @androidx.annotation.p0 String value) {
            this.f76565a.put(key, value);
            return this;
        }

        @NonNull
        public a r(@NonNull String key, @NonNull String[] value) {
            this.f76565a.put(key, value);
            return this;
        }
    }

    h() {
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    @s2
    public static byte[] F(@NonNull h data) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.D());
                    for (Map.Entry<String, Object> entry : data.f76564a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException unused3) {
                    objectOutputStream = objectOutputStream2;
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused5) {
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (IOException unused8) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static Boolean[] a(@NonNull boolean[] value) {
        Boolean[] boolArr = new Boolean[value.length];
        int i10 = 3 ^ 0;
        for (int i11 = 0; i11 < value.length; i11++) {
            boolArr[i11] = Boolean.valueOf(value[i11]);
        }
        return boolArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static Byte[] b(@NonNull byte[] value) {
        Byte[] bArr = new Byte[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            bArr[i10] = Byte.valueOf(value[i10]);
        }
        return bArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static Double[] c(@NonNull double[] value) {
        Double[] dArr = new Double[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            dArr[i10] = Double.valueOf(value[i10]);
        }
        return dArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static Float[] d(@NonNull float[] value) {
        Float[] fArr = new Float[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            fArr[i10] = Float.valueOf(value[i10]);
        }
        return fArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static Integer[] e(@NonNull int[] value) {
        Integer[] numArr = new Integer[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            numArr[i10] = Integer.valueOf(value[i10]);
        }
        return numArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static Long[] f(@NonNull long[] value) {
        Long[] lArr = new Long[value.length];
        for (int i10 = 0; i10 < value.length; i10++) {
            lArr[i10] = Long.valueOf(value[i10]);
        }
        return lArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static byte[] g(@NonNull Byte[] array) {
        byte[] bArr = new byte[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            bArr[i10] = array[i10].byteValue();
        }
        return bArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static double[] h(@NonNull Double[] array) {
        double[] dArr = new double[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            dArr[i10] = array[i10].doubleValue();
        }
        return dArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static float[] i(@NonNull Float[] array) {
        float[] fArr = new float[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            fArr[i10] = array[i10].floatValue();
        }
        return fArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static int[] j(@NonNull Integer[] array) {
        int[] iArr = new int[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            iArr[i10] = array[i10].intValue();
        }
        return iArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static long[] k(@NonNull Long[] array) {
        long[] jArr = new long[array.length];
        int i10 = 1 << 0;
        for (int i11 = 0; i11 < array.length; i11++) {
            jArr[i11] = array[i11].longValue();
        }
        return jArr;
    }

    @NonNull
    @b1({b1.a.LIBRARY_GROUP})
    public static boolean[] l(@NonNull Boolean[] array) {
        boolean[] zArr = new boolean[array.length];
        for (int i10 = 0; i10 < array.length; i10++) {
            zArr[i10] = array[i10].booleanValue();
        }
        return zArr;
    }

    @NonNull
    @s2
    public static h m(@NonNull byte[] bytes) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th2;
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                        map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                    }
                    objectInputStream.close();
                } catch (IOException | ClassNotFoundException unused) {
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    return new h(map);
                } catch (Throwable th3) {
                    th2 = th3;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th2;
                    } catch (IOException unused3) {
                        throw th2;
                    }
                }
            } catch (IOException unused4) {
            }
        } catch (IOException | ClassNotFoundException unused5) {
        } catch (Throwable th4) {
            objectInputStream = null;
            th2 = th4;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException unused6) {
        }
        return new h(map);
    }

    @androidx.annotation.p0
    public String A(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @androidx.annotation.p0
    public String[] B(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean C(@NonNull String key, @NonNull Class<T> klass) {
        Object obj = this.f76564a.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public int D() {
        return this.f76564a.size();
    }

    @NonNull
    public byte[] E() {
        return F(this);
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 == null || h.class != o10.getClass()) {
            return false;
        }
        h hVar = (h) o10;
        Set<String> setKeySet = this.f76564a.keySet();
        if (!setKeySet.equals(hVar.f76564a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = this.f76564a.get(str);
            Object obj2 = hVar.f76564a.get(str);
            if (!((obj == null || obj2 == null) ? obj == obj2 : ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : obj.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f76564a.hashCode() * 31;
    }

    public boolean n(@NonNull String key, boolean defaultValue) {
        Object obj = this.f76564a.get(key);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : defaultValue;
    }

    @androidx.annotation.p0
    public boolean[] o(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof Boolean[]) {
            return l((Boolean[]) obj);
        }
        return null;
    }

    public byte p(@NonNull String key, byte defaultValue) {
        Object obj = this.f76564a.get(key);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : defaultValue;
    }

    @androidx.annotation.p0
    public byte[] q(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof Byte[]) {
            return g((Byte[]) obj);
        }
        return null;
    }

    public double r(@NonNull String key, double defaultValue) {
        Object obj = this.f76564a.get(key);
        return obj instanceof Double ? ((Double) obj).doubleValue() : defaultValue;
    }

    @androidx.annotation.p0
    public double[] s(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof Double[]) {
            return h((Double[]) obj);
        }
        return null;
    }

    public float t(@NonNull String key, float defaultValue) {
        Object obj = this.f76564a.get(key);
        return obj instanceof Float ? ((Float) obj).floatValue() : defaultValue;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f76564a.isEmpty()) {
            for (String str : this.f76564a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f76564a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    @androidx.annotation.p0
    public float[] u(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof Float[]) {
            return i((Float[]) obj);
        }
        return null;
    }

    public int v(@NonNull String key, int defaultValue) {
        Object obj = this.f76564a.get(key);
        return obj instanceof Integer ? ((Integer) obj).intValue() : defaultValue;
    }

    @androidx.annotation.p0
    public int[] w(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof Integer[]) {
            return j((Integer[]) obj);
        }
        return null;
    }

    @NonNull
    public Map<String, Object> x() {
        return Collections.unmodifiableMap(this.f76564a);
    }

    public long y(@NonNull String key, long defaultValue) {
        Object obj = this.f76564a.get(key);
        return obj instanceof Long ? ((Long) obj).longValue() : defaultValue;
    }

    @androidx.annotation.p0
    public long[] z(@NonNull String key) {
        Object obj = this.f76564a.get(key);
        if (obj instanceof Long[]) {
            return k((Long[]) obj);
        }
        return null;
    }

    public h(@NonNull h other) {
        this.f76564a = new HashMap(other.f76564a);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public h(@NonNull Map<String, ?> values) {
        this.f76564a = new HashMap(values);
    }
}
