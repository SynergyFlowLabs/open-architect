package com.superwall.sdk.logger;

import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public enum LogLevel {
    debug(10),
    info(20),
    warn(30),
    error(40),
    none(99);

    private static final /* synthetic */ a $ENTRIES = c.c(values());
    private final int level;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.info.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.warn.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.none.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    LogLevel(int i10) {
        this.level = i10;
    }

    @NotNull
    public static a<LogLevel> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getDescriptionEmoji() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "💬";
        }
        if (i10 == 2) {
            return "ℹ️";
        }
        if (i10 == 3) {
            return "⚠️";
        }
        if (i10 == 4) {
            return "‼️";
        }
        if (i10 == 5) {
            return "";
        }
        throw new k0();
    }

    public final int getLevel() {
        return this.level;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return "DEBUG";
        }
        if (i10 == 2) {
            return "INFO";
        }
        if (i10 == 3) {
            return "WARN";
        }
        if (i10 == 4) {
            return "ERROR";
        }
        if (i10 == 5) {
            return "NONE";
        }
        throw new k0();
    }
}
