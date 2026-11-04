package com.planner5d.library.userimporteddata;

import androidx.annotation.m1;
import com.planner5d.library.modules.user.user.w;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.g3;
import com.planner5d.library.services.utility.k1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@ij.f
@SourceDebugExtension({"SMAP\nRemoteUserImportedMetadataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteUserImportedMetadataSource.kt\ncom/planner5d/library/userimporteddata/RemoteUserImportedMetadataSource\n+ 2 JsonUtils.kt\ncom/planner5d/library/services/utility/JsonUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n163#2,3:55\n167#2:59\n1#3:58\n1#3:60\n*S KotlinDebug\n*F\n+ 1 RemoteUserImportedMetadataSource.kt\ncom/planner5d/library/userimporteddata/RemoteUserImportedMetadataSource\n*L\n33#1:55,3\n33#1:59\n33#1:58\n*E\n"})
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.requests.c f235803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g3 f235804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w f235805c;

    @ij.a
    public g(@NotNull com.planner5d.library.api.requests.c userApiRequester, @NotNull g3 timeProvider, @NotNull w userAuthorization) {
        Intrinsics.checkNotNullParameter(userApiRequester, "userApiRequester");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f235803a = userApiRequester;
        this.f235804b = timeProvider;
        this.f235805c = userAuthorization;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject c(String str, com.planner5d.library.api.b requestBlocking, id.a aVar) {
        Intrinsics.checkNotNullParameter(requestBlocking, "$this$requestBlocking");
        return requestBlocking.C(aVar, str).a();
    }

    @m1
    private final p d(String str, long j10, JSONObject jSONObject) throws JSONException {
        d dVarA;
        String strY = k1.y(jSONObject, r.format, null, 4, null);
        if (strY == null || (dVarA = d.f231259b.a(strY)) == null) {
            return null;
        }
        String strY2 = k1.y(jSONObject, r.uri, null, 4, null);
        if (strY2 == null) {
            throw new JSONException("Missing required URI field");
        }
        String strY3 = k1.y(jSONObject, r.hash, null, 4, null);
        if (strY3 != null) {
            return new p(str, dVarA, strY2, strY3, j10);
        }
        throw new JSONException("Missing required hash field");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    @Override // com.planner5d.library.userimporteddata.k
    @m1
    @NotNull
    public List<p> a(@NotNull final String modelHash) throws Exception {
        ?? EmptyList;
        Intrinsics.checkNotNullParameter(modelHash, "modelHash");
        JSONObject jSONObject = (JSONObject) this.f235803a.j(this.f235805c.a(), new Function2() { // from class: com.planner5d.library.userimporteddata.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.c(modelHash, (com.planner5d.library.api.b) obj, (id.a) obj2);
            }
        });
        long jCurrentTimeMillis = this.f235804b.currentTimeMillis();
        k1 k1Var = k1.f225294a;
        JSONArray jSONArrayS = k1Var.s(k1Var.t(jSONObject, r.files), modelHash);
        if (jSONArrayS == null) {
            throw new JSONException("JSON array with metadata is not present");
        }
        int length = jSONArrayS.length();
        if (length > 0) {
            EmptyList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArrayS.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                EmptyList.add(d(modelHash, jCurrentTimeMillis, jSONObject2));
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        List<p> listFilterNotNull = CollectionsKt.filterNotNull((Iterable) EmptyList);
        if (listFilterNotNull.isEmpty()) {
            throw new JSONException("No supported metadata is present");
        }
        return listFilterNotNull;
    }
}
