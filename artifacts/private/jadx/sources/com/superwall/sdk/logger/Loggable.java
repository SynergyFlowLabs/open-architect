package com.superwall.sdk.logger;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.config.options.SuperwallOptions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface Loggable {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/superwall/sdk/logger/Loggable$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,94:1\n1#2:95\n216#3,2:96\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/superwall/sdk/logger/Loggable$Companion\n*L\n69#1:96,2\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void debug$default(Companion companion, LogLevel logLevel, LogScope logScope, String str, Map map, Throwable th2, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                str = "";
            }
            String str2 = str;
            if ((i10 & 8) != 0) {
                map = MapsKt.emptyMap();
            }
            Map map2 = map;
            if ((i10 & 16) != 0) {
                th2 = null;
            }
            companion.debug(logLevel, logScope, str2, map2, th2);
        }

        public final void debug(@NotNull LogLevel logLevel, @NotNull LogScope scope, @NotNull String message, @Nullable Map<String, ? extends Object> map, @Nullable Throwable th2) {
            String str;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(message, "message");
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            arrayList.add(message);
            if (map != null) {
                arrayList.add(map.toString());
                linkedHashMap.put("info", map);
            }
            if (th2 != null) {
                String localizedMessage = th2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "";
                }
                arrayList.add(localizedMessage);
                linkedHashMap.put("error", th2);
            }
            Superwall.Companion companion = Superwall.Companion;
            if (companion.getInitialized()) {
                str = message;
                companion.getInstance().getDependencyContainer$superwall_release().getDelegateAdapter().handleLog(logLevel.toString(), scope.toString(), str, map, th2);
            } else {
                str = message;
            }
            if (shouldPrint(logLevel, scope)) {
                String str2 = "\n" + logLevel.getDescriptionEmoji() + " [!!Superwall] [" + scope + "] " + logLevel + (": " + str) + "\n";
                if (linkedHashMap.isEmpty()) {
                    System.out.println((Object) str2);
                    return;
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    System.out.println((Object) (((String) entry.getKey()) + ": " + entry.getValue()));
                }
            }
        }

        public final boolean shouldPrint(@NotNull LogLevel logLevel, @NotNull LogScope scope) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter(scope, "scope");
            SuperwallOptions.Logging logging = new SuperwallOptions.Logging();
            Superwall.Companion companion = Superwall.Companion;
            if (companion.getInitialized()) {
                logging = companion.getInstance().getOptions().getLogging();
            }
            if (logging.getLevel() == LogLevel.none) {
                return false;
            }
            return (logLevel.getLevel() >= logging.getLevel().getLevel()) && (logging.getScopes().contains(scope) || logging.getScopes().contains(LogScope.all));
        }
    }
}
