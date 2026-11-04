package com.google.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
@y
final class a1 implements Comparable<a1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f125721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g1 f125722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<?> f125723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f125724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Field f125725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f125726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f125727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f125728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c3 f125729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Field f125730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Class<?> f125731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f125732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s1.e f125733m;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125734a;

        static {
            int[] iArr = new int[g1.values().length];
            f125734a = iArr;
            try {
                iArr[g1.f125961o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125734a[g1.f125963p0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125734a[g1.f125958m3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f125734a[g1.I3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Field f125735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g1 f125736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f125737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Field f125738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f125739e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f125740f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f125741g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private c3 f125742h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Class<?> f125743i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Object f125744j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private s1.e f125745k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Field f125746l;

        /* synthetic */ b(a aVar) {
            this();
        }

        public a1 a() {
            c3 c3Var = this.f125742h;
            if (c3Var != null) {
                return a1.n(this.f125737c, this.f125736b, c3Var, this.f125743i, this.f125741g, this.f125745k);
            }
            Object obj = this.f125744j;
            if (obj != null) {
                return a1.l(this.f125735a, this.f125737c, obj, this.f125745k);
            }
            Field field = this.f125738d;
            if (field != null) {
                return this.f125740f ? a1.k(this.f125735a, this.f125737c, this.f125736b, field, this.f125739e, this.f125741g, this.f125745k) : a1.d(this.f125735a, this.f125737c, this.f125736b, field, this.f125739e, this.f125741g, this.f125745k);
            }
            s1.e eVar = this.f125745k;
            if (eVar != null) {
                Field field2 = this.f125746l;
                return field2 == null ? a1.f(this.f125735a, this.f125737c, this.f125736b, eVar) : a1.p(this.f125735a, this.f125737c, this.f125736b, eVar, field2);
            }
            Field field3 = this.f125746l;
            return field3 == null ? a1.e(this.f125735a, this.f125737c, this.f125736b, this.f125741g) : a1.o(this.f125735a, this.f125737c, this.f125736b, field3);
        }

        public b b(Field cachedSizeField) {
            this.f125746l = cachedSizeField;
            return this;
        }

        public b c(boolean enforceUtf8) {
            this.f125741g = enforceUtf8;
            return this;
        }

        public b d(s1.e enumVerifier) {
            this.f125745k = enumVerifier;
            return this;
        }

        public b e(Field field) {
            if (this.f125742h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f125735a = field;
            return this;
        }

        public b f(int fieldNumber) {
            this.f125737c = fieldNumber;
            return this;
        }

        public b g(Object mapDefaultEntry) {
            this.f125744j = mapDefaultEntry;
            return this;
        }

        public b h(c3 oneof, Class<?> oneofStoredType) {
            if (this.f125735a != null || this.f125738d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f125742h = oneof;
            this.f125743i = oneofStoredType;
            return this;
        }

        public b i(Field presenceField, int presenceMask) {
            this.f125738d = (Field) s1.e(presenceField, "presenceField");
            this.f125739e = presenceMask;
            return this;
        }

        public b j(boolean required) {
            this.f125740f = required;
            return this;
        }

        public b k(g1 type) {
            this.f125736b = type;
            return this;
        }

        private b() {
        }
    }

    private a1(Field field, int fieldNumber, g1 type, Class<?> messageClass, Field presenceField, int presenceMask, boolean required, boolean enforceUtf8, c3 oneof, Class<?> oneofStoredType, Object mapDefaultEntry, s1.e enumVerifier, Field cachedSizeField) {
        this.f125721a = field;
        this.f125722b = type;
        this.f125723c = messageClass;
        this.f125724d = fieldNumber;
        this.f125725e = presenceField;
        this.f125726f = presenceMask;
        this.f125727g = required;
        this.f125728h = enforceUtf8;
        this.f125729i = oneof;
        this.f125731k = oneofStoredType;
        this.f125732l = mapDefaultEntry;
        this.f125733m = enumVerifier;
        this.f125730j = cachedSizeField;
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
        if (fieldType == g1.f125958m3 || fieldType == g1.I3) {
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

    public static a1 n(int fieldNumber, g1 fieldType, c3 oneof, Class<?> oneofStoredType, boolean enforceUtf8, s1.e enumVerifier) {
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
        if (fieldType == g1.f125958m3 || fieldType == g1.I3) {
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

    public c3 D() {
        return this.f125729i;
    }

    public Class<?> E() {
        return this.f125731k;
    }

    public Field H() {
        return this.f125725e;
    }

    public int I() {
        return this.f125726f;
    }

    public g1 L() {
        return this.f125722b;
    }

    public boolean M() {
        return this.f125728h;
    }

    public boolean O() {
        return this.f125727g;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(a1 o10) {
        return this.f125724d - o10.f125724d;
    }

    public Field r() {
        return this.f125730j;
    }

    public s1.e s() {
        return this.f125733m;
    }

    public Field t() {
        return this.f125721a;
    }

    public int v() {
        return this.f125724d;
    }

    public Class<?> w() {
        return this.f125723c;
    }

    public Object x() {
        return this.f125732l;
    }

    public Class<?> z() {
        int i10 = a.f125734a[this.f125722b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Field field = this.f125721a;
            return field != null ? field.getType() : this.f125731k;
        }
        if (i10 == 3 || i10 == 4) {
            return this.f125723c;
        }
        return null;
    }
}
