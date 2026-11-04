package com.superwall.sdk.misc;

import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class Task_RetryingKt {

    /* JADX INFO: renamed from: com.superwall.sdk.misc.Task_RetryingKt$retrying$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.misc.Task_RetryingKt", f = "Task+Retrying.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {19, 26, 28, 32}, m = "retrying", n = {"isRetryingCallback", "operation", "job", "maxRetryCount", "attempt", "isRetryingCallback", "operation", "job", "maxRetryCount", "attempt", "isRetryingCallback", "operation", "job", "maxRetryCount", "attempt"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return Task_RetryingKt.retrying(0, null, null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:51|25|(1:28)) */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[PHI: r0 r2 r8 r12 r13 r14
      0x00d5: PHI (r0v5 com.superwall.sdk.misc.Task_RetryingKt$retrying$1) = 
      (r0v8 com.superwall.sdk.misc.Task_RetryingKt$retrying$1)
      (r0v8 com.superwall.sdk.misc.Task_RetryingKt$retrying$1)
      (r0v2 com.superwall.sdk.misc.Task_RetryingKt$retrying$1)
     binds: [B:32:0x00c0, B:34:0x00d2, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r2v4 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object>) = 
      (r2v6 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object>)
      (r2v6 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object>)
      (r2v17 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object>)
     binds: [B:32:0x00c0, B:34:0x00d2, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r8v0 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>) = 
      (r8v1 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>)
      (r8v1 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>)
      (r8v15 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object>)
     binds: [B:32:0x00c0, B:34:0x00d2, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r12v3 int) = (r12v4 int), (r12v4 int), (r12v11 int) binds: [B:32:0x00c0, B:34:0x00d2, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r13v2 int) = (r13v3 int), (r13v3 int), (r13v9 int) binds: [B:32:0x00c0, B:34:0x00d2, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r14v2 kotlinx.coroutines.a0) = (r14v3 kotlinx.coroutines.a0), (r14v3 kotlinx.coroutines.a0), (r14v15 kotlinx.coroutines.a0) binds: [B:32:0x00c0, B:34:0x00d2, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd A[PHI: r0 r2 r15
      0x00fd: PHI (r0v11 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object>) = 
      (r0v7 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object>)
      (r0v12 kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object>)
     binds: [B:42:0x00fb, B:24:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r2v9 com.superwall.sdk.misc.Task_RetryingKt$retrying$1) = (r2v5 com.superwall.sdk.misc.Task_RetryingKt$retrying$1), (r2v10 com.superwall.sdk.misc.Task_RetryingKt$retrying$1) binds: [B:42:0x00fb, B:24:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r15v11 kotlinx.coroutines.a0) = (r15v6 kotlinx.coroutines.a0), (r15v13 kotlinx.coroutines.a0) binds: [B:42:0x00fb, B:24:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        r8 = r2;
        r2 = r0;
        r0 = r8;
        r8 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (kotlinx.coroutines.d1.b(r9, r2) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        if (r15 == r1) goto L45;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f6 -> B:18:0x0053). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object retrying(int r12, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>>, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super com.superwall.sdk.misc.Either<? extends T, com.superwall.sdk.network.NetworkError>> r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.misc.Task_RetryingKt.retrying(int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }
}
