package fd;

import android.os.Bundle;
import com.planner5d.library.model.a0;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.k1;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f275148a = new a(null);

    @SourceDebugExtension({"SMAP\nProductParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductParser.kt\ncom/planner5d/library/model/payments/ProductParser$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final a0 e(Bundle bundle) {
            if (bundle != null) {
                String strT = new com.planner5d.library.services.utility.j(bundle).t(r.map, null);
                a0 a0Var = strT != null ? new a0(new JSONObject(strT)) : null;
                if (a0Var != null) {
                    return a0Var;
                }
            }
            return new a0((Map<String, String>) MapsKt.mapOf(TuplesKt.to("en", com.planner5d.library.model.payments.a.f222474i)));
        }

        @oj.n
        @Nullable
        public final i a(@Nullable Bundle bundle) {
            List listEmptyList;
            if (bundle == null) {
                return null;
            }
            com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
            boolean zF = jVar.f(r.active, false);
            boolean zF2 = jVar.f(r.hidden, false);
            String strT = jVar.t(r.sku, "");
            if (strT == null) {
                strT = "";
            }
            float fB = jVar.b(r.price, 0.0f);
            k kVarA = k.f275178b.a(jVar.t(r.type, null));
            j jVarA = j.f275170b.a(jVar.t(r.subscription, null));
            Integer numValueOf = Integer.valueOf(jVar.c(r.quantity, 0));
            boolean zF3 = jVar.f(r.anonymous, false);
            boolean zF4 = jVar.f(r.forever, false);
            String[] strArrV = jVar.v(r.flags, new String[0]);
            if (strArrV == null || (listEmptyList = ArraysKt.toList(strArrV)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list = listEmptyList;
            a aVar = h.f275148a;
            return new i(zF, zF2, strT, fB, kVarA, jVarA, numValueOf, zF3, zF4, list, aVar.e(jVar.h(r.title, null)), aVar.e(jVar.h(r.description, null)));
        }

        @oj.n
        public final void b(long j10, @NotNull JSONObject productJson) throws JSONException {
            Intrinsics.checkNotNullParameter(productJson, "productJson");
            u uVar = u.f193000a;
            boolean zA = k1.a(productJson, r.active);
            boolean zA2 = k1.a(productJson, r.hidden);
            String string = productJson.getString(r.productName.f224891a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            float fH = k1.h(productJson, r.price, 0.0f);
            k kVarA = k.f275178b.a(productJson.getString(r.type.f224891a));
            r rVar = r.subscription;
            uVar.c(j10, zA, zA2, string, fH, kVarA, productJson.isNull(rVar.f224891a) ? null : j.f275170b.a(productJson.getString(rVar.f224891a)), k1.p(productJson, r.quantity), !k1.a(productJson, r.user), k1.a(productJson, r.forever), k1.I(productJson, r.flags.f224891a), new a0(productJson.getJSONObject(r.title.f224891a)), new a0(productJson.getJSONObject(r.description.f224891a)));
        }

        @NotNull
        public final Bundle c(@NotNull a0 translatedString) {
            Intrinsics.checkNotNullParameter(translatedString, "translatedString");
            return new com.planner5d.library.services.utility.i().j(r.map, translatedString.b().toString()).a();
        }

        @oj.n
        @NotNull
        public final Bundle d(@NotNull i sku) {
            Intrinsics.checkNotNullParameter(sku, "sku");
            com.planner5d.library.services.utility.i iVarE = new com.planner5d.library.services.utility.i().j(r.sku, sku.c()).m(r.active, sku.j()).m(r.hidden, sku.o()).e(r.price, sku.d());
            r rVar = r.type;
            k kVarI = sku.i();
            com.planner5d.library.services.utility.i iVarL = iVarE.j(rVar, kVarI != null ? kVarI.name() : null).m(r.anonymous, sku.l()).h(r.title, c(sku.h())).h(r.description, c(sku.a())).l(r.flags, sku.b());
            j jVarF = sku.f();
            if (jVarF != null) {
                iVarL.j(r.subscription, jVarF.name());
            }
            Integer numE = sku.e();
            if (numE != null) {
                iVarL.f(r.quantity, numE.intValue());
            }
            return iVarL.a();
        }

        private a() {
        }
    }

    @oj.n
    @Nullable
    public static final i a(@Nullable Bundle bundle) {
        return f275148a.a(bundle);
    }

    @oj.n
    public static final void b(long j10, @NotNull JSONObject jSONObject) throws JSONException {
        f275148a.b(j10, jSONObject);
    }

    @oj.n
    @NotNull
    public static final Bundle c(@NotNull i iVar) {
        return f275148a.d(iVar);
    }
}
