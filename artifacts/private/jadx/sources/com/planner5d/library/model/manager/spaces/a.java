package com.planner5d.library.model.manager.spaces;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSpacesJSONConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpacesJSONConverter.kt\ncom/planner5d/library/model/manager/spaces/SpacesJSONConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f197750b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f197751a;

    public a(@NotNull p0 formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        this.f197751a = formatter;
    }

    private final Date c(JSONObject jSONObject, r rVar) {
        try {
            String strY = k1.y(jSONObject, rVar, null, 4, null);
            if (strY != null) {
                return new Date(this.f197751a.G(strY));
            }
        } catch (Throwable th2) {
            timber.log.b.f381052a.f(th2, "Error while getting " + rVar.f224891a + " Date from " + jSONObject, new Object[0]);
        }
        return null;
    }

    @NotNull
    public final com.planner5d.library.database.model.spaces.documents.a a(@NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        boolean z10 = false | false;
        com.planner5d.library.database.model.spaces.documents.a aVar = new com.planner5d.library.database.model.spaces.documents.a(null, null, null, null, null, null, null, false, false, 511, null);
        k1 k1Var = k1.f225294a;
        int i10 = 1 >> 4;
        String strY = k1.y(data, r.hash, null, 4, null);
        if (strY != null) {
            aVar.y(strY);
        }
        aVar.x(k1.y(data, r.folder, null, 4, null));
        aVar.C(k1.y(data, r.space, null, 4, null));
        aVar.A(k1.y(data, r.documentName, null, 4, null));
        aVar.v(c(data, r.cdate));
        aVar.w(c(data, r.udate));
        aVar.B(true);
        return aVar;
    }

    @NotNull
    public final com.planner5d.library.database.model.spaces.documents.c b(@NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        com.planner5d.library.database.model.spaces.documents.c cVar = new com.planner5d.library.database.model.spaces.documents.c(null, null, null, null, null, null, null, 127, null);
        k1 k1Var = k1.f225294a;
        String strY = k1.y(data, r.hash, null, 4, null);
        if (strY != null) {
            cVar.x(strY);
        }
        cVar.z(k1.y(data, r.parent, null, 4, null));
        cVar.A(k1.y(data, r.space, null, 4, null));
        cVar.y(k1.y(data, r.folderName, null, 4, null));
        cVar.B(k1.A(data, r.tags));
        cVar.v(c(data, r.cdate));
        cVar.w(c(data, r.udate));
        return cVar;
    }

    @Nullable
    public final String d(@NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            return k1.y(data, r.hash, null, 4, null);
        } catch (JSONException e10) {
            timber.log.b.f381052a.f(e10, "Error while getting hash from " + data, new Object[0]);
            return null;
        }
    }

    @NotNull
    public final <T> List<T> e(@NotNull JSONObject data, @NotNull Function1<? super JSONObject, ? extends T> converter) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(converter, "converter");
        r rVar = r.items;
        if (!data.has(rVar.f224891a)) {
            return CollectionsKt.emptyList();
        }
        JSONArray jSONArray = data.getJSONArray(rVar.f224891a);
        if (jSONArray.length() == 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                arrayList.add(converter.invoke(obj));
            }
        }
        return arrayList;
    }

    @NotNull
    public final com.planner5d.library.database.model.spaces.c f(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        com.planner5d.library.database.model.spaces.a aVar = new com.planner5d.library.database.model.spaces.a(0L, 0L, null, null, null, null, null, null, null, 511, null);
        com.planner5d.library.database.model.spaces.b bVar = new com.planner5d.library.database.model.spaces.b(0L, 0L, null, null, null, null, 63, null);
        k1 k1Var = k1.f225294a;
        String strY = k1.y(json, r.hash, null, 4, null);
        if (strY != null) {
            aVar.x(strY);
        }
        aVar.B(k1.y(json, r.title, null, 4, null));
        String strY2 = k1.y(json, r.cdate, null, 4, null);
        if (strY2 != null) {
            aVar.w(this.f197751a.g(strY2));
        }
        aVar.u(k1.y(json, r.address, null, 4, null));
        aVar.z(Integer.valueOf(k1.m(json, r.priceAmount, 0)));
        aVar.A(k1.y(json, r.priceCurrency, null, 4, null));
        aVar.v(k1.y(json, r.cover, null, 4, null));
        JSONObject jSONObjectU = k1Var.u(json, r.attributes.f224891a);
        if (jSONObjectU != null) {
            bVar.o(k1.y(jSONObjectU, r.area, null, 4, null));
            bVar.p(k1.y(jSONObjectU, r.buildDate, null, 4, null));
            bVar.t(k1.y(jSONObjectU, r.totalBedrooms, null, 4, null));
            bVar.s(k1.y(jSONObjectU, r.totalBathrooms, null, 4, null));
        }
        return new com.planner5d.library.database.model.spaces.c(aVar, bVar);
    }

    @NotNull
    public final JSONObject g(@NotNull com.planner5d.library.database.model.spaces.c spaceWithAttributes) throws JSONException {
        Intrinsics.checkNotNullParameter(spaceWithAttributes, "spaceWithAttributes");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r.title.f224891a, spaceWithAttributes.f().s());
        jSONObject.put(r.address.f224891a, spaceWithAttributes.f().l());
        jSONObject.put(r.priceAmount.f224891a, spaceWithAttributes.f().q());
        jSONObject.put(r.priceCurrency.f224891a, spaceWithAttributes.f().r());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(r.area.f224891a, spaceWithAttributes.e().i());
        jSONObject2.put(r.buildDate.f224891a, spaceWithAttributes.e().j());
        jSONObject2.put(r.totalBedrooms.f224891a, spaceWithAttributes.e().n());
        jSONObject2.put(r.totalBathrooms.f224891a, spaceWithAttributes.e().m());
        jSONObject.put(r.attributes.f224891a, jSONObject2);
        return jSONObject;
    }
}
