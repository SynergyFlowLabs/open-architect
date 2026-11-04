package com.sdk.growthbook.features;

import com.sdk.growthbook.serializable_model.SerializableFeaturesDataModel;
import com.sdk.growthbook.utils.s;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f266264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f266265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f266266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f266267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final pf.c f266268e;

    public q(@NotNull j delegate, @NotNull i dataSource, @Nullable String str, boolean z10) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f266264a = delegate;
        this.f266265b = dataSource;
        this.f266266c = str;
        this.f266267d = z10;
        this.f266268e = pf.c.f350184a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(q qVar, b dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        qVar.s(dataModel);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(q qVar, Throwable th2) {
        qVar.f266264a.a(new com.sdk.growthbook.utils.j(th2), true);
        return Unit.f312394a;
    }

    public static /* synthetic */ void k(q qVar, boolean z10, com.sdk.growthbook.utils.k kVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            kVar = null;
        }
        qVar.j(z10, kVar);
    }

    private final b l() {
        SerializableFeaturesDataModel serializableFeaturesDataModel = (SerializableFeaturesDataModel) pf.e.a(this.f266268e.a(), com.sdk.growthbook.utils.a.f266495b, SerializableFeaturesDataModel.Companion.serializer());
        if (serializableFeaturesDataModel != null) {
            return qf.b.a(serializableFeaturesDataModel);
        }
        return null;
    }

    private final void m(boolean z10, com.sdk.growthbook.utils.k kVar) {
        if (z10) {
            this.f266265b.l(kVar, new Function1() { // from class: com.sdk.growthbook.features.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.n(this.f266258a, (s.b) obj);
                }
            }, new Function1() { // from class: com.sdk.growthbook.features.l
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.o(this.f266259a, (s.a) obj);
                }
            });
        } else {
            this.f266265b.i(new Function1() { // from class: com.sdk.growthbook.features.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.p(this.f266260a, (b) obj);
                }
            }, new Function1() { // from class: com.sdk.growthbook.features.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return q.q(this.f266261a, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(q qVar, s.b responseFeaturesDataModel) {
        Intrinsics.checkNotNullParameter(responseFeaturesDataModel, "responseFeaturesDataModel");
        qVar.s((b) responseFeaturesDataModel.d());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(q qVar, s.a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        qVar.f266264a.a(new com.sdk.growthbook.utils.j(error.d()), true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(q qVar, b dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        qVar.s(dataModel);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(q qVar, Throwable th2) {
        qVar.f266264a.a(new com.sdk.growthbook.utils.j(th2), true);
        return Unit.f312394a;
    }

    private final void r(b bVar) {
        String str;
        Map<String, com.sdk.growthbook.model.h> mapF;
        Map<String, com.sdk.growthbook.model.h> mapI = bVar.i();
        if (mapI != null) {
            this.f266264a.c(mapI, false);
        }
        String strG = bVar.g();
        if (strG != null && (str = this.f266266c) != null && (mapF = com.sdk.growthbook.utils.e.f(strG, str, null, 4, null)) != null) {
            this.f266264a.c(mapF, false);
        }
    }

    private final void s(b bVar) {
        String str;
        String str2;
        Map<String, com.sdk.growthbook.model.h> mapI = bVar != null ? bVar.i() : null;
        JsonObject jsonObjectJ = bVar != null ? bVar.j() : null;
        String strG = bVar != null ? bVar.g() : null;
        String strH = bVar != null ? bVar.h() : null;
        if (bVar != null) {
            try {
                if (this.f266267d) {
                    t(bVar);
                }
                this.f266264a.e(bVar);
                if (mapI != null && !mapI.isEmpty()) {
                    this.f266264a.c(mapI, true);
                    return;
                }
                if (strG == null || (str = this.f266266c) == null) {
                    this.f266264a.a(new com.sdk.growthbook.utils.j(new Exception()), true);
                    return;
                }
                if (str.length() > 0) {
                    Map<String, com.sdk.growthbook.model.h> mapE = com.sdk.growthbook.utils.e.e(strG, this.f266266c, new com.sdk.growthbook.utils.f());
                    if (mapE == null) {
                        return;
                    }
                    this.f266264a.c(mapE, true);
                    return;
                }
                if (mapI != null) {
                    this.f266264a.c(mapI, true);
                    return;
                }
                if (jsonObjectJ != null && !jsonObjectJ.isEmpty()) {
                    this.f266264a.b(jsonObjectJ, true);
                    return;
                }
                if (strH == null || (str2 = this.f266266c) == null) {
                    this.f266264a.d(new com.sdk.growthbook.utils.j(new Exception()), true);
                    return;
                }
                if (str2.length() <= 0) {
                    if (jsonObjectJ != null) {
                        this.f266264a.b(jsonObjectJ, true);
                    }
                } else {
                    JsonObject jsonObjectG = com.sdk.growthbook.utils.e.g(strH, this.f266266c, new com.sdk.growthbook.utils.f());
                    if (jsonObjectG == null) {
                        return;
                    }
                    this.f266264a.b(jsonObjectG, true);
                }
            } catch (Throwable th2) {
                this.f266264a.a(new com.sdk.growthbook.utils.j(th2), true);
            }
        }
    }

    private final void t(b bVar) {
        pf.e.b(this.f266268e.a(), com.sdk.growthbook.utils.a.f266495b, c.a(bVar), SerializableFeaturesDataModel.Companion.serializer());
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<s<Map<String, com.sdk.growthbook.model.h>>> g() {
        return this.f266265b.h(new Function1() { // from class: com.sdk.growthbook.features.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.h(this.f266262a, (b) obj);
            }
        }, new Function1() { // from class: com.sdk.growthbook.features.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.i(this.f266263a, (Throwable) obj);
            }
        });
    }

    public final void j(boolean z10, @Nullable com.sdk.growthbook.utils.k kVar) {
        try {
            b bVarL = l();
            if (bVarL != null) {
                r(bVarL);
            }
        } catch (Throwable th2) {
            this.f266264a.a(new com.sdk.growthbook.utils.j(th2), false);
        }
        m(z10, kVar);
    }

    public /* synthetic */ q(j jVar, i iVar, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, iVar, (i10 & 4) != 0 ? null : str, z10);
    }
}
