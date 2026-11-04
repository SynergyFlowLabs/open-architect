package io.ktor.http.cio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f295577e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final n f295578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final n f295579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final n f295580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final io.ktor.http.cio.internals.c<Pair<String, n>> f295581i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f295582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f295583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f295584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<String> f295585d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(char c10, int i10) {
            return false;
        }

        private final n h(CharSequence charSequence) {
            int length = charSequence.length();
            n nVarD = null;
            ArrayList arrayList = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                while (true) {
                    char cCharAt = charSequence.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != ',') {
                        i11 = i10;
                        i10 = i11;
                        break;
                    }
                    i10++;
                    if (i10 >= length) {
                        i10 = i10;
                        break;
                    }
                }
                while (i10 < length) {
                    char cCharAt2 = charSequence.charAt(i10);
                    if (cCharAt2 == ' ' || cCharAt2 == ',') {
                        break;
                    }
                    i10++;
                }
                Pair pair = (Pair) CollectionsKt.singleOrNull(n.f295581i.b(charSequence, i11, i10, true, new Function2() { // from class: io.ktor.http.cio.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Boolean.valueOf(n.a.i(((Character) obj).charValue(), ((Integer) obj2).intValue()));
                    }
                }));
                if (pair == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(i11, i10).toString());
                } else if (nVarD == null) {
                    nVarD = (n) pair.getSecond();
                } else {
                    boolean z10 = true;
                    boolean z11 = nVarD.h() || ((n) pair.getSecond()).h();
                    boolean z12 = nVarD.j() || ((n) pair.getSecond()).j();
                    if (!nVarD.k() && !((n) pair.getSecond()).k()) {
                        z10 = false;
                    }
                    nVarD = new n(z11, z12, z10, CollectionsKt.emptyList());
                }
            }
            if (nVarD == null) {
                nVarD = d();
            }
            return arrayList == null ? nVarD : new n(nVarD.h(), nVarD.j(), nVarD.k(), arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(char c10, int i10) {
            return false;
        }

        @NotNull
        public final n c() {
            return n.f295578f;
        }

        @NotNull
        public final n d() {
            return n.f295579g;
        }

        @NotNull
        public final n e() {
            return n.f295580h;
        }

        @Nullable
        public final n f(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            List listC = io.ktor.http.cio.internals.c.c(n.f295581i, charSequence, 0, 0, true, new Function2() { // from class: io.ktor.http.cio.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(n.a.g(((Character) obj).charValue(), ((Integer) obj2).intValue()));
                }
            }, 6, null);
            if (listC.size() != 1) {
                return h(charSequence);
            }
            int i10 = 4 | 0;
            return (n) ((Pair) listC.get(0)).getSecond();
        }

        private a() {
        }
    }

    static {
        boolean z10 = false;
        n nVar = new n(true, z10, false, null, 14, null);
        f295578f = nVar;
        boolean z11 = false;
        n nVar2 = new n(z10, true, z11, null, 13, null);
        f295579g = nVar2;
        n nVar3 = new n(false, z11, true, null, 11, null);
        f295580h = nVar3;
        f295581i = io.ktor.http.cio.internals.c.f295545b.d(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("close", nVar), TuplesKt.to("keep-alive", nVar2), TuplesKt.to("upgrade", nVar3)}), new Function1() { // from class: io.ktor.http.cio.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(n.l((Pair) obj));
            }
        }, new Function2() { // from class: io.ktor.http.cio.k
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Character.valueOf(n.m((Pair) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    public n() {
        this(false, false, false, null, 15, null);
    }

    private final String g() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList(this.f295585d.size() + 3);
        if (this.f295582a) {
            arrayList.add("close");
        }
        if (this.f295583b) {
            arrayList.add("keep-alive");
        }
        if (this.f295584c) {
            arrayList.add(com.google.common.net.d.N);
        }
        if (!this.f295585d.isEmpty()) {
            arrayList.addAll(this.f295585d);
        }
        CollectionsKt___CollectionsKt.joinTo(arrayList, sb2, (124 & 2) != 0 ? ", " : null, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((String) it.getFirst()).length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final char m(Pair t10, int i10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        return ((String) t10.getFirst()).charAt(i10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f295582a == nVar.f295582a && this.f295583b == nVar.f295583b && this.f295584c == nVar.f295584c && Intrinsics.areEqual(this.f295585d, nVar.f295585d);
    }

    public final boolean h() {
        return this.f295582a;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f295582a) * 31) + Boolean.hashCode(this.f295583b)) * 31) + Boolean.hashCode(this.f295584c)) * 31) + this.f295585d.hashCode();
    }

    @NotNull
    public final List<String> i() {
        return this.f295585d;
    }

    public final boolean j() {
        return this.f295583b;
    }

    public final boolean k() {
        return this.f295584c;
    }

    @NotNull
    public String toString() {
        if (!this.f295585d.isEmpty()) {
            return g();
        }
        boolean z10 = this.f295582a;
        if (z10 && !this.f295583b && !this.f295584c) {
            return "close";
        }
        if (z10 || !this.f295583b || this.f295584c) {
            return (!z10 && this.f295583b && this.f295584c) ? "keep-alive, Upgrade" : g();
        }
        return "keep-alive";
    }

    public n(boolean z10, boolean z11, boolean z12, @NotNull List<String> extraOptions) {
        Intrinsics.checkNotNullParameter(extraOptions, "extraOptions");
        this.f295582a = z10;
        this.f295583b = z11;
        this.f295584c = z12;
        this.f295585d = extraOptions;
    }

    public /* synthetic */ n(boolean z10, boolean z11, boolean z12, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }
}
