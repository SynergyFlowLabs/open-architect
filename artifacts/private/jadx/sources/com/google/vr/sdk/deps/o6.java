package com.google.vr.sdk.deps;

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
public class o6 {
    public static final o6 X;
    private static final /* synthetic */ o6[] Y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o6 f129515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o6 f129516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o6 f129517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o6 f129518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o6 f129519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o6 f129520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o6 f129521i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o6 f129522j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o6 f129523k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o6 f129524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final o6 f129525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o6 f129526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o6 f129527o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final o6 f129528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o6 f129529t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o6 f129530v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final o6 f129531w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p6 f129532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f129533b;

    static {
        o6 o6Var = new o6("DOUBLE", 0, p6.DOUBLE, 1);
        f129515c = o6Var;
        o6 o6Var2 = new o6("FLOAT", 1, p6.FLOAT, 5);
        f129516d = o6Var2;
        p6 p6Var = p6.LONG;
        o6 o6Var3 = new o6("INT64", 2, p6Var, 0);
        f129517e = o6Var3;
        o6 o6Var4 = new o6("UINT64", 3, p6Var, 0);
        f129518f = o6Var4;
        p6 p6Var2 = p6.INT;
        o6 o6Var5 = new o6("INT32", 4, p6Var2, 0);
        f129519g = o6Var5;
        o6 o6Var6 = new o6("FIXED64", 5, p6Var, 1);
        f129520h = o6Var6;
        o6 o6Var7 = new o6("FIXED32", 6, p6Var2, 5);
        f129521i = o6Var7;
        o6 o6Var8 = new o6("BOOL", 7, p6.BOOLEAN, 0);
        f129522j = o6Var8;
        o6 o6Var9 = new o6("STRING", 8, p6.STRING, 2, (char) 0);
        f129523k = o6Var9;
        p6 p6Var3 = p6.MESSAGE;
        o6 o6Var10 = new o6("GROUP", 9, p6Var3, 3, (short) 0);
        f129524l = o6Var10;
        o6 o6Var11 = new o6("MESSAGE", 10, p6Var3, 2, 0);
        f129525m = o6Var11;
        o6 o6Var12 = new o6("BYTES", 11, p6.BYTE_STRING, 2, false);
        f129526n = o6Var12;
        o6 o6Var13 = new o6("UINT32", 12, p6Var2, 0);
        f129527o = o6Var13;
        o6 o6Var14 = new o6("ENUM", 13, p6.ENUM, 0);
        f129528s = o6Var14;
        o6 o6Var15 = new o6("SFIXED32", 14, p6Var2, 5);
        f129529t = o6Var15;
        o6 o6Var16 = new o6("SFIXED64", 15, p6Var, 1);
        f129530v = o6Var16;
        o6 o6Var17 = new o6("SINT32", 16, p6Var2, 0);
        f129531w = o6Var17;
        o6 o6Var18 = new o6("SINT64", 17, p6Var, 0);
        X = o6Var18;
        Y = new o6[]{o6Var, o6Var2, o6Var3, o6Var4, o6Var5, o6Var6, o6Var7, o6Var8, o6Var9, o6Var10, o6Var11, o6Var12, o6Var13, o6Var14, o6Var15, o6Var16, o6Var17, o6Var18};
    }

    private o6(String str, int i10, p6 p6Var, int i11) {
        super(str, i10);
        this.f129532a = p6Var;
        this.f129533b = i11;
    }

    public final p6 k() {
        return this.f129532a;
    }

    public final int l() {
        return this.f129533b;
    }

    /* synthetic */ o6(String str, int i10, p6 p6Var, int i11, byte b10) {
        this(str, i10, p6Var, i11);
    }

    o6(String str, int i10, p6 p6Var, int i11, char c10) {
        this(str, 8, p6Var, 2, (byte) 0);
    }

    o6(String str, int i10, p6 p6Var, int i11, short s10) {
        this(str, 9, p6Var, 3, (byte) 0);
    }

    o6(String str, int i10, p6 p6Var, int i11, int i12) {
        this(str, 10, p6Var, 2, (byte) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    o6(String str, int i10, p6 p6Var, int i11, boolean z10) {
        this(str, 11, p6Var, 2, (byte) 0);
        int i12 = 3 >> 0;
    }
}
