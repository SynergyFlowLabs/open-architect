package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.p;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = CELResultDeserializer.class)
public abstract class CELResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<CELResult> serializer() {
            return CELResultDeserializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public static final class Err extends CELResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final String message;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Err> serializer() {
                return CELResult$Err$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Err(int i10, String str, v2 v2Var) {
            super(null);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELResult$Err$$serializer.INSTANCE.getDescriptor());
            }
            this.message = str;
        }

        public static /* synthetic */ Err copy$default(Err err, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = err.message;
            }
            return err.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final Err copy(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Err(message);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Err) && Intrinsics.areEqual(this.message, ((Err) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "Err(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Err(@NotNull String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }
    }

    @b0
    public static final class Ok extends CELResult {

        @NotNull
        private final PassableValue value;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @f
        @NotNull
        private static final KSerializer<Object>[] $childSerializers = {new p(j1.d(PassableValue.class), new Annotation[0])};

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Ok> serializer() {
                return CELResult$Ok$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Ok(int i10, PassableValue passableValue, v2 v2Var) {
            super(null);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, CELResult$Ok$$serializer.INSTANCE.getDescriptor());
            }
            this.value = passableValue;
        }

        public static /* synthetic */ Ok copy$default(Ok ok2, PassableValue passableValue, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                passableValue = ok2.value;
            }
            return ok2.copy(passableValue);
        }

        @NotNull
        public final PassableValue component1() {
            return this.value;
        }

        @NotNull
        public final Ok copy(@NotNull PassableValue value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Ok(value);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ok) && Intrinsics.areEqual(this.value, ((Ok) obj).value);
        }

        @NotNull
        public final PassableValue getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ok(value=" + this.value + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ok(@NotNull PassableValue value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }
    }

    public /* synthetic */ CELResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CELResult() {
    }
}
