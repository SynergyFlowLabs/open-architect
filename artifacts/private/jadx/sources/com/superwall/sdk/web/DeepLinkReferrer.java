package com.superwall.sdk.web;

import android.content.Context;
import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.superwall.sdk.deeplinks.DeepLinkRouterKt;
import com.superwall.sdk.misc.IOScope;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import kotlin.text.Regex;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDeepLinkReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinkReferrer.kt\ncom/superwall/sdk/web/DeepLinkReferrer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n774#2:133\n865#2,2:134\n1279#2,2:136\n1293#2,2:138\n774#2:140\n865#2,2:141\n1557#2:143\n1628#2,3:144\n1296#2:147\n*S KotlinDebug\n*F\n+ 1 DeepLinkReferrer.kt\ncom/superwall/sdk/web/DeepLinkReferrer\n*L\n119#1:133\n119#1:134,2\n124#1:136,2\n124#1:138,2\n127#1:140\n127#1:141,2\n128#1:143\n128#1:144,3\n124#1:147\n*E\n"})
public final class DeepLinkReferrer implements CheckForReferral {

    @Nullable
    private InstallReferrerClient referrerClient;

    @NotNull
    private final IOScope scope;

    private static final class ConnectionListener implements InstallReferrerStateListener {

        @NotNull
        private final Function0<Unit> disconnected;

        @NotNull
        private final Function1<Integer, Unit> finished;

        /* JADX WARN: Multi-variable type inference failed */
        public ConnectionListener(@NotNull Function1<? super Integer, Unit> finished, @NotNull Function0<Unit> disconnected) {
            Intrinsics.checkNotNullParameter(finished, "finished");
            Intrinsics.checkNotNullParameter(disconnected, "disconnected");
            this.finished = finished;
            this.disconnected = disconnected;
        }

        @NotNull
        public final Function0<Unit> getDisconnected() {
            return this.disconnected;
        }

        @NotNull
        public final Function1<Integer, Unit> getFinished() {
            return this.finished;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            this.disconnected.invoke();
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            this.finished.invoke(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.web.DeepLinkReferrer$tryConnecting$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.DeepLinkReferrer$tryConnecting$1", f = "DeepLinkReferrer.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160732u0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $connect;
        final /* synthetic */ int $timeout;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.web.DeepLinkReferrer$tryConnecting$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.web.DeepLinkReferrer$tryConnecting$1$1", f = "DeepLinkReferrer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C18891 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ Function0<Unit> $connect;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18891(Function0<Unit> function0, kotlin.coroutines.d<? super C18891> dVar) {
                super(2, dVar);
                this.$connect = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C18891(this.$connect, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                this.$connect.invoke();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C18891) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i10, Function0<Unit> function0, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$timeout = i10;
            this.$connect = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$timeout, this.$connect, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlin.time.c.a aVar = kotlin.time.c.f313406b;
                long jM0 = kotlin.time.e.m0(this.$timeout, kotlin.time.f.MILLISECONDS);
                C18891 c18891 = new C18891(this.$connect, null);
                this.label = 1;
                if (b4.d(jM0, c18891, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public DeepLinkReferrer(@NotNull Function0<? extends Context> context, @NotNull IOScope scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.referrerClient = InstallReferrerClient.newBuilder(context.invoke()).build();
        tryConnecting$default(this, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstallReferrerClient getReferrerClient() {
        InstallReferrerClient installReferrerClient = this.referrerClient;
        if (installReferrerClient == null || !installReferrerClient.isReady()) {
            return null;
        }
        return this.referrerClient;
    }

    private final Map<String, List<String>> getUrlParams(String str) {
        List<String> listO = new Regex("\\?").o(str, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() < 2) {
            return MapsKt.emptyMap();
        }
        String str2 = (String) arrayList.get(1);
        List listListOf = CollectionsKt.listOf("item");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj2 : listListOf) {
            List<String> listO2 = new Regex("&?" + ((String) obj2) + "=").o(str2, 0);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listO2) {
                if (((String) obj3).length() > 0) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(URLDecoder.decode((String) it.next(), "UTF-8"));
            }
            linkedHashMap.put(obj2, arrayList3);
        }
        return linkedHashMap;
    }

    public static /* synthetic */ void tryConnecting$default(DeepLinkReferrer deepLinkReferrer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        deepLinkReferrer.tryConnecting(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tryConnecting$lambda$2(final DeepLinkReferrer deepLinkReferrer, final int i10) {
        InstallReferrerClient referrerClient = deepLinkReferrer.getReferrerClient();
        if (referrerClient == null) {
            return null;
        }
        referrerClient.startConnection(new ConnectionListener(new Function1() { // from class: com.superwall.sdk.web.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeepLinkReferrer.tryConnecting$lambda$2$lambda$0(this.f267535a, ((Integer) obj).intValue());
            }
        }, new Function0() { // from class: com.superwall.sdk.web.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeepLinkReferrer.tryConnecting$lambda$2$lambda$1(this.f267536a, i10);
            }
        }));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tryConnecting$lambda$2$lambda$0(DeepLinkReferrer deepLinkReferrer, int i10) {
        ReferrerDetails installReferrer;
        if (i10 == 0) {
            InstallReferrerClient referrerClient = deepLinkReferrer.getReferrerClient();
            if (referrerClient != null && (installReferrer = referrerClient.getInstallReferrer()) != null) {
                installReferrer.getInstallReferrer();
            }
        } else {
            InstallReferrerClient referrerClient2 = deepLinkReferrer.getReferrerClient();
            if (referrerClient2 != null) {
                referrerClient2.endConnection();
            }
            deepLinkReferrer.referrerClient = null;
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tryConnecting$lambda$2$lambda$1(DeepLinkReferrer deepLinkReferrer, int i10) {
        deepLinkReferrer.tryConnecting(i10 + 1000);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.superwall.sdk.web.CheckForReferral
    @Nullable
    /* JADX INFO: renamed from: checkForReferral-IoAF18A */
    public Object mo80checkForReferralIoAF18A(@NotNull kotlin.coroutines.d<? super Result<String>> dVar) {
        DeepLinkReferrer$checkForReferral$1 deepLinkReferrer$checkForReferral$1;
        Map<String, List<String>> mapEmptyMap;
        if (dVar instanceof DeepLinkReferrer$checkForReferral$1) {
            deepLinkReferrer$checkForReferral$1 = (DeepLinkReferrer$checkForReferral$1) dVar;
            int i10 = deepLinkReferrer$checkForReferral$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deepLinkReferrer$checkForReferral$1.label = i10 - Integer.MIN_VALUE;
            } else {
                deepLinkReferrer$checkForReferral$1 = new DeepLinkReferrer$checkForReferral$1(this, dVar);
            }
        } else {
            deepLinkReferrer$checkForReferral$1 = new DeepLinkReferrer$checkForReferral$1(this, dVar);
        }
        Object objF = deepLinkReferrer$checkForReferral$1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = deepLinkReferrer$checkForReferral$1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objF);
                kotlin.time.c.a aVar = kotlin.time.c.f313406b;
                long jM0 = kotlin.time.e.m0(30, kotlin.time.f.SECONDS);
                DeepLinkReferrer$checkForReferral$2 deepLinkReferrer$checkForReferral$2 = new DeepLinkReferrer$checkForReferral$2(this, null);
                deepLinkReferrer$checkForReferral$1.L$0 = this;
                deepLinkReferrer$checkForReferral$1.label = 1;
                objF = b4.f(jM0, deepLinkReferrer$checkForReferral$2, deepLinkReferrer$checkForReferral$1);
                if (objF == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (DeepLinkReferrer) deepLinkReferrer$checkForReferral$1.L$0;
                ResultKt.m(objF);
            }
            String str = (String) objF;
            if (str == null || (mapEmptyMap = this.getUrlParams(str)) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            List<String> list = mapEmptyMap.get("code");
            String str2 = list != null ? (String) CollectionsKt.firstOrNull((List) list) : null;
            InstallReferrerClient referrerClient = this.getReferrerClient();
            if (referrerClient != null) {
                referrerClient.endConnection();
            }
            this.referrerClient = null;
            if (str2 == null) {
                Result.a aVar2 = Result.Companion;
                return Result.m785constructorimpl(ResultKt.createFailure(new IllegalStateException("Play store cannot connect")));
            }
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(str2);
        } catch (Throwable th2) {
            Result.a aVar4 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // com.superwall.sdk.web.CheckForReferral
    @NotNull
    /* JADX INFO: renamed from: handleDeepLink-IoAF18A */
    public Object mo81handleDeepLinkIoAF18A(@NotNull Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return DeepLinkRouterKt.getRedeemableCode(url);
    }

    public final void tryConnecting(final int i10) {
        try {
            try {
                Function0 function0 = new Function0() { // from class: com.superwall.sdk.web.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeepLinkReferrer.tryConnecting$lambda$2(this.f267533a, i10);
                    }
                };
                if (i10 == 0) {
                    function0.invoke();
                } else {
                    k.f(this.scope, null, null, new AnonymousClass1(i10, function0, null), 3, null);
                }
            } catch (Throwable unused) {
                Result.a aVar = Result.Companion;
                InstallReferrerClient referrerClient = getReferrerClient();
                if (referrerClient != null) {
                    referrerClient.endConnection();
                }
                this.referrerClient = null;
                Result.m785constructorimpl(Unit.f312394a);
            }
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
