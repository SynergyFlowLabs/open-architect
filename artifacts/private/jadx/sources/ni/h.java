package ni;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public enum h {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f333390a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f333389s = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f333375b = new a(null);

    @SourceDebugExtension({"SMAP\nDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Date.kt\nio/ktor/util/date/Month$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h a(int i10) {
            return h.l().get(i10);
        }

        @NotNull
        public final h b(@NotNull String value) {
            h next;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<h> it = h.l().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.n(), value));
            h hVar = next;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException(("Invalid month: " + value).toString());
        }

        private a() {
        }
    }

    h(String str) {
        this.f333390a = str;
    }

    @NotNull
    public static kotlin.enums.a<h> l() {
        return f333389s;
    }

    @NotNull
    public final String n() {
        return this.f333390a;
    }
}
