package com.planner5d.library.model.manager.config;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.w2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nPurchasePlacementManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasePlacementManager.kt\ncom/planner5d/library/model/manager/config/PurchasePlacementManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 CollectionUtils.kt\ncom/planner5d/library/services/utility/CollectionUtils\n*L\n1#1,93:1\n381#2,7:94\n1#3:101\n1863#4:102\n1864#4:110\n1863#4,2:111\n32#5,7:103\n*S KotlinDebug\n*F\n+ 1 PurchasePlacementManager.kt\ncom/planner5d/library/model/manager/config/PurchasePlacementManager\n*L\n65#1:94,7\n79#1:102\n79#1:110\n85#1:111,2\n82#1:103,7\n*E\n"})
public final class n implements w2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f181601f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f181602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.purchaseplacement.c f181603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.model.manager.config.purchaseplacement.b.a, k0<com.planner5d.library.model.manager.config.purchaseplacement.a>> f181604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<com.planner5d.library.model.manager.config.purchaseplacement.b.a, com.planner5d.library.model.manager.config.purchaseplacement.a> f181605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f181606e;

    /* synthetic */ class a extends g0 implements Function1<j.a, Unit> {
        a(Object obj) {
            super(1, obj, n.class, "processLatestFeatureConfigAction", "processLatestFeatureConfigAction(Lcom/planner5d/library/model/manager/config/FeatureConfigManager$LatestAction;)V", 0);
        }

        public final void X(j.a p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            ((n) this.receiver).e(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j.a aVar) {
            X(aVar);
            return Unit.f312394a;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181607a;

        static {
            int[] iArr = new int[j.a.values().length];
            try {
                iArr[j.a.REFRESHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.a.DROPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f181607a = iArr;
        }
    }

    @ij.a
    public n(@NotNull j featureConfigManager, @NotNull com.planner5d.library.model.manager.config.purchaseplacement.c purchasePlacementsParser) {
        Intrinsics.checkNotNullParameter(featureConfigManager, "featureConfigManager");
        Intrinsics.checkNotNullParameter(purchasePlacementsParser, "purchasePlacementsParser");
        this.f181602a = featureConfigManager;
        this.f181603b = purchasePlacementsParser;
        this.f181604c = new LinkedHashMap();
        this.f181605d = new LinkedHashMap();
        this.f181606e = new Object();
        featureConfigManager.c(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(j.a aVar) {
        int i10 = b.f181607a[aVar.ordinal()];
        if (i10 == 1) {
            f();
            return;
        }
        if (i10 != 2) {
            throw new kotlin.k0();
        }
        synchronized (this.f181606e) {
            try {
                this.f181605d.clear();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f() {
        synchronized (this.f181606e) {
            try {
                g value = this.f181602a.s(f.PurchasePlacements).getValue();
                JSONObject jSONObjectD = value != null ? value.d() : null;
                if (jSONObjectD != null) {
                    for (com.planner5d.library.model.manager.config.purchaseplacement.b bVar : this.f181603b.a(jSONObjectD)) {
                        fd.e eVarC = bVar.c();
                        com.planner5d.library.model.manager.config.purchaseplacement.a aVar = eVarC != null ? new com.planner5d.library.model.manager.config.purchaseplacement.a(eVarC, bVar.a()) : null;
                        com.planner5d.library.services.utility.m mVar = com.planner5d.library.services.utility.m.f225326a;
                        Map<com.planner5d.library.model.manager.config.purchaseplacement.b.a, k0<com.planner5d.library.model.manager.config.purchaseplacement.a>> map = this.f181604c;
                        com.planner5d.library.model.manager.config.purchaseplacement.b.a aVarE = bVar.e();
                        k0<com.planner5d.library.model.manager.config.purchaseplacement.a> k0Var = map.get(aVarE);
                        if (k0Var == null) {
                            map.put(aVarE, b1.a(aVar));
                        } else {
                            k0Var.setValue(aVar);
                        }
                    }
                } else {
                    Iterator<T> it = this.f181604c.values().iterator();
                    while (it.hasNext()) {
                        ((k0) it.next()).setValue(null);
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.model.manager.w2
    @Nullable
    public com.planner5d.library.model.manager.config.purchaseplacement.a a(@NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a name) {
        com.planner5d.library.model.manager.config.purchaseplacement.a aVar;
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this.f181606e) {
            try {
                if (this.f181605d.containsKey(name)) {
                    aVar = this.f181605d.get(name);
                } else {
                    com.planner5d.library.model.manager.config.purchaseplacement.a value = d(name).getValue();
                    this.f181605d.put(name, value);
                    aVar = value;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    @Nullable
    public final com.planner5d.library.model.manager.config.purchaseplacement.b c(@NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a name) {
        Intrinsics.checkNotNullParameter(name, "name");
        com.planner5d.library.model.manager.config.purchaseplacement.a aVarA = a(name);
        if (aVarA == null) {
            return null;
        }
        String strN = aVarA.f().n();
        fd.e eVarE = aVarA.e();
        return new com.planner5d.library.model.manager.config.purchaseplacement.b(name, strN, eVarE != null ? eVarE.n() : null);
    }

    @NotNull
    public final z0<com.planner5d.library.model.manager.config.purchaseplacement.a> d(@NotNull com.planner5d.library.model.manager.config.purchaseplacement.b.a name) {
        k0<com.planner5d.library.model.manager.config.purchaseplacement.a> k0Var;
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this.f181606e) {
            try {
                Map<com.planner5d.library.model.manager.config.purchaseplacement.b.a, k0<com.planner5d.library.model.manager.config.purchaseplacement.a>> map = this.f181604c;
                k0<com.planner5d.library.model.manager.config.purchaseplacement.a> k0VarA = map.get(name);
                if (k0VarA == null) {
                    k0VarA = b1.a(null);
                    map.put(name, k0VarA);
                }
                k0Var = k0VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k0Var;
    }
}
