package com.devtodev.analytics.internal.modues.people;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public enum PeopleReservedKeys {
    Cheater("cheater"),
    Tester("tester");


    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String value;

    @SourceDebugExtension({"SMAP\nPeopleReservedKeys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeopleReservedKeys.kt\ncom/devtodev/analytics/internal/modues/people/PeopleReservedKeys$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,11:1\n1282#2,2:12\n*S KotlinDebug\n*F\n+ 1 PeopleReservedKeys.kt\ncom/devtodev/analytics/internal/modues/people/PeopleReservedKeys$Companion\n*L\n9#1:12,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final PeopleReservedKeys contains(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            for (PeopleReservedKeys peopleReservedKeys : PeopleReservedKeys.values()) {
                if (StringsKt.N1(peopleReservedKeys.getValue(), key, true)) {
                    return peopleReservedKeys;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    PeopleReservedKeys(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
