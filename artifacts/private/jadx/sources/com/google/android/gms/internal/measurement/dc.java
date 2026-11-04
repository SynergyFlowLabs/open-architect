package com.google.android.gms.internal.measurement;

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
public final class dc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final dc f108360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final dc f108361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final dc f108362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final dc f108363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final dc f108364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final dc f108365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final dc f108366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final dc f108367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final dc f108368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final dc f108369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ dc[] f108370l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f108371a;

    static {
        dc dcVar = new dc("VOID", 0, Void.class, Void.class, null);
        f108360b = dcVar;
        Class cls = Integer.TYPE;
        dc dcVar2 = new dc("INT", 1, cls, Integer.class, 0);
        f108361c = dcVar2;
        dc dcVar3 = new dc("LONG", 2, Long.TYPE, Long.class, 0L);
        f108362d = dcVar3;
        dc dcVar4 = new dc("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f108363e = dcVar4;
        dc dcVar5 = new dc("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f108364f = dcVar5;
        dc dcVar6 = new dc("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f108365g = dcVar6;
        dc dcVar7 = new dc("STRING", 6, String.class, String.class, "");
        f108366h = dcVar7;
        dc dcVar8 = new dc("BYTE_STRING", 7, ra.class, ra.class, ra.f108771b);
        f108367i = dcVar8;
        dc dcVar9 = new dc("ENUM", 8, cls, Integer.class, null);
        f108368j = dcVar9;
        dc dcVar10 = new dc("MESSAGE", 9, Object.class, Object.class, null);
        f108369k = dcVar10;
        f108370l = new dc[]{dcVar, dcVar2, dcVar3, dcVar4, dcVar5, dcVar6, dcVar7, dcVar8, dcVar9, dcVar10};
    }

    private dc(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.f108371a = cls2;
    }

    public static dc[] values() {
        return (dc[]) f108370l.clone();
    }

    public final Class k() {
        return this.f108371a;
    }
}
