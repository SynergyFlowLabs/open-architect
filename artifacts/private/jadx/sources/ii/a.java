package ii;

import io.ktor.http.s0;
import io.ktor.http.t0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nAcceptEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcceptEncoding.kt\nio/ktor/http/header/AcceptEncoding\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1761#2,3:133\n*S KotlinDebug\n*F\n+ 1 AcceptEncoding.kt\nio/ktor/http/header/AcceptEncoding\n*L\n102#1:133,3\n*E\n"})
public final class a extends t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C1927a f287229e = new C1927a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final a f287230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final a f287231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f287232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final a f287233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final a f287234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final a f287235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final a f287236l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f287237d;

    /* JADX INFO: renamed from: ii.a$a, reason: collision with other inner class name */
    public static final class C1927a {
        public /* synthetic */ C1927a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a() {
            return a.f287236l;
        }

        @NotNull
        public final a b() {
            return a.f287233i;
        }

        @NotNull
        public final a c() {
            return a.f287231g;
        }

        @NotNull
        public final a d() {
            return a.f287232h;
        }

        @NotNull
        public final a e() {
            return a.f287230f;
        }

        @NotNull
        public final a f() {
            return a.f287235k;
        }

        @NotNull
        public final a g() {
            return a.f287234j;
        }

        @NotNull
        public final String h(@NotNull a... encodings) {
            Intrinsics.checkNotNullParameter(encodings, "encodings");
            return ArraysKt.joinToString$default(encodings, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }

        private C1927a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 2;
        f287230f = new a("gzip", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f287231g = new a("compress", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f287232h = new a("deflate", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f287233i = new a("br", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f287234j = new a("zstd", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f287235k = new a("identity", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f287236l = new a("*", 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<s0>) ((i10 & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (StringsKt.N1(this.f287237d, aVar.f287237d, true) && Intrinsics.areEqual(b(), aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String lowerCase = this.f287237d.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase.hashCode() + (b().hashCode() * 31);
    }

    @NotNull
    public final String k() {
        return this.f287237d;
    }

    public final boolean l(@NotNull a pattern) {
        boolean zN1;
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (!Intrinsics.areEqual(pattern.f287237d, "*") && !StringsKt.N1(pattern.f287237d, this.f287237d, true)) {
            return false;
        }
        for (s0 s0Var : pattern.b()) {
            String strA = s0Var.a();
            String strB = s0Var.b();
            if (!Intrinsics.areEqual(strA, "*")) {
                String strC = c(strA);
                zN1 = Intrinsics.areEqual(strB, "*") ? strC != null : StringsKt.N1(strC, strB, true);
            } else if (!Intrinsics.areEqual(strB, "*")) {
                List<s0> listB = b();
                if (!(listB instanceof Collection) || !listB.isEmpty()) {
                    Iterator<T> it = listB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (StringsKt.N1(((s0) it.next()).h(), strB, true)) {
                            }
                        }
                    }
                }
            }
            if (!zN1) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final a m(double d10) {
        return Intrinsics.areEqual(String.valueOf(d10), c("q")) ? this : new a(this.f287237d, d10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String acceptEncoding, @NotNull List<s0> parameters) {
        super(acceptEncoding, parameters);
        Intrinsics.checkNotNullParameter(acceptEncoding, "acceptEncoding");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f287237d = acceptEncoding;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull String acceptEncoding, double d10) {
        this(acceptEncoding, (List<s0>) CollectionsKt.listOf(new s0("q", String.valueOf(d10))));
        Intrinsics.checkNotNullParameter(acceptEncoding, "acceptEncoding");
    }
}
