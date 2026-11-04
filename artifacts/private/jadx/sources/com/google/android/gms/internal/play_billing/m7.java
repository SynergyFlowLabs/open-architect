package com.google.android.gms.internal.play_billing;

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
/* JADX INFO: loaded from: classes4.dex */
public final class m7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m7 f109208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m7 f109209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m7 f109210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m7 f109211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m7 f109212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m7 f109213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m7 f109214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m7 f109215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m7 f109216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m7 f109217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ m7[] f109218l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f109219a;

    static {
        m7 m7Var = new m7("VOID", 0, Void.class, Void.class, null);
        f109208b = m7Var;
        Class cls = Integer.TYPE;
        m7 m7Var2 = new m7("INT", 1, cls, Integer.class, 0);
        f109209c = m7Var2;
        m7 m7Var3 = new m7("LONG", 2, Long.TYPE, Long.class, 0L);
        f109210d = m7Var3;
        m7 m7Var4 = new m7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f109211e = m7Var4;
        m7 m7Var5 = new m7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f109212f = m7Var5;
        m7 m7Var6 = new m7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f109213g = m7Var6;
        m7 m7Var7 = new m7("STRING", 6, String.class, String.class, "");
        f109214h = m7Var7;
        m7 m7Var8 = new m7("BYTE_STRING", 7, d6.class, d6.class, d6.f109102b);
        f109215i = m7Var8;
        m7 m7Var9 = new m7("ENUM", 8, cls, Integer.class, null);
        f109216j = m7Var9;
        m7 m7Var10 = new m7("MESSAGE", 9, Object.class, Object.class, null);
        f109217k = m7Var10;
        f109218l = new m7[]{m7Var, m7Var2, m7Var3, m7Var4, m7Var5, m7Var6, m7Var7, m7Var8, m7Var9, m7Var10};
    }

    private m7(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f109219a = cls2;
    }

    public static m7[] values() {
        return (m7[]) f109218l.clone();
    }

    public final Class k() {
        return this.f109219a;
    }
}
