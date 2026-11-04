package com.google.android.filament.utils;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f104823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f104824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f104825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c0 f104826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c0 f104827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c0 f104828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ c0[] f104829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f104830k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h0 f104831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h0 f104832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h0 f104833c;

    static {
        h0 h0Var = h0.X;
        h0 h0Var2 = h0.Y;
        h0 h0Var3 = h0.Z;
        f104823d = new c0("XYZ", 0, h0Var, h0Var2, h0Var3);
        f104824e = new c0("XZY", 1, h0Var, h0Var3, h0Var2);
        f104825f = new c0("YXZ", 2, h0Var2, h0Var, h0Var3);
        f104826g = new c0("YZX", 3, h0Var2, h0Var3, h0Var);
        f104827h = new c0("ZXY", 4, h0Var3, h0Var, h0Var2);
        f104828i = new c0("ZYX", 5, h0Var3, h0Var2, h0Var);
        c0[] c0VarArrK = k();
        f104829j = c0VarArrK;
        f104830k = kotlin.enums.c.c(c0VarArrK);
    }

    private c0(String str, int i10, h0 h0Var, h0 h0Var2, h0 h0Var3) {
        super(str, i10);
        this.f104831a = h0Var;
        this.f104832b = h0Var2;
        this.f104833c = h0Var3;
    }

    private static final /* synthetic */ c0[] k() {
        return new c0[]{f104823d, f104824e, f104825f, f104826g, f104827h, f104828i};
    }

    @NotNull
    public static kotlin.enums.a<c0> l() {
        return f104830k;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f104829j.clone();
    }

    @NotNull
    public final h0 n() {
        return this.f104832b;
    }

    @NotNull
    public final h0 o() {
        return this.f104833c;
    }

    @NotNull
    public final h0 p() {
        return this.f104831a;
    }
}
