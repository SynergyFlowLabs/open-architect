package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nURLBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n1563#2:373\n1634#2,3:374\n1563#2:377\n1634#2,3:378\n1563#2:381\n1634#2,3:382\n*S KotlinDebug\n*F\n+ 1 URLBuilder.kt\nio/ktor/http/URLBuilder\n*L\n78#1:373\n78#1:374,3\n81#1:377\n81#1:378,3\n83#1:381\n83#1:382,3\n*E\n"})
public final class k2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f295925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final Url f295926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f295927m = 256;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f295928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f295929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f295930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private s2 f295931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f295932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f295933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private String f295934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private List<String> f295935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private y1 f295936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private y1 f295937j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f295925k = aVar;
        f295926l = w2.f(l2.a(aVar));
    }

    public k2() {
        this(null, null, 0, null, null, null, null, null, false, 511, null);
    }

    private final void a() {
        if (this.f295928a.length() > 0) {
            return;
        }
        if (!Intrinsics.areEqual(o().getName(), com.facebook.share.internal.k.f101891c)) {
            Url url = f295926l;
            this.f295928a = url.u();
            if (this.f295931d == null) {
                this.f295931d = url.B();
            }
            if (this.f295930c == 0) {
                B(url.E());
            }
        }
    }

    public final void A(@NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<String> list = value;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h.t((String) it.next()));
        }
        this.f295935h = arrayList;
    }

    public final void B(int i10) {
        if (i10 >= 0 && i10 < 65536) {
            this.f295930c = i10;
            return;
        }
        throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i10).toString());
    }

    public final void C(@NotNull s2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f295931d = value;
    }

    public final void D(@Nullable s2 s2Var) {
        this.f295931d = s2Var;
    }

    public final void E(boolean z10) {
        this.f295929b = z10;
    }

    public final void F(@Nullable String str) {
        String strN = null;
        if (str != null) {
            int i10 = 2 | 1;
            strN = h.n(str, false, 1, null);
        }
        this.f295932e = strN;
    }

    @NotNull
    public final Url b() {
        a();
        return new Url(this.f295931d, this.f295928a, this.f295930c, m(), this.f295937j.build(), i(), r(), l(), this.f295929b, c());
    }

    @NotNull
    public final String c() {
        a();
        String string = ((StringBuilder) n2.m(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String d() {
        return this.f295934g;
    }

    @NotNull
    public final y1 e() {
        return this.f295936i;
    }

    @Nullable
    public final String f() {
        return this.f295933f;
    }

    @NotNull
    public final List<String> g() {
        return this.f295935h;
    }

    @Nullable
    public final String h() {
        return this.f295932e;
    }

    @NotNull
    public final String i() {
        return h.k(this.f295934g, 0, 0, false, null, 15, null);
    }

    @NotNull
    public final String j() {
        return this.f295928a;
    }

    @NotNull
    public final y1 k() {
        return this.f295937j;
    }

    @Nullable
    public final String l() {
        String str = this.f295933f;
        if (str == null) {
            return null;
        }
        int i10 = 7 ^ 0;
        return h.i(str, 0, 0, null, 7, null);
    }

    @NotNull
    public final List<String> m() {
        List<String> list = this.f295935h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f295930c;
    }

    @NotNull
    public final s2 o() {
        s2 s2Var = this.f295931d;
        return s2Var == null ? s2.f296093c.c() : s2Var;
    }

    @Nullable
    public final s2 p() {
        return this.f295931d;
    }

    public final boolean q() {
        return this.f295929b;
    }

    @Nullable
    public final String r() {
        String str = this.f295932e;
        if (str != null) {
            return h.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void s(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f295934g = str;
    }

    public final void t(@NotNull y1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f295936i = value;
        this.f295937j = new f3(value);
    }

    @NotNull
    public String toString() {
        String string = ((StringBuilder) n2.m(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void u(@Nullable String str) {
        this.f295933f = str;
    }

    public final void v(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f295935h = list;
    }

    public final void w(@Nullable String str) {
        this.f295932e = str;
    }

    public final void x(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int i10 = 1 << 0;
        this.f295934g = h.v(value, false, false, null, 7, null);
    }

    public final void y(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f295928a = str;
    }

    public final void z(@Nullable String str) {
        this.f295933f = str != null ? h.n(str, false, 1, null) : null;
    }

    public k2(@Nullable s2 s2Var, @NotNull String host, int i10, @Nullable String str, @Nullable String str2, @NotNull List<String> pathSegments, @NotNull x1 parameters, @NotNull String fragment, boolean z10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f295928a = host;
        this.f295929b = z10;
        this.f295930c = i10;
        this.f295931d = s2Var;
        this.f295932e = str != null ? h.n(str, false, 1, null) : null;
        this.f295933f = str2 != null ? h.n(str2, false, 1, null) : null;
        this.f295934g = h.v(fragment, false, false, null, 7, null);
        List<String> list = pathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h.t((String) it.next()));
        }
        this.f295935h = arrayList;
        y1 y1VarE = g3.e(parameters);
        this.f295936i = y1VarE;
        this.f295937j = new f3(y1VarE);
    }

    public /* synthetic */ k2(s2 s2Var, String str, int i10, String str2, String str3, List list, x1 x1Var, String str4, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : s2Var, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? x1.f296128b.b() : x1Var, (i11 & 128) != 0 ? "" : str4, (i11 & 256) != 0 ? false : z10);
    }
}
