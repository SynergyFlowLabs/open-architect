package okio.internal;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
@oj.i(name = "-Path")
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final okio.o f334948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final okio.o f334949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final okio.o f334950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final okio.o f334951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final okio.o f334952e;

    static {
        okio.o.a aVar = okio.o.f335046d;
        f334948a = aVar.l("/");
        f334949b = aVar.l("\\");
        f334950c = aVar.l("/\\");
        f334951d = aVar.l(".");
        f334952e = aVar.l("..");
    }

    @NotNull
    public static final List<okio.o> A(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int iM = M(r0Var);
        if (iM == -1) {
            iM = 0;
        } else if (iM < r0Var.n().v0() && r0Var.n().E(iM) == 92) {
            iM++;
        }
        int iV0 = r0Var.n().v0();
        int i10 = iM;
        while (iM < iV0) {
            if (r0Var.n().E(iM) == 47 || r0Var.n().E(iM) == 92) {
                arrayList.add(r0Var.n().B0(i10, iM));
                i10 = iM + 1;
            }
            iM++;
        }
        if (i10 < r0Var.n().v0()) {
            arrayList.add(r0Var.n().B0(i10, r0Var.n().v0()));
        }
        return arrayList;
    }

    @NotNull
    public static final r0 B(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return O(new okio.l().pa(str), z10);
    }

    @NotNull
    public static final String C(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.n().G0();
    }

    @Nullable
    public static final Character D(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        if (okio.o.Y(r0Var.n(), f334948a, 0, 2, null) != -1 || r0Var.n().v0() < 2 || r0Var.n().E(1) != 58) {
            return null;
        }
        char cE = (char) r0Var.n().E(0);
        if (('a' > cE || cE >= '{') && ('A' > cE || cE >= '[')) {
            return null;
        }
        return Character.valueOf(cE);
    }

    private static /* synthetic */ void E() {
    }

    private static /* synthetic */ void F() {
    }

    private static /* synthetic */ void G() {
    }

    private static /* synthetic */ void H() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I(r0 r0Var) {
        int iH0 = okio.o.h0(r0Var.n(), f334948a, 0, 2, null);
        return iH0 != -1 ? iH0 : okio.o.h0(r0Var.n(), f334949b, 0, 2, null);
    }

    private static /* synthetic */ void J() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.o K(r0 r0Var) {
        okio.o oVarN = r0Var.n();
        okio.o oVar = f334948a;
        if (okio.o.Y(oVarN, oVar, 0, 2, null) != -1) {
            return oVar;
        }
        okio.o oVarN2 = r0Var.n();
        okio.o oVar2 = f334949b;
        if (okio.o.Y(oVarN2, oVar2, 0, 2, null) != -1) {
            return oVar2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L(r0 r0Var) {
        return r0Var.n().z(f334952e) && (r0Var.n().v0() == 2 || r0Var.n().n0(r0Var.n().v0() + (-3), f334948a, 0, 1) || r0Var.n().n0(r0Var.n().v0() + (-3), f334949b, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(r0 r0Var) {
        if (r0Var.n().v0() == 0) {
            return -1;
        }
        if (r0Var.n().E(0) == 47) {
            return 1;
        }
        if (r0Var.n().E(0) == 92) {
            if (r0Var.n().v0() <= 2 || r0Var.n().E(1) != 92) {
                return 1;
            }
            int iV = r0Var.n().V(f334949b, 2);
            return iV == -1 ? r0Var.n().v0() : iV;
        }
        if (r0Var.n().v0() > 2 && r0Var.n().E(1) == 58 && r0Var.n().E(2) == 92) {
            char cE = (char) r0Var.n().E(0);
            if ('a' <= cE && cE < '{') {
                return 3;
            }
            if ('A' <= cE && cE < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean N(okio.l lVar, okio.o oVar) {
        if (!Intrinsics.areEqual(oVar, f334949b) || lVar.size() < 2 || lVar.I(1L) != 58) {
            return false;
        }
        char cI = (char) lVar.I(0L);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final r0 O(@NotNull okio.l lVar, boolean z10) throws EOFException {
        okio.o oVar;
        okio.o oVarE5;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        okio.l lVar2 = new okio.l();
        okio.o oVarP = null;
        int i10 = 0;
        while (true) {
            if (!lVar.u3(0L, f334948a)) {
                oVar = f334949b;
                if (!lVar.u3(0L, oVar)) {
                    break;
                }
            }
            byte b10 = lVar.readByte();
            if (oVarP == null) {
                oVarP = P(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.areEqual(oVarP, oVar);
        if (z11) {
            Intrinsics.checkNotNull(oVarP);
            lVar2.U7(oVarP);
            lVar2.U7(oVarP);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(oVarP);
            lVar2.U7(oVarP);
        } else {
            long jP2 = lVar.P2(f334950c);
            if (oVarP == null) {
                oVarP = jP2 == -1 ? Q(r0.f335071c) : P(lVar.I(jP2));
            }
            if (N(lVar, oVarP)) {
                if (jP2 == 2) {
                    lVar2.Ga(lVar, 3L);
                } else {
                    lVar2.Ga(lVar, 2L);
                }
            }
        }
        boolean z12 = lVar2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!lVar.y1()) {
            long jP3 = lVar.P2(f334950c);
            if (jP3 == -1) {
                oVarE5 = lVar.r7();
            } else {
                oVarE5 = lVar.E5(jP3);
                lVar.readByte();
            }
            okio.o oVar2 = f334952e;
            if (Intrinsics.areEqual(oVarE5, oVar2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), oVar2)))) {
                        arrayList.add(oVarE5);
                    } else if (!z11 || arrayList.size() != 1) {
                        CollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(oVarE5, f334951d) && !Intrinsics.areEqual(oVarE5, okio.o.f335048f)) {
                arrayList.add(oVarE5);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                lVar2.U7(oVarP);
            }
            lVar2.U7((okio.o) arrayList.get(i11));
        }
        if (lVar2.size() == 0) {
            lVar2.U7(f334951d);
        }
        return new r0(lVar2.r7());
    }

    private static final okio.o P(byte b10) {
        if (b10 == 47) {
            return f334948a;
        }
        if (b10 == 92) {
            return f334949b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.o Q(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return f334948a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f334949b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    public static final int j(@NotNull r0 r0Var, @NotNull r0 other) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return r0Var.n().compareTo(other.n());
    }

    public static final boolean k(@NotNull r0 r0Var, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return (obj instanceof r0) && Intrinsics.areEqual(((r0) obj).n(), r0Var.n());
    }

    public static final int l(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.n().hashCode();
    }

    public static final boolean m(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return M(r0Var) != -1;
    }

    public static final boolean n(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return M(r0Var) == -1;
    }

    public static final boolean o(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return M(r0Var) == r0Var.n().v0();
    }

    @NotNull
    public static final String p(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.v().G0();
    }

    @NotNull
    public static final okio.o q(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        int I = I(r0Var);
        if (I != -1) {
            return okio.o.C0(r0Var.n(), I + 1, 0, 2, null);
        }
        return (r0Var.T() == null || r0Var.n().v0() != 2) ? r0Var.n() : okio.o.f335048f;
    }

    @NotNull
    public static final r0 r(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0.f335070b.d(r0Var.toString(), true);
    }

    @Nullable
    public static final r0 s(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        if (!Intrinsics.areEqual(r0Var.n(), f334951d) && !Intrinsics.areEqual(r0Var.n(), f334948a) && !Intrinsics.areEqual(r0Var.n(), f334949b) && !L(r0Var)) {
            int I = I(r0Var);
            if (I == 2 && r0Var.T() != null) {
                if (r0Var.n().v0() == 3) {
                    return null;
                }
                return new r0(okio.o.C0(r0Var.n(), 0, 3, 1, null));
            }
            if (I == 1 && r0Var.n().w0(f334949b)) {
                return null;
            }
            if (I != -1 || r0Var.T() == null) {
                if (I == -1) {
                    return new r0(f334951d);
                }
                return I == 0 ? new r0(okio.o.C0(r0Var.n(), 0, 1, 1, null)) : new r0(okio.o.C0(r0Var.n(), 0, I, 1, null));
            }
            if (r0Var.n().v0() == 2) {
                return null;
            }
            return new r0(okio.o.C0(r0Var.n(), 0, 2, 1, null));
        }
        return null;
    }

    @NotNull
    public static final r0 t(@NotNull r0 r0Var, @NotNull r0 other) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(r0Var.o(), other.o())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + r0Var + " and " + other).toString());
        }
        List<okio.o> listQ = r0Var.q();
        List<okio.o> listQ2 = other.q();
        int iMin = Math.min(listQ.size(), listQ2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.areEqual(listQ.get(i10), listQ2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && r0Var.n().v0() == other.n().v0()) {
            return r0.a.h(r0.f335070b, ".", false, 1, null);
        }
        if (listQ2.subList(i10, listQ2.size()).indexOf(f334952e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + r0Var + " and " + other).toString());
        }
        okio.l lVar = new okio.l();
        okio.o oVarK = K(other);
        if (oVarK == null && (oVarK = K(r0Var)) == null) {
            oVarK = Q(r0.f335071c);
        }
        int size = listQ2.size();
        for (int i11 = i10; i11 < size; i11++) {
            lVar.U7(f334952e);
            lVar.U7(oVarK);
        }
        int size2 = listQ.size();
        while (i10 < size2) {
            lVar.U7(listQ.get(i10));
            lVar.U7(oVarK);
            i10++;
        }
        return O(lVar, false);
    }

    @NotNull
    public static final r0 u(@NotNull r0 r0Var, @NotNull String child, boolean z10) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return x(r0Var, O(new okio.l().pa(child), false), z10);
    }

    @NotNull
    public static final r0 v(@NotNull r0 r0Var, @NotNull okio.l child, boolean z10) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return x(r0Var, O(child, false), z10);
    }

    @NotNull
    public static final r0 w(@NotNull r0 r0Var, @NotNull okio.o child, boolean z10) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return x(r0Var, O(new okio.l().U7(child), false), z10);
    }

    @NotNull
    public static final r0 x(@NotNull r0 r0Var, @NotNull r0 child, boolean z10) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.T() != null) {
            return child;
        }
        okio.o oVarK = K(r0Var);
        if (oVarK == null && (oVarK = K(child)) == null) {
            oVarK = Q(r0.f335071c);
        }
        okio.l lVar = new okio.l();
        lVar.U7(r0Var.n());
        if (lVar.size() > 0) {
            lVar.U7(oVarK);
        }
        lVar.U7(child.n());
        return O(lVar, z10);
    }

    @Nullable
    public static final r0 y(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        int iM = M(r0Var);
        if (iM != -1) {
            return new r0(r0Var.n().B0(0, iM));
        }
        int i10 = 7 >> 0;
        return null;
    }

    @NotNull
    public static final List<String> z(@NotNull r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int iM = M(r0Var);
        if (iM == -1) {
            iM = 0;
        } else if (iM < r0Var.n().v0() && r0Var.n().E(iM) == 92) {
            iM++;
        }
        int iV0 = r0Var.n().v0();
        int i10 = iM;
        while (iM < iV0) {
            if (r0Var.n().E(iM) == 47 || r0Var.n().E(iM) == 92) {
                arrayList.add(r0Var.n().B0(i10, iM));
                i10 = iM + 1;
            }
            iM++;
        }
        if (i10 < r0Var.n().v0()) {
            arrayList.add(r0Var.n().B0(i10, r0Var.n().v0()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((okio.o) it.next()).G0());
        }
        return arrayList2;
    }
}
