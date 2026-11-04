package kotlinx.coroutines.internal;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nExceptionsConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsConstructor.kt\nkotlinx/coroutines/internal/WeakMapCtorCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
final class q1 extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q1 f315118a = new q1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ReentrantReadWriteLock f315119b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> f315120c = new WeakHashMap<>();

    private q1() {
    }

    @Override // kotlinx.coroutines.internal.k
    @NotNull
    public Function1<Throwable, Throwable> a(@NotNull Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = f315119b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            Function1<Throwable, Throwable> function1 = f315120c.get(cls);
            lock.unlock();
            if (function1 != null) {
                return function1;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> weakHashMap = f315120c;
                Function1<Throwable, Throwable> function2 = weakHashMap.get(cls);
                if (function2 != null) {
                    while (i10 < readHoldCount) {
                        lock2.lock();
                        i10++;
                    }
                    return function2;
                }
                Function1<Throwable, Throwable> function1G = u.g(cls);
                weakHashMap.put(cls, function1G);
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                return function1G;
            } finally {
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
