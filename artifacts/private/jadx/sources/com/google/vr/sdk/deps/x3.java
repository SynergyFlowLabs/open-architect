package com.google.vr.sdk.deps;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class x3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x3 f129670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x3 f129671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x3 f129672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x3 f129673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x3 f129674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x3 f129675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x3 f129676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x3 f129677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x3 f129678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x3 f129679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ x3[] f129680l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f129681a;

    static {
        x3 x3Var = new x3("VOID", 0, Void.class, Void.class, null);
        f129670b = x3Var;
        Class cls = Integer.TYPE;
        x3 x3Var2 = new x3("INT", 1, cls, Integer.class, 0);
        f129671c = x3Var2;
        x3 x3Var3 = new x3("LONG", 2, Long.TYPE, Long.class, 0L);
        f129672d = x3Var3;
        x3 x3Var4 = new x3("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f129673e = x3Var4;
        x3 x3Var5 = new x3("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f129674f = x3Var5;
        x3 x3Var6 = new x3("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f129675g = x3Var6;
        x3 x3Var7 = new x3("STRING", 6, String.class, String.class, "");
        f129676h = x3Var7;
        x3 x3Var8 = new x3("BYTE_STRING", 7, k2.class, k2.class, k2.f129465b);
        f129677i = x3Var8;
        x3 x3Var9 = new x3("ENUM", 8, cls, Integer.class, null);
        f129678j = x3Var9;
        x3 x3Var10 = new x3("MESSAGE", 9, Object.class, Object.class, null);
        f129679k = x3Var10;
        f129680l = new x3[]{x3Var, x3Var2, x3Var3, x3Var4, x3Var5, x3Var6, x3Var7, x3Var8, x3Var9, x3Var10};
    }

    private x3(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f129681a = cls2;
    }

    public final Class<?> k() {
        return this.f129681a;
    }
}
