package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes2.dex */
public final class x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x1 f50749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f50750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x1 f50751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x1 f50752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x1 f50753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x1 f50754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x1 f50755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x1 f50756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x1 f50757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x1 f50758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ x1[] f50759n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f50760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f50761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f50762c;

    static {
        x1 x1Var = new x1("VOID", 0, Void.class, Void.class, null);
        f50749d = x1Var;
        Class cls = Integer.TYPE;
        x1 x1Var2 = new x1("INT", 1, cls, Integer.class, 0);
        f50750e = x1Var2;
        x1 x1Var3 = new x1("LONG", 2, Long.TYPE, Long.class, 0L);
        f50751f = x1Var3;
        x1 x1Var4 = new x1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f50752g = x1Var4;
        x1 x1Var5 = new x1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f50753h = x1Var5;
        x1 x1Var6 = new x1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f50754i = x1Var6;
        x1 x1Var7 = new x1("STRING", 6, String.class, String.class, "");
        f50755j = x1Var7;
        x1 x1Var8 = new x1("BYTE_STRING", 7, u.class, u.class, u.f50632f);
        f50756k = x1Var8;
        x1 x1Var9 = new x1("ENUM", 8, cls, Integer.class, null);
        f50757l = x1Var9;
        x1 x1Var10 = new x1("MESSAGE", 9, Object.class, Object.class, null);
        f50758m = x1Var10;
        f50759n = new x1[]{x1Var, x1Var2, x1Var3, x1Var4, x1Var5, x1Var6, x1Var7, x1Var8, x1Var9, x1Var10};
    }

    private x1(String $enum$name, int $enum$ordinal, Class type, Class boxedType, Object defaultDefault) {
        super($enum$name, $enum$ordinal);
        this.f50760a = type;
        this.f50761b = boxedType;
        this.f50762c = defaultDefault;
    }

    public static x1 valueOf(String name) {
        return (x1) Enum.valueOf(x1.class, name);
    }

    public static x1[] values() {
        return (x1[]) f50759n.clone();
    }

    public Class<?> k() {
        return this.f50761b;
    }

    public Object l() {
        return this.f50762c;
    }

    public Class<?> n() {
        return this.f50760a;
    }

    public boolean o(Class<?> t10) {
        return this.f50760a.isAssignableFrom(t10);
    }
}
