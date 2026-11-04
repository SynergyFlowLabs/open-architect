package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w1 f126440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w1 f126441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w1 f126442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w1 f126443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w1 f126444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w1 f126445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w1 f126446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w1 f126447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final w1 f126448l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final w1 f126449m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ w1[] f126450n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f126451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f126452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f126453c;

    static {
        w1 w1Var = new w1("VOID", 0, Void.class, Void.class, null);
        f126440d = w1Var;
        Class cls = Integer.TYPE;
        w1 w1Var2 = new w1("INT", 1, cls, Integer.class, 0);
        f126441e = w1Var2;
        w1 w1Var3 = new w1("LONG", 2, Long.TYPE, Long.class, 0L);
        f126442f = w1Var3;
        w1 w1Var4 = new w1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f126443g = w1Var4;
        w1 w1Var5 = new w1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f126444h = w1Var5;
        w1 w1Var6 = new w1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f126445i = w1Var6;
        w1 w1Var7 = new w1("STRING", 6, String.class, String.class, "");
        f126446j = w1Var7;
        w1 w1Var8 = new w1("BYTE_STRING", 7, u.class, u.class, u.f126379f);
        f126447k = w1Var8;
        w1 w1Var9 = new w1("ENUM", 8, cls, Integer.class, null);
        f126448l = w1Var9;
        w1 w1Var10 = new w1("MESSAGE", 9, Object.class, Object.class, null);
        f126449m = w1Var10;
        f126450n = new w1[]{w1Var, w1Var2, w1Var3, w1Var4, w1Var5, w1Var6, w1Var7, w1Var8, w1Var9, w1Var10};
    }

    private w1(String $enum$name, int $enum$ordinal, Class type, Class boxedType, Object defaultDefault) {
        super($enum$name, $enum$ordinal);
        this.f126451a = type;
        this.f126452b = boxedType;
        this.f126453c = defaultDefault;
    }

    public static w1 valueOf(String name) {
        return (w1) Enum.valueOf(w1.class, name);
    }

    public static w1[] values() {
        return (w1[]) f126450n.clone();
    }

    public Class<?> k() {
        return this.f126452b;
    }

    public Object l() {
        return this.f126453c;
    }

    public Class<?> n() {
        return this.f126451a;
    }

    public boolean o(Class<?> t10) {
        return this.f126451a.isAssignableFrom(t10);
    }
}
