package io.intercom.android.sdk.survey;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 1)
public abstract class ValidationError {
    public static final int $stable = 0;

    @w0(parameters = 1)
    public static final class NoValidationError extends ValidationError {
        public static final int $stable = 0;

        @NotNull
        public static final NoValidationError INSTANCE = new NoValidationError();

        private NoValidationError() {
            super(null);
        }
    }

    @w0(parameters = 1)
    public static final class Unchecked extends ValidationError {
        public static final int $stable = 0;

        @NotNull
        public static final Unchecked INSTANCE = new Unchecked();

        private Unchecked() {
            super(null);
        }
    }

    public /* synthetic */ ValidationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @w0(parameters = 0)
    public static final class ValidationStringError extends ValidationError {
        public static final int $stable = 8;

        @NotNull
        private final List<Pair<String, String>> params;
        private final int stringRes;

        public /* synthetic */ ValidationStringError(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationStringError copy$default(ValidationStringError validationStringError, int i10, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = validationStringError.stringRes;
            }
            if ((i11 & 2) != 0) {
                list = validationStringError.params;
            }
            return validationStringError.copy(i10, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        @NotNull
        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        @NotNull
        public final ValidationStringError copy(@f1 int i10, @NotNull List<Pair<String, String>> params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new ValidationStringError(i10, params);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationStringError)) {
                return false;
            }
            ValidationStringError validationStringError = (ValidationStringError) obj;
            return this.stringRes == validationStringError.stringRes && Intrinsics.areEqual(this.params, validationStringError.params);
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
            return "ValidationStringError(stringRes=" + this.stringRes + ", params=" + this.params + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationStringError(@f1 int i10, @NotNull List<Pair<String, String>> params) {
            super(null);
            Intrinsics.checkNotNullParameter(params, "params");
            this.stringRes = i10;
            this.params = params;
        }
    }

    private ValidationError() {
    }
}
