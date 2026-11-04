package com.planner5d.library.model.manager.config.attributes;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.devtodev.analytics.internal.storage.sqlite.ProjectEntry;
import com.planner5d.library.model.manager.builtin.i;
import com.planner5d.library.model.manager.c1;
import com.planner5d.library.model.manager.o1;
import com.planner5d.library.model.region.h;
import com.planner5d.library.model.region.j;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.s;
import fg.e;
import ij.f;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@f
public final class a implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C1575a f181429i = new C1575a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f181430j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f181431k = "android";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f181432l = "?";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f181433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e<t> f181434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c1 f181435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f181436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final o1 f181437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.i f181438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final j f181439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.region.a f181440h;

    /* JADX INFO: renamed from: com.planner5d.library.model.manager.config.attributes.a$a, reason: collision with other inner class name */
    private static final class C1575a {
        public /* synthetic */ C1575a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1575a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.model.manager.config.attributes.DefaultVariationAttributesProvider$get$2", f = "DefaultVariationAttributesProvider.kt", i = {0}, l = {45, com.planner5d.library.engine.input.f.b.f160707m, com.planner5d.library.engine.input.f.b.f160710n}, m = "invokeSuspend", n = {"user"}, s = {"L$0"})
    static final class b extends o implements Function2<s0, d<? super Map<String, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f181441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f181442b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f181443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f181444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f181445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f181446f;

        b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return a.this.new b(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x0215  */
        /* JADX WARN: Code duplicated, block: B:55:0x021a  */
        /* JADX WARN: Code duplicated, block: B:59:0x0245  */
        /* JADX WARN: Code duplicated, block: B:62:0x028b  */
        /* JADX WARN: Code duplicated, block: B:63:0x0290  */
        /* JADX WARN: Code duplicated, block: B:66:0x02b5  */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            id.a aVarA;
            Pair[] pairArr;
            String str;
            int i10;
            Pair[] pairArr2;
            String strL;
            String str2;
            int i11;
            Pair[] pairArr3;
            Pair[] pairArr4;
            fd.o oVarD;
            fd.o.b bVarM;
            fd.o.b.EnumC1902b enumC1902bL;
            Long l10;
            long jLongValue;
            String str3;
            int i12;
            Pair[] pairArr5;
            Pair[] pairArr6;
            Integer intOrNull;
            int iIntValue;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i13 = this.f181446f;
            if (i13 == 0) {
                ResultKt.m(obj);
                aVarA = ((t) a.this.f181434b.get()).a();
                pairArr = new Pair[22];
                pairArr[0] = TuplesKt.to("userId", kotlin.coroutines.jvm.internal.b.g(x.a(aVarA)));
                pairArr[1] = TuplesKt.to("language", a.this.f181437e.a(a.this.f181433a));
                pairArr[2] = TuplesKt.to("tester", kotlin.coroutines.jvm.internal.b.a(aVarA != null ? Intrinsics.areEqual(aVarA.f287084j, kotlin.coroutines.jvm.internal.b.a(true)) : false));
                String strA = a.this.f181440h.a();
                if (strA == null) {
                    strA = "?";
                }
                pairArr[3] = TuplesKt.to("country", strA);
                j jVar = a.this.f181439g;
                this.f181441a = aVarA;
                this.f181442b = pairArr;
                this.f181443c = pairArr;
                str = "userCountry";
                this.f181444d = "userCountry";
                i10 = 4;
                this.f181445e = 4;
                this.f181446f = 1;
                obj = jVar.c(this);
                if (obj != objL) {
                    pairArr2 = pairArr;
                }
                return objL;
            }
            if (i13 == 1) {
                i10 = this.f181445e;
                str = (String) this.f181444d;
                Pair[] pairArr7 = (Pair[]) this.f181443c;
                Pair[] pairArr8 = (Pair[]) this.f181442b;
                aVarA = (id.a) this.f181441a;
                ResultKt.m(obj);
                pairArr2 = pairArr7;
                pairArr = pairArr8;
            } else {
                if (i13 == 2) {
                    i11 = this.f181445e;
                    str2 = (String) this.f181443c;
                    pairArr3 = (Pair[]) this.f181442b;
                    pairArr4 = (Pair[]) this.f181441a;
                    ResultKt.m(obj);
                    l10 = (Long) obj;
                    if (l10 != null) {
                        jLongValue = l10.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    pairArr3[i11] = TuplesKt.to(str2, kotlin.coroutines.jvm.internal.b.g(jLongValue));
                    c1 c1Var = a.this.f181435c;
                    this.f181441a = pairArr4;
                    this.f181442b = pairArr4;
                    str3 = "installationHash";
                    this.f181443c = "installationHash";
                    this.f181445e = 17;
                    this.f181446f = 3;
                    obj = c1Var.c(this);
                    if (obj != objL) {
                        i12 = 17;
                        pairArr5 = pairArr4;
                        pairArr6 = pairArr5;
                    }
                    return objL;
                }
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = this.f181445e;
                str3 = (String) this.f181443c;
                pairArr5 = (Pair[]) this.f181442b;
                pairArr6 = (Pair[]) this.f181441a;
                ResultKt.m(obj);
            }
            pairArr5[i12] = TuplesKt.to(str3, obj);
            pairArr6[18] = TuplesKt.to("osVersionCode", kotlin.coroutines.jvm.internal.b.f(h3.x()));
            pairArr6[19] = TuplesKt.to("applicationInstallationDate", h3.t(a.this.f181433a));
            String strQ = a.this.f181436d.Q(i.a.Active);
            Intrinsics.checkNotNullExpressionValue(strQ, "getDatabaseVersion(...)");
            intOrNull = StringsKt.toIntOrNull(strQ);
            if (intOrNull != null) {
                iIntValue = intOrNull.intValue();
            } else {
                iIntValue = 0;
            }
            pairArr6[20] = TuplesKt.to("activeDatabaseVersion", kotlin.coroutines.jvm.internal.b.f(iIntValue));
            String strQ2 = a.this.f181436d.Q(i.a.BuiltIn);
            Intrinsics.checkNotNullExpressionValue(strQ2, "getDatabaseVersion(...)");
            Integer intOrNull2 = StringsKt.toIntOrNull(strQ2);
            pairArr6[21] = TuplesKt.to("builtInDatabaseVersion", kotlin.coroutines.jvm.internal.b.f(intOrNull2 != null ? intOrNull2.intValue() : 0));
            return MapsKt.mapOf(pairArr6);
            String str4 = (String) obj;
            pairArr2[i10] = TuplesKt.to(str, str4 != null ? str4 : "?");
            pairArr[5] = TuplesKt.to("os", h3.a());
            pairArr[6] = TuplesKt.to("osType", "android");
            pairArr[7] = TuplesKt.to("platform", "android");
            pairArr[8] = TuplesKt.to("device", h3.c());
            pairArr[9] = TuplesKt.to("deviceType", h3.a0(a.this.f181433a) ? "tablet" : "phone");
            pairArr[10] = TuplesKt.to("application", h3.h(a.this.f181433a));
            pairArr[11] = TuplesKt.to(ProjectEntry.applicationVersion, h3.l(a.this.f181433a));
            pairArr[12] = TuplesKt.to("applicationVersionCode", kotlin.coroutines.jvm.internal.b.f(h3.j(a.this.f181433a)));
            pairArr[13] = TuplesKt.to("paid", kotlin.coroutines.jvm.internal.b.a(aVarA != null && aVarA.e()));
            if (aVarA == null || (oVarD = aVarA.d()) == null || (bVarM = oVarD.m()) == null || (enumC1902bL = bVarM.l()) == null || (strL = enumC1902bL.l()) == null) {
                strL = "none";
            }
            pairArr[14] = TuplesKt.to("paidMembership", strL);
            pairArr[15] = TuplesKt.to("loggedIn", kotlin.coroutines.jvm.internal.b.a(((t) a.this.f181434b.get()).b()));
            com.planner5d.library.services.i iVar = a.this.f181438f;
            this.f181441a = pairArr;
            this.f181442b = pairArr;
            str2 = "devToDevId";
            this.f181443c = "devToDevId";
            this.f181444d = null;
            i11 = 16;
            this.f181445e = 16;
            this.f181446f = 2;
            obj = iVar.l(this);
            if (obj != objL) {
                pairArr3 = pairArr;
                pairArr4 = pairArr3;
                l10 = (Long) obj;
                if (l10 != null) {
                    jLongValue = l10.longValue();
                } else {
                    jLongValue = 0;
                }
                pairArr3[i11] = TuplesKt.to(str2, kotlin.coroutines.jvm.internal.b.g(jLongValue));
                c1 c1Var2 = a.this.f181435c;
                this.f181441a = pairArr4;
                this.f181442b = pairArr4;
                str3 = "installationHash";
                this.f181443c = "installationHash";
                this.f181445e = 17;
                this.f181446f = 3;
                obj = c1Var2.c(this);
                if (obj != objL) {
                    i12 = 17;
                    pairArr5 = pairArr4;
                    pairArr6 = pairArr5;
                    pairArr5[i12] = TuplesKt.to(str3, obj);
                    pairArr6[18] = TuplesKt.to("osVersionCode", kotlin.coroutines.jvm.internal.b.f(h3.x()));
                    pairArr6[19] = TuplesKt.to("applicationInstallationDate", h3.t(a.this.f181433a));
                    String strQ3 = a.this.f181436d.Q(i.a.Active);
                    Intrinsics.checkNotNullExpressionValue(strQ3, "getDatabaseVersion(...)");
                    intOrNull = StringsKt.toIntOrNull(strQ3);
                    if (intOrNull != null) {
                        iIntValue = intOrNull.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    pairArr6[20] = TuplesKt.to("activeDatabaseVersion", kotlin.coroutines.jvm.internal.b.f(iIntValue));
                    String strQ4 = a.this.f181436d.Q(i.a.BuiltIn);
                    Intrinsics.checkNotNullExpressionValue(strQ4, "getDatabaseVersion(...)");
                    Integer intOrNull3 = StringsKt.toIntOrNull(strQ4);
                    pairArr6[21] = TuplesKt.to("builtInDatabaseVersion", kotlin.coroutines.jvm.internal.b.f(intOrNull3 != null ? intOrNull3.intValue() : 0));
                    return MapsKt.mapOf(pairArr6);
                }
            }
            return objL;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Map<String, ? extends Object>> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public a(@NotNull Application application, @NotNull e<t> userAuthorization, @NotNull c1 installationManager, @NotNull i builtInDataManager, @NotNull o1 languageManager, @NotNull com.planner5d.library.services.i devToDevService, @NotNull h telephonyNetworkRegionProvider, @NotNull com.planner5d.library.model.region.f resourcesRegionProvider, @NotNull com.planner5d.library.model.region.b localeRegionProvider, @NotNull j userProfileRegionProvider) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(installationManager, "installationManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        Intrinsics.checkNotNullParameter(devToDevService, "devToDevService");
        Intrinsics.checkNotNullParameter(telephonyNetworkRegionProvider, "telephonyNetworkRegionProvider");
        Intrinsics.checkNotNullParameter(resourcesRegionProvider, "resourcesRegionProvider");
        Intrinsics.checkNotNullParameter(localeRegionProvider, "localeRegionProvider");
        Intrinsics.checkNotNullParameter(userProfileRegionProvider, "userProfileRegionProvider");
        this.f181433a = application;
        this.f181434b = userAuthorization;
        this.f181435c = installationManager;
        this.f181436d = builtInDataManager;
        this.f181437e = languageManager;
        this.f181438f = devToDevService;
        this.f181439g = userProfileRegionProvider;
        this.f181440h = new com.planner5d.library.model.region.a(telephonyNetworkRegionProvider, resourcesRegionProvider, localeRegionProvider);
    }

    @Override // com.planner5d.library.model.manager.config.attributes.c
    @Nullable
    public Object a(@NotNull d<? super Map<String, ? extends Object>> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(null), dVar);
    }
}
