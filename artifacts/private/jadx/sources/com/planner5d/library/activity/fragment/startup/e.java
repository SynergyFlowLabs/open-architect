package com.planner5d.library.activity.fragment.startup;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.statistics.events.k3;
import com.planner5d.library.model.manager.statistics.events.p3;
import com.planner5d.library.services.utility.e0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOneLinkDeeplinkHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneLinkDeeplinkHandler.kt\ncom/planner5d/library/activity/fragment/startup/OneLinkDeeplinkHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f136459d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f136460e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f136461f = Pattern.compile("^/profile/id(.+)/auth/(.+)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.modules.user.user.t> f136462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.modules.user.user.b f136463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.config.p f136464c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.OneLinkDeeplinkHandler", f = "OneLinkDeeplinkHandler.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {45, 49, 50}, m = "handleUri", n = {"this", "code", "fromOnboarding", "this", "code", "fromOnboarding", "id"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "I$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f136467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f136468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f136469e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f136471g;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136469e = obj;
            this.f136471g |= Integer.MIN_VALUE;
            return e.this.f(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.OneLinkDeeplinkHandler", f = "OneLinkDeeplinkHandler.kt", i = {0, 0}, l = {36}, m = "onNewIntent", n = {"intent", "fromOnboarding"}, s = {"L$0", "Z$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f136473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f136474c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f136476e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136474c = obj;
            this.f136476e |= Integer.MIN_VALUE;
            boolean z10 = false | false;
            return e.this.g(null, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.OneLinkDeeplinkHandler", f = "OneLinkDeeplinkHandler.kt", i = {0, 0, 0, 1, 1}, l = {60, 70}, m = "signIn", n = {"this", "signUp", "fromOnboarding", "this", "signUp"}, s = {"L$0", "Z$0", "Z$1", "L$0", "Z$0"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f136478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f136479c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f136480d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f136482f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136480d = obj;
            this.f136482f |= Integer.MIN_VALUE;
            return e.this.i(0, null, false, false, this);
        }
    }

    @ij.a
    public e(@NotNull fg.e<com.planner5d.library.modules.user.user.t> userAuthorization, @NotNull com.planner5d.library.modules.user.user.b actionAfterLogInStandard, @NotNull com.planner5d.library.model.manager.config.p sharedPreferencesManager) {
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(actionAfterLogInStandard, "actionAfterLogInStandard");
        Intrinsics.checkNotNullParameter(sharedPreferencesManager, "sharedPreferencesManager");
        this.f136462a = userAuthorization;
        this.f136463b = actionAfterLogInStandard;
        this.f136464c = sharedPreferencesManager;
    }

    private final String c(Uri uri) {
        String path;
        Matcher matcher;
        String strGroup;
        if (uri != null && (path = uri.getPath()) != null && (matcher = f136461f.matcher(path)) != null) {
            if (!matcher.find()) {
                matcher = null;
            }
            if (matcher != null && (strGroup = matcher.group(2)) != null) {
                return d(strGroup);
            }
        }
        return null;
    }

    private final String d(String str) {
        if (str != null) {
            try {
                String strH = e0.h(str, "md5");
                Intrinsics.checkNotNullExpressionValue(strH, "hash(...)");
                String strSubstring = StringsKt.V5(strH, org.locationtech.jts.geom.l.f338160j).substring(0, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = String.valueOf(Integer.parseInt(strSubstring, CharsKt.checkRadix(16))).substring(0, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                return strSubstring2;
            } catch (Exception e10) {
                timber.log.b.f381052a.f(e10, "Bad token " + str, new Object[0]);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object f(String str, boolean z10, kotlin.coroutines.d<? super Boolean> dVar) {
        b bVar;
        e eVar;
        int i10;
        String str2;
        boolean z11;
        Object objI;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.f136471g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f136471g = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object objP = bVar2.f136469e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = bVar2.f136471g;
        try {
            if (i12 == 0) {
                ResultKt.m(objP);
                com.planner5d.library.model.manager.config.p pVar = this.f136464c;
                com.planner5d.library.services.r rVar = com.planner5d.library.services.r.oneLinkId;
                bVar2.f136465a = this;
                bVar2.f136466b = str;
                bVar2.f136467c = z10;
                bVar2.f136471g = 1;
                objP = pVar.p(rVar, 0, bVar2);
                if (objP == objL) {
                }
                return objL;
            }
            if (i12 == 1) {
                z10 = bVar2.f136467c;
                str = (String) bVar2.f136466b;
                this = (e) bVar2.f136465a;
                ResultKt.m(objP);
            } else {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(objP);
                    return objP;
                }
                i10 = bVar2.f136468d;
                boolean z12 = bVar2.f136467c;
                String str3 = (String) bVar2.f136466b;
                eVar = (e) bVar2.f136465a;
                ResultKt.m(objP);
                z11 = z12;
                str2 = str3;
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            bVar2.f136465a = null;
            bVar2.f136466b = null;
            bVar2.f136471g = 3;
            objI = eVar.i(i10, str2, zBooleanValue, z11, bVar2);
            if (objI != objL) {
                return objI;
            }
            return objL;
            int iIntValue = ((Number) objP).intValue();
            if (iIntValue == 0) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            com.planner5d.library.model.manager.config.p pVar2 = this.f136464c;
            com.planner5d.library.services.r rVar2 = com.planner5d.library.services.r.onboardingSignUp;
            bVar2.f136465a = this;
            bVar2.f136466b = str;
            bVar2.f136467c = z10;
            bVar2.f136468d = iIntValue;
            bVar2.f136471g = 2;
            Object objG = pVar2.G(rVar2, true, bVar2);
            if (objG != objL) {
                eVar = this;
                i10 = iIntValue;
                objP = objG;
                str2 = str;
                z11 = z10;
                boolean zBooleanValue2 = ((Boolean) objP).booleanValue();
                bVar2.f136465a = null;
                bVar2.f136466b = null;
                bVar2.f136471g = 3;
                objI = eVar.i(i10, str2, zBooleanValue2, z11, bVar2);
                if (objI != objL) {
                    return objI;
                }
            }
            return objL;
        } catch (Exception e10) {
            timber.log.b.f381052a.f(e10, "Failed to sign in when handling URI", new Object[0]);
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
    }

    private final void h(boolean z10, Exception exc) {
        timber.log.b.f381052a.e(exc);
        com.planner5d.library.model.manager.statistics.events.n.f217157b.M1(z10, p3.a.other, k3.c.one_link_email, false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x009a A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:40:0x00ba, B:29:0x0079, B:31:0x009a, B:35:0x00a4), top: B:46:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[Catch: Exception -> 0x00a0, TryCatch #0 {Exception -> 0x00a0, blocks: (B:40:0x00ba, B:29:0x0079, B:31:0x009a, B:35:0x00a4), top: B:46:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(int i10, String str, boolean z10, boolean z11, kotlin.coroutines.d<? super Boolean> dVar) throws Exception {
        d dVar2;
        boolean z12;
        boolean z13;
        id.d dVar3;
        com.planner5d.library.model.manager.statistics.events.n nVar;
        com.planner5d.library.modules.user.user.b bVar;
        e eVar;
        boolean z14;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f136482f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f136482f = i11 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objA0 = dVar2.f136480d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i12 = dVar2.f136482f;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z15 = dVar2.f136479c;
                boolean z16 = dVar2.f136478b;
                e eVar2 = (e) dVar2.f136477a;
                try {
                    ResultKt.m(objA0);
                    z12 = z16;
                    z13 = z15;
                    this = eVar2;
                    try {
                        dVar3 = (id.d) objA0;
                        nVar = com.planner5d.library.model.manager.statistics.events.n.f217157b;
                        nVar.M1(z12, null, k3.c.one_link_email, Intrinsics.areEqual(dVar3.f287102b, kotlin.coroutines.jvm.internal.b.a(true)), false);
                        if (Intrinsics.areEqual(dVar3.f287102b, kotlin.coroutines.jvm.internal.b.a(true))) {
                            nVar.J1(z12, k3.c.one_link_email_confirmation_link);
                        }
                        if (!z13) {
                            bVar = this.f136463b;
                            dVar2.f136477a = this;
                            dVar2.f136478b = z12;
                            dVar2.f136482f = 2;
                            if (com.planner5d.library.modules.user.user.b.f(bVar, false, dVar2, 1, null) != objL) {
                                eVar = this;
                                z14 = z12;
                                z12 = z14;
                            }
                            return objL;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Exception e11) {
                    e = e11;
                    z12 = z16;
                    this = eVar2;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z14 = dVar2.f136478b;
                eVar = (e) dVar2.f136477a;
                try {
                    ResultKt.m(objA0);
                    z12 = z14;
                } catch (Exception e12) {
                    e = e12;
                    z12 = z14;
                    this = eVar;
                }
            }
            this.h(z12, e);
            throw e;
        }
        ResultKt.m(objA0);
        try {
            com.planner5d.library.modules.user.user.t tVar = this.f136462a.get();
            dVar2.f136477a = this;
            dVar2.f136478b = z10;
            dVar2.f136479c = z11;
            dVar2.f136482f = 1;
            objA0 = tVar.A0(i10, str, dVar2);
            if (objA0 != objL) {
                z12 = z10;
                z13 = z11;
                dVar3 = (id.d) objA0;
                nVar = com.planner5d.library.model.manager.statistics.events.n.f217157b;
                nVar.M1(z12, null, k3.c.one_link_email, Intrinsics.areEqual(dVar3.f287102b, kotlin.coroutines.jvm.internal.b.a(true)), false);
                if (Intrinsics.areEqual(dVar3.f287102b, kotlin.coroutines.jvm.internal.b.a(true))) {
                    nVar.J1(z12, k3.c.one_link_email_confirmation_link);
                }
                if (!z13) {
                    bVar = this.f136463b;
                    dVar2.f136477a = this;
                    dVar2.f136478b = z12;
                    dVar2.f136482f = 2;
                    if (com.planner5d.library.modules.user.user.b.f(bVar, false, dVar2, 1, null) != objL) {
                        eVar = this;
                        z14 = z12;
                        z12 = z14;
                    }
                }
            }
            return objL;
        } catch (Exception e13) {
            e = e13;
            z12 = z10;
        }
        return kotlin.coroutines.jvm.internal.b.a(true);
    }

    @Nullable
    public final Object e(@NotNull Uri uri, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        String strC = c(uri);
        return strC == null ? kotlin.coroutines.jvm.internal.b.a(false) : f(strC, false, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object g(@NotNull Intent intent, boolean z10, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f136476e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f136476e = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objF = cVar.f136474c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f136476e;
        if (i11 == 0) {
            ResultKt.m(objF);
            String strC = c(intent.getData());
            if (strC == null) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }
            cVar.f136472a = intent;
            cVar.f136473b = z10;
            cVar.f136476e = 1;
            objF = f(strC, z10, cVar);
            if (objF == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = cVar.f136473b;
            intent = (Intent) cVar.f136472a;
            ResultKt.m(objF);
        }
        if (((Boolean) objF).booleanValue() && z10) {
            com.planner5d.library.model.manager.i.f191511e.b(intent);
        }
        return objF;
    }
}
