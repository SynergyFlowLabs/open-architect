package jh;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f307437b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f307438a;

    @SourceDebugExtension({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nio/customer/sdk/data/model/Region$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, b bVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                bVar = c.f307440c;
            }
            return aVar.a(str, bVar);
        }

        @NotNull
        public final b a(@Nullable String str, @NotNull b fallback) {
            Object next;
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            if (str == null || StringsKt.w3(str)) {
                return fallback;
            }
            Iterator it = CollectionsKt.listOf((Object[]) new b[]{c.f307440c, C2241b.f307439c}).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.N1(((b) next).a(), str, true));
            b bVar = (b) next;
            return bVar == null ? fallback : bVar;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: jh.b$b, reason: collision with other inner class name */
    public static final class C2241b extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C2241b f307439c = new C2241b();

        private C2241b() {
            super("eu", null);
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f307440c = new c();

        private c() {
            super("us", null);
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String a() {
        return this.f307438a;
    }

    private b(String str) {
        this.f307438a = str;
    }
}
