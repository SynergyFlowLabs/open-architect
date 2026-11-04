package com.google.android.gms.internal.play_billing;

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
public final class q9 {
    private static final /* synthetic */ q9[] X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q9 f109273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q9 f109274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q9 f109275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q9 f109276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q9 f109277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q9 f109278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q9 f109279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q9 f109280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q9 f109281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q9 f109282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q9 f109283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q9 f109284m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q9 f109285n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q9 f109286o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final q9 f109287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q9 f109288t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q9 f109289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q9 f109290w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r9 f109291a;

    static {
        q9 q9Var = new q9("DOUBLE", 0, r9.DOUBLE, 1);
        f109273b = q9Var;
        q9 q9Var2 = new q9("FLOAT", 1, r9.FLOAT, 5);
        f109274c = q9Var2;
        r9 r9Var = r9.LONG;
        q9 q9Var3 = new q9("INT64", 2, r9Var, 0);
        f109275d = q9Var3;
        q9 q9Var4 = new q9("UINT64", 3, r9Var, 0);
        f109276e = q9Var4;
        r9 r9Var2 = r9.INT;
        q9 q9Var5 = new q9("INT32", 4, r9Var2, 0);
        f109277f = q9Var5;
        q9 q9Var6 = new q9("FIXED64", 5, r9Var, 1);
        f109278g = q9Var6;
        q9 q9Var7 = new q9("FIXED32", 6, r9Var2, 5);
        f109279h = q9Var7;
        q9 q9Var8 = new q9("BOOL", 7, r9.BOOLEAN, 0);
        f109280i = q9Var8;
        q9 q9Var9 = new q9("STRING", 8, r9.STRING, 2);
        f109281j = q9Var9;
        r9 r9Var3 = r9.MESSAGE;
        q9 q9Var10 = new q9("GROUP", 9, r9Var3, 3);
        f109282k = q9Var10;
        q9 q9Var11 = new q9("MESSAGE", 10, r9Var3, 2);
        f109283l = q9Var11;
        q9 q9Var12 = new q9("BYTES", 11, r9.BYTE_STRING, 2);
        f109284m = q9Var12;
        q9 q9Var13 = new q9("UINT32", 12, r9Var2, 0);
        f109285n = q9Var13;
        q9 q9Var14 = new q9("ENUM", 13, r9.ENUM, 0);
        f109286o = q9Var14;
        q9 q9Var15 = new q9("SFIXED32", 14, r9Var2, 5);
        f109287s = q9Var15;
        q9 q9Var16 = new q9("SFIXED64", 15, r9Var, 1);
        f109288t = q9Var16;
        q9 q9Var17 = new q9("SINT32", 16, r9Var2, 0);
        f109289v = q9Var17;
        q9 q9Var18 = new q9("SINT64", 17, r9Var, 0);
        f109290w = q9Var18;
        X = new q9[]{q9Var, q9Var2, q9Var3, q9Var4, q9Var5, q9Var6, q9Var7, q9Var8, q9Var9, q9Var10, q9Var11, q9Var12, q9Var13, q9Var14, q9Var15, q9Var16, q9Var17, q9Var18};
    }

    private q9(String str, int i10, r9 r9Var, int i11) {
        super(str, i10);
        this.f109291a = r9Var;
    }

    public static q9[] values() {
        return (q9[]) X.clone();
    }

    public final r9 k() {
        return this.f109291a;
    }
}
