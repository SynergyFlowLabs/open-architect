package io.ktor.http.content;

import io.ktor.http.l1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
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
/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f295714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f295715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f295716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ g0[] f295717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f295718f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final l1 f295719a;

    static {
        l1.a aVar = l1.f295939c;
        f295714b = new g0("OK", 0, aVar.C());
        f295715c = new g0("NOT_MODIFIED", 1, aVar.B());
        f295716d = new g0("PRECONDITION_FAILED", 2, aVar.H());
        g0[] g0VarArrK = k();
        f295717e = g0VarArrK;
        f295718f = kotlin.enums.c.c(g0VarArrK);
    }

    private g0(String str, int i10, l1 l1Var) {
        super(str, i10);
        this.f295719a = l1Var;
    }

    private static final /* synthetic */ g0[] k() {
        return new g0[]{f295714b, f295715c, f295716d};
    }

    @NotNull
    public static kotlin.enums.a<g0> l() {
        return f295718f;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f295717e.clone();
    }

    @NotNull
    public final l1 n() {
        return this.f295719a;
    }
}
