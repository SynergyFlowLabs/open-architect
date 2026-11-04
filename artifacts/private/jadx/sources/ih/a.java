package ih;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ih.a, still in use, count: 1, list:
  (r0v1 ih.a) from 0x0044: SPUT (r0v1 ih.a) ih.a.c ih.a
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes13.dex */
public final class a {
    NONE(0),
    ERROR(1),
    INFO(2),
    DEBUG(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f287220a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f287219i = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C1926a f287212b = new C1926a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f287213c = new a(1);

    /* JADX INFO: renamed from: ih.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nCioLogLevel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CioLogLevel.kt\nio/customer/sdk/core/util/CioLogLevel$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
    public static final class C1926a {
        public /* synthetic */ C1926a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a c(C1926a c1926a, String str, a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                aVar = c1926a.a();
            }
            return c1926a.b(str, aVar);
        }

        @NotNull
        public final a a() {
            return a.f287213c;
        }

        @NotNull
        public final a b(@Nullable String str, @NotNull a fallback) {
            a aVar;
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            a[] aVarArrValues = a.values();
            int length = aVarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i10];
                if (StringsKt.N1(aVar.name(), str, true)) {
                    break;
                }
                i10++;
            }
            return aVar == null ? fallback : aVar;
        }

        private C1926a() {
        }
    }

    static {
    }

    private a(int i10) {
        super(str, i);
        this.f287220a = i10;
    }

    @NotNull
    public static kotlin.enums.a<a> n() {
        return f287219i;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f287218h.clone();
    }

    public final int o() {
        return this.f287220a;
    }
}
