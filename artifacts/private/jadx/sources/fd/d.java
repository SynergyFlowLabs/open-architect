package fd;

import androidx.annotation.m1;
import com.planner5d.library.model.manager.config.p;
import com.planner5d.library.model.manager.config.q;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.utility.e0;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f275117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f275118b;

    public d(@NotNull p preferences, @Nullable k kVar) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f275117a = preferences;
        this.f275118b = kVar == k.RENDERS ? m.AnonymousPurchaseRenders : m.AnonymousPurchase;
    }

    private final String a(String str) {
        return this.f275118b.n() + "_" + str;
    }

    private final String d(String str) {
        return this.f275117a.D(a(str), null);
    }

    private final String h(String str, String str2) {
        String strK = e0.k("p5d_" + str + "_" + str2 + "_p5d");
        Intrinsics.checkNotNullExpressionValue(strK, "sign(...)");
        return strK;
    }

    @Nullable
    public Pair<String, Long> b(@Nullable id.a aVar) {
        String strD = d(AttributeType.DATE);
        String strD2 = d("sku");
        String strD3 = d("sdh");
        if (strD2 != null && strD != null && strD3 != null && Intrinsics.areEqual(strD3, h(strD2, strD))) {
            try {
                u.e(x.a(aVar), strD2);
                return new Pair<>(strD2, Long.valueOf(Long.parseLong(strD)));
            } catch (Throwable th2) {
                timber.log.b.f381052a.e(th2);
            }
        }
        return null;
    }

    @NotNull
    public final String c(@Nullable id.a aVar) {
        Pair<String, Long> pairB = b(aVar);
        if (pairB == null) {
            return com.planner5d.library.model.payments.a.f222474i;
        }
        return pairB.component1() + ":" + TimeUnit.MILLISECONDS.toDays(pairB.component2().longValue());
    }

    public final boolean e(@Nullable id.a aVar) {
        Pair<String, Long> pairB = b(aVar);
        if (pairB == null) {
            return false;
        }
        return f(aVar, pairB.component1(), Long.valueOf(pairB.component2().longValue()));
    }

    public final boolean f(@Nullable id.a aVar, @Nullable String str, @Nullable Long l10) {
        if (str == null) {
            return false;
        }
        try {
            i iVarE = u.e(x.a(aVar), str);
            if (iVarE.i() == k.RENDERS) {
                return true;
            }
            Integer numE = iVarE.e();
            return numE != null && (numE.intValue() >= 720 || (l10 != null && l10.longValue() + TimeUnit.DAYS.toMillis((long) numE.intValue()) >= new Date().getTime()));
        } catch (u.a unused) {
            return true;
        }
    }

    @e.a({"ApplySharedPref"})
    @m1
    public final void g(@Nullable id.a aVar, @Nullable com.planner5d.library.model.payments.a aVar2, @Nullable Long l10) {
        String strC;
        String str;
        String strValueOf = null;
        if (aVar2 != null) {
            try {
                strC = aVar2.d(x.a(aVar)).c();
                try {
                    strValueOf = String.valueOf(l10);
                } catch (u.a e10) {
                    e = e10;
                    timber.log.b.f381052a.e(e);
                }
            } catch (u.a e11) {
                e = e11;
                strC = null;
            }
            String str2 = strValueOf;
            strValueOf = strC;
            str = str2;
        } else {
            str = null;
        }
        q qVarE = this.f275117a.E();
        qVarE.a(a("sku"), strValueOf);
        qVarE.a(a(AttributeType.DATE), str);
        qVarE.a(a("sdh"), h(strValueOf, str));
        qVarE.b();
    }
}
