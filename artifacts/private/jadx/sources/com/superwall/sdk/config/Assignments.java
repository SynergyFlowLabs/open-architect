package com.superwall.sdk.config;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.models.assignment.Assignment;
import com.superwall.sdk.models.assignment.AssignmentPostback;
import com.superwall.sdk.models.assignment.ConfirmableAssignment;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.models.triggers.Trigger;
import com.superwall.sdk.network.NetworkError;
import com.superwall.sdk.network.SuperwallAPI;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nAssignments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assignments.kt\ncom/superwall/sdk/config/Assignments\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,83:1\n136#2,10:84\n136#2,10:94\n*S KotlinDebug\n*F\n+ 1 Assignments.kt\ncom/superwall/sdk/config/Assignments\n*L\n53#1:84,10\n68#1:94,10\n*E\n"})
public final class Assignments {

    @NotNull
    private Map<String, Experiment.Variant> _unconfirmedAssignments;

    @NotNull
    private final s0 ioScope;

    @NotNull
    private final SuperwallAPI network;

    @NotNull
    private final LocalStorage storage;

    /* JADX INFO: renamed from: com.superwall.sdk.config.Assignments$getAssignments$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.Assignments", f = "Assignments.kt", i = {0, 0}, l = {40, 41}, m = "getAssignments", n = {"this", "triggers"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Assignments.this.getAssignments(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.config.Assignments$getAssignments$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.config.Assignments$getAssignments$2", f = "Assignments.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<List<? extends Assignment>, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Set<Trigger> $triggers;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Set<Trigger> set, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$triggers = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConfigLogic.AssignmentOutcome invokeSuspend$lambda$0(List list, Set set, Assignments assignments, Map map) {
            return ConfigLogic.INSTANCE.transferAssignmentsFromServerToDisk(list, set, map, assignments.getUnconfirmedAssignments());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = Assignments.this.new AnonymousClass2(this.$triggers, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends Assignment> list, kotlin.coroutines.d<? super Unit> dVar) {
            return invoke2((List<Assignment>) list, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            final List list = (List) this.L$0;
            final Assignments assignments = Assignments.this;
            final Set<Trigger> set = this.$triggers;
            assignments.updateAssignments(new Function1() { // from class: com.superwall.sdk.config.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Assignments.AnonymousClass2.invokeSuspend$lambda$0(list, set, assignments, (Map) obj2);
                }
            });
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<Assignment> list, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(list, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public Assignments(@NotNull LocalStorage storage, @NotNull SuperwallAPI network, @NotNull s0 ioScope, @NotNull Map<String, Experiment.Variant> unconfirmedAssignments) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(unconfirmedAssignments, "unconfirmedAssignments");
        this.storage = storage;
        this.network = network;
        this.ioScope = ioScope;
        this._unconfirmedAssignments = MapsKt.toMutableMap(unconfirmedAssignments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfigLogic.AssignmentOutcome choosePaywallVariants$lambda$0(Set set, Map confirmedAssignments) {
        Intrinsics.checkNotNullParameter(confirmedAssignments, "confirmedAssignments");
        return ConfigLogic.INSTANCE.chooseAssignments(set, confirmedAssignments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfigLogic.AssignmentOutcome confirmAssignment$lambda$2$lambda$1(ConfirmableAssignment confirmableAssignment, Assignments assignments, Map confirmedAssignments) {
        Intrinsics.checkNotNullParameter(confirmedAssignments, "confirmedAssignments");
        return ConfigLogic.INSTANCE.move(confirmableAssignment, assignments.getUnconfirmedAssignments(), confirmedAssignments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAssignments(Function1<? super Map<String, Experiment.Variant>, ConfigLogic.AssignmentOutcome> function1) {
        try {
            ConfigLogic.AssignmentOutcome assignmentOutcomeInvoke = function1.invoke(this.storage.getConfirmedAssignments());
            this._unconfirmedAssignments = MapsKt.toMutableMap(assignmentOutcomeInvoke.getUnconfirmed());
            this.storage.saveConfirmedAssignments(MapsKt.toMutableMap(assignmentOutcomeInvoke.getConfirmed()));
            new Either.Success(Unit.f312394a);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    public final void choosePaywallVariants(@NotNull final Set<Trigger> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        updateAssignments(new Function1() { // from class: com.superwall.sdk.config.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Assignments.choosePaywallVariants$lambda$0(triggers, (Map) obj);
            }
        });
    }

    public final void confirmAssignment(@NotNull final ConfirmableAssignment assignment) {
        Intrinsics.checkNotNullParameter(assignment, "assignment");
        try {
            k.f(this.ioScope, null, null, new Assignments$confirmAssignment$1$1(this, AssignmentPostback.Companion.create(assignment), null), 3, null);
            updateAssignments(new Function1() { // from class: com.superwall.sdk.config.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Assignments.confirmAssignment$lambda$2$lambda$1(assignment, this, (Map) obj);
                }
            });
            new Either.Success(Unit.f312394a);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion = Superwall.Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object getAssignments(@NotNull Set<Trigger> set, @NotNull kotlin.coroutines.d<? super Either<? extends List<Assignment>, NetworkError>> dVar) {
        AnonymousClass1 anonymousClass1;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object assignments = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(assignments);
            SuperwallAPI superwallAPI = this.network;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = set;
            anonymousClass1.label = 1;
            assignments = superwallAPI.getAssignments(anonymousClass1);
            if (assignments == objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(assignments);
            return assignments;
        }
        set = (Set) anonymousClass1.L$1;
        this = (Assignments) anonymousClass1.L$0;
        ResultKt.m(assignments);
        AnonymousClass2 anonymousClass2 = this.new AnonymousClass2(set, null);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        Object objThen = EitherKt.then((Either) assignments, anonymousClass2, anonymousClass1);
        return objThen == objL ? objL : objThen;
    }

    @NotNull
    public final Map<String, Experiment.Variant> getUnconfirmedAssignments() {
        return this._unconfirmedAssignments;
    }

    public final void reset() {
        this._unconfirmedAssignments.clear();
    }

    public /* synthetic */ Assignments(LocalStorage localStorage, SuperwallAPI superwallAPI, s0 s0Var, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(localStorage, superwallAPI, s0Var, (i10 & 8) != 0 ? MapsKt.emptyMap() : map);
    }
}
