package com.planner5d.library.model.manager.payments;

import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nProductSkus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSkus.kt\ncom/planner5d/library/model/manager/payments/ProductSkus\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n1#2:71\n11165#3:72\n11500#3,3:73\n11165#3:76\n11500#3,3:77\n774#4:80\n865#4,2:81\n37#5,2:83\n381#6,7:85\n*S KotlinDebug\n*F\n+ 1 ProductSkus.kt\ncom/planner5d/library/model/manager/payments/ProductSkus\n*L\n34#1:72\n34#1:73,3\n37#1:76\n37#1:77,3\n43#1:80\n43#1:81,2\n43#1:83,2\n61#1:85,7\n*E\n"})
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u f193000a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f193001b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<Long, List<fd.i>> f193002c = new LinkedHashMap();

    public static final class a extends Exception {
        public a(@Nullable String str) {
            super("Missing sku: " + str);
        }
    }

    private u() {
    }

    public static /* synthetic */ void d(u uVar, long j10, String str, fd.k kVar, fd.j jVar, Integer num, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        if ((i10 & 64) != 0) {
            z11 = false;
        }
        uVar.b(j10, str, kVar, jVar, num, z10, z11);
    }

    @oj.n
    @NotNull
    public static final fd.i e(long j10, @Nullable String str) throws a {
        fd.i iVarK = f193000a.k(j10, str);
        if (iVarK != null) {
            return iVarK;
        }
        throw new a(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0004, B:6:0x0014, B:7:0x0020, B:9:0x0027, B:11:0x0031, B:16:0x003b, B:17:0x0040, B:19:0x004b), top: B:25:0x0004 }] */
    private final fd.i[] f(long j10, boolean z10) {
        fd.i[] iVarArr;
        synchronized (f193001b) {
            try {
                List<fd.i> list = f193002c.get(Long.valueOf(j10));
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        fd.i iVar = (fd.i) obj;
                        if (!z10 || iVar.j()) {
                            arrayList.add(obj);
                        }
                    }
                    iVarArr = (fd.i[]) arrayList.toArray(new fd.i[0]);
                    if (iVarArr == null) {
                        iVarArr = new fd.i[0];
                    }
                } else {
                    iVarArr = new fd.i[0];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVarArr;
    }

    @oj.n
    @NotNull
    public static final fd.i[] g(long j10) {
        return f193000a.f(j10, false);
    }

    @oj.n
    @NotNull
    public static final fd.i[] h(long j10) {
        return f193000a.f(j10, true);
    }

    @oj.n
    @NotNull
    public static final List<String> i(long j10) {
        fd.i[] iVarArrF = f193000a.f(j10, true);
        ArrayList arrayList = new ArrayList(iVarArrF.length);
        for (fd.i iVar : iVarArrF) {
            arrayList.add(iVar.c());
        }
        return arrayList;
    }

    @oj.n
    @NotNull
    public static final List<String> j(long j10) {
        fd.i[] iVarArrG = g(j10);
        ArrayList arrayList = new ArrayList(iVarArrG.length);
        for (fd.i iVar : iVarArrG) {
            arrayList.add(iVar.c());
        }
        return arrayList;
    }

    private final fd.i k(long j10, String str) {
        fd.i iVar;
        synchronized (f193001b) {
            try {
                List<fd.i> list = f193002c.get(Long.valueOf(j10));
                iVar = null;
                Object obj = null;
                if (list != null) {
                    for (Object obj2 : list) {
                        if (Intrinsics.areEqual(((fd.i) obj2).c(), str)) {
                            obj = obj2;
                            break;
                        }
                    }
                    iVar = (fd.i) obj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @l1
    public final void a() {
        f193002c.clear();
    }

    @l1
    public final void b(long j10, @NotNull String name, @Nullable fd.k kVar, @Nullable fd.j jVar, @Nullable Integer num, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        c(j10, false, false, name, 0.0f, kVar, jVar, num, z10, z11, CollectionsKt.emptyList(), new com.planner5d.library.model.a0((JSONObject) null), new com.planner5d.library.model.a0((JSONObject) null));
    }

    public final void c(long j10, boolean z10, boolean z11, @NotNull String name, float f10, @Nullable fd.k kVar, @Nullable fd.j jVar, @Nullable Integer num, boolean z12, boolean z13, @NotNull List<String> flags, @NotNull com.planner5d.library.model.a0 title, @NotNull com.planner5d.library.model.a0 description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        synchronized (f193001b) {
            try {
                if (f193000a.k(j10, name) == null) {
                    Map<Long, List<fd.i>> map = f193002c;
                    Long lValueOf = Long.valueOf(j10);
                    List<fd.i> arrayList = map.get(lValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(lValueOf, arrayList);
                    }
                    arrayList.add(new fd.i(z10, z11, name, f10, kVar, jVar, num, z12, z13, flags, title, description));
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
