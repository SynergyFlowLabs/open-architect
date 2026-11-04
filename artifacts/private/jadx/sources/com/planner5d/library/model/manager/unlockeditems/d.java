package com.planner5d.library.model.manager.unlockeditems;

import android.text.TextUtils;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.c0;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.n5;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.e0;
import ij.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@f
@SourceDebugExtension({"SMAP\nUnlockedItemManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnlockedItemManager.kt\ncom/planner5d/library/model/manager/unlockeditems/UnlockedItemManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,62:1\n116#2,8:63\n125#2,2:72\n116#2,11:74\n116#2,11:94\n1#3:71\n774#4:85\n865#4,2:86\n1557#4:88\n1628#4,3:89\n37#5,2:92\n*S KotlinDebug\n*F\n+ 1 UnlockedItemManager.kt\ncom/planner5d/library/model/manager/unlockeditems/UnlockedItemManager\n*L\n26#1:63,8\n26#1:72,2\n43#1:74,11\n57#1:94,11\n48#1:85\n48#1:86,2\n48#1:88\n48#1:89,3\n53#1:92,2\n*E\n"})
public final class d implements n5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f222288i = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p f222289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f222290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f222291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<c0> f222292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f222293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String[] f222294h;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.UnlockedItemManager", f = "UnlockedItemManager.kt", i = {0, 0, 1, 1}, l = {com.planner5d.library.engine.input.f.b.V, 28}, m = "getListOld", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222297c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222299e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222297c = obj;
            this.f222299e |= Integer.MIN_VALUE;
            return d.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.UnlockedItemManager", f = "UnlockedItemManager.kt", i = {0, 0, 0, 1}, l = {48, 51}, m = "getUnlocked", n = {"this", "withEdit", "result", "result"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f222303d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f222304e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f222306g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222304e = obj;
            this.f222306g |= Integer.MIN_VALUE;
            return d.this.g(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.UnlockedItemManager", f = "UnlockedItemManager.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2}, l = {com.planner5d.library.engine.input.f.b.V, com.planner5d.library.engine.input.f.b.f160710n, com.planner5d.library.engine.input.f.b.D0}, m = "isUnlocked", n = {"this", "id", "$this$withLock_u24default$iv", "withEdit", "trialCurrentlyUnlocked", "this", "id", "$this$withLock_u24default$iv", "id", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f222309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f222310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f222311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f222312f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f222314h;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222312f = obj;
            this.f222314h |= Integer.MIN_VALUE;
            return d.this.s(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.unlockeditems.d$d, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.UnlockedItemManager", f = "UnlockedItemManager.kt", i = {0}, l = {33}, m = "load", n = {"this"}, s = {"L$0"})
    static final class C1631d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f222316b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f222318d;

        C1631d(kotlin.coroutines.d<? super C1631d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222316b = obj;
            this.f222318d |= Integer.MIN_VALUE;
            return d.this.f(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.unlockeditems.UnlockedItemManager", f = "UnlockedItemManager.kt", i = {0, 0, 1}, l = {com.planner5d.library.engine.input.f.b.V, 43}, m = "loadWithLock", n = {"this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f222319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f222320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f222321c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222323e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222321c = obj;
            this.f222323e |= Integer.MIN_VALUE;
            return d.this.h(this);
        }
    }

    @ij.a
    public d(@NotNull p preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f222289c = preferences;
        this.f222290d = g.b(false, 1, null);
        this.f222291e = g.b(false, 1, null);
        this.f222292f = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(kotlin.coroutines.d<? super String[]> dVar) throws Throwable {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar3;
        String[] strArrSplit;
        d dVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f222299e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f222299e = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f222297c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f222299e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar2 = this.f222291e;
                aVar.f222295a = this;
                aVar.f222296b = aVar2;
                aVar.f222299e = 1;
                if (aVar2.h(null, aVar) != objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (kotlinx.coroutines.sync.a) aVar.f222296b;
                dVar2 = (d) aVar.f222295a;
                try {
                    ResultKt.m(obj);
                    strArrSplit = TextUtils.split(e0.m((String) obj), ";");
                    dVar2.f222294h = strArrSplit;
                    aVar2 = aVar3;
                    aVar2.i(null);
                    Intrinsics.checkNotNull(strArrSplit);
                    return strArrSplit;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar3.i(null);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a aVar4 = (kotlinx.coroutines.sync.a) aVar.f222296b;
            d dVar3 = (d) aVar.f222295a;
            ResultKt.m(obj);
            aVar2 = aVar4;
            this = dVar3;
            strArrSplit = this.f222294h;
            if (strArrSplit == null) {
                p pVar = this.f222289c;
                r rVar = r.purchasesWithAds;
                aVar.f222295a = this;
                aVar.f222296b = aVar2;
                aVar.f222299e = 2;
                Object objU = pVar.u(rVar, "", aVar);
                if (objU != objL) {
                    dVar2 = this;
                    aVar3 = aVar2;
                    obj = objU;
                    strArrSplit = TextUtils.split(e0.m((String) obj), ";");
                    dVar2.f222294h = strArrSplit;
                    aVar2 = aVar3;
                }
                return objL;
            }
            aVar2.i(null);
            Intrinsics.checkNotNull(strArrSplit);
            return strArrSplit;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar5 = aVar2;
            th2 = th4;
            aVar3 = aVar5;
            aVar3.i(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object f(kotlin.coroutines.d<? super List<c0>> dVar) throws JSONException {
        C1631d c1631d;
        if (dVar instanceof C1631d) {
            c1631d = (C1631d) dVar;
            int i10 = c1631d.f222318d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1631d.f222318d = i10 - Integer.MIN_VALUE;
            } else {
                c1631d = new C1631d(dVar);
            }
        } else {
            c1631d = new C1631d(dVar);
        }
        Object objU = c1631d.f222316b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c1631d.f222318d;
        if (i11 == 0) {
            ResultKt.m(objU);
            if (!this.f222293g) {
                p pVar = this.f222289c;
                r rVar = r.unlocksFull;
                c1631d.f222315a = this;
                c1631d.f222318d = 1;
                objU = pVar.u(rVar, null, c1631d);
                if (objU == objL) {
                    return objL;
                }
            }
            return this.f222292f;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this = (d) c1631d.f222315a;
        ResultKt.m(objU);
        String str = (String) objU;
        JSONArray jSONArray = str != null ? new JSONArray(str) : new JSONArray();
        this.f222292f.clear();
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            List<c0> list = this.f222292f;
            JSONObject jSONObject = jSONArray.getJSONObject(i12);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            list.add(new c0(jSONObject));
        }
        this.f222293g = true;
        return this.f222292f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object h(kotlin.coroutines.d<? super List<c0>> dVar) throws Throwable {
        e eVar;
        kotlinx.coroutines.sync.a aVar;
        Throwable th2;
        kotlinx.coroutines.sync.a aVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f222323e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f222323e = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f222321c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f222323e;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f222290d;
                eVar.f222319a = this;
                eVar.f222320b = aVar;
                eVar.f222323e = 1;
                if (aVar.h(null, eVar) == objL) {
                }
                return objL;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kotlinx.coroutines.sync.a) eVar.f222319a;
                try {
                    ResultKt.m(obj);
                    List list = (List) obj;
                    aVar2.i(null);
                    return list;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.i(null);
                    throw th2;
                }
            }
            kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) eVar.f222320b;
            d dVar2 = (d) eVar.f222319a;
            ResultKt.m(obj);
            aVar = aVar3;
            this = dVar2;
            eVar.f222319a = aVar;
            eVar.f222320b = null;
            eVar.f222323e = 2;
            Object objF = this.f(eVar);
            if (objF != objL) {
                kotlinx.coroutines.sync.a aVar4 = aVar;
                obj = objF;
                aVar2 = aVar4;
                List list2 = (List) obj;
                aVar2.i(null);
                return list2;
            }
            return objL;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar5 = aVar;
            th2 = th4;
            aVar2 = aVar5;
            aVar2.i(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.planner5d.library.model.manager.n5
    @Nullable
    public Object g(@Nullable Boolean bool, @NotNull kotlin.coroutines.d<? super String[]> dVar) throws Throwable {
        b bVar;
        List arrayList;
        Object objH;
        d dVar2;
        List list;
        List list2;
        Object objD;
        Collection collection;
        List list3;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f222306g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f222306g = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f222304e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f222306g;
        int i12 = 4 | 0;
        if (i11 != 0) {
            if (i11 == 1) {
                list = (List) bVar.f222303d;
                List list4 = (List) bVar.f222302c;
                Boolean bool2 = (Boolean) bVar.f222301b;
                dVar2 = (d) bVar.f222300a;
                ResultKt.m(obj);
                arrayList = list4;
                bool = bool2;
                objH = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) bVar.f222301b;
                list3 = (List) bVar.f222300a;
                ResultKt.m(obj);
            }
            CollectionsKt.addAll(collection, (Object[]) obj);
            arrayList = list3;
            return arrayList.toArray(new String[0]);
        }
        ResultKt.m(obj);
        arrayList = new ArrayList();
        if (Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.b.a(false))) {
            if (!Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
                list2 = arrayList;
                bVar.f222300a = arrayList;
                bVar.f222301b = list2;
                bVar.f222302c = null;
                bVar.f222303d = null;
                bVar.f222306g = 2;
                objD = this.d(bVar);
                if (objD != objL) {
                    List list5 = arrayList;
                    obj = objD;
                    collection = list2;
                    list3 = list5;
                    CollectionsKt.addAll(collection, (Object[]) obj);
                    arrayList = list3;
                }
            }
            return arrayList.toArray(new String[0]);
        }
        bVar.f222300a = this;
        bVar.f222301b = bool;
        bVar.f222302c = arrayList;
        bVar.f222303d = arrayList;
        bVar.f222306g = 1;
        objH = h(bVar);
        if (objH != objL) {
            dVar2 = this;
            list = arrayList;
        }
        return objL;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) objH) {
            if (((c0) obj2).i()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((c0) it.next()).h());
        }
        list.addAll(arrayList3);
        this = dVar2;
        if (!Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
            list2 = arrayList;
            bVar.f222300a = arrayList;
            bVar.f222301b = list2;
            bVar.f222302c = null;
            bVar.f222303d = null;
            bVar.f222306g = 2;
            objD = this.d(bVar);
            if (objD != objL) {
                List list6 = arrayList;
                obj = objD;
                collection = list2;
                list3 = list6;
                CollectionsKt.addAll(collection, (Object[]) obj);
                arrayList = list3;
            }
            return objL;
        }
        return arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:15:0x0037, B:45:0x00d4, B:46:0x00db, B:48:0x00e1, B:52:0x00f8, B:54:0x00fc, B:59:0x0107, B:22:0x0057, B:34:0x00ad), top: B:64:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:15:0x0037, B:45:0x00d4, B:46:0x00db, B:48:0x00e1, B:52:0x00f8, B:54:0x00fc, B:59:0x0107, B:22:0x0057, B:34:0x00ad), top: B:64:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.planner5d.library.model.manager.unlockeditems.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.planner5d.library.model.manager.unlockeditems.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.planner5d.library.model.manager.unlockeditems.d] */
    @Override // com.planner5d.library.model.manager.n5
    @Nullable
    public Object s(@NotNull String str, boolean z10, boolean z11, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
        c cVar;
        ?? r10;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        ?? r11;
        ?? r12;
        kotlinx.coroutines.sync.a aVar3;
        Object objF;
        kotlinx.coroutines.sync.a aVar4;
        kotlinx.coroutines.sync.a aVar5;
        Iterator it;
        Object next;
        c0 c0Var;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f222314h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f222314h = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f222312f;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f222314h;
        boolean z12 = true;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f222290d;
                cVar.f222307a = this;
                cVar.f222308b = str;
                cVar.f222309c = aVar;
                cVar.f222310d = z10;
                cVar.f222311e = z11;
                cVar.f222314h = 1;
                if (aVar.h(null, cVar) == objL) {
                    this = this;
                    aVar2 = aVar;
                }
                return objL;
            }
            if (i11 == 1) {
                z11 = cVar.f222311e;
                z10 = cVar.f222310d;
                kotlinx.coroutines.sync.a aVar6 = (kotlinx.coroutines.sync.a) cVar.f222309c;
                str = (String) cVar.f222308b;
                d dVar2 = (d) cVar.f222307a;
                ResultKt.m(obj);
                aVar2 = aVar6;
                r11 = dVar2;
            } else {
                if (i11 == 2) {
                    kotlinx.coroutines.sync.a aVar7 = (kotlinx.coroutines.sync.a) cVar.f222309c;
                    str = (String) cVar.f222308b;
                    d dVar3 = (d) cVar.f222307a;
                    ResultKt.m(obj);
                    aVar3 = aVar7;
                    r12 = dVar3;
                    aVar5 = aVar3;
                    if (!ArraysKt.contains((String[]) obj, str)) {
                        aVar2 = aVar3;
                        r11 = r12;
                        cVar.f222307a = str;
                        cVar.f222308b = aVar2;
                        cVar.f222309c = null;
                        cVar.f222314h = 3;
                        objF = r11.f(cVar);
                        if (objF != objL) {
                            kotlinx.coroutines.sync.a aVar8 = aVar2;
                            obj = objF;
                            aVar4 = aVar8;
                        }
                        return objL;
                    }
                    aVar2 = aVar5;
                    this = aVar2;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(z12);
                    this.i(null);
                    return boolA;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.a aVar9 = (kotlinx.coroutines.sync.a) cVar.f222308b;
                str = (String) cVar.f222307a;
                ResultKt.m(obj);
                aVar4 = aVar9;
            }
            it = ((Iterable) obj).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((c0) next).h(), str));
            c0Var = (c0) next;
            if (c0Var == null && c0Var.i()) {
                aVar5 = aVar4;
                aVar2 = aVar5;
                this = aVar2;
            } else {
                z12 = false;
                this = aVar4;
            }
            Boolean boolA2 = kotlin.coroutines.jvm.internal.b.a(z12);
            this.i(null);
            return boolA2;
            if (!z10) {
                if (z11) {
                    this = aVar2;
                } else {
                    try {
                        cVar.f222307a = r11;
                        cVar.f222308b = str;
                        cVar.f222309c = aVar2;
                        cVar.f222314h = 2;
                        Object objD = r11.d(cVar);
                        if (objD != objL) {
                            r12 = r11;
                            aVar3 = aVar2;
                            obj = objD;
                            aVar5 = aVar3;
                            if (!ArraysKt.contains((String[]) obj, str)) {
                                aVar2 = aVar3;
                                r11 = r12;
                                cVar.f222307a = str;
                                cVar.f222308b = aVar2;
                                cVar.f222309c = null;
                                cVar.f222314h = 3;
                                objF = r11.f(cVar);
                                if (objF != objL) {
                                    kotlinx.coroutines.sync.a aVar10 = aVar2;
                                    obj = objF;
                                    aVar4 = aVar10;
                                    it = ((Iterable) obj).iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!Intrinsics.areEqual(((c0) next).h(), str));
                                    c0Var = (c0) next;
                                    if (c0Var == null) {
                                    }
                                    z12 = false;
                                    this = aVar4;
                                }
                            }
                            aVar2 = aVar5;
                            this = aVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = aVar2;
                        r10.i(null);
                        throw th;
                    }
                }
                Boolean boolA3 = kotlin.coroutines.jvm.internal.b.a(z12);
                this.i(null);
                return boolA3;
            }
            cVar.f222307a = str;
            cVar.f222308b = aVar2;
            cVar.f222309c = null;
            cVar.f222314h = 3;
            objF = r11.f(cVar);
            if (objF != objL) {
                kotlinx.coroutines.sync.a aVar11 = aVar2;
                obj = objF;
                aVar4 = aVar11;
                it = ((Iterable) obj).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((c0) next).h(), str));
                c0Var = (c0) next;
                if (c0Var == null) {
                }
                z12 = false;
                this = aVar4;
                Boolean boolA4 = kotlin.coroutines.jvm.internal.b.a(z12);
                this.i(null);
                return boolA4;
            }
            return objL;
        } catch (Throwable th3) {
            th = th3;
            r10 = this;
        }
    }
}
