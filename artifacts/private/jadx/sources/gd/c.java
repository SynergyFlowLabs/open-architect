package gd;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public enum c {
    UNKNOWN("", 0),
    REGULAR("regular", 1),
    ENHANCE("enhance", 2),
    PANORAMIC("panoramic", 3),
    WALKTHROUGH_360("walkthrough360", 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f275453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f275454b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f275452j = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f275445c = new a(null);

    @SourceDebugExtension({"SMAP\nSnapshotType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotType.kt\ncom/planner5d/library/model/snapshot/SnapshotType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final c a(int i10) {
            c next;
            Iterator<c> it = c.p().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.o() != i10);
            c cVar = next;
            return cVar == null ? c.UNKNOWN : cVar;
        }

        @n
        @NotNull
        public final c b(@Nullable String str) {
            c next;
            Iterator<c> it = c.p().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(next.q(), str));
            c cVar = next;
            return cVar == null ? c.UNKNOWN : cVar;
        }

        private a() {
        }
    }

    c(String str, int i10) {
        this.f275453a = str;
        this.f275454b = i10;
    }

    @n
    @NotNull
    public static final c l(int i10) {
        return f275445c.a(i10);
    }

    @n
    @NotNull
    public static final c n(@Nullable String str) {
        return f275445c.b(str);
    }

    @NotNull
    public static kotlin.enums.a<c> p() {
        return f275452j;
    }

    public final int o() {
        return this.f275454b;
    }

    @NotNull
    public final String q() {
        return this.f275453a;
    }
}
