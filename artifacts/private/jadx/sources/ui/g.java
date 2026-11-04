package ui;

import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f381255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final g f381256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f381257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f381258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ g[] f381259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f381260g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ByteOrder f381261a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a() {
            return g.f381256c;
        }

        @NotNull
        public final g b(@NotNull ByteOrder nioOrder) {
            Intrinsics.checkNotNullParameter(nioOrder, "nioOrder");
            return h.b(nioOrder);
        }

        private a() {
        }
    }

    static {
        ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        Intrinsics.checkNotNullExpressionValue(BIG_ENDIAN, "BIG_ENDIAN");
        boolean z10 = false | false;
        f381257d = new g("BIG_ENDIAN", 0, BIG_ENDIAN);
        ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        Intrinsics.checkNotNullExpressionValue(LITTLE_ENDIAN, "LITTLE_ENDIAN");
        f381258e = new g("LITTLE_ENDIAN", 1, LITTLE_ENDIAN);
        g[] gVarArrK = k();
        f381259f = gVarArrK;
        f381260g = kotlin.enums.c.c(gVarArrK);
        f381255b = new a(null);
        ByteOrder byteOrderNativeOrder = ByteOrder.nativeOrder();
        Intrinsics.checkNotNullExpressionValue(byteOrderNativeOrder, "nativeOrder(...)");
        f381256c = h.b(byteOrderNativeOrder);
    }

    private g(String str, int i10, ByteOrder byteOrder) {
        super(str, i10);
        this.f381261a = byteOrder;
    }

    private static final /* synthetic */ g[] k() {
        return new g[]{f381257d, f381258e};
    }

    @NotNull
    public static kotlin.enums.a<g> n() {
        return f381260g;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f381259f.clone();
    }

    @NotNull
    public final ByteOrder o() {
        return this.f381261a;
    }
}
