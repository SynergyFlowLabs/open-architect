package com.planner5d.library.activity.fragment.profile.orders;

import android.content.Context;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.utility.p0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class i extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f134768n = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final id.a f134769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f134770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f134771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f134772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final String f134773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f134774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f134775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f134776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f134777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f134778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f134779m;

    private i(id.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, int i10, int i11, long j10, Function0<Unit> function0) {
        super(h.a.Order);
        this.f134769c = aVar;
        this.f134770d = str;
        this.f134771e = str2;
        this.f134772f = str3;
        this.f134773g = str4;
        this.f134774h = str5;
        this.f134775i = z10;
        this.f134776j = i10;
        this.f134777k = i11;
        this.f134778l = j10;
        this.f134779m = function0;
    }

    @NotNull
    public final Function0<Unit> b() {
        return this.f134779m;
    }

    @NotNull
    public final String c() {
        return this.f134770d;
    }

    @NotNull
    public final String d() {
        return this.f134773g;
    }

    @NotNull
    public final String e() {
        return this.f134774h;
    }

    @NotNull
    public final String f() {
        return this.f134772f;
    }

    public final int g() {
        return this.f134776j;
    }

    public final int h() {
        return this.f134777k;
    }

    @NotNull
    public final String i() {
        return this.f134771e;
    }

    @Nullable
    public final id.a j() {
        return this.f134769c;
    }

    public final long k() {
        return this.f134778l;
    }

    public final boolean l() {
        return this.f134775i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(@NotNull Context context, @NotNull p0 formatter, @NotNull com.planner5d.library.application.d configuration, @Nullable id.a aVar, @NotNull Payment it, @NotNull fd.i sku, @NotNull com.planner5d.library.model.payments.a order, @NotNull Function0<Unit> clickListener) {
        String str;
        int i10;
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        String strO = formatter.o(it.v());
        Intrinsics.checkNotNullExpressionValue(strO, "dateWithoutTime(...)");
        String strF = formatter.F(it.v());
        Intrinsics.checkNotNullExpressionValue(strF, "time(...)");
        String strA = Payment.f222462a.a(it.y());
        String strB = order.b();
        String str2 = strB == null ? com.planner5d.library.model.payments.a.f222474i : strB;
        String strA2 = fd.l.a(sku.i(), context, configuration.a());
        int i11 = 0;
        if (sku.i() == fd.k.CATALOG) {
            if (sku.m()) {
                string = context.getString(com.planner5d.library.f.s.qw);
            } else if (sku.r()) {
                String strG = sku.g(context);
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                string = strG.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
            } else {
                int i12 = com.planner5d.library.f.s.A5;
                Integer numE = sku.e();
                string = context.getString(i12, Integer.valueOf(numE != null ? numE.intValue() : 0));
            }
            str = " - " + string;
        } else if (sku.i() == fd.k.RENDERS && sku.v()) {
            str = " - " + context.getString(com.planner5d.library.f.s.qw);
        } else {
            str = "";
        }
        String str3 = strA2 + str;
        boolean zK = sku.k();
        int iB = it.B();
        if (iB == Payment.b.Failed.n()) {
            i10 = com.planner5d.library.f.s.Ob;
        } else if (iB == Payment.b.Finished.n() || iB == Payment.b.Validated.n()) {
            i10 = com.planner5d.library.f.s.ut;
        } else if (iB != Payment.b.Consumed.n()) {
            i10 = iB == Payment.b.StartedAndPending.n() ? com.planner5d.library.f.s.Ut : 0;
        } else if (order.d(x.a(aVar)).l()) {
            i10 = com.planner5d.library.f.s.Gb;
        } else {
            i10 = com.planner5d.library.f.s.O1;
        }
        int iB2 = it.B();
        if (iB2 == Payment.b.Finished.n()) {
            i11 = com.planner5d.library.f.s.oG;
        } else if (iB2 == Payment.b.Validated.n()) {
            i11 = com.planner5d.library.f.s.U3;
        }
        this(aVar, strO, strF, strA, str2, str3, zK, i10, i11, it.C(), clickListener);
    }
}
