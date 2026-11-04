package io.customer.messaginginapp;

import eh.d;
import hh.a;
import ih.e;
import io.customer.messaginginapp.ModuleMessagingInApp;
import io.customer.messaginginapp.di.DIGraphMessagingInAppKt;
import io.customer.messaginginapp.gist.data.model.Message;
import io.customer.messaginginapp.gist.presentation.GistListener;
import io.customer.messaginginapp.gist.presentation.GistProvider;
import io.customer.messaginginapp.type.InAppEventListener;
import io.customer.messaginginapp.type.InAppMessage;
import io.customer.sdk.communication.b;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nModuleMessagingInApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleMessagingInApp.kt\nio/customer/messaginginapp/ModuleMessagingInApp\n+ 2 EventBus.kt\nio/customer/sdk/communication/EventBusKt\n*L\n1#1,107:1\n28#2:108\n28#2:109\n28#2:110\n*S KotlinDebug\n*F\n+ 1 ModuleMessagingInApp.kt\nio/customer/messaginginapp/ModuleMessagingInApp\n*L\n34#1:108\n38#1:109\n42#1:110\n*E\n"})
public final class ModuleMessagingInApp implements a<MessagingInAppModuleConfig>, GistListener {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String MODULE_NAME = "MessagingInApp";

    @NotNull
    private final b eventBus;

    @NotNull
    private final e logger;

    @NotNull
    private final MessagingInAppModuleConfig moduleConfig;

    @NotNull
    private final String moduleName;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @n
        @NotNull
        public final ModuleMessagingInApp instance() {
            a<? extends hh.b> aVar = d.f274883c.x().get(ModuleMessagingInApp.MODULE_NAME);
            ModuleMessagingInApp moduleMessagingInApp = aVar instanceof ModuleMessagingInApp ? (ModuleMessagingInApp) aVar : null;
            if (moduleMessagingInApp != null) {
                return moduleMessagingInApp;
            }
            throw new IllegalStateException("ModuleMessagingInApp not initialized");
        }

        private Companion() {
        }
    }

    public ModuleMessagingInApp(@NotNull MessagingInAppModuleConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.moduleName = MODULE_NAME;
        this.moduleConfig = config;
        d dVar = d.f274883c;
        this.eventBus = dVar.v();
        this.logger = dVar.w();
    }

    private final GistProvider getGistProvider() {
        return DIGraphMessagingInAppKt.getGistProvider(d.f274883c);
    }

    @n
    @NotNull
    public static final ModuleMessagingInApp instance() {
        return Companion.instance();
    }

    private final void setupHooks() {
        this.eventBus.c(j1.d(io.customer.sdk.communication.a.e.class), new ModuleMessagingInApp$setupHooks$$inlined$subscribe$1(new Function1() { // from class: vg.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModuleMessagingInApp.setupHooks$lambda$0(this.f385761a, (io.customer.sdk.communication.a.e) obj);
            }
        }));
        this.eventBus.c(j1.d(io.customer.sdk.communication.a.b.class), new ModuleMessagingInApp$setupHooks$$inlined$subscribe$2(new Function1() { // from class: vg.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModuleMessagingInApp.setupHooks$lambda$1(this.f385762a, (io.customer.sdk.communication.a.b) obj);
            }
        }));
        this.eventBus.c(j1.d(io.customer.sdk.communication.a.d.class), new ModuleMessagingInApp$setupHooks$$inlined$subscribe$3(new Function1() { // from class: vg.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModuleMessagingInApp.setupHooks$lambda$2(this.f385763a, (io.customer.sdk.communication.a.d) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupHooks$lambda$0(ModuleMessagingInApp moduleMessagingInApp, io.customer.sdk.communication.a.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        moduleMessagingInApp.getGistProvider().setCurrentRoute(it.g());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupHooks$lambda$1(ModuleMessagingInApp moduleMessagingInApp, io.customer.sdk.communication.a.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        moduleMessagingInApp.getGistProvider().setUserId(it.g());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupHooks$lambda$2(ModuleMessagingInApp moduleMessagingInApp, io.customer.sdk.communication.a.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        e.a.a(moduleMessagingInApp.logger, "Resetting user token", null, 2, null);
        moduleMessagingInApp.getGistProvider().reset();
        return Unit.f312394a;
    }

    public final void dismissMessage() {
        getGistProvider().dismissMessage();
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistListener
    public void embedMessage(@NotNull Message message, @NotNull String elementId) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(elementId, "elementId");
    }

    @Override // hh.a
    @NotNull
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // hh.a
    public void initialize() {
        setupHooks();
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistListener
    public void onAction(@NotNull Message message, @NotNull String currentRoute, @NotNull String action, @NotNull String name) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(currentRoute, "currentRoute");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(name, "name");
        InAppEventListener eventListener = getModuleConfig().getEventListener();
        if (eventListener != null) {
            eventListener.messageActionTaken(InAppMessage.Companion.getFromGistMessage$messaginginapp_release(message), action, name);
        }
        String campaignId = message.getGistProperties().getCampaignId();
        if (campaignId != null) {
            e.a.a(this.logger, "In-app message clicked with deliveryId: " + campaignId + " with action: " + action + " and name: " + name, null, 2, null);
            if (!Intrinsics.areEqual(action, "gist://close")) {
                this.eventBus.d(new io.customer.sdk.communication.a.f(campaignId, kh.a.Clicked, MapsKt.mapOf(TuplesKt.to("actionName", name), TuplesKt.to("actionValue", action))));
            }
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistListener
    public void onError(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        e.a.b(this.logger, "Error occurred on message: " + message, null, null, 6, null);
        InAppEventListener eventListener = getModuleConfig().getEventListener();
        if (eventListener != null) {
            eventListener.errorWithMessage(InAppMessage.Companion.getFromGistMessage$messaginginapp_release(message));
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistListener
    public void onMessageCancelled(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistListener
    public void onMessageDismissed(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InAppEventListener eventListener = getModuleConfig().getEventListener();
        if (eventListener != null) {
            eventListener.messageDismissed(InAppMessage.Companion.getFromGistMessage$messaginginapp_release(message));
        }
    }

    @Override // io.customer.messaginginapp.gist.presentation.GistListener
    public void onMessageShown(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InAppEventListener eventListener = getModuleConfig().getEventListener();
        if (eventListener != null) {
            eventListener.messageShown(InAppMessage.Companion.getFromGistMessage$messaginginapp_release(message));
        }
        String campaignId = message.getGistProperties().getCampaignId();
        if (campaignId != null) {
            e.a.a(this.logger, "In-app message shown with deliveryId " + campaignId, null, 2, null);
            int i10 = 6 & 0;
            this.eventBus.d(new io.customer.sdk.communication.a.f(campaignId, kh.a.Opened, null, 4, null));
        }
    }

    @Override // hh.a
    @NotNull
    public MessagingInAppModuleConfig getModuleConfig() {
        return this.moduleConfig;
    }
}
