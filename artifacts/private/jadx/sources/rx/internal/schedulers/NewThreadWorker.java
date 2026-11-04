package rx.internal.schedulers;

import androidx.compose.animation.core.z1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.internal.util.PlatformDependent;
import rx.internal.util.RxThreadFactory;
import rx.internal.util.SubscriptionList;
import rx.internal.util.SuppressAnimalSniffer;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes14.dex */
public class NewThreadWorker extends Scheduler.Worker implements Subscription {
    private static final String PURGE_FORCE_KEY = "rx.scheduler.jdk6.purge-force";
    private static final String PURGE_THREAD_PREFIX = "RxSchedulerPurge-";
    private static final boolean SHOULD_TRY_ENABLE_CANCEL_POLICY;
    private static volatile Object cachedSetRemoveOnCancelPolicyMethod;
    private final ScheduledExecutorService executor;
    volatile boolean isUnsubscribed;
    private static final Object SET_REMOVE_ON_CANCEL_POLICY_METHOD_NOT_SUPPORTED = new Object();
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> EXECUTORS = new ConcurrentHashMap<>();
    private static final AtomicReference<ScheduledExecutorService> PURGE = new AtomicReference<>();
    private static final String FREQUENCY_KEY = "rx.scheduler.jdk6.purge-frequency-millis";
    public static final int PURGE_FREQUENCY = Integer.getInteger(FREQUENCY_KEY, 1000).intValue();

    static {
        boolean z10 = Boolean.getBoolean(PURGE_FORCE_KEY);
        int androidApiVersion = PlatformDependent.getAndroidApiVersion();
        SHOULD_TRY_ENABLE_CANCEL_POLICY = !z10 && (androidApiVersion == 0 || androidApiVersion >= 21);
    }

    public NewThreadWorker(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!tryEnableCancelPolicy(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            registerExecutor((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.executor = scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void deregisterExecutor(ScheduledExecutorService scheduledExecutorService) {
        EXECUTORS.remove(scheduledExecutorService);
    }

    static Method findSetRemoveOnCancelPolicyMethod(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                boolean z10 = true & true;
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    @SuppressAnimalSniffer
    static void purgeExecutors() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = EXECUTORS.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaHooks.onError(th2);
        }
    }

    public static void registerExecutor(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = PURGE;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory(PURGE_THREAD_PREFIX));
            if (z1.a(atomicReference, null, scheduledExecutorServiceNewScheduledThreadPool)) {
                Runnable runnable = new Runnable() { // from class: rx.internal.schedulers.NewThreadWorker.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NewThreadWorker.purgeExecutors();
                    }
                };
                int i10 = PURGE_FREQUENCY;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnable, i10, i10, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        EXECUTORS.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean tryEnableCancelPolicy(ScheduledExecutorService scheduledExecutorService) {
        Method methodFindSetRemoveOnCancelPolicyMethod;
        if (SHOULD_TRY_ENABLE_CANCEL_POLICY) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = cachedSetRemoveOnCancelPolicyMethod;
                Object obj2 = SET_REMOVE_ON_CANCEL_POLICY_METHOD_NOT_SUPPORTED;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodFindSetRemoveOnCancelPolicyMethod = findSetRemoveOnCancelPolicyMethod(scheduledExecutorService);
                    if (methodFindSetRemoveOnCancelPolicyMethod != null) {
                        obj2 = methodFindSetRemoveOnCancelPolicyMethod;
                    }
                    cachedSetRemoveOnCancelPolicyMethod = obj2;
                } else {
                    methodFindSetRemoveOnCancelPolicyMethod = (Method) obj;
                }
            } else {
                methodFindSetRemoveOnCancelPolicyMethod = findSetRemoveOnCancelPolicyMethod(scheduledExecutorService);
            }
            if (methodFindSetRemoveOnCancelPolicyMethod != null) {
                try {
                    methodFindSetRemoveOnCancelPolicyMethod.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e10) {
                    RxJavaHooks.onError(e10);
                } catch (IllegalArgumentException e11) {
                    RxJavaHooks.onError(e11);
                } catch (InvocationTargetException e12) {
                    RxJavaHooks.onError(e12);
                }
            }
        }
        return false;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.isUnsubscribed;
    }

    @Override // rx.Scheduler.Worker
    public Subscription schedule(Action0 action0) {
        return schedule(action0, 0L, null);
    }

    public ScheduledAction scheduleActual(Action0 action0, long j10, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0));
        scheduledAction.add(j10 <= 0 ? this.executor.submit(scheduledAction) : this.executor.schedule(scheduledAction, j10, timeUnit));
        return scheduledAction;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.isUnsubscribed = true;
        this.executor.shutdownNow();
        deregisterExecutor(this.executor);
    }

    @Override // rx.Scheduler.Worker
    public Subscription schedule(Action0 action0, long j10, TimeUnit timeUnit) {
        return this.isUnsubscribed ? Subscriptions.unsubscribed() : scheduleActual(action0, j10, timeUnit);
    }

    public ScheduledAction scheduleActual(Action0 action0, long j10, TimeUnit timeUnit, CompositeSubscription compositeSubscription) {
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), compositeSubscription);
        compositeSubscription.add(scheduledAction);
        scheduledAction.add(j10 <= 0 ? this.executor.submit(scheduledAction) : this.executor.schedule(scheduledAction, j10, timeUnit));
        return scheduledAction;
    }

    public ScheduledAction scheduleActual(Action0 action0, long j10, TimeUnit timeUnit, SubscriptionList subscriptionList) {
        ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), subscriptionList);
        subscriptionList.add(scheduledAction);
        scheduledAction.add(j10 <= 0 ? this.executor.submit(scheduledAction) : this.executor.schedule(scheduledAction, j10, timeUnit));
        return scheduledAction;
    }
}
