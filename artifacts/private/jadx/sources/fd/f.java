package fd;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.p;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.p0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Product.kt\ncom/planner5d/library/model/payments/Product\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,106:1\n1#2:107\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final i f275137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final BigDecimal f275138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f275139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final String f275140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f275141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f275142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f275143g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull i sku) {
        this(sku, 0L, null, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(sku, "sku");
    }

    @kotlin.l(message = "Product should not know anything about catalog")
    public static /* synthetic */ void b() {
    }

    @Nullable
    public final String a() {
        return this.f275142f;
    }

    @Nullable
    public final String c(@NotNull Context context, @NotNull p0 formatter, @NotNull o1 languageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        i iVar = this.f275137a;
        if ((iVar != null ? iVar.i() : null) == k.RENDERS) {
            return null;
        }
        i iVar2 = this.f275137a;
        if ((iVar2 != null ? iVar2.e() : null) != null && this.f275137a.i() == k.TEXTURES) {
            return context.getString(qd.b.q.Ru, Currency.getInstance(this.f275139c).getSymbol(), formatter.x(this.f275138b.divide(new BigDecimal(this.f275137a.e().intValue()), 2, RoundingMode.HALF_UP).floatValue()));
        }
        i iVar3 = this.f275137a;
        return languageManager.b(context, iVar3 != null ? iVar3.a() : null, com.planner5d.library.model.payments.a.f222474i);
    }

    @Nullable
    public final String d() {
        return this.f275141e;
    }

    @Nullable
    public final String e() {
        return this.f275140d;
    }

    @NotNull
    public final BigDecimal f() {
        return this.f275138b;
    }

    @Nullable
    public final String g() {
        return this.f275139c;
    }

    public final double h() {
        return this.f275138b.doubleValue();
    }

    public final long i() {
        return this.f275138b.multiply(new BigDecimal(1000000)).longValue();
    }

    @NotNull
    public final String j() {
        String str = this.f275143g;
        return str == null ? com.planner5d.library.model.payments.a.f222474i : str;
    }

    @Nullable
    public final i k() {
        return this.f275137a;
    }

    @NotNull
    public final String l(@NotNull Context context, @NotNull o1 languageManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        i iVar = this.f275137a;
        String strB = languageManager.b(context, iVar != null ? iVar.h() : null, com.planner5d.library.model.payments.a.f222474i);
        return strB == null ? com.planner5d.library.model.payments.a.f222474i : strB;
    }

    public final boolean m() {
        i iVar = this.f275137a;
        return iVar != null && iVar.k();
    }

    public final boolean n() {
        i iVar = this.f275137a;
        return iVar != null && iVar.s();
    }

    public final boolean o() {
        return StringsKt.N1(r.trial.f224891a, this.f275141e, true);
    }

    public final boolean p() {
        return Intrinsics.areEqual(this.f275141e, r.trial.f224891a);
    }

    public final boolean q() {
        i iVar = this.f275137a;
        return iVar != null && iVar.t();
    }

    public final boolean r() {
        i iVar = this.f275137a;
        return iVar != null && iVar.u();
    }

    @NotNull
    public final Bundle s() {
        com.planner5d.library.services.utility.i iVarJ = new com.planner5d.library.services.utility.i().j(r.className, f.class.getName());
        r rVar = r.sku;
        i iVar = this.f275137a;
        return iVarJ.h(rVar, iVar != null ? h.f275148a.d(iVar) : null).j(r.priceTitle, this.f275143g).j(r.priceCurrencyCode, this.f275139c).j(r.price, this.f275138b.toPlainString()).j(r.catalogItemId, this.f275142f).j(r.offerToken, this.f275140d).j(r.offerId, this.f275141e).a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull i sku, long j10) {
        this(sku, j10, null, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(sku, "sku");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull i sku, long j10, @Nullable String str) {
        this(sku, j10, str, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(sku, "sku");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull i sku, long j10, @Nullable String str, @Nullable String str2) {
        this(sku, j10, str, str2, null, null, 48, null);
        Intrinsics.checkNotNullParameter(sku, "sku");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull i sku, long j10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(sku, j10, str, str2, str3, null, 32, null);
        Intrinsics.checkNotNullParameter(sku, "sku");
    }

    public f(@Nullable Bundle bundle) {
        com.planner5d.library.services.utility.j jVar = new com.planner5d.library.services.utility.j(bundle);
        this.f275137a = h.f275148a.a(jVar.h(r.sku, null));
        this.f275143g = jVar.t(r.priceTitle, com.planner5d.library.model.payments.a.f222474i);
        this.f275139c = jVar.o(r.priceCurrencyCode, "EUR");
        this.f275138b = new BigDecimal(jVar.t(r.price, p.f99189d0));
        this.f275142f = jVar.t(r.catalogItemId, null);
        this.f275140d = jVar.t(r.offerToken, null);
        this.f275141e = jVar.t(r.offerId, null);
    }

    public /* synthetic */ f(i iVar, long j10, String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public f(@NotNull i sku, long j10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this(sku, j10, str, str2, null, str3, str4);
        Intrinsics.checkNotNullParameter(sku, "sku");
    }

    private f(i iVar, long j10, String str, String str2, String str3, String str4, String str5) {
        this.f275137a = iVar;
        this.f275138b = new BigDecimal(j10).divide(new BigDecimal(1000000), 2, RoundingMode.HALF_UP);
        this.f275143g = str2;
        this.f275139c = str;
        this.f275142f = str3;
        this.f275140d = str4;
        this.f275141e = str5;
    }
}
