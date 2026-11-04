package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.b0;
import androidx.compose.animation.core.p;
import androidx.compose.animation.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public abstract class ExitTransitionStyle {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ ExitTransitionStyle[] $VALUES;
    public static final ExitTransitionStyle SLIDE_DOWN = new SLIDE_DOWN("SLIDE_DOWN", 0);
    public static final ExitTransitionStyle SLIDE_OUT_RIGHT = new SLIDE_OUT_RIGHT("SLIDE_OUT_RIGHT", 1);
    public static final ExitTransitionStyle SLIDE_OUT_LEFT = new SLIDE_OUT_LEFT("SLIDE_OUT_LEFT", 2);
    public static final ExitTransitionStyle NONE = new ExitTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public f0 transition() {
            return f0.f13493a.b();
        }
    };
    public static final ExitTransitionStyle NULL = new ExitTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NULL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        @Nullable
        public f0 transition() {
            return null;
        }
    };

    static final class SLIDE_DOWN extends ExitTransitionStyle {
        SLIDE_DOWN(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public f0 transition() {
            return b0.N(p.t(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ExitTransitionStyle.SLIDE_DOWN.transition$lambda$0(((Integer) obj).intValue()));
                }
            });
        }
    }

    static final class SLIDE_OUT_LEFT extends ExitTransitionStyle {
        SLIDE_OUT_LEFT(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return -i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public f0 transition() {
            return b0.L(p.t(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ExitTransitionStyle.SLIDE_OUT_LEFT.transition$lambda$0(((Integer) obj).intValue()));
                }
            });
        }
    }

    static final class SLIDE_OUT_RIGHT extends ExitTransitionStyle {
        SLIDE_OUT_RIGHT(String str, int i10) {
            super(str, i10, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i10) {
            return i10;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        @NotNull
        public f0 transition() {
            return b0.L(p.t(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ExitTransitionStyle.SLIDE_OUT_RIGHT.transition$lambda$0(((Integer) obj).intValue()));
                }
            });
        }
    }

    private static final /* synthetic */ ExitTransitionStyle[] $values() {
        return new ExitTransitionStyle[]{SLIDE_DOWN, SLIDE_OUT_RIGHT, SLIDE_OUT_LEFT, NONE, NULL};
    }

    static {
        ExitTransitionStyle[] exitTransitionStyleArr$values = $values();
        $VALUES = exitTransitionStyleArr$values;
        $ENTRIES = kotlin.enums.c.c(exitTransitionStyleArr$values);
    }

    public /* synthetic */ ExitTransitionStyle(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10);
    }

    @NotNull
    public static kotlin.enums.a<ExitTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public static ExitTransitionStyle valueOf(String str) {
        return (ExitTransitionStyle) Enum.valueOf(ExitTransitionStyle.class, str);
    }

    public static ExitTransitionStyle[] values() {
        return (ExitTransitionStyle[]) $VALUES.clone();
    }

    @Nullable
    public abstract f0 transition();

    private ExitTransitionStyle(String str, int i10) {
        super(str, i10);
    }
}
