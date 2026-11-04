package ni;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public enum i {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu"),
    FRIDAY("Fri"),
    SATURDAY("Sat"),
    SUNDAY("Sun");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f333401a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f333400k = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f333391b = new a(null);

    @SourceDebugExtension({"SMAP\nDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Date.kt\nio/ktor/util/date/WeekDay$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final i a(int i10) {
            return i.l().get(i10);
        }

        @NotNull
        public final i b(@NotNull String value) {
            i next;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<i> it = i.l().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.n(), value));
            i iVar = next;
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException(("Invalid day of week: " + value).toString());
        }

        private a() {
        }
    }

    i(String str) {
        this.f333401a = str;
    }

    @NotNull
    public static kotlin.enums.a<i> l() {
        return f333400k;
    }

    @NotNull
    public final String n() {
        return this.f333401a;
    }
}
