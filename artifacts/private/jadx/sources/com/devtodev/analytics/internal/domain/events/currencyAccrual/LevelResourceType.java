package com.devtodev.analytics.internal.domain.events.currencyAccrual;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum LevelResourceType {
    Earned(0),
    Bought(1),
    Spent(2);


    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long value;

    @SourceDebugExtension({"SMAP\nLevelResourceType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LevelResourceType.kt\ncom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResourceType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,11:1\n1109#2,2:12\n*S KotlinDebug\n*F\n+ 1 LevelResourceType.kt\ncom/devtodev/analytics/internal/domain/events/currencyAccrual/LevelResourceType$Companion\n*L\n9#1:12,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LevelResourceType fromLong(long j10) {
            for (LevelResourceType levelResourceType : LevelResourceType.values()) {
                if (levelResourceType.getValue() == j10) {
                    return levelResourceType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    LevelResourceType(long j10) {
        this.value = j10;
    }

    public final long getValue() {
        return this.value;
    }
}
