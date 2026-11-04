package fd;

import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.i0;
import com.planner5d.library.services.utility.k1;
import com.planner5d.library.services.utility.p0;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nPurchasedStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasedStatus.kt\ncom/planner5d/library/model/payments/PurchasedStatus\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f275196f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f275197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f275198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f275199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Integer f275200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final b f275201e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final b d(JSONObject jSONObject, p0 p0Var, Date date) throws JSONException {
            r rVar = r.membership;
            if (!jSONObject.has(rVar.f224891a) || jSONObject.isNull(rVar.f224891a)) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(rVar.f224891a);
            r rVar2 = r.expires;
            Date dateA = jSONObject2.isNull(rVar2.f224891a) ? null : i0.a(new Date(), p0Var.g(jSONObject2.getString(rVar2.f224891a)).getTime() - date.getTime());
            Date date2 = new Date();
            String string = jSONObject2.getString(r.period.f224891a);
            String string2 = jSONObject2.getString(r.plan.f224891a);
            boolean z10 = jSONObject2.getBoolean(r.subscription.f224891a);
            Intrinsics.checkNotNull(jSONObject2);
            return new b(dateA, date2, string, string2, z10, k1.e(jSONObject2, r.trial, null, 4, null), k1.p(jSONObject2, r.gracePeriodDuration));
        }

        @oj.n
        @NotNull
        public final o a(int i10, int i11, long j10) {
            Integer num;
            b bVar;
            Date dateA = i0.a(new Date(), i0.f225269f);
            if (i11 <= 0 || j10 <= 0) {
                num = 0;
                bVar = null;
            } else {
                num = 0;
                bVar = new b(i0.a(new Date(j10), i0.b(i11)), new Date(), (String) null, (String) null, false, Boolean.FALSE, (Integer) null);
            }
            return new o(dateA, i10, 0, num, bVar);
        }

        @oj.n
        @NotNull
        public final o b() {
            return new o(new Date(0L), 0, 0, 0, null);
        }

        @oj.n
        @NotNull
        public final o c(@NotNull p0 formatter, @NotNull JSONObject json) throws Exception {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Intrinsics.checkNotNullParameter(json, "json");
            Date dateG = formatter.g(json.getString(r.now.f224891a));
            Date dateA = i0.a(new Date(), formatter.g(json.getString(r.revalidate.f224891a)).getTime() - dateG.getTime());
            int i10 = json.getInt(r.snapshots.f224891a);
            int i11 = json.getInt(r.textures.f224891a);
            Integer numP = k1.p(json, r.ai);
            Intrinsics.checkNotNull(dateG);
            return new o(dateA, i10, i11, numP, d(json, formatter, dateG));
        }

        private a() {
        }
    }

    public o(@NotNull Date expire, int i10, int i11, @Nullable Integer num, @Nullable b bVar) {
        Intrinsics.checkNotNullParameter(expire, "expire");
        this.f275197a = expire;
        this.f275198b = i10;
        this.f275199c = i11;
        this.f275200d = num;
        this.f275201e = bVar;
    }

    private final Date a() {
        return this.f275197a;
    }

    private final int c() {
        return this.f275199c;
    }

    private final b e() {
        return this.f275201e;
    }

    public static /* synthetic */ o g(o oVar, Date date, int i10, int i11, Integer num, b bVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            date = oVar.f275197a;
        }
        if ((i12 & 2) != 0) {
            i10 = oVar.f275198b;
        }
        if ((i12 & 4) != 0) {
            i11 = oVar.f275199c;
        }
        if ((i12 & 8) != 0) {
            num = oVar.f275200d;
        }
        if ((i12 & 16) != 0) {
            bVar = oVar.f275201e;
        }
        b bVar2 = bVar;
        int i13 = i11;
        return oVar.f(date, i10, i13, num, bVar2);
    }

    @oj.n
    @NotNull
    public static final o i(int i10, int i11, long j10) {
        return f275196f.a(i10, i11, j10);
    }

    @oj.n
    @NotNull
    public static final o j() {
        return f275196f.b();
    }

    @oj.n
    @NotNull
    public static final o p(@NotNull p0 p0Var, @NotNull JSONObject jSONObject) throws Exception {
        return f275196f.c(p0Var, jSONObject);
    }

    public final int b() {
        return this.f275198b;
    }

    @Nullable
    public final Integer d() {
        return this.f275200d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f275197a, oVar.f275197a) && this.f275198b == oVar.f275198b && this.f275199c == oVar.f275199c && Intrinsics.areEqual(this.f275200d, oVar.f275200d) && Intrinsics.areEqual(this.f275201e, oVar.f275201e);
    }

    @NotNull
    public final o f(@NotNull Date expire, int i10, int i11, @Nullable Integer num, @Nullable b bVar) {
        Intrinsics.checkNotNullParameter(expire, "expire");
        return new o(expire, i10, i11, num, bVar);
    }

    @NotNull
    public final o h() {
        b bVar = this.f275201e;
        return g(this, null, 0, 0, null, bVar != null ? b.i(bVar, null, null, new Date(), null, false, null, null, 123, null) : null, 15, null);
    }

    public int hashCode() {
        int iHashCode = ((((this.f275197a.hashCode() * 31) + Integer.hashCode(this.f275198b)) * 31) + Integer.hashCode(this.f275199c)) * 31;
        Integer num = this.f275200d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        b bVar = this.f275201e;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final boolean k() {
        if (this.f275197a.getTime() <= Calendar.getInstance().getTimeInMillis()) {
            return false;
        }
        int i10 = 3 << 1;
        return true;
    }

    @Nullable
    public final Integer l() {
        return this.f275200d;
    }

    @Nullable
    public final b m() {
        if (k()) {
            return this.f275201e;
        }
        return null;
    }

    public final int n() {
        return this.f275198b;
    }

    public final boolean o(@NotNull o other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.k() == k() && Intrinsics.areEqual(other.f275200d, this.f275200d) && other.f275198b == this.f275198b && other.f275199c == this.f275199c;
    }

    @NotNull
    public final JSONObject q() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(r.expire.f224891a, this.f275197a.getTime());
        jSONObject.put(r.snapshots.f224891a, this.f275198b);
        jSONObject.put(r.textures.f224891a, this.f275199c);
        jSONObject.putOpt(r.ai.f224891a, this.f275200d);
        String str = r.membership.f224891a;
        b bVar = this.f275201e;
        jSONObject.put(str, bVar != null ? bVar.p() : null);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "PurchasedStatus(expire=" + this.f275197a + ", snapshots=" + this.f275198b + ", textures=" + this.f275199c + ", ai=" + this.f275200d + ", membershipRaw=" + this.f275201e + ")";
    }

    public o(@NotNull JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        Date date = new Date(json.getLong(r.expire.f224891a));
        int i10 = json.getInt(r.snapshots.f224891a);
        int i11 = json.getInt(r.textures.f224891a);
        Integer numP = k1.p(json, r.ai);
        JSONObject jSONObjectOptJSONObject = json.optJSONObject(r.membership.f224891a);
        this(date, i10, i11, numP, jSONObjectOptJSONObject != null ? new b(jSONObjectOptJSONObject) : null);
    }

    @SourceDebugExtension({"SMAP\nPurchasedStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchasedStatus.kt\ncom/planner5d/library/model/payments/PurchasedStatus$Membership\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final EnumC1902b f275202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Date f275203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Date f275204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final a f275205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f275206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final Boolean f275207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final Integer f275208g;

        public enum a {
            Unlimited,
            Yearly,
            Monthly,
            Weekly,
            Unknown;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ kotlin.enums.a f275215g = kotlin.enums.c.c(k());

            @NotNull
            public static kotlin.enums.a<a> l() {
                return f275215g;
            }
        }

        /* JADX INFO: renamed from: fd.o$b$b, reason: collision with other inner class name */
        public enum EnumC1902b {
            Personal("individual"),
            Education("education"),
            Commercial("commercial");


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ kotlin.enums.a f275220f = kotlin.enums.c.c(k());

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f275221a;

            static {
                int i10 = 3 ^ 1;
            }

            EnumC1902b(String str) {
                this.f275221a = str;
            }

            @NotNull
            public static kotlin.enums.a<EnumC1902b> n() {
                return f275220f;
            }

            @NotNull
            public final String l() {
                return this.f275221a;
            }
        }

        public b(@NotNull EnumC1902b plan, @Nullable Date date, @Nullable Date date2, @NotNull a period, boolean z10, @Nullable Boolean bool, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            Intrinsics.checkNotNullParameter(period, "period");
            this.f275202a = plan;
            this.f275203b = date;
            this.f275204c = date2;
            this.f275205d = period;
            this.f275206e = z10;
            this.f275207f = bool;
            this.f275208g = num;
        }

        private final Date b() {
            return this.f275203b;
        }

        private final Date c() {
            return this.f275204c;
        }

        private final a d() {
            return this.f275205d;
        }

        private final boolean e() {
            return this.f275206e;
        }

        private final Boolean f() {
            return this.f275207f;
        }

        private final Integer g() {
            return this.f275208g;
        }

        public static /* synthetic */ b i(b bVar, EnumC1902b enumC1902b, Date date, Date date2, a aVar, boolean z10, Boolean bool, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                enumC1902b = bVar.f275202a;
            }
            if ((i10 & 2) != 0) {
                date = bVar.f275203b;
            }
            if ((i10 & 4) != 0) {
                date2 = bVar.f275204c;
            }
            if ((i10 & 8) != 0) {
                aVar = bVar.f275205d;
            }
            if ((i10 & 16) != 0) {
                z10 = bVar.f275206e;
            }
            if ((i10 & 32) != 0) {
                bool = bVar.f275207f;
            }
            if ((i10 & 64) != 0) {
                num = bVar.f275208g;
            }
            Boolean bool2 = bool;
            Integer num2 = num;
            boolean z11 = z10;
            Date date3 = date2;
            return bVar.h(enumC1902b, date, date3, aVar, z11, bool2, num2);
        }

        private final boolean o() {
            Date date = this.f275204c;
            return date != null && Calendar.getInstance().getTimeInMillis() >= date.getTime();
        }

        @NotNull
        public final EnumC1902b a() {
            return this.f275202a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f275202a == bVar.f275202a && Intrinsics.areEqual(this.f275203b, bVar.f275203b) && Intrinsics.areEqual(this.f275204c, bVar.f275204c) && this.f275205d == bVar.f275205d && this.f275206e == bVar.f275206e && Intrinsics.areEqual(this.f275207f, bVar.f275207f) && Intrinsics.areEqual(this.f275208g, bVar.f275208g);
        }

        @NotNull
        public final b h(@NotNull EnumC1902b plan, @Nullable Date date, @Nullable Date date2, @NotNull a period, boolean z10, @Nullable Boolean bool, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            Intrinsics.checkNotNullParameter(period, "period");
            return new b(plan, date, date2, period, z10, bool, num);
        }

        public int hashCode() {
            int iHashCode = this.f275202a.hashCode() * 31;
            Date date = this.f275203b;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f275204c;
            int iHashCode3 = (((((iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31) + this.f275205d.hashCode()) * 31) + Boolean.hashCode(this.f275206e)) * 31;
            Boolean bool = this.f275207f;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.f275208g;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        public final boolean j() {
            if (!o()) {
                return false;
            }
            Date date = this.f275203b;
            return date == null || date.getTime() > Calendar.getInstance().getTimeInMillis();
        }

        public final int k() {
            if (!o()) {
                return 0;
            }
            Date date = this.f275203b;
            long jMax = Math.max(0L, (date != null ? date.getTime() : 0L) - Calendar.getInstance().getTimeInMillis());
            if (jMax > i0.b(1L)) {
                return (int) (jMax / i0.b(1L));
            }
            if (jMax <= 0) {
                return 0;
            }
            int i10 = 2 | 1;
            return 1;
        }

        @NotNull
        public final EnumC1902b l() {
            return this.f275202a;
        }

        public final boolean m() {
            return this.f275203b == null;
        }

        public final boolean n() {
            return this.f275202a == EnumC1902b.Commercial;
        }

        @NotNull
        public final JSONObject p() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            String str = r.expire.f224891a;
            Date date = this.f275203b;
            jSONObject.put(str, date != null ? Long.valueOf(date.getTime()) : null);
            String str2 = r.latestExpiryCheck.f224891a;
            Date date2 = this.f275204c;
            jSONObject.put(str2, date2 != null ? Long.valueOf(date2.getTime()) : null);
            jSONObject.put(r.period.f224891a, this.f275205d.name());
            jSONObject.put(r.plan.f224891a, this.f275202a.name());
            jSONObject.put(r.subscription.f224891a, this.f275206e);
            jSONObject.putOpt(r.trial.f224891a, this.f275207f);
            jSONObject.putOpt(r.gracePeriodDuration.f224891a, this.f275208g);
            return jSONObject;
        }

        @NotNull
        public String toString() {
            return "Membership(plan=" + this.f275202a + ", expire=" + this.f275203b + ", latestExpiryCheck=" + this.f275204c + ", period=" + this.f275205d + ", subscription=" + this.f275206e + ", trial=" + this.f275207f + ", gracePeriodDuration=" + this.f275208g + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@Nullable Date date, @Nullable Date date2, @Nullable String str, @Nullable String str2, boolean z10, @Nullable Boolean bool, @Nullable Integer num) {
            a aVar;
            EnumC1902b next;
            Iterator<EnumC1902b> it = EnumC1902b.n().iterator();
            do {
                aVar = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.N1(next.name(), str2, true));
            EnumC1902b enumC1902b = next;
            enumC1902b = enumC1902b == null ? EnumC1902b.Personal : enumC1902b;
            for (a aVar2 : a.l()) {
                if (StringsKt.N1(aVar2.name(), str, true)) {
                    aVar = aVar2;
                    break;
                }
            }
            a aVar3 = aVar;
            this(enumC1902b, date, date2, aVar3 == null ? a.Unknown : aVar3, z10, bool, num);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            r rVar = r.expire;
            Date date = (!json.has(rVar.f224891a) || json.isNull(rVar.f224891a)) ? null : new Date(json.getLong(rVar.f224891a));
            r rVar2 = r.latestExpiryCheck;
            this(date, (!json.has(rVar2.f224891a) || json.isNull(rVar2.f224891a)) ? null : new Date(json.getLong(rVar2.f224891a)), json.getString(r.period.f224891a), json.getString(r.plan.f224891a), json.getBoolean(r.subscription.f224891a), k1.e(json, r.trial, null, 4, null), k1.p(json, r.gracePeriodDuration));
        }
    }
}
