package io.customer.messaginginapp.state;

import com.rabbitmq.client.r;
import io.customer.messaginginapp.gist.presentation.GistListener;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class InAppMessagingManager {

    @Nullable
    private final GistListener listener;

    @NotNull
    private final s0 scope;

    @NotNull
    private final org.reduxkotlin.j<InAppMessagingState, Object> store;

    @NotNull
    private final k0<InAppMessagingState> storeStateFlow;

    /* JADX INFO: renamed from: io.customer.messaginginapp.state.InAppMessagingManager$subscribeToAttribute$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.customer.messaginginapp.state.InAppMessagingManager$subscribeToAttribute$2", f = "InAppMessagingManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160696i0}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nInAppMessagingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessagingManager.kt\nio/customer/messaginginapp/state/InAppMessagingManager$subscribeToAttribute$2\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,110:1\n49#2:111\n51#2:115\n46#3:112\n51#3:114\n105#4:113\n*S KotlinDebug\n*F\n+ 1 InAppMessagingManager.kt\nio/customer/messaginginapp/state/InAppMessagingManager$subscribeToAttribute$2\n*L\n86#1:111\n86#1:115\n86#1:112\n86#1:114\n86#1:113\n*E\n"})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function2<T, T, Boolean> $areEquivalent;
        final /* synthetic */ Function1<T, Unit> $listener;
        final /* synthetic */ Function1<InAppMessagingState, T> $selector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super InAppMessagingState, ? extends T> function1, Function2<? super T, ? super T, Boolean> function2, Function1<? super T, Unit> function3, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$selector = function1;
            this.$areEquivalent = function2;
            this.$listener = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return InAppMessagingManager.this.new AnonymousClass2(this.$selector, this.$areEquivalent, this.$listener, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final k0 k0Var = InAppMessagingManager.this.storeStateFlow;
                final Function1<InAppMessagingState, T> function1 = this.$selector;
                kotlinx.coroutines.flow.i iVarJ0 = kotlinx.coroutines.flow.k.j0(new kotlinx.coroutines.flow.i<T>() { // from class: io.customer.messaginginapp.state.InAppMessagingManager$subscribeToAttribute$2$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: io.customer.messaginginapp.state.InAppMessagingManager$subscribeToAttribute$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 InAppMessagingManager.kt\nio/customer/messaginginapp/state/InAppMessagingManager$subscribeToAttribute$2\n*L\n1#1,49:1\n50#2:50\n86#3:51\n*E\n"})
                    public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                        final /* synthetic */ Function1 $callee$inlined;
                        final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.customer.messaginginapp.state.InAppMessagingManager$subscribeToAttribute$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @kotlin.coroutines.jvm.internal.f(c = "io.customer.messaginginapp.state.InAppMessagingManager$subscribeToAttribute$2$invokeSuspend$$inlined$map$1$2", f = "InAppMessagingManager.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(kotlin.coroutines.d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(kotlinx.coroutines.flow.j jVar, Function1 function1) {
                            this.$this_unsafeFlow = jVar;
                            this.$callee$inlined = function1;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.j
                        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
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
                            Object obj2 = anonymousClass1.result;
                            Object objL = kotlin.coroutines.intrinsics.b.l();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                ResultKt.m(obj2);
                                kotlinx.coroutines.flow.j jVar = this.$this_unsafeFlow;
                                Object objInvoke = this.$callee$inlined.invoke((InAppMessagingState) obj);
                                anonymousClass1.label = 1;
                                if (jVar.emit(objInvoke, anonymousClass1) == objL) {
                                    return objL;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj2);
                            }
                            return Unit.f312394a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.i
                    public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
                        Object objCollect = k0Var.collect(new AnonymousClass2(jVar, function1), dVar);
                        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                    }
                }, this.$areEquivalent);
                final Function1<T, Unit> function2 = this.$listener;
                kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.customer.messaginginapp.state.InAppMessagingManager.subscribeToAttribute.2.2
                    @Override // kotlinx.coroutines.flow.j
                    public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                        function2.invoke(t10);
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVarJ0.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: io.customer.messaginginapp.state.InAppMessagingManager$subscribeToState$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "io.customer.messaginginapp.state.InAppMessagingManager$subscribeToState$2", f = "InAppMessagingManager.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {}, s = {})
    static final class C27682 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function2<InAppMessagingState, InAppMessagingState, Boolean> $areEquivalent;
        final /* synthetic */ Function1<InAppMessagingState, Unit> $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C27682(Function2<? super InAppMessagingState, ? super InAppMessagingState, Boolean> function2, Function1<? super InAppMessagingState, Unit> function1, kotlin.coroutines.d<? super C27682> dVar) {
            super(2, dVar);
            this.$areEquivalent = function2;
            this.$listener = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return InAppMessagingManager.this.new C27682(this.$areEquivalent, this.$listener, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.i iVarJ0 = kotlinx.coroutines.flow.k.j0(InAppMessagingManager.this.storeStateFlow, this.$areEquivalent);
                final Function1<InAppMessagingState, Unit> function1 = this.$listener;
                kotlinx.coroutines.flow.j jVar = new kotlinx.coroutines.flow.j() { // from class: io.customer.messaginginapp.state.InAppMessagingManager.subscribeToState.2.1
                    public final Object emit(InAppMessagingState inAppMessagingState, kotlin.coroutines.d<? super Unit> dVar) {
                        function1.invoke(inAppMessagingState);
                        return Unit.f312394a;
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((InAppMessagingState) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }
                };
                this.label = 1;
                if (iVarJ0.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27682) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InAppMessagingManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(InAppMessagingManager inAppMessagingManager) {
        inAppMessagingManager.storeStateFlow.setValue(inAppMessagingManager.store.getState());
        return Unit.f312394a;
    }

    public static /* synthetic */ InAppMessagingManager copy$default(InAppMessagingManager inAppMessagingManager, GistListener gistListener, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gistListener = inAppMessagingManager.listener;
        }
        return inAppMessagingManager.copy(gistListener);
    }

    private final org.reduxkotlin.j<InAppMessagingState, Object> createStore() {
        return org.reduxkotlin.threadsafe.a.b(InAppMessageReducerKt.getInAppMessagingReducer(), new InAppMessagingState(null, null, null, 0L, null, null, null, null, null, null, null, r.f265987x3, null), org.reduxkotlin.b.a(InAppMessagingMiddlewaresKt.loggerMiddleware(), InAppMessagingMiddlewaresKt.userChangeMiddleware(), InAppMessagingMiddlewaresKt.routeChangeMiddleware(), InAppMessagingMiddlewaresKt.displayModalMessageMiddleware(), InAppMessagingMiddlewaresKt.gistLoggingMessageMiddleware(), InAppMessagingMiddlewaresKt.processMessages(), InAppMessagingMiddlewaresKt.errorLoggerMiddleware(), InAppMessagingMiddlewaresKt.gistListenerMiddleware(this.listener)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$1(Function1 function1, InAppMessagingManager inAppMessagingManager) {
        function1.invoke(inAppMessagingManager.store.getState());
        return Unit.f312394a;
    }

    public static /* synthetic */ p2 subscribeToAttribute$default(InAppMessagingManager inAppMessagingManager, Function1 function1, Function2 function2, Function1 function3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function2 = new Function2() { // from class: io.customer.messaginginapp.state.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Boolean.valueOf(Intrinsics.areEqual(obj2, obj3));
                }
            };
        }
        return inAppMessagingManager.subscribeToAttribute(function1, function2, function3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p2 subscribeToState$default(InAppMessagingManager inAppMessagingManager, Function2 function2, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function2 = new Function2() { // from class: io.customer.messaginginapp.state.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return Boolean.valueOf(InAppMessagingManager.subscribeToState$lambda$3((InAppMessagingState) obj2, (InAppMessagingState) obj3));
                }
            };
        }
        return inAppMessagingManager.subscribeToState(function2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean subscribeToState$lambda$3(InAppMessagingState old, InAppMessagingState inAppMessagingState) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(inAppMessagingState, "new");
        return Intrinsics.areEqual(old, inAppMessagingState);
    }

    @Nullable
    public final GistListener component1() {
        return this.listener;
    }

    @NotNull
    public final InAppMessagingManager copy(@Nullable GistListener gistListener) {
        return new InAppMessagingManager(gistListener);
    }

    @NotNull
    public final Object dispatch(@NotNull InAppMessagingAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this.store.c().invoke(action);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InAppMessagingManager) && Intrinsics.areEqual(this.listener, ((InAppMessagingManager) obj).listener)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final InAppMessagingState getCurrentState() {
        return this.store.getState();
    }

    @Nullable
    public final GistListener getListener() {
        return this.listener;
    }

    public int hashCode() {
        GistListener gistListener = this.listener;
        if (gistListener == null) {
            return 0;
        }
        return gistListener.hashCode();
    }

    @NotNull
    public final Function0<Unit> subscribe(@NotNull final Function1<? super InAppMessagingState, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        return this.store.b().invoke(new Function0() { // from class: io.customer.messaginginapp.state.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppMessagingManager.subscribe$lambda$1(listener, this);
            }
        });
    }

    @NotNull
    public final <T> p2 subscribeToAttribute(@NotNull Function1<? super InAppMessagingState, ? extends T> selector, @NotNull Function2<? super T, ? super T, Boolean> areEquivalent, @NotNull Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(areEquivalent, "areEquivalent");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return kotlinx.coroutines.k.f(this.scope, null, null, new AnonymousClass2(selector, areEquivalent, listener, null), 3, null);
    }

    @NotNull
    public final p2 subscribeToState(@NotNull Function2<? super InAppMessagingState, ? super InAppMessagingState, Boolean> areEquivalent, @NotNull Function1<? super InAppMessagingState, Unit> listener) {
        Intrinsics.checkNotNullParameter(areEquivalent, "areEquivalent");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return kotlinx.coroutines.k.f(this.scope, null, null, new C27682(areEquivalent, listener, null), 3, null);
    }

    @NotNull
    public String toString() {
        return "InAppMessagingManager(listener=" + this.listener + ")";
    }

    public InAppMessagingManager(@Nullable GistListener gistListener) {
        this.listener = gistListener;
        org.reduxkotlin.j<InAppMessagingState, Object> jVarCreateStore = createStore();
        this.store = jVarCreateStore;
        this.storeStateFlow = b1.a(jVarCreateStore.getState());
        this.scope = eh.d.f274883c.y().c();
        jVarCreateStore.b().invoke(new Function0() { // from class: io.customer.messaginginapp.state.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InAppMessagingManager._init_$lambda$0(this.f288360a);
            }
        });
    }

    public /* synthetic */ InAppMessagingManager(GistListener gistListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : gistListener);
    }
}
