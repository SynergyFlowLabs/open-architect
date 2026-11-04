package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.internal.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import oj.i;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nLocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Locks.kt\nkotlin/concurrent/LocksKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
@i(name = "LocksKt")
public final class a {
    @f
    private static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            T tInvoke = action.invoke();
            h0.d(1);
            lock.unlock();
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            lock.unlock();
            h0.c(1);
            throw th2;
        }
    }

    @f
    private static final <T> T b(Lock lock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(lock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        lock.lock();
        try {
            T tInvoke = action.invoke();
            h0.d(1);
            lock.unlock();
            return tInvoke;
        } finally {
            h0.d(1);
            lock.unlock();
            h0.c(1);
        }
    }

    @f
    private static final <T> T c(ReentrantReadWriteLock reentrantReadWriteLock, Function0<? extends T> action) {
        Intrinsics.checkNotNullParameter(reentrantReadWriteLock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            T tInvoke = action.invoke();
            h0.d(1);
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            h0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            h0.d(1);
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            h0.c(1);
            throw th2;
        }
    }
}
