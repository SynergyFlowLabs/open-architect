package hc;

import kotlin.enums.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yc.b;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension({"SMAP\nFeedListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedListItem.kt\ncom/planner5d/library/feed/activity/fragment/FeedListItem\n*L\n1#1,26:1\n23#1:27\n23#1:28\n23#1:29\n*S KotlinDebug\n*F\n+ 1 FeedListItem.kt\ncom/planner5d/library/feed/activity/fragment/FeedListItem\n*L\n15#1:27\n19#1:28\n21#1:29\n*E\n"})
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC1914a f280391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f280392b;

    /* JADX INFO: renamed from: hc.a$a, reason: collision with other inner class name */
    public enum EnumC1914a {
        Unknown(0),
        DesignGeneratorLabel(5),
        DesignGeneratorItem(6),
        DesignBattleLabel(7),
        DesignBattleItem(8),
        ProjectList(9),
        Inspiration(10),
        ForYourHome(11),
        Tips(12),
        Videos(13),
        AllArticles(14),
        DesignOfDay(15);


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f280406o = c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f280407a;

        EnumC1914a(int i10) {
            this.f280407a = i10;
        }

        @NotNull
        public static kotlin.enums.a<EnumC1914a> l() {
            return f280406o;
        }

        public final int n() {
            return this.f280407a;
        }
    }

    public a(@NotNull EnumC1914a viewType, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f280391a = viewType;
        this.f280392b = value;
    }

    private final long a() {
        return this.f280391a.n();
    }

    @NotNull
    public final Object b() {
        return this.f280392b;
    }

    @NotNull
    public final EnumC1914a c() {
        return this.f280391a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.f280392b, r6.f280392b) != false) goto L17;
     */
    @Override // yc.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L3d
            if (r6 == 0) goto L9
            java.lang.Class r0 = r6.getClass()
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Class<hc.a> r1 = hc.a.class
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r4 = 1
            if (r0 == 0) goto L3a
            r4 = 2
            boolean r0 = r6 instanceof hc.a
            if (r0 == 0) goto L3a
            hc.a$a r0 = r5.f280391a
            int r0 = r0.n()
            r4 = 5
            long r0 = (long) r0
            hc.a r6 = (hc.a) r6
            hc.a$a r2 = r6.f280391a
            r4 = 1
            int r2 = r2.n()
            long r2 = (long) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3a
            java.lang.Object r5 = r5.f280392b
            r4 = 1
            java.lang.Object r6 = r6.f280392b
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L3a
            goto L3d
        L3a:
            r5 = 7
            r5 = 0
            return r5
        L3d:
            r4 = 3
            r5 = 1
            r4 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hc.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return (this.f280392b.hashCode() * 31) + Long.hashCode(this.f280391a.n());
    }

    @Override // yc.b
    public boolean n(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(obj != null ? obj.getClass() : null, a.class)) {
            return false;
        }
        long jN = this.f280391a.n();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.planner5d.library.feed.activity.fragment.FeedListItem");
        return jN == ((long) ((a) obj).f280391a.n());
    }
}
