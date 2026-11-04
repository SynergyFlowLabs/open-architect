package tg;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oj.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2512b f381046b = new C2512b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f381047a;

    public static final class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f381048c = new a();

        private a() {
            super("all", null);
        }
    }

    /* JADX INFO: renamed from: tg.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nScreenView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenView.kt\nio/customer/datapipelines/config/ScreenView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
    public static final class C2512b {
        public /* synthetic */ C2512b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ b c(C2512b c2512b, String str, b bVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                bVar = a.f381048c;
            }
            return c2512b.b(str, bVar);
        }

        @j
        @NotNull
        public final b a(@Nullable String str) {
            return c(this, str, null, 2, null);
        }

        @j
        @NotNull
        public final b b(@Nullable String str, @NotNull b fallback) {
            Object next;
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            if (str == null || StringsKt.w3(str)) {
                return fallback;
            }
            Iterator it = CollectionsKt.listOf((Object[]) new b[]{a.f381048c, c.f381049c}).iterator();
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

        private C2512b() {
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f381049c = new c();

        private c() {
            super("inapp", null);
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String a() {
        return this.f381047a;
    }

    @NotNull
    public String toString() {
        return "ScreenView('" + this.f381047a + "')";
    }

    private b(String str) {
        this.f381047a = str;
    }
}
