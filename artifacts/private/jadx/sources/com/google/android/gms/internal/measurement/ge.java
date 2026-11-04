package com.google.android.gms.internal.measurement;

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
/* JADX INFO: loaded from: classes4.dex */
public final class ge {
    public static final ge X;
    private static final /* synthetic */ ge[] Y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ge f108454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ge f108455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ge f108456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ge f108457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ge f108458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ge f108459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ge f108460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ge f108461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ge f108462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ge f108463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ge f108464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ge f108465n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ge f108466o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ge f108467s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ge f108468t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ge f108469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ge f108470w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he f108471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f108472b;

    static {
        ge geVar = new ge("DOUBLE", 0, he.DOUBLE, 1);
        f108454c = geVar;
        ge geVar2 = new ge("FLOAT", 1, he.FLOAT, 5);
        f108455d = geVar2;
        he heVar = he.LONG;
        ge geVar3 = new ge("INT64", 2, heVar, 0);
        f108456e = geVar3;
        ge geVar4 = new ge("UINT64", 3, heVar, 0);
        f108457f = geVar4;
        he heVar2 = he.INT;
        ge geVar5 = new ge("INT32", 4, heVar2, 0);
        f108458g = geVar5;
        ge geVar6 = new ge("FIXED64", 5, heVar, 1);
        f108459h = geVar6;
        ge geVar7 = new ge("FIXED32", 6, heVar2, 5);
        f108460i = geVar7;
        ge geVar8 = new ge("BOOL", 7, he.BOOLEAN, 0);
        f108461j = geVar8;
        ge geVar9 = new ge("STRING", 8, he.STRING, 2);
        f108462k = geVar9;
        he heVar3 = he.MESSAGE;
        ge geVar10 = new ge("GROUP", 9, heVar3, 3);
        f108463l = geVar10;
        ge geVar11 = new ge("MESSAGE", 10, heVar3, 2);
        f108464m = geVar11;
        ge geVar12 = new ge("BYTES", 11, he.BYTE_STRING, 2);
        f108465n = geVar12;
        ge geVar13 = new ge("UINT32", 12, heVar2, 0);
        f108466o = geVar13;
        ge geVar14 = new ge("ENUM", 13, he.ENUM, 0);
        f108467s = geVar14;
        ge geVar15 = new ge("SFIXED32", 14, heVar2, 5);
        f108468t = geVar15;
        ge geVar16 = new ge("SFIXED64", 15, heVar, 1);
        f108469v = geVar16;
        ge geVar17 = new ge("SINT32", 16, heVar2, 0);
        f108470w = geVar17;
        ge geVar18 = new ge("SINT64", 17, heVar, 0);
        X = geVar18;
        Y = new ge[]{geVar, geVar2, geVar3, geVar4, geVar5, geVar6, geVar7, geVar8, geVar9, geVar10, geVar11, geVar12, geVar13, geVar14, geVar15, geVar16, geVar17, geVar18};
    }

    private ge(String str, int i10, he heVar, int i11) {
        super(str, i10);
        this.f108471a = heVar;
        this.f108472b = i11;
    }

    public static ge[] values() {
        return (ge[]) Y.clone();
    }

    public final he k() {
        return this.f108471a;
    }

    public final int l() {
        return this.f108472b;
    }
}
