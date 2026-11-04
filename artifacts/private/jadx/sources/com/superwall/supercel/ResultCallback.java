package com.superwall.supercel;

import com.sun.jna.Pointer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/ResultCallback\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n1709#1,11:1835\n1722#1,2:1851\n309#2:1830\n269#2,4:1831\n309#2:1846\n269#2,4:1847\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/ResultCallback\n*L\n1748#1:1835,11\n1748#1:1851,2\n1741#1:1830\n1741#1:1831,4\n1749#1:1846\n1749#1:1847,4\n*E\n"})
public class ResultCallback implements Disposable, AutoCloseable, ResultCallbackInterface {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final AtomicLong callCounter;

    @NotNull
    private final UniffiCleaner.Cleanable cleanable;

    @Nullable
    private final Pointer pointer;

    @NotNull
    private final AtomicBoolean wasDestroyed;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/ResultCallback$UniffiCleanAction\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n309#2:1830\n269#2,4:1831\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/ResultCallback$UniffiCleanAction\n*L\n1733#1:1830\n1733#1:1831,4\n*E\n"})
    private static final class UniffiCleanAction implements Runnable {

        @Nullable
        private final Pointer pointer;

        public UniffiCleanAction(@Nullable Pointer pointer) {
            this.pointer = pointer;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: E */
        @Override // java.lang.Runnable
        public void run() throws E, InternalException {
            Pointer pointer = this.pointer;
            if (pointer != null) {
                UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
                UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
                UniffiLib.Companion.getINSTANCE$supercel_release().uniffi_cel_eval_fn_free_resultcallback(pointer, uniffiRustCallStatus);
                Unit unit = Unit.f312394a;
                CELKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
            }
        }
    }

    public ResultCallback(@NotNull Pointer pointer) {
        Intrinsics.checkNotNullParameter(pointer, "pointer");
        this.wasDestroyed = new AtomicBoolean(false);
        this.callCounter = new AtomicLong(1L);
        this.pointer = pointer;
        this.cleanable = UniffiLib.Companion.getCLEANER$supercel_release().register(this, new UniffiCleanAction(pointer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        kotlin.jvm.internal.h0.d(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r8.callCounter.decrementAndGet() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        r8.cleanable.clean();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        kotlin.jvm.internal.h0.c(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        throw r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> R callWithPointer$supercel_release(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.sun.jna.Pointer, ? extends R> r9) {
        /*
            r8 = this;
            r7 = 4
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
        L6:
            r7 = 0
            java.util.concurrent.atomic.AtomicLong r0 = access$getCallCounter$p(r8)
            long r0 = r0.get()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L94
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L73
            java.util.concurrent.atomic.AtomicLong r4 = access$getCallCounter$p(r8)
            r7 = 1
            r5 = 1
            r7 = 4
            long r5 = r5 + r0
            boolean r0 = r4.compareAndSet(r0, r5)
            if (r0 == 0) goto L6
            r0 = 1
            com.sun.jna.Pointer r1 = r8.uniffiClonePointer()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r9 = r9.invoke(r1)     // Catch: java.lang.Throwable -> L55
            kotlin.jvm.internal.h0.d(r0)
            java.util.concurrent.atomic.AtomicLong r1 = access$getCallCounter$p(r8)
            r7 = 2
            long r4 = r1.decrementAndGet()
            r7 = 4
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L4f
            com.superwall.supercel.UniffiCleaner$Cleanable r8 = access$getCleanable(r8)
            r7 = 3
            r8.clean()
        L4f:
            r7 = 2
            kotlin.jvm.internal.h0.c(r0)
            r7 = 3
            return r9
        L55:
            r9 = move-exception
            kotlin.jvm.internal.h0.d(r0)
            r7 = 3
            java.util.concurrent.atomic.AtomicLong r1 = access$getCallCounter$p(r8)
            long r4 = r1.decrementAndGet()
            r7 = 5
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r7 = 6
            if (r1 != 0) goto L6f
            com.superwall.supercel.UniffiCleaner$Cleanable r8 = access$getCleanable(r8)
            r8.clean()
        L6f:
            kotlin.jvm.internal.h0.c(r0)
            throw r9
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r7 = 1
            r0.append(r8)
            r7 = 5
            java.lang.String r8 = " call counter would overflow"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L94:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r7 = 7
            r0.append(r8)
            java.lang.String r8 = " object has already been destroyed"
            r7 = 6
            r0.append(r8)
            r7 = 6
            java.lang.String r8 = r0.toString()
            r7 = 2
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.supercel.ResultCallback.callWithPointer$supercel_release(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        destroy();
    }

    @Override // com.superwall.supercel.Disposable
    public void destroy() {
        if (this.wasDestroyed.compareAndSet(false, true) && this.callCounter.decrementAndGet() == 0) {
            this.cleanable.clean();
        }
    }

    @NotNull
    protected final UniffiCleaner.Cleanable getCleanable() {
        return this.cleanable;
    }

    @Nullable
    protected final Pointer getPointer() {
        return this.pointer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r8.callCounter.decrementAndGet() == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        r8.cleanable.clean();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        throw r9;
     */
    @Override // com.superwall.supercel.ResultCallbackInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResult(@org.jetbrains.annotations.NotNull java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.supercel.ResultCallback.onResult(java.lang.String):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @NotNull
    public final Pointer uniffiClonePointer() throws E, InternalException {
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        UniffiLib iNSTANCE$supercel_release = UniffiLib.Companion.getINSTANCE$supercel_release();
        Pointer pointer = this.pointer;
        Intrinsics.checkNotNull(pointer);
        Pointer pointerUniffi_cel_eval_fn_clone_resultcallback = iNSTANCE$supercel_release.uniffi_cel_eval_fn_clone_resultcallback(pointer, uniffiRustCallStatus);
        CELKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return pointerUniffi_cel_eval_fn_clone_resultcallback;
    }

    public ResultCallback(@NotNull NoPointer noPointer) {
        Intrinsics.checkNotNullParameter(noPointer, "noPointer");
        this.wasDestroyed = new AtomicBoolean(false);
        this.callCounter = new AtomicLong(1L);
        this.pointer = null;
        this.cleanable = UniffiLib.Companion.getCLEANER$supercel_release().register(this, new UniffiCleanAction(null));
    }
}
