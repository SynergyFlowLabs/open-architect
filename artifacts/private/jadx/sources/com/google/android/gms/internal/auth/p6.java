package com.google.android.gms.internal.auth;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class p6 {
    private static final /* synthetic */ p6[] X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p6 f107740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p6 f107741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p6 f107742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p6 f107743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p6 f107744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p6 f107745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p6 f107746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p6 f107747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p6 f107748j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p6 f107749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p6 f107750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p6 f107751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p6 f107752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p6 f107753o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p6 f107754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p6 f107755t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p6 f107756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p6 f107757w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q6 f107758a;

    static {
        p6 p6Var = new p6("DOUBLE", 0, q6.DOUBLE, 1);
        f107740b = p6Var;
        p6 p6Var2 = new p6("FLOAT", 1, q6.FLOAT, 5);
        f107741c = p6Var2;
        q6 q6Var = q6.LONG;
        p6 p6Var3 = new p6("INT64", 2, q6Var, 0);
        f107742d = p6Var3;
        p6 p6Var4 = new p6("UINT64", 3, q6Var, 0);
        f107743e = p6Var4;
        q6 q6Var2 = q6.INT;
        p6 p6Var5 = new p6("INT32", 4, q6Var2, 0);
        f107744f = p6Var5;
        p6 p6Var6 = new p6("FIXED64", 5, q6Var, 1);
        f107745g = p6Var6;
        p6 p6Var7 = new p6("FIXED32", 6, q6Var2, 5);
        f107746h = p6Var7;
        p6 p6Var8 = new p6("BOOL", 7, q6.BOOLEAN, 0);
        f107747i = p6Var8;
        p6 p6Var9 = new p6("STRING", 8, q6.STRING, 2);
        f107748j = p6Var9;
        q6 q6Var3 = q6.MESSAGE;
        p6 p6Var10 = new p6("GROUP", 9, q6Var3, 3);
        f107749k = p6Var10;
        p6 p6Var11 = new p6("MESSAGE", 10, q6Var3, 2);
        f107750l = p6Var11;
        p6 p6Var12 = new p6("BYTES", 11, q6.BYTE_STRING, 2);
        f107751m = p6Var12;
        p6 p6Var13 = new p6("UINT32", 12, q6Var2, 0);
        f107752n = p6Var13;
        p6 p6Var14 = new p6("ENUM", 13, q6.ENUM, 0);
        f107753o = p6Var14;
        p6 p6Var15 = new p6("SFIXED32", 14, q6Var2, 5);
        f107754s = p6Var15;
        p6 p6Var16 = new p6("SFIXED64", 15, q6Var, 1);
        f107755t = p6Var16;
        p6 p6Var17 = new p6("SINT32", 16, q6Var2, 0);
        f107756v = p6Var17;
        p6 p6Var18 = new p6("SINT64", 17, q6Var, 0);
        f107757w = p6Var18;
        X = new p6[]{p6Var, p6Var2, p6Var3, p6Var4, p6Var5, p6Var6, p6Var7, p6Var8, p6Var9, p6Var10, p6Var11, p6Var12, p6Var13, p6Var14, p6Var15, p6Var16, p6Var17, p6Var18};
    }

    private p6(String str, int i10, q6 q6Var, int i11) {
        super(str, i10);
        this.f107758a = q6Var;
    }

    public static p6[] values() {
        return (p6[]) X.clone();
    }

    public final q6 k() {
        return this.f107758a;
    }
}
