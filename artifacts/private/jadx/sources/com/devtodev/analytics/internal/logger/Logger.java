package com.devtodev.analytics.internal.logger;

import com.devtodev.analytics.external.DTDLogLevel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/devtodev/analytics/internal/logger/Logger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class Logger {

    @Nullable
    private static Function2<? super Integer, ? super String, Unit> IMessageHandler;

    @NotNull
    public static final Logger INSTANCE;

    @NotNull
    private static DTDLogLevel logLevel;

    @NotNull
    private static final SimpleDateFormat sdfDate;

    @NotNull
    private static String sdkVersion;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DTDLogLevel.values().length];
            try {
                iArr[DTDLogLevel.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DTDLogLevel.No.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DTDLogLevel.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DTDLogLevel.Warning.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DTDLogLevel.Info.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DTDLogLevel.Debug.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Logger logger = new Logger();
        INSTANCE = logger;
        sdkVersion = "";
        logLevel = DTDLogLevel.Error;
        sdfDate = logger.defineDateFormat();
    }

    private Logger() {
    }

    public static /* synthetic */ void debug$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logger.debug(str, th2);
    }

    private final SimpleDateFormat defineDateFormat() {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.ENGLISH);
    }

    public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
            int i11 = 3 ^ 0;
        }
        logger.error(str, th2);
    }

    public static /* synthetic */ void info$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logger.info(str, th2);
    }

    private final void printLog(DTDLogLevel dTDLogLevel, String str, Throwable th2) {
        if (dTDLogLevel.compareTo(logLevel) <= 0) {
            Function2<? super Integer, ? super String, Unit> function2 = IMessageHandler;
            if (function2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(INSTANCE.tag());
                String strName = dTDLogLevel.name();
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String upperCase = strName.toUpperCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                sb2.append(upperCase + " " + str);
                if (th2 != null) {
                    sb2.append(" " + th2);
                }
                Integer numValueOf = Integer.valueOf(dTDLogLevel.ordinal());
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "logMessage.toString()");
                function2.invoke(numValueOf, string);
                return;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[dTDLogLevel.ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                    INSTANCE.tag();
                    break;
                case 4:
                    INSTANCE.tag();
                    return;
                case 5:
                    INSTANCE.tag();
                    return;
                case 6:
                    INSTANCE.tag();
                    return;
                default:
                    throw new k0();
            }
        }
    }

    private final String tag() {
        return sdfDate.format(new Date()) + " [DevToDev" + sdkVersion + "] ";
    }

    public static /* synthetic */ void warning$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        logger.warning(str, th2);
    }

    public final void debug(@NotNull String text, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(text, "text");
        printLog(DTDLogLevel.Debug, text, th2);
    }

    public final void error(@NotNull String text, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(text, "text");
        printLog(DTDLogLevel.Error, text, th2);
    }

    @Nullable
    public final Function2<Integer, String, Unit> getIMessageHandler() {
        return IMessageHandler;
    }

    @NotNull
    public final DTDLogLevel getLogLevel() {
        return logLevel;
    }

    public final void info(@NotNull String text, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(text, "text");
        printLog(DTDLogLevel.Info, text, th2);
    }

    public final void setIMessageHandler(@Nullable Function2<? super Integer, ? super String, Unit> function2) {
        IMessageHandler = function2;
    }

    public final void setLogLevel(@NotNull DTDLogLevel level) {
        Intrinsics.checkNotNullParameter(level, "level");
        if (level != DTDLogLevel.Unknown) {
            logLevel = level;
        }
    }

    public final void setSdkVersion(@NotNull String sdkVersion2) {
        Intrinsics.checkNotNullParameter(sdkVersion2, "sdkVersion");
        sdkVersion = " " + sdkVersion2;
    }

    public final void warning(@NotNull String text, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(text, "text");
        printLog(DTDLogLevel.Warning, text, th2);
    }
}
