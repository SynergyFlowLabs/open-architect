package io.intercom.android.sdk.ui.common;

import android.content.Context;
import androidx.annotation.f1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nActualStringOrRes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualStringOrRes.kt\nio/intercom/android/sdk/ui/common/StringProvider\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,41:1\n75#2:42\n*S KotlinDebug\n*F\n+ 1 ActualStringOrRes.kt\nio/intercom/android/sdk/ui/common/StringProvider\n*L\n23#1:42\n*E\n"})
public abstract class StringProvider {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class ActualString extends StringProvider {
        public static final int $stable = 0;

        @NotNull
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActualString(@NotNull String string) {
            super(null);
            Intrinsics.checkNotNullParameter(string, "string");
            this.string = string;
        }

        public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = actualString.string;
            }
            return actualString.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.string;
        }

        @NotNull
        public final ActualString copy(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return new ActualString(string);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActualString) && Intrinsics.areEqual(this.string, ((ActualString) obj).string);
        }

        @NotNull
        public final String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        @NotNull
        public String toString() {
            return "ActualString(string=" + this.string + ')';
        }
    }

    public /* synthetic */ StringProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @o
    @NotNull
    public final String getText(@Nullable c0 c0Var, int i10) {
        String string;
        c0Var.E(-1160503525);
        if (this instanceof ActualString) {
            string = ((ActualString) this).getString();
        } else {
            if (!(this instanceof StringRes)) {
                throw new k0();
            }
            StringRes stringRes = (StringRes) this;
            string = ActualStringOrResKt.parseString((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()), stringRes.getStringRes(), stringRes.getParams());
        }
        c0Var.A();
        return string;
    }

    @w0(parameters = 0)
    public static final class StringRes extends StringProvider {
        public static final int $stable = 8;

        @NotNull
        private final List<Pair<String, String>> params;
        private final int stringRes;

        public /* synthetic */ StringRes(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i10, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = stringRes.stringRes;
            }
            if ((i11 & 2) != 0) {
                list = stringRes.params;
            }
            return stringRes.copy(i10, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        @NotNull
        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        @NotNull
        public final StringRes copy(@f1 int i10, @NotNull List<Pair<String, String>> params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new StringRes(i10, params);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringRes)) {
                return false;
            }
            StringRes stringRes = (StringRes) obj;
            return this.stringRes == stringRes.stringRes && Intrinsics.areEqual(this.params, stringRes.params);
        }

        @NotNull
        public final List<Pair<String, String>> getParams() {
            return this.params;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return (Integer.hashCode(this.stringRes) * 31) + this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "StringRes(stringRes=" + this.stringRes + ", params=" + this.params + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringRes(@f1 int i10, @NotNull List<Pair<String, String>> params) {
            super(null);
            Intrinsics.checkNotNullParameter(params, "params");
            this.stringRes = i10;
            this.params = params;
        }
    }

    private StringProvider() {
    }
}
