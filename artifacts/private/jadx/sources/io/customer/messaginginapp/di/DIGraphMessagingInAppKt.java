package io.customer.messaginginapp.di;

import com.google.gson.f;
import eh.d;
import io.customer.messaginginapp.MessagingInAppModuleConfig;
import io.customer.messaginginapp.ModuleMessagingInApp;
import io.customer.messaginginapp.gist.data.listeners.GistQueue;
import io.customer.messaginginapp.gist.data.listeners.Queue;
import io.customer.messaginginapp.gist.presentation.GistProvider;
import io.customer.messaginginapp.gist.presentation.GistSdk;
import io.customer.messaginginapp.gist.utilities.ModalMessageGsonParser;
import io.customer.messaginginapp.gist.utilities.ModalMessageParser;
import io.customer.messaginginapp.gist.utilities.ModalMessageParserDefault;
import io.customer.messaginginapp.state.InAppMessagingManager;
import io.customer.messaginginapp.store.InAppPreferenceStore;
import io.customer.messaginginapp.store.InAppPreferenceStoreImpl;
import io.customer.sdk.k;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDIGraphMessagingInApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DIGraphMessagingInApp.kt\nio/customer/messaginginapp/di/DIGraphMessagingInAppKt\n+ 2 DiGraph.kt\nio/customer/sdk/core/di/DiGraph\n+ 3 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n95#2,5:63\n34#2:68\n24#2:69\n48#2,2:70\n24#2:72\n50#2:73\n95#2,5:77\n34#2:82\n24#2:83\n48#2,2:84\n24#2:86\n50#2:87\n95#2,5:91\n34#2:96\n24#2:97\n48#2,2:98\n24#2:100\n50#2:101\n95#2,5:105\n34#2:110\n24#2:111\n48#2,2:112\n24#2:114\n50#2:115\n95#2,5:119\n34#2:124\n24#2:125\n48#2,2:126\n24#2:128\n50#2:129\n95#2,5:133\n34#2:138\n24#2:139\n48#2,2:140\n24#2:142\n50#2:143\n72#3,2:74\n72#3,2:88\n72#3,2:102\n72#3,2:116\n72#3,2:130\n72#3,2:144\n1#4:76\n1#4:90\n1#4:104\n1#4:118\n1#4:132\n1#4:146\n*S KotlinDebug\n*F\n+ 1 DIGraphMessagingInApp.kt\nio/customer/messaginginapp/di/DIGraphMessagingInAppKt\n*L\n20#1:63,5\n20#1:68\n20#1:69\n20#1:70,2\n20#1:72\n20#1:73\n26#1:77,5\n26#1:82\n26#1:83\n26#1:84,2\n26#1:86\n26#1:87\n34#1:91,5\n34#1:96\n34#1:97\n34#1:98,2\n34#1:100\n34#1:101\n37#1:105,5\n37#1:110\n37#1:111\n37#1:112,2\n37#1:114\n37#1:115\n40#1:119,5\n40#1:124\n40#1:125\n40#1:126,2\n40#1:128\n40#1:129\n45#1:133,5\n45#1:138\n45#1:139\n45#1:140,2\n45#1:142\n45#1:143\n20#1:74,2\n26#1:88,2\n34#1:102,2\n37#1:116,2\n40#1:130,2\n45#1:144,2\n20#1:76\n26#1:90\n34#1:104\n37#1:118\n40#1:132\n45#1:146\n*E\n"})
public final class DIGraphMessagingInAppKt {
    @NotNull
    public static final GistProvider getGistProvider(@NotNull d dVar) {
        GistProvider gistProvider;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = GistProvider.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof GistProvider)) {
            obj = null;
        }
        GistProvider gistProvider2 = (GistProvider) obj;
        if (gistProvider2 != null) {
            return gistProvider2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = GistProvider.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object obj2 = concurrentHashMapG.get(name2);
                if (obj2 == null) {
                    GistSdk gistSdk = new GistSdk(getInAppModuleConfig(dVar).getSiteId(), getInAppModuleConfig(dVar).getRegion().a(), null, 4, null);
                    Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, gistSdk);
                    obj2 = objPutIfAbsent == null ? gistSdk : objPutIfAbsent;
                }
                gistProvider = (GistProvider) obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gistProvider;
    }

    @NotNull
    public static final GistQueue getGistQueue(@NotNull d dVar) {
        GistQueue gistQueue;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = GistQueue.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof GistQueue)) {
            obj = null;
        }
        GistQueue gistQueue2 = (GistQueue) obj;
        if (gistQueue2 != null) {
            return gistQueue2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = GistQueue.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object queue = concurrentHashMapG.get(name2);
                if (queue == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (queue = new Queue()))) != null) {
                    queue = objPutIfAbsent;
                }
                gistQueue = (GistQueue) queue;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gistQueue;
    }

    @NotNull
    public static final GistSdk getGistSdk(@NotNull d dVar) {
        GistSdk gistSdk;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = GistSdk.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof GistSdk)) {
            obj = null;
            boolean z10 = false & false;
        }
        GistSdk gistSdk2 = (GistSdk) obj;
        if (gistSdk2 != null) {
            return gistSdk2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = GistSdk.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object obj2 = concurrentHashMapG.get(name2);
                if (obj2 == null) {
                    GistSdk gistSdk3 = new GistSdk(getInAppModuleConfig(dVar).getSiteId(), getInAppModuleConfig(dVar).getRegion().a(), null, 4, null);
                    Object objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, gistSdk3);
                    obj2 = objPutIfAbsent == null ? gistSdk3 : objPutIfAbsent;
                }
                gistSdk = (GistSdk) obj2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gistSdk;
    }

    @NotNull
    public static final ModuleMessagingInApp getInAppMessaging(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return ModuleMessagingInApp.Companion.instance();
    }

    @NotNull
    public static final InAppMessagingManager getInAppMessagingManager(@NotNull d dVar) {
        InAppMessagingManager inAppMessagingManager;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = InAppMessagingManager.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof InAppMessagingManager)) {
            obj = null;
        }
        InAppMessagingManager inAppMessagingManager2 = (InAppMessagingManager) obj;
        if (inAppMessagingManager2 != null) {
            return inAppMessagingManager2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = InAppMessagingManager.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object inAppMessagingManager3 = concurrentHashMapG.get(name2);
                if (inAppMessagingManager3 == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (inAppMessagingManager3 = new InAppMessagingManager(getInAppMessaging(dVar))))) != null) {
                    inAppMessagingManager3 = objPutIfAbsent;
                }
                inAppMessagingManager = (InAppMessagingManager) inAppMessagingManager3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return inAppMessagingManager;
    }

    @NotNull
    public static final MessagingInAppModuleConfig getInAppModuleConfig(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return getInAppMessaging(dVar).getModuleConfig();
    }

    @NotNull
    public static final InAppPreferenceStore getInAppPreferenceStore(@NotNull d dVar) {
        InAppPreferenceStore inAppPreferenceStore;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = InAppPreferenceStore.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof InAppPreferenceStore)) {
            obj = null;
        }
        InAppPreferenceStore inAppPreferenceStore2 = (InAppPreferenceStore) obj;
        if (inAppPreferenceStore2 != null) {
            return inAppPreferenceStore2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = InAppPreferenceStore.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object inAppPreferenceStoreImpl = concurrentHashMapG.get(name2);
                if (inAppPreferenceStoreImpl == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (inAppPreferenceStoreImpl = new InAppPreferenceStoreImpl(dVar.q().r())))) != null) {
                    inAppPreferenceStoreImpl = objPutIfAbsent;
                }
                inAppPreferenceStore = (InAppPreferenceStore) inAppPreferenceStoreImpl;
            } finally {
            }
        }
        return inAppPreferenceStore;
    }

    @NotNull
    public static final ModalMessageParser getModalMessageParser(@NotNull d dVar) {
        ModalMessageParser modalMessageParser;
        Object objPutIfAbsent;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ConcurrentHashMap<String, Object> concurrentHashMapF = dVar.f();
        String name = ModalMessageParser.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = concurrentHashMapF.get(name);
        if (!(obj instanceof ModalMessageParser)) {
            obj = null;
        }
        ModalMessageParser modalMessageParser2 = (ModalMessageParser) obj;
        if (modalMessageParser2 != null) {
            return modalMessageParser2;
        }
        synchronized (dVar.g()) {
            try {
                String name2 = ModalMessageParser.class.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                ConcurrentHashMap<String, Object> concurrentHashMapG = dVar.g();
                Object modalMessageParserDefault = concurrentHashMapG.get(name2);
                if (modalMessageParserDefault == null && (objPutIfAbsent = concurrentHashMapG.putIfAbsent(name2, (modalMessageParserDefault = new ModalMessageParserDefault(dVar.w(), dVar.u(), new ModalMessageGsonParser(new f()))))) != null) {
                    modalMessageParserDefault = objPutIfAbsent;
                }
                modalMessageParser = (ModalMessageParser) modalMessageParserDefault;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return modalMessageParser;
    }

    @NotNull
    public static final ModuleMessagingInApp inAppMessaging(@NotNull k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return getInAppMessaging(d.f274883c);
    }
}
