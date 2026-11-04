package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
@SourceDebugExtension({"SMAP\nProcessDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1611#2,9:124\n1863#2:133\n1864#2:135\n1620#2:136\n1734#2,3:137\n1#3:134\n1#3:140\n*S KotlinDebug\n*F\n+ 1 ProcessDataManager.kt\ncom/google/firebase/sessions/ProcessDataManagerImpl\n*L\n78#1:124,9\n78#1:133\n78#1:135\n78#1:136\n83#1:137,3\n78#1:134\n*E\n"})
public final class i0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f125038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f125039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f125040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f125041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f125042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f125043f;

    @ij.a
    public i0(@NotNull Context appContext, @NotNull final f1 uuidGenerator) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f125038a = appContext;
        this.f125039b = kotlin.g0.c(new Function0() { // from class: com.google.firebase.sessions.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.p(this.f125027a);
            }
        });
        this.f125040c = Process.myPid();
        this.f125041d = kotlin.g0.c(new Function0() { // from class: com.google.firebase.sessions.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.q(uuidGenerator);
            }
        });
        this.f125042e = kotlin.g0.c(new Function0() { // from class: com.google.firebase.sessions.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i0.o(this.f125034a);
            }
        });
    }

    private final List<k0> l() {
        return l0.f125056a.a(this.f125038a);
    }

    private final k0 m() {
        return (k0) this.f125042e.getValue();
    }

    private final boolean n(k0 k0Var, ProcessData processData) {
        if (Intrinsics.areEqual(a(), k0Var.i())) {
            return (k0Var.h() == processData.e() && Intrinsics.areEqual(d(), processData.f())) ? false : true;
        }
        return k0Var.h() != processData.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 o(i0 i0Var) {
        return l0.f125056a.b(i0Var.f125038a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(i0 i0Var) {
        return i0Var.m().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(f1 f1Var) {
        String string = f1Var.next().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.google.firebase.sessions.e0
    @NotNull
    public String a() {
        return (String) this.f125039b.getValue();
    }

    @Override // com.google.firebase.sessions.e0
    public boolean b(@NotNull Map<String, ProcessData> processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        ProcessData processData = processDataMap.get(a());
        if (processData == null) {
            return true;
        }
        return (processData.e() == f() && Intrinsics.areEqual(processData.f(), d())) ? false : true;
    }

    @Override // com.google.firebase.sessions.e0
    public boolean c(@NotNull Map<String, ProcessData> processDataMap) {
        Intrinsics.checkNotNullParameter(processDataMap, "processDataMap");
        if (this.f125043f) {
            return false;
        }
        List<k0> listL = l();
        ArrayList<Pair> arrayList = new ArrayList();
        for (k0 k0Var : listL) {
            ProcessData processData = processDataMap.get(k0Var.i());
            Pair pair = processData != null ? new Pair(k0Var, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Pair pair2 : arrayList) {
            if (!n((k0) pair2.component1(), (ProcessData) pair2.component2())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.e0
    @NotNull
    public String d() {
        return (String) this.f125041d.getValue();
    }

    @Override // com.google.firebase.sessions.e0
    @NotNull
    public Map<String, ProcessData> e() {
        return e0.a.a(this);
    }

    @Override // com.google.firebase.sessions.e0
    public int f() {
        return this.f125040c;
    }

    @Override // com.google.firebase.sessions.e0
    @NotNull
    public Map<String, ProcessData> g(@Nullable Map<String, ProcessData> map) {
        Map mutableMap;
        if (map != null && (mutableMap = MapsKt.toMutableMap(map)) != null) {
            mutableMap.put(a(), new ProcessData(Process.myPid(), d()));
            Map<String, ProcessData> map2 = MapsKt.toMap(mutableMap);
            if (map2 != null) {
                return map2;
            }
        }
        return MapsKt.mapOf(TuplesKt.to(a(), new ProcessData(Process.myPid(), d())));
    }

    @Override // com.google.firebase.sessions.e0
    public void h() {
        this.f125043f = true;
    }
}
