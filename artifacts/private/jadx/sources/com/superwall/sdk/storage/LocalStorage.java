package com.superwall.sdk.storage;

import android.content.Context;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.TrackingResult;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.dependencies.DeviceHelperFactory;
import com.superwall.sdk.dependencies.HasExternalPurchaseControllerFactory;
import com.superwall.sdk.misc.ConstantsKt;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.network.device.DeviceInfo;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import java.util.Date;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class LocalStorage implements Storage, s0 {

    @Nullable
    private Map<String, Experiment.Variant> _confirmedAssignments;
    private boolean _didTrackFirstSeen;
    private boolean _didTrackFirstSession;

    @NotNull
    private String apiKey;

    @NotNull
    private final Cache cache;

    @NotNull
    private final CoreDataManager coreDataManager;

    @NotNull
    private final CoroutineContext coroutineContext;

    @NotNull
    private String debugKey;

    @NotNull
    private final Factory factory;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final Json json;
    private boolean neverCalledStaticConfig;

    public interface Factory extends DeviceHelperFactory, HasExternalPurchaseControllerFactory {
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.LocalStorage$recordAppInstall$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.storage.LocalStorage$recordAppInstall$1", f = "LocalStorage.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ DeviceInfo $deviceInfo;
        final /* synthetic */ boolean $hasExternalPurchaseController;
        final /* synthetic */ Function2<Trackable, d<? super Result<TrackingResult>>, Object> $trackEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(DeviceInfo deviceInfo, boolean z10, Function2<? super Trackable, ? super d<? super Result<TrackingResult>>, ? extends Object> function2, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$deviceInfo = deviceInfo;
            this.$hasExternalPurchaseController = z10;
            this.$trackEvent = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$deviceInfo, this.$hasExternalPurchaseController, this.$trackEvent, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = b.l();
            int i10 = this.label;
            int i11 = 6 << 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.AppInstall appInstall = new InternalSuperwallEvent.AppInstall(this.$deviceInfo.getAppInstalledAtString(), this.$hasExternalPurchaseController, null, 4, null);
                Function2<Trackable, d<? super Result<TrackingResult>>, Object> function2 = this.$trackEvent;
                this.label = 1;
                if (function2.invoke(appInstall, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.LocalStorage$recordFirstSeenTracked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.LocalStorage$recordFirstSeenTracked$1", f = "LocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27301 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.storage.LocalStorage$recordFirstSeenTracked$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "com.superwall.sdk.storage.LocalStorage$recordFirstSeenTracked$1$1", f = "LocalStorage.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
        static final class C18871 extends o implements Function2<s0, d<? super Unit>, Object> {
            int label;

            C18871(d<? super C18871> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C18871(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    Superwall companion = Superwall.Companion.getInstance();
                    InternalSuperwallEvent.FirstSeen firstSeen = new InternalSuperwallEvent.FirstSeen(null, 1, null);
                    this.label = 1;
                    if (TrackingKt.track(companion, firstSeen, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    ((Result) obj).j();
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((C18871) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        C27301(d<? super C27301> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return LocalStorage.this.new C27301(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (LocalStorage.this._didTrackFirstSeen) {
                return Unit.f312394a;
            }
            k.f(t0.a(l1.c()), null, null, new C18871(null), 3, null);
            LocalStorage.this.write(DidTrackFirstSeen.INSTANCE, kotlin.coroutines.jvm.internal.b.a(true));
            LocalStorage.this._didTrackFirstSeen = true;
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27301) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.LocalStorage$recordFirstSessionTracked$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.LocalStorage$recordFirstSessionTracked$1", f = "LocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27311 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27311(d<? super C27311> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return LocalStorage.this.new C27311(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (LocalStorage.this._didTrackFirstSession) {
                return Unit.f312394a;
            }
            LocalStorage.this.write(DidTrackFirstSession.INSTANCE, kotlin.coroutines.jvm.internal.b.a(true));
            LocalStorage.this._didTrackFirstSession = true;
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27311) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.storage.LocalStorage$reset$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.storage.LocalStorage$reset$1", f = "LocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27321 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27321(d<? super C27321> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return LocalStorage.this.new C27321(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            LocalStorage.this._confirmedAssignments = null;
            LocalStorage.this._didTrackFirstSeen = false;
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27321) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public LocalStorage(@NotNull Context context, @NotNull Json json, @NotNull Factory factory, @NotNull IOScope ioScope, @NotNull Cache cache, @NotNull CoreDataManager coreDataManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(coreDataManager, "coreDataManager");
        this.json = json;
        this.factory = factory;
        this.ioScope = ioScope;
        this.cache = cache;
        this.coreDataManager = coreDataManager;
        this.apiKey = "";
        this.debugKey = "";
        this.coroutineContext = n0.d0(l1.c(), 1, null, 2, null);
        Object obj = cache.read(DidTrackFirstSeen.INSTANCE);
        Boolean bool = Boolean.TRUE;
        boolean zAreEqual = Intrinsics.areEqual(obj, bool);
        this._didTrackFirstSeen = zAreEqual;
        if (zAreEqual) {
            this._didTrackFirstSession = true;
        } else {
            this._didTrackFirstSession = Intrinsics.areEqual(cache.read(DidTrackFirstSession.INSTANCE), bool);
        }
    }

    private final Map<String, Experiment.Variant> getP_confirmedAssignments() {
        return (Map) i.f(getCoroutineContext(), new LocalStorage$p_confirmedAssignments$1(this, null));
    }

    private final void setP_confirmedAssignments(Map<String, Experiment.Variant> map) {
        k.f(this, null, null, new LocalStorage$p_confirmedAssignments$2(this, map, null), 3, null);
    }

    private final void updateSdkVersion() {
        String sdkVersion = ConstantsKt.getSdkVersion();
        SdkVersion sdkVersion2 = SdkVersion.INSTANCE;
        String str = (String) read(sdkVersion2);
        if (!Intrinsics.areEqual(sdkVersion, str)) {
            write(sdkVersion2, sdkVersion);
        }
        if (str == null) {
            this.neverCalledStaticConfig = true;
        }
    }

    @Override // com.superwall.sdk.storage.Storage
    public void clean() {
        reset();
    }

    public void clearCachedSessionEvents() {
        this.cache.delete(Transactions.INSTANCE);
    }

    public final void configure(@NotNull String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        updateSdkVersion();
        this.apiKey = apiKey;
    }

    @Override // com.superwall.sdk.storage.Storage
    public <T> void delete(@NotNull Storable<T> storable) {
        Intrinsics.checkNotNullParameter(storable, "storable");
        this.cache.delete(storable);
    }

    @NotNull
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public Map<String, Experiment.Variant> getConfirmedAssignments() {
        Map<String, Experiment.Variant> p_confirmedAssignments = getP_confirmedAssignments();
        if (p_confirmedAssignments != null) {
            return p_confirmedAssignments;
        }
        Map<String, Experiment.Variant> mapEmptyMap = (Map) read(ConfirmedAssignments.INSTANCE);
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        setP_confirmedAssignments(mapEmptyMap);
        return mapEmptyMap;
    }

    @NotNull
    public final CoreDataManager getCoreDataManager() {
        return this.coreDataManager;
    }

    @Override // kotlinx.coroutines.s0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public final String getDebugKey() {
        return this.debugKey;
    }

    public final boolean getDidTrackFirstSeen() {
        return ((Boolean) i.f(getCoroutineContext(), new LocalStorage$didTrackFirstSeen$1(this, null))).booleanValue();
    }

    public final boolean getDidTrackFirstSession() {
        return ((Boolean) i.f(getCoroutineContext(), new LocalStorage$didTrackFirstSession$1(this, null))).booleanValue();
    }

    public final boolean getNeverCalledStaticConfig() {
        return this.neverCalledStaticConfig;
    }

    @Override // com.superwall.sdk.storage.Storage
    @Nullable
    public <T> T read(@NotNull Storable<T> storable) {
        Intrinsics.checkNotNullParameter(storable, "storable");
        return (T) this.cache.read(storable);
    }

    public final void recordAppInstall(@NotNull Function2<? super Trackable, ? super d<? super Result<TrackingResult>>, ? extends Object> trackEvent) {
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        DidTrackAppInstall didTrackAppInstall = DidTrackAppInstall.INSTANCE;
        Boolean bool = (Boolean) read(didTrackAppInstall);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        k.f(this.ioScope, null, null, new AnonymousClass1(this.factory.makeDeviceInfo(), this.factory.makeHasExternalPurchaseController(), trackEvent, null), 3, null);
        write(didTrackAppInstall, Boolean.TRUE);
    }

    public final void recordFirstSeenTracked() {
        k.f(this, null, null, new C27301(null), 3, null);
    }

    public final void recordFirstSessionTracked() {
        k.f(this, null, null, new C27311(null), 3, null);
    }

    public final void reset() {
        this.coreDataManager.deleteAllEntities();
        this.cache.clean();
        int i10 = 0 >> 0;
        k.f(this, null, null, new C27321(null), 3, null);
        recordFirstSeenTracked();
    }

    public void saveConfirmedAssignments(@NotNull Map<String, Experiment.Variant> assignments) {
        Intrinsics.checkNotNullParameter(assignments, "assignments");
        write(ConfirmedAssignments.INSTANCE, assignments);
        setP_confirmedAssignments(assignments);
    }

    public final void setApiKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apiKey = str;
    }

    public final void setDebugKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.debugKey = str;
    }

    public final void setDidTrackFirstSeen(boolean z10) {
        k.f(this, null, null, new LocalStorage$didTrackFirstSeen$2(this, z10, null), 3, null);
    }

    public final void setDidTrackFirstSession(boolean z10) {
        k.f(this, null, null, new LocalStorage$didTrackFirstSession$2(this, z10, null), 3, null);
    }

    public final void setNeverCalledStaticConfig(boolean z10) {
        this.neverCalledStaticConfig = z10;
    }

    public final void trackPaywallOpen() {
        TotalPaywallViews totalPaywallViews = TotalPaywallViews.INSTANCE;
        Integer num = (Integer) read(totalPaywallViews);
        write(totalPaywallViews, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        write(LastPaywallView.INSTANCE, new Date());
    }

    @Override // com.superwall.sdk.storage.Storage
    public <T> void write(@NotNull Storable<T> storable, @NotNull T data) {
        Intrinsics.checkNotNullParameter(storable, "storable");
        Intrinsics.checkNotNullParameter(data, "data");
        this.cache.write(storable, data);
    }

    public /* synthetic */ LocalStorage(Context context, Json json, Factory factory, IOScope iOScope, Cache cache, CoreDataManager coreDataManager, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 16) != 0) {
            cache = new Cache(context, null, json, 2, null);
        }
        this(context, json, factory, iOScope, cache, (i10 & 32) != 0 ? new CoreDataManager(context) : coreDataManager);
    }
}
