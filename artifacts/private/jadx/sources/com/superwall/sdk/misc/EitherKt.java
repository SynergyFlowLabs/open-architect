package com.superwall.sdk.misc;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.b4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEither.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Either.kt\ncom/superwall/sdk/misc/EitherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public final class EitherKt {

    /* JADX INFO: renamed from: com.superwall.sdk.misc.EitherKt$asEither$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.misc.EitherKt", f = "Either.kt", i = {}, l = {androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "asEither", n = {}, s = {})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.d {
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
            return EitherKt.asEither(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.misc.EitherKt$mapAsync$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.misc.EitherKt", f = "Either.kt", i = {}, l = {50}, m = "mapAsync", n = {}, s = {})
    static final class C26601<In, Out, E extends Throwable> extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C26601(kotlin.coroutines.d<? super C26601> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EitherKt.mapAsync(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.misc.EitherKt$onErrorAsync$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.misc.EitherKt", f = "Either.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160725s}, m = "onErrorAsync", n = {"$this$onErrorAsync"}, s = {"L$0"})
    static final class C26611<T, E extends Throwable> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26611(kotlin.coroutines.d<? super C26611> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EitherKt.onErrorAsync(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.misc.EitherKt$then$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.misc.EitherKt", f = "Either.kt", i = {0}, l = {31}, m = "then", n = {"$this$then"}, s = {"L$0"})
    static final class C26621<In, E extends Throwable> extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26621(kotlin.coroutines.d<? super C26621> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EitherKt.then(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <T> Object asEither(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Either<? extends T, Throwable>> dVar) {
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
        Object objInvoke = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objInvoke);
                anonymousClass1.label = 1;
                objInvoke = function1.invoke(anonymousClass1);
                if (objInvoke == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objInvoke);
            }
            return new Either.Success(objInvoke);
        } catch (Throwable th2) {
            return new Either.Failure(th2);
        }
    }

    private static final <T> Object asEither$$forInline(Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super Either<? extends T, Throwable>> dVar) {
        try {
            return new Either.Success(function1.invoke(dVar));
        } catch (Throwable th2) {
            return new Either.Failure(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    /* JADX INFO: renamed from: eitherWithTimeout-rnQQ1Ag, reason: not valid java name */
    public static final <T, E extends Throwable> Object m26eitherWithTimeoutrnQQ1Ag(long j10, @NotNull Function0<? extends E> function0, @NotNull Function1<? super kotlin.coroutines.d<? super Either<? extends T, E>>, ? extends Object> function1, @NotNull kotlin.coroutines.d<? super Either<? extends T, E>> dVar) {
        EitherKt$eitherWithTimeout$1 eitherKt$eitherWithTimeout$1;
        if (dVar instanceof EitherKt$eitherWithTimeout$1) {
            eitherKt$eitherWithTimeout$1 = (EitherKt$eitherWithTimeout$1) dVar;
            int i10 = eitherKt$eitherWithTimeout$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eitherKt$eitherWithTimeout$1.label = i10 - Integer.MIN_VALUE;
            } else {
                eitherKt$eitherWithTimeout$1 = new EitherKt$eitherWithTimeout$1(dVar);
            }
        } else {
            eitherKt$eitherWithTimeout$1 = new EitherKt$eitherWithTimeout$1(dVar);
        }
        Object objD = eitherKt$eitherWithTimeout$1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eitherKt$eitherWithTimeout$1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objD);
                EitherKt$eitherWithTimeout$2 eitherKt$eitherWithTimeout$2 = new EitherKt$eitherWithTimeout$2(function1, null);
                eitherKt$eitherWithTimeout$1.L$0 = function0;
                eitherKt$eitherWithTimeout$1.label = 1;
                objD = b4.d(j10, eitherKt$eitherWithTimeout$2, eitherKt$eitherWithTimeout$1);
                if (objD == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) eitherKt$eitherWithTimeout$1.L$0;
                ResultKt.m(objD);
            }
            return (Either) objD;
        } catch (Throwable unused) {
            return new Either.Failure(function0.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, Out, E extends Throwable> Either<Out, E> flatMap(@NotNull Either<? extends T, E> either, @NotNull Function1<? super T, ? extends Either<? extends Out, E>> transform) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (either instanceof Either.Success) {
            return transform.invoke((Object) ((Either.Success) either).getValue());
        }
        if (either instanceof Either.Failure) {
            return either;
        }
        throw new k0();
    }

    @Nullable
    public static final <T, E extends Throwable> Object fold(@NotNull Either<? extends T, E> either, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (either instanceof Either.Success) {
            Object objInvoke = function2.invoke((Object) ((Either.Success) either).getValue(), dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
        if (!(either instanceof Either.Failure)) {
            throw new k0();
        }
        Object objInvoke2 = function3.invoke(((Either.Failure) either).getError(), dVar);
        return objInvoke2 == kotlin.coroutines.intrinsics.b.l() ? objInvoke2 : Unit.f312394a;
    }

    private static final <T, E extends Throwable> Object fold$$forInline(Either<? extends T, E> either, Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, Function2<? super E, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3, kotlin.coroutines.d<? super Unit> dVar) {
        if (either instanceof Either.Success) {
            function2.invoke((Object) ((Either.Success) either).getValue(), dVar);
            return Unit.f312394a;
        }
        if (!(either instanceof Either.Failure)) {
            throw new k0();
        }
        function3.invoke(((Either.Failure) either).getError(), dVar);
        return Unit.f312394a;
    }

    @Nullable
    public static final <T, E extends Throwable> Object into(@NotNull Either<? extends T, E> either, @NotNull Function2<? super Either<? extends T, E>, ? super kotlin.coroutines.d<? super Either<? extends T, E>>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Either<? extends T, E>> dVar) {
        return function2.invoke(either, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <In, Out, E extends Throwable> Either<Out, E> map(@NotNull Either<? extends In, E> either, @NotNull Function1<? super In, ? extends Out> transform) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (either instanceof Either.Success) {
            return new Either.Success(transform.invoke((Object) ((Either.Success) either).getValue()));
        }
        if (either instanceof Either.Failure) {
            return either;
        }
        throw new k0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <In, Out, E extends Throwable> Object mapAsync(@NotNull Either<? extends In, E> either, @NotNull Function2<? super In, ? super kotlin.coroutines.d<? super Out>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Either<? extends Out, E>> dVar) {
        C26601 c26601;
        if (dVar instanceof C26601) {
            c26601 = (C26601) dVar;
            int i10 = c26601.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26601.label = i10 - Integer.MIN_VALUE;
            } else {
                c26601 = new C26601(dVar);
            }
        } else {
            c26601 = new C26601(dVar);
        }
        Object objInvoke = c26601.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26601.label;
        if (i11 == 0) {
            ResultKt.m(objInvoke);
            if (!(either instanceof Either.Success)) {
                if (either instanceof Either.Failure) {
                    return either;
                }
                throw new k0();
            }
            a0.c cVar = (Object) ((Either.Success) either).getValue();
            c26601.label = 1;
            objInvoke = function2.invoke(cVar, c26601);
            if (objInvoke == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objInvoke);
        }
        return new Either.Success(objInvoke);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, E extends Throwable, F extends Throwable> Either<T, ?> mapError(@NotNull Either<? extends T, E> either, @NotNull Function1<? super E, ? extends F> transform) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (either instanceof Either.Success) {
            return either;
        }
        if (either instanceof Either.Failure) {
            return new Either.Failure(transform.invoke(((Either.Failure) either).getError()));
        }
        throw new k0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T, E extends Throwable> Either<T, E> onError(@NotNull Either<? extends T, E> either, @NotNull Function1<? super E, Unit> onError) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (either instanceof Either.Success) {
            return either;
        }
        if (!(either instanceof Either.Failure)) {
            throw new k0();
        }
        onError.invoke(((Either.Failure) either).getError());
        return either;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public static final <T, E extends Throwable> Object onErrorAsync(@NotNull Either<? extends T, E> either, @NotNull Function2<? super E, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Either<? extends T, E>> dVar) {
        C26611 c26611;
        if (dVar instanceof C26611) {
            c26611 = (C26611) dVar;
            int i10 = c26611.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26611.label = i10 - Integer.MIN_VALUE;
            } else {
                c26611 = new C26611(dVar);
            }
        } else {
            c26611 = new C26611(dVar);
        }
        Object obj = c26611.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26611.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Either either2 = (Either) c26611.L$0;
            ResultKt.m(obj);
            return either2;
        }
        ResultKt.m(obj);
        if (either instanceof Either.Success) {
            return either;
        }
        if (!(either instanceof Either.Failure)) {
            throw new k0();
        }
        Throwable error = ((Either.Failure) either).getError();
        c26611.L$0 = either;
        c26611.label = 1;
        return function2.invoke(error, c26611) == objL ? objL : either;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public static final <In, E extends Throwable> Object then(@NotNull Either<? extends In, E> either, @NotNull Function2<? super In, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Either<? extends In, E>> dVar) {
        C26621 c26621;
        if (dVar instanceof C26621) {
            c26621 = (C26621) dVar;
            int i10 = c26621.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26621.label = i10 - Integer.MIN_VALUE;
            } else {
                c26621 = new C26621(dVar);
            }
        } else {
            c26621 = new C26621(dVar);
        }
        Object obj = c26621.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26621.label;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (!(either instanceof Either.Success)) {
                    if (either instanceof Either.Failure) {
                        return either;
                    }
                    throw new k0();
                }
                a0.c cVar = (Object) ((Either.Success) either).getValue();
                c26621.L$0 = either;
                c26621.label = 1;
                if (function2.invoke(cVar, c26621) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                either = (Either) c26621.L$0;
                ResultKt.m(obj);
            }
            return either;
        } catch (Throwable th2) {
            return new Either.Failure(th2);
        }
    }

    @NotNull
    public static final <T, E extends Throwable> Object toResult(@NotNull Either<? extends T, E> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(((Either.Success) either).getValue());
        }
        if (!(either instanceof Either.Failure)) {
            throw new k0();
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) either).getError()));
    }

    public static final <T> T unwrap(@NotNull Either<? extends T, ? extends Throwable> either) throws Throwable {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Success) {
            return (T) ((Either.Success) either).getValue();
        }
        if (either instanceof Either.Failure) {
            throw ((Either.Failure) either).getError();
        }
        throw new k0();
    }
}
