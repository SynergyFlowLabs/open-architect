package com.planner5d.library.services.utility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSynchronizationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizationUtils.kt\ncom/planner5d/library/services/utility/SynchronizationUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f3 f225228a = new f3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<Semaphore, Thread> f225229b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f225230c = new Object();

    private f3() {
    }

    public final <T> T a(@NotNull Semaphore semaphore, @NotNull Function0<? extends T> action) throws InterruptedException {
        Map<Semaphore, Thread> map;
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(semaphore, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Thread threadCurrentThread = Thread.currentThread();
        Object obj = f225230c;
        synchronized (obj) {
            try {
                map = f225229b;
                zAreEqual = Intrinsics.areEqual(map.get(semaphore), threadCurrentThread);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zAreEqual) {
            return action.invoke();
        }
        synchronized (obj) {
            semaphore.acquire();
            map.put(semaphore, threadCurrentThread);
            Unit unit = Unit.f312394a;
        }
        try {
            T tInvoke = action.invoke();
            synchronized (obj) {
                semaphore.release();
                map.remove(semaphore);
            }
            return tInvoke;
        } catch (Throwable th3) {
            synchronized (f225230c) {
                try {
                    semaphore.release();
                    f225229b.remove(semaphore);
                    throw th3;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }
}
