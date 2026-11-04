package com.superwall.sdk.misc;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ScopesKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.superwall.sdk.misc.ScopesKt$asyncWithTracking$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.misc.ScopesKt$asyncWithTracking$2", f = "Scopes.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nScopes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scopes.kt\ncom/superwall/sdk/misc/ScopesKt$asyncWithTracking$2\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,50:1\n136#2,10:51\n*S KotlinDebug\n*F\n+ 1 Scopes.kt\ncom/superwall/sdk/misc/ScopesKt$asyncWithTracking$2\n*L\n46#1:51,10\n*E\n"})
    static final class AnonymousClass2<T> extends o implements Function2<s0, kotlin.coroutines.d<? super Either<? extends T, Throwable>>, Object> {
        final /* synthetic */ Function2<s0, kotlin.coroutines.d<? super T>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0 s0Var = (s0) this.L$0;
                    Function2<s0, kotlin.coroutines.d<? super T>, Object> function2 = this.$block;
                    this.label = 1;
                    obj = function2.invoke(s0Var, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return new Either.Success(obj);
            } catch (Throwable th2) {
                if (ErrorTrackingKt.shouldLog(th2)) {
                    Superwall.Companion companion = Superwall.Companion;
                    if (companion.getInitialized()) {
                        ErrorTrackingKt.trackError(companion.getInstance(), th2);
                    }
                }
                return new Either.Failure(th2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either<? extends T, Throwable>> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.misc.ScopesKt$launchWithTracking$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.misc.ScopesKt$launchWithTracking$1", f = "Scopes.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nScopes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scopes.kt\ncom/superwall/sdk/misc/ScopesKt$launchWithTracking$1\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n*L\n1#1,50:1\n136#2,10:51\n*S KotlinDebug\n*F\n+ 1 Scopes.kt\ncom/superwall/sdk/misc/ScopesKt$launchWithTracking$1\n*L\n39#1:51,10\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function2<s0, kotlin.coroutines.d<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.m(obj);
                    s0 s0Var = (s0) this.L$0;
                    Function2<s0, kotlin.coroutines.d<? super Unit>, Object> function2 = this.$block;
                    this.label = 1;
                    if (function2.invoke(s0Var, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
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
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <T> Object asyncWithTracking(@NotNull SuperwallScope superwallScope, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super a1<? extends Either<? extends T, ? super Throwable>>> dVar) {
        Intrinsics.checkNotNull(superwallScope, "null cannot be cast to non-null type com.superwall.sdk.misc.SuperwallScope");
        return k.b(superwallScope, superwallScope.getExceptionHandler(), null, new AnonymousClass2(function2, null), 2, null);
    }

    @NotNull
    public static final p2 launchWithTracking(@NotNull SuperwallScope superwallScope, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(superwallScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return k.f(superwallScope, null, null, new AnonymousClass1(block, null), 3, null);
    }
}
