package com.superwall.sdk.dependencies;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.identity.IdentityManager;
import com.superwall.sdk.misc.AppLifecycleObserver;
import com.superwall.sdk.network.Api;
import com.superwall.sdk.network.JsonFactory;
import com.superwall.sdk.network.device.DeviceHelper;
import com.superwall.sdk.storage.LocalStorage;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface ApiFactory extends JsonFactory {

    public static final class DefaultImpls {
        @NotNull
        public static Json json(@NotNull ApiFactory apiFactory) {
            return JsonFactory.DefaultImpls.json(apiFactory);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Nullable
        public static Object track(@NotNull ApiFactory apiFactory, @NotNull Trackable trackable, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            AnonymousClass1 anonymousClass1;
            if (dVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) dVar;
                int i10 = anonymousClass1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(dVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
            Object obj = anonymousClass1.result;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = anonymousClass1.label;
            if (i11 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                anonymousClass1.label = 1;
                if (TrackingKt.track(companion, trackable, anonymousClass1) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.ApiFactory$track$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.ApiFactory$DefaultImpls", f = "FactoryProtocols.kt", i = {}, l = {55}, m = "track", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.track(null, null, this);
        }
    }

    @NotNull
    Api getApi();

    @NotNull
    AppLifecycleObserver getAppLifecycleObserver();

    @NotNull
    ConfigManager getConfigManager();

    @NotNull
    DeviceHelper getDeviceHelper();

    @NotNull
    IdentityManager getIdentityManager();

    @NotNull
    LocalStorage getStorage();

    @Nullable
    Object makeHeaders(boolean z10, @NotNull String str, @NotNull kotlin.coroutines.d<? super Map<String, String>> dVar);

    void setApi(@NotNull Api api);

    void setAppLifecycleObserver(@NotNull AppLifecycleObserver appLifecycleObserver);

    void setConfigManager(@NotNull ConfigManager configManager);

    void setDeviceHelper(@NotNull DeviceHelper deviceHelper);

    void setIdentityManager(@NotNull IdentityManager identityManager);

    void setStorage(@NotNull LocalStorage localStorage);

    @Nullable
    Object track(@NotNull Trackable trackable, @NotNull kotlin.coroutines.d<? super Unit> dVar);
}
