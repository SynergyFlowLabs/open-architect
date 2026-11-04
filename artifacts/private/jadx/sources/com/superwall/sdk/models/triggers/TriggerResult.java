package com.superwall.sdk.models.triggers;

import com.superwall.sdk.models.serialization.ExceptionSerializer;
import com.superwall.sdk.models.triggers.TriggerResult;
import java.lang.annotation.Annotation;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public abstract class TriggerResult {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: bg.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TriggerResult._init_$_anonymous_();
        }
    });

    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) TriggerResult.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<TriggerResult> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public static final class Error extends TriggerResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Exception error;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Error> serializer() {
                return TriggerResult$Error$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(int i10, Exception exc, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, TriggerResult$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.error = exc;
        }

        public static /* synthetic */ Error copy$default(Error error, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = error.error;
            }
            return error.copy(exc);
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Error error, e eVar, SerialDescriptor serialDescriptor) {
            TriggerResult.write$Self(error, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, ExceptionSerializer.INSTANCE, error.error);
        }

        @NotNull
        public final Exception component1() {
            return this.error;
        }

        @NotNull
        public final Error copy(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Error(error);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Error) && Intrinsics.areEqual(this.error, ((Error) obj).error)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Exception getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }

    @b0
    public static final class Holdout extends TriggerResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Experiment experiment;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Holdout> serializer() {
                return TriggerResult$Holdout$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Holdout(int i10, Experiment experiment, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, TriggerResult$Holdout$$serializer.INSTANCE.getDescriptor());
            }
            this.experiment = experiment;
        }

        public static /* synthetic */ Holdout copy$default(Holdout holdout, Experiment experiment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                experiment = holdout.experiment;
            }
            return holdout.copy(experiment);
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Holdout holdout, e eVar, SerialDescriptor serialDescriptor) {
            TriggerResult.write$Self(holdout, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, Experiment$$serializer.INSTANCE, holdout.experiment);
        }

        @NotNull
        public final Experiment component1() {
            return this.experiment;
        }

        @NotNull
        public final Holdout copy(@NotNull Experiment experiment) {
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            return new Holdout(experiment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Holdout) && Intrinsics.areEqual(this.experiment, ((Holdout) obj).experiment);
        }

        @NotNull
        public final Experiment getExperiment() {
            return this.experiment;
        }

        public int hashCode() {
            return this.experiment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Holdout(experiment=" + this.experiment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holdout(@NotNull Experiment experiment) {
            super(null);
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            this.experiment = experiment;
        }
    }

    @b0
    public static final class NoAudienceMatch extends TriggerResult {

        @NotNull
        public static final NoAudienceMatch INSTANCE = new NoAudienceMatch();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: bg.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TriggerResult.NoAudienceMatch._init_$_anonymous_();
            }
        });

        private NoAudienceMatch() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.models.triggers.TriggerResult.NoAudienceMatch", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<NoAudienceMatch> serializer() {
            return get$cachedSerializer();
        }
    }

    @b0
    public static final class Paywall extends TriggerResult {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private final Experiment experiment;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<Paywall> serializer() {
                return TriggerResult$Paywall$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Paywall(int i10, Experiment experiment, v2 v2Var) {
            super(i10, v2Var);
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, TriggerResult$Paywall$$serializer.INSTANCE.getDescriptor());
            }
            this.experiment = experiment;
        }

        public static /* synthetic */ Paywall copy$default(Paywall paywall, Experiment experiment, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                experiment = paywall.experiment;
            }
            return paywall.copy(experiment);
        }

        @n
        public static final /* synthetic */ void write$Self$superwall_release(Paywall paywall, e eVar, SerialDescriptor serialDescriptor) {
            TriggerResult.write$Self(paywall, eVar, serialDescriptor);
            eVar.encodeSerializableElement(serialDescriptor, 0, Experiment$$serializer.INSTANCE, paywall.experiment);
        }

        @NotNull
        public final Experiment component1() {
            return this.experiment;
        }

        @NotNull
        public final Paywall copy(@NotNull Experiment experiment) {
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            return new Paywall(experiment);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paywall) && Intrinsics.areEqual(this.experiment, ((Paywall) obj).experiment);
        }

        @NotNull
        public final Experiment getExperiment() {
            return this.experiment;
        }

        public int hashCode() {
            return this.experiment.hashCode();
        }

        @NotNull
        public String toString() {
            return "Paywall(experiment=" + this.experiment + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Paywall(@NotNull Experiment experiment) {
            super(null);
            Intrinsics.checkNotNullParameter(experiment, "experiment");
            this.experiment = experiment;
        }
    }

    @b0
    public static final class PlacementNotFound extends TriggerResult {

        @NotNull
        public static final PlacementNotFound INSTANCE = new PlacementNotFound();
        private static final /* synthetic */ f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: bg.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TriggerResult.PlacementNotFound._init_$_anonymous_();
            }
        });

        private PlacementNotFound() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new z1("com.superwall.sdk.models.triggers.TriggerResult.PlacementNotFound", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer<PlacementNotFound> serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ TriggerResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new v("com.superwall.sdk.models.triggers.TriggerResult", j1.d(TriggerResult.class), new d[]{j1.d(Error.class), j1.d(Holdout.class), j1.d(NoAudienceMatch.class), j1.d(Paywall.class), j1.d(PlacementNotFound.class)}, new KSerializer[]{TriggerResult$Error$$serializer.INSTANCE, TriggerResult$Holdout$$serializer.INSTANCE, new z1("com.superwall.sdk.models.triggers.TriggerResult.NoAudienceMatch", NoAudienceMatch.INSTANCE, new Annotation[0]), TriggerResult$Paywall$$serializer.INSTANCE, new z1("com.superwall.sdk.models.triggers.TriggerResult.PlacementNotFound", PlacementNotFound.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }

    @n
    public static final /* synthetic */ void write$Self(TriggerResult triggerResult, e eVar, SerialDescriptor serialDescriptor) {
    }

    private TriggerResult() {
    }

    public /* synthetic */ TriggerResult(int i10, v2 v2Var) {
    }
}
