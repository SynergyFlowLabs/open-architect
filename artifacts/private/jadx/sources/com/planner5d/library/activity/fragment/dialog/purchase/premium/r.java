package com.planner5d.library.activity.fragment.dialog.purchase.premium;

import android.content.Context;
import android.content.ContextWrapper;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import androidx.annotation.l1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.t1;
import com.planner5d.library.services.utility.p0;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPurchaseText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseText.kt\ncom/planner5d/library/activity/fragment/dialog/purchase/premium/PurchaseText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n1#2:231\n*E\n"})
public final class r extends ContextWrapper {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f132709e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f132710f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f132711g = 12.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f132712h = 4.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f132713i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f132714j = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f132715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c f132716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t1 f132717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f132718d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132719a;

        static {
            int[] iArr = new int[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.values().length];
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.Recommendations.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.Standard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.RecommendationsAdvanced.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f132719a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull Context context, @NotNull p0 formatter, @NotNull com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c viewType, @NotNull t1 logRecordManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(logRecordManager, "logRecordManager");
        this.f132715a = formatter;
        this.f132716b = viewType;
        this.f132717c = logRecordManager;
    }

    private final int a(fd.f fVar, double d10) {
        return 100 - ((int) ((fVar.f().doubleValue() / d10) * ((double) 100)));
    }

    private final String b(fd.f fVar) {
        Float fValueOf;
        fd.i iVarK = fVar.k();
        if (iVarK == null) {
            return "";
        }
        if (iVarK.u()) {
            fValueOf = Float.valueOf(f132711g);
        } else {
            fValueOf = iVarK.s() ? Float.valueOf(1.0f) : null;
        }
        if (fValueOf == null) {
            return "";
        }
        String strB = this.f132715a.B(fVar.f().floatValue() / fValueOf.floatValue(), fVar.g());
        Intrinsics.checkNotNullExpressionValue(strB, "price(...)");
        return strB;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    private final String c(int i10) {
        int i11;
        int i12 = b.f132719a[this.f132716b.ordinal()];
        if (i12 == 1) {
            i11 = com.planner5d.library.f.s.Ex;
        } else if (i12 == 2) {
            i11 = this.f132718d ? com.planner5d.library.f.s.bx : com.planner5d.library.f.s.wA;
        } else if (i12 == 3) {
            i11 = com.planner5d.library.f.s.Ex;
        } else if (i12 != 4) {
            if (i12 != 5) {
                throw new k0();
            }
            i11 = com.planner5d.library.f.s.Ex;
        } else {
            i11 = com.planner5d.library.f.s.wA;
        }
        String string = getString(i11, String.valueOf(i10));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final String d(fd.f fVar, double d10) {
        return c(a(fVar, d10));
    }

    private final String g(fd.f fVar, p0 p0Var) {
        Object objH;
        if (fVar.g() == null) {
            t1 t1Var = this.f132717c;
            fd.i iVarK = fVar.k();
            if (iVarK == null || (objH = iVarK.h()) == null) {
                objH = AbstractJsonLexerKt.NULL;
            }
            t1Var.b("currency_code", "currency_code is null for " + objH, new Exception("Empty priceCurrencyCode"));
        }
        float fFloatValue = fVar.f().floatValue() / f132711g;
        if (StringsKt.N1(fVar.g(), "RUB", true)) {
            String strC = p0Var.C(fFloatValue, fVar.g());
            Intrinsics.checkNotNullExpressionValue(strC, "priceWithSpaces(...)");
            return strC;
        }
        String strB = p0Var.B(fFloatValue, fVar.g());
        Intrinsics.checkNotNullExpressionValue(strB, "price(...)");
        return strB;
    }

    private final Pair<String, String> j(fd.f fVar) {
        return TuplesKt.to(k(fVar), l(fVar));
    }

    private final String k(fd.f fVar) {
        if (fVar.r()) {
            return getString(com.planner5d.library.f.s.ct) + " ";
        }
        if (fVar.n()) {
            return getString(com.planner5d.library.f.s.bt) + " ";
        }
        if (!fVar.q()) {
            return "";
        }
        return getString(com.planner5d.library.f.s.wy) + " ";
    }

    private final String l(fd.f fVar) {
        if (!fVar.r()) {
            return (fVar.n() || fVar.q()) ? fVar.j() : "";
        }
        String string = getString(com.planner5d.library.f.s.Xw, fVar.j(), g(fVar, this.f132715a));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final Pair<String, String> m(fd.f fVar) {
        String string;
        if (fVar.r()) {
            string = getString(com.planner5d.library.f.s.Ay);
        } else if (fVar.n()) {
            string = getString(com.planner5d.library.f.s.ty);
        } else {
            string = fVar.q() ? getString(com.planner5d.library.f.s.xy) : "";
        }
        Intrinsics.checkNotNull(string);
        if (string.length() != 0) {
            string = string + " " + fVar.j();
        }
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return TuplesKt.to(string, "");
    }

    private final Pair<String, String> n(fd.f fVar) {
        return TuplesKt.to(o(fVar), p(fVar));
    }

    private final String o(fd.f fVar) {
        if (fVar.r()) {
            if (this.f132718d) {
                String string = getString(com.planner5d.library.f.s.bx);
                Intrinsics.checkNotNull(string);
                return string;
            }
            return getString(com.planner5d.library.f.s.By) + " ";
        }
        if (fVar.n()) {
            return getString(com.planner5d.library.f.s.uy) + " ";
        }
        if (!fVar.q()) {
            return "";
        }
        return getString(com.planner5d.library.f.s.yy) + " ";
    }

    private final String p(fd.f fVar) {
        String string;
        String strJ = fVar.j();
        if (fVar.r()) {
            string = getString(this.f132718d ? com.planner5d.library.f.s.ax : com.planner5d.library.f.s.Zw, strJ);
        } else if (fVar.n()) {
            string = getString(com.planner5d.library.f.s.Vw, strJ);
        } else {
            string = fVar.q() ? getString(com.planner5d.library.f.s.Ww, strJ) : "";
        }
        Intrinsics.checkNotNull(string);
        if (string.length() != 0) {
            string = "\n" + string;
        }
        Intrinsics.checkNotNullExpressionValue(string, "let(...)");
        return string;
    }

    private final Pair<String, String> q(fd.f fVar) {
        String string = fVar.r() ? getString(com.planner5d.library.f.s.Ny) : "";
        Intrinsics.checkNotNull(string);
        return TuplesKt.to(string, "");
    }

    private final String s(fd.f fVar) {
        String strB;
        fd.i iVarK = fVar.k();
        if (iVarK == null) {
            return "";
        }
        float fFloatValue = fVar.f().floatValue();
        if (iVarK.u()) {
            strB = this.f132715a.B(fFloatValue / t(), fVar.g());
        } else if (iVarK.s()) {
            strB = this.f132715a.B(fFloatValue / 4.0f, fVar.g());
        } else {
            strB = iVarK.t() ? this.f132715a.B(fFloatValue, fVar.g()) : null;
        }
        return strB == null ? "" : strB;
    }

    private final float t() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        return u(localDateNow);
    }

    @NotNull
    public final CharSequence e(@NotNull fd.f product) {
        Pair<String, String> pairN;
        Intrinsics.checkNotNullParameter(product, "product");
        int i10 = b.f132719a[this.f132716b.ordinal()];
        if (i10 == 1) {
            pairN = n(product);
        } else if (i10 == 2) {
            pairN = q(product);
        } else if (i10 != 3) {
            if (i10 != 4 && i10 != 5) {
                throw new k0();
            }
            pairN = j(product);
        } else {
            pairN = m(product);
        }
        String strComponent1 = pairN.component1();
        String str = strComponent1 + pairN.component2();
        if (str.length() == 0) {
            return "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), 0, strComponent1.length(), 17);
        return spannableString;
    }

    @Nullable
    public final String f(@NotNull fd.f product, @Nullable fd.f fVar) {
        Pair pair;
        Intrinsics.checkNotNullParameter(product, "product");
        fd.i iVarK = product.k();
        if (iVarK != null) {
            if (this.f132716b != com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare) {
                iVarK = null;
            }
            if (iVarK != null) {
                if (iVarK.u() || iVarK.s()) {
                    pair = (fVar == null || !fVar.q()) ? TuplesKt.to(Integer.valueOf(com.planner5d.library.f.s.Nw), b(product)) : TuplesKt.to(Integer.valueOf(com.planner5d.library.f.s.Bx), s(product));
                } else {
                    if (!iVarK.t()) {
                        return null;
                    }
                    pair = TuplesKt.to(Integer.valueOf(com.planner5d.library.f.s.Bx), s(product));
                }
                return getString(((Number) pair.component1()).intValue(), (String) pair.component2());
            }
        }
        return null;
    }

    @Nullable
    public final String h(@NotNull fd.f product, @Nullable fd.f fVar) {
        BigDecimal bigDecimalF;
        Intrinsics.checkNotNullParameter(product, "product");
        if (product.r() && product.p()) {
            return getString(com.planner5d.library.f.s.bx);
        }
        if (fVar != null && (bigDecimalF = fVar.f()) != null) {
            double dDoubleValue = bigDecimalF.doubleValue();
            if (product.r() && fVar.n()) {
                return d(product, dDoubleValue * ((double) f132711g));
            }
            if (product.r() && fVar.q()) {
                return d(product, dDoubleValue * ((double) t()));
            }
        }
        return null;
    }

    public final void i(boolean z10) {
        this.f132718d = z10;
    }

    @Nullable
    public final String r(@NotNull fd.f product) {
        Intrinsics.checkNotNullParameter(product, "product");
        if (product.r() && this.f132716b == com.planner5d.library.activity.fragment.dialog.purchase.premium.b.c.WithTrialSquare) {
            return getString(com.planner5d.library.f.s.VH, product.j());
        }
        if (product.n()) {
            return getString(com.planner5d.library.f.s.uy);
        }
        if (product.q()) {
            return getString(com.planner5d.library.f.s.yy);
        }
        return null;
    }

    @l1
    public final float u(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return ChronoUnit.DAYS.between(date, date.withYear(date.getYear() + 1)) / 7.0f;
    }
}
