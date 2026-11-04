package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.b0;
import androidx.compose.animation.core.p;
import androidx.compose.animation.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public abstract class EnterTransitionStyle {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ EnterTransitionStyle[] $VALUES;
    public static final EnterTransitionStyle SLIDE_UP = new SLIDE_UP("SLIDE_UP", 0);
    public static final EnterTransitionStyle SLIDE_IN_LEFT = new SLIDE_IN_LEFT("SLIDE_IN_LEFT", 1);
    public static final EnterTransitionStyle SLIDE_IN_RIGHT = new SLIDE_IN_RIGHT("SLIDE_IN_RIGHT", 2);
    public static final EnterTransitionStyle NONE = new EnterTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public d0 transition() {
            return d0.f13416a.a();
        }
    };
    public static final EnterTransitionStyle NULL = new EnterTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle.NULL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        @Nullable
        public d0 transition() {
            return null;
        }
    };

    static final class SLIDE_IN_LEFT extends EnterTransitionStyle {
        SLIDE_IN_LEFT(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public d0 transition() {
            return b0.F(p.t(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(EnterTransitionStyle.SLIDE_IN_LEFT.transition$lambda$0(((Integer) obj).intValue()));
                }
            });
        }
    }

    static final class SLIDE_IN_RIGHT extends EnterTransitionStyle {
        SLIDE_IN_RIGHT(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return -i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public d0 transition() {
            return b0.F(p.t(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(EnterTransitionStyle.SLIDE_IN_RIGHT.transition$lambda$0(((Integer) obj).intValue()));
                }
            });
        }
    }

    static final class SLIDE_UP extends EnterTransitionStyle {
        SLIDE_UP(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle
        @NotNull
        public d0 transition() {
            return b0.H(p.t(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(EnterTransitionStyle.SLIDE_UP.transition$lambda$0(((Integer) obj).intValue()));
                }
            });
        }
    }

    private static final /* synthetic */ EnterTransitionStyle[] $values() {
        return new EnterTransitionStyle[]{SLIDE_UP, SLIDE_IN_LEFT, SLIDE_IN_RIGHT, NONE, NULL};
    }

    static {
        EnterTransitionStyle[] enterTransitionStyleArr$values = $values();
        $VALUES = enterTransitionStyleArr$values;
        $ENTRIES = kotlin.enums.c.c(enterTransitionStyleArr$values);
    }

    public /* synthetic */ EnterTransitionStyle(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    @NotNull
    public static kotlin.enums.a<EnterTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static EnterTransitionStyle valueOf(String str) {
        return (EnterTransitionStyle) Enum.valueOf(EnterTransitionStyle.class, str);
    }

    public static EnterTransitionStyle[] values() {
        return (EnterTransitionStyle[]) $VALUES.clone();
    }

    @Nullable
    public abstract d0 transition();

    private EnterTransitionStyle(String str, int i10) {
        super(str, i10);
    }
}
