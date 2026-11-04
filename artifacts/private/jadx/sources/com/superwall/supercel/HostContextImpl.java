package com.superwall.supercel;

import com.sun.jna.Pointer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/HostContextImpl\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n1411#1,11:1835\n1424#1,2:1851\n1411#1,11:1853\n1424#1,2:1869\n309#2:1830\n269#2,4:1831\n309#2:1846\n269#2,4:1847\n309#2:1864\n269#2,4:1865\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/HostContextImpl\n*L\n1450#1:1835,11\n1450#1:1851,2\n1461#1:1853,11\n1461#1:1869,2\n1443#1:1830\n1443#1:1831,4\n1451#1:1846\n1451#1:1847,4\n1462#1:1864\n1462#1:1865,4\n*E\n"})
public class HostContextImpl implements Disposable, AutoCloseable, HostContext {

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

    @SourceDebugExtension({"SMAP\nCEL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/HostContextImpl$UniffiCleanAction\n+ 2 CEL.kt\ncom/superwall/supercel/CELKt\n*L\n1#1,1829:1\n309#2:1830\n269#2,4:1831\n*S KotlinDebug\n*F\n+ 1 CEL.kt\ncom/superwall/supercel/HostContextImpl$UniffiCleanAction\n*L\n1435#1:1830\n1435#1:1831,4\n*E\n"})
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
                UniffiLib.Companion.getINSTANCE$supercel_release().uniffi_cel_eval_fn_free_hostcontext(pointer, uniffiRustCallStatus);
                Unit unit = Unit.f312394a;
                CELKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
            }
        }
    }

    public HostContextImpl(@NotNull Pointer pointer) {
        Intrinsics.checkNotNullParameter(pointer, "pointer");
        this.wasDestroyed = new AtomicBoolean(false);
        this.callCounter = new AtomicLong(1L);
        this.pointer = pointer;
        this.cleanable = UniffiLib.Companion.getCLEANER$supercel_release().register(this, new UniffiCleanAction(pointer));
    }

    public final <R> R callWithPointer$supercel_release(@NotNull Function1<? super Pointer, ? extends R> block) {
        long j10;
        Intrinsics.checkNotNullParameter(block, "block");
        do {
            j10 = this.callCounter.get();
            if (j10 == 0) {
                throw new IllegalStateException(getClass().getSimpleName() + " object has already been destroyed");
            }
            if (j10 == Long.MAX_VALUE) {
                throw new IllegalStateException(getClass().getSimpleName() + " call counter would overflow");
            }
        } while (!this.callCounter.compareAndSet(j10, 1 + j10));
        try {
            R rInvoke = block.invoke(uniffiClonePointer());
            h0.d(1);
            if (this.callCounter.decrementAndGet() == 0) {
                UniffiCleaner.Cleanable cleanable = this.cleanable;
            }
            return rInvoke;
        } finally {
            h0.d(1);
            if (this.callCounter.decrementAndGet() == 0) {
                this.cleanable.clean();
            }
            h0.c(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        try {
            destroy();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        if (r11.callCounter.decrementAndGet() == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        r11.cleanable.clean();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        throw r0;
     */
    @Override // com.superwall.supercel.HostContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void computedProperty(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull com.superwall.supercel.ResultCallback r14) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.supercel.HostContextImpl.computedProperty(java.lang.String, java.lang.String, com.superwall.supercel.ResultCallback):void");
    }

    @Override // com.superwall.supercel.Disposable
    public void destroy() {
        if (this.wasDestroyed.compareAndSet(false, true) && this.callCounter.decrementAndGet() == 0) {
            this.cleanable.clean();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0084, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        if (r11.callCounter.decrementAndGet() == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        r11.cleanable.clean();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        throw r0;
     */
    @Override // com.superwall.supercel.HostContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void deviceProperty(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13, @org.jetbrains.annotations.NotNull com.superwall.supercel.ResultCallback r14) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.supercel.HostContextImpl.deviceProperty(java.lang.String, java.lang.String, com.superwall.supercel.ResultCallback):void");
    }

    @NotNull
    protected final UniffiCleaner.Cleanable getCleanable() {
        return this.cleanable;
    }

    @Nullable
    protected final Pointer getPointer() {
        return this.pointer;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @NotNull
    public final Pointer uniffiClonePointer() throws E, InternalException {
        UniffiNullRustCallStatusErrorHandler uniffiNullRustCallStatusErrorHandler = UniffiNullRustCallStatusErrorHandler.INSTANCE;
        UniffiRustCallStatus uniffiRustCallStatus = new UniffiRustCallStatus();
        UniffiLib iNSTANCE$supercel_release = UniffiLib.Companion.getINSTANCE$supercel_release();
        Pointer pointer = this.pointer;
        Intrinsics.checkNotNull(pointer);
        Pointer pointerUniffi_cel_eval_fn_clone_hostcontext = iNSTANCE$supercel_release.uniffi_cel_eval_fn_clone_hostcontext(pointer, uniffiRustCallStatus);
        CELKt.uniffiCheckCallStatus(uniffiNullRustCallStatusErrorHandler, uniffiRustCallStatus);
        return pointerUniffi_cel_eval_fn_clone_hostcontext;
    }

    public HostContextImpl(@NotNull NoPointer noPointer) {
        Intrinsics.checkNotNullParameter(noPointer, "noPointer");
        this.wasDestroyed = new AtomicBoolean(false);
        this.callCounter = new AtomicLong(1L);
        this.pointer = null;
        this.cleanable = UniffiLib.Companion.getCLEANER$supercel_release().register(this, new UniffiCleanAction(null));
    }
}
