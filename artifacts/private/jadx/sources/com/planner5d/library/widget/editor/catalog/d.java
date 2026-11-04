package com.planner5d.library.widget.editor.catalog;

import androidx.compose.runtime.internal.w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f254438c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f254439d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f254440e = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f254441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.t f254442b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(@NotNull com.planner5d.library.api.requests.c requester, @NotNull com.planner5d.library.modules.user.user.t userAuthorization) {
        Intrinsics.checkNotNullParameter(requester, "requester");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f254441a = requester;
        this.f254442b = userAuthorization;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final xd.b d(com.planner5d.library.api.c cVar) {
        try {
            JSONArray jSONArray = cVar.a().getJSONObject("items").getJSONArray("ids");
            JSONArray jSONArray2 = cVar.a().getJSONObject("categories").getJSONArray("ids");
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                Object obj = jSONArray.get(i10);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                strArr[i10] = obj;
            }
            int length2 = jSONArray2.length();
            long[] jArr = new long[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                Object obj2 = jSONArray2.get(i11);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                jArr[i11] = Long.parseLong((String) obj2);
            }
            return new xd.b(strArr, jArr);
        } catch (JSONException e10) {
            timber.log.b.f381052a.d("API Search response parsing exception : " + e10, new Object[0]);
            return new xd.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.planner5d.library.api.c f(String str, com.planner5d.library.api.b requestAsObservable, id.a aVar) throws JSONException {
        Intrinsics.checkNotNullParameter(requestAsObservable, "$this$requestAsObservable");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FirebaseAnalytics.c.f120629o, str);
        jSONObject.put("catalog", 700);
        Unit unit = Unit.f312394a;
        return requestAsObservable.H(aVar, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xd.b g(d dVar, com.planner5d.library.api.c cVar) throws ErrorMessageException {
        if (cVar.h()) {
            throw new ErrorMessageException(com.planner5d.library.f.s.Oa, cVar.f());
        }
        Intrinsics.checkNotNull(cVar);
        return dVar.d(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xd.b h(Function1 function1, Object obj) {
        return (xd.b) function1.invoke(obj);
    }

    @NotNull
    public final Observable<xd.b> e(@NotNull final String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Observable observableI = com.planner5d.library.api.requests.c.i(this.f254441a, this.f254442b.a(), null, new Function2() { // from class: com.planner5d.library.widget.editor.catalog.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d.f(query, (com.planner5d.library.api.b) obj, (id.a) obj2);
            }
        }, 2, null);
        final Function1 function1 = new Function1() { // from class: com.planner5d.library.widget.editor.catalog.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.g(this.f254426a, (com.planner5d.library.api.c) obj);
            }
        };
        Observable<xd.b> map = observableI.map(new Func1() { // from class: com.planner5d.library.widget.editor.catalog.c
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return d.h(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
