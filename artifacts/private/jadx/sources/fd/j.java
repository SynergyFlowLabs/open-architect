package fd;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public enum j {
    YEARLY("yearly"),
    MONTHLY("monthly"),
    WEEKLY("weekly"),
    UNLIMITED("unlimited");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f275177a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f275176h = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f275170b = new a(null);

    @SourceDebugExtension({"SMAP\nProductSubscription.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSubscription.kt\ncom/planner5d/library/model/payments/ProductSubscription$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,11:1\n1#2:12\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @Nullable
        public final j a(@Nullable String str) {
            j next;
            Iterator<j> it = j.o().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.f275177a, str)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private a() {
        }
    }

    static {
        int i10 = 3 | 3;
    }

    j(String str) {
        this.f275177a = str;
    }

    @oj.n
    @Nullable
    public static final j n(@Nullable String str) {
        return f275170b.a(str);
    }

    @NotNull
    public static kotlin.enums.a<j> o() {
        return f275176h;
    }
}
