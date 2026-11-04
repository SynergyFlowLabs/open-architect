package okio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class r0 implements Comparable<r0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f335070b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f335071c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f335072a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ r0 g(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(file, z10);
        }

        public static /* synthetic */ r0 h(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.d(str, z10);
        }

        public static /* synthetic */ r0 i(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.f(path, z10);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "get")
        public final r0 a(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return g(this, file, false, 1, null);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "get")
        public final r0 b(@NotNull File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return d(string, z10);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "get")
        public final r0 c(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return h(this, str, false, 1, null);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "get")
        public final r0 d(@NotNull String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return okio.internal.e.B(str, z10);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "get")
        public final r0 e(@NotNull Path path) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return i(this, path, false, 1, null);
        }

        @oj.n
        @NotNull
        @oj.j
        @oj.i(name = "get")
        public final r0 f(@NotNull Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return d(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f335071c = separator;
    }

    public r0(@NotNull o bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f335072a = bytes;
    }

    public static /* synthetic */ r0 N(r0 r0Var, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return r0Var.E(str, z10);
    }

    public static /* synthetic */ r0 O(r0 r0Var, o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return r0Var.I(oVar, z10);
    }

    public static /* synthetic */ r0 R(r0 r0Var, r0 r0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return r0Var.M(r0Var2, z10);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "get")
    public static final r0 c(@NotNull File file) {
        return f335070b.a(file);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "get")
    public static final r0 d(@NotNull File file, boolean z10) {
        return f335070b.b(file, z10);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "get")
    public static final r0 e(@NotNull String str) {
        return f335070b.c(str);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "get")
    public static final r0 f(@NotNull String str, boolean z10) {
        return f335070b.d(str, z10);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "get")
    public static final r0 k(@NotNull Path path) {
        return f335070b.e(path);
    }

    @oj.n
    @NotNull
    @oj.j
    @oj.i(name = "get")
    public static final r0 l(@NotNull Path path, boolean z10) {
        return f335070b.f(path, z10);
    }

    @oj.i(name = "resolve")
    @NotNull
    public final r0 D(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.e.x(this, okio.internal.e.O(new l().pa(child), false), false);
    }

    @NotNull
    public final r0 E(@NotNull String child, boolean z10) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.e.x(this, okio.internal.e.O(new l().pa(child), false), z10);
    }

    @oj.i(name = "resolve")
    @NotNull
    public final r0 H(@NotNull o child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.e.x(this, okio.internal.e.O(new l().U7(child), false), false);
    }

    @NotNull
    public final r0 I(@NotNull o child, boolean z10) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.e.x(this, okio.internal.e.O(new l().U7(child), false), z10);
    }

    @oj.i(name = "resolve")
    @NotNull
    public final r0 L(@NotNull r0 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.e.x(this, child, false);
    }

    @NotNull
    public final r0 M(@NotNull r0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.e.x(this, child, z10);
    }

    @NotNull
    public final Path S() {
        Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @oj.i(name = "volumeLetter")
    @Nullable
    public final Character T() {
        int i10 = 4 & (-1);
        if (o.Y(n(), okio.internal.e.f334948a, 0, 2, null) != -1 || n().v0() < 2 || n().E(1) != 58) {
            return null;
        }
        char cE = (char) n().E(0);
        if (('a' > cE || cE >= '{') && ('A' > cE || cE >= '[')) {
            return null;
        }
        return Character.valueOf(cE);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull r0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return n().compareTo(other.n());
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof r0) && Intrinsics.areEqual(((r0) obj).n(), n());
    }

    public int hashCode() {
        return n().hashCode();
    }

    public final boolean isAbsolute() {
        return okio.internal.e.M(this) != -1;
    }

    @NotNull
    public final o n() {
        return this.f335072a;
    }

    @Nullable
    public final r0 o() {
        int iM = okio.internal.e.M(this);
        if (iM == -1) {
            return null;
        }
        return new r0(n().B0(0, iM));
    }

    @NotNull
    public final List<String> p() {
        ArrayList arrayList = new ArrayList();
        int iM = okio.internal.e.M(this);
        if (iM == -1) {
            iM = 0;
        } else if (iM < n().v0() && n().E(iM) == 92) {
            iM++;
        }
        int iV0 = n().v0();
        int i10 = iM;
        while (iM < iV0) {
            if (n().E(iM) == 47 || n().E(iM) == 92) {
                arrayList.add(n().B0(i10, iM));
                i10 = iM + 1;
            }
            iM++;
        }
        if (i10 < n().v0()) {
            arrayList.add(n().B0(i10, n().v0()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o) it.next()).G0());
        }
        return arrayList2;
    }

    @NotNull
    public final List<o> q() {
        ArrayList arrayList = new ArrayList();
        int iM = okio.internal.e.M(this);
        if (iM == -1) {
            iM = 0;
        } else if (iM < n().v0() && n().E(iM) == 92) {
            iM++;
        }
        int iV0 = n().v0();
        int i10 = iM;
        while (iM < iV0) {
            if (n().E(iM) == 47 || n().E(iM) == 92) {
                arrayList.add(n().B0(i10, iM));
                i10 = iM + 1;
            }
            iM++;
        }
        if (i10 < n().v0()) {
            arrayList.add(n().B0(i10, n().v0()));
        }
        return arrayList;
    }

    public final boolean r() {
        return okio.internal.e.M(this) == -1;
    }

    public final boolean s() {
        return okio.internal.e.M(this) == n().v0();
    }

    @oj.i(name = "name")
    @NotNull
    public final String t() {
        return v().G0();
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public String toString() {
        return n().G0();
    }

    @oj.i(name = "nameBytes")
    @NotNull
    public final o v() {
        int I = okio.internal.e.I(this);
        if (I != -1) {
            return o.C0(n(), I + 1, 0, 2, null);
        }
        return (T() == null || n().v0() != 2) ? n() : o.f335048f;
    }

    @NotNull
    public final r0 w() {
        return f335070b.d(toString(), true);
    }

    @oj.i(name = "parent")
    @Nullable
    public final r0 x() {
        if (Intrinsics.areEqual(n(), okio.internal.e.f334951d) || Intrinsics.areEqual(n(), okio.internal.e.f334948a) || Intrinsics.areEqual(n(), okio.internal.e.f334949b) || okio.internal.e.L(this)) {
            return null;
        }
        int I = okio.internal.e.I(this);
        if (I == 2 && T() != null) {
            if (n().v0() == 3) {
                return null;
            }
            return new r0(o.C0(n(), 0, 3, 1, null));
        }
        if (I == 1 && n().w0(okio.internal.e.f334949b)) {
            return null;
        }
        if (I != -1 || T() == null) {
            if (I == -1) {
                return new r0(okio.internal.e.f334951d);
            }
            return I == 0 ? new r0(o.C0(n(), 0, 1, 1, null)) : new r0(o.C0(n(), 0, I, 1, null));
        }
        if (n().v0() == 2) {
            return null;
        }
        return new r0(o.C0(n(), 0, 2, 1, null));
    }

    @NotNull
    public final r0 z(@NotNull r0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(o(), other.o())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<o> listQ = q();
        List<o> listQ2 = other.q();
        int iMin = Math.min(listQ.size(), listQ2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.areEqual(listQ.get(i10), listQ2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && n().v0() == other.n().v0()) {
            return a.h(f335070b, ".", false, 1, null);
        }
        if (listQ2.subList(i10, listQ2.size()).indexOf(okio.internal.e.f334952e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        l lVar = new l();
        o oVarK = okio.internal.e.K(other);
        if (oVarK == null && (oVarK = okio.internal.e.K(this)) == null) {
            oVarK = okio.internal.e.Q(f335071c);
        }
        int size = listQ2.size();
        for (int i11 = i10; i11 < size; i11++) {
            lVar.U7(okio.internal.e.f334952e);
            lVar.U7(oVarK);
        }
        int size2 = listQ.size();
        while (i10 < size2) {
            lVar.U7(listQ.get(i10));
            lVar.U7(oVarK);
            i10++;
        }
        return okio.internal.e.O(lVar, false);
    }
}
