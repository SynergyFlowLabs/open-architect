package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
@y
final class a1 implements Comparable<a1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f49913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g1 f49914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<?> f49915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f49916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Field f49917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f49918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f49919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f49920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e3 f49921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Field f49922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Class<?> f49923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f49924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s1.e f49925m;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f49926a;

        static {
            int[] iArr = new int[g1.values().length];
            f49926a = iArr;
            try {
                iArr[g1.f50342o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49926a[g1.f50344p0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49926a[g1.f50339m3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49926a[g1.I3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Field f49927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g1 f49928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Field f49930d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f49931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f49932f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f49933g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e3 f49934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Class<?> f49935i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f49936j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private s1.e f49937k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Field f49938l;

        /* synthetic */ b(a aVar) {
            this();
        }

        public a1 a() {
            e3 e3Var = this.f49934h;
            if (e3Var != null) {
                return a1.n(this.f49929c, this.f49928b, e3Var, this.f49935i, this.f49933g, this.f49937k);
            }
            Object obj = this.f49936j;
            if (obj != null) {
                return a1.l(this.f49927a, this.f49929c, obj, this.f49937k);
            }
            Field field = this.f49930d;
            if (field != null) {
                return this.f49932f ? a1.k(this.f49927a, this.f49929c, this.f49928b, field, this.f49931e, this.f49933g, this.f49937k) : a1.d(this.f49927a, this.f49929c, this.f49928b, field, this.f49931e, this.f49933g, this.f49937k);
            }
            s1.e eVar = this.f49937k;
            if (eVar != null) {
                Field field2 = this.f49938l;
                return field2 == null ? a1.f(this.f49927a, this.f49929c, this.f49928b, eVar) : a1.p(this.f49927a, this.f49929c, this.f49928b, eVar, field2);
            }
            Field field3 = this.f49938l;
            return field3 == null ? a1.e(this.f49927a, this.f49929c, this.f49928b, this.f49933g) : a1.o(this.f49927a, this.f49929c, this.f49928b, field3);
        }

        public b b(Field cachedSizeField) {
            this.f49938l = cachedSizeField;
            return this;
        }

        public b c(boolean enforceUtf8) {
            this.f49933g = enforceUtf8;
            return this;
        }

        public b d(s1.e enumVerifier) {
            this.f49937k = enumVerifier;
            return this;
        }

        public b e(Field field) {
            if (this.f49934h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f49927a = field;
            return this;
        }

        public b f(int fieldNumber) {
            this.f49929c = fieldNumber;
            return this;
        }

        public b g(Object mapDefaultEntry) {
            this.f49936j = mapDefaultEntry;
            return this;
        }

        public b h(e3 oneof, Class<?> oneofStoredType) {
            if (this.f49927a != null || this.f49930d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f49934h = oneof;
            this.f49935i = oneofStoredType;
            return this;
        }

        public b i(Field presenceField, int presenceMask) {
            this.f49930d = (Field) s1.e(presenceField, "presenceField");
            this.f49931e = presenceMask;
            return this;
        }

        public b j(boolean required) {
            this.f49932f = required;
            return this;
        }

        public b k(g1 type) {
            this.f49928b = type;
            return this;
        }

        private b() {
        }
    }

    private a1(Field field, int fieldNumber, g1 type, Class<?> messageClass, Field presenceField, int presenceMask, boolean required, boolean enforceUtf8, e3 oneof, Class<?> oneofStoredType, Object mapDefaultEntry, s1.e enumVerifier, Field cachedSizeField) {
        this.f49913a = field;
        this.f49914b = type;
        this.f49915c = messageClass;
        this.f49916d = fieldNumber;
        this.f49917e = presenceField;
        this.f49918f = presenceMask;
        this.f49919g = required;
        this.f49920h = enforceUtf8;
        this.f49921i = oneof;
        this.f49923k = oneofStoredType;
        this.f49924l = mapDefaultEntry;
        this.f49925m = enumVerifier;
        this.f49922j = cachedSizeField;
    }

    private static boolean N(int value) {
        return value != 0 && (value & (value + (-1))) == 0;
    }

    public static b R() {
        return new b(null);
    }

    private static void b(int fieldNumber) {
        if (fieldNumber > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + fieldNumber);
    }

    public static a1 d(Field field, int fieldNumber, g1 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, s1.e enumVerifier) {
        b(fieldNumber);
        s1.e(field, "field");
        s1.e(fieldType, "fieldType");
        s1.e(presenceField, "presenceField");
        if (presenceField == null || N(presenceMask)) {
            return new a1(field, fieldNumber, fieldType, null, presenceField, presenceMask, false, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static a1 e(Field field, int fieldNumber, g1 fieldType, boolean enforceUtf8) {
        b(fieldNumber);
        s1.e(field, "field");
        s1.e(fieldType, "fieldType");
        if (fieldType == g1.f50339m3 || fieldType == g1.I3) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, null, null, null, null, null);
    }

    public static a1 f(Field field, int fieldNumber, g1 fieldType, s1.e enumVerifier) {
        b(fieldNumber);
        s1.e(field, "field");
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static a1 k(Field field, int fieldNumber, g1 fieldType, Field presenceField, int presenceMask, boolean enforceUtf8, s1.e enumVerifier) {
        b(fieldNumber);
        s1.e(field, "field");
        s1.e(fieldType, "fieldType");
        s1.e(presenceField, "presenceField");
        if (presenceField == null || N(presenceMask)) {
            return new a1(field, fieldNumber, fieldType, null, presenceField, presenceMask, true, enforceUtf8, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + presenceMask);
    }

    public static a1 l(Field field, int fieldNumber, Object mapDefaultEntry, s1.e enumVerifier) {
        s1.e(mapDefaultEntry, "mapDefaultEntry");
        b(fieldNumber);
        s1.e(field, "field");
        return new a1(field, fieldNumber, g1.J3, null, null, 0, false, true, null, null, mapDefaultEntry, enumVerifier, null);
    }

    public static a1 n(int fieldNumber, g1 fieldType, e3 oneof, Class<?> oneofStoredType, boolean enforceUtf8, s1.e enumVerifier) {
        b(fieldNumber);
        s1.e(fieldType, "fieldType");
        s1.e(oneof, "oneof");
        s1.e(oneofStoredType, "oneofStoredType");
        if (fieldType.r()) {
            return new a1(null, fieldNumber, fieldType, null, null, 0, false, enforceUtf8, oneof, oneofStoredType, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + fieldNumber + " is of type " + fieldType);
    }

    public static a1 o(Field field, int fieldNumber, g1 fieldType, Field cachedSizeField) {
        b(fieldNumber);
        s1.e(field, "field");
        s1.e(fieldType, "fieldType");
        if (fieldType == g1.f50339m3 || fieldType == g1.I3) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, null, cachedSizeField);
    }

    public static a1 p(Field field, int fieldNumber, g1 fieldType, s1.e enumVerifier, Field cachedSizeField) {
        b(fieldNumber);
        s1.e(field, "field");
        return new a1(field, fieldNumber, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, cachedSizeField);
    }

    public static a1 q(Field field, int fieldNumber, g1 fieldType, Class<?> messageClass) {
        b(fieldNumber);
        s1.e(field, "field");
        s1.e(fieldType, "fieldType");
        s1.e(messageClass, "messageClass");
        return new a1(field, fieldNumber, fieldType, messageClass, null, 0, false, false, null, null, null, null, null);
    }

    public e3 D() {
        return this.f49921i;
    }

    public Class<?> E() {
        return this.f49923k;
    }

    public Field H() {
        return this.f49917e;
    }

    public int I() {
        return this.f49918f;
    }

    public g1 L() {
        return this.f49914b;
    }

    public boolean M() {
        return this.f49920h;
    }

    public boolean O() {
        return this.f49919g;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(a1 o10) {
        return this.f49916d - o10.f49916d;
    }

    public Field r() {
        return this.f49922j;
    }

    public s1.e s() {
        return this.f49925m;
    }

    public Field t() {
        return this.f49913a;
    }

    public int v() {
        return this.f49916d;
    }

    public Class<?> w() {
        return this.f49915c;
    }

    public Object x() {
        return this.f49924l;
    }

    public Class<?> z() {
        int i10 = a.f49926a[this.f49914b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Field field = this.f49913a;
            return field != null ? field.getType() : this.f49923k;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f49915c;
        }
        int i11 = 7 & 0;
        return null;
    }
}
