package com.superwall.sdk.misc;

import java.lang.Throwable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Either<T, E extends Throwable> {

    public static final class Failure<E extends Throwable> extends Either {

        @NotNull
        private final E error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull E error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = failure.error;
            }
            return failure.copy(th2);
        }

        @NotNull
        public final E component1() {
            return this.error;
        }

        @NotNull
        public final Failure<E> copy(@NotNull E error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failure<>(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) obj).error);
        }

        @NotNull
        public final E getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ")";
        }
    }

    public static final class Success<T, E extends Throwable> extends Either<T, E> {
        private final T value;

        public Success(T t10) {
            super(null);
            this.value = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        @NotNull
        public final Success<T, E> copy(T t10) {
            return new Success<>(t10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.areEqual(this.value, ((Success) obj).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t10 = this.value;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ")";
        }
    }

    public /* synthetic */ Either(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final T getSuccess() {
        if (this instanceof Success) {
            return (T) ((Success) this).getValue();
        }
        return null;
    }

    @Nullable
    public final E getThrowable() {
        if (this instanceof Failure) {
            return (E) ((Failure) this).getError();
        }
        return null;
    }

    private Either() {
    }
}
