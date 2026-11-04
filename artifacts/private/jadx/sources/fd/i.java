package fd;

import android.content.Context;
import com.planner5d.library.model.a0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nProductSku.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductSku.kt\ncom/planner5d/library/model/payments/ProductSku\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f275149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f275150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f275151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f275152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final k f275153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final j f275154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final Integer f275155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f275156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<String> f275157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final a0 f275158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final a0 f275159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f275160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f275161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f275162n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f275163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f275164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f275165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f275166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f275167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f275168t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f275169u;

    public i(boolean z10, boolean z11, @NotNull String name, float f10, @Nullable k kVar, @Nullable j jVar, @Nullable Integer num, boolean z12, boolean z13, @NotNull List<String> flags, @NotNull a0 title, @NotNull a0 description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f275149a = z10;
        this.f275150b = z11;
        this.f275151c = name;
        this.f275152d = f10;
        this.f275153e = kVar;
        this.f275154f = jVar;
        this.f275155g = num;
        this.f275156h = z12;
        this.f275157i = flags;
        this.f275158j = title;
        this.f275159k = description;
        boolean z14 = true;
        boolean z15 = jVar == j.UNLIMITED || z13;
        this.f275160l = z15;
        boolean z16 = z12 || z15;
        this.f275161m = z16;
        boolean z17 = jVar != null;
        this.f275162n = z17;
        this.f275163o = (z16 || z17) ? false : true;
        this.f275164p = jVar == j.YEARLY;
        this.f275165q = jVar == j.MONTHLY;
        this.f275166r = jVar == j.WEEKLY;
        if (kVar != k.CATALOG || (!z15 && (num == null || num.intValue() < 720))) {
            z14 = false;
        }
        this.f275167s = z14;
        this.f275168t = flags.contains("show_for_authenticated");
        this.f275169u = flags.contains("show_for_not_authenticated");
    }

    @NotNull
    public final a0 a() {
        return this.f275159k;
    }

    @NotNull
    public final List<String> b() {
        return this.f275157i;
    }

    @NotNull
    public final String c() {
        return this.f275151c;
    }

    public final float d() {
        return this.f275152d;
    }

    @Nullable
    public final Integer e() {
        return this.f275155g;
    }

    @Nullable
    public final j f() {
        return this.f275154f;
    }

    @NotNull
    public final String g(@NotNull Context context) {
        Integer numValueOf;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f275164p) {
            numValueOf = Integer.valueOf(qd.b.q.Li);
        } else if (this.f275165q) {
            numValueOf = Integer.valueOf(qd.b.q.Ji);
        } else {
            numValueOf = this.f275166r ? Integer.valueOf(qd.b.q.Ki) : null;
        }
        return (numValueOf == null || (string = context.getString(numValueOf.intValue())) == null) ? com.planner5d.library.model.payments.a.f222474i : string;
    }

    @NotNull
    public final a0 h() {
        return this.f275158j;
    }

    @Nullable
    public final k i() {
        return this.f275153e;
    }

    public final boolean j() {
        return this.f275149a;
    }

    public final boolean k() {
        return this.f275161m;
    }

    public final boolean l() {
        return this.f275156h;
    }

    public final boolean m() {
        return this.f275167s;
    }

    public final boolean n() {
        return this.f275163o;
    }

    public final boolean o() {
        return this.f275150b;
    }

    public final boolean p() {
        return this.f275168t;
    }

    public final boolean q() {
        return this.f275169u;
    }

    public final boolean r() {
        return this.f275162n;
    }

    public final boolean s() {
        return this.f275165q;
    }

    public final boolean t() {
        return this.f275166r;
    }

    public final boolean u() {
        return this.f275164p;
    }

    public final boolean v() {
        return this.f275160l;
    }
}
