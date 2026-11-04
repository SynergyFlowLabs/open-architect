package com.planner5d.library.model.editorcollection;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.utility.p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
public final class r extends t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f180722f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f180723g = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0 f180724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final f0 f180725e;

    public static final class a extends t.b<r> {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.planner5d.library.model.editorcollection.k
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public r a(@Nullable id.a aVar) {
            return new r(aVar, null);
        }

        private a() {
        }
    }

    public /* synthetic */ r(id.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.requests.c i() {
        return com.planner5d.library.application.b.f142455c.a().k2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0 j() {
        return com.planner5d.library.application.b.f142455c.a().O1();
    }

    private final com.planner5d.library.api.requests.c k() {
        return (com.planner5d.library.api.requests.c) this.f180725e.getValue();
    }

    private final p0 l() {
        return (p0) this.f180724d.getValue();
    }

    private final void m() {
        if (x.a(e()) != 0) {
            try {
                Object objJ = k().j(e(), new Function2() { // from class: com.planner5d.library.model.editorcollection.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.n((com.planner5d.library.api.b) obj, (id.a) obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(objJ, "requestBlocking(...)");
                com.planner5d.library.api.c cVar = (com.planner5d.library.api.c) objJ;
                if (!cVar.h()) {
                    JSONArray jSONArray = cVar.a().getJSONArray(com.planner5d.library.services.r.items.f224891a);
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        d dVar = d.f180686a;
                        String string = jSONObject.getString(com.planner5d.library.services.r.url.f224891a);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        arrayList.add(dVar.i(string, Integer.valueOf(l().c(jSONObject.getString(com.planner5d.library.services.r.color.f224891a), 1.0d))));
                    }
                    d().g(arrayList);
                }
            } catch (com.planner5d.library.api.e e10) {
                timber.log.b.f381052a.e(e10);
            } catch (JSONException e11) {
                timber.log.b.f381052a.e(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c n(com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.e(aVar);
    }

    @Override // com.planner5d.library.model.editorcollection.i
    @NotNull
    public List<g.b> a(boolean z10) {
        if (!z10) {
            m();
        }
        return d().d();
    }

    private r(id.a aVar) {
        super("user", aVar);
        this.f180724d = g0.c(new Function0() { // from class: com.planner5d.library.model.editorcollection.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.j();
            }
        });
        this.f180725e = g0.c(new Function0() { // from class: com.planner5d.library.model.editorcollection.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.i();
            }
        });
    }
}
