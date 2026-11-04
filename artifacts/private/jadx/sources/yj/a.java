package yj;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 yj.a, still in use, count: 1, list:
  (r0v1 yj.a) from 0x003d: SPUT (r0v1 yj.a) yj.a.b yj.a
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
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    SPARSE_ARRAY,
    HASH_MAP,
    NO_CACHE;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f399789g = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2537a f399783a = new C2537a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f399784b = new a();

    /* JADX INFO: renamed from: yj.a$a, reason: collision with other inner class name */
    public static final class C2537a {
        public /* synthetic */ C2537a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            return a.f399784b;
        }

        private C2537a() {
        }
    }

    static {
    }

    private a() {
        super(str, i);
    }

    @NotNull
    public static kotlin.enums.a<a> n() {
        return f399789g;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f399788f.clone();
    }
}
